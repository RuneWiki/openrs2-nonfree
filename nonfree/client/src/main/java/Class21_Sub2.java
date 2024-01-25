import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DCubeTexture;
import jagdx.PixelBuffer;
import jagdx.saa;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dj")
public final class Class21_Sub2 extends Class21 implements Interface9 {

	@OriginalMember(owner = "client!dj", name = "f", descriptor = "I")
	private final int anInt1946;

	@OriginalMember(owner = "client!dj", name = "g", descriptor = "Lclient!jagdx/IDirect3DCubeTexture;")
	private final IDirect3DCubeTexture anIDirect3DCubeTexture1;

	@OriginalMember(owner = "client!dj", name = "<init>", descriptor = "(Lclient!sga;IZ[[I)V")
	public Class21_Sub2(@OriginalArg(0) Class132_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[][] arg3) {
		super(arg0, Static169.aClass265_9, Static417.aClass250_14, arg2 && arg0.aBoolean647, arg1 * arg1 * 6);
		this.anInt1946 = arg1;
		if (this.aBoolean733) {
			this.anIDirect3DCubeTexture1 = this.aClass132_Sub1_Sub2_9.anIDirect3DDevice1.a(this.anInt1946, 0, 1024, 21, 1);
		} else {
			this.anIDirect3DCubeTexture1 = this.aClass132_Sub1_Sub2_9.anIDirect3DDevice1.a(this.anInt1946, 1, 0, 21, 1);
		}
		@Pc(52) PixelBuffer local52 = this.aClass132_Sub1_Sub2_9.aPixelBuffer1;
		for (@Pc(54) int local54 = 0; local54 < 6; local54++) {
			@Pc(71) int local71 = this.anIDirect3DCubeTexture1.LockRect(local54, 0, 0, 0, this.anInt1946, this.anInt1946, 0, local52);
			if (saa.b(local71, (byte) 92)) {
				@Pc(78) int local78 = local52.getRowPitch();
				if (this.anInt1946 * 4 == local78) {
					local52.a((int[]) arg3[local54], 0, 0, this.anInt1946 * this.anInt1946);
				} else {
					for (@Pc(86) int local86 = 0; local86 < this.anInt1946; local86++) {
						local52.a(arg3[local54], this.anInt1946 * local86, local86 * local78, this.anInt1946);
					}
				}
				this.anIDirect3DCubeTexture1.UnlockRect(local54, 0);
			}
		}
	}

	@OriginalMember(owner = "client!dj", name = "b", descriptor = "(I)V")
	@Override
	public void method8895() {
		this.aClass132_Sub1_Sub2_9.method7662(this);
	}

	@OriginalMember(owner = "client!dj", name = "c", descriptor = "(I)Lclient!jagdx/IDirect3DBaseTexture;")
	@Override
	public IDirect3DBaseTexture method8894() {
		return this.anIDirect3DCubeTexture1;
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(BLclient!cw;)V")
	@Override
	public void method8893(@OriginalArg(1) Class59 arg0) {
		super.method8893(arg0);
	}
}
