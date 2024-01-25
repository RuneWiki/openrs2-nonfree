import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DCubeTexture;
import jagdx.PixelBuffer;
import jagdx.hia;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pfa")
public final class Class81_Sub2 extends Class81 implements Interface20 {

	@OriginalMember(owner = "client!pfa", name = "f", descriptor = "I")
	private final int anInt7793;

	@OriginalMember(owner = "client!pfa", name = "g", descriptor = "Lclient!jagdx/IDirect3DCubeTexture;")
	private final IDirect3DCubeTexture anIDirect3DCubeTexture1;

	@OriginalMember(owner = "client!pfa", name = "<init>", descriptor = "(Lclient!hda;IZ[[I)V")
	public Class81_Sub2(@OriginalArg(0) Class144_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[][] arg3) {
		super(arg0, Static641.aClass260_12, Static18.aClass19_4, arg2 && arg0.aBoolean324, arg1 * 6 * arg1);
		this.anInt7793 = arg1;
		if (this.aBoolean769) {
			this.anIDirect3DCubeTexture1 = this.aClass144_Sub1_Sub1_9.anIDirect3DDevice1.a(this.anInt7793, 0, 1024, 21, 1);
		} else {
			this.anIDirect3DCubeTexture1 = this.aClass144_Sub1_Sub1_9.anIDirect3DDevice1.a(this.anInt7793, 1, 0, 21, 1);
		}
		@Pc(52) PixelBuffer local52 = this.aClass144_Sub1_Sub1_9.aPixelBuffer1;
		for (@Pc(54) int local54 = 0; local54 < 6; local54++) {
			@Pc(71) int local71 = this.anIDirect3DCubeTexture1.LockRect(local54, 0, 0, 0, this.anInt7793, this.anInt7793, 0, local52);
			if (hia.a(local71, (byte) -123)) {
				@Pc(78) int local78 = local52.getRowPitch();
				if (this.anInt7793 * 4 == local78) {
					local52.b(arg3[local54], 0, 0, this.anInt7793 * this.anInt7793);
				} else {
					for (@Pc(90) int local90 = 0; local90 < this.anInt7793; local90++) {
						local52.b(arg3[local54], local90 * this.anInt7793, local90 * local78, this.anInt7793);
					}
				}
				this.anIDirect3DCubeTexture1.UnlockRect(local54, 0);
			}
		}
	}

	@OriginalMember(owner = "client!pfa", name = "c", descriptor = "(I)Lclient!jagdx/IDirect3DBaseTexture;")
	@Override
	public IDirect3DBaseTexture method9339() {
		return this.anIDirect3DCubeTexture1;
	}

	@OriginalMember(owner = "client!pfa", name = "b", descriptor = "(I)V")
	@Override
	public void method9348() {
		this.aClass144_Sub1_Sub1_9.method3729(this);
	}

	@OriginalMember(owner = "client!pfa", name = "a", descriptor = "(ZLclient!gk;)V")
	@Override
	public void method9349(@OriginalArg(1) Class137 arg0) {
		super.method9349(arg0);
	}
}
