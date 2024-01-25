import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DTexture;
import jagdx.PixelBuffer;
import jagdx.fo;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iw")
public final class Class21_Sub2 extends Class21 implements Interface5 {

	@OriginalMember(owner = "client!iw", name = "f", descriptor = "Z")
	public boolean aBoolean273;

	@OriginalMember(owner = "client!iw", name = "h", descriptor = "Z")
	public boolean aBoolean274;

	@OriginalMember(owner = "client!iw", name = "j", descriptor = "I")
	private final int anInt4446;

	@OriginalMember(owner = "client!iw", name = "i", descriptor = "I")
	private final int anInt4445;

	@OriginalMember(owner = "client!iw", name = "g", descriptor = "Lclient!jagdx/IDirect3DTexture;")
	private final IDirect3DTexture anIDirect3DTexture1;

	@OriginalMember(owner = "client!iw", name = "<init>", descriptor = "(Lclient!wda;Lclient!aq;IIZ[BII)V")
	public Class21_Sub2(@OriginalArg(0) Class9_Sub1_Sub2 arg0, @OriginalArg(1) Class16 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, Static489.aClass289_13, arg4 && arg0.aBoolean645, arg3 * arg2);
		if (this.aClass9_Sub1_Sub2_6.aBoolean644) {
			this.anInt4446 = arg3;
			this.anInt4445 = arg2;
		} else {
			this.anInt4445 = Static117.method2662(arg2);
			this.anInt4446 = Static117.method2662(arg3);
		}
		if (arg4) {
			this.anIDirect3DTexture1 = this.aClass9_Sub1_Sub2_6.anIDirect3DDevice1.a(this.anInt4445, this.anInt4446, 0, 1024, Static532.method7780(Static489.aClass289_13, this.aClass16_18), 1);
		} else {
			this.anIDirect3DTexture1 = this.aClass9_Sub1_Sub2_6.anIDirect3DDevice1.a(this.anInt4445, this.anInt4446, 1, 0, Static532.method7780(Static489.aClass289_13, this.aClass16_18), 1);
		}
		@Pc(79) PixelBuffer local79 = this.aClass9_Sub1_Sub2_6.aPixelBuffer1;
		@Pc(90) int local90 = this.anIDirect3DTexture1.LockRect(0, 0, 0, arg2, arg3, 0, local79);
		if (fo.a(local90, (byte) 124)) {
			@Pc(105) int local105 = arg2 * this.aClass16_18.anInt871;
			@Pc(111) int local111 = arg2 * this.aClass16_18.anInt871;
			@Pc(114) int local114 = local79.getRowPitch();
			if (local114 == local105 && local111 == local105) {
				local79.a((byte[]) arg5, arg6, 0, arg3 * local105);
			} else {
				for (@Pc(135) int local135 = 0; local135 < arg3; local135++) {
					local79.a(arg5, arg6 + local111 * local135, local135 * local114, local105);
				}
			}
			this.anIDirect3DTexture1.UnlockRect(0);
		}
	}

	@OriginalMember(owner = "client!iw", name = "<init>", descriptor = "(Lclient!wda;Lclient!aq;Lclient!ui;II)V")
	public Class21_Sub2(@OriginalArg(0) Class9_Sub1_Sub2 arg0, @OriginalArg(1) Class16 arg1, @OriginalArg(2) Class289 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, false, arg4 * arg3);
		if (this.aClass9_Sub1_Sub2_6.aBoolean644) {
			this.anInt4446 = arg4;
			this.anInt4445 = arg3;
		} else {
			this.anInt4445 = Static117.method2662(arg3);
			this.anInt4446 = Static117.method2662(arg4);
		}
		this.anIDirect3DTexture1 = this.aClass9_Sub1_Sub2_6.anIDirect3DDevice1.a(arg3, arg4, 1, 0, Static532.method7780(this.aClass289_8, this.aClass16_18), 1);
	}

	@OriginalMember(owner = "client!iw", name = "<init>", descriptor = "(Lclient!wda;IIZ[III)V")
	public Class21_Sub2(@OriginalArg(0) Class9_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, Static72.aClass16_3, Static489.aClass289_13, arg3 && arg0.aBoolean645, arg2 * arg1);
		if (this.aClass9_Sub1_Sub2_6.aBoolean644) {
			this.anInt4446 = arg2;
			this.anInt4445 = arg1;
		} else {
			this.anInt4445 = Static117.method2662(arg1);
			this.anInt4446 = Static117.method2662(arg2);
		}
		if (arg3) {
			this.anIDirect3DTexture1 = this.aClass9_Sub1_Sub2_6.anIDirect3DDevice1.a(this.anInt4445, this.anInt4446, 0, 1024, 21, 1);
		} else {
			this.anIDirect3DTexture1 = this.aClass9_Sub1_Sub2_6.anIDirect3DDevice1.a(this.anInt4445, this.anInt4446, 1, 0, 21, 1);
		}
		@Pc(71) PixelBuffer local71 = this.aClass9_Sub1_Sub2_6.aPixelBuffer1;
		@Pc(82) int local82 = this.anIDirect3DTexture1.LockRect(0, 0, 0, arg1, arg2, 0, local71);
		if (fo.a(local82, (byte) 54)) {
			if (arg6 == 0) {
				arg6 = arg1;
			}
			@Pc(97) int local97 = local71.getRowPitch();
			if (local97 == arg1 * 4 && arg6 == arg1) {
				local71.a((int[]) arg4, arg5, 0, arg2 * arg1);
			} else {
				for (@Pc(107) int local107 = 0; local107 < arg2; local107++) {
					local71.a(arg4, local107 * arg6 + arg5, local107 * local97, arg1);
				}
			}
			this.anIDirect3DTexture1.UnlockRect(0);
		}
	}

	@OriginalMember(owner = "client!iw", name = "b", descriptor = "(B)I")
	@Override
	public int method7971() {
		return this.anInt4445;
	}

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "(I)I")
	@Override
	public int method7974() {
		return this.anInt4446;
	}

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "(III[IIIIZ)V")
	@Override
	public void method7968(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static72.aClass16_3 != this.aClass16_18 || this.aClass289_8 != Static489.aClass289_13) {
			throw new RuntimeException();
		}
		@Pc(15) PixelBuffer local15 = this.aClass9_Sub1_Sub2_6.aPixelBuffer1;
		@Pc(26) int local26 = this.anIDirect3DTexture1.LockRect(0, arg4, arg1, arg5, arg0, 0, local15);
		if (!fo.a(local26, (byte) 81)) {
			return;
		}
		@Pc(34) int local34 = local15.getRowPitch();
		if (arg5 * 4 == local34 && arg5 == arg2) {
			local15.a((int[]) arg3, 0, 0, arg5 * arg0);
		} else {
			for (@Pc(52) int local52 = 0; local52 < arg0; local52++) {
				local15.a(arg3, arg2 * local52, local52 * local34, arg5);
			}
		}
		this.anIDirect3DTexture1.UnlockRect(0);
	}

	@OriginalMember(owner = "client!iw", name = "c", descriptor = "(B)V")
	@Override
	public void method7954() {
		this.aClass9_Sub1_Sub2_6.method7782(this);
	}

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "(FI)F")
	@Override
	public float method7970(@OriginalArg(0) float arg0) {
		return arg0 / (float) this.anInt4445;
	}

	@OriginalMember(owner = "client!iw", name = "b", descriptor = "(I)Lclient!jagdx/IDirect3DBaseTexture;")
	@Override
	public IDirect3DBaseTexture method6151() {
		return this.anIDirect3DTexture1;
	}

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "(Lclient!pw;I)V")
	@Override
	public void method7955(@OriginalArg(0) Class234 arg0) {
		super.method7955(arg0);
	}

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "(II[BIIILclient!aq;IB)V")
	@Override
	public void method7973(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(5) int arg2, @OriginalArg(6) Class16 arg3, @OriginalArg(7) int arg4) {
		if (arg3 != this.aClass16_18 || Static489.aClass289_13 != this.aClass289_8) {
			throw new RuntimeException();
		}
		@Pc(24) PixelBuffer local24 = this.aClass9_Sub1_Sub2_6.aPixelBuffer1;
		@Pc(35) int local35 = this.anIDirect3DTexture1.LockRect(0, 0, 0, arg4, arg0, 0, local24);
		if (!fo.a(local35, (byte) 46)) {
			return;
		}
		@Pc(45) int local45 = arg4 * this.aClass16_18.anInt871;
		@Pc(51) int local51 = arg2 * this.aClass16_18.anInt871;
		@Pc(54) int local54 = local24.getRowPitch();
		if (local54 == local45 && local51 == local45) {
			local24.a((byte[]) arg1, 0, 0, local45 * arg0);
		} else {
			for (@Pc(66) int local66 = 0; local66 < arg0; local66++) {
				local24.a(arg1, local66 * local51, local54 * local66, local45);
			}
		}
		this.anIDirect3DTexture1.UnlockRect(0);
	}

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method7969() {
		return true;
	}

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "(FB)F")
	@Override
	public float method7972(@OriginalArg(0) float arg0) {
		return arg0 / (float) this.anInt4446;
	}

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "(ZZZ)V")
	@Override
	public void method7967(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean273 = arg1;
		this.aBoolean274 = arg0;
	}
}
