import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DCubeTexture;
import jagdx.PixelBuffer;
import jagdx.fma;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vu")
public final class Class217_Sub3 extends Class217 implements Interface1 {

	@OriginalMember(owner = "client!vu", name = "f", descriptor = "I")
	private final int anInt10871;

	@OriginalMember(owner = "client!vu", name = "g", descriptor = "Lclient!jagdx/IDirect3DCubeTexture;")
	private final IDirect3DCubeTexture anIDirect3DCubeTexture1;

	@OriginalMember(owner = "client!vu", name = "<init>", descriptor = "(Lclient!tha;IZ[[I)V")
	public Class217_Sub3(@OriginalArg(0) Class22_Sub2_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[][] arg3) {
		super(arg0, Static646.aClass335_14, Static259.aClass167_7, arg2 && arg0.aBoolean645, arg1 * arg1 * 6);
		this.anInt10871 = arg1;
		if (this.aBoolean739) {
			this.anIDirect3DCubeTexture1 = this.aClass22_Sub2_Sub1_9.anIDirect3DDevice1.a(this.anInt10871, 0, 1024, 21, 1);
		} else {
			this.anIDirect3DCubeTexture1 = this.aClass22_Sub2_Sub1_9.anIDirect3DDevice1.a(this.anInt10871, 1, 0, 21, 1);
		}
		@Pc(52) PixelBuffer local52 = this.aClass22_Sub2_Sub1_9.aPixelBuffer1;
		for (@Pc(54) int local54 = 0; local54 < 6; local54++) {
			@Pc(73) int local73 = this.anIDirect3DCubeTexture1.LockRect(local54, 0, 0, 0, this.anInt10871, this.anInt10871, 0, local52);
			if (fma.a(local73, (byte) -76)) {
				@Pc(82) int local82 = local52.getRowPitch();
				if (this.anInt10871 * 4 == local82) {
					local52.b(arg3[local54], 0, 0, this.anInt10871 * this.anInt10871);
				} else {
					for (@Pc(104) int local104 = 0; local104 < this.anInt10871; local104++) {
						local52.b(arg3[local54], this.anInt10871 * local104, local82 * local104, this.anInt10871);
					}
				}
				this.anIDirect3DCubeTexture1.UnlockRect(local54, 0);
			}
		}
	}

	@OriginalMember(owner = "client!vu", name = "b", descriptor = "(I)Lclient!jagdx/IDirect3DBaseTexture;")
	@Override
	public IDirect3DBaseTexture method9228() {
		return this.anIDirect3DCubeTexture1;
	}

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(B)V")
	@Override
	public void method9230() {
		this.aClass22_Sub2_Sub1_9.method8197(this);
	}

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(Lclient!on;B)V")
	@Override
	public void method9229(@OriginalArg(0) Class280 arg0) {
		super.method9229(arg0);
	}
}
