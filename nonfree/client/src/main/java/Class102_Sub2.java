import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DTexture;
import jagdx.PixelBuffer;
import jagdx.qr;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gt")
public final class Class102_Sub2 extends Class102 implements Interface14 {

	@OriginalMember(owner = "client!gt", name = "g", descriptor = "Z")
	public boolean aBoolean312;

	@OriginalMember(owner = "client!gt", name = "j", descriptor = "Z")
	public boolean aBoolean313;

	@OriginalMember(owner = "client!gt", name = "f", descriptor = "I")
	private final int anInt3776;

	@OriginalMember(owner = "client!gt", name = "h", descriptor = "I")
	private final int anInt3777;

	@OriginalMember(owner = "client!gt", name = "i", descriptor = "Lclient!jagdx/IDirect3DTexture;")
	private final IDirect3DTexture anIDirect3DTexture1;

	@OriginalMember(owner = "client!gt", name = "<init>", descriptor = "(Lclient!gaa;Lclient!ec;IIZ[BII)V")
	public Class102_Sub2(@OriginalArg(0) Class100_Sub1_Sub1 arg0, @OriginalArg(1) Class88 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, Static47.aClass42_4, arg4 && arg0.aBoolean281, arg3 * arg2);
		if (this.aClass100_Sub1_Sub1_8.aBoolean280) {
			this.anInt3776 = arg2;
			this.anInt3777 = arg3;
		} else {
			this.anInt3776 = Static89.method7259(arg2);
			this.anInt3777 = Static89.method7259(arg3);
		}
		if (arg4) {
			this.anIDirect3DTexture1 = this.aClass100_Sub1_Sub1_8.anIDirect3DDevice1.a(this.anInt3776, this.anInt3777, 0, 1024, Static160.method2855(this.aClass88_12, Static47.aClass42_4), 1);
		} else {
			this.anIDirect3DTexture1 = this.aClass100_Sub1_Sub1_8.anIDirect3DDevice1.a(this.anInt3776, this.anInt3777, 1, 0, Static160.method2855(this.aClass88_12, Static47.aClass42_4), 1);
		}
		@Pc(79) PixelBuffer local79 = this.aClass100_Sub1_Sub1_8.aPixelBuffer1;
		@Pc(90) int local90 = this.anIDirect3DTexture1.LockRect(0, 0, 0, arg2, arg3, 0, local79);
		if (qr.a(local90, -2005530519)) {
			@Pc(105) int local105 = arg2 * this.aClass88_12.anInt2256;
			@Pc(111) int local111 = arg2 * this.aClass88_12.anInt2256;
			@Pc(114) int local114 = local79.getRowPitch();
			if (local111 == local114 && local111 == local105) {
				local79.a((byte[]) arg5, arg6, 0, arg3 * local111);
			} else {
				for (@Pc(126) int local126 = 0; local126 < arg3; local126++) {
					local79.a(arg5, arg6 + local126 * local105, local126 * local114, local111);
				}
			}
			this.anIDirect3DTexture1.UnlockRect(0);
		}
	}

	@OriginalMember(owner = "client!gt", name = "<init>", descriptor = "(Lclient!gaa;Lclient!ec;Lclient!bt;II)V")
	public Class102_Sub2(@OriginalArg(0) Class100_Sub1_Sub1 arg0, @OriginalArg(1) Class88 arg1, @OriginalArg(2) Class42 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, false, arg4 * arg3);
		if (this.aClass100_Sub1_Sub1_8.aBoolean280) {
			this.anInt3777 = arg4;
			this.anInt3776 = arg3;
		} else {
			this.anInt3776 = Static89.method7259(arg3);
			this.anInt3777 = Static89.method7259(arg4);
		}
		this.anIDirect3DTexture1 = this.aClass100_Sub1_Sub1_8.anIDirect3DDevice1.a(arg3, arg4, 1, 0, Static160.method2855(this.aClass88_12, this.aClass42_18), 1);
	}

	@OriginalMember(owner = "client!gt", name = "<init>", descriptor = "(Lclient!gaa;IIZ[III)V")
	public Class102_Sub2(@OriginalArg(0) Class100_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, Static356.aClass88_11, Static47.aClass42_4, arg3 && arg0.aBoolean281, arg1 * arg2);
		if (this.aClass100_Sub1_Sub1_8.aBoolean280) {
			this.anInt3776 = arg1;
			this.anInt3777 = arg2;
		} else {
			this.anInt3776 = Static89.method7259(arg1);
			this.anInt3777 = Static89.method7259(arg2);
		}
		if (arg3) {
			this.anIDirect3DTexture1 = this.aClass100_Sub1_Sub1_8.anIDirect3DDevice1.a(this.anInt3776, this.anInt3777, 0, 1024, 21, 1);
		} else {
			this.anIDirect3DTexture1 = this.aClass100_Sub1_Sub1_8.anIDirect3DDevice1.a(this.anInt3776, this.anInt3777, 1, 0, 21, 1);
		}
		@Pc(71) PixelBuffer local71 = this.aClass100_Sub1_Sub1_8.aPixelBuffer1;
		@Pc(82) int local82 = this.anIDirect3DTexture1.LockRect(0, 0, 0, arg1, arg2, 0, local71);
		if (qr.a(local82, -2005530519)) {
			if (arg6 == 0) {
				arg6 = arg1;
			}
			@Pc(98) int local98 = local71.getRowPitch();
			if (local98 == arg1 * 4 && arg1 == arg6) {
				local71.a((int[]) arg4, arg5, 0, arg1 * arg2);
			} else {
				for (@Pc(117) int local117 = 0; local117 < arg2; local117++) {
					local71.a(arg4, arg5 + arg6 * local117, local98 * local117, arg1);
				}
			}
			this.anIDirect3DTexture1.UnlockRect(0);
		}
	}

	@OriginalMember(owner = "client!gt", name = "b", descriptor = "(I)I")
	@Override
	public int method7068() {
		return this.anInt3777;
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(FB)F")
	@Override
	public float method7065(@OriginalArg(0) float arg0) {
		return arg0 / (float) this.anInt3777;
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method7064() {
		return true;
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(IBI[IIIII)V")
	@Override
	public void method7069(@OriginalArg(2) int arg0, @OriginalArg(3) int[] arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		if (Static356.aClass88_11 != this.aClass88_12 || Static47.aClass42_4 != this.aClass42_18) {
			throw new RuntimeException();
		}
		@Pc(16) PixelBuffer local16 = this.aClass100_Sub1_Sub1_8.aPixelBuffer1;
		@Pc(27) int local27 = this.anIDirect3DTexture1.LockRect(0, arg2, arg5, arg3, arg4, 0, local16);
		if (!qr.a(local27, -2005530519)) {
			return;
		}
		@Pc(34) int local34 = local16.getRowPitch();
		if (local34 == arg3 * 4 && arg3 == arg0) {
			local16.a((int[]) arg1, 0, 0, arg4 * arg3);
		} else {
			for (@Pc(44) int local44 = 0; local44 < arg4; local44++) {
				local16.a(arg1, arg0 * local44, local44 * local34, arg3);
			}
		}
		this.anIDirect3DTexture1.UnlockRect(0);
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(Lclient!mv;I)V")
	@Override
	public void method7050(@OriginalArg(0) Class227 arg0) {
		super.method7050(arg0);
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(ZF)F")
	@Override
	public float method7070(@OriginalArg(1) float arg0) {
		return arg0 / (float) this.anInt3776;
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(I[BLclient!ec;IIIIII)V")
	@Override
	public void method7066(@OriginalArg(1) byte[] arg0, @OriginalArg(2) Class88 arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(7) int arg4) {
		if (this.aClass88_12 != arg1 || Static47.aClass42_4 != this.aClass42_18) {
			throw new RuntimeException();
		}
		@Pc(15) PixelBuffer local15 = this.aClass100_Sub1_Sub1_8.aPixelBuffer1;
		@Pc(26) int local26 = this.anIDirect3DTexture1.LockRect(0, 0, 0, arg2, arg4, 0, local15);
		if (!qr.a(local26, -2005530519)) {
			return;
		}
		@Pc(37) int local37 = arg3 * this.aClass88_12.anInt2256;
		@Pc(43) int local43 = arg2 * this.aClass88_12.anInt2256;
		@Pc(46) int local46 = local15.getRowPitch();
		if (local43 == local46 && local37 == local43) {
			local15.a((byte[]) arg0, 0, 0, arg4 * local43);
		} else {
			for (@Pc(62) int local62 = 0; local62 < arg4; local62++) {
				local15.a(arg0, local37 * local62, local62 * local46, local43);
			}
		}
		this.anIDirect3DTexture1.UnlockRect(0);
	}

	@OriginalMember(owner = "client!gt", name = "c", descriptor = "(I)Lclient!jagdx/IDirect3DBaseTexture;")
	@Override
	public IDirect3DBaseTexture method5797() {
		return this.anIDirect3DTexture1;
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(BZZ)V")
	@Override
	public void method7067(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1) {
		this.aBoolean313 = arg0;
		this.aBoolean312 = arg1;
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(B)I")
	@Override
	public int method7063() {
		return this.anInt3776;
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(I)V")
	@Override
	public void method7049() {
		this.aClass100_Sub1_Sub1_8.method2853(this);
	}
}
