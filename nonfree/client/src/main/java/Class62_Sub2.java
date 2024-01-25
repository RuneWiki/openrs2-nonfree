import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DCubeTexture;
import jagdx.PixelBuffer;
import jagdx.hl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mh")
public final class Class62_Sub2 extends Class62 implements Interface13 {

	@OriginalMember(owner = "client!mh", name = "f", descriptor = "I")
	private final int anInt6288;

	@OriginalMember(owner = "client!mh", name = "g", descriptor = "Lclient!jagdx/IDirect3DCubeTexture;")
	private final IDirect3DCubeTexture anIDirect3DCubeTexture1;

	@OriginalMember(owner = "client!mh", name = "<init>", descriptor = "(Lclient!kaa;IZ[[I)V")
	public Class62_Sub2(@OriginalArg(0) Class44_Sub2_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[][] arg3) {
		super(arg0, Static7.aClass97_5, Static53.aClass42_4, arg2 && arg0.aBoolean359, arg1 * 6 * arg1);
		this.anInt6288 = arg1;
		if (this.aBoolean694) {
			this.anIDirect3DCubeTexture1 = this.aClass44_Sub2_Sub2_9.anIDirect3DDevice1.a(this.anInt6288, 0, 1024, 21, 1);
		} else {
			this.anIDirect3DCubeTexture1 = this.aClass44_Sub2_Sub2_9.anIDirect3DDevice1.a(this.anInt6288, 1, 0, 21, 1);
		}
		@Pc(52) PixelBuffer local52 = this.aClass44_Sub2_Sub2_9.aPixelBuffer1;
		for (@Pc(54) int local54 = 0; local54 < 6; local54++) {
			@Pc(71) int local71 = this.anIDirect3DCubeTexture1.LockRect(local54, 0, 0, 0, this.anInt6288, this.anInt6288, 0, local52);
			if (hl.a((byte) -37, local71)) {
				@Pc(78) int local78 = local52.getRowPitch();
				if (local78 == this.anInt6288 * 4) {
					local52.b(arg3[local54], 0, 0, this.anInt6288 * this.anInt6288);
				} else {
					for (@Pc(103) int local103 = 0; local103 < this.anInt6288; local103++) {
						local52.b(arg3[local54], this.anInt6288 * local103, local103 * local78, this.anInt6288);
					}
				}
				this.anIDirect3DCubeTexture1.UnlockRect(local54, 0);
			}
		}
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(ILclient!fw;)V")
	@Override
	public void method8268(@OriginalArg(1) Class110 arg0) {
		super.method8268(arg0);
	}

	@OriginalMember(owner = "client!mh", name = "b", descriptor = "(I)V")
	@Override
	public void method8267() {
		this.aClass44_Sub2_Sub2_9.method4381(this);
	}

	@OriginalMember(owner = "client!mh", name = "c", descriptor = "(I)Lclient!jagdx/IDirect3DBaseTexture;")
	@Override
	public IDirect3DBaseTexture method8082() {
		return this.anIDirect3DCubeTexture1;
	}
}
