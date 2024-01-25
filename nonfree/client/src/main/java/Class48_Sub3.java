import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DTexture;
import jagdx.PixelBuffer;
import jagdx.vq;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rw")
public final class Class48_Sub3 extends Class48 implements Interface24 {

	@OriginalMember(owner = "client!rw", name = "f", descriptor = "Z")
	public boolean aBoolean622;

	@OriginalMember(owner = "client!rw", name = "g", descriptor = "Z")
	public boolean aBoolean623;

	@OriginalMember(owner = "client!rw", name = "j", descriptor = "I")
	private final int anInt8743;

	@OriginalMember(owner = "client!rw", name = "i", descriptor = "I")
	private final int anInt8742;

	@OriginalMember(owner = "client!rw", name = "h", descriptor = "Lclient!jagdx/IDirect3DTexture;")
	private final IDirect3DTexture anIDirect3DTexture1;

	@OriginalMember(owner = "client!rw", name = "<init>", descriptor = "(Lclient!ad;IIZ[III)V")
	public Class48_Sub3(@OriginalArg(0) Class5_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, Static502.aClass182_14, Static637.aClass376_16, arg3 && arg0.aBoolean52, arg2 * arg1);
		if (this.aClass5_Sub1_Sub1_8.aBoolean51) {
			this.anInt8743 = arg2;
			this.anInt8742 = arg1;
		} else {
			this.anInt8742 = Static109.method2234(arg1);
			this.anInt8743 = Static109.method2234(arg2);
		}
		if (arg3) {
			this.anIDirect3DTexture1 = this.aClass5_Sub1_Sub1_8.anIDirect3DDevice1.a(this.anInt8742, this.anInt8743, 0, 1024, 21, 1);
		} else {
			this.anIDirect3DTexture1 = this.aClass5_Sub1_Sub1_8.anIDirect3DDevice1.a(this.anInt8742, this.anInt8743, 1, 0, 21, 1);
		}
		@Pc(71) PixelBuffer local71 = this.aClass5_Sub1_Sub1_8.aPixelBuffer1;
		@Pc(82) int local82 = this.anIDirect3DTexture1.LockRect(0, 0, 0, arg1, arg2, 0, local71);
		if (vq.b(-2005530516, local82)) {
			if (arg6 == 0) {
				arg6 = arg1;
			}
			@Pc(98) int local98 = local71.getRowPitch();
			if (local98 == arg1 * 4 && arg6 == arg1) {
				local71.b(arg4, arg5, 0, arg1 * arg2);
			} else {
				for (@Pc(116) int local116 = 0; local116 < arg2; local116++) {
					local71.b(arg4, arg5 + arg6 * local116, local98 * local116, arg1);
				}
			}
			this.anIDirect3DTexture1.UnlockRect(0);
		}
	}

	@OriginalMember(owner = "client!rw", name = "<init>", descriptor = "(Lclient!ad;Lclient!kca;IIZ[BII)V")
	public Class48_Sub3(@OriginalArg(0) Class5_Sub1_Sub1 arg0, @OriginalArg(1) Class182 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, Static637.aClass376_16, arg4 && arg0.aBoolean52, arg2 * arg3);
		if (this.aClass5_Sub1_Sub1_8.aBoolean51) {
			this.anInt8742 = arg2;
			this.anInt8743 = arg3;
		} else {
			this.anInt8742 = Static109.method2234(arg2);
			this.anInt8743 = Static109.method2234(arg3);
		}
		if (arg4) {
			this.anIDirect3DTexture1 = this.aClass5_Sub1_Sub1_8.anIDirect3DDevice1.a(this.anInt8742, this.anInt8743, 0, 1024, Static6.method647(this.aClass182_15, Static637.aClass376_16), 1);
		} else {
			this.anIDirect3DTexture1 = this.aClass5_Sub1_Sub1_8.anIDirect3DDevice1.a(this.anInt8742, this.anInt8743, 1, 0, Static6.method647(this.aClass182_15, Static637.aClass376_16), 1);
		}
		@Pc(79) PixelBuffer local79 = this.aClass5_Sub1_Sub1_8.aPixelBuffer1;
		@Pc(90) int local90 = this.anIDirect3DTexture1.LockRect(0, 0, 0, arg2, arg3, 0, local79);
		if (vq.b(-2005530516, local90)) {
			@Pc(105) int local105 = arg2 * this.aClass182_15.anInt5127;
			@Pc(111) int local111 = arg2 * this.aClass182_15.anInt5127;
			@Pc(114) int local114 = local79.getRowPitch();
			if (local114 == local111 && local105 == local111) {
				local79.a((byte[]) arg5, arg6, 0, local111 * arg3);
			} else {
				for (@Pc(126) int local126 = 0; local126 < arg3; local126++) {
					local79.a(arg5, arg6 + local126 * local105, local126 * local114, local111);
				}
			}
			this.anIDirect3DTexture1.UnlockRect(0);
		}
	}

	@OriginalMember(owner = "client!rw", name = "<init>", descriptor = "(Lclient!ad;Lclient!kca;Lclient!wq;II)V")
	public Class48_Sub3(@OriginalArg(0) Class5_Sub1_Sub1 arg0, @OriginalArg(1) Class182 arg1, @OriginalArg(2) Class376 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, false, arg3 * arg4);
		if (this.aClass5_Sub1_Sub1_8.aBoolean51) {
			this.anInt8742 = arg3;
			this.anInt8743 = arg4;
		} else {
			this.anInt8742 = Static109.method2234(arg3);
			this.anInt8743 = Static109.method2234(arg4);
		}
		this.anIDirect3DTexture1 = this.aClass5_Sub1_Sub1_8.anIDirect3DDevice1.a(arg3, arg4, 1, 0, Static6.method647(this.aClass182_15, this.aClass376_10), 1);
	}

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(ZIZ)V")
	@Override
	public void method7475(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1) {
		this.aBoolean623 = arg1;
		this.aBoolean622 = arg0;
	}

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(Lclient!kca;[BIIIIIII)V")
	@Override
	public void method7480(@OriginalArg(0) Class182 arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 != this.aClass182_15 || Static637.aClass376_16 != this.aClass376_10) {
			throw new RuntimeException();
		}
		@Pc(15) PixelBuffer local15 = this.aClass5_Sub1_Sub1_8.aPixelBuffer1;
		@Pc(40) int local40 = this.anIDirect3DTexture1.LockRect(0, 0, 0, arg4, arg2, 0, local15);
		if (!vq.b(-2005530516, local40)) {
			return;
		}
		@Pc(50) int local50 = arg4 * this.aClass182_15.anInt5127;
		@Pc(56) int local56 = arg3 * this.aClass182_15.anInt5127;
		@Pc(59) int local59 = local15.getRowPitch();
		if (local50 == local59 && local50 == local56) {
			local15.a((byte[]) arg1, 0, 0, arg2 * local50);
		} else {
			for (@Pc(67) int local67 = 0; local67 < arg2; local67++) {
				local15.a(arg1, local56 * local67, local59 * local67, local50);
			}
		}
		this.anIDirect3DTexture1.UnlockRect(0);
	}

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(B)V")
	@Override
	public void method7474() {
		this.aClass5_Sub1_Sub1_8.method646(this);
	}

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(I)I")
	@Override
	public int method7483() {
		return this.anInt8742;
	}

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "([IIIIBIII)V")
	@Override
	public void method7477(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(7) int arg5) {
		if (Static502.aClass182_14 != this.aClass182_15 || this.aClass376_10 != Static637.aClass376_16) {
			throw new RuntimeException();
		}
		@Pc(16) PixelBuffer local16 = this.aClass5_Sub1_Sub1_8.aPixelBuffer1;
		@Pc(27) int local27 = this.anIDirect3DTexture1.LockRect(0, arg5, arg3, arg1, arg4, 0, local16);
		if (!vq.b(-2005530516, local27)) {
			return;
		}
		@Pc(34) int local34 = local16.getRowPitch();
		if (local34 == arg1 * 4 && arg2 == arg1) {
			local16.b(arg0, 0, 0, arg1 * arg4);
		} else {
			for (@Pc(48) int local48 = 0; local48 < arg4; local48++) {
				local16.b(arg0, arg2 * local48, local48 * local34, arg1);
			}
		}
		this.anIDirect3DTexture1.UnlockRect(0);
	}

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(ZLclient!ui;)V")
	@Override
	public void method7472(@OriginalArg(1) Class339 arg0) {
		super.method7472(arg0);
	}

	@OriginalMember(owner = "client!rw", name = "b", descriptor = "(B)I")
	@Override
	public int method7478() {
		return this.anInt8743;
	}

	@OriginalMember(owner = "client!rw", name = "c", descriptor = "(B)Z")
	@Override
	public boolean method7481() {
		return true;
	}

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(BF)F")
	@Override
	public float method7476(@OriginalArg(1) float arg0) {
		return arg0 / (float) this.anInt8742;
	}

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(FI)F")
	@Override
	public float method7482(@OriginalArg(0) float arg0) {
		return arg0 / (float) this.anInt8743;
	}

	@OriginalMember(owner = "client!rw", name = "d", descriptor = "(B)Lclient!jagdx/IDirect3DBaseTexture;")
	@Override
	public IDirect3DBaseTexture method7473() {
		return this.anIDirect3DTexture1;
	}

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "([IIIIIII)V")
	@Override
	public void method7479(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass182_15 != Static502.aClass182_14 || this.aClass376_10 != Static637.aClass376_16) {
			throw new RuntimeException();
		}
		@Pc(22) PixelBuffer local22 = this.aClass5_Sub1_Sub1_8.aPixelBuffer1;
		@Pc(33) int local33 = this.anIDirect3DTexture1.LockRect(0, 0, 0, arg1, arg2, 16, local22);
		if (!vq.b(-2005530516, local33)) {
			return;
		}
		@Pc(41) int local41 = local22.getRowPitch();
		if (arg1 * 4 == local41) {
			local22.a((int[]) arg0, 0, 0, arg0.length);
		} else {
			for (@Pc(60) int local60 = 0; local60 < arg2; local60++) {
				local22.a(arg0, arg1 * local60, local41 * local60, arg1);
			}
		}
		this.anIDirect3DTexture1.UnlockRect(0);
	}
}
