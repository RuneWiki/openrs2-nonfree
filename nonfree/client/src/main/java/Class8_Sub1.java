import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DTexture;
import jagdx.PixelBuffer;
import jagdx.oo;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mja")
public final class Class8_Sub1 extends Class8 implements Interface27 {

	@OriginalMember(owner = "client!mja", name = "g", descriptor = "Z")
	public boolean aBoolean594;

	@OriginalMember(owner = "client!mja", name = "i", descriptor = "Z")
	public boolean aBoolean595;

	@OriginalMember(owner = "client!mja", name = "j", descriptor = "I")
	private final int anInt6751;

	@OriginalMember(owner = "client!mja", name = "f", descriptor = "I")
	private final int anInt6750;

	@OriginalMember(owner = "client!mja", name = "h", descriptor = "Lclient!jagdx/IDirect3DTexture;")
	private final IDirect3DTexture anIDirect3DTexture1;

	@OriginalMember(owner = "client!mja", name = "<init>", descriptor = "(Lclient!cka;Lclient!tn;Lclient!ds;II)V")
	public Class8_Sub1(@OriginalArg(0) Class65_Sub2_Sub1 arg0, @OriginalArg(1) Class339 arg1, @OriginalArg(2) Class89 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, false, arg3 * arg4);
		if (this.aClass65_Sub2_Sub1_6.aBoolean164) {
			this.anInt6751 = arg3;
			this.anInt6750 = arg4;
		} else {
			this.anInt6751 = Static67.method917(arg3);
			this.anInt6750 = Static67.method917(arg4);
		}
		this.anIDirect3DTexture1 = this.aClass65_Sub2_Sub1_6.anIDirect3DDevice1.a(arg3, arg4, 1, 0, Static82.method1763(this.aClass89_18, this.aClass339_13), 1);
	}

	@OriginalMember(owner = "client!mja", name = "<init>", descriptor = "(Lclient!cka;Lclient!tn;IIZ[BII)V")
	public Class8_Sub1(@OriginalArg(0) Class65_Sub2_Sub1 arg0, @OriginalArg(1) Class339 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, Static120.aClass89_7, arg4 && arg0.aBoolean166, arg3 * arg2);
		if (this.aClass65_Sub2_Sub1_6.aBoolean164) {
			this.anInt6751 = arg2;
			this.anInt6750 = arg3;
		} else {
			this.anInt6751 = Static67.method917(arg2);
			this.anInt6750 = Static67.method917(arg3);
		}
		if (arg4) {
			this.anIDirect3DTexture1 = this.aClass65_Sub2_Sub1_6.anIDirect3DDevice1.a(this.anInt6751, this.anInt6750, 0, 1024, Static82.method1763(Static120.aClass89_7, this.aClass339_13), 1);
		} else {
			this.anIDirect3DTexture1 = this.aClass65_Sub2_Sub1_6.anIDirect3DDevice1.a(this.anInt6751, this.anInt6750, 1, 0, Static82.method1763(Static120.aClass89_7, this.aClass339_13), 1);
		}
		@Pc(79) PixelBuffer local79 = this.aClass65_Sub2_Sub1_6.aPixelBuffer1;
		@Pc(90) int local90 = this.anIDirect3DTexture1.LockRect(0, 0, 0, arg2, arg3, 0, local79);
		if (oo.a(false, local90)) {
			@Pc(108) int local108 = arg2 * this.aClass339_13.anInt9396;
			@Pc(114) int local114 = arg2 * this.aClass339_13.anInt9396;
			@Pc(117) int local117 = local79.getRowPitch();
			if (local108 == local117 && local108 == local114) {
				local79.a((byte[]) arg5, arg6, 0, arg3 * local108);
			} else {
				for (@Pc(133) int local133 = 0; local133 < arg3; local133++) {
					local79.a(arg5, arg6 + local133 * local114, local133 * local117, local108);
				}
			}
			this.anIDirect3DTexture1.UnlockRect(0);
		}
	}

	@OriginalMember(owner = "client!mja", name = "<init>", descriptor = "(Lclient!cka;IIZ[III)V")
	public Class8_Sub1(@OriginalArg(0) Class65_Sub2_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, Static435.aClass339_15, Static120.aClass89_7, arg3 && arg0.aBoolean166, arg2 * arg1);
		if (this.aClass65_Sub2_Sub1_6.aBoolean164) {
			this.anInt6751 = arg1;
			this.anInt6750 = arg2;
		} else {
			this.anInt6751 = Static67.method917(arg1);
			this.anInt6750 = Static67.method917(arg2);
		}
		if (arg3) {
			this.anIDirect3DTexture1 = this.aClass65_Sub2_Sub1_6.anIDirect3DDevice1.a(this.anInt6751, this.anInt6750, 0, 1024, 21, 1);
		} else {
			this.anIDirect3DTexture1 = this.aClass65_Sub2_Sub1_6.anIDirect3DDevice1.a(this.anInt6751, this.anInt6750, 1, 0, 21, 1);
		}
		@Pc(71) PixelBuffer local71 = this.aClass65_Sub2_Sub1_6.aPixelBuffer1;
		@Pc(82) int local82 = this.anIDirect3DTexture1.LockRect(0, 0, 0, arg1, arg2, 0, local71);
		if (oo.a(false, local82)) {
			if (arg6 == 0) {
				arg6 = arg1;
			}
			@Pc(94) int local94 = local71.getRowPitch();
			if (local94 == arg1 * 4 && arg1 == arg6) {
				local71.b(arg4, arg5, 0, arg1 * arg2);
			} else {
				for (@Pc(104) int local104 = 0; local104 < arg2; local104++) {
					local71.b(arg4, arg5 + local104 * arg6, local94 * local104, arg1);
				}
			}
			this.anIDirect3DTexture1.UnlockRect(0);
		}
	}

	@OriginalMember(owner = "client!mja", name = "c", descriptor = "(I)I")
	@Override
	public int method5625() {
		return this.anInt6750;
	}

	@OriginalMember(owner = "client!mja", name = "a", descriptor = "(ZF)F")
	@Override
	public float method5622(@OriginalArg(1) float arg0) {
		return arg0 / (float) this.anInt6751;
	}

	@OriginalMember(owner = "client!mja", name = "a", descriptor = "(IF)F")
	@Override
	public float method5617(@OriginalArg(1) float arg0) {
		return arg0 / (float) this.anInt6750;
	}

	@OriginalMember(owner = "client!mja", name = "a", descriptor = "(I)I")
	@Override
	public int method5619() {
		return this.anInt6751;
	}

	@OriginalMember(owner = "client!mja", name = "a", descriptor = "([IIIIIII)V")
	@Override
	public void method5623(@OriginalArg(0) int[] arg0, @OriginalArg(4) int arg1, @OriginalArg(6) int arg2) {
		if (Static435.aClass339_15 != this.aClass339_13 || this.aClass89_18 != Static120.aClass89_7) {
			throw new RuntimeException();
		}
		@Pc(24) PixelBuffer local24 = this.aClass65_Sub2_Sub1_6.aPixelBuffer1;
		@Pc(35) int local35 = this.anIDirect3DTexture1.LockRect(0, 0, 0, arg2, arg1, 16, local24);
		if (!oo.a(false, local35)) {
			return;
		}
		@Pc(43) int local43 = local24.getRowPitch();
		if (local43 == arg2 * 4) {
			local24.a((int[]) arg0, 0, 0, arg0.length);
		} else {
			for (@Pc(58) int local58 = 0; local58 < arg1; local58++) {
				local24.a(arg0, local58 * arg2, local43 * local58, arg2);
			}
		}
		this.anIDirect3DTexture1.UnlockRect(0);
	}

	@OriginalMember(owner = "client!mja", name = "b", descriptor = "(B)Lclient!jagdx/IDirect3DBaseTexture;")
	@Override
	public IDirect3DBaseTexture method6358() {
		return this.anIDirect3DTexture1;
	}

	@OriginalMember(owner = "client!mja", name = "a", descriptor = "(ZZI)V")
	@Override
	public void method5618(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean594 = arg1;
		this.aBoolean595 = arg0;
	}

	@OriginalMember(owner = "client!mja", name = "a", descriptor = "(B)V")
	@Override
	public void method7703() {
		this.aClass65_Sub2_Sub1_6.method1753(this);
	}

	@OriginalMember(owner = "client!mja", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method5624() {
		return true;
	}

	@OriginalMember(owner = "client!mja", name = "a", descriptor = "(ILclient!tn;IIBI[BII)V")
	@Override
	public void method5621(@OriginalArg(1) Class339 arg0, @OriginalArg(2) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) byte[] arg3, @OriginalArg(8) int arg4) {
		if (this.aClass339_13 != arg0 || Static120.aClass89_7 != this.aClass89_18) {
			throw new RuntimeException();
		}
		@Pc(24) PixelBuffer local24 = this.aClass65_Sub2_Sub1_6.aPixelBuffer1;
		@Pc(35) int local35 = this.anIDirect3DTexture1.LockRect(0, 0, 0, arg4, arg2, 0, local24);
		if (!oo.a(false, local35)) {
			return;
		}
		@Pc(46) int local46 = arg4 * this.aClass339_13.anInt9396;
		@Pc(52) int local52 = arg1 * this.aClass339_13.anInt9396;
		@Pc(55) int local55 = local24.getRowPitch();
		if (local46 == local55 && local46 == local52) {
			local24.a((byte[]) arg3, 0, 0, local46 * arg2);
		} else {
			for (@Pc(71) int local71 = 0; local71 < arg2; local71++) {
				local24.a(arg3, local71 * local52, local55 * local71, local46);
			}
		}
		this.anIDirect3DTexture1.UnlockRect(0);
	}

	@OriginalMember(owner = "client!mja", name = "a", descriptor = "(BLclient!qt;)V")
	@Override
	public void method7704(@OriginalArg(1) Class294 arg0) {
		super.method7704(arg0);
	}

	@OriginalMember(owner = "client!mja", name = "a", descriptor = "(Z[IIIIIII)V")
	@Override
	public void method5620(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(7) int arg5) {
		if (this.aClass339_13 != Static435.aClass339_15 || this.aClass89_18 != Static120.aClass89_7) {
			throw new RuntimeException();
		}
		@Pc(16) PixelBuffer local16 = this.aClass65_Sub2_Sub1_6.aPixelBuffer1;
		@Pc(27) int local27 = this.anIDirect3DTexture1.LockRect(0, arg1, arg3, arg4, arg2, 0, local16);
		if (!oo.a(false, local27)) {
			return;
		}
		@Pc(35) int local35 = local16.getRowPitch();
		if (arg4 * 4 == local35 && arg4 == arg5) {
			local16.b(arg0, 0, 0, arg4 * arg2);
		} else {
			for (@Pc(54) int local54 = 0; local54 < arg2; local54++) {
				local16.b(arg0, local54 * arg5, local54 * local35, arg4);
			}
		}
		this.anIDirect3DTexture1.UnlockRect(0);
	}
}
