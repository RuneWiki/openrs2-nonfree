import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DCubeTexture;
import jagdx.PixelBuffer;
import jagdx.qr;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!paa")
public final class Class102_Sub3 extends Class102 implements Interface20 {

	@OriginalMember(owner = "client!paa", name = "f", descriptor = "I")
	private final int anInt6920;

	@OriginalMember(owner = "client!paa", name = "g", descriptor = "Lclient!jagdx/IDirect3DCubeTexture;")
	private final IDirect3DCubeTexture anIDirect3DCubeTexture1;

	@OriginalMember(owner = "client!paa", name = "<init>", descriptor = "(Lclient!gaa;IZ[[I)V")
	public Class102_Sub3(@OriginalArg(0) Class100_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[][] arg3) {
		super(arg0, Static356.aClass88_11, Static47.aClass42_4, arg2 && arg0.aBoolean282, arg1 * 6 * arg1);
		this.anInt6920 = arg1;
		if (this.aBoolean538) {
			this.anIDirect3DCubeTexture1 = this.aClass100_Sub1_Sub1_8.anIDirect3DDevice1.a(this.anInt6920, 0, 1024, 21, 1);
		} else {
			this.anIDirect3DCubeTexture1 = this.aClass100_Sub1_Sub1_8.anIDirect3DDevice1.a(this.anInt6920, 1, 0, 21, 1);
		}
		@Pc(52) PixelBuffer local52 = this.aClass100_Sub1_Sub1_8.aPixelBuffer1;
		for (@Pc(54) int local54 = 0; local54 < 6; local54++) {
			@Pc(73) int local73 = this.anIDirect3DCubeTexture1.LockRect(local54, 0, 0, 0, this.anInt6920, this.anInt6920, 0, local52);
			if (qr.a(local73, -2005530519)) {
				@Pc(80) int local80 = local52.getRowPitch();
				if (this.anInt6920 * 4 == local80) {
					local52.a((int[]) arg3[local54], 0, 0, this.anInt6920 * this.anInt6920);
				} else {
					for (@Pc(101) int local101 = 0; local101 < this.anInt6920; local101++) {
						local52.a(arg3[local54], local101 * this.anInt6920, local80 * local101, this.anInt6920);
					}
				}
				this.anIDirect3DCubeTexture1.UnlockRect(local54, 0);
			}
		}
	}

	@OriginalMember(owner = "client!paa", name = "c", descriptor = "(I)Lclient!jagdx/IDirect3DBaseTexture;")
	@Override
	public IDirect3DBaseTexture method5797() {
		return this.anIDirect3DCubeTexture1;
	}

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "(I)V")
	@Override
	public void method7049() {
		this.aClass100_Sub1_Sub1_8.method2849(this);
	}

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "(Lclient!mv;I)V")
	@Override
	public void method7050(@OriginalArg(0) Class227 arg0) {
		super.method7050(arg0);
	}
}
