import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DCubeTexture;
import jagdx.PixelBuffer;
import jagdx.mo;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dj")
public final class Class24_Sub2 extends Class24 implements Interface7 {

	@OriginalMember(owner = "client!dj", name = "f", descriptor = "I")
	private final int anInt1832;

	@OriginalMember(owner = "client!dj", name = "g", descriptor = "Lclient!jagdx/IDirect3DCubeTexture;")
	private final IDirect3DCubeTexture anIDirect3DCubeTexture1;

	@OriginalMember(owner = "client!dj", name = "<init>", descriptor = "(Lclient!hv;IZ[[I)V")
	public Class24_Sub2(@OriginalArg(0) Class122_Sub2_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[][] arg3) {
		super(arg0, Static542.aClass292_17, Static431.aClass264_15, arg2 && arg0.aBoolean278, arg1 * 6 * arg1);
		this.anInt1832 = arg1;
		if (this.aBoolean289) {
			this.anIDirect3DCubeTexture1 = this.aClass122_Sub2_Sub1_5.anIDirect3DDevice1.a(this.anInt1832, 0, 1024, 21, 1);
		} else {
			this.anIDirect3DCubeTexture1 = this.aClass122_Sub2_Sub1_5.anIDirect3DDevice1.a(this.anInt1832, 1, 0, 21, 1);
		}
		@Pc(52) PixelBuffer local52 = this.aClass122_Sub2_Sub1_5.aPixelBuffer1;
		for (@Pc(54) int local54 = 0; local54 < 6; local54++) {
			@Pc(73) int local73 = this.anIDirect3DCubeTexture1.LockRect(local54, 0, 0, 0, this.anInt1832, this.anInt1832, 0, local52);
			if (mo.b(local73, 28658)) {
				@Pc(81) int local81 = local52.getRowPitch();
				if (local81 == this.anInt1832 * 4) {
					local52.b(arg3[local54], 0, 0, this.anInt1832 * this.anInt1832);
				} else {
					for (@Pc(89) int local89 = 0; local89 < this.anInt1832; local89++) {
						local52.b(arg3[local54], local89 * this.anInt1832, local89 * local81, this.anInt1832);
					}
				}
				this.anIDirect3DCubeTexture1.UnlockRect(local54, 0);
			}
		}
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(Lclient!gu;I)V")
	@Override
	public void method7302(@OriginalArg(0) Class113 arg0) {
		super.method7302(arg0);
	}

	@OriginalMember(owner = "client!dj", name = "c", descriptor = "(I)V")
	@Override
	public void method7303() {
		this.aClass122_Sub2_Sub1_5.method3403(this);
	}

	@OriginalMember(owner = "client!dj", name = "d", descriptor = "(I)Lclient!jagdx/IDirect3DBaseTexture;")
	@Override
	public IDirect3DBaseTexture method3590() {
		return this.anIDirect3DCubeTexture1;
	}
}
