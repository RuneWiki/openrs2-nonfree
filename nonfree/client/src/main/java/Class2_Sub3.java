import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DCubeTexture;
import jagdx.PixelBuffer;
import jagdx.js;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vm")
public final class Class2_Sub3 extends Class2 implements Interface18 {

	@OriginalMember(owner = "client!vm", name = "g", descriptor = "I")
	private final int anInt9809;

	@OriginalMember(owner = "client!vm", name = "f", descriptor = "Lclient!jagdx/IDirect3DCubeTexture;")
	private final IDirect3DCubeTexture anIDirect3DCubeTexture1;

	@OriginalMember(owner = "client!vm", name = "<init>", descriptor = "(Lclient!to;IZ[[I)V")
	public Class2_Sub3(@OriginalArg(0) Class31_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[][] arg3) {
		super(arg0, Static18.aClass245_3, Static331.aClass204_13, arg2 && arg0.aBoolean620, arg1 * arg1 * 6);
		this.anInt9809 = arg1;
		if (this.aBoolean648) {
			this.anIDirect3DCubeTexture1 = this.aClass31_Sub1_Sub2_9.anIDirect3DDevice1.a(this.anInt9809, 0, 1024, 21, 1);
		} else {
			this.anIDirect3DCubeTexture1 = this.aClass31_Sub1_Sub2_9.anIDirect3DDevice1.a(this.anInt9809, 1, 0, 21, 1);
		}
		@Pc(52) PixelBuffer local52 = this.aClass31_Sub1_Sub2_9.aPixelBuffer1;
		for (@Pc(54) int local54 = 0; local54 < 6; local54++) {
			@Pc(73) int local73 = this.anIDirect3DCubeTexture1.LockRect(local54, 0, 0, 0, this.anInt9809, this.anInt9809, 0, local52);
			if (js.b(local73, 141953135)) {
				@Pc(81) int local81 = local52.getRowPitch();
				if (this.anInt9809 * 4 == local81) {
					local52.b(arg3[local54], 0, 0, this.anInt9809 * this.anInt9809);
				} else {
					for (@Pc(93) int local93 = 0; local93 < this.anInt9809; local93++) {
						local52.b(arg3[local54], this.anInt9809 * local93, local93 * local81, this.anInt9809);
					}
				}
				this.anIDirect3DCubeTexture1.UnlockRect(local54, 0);
			}
		}
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(Lclient!dca;B)V")
	@Override
	public void method7711(@OriginalArg(0) Class65 arg0) {
		super.method7711(arg0);
	}

	@OriginalMember(owner = "client!vm", name = "d", descriptor = "(I)V")
	@Override
	public void method7712() {
		this.aClass31_Sub1_Sub2_9.method7186(this);
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(B)Lclient!jagdx/IDirect3DBaseTexture;")
	@Override
	public IDirect3DBaseTexture method7710() {
		return this.anIDirect3DCubeTexture1;
	}
}
