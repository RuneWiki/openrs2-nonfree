import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DCubeTexture;
import jagdx.PixelBuffer;
import jagdx.fe;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oc")
public final class Class172_Sub2 extends Class172 implements Interface15 {

	@OriginalMember(owner = "client!oc", name = "f", descriptor = "I")
	private final int anInt6505;

	@OriginalMember(owner = "client!oc", name = "g", descriptor = "Lclient!jagdx/IDirect3DCubeTexture;")
	private final IDirect3DCubeTexture anIDirect3DCubeTexture1;

	@OriginalMember(owner = "client!oc", name = "<init>", descriptor = "(Lclient!de;IZ[[I)V")
	public Class172_Sub2(@OriginalArg(0) Class62_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[][] arg3) {
		super(arg0, Static189.aClass174_6, Static523.aClass306_15, arg2 && arg0.aBoolean137, arg1 * arg1 * 6);
		this.anInt6505 = arg1;
		if (this.aBoolean545) {
			this.anIDirect3DCubeTexture1 = this.aClass62_Sub1_Sub1_8.anIDirect3DDevice1.a(this.anInt6505, 0, 1024, 21, 1);
		} else {
			this.anIDirect3DCubeTexture1 = this.aClass62_Sub1_Sub1_8.anIDirect3DDevice1.a(this.anInt6505, 1, 0, 21, 1);
		}
		@Pc(52) PixelBuffer local52 = this.aClass62_Sub1_Sub1_8.aPixelBuffer1;
		for (@Pc(54) int local54 = 0; local54 < 6; local54++) {
			@Pc(73) int local73 = this.anIDirect3DCubeTexture1.LockRect(local54, 0, 0, 0, this.anInt6505, this.anInt6505, 0, local52);
			if (fe.a((byte) -25, local73)) {
				@Pc(80) int local80 = local52.getRowPitch();
				if (this.anInt6505 * 4 == local80) {
					local52.a((int[]) arg3[local54], 0, 0, this.anInt6505 * this.anInt6505);
				} else {
					for (@Pc(105) int local105 = 0; local105 < this.anInt6505; local105++) {
						local52.a(arg3[local54], this.anInt6505 * local105, local80 * local105, this.anInt6505);
					}
				}
				this.anIDirect3DCubeTexture1.UnlockRect(local54, 0);
			}
		}
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(Lclient!em;I)V")
	@Override
	public void method7438(@OriginalArg(0) Class86 arg0) {
		super.method7438(arg0);
	}

	@OriginalMember(owner = "client!oc", name = "e", descriptor = "(I)Lclient!jagdx/IDirect3DBaseTexture;")
	@Override
	public IDirect3DBaseTexture method6219() {
		return this.anIDirect3DCubeTexture1;
	}

	@OriginalMember(owner = "client!oc", name = "d", descriptor = "(I)V")
	@Override
	public void method7439() {
		this.aClass62_Sub1_Sub1_8.method1936(this);
	}
}
