import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DCubeTexture;
import jagdx.PixelBuffer;
import jagdx.uo;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tq")
public final class Class77_Sub3 extends Class77 implements Interface18 {

	@OriginalMember(owner = "client!tq", name = "f", descriptor = "I")
	private final int anInt9576;

	@OriginalMember(owner = "client!tq", name = "g", descriptor = "Lclient!jagdx/IDirect3DCubeTexture;")
	private final IDirect3DCubeTexture anIDirect3DCubeTexture1;

	@OriginalMember(owner = "client!tq", name = "<init>", descriptor = "(Lclient!wu;IZ[[I)V")
	public Class77_Sub3(@OriginalArg(0) Class145_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[][] arg3) {
		super(arg0, Static165.aClass295_6, Static243.aClass158_10, arg2 && arg0.aBoolean966, arg1 * 6 * arg1);
		this.anInt9576 = arg1;
		if (this.aBoolean823) {
			this.anIDirect3DCubeTexture1 = this.aClass145_Sub1_Sub2_9.anIDirect3DDevice1.a(this.anInt9576, 0, 1024, 21, 1);
		} else {
			this.anIDirect3DCubeTexture1 = this.aClass145_Sub1_Sub2_9.anIDirect3DDevice1.a(this.anInt9576, 1, 0, 21, 1);
		}
		@Pc(52) PixelBuffer local52 = this.aClass145_Sub1_Sub2_9.aPixelBuffer1;
		for (@Pc(54) int local54 = 0; local54 < 6; local54++) {
			@Pc(71) int local71 = this.anIDirect3DCubeTexture1.LockRect(local54, 0, 0, 0, this.anInt9576, this.anInt9576, 0, local52);
			if (uo.a(local71, true)) {
				@Pc(78) int local78 = local52.getRowPitch();
				if (local78 == this.anInt9576 * 4) {
					local52.a((int[]) arg3[local54], 0, 0, this.anInt9576 * this.anInt9576);
				} else {
					for (@Pc(104) int local104 = 0; local104 < this.anInt9576; local104++) {
						local52.a(arg3[local54], this.anInt9576 * local104, local78 * local104, this.anInt9576);
					}
				}
				this.anIDirect3DCubeTexture1.UnlockRect(local54, 0);
			}
		}
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(Lclient!wh;Z)V")
	@Override
	public void method8448(@OriginalArg(0) Class400 arg0) {
		super.method8448(arg0);
	}

	@OriginalMember(owner = "client!tq", name = "c", descriptor = "(I)Lclient!jagdx/IDirect3DBaseTexture;")
	@Override
	public IDirect3DBaseTexture method8447() {
		return this.anIDirect3DCubeTexture1;
	}

	@OriginalMember(owner = "client!tq", name = "b", descriptor = "(I)V")
	@Override
	public void method8449() {
		this.aClass145_Sub1_Sub2_9.method9865(this);
	}
}
