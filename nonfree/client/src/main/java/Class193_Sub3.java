import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DVolumeTexture;
import jagdx.PixelBuffer;
import jagdx.ck;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tk")
public final class Class193_Sub3 extends Class193 implements Interface13 {

	@OriginalMember(owner = "client!tk", name = "f", descriptor = "I")
	private final int anInt9396;

	@OriginalMember(owner = "client!tk", name = "g", descriptor = "I")
	private final int anInt9397;

	@OriginalMember(owner = "client!tk", name = "h", descriptor = "I")
	private final int anInt9398;

	@OriginalMember(owner = "client!tk", name = "i", descriptor = "Lclient!jagdx/IDirect3DVolumeTexture;")
	private final IDirect3DVolumeTexture anIDirect3DVolumeTexture1;

	@OriginalMember(owner = "client!tk", name = "<init>", descriptor = "(Lclient!os;Lclient!hh;III[B)V")
	public Class193_Sub3(@OriginalArg(0) Class75_Sub1_Sub2 arg0, @OriginalArg(1) Class155 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5) {
		super(arg0, arg1, Static435.aClass274_13, false, arg2 * arg3 * arg4);
		this.anInt9396 = arg3;
		this.anInt9397 = arg4;
		this.anInt9398 = arg2;
		this.anIDirect3DVolumeTexture1 = this.aClass75_Sub1_Sub2_8.anIDirect3DDevice1.a(arg2, arg3, arg4, 1, 0, Static440.method6860(this.aClass274_18, arg1), 1);
		@Pc(40) PixelBuffer local40 = this.aClass75_Sub1_Sub2_8.aPixelBuffer1;
		@Pc(53) int local53 = this.anIDirect3DVolumeTexture1.LockBox(0, 0, 0, 0, arg2, arg3, arg4, 0, local40);
		if (ck.a(local53, -1)) {
			@Pc(64) int local64 = this.anInt9398 * this.aClass155_54.anInt4383;
			@Pc(69) int local69 = local64 * this.anInt9396;
			@Pc(72) int local72 = local40.getSlicePitch();
			if (local72 == local69) {
				local40.a((byte[]) arg5, 0, 0, this.anInt9397 * local64 * this.anInt9396);
			} else {
				@Pc(82) int local82 = local40.getRowPitch();
				@Pc(91) int local91;
				if (local82 == local64) {
					for (local91 = 0; local91 < this.anInt9397; local91++) {
						local40.a(arg5, local91 * local69, local72 * local91, local69);
					}
				} else {
					for (local91 = 0; local91 < this.anInt9397; local91++) {
						for (@Pc(121) int local121 = 0; local121 < this.anInt9396; local121++) {
							local40.a(arg5, local91 * local69 + local121 * local64, local91 * local72 - -(local121 * local82), local64);
						}
					}
				}
			}
			this.anIDirect3DVolumeTexture1.UnlockBox(0);
		}
	}

	@OriginalMember(owner = "client!tk", name = "d", descriptor = "(I)Lclient!jagdx/IDirect3DBaseTexture;")
	@Override
	public IDirect3DBaseTexture method8209() {
		return this.anIDirect3DVolumeTexture1;
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(I)V")
	@Override
	public void method8703() {
		this.aClass75_Sub1_Sub2_8.method6856(this);
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(Lclient!td;I)V")
	@Override
	public void method8704(@OriginalArg(0) Class338 arg0) {
		super.method8704(arg0);
	}
}
