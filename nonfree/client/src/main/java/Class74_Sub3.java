import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DCubeTexture;
import jagdx.PixelBuffer;
import jagdx.ec;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!via")
public final class Class74_Sub3 extends Class74 implements Interface25 {

	@OriginalMember(owner = "client!via", name = "g", descriptor = "I")
	private final int anInt10250;

	@OriginalMember(owner = "client!via", name = "f", descriptor = "Lclient!jagdx/IDirect3DCubeTexture;")
	private final IDirect3DCubeTexture anIDirect3DCubeTexture1;

	@OriginalMember(owner = "client!via", name = "<init>", descriptor = "(Lclient!hl;IZ[[I)V")
	public Class74_Sub3(@OriginalArg(0) Class16_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[][] arg3) {
		super(arg0, Static456.aClass366_9, Static258.aClass160_9, arg2 && arg0.aBoolean365, arg1 * arg1 * 6);
		this.anInt10250 = arg1;
		if (this.aBoolean736) {
			this.anIDirect3DCubeTexture1 = this.aClass16_Sub1_Sub2_9.anIDirect3DDevice1.a(this.anInt10250, 0, 1024, 21, 1);
		} else {
			this.anIDirect3DCubeTexture1 = this.aClass16_Sub1_Sub2_9.anIDirect3DDevice1.a(this.anInt10250, 1, 0, 21, 1);
		}
		@Pc(52) PixelBuffer local52 = this.aClass16_Sub1_Sub2_9.aPixelBuffer1;
		for (@Pc(54) int local54 = 0; local54 < 6; local54++) {
			@Pc(73) int local73 = this.anIDirect3DCubeTexture1.LockRect(local54, 0, 0, 0, this.anInt10250, this.anInt10250, 0, local52);
			if (ec.a(local73, 2005530520)) {
				@Pc(81) int local81 = local52.getRowPitch();
				if (this.anInt10250 * 4 == local81) {
					local52.a((int[]) arg3[local54], 0, 0, this.anInt10250 * this.anInt10250);
				} else {
					for (@Pc(89) int local89 = 0; local89 < this.anInt10250; local89++) {
						local52.a(arg3[local54], local89 * this.anInt10250, local81 * local89, this.anInt10250);
					}
				}
				this.anIDirect3DCubeTexture1.UnlockRect(local54, 0);
			}
		}
	}

	@OriginalMember(owner = "client!via", name = "a", descriptor = "(B)V")
	@Override
	public void method8281() {
		this.aClass16_Sub1_Sub2_9.method4020(this);
	}

	@OriginalMember(owner = "client!via", name = "b", descriptor = "(Z)Lclient!jagdx/IDirect3DBaseTexture;")
	@Override
	public IDirect3DBaseTexture method8279() {
		return this.anIDirect3DCubeTexture1;
	}

	@OriginalMember(owner = "client!via", name = "a", descriptor = "(Lclient!qo;I)V")
	@Override
	public void method8280(@OriginalArg(0) Class277 arg0) {
		super.method8280(arg0);
	}
}
