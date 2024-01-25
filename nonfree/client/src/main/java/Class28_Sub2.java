import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DCubeTexture;
import jagdx.PixelBuffer;
import jagdx.raa;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cea")
public final class Class28_Sub2 extends Class28 implements Interface18 {

	@OriginalMember(owner = "client!cea", name = "f", descriptor = "I")
	private final int anInt1041;

	@OriginalMember(owner = "client!cea", name = "g", descriptor = "Lclient!jagdx/IDirect3DCubeTexture;")
	private final IDirect3DCubeTexture anIDirect3DCubeTexture1;

	@OriginalMember(owner = "client!cea", name = "<init>", descriptor = "(Lclient!mh;IZ[[I)V")
	public Class28_Sub2(@OriginalArg(0) Class126_Sub2_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[][] arg3) {
		super(arg0, Static208.aClass281_10, Static385.aClass247_14, arg2 && arg0.aBoolean526, arg1 * arg1 * 6);
		this.anInt1041 = arg1;
		if (this.aBoolean579) {
			this.anIDirect3DCubeTexture1 = this.aClass126_Sub2_Sub2_7.anIDirect3DDevice1.a(this.anInt1041, 0, 1024, 21, 1);
		} else {
			this.anIDirect3DCubeTexture1 = this.aClass126_Sub2_Sub2_7.anIDirect3DDevice1.a(this.anInt1041, 1, 0, 21, 1);
		}
		@Pc(52) PixelBuffer local52 = this.aClass126_Sub2_Sub2_7.aPixelBuffer1;
		for (@Pc(54) int local54 = 0; local54 < 6; local54++) {
			@Pc(71) int local71 = this.anIDirect3DCubeTexture1.LockRect(local54, 0, 0, 0, this.anInt1041, this.anInt1041, 0, local52);
			if (raa.a(local71, (byte) 125)) {
				@Pc(79) int local79 = local52.getRowPitch();
				if (local79 == this.anInt1041 * 4) {
					local52.a((int[]) arg3[local54], 0, 0, this.anInt1041 * this.anInt1041);
				} else {
					for (@Pc(100) int local100 = 0; local100 < this.anInt1041; local100++) {
						local52.a(arg3[local54], this.anInt1041 * local100, local79 * local100, this.anInt1041);
					}
				}
				this.anIDirect3DCubeTexture1.UnlockRect(local54, 0);
			}
		}
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(I)V")
	@Override
	public void method7610() {
		this.aClass126_Sub2_Sub2_7.method5587(this);
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(ILclient!kha;)V")
	@Override
	public void method7609(@OriginalArg(1) Class189 arg0) {
		super.method7609(arg0);
	}

	@OriginalMember(owner = "client!cea", name = "b", descriptor = "(I)Lclient!jagdx/IDirect3DBaseTexture;")
	@Override
	public IDirect3DBaseTexture method6206() {
		return this.anIDirect3DCubeTexture1;
	}
}
