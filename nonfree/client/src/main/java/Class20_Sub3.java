import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DCubeTexture;
import jagdx.PixelBuffer;
import jagdx.rl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iq")
public final class Class20_Sub3 extends Class20 implements Interface20 {

	@OriginalMember(owner = "client!iq", name = "g", descriptor = "I")
	private final int anInt4406;

	@OriginalMember(owner = "client!iq", name = "f", descriptor = "Lclient!jagdx/IDirect3DCubeTexture;")
	private final IDirect3DCubeTexture anIDirect3DCubeTexture1;

	@OriginalMember(owner = "client!iq", name = "<init>", descriptor = "(Lclient!hg;IZ[[I)V")
	public Class20_Sub3(@OriginalArg(0) Class43_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[][] arg3) {
		super(arg0, Static581.aClass93_14, Static461.aClass292_14, arg2 && arg0.aBoolean312, arg1 * arg1 * 6);
		this.anInt4406 = arg1;
		if (this.aBoolean337) {
			this.anIDirect3DCubeTexture1 = this.aClass43_Sub1_Sub1_6.anIDirect3DDevice1.a(this.anInt4406, 0, 1024, 21, 1);
		} else {
			this.anIDirect3DCubeTexture1 = this.aClass43_Sub1_Sub1_6.anIDirect3DDevice1.a(this.anInt4406, 1, 0, 21, 1);
		}
		@Pc(52) PixelBuffer local52 = this.aClass43_Sub1_Sub1_6.aPixelBuffer1;
		for (@Pc(54) int local54 = 0; local54 < 6; local54++) {
			@Pc(71) int local71 = this.anIDirect3DCubeTexture1.LockRect(local54, 0, 0, 0, this.anInt4406, this.anInt4406, 0, local52);
			if (rl.a(local71, (int) 3102)) {
				@Pc(78) int local78 = local52.getRowPitch();
				if (local78 == this.anInt4406 * 4) {
					local52.a((int[]) arg3[local54], 0, 0, this.anInt4406 * this.anInt4406);
				} else {
					for (@Pc(99) int local99 = 0; local99 < this.anInt4406; local99++) {
						local52.a(arg3[local54], local99 * this.anInt4406, local99 * local78, this.anInt4406);
					}
				}
				this.anIDirect3DCubeTexture1.UnlockRect(local54, 0);
			}
		}
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(B)Lclient!jagdx/IDirect3DBaseTexture;")
	@Override
	public IDirect3DBaseTexture method3898() {
		return this.anIDirect3DCubeTexture1;
	}

	@OriginalMember(owner = "client!iq", name = "d", descriptor = "(I)V")
	@Override
	public void method7423() {
		this.aClass43_Sub1_Sub1_6.method3528(this);
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(ZLclient!gw;)V")
	@Override
	public void method7422(@OriginalArg(1) Class123 arg0) {
		super.method7422(arg0);
	}
}
