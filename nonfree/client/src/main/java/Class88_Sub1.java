import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DVolumeTexture;
import jagdx.PixelBuffer;
import jagdx.ae;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eu")
public final class Class88_Sub1 extends Class88 implements Interface21 {

	@OriginalMember(owner = "client!eu", name = "i", descriptor = "I")
	private final int anInt2561;

	@OriginalMember(owner = "client!eu", name = "g", descriptor = "I")
	private final int anInt2560;

	@OriginalMember(owner = "client!eu", name = "f", descriptor = "I")
	private final int anInt2559;

	@OriginalMember(owner = "client!eu", name = "h", descriptor = "Lclient!jagdx/IDirect3DVolumeTexture;")
	private final IDirect3DVolumeTexture anIDirect3DVolumeTexture1;

	@OriginalMember(owner = "client!eu", name = "<init>", descriptor = "(Lclient!ega;Lclient!pn;III[B)V")
	public Class88_Sub1(@OriginalArg(0) Class78_Sub1_Sub1 arg0, @OriginalArg(1) Class271 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5) {
		super(arg0, arg1, Static243.aClass172_9, false, arg4 * arg3 * arg2);
		this.anInt2561 = arg2;
		this.anInt2560 = arg3;
		this.anInt2559 = arg4;
		this.anIDirect3DVolumeTexture1 = this.aClass78_Sub1_Sub1_7.anIDirect3DDevice1.a(arg2, arg3, arg4, 1, 0, Static117.method2129(arg1, this.aClass172_18), 1);
		@Pc(40) PixelBuffer local40 = this.aClass78_Sub1_Sub1_7.aPixelBuffer1;
		@Pc(53) int local53 = this.anIDirect3DVolumeTexture1.LockBox(0, 0, 0, 0, arg2, arg3, arg4, 0, local40);
		if (ae.a((byte) -119, local53)) {
			@Pc(64) int local64 = this.aClass271_10.anInt7253 * this.anInt2561;
			@Pc(69) int local69 = local64 * this.anInt2560;
			@Pc(72) int local72 = local40.getSlicePitch();
			if (local69 == local72) {
				local40.a((byte[]) arg5, 0, 0, this.anInt2559 * this.anInt2560 * local64);
			} else {
				@Pc(78) int local78 = local40.getRowPitch();
				@Pc(83) int local83;
				if (local64 == local78) {
					for (local83 = 0; local83 < this.anInt2559; local83++) {
						local40.a(arg5, local83 * local69, local83 * local72, local69);
					}
				} else {
					for (local83 = 0; local83 < this.anInt2559; local83++) {
						for (@Pc(93) int local93 = 0; local93 < this.anInt2560; local93++) {
							local40.a(arg5, local69 * local83 + local93 * local64, local78 * local93 + local72 * local83, local64);
						}
					}
				}
			}
			this.anIDirect3DVolumeTexture1.UnlockBox(0);
		}
	}

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(Z)V")
	@Override
	public void method7299() {
		this.aClass78_Sub1_Sub1_7.method2128(this);
	}

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(B)Lclient!jagdx/IDirect3DBaseTexture;")
	@Override
	public IDirect3DBaseTexture method5851() {
		return this.anIDirect3DVolumeTexture1;
	}

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(Lclient!dca;B)V")
	@Override
	public void method7298(@OriginalArg(0) Class54 arg0) {
		super.method7298(arg0);
	}
}
