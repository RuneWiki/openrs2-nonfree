import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DCubeTexture;
import jagdx.PixelBuffer;
import jagdx.pda;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bn")
public final class Class38_Sub1 extends Class38 implements Interface7 {

	@OriginalMember(owner = "client!bn", name = "g", descriptor = "I")
	private final int anInt1156;

	@OriginalMember(owner = "client!bn", name = "f", descriptor = "Lclient!jagdx/IDirect3DCubeTexture;")
	private final IDirect3DCubeTexture anIDirect3DCubeTexture1;

	@OriginalMember(owner = "client!bn", name = "<init>", descriptor = "(Lclient!uda;IZ[[I)V")
	public Class38_Sub1(@OriginalArg(0) Class95_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[][] arg3) {
		super(arg0, Static21.aClass122_14, Static666.aClass389_16, arg2 && arg0.aBoolean704, arg1 * arg1 * 6);
		this.anInt1156 = arg1;
		if (this.aBoolean576) {
			this.anIDirect3DCubeTexture1 = this.aClass95_Sub1_Sub2_7.anIDirect3DDevice1.a(this.anInt1156, 0, 1024, 21, 1);
		} else {
			this.anIDirect3DCubeTexture1 = this.aClass95_Sub1_Sub2_7.anIDirect3DDevice1.a(this.anInt1156, 1, 0, 21, 1);
		}
		@Pc(52) PixelBuffer local52 = this.aClass95_Sub1_Sub2_7.aPixelBuffer1;
		for (@Pc(54) int local54 = 0; local54 < 6; local54++) {
			@Pc(71) int local71 = this.anIDirect3DCubeTexture1.LockRect(local54, 0, 0, 0, this.anInt1156, this.anInt1156, 0, local52);
			if (pda.a(local71, 17527)) {
				@Pc(79) int local79 = local52.getRowPitch();
				if (local79 == this.anInt1156 * 4) {
					local52.a((int[]) arg3[local54], 0, 0, this.anInt1156 * this.anInt1156);
				} else {
					for (@Pc(91) int local91 = 0; local91 < this.anInt1156; local91++) {
						local52.a(arg3[local54], this.anInt1156 * local91, local91 * local79, this.anInt1156);
					}
				}
				this.anIDirect3DCubeTexture1.UnlockRect(local54, 0);
			}
		}
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(B)V")
	@Override
	public void method7463() {
		this.aClass95_Sub1_Sub2_7.method8210(this);
	}

	@OriginalMember(owner = "client!bn", name = "b", descriptor = "(Z)Lclient!jagdx/IDirect3DBaseTexture;")
	@Override
	public IDirect3DBaseTexture method6846() {
		return this.anIDirect3DCubeTexture1;
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(BLclient!ag;)V")
	@Override
	public void method7462(@OriginalArg(1) Class8 arg0) {
		super.method7462(arg0);
	}
}
