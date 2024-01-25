import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DTexture;
import jagdx.PixelBuffer;
import jagdx.ud;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nn")
public final class Class135_Sub3 extends Class135 implements Interface7 {

	@OriginalMember(owner = "client!nn", name = "g", descriptor = "Z")
	public boolean aBoolean459;

	@OriginalMember(owner = "client!nn", name = "h", descriptor = "Z")
	public boolean aBoolean460;

	@OriginalMember(owner = "client!nn", name = "i", descriptor = "I")
	private final int anInt6502;

	@OriginalMember(owner = "client!nn", name = "j", descriptor = "I")
	private final int anInt6503;

	@OriginalMember(owner = "client!nn", name = "f", descriptor = "Lclient!jagdx/IDirect3DTexture;")
	private final IDirect3DTexture anIDirect3DTexture1;

	@OriginalMember(owner = "client!nn", name = "<init>", descriptor = "(Lclient!rja;Lclient!sw;Lclient!ig;II)V")
	public Class135_Sub3(@OriginalArg(0) Class13_Sub1_Sub2 arg0, @OriginalArg(1) Class327 arg1, @OriginalArg(2) Class152 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, false, arg4 * arg3);
		if (this.aClass13_Sub1_Sub2_4.aBoolean671) {
			this.anInt6502 = arg3;
			this.anInt6503 = arg4;
		} else {
			this.anInt6502 = Static282.method4521(arg3);
			this.anInt6503 = Static282.method4521(arg4);
		}
		this.anIDirect3DTexture1 = this.aClass13_Sub1_Sub2_4.anIDirect3DDevice1.a(arg3, arg4, 1, 0, Static525.method7553(this.aClass327_15, this.aClass152_18), 1);
	}

	@OriginalMember(owner = "client!nn", name = "<init>", descriptor = "(Lclient!rja;Lclient!sw;IIZ[BII)V")
	public Class135_Sub3(@OriginalArg(0) Class13_Sub1_Sub2 arg0, @OriginalArg(1) Class327 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, Static246.aClass152_10, arg4 && arg0.aBoolean670, arg2 * arg3);
		if (this.aClass13_Sub1_Sub2_4.aBoolean671) {
			this.anInt6502 = arg2;
			this.anInt6503 = arg3;
		} else {
			this.anInt6502 = Static282.method4521(arg2);
			this.anInt6503 = Static282.method4521(arg3);
		}
		if (arg4) {
			this.anIDirect3DTexture1 = this.aClass13_Sub1_Sub2_4.anIDirect3DDevice1.a(this.anInt6502, this.anInt6503, 0, 1024, Static525.method7553(this.aClass327_15, Static246.aClass152_10), 1);
		} else {
			this.anIDirect3DTexture1 = this.aClass13_Sub1_Sub2_4.anIDirect3DDevice1.a(this.anInt6502, this.anInt6503, 1, 0, Static525.method7553(this.aClass327_15, Static246.aClass152_10), 1);
		}
		@Pc(79) PixelBuffer local79 = this.aClass13_Sub1_Sub2_4.aPixelBuffer1;
		@Pc(90) int local90 = this.anIDirect3DTexture1.LockRect(0, 0, 0, arg2, arg3, 0, local79);
		if (ud.a(0, (int) local90)) {
			@Pc(106) int local106 = arg2 * this.aClass327_15.anInt9117;
			@Pc(112) int local112 = arg2 * this.aClass327_15.anInt9117;
			@Pc(115) int local115 = local79.getRowPitch();
			if (local115 == local112 && local106 == local112) {
				local79.a((byte[]) arg5, arg6, 0, local112 * arg3);
			} else {
				for (@Pc(127) int local127 = 0; local127 < arg3; local127++) {
					local79.a(arg5, local106 * local127 + arg6, local127 * local115, local112);
				}
			}
			this.anIDirect3DTexture1.UnlockRect(0);
		}
	}

	@OriginalMember(owner = "client!nn", name = "<init>", descriptor = "(Lclient!rja;IIZ[III)V")
	public Class135_Sub3(@OriginalArg(0) Class13_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, Static419.aClass327_2, Static246.aClass152_10, arg3 && arg0.aBoolean670, arg1 * arg2);
		if (this.aClass13_Sub1_Sub2_4.aBoolean671) {
			this.anInt6502 = arg1;
			this.anInt6503 = arg2;
		} else {
			this.anInt6502 = Static282.method4521(arg1);
			this.anInt6503 = Static282.method4521(arg2);
		}
		if (arg3) {
			this.anIDirect3DTexture1 = this.aClass13_Sub1_Sub2_4.anIDirect3DDevice1.a(this.anInt6502, this.anInt6503, 0, 1024, 21, 1);
		} else {
			this.anIDirect3DTexture1 = this.aClass13_Sub1_Sub2_4.anIDirect3DDevice1.a(this.anInt6502, this.anInt6503, 1, 0, 21, 1);
		}
		@Pc(71) PixelBuffer local71 = this.aClass13_Sub1_Sub2_4.aPixelBuffer1;
		@Pc(82) int local82 = this.anIDirect3DTexture1.LockRect(0, 0, 0, arg1, arg2, 0, local71);
		if (ud.a(0, (int) local82)) {
			if (arg6 == 0) {
				arg6 = arg1;
			}
			@Pc(94) int local94 = local71.getRowPitch();
			if (arg1 * 4 == local94 && arg6 == arg1) {
				local71.a((int[]) arg4, arg5, 0, arg2 * arg1);
			} else {
				for (@Pc(117) int local117 = 0; local117 < arg2; local117++) {
					local71.a(arg4, arg5 + arg6 * local117, local94 * local117, arg1);
				}
			}
			this.anIDirect3DTexture1.UnlockRect(0);
		}
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(IBI[IIIII)V")
	@Override
	public void method5801(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(7) int arg5) {
		if (this.aClass327_15 != Static419.aClass327_2 || this.aClass152_18 != Static246.aClass152_10) {
			throw new RuntimeException();
		}
		@Pc(24) PixelBuffer local24 = this.aClass13_Sub1_Sub2_4.aPixelBuffer1;
		@Pc(35) int local35 = this.anIDirect3DTexture1.LockRect(0, arg5, arg0, arg1, arg4, 0, local24);
		if (!ud.a(0, (int) local35)) {
			return;
		}
		@Pc(43) int local43 = local24.getRowPitch();
		if (arg1 * 4 == local43 && arg3 == arg1) {
			local24.a((int[]) arg2, 0, 0, arg4 * arg1);
		} else {
			for (@Pc(57) int local57 = 0; local57 < arg4; local57++) {
				local24.a(arg2, arg3 * local57, local43 * local57, arg1);
			}
		}
		this.anIDirect3DTexture1.UnlockRect(0);
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(B)I")
	@Override
	public int method5803() {
		return this.anInt6503;
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(ZZI)V")
	@Override
	public void method5805(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean460 = arg1;
		this.aBoolean459 = arg0;
	}

	@OriginalMember(owner = "client!nn", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method5802() {
		return true;
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(Z)I")
	@Override
	public int method5806() {
		return this.anInt6502;
	}

	@OriginalMember(owner = "client!nn", name = "b", descriptor = "(IF)F")
	@Override
	public float method5808(@OriginalArg(1) float arg0) {
		return arg0 / (float) this.anInt6503;
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(I)V")
	@Override
	public void method8138() {
		this.aClass13_Sub1_Sub2_4.method7551(this);
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(Lclient!sw;IIII[BIII)V")
	@Override
	public void method5807(@OriginalArg(0) Class327 arg0, @OriginalArg(4) int arg1, @OriginalArg(5) byte[] arg2, @OriginalArg(7) int arg3, @OriginalArg(8) int arg4) {
		if (this.aClass327_15 != arg0 || Static246.aClass152_10 != this.aClass152_18) {
			throw new RuntimeException();
		}
		@Pc(15) PixelBuffer local15 = this.aClass13_Sub1_Sub2_4.aPixelBuffer1;
		@Pc(30) int local30 = this.anIDirect3DTexture1.LockRect(0, 0, 0, arg1, arg4, 0, local15);
		if (!ud.a(0, (int) local30)) {
			return;
		}
		@Pc(41) int local41 = arg3 * this.aClass327_15.anInt9117;
		@Pc(47) int local47 = arg1 * this.aClass327_15.anInt9117;
		@Pc(50) int local50 = local15.getRowPitch();
		if (local50 == local47 && local41 == local47) {
			local15.a((byte[]) arg2, 0, 0, arg4 * local47);
		} else {
			for (@Pc(66) int local66 = 0; local66 < arg4; local66++) {
				local15.a(arg2, local66 * local41, local50 * local66, local47);
			}
		}
		this.anIDirect3DTexture1.UnlockRect(0);
	}

	@OriginalMember(owner = "client!nn", name = "c", descriptor = "(I)Lclient!jagdx/IDirect3DBaseTexture;")
	@Override
	public IDirect3DBaseTexture method5798() {
		return this.anIDirect3DTexture1;
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(IIII[III)V")
	@Override
	public void method5809(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int[] arg2) {
		if (this.aClass327_15 != Static419.aClass327_2 || this.aClass152_18 != Static246.aClass152_10) {
			throw new RuntimeException();
		}
		@Pc(19) PixelBuffer local19 = this.aClass13_Sub1_Sub2_4.aPixelBuffer1;
		@Pc(30) int local30 = this.anIDirect3DTexture1.LockRect(0, 0, 0, arg1, arg0, 16, local19);
		if (!ud.a(0, (int) local30)) {
			return;
		}
		@Pc(38) int local38 = local19.getRowPitch();
		if (local38 == arg1 * 4) {
			local19.b(arg2, 0, 0, arg2.length);
		} else {
			for (@Pc(57) int local57 = 0; local57 < arg0; local57++) {
				local19.b(arg2, local57 * arg1, local38 * local57, arg1);
			}
		}
		this.anIDirect3DTexture1.UnlockRect(0);
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(IF)F")
	@Override
	public float method5804(@OriginalArg(1) float arg0) {
		return arg0 / (float) this.anInt6502;
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(ILclient!wga;)V")
	@Override
	public void method8137(@OriginalArg(1) Class385 arg0) {
		super.method8137(arg0);
	}
}
