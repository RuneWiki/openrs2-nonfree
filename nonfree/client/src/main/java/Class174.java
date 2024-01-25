import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jfa")
public final class Class174 {

	@OriginalMember(owner = "client!jfa", name = "h", descriptor = "I")
	private int anInt4683 = -1;

	@OriginalMember(owner = "client!jfa", name = "o", descriptor = "Z")
	public boolean aBoolean294 = true;

	@OriginalMember(owner = "client!jfa", name = "r", descriptor = "I")
	private final int anInt4690;

	@OriginalMember(owner = "client!jfa", name = "c", descriptor = "Lclient!f;")
	private final Class98 aClass98_2;

	@OriginalMember(owner = "client!jfa", name = "s", descriptor = "Lclient!pq;")
	private final Class132_Sub3 aClass132_Sub3_26;

	@OriginalMember(owner = "client!jfa", name = "b", descriptor = "I")
	private final int anInt4680;

	@OriginalMember(owner = "client!jfa", name = "e", descriptor = "I")
	private final int anInt4682;

	@OriginalMember(owner = "client!jfa", name = "g", descriptor = "Lclient!rq;")
	private Class53_Sub2 aClass53_Sub2_3;

	@OriginalMember(owner = "client!jfa", name = "f", descriptor = "Lclient!jda;")
	private Interface14 anInterface14_1;

	@OriginalMember(owner = "client!jfa", name = "m", descriptor = "Lclient!vba;")
	private Class165_Sub2 aClass165_Sub2_1;

	@OriginalMember(owner = "client!jfa", name = "<init>", descriptor = "(Lclient!pq;Lclient!f;Lclient!bda;IIIII)V")
	public Class174(@OriginalArg(0) Class132_Sub3 arg0, @OriginalArg(1) Class98 arg1, @OriginalArg(2) Class12_Sub2 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.anInt4690 = arg6;
		this.aClass98_2 = arg1;
		this.aClass132_Sub3_26 = arg0;
		this.anInt4680 = arg7;
		@Pc(25) int local25 = 0x1 << arg5;
		@Pc(27) int local27 = 0;
		@Pc(31) int local31 = arg3 << arg5;
		@Pc(35) int local35 = arg4 << arg5;
		@Pc(51) int local51;
		for (@Pc(37) int local37 = 0; local37 < local25; local37++) {
			@Pc(49) int local49 = (local35 + local37) * arg2.anInt9314 + local31;
			for (local51 = 0; local51 < local25; local51++) {
				@Pc(59) short[] local59 = arg2.aShortArrayArray2[local49++];
				if (local59 != null) {
					local27 += local59.length;
				}
			}
		}
		this.anInt4682 = local27;
		if (local27 <= 0) {
			this.aClass53_Sub2_3 = null;
		} else {
			@Pc(98) Class6_Sub23 local98 = new Class6_Sub23(local27 * 2);
			@Pc(117) int local117;
			@Pc(125) short[] local125;
			@Pc(129) int local129;
			@Pc(115) int local115;
			if (this.aClass132_Sub3_26.aBoolean544) {
				for (local51 = 0; local51 < local25; local51++) {
					local115 = local31 + arg2.anInt9314 * (local35 + local51);
					for (local117 = 0; local117 < local25; local117++) {
						local125 = arg2.aShortArrayArray2[local115++];
						if (local125 != null) {
							for (local129 = 0; local129 < local125.length; local129++) {
								local98.method8347(local125[local129] & 0xFFFF);
							}
						}
					}
				}
			} else {
				for (local51 = 0; local51 < local25; local51++) {
					local115 = (local51 + local35) * arg2.anInt9314 + local31;
					for (local117 = 0; local117 < local25; local117++) {
						local125 = arg2.aShortArrayArray2[local115++];
						if (local125 != null) {
							for (local129 = 0; local129 < local125.length; local129++) {
								local98.method8335(local125[local129] & 0xFFFF);
							}
						}
					}
				}
			}
			this.anInterface14_1 = this.aClass132_Sub3_26.method6745(local98.anInt9901, local98.aByteArray101, false);
			this.aClass165_Sub2_1 = new Class165_Sub2(this.aClass132_Sub3_26, 5123, (byte[]) null, 1);
		}
	}

	@OriginalMember(owner = "client!jfa", name = "a", descriptor = "(B)V")
	public void method3992() {
		this.method3994(this.anInterface14_1, this.anInt4682);
	}

	@OriginalMember(owner = "client!jfa", name = "a", descriptor = "(Lclient!jda;II)V")
	private void method3994(@OriginalArg(0) Interface14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != 0) {
			this.method3997();
			this.aClass132_Sub3_26.method6759(this.aClass53_Sub2_3);
			this.aClass132_Sub3_26.method6751(arg1, arg0, 0);
		}
	}

	@OriginalMember(owner = "client!jfa", name = "a", descriptor = "(Z)V")
	private void method3997() {
		if (!this.aBoolean294) {
			return;
		}
		this.aBoolean294 = false;
		@Pc(16) byte[] local16 = this.aClass98_2.aByteArray26;
		@Pc(20) byte[] local20 = this.aClass132_Sub3_26.aByteArray85;
		@Pc(22) int local22 = 0;
		@Pc(26) int local26 = this.aClass98_2.anInt2458;
		@Pc(36) int local36 = this.anInt4680 * this.aClass98_2.anInt2458 + this.anInt4690;
		@Pc(48) int local48;
		for (@Pc(38) int local38 = -128; local38 < 0; local38++) {
			local22 = (local22 << 8) - local22;
			for (local48 = -128; local48 < 0; local48++) {
				if (local16[local36++] != 0) {
					local22++;
				}
			}
			local36 += local26 - 128;
		}
		if (this.aClass53_Sub2_3 != null && local22 == this.anInt4683) {
			this.aBoolean294 = false;
			return;
		}
		this.anInt4683 = local22;
		local36 = this.anInt4690 + local26 * this.anInt4680;
		local48 = 0;
		for (@Pc(100) int local100 = -128; local100 < 0; local100++) {
			for (@Pc(104) int local104 = -128; local104 < 0; local104++) {
				if (local16[local36] == 0) {
					@Pc(122) int local122 = 0;
					if (local16[local36 - 1] != 0) {
						local122++;
					}
					if (local16[local36 + 1] != 0) {
						local122++;
					}
					if (local16[local36 - local26] != 0) {
						local122++;
					}
					if (local16[local36 + local26] != 0) {
						local122++;
					}
					local20[local48++] = (byte) (local122 * 17);
				} else {
					local20[local48++] = 68;
				}
				local36++;
			}
			local36 += this.aClass98_2.anInt2458 - 128;
		}
		if (this.aClass53_Sub2_3 == null) {
			this.aClass53_Sub2_3 = new Class53_Sub2(this.aClass132_Sub3_26, 3553, 6406, 128, 128, false, this.aClass132_Sub3_26.aByteArray85, 6406, false);
			this.aClass53_Sub2_3.method3730(false, false);
			this.aClass53_Sub2_3.method8287(true);
		} else {
			this.aClass53_Sub2_3.method3733(false, 128, this.aClass132_Sub3_26.aByteArray85, 128, 6406);
		}
	}

	@OriginalMember(owner = "client!jfa", name = "a", descriptor = "([BIII)V")
	public void method4000(@OriginalArg(0) byte[] arg0, @OriginalArg(3) int arg1) {
		this.aClass165_Sub2_1.method8575(this.aClass132_Sub3_26.method6744(5123) * arg1, arg0);
		this.method3994(this.aClass165_Sub2_1, arg1);
	}
}
