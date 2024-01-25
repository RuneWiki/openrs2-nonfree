import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DCubeTexture;
import jagdx.PixelBuffer;
import jagdx.bea;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ju")
public final class Class65_Sub2 extends Class65 implements Interface8 {

	@OriginalMember(owner = "client!ju", name = "g", descriptor = "I")
	private final int anInt4602;

	@OriginalMember(owner = "client!ju", name = "f", descriptor = "Lclient!jagdx/IDirect3DCubeTexture;")
	private final IDirect3DCubeTexture anIDirect3DCubeTexture1;

	@OriginalMember(owner = "client!ju", name = "<init>", descriptor = "(Lclient!tb;IZ[[I)V")
	public Class65_Sub2(@OriginalArg(0) Class134_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[][] arg3) {
		super(arg0, Static129.aClass203_5, Static215.aClass155_10, arg2 && arg0.aBoolean654, arg1 * 6 * arg1);
		this.anInt4602 = arg1;
		if (this.aBoolean556) {
			this.anIDirect3DCubeTexture1 = this.aClass134_Sub1_Sub2_7.anIDirect3DDevice1.a(this.anInt4602, 0, 1024, 21, 1);
		} else {
			this.anIDirect3DCubeTexture1 = this.aClass134_Sub1_Sub2_7.anIDirect3DDevice1.a(this.anInt4602, 1, 0, 21, 1);
		}
		@Pc(52) PixelBuffer local52 = this.aClass134_Sub1_Sub2_7.aPixelBuffer1;
		for (@Pc(54) int local54 = 0; local54 < 6; local54++) {
			@Pc(71) int local71 = this.anIDirect3DCubeTexture1.LockRect(local54, 0, 0, 0, this.anInt4602, this.anInt4602, 0, local52);
			if (bea.a(112, local71)) {
				@Pc(78) int local78 = local52.getRowPitch();
				if (local78 == this.anInt4602 * 4) {
					local52.a((int[]) arg3[local54], 0, 0, this.anInt4602 * this.anInt4602);
				} else {
					for (@Pc(99) int local99 = 0; local99 < this.anInt4602; local99++) {
						local52.a(arg3[local54], local99 * this.anInt4602, local99 * local78, this.anInt4602);
					}
				}
				this.anIDirect3DCubeTexture1.UnlockRect(local54, 0);
			}
		}
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(I)V")
	@Override
	public void method5454() {
		this.aClass134_Sub1_Sub2_7.method6867(this);
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(Lclient!gaa;I)V")
	@Override
	public void method5452(@OriginalArg(0) Class115 arg0) {
		super.method5452(arg0);
	}

	@OriginalMember(owner = "client!ju", name = "c", descriptor = "(I)Lclient!jagdx/IDirect3DBaseTexture;")
	@Override
	public IDirect3DBaseTexture method5453() {
		return this.anIDirect3DCubeTexture1;
	}
}
