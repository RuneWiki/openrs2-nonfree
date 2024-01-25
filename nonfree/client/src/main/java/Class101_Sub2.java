import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DCubeTexture;
import jagdx.PixelBuffer;
import jagdx.aq;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fl")
public final class Class101_Sub2 extends Class101 implements Interface1 {

	@OriginalMember(owner = "client!fl", name = "g", descriptor = "I")
	private final int anInt2752;

	@OriginalMember(owner = "client!fl", name = "f", descriptor = "Lclient!jagdx/IDirect3DCubeTexture;")
	private final IDirect3DCubeTexture anIDirect3DCubeTexture1;

	@OriginalMember(owner = "client!fl", name = "<init>", descriptor = "(Lclient!ki;IZ[[I)V")
	public Class101_Sub2(@OriginalArg(0) Class143_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[][] arg3) {
		super(arg0, Static92.aClass255_3, Static314.aClass206_12, arg2 && arg0.aBoolean365, arg1 * 6 * arg1);
		this.anInt2752 = arg1;
		if (this.aBoolean587) {
			this.anIDirect3DCubeTexture1 = this.aClass143_Sub1_Sub1_5.anIDirect3DDevice1.a(this.anInt2752, 0, 1024, 21, 1);
		} else {
			this.anIDirect3DCubeTexture1 = this.aClass143_Sub1_Sub1_5.anIDirect3DDevice1.a(this.anInt2752, 1, 0, 21, 1);
		}
		@Pc(52) PixelBuffer local52 = this.aClass143_Sub1_Sub1_5.aPixelBuffer1;
		for (@Pc(54) int local54 = 0; local54 < 6; local54++) {
			@Pc(71) int local71 = this.anIDirect3DCubeTexture1.LockRect(local54, 0, 0, 0, this.anInt2752, this.anInt2752, 0, local52);
			if (aq.b(local71, -9)) {
				@Pc(79) int local79 = local52.getRowPitch();
				if (this.anInt2752 * 4 == local79) {
					local52.a((int[]) arg3[local54], 0, 0, this.anInt2752 * this.anInt2752);
				} else {
					for (@Pc(87) int local87 = 0; local87 < this.anInt2752; local87++) {
						local52.a(arg3[local54], local87 * this.anInt2752, local79 * local87, this.anInt2752);
					}
				}
				this.anIDirect3DCubeTexture1.UnlockRect(local54, 0);
			}
		}
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(Lclient!cr;Z)V")
	@Override
	public void method7435(@OriginalArg(0) Class67 arg0) {
		super.method7435(arg0);
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(I)V")
	@Override
	public void method7436() {
		this.aClass143_Sub1_Sub1_5.method4616(this);
	}

	@OriginalMember(owner = "client!fl", name = "d", descriptor = "(I)Lclient!jagdx/IDirect3DBaseTexture;")
	@Override
	public IDirect3DBaseTexture method6875() {
		return this.anIDirect3DCubeTexture1;
	}
}
