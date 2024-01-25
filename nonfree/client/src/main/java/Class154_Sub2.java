import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DCubeTexture;
import jagdx.PixelBuffer;
import jagdx.eo;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ow")
public final class Class154_Sub2 extends Class154 implements Interface11 {

	@OriginalMember(owner = "client!ow", name = "g", descriptor = "I")
	private final int anInt7608;

	@OriginalMember(owner = "client!ow", name = "f", descriptor = "Lclient!jagdx/IDirect3DCubeTexture;")
	private final IDirect3DCubeTexture anIDirect3DCubeTexture1;

	@OriginalMember(owner = "client!ow", name = "<init>", descriptor = "(Lclient!oe;IZ[[I)V")
	public Class154_Sub2(@OriginalArg(0) Class7_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[][] arg3) {
		super(arg0, Static151.aClass161_6, Static424.aClass273_12, arg2 && arg0.aBoolean537, arg1 * 6 * arg1);
		this.anInt7608 = arg1;
		if (this.aBoolean696) {
			this.anIDirect3DCubeTexture1 = this.aClass7_Sub1_Sub2_8.anIDirect3DDevice1.a(this.anInt7608, 0, 1024, 21, 1);
		} else {
			this.anIDirect3DCubeTexture1 = this.aClass7_Sub1_Sub2_8.anIDirect3DDevice1.a(this.anInt7608, 1, 0, 21, 1);
		}
		@Pc(52) PixelBuffer local52 = this.aClass7_Sub1_Sub2_8.aPixelBuffer1;
		for (@Pc(54) int local54 = 0; local54 < 6; local54++) {
			@Pc(73) int local73 = this.anIDirect3DCubeTexture1.LockRect(local54, 0, 0, 0, this.anInt7608, this.anInt7608, 0, local52);
			if (eo.a(26, local73)) {
				@Pc(81) int local81 = local52.getRowPitch();
				if (this.anInt7608 * 4 == local81) {
					local52.b(arg3[local54], 0, 0, this.anInt7608 * this.anInt7608);
				} else {
					for (@Pc(93) int local93 = 0; local93 < this.anInt7608; local93++) {
						local52.b(arg3[local54], this.anInt7608 * local93, local93 * local81, this.anInt7608);
					}
				}
				this.anIDirect3DCubeTexture1.UnlockRect(local54, 0);
			}
		}
	}

	@OriginalMember(owner = "client!ow", name = "a", descriptor = "(I)V")
	@Override
	public void method7871() {
		this.aClass7_Sub1_Sub2_8.method5798(this);
	}

	@OriginalMember(owner = "client!ow", name = "a", descriptor = "(Z)Lclient!jagdx/IDirect3DBaseTexture;")
	@Override
	public IDirect3DBaseTexture method7870() {
		return this.anIDirect3DCubeTexture1;
	}

	@OriginalMember(owner = "client!ow", name = "a", descriptor = "(BLclient!tn;)V")
	@Override
	public void method7869(@OriginalArg(1) Class318 arg0) {
		super.method7869(arg0);
	}
}
