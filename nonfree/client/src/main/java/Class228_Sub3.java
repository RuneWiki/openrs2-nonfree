import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DVolumeTexture;
import jagdx.PixelBuffer;
import jagdx.mk;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!we")
public final class Class228_Sub3 extends Class228 implements Interface9 {

	@OriginalMember(owner = "client!we", name = "g", descriptor = "I")
	private final int anInt10921;

	@OriginalMember(owner = "client!we", name = "h", descriptor = "I")
	private final int anInt10922;

	@OriginalMember(owner = "client!we", name = "i", descriptor = "I")
	private final int anInt10923;

	@OriginalMember(owner = "client!we", name = "f", descriptor = "Lclient!jagdx/IDirect3DVolumeTexture;")
	private final IDirect3DVolumeTexture anIDirect3DVolumeTexture1;

	@OriginalMember(owner = "client!we", name = "<init>", descriptor = "(Lclient!ta;Lclient!vea;III[B)V")
	public Class228_Sub3(@OriginalArg(0) Class137_Sub1_Sub2 arg0, @OriginalArg(1) Class363 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5) {
		super(arg0, arg1, Static47.aClass36_5, false, arg4 * arg2 * arg3);
		this.anInt10921 = arg3;
		this.anInt10922 = arg2;
		this.anInt10923 = arg4;
		this.anIDirect3DVolumeTexture1 = this.aClass137_Sub1_Sub2_9.anIDirect3DDevice1.a(arg2, arg3, arg4, 1, 0, Static560.method8093(arg1, this.aClass36_20), 1);
		@Pc(40) PixelBuffer local40 = this.aClass137_Sub1_Sub2_9.aPixelBuffer1;
		@Pc(53) int local53 = this.anIDirect3DVolumeTexture1.LockBox(0, 0, 0, 0, arg2, arg3, arg4, 0, local40);
		if (mk.b(local53, -1)) {
			@Pc(64) int local64 = this.anInt10922 * this.aClass363_18.anInt10558;
			@Pc(69) int local69 = local64 * this.anInt10921;
			@Pc(72) int local72 = local40.getSlicePitch();
			if (local69 == local72) {
				local40.a((byte[]) arg5, 0, 0, this.anInt10923 * this.anInt10921 * local64);
			} else {
				@Pc(82) int local82 = local40.getRowPitch();
				@Pc(87) int local87;
				if (local82 == local64) {
					for (local87 = 0; local87 < this.anInt10923; local87++) {
						local40.a(arg5, local87 * local69, local87 * local72, local69);
					}
				} else {
					for (local87 = 0; local87 < this.anInt10923; local87++) {
						for (@Pc(116) int local116 = 0; local116 < this.anInt10921; local116++) {
							local40.a(arg5, local69 * local87 + local116 * local64, local72 * local87 + local116 * local82, local64);
						}
					}
				}
			}
			this.anIDirect3DVolumeTexture1.UnlockBox(0);
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(ILclient!tda;)V")
	@Override
	public void method9087(@OriginalArg(1) Class334 arg0) {
		super.method9087(arg0);
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(I)V")
	@Override
	public void method9088() {
		this.aClass137_Sub1_Sub2_9.method8094(this);
	}

	@OriginalMember(owner = "client!we", name = "b", descriptor = "(Z)Lclient!jagdx/IDirect3DBaseTexture;")
	@Override
	public IDirect3DBaseTexture method9086() {
		return this.anIDirect3DVolumeTexture1;
	}
}
