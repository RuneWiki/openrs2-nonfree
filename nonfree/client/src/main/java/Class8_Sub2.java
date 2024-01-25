import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DCubeTexture;
import jagdx.PixelBuffer;
import jagdx.oo;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ng")
public final class Class8_Sub2 extends Class8 implements Interface14 {

	@OriginalMember(owner = "client!ng", name = "f", descriptor = "I")
	private final int anInt7006;

	@OriginalMember(owner = "client!ng", name = "g", descriptor = "Lclient!jagdx/IDirect3DCubeTexture;")
	private final IDirect3DCubeTexture anIDirect3DCubeTexture1;

	@OriginalMember(owner = "client!ng", name = "<init>", descriptor = "(Lclient!cka;IZ[[I)V")
	public Class8_Sub2(@OriginalArg(0) Class65_Sub2_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[][] arg3) {
		super(arg0, Static435.aClass339_15, Static120.aClass89_7, arg2 && arg0.aBoolean165, arg1 * 6 * arg1);
		this.anInt7006 = arg1;
		if (this.aBoolean648) {
			this.anIDirect3DCubeTexture1 = this.aClass65_Sub2_Sub1_6.anIDirect3DDevice1.a(this.anInt7006, 0, 1024, 21, 1);
		} else {
			this.anIDirect3DCubeTexture1 = this.aClass65_Sub2_Sub1_6.anIDirect3DDevice1.a(this.anInt7006, 1, 0, 21, 1);
		}
		@Pc(52) PixelBuffer local52 = this.aClass65_Sub2_Sub1_6.aPixelBuffer1;
		for (@Pc(54) int local54 = 0; local54 < 6; local54++) {
			@Pc(71) int local71 = this.anIDirect3DCubeTexture1.LockRect(local54, 0, 0, 0, this.anInt7006, this.anInt7006, 0, local52);
			if (oo.a(false, local71)) {
				@Pc(79) int local79 = local52.getRowPitch();
				if (local79 == this.anInt7006 * 4) {
					local52.b(arg3[local54], 0, 0, this.anInt7006 * this.anInt7006);
				} else {
					for (@Pc(91) int local91 = 0; local91 < this.anInt7006; local91++) {
						local52.b(arg3[local54], this.anInt7006 * local91, local91 * local79, this.anInt7006);
					}
				}
				this.anIDirect3DCubeTexture1.UnlockRect(local54, 0);
			}
		}
	}

	@OriginalMember(owner = "client!ng", name = "b", descriptor = "(B)Lclient!jagdx/IDirect3DBaseTexture;")
	@Override
	public IDirect3DBaseTexture method6358() {
		return this.anIDirect3DCubeTexture1;
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(B)V")
	@Override
	public void method7703() {
		this.aClass65_Sub2_Sub1_6.method1757(this);
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(BLclient!qt;)V")
	@Override
	public void method7704(@OriginalArg(1) Class294 arg0) {
		super.method7704(arg0);
	}
}
