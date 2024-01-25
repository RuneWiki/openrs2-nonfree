import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DVolumeTexture;
import jagdx.PixelBuffer;
import jagdx.lg;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kda")
public final class Class99_Sub2 extends Class99 implements Interface1 {

	@OriginalMember(owner = "client!kda", name = "i", descriptor = "I")
	private final int anInt5230;

	@OriginalMember(owner = "client!kda", name = "f", descriptor = "I")
	private final int anInt5228;

	@OriginalMember(owner = "client!kda", name = "g", descriptor = "I")
	private final int anInt5229;

	@OriginalMember(owner = "client!kda", name = "h", descriptor = "Lclient!jagdx/IDirect3DVolumeTexture;")
	private final IDirect3DVolumeTexture anIDirect3DVolumeTexture1;

	@OriginalMember(owner = "client!kda", name = "<init>", descriptor = "(Lclient!ul;Lclient!et;III[B)V")
	public Class99_Sub2(@OriginalArg(0) Class13_Sub3_Sub2 arg0, @OriginalArg(1) Class104 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5) {
		super(arg0, arg1, Static638.aClass381_15, false, arg4 * arg2 * arg3);
		this.anInt5230 = arg3;
		this.anInt5228 = arg4;
		this.anInt5229 = arg2;
		this.anIDirect3DVolumeTexture1 = this.aClass13_Sub3_Sub2_6.anIDirect3DDevice1.a(arg2, arg3, arg4, 1, 0, Static586.method8309(this.aClass381_8, arg1), 1);
		@Pc(40) PixelBuffer local40 = this.aClass13_Sub3_Sub2_6.aPixelBuffer1;
		@Pc(53) int local53 = this.anIDirect3DVolumeTexture1.LockBox(0, 0, 0, 0, arg2, arg3, arg4, 0, local40);
		if (lg.b(local53, 25499)) {
			@Pc(64) int local64 = this.anInt5229 * this.aClass104_16.anInt2988;
			@Pc(69) int local69 = local64 * this.anInt5230;
			@Pc(72) int local72 = local40.getSlicePitch();
			if (local72 == local69) {
				local40.a((byte[]) arg5, 0, 0, this.anInt5228 * this.anInt5230 * local64);
			} else {
				@Pc(78) int local78 = local40.getRowPitch();
				@Pc(87) int local87;
				if (local64 == local78) {
					for (local87 = 0; local87 < this.anInt5228; local87++) {
						local40.a(arg5, local87 * local69, local87 * local72, local69);
					}
				} else {
					for (local87 = 0; local87 < this.anInt5228; local87++) {
						for (@Pc(120) int local120 = 0; local120 < this.anInt5230; local120++) {
							local40.a(arg5, local64 * local120 + local87 * local69, local72 * local87 - -(local78 * local120), local64);
						}
					}
				}
			}
			this.anIDirect3DVolumeTexture1.UnlockBox(0);
		}
	}

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "(B)V")
	@Override
	public void method8817() {
		this.aClass13_Sub3_Sub2_6.method8320(this);
	}

	@OriginalMember(owner = "client!kda", name = "d", descriptor = "(I)Lclient!jagdx/IDirect3DBaseTexture;")
	@Override
	public IDirect3DBaseTexture method7187() {
		return this.anIDirect3DVolumeTexture1;
	}

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "(ILclient!cg;)V")
	@Override
	public void method8818(@OriginalArg(1) Class54 arg0) {
		super.method8818(arg0);
	}
}
