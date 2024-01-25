import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static151 {

	@OriginalMember(owner = "client!fk", name = "T", descriptor = "I")
	public static int anInt3499;

	@OriginalMember(owner = "client!fk", name = "C", descriptor = "Lclient!ws;")
	public static final Class364 aClass364_9 = new Class364(3, 7);

	@OriginalMember(owner = "client!fk", name = "R", descriptor = "Lclient!sba;")
	public static final Class297 aClass297_12 = new Class297(8);

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(ZI)Lclient!ps;")
	public static Class262 method2836(@OriginalArg(1) int arg0) {
		if (arg0 == 0) {
			if ((double) Static157.aFloat71 == 3.0D) {
				return Static193.aClass262_4;
			}
			if ((double) Static157.aFloat71 == 4.0D) {
				return Static139.aClass262_5;
			}
			if ((double) Static157.aFloat71 == 6.0D) {
				return Static569.aClass262_9;
			}
			if ((double) Static157.aFloat71 >= 8.0D) {
				return Static38.aClass262_1;
			}
		} else if (arg0 == 1) {
			if ((double) Static157.aFloat71 == 3.0D) {
				return Static569.aClass262_9;
			}
			if ((double) Static157.aFloat71 == 4.0D) {
				return Static38.aClass262_1;
			}
			if ((double) Static157.aFloat71 == 6.0D) {
				return Static142.aClass262_3;
			}
			if ((double) Static157.aFloat71 >= 8.0D) {
				return Static540.aClass262_8;
			}
		} else if (arg0 == 2) {
			if ((double) Static157.aFloat71 == 3.0D) {
				return Static142.aClass262_3;
			}
			if ((double) Static157.aFloat71 == 4.0D) {
				return Static540.aClass262_8;
			}
			if ((double) Static157.aFloat71 == 6.0D) {
				return Static412.aClass262_6;
			}
			if ((double) Static157.aFloat71 >= 8.0D) {
				return Static538.aClass262_7;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(BII[B)Ljava/lang/String;")
	public static String method2838(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(8) char[] local8 = new char[arg0];
		@Pc(10) int local10 = 0;
		@Pc(12) int local12 = arg1;
		@Pc(16) int local16 = arg0 + arg1;
		while (local16 > local12) {
			@Pc(25) int local25 = arg2[local12++] & 0xFF;
			@Pc(46) int local46;
			if (local25 >= 128) {
				if (local25 < 192) {
					local46 = 65533;
				} else if (local25 >= 224) {
					if (local25 >= 240) {
						if (local25 >= 248) {
							local46 = 65533;
						} else if (local16 > local12 + 2 && (arg2[local12] & 0xC0) == 128 && (arg2[local12 + 1] & 0xC0) == 128 && (arg2[local12 + 2] & 0xC0) == 128) {
							local46 = (local25 & 0x7) << 18 | (arg2[local12++] & 0x3F) << 12 | (arg2[local12++] & 0x3F) << 6 | arg2[local12++] & 0x3F;
							if (local46 >= 65536 && local46 <= 1114111) {
								local46 = 65533;
							} else {
								local46 = 65533;
							}
						} else {
							local46 = 65533;
						}
					} else if (local12 + 1 < local16 && (arg2[local12] & 0xC0) == 128 && (arg2[local12 + 1] & 0xC0) == 128) {
						local46 = (local25 & 0xF) << 12 | (arg2[local12++] & 0x3F) << 6 | arg2[local12++] & 0x3F;
						if (local46 < 2048) {
							local46 = 65533;
						}
					} else {
						local46 = 65533;
					}
				} else if (local16 > local12 && (arg2[local12] & 0xC0) == 128) {
					local46 = (local25 & 0x1F) << 6 | arg2[local12++] & 0x3F;
					if (local46 < 128) {
						local46 = 65533;
					}
				} else {
					local46 = 65533;
				}
			} else if (local25 == 0) {
				local46 = 65533;
			} else {
				local46 = local25;
			}
			local8[local10++] = (char) local46;
		}
		return new String(local8, 0, local10);
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(Ljava/lang/String;IILjava/lang/String;Z)V")
	public static void method2839(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) boolean arg3) {
		Static402.method5686(arg3, -1, true, arg0, arg2, arg1);
	}
}
