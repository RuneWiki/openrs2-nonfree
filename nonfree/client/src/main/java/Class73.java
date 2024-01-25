import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ff")
public final class Class73 {

	@OriginalMember(owner = "client!ff", name = "f", descriptor = "Z")
	public boolean aBoolean134 = true;

	@OriginalMember(owner = "client!ff", name = "q", descriptor = "I")
	private int anInt2290 = -1;

	@OriginalMember(owner = "client!ff", name = "g", descriptor = "I")
	private final int anInt2281;

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "Lclient!kd;")
	private final Class39_Sub2 aClass39_Sub2_11;

	@OriginalMember(owner = "client!ff", name = "e", descriptor = "Lclient!er;")
	private final Class67 aClass67_1;

	@OriginalMember(owner = "client!ff", name = "l", descriptor = "I")
	private final int anInt2286;

	@OriginalMember(owner = "client!ff", name = "j", descriptor = "I")
	private final int anInt2284;

	@OriginalMember(owner = "client!ff", name = "m", descriptor = "Lclient!fo;")
	private Class3_Sub2 aClass3_Sub2_3;

	@OriginalMember(owner = "client!ff", name = "b", descriptor = "Lclient!pl;")
	private Interface9 anInterface9_1;

	@OriginalMember(owner = "client!ff", name = "d", descriptor = "Lclient!fj;")
	private Class76_Sub1 aClass76_Sub1_1;

	@OriginalMember(owner = "client!ff", name = "<init>", descriptor = "(Lclient!kd;Lclient!er;Lclient!lk;IIIII)V")
	public Class73(@OriginalArg(0) Class39_Sub2 arg0, @OriginalArg(1) Class67 arg1, @OriginalArg(2) Class149_Sub1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.anInt2281 = arg7;
		this.aClass39_Sub2_11 = arg0;
		this.aClass67_1 = arg1;
		this.anInt2286 = arg6;
		@Pc(25) int local25 = 0x1 << arg5;
		@Pc(27) int local27 = 0;
		@Pc(31) int local31 = arg3 << arg5;
		@Pc(35) int local35 = arg4 << arg5;
		@Pc(50) int local50;
		for (@Pc(37) int local37 = 0; local37 < local25; local37++) {
			@Pc(48) int local48 = local31 + arg2.anInt4317 * (local37 + local35);
			for (local50 = 0; local50 < local25; local50++) {
				@Pc(58) short[] local58 = arg2.aShortArrayArray6[local48++];
				if (local58 != null) {
					local27 += local58.length;
				}
			}
		}
		this.anInt2284 = local27;
		if (local27 <= 0) {
			this.aClass3_Sub2_3 = null;
		} else {
			@Pc(93) Class1_Sub5 local93 = new Class1_Sub5(local27 * 2);
			@Pc(113) int local113;
			@Pc(121) short[] local121;
			@Pc(125) int local125;
			@Pc(111) int local111;
			if (this.aClass39_Sub2_11.aBoolean250) {
				for (local50 = 0; local50 < local25; local50++) {
					local111 = local31 + (local35 + local50) * arg2.anInt4317;
					for (local113 = 0; local113 < local25; local113++) {
						local121 = arg2.aShortArrayArray6[local111++];
						if (local121 != null) {
							for (local125 = 0; local125 < local121.length; local125++) {
								local93.method5393(local121[local125] & 0xFFFF);
							}
						}
					}
				}
			} else {
				for (local50 = 0; local50 < local25; local50++) {
					local111 = local31 + (local50 + local35) * arg2.anInt4317;
					for (local113 = 0; local113 < local25; local113++) {
						local121 = arg2.aShortArrayArray6[local111++];
						if (local121 != null) {
							for (local125 = 0; local125 < local121.length; local125++) {
								local93.method5355(local121[local125] & 0xFFFF);
							}
						}
					}
				}
			}
			this.anInterface9_1 = this.aClass39_Sub2_11.method3235(local93.aByteArray89, false, local93.anInt6475);
			this.aClass76_Sub1_1 = new Class76_Sub1(this.aClass39_Sub2_11, 5123, null, 1);
		}
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(I)V")
	private void method1973() {
		if (!this.aBoolean134) {
			return;
		}
		this.aBoolean134 = false;
		@Pc(16) byte[] local16 = this.aClass67_1.aByteArray45;
		@Pc(20) byte[] local20 = this.aClass39_Sub2_11.aByteArray60;
		@Pc(22) int local22 = 0;
		@Pc(34) int local34 = this.aClass67_1.anInt2139;
		@Pc(44) int local44 = this.anInt2286 + this.anInt2281 * this.aClass67_1.anInt2139;
		@Pc(57) int local57;
		for (@Pc(46) int local46 = -128; local46 < 0; local46++) {
			local22 = (local22 << 8) - local22;
			for (local57 = -128; local57 < 0; local57++) {
				if (local16[local44++] != 0) {
					local22++;
				}
			}
			local44 += local34 - 128;
		}
		if (this.aClass3_Sub2_3 != null && local22 == this.anInt2290) {
			this.aBoolean134 = false;
			return;
		}
		this.anInt2290 = local22;
		local44 = local34 * this.anInt2281 + this.anInt2286;
		local57 = 0;
		for (@Pc(109) int local109 = -128; local109 < 0; local109++) {
			for (@Pc(113) int local113 = -128; local113 < 0; local113++) {
				if (local16[local44] == 0) {
					@Pc(124) int local124 = 0;
					if (local16[local44 - 1] != 0) {
						local124++;
					}
					if (local16[local44 + 1] != 0) {
						local124++;
					}
					if (local16[local44 - local34] != 0) {
						local124++;
					}
					if (local16[local34 + local44] != 0) {
						local124++;
					}
					local20[local57++] = (byte) (local124 * 17);
				} else {
					local20[local57++] = 68;
				}
				local44++;
			}
			local44 += this.aClass67_1.anInt2139 - 128;
		}
		if (this.aClass3_Sub2_3 == null) {
			this.aClass3_Sub2_3 = new Class3_Sub2(this.aClass39_Sub2_11, 3553, 6406, 128, 128, false, this.aClass39_Sub2_11.aByteArray60, 6406, false);
			this.aClass3_Sub2_3.method4163(false, false);
			this.aClass3_Sub2_3.method4146(true);
		} else {
			this.aClass3_Sub2_3.method4158(this.aClass39_Sub2_11.aByteArray60, false, 128, 6406, 128);
		}
	}

	@OriginalMember(owner = "client!ff", name = "b", descriptor = "(I)V")
	public void method1974() {
		this.method1977(this.anInterface9_1, this.anInt2284);
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(III[B)V")
	public void method1975(@OriginalArg(0) int arg0, @OriginalArg(3) byte[] arg1) {
		this.aClass76_Sub1_1.method4692(arg0 * this.aClass39_Sub2_11.method3225(5123), arg1);
		this.method1977(this.aClass76_Sub1_1, arg0);
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lclient!pl;II)V")
	private void method1977(@OriginalArg(0) Interface9 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != 0) {
			this.method1973();
			this.aClass39_Sub2_11.method3203(this.aClass3_Sub2_3);
			this.aClass39_Sub2_11.method3184(arg0, arg1, 0);
		}
	}
}
