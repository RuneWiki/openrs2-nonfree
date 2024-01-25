import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DVolumeTexture;
import jagdx.PixelBuffer;
import jagdx.nba;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eea")
public final class Class87_Sub1 extends Class87 implements Interface12 {

	@OriginalMember(owner = "client!eea", name = "f", descriptor = "I")
	private final int anInt2732;

	@OriginalMember(owner = "client!eea", name = "i", descriptor = "I")
	private final int anInt2734;

	@OriginalMember(owner = "client!eea", name = "g", descriptor = "I")
	private final int anInt2733;

	@OriginalMember(owner = "client!eea", name = "h", descriptor = "Lclient!jagdx/IDirect3DVolumeTexture;")
	private final IDirect3DVolumeTexture anIDirect3DVolumeTexture1;

	@OriginalMember(owner = "client!eea", name = "<init>", descriptor = "(Lclient!ss;Lclient!hi;III[B)V")
	public Class87_Sub1(@OriginalArg(0) Class66_Sub1_Sub2 arg0, @OriginalArg(1) Class141 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5) {
		super(arg0, arg1, Static349.aClass239_12, false, arg3 * arg2 * arg4);
		this.anInt2732 = arg3;
		this.anInt2734 = arg4;
		this.anInt2733 = arg2;
		this.anIDirect3DVolumeTexture1 = this.aClass66_Sub1_Sub2_6.anIDirect3DDevice1.a(arg2, arg3, arg4, 1, 0, Static490.method7005(arg1, this.aClass239_18), 1);
		@Pc(40) PixelBuffer local40 = this.aClass66_Sub1_Sub2_6.aPixelBuffer1;
		@Pc(53) int local53 = this.anIDirect3DVolumeTexture1.LockBox(0, 0, 0, 0, arg2, arg3, arg4, 0, local40);
		if (nba.a(local53, (byte) -99)) {
			@Pc(64) int local64 = this.aClass141_14.anInt4189 * this.anInt2733;
			@Pc(69) int local69 = local64 * this.anInt2732;
			@Pc(72) int local72 = local40.getSlicePitch();
			if (local69 == local72) {
				local40.a((byte[]) arg5, 0, 0, this.anInt2734 * this.anInt2732 * local64);
			} else {
				@Pc(78) int local78 = local40.getRowPitch();
				@Pc(87) int local87;
				if (local78 == local64) {
					for (local87 = 0; local87 < this.anInt2734; local87++) {
						local40.a(arg5, local69 * local87, local87 * local72, local69);
					}
				} else {
					for (local87 = 0; local87 < this.anInt2734; local87++) {
						for (@Pc(120) int local120 = 0; local120 < this.anInt2732; local120++) {
							local40.a(arg5, local64 * local120 + local87 * local69, local87 * local72 + local120 * local78, local64);
						}
					}
				}
			}
			this.anIDirect3DVolumeTexture1.UnlockBox(0);
		}
	}

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "(Lclient!cba;I)V")
	@Override
	public void method6762(@OriginalArg(0) Class46 arg0) {
		super.method6762(arg0);
	}

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "(I)Lclient!jagdx/IDirect3DBaseTexture;")
	@Override
	public IDirect3DBaseTexture method6716() {
		return this.anIDirect3DVolumeTexture1;
	}

	@OriginalMember(owner = "client!eea", name = "c", descriptor = "(B)V")
	@Override
	public void method6761() {
		this.aClass66_Sub1_Sub2_6.method7006(this);
	}
}
