import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DCubeTexture;
import jagdx.PixelBuffer;
import jagdx.nba;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kh")
public final class Class87_Sub2 extends Class87 implements Interface22 {

	@OriginalMember(owner = "client!kh", name = "g", descriptor = "I")
	private final int anInt5178;

	@OriginalMember(owner = "client!kh", name = "f", descriptor = "Lclient!jagdx/IDirect3DCubeTexture;")
	private final IDirect3DCubeTexture anIDirect3DCubeTexture1;

	@OriginalMember(owner = "client!kh", name = "<init>", descriptor = "(Lclient!ss;IZ[[I)V")
	public Class87_Sub2(@OriginalArg(0) Class66_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[][] arg3) {
		super(arg0, Static85.aClass141_2, Static349.aClass239_12, arg2 && arg0.aBoolean587, arg1 * 6 * arg1);
		this.anInt5178 = arg1;
		if (this.aBoolean559) {
			this.anIDirect3DCubeTexture1 = this.aClass66_Sub1_Sub2_6.anIDirect3DDevice1.a(this.anInt5178, 0, 1024, 21, 1);
		} else {
			this.anIDirect3DCubeTexture1 = this.aClass66_Sub1_Sub2_6.anIDirect3DDevice1.a(this.anInt5178, 1, 0, 21, 1);
		}
		@Pc(52) PixelBuffer local52 = this.aClass66_Sub1_Sub2_6.aPixelBuffer1;
		for (@Pc(54) int local54 = 0; local54 < 6; local54++) {
			@Pc(71) int local71 = this.anIDirect3DCubeTexture1.LockRect(local54, 0, 0, 0, this.anInt5178, this.anInt5178, 0, local52);
			if (nba.a(local71, (byte) -41)) {
				@Pc(79) int local79 = local52.getRowPitch();
				if (this.anInt5178 * 4 == local79) {
					local52.b(arg3[local54], 0, 0, this.anInt5178 * this.anInt5178);
				} else {
					for (@Pc(100) int local100 = 0; local100 < this.anInt5178; local100++) {
						local52.b(arg3[local54], this.anInt5178 * local100, local79 * local100, this.anInt5178);
					}
				}
				this.anIDirect3DCubeTexture1.UnlockRect(local54, 0);
			}
		}
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(Lclient!cba;I)V")
	@Override
	public void method6762(@OriginalArg(0) Class46 arg0) {
		super.method6762(arg0);
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(I)Lclient!jagdx/IDirect3DBaseTexture;")
	@Override
	public IDirect3DBaseTexture method6716() {
		return this.anIDirect3DCubeTexture1;
	}

	@OriginalMember(owner = "client!kh", name = "c", descriptor = "(B)V")
	@Override
	public void method6761() {
		this.aClass66_Sub1_Sub2_6.method7002(this);
	}
}
