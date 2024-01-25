import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DVolumeTexture;
import jagdx.PixelBuffer;
import jagdx.op;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tr")
public final class Class16_Sub2 extends Class16 implements Interface11 {

	@OriginalMember(owner = "client!tr", name = "i", descriptor = "I")
	private final int anInt9143;

	@OriginalMember(owner = "client!tr", name = "h", descriptor = "I")
	private final int anInt9142;

	@OriginalMember(owner = "client!tr", name = "f", descriptor = "I")
	private final int anInt9141;

	@OriginalMember(owner = "client!tr", name = "g", descriptor = "Lclient!jagdx/IDirect3DVolumeTexture;")
	private final IDirect3DVolumeTexture anIDirect3DVolumeTexture1;

	@OriginalMember(owner = "client!tr", name = "<init>", descriptor = "(Lclient!lt;Lclient!kca;III[B)V")
	public Class16_Sub2(@OriginalArg(0) Class87_Sub1_Sub2 arg0, @OriginalArg(1) Class187 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5) {
		super(arg0, arg1, Static545.aClass324_12, false, arg3 * arg2 * arg4);
		this.anInt9143 = arg3;
		this.anInt9142 = arg4;
		this.anInt9141 = arg2;
		this.anIDirect3DVolumeTexture1 = this.aClass87_Sub1_Sub2_9.anIDirect3DDevice1.a(arg2, arg3, arg4, 1, 0, Static332.method5160(this.aClass324_19, arg1), 1);
		@Pc(40) PixelBuffer local40 = this.aClass87_Sub1_Sub2_9.aPixelBuffer1;
		@Pc(53) int local53 = this.anIDirect3DVolumeTexture1.LockBox(0, 0, 0, 0, arg2, arg3, arg4, 0, local40);
		if (op.a(local53, (byte) -104)) {
			@Pc(65) int local65 = this.anInt9141 * this.aClass187_17.anInt5376;
			@Pc(70) int local70 = this.anInt9143 * local65;
			@Pc(73) int local73 = local40.getSlicePitch();
			if (local70 == local73) {
				local40.a((byte[]) arg5, 0, 0, local65 * this.anInt9143 * this.anInt9142);
			} else {
				@Pc(83) int local83 = local40.getRowPitch();
				@Pc(88) int local88;
				if (local83 == local65) {
					for (local88 = 0; local88 < this.anInt9142; local88++) {
						local40.a(arg5, local70 * local88, local88 * local73, local70);
					}
				} else {
					for (local88 = 0; local88 < this.anInt9142; local88++) {
						for (@Pc(113) int local113 = 0; local113 < this.anInt9143; local113++) {
							local40.a(arg5, local88 * local70 + local65 * local113, local73 * local88 - -(local113 * local83), local65);
						}
					}
				}
			}
			this.anIDirect3DVolumeTexture1.UnlockBox(0);
		}
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(B)Lclient!jagdx/IDirect3DBaseTexture;")
	@Override
	public IDirect3DBaseTexture method8047() {
		return this.anIDirect3DVolumeTexture1;
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(I)V")
	@Override
	public void method8048() {
		this.aClass87_Sub1_Sub2_9.method5155(this);
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(Lclient!qt;I)V")
	@Override
	public void method8046(@OriginalArg(0) Class283 arg0) {
		super.method8046(arg0);
	}
}
