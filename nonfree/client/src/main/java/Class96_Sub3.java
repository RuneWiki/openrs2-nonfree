import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DCubeTexture;
import jagdx.PixelBuffer;
import jagdx.hb;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!po")
public final class Class96_Sub3 extends Class96 implements Interface22 {

	@OriginalMember(owner = "client!po", name = "g", descriptor = "I")
	private final int anInt7529;

	@OriginalMember(owner = "client!po", name = "f", descriptor = "Lclient!jagdx/IDirect3DCubeTexture;")
	private final IDirect3DCubeTexture anIDirect3DCubeTexture1;

	@OriginalMember(owner = "client!po", name = "<init>", descriptor = "(Lclient!gb;IZ[[I)V")
	public Class96_Sub3(@OriginalArg(0) Class9_Sub3_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[][] arg3) {
		super(arg0, Static487.aClass333_15, Static336.aClass220_12, arg2 && arg0.aBoolean301, arg1 * arg1 * 6);
		this.anInt7529 = arg1;
		if (this.aBoolean552) {
			this.anIDirect3DCubeTexture1 = this.aClass9_Sub3_Sub1_6.anIDirect3DDevice1.a(this.anInt7529, 0, 1024, 21, 1);
		} else {
			this.anIDirect3DCubeTexture1 = this.aClass9_Sub3_Sub1_6.anIDirect3DDevice1.a(this.anInt7529, 1, 0, 21, 1);
		}
		@Pc(52) PixelBuffer local52 = this.aClass9_Sub3_Sub1_6.aPixelBuffer1;
		for (@Pc(54) int local54 = 0; local54 < 6; local54++) {
			@Pc(71) int local71 = this.anIDirect3DCubeTexture1.LockRect(local54, 0, 0, 0, this.anInt7529, this.anInt7529, 0, local52);
			if (hb.a(local71, (byte) -88)) {
				@Pc(79) int local79 = local52.getRowPitch();
				if (this.anInt7529 * 4 == local79) {
					local52.b(arg3[local54], 0, 0, this.anInt7529 * this.anInt7529);
				} else {
					for (@Pc(91) int local91 = 0; local91 < this.anInt7529; local91++) {
						local52.b(arg3[local54], this.anInt7529 * local91, local91 * local79, this.anInt7529);
					}
				}
				this.anIDirect3DCubeTexture1.UnlockRect(local54, 0);
			}
		}
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(ILclient!up;)V")
	@Override
	public void method7737(@OriginalArg(1) Class321 arg0) {
		super.method7737(arg0);
	}

	@OriginalMember(owner = "client!po", name = "d", descriptor = "(I)V")
	@Override
	public void method7736() {
		this.aClass9_Sub3_Sub1_6.method3250(this);
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(B)Lclient!jagdx/IDirect3DBaseTexture;")
	@Override
	public IDirect3DBaseTexture method6280() {
		return this.anIDirect3DCubeTexture1;
	}
}
