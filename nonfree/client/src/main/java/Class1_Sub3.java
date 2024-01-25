import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DVolumeTexture;
import jagdx.PixelBuffer;
import jagdx.sw;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rc")
public final class Class1_Sub3 extends Class1 implements Interface1 {

	@OriginalMember(owner = "client!rc", name = "f", descriptor = "I")
	private final int anInt8449;

	@OriginalMember(owner = "client!rc", name = "h", descriptor = "I")
	private final int anInt8451;

	@OriginalMember(owner = "client!rc", name = "g", descriptor = "I")
	private final int anInt8450;

	@OriginalMember(owner = "client!rc", name = "i", descriptor = "Lclient!jagdx/IDirect3DVolumeTexture;")
	private final IDirect3DVolumeTexture anIDirect3DVolumeTexture1;

	@OriginalMember(owner = "client!rc", name = "<init>", descriptor = "(Lclient!mba;Lclient!pw;III[B)V")
	public Class1_Sub3(@OriginalArg(0) Class15_Sub2_Sub2 arg0, @OriginalArg(1) Class261 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5) {
		super(arg0, arg1, Static302.aClass200_11, false, arg4 * arg3 * arg2);
		this.anInt8449 = arg2;
		this.anInt8451 = arg4;
		this.anInt8450 = arg3;
		this.anIDirect3DVolumeTexture1 = this.aClass15_Sub2_Sub2_8.anIDirect3DDevice1.a(arg2, arg3, arg4, 1, 0, Static315.method5502(arg1, this.aClass200_18), 1);
		@Pc(40) PixelBuffer local40 = this.aClass15_Sub2_Sub2_8.aPixelBuffer1;
		@Pc(53) int local53 = this.anIDirect3DVolumeTexture1.LockBox(0, 0, 0, 0, arg2, arg3, arg4, 0, local40);
		if (sw.a((byte) -58, local53)) {
			@Pc(64) int local64 = this.anInt8449 * this.aClass261_12.anInt8160;
			@Pc(69) int local69 = this.anInt8450 * local64;
			@Pc(72) int local72 = local40.getSlicePitch();
			if (local69 == local72) {
				local40.a((byte[]) arg5, 0, 0, this.anInt8451 * this.anInt8450 * local64);
			} else {
				@Pc(91) int local91 = local40.getRowPitch();
				@Pc(100) int local100;
				if (local64 == local91) {
					for (local100 = 0; local100 < this.anInt8451; local100++) {
						local40.a(arg5, local69 * local100, local100 * local72, local69);
					}
				} else {
					for (local100 = 0; local100 < this.anInt8451; local100++) {
						for (@Pc(110) int local110 = 0; local110 < this.anInt8450; local110++) {
							local40.a(arg5, local110 * local64 + local100 * local69, local100 * local72 - -(local91 * local110), local64);
						}
					}
				}
			}
			this.anIDirect3DVolumeTexture1.UnlockBox(0);
		}
	}

	@OriginalMember(owner = "client!rc", name = "c", descriptor = "(B)Lclient!jagdx/IDirect3DBaseTexture;")
	@Override
	public IDirect3DBaseTexture method6928() {
		return this.anIDirect3DVolumeTexture1;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(I)V")
	@Override
	public void method8223() {
		this.aClass15_Sub2_Sub2_8.method5499(this);
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lclient!gv;I)V")
	@Override
	public void method8222(@OriginalArg(0) Class130 arg0) {
		super.method8222(arg0);
	}
}
