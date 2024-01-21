import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ld")
public final class Class43 {

	@OriginalMember(owner = "client!ld", name = "k", descriptor = "[I")
	public static int[] anIntArray297 = new int[32768];

	@OriginalMember(owner = "client!ld", name = "j", descriptor = "[I")
	public static int[] anIntArray296;

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "Lclient!ic;")
	private Class31 aClass31_1;

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "Lclient!mb;")
	private Class44 aClass44_1;

	@OriginalMember(owner = "client!ld", name = "c", descriptor = "Lclient!mb;")
	private Class44 aClass44_2;

	@OriginalMember(owner = "client!ld", name = "d", descriptor = "Lclient!mb;")
	private Class44 aClass44_3;

	@OriginalMember(owner = "client!ld", name = "e", descriptor = "Lclient!mb;")
	private Class44 aClass44_4;

	@OriginalMember(owner = "client!ld", name = "g", descriptor = "Lclient!mb;")
	private Class44 aClass44_5;

	@OriginalMember(owner = "client!ld", name = "i", descriptor = "Lclient!mb;")
	private Class44 aClass44_6;

	@OriginalMember(owner = "client!ld", name = "q", descriptor = "Lclient!mb;")
	private Class44 aClass44_7;

	@OriginalMember(owner = "client!ld", name = "r", descriptor = "Lclient!mb;")
	private Class44 aClass44_8;

	@OriginalMember(owner = "client!ld", name = "t", descriptor = "Lclient!mb;")
	private Class44 aClass44_9;

	@OriginalMember(owner = "client!ld", name = "f", descriptor = "I")
	public int anInt1935 = 500;

	@OriginalMember(owner = "client!ld", name = "m", descriptor = "I")
	private int anInt1937 = 0;

	@OriginalMember(owner = "client!ld", name = "p", descriptor = "[I")
	private final int[] anIntArray299 = new int[5];

	@OriginalMember(owner = "client!ld", name = "o", descriptor = "I")
	public int anInt1938 = 0;

	@OriginalMember(owner = "client!ld", name = "l", descriptor = "I")
	private int anInt1936 = 100;

	@OriginalMember(owner = "client!ld", name = "h", descriptor = "[I")
	private final int[] anIntArray295 = new int[5];

	@OriginalMember(owner = "client!ld", name = "n", descriptor = "[I")
	private final int[] anIntArray298 = new int[5];

	static {
		@Pc(7) Random local7 = new Random(0L);
		for (@Pc(9) int local9 = 0; local9 < 32768; local9++) {
			anIntArray297[local9] = (local7.nextInt() & 0x2) - 1;
		}
		anIntArray296 = new int[32768];
		for (@Pc(28) int local28 = 0; local28 < 32768; local28++) {
			anIntArray296[local28] = (int) (Math.sin((double) local28 / 5215.1903D) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(Lclient!mc;)V")
	public void method1356(@OriginalArg(0) Class1_Sub12 arg0) {
		this.aClass44_1 = new Class44();
		this.aClass44_1.method1375(arg0);
		this.aClass44_5 = new Class44();
		this.aClass44_5.method1375(arg0);
		@Pc(21) int local21 = arg0.method1190();
		if (local21 != 0) {
			arg0.anInt1694--;
			this.aClass44_6 = new Class44();
			this.aClass44_6.method1375(arg0);
			this.aClass44_7 = new Class44();
			this.aClass44_7.method1375(arg0);
		}
		local21 = arg0.method1190();
		if (local21 != 0) {
			arg0.anInt1694--;
			this.aClass44_9 = new Class44();
			this.aClass44_9.method1375(arg0);
			this.aClass44_2 = new Class44();
			this.aClass44_2.method1375(arg0);
		}
		local21 = arg0.method1190();
		if (local21 != 0) {
			arg0.anInt1694--;
			this.aClass44_8 = new Class44();
			this.aClass44_8.method1375(arg0);
			this.aClass44_4 = new Class44();
			this.aClass44_4.method1375(arg0);
		}
		for (@Pc(109) int local109 = 0; local109 < 10; local109++) {
			@Pc(114) int local114 = arg0.method1180();
			if (local114 == 0) {
				break;
			}
			this.anIntArray295[local109] = local114;
			this.anIntArray299[local109] = arg0.method1185();
			this.anIntArray298[local109] = arg0.method1180();
		}
		this.anInt1937 = arg0.method1180();
		this.anInt1936 = arg0.method1180();
		this.anInt1935 = arg0.method1176();
		this.anInt1938 = arg0.method1176();
		this.aClass31_1 = new Class31();
		this.aClass44_3 = new Class44();
		this.aClass31_1.method1025(arg0, this.aClass44_3);
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(II)[I")
	public int[] method1357(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static139.method1492(Static64.anIntArray300, 0, arg0);
		if (arg1 < 10) {
			return Static64.anIntArray300;
		}
		@Pc(16) double local16 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass44_1.method1376();
		this.aClass44_5.method1376();
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		if (this.aClass44_6 != null) {
			this.aClass44_6.method1376();
			this.aClass44_7.method1376();
			local24 = (int) ((double) (this.aClass44_6.anInt1975 - this.aClass44_6.anInt1976) * 32.768D / local16);
			local26 = (int) ((double) this.aClass44_6.anInt1976 * 32.768D / local16);
		}
		@Pc(63) int local63 = 0;
		@Pc(65) int local65 = 0;
		@Pc(67) int local67 = 0;
		if (this.aClass44_9 != null) {
			this.aClass44_9.method1376();
			this.aClass44_2.method1376();
			local63 = (int) ((double) (this.aClass44_9.anInt1975 - this.aClass44_9.anInt1976) * 32.768D / local16);
			local65 = (int) ((double) this.aClass44_9.anInt1976 * 32.768D / local16);
		}
		for (@Pc(102) int local102 = 0; local102 < 5; local102++) {
			if (this.anIntArray295[local102] != 0) {
				Static64.anIntArray304[local102] = 0;
				Static64.anIntArray305[local102] = (int) ((double) this.anIntArray298[local102] * local16);
				Static64.anIntArray302[local102] = (this.anIntArray295[local102] << 14) / 100;
				Static64.anIntArray303[local102] = (int) ((double) (this.aClass44_1.anInt1975 - this.aClass44_1.anInt1976) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray299[local102]) / local16);
				Static64.anIntArray301[local102] = (int) ((double) this.aClass44_1.anInt1976 * 32.768D / local16);
			}
		}
		@Pc(182) int local182;
		@Pc(187) int local187;
		@Pc(195) int local195;
		@Pc(200) int local200;
		for (@Pc(176) int local176 = 0; local176 < arg0; local176++) {
			local182 = this.aClass44_1.method1374(arg0);
			local187 = this.aClass44_5.method1374(arg0);
			if (this.aClass44_6 != null) {
				local195 = this.aClass44_6.method1374(arg0);
				local200 = this.aClass44_7.method1374(arg0);
				local182 += this.method1358(local28, local200, this.aClass44_6.anInt1977) >> 1;
				local28 += (local195 * local24 >> 16) + local26;
			}
			if (this.aClass44_9 != null) {
				local195 = this.aClass44_9.method1374(arg0);
				local200 = this.aClass44_2.method1374(arg0);
				local187 = local187 * ((this.method1358(local67, local200, this.aClass44_9.anInt1977) >> 1) + 32768) >> 15;
				local67 += (local195 * local63 >> 16) + local65;
			}
			for (local195 = 0; local195 < 5; local195++) {
				if (this.anIntArray295[local195] != 0) {
					local200 = local176 + Static64.anIntArray305[local195];
					if (local200 < arg0) {
						Static64.anIntArray300[local200] += this.method1358(Static64.anIntArray304[local195], local187 * Static64.anIntArray302[local195] >> 15, this.aClass44_1.anInt1977);
						Static64.anIntArray304[local195] += (local182 * Static64.anIntArray303[local195] >> 16) + Static64.anIntArray301[local195];
					}
				}
			}
		}
		@Pc(347) int local347;
		@Pc(352) int local352;
		if (this.aClass44_8 != null) {
			this.aClass44_8.method1376();
			this.aClass44_4.method1376();
			local182 = 0;
			@Pc(339) boolean local339 = true;
			for (local200 = 0; local200 < arg0; local200++) {
				local347 = this.aClass44_8.method1374(arg0);
				local352 = this.aClass44_4.method1374(arg0);
				if (local339) {
					local187 = this.aClass44_8.anInt1976 + ((this.aClass44_8.anInt1975 - this.aClass44_8.anInt1976) * local347 >> 8);
				} else {
					local187 = this.aClass44_8.anInt1976 + ((this.aClass44_8.anInt1975 - this.aClass44_8.anInt1976) * local352 >> 8);
				}
				local182 += 256;
				if (local182 >= local187) {
					local182 = 0;
					local339 = !local339;
				}
				if (local339) {
					Static64.anIntArray300[local200] = 0;
				}
			}
		}
		if (this.anInt1937 > 0 && this.anInt1936 > 0) {
			local182 = (int) ((double) this.anInt1937 * local16);
			for (local187 = local182; local187 < arg0; local187++) {
				Static64.anIntArray300[local187] += Static64.anIntArray300[local187 - local182] * this.anInt1936 / 100;
			}
		}
		if (this.aClass31_1.anIntArray218[0] > 0 || this.aClass31_1.anIntArray218[1] > 0) {
			this.aClass44_3.method1376();
			local182 = this.aClass44_3.method1374(arg0 + 1);
			local187 = this.aClass31_1.method1026(0, (float) local182 / 65536.0F);
			local195 = this.aClass31_1.method1026(1, (float) local182 / 65536.0F);
			if (arg0 >= local187 + local195) {
				local200 = 0;
				local347 = local195;
				if (local195 > arg0 - local187) {
					local347 = arg0 - local187;
				}
				@Pc(519) int local519;
				@Pc(549) int local549;
				while (local200 < local347) {
					local352 = (int) ((long) Static64.anIntArray300[local200 + local187] * (long) Static46.anInt1447 >> 16);
					for (local519 = 0; local519 < local187; local519++) {
						local352 += (int) ((long) Static64.anIntArray300[local200 + local187 - local519 - 1] * (long) Static46.anIntArrayArray15[0][local519] >> 16);
					}
					for (local549 = 0; local549 < local200; local549++) {
						local352 -= (int) ((long) Static64.anIntArray300[local200 - local549 - 1] * (long) Static46.anIntArrayArray15[1][local549] >> 16);
					}
					Static64.anIntArray300[local200] = local352;
					local182 = this.aClass44_3.method1374(arg0 + 1);
					local200++;
				}
				local347 = 128;
				while (true) {
					if (local347 > arg0 - local187) {
						local347 = arg0 - local187;
					}
					while (local200 < local347) {
						local352 = (int) ((long) Static64.anIntArray300[local200 + local187] * (long) Static46.anInt1447 >> 16);
						for (local519 = 0; local519 < local187; local519++) {
							local352 += (int) ((long) Static64.anIntArray300[local200 + local187 - local519 - 1] * (long) Static46.anIntArrayArray15[0][local519] >> 16);
						}
						for (local549 = 0; local549 < local195; local549++) {
							local352 -= (int) ((long) Static64.anIntArray300[local200 - local549 - 1] * (long) Static46.anIntArrayArray15[1][local549] >> 16);
						}
						Static64.anIntArray300[local200] = local352;
						local182 = this.aClass44_3.method1374(arg0 + 1);
						local200++;
					}
					if (local200 >= arg0 - local187) {
						while (local200 < arg0) {
							local352 = 0;
							for (local519 = local200 + local187 - arg0; local519 < local187; local519++) {
								local352 += (int) ((long) Static64.anIntArray300[local200 + local187 - local519 - 1] * (long) Static46.anIntArrayArray15[0][local519] >> 16);
							}
							for (local549 = 0; local549 < local195; local549++) {
								local352 -= (int) ((long) Static64.anIntArray300[local200 - local549 - 1] * (long) Static46.anIntArrayArray15[1][local549] >> 16);
							}
							Static64.anIntArray300[local200] = local352;
							this.aClass44_3.method1374(arg0 + 1);
							local200++;
						}
						break;
					}
					local187 = this.aClass31_1.method1026(0, (float) local182 / 65536.0F);
					local195 = this.aClass31_1.method1026(1, (float) local182 / 65536.0F);
					local347 += 128;
				}
			}
		}
		for (local182 = 0; local182 < arg0; local182++) {
			if (Static64.anIntArray300[local182] < -32768) {
				Static64.anIntArray300[local182] = -32768;
			}
			if (Static64.anIntArray300[local182] > 32767) {
				Static64.anIntArray300[local182] = 32767;
			}
		}
		return Static64.anIntArray300;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(III)I")
	private int method1358(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
		} else if (arg2 == 2) {
			return anIntArray296[arg0 & 0x7FFF] * arg1 >> 14;
		} else if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		} else if (arg2 == 4) {
			return anIntArray297[arg0 / 2607 & 0x7FFF] * arg1;
		} else {
			return 0;
		}
	}
}
