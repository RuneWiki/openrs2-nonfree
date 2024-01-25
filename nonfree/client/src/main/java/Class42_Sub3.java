import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DTexture;
import jagdx.PixelBuffer;
import jagdx.qi;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tw")
public final class Class42_Sub3 extends Class42 implements Interface17 {

	@OriginalMember(owner = "client!tw", name = "g", descriptor = "Z")
	public boolean aBoolean643;

	@OriginalMember(owner = "client!tw", name = "j", descriptor = "Z")
	public boolean aBoolean644;

	@OriginalMember(owner = "client!tw", name = "f", descriptor = "I")
	private final int anInt8373;

	@OriginalMember(owner = "client!tw", name = "h", descriptor = "I")
	private final int anInt8374;

	@OriginalMember(owner = "client!tw", name = "i", descriptor = "Lclient!jagdx/IDirect3DTexture;")
	private final IDirect3DTexture anIDirect3DTexture1;

	@OriginalMember(owner = "client!tw", name = "<init>", descriptor = "(Lclient!eda;Lclient!sq;Lclient!rt;II)V")
	public Class42_Sub3(@OriginalArg(0) Class45_Sub2_Sub1 arg0, @OriginalArg(1) Class314 arg1, @OriginalArg(2) Class298 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, false, arg4 * arg3);
		if (this.aClass45_Sub2_Sub1_9.aBoolean221) {
			this.anInt8373 = arg3;
			this.anInt8374 = arg4;
		} else {
			this.anInt8373 = Static371.method5424(arg3);
			this.anInt8374 = Static371.method5424(arg4);
		}
		this.anIDirect3DTexture1 = this.aClass45_Sub2_Sub1_9.anIDirect3DDevice1.a(arg3, arg4, 1, 0, Static116.method2411(this.aClass314_21, this.aClass298_20), 1);
	}

	@OriginalMember(owner = "client!tw", name = "<init>", descriptor = "(Lclient!eda;Lclient!sq;IIZ[BII)V")
	public Class42_Sub3(@OriginalArg(0) Class45_Sub2_Sub1 arg0, @OriginalArg(1) Class314 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, Static471.aClass298_15, arg4 && arg0.aBoolean220, arg2 * arg3);
		if (this.aClass45_Sub2_Sub1_9.aBoolean221) {
			this.anInt8373 = arg2;
			this.anInt8374 = arg3;
		} else {
			this.anInt8373 = Static371.method5424(arg2);
			this.anInt8374 = Static371.method5424(arg3);
		}
		if (arg4) {
			this.anIDirect3DTexture1 = this.aClass45_Sub2_Sub1_9.anIDirect3DDevice1.a(this.anInt8373, this.anInt8374, 0, 1024, Static116.method2411(this.aClass314_21, Static471.aClass298_15), 1);
		} else {
			this.anIDirect3DTexture1 = this.aClass45_Sub2_Sub1_9.anIDirect3DDevice1.a(this.anInt8373, this.anInt8374, 1, 0, Static116.method2411(this.aClass314_21, Static471.aClass298_15), 1);
		}
		@Pc(79) PixelBuffer local79 = this.aClass45_Sub2_Sub1_9.aPixelBuffer1;
		@Pc(90) int local90 = this.anIDirect3DTexture1.LockRect(0, 0, 0, arg2, arg3, 0, local79);
		if (qi.a((byte) 35, local90)) {
			@Pc(107) int local107 = arg2 * this.aClass314_21.anInt8032;
			@Pc(113) int local113 = arg2 * this.aClass314_21.anInt8032;
			@Pc(116) int local116 = local79.getRowPitch();
			if (local116 == local113 && local113 == local107) {
				local79.a((byte[]) arg5, arg6, 0, arg3 * local113);
			} else {
				for (@Pc(128) int local128 = 0; local128 < arg3; local128++) {
					local79.a(arg5, arg6 + local107 * local128, local128 * local116, local113);
				}
			}
			this.anIDirect3DTexture1.UnlockRect(0);
		}
	}

	@OriginalMember(owner = "client!tw", name = "<init>", descriptor = "(Lclient!eda;IIZ[III)V")
	public Class42_Sub3(@OriginalArg(0) Class45_Sub2_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, Static469.aClass314_11, Static471.aClass298_15, arg3 && arg0.aBoolean220, arg2 * arg1);
		if (this.aClass45_Sub2_Sub1_9.aBoolean221) {
			this.anInt8373 = arg1;
			this.anInt8374 = arg2;
		} else {
			this.anInt8373 = Static371.method5424(arg1);
			this.anInt8374 = Static371.method5424(arg2);
		}
		if (arg3) {
			this.anIDirect3DTexture1 = this.aClass45_Sub2_Sub1_9.anIDirect3DDevice1.a(this.anInt8373, this.anInt8374, 0, 1024, 21, 1);
		} else {
			this.anIDirect3DTexture1 = this.aClass45_Sub2_Sub1_9.anIDirect3DDevice1.a(this.anInt8373, this.anInt8374, 1, 0, 21, 1);
		}
		@Pc(71) PixelBuffer local71 = this.aClass45_Sub2_Sub1_9.aPixelBuffer1;
		@Pc(82) int local82 = this.anIDirect3DTexture1.LockRect(0, 0, 0, arg1, arg2, 0, local71);
		if (qi.a((byte) 35, local82)) {
			if (arg6 == 0) {
				arg6 = arg1;
			}
			@Pc(98) int local98 = local71.getRowPitch();
			if (local98 == arg1 * 4 && arg6 == arg1) {
				local71.a((int[]) arg4, arg5, 0, arg1 * arg2);
			} else {
				for (@Pc(112) int local112 = 0; local112 < arg2; local112++) {
					local71.a(arg4, local112 * arg6 + arg5, local98 * local112, arg1);
				}
			}
			this.anIDirect3DTexture1.UnlockRect(0);
		}
	}

	@OriginalMember(owner = "client!tw", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method6969() {
		return true;
	}

	@OriginalMember(owner = "client!tw", name = "a", descriptor = "(IIII[IBII)V")
	@Override
	public void method6967(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		if (this.aClass314_21 != Static469.aClass314_11 || this.aClass298_20 != Static471.aClass298_15) {
			throw new RuntimeException();
		}
		@Pc(24) PixelBuffer local24 = this.aClass45_Sub2_Sub1_9.aPixelBuffer1;
		@Pc(35) int local35 = this.anIDirect3DTexture1.LockRect(0, arg5, arg2, arg1, arg4, 0, local24);
		if (!qi.a((byte) 35, local35)) {
			return;
		}
		@Pc(42) int local42 = local24.getRowPitch();
		if (local42 == arg1 * 4 && arg1 == arg0) {
			local24.a((int[]) arg3, 0, 0, arg1 * arg4);
		} else {
			for (@Pc(56) int local56 = 0; local56 < arg4; local56++) {
				local24.a(arg3, local56 * arg0, local56 * local42, arg1);
			}
		}
		this.anIDirect3DTexture1.UnlockRect(0);
	}

	@OriginalMember(owner = "client!tw", name = "a", descriptor = "(ZIZ)V")
	@Override
	public void method6973(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1) {
		this.aBoolean644 = arg1;
		this.aBoolean643 = arg0;
	}

	@OriginalMember(owner = "client!tw", name = "a", descriptor = "(Z)V")
	@Override
	public void method6965() {
		this.aClass45_Sub2_Sub1_9.method2408(this);
	}

	@OriginalMember(owner = "client!tw", name = "b", descriptor = "(I)I")
	@Override
	public int method6968() {
		return this.anInt8374;
	}

	@OriginalMember(owner = "client!tw", name = "a", descriptor = "(I)I")
	@Override
	public int method6966() {
		return this.anInt8373;
	}

	@OriginalMember(owner = "client!tw", name = "a", descriptor = "(II[BIIIILclient!sq;I)V")
	@Override
	public void method6971(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(4) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) Class314 arg4) {
		if (arg4 != this.aClass314_21 || Static471.aClass298_15 != this.aClass298_20) {
			throw new RuntimeException();
		}
		@Pc(20) PixelBuffer local20 = this.aClass45_Sub2_Sub1_9.aPixelBuffer1;
		@Pc(31) int local31 = this.anIDirect3DTexture1.LockRect(0, 0, 0, arg3, arg2, 0, local20);
		if (!qi.a((byte) 35, local31)) {
			return;
		}
		@Pc(42) int local42 = arg0 * this.aClass314_21.anInt8032;
		@Pc(48) int local48 = arg3 * this.aClass314_21.anInt8032;
		@Pc(51) int local51 = local20.getRowPitch();
		if (local51 == local48 && local48 == local42) {
			local20.a((byte[]) arg1, 0, 0, local48 * arg2);
		} else {
			for (@Pc(68) int local68 = 0; local68 < arg2; local68++) {
				local20.a(arg1, local42 * local68, local51 * local68, local48);
			}
		}
		this.anIDirect3DTexture1.UnlockRect(0);
	}

	@OriginalMember(owner = "client!tw", name = "d", descriptor = "(I)Lclient!jagdx/IDirect3DBaseTexture;")
	@Override
	public IDirect3DBaseTexture method6964() {
		return this.anIDirect3DTexture1;
	}

	@OriginalMember(owner = "client!tw", name = "a", descriptor = "(Lclient!dj;B)V")
	@Override
	public void method6963(@OriginalArg(0) Class71 arg0) {
		super.method6963(arg0);
	}

	@OriginalMember(owner = "client!tw", name = "a", descriptor = "(FI)F")
	@Override
	public float method6970(@OriginalArg(0) float arg0) {
		return arg0 / (float) this.anInt8373;
	}

	@OriginalMember(owner = "client!tw", name = "a", descriptor = "(FZ)F")
	@Override
	public float method6972(@OriginalArg(0) float arg0) {
		return arg0 / (float) this.anInt8374;
	}
}
