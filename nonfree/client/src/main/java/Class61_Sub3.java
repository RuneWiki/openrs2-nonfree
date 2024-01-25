import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DCubeTexture;
import jagdx.PixelBuffer;
import jagdx.pia;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ve")
public final class Class61_Sub3 extends Class61 implements Interface26 {

	@OriginalMember(owner = "client!ve", name = "f", descriptor = "I")
	private final int anInt10906;

	@OriginalMember(owner = "client!ve", name = "g", descriptor = "Lclient!jagdx/IDirect3DCubeTexture;")
	private final IDirect3DCubeTexture anIDirect3DCubeTexture1;

	@OriginalMember(owner = "client!ve", name = "<init>", descriptor = "(Lclient!lj;IZ[[I)V")
	public Class61_Sub3(@OriginalArg(0) Class101_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[][] arg3) {
		super(arg0, Static584.aClass244_9, Static114.aClass79_7, arg2 && arg0.aBoolean500, arg1 * arg1 * 6);
		this.anInt10906 = arg1;
		if (this.aBoolean785) {
			this.anIDirect3DCubeTexture1 = this.aClass101_Sub1_Sub2_9.anIDirect3DDevice1.a(this.anInt10906, 0, 1024, 21, 1);
		} else {
			this.anIDirect3DCubeTexture1 = this.aClass101_Sub1_Sub2_9.anIDirect3DDevice1.a(this.anInt10906, 1, 0, 21, 1);
		}
		@Pc(52) PixelBuffer local52 = this.aClass101_Sub1_Sub2_9.aPixelBuffer1;
		for (@Pc(54) int local54 = 0; local54 < 6; local54++) {
			@Pc(71) int local71 = this.anIDirect3DCubeTexture1.LockRect(local54, 0, 0, 0, this.anInt10906, this.anInt10906, 0, local52);
			if (pia.a(-2005530600, local71)) {
				@Pc(79) int local79 = local52.getRowPitch();
				if (this.anInt10906 * 4 == local79) {
					local52.a((int[]) arg3[local54], 0, 0, this.anInt10906 * this.anInt10906);
				} else {
					for (@Pc(91) int local91 = 0; local91 < this.anInt10906; local91++) {
						local52.a(arg3[local54], this.anInt10906 * local91, local91 * local79, this.anInt10906);
					}
				}
				this.anIDirect3DCubeTexture1.UnlockRect(local54, 0);
			}
		}
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(ILclient!rha;)V")
	@Override
	public void method9325(@OriginalArg(1) Class315 arg0) {
		super.method9325(arg0);
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(I)V")
	@Override
	public void method9326() {
		this.aClass101_Sub1_Sub2_9.method5972(this);
	}

	@OriginalMember(owner = "client!ve", name = "c", descriptor = "(B)Lclient!jagdx/IDirect3DBaseTexture;")
	@Override
	public IDirect3DBaseTexture method9324() {
		return this.anIDirect3DCubeTexture1;
	}
}
