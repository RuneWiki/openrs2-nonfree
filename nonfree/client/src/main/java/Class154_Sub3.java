import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DVolumeTexture;
import jagdx.PixelBuffer;
import jagdx.eo;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vf")
public final class Class154_Sub3 extends Class154 implements Interface23 {

	@OriginalMember(owner = "client!vf", name = "h", descriptor = "I")
	private final int anInt10117;

	@OriginalMember(owner = "client!vf", name = "g", descriptor = "I")
	private final int anInt10116;

	@OriginalMember(owner = "client!vf", name = "f", descriptor = "I")
	private final int anInt10115;

	@OriginalMember(owner = "client!vf", name = "i", descriptor = "Lclient!jagdx/IDirect3DVolumeTexture;")
	private final IDirect3DVolumeTexture anIDirect3DVolumeTexture1;

	@OriginalMember(owner = "client!vf", name = "<init>", descriptor = "(Lclient!oe;Lclient!jb;III[B)V")
	public Class154_Sub3(@OriginalArg(0) Class7_Sub1_Sub2 arg0, @OriginalArg(1) Class161 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5) {
		super(arg0, arg1, Static424.aClass273_12, false, arg4 * arg2 * arg3);
		this.anInt10117 = arg3;
		this.anInt10116 = arg4;
		this.anInt10115 = arg2;
		this.anIDirect3DVolumeTexture1 = this.aClass7_Sub1_Sub2_8.anIDirect3DDevice1.a(arg2, arg3, arg4, 1, 0, Static373.method5791(this.aClass273_18, arg1), 1);
		@Pc(40) PixelBuffer local40 = this.aClass7_Sub1_Sub2_8.aPixelBuffer1;
		@Pc(53) int local53 = this.anIDirect3DVolumeTexture1.LockBox(0, 0, 0, 0, arg2, arg3, arg4, 0, local40);
		if (eo.a(26, local53)) {
			@Pc(64) int local64 = this.aClass161_19.anInt4901 * this.anInt10115;
			@Pc(69) int local69 = this.anInt10117 * local64;
			@Pc(72) int local72 = local40.getSlicePitch();
			if (local69 == local72) {
				local40.a((byte[]) arg5, 0, 0, this.anInt10117 * local64 * this.anInt10116);
			} else {
				@Pc(78) int local78 = local40.getRowPitch();
				@Pc(83) int local83;
				if (local78 == local64) {
					for (local83 = 0; local83 < this.anInt10116; local83++) {
						local40.a(arg5, local83 * local69, local83 * local72, local69);
					}
				} else {
					for (local83 = 0; local83 < this.anInt10116; local83++) {
						for (@Pc(112) int local112 = 0; local112 < this.anInt10117; local112++) {
							local40.a(arg5, local112 * local64 + local83 * local69, local83 * local72 + local112 * local78, local64);
						}
					}
				}
			}
			this.anIDirect3DVolumeTexture1.UnlockBox(0);
		}
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(BLclient!tn;)V")
	@Override
	public void method7869(@OriginalArg(1) Class318 arg0) {
		super.method7869(arg0);
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(Z)Lclient!jagdx/IDirect3DBaseTexture;")
	@Override
	public IDirect3DBaseTexture method7870() {
		return this.anIDirect3DVolumeTexture1;
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(I)V")
	@Override
	public void method7871() {
		this.aClass7_Sub1_Sub2_8.method5795(this);
	}
}
