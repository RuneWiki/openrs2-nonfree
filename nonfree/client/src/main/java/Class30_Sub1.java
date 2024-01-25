import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DCubeTexture;
import jagdx.PixelBuffer;
import jagdx.ica;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bh")
public final class Class30_Sub1 extends Class30 implements Interface19 {

	@OriginalMember(owner = "client!bh", name = "g", descriptor = "I")
	private final int anInt974;

	@OriginalMember(owner = "client!bh", name = "f", descriptor = "Lclient!jagdx/IDirect3DCubeTexture;")
	private final IDirect3DCubeTexture anIDirect3DCubeTexture1;

	@OriginalMember(owner = "client!bh", name = "<init>", descriptor = "(Lclient!tga;IZ[[I)V")
	public Class30_Sub1(@OriginalArg(0) Class14_Sub2_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[][] arg3) {
		super(arg0, Static122.aClass219_7, Static239.aClass161_12, arg2 && arg0.aBoolean625, arg1 * arg1 * 6);
		this.anInt974 = arg1;
		if (this.aBoolean598) {
			this.anIDirect3DCubeTexture1 = this.aClass14_Sub2_Sub2_6.anIDirect3DDevice1.a(this.anInt974, 0, 1024, 21, 1);
		} else {
			this.anIDirect3DCubeTexture1 = this.aClass14_Sub2_Sub2_6.anIDirect3DDevice1.a(this.anInt974, 1, 0, 21, 1);
		}
		@Pc(52) PixelBuffer local52 = this.aClass14_Sub2_Sub2_6.aPixelBuffer1;
		for (@Pc(54) int local54 = 0; local54 < 6; local54++) {
			@Pc(71) int local71 = this.anIDirect3DCubeTexture1.LockRect(local54, 0, 0, 0, this.anInt974, this.anInt974, 0, local52);
			if (ica.b(14528, local71)) {
				@Pc(79) int local79 = local52.getRowPitch();
				if (local79 == this.anInt974 * 4) {
					local52.b(arg3[local54], 0, 0, this.anInt974 * this.anInt974);
				} else {
					for (@Pc(87) int local87 = 0; local87 < this.anInt974; local87++) {
						local52.b(arg3[local54], this.anInt974 * local87, local79 * local87, this.anInt974);
					}
				}
				this.anIDirect3DCubeTexture1.UnlockRect(local54, 0);
			}
		}
	}

	@OriginalMember(owner = "client!bh", name = "c", descriptor = "(I)V")
	@Override
	public void method7586() {
		this.aClass14_Sub2_Sub2_6.method7047(this);
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(ILclient!ju;)V")
	@Override
	public void method7587(@OriginalArg(1) Class164 arg0) {
		super.method7587(arg0);
	}

	@OriginalMember(owner = "client!bh", name = "d", descriptor = "(I)Lclient!jagdx/IDirect3DBaseTexture;")
	@Override
	public IDirect3DBaseTexture method6779() {
		return this.anIDirect3DCubeTexture1;
	}
}
