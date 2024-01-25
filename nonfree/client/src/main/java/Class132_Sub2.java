import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DCubeTexture;
import jagdx.PixelBuffer;
import jagdx.rj;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tba")
public final class Class132_Sub2 extends Class132 implements Interface18 {

	@OriginalMember(owner = "client!tba", name = "f", descriptor = "I")
	private final int anInt9095;

	@OriginalMember(owner = "client!tba", name = "g", descriptor = "Lclient!jagdx/IDirect3DCubeTexture;")
	private final IDirect3DCubeTexture anIDirect3DCubeTexture1;

	@OriginalMember(owner = "client!tba", name = "<init>", descriptor = "(Lclient!hb;IZ[[I)V")
	public Class132_Sub2(@OriginalArg(0) Class133_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[][] arg3) {
		super(arg0, Static576.aClass223_16, Static20.aClass19_4, arg2 && arg0.aBoolean284, arg1 * 6 * arg1);
		this.anInt9095 = arg1;
		if (this.aBoolean665) {
			this.anIDirect3DCubeTexture1 = this.aClass133_Sub1_Sub1_8.anIDirect3DDevice1.a(this.anInt9095, 0, 1024, 21, 1);
		} else {
			this.anIDirect3DCubeTexture1 = this.aClass133_Sub1_Sub1_8.anIDirect3DDevice1.a(this.anInt9095, 1, 0, 21, 1);
		}
		@Pc(52) PixelBuffer local52 = this.aClass133_Sub1_Sub1_8.aPixelBuffer1;
		for (@Pc(54) int local54 = 0; local54 < 6; local54++) {
			@Pc(71) int local71 = this.anIDirect3DCubeTexture1.LockRect(local54, 0, 0, 0, this.anInt9095, this.anInt9095, 0, local52);
			if (rj.a(-95, local71)) {
				@Pc(78) int local78 = local52.getRowPitch();
				if (this.anInt9095 * 4 == local78) {
					local52.b(arg3[local54], 0, 0, this.anInt9095 * this.anInt9095);
				} else {
					for (@Pc(90) int local90 = 0; local90 < this.anInt9095; local90++) {
						local52.b(arg3[local54], local90 * this.anInt9095, local90 * local78, this.anInt9095);
					}
				}
				this.anIDirect3DCubeTexture1.UnlockRect(local54, 0);
			}
		}
	}

	@OriginalMember(owner = "client!tba", name = "a", descriptor = "(Lclient!gca;I)V")
	@Override
	public void method7905(@OriginalArg(0) Class116 arg0) {
		super.method7905(arg0);
	}

	@OriginalMember(owner = "client!tba", name = "c", descriptor = "(B)Lclient!jagdx/IDirect3DBaseTexture;")
	@Override
	public IDirect3DBaseTexture method7906() {
		return this.anIDirect3DCubeTexture1;
	}

	@OriginalMember(owner = "client!tba", name = "a", descriptor = "(I)V")
	@Override
	public void method7907() {
		this.aClass133_Sub1_Sub1_8.method3495(this);
	}
}
