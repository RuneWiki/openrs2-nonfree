import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DVolumeTexture;
import jagdx.PixelBuffer;
import jagdx.oo;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ov")
public final class Class8_Sub3 extends Class8 implements Interface10 {

	@OriginalMember(owner = "client!ov", name = "g", descriptor = "I")
	private final int anInt7529;

	@OriginalMember(owner = "client!ov", name = "i", descriptor = "I")
	private final int anInt7530;

	@OriginalMember(owner = "client!ov", name = "f", descriptor = "I")
	private final int anInt7528;

	@OriginalMember(owner = "client!ov", name = "h", descriptor = "Lclient!jagdx/IDirect3DVolumeTexture;")
	private final IDirect3DVolumeTexture anIDirect3DVolumeTexture1;

	@OriginalMember(owner = "client!ov", name = "<init>", descriptor = "(Lclient!cka;Lclient!tn;III[B)V")
	public Class8_Sub3(@OriginalArg(0) Class65_Sub2_Sub1 arg0, @OriginalArg(1) Class339 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5) {
		super(arg0, arg1, Static120.aClass89_7, false, arg2 * arg3 * arg4);
		this.anInt7529 = arg2;
		this.anInt7530 = arg3;
		this.anInt7528 = arg4;
		this.anIDirect3DVolumeTexture1 = this.aClass65_Sub2_Sub1_6.anIDirect3DDevice1.a(arg2, arg3, arg4, 1, 0, Static82.method1763(this.aClass89_18, arg1), 1);
		@Pc(40) PixelBuffer local40 = this.aClass65_Sub2_Sub1_6.aPixelBuffer1;
		@Pc(53) int local53 = this.anIDirect3DVolumeTexture1.LockBox(0, 0, 0, 0, arg2, arg3, arg4, 0, local40);
		if (oo.a(false, local53)) {
			@Pc(64) int local64 = this.aClass339_13.anInt9396 * this.anInt7529;
			@Pc(69) int local69 = this.anInt7530 * local64;
			@Pc(72) int local72 = local40.getSlicePitch();
			if (local69 == local72) {
				local40.a((byte[]) arg5, 0, 0, local64 * this.anInt7530 * this.anInt7528);
			} else {
				@Pc(78) int local78 = local40.getRowPitch();
				@Pc(87) int local87;
				if (local64 == local78) {
					for (local87 = 0; local87 < this.anInt7528; local87++) {
						local40.a(arg5, local69 * local87, local87 * local72, local69);
					}
				} else {
					for (local87 = 0; local87 < this.anInt7528; local87++) {
						for (@Pc(116) int local116 = 0; local116 < this.anInt7530; local116++) {
							local40.a(arg5, local116 * local64 + local87 * local69, local72 * local87 + local78 * local116, local64);
						}
					}
				}
			}
			this.anIDirect3DVolumeTexture1.UnlockBox(0);
		}
	}

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(B)V")
	@Override
	public void method7703() {
		this.aClass65_Sub2_Sub1_6.method1759(this);
	}

	@OriginalMember(owner = "client!ov", name = "b", descriptor = "(B)Lclient!jagdx/IDirect3DBaseTexture;")
	@Override
	public IDirect3DBaseTexture method6358() {
		return this.anIDirect3DVolumeTexture1;
	}

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(BLclient!qt;)V")
	@Override
	public void method7704(@OriginalArg(1) Class294 arg0) {
		super.method7704(arg0);
	}
}
