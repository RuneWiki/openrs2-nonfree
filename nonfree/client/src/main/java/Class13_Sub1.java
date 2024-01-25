import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DTexture;
import jagdx.PixelBuffer;
import jagdx.pp;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aga")
public final class Class13_Sub1 extends Class13 implements Interface2 {

	@OriginalMember(owner = "client!aga", name = "g", descriptor = "Z")
	public boolean aBoolean7;

	@OriginalMember(owner = "client!aga", name = "i", descriptor = "Z")
	public boolean aBoolean8;

	@OriginalMember(owner = "client!aga", name = "f", descriptor = "I")
	private final int anInt87;

	@OriginalMember(owner = "client!aga", name = "j", descriptor = "I")
	private final int anInt88;

	@OriginalMember(owner = "client!aga", name = "h", descriptor = "Lclient!jagdx/IDirect3DTexture;")
	private final IDirect3DTexture anIDirect3DTexture1;

	@OriginalMember(owner = "client!aga", name = "<init>", descriptor = "(Lclient!cu;IIZ[III)V")
	public Class13_Sub1(@OriginalArg(0) Class33_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, Static333.aClass82_9, Static137.aClass89_8, arg3 && arg0.aBoolean187, arg1 * arg2);
		if (this.aClass33_Sub1_Sub2_7.aBoolean186) {
			this.anInt88 = arg2;
			this.anInt87 = arg1;
		} else {
			this.anInt87 = Static95.method2482(arg1);
			this.anInt88 = Static95.method2482(arg2);
		}
		if (arg3) {
			this.anIDirect3DTexture1 = this.aClass33_Sub1_Sub2_7.anIDirect3DDevice1.a(this.anInt87, this.anInt88, 0, 1024, 21, 1);
		} else {
			this.anIDirect3DTexture1 = this.aClass33_Sub1_Sub2_7.anIDirect3DDevice1.a(this.anInt87, this.anInt88, 1, 0, 21, 1);
		}
		@Pc(71) PixelBuffer local71 = this.aClass33_Sub1_Sub2_7.aPixelBuffer1;
		@Pc(82) int local82 = this.anIDirect3DTexture1.LockRect(0, 0, 0, arg1, arg2, 0, local71);
		if (pp.a(false, local82)) {
			if (arg6 == 0) {
				arg6 = arg1;
			}
			@Pc(94) int local94 = local71.getRowPitch();
			if (local94 == arg1 * 4 && arg1 == arg6) {
				local71.b(arg4, arg5, 0, arg1 * arg2);
			} else {
				for (@Pc(108) int local108 = 0; local108 < arg2; local108++) {
					local71.b(arg4, arg5 + arg6 * local108, local94 * local108, arg1);
				}
			}
			this.anIDirect3DTexture1.UnlockRect(0);
		}
	}

	@OriginalMember(owner = "client!aga", name = "<init>", descriptor = "(Lclient!cu;Lclient!em;Lclient!ew;II)V")
	public Class13_Sub1(@OriginalArg(0) Class33_Sub1_Sub2 arg0, @OriginalArg(1) Class82 arg1, @OriginalArg(2) Class89 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, false, arg3 * arg4);
		if (this.aClass33_Sub1_Sub2_7.aBoolean186) {
			this.anInt88 = arg4;
			this.anInt87 = arg3;
		} else {
			this.anInt87 = Static95.method2482(arg3);
			this.anInt88 = Static95.method2482(arg4);
		}
		this.anIDirect3DTexture1 = this.aClass33_Sub1_Sub2_7.anIDirect3DDevice1.a(arg3, arg4, 1, 0, Static80.method2127(this.aClass89_18, this.aClass82_14), 1);
	}

	@OriginalMember(owner = "client!aga", name = "<init>", descriptor = "(Lclient!cu;Lclient!em;IIZ[BII)V")
	public Class13_Sub1(@OriginalArg(0) Class33_Sub1_Sub2 arg0, @OriginalArg(1) Class82 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, Static137.aClass89_8, arg4 && arg0.aBoolean187, arg3 * arg2);
		if (this.aClass33_Sub1_Sub2_7.aBoolean186) {
			this.anInt87 = arg2;
			this.anInt88 = arg3;
		} else {
			this.anInt87 = Static95.method2482(arg2);
			this.anInt88 = Static95.method2482(arg3);
		}
		if (arg4) {
			this.anIDirect3DTexture1 = this.aClass33_Sub1_Sub2_7.anIDirect3DDevice1.a(this.anInt87, this.anInt88, 0, 1024, Static80.method2127(Static137.aClass89_8, this.aClass82_14), 1);
		} else {
			this.anIDirect3DTexture1 = this.aClass33_Sub1_Sub2_7.anIDirect3DDevice1.a(this.anInt87, this.anInt88, 1, 0, Static80.method2127(Static137.aClass89_8, this.aClass82_14), 1);
		}
		@Pc(79) PixelBuffer local79 = this.aClass33_Sub1_Sub2_7.aPixelBuffer1;
		@Pc(90) int local90 = this.anIDirect3DTexture1.LockRect(0, 0, 0, arg2, arg3, 0, local79);
		if (pp.a(false, local90)) {
			@Pc(105) int local105 = arg2 * this.aClass82_14.anInt3195;
			@Pc(111) int local111 = arg2 * this.aClass82_14.anInt3195;
			@Pc(114) int local114 = local79.getRowPitch();
			if (local111 == local114 && local105 == local111) {
				local79.a((byte[]) arg5, arg6, 0, local111 * arg3);
			} else {
				for (@Pc(126) int local126 = 0; local126 < arg3; local126++) {
					local79.a(arg5, arg6 + local126 * local105, local126 * local114, local111);
				}
			}
			this.anIDirect3DTexture1.UnlockRect(0);
		}
	}

	@OriginalMember(owner = "client!aga", name = "b", descriptor = "(I)I")
	@Override
	public int method6507() {
		return this.anInt88;
	}

	@OriginalMember(owner = "client!aga", name = "a", descriptor = "(FZ)F")
	@Override
	public float method6504(@OriginalArg(0) float arg0) {
		return arg0 / (float) this.anInt88;
	}

	@OriginalMember(owner = "client!aga", name = "a", descriptor = "(ZIZ)V")
	@Override
	public void method6506(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1) {
		this.aBoolean7 = arg0;
		this.aBoolean8 = arg1;
	}

	@OriginalMember(owner = "client!aga", name = "a", descriptor = "(FI)F")
	@Override
	public float method6503(@OriginalArg(0) float arg0) {
		return arg0 / (float) this.anInt87;
	}

	@OriginalMember(owner = "client!aga", name = "a", descriptor = "(IBIIII[I)V")
	@Override
	public void method6502(@OriginalArg(0) int arg0, @OriginalArg(5) int arg1, @OriginalArg(6) int[] arg2) {
		if (this.aClass82_14 != Static333.aClass82_9 || Static137.aClass89_8 != this.aClass89_18) {
			throw new RuntimeException();
		}
		@Pc(23) PixelBuffer local23 = this.aClass33_Sub1_Sub2_7.aPixelBuffer1;
		@Pc(34) int local34 = this.anIDirect3DTexture1.LockRect(0, 0, 0, arg1, arg0, 16, local23);
		if (!pp.a(false, local34)) {
			return;
		}
		@Pc(42) int local42 = local23.getRowPitch();
		if (arg1 * 4 == local42) {
			local23.a((int[]) arg2, 0, 0, arg2.length);
		} else {
			for (@Pc(49) int local49 = 0; local49 < arg0; local49++) {
				local23.a(arg2, local49 * arg1, local42 * local49, arg1);
			}
		}
		this.anIDirect3DTexture1.UnlockRect(0);
	}

	@OriginalMember(owner = "client!aga", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method6505() {
		return true;
	}

	@OriginalMember(owner = "client!aga", name = "c", descriptor = "(I)V")
	@Override
	public void method7293() {
		this.aClass33_Sub1_Sub2_7.method2120(this);
	}

	@OriginalMember(owner = "client!aga", name = "a", descriptor = "([BIBIIILclient!em;II)V")
	@Override
	public void method6499(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) Class82 arg3, @OriginalArg(8) int arg4) {
		if (arg3 != this.aClass82_14 || this.aClass89_18 != Static137.aClass89_8) {
			throw new RuntimeException();
		}
		@Pc(23) PixelBuffer local23 = this.aClass33_Sub1_Sub2_7.aPixelBuffer1;
		@Pc(34) int local34 = this.anIDirect3DTexture1.LockRect(0, 0, 0, arg1, arg2, 0, local23);
		if (!pp.a(false, local34)) {
			return;
		}
		@Pc(45) int local45 = arg4 * this.aClass82_14.anInt3195;
		@Pc(51) int local51 = arg1 * this.aClass82_14.anInt3195;
		@Pc(54) int local54 = local23.getRowPitch();
		if (local54 == local51 && local45 == local51) {
			local23.a((byte[]) arg0, 0, 0, local51 * arg2);
		} else {
			for (@Pc(71) int local71 = 0; local71 < arg2; local71++) {
				local23.a(arg0, local45 * local71, local71 * local54, local51);
			}
		}
		this.anIDirect3DTexture1.UnlockRect(0);
	}

	@OriginalMember(owner = "client!aga", name = "a", descriptor = "(I)I")
	@Override
	public int method6501() {
		return this.anInt87;
	}

	@OriginalMember(owner = "client!aga", name = "a", descriptor = "(III[IIIII)V")
	@Override
	public void method6500(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		if (Static333.aClass82_9 != this.aClass82_14 || Static137.aClass89_8 != this.aClass89_18) {
			throw new RuntimeException();
		}
		@Pc(16) PixelBuffer local16 = this.aClass33_Sub1_Sub2_7.aPixelBuffer1;
		@Pc(27) int local27 = this.anIDirect3DTexture1.LockRect(0, arg4, arg2, arg0, arg1, 0, local16);
		if (!pp.a(false, local27)) {
			return;
		}
		@Pc(34) int local34 = local16.getRowPitch();
		if (arg0 * 4 == local34 && arg0 == arg5) {
			local16.b(arg3, 0, 0, arg1 * arg0);
		} else {
			for (@Pc(61) int local61 = 0; local61 < arg1; local61++) {
				local16.b(arg3, local61 * arg5, local34 * local61, arg0);
			}
		}
		this.anIDirect3DTexture1.UnlockRect(0);
	}

	@OriginalMember(owner = "client!aga", name = "d", descriptor = "(I)Lclient!jagdx/IDirect3DBaseTexture;")
	@Override
	public IDirect3DBaseTexture method6679() {
		return this.anIDirect3DTexture1;
	}

	@OriginalMember(owner = "client!aga", name = "a", descriptor = "(Lclient!bba;I)V")
	@Override
	public void method7294(@OriginalArg(0) Class26 arg0) {
		super.method7294(arg0);
	}
}
