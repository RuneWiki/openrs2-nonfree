import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DVolumeTexture;
import jagdx.PixelBuffer;
import jagdx.aq;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!q")
public final class Class101_Sub3 extends Class101 implements Interface21 {

	@OriginalMember(owner = "client!q", name = "h", descriptor = "I")
	private final int anInt8097;

	@OriginalMember(owner = "client!q", name = "f", descriptor = "I")
	private final int anInt8096;

	@OriginalMember(owner = "client!q", name = "i", descriptor = "I")
	private final int anInt8098;

	@OriginalMember(owner = "client!q", name = "g", descriptor = "Lclient!jagdx/IDirect3DVolumeTexture;")
	private final IDirect3DVolumeTexture anIDirect3DVolumeTexture1;

	@OriginalMember(owner = "client!q", name = "<init>", descriptor = "(Lclient!ki;Lclient!ofa;III[B)V")
	public Class101_Sub3(@OriginalArg(0) Class143_Sub1_Sub1 arg0, @OriginalArg(1) Class255 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5) {
		super(arg0, arg1, Static314.aClass206_12, false, arg4 * arg2 * arg3);
		this.anInt8097 = arg3;
		this.anInt8096 = arg2;
		this.anInt8098 = arg4;
		this.anIDirect3DVolumeTexture1 = this.aClass143_Sub1_Sub1_5.anIDirect3DDevice1.a(arg2, arg3, arg4, 1, 0, Static306.method4609(arg1, this.aClass206_17), 1);
		@Pc(40) PixelBuffer local40 = this.aClass143_Sub1_Sub1_5.aPixelBuffer1;
		@Pc(53) int local53 = this.anIDirect3DVolumeTexture1.LockBox(0, 0, 0, 0, arg2, arg3, arg4, 0, local40);
		if (aq.b(local53, -46)) {
			@Pc(64) int local64 = this.aClass255_20.anInt7179 * this.anInt8096;
			@Pc(69) int local69 = this.anInt8097 * local64;
			@Pc(72) int local72 = local40.getSlicePitch();
			if (local72 == local69) {
				local40.a((byte[]) arg5, 0, 0, this.anInt8098 * local64 * this.anInt8097);
			} else {
				@Pc(82) int local82 = local40.getRowPitch();
				@Pc(87) int local87;
				if (local82 == local64) {
					for (local87 = 0; local87 < this.anInt8098; local87++) {
						local40.a(arg5, local69 * local87, local72 * local87, local69);
					}
				} else {
					for (local87 = 0; local87 < this.anInt8098; local87++) {
						for (@Pc(116) int local116 = 0; local116 < this.anInt8097; local116++) {
							local40.a(arg5, local87 * local69 + local116 * local64, local82 * local116 + local87 * local72, local64);
						}
					}
				}
			}
			this.anIDirect3DVolumeTexture1.UnlockBox(0);
		}
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(I)V")
	@Override
	public void method7436() {
		this.aClass143_Sub1_Sub1_5.method4611(this);
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(Lclient!cr;Z)V")
	@Override
	public void method7435(@OriginalArg(0) Class67 arg0) {
		super.method7435(arg0);
	}

	@OriginalMember(owner = "client!q", name = "d", descriptor = "(I)Lclient!jagdx/IDirect3DBaseTexture;")
	@Override
	public IDirect3DBaseTexture method6875() {
		return this.anIDirect3DVolumeTexture1;
	}
}
