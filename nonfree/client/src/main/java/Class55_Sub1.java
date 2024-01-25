import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DCubeTexture;
import jagdx.PixelBuffer;
import jagdx.ue;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gm")
public final class Class55_Sub1 extends Class55 implements Interface19 {

	@OriginalMember(owner = "client!gm", name = "f", descriptor = "I")
	private final int anInt4457;

	@OriginalMember(owner = "client!gm", name = "g", descriptor = "Lclient!jagdx/IDirect3DCubeTexture;")
	private final IDirect3DCubeTexture anIDirect3DCubeTexture1;

	@OriginalMember(owner = "client!gm", name = "<init>", descriptor = "(Lclient!bfa;IZ[[I)V")
	public Class55_Sub1(@OriginalArg(0) Class20_Sub2_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[][] arg3) {
		super(arg0, Static354.aClass375_31, Static29.aClass26_4, arg2 && arg0.aBoolean110, arg1 * 6 * arg1);
		this.anInt4457 = arg1;
		if (this.aBoolean526) {
			this.anIDirect3DCubeTexture1 = this.aClass20_Sub2_Sub1_8.anIDirect3DDevice1.a(this.anInt4457, 0, 1024, 21, 1);
		} else {
			this.anIDirect3DCubeTexture1 = this.aClass20_Sub2_Sub1_8.anIDirect3DDevice1.a(this.anInt4457, 1, 0, 21, 1);
		}
		@Pc(52) PixelBuffer local52 = this.aClass20_Sub2_Sub1_8.aPixelBuffer1;
		for (@Pc(54) int local54 = 0; local54 < 6; local54++) {
			@Pc(73) int local73 = this.anIDirect3DCubeTexture1.LockRect(local54, 0, 0, 0, this.anInt4457, this.anInt4457, 0, local52);
			if (ue.a(local73, false)) {
				@Pc(81) int local81 = local52.getRowPitch();
				if (local81 == this.anInt4457 * 4) {
					local52.a((int[]) arg3[local54], 0, 0, this.anInt4457 * this.anInt4457);
				} else {
					for (@Pc(102) int local102 = 0; local102 < this.anInt4457; local102++) {
						local52.a(arg3[local54], this.anInt4457 * local102, local102 * local81, this.anInt4457);
					}
				}
				this.anIDirect3DCubeTexture1.UnlockRect(local54, 0);
			}
		}
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(B)V")
	@Override
	public void method8286() {
		this.aClass20_Sub2_Sub1_8.method1329(this);
	}

	@OriginalMember(owner = "client!gm", name = "c", descriptor = "(I)Lclient!jagdx/IDirect3DBaseTexture;")
	@Override
	public IDirect3DBaseTexture method6142() {
		return this.anIDirect3DCubeTexture1;
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(Lclient!ria;I)V")
	@Override
	public void method8287(@OriginalArg(0) Class298 arg0) {
		super.method8287(arg0);
	}
}
