import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DCubeTexture;
import jagdx.PixelBuffer;
import jagdx.qc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qaa")
public final class Class116_Sub3 extends Class116 implements Interface20 {

	@OriginalMember(owner = "client!qaa", name = "g", descriptor = "I")
	private final int anInt7130;

	@OriginalMember(owner = "client!qaa", name = "f", descriptor = "Lclient!jagdx/IDirect3DCubeTexture;")
	private final IDirect3DCubeTexture anIDirect3DCubeTexture1;

	@OriginalMember(owner = "client!qaa", name = "<init>", descriptor = "(Lclient!rca;IZ[[I)V")
	public Class116_Sub3(@OriginalArg(0) Class5_Sub3_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[][] arg3) {
		super(arg0, Static468.aClass167_14, Static524.aClass310_16, arg2 && arg0.aBoolean549, arg1 * 6 * arg1);
		this.anInt7130 = arg1;
		if (this.aBoolean471) {
			this.anIDirect3DCubeTexture1 = this.aClass5_Sub3_Sub2_8.anIDirect3DDevice1.a(this.anInt7130, 0, 1024, 21, 1);
		} else {
			this.anIDirect3DCubeTexture1 = this.aClass5_Sub3_Sub2_8.anIDirect3DDevice1.a(this.anInt7130, 1, 0, 21, 1);
		}
		@Pc(52) PixelBuffer local52 = this.aClass5_Sub3_Sub2_8.aPixelBuffer1;
		for (@Pc(54) int local54 = 0; local54 < 6; local54++) {
			@Pc(71) int local71 = this.anIDirect3DCubeTexture1.LockRect(local54, 0, 0, 0, this.anInt7130, this.anInt7130, 0, local52);
			if (qc.a((byte) 48, local71)) {
				@Pc(79) int local79 = local52.getRowPitch();
				if (this.anInt7130 * 4 == local79) {
					local52.b(arg3[local54], 0, 0, this.anInt7130 * this.anInt7130);
				} else {
					for (@Pc(91) int local91 = 0; local91 < this.anInt7130; local91++) {
						local52.b(arg3[local54], local91 * this.anInt7130, local79 * local91, this.anInt7130);
					}
				}
				this.anIDirect3DCubeTexture1.UnlockRect(local54, 0);
			}
		}
	}

	@OriginalMember(owner = "client!qaa", name = "d", descriptor = "(I)V")
	@Override
	public void method6469() {
		this.aClass5_Sub3_Sub2_8.method6434(this);
	}

	@OriginalMember(owner = "client!qaa", name = "e", descriptor = "(I)Lclient!jagdx/IDirect3DBaseTexture;")
	@Override
	public IDirect3DBaseTexture method5960() {
		return this.anIDirect3DCubeTexture1;
	}

	@OriginalMember(owner = "client!qaa", name = "a", descriptor = "(Lclient!lba;I)V")
	@Override
	public void method6468(@OriginalArg(0) Class172 arg0) {
		super.method6468(arg0);
	}
}
