import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DCubeTexture;
import jagdx.PixelBuffer;
import jagdx.ck;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mka")
public final class Class193_Sub2 extends Class193 implements Interface19 {

	@OriginalMember(owner = "client!mka", name = "g", descriptor = "I")
	private final int anInt6313;

	@OriginalMember(owner = "client!mka", name = "f", descriptor = "Lclient!jagdx/IDirect3DCubeTexture;")
	private final IDirect3DCubeTexture anIDirect3DCubeTexture1;

	@OriginalMember(owner = "client!mka", name = "<init>", descriptor = "(Lclient!os;IZ[[I)V")
	public Class193_Sub2(@OriginalArg(0) Class75_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[][] arg3) {
		super(arg0, Static432.aClass155_45, Static435.aClass274_13, arg2 && arg0.aBoolean577, arg1 * 6 * arg1);
		this.anInt6313 = arg1;
		if (this.aBoolean700) {
			this.anIDirect3DCubeTexture1 = this.aClass75_Sub1_Sub2_8.anIDirect3DDevice1.a(this.anInt6313, 0, 1024, 21, 1);
		} else {
			this.anIDirect3DCubeTexture1 = this.aClass75_Sub1_Sub2_8.anIDirect3DDevice1.a(this.anInt6313, 1, 0, 21, 1);
		}
		@Pc(52) PixelBuffer local52 = this.aClass75_Sub1_Sub2_8.aPixelBuffer1;
		for (@Pc(54) int local54 = 0; local54 < 6; local54++) {
			@Pc(73) int local73 = this.anIDirect3DCubeTexture1.LockRect(local54, 0, 0, 0, this.anInt6313, this.anInt6313, 0, local52);
			if (ck.a(local73, -1)) {
				@Pc(80) int local80 = local52.getRowPitch();
				if (local80 == this.anInt6313 * 4) {
					local52.a((int[]) arg3[local54], 0, 0, this.anInt6313 * this.anInt6313);
				} else {
					for (@Pc(106) int local106 = 0; local106 < this.anInt6313; local106++) {
						local52.a(arg3[local54], this.anInt6313 * local106, local106 * local80, this.anInt6313);
					}
				}
				this.anIDirect3DCubeTexture1.UnlockRect(local54, 0);
			}
		}
	}

	@OriginalMember(owner = "client!mka", name = "a", descriptor = "(I)V")
	@Override
	public void method8703() {
		this.aClass75_Sub1_Sub2_8.method6864(this);
	}

	@OriginalMember(owner = "client!mka", name = "a", descriptor = "(Lclient!td;I)V")
	@Override
	public void method8704(@OriginalArg(0) Class338 arg0) {
		super.method8704(arg0);
	}

	@OriginalMember(owner = "client!mka", name = "d", descriptor = "(I)Lclient!jagdx/IDirect3DBaseTexture;")
	@Override
	public IDirect3DBaseTexture method8209() {
		return this.anIDirect3DCubeTexture1;
	}
}
