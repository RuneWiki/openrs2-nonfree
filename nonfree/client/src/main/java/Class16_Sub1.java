import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DCubeTexture;
import jagdx.PixelBuffer;
import jagdx.op;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pfa")
public final class Class16_Sub1 extends Class16 implements Interface22 {

	@OriginalMember(owner = "client!pfa", name = "g", descriptor = "I")
	private final int anInt7705;

	@OriginalMember(owner = "client!pfa", name = "f", descriptor = "Lclient!jagdx/IDirect3DCubeTexture;")
	private final IDirect3DCubeTexture anIDirect3DCubeTexture1;

	@OriginalMember(owner = "client!pfa", name = "<init>", descriptor = "(Lclient!lt;IZ[[I)V")
	public Class16_Sub1(@OriginalArg(0) Class87_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[][] arg3) {
		super(arg0, Static524.aClass187_15, Static545.aClass324_12, arg2 && arg0.aBoolean468, arg1 * arg1 * 6);
		this.anInt7705 = arg1;
		if (this.aBoolean693) {
			this.anIDirect3DCubeTexture1 = this.aClass87_Sub1_Sub2_9.anIDirect3DDevice1.a(this.anInt7705, 0, 1024, 21, 1);
		} else {
			this.anIDirect3DCubeTexture1 = this.aClass87_Sub1_Sub2_9.anIDirect3DDevice1.a(this.anInt7705, 1, 0, 21, 1);
		}
		@Pc(52) PixelBuffer local52 = this.aClass87_Sub1_Sub2_9.aPixelBuffer1;
		for (@Pc(54) int local54 = 0; local54 < 6; local54++) {
			@Pc(73) int local73 = this.anIDirect3DCubeTexture1.LockRect(local54, 0, 0, 0, this.anInt7705, this.anInt7705, 0, local52);
			if (op.a(local73, (byte) -113)) {
				@Pc(80) int local80 = local52.getRowPitch();
				if (this.anInt7705 * 4 == local80) {
					local52.a((int[]) arg3[local54], 0, 0, this.anInt7705 * this.anInt7705);
				} else {
					for (@Pc(105) int local105 = 0; local105 < this.anInt7705; local105++) {
						local52.a(arg3[local54], local105 * this.anInt7705, local80 * local105, this.anInt7705);
					}
				}
				this.anIDirect3DCubeTexture1.UnlockRect(local54, 0);
			}
		}
	}

	@OriginalMember(owner = "client!pfa", name = "a", descriptor = "(Lclient!qt;I)V")
	@Override
	public void method8046(@OriginalArg(0) Class283 arg0) {
		super.method8046(arg0);
	}

	@OriginalMember(owner = "client!pfa", name = "a", descriptor = "(B)Lclient!jagdx/IDirect3DBaseTexture;")
	@Override
	public IDirect3DBaseTexture method8047() {
		return this.anIDirect3DCubeTexture1;
	}

	@OriginalMember(owner = "client!pfa", name = "a", descriptor = "(I)V")
	@Override
	public void method8048() {
		this.aClass87_Sub1_Sub2_9.method5164(this);
	}
}
