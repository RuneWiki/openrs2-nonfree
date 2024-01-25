import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qr")
public final class Class173 {

	@OriginalMember(owner = "client!qr", name = "b", descriptor = "Z")
	public boolean aBoolean484 = true;

	@OriginalMember(owner = "client!qr", name = "d", descriptor = "I")
	private int anInt5458 = -1;

	@OriginalMember(owner = "client!qr", name = "j", descriptor = "Lclient!sr;")
	private final Class193 aClass193_2;

	@OriginalMember(owner = "client!qr", name = "g", descriptor = "I")
	private final int anInt5460;

	@OriginalMember(owner = "client!qr", name = "i", descriptor = "Lclient!ql;")
	private final Class92_Sub2 aClass92_Sub2_34;

	@OriginalMember(owner = "client!qr", name = "h", descriptor = "I")
	private final int anInt5461;

	@OriginalMember(owner = "client!qr", name = "f", descriptor = "I")
	private final int anInt5459;

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "Lclient!cl;")
	private Interface3 anInterface3_5;

	@OriginalMember(owner = "client!qr", name = "e", descriptor = "Lclient!jo;")
	private Class70_Sub4 aClass70_Sub4_7;

	@OriginalMember(owner = "client!qr", name = "<init>", descriptor = "(Lclient!ql;Lclient!sr;Lclient!ge;IIIII)V")
	public Class173(@OriginalArg(0) Class92_Sub2 arg0, @OriginalArg(1) Class193 arg1, @OriginalArg(2) Class26_Sub1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aClass193_2 = arg1;
		this.anInt5460 = arg7;
		this.aClass92_Sub2_34 = arg0;
		this.anInt5461 = arg6;
		@Pc(23) int local23 = 0x1 << arg5;
		@Pc(25) int local25 = 0;
		@Pc(29) int local29 = arg3 << arg5;
		@Pc(33) int local33 = arg4 << arg5;
		@Pc(52) int local52;
		@Pc(54) int local54;
		for (@Pc(35) int local35 = 0; local35 < local23; local35++) {
			local52 = local29 + arg2.anInt5941 * (local33 + local35);
			for (local54 = 0; local54 < local23; local54++) {
				@Pc(67) short[] local67 = arg2.aShortArrayArray4[local52++];
				if (local67 != null) {
					local25 += local67.length;
				}
			}
		}
		this.anInt5459 = local25;
		if (local25 > 0) {
			@Pc(94) Class4_Sub7 local94 = new Class4_Sub7(local25 * 2);
			@Pc(127) short[] local127;
			@Pc(133) int local133;
			@Pc(114) int local114;
			if (this.aClass92_Sub2_34.aBoolean459) {
				for (local52 = 0; local52 < local23; local52++) {
					local54 = local29 + (local33 + local52) * arg2.anInt5941;
					for (local114 = 0; local114 < local23; local114++) {
						local127 = arg2.aShortArrayArray4[local54++];
						if (local127 != null) {
							for (local133 = 0; local133 < local127.length; local133++) {
								local94.method2376(local127[local133]);
							}
						}
					}
				}
			} else {
				for (local52 = 0; local52 < local23; local52++) {
					local54 = local29 + (local33 + local52) * arg2.anInt5941;
					for (local114 = 0; local114 < local23; local114++) {
						local127 = arg2.aShortArrayArray4[local54++];
						if (local127 != null) {
							for (local133 = 0; local133 < local127.length; local133++) {
								local94.method2400(local127[local133]);
							}
						}
					}
				}
			}
			this.anInterface3_5 = this.aClass92_Sub2_34.method4589(local94.aByteArray42, local94.anInt2667, false);
		} else {
			this.aClass70_Sub4_7 = null;
		}
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(I)V")
	private void method4650() {
		if (!this.aBoolean484) {
			return;
		}
		this.aBoolean484 = false;
		@Pc(11) byte[] local11 = this.aClass193_2.aByteArray86;
		@Pc(13) byte[] local13 = Static267.aByteArray83;
		@Pc(15) int local15 = 0;
		@Pc(19) int local19 = this.aClass193_2.anInt6007;
		@Pc(30) int local30 = this.anInt5461 + this.aClass193_2.anInt6007 * this.anInt5460;
		@Pc(32) int local32;
		@Pc(43) int local43;
		for (local32 = -128; local32 < 0; local32++) {
			local15 = (local15 << 8) - local15;
			for (local43 = -128; local43 < 0; local43++) {
				if (local11[local30++] != 0) {
					local15++;
				}
			}
			local30 += local19 - 128;
		}
		if (this.aClass70_Sub4_7 != null && this.anInt5458 == local15) {
			this.aBoolean484 = false;
			return;
		}
		this.anInt5458 = local15;
		local30 = this.anInt5460 * local19 + this.anInt5461;
		local32 = 0;
		for (local43 = -128; local43 < 0; local43++) {
			for (@Pc(105) int local105 = -128; local105 < 0; local105++) {
				if (local11[local30] == 0) {
					@Pc(125) int local125 = 0;
					if (local11[local30 - 1] != 0) {
						local125++;
					}
					if (local11[local30 + 1] != 0) {
						local125++;
					}
					if (local11[local30 - local19] != 0) {
						local125++;
					}
					if (local11[local19 + local30] != 0) {
						local125++;
					}
					local13[local32++] = (byte) (local125 * 17);
				} else {
					local13[local32++] = 68;
				}
				local30++;
			}
			local30 += this.aClass193_2.anInt6007 - 128;
		}
		if (this.aClass70_Sub4_7 == null) {
			this.aClass70_Sub4_7 = new Class70_Sub4(this.aClass92_Sub2_34, 3553, 6406, 128, 128, false, Static267.aByteArray83, 6406, false);
			this.aClass70_Sub4_7.method1991(false, false);
			this.aClass70_Sub4_7.method1989(true);
		} else {
			this.aClass70_Sub4_7.method1992(128, 128, Static267.aByteArray83, 6406, false);
		}
	}

	@OriginalMember(owner = "client!qr", name = "b", descriptor = "(I)V")
	public void method4651() {
		this.method4652(this.anInt5459, this.anInterface3_5);
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(BILclient!cl;)V")
	public void method4652(@OriginalArg(1) int arg0, @OriginalArg(2) Interface3 arg1) {
		if (arg0 != 0) {
			this.method4650();
			this.aClass92_Sub2_34.method4548(this.aClass70_Sub4_7);
			this.aClass92_Sub2_34.method4557(arg1, 0, arg0);
		}
	}
}
