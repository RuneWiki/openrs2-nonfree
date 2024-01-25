import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DCubeTexture;
import jagdx.PixelBuffer;
import jagdx.co;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jia")
public final class Class46_Sub3 extends Class46 implements Interface19 {

	@OriginalMember(owner = "client!jia", name = "f", descriptor = "I")
	private final int anInt5211;

	@OriginalMember(owner = "client!jia", name = "g", descriptor = "Lclient!jagdx/IDirect3DCubeTexture;")
	private final IDirect3DCubeTexture anIDirect3DCubeTexture1;

	@OriginalMember(owner = "client!jia", name = "<init>", descriptor = "(Lclient!fi;IZ[[I)V")
	public Class46_Sub3(@OriginalArg(0) Class100_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[][] arg3) {
		super(arg0, Static203.aClass250_7, Static409.aClass242_13, arg2 && arg0.aBoolean237, arg1 * arg1 * 6);
		this.anInt5211 = arg1;
		if (this.aBoolean356) {
			this.anIDirect3DCubeTexture1 = this.aClass100_Sub1_Sub1_7.anIDirect3DDevice1.a(this.anInt5211, 0, 1024, 21, 1);
		} else {
			this.anIDirect3DCubeTexture1 = this.aClass100_Sub1_Sub1_7.anIDirect3DDevice1.a(this.anInt5211, 1, 0, 21, 1);
		}
		@Pc(52) PixelBuffer local52 = this.aClass100_Sub1_Sub1_7.aPixelBuffer1;
		for (@Pc(54) int local54 = 0; local54 < 6; local54++) {
			@Pc(71) int local71 = this.anIDirect3DCubeTexture1.LockRect(local54, 0, 0, 0, this.anInt5211, this.anInt5211, 0, local52);
			if (co.a((byte) 84, local71)) {
				@Pc(79) int local79 = local52.getRowPitch();
				if (local79 == this.anInt5211 * 4) {
					local52.a((int[]) arg3[local54], 0, 0, this.anInt5211 * this.anInt5211);
				} else {
					for (@Pc(100) int local100 = 0; local100 < this.anInt5211; local100++) {
						local52.a(arg3[local54], local100 * this.anInt5211, local79 * local100, this.anInt5211);
					}
				}
				this.anIDirect3DCubeTexture1.UnlockRect(local54, 0);
			}
		}
	}

	@OriginalMember(owner = "client!jia", name = "a", descriptor = "(I)V")
	@Override
	public void method7826() {
		this.aClass100_Sub1_Sub1_7.method2990(this);
	}

	@OriginalMember(owner = "client!jia", name = "a", descriptor = "(BLclient!ej;)V")
	@Override
	public void method7827(@OriginalArg(1) Class82 arg0) {
		super.method7827(arg0);
	}

	@OriginalMember(owner = "client!jia", name = "c", descriptor = "(B)Lclient!jagdx/IDirect3DBaseTexture;")
	@Override
	public IDirect3DBaseTexture method4660() {
		return this.anIDirect3DCubeTexture1;
	}
}
