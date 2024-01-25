import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DCubeTexture;
import jagdx.PixelBuffer;
import jagdx.lg;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sda")
public final class Class99_Sub3 extends Class99 implements Interface19 {

	@OriginalMember(owner = "client!sda", name = "g", descriptor = "I")
	private final int anInt8345;

	@OriginalMember(owner = "client!sda", name = "f", descriptor = "Lclient!jagdx/IDirect3DCubeTexture;")
	private final IDirect3DCubeTexture anIDirect3DCubeTexture1;

	@OriginalMember(owner = "client!sda", name = "<init>", descriptor = "(Lclient!ul;IZ[[I)V")
	public Class99_Sub3(@OriginalArg(0) Class13_Sub3_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[][] arg3) {
		super(arg0, Static78.aClass104_3, Static638.aClass381_15, arg2 && arg0.aBoolean705, arg1 * arg1 * 6);
		this.anInt8345 = arg1;
		if (this.aBoolean605) {
			this.anIDirect3DCubeTexture1 = this.aClass13_Sub3_Sub2_6.anIDirect3DDevice1.a(this.anInt8345, 0, 1024, 21, 1);
		} else {
			this.anIDirect3DCubeTexture1 = this.aClass13_Sub3_Sub2_6.anIDirect3DDevice1.a(this.anInt8345, 1, 0, 21, 1);
		}
		@Pc(52) PixelBuffer local52 = this.aClass13_Sub3_Sub2_6.aPixelBuffer1;
		for (@Pc(54) int local54 = 0; local54 < 6; local54++) {
			@Pc(71) int local71 = this.anIDirect3DCubeTexture1.LockRect(local54, 0, 0, 0, this.anInt8345, this.anInt8345, 0, local52);
			if (lg.b(local71, 25499)) {
				@Pc(79) int local79 = local52.getRowPitch();
				if (this.anInt8345 * 4 == local79) {
					local52.a((int[]) arg3[local54], 0, 0, this.anInt8345 * this.anInt8345);
				} else {
					for (@Pc(104) int local104 = 0; local104 < this.anInt8345; local104++) {
						local52.a(arg3[local54], this.anInt8345 * local104, local104 * local79, this.anInt8345);
					}
				}
				this.anIDirect3DCubeTexture1.UnlockRect(local54, 0);
			}
		}
	}

	@OriginalMember(owner = "client!sda", name = "a", descriptor = "(ILclient!cg;)V")
	@Override
	public void method8818(@OriginalArg(1) Class54 arg0) {
		super.method8818(arg0);
	}

	@OriginalMember(owner = "client!sda", name = "a", descriptor = "(B)V")
	@Override
	public void method8817() {
		this.aClass13_Sub3_Sub2_6.method8311(this);
	}

	@OriginalMember(owner = "client!sda", name = "d", descriptor = "(I)Lclient!jagdx/IDirect3DBaseTexture;")
	@Override
	public IDirect3DBaseTexture method7187() {
		return this.anIDirect3DCubeTexture1;
	}
}
