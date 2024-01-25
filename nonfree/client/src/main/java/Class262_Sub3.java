import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DCubeTexture;
import jagdx.PixelBuffer;
import jagdx.em;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uca")
public final class Class262_Sub3 extends Class262 implements Interface18 {

	@OriginalMember(owner = "client!uca", name = "f", descriptor = "I")
	private final int anInt9358;

	@OriginalMember(owner = "client!uca", name = "g", descriptor = "Lclient!jagdx/IDirect3DCubeTexture;")
	private final IDirect3DCubeTexture anIDirect3DCubeTexture1;

	@OriginalMember(owner = "client!uca", name = "<init>", descriptor = "(Lclient!kfa;IZ[[I)V")
	public Class262_Sub3(@OriginalArg(0) Class82_Sub3_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[][] arg3) {
		super(arg0, Static95.aClass168_2, Static280.aClass182_8, arg2 && arg0.aBoolean424, arg1 * arg1 * 6);
		this.anInt9358 = arg1;
		if (this.aBoolean703) {
			this.anIDirect3DCubeTexture1 = this.aClass82_Sub3_Sub2_7.anIDirect3DDevice1.a(this.anInt9358, 0, 1024, 21, 1);
		} else {
			this.anIDirect3DCubeTexture1 = this.aClass82_Sub3_Sub2_7.anIDirect3DDevice1.a(this.anInt9358, 1, 0, 21, 1);
		}
		@Pc(52) PixelBuffer local52 = this.aClass82_Sub3_Sub2_7.aPixelBuffer1;
		for (@Pc(54) int local54 = 0; local54 < 6; local54++) {
			@Pc(73) int local73 = this.anIDirect3DCubeTexture1.LockRect(local54, 0, 0, 0, this.anInt9358, this.anInt9358, 0, local52);
			if (em.a(local73, (int) -1)) {
				@Pc(81) int local81 = local52.getRowPitch();
				if (this.anInt9358 * 4 == local81) {
					local52.a((int[]) arg3[local54], 0, 0, this.anInt9358 * this.anInt9358);
				} else {
					for (@Pc(93) int local93 = 0; local93 < this.anInt9358; local93++) {
						local52.a(arg3[local54], local93 * this.anInt9358, local93 * local81, this.anInt9358);
					}
				}
				this.anIDirect3DCubeTexture1.UnlockRect(local54, 0);
			}
		}
	}

	@OriginalMember(owner = "client!uca", name = "b", descriptor = "(B)Lclient!jagdx/IDirect3DBaseTexture;")
	@Override
	public IDirect3DBaseTexture method8008() {
		return this.anIDirect3DCubeTexture1;
	}

	@OriginalMember(owner = "client!uca", name = "c", descriptor = "(I)V")
	@Override
	public void method8488() {
		this.aClass82_Sub3_Sub2_7.method5045(this);
	}

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(Lclient!tha;B)V")
	@Override
	public void method8487(@OriginalArg(0) Class324 arg0) {
		super.method8487(arg0);
	}
}
