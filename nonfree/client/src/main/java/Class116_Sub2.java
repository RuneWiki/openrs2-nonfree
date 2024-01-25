import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DVolumeTexture;
import jagdx.PixelBuffer;
import jagdx.qc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jl")
public final class Class116_Sub2 extends Class116 implements Interface13 {

	@OriginalMember(owner = "client!jl", name = "i", descriptor = "I")
	private final int anInt4890;

	@OriginalMember(owner = "client!jl", name = "g", descriptor = "I")
	private final int anInt4889;

	@OriginalMember(owner = "client!jl", name = "f", descriptor = "I")
	private final int anInt4888;

	@OriginalMember(owner = "client!jl", name = "h", descriptor = "Lclient!jagdx/IDirect3DVolumeTexture;")
	private final IDirect3DVolumeTexture anIDirect3DVolumeTexture1;

	@OriginalMember(owner = "client!jl", name = "<init>", descriptor = "(Lclient!rca;Lclient!kp;III[B)V")
	public Class116_Sub2(@OriginalArg(0) Class5_Sub3_Sub2 arg0, @OriginalArg(1) Class167 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5) {
		super(arg0, arg1, Static524.aClass310_16, false, arg2 * arg3 * arg4);
		this.anInt4890 = arg2;
		this.anInt4889 = arg3;
		this.anInt4888 = arg4;
		this.anIDirect3DVolumeTexture1 = this.aClass5_Sub3_Sub2_8.anIDirect3DDevice1.a(arg2, arg3, arg4, 1, 0, Static415.method6432(this.aClass310_11, arg1), 1);
		@Pc(40) PixelBuffer local40 = this.aClass5_Sub3_Sub2_8.aPixelBuffer1;
		@Pc(53) int local53 = this.anIDirect3DVolumeTexture1.LockBox(0, 0, 0, 0, arg2, arg3, arg4, 0, local40);
		if (qc.a((byte) 48, local53)) {
			@Pc(65) int local65 = this.anInt4890 * this.aClass167_11.anInt5192;
			@Pc(70) int local70 = local65 * this.anInt4889;
			@Pc(73) int local73 = local40.getSlicePitch();
			if (local73 == local70) {
				local40.a((byte[]) arg5, 0, 0, this.anInt4888 * this.anInt4889 * local65);
			} else {
				@Pc(79) int local79 = local40.getRowPitch();
				@Pc(84) int local84;
				if (local65 == local79) {
					for (local84 = 0; local84 < this.anInt4888; local84++) {
						local40.a(arg5, local70 * local84, local73 * local84, local70);
					}
				} else {
					for (local84 = 0; local84 < this.anInt4888; local84++) {
						for (@Pc(109) int local109 = 0; local109 < this.anInt4889; local109++) {
							local40.a(arg5, local84 * local70 + local65 * local109, local109 * local79 + local84 * local73, local65);
						}
					}
				}
			}
			this.anIDirect3DVolumeTexture1.UnlockBox(0);
		}
	}

	@OriginalMember(owner = "client!jl", name = "e", descriptor = "(I)Lclient!jagdx/IDirect3DBaseTexture;")
	@Override
	public IDirect3DBaseTexture method5960() {
		return this.anIDirect3DVolumeTexture1;
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(Lclient!lba;I)V")
	@Override
	public void method6468(@OriginalArg(0) Class172 arg0) {
		super.method6468(arg0);
	}

	@OriginalMember(owner = "client!jl", name = "d", descriptor = "(I)V")
	@Override
	public void method6469() {
		this.aClass5_Sub3_Sub2_8.method6438(this);
	}
}
