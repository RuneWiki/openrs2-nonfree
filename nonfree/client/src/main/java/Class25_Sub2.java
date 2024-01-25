import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DVolumeTexture;
import jagdx.PixelBuffer;
import jagdx.te;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!laa")
public final class Class25_Sub2 extends Class25 implements Interface12 {

	@OriginalMember(owner = "client!laa", name = "h", descriptor = "I")
	private final int anInt4565;

	@OriginalMember(owner = "client!laa", name = "i", descriptor = "I")
	private final int anInt4566;

	@OriginalMember(owner = "client!laa", name = "f", descriptor = "I")
	private final int anInt4564;

	@OriginalMember(owner = "client!laa", name = "g", descriptor = "Lclient!jagdx/IDirect3DVolumeTexture;")
	private final IDirect3DVolumeTexture anIDirect3DVolumeTexture1;

	@OriginalMember(owner = "client!laa", name = "<init>", descriptor = "(Lclient!ui;Lclient!nl;III[B)V")
	public Class25_Sub2(@OriginalArg(0) Class121_Sub2_Sub2 arg0, @OriginalArg(1) Class214 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5) {
		super(arg0, arg1, Static108.aClass82_8, false, arg4 * arg3 * arg2);
		this.anInt4565 = arg4;
		this.anInt4566 = arg3;
		this.anInt4564 = arg2;
		this.anIDirect3DVolumeTexture1 = this.aClass121_Sub2_Sub2_8.anIDirect3DDevice1.a(arg2, arg3, arg4, 1, 0, Static515.method7305(this.aClass82_20, arg1), 1);
		@Pc(40) PixelBuffer local40 = this.aClass121_Sub2_Sub2_8.aPixelBuffer1;
		@Pc(53) int local53 = this.anIDirect3DVolumeTexture1.LockBox(0, 0, 0, 0, arg2, arg3, arg4, 0, local40);
		if (te.a(2005530599, local53)) {
			@Pc(64) int local64 = this.anInt4564 * this.aClass214_15.anInt5985;
			@Pc(69) int local69 = local64 * this.anInt4566;
			@Pc(72) int local72 = local40.getSlicePitch();
			if (local72 == local69) {
				local40.a((byte[]) arg5, 0, 0, this.anInt4565 * local64 * this.anInt4566);
			} else {
				@Pc(91) int local91 = local40.getRowPitch();
				@Pc(96) int local96;
				if (local64 == local91) {
					for (local96 = 0; local96 < this.anInt4565; local96++) {
						local40.a(arg5, local96 * local69, local96 * local72, local69);
					}
				} else {
					for (local96 = 0; local96 < this.anInt4565; local96++) {
						for (@Pc(129) int local129 = 0; local129 < this.anInt4566; local129++) {
							local40.a(arg5, local96 * local69 + local64 * local129, local129 * local91 + local72 * local96, local64);
						}
					}
				}
			}
			this.anIDirect3DVolumeTexture1.UnlockBox(0);
		}
	}

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(I)V")
	@Override
	public void method7528() {
		this.aClass121_Sub2_Sub2_8.method7299(this);
	}

	@OriginalMember(owner = "client!laa", name = "e", descriptor = "(I)Lclient!jagdx/IDirect3DBaseTexture;")
	@Override
	public IDirect3DBaseTexture method7526() {
		return this.anIDirect3DVolumeTexture1;
	}

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(Lclient!td;B)V")
	@Override
	public void method7527(@OriginalArg(0) Class301 arg0) {
		super.method7527(arg0);
	}
}
