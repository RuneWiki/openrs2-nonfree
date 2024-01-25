import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DTexture;
import jagdx.PixelBuffer;
import jagdx.wu;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!on")
public final class Class204_Sub2 extends Class204 implements Interface20 {

	@OriginalMember(owner = "client!on", name = "f", descriptor = "Z")
	public boolean aBoolean488;

	@OriginalMember(owner = "client!on", name = "h", descriptor = "Z")
	public boolean aBoolean489;

	@OriginalMember(owner = "client!on", name = "j", descriptor = "I")
	private final int anInt6677;

	@OriginalMember(owner = "client!on", name = "g", descriptor = "I")
	private final int anInt6676;

	@OriginalMember(owner = "client!on", name = "i", descriptor = "Lclient!jagdx/IDirect3DTexture;")
	private final IDirect3DTexture anIDirect3DTexture1;

	@OriginalMember(owner = "client!on", name = "<init>", descriptor = "(Lclient!bv;Lclient!dk;IIZ[BII)V")
	public Class204_Sub2(@OriginalArg(0) Class42_Sub1_Sub1 arg0, @OriginalArg(1) Class72 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, Static155.aClass114_6, arg4 && arg0.aBoolean92, arg2 * arg3);
		if (this.aClass42_Sub1_Sub1_6.aBoolean93) {
			this.anInt6677 = arg3;
			this.anInt6676 = arg2;
		} else {
			this.anInt6676 = Static37.method6277(arg2);
			this.anInt6677 = Static37.method6277(arg3);
		}
		if (arg4) {
			this.anIDirect3DTexture1 = this.aClass42_Sub1_Sub1_6.anIDirect3DDevice1.a(this.anInt6676, this.anInt6677, 0, 1024, Static50.method1347(Static155.aClass114_6, this.aClass72_13), 1);
		} else {
			this.anIDirect3DTexture1 = this.aClass42_Sub1_Sub1_6.anIDirect3DDevice1.a(this.anInt6676, this.anInt6677, 1, 0, Static50.method1347(Static155.aClass114_6, this.aClass72_13), 1);
		}
		@Pc(79) PixelBuffer local79 = this.aClass42_Sub1_Sub1_6.aPixelBuffer1;
		@Pc(90) int local90 = this.anIDirect3DTexture1.LockRect(0, 0, 0, arg2, arg3, 0, local79);
		if (wu.a(local90, (byte) -108)) {
			@Pc(108) int local108 = arg2 * this.aClass72_13.anInt2163;
			@Pc(114) int local114 = arg2 * this.aClass72_13.anInt2163;
			@Pc(117) int local117 = local79.getRowPitch();
			if (local117 == local114 && local114 == local108) {
				local79.a((byte[]) arg5, arg6, 0, arg3 * local114);
			} else {
				for (@Pc(138) int local138 = 0; local138 < arg3; local138++) {
					local79.a(arg5, local108 * local138 + arg6, local117 * local138, local114);
				}
			}
			this.anIDirect3DTexture1.UnlockRect(0);
		}
	}

	@OriginalMember(owner = "client!on", name = "<init>", descriptor = "(Lclient!bv;Lclient!dk;Lclient!ge;II)V")
	public Class204_Sub2(@OriginalArg(0) Class42_Sub1_Sub1 arg0, @OriginalArg(1) Class72 arg1, @OriginalArg(2) Class114 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, false, arg4 * arg3);
		if (this.aClass42_Sub1_Sub1_6.aBoolean93) {
			this.anInt6676 = arg3;
			this.anInt6677 = arg4;
		} else {
			this.anInt6676 = Static37.method6277(arg3);
			this.anInt6677 = Static37.method6277(arg4);
		}
		this.anIDirect3DTexture1 = this.aClass42_Sub1_Sub1_6.anIDirect3DDevice1.a(arg3, arg4, 1, 0, Static50.method1347(this.aClass114_17, this.aClass72_13), 1);
	}

	@OriginalMember(owner = "client!on", name = "<init>", descriptor = "(Lclient!bv;IIZ[III)V")
	public Class204_Sub2(@OriginalArg(0) Class42_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, Static306.aClass72_5, Static155.aClass114_6, arg3 && arg0.aBoolean92, arg1 * arg2);
		if (this.aClass42_Sub1_Sub1_6.aBoolean93) {
			this.anInt6676 = arg1;
			this.anInt6677 = arg2;
		} else {
			this.anInt6676 = Static37.method6277(arg1);
			this.anInt6677 = Static37.method6277(arg2);
		}
		if (arg3) {
			this.anIDirect3DTexture1 = this.aClass42_Sub1_Sub1_6.anIDirect3DDevice1.a(this.anInt6676, this.anInt6677, 0, 1024, 21, 1);
		} else {
			this.anIDirect3DTexture1 = this.aClass42_Sub1_Sub1_6.anIDirect3DDevice1.a(this.anInt6676, this.anInt6677, 1, 0, 21, 1);
		}
		@Pc(71) PixelBuffer local71 = this.aClass42_Sub1_Sub1_6.aPixelBuffer1;
		@Pc(82) int local82 = this.anIDirect3DTexture1.LockRect(0, 0, 0, arg1, arg2, 0, local71);
		if (wu.a(local82, (byte) -83)) {
			if (arg6 == 0) {
				arg6 = arg1;
			}
			@Pc(97) int local97 = local71.getRowPitch();
			if (local97 == arg1 * 4 && arg1 == arg6) {
				local71.b(arg4, arg5, 0, arg2 * arg1);
			} else {
				for (@Pc(107) int local107 = 0; local107 < arg2; local107++) {
					local71.b(arg4, arg6 * local107 + arg5, local97 * local107, arg1);
				}
			}
			this.anIDirect3DTexture1.UnlockRect(0);
		}
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(Z)I")
	@Override
	public int method6981() {
		return this.anInt6677;
	}

	@OriginalMember(owner = "client!on", name = "c", descriptor = "(I)I")
	@Override
	public int method6985() {
		return this.anInt6676;
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "([BIILclient!dk;IIIII)V")
	@Override
	public void method6983(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class72 arg3, @OriginalArg(4) int arg4) {
		if (arg3 != this.aClass72_13 || this.aClass114_17 != Static155.aClass114_6) {
			throw new RuntimeException();
		}
		@Pc(16) PixelBuffer local16 = this.aClass42_Sub1_Sub1_6.aPixelBuffer1;
		@Pc(27) int local27 = this.anIDirect3DTexture1.LockRect(0, 0, 0, arg4, arg1, 0, local16);
		if (!wu.a(local27, (byte) 81)) {
			return;
		}
		@Pc(38) int local38 = arg4 * this.aClass72_13.anInt2163;
		@Pc(44) int local44 = arg2 * this.aClass72_13.anInt2163;
		@Pc(47) int local47 = local16.getRowPitch();
		if (local38 == local47 && local38 == local44) {
			local16.a((byte[]) arg0, 0, 0, arg1 * local38);
		} else {
			for (@Pc(63) int local63 = 0; local63 < arg1; local63++) {
				local16.a(arg0, local44 * local63, local63 * local47, local38);
			}
		}
		this.anIDirect3DTexture1.UnlockRect(0);
	}

	@OriginalMember(owner = "client!on", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method6982() {
		return true;
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(I)V")
	@Override
	public void method6969() {
		this.aClass42_Sub1_Sub1_6.method1350(this);
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(ZZI)V")
	@Override
	public void method6988(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean489 = arg0;
		this.aBoolean488 = arg1;
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "([IIIBIIII)V")
	@Override
	public void method6986(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(7) int arg5) {
		if (Static306.aClass72_5 != this.aClass72_13 || Static155.aClass114_6 != this.aClass114_17) {
			throw new RuntimeException();
		}
		@Pc(21) PixelBuffer local21 = this.aClass42_Sub1_Sub1_6.aPixelBuffer1;
		@Pc(32) int local32 = this.anIDirect3DTexture1.LockRect(0, arg5, arg2, arg3, arg4, 0, local21);
		if (!wu.a(local32, (byte) 105)) {
			return;
		}
		@Pc(40) int local40 = local21.getRowPitch();
		if (local40 == arg3 * 4 && arg1 == arg3) {
			local21.b(arg0, 0, 0, arg3 * arg4);
		} else {
			for (@Pc(67) int local67 = 0; local67 < arg4; local67++) {
				local21.b(arg0, local67 * arg1, local40 * local67, arg3);
			}
		}
		this.anIDirect3DTexture1.UnlockRect(0);
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(ZLclient!fj;)V")
	@Override
	public void method6968(@OriginalArg(1) Class101 arg0) {
		super.method6968(arg0);
	}

	@OriginalMember(owner = "client!on", name = "d", descriptor = "(I)Lclient!jagdx/IDirect3DBaseTexture;")
	@Override
	public IDirect3DBaseTexture method6852() {
		return this.anIDirect3DTexture1;
	}

	@OriginalMember(owner = "client!on", name = "b", descriptor = "(IF)F")
	@Override
	public float method6987(@OriginalArg(1) float arg0) {
		return arg0 / (float) this.anInt6676;
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(IF)F")
	@Override
	public float method6984(@OriginalArg(1) float arg0) {
		return arg0 / (float) this.anInt6677;
	}
}
