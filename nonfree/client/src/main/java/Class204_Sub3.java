import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DCubeTexture;
import jagdx.PixelBuffer;
import jagdx.wu;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sm")
public final class Class204_Sub3 extends Class204 implements Interface8 {

	@OriginalMember(owner = "client!sm", name = "g", descriptor = "I")
	private final int anInt8259;

	@OriginalMember(owner = "client!sm", name = "f", descriptor = "Lclient!jagdx/IDirect3DCubeTexture;")
	private final IDirect3DCubeTexture anIDirect3DCubeTexture1;

	@OriginalMember(owner = "client!sm", name = "<init>", descriptor = "(Lclient!bv;IZ[[I)V")
	public Class204_Sub3(@OriginalArg(0) Class42_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[][] arg3) {
		super(arg0, Static306.aClass72_5, Static155.aClass114_6, arg2 && arg0.aBoolean95, arg1 * 6 * arg1);
		this.anInt8259 = arg1;
		if (this.aBoolean565) {
			this.anIDirect3DCubeTexture1 = this.aClass42_Sub1_Sub1_6.anIDirect3DDevice1.a(this.anInt8259, 0, 1024, 21, 1);
		} else {
			this.anIDirect3DCubeTexture1 = this.aClass42_Sub1_Sub1_6.anIDirect3DDevice1.a(this.anInt8259, 1, 0, 21, 1);
		}
		@Pc(52) PixelBuffer local52 = this.aClass42_Sub1_Sub1_6.aPixelBuffer1;
		for (@Pc(54) int local54 = 0; local54 < 6; local54++) {
			@Pc(73) int local73 = this.anIDirect3DCubeTexture1.LockRect(local54, 0, 0, 0, this.anInt8259, this.anInt8259, 0, local52);
			if (wu.a(local73, (byte) 111)) {
				@Pc(80) int local80 = local52.getRowPitch();
				if (this.anInt8259 * 4 == local80) {
					local52.b(arg3[local54], 0, 0, this.anInt8259 * this.anInt8259);
				} else {
					for (@Pc(101) int local101 = 0; local101 < this.anInt8259; local101++) {
						local52.b(arg3[local54], local101 * this.anInt8259, local80 * local101, this.anInt8259);
					}
				}
				this.anIDirect3DCubeTexture1.UnlockRect(local54, 0);
			}
		}
	}

	@OriginalMember(owner = "client!sm", name = "d", descriptor = "(I)Lclient!jagdx/IDirect3DBaseTexture;")
	@Override
	public IDirect3DBaseTexture method6852() {
		return this.anIDirect3DCubeTexture1;
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(I)V")
	@Override
	public void method6969() {
		this.aClass42_Sub1_Sub1_6.method1343(this);
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(ZLclient!fj;)V")
	@Override
	public void method6968(@OriginalArg(1) Class101 arg0) {
		super.method6968(arg0);
	}
}
