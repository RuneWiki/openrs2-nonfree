import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DCubeTexture;
import jagdx.PixelBuffer;
import jagdx.pp;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!po")
public final class Class13_Sub3 extends Class13 implements Interface24 {

	@OriginalMember(owner = "client!po", name = "f", descriptor = "I")
	private final int anInt7994;

	@OriginalMember(owner = "client!po", name = "g", descriptor = "Lclient!jagdx/IDirect3DCubeTexture;")
	private final IDirect3DCubeTexture anIDirect3DCubeTexture1;

	@OriginalMember(owner = "client!po", name = "<init>", descriptor = "(Lclient!cu;IZ[[I)V")
	public Class13_Sub3(@OriginalArg(0) Class33_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[][] arg3) {
		super(arg0, Static333.aClass82_9, Static137.aClass89_8, arg2 && arg0.aBoolean189, arg1 * 6 * arg1);
		this.anInt7994 = arg1;
		if (this.aBoolean679) {
			this.anIDirect3DCubeTexture1 = this.aClass33_Sub1_Sub2_7.anIDirect3DDevice1.a(this.anInt7994, 0, 1024, 21, 1);
		} else {
			this.anIDirect3DCubeTexture1 = this.aClass33_Sub1_Sub2_7.anIDirect3DDevice1.a(this.anInt7994, 1, 0, 21, 1);
		}
		@Pc(52) PixelBuffer local52 = this.aClass33_Sub1_Sub2_7.aPixelBuffer1;
		for (@Pc(54) int local54 = 0; local54 < 6; local54++) {
			@Pc(71) int local71 = this.anIDirect3DCubeTexture1.LockRect(local54, 0, 0, 0, this.anInt7994, this.anInt7994, 0, local52);
			if (pp.a(false, local71)) {
				@Pc(79) int local79 = local52.getRowPitch();
				if (local79 == this.anInt7994 * 4) {
					local52.b(arg3[local54], 0, 0, this.anInt7994 * this.anInt7994);
				} else {
					for (@Pc(87) int local87 = 0; local87 < this.anInt7994; local87++) {
						local52.b(arg3[local54], local87 * this.anInt7994, local79 * local87, this.anInt7994);
					}
				}
				this.anIDirect3DCubeTexture1.UnlockRect(local54, 0);
			}
		}
	}

	@OriginalMember(owner = "client!po", name = "d", descriptor = "(I)Lclient!jagdx/IDirect3DBaseTexture;")
	@Override
	public IDirect3DBaseTexture method6679() {
		return this.anIDirect3DCubeTexture1;
	}

	@OriginalMember(owner = "client!po", name = "c", descriptor = "(I)V")
	@Override
	public void method7293() {
		this.aClass33_Sub1_Sub2_7.method2130(this);
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(Lclient!bba;I)V")
	@Override
	public void method7294(@OriginalArg(0) Class26 arg0) {
		super.method7294(arg0);
	}
}
