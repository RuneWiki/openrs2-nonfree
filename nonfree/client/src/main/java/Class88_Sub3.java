import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DCubeTexture;
import jagdx.PixelBuffer;
import jagdx.ae;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pr")
public final class Class88_Sub3 extends Class88 implements Interface11 {

	@OriginalMember(owner = "client!pr", name = "g", descriptor = "I")
	private final int anInt7281;

	@OriginalMember(owner = "client!pr", name = "f", descriptor = "Lclient!jagdx/IDirect3DCubeTexture;")
	private final IDirect3DCubeTexture anIDirect3DCubeTexture1;

	@OriginalMember(owner = "client!pr", name = "<init>", descriptor = "(Lclient!ega;IZ[[I)V")
	public Class88_Sub3(@OriginalArg(0) Class78_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[][] arg3) {
		super(arg0, Static429.aClass271_12, Static243.aClass172_9, arg2 && arg0.aBoolean181, arg1 * arg1 * 6);
		this.anInt7281 = arg1;
		if (this.aBoolean556) {
			this.anIDirect3DCubeTexture1 = this.aClass78_Sub1_Sub1_7.anIDirect3DDevice1.a(this.anInt7281, 0, 1024, 21, 1);
		} else {
			this.anIDirect3DCubeTexture1 = this.aClass78_Sub1_Sub1_7.anIDirect3DDevice1.a(this.anInt7281, 1, 0, 21, 1);
		}
		@Pc(52) PixelBuffer local52 = this.aClass78_Sub1_Sub1_7.aPixelBuffer1;
		for (@Pc(54) int local54 = 0; local54 < 6; local54++) {
			@Pc(71) int local71 = this.anIDirect3DCubeTexture1.LockRect(local54, 0, 0, 0, this.anInt7281, this.anInt7281, 0, local52);
			if (ae.a((byte) -104, local71)) {
				@Pc(79) int local79 = local52.getRowPitch();
				if (this.anInt7281 * 4 == local79) {
					local52.a((int[]) arg3[local54], 0, 0, this.anInt7281 * this.anInt7281);
				} else {
					for (@Pc(100) int local100 = 0; local100 < this.anInt7281; local100++) {
						local52.a(arg3[local54], this.anInt7281 * local100, local100 * local79, this.anInt7281);
					}
				}
				this.anIDirect3DCubeTexture1.UnlockRect(local54, 0);
			}
		}
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(B)Lclient!jagdx/IDirect3DBaseTexture;")
	@Override
	public IDirect3DBaseTexture method5851() {
		return this.anIDirect3DCubeTexture1;
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(Lclient!dca;B)V")
	@Override
	public void method7298(@OriginalArg(0) Class54 arg0) {
		super.method7298(arg0);
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(Z)V")
	@Override
	public void method7299() {
		this.aClass78_Sub1_Sub1_7.method2130(this);
	}
}
