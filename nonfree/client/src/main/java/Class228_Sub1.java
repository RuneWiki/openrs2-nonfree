import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DCubeTexture;
import jagdx.PixelBuffer;
import jagdx.mk;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!md")
public final class Class228_Sub1 extends Class228 implements Interface16 {

	@OriginalMember(owner = "client!md", name = "g", descriptor = "I")
	private final int anInt6592;

	@OriginalMember(owner = "client!md", name = "f", descriptor = "Lclient!jagdx/IDirect3DCubeTexture;")
	private final IDirect3DCubeTexture anIDirect3DCubeTexture1;

	@OriginalMember(owner = "client!md", name = "<init>", descriptor = "(Lclient!ta;IZ[[I)V")
	public Class228_Sub1(@OriginalArg(0) Class137_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[][] arg3) {
		super(arg0, Static238.aClass363_4, Static47.aClass36_5, arg2 && arg0.aBoolean689, arg1 * 6 * arg1);
		this.anInt6592 = arg1;
		if (this.aBoolean746) {
			this.anIDirect3DCubeTexture1 = this.aClass137_Sub1_Sub2_9.anIDirect3DDevice1.a(this.anInt6592, 0, 1024, 21, 1);
		} else {
			this.anIDirect3DCubeTexture1 = this.aClass137_Sub1_Sub2_9.anIDirect3DDevice1.a(this.anInt6592, 1, 0, 21, 1);
		}
		@Pc(52) PixelBuffer local52 = this.aClass137_Sub1_Sub2_9.aPixelBuffer1;
		for (@Pc(54) int local54 = 0; local54 < 6; local54++) {
			@Pc(71) int local71 = this.anIDirect3DCubeTexture1.LockRect(local54, 0, 0, 0, this.anInt6592, this.anInt6592, 0, local52);
			if (mk.b(local71, -1)) {
				@Pc(78) int local78 = local52.getRowPitch();
				if (this.anInt6592 * 4 == local78) {
					local52.b(arg3[local54], 0, 0, this.anInt6592 * this.anInt6592);
				} else {
					for (@Pc(99) int local99 = 0; local99 < this.anInt6592; local99++) {
						local52.b(arg3[local54], this.anInt6592 * local99, local99 * local78, this.anInt6592);
					}
				}
				this.anIDirect3DCubeTexture1.UnlockRect(local54, 0);
			}
		}
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(ILclient!tda;)V")
	@Override
	public void method9087(@OriginalArg(1) Class334 arg0) {
		super.method9087(arg0);
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(I)V")
	@Override
	public void method9088() {
		this.aClass137_Sub1_Sub2_9.method8099(this);
	}

	@OriginalMember(owner = "client!md", name = "b", descriptor = "(Z)Lclient!jagdx/IDirect3DBaseTexture;")
	@Override
	public IDirect3DBaseTexture method9086() {
		return this.anIDirect3DCubeTexture1;
	}
}
