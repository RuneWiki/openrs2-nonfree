import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!df")
public final class Class60 {

	@OriginalMember(owner = "client!df", name = "j", descriptor = "Z")
	public boolean aBoolean216 = true;

	@OriginalMember(owner = "client!df", name = "p", descriptor = "I")
	private int anInt2735 = -1;

	@OriginalMember(owner = "client!df", name = "f", descriptor = "I")
	private final int anInt2728;

	@OriginalMember(owner = "client!df", name = "n", descriptor = "I")
	private final int anInt2733;

	@OriginalMember(owner = "client!df", name = "l", descriptor = "Lclient!ac;")
	private final Class5_Sub1 aClass5_Sub1_12;

	@OriginalMember(owner = "client!df", name = "e", descriptor = "Lclient!cg;")
	private final Class47 aClass47_1;

	@OriginalMember(owner = "client!df", name = "k", descriptor = "I")
	private final int anInt2731;

	@OriginalMember(owner = "client!df", name = "b", descriptor = "Lclient!dw;")
	private Interface9 anInterface9_2;

	@OriginalMember(owner = "client!df", name = "a", descriptor = "Lclient!qs;")
	private Class170_Sub1 aClass170_Sub1_1;

	@OriginalMember(owner = "client!df", name = "i", descriptor = "Lclient!aaa;")
	private Class2_Sub1 aClass2_Sub1_4;

	@OriginalMember(owner = "client!df", name = "<init>", descriptor = "(Lclient!ac;Lclient!cg;Lclient!ok;IIIII)V")
	public Class60(@OriginalArg(0) Class5_Sub1 arg0, @OriginalArg(1) Class47 arg1, @OriginalArg(2) Class245_Sub1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.anInt2728 = arg6;
		this.anInt2733 = arg7;
		this.aClass5_Sub1_12 = arg0;
		this.aClass47_1 = arg1;
		@Pc(25) int local25 = 0x1 << arg5;
		@Pc(27) int local27 = 0;
		@Pc(31) int local31 = arg3 << arg5;
		@Pc(35) int local35 = arg4 << arg5;
		@Pc(50) int local50;
		for (@Pc(37) int local37 = 0; local37 < local25; local37++) {
			@Pc(48) int local48 = arg2.anInt9289 * (local37 + local35) + local31;
			for (local50 = 0; local50 < local25; local50++) {
				@Pc(58) short[] local58 = arg2.aShortArrayArray24[local48++];
				if (local58 != null) {
					local27 += local58.length;
				}
			}
		}
		this.anInt2731 = local27;
		if (local27 <= 0) {
			this.aClass2_Sub1_4 = null;
		} else {
			@Pc(92) Class6_Sub8 local92 = new Class6_Sub8(local27 * 2);
			@Pc(111) int local111;
			@Pc(119) short[] local119;
			@Pc(123) int local123;
			@Pc(109) int local109;
			if (this.aClass5_Sub1_12.aBoolean24) {
				for (local50 = 0; local50 < local25; local50++) {
					local109 = local31 + arg2.anInt9289 * (local50 + local35);
					for (local111 = 0; local111 < local25; local111++) {
						local119 = arg2.aShortArrayArray24[local109++];
						if (local119 != null) {
							for (local123 = 0; local123 < local119.length; local123++) {
								local92.method8241(local119[local123] & 0xFFFF);
							}
						}
					}
				}
			} else {
				for (local50 = 0; local50 < local25; local50++) {
					local109 = local31 + arg2.anInt9289 * (local50 + local35);
					for (local111 = 0; local111 < local25; local111++) {
						local119 = arg2.aShortArrayArray24[local109++];
						if (local119 != null) {
							for (local123 = 0; local123 < local119.length; local123++) {
								local92.method8264(local119[local123] & 0xFFFF);
							}
						}
					}
				}
			}
			this.anInterface9_2 = this.aClass5_Sub1_12.method327(local92.aByteArray102, false, local92.anInt10061);
			this.aClass170_Sub1_1 = new Class170_Sub1(this.aClass5_Sub1_12, 5123, (byte[]) null, 1);
		}
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(BILclient!dw;)V")
	private void method2325(@OriginalArg(1) int arg0, @OriginalArg(2) Interface9 arg1) {
		if (arg0 != 0) {
			this.method2326();
			this.aClass5_Sub1_12.method352(this.aClass2_Sub1_4);
			this.aClass5_Sub1_12.method354(arg0, arg1, 0);
		}
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(I)V")
	private void method2326() {
		if (!this.aBoolean216) {
			return;
		}
		this.aBoolean216 = false;
		@Pc(16) byte[] local16 = this.aClass47_1.aByteArray12;
		@Pc(20) byte[] local20 = this.aClass5_Sub1_12.aByteArray1;
		@Pc(22) int local22 = 0;
		@Pc(26) int local26 = this.aClass47_1.anInt2312;
		@Pc(37) int local37 = this.anInt2728 + this.aClass47_1.anInt2312 * this.anInt2733;
		@Pc(50) int local50;
		for (@Pc(39) int local39 = -128; local39 < 0; local39++) {
			local22 = (local22 << 8) - local22;
			for (local50 = -128; local50 < 0; local50++) {
				if (local16[local37++] != 0) {
					local22++;
				}
			}
			local37 += local26 - 128;
		}
		if (this.aClass2_Sub1_4 != null && local22 == this.anInt2735) {
			this.aBoolean216 = false;
			return;
		}
		this.anInt2735 = local22;
		local37 = this.anInt2733 * local26 + this.anInt2728;
		local50 = 0;
		for (@Pc(102) int local102 = -128; local102 < 0; local102++) {
			for (@Pc(106) int local106 = -128; local106 < 0; local106++) {
				if (local16[local37] == 0) {
					@Pc(114) int local114 = 0;
					if (local16[local37 - 1] != 0) {
						local114++;
					}
					if (local16[local37 + 1] != 0) {
						local114++;
					}
					if (local16[local37 - local26] != 0) {
						local114++;
					}
					if (local16[local37 + local26] != 0) {
						local114++;
					}
					local20[local50++] = (byte) (local114 * 17);
				} else {
					local20[local50++] = 68;
				}
				local37++;
			}
			local37 += this.aClass47_1.anInt2312 - 128;
		}
		if (this.aClass2_Sub1_4 == null) {
			this.aClass2_Sub1_4 = new Class2_Sub1(this.aClass5_Sub1_12, 3553, 6406, 128, 128, false, this.aClass5_Sub1_12.aByteArray1, 6406, false);
			this.aClass2_Sub1_4.method4205(false, false);
			this.aClass2_Sub1_4.method6976(true);
		} else {
			this.aClass2_Sub1_4.method4200(128, 6406, false, this.aClass5_Sub1_12.aByteArray1, 128);
		}
	}

	@OriginalMember(owner = "client!df", name = "b", descriptor = "(I)V")
	public void method2329() {
		this.method2325(this.anInt2731, this.anInterface9_2);
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(III[B)V")
	public void method2330(@OriginalArg(0) int arg0, @OriginalArg(3) byte[] arg1) {
		this.aClass170_Sub1_1.method7036(arg1, arg0 * this.aClass5_Sub1_12.method328(5123));
		this.method2325(arg0, this.aClass170_Sub1_1);
	}
}
