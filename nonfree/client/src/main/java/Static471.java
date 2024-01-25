import jagex3.jagmisc.jagmisc;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static471 {

	@OriginalMember(owner = "client!sb", name = "i", descriptor = "[I")
	private static int[] anIntArray522;

	@OriginalMember(owner = "client!sb", name = "l", descriptor = "Lclient!om;")
	private static Class251 aClass251_1;

	@OriginalMember(owner = "client!sb", name = "o", descriptor = "Lclient!is;")
	private static Class155 aClass155_14;

	@OriginalMember(owner = "client!sb", name = "s", descriptor = "Lclient!is;")
	private static Class155 aClass155_15;

	@OriginalMember(owner = "client!sb", name = "t", descriptor = "[Ljava/lang/String;")
	private static String[] aStringArray34;

	@OriginalMember(owner = "client!sb", name = "d", descriptor = "I")
	private static int anInt8965 = 0;

	@OriginalMember(owner = "client!sb", name = "e", descriptor = "I")
	private static int anInt8966 = 0;

	@OriginalMember(owner = "client!sb", name = "f", descriptor = "[[I")
	private static final int[][] anIntArrayArray51 = new int[5][5000];

	@OriginalMember(owner = "client!sb", name = "g", descriptor = "[Lclient!kv;")
	private static final Class189[] aClass189Array1 = new Class189[50];

	@OriginalMember(owner = "client!sb", name = "h", descriptor = "Ljava/util/Calendar;")
	private static final Calendar aCalendar2 = Calendar.getInstance();

	@OriginalMember(owner = "client!sb", name = "r", descriptor = "[I")
	private static final int[] anIntArray523 = new int[1000];

	@OriginalMember(owner = "client!sb", name = "u", descriptor = "[I")
	private static final int[] anIntArray524 = new int[5];

	@OriginalMember(owner = "client!sb", name = "w", descriptor = "I")
	private static int anInt8974 = 0;

	@OriginalMember(owner = "client!sb", name = "y", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray35 = new String[1000];

	@OriginalMember(owner = "client!sb", name = "z", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray36 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@OriginalMember(owner = "client!sb", name = "A", descriptor = "[I")
	private static final int[] anIntArray525 = new int[3];

	@OriginalMember(owner = "client!sb", name = "B", descriptor = "Lclient!jn;")
	public static final Class167 aClass167_53 = new Class167(4);

	@OriginalMember(owner = "client!sb", name = "C", descriptor = "I")
	private static int anInt8976 = 0;

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private static void method6877(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (Static100.anInt2432 == 0 && (Static337.aBoolean442 && !Static477.aBoolean628 || Static16.aBoolean432)) {
			return;
		}
		@Pc(11) String local11 = arg0.toLowerCase();
		@Pc(13) byte local13 = 0;
		if (local11.startsWith(Static223.aClass152_51.method3624(0))) {
			local13 = 0;
			arg0 = arg0.substring(Static223.aClass152_51.method3624(0).length());
		} else if (local11.startsWith(Static223.aClass152_52.method3624(0))) {
			local13 = 1;
			arg0 = arg0.substring(Static223.aClass152_52.method3624(0).length());
		} else if (local11.startsWith(Static223.aClass152_53.method3624(0))) {
			local13 = 2;
			arg0 = arg0.substring(Static223.aClass152_53.method3624(0).length());
		} else if (local11.startsWith(Static223.aClass152_54.method3624(0))) {
			local13 = 3;
			arg0 = arg0.substring(Static223.aClass152_54.method3624(0).length());
		} else if (local11.startsWith(Static223.aClass152_55.method3624(0))) {
			local13 = 4;
			arg0 = arg0.substring(Static223.aClass152_55.method3624(0).length());
		} else if (local11.startsWith(Static223.aClass152_56.method3624(0))) {
			local13 = 5;
			arg0 = arg0.substring(Static223.aClass152_56.method3624(0).length());
		} else if (local11.startsWith(Static223.aClass152_57.method3624(0))) {
			local13 = 6;
			arg0 = arg0.substring(Static223.aClass152_57.method3624(0).length());
		} else if (local11.startsWith(Static223.aClass152_58.method3624(0))) {
			local13 = 7;
			arg0 = arg0.substring(Static223.aClass152_58.method3624(0).length());
		} else if (local11.startsWith(Static223.aClass152_59.method3624(0))) {
			local13 = 8;
			arg0 = arg0.substring(Static223.aClass152_59.method3624(0).length());
		} else if (local11.startsWith(Class152.lb.method3624(0))) {
			local13 = 9;
			arg0 = arg0.substring(Class152.lb.method3624(0).length());
		} else if (local11.startsWith(Static223.aClass152_60.method3624(0))) {
			local13 = 10;
			arg0 = arg0.substring(Static223.aClass152_60.method3624(0).length());
		} else if (local11.startsWith(Static223.aClass152_61.method3624(0))) {
			local13 = 11;
			arg0 = arg0.substring(Static223.aClass152_61.method3624(0).length());
		} else if (Static142.anInt3088 != 0) {
			if (local11.startsWith(Static223.aClass152_51.method3624(Static142.anInt3088))) {
				local13 = 0;
				arg0 = arg0.substring(Static223.aClass152_51.method3624(Static142.anInt3088).length());
			} else if (local11.startsWith(Static223.aClass152_52.method3624(Static142.anInt3088))) {
				local13 = 1;
				arg0 = arg0.substring(Static223.aClass152_52.method3624(Static142.anInt3088).length());
			} else if (local11.startsWith(Static223.aClass152_53.method3624(Static142.anInt3088))) {
				local13 = 2;
				arg0 = arg0.substring(Static223.aClass152_53.method3624(Static142.anInt3088).length());
			} else if (local11.startsWith(Static223.aClass152_54.method3624(Static142.anInt3088))) {
				local13 = 3;
				arg0 = arg0.substring(Static223.aClass152_54.method3624(Static142.anInt3088).length());
			} else if (local11.startsWith(Static223.aClass152_55.method3624(Static142.anInt3088))) {
				local13 = 4;
				arg0 = arg0.substring(Static223.aClass152_55.method3624(Static142.anInt3088).length());
			} else if (local11.startsWith(Static223.aClass152_56.method3624(Static142.anInt3088))) {
				local13 = 5;
				arg0 = arg0.substring(Static223.aClass152_56.method3624(Static142.anInt3088).length());
			} else if (local11.startsWith(Static223.aClass152_57.method3624(Static142.anInt3088))) {
				local13 = 6;
				arg0 = arg0.substring(Static223.aClass152_57.method3624(Static142.anInt3088).length());
			} else if (local11.startsWith(Static223.aClass152_58.method3624(Static142.anInt3088))) {
				local13 = 7;
				arg0 = arg0.substring(Static223.aClass152_58.method3624(Static142.anInt3088).length());
			} else if (local11.startsWith(Static223.aClass152_59.method3624(Static142.anInt3088))) {
				local13 = 8;
				arg0 = arg0.substring(Static223.aClass152_59.method3624(Static142.anInt3088).length());
			} else if (local11.startsWith(Class152.lb.method3624(Static142.anInt3088))) {
				local13 = 9;
				arg0 = arg0.substring(Class152.lb.method3624(Static142.anInt3088).length());
			} else if (local11.startsWith(Static223.aClass152_60.method3624(Static142.anInt3088))) {
				local13 = 10;
				arg0 = arg0.substring(Static223.aClass152_60.method3624(Static142.anInt3088).length());
			} else if (local11.startsWith(Static223.aClass152_61.method3624(Static142.anInt3088))) {
				local13 = 11;
				arg0 = arg0.substring(Static223.aClass152_61.method3624(Static142.anInt3088).length());
			}
		}
		local11 = arg0.toLowerCase();
		@Pc(451) byte local451 = 0;
		if (local11.startsWith(Static223.aClass152_62.method3624(0))) {
			local451 = 1;
			arg0 = arg0.substring(Static223.aClass152_62.method3624(0).length());
		} else if (local11.startsWith(Static223.aClass152_63.method3624(0))) {
			local451 = 2;
			arg0 = arg0.substring(Static223.aClass152_63.method3624(0).length());
		} else if (local11.startsWith(Static223.aClass152_64.method3624(0))) {
			local451 = 3;
			arg0 = arg0.substring(Static223.aClass152_64.method3624(0).length());
		} else if (local11.startsWith(Static223.aClass152_65.method3624(0))) {
			local451 = 4;
			arg0 = arg0.substring(Static223.aClass152_65.method3624(0).length());
		} else if (local11.startsWith(Static223.aClass152_66.method3624(0))) {
			local451 = 5;
			arg0 = arg0.substring(Static223.aClass152_66.method3624(0).length());
		} else if (Static142.anInt3088 != 0) {
			if (local11.startsWith(Static223.aClass152_62.method3624(Static142.anInt3088))) {
				local451 = 1;
				arg0 = arg0.substring(Static223.aClass152_62.method3624(Static142.anInt3088).length());
			} else if (local11.startsWith(Static223.aClass152_63.method3624(Static142.anInt3088))) {
				local451 = 2;
				arg0 = arg0.substring(Static223.aClass152_63.method3624(Static142.anInt3088).length());
			} else if (local11.startsWith(Static223.aClass152_64.method3624(Static142.anInt3088))) {
				local451 = 3;
				arg0 = arg0.substring(Static223.aClass152_64.method3624(Static142.anInt3088).length());
			} else if (local11.startsWith(Static223.aClass152_65.method3624(Static142.anInt3088))) {
				local451 = 4;
				arg0 = arg0.substring(Static223.aClass152_65.method3624(Static142.anInt3088).length());
			} else if (local11.startsWith(Static223.aClass152_66.method3624(Static142.anInt3088))) {
				local451 = 5;
				arg0 = arg0.substring(Static223.aClass152_66.method3624(Static142.anInt3088).length());
			}
		}
		@Pc(641) Class4_Sub39 local641 = Static32.method999(Static402.aClass356_1, Static71.aClass344_13);
		local641.aClass4_Sub13_Sub2_1.method7052(0);
		@Pc(650) int local650 = local641.aClass4_Sub13_Sub2_1.anInt9170;
		local641.aClass4_Sub13_Sub2_1.method7052(local13);
		local641.aClass4_Sub13_Sub2_1.method7052(local451);
		Static335.method5120(arg0, local641.aClass4_Sub13_Sub2_1);
		local641.aClass4_Sub13_Sub2_1.method6991(local641.aClass4_Sub13_Sub2_1.anInt9170 - local650);
		Static50.method1166(local641);
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lclient!or;I)V")
	private static void method6878(@OriginalArg(0) Class4_Sub37 arg0, @OriginalArg(1) int arg1) {
		@Pc(2) Object[] local2 = arg0.anObjectArray31;
		@Pc(8) int local8 = (Integer) local2[0];
		@Pc(12) Class4_Sub6_Sub19 local12 = Static42.method1108(local8);
		if (local12 == null) {
			return;
		}
		anIntArray522 = new int[local12.anInt10140];
		@Pc(21) int local21 = 0;
		aStringArray34 = new String[local12.anInt10134];
		@Pc(27) int local27 = 0;
		for (@Pc(29) int local29 = 1; local29 < local2.length; local29++) {
			if (local2[local29] instanceof Integer) {
				@Pc(41) int local41 = (Integer) local2[local29];
				if (local41 == -2147483647) {
					local41 = arg0.anInt7557;
				}
				if (local41 == -2147483646) {
					local41 = arg0.anInt7562;
				}
				if (local41 == -2147483645) {
					local41 = arg0.aClass155_10 == null ? -1 : arg0.aClass155_10.anInt4793;
				}
				if (local41 == -2147483644) {
					local41 = arg0.anInt7559;
				}
				if (local41 == -2147483643) {
					local41 = arg0.aClass155_10 == null ? -1 : arg0.aClass155_10.anInt4765;
				}
				if (local41 == -2147483642) {
					local41 = arg0.aClass155_9 == null ? -1 : arg0.aClass155_9.anInt4793;
				}
				if (local41 == -2147483641) {
					local41 = arg0.aClass155_9 == null ? -1 : arg0.aClass155_9.anInt4765;
				}
				if (local41 == -2147483640) {
					local41 = arg0.anInt7563;
				}
				if (local41 == -2147483639) {
					local41 = arg0.anInt7554;
				}
				anIntArray522[local21++] = local41;
			} else if (local2[local29] instanceof String) {
				@Pc(135) String local135 = (String) local2[local29];
				if (local135.equals("event_opbase")) {
					local135 = arg0.aString151;
				}
				aStringArray34[local27++] = local135;
			}
		}
		anInt8976 = arg0.anInt7561;
		method6879(local12, arg1);
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lclient!vfa;I)V")
	private static void method6879(@OriginalArg(0) Class4_Sub6_Sub19 arg0, @OriginalArg(1) int arg1) {
		anInt8974 = 0;
		anInt8965 = 0;
		@Pc(5) int local5 = -1;
		@Pc(8) int[] local8 = arg0.anIntArray574;
		@Pc(11) int[] local11 = arg0.anIntArray575;
		@Pc(13) byte local13 = -1;
		anInt8966 = 0;
		@Pc(603) int local603;
		try {
			@Pc(17) int local17 = 0;
			label260: while (true) {
				local17++;
				if (local17 > arg1) {
					throw new RuntimeException("slow");
				}
				local5++;
				@Pc(31) int local31 = local8[local5];
				if (local31 >= 100) {
					@Pc(802) boolean local802;
					if (local11[local5] == 1) {
						local802 = true;
					} else {
						local802 = false;
					}
					if (local31 >= 100 && local31 < 5000) {
						method6890(local31, local802);
					} else if (local31 >= 5000 && local31 < 10000) {
						method6881(local31, local802);
					} else {
						throw new IllegalStateException("Command: " + local31);
					}
				} else if (local31 == 0) {
					anIntArray523[anInt8974++] = local11[local5];
				} else {
					@Pc(54) int local54;
					if (local31 == 1) {
						local54 = local11[local5];
						anIntArray523[anInt8974++] = Static523.aClass173_1.anIntArray284[local54];
					} else if (local31 == 2) {
						local54 = local11[local5];
						Static523.aClass173_1.method4073(anIntArray523[--anInt8974], local54);
					} else if (local31 == 3) {
						aStringArray35[anInt8965++] = arg0.aStringArray41[local5];
					} else if (local31 == 6) {
						local5 += local11[local5];
					} else if (local31 == 7) {
						anInt8974 -= 2;
						if (anIntArray523[anInt8974] != anIntArray523[anInt8974 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 8) {
						anInt8974 -= 2;
						if (anIntArray523[anInt8974] == anIntArray523[anInt8974 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 9) {
						anInt8974 -= 2;
						if (anIntArray523[anInt8974] < anIntArray523[anInt8974 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 10) {
						anInt8974 -= 2;
						if (anIntArray523[anInt8974] > anIntArray523[anInt8974 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 21) {
						if (anInt8966 == 0) {
							return;
						}
						@Pc(216) Class189 local216 = aClass189Array1[--anInt8966];
						arg0 = local216.aClass4_Sub6_Sub19_1;
						local8 = arg0.anIntArray574;
						local11 = arg0.anIntArray575;
						local5 = local216.anInt5811;
						anIntArray522 = local216.anIntArray310;
						aStringArray34 = local216.aStringArray22;
					} else if (local31 == 25) {
						local54 = local11[local5];
						anIntArray523[anInt8974++] = Static523.aClass173_1.method4069(local54);
					} else if (local31 == 27) {
						local54 = local11[local5];
						Static523.aClass173_1.method4071(anIntArray523[--anInt8974], local54);
					} else if (local31 == 31) {
						anInt8974 -= 2;
						if (anIntArray523[anInt8974] <= anIntArray523[anInt8974 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 32) {
						anInt8974 -= 2;
						if (anIntArray523[anInt8974] >= anIntArray523[anInt8974 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 33) {
						anIntArray523[anInt8974++] = anIntArray522[local11[local5]];
					} else if (local31 == 34) {
						anIntArray522[local11[local5]] = anIntArray523[--anInt8974];
					} else if (local31 == 35) {
						aStringArray35[anInt8965++] = aStringArray34[local11[local5]];
					} else if (local31 == 36) {
						aStringArray34[local11[local5]] = aStringArray35[--anInt8965];
					} else if (local31 == 37) {
						local54 = local11[local5];
						anInt8965 -= local54;
						@Pc(400) String local400 = Static180.method7446(aStringArray35, local54, anInt8965);
						aStringArray35[anInt8965++] = local400;
					} else if (local31 == 38) {
						anInt8974--;
					} else if (local31 == 39) {
						anInt8965--;
					} else {
						@Pc(452) int local452;
						if (local31 == 40) {
							local54 = local11[local5];
							@Pc(436) Class4_Sub6_Sub19 local436 = Static42.method1108(local54);
							if (local436 == null) {
								throw new RuntimeException();
							}
							@Pc(446) int[] local446 = new int[local436.anInt10140];
							@Pc(450) String[] local450 = new String[local436.anInt10134];
							for (local452 = 0; local452 < local436.anInt10138; local452++) {
								local446[local452] = anIntArray523[anInt8974 + local452 - local436.anInt10138];
							}
							for (@Pc(471) int local471 = 0; local471 < local436.anInt10136; local471++) {
								local450[local471] = aStringArray35[anInt8965 + local471 - local436.anInt10136];
							}
							anInt8974 -= local436.anInt10138;
							anInt8965 -= local436.anInt10136;
							@Pc(502) Class189 local502 = new Class189();
							local502.aClass4_Sub6_Sub19_1 = arg0;
							local502.anInt5811 = local5;
							local502.anIntArray310 = anIntArray522;
							local502.aStringArray22 = aStringArray34;
							if (anInt8966 >= aClass189Array1.length) {
								throw new RuntimeException();
							}
							aClass189Array1[anInt8966++] = local502;
							arg0 = local436;
							local8 = local436.anIntArray574;
							local11 = local436.anIntArray575;
							local5 = -1;
							anIntArray522 = local446;
							aStringArray34 = local450;
						} else if (local31 == 42) {
							anIntArray523[anInt8974++] = Static65.anIntArray67[local11[local5]];
						} else if (local31 == 43) {
							local54 = local11[local5];
							Static65.anIntArray67[local54] = anIntArray523[--anInt8974];
							Static190.method3139(local54);
							Static1.aBoolean353 |= Static188.aBooleanArray11[local54];
						} else if (local31 == 44) {
							local54 = local11[local5] >> 16;
							local603 = local11[local5] & 0xFFFF;
							@Pc(611) int local611 = anIntArray523[--anInt8974];
							if (local611 >= 0 && local611 <= 5000) {
								anIntArray524[local54] = local611;
								@Pc(626) byte local626 = -1;
								if (local603 == 105) {
									local626 = 0;
								}
								local452 = 0;
								while (true) {
									if (local452 >= local611) {
										continue label260;
									}
									anIntArrayArray51[local54][local452] = local626;
									local452++;
								}
							}
							throw new RuntimeException();
						} else if (local31 == 45) {
							local54 = local11[local5];
							local603 = anIntArray523[--anInt8974];
							if (local603 < 0 || local603 >= anIntArray524[local54]) {
								throw new RuntimeException();
							}
							anIntArray523[anInt8974++] = anIntArrayArray51[local54][local603];
						} else if (local31 == 46) {
							local54 = local11[local5];
							anInt8974 -= 2;
							local603 = anIntArray523[anInt8974];
							if (local603 < 0 || local603 >= anIntArray524[local54]) {
								throw new RuntimeException();
							}
							anIntArrayArray51[local54][local603] = anIntArray523[anInt8974 + 1];
						} else if (local31 == 47) {
							@Pc(730) String local730 = Static178.aStringArray15[local11[local5]];
							if (local730 == null) {
								local730 = "null";
							}
							aStringArray35[anInt8965++] = local730;
						} else if (local31 == 48) {
							local54 = local11[local5];
							Static178.aStringArray15[local54] = aStringArray35[--anInt8965];
							Static530.method3341(local54);
						} else if (local31 == 51) {
							@Pc(774) Class221 local774 = arg0.aClass221Array1[local11[local5]];
							@Pc(787) Class4_Sub27 local787 = (Class4_Sub27) local774.method5075((long) anIntArray523[--anInt8974]);
							if (local787 != null) {
								local5 += local787.anInt4968;
							}
						}
					}
				}
			}
		} catch (@Pc(837) Exception local837) {
			@Pc(856) StringBuffer local856;
			if (arg0.aString221 == null) {
				local856 = new StringBuffer(30);
				local856.append("CS2: ").append(arg0.aLong295).append(" ");
				for (local603 = anInt8966 - 1; local603 >= 0; local603--) {
					local856.append("v: ").append(aClass189Array1[local603].aClass4_Sub6_Sub19_1.aLong295).append(" ");
				}
				local856.append("op: ").append(local13);
				Static109.method2014(local856.toString(), local837);
			} else {
				Static412.method6231("Clientscript error in: " + arg0.aString221);
				local856 = new StringBuffer(30);
				local856.append("Clientscript error in: ").append(arg0.aString221).append("\n");
				for (local603 = anInt8966 - 1; local603 >= 0; local603--) {
					local856.append("via: ").append(aClass189Array1[local603].aClass4_Sub6_Sub19_1.aString221).append("\n");
				}
				local856.append("Op: ").append(local13).append("\n");
				@Pc(896) String local896 = local837.getMessage();
				if (local896 != null && local896.length() > 0) {
					local856.append("Message: ").append(local896).append("\n");
				}
				Static109.method2014(local856.toString(), local837);
				Static47.method1139(local856.toString());
			}
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(I)V")
	public static void method6880(@OriginalArg(0) int arg0) {
		if (arg0 == -1 || !Static420.method6283(arg0)) {
			return;
		}
		@Pc(12) Class155[] local12 = Static535.aClass155ArrayArray2[arg0];
		for (@Pc(14) int local14 = 0; local14 < local12.length; local14++) {
			@Pc(19) Class155 local19 = local12[local14];
			if (local19.anObjectArray29 != null) {
				@Pc(26) Class4_Sub37 local26 = new Class4_Sub37();
				local26.aClass155_10 = local19;
				local26.anObjectArray31 = local19.anObjectArray29;
				method6878(local26, 2000000);
			}
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(IZ)V")
	private static void method6881(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(83) String local83;
		@Pc(1496) boolean local1496;
		@Pc(97) int local97;
		@Pc(175) int local175;
		@Pc(776) int local776;
		@Pc(181) String local181;
		@Pc(103) int local103;
		@Pc(52) Class4_Sub39 local52;
		@Pc(89) String local89;
		if (arg0 < 5100) {
			if (arg0 == 5000) {
				anIntArray523[anInt8974++] = Static409.anInt7963;
				return;
			}
			if (arg0 == 5001) {
				anInt8974 -= 3;
				Static409.anInt7963 = anIntArray523[anInt8974];
				Static182.aClass176_1 = Static93.method1854(anIntArray523[anInt8974 + 1]);
				if (Static182.aClass176_1 == null) {
					Static182.aClass176_1 = Static485.aClass176_4;
				}
				Static311.anInt6268 = anIntArray523[anInt8974 + 2];
				local52 = Static32.method999(Static402.aClass356_1, Static557.aClass344_97);
				local52.aClass4_Sub13_Sub2_1.method7052(Static409.anInt7963);
				local52.aClass4_Sub13_Sub2_1.method7052(Static182.aClass176_1.anInt5329);
				local52.aClass4_Sub13_Sub2_1.method7052(Static311.anInt6268);
				Static50.method1166(local52);
				return;
			}
			if (arg0 == 5002) {
				anInt8965 -= 2;
				local83 = aStringArray35[anInt8965];
				local89 = aStringArray35[anInt8965 + 1];
				anInt8974 -= 2;
				local97 = anIntArray523[anInt8974];
				local103 = anIntArray523[anInt8974 + 1];
				if (local89 == null) {
					local89 = "";
				}
				if (local89.length() > 80) {
					local89 = local89.substring(0, 80);
				}
				@Pc(125) Class4_Sub39 local125 = Static32.method999(Static402.aClass356_1, Static537.aClass344_94);
				local125.aClass4_Sub13_Sub2_1.method7052(Static393.method6014(local83) + Static393.method6014(local89) + 2);
				local125.aClass4_Sub13_Sub2_1.method7002(local83);
				local125.aClass4_Sub13_Sub2_1.method7052(local97 - 1);
				local125.aClass4_Sub13_Sub2_1.method7052(local103);
				local125.aClass4_Sub13_Sub2_1.method7002(local89);
				Static50.method1166(local125);
				return;
			}
			@Pc(179) Class134 local179;
			if (arg0 == 5003) {
				local175 = anIntArray523[--anInt8974];
				local179 = Static264.method4152(local175);
				local181 = "";
				if (local179 != null && local179.aString74 != null) {
					local181 = local179.aString74;
				}
				aStringArray35[anInt8965++] = local181;
				return;
			}
			if (arg0 == 5004) {
				local175 = anIntArray523[--anInt8974];
				local179 = Static264.method4152(local175);
				local97 = -1;
				if (local179 != null) {
					local97 = local179.anInt3811;
				}
				anIntArray523[anInt8974++] = local97;
				return;
			}
			if (arg0 == 5005) {
				if (Static182.aClass176_1 == null) {
					anIntArray523[anInt8974++] = -1;
					return;
				}
				anIntArray523[anInt8974++] = Static182.aClass176_1.anInt5329;
				return;
			}
			@Pc(269) Class4_Sub39 local269;
			if (arg0 == 5006) {
				local175 = anIntArray523[--anInt8974];
				local269 = Static32.method999(Static402.aClass356_1, Static330.aClass344_57);
				local269.aClass4_Sub13_Sub2_1.method7052(local175);
				Static50.method1166(local269);
				return;
			}
			if (arg0 == 5008) {
				local83 = aStringArray35[--anInt8965];
				method6877(local83, arg0);
				return;
			}
			if (arg0 == 5009) {
				anInt8965 -= 2;
				local83 = aStringArray35[anInt8965];
				local89 = aStringArray35[anInt8965 + 1];
				if (Static100.anInt2432 != 0 || (!Static337.aBoolean442 || Static477.aBoolean628) && !Static16.aBoolean432) {
					@Pc(328) Class4_Sub39 local328 = Static32.method999(Static402.aClass356_1, Static248.aClass344_36);
					local328.aClass4_Sub13_Sub2_1.method7052(0);
					local103 = local328.aClass4_Sub13_Sub2_1.anInt9170;
					local328.aClass4_Sub13_Sub2_1.method7002(local83);
					Static335.method5120(local89, local328.aClass4_Sub13_Sub2_1);
					local328.aClass4_Sub13_Sub2_1.method6991(local328.aClass4_Sub13_Sub2_1.anInt9170 - local103);
					Static50.method1166(local328);
					return;
				}
				return;
			}
			if (arg0 == 5010) {
				local175 = anIntArray523[--anInt8974];
				local179 = Static264.method4152(local175);
				local181 = "";
				if (local179 != null && local179.aString77 != null) {
					local181 = local179.aString77;
				}
				aStringArray35[anInt8965++] = local181;
				return;
			}
			if (arg0 == 5011) {
				local175 = anIntArray523[--anInt8974];
				local179 = Static264.method4152(local175);
				local181 = "";
				if (local179 != null && local179.aString76 != null) {
					local181 = local179.aString76;
				}
				aStringArray35[anInt8965++] = local181;
				return;
			}
			if (arg0 == 5012) {
				local175 = anIntArray523[--anInt8974];
				local179 = Static264.method4152(local175);
				local97 = -1;
				if (local179 != null) {
					local97 = local179.anInt3816;
				}
				anIntArray523[anInt8974++] = local97;
				return;
			}
			if (arg0 == 5015) {
				if (Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2 == null || Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2.aString88 == null) {
					local83 = Static544.aString215;
				} else {
					local83 = Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2.method3345();
				}
				aStringArray35[anInt8965++] = local83;
				return;
			}
			if (arg0 == 5016) {
				anIntArray523[anInt8974++] = Static311.anInt6268;
				return;
			}
			if (arg0 == 5017) {
				anIntArray523[anInt8974++] = Static3.method33();
				return;
			}
			if (arg0 == 5018) {
				local175 = anIntArray523[--anInt8974];
				local179 = Static264.method4152(local175);
				local97 = 0;
				if (local179 != null) {
					local97 = local179.anInt3812;
				}
				anIntArray523[anInt8974++] = local97;
				return;
			}
			if (arg0 == 5019) {
				local175 = anIntArray523[--anInt8974];
				local179 = Static264.method4152(local175);
				local181 = "";
				if (local179 != null && local179.aString73 != null) {
					local181 = local179.aString73;
				}
				aStringArray35[anInt8965++] = local181;
				return;
			}
			if (arg0 == 5020) {
				if (Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2 == null || Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2.aString88 == null) {
					local83 = Static544.aString215;
				} else {
					local83 = Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2.method3348();
				}
				aStringArray35[anInt8965++] = local83;
				return;
			}
			if (arg0 == 5023) {
				local175 = anIntArray523[--anInt8974];
				local179 = Static264.method4152(local175);
				local97 = -1;
				if (local179 != null) {
					local97 = local179.anInt3815;
				}
				anIntArray523[anInt8974++] = local97;
				return;
			}
			if (arg0 == 5024) {
				local175 = anIntArray523[--anInt8974];
				local179 = Static264.method4152(local175);
				local97 = -1;
				if (local179 != null) {
					local97 = local179.anInt3810;
				}
				anIntArray523[anInt8974++] = local97;
				return;
			}
			if (arg0 == 5025) {
				local175 = anIntArray523[--anInt8974];
				local179 = Static264.method4152(local175);
				local181 = "";
				if (local179 != null && local179.aString75 != null) {
					local181 = local179.aString75;
				}
				aStringArray35[anInt8965++] = local181;
				return;
			}
			if (arg0 == 5050) {
				local175 = anIntArray523[--anInt8974];
				aStringArray35[anInt8965++] = Static89.aClass224_1.method5097(local175).aString25;
				return;
			}
			@Pc(736) Class4_Sub6_Sub2 local736;
			if (arg0 == 5051) {
				local175 = anIntArray523[--anInt8974];
				local736 = Static89.aClass224_1.method5097(local175);
				if (local736.anIntArray73 == null) {
					anIntArray523[anInt8974++] = 0;
					return;
				}
				anIntArray523[anInt8974++] = local736.anIntArray73.length;
				return;
			}
			if (arg0 == 5052) {
				anInt8974 -= 2;
				local175 = anIntArray523[anInt8974];
				local776 = anIntArray523[anInt8974 + 1];
				@Pc(781) Class4_Sub6_Sub2 local781 = Static89.aClass224_1.method5097(local175);
				local103 = local781.anIntArray73[local776];
				anIntArray523[anInt8974++] = local103;
				return;
			}
			if (arg0 == 5053) {
				local175 = anIntArray523[--anInt8974];
				local736 = Static89.aClass224_1.method5097(local175);
				if (local736.anIntArray72 == null) {
					anIntArray523[anInt8974++] = 0;
					return;
				}
				anIntArray523[anInt8974++] = local736.anIntArray72.length;
				return;
			}
			if (arg0 == 5054) {
				anInt8974 -= 2;
				local175 = anIntArray523[anInt8974];
				local776 = anIntArray523[anInt8974 + 1];
				anIntArray523[anInt8974++] = Static89.aClass224_1.method5097(local175).anIntArray72[local776];
				return;
			}
			if (arg0 == 5055) {
				local175 = anIntArray523[--anInt8974];
				aStringArray35[anInt8965++] = Static115.aClass213_2.method5000(local175).method1925();
				return;
			}
			if (arg0 == 5056) {
				local175 = anIntArray523[--anInt8974];
				@Pc(907) Class4_Sub6_Sub3 local907 = Static115.aClass213_2.method5000(local175);
				if (local907.anIntArray117 == null) {
					anIntArray523[anInt8974++] = 0;
					return;
				}
				anIntArray523[anInt8974++] = local907.anIntArray117.length;
				return;
			}
			if (arg0 == 5057) {
				anInt8974 -= 2;
				local175 = anIntArray523[anInt8974];
				local776 = anIntArray523[anInt8974 + 1];
				anIntArray523[anInt8974++] = Static115.aClass213_2.method5000(local175).anIntArray117[local776];
				return;
			}
			if (arg0 == 5058) {
				aClass251_1 = new Class251();
				aClass251_1.anInt7473 = anIntArray523[--anInt8974];
				aClass251_1.aClass4_Sub6_Sub3_1 = Static115.aClass213_2.method5000(aClass251_1.anInt7473);
				aClass251_1.anIntArray405 = new int[aClass251_1.aClass4_Sub6_Sub3_1.method1919()];
				return;
			}
			if (arg0 == 5059) {
				local52 = Static32.method999(Static402.aClass356_1, Static423.aClass344_74);
				local52.aClass4_Sub13_Sub2_1.method7052(0);
				local776 = local52.aClass4_Sub13_Sub2_1.anInt9170;
				local52.aClass4_Sub13_Sub2_1.method7052(0);
				local52.aClass4_Sub13_Sub2_1.method7038(aClass251_1.anInt7473);
				aClass251_1.aClass4_Sub6_Sub3_1.method1924(local52.aClass4_Sub13_Sub2_1, aClass251_1.anIntArray405);
				local52.aClass4_Sub13_Sub2_1.method6991(local52.aClass4_Sub13_Sub2_1.anInt9170 - local776);
				Static50.method1166(local52);
				return;
			}
			if (arg0 == 5060) {
				local83 = aStringArray35[--anInt8965];
				local269 = Static32.method999(Static402.aClass356_1, Static419.aClass344_73);
				local269.aClass4_Sub13_Sub2_1.method7052(0);
				local97 = local269.aClass4_Sub13_Sub2_1.anInt9170;
				local269.aClass4_Sub13_Sub2_1.method7002(local83);
				local269.aClass4_Sub13_Sub2_1.method7038(aClass251_1.anInt7473);
				aClass251_1.aClass4_Sub6_Sub3_1.method1924(local269.aClass4_Sub13_Sub2_1, aClass251_1.anIntArray405);
				local269.aClass4_Sub13_Sub2_1.method6991(local269.aClass4_Sub13_Sub2_1.anInt9170 - local97);
				Static50.method1166(local269);
				return;
			}
			if (arg0 == 5061) {
				local52 = Static32.method999(Static402.aClass356_1, Static423.aClass344_74);
				local52.aClass4_Sub13_Sub2_1.method7052(0);
				local776 = local52.aClass4_Sub13_Sub2_1.anInt9170;
				local52.aClass4_Sub13_Sub2_1.method7052(1);
				local52.aClass4_Sub13_Sub2_1.method7038(aClass251_1.anInt7473);
				aClass251_1.aClass4_Sub6_Sub3_1.method1924(local52.aClass4_Sub13_Sub2_1, aClass251_1.anIntArray405);
				local52.aClass4_Sub13_Sub2_1.method6991(local52.aClass4_Sub13_Sub2_1.anInt9170 - local776);
				Static50.method1166(local52);
				return;
			}
			if (arg0 == 5062) {
				anInt8974 -= 2;
				local175 = anIntArray523[anInt8974];
				local776 = anIntArray523[anInt8974 + 1];
				anIntArray523[anInt8974++] = Static89.aClass224_1.method5097(local175).aCharArray2[local776];
				return;
			}
			if (arg0 == 5063) {
				anInt8974 -= 2;
				local175 = anIntArray523[anInt8974];
				local776 = anIntArray523[anInt8974 + 1];
				anIntArray523[anInt8974++] = Static89.aClass224_1.method5097(local175).aCharArray1[local776];
				return;
			}
			if (arg0 == 5064) {
				anInt8974 -= 2;
				local175 = anIntArray523[anInt8974];
				local776 = anIntArray523[anInt8974 + 1];
				if (local776 == -1) {
					anIntArray523[anInt8974++] = -1;
					return;
				}
				anIntArray523[anInt8974++] = Static89.aClass224_1.method5097(local175).method1511((char) local776);
				return;
			}
			if (arg0 == 5065) {
				anInt8974 -= 2;
				local175 = anIntArray523[anInt8974];
				local776 = anIntArray523[anInt8974 + 1];
				if (local776 == -1) {
					anIntArray523[anInt8974++] = -1;
					return;
				}
				anIntArray523[anInt8974++] = Static89.aClass224_1.method5097(local175).method1507((char) local776);
				return;
			}
			if (arg0 == 5066) {
				local175 = anIntArray523[--anInt8974];
				anIntArray523[anInt8974++] = Static115.aClass213_2.method5000(local175).method1919();
				return;
			}
			if (arg0 == 5067) {
				anInt8974 -= 2;
				local175 = anIntArray523[anInt8974];
				local776 = anIntArray523[anInt8974 + 1];
				local97 = Static115.aClass213_2.method5000(local175).method1922(local776).anInt2256;
				anIntArray523[anInt8974++] = local97;
				return;
			}
			if (arg0 == 5068) {
				anInt8974 -= 2;
				local175 = anIntArray523[anInt8974];
				local776 = anIntArray523[anInt8974 + 1];
				aClass251_1.anIntArray405[local175] = local776;
				return;
			}
			if (arg0 == 5069) {
				anInt8974 -= 2;
				local175 = anIntArray523[anInt8974];
				local776 = anIntArray523[anInt8974 + 1];
				aClass251_1.anIntArray405[local175] = local776;
				return;
			}
			if (arg0 == 5070) {
				anInt8974 -= 3;
				local175 = anIntArray523[anInt8974];
				local776 = anIntArray523[anInt8974 + 1];
				local97 = anIntArray523[anInt8974 + 2];
				@Pc(1448) Class4_Sub6_Sub3 local1448 = Static115.aClass213_2.method5000(local175);
				if (local1448.method1922(local776).anInt2256 != 0) {
					throw new RuntimeException("bad command");
				}
				anIntArray523[anInt8974++] = local1448.method1917(local97, local776);
				return;
			}
			if (arg0 == 5071) {
				local83 = aStringArray35[--anInt8965];
				local1496 = anIntArray523[--anInt8974] == 1;
				Static562.method7948(local1496, local83);
				anIntArray523[anInt8974++] = Static393.anInt7666;
				return;
			}
			if (arg0 == 5072) {
				if (Static519.aShortArray130 != null && Static191.anInt3979 < Static393.anInt7666) {
					anIntArray523[anInt8974++] = Static519.aShortArray130[Static191.anInt3979++] & 0xFFFF;
					return;
				}
				anIntArray523[anInt8974++] = -1;
				return;
			}
			if (arg0 == 5073) {
				Static191.anInt3979 = 0;
				return;
			}
		} else if (arg0 < 5200) {
			if (arg0 == 5100) {
				if (Static38.aClass174_1.method4090(86)) {
					anIntArray523[anInt8974++] = 1;
					return;
				}
				anIntArray523[anInt8974++] = 0;
				return;
			}
			if (arg0 == 5101) {
				if (Static38.aClass174_1.method4090(82)) {
					anIntArray523[anInt8974++] = 1;
					return;
				}
				anIntArray523[anInt8974++] = 0;
				return;
			}
			if (arg0 == 5102) {
				if (Static38.aClass174_1.method4090(81)) {
					anIntArray523[anInt8974++] = 1;
					return;
				}
				anIntArray523[anInt8974++] = 0;
				return;
			}
		} else {
			@Pc(2833) int local2833;
			@Pc(2107) boolean local2107;
			if (arg0 < 5300) {
				if (arg0 == 5200) {
					Static103.method1968(anIntArray523[--anInt8974]);
					return;
				}
				if (arg0 == 5201) {
					anIntArray523[anInt8974++] = Static280.method4481();
					return;
				}
				if (arg0 == 5205) {
					Static231.method3755(-1, false, anIntArray523[--anInt8974], -1);
					return;
				}
				@Pc(1696) Class4_Sub6_Sub16 local1696;
				if (arg0 == 5206) {
					local175 = anIntArray523[--anInt8974];
					local1696 = Static572.method7764(local175 >> 14 & 0x3FFF, local175 & 0x3FFF);
					if (local1696 == null) {
						anIntArray523[anInt8974++] = -1;
						return;
					}
					anIntArray523[anInt8974++] = local1696.anInt8098;
					return;
				}
				@Pc(1729) Class4_Sub6_Sub16 local1729;
				if (arg0 == 5207) {
					local1729 = Static572.method7752(anIntArray523[--anInt8974]);
					if (local1729 != null && local1729.aString166 != null) {
						aStringArray35[anInt8965++] = local1729.aString166;
						return;
					}
					aStringArray35[anInt8965++] = "";
					return;
				}
				if (arg0 == 5208) {
					anIntArray523[anInt8974++] = Static366.anInt7070;
					anIntArray523[anInt8974++] = Static481.anInt9094;
					return;
				}
				if (arg0 == 5209) {
					anIntArray523[anInt8974++] = Static43.anInt2490 + Static572.anInt10056;
					anIntArray523[anInt8974++] = Static555.anInt10135 + Static572.anInt10059;
					return;
				}
				if (arg0 == 5210) {
					local175 = anIntArray523[--anInt8974];
					local1696 = Static572.method7752(local175);
					if (local1696 == null) {
						anIntArray523[anInt8974++] = 0;
						anIntArray523[anInt8974++] = 0;
						return;
					}
					anIntArray523[anInt8974++] = local1696.anInt8097 >> 14 & 0x3FFF;
					anIntArray523[anInt8974++] = local1696.anInt8097 & 0x3FFF;
					return;
				}
				if (arg0 == 5211) {
					local175 = anIntArray523[--anInt8974];
					local1696 = Static572.method7752(local175);
					if (local1696 == null) {
						anIntArray523[anInt8974++] = 0;
						anIntArray523[anInt8974++] = 0;
						return;
					}
					anIntArray523[anInt8974++] = local1696.anInt8095 - local1696.anInt8096;
					anIntArray523[anInt8974++] = local1696.anInt8105 - local1696.anInt8103;
					return;
				}
				@Pc(1919) Class4_Sub20 local1919;
				if (arg0 == 5212) {
					local1919 = Static440.method6501();
					if (local1919 == null) {
						anIntArray523[anInt8974++] = -1;
						anIntArray523[anInt8974++] = -1;
						return;
					}
					anIntArray523[anInt8974++] = local1919.anInt3266;
					local776 = local1919.anInt3265 << 28 | local1919.anInt3263 + Static572.anInt10056 << 14 | local1919.anInt3264 + Static572.anInt10059;
					anIntArray523[anInt8974++] = local776;
					return;
				}
				if (arg0 == 5213) {
					local1919 = Static135.method2443();
					if (local1919 == null) {
						anIntArray523[anInt8974++] = -1;
						anIntArray523[anInt8974++] = -1;
						return;
					}
					anIntArray523[anInt8974++] = local1919.anInt3266;
					local776 = local1919.anInt3265 << 28 | local1919.anInt3263 + Static572.anInt10056 << 14 | local1919.anInt3264 + Static572.anInt10059;
					anIntArray523[anInt8974++] = local776;
					return;
				}
				@Pc(2067) boolean local2067;
				if (arg0 == 5214) {
					local175 = anIntArray523[--anInt8974];
					local1696 = Static267.method4195();
					if (local1696 != null) {
						local2067 = local1696.method6311(local175 & 0x3FFF, local175 >> 28 & 0x3, local175 >> 14 & 0x3FFF, anIntArray525);
						if (local2067) {
							Static514.method5485(anIntArray525[1], anIntArray525[2]);
						}
					}
					return;
				}
				if (arg0 == 5215) {
					anInt8974 -= 2;
					local175 = anIntArray523[anInt8974];
					local776 = anIntArray523[anInt8974 + 1];
					@Pc(2105) Class120 local2105 = Static572.method7766(local175 >> 14 & 0x3FFF, local175 & 0x3FFF);
					local2107 = false;
					for (@Pc(2112) Class4_Sub6_Sub16 local2112 = (Class4_Sub6_Sub16) local2105.method2674(); local2112 != null; local2112 = (Class4_Sub6_Sub16) local2105.method2671()) {
						if (local2112.anInt8098 == local776) {
							local2107 = true;
							break;
						}
					}
					if (local2107) {
						anIntArray523[anInt8974++] = 1;
						return;
					}
					anIntArray523[anInt8974++] = 0;
					return;
				}
				if (arg0 == 5218) {
					local175 = anIntArray523[--anInt8974];
					local1696 = Static572.method7752(local175);
					if (local1696 == null) {
						anIntArray523[anInt8974++] = -1;
						return;
					}
					anIntArray523[anInt8974++] = local1696.anInt8093;
					return;
				}
				if (arg0 == 5220) {
					anIntArray523[anInt8974++] = Static142.anInt3092 == 100 ? 1 : 0;
					return;
				}
				if (arg0 == 5221) {
					local175 = anIntArray523[--anInt8974];
					Static514.method5485(local175 >> 14 & 0x3FFF, local175 & 0x3FFF);
					return;
				}
				if (arg0 == 5222) {
					local1729 = Static267.method4195();
					if (local1729 != null) {
						local1496 = local1729.method6315(anIntArray525, Static43.anInt2490 + Static572.anInt10056, Static555.anInt10135 + Static572.anInt10059);
						if (local1496) {
							anIntArray523[anInt8974++] = anIntArray525[1];
							anIntArray523[anInt8974++] = anIntArray525[2];
							return;
						}
						anIntArray523[anInt8974++] = -1;
						anIntArray523[anInt8974++] = -1;
						return;
					}
					anIntArray523[anInt8974++] = -1;
					anIntArray523[anInt8974++] = -1;
					return;
				}
				if (arg0 == 5223) {
					anInt8974 -= 2;
					local175 = anIntArray523[anInt8974];
					local776 = anIntArray523[anInt8974 + 1];
					Static231.method3755(local776 >> 14 & 0x3FFF, false, local175, local776 & 0x3FFF);
					return;
				}
				if (arg0 == 5224) {
					local175 = anIntArray523[--anInt8974];
					local1696 = Static267.method4195();
					if (local1696 != null) {
						local2067 = local1696.method6311(local175 & 0x3FFF, local175 >> 28 & 0x3, local175 >> 14 & 0x3FFF, anIntArray525);
						if (local2067) {
							anIntArray523[anInt8974++] = anIntArray525[1];
							anIntArray523[anInt8974++] = anIntArray525[2];
							return;
						}
						anIntArray523[anInt8974++] = -1;
						anIntArray523[anInt8974++] = -1;
						return;
					}
					anIntArray523[anInt8974++] = -1;
					anIntArray523[anInt8974++] = -1;
					return;
				}
				if (arg0 == 5225) {
					local175 = anIntArray523[--anInt8974];
					local1696 = Static267.method4195();
					if (local1696 != null) {
						local2067 = local1696.method6315(anIntArray525, local175 >> 14 & 0x3FFF, local175 & 0x3FFF);
						if (local2067) {
							anIntArray523[anInt8974++] = anIntArray525[1];
							anIntArray523[anInt8974++] = anIntArray525[2];
							return;
						}
						anIntArray523[anInt8974++] = -1;
						anIntArray523[anInt8974++] = -1;
						return;
					}
					anIntArray523[anInt8974++] = -1;
					anIntArray523[anInt8974++] = -1;
					return;
				}
				if (arg0 == 5226) {
					Static22.method7566(anIntArray523[--anInt8974]);
					return;
				}
				if (arg0 == 5227) {
					anInt8974 -= 2;
					local175 = anIntArray523[anInt8974];
					local776 = anIntArray523[anInt8974 + 1];
					Static231.method3755(local776 >> 14 & 0x3FFF, true, local175, local776 & 0x3FFF);
					return;
				}
				if (arg0 == 5228) {
					Static137.aBoolean227 = anIntArray523[--anInt8974] == 1;
					return;
				}
				if (arg0 == 5229) {
					anIntArray523[anInt8974++] = Static137.aBoolean227 ? 1 : 0;
					return;
				}
				if (arg0 == 5230) {
					local175 = anIntArray523[--anInt8974];
					Static545.method7646(local175);
					return;
				}
				@Pc(2625) Class4 local2625;
				if (arg0 == 5231) {
					anInt8974 -= 2;
					local175 = anIntArray523[anInt8974];
					local1496 = anIntArray523[anInt8974 + 1] == 1;
					if (Static438.aClass221_30 != null) {
						local2625 = Static438.aClass221_30.method5075((long) local175);
						if (local2625 != null && !local1496) {
							local2625.method8193();
							return;
						}
						if (local2625 == null && local1496) {
							local2625 = new Class4();
							Static438.aClass221_30.method5073(local2625, (long) local175);
						}
					}
					return;
				}
				@Pc(2667) Class4 local2667;
				if (arg0 == 5232) {
					local175 = anIntArray523[--anInt8974];
					if (Static438.aClass221_30 != null) {
						local2667 = Static438.aClass221_30.method5075((long) local175);
						anIntArray523[anInt8974++] = local2667 == null ? 0 : 1;
						return;
					}
					anIntArray523[anInt8974++] = 0;
					return;
				}
				if (arg0 == 5233) {
					anInt8974 -= 2;
					local175 = anIntArray523[anInt8974];
					local1496 = anIntArray523[anInt8974 + 1] == 1;
					if (Static314.aClass221_20 != null) {
						local2625 = Static314.aClass221_20.method5075((long) local175);
						if (local2625 != null && !local1496) {
							local2625.method8193();
							return;
						}
						if (local2625 == null && local1496) {
							local2625 = new Class4();
							Static314.aClass221_20.method5073(local2625, (long) local175);
						}
					}
					return;
				}
				if (arg0 == 5234) {
					local175 = anIntArray523[--anInt8974];
					if (Static314.aClass221_20 != null) {
						local2667 = Static314.aClass221_20.method5075((long) local175);
						anIntArray523[anInt8974++] = local2667 == null ? 0 : 1;
						return;
					}
					anIntArray523[anInt8974++] = 0;
					return;
				}
				if (arg0 == 5235) {
					anIntArray523[anInt8974++] = Static572.aClass4_Sub6_Sub16_3 == null ? -1 : Static572.aClass4_Sub6_Sub16_3.anInt8098;
					return;
				}
				if (arg0 == 5236) {
					anInt8974 -= 2;
					local175 = anIntArray523[anInt8974];
					local776 = anIntArray523[anInt8974 + 1];
					local97 = local776 >> 14 & 0x3FFF;
					local103 = local776 & 0x3FFF;
					local2833 = Static54.method1273(local175, local103, local97);
					if (local2833 < 0) {
						anIntArray523[anInt8974++] = -1;
						return;
					}
					anIntArray523[anInt8974++] = local2833;
					return;
				}
				if (arg0 == 5237) {
					Static139.method2486();
					return;
				}
			} else if (arg0 < 5400) {
				if (arg0 == 5300) {
					anInt8974 -= 2;
					local175 = anIntArray523[anInt8974];
					local776 = anIntArray523[anInt8974 + 1];
					Static503.method7242(local776, 3, false, local175);
					anIntArray523[anInt8974++] = Static514.aFrame2 == null ? 0 : 1;
					return;
				}
				if (arg0 == 5301) {
					if (Static514.aFrame2 != null) {
						Static503.method7242(-1, Static455.aClass4_Sub35_Sub1_1.anInt9917, false, -1);
					}
					return;
				}
				if (arg0 == 5302) {
					@Pc(2917) Class77[] local2917 = Static358.method5399();
					anIntArray523[anInt8974++] = local2917.length;
					return;
				}
				if (arg0 == 5303) {
					local175 = anIntArray523[--anInt8974];
					@Pc(2941) Class77[] local2941 = Static358.method5399();
					anIntArray523[anInt8974++] = local2941[local175].anInt2399;
					anIntArray523[anInt8974++] = local2941[local175].anInt2396;
					return;
				}
				if (arg0 == 5305) {
					local175 = Static455.aClass4_Sub35_Sub1_1.anInt9919;
					local776 = Static455.aClass4_Sub35_Sub1_1.anInt9912;
					local97 = -1;
					@Pc(2978) Class77[] local2978 = Static358.method5399();
					for (local2833 = 0; local2833 < local2978.length; local2833++) {
						@Pc(2985) Class77 local2985 = local2978[local2833];
						if (local2985.anInt2399 == local175 && local2985.anInt2396 == local776) {
							local97 = local2833;
							break;
						}
					}
					anIntArray523[anInt8974++] = local97;
					return;
				}
				if (arg0 == 5306) {
					anIntArray523[anInt8974++] = Static578.method8122();
					return;
				}
				if (arg0 == 5307) {
					local175 = anIntArray523[--anInt8974];
					if (local175 >= 1 && local175 <= 2) {
						Static503.method7242(-1, local175, false, -1);
						return;
					}
					return;
				}
				if (arg0 == 5308) {
					anIntArray523[anInt8974++] = Static455.aClass4_Sub35_Sub1_1.anInt9917;
					return;
				}
				if (arg0 == 5309) {
					local175 = anIntArray523[--anInt8974];
					if (local175 >= 1 && local175 <= 2) {
						Static455.aClass4_Sub35_Sub1_1.anInt9917 = local175;
						Static455.aClass4_Sub35_Sub1_1.method7631(Static372.aClass366_5);
						return;
					}
					return;
				}
			} else if (arg0 < 5500) {
				if (arg0 == 5400) {
					anInt8965 -= 2;
					local83 = aStringArray35[anInt8965];
					local89 = aStringArray35[anInt8965 + 1];
					local97 = anIntArray523[--anInt8974];
					@Pc(3124) Class4_Sub39 local3124 = Static32.method999(Static402.aClass356_1, Static575.aClass344_100);
					local3124.aClass4_Sub13_Sub2_1.method7052(Static393.method6014(local83) + Static393.method6014(local89) + 1);
					local3124.aClass4_Sub13_Sub2_1.method7002(local83);
					local3124.aClass4_Sub13_Sub2_1.method7002(local89);
					local3124.aClass4_Sub13_Sub2_1.method7052(local97);
					Static50.method1166(local3124);
					return;
				}
				if (arg0 == 5401) {
					anInt8974 -= 2;
					Static353.aShortArray89[anIntArray523[anInt8974]] = (short) Static313.method4937(anIntArray523[anInt8974 + 1]);
					Static338.aClass29_1.method980();
					Static338.aClass29_1.method989();
					Class21_Sub1_Sub2_Sub1.lb.method4987();
					Static533.method7519();
					return;
				}
				if (arg0 == 5405) {
					anInt8974 -= 2;
					local175 = anIntArray523[anInt8974];
					local776 = anIntArray523[anInt8974 + 1];
					if (local175 >= 0 && local175 < 2) {
						Static576.anIntArrayArrayArray24[local175] = new int[local776 << 1][4];
					}
					return;
				}
				if (arg0 == 5406) {
					anInt8974 -= 7;
					local175 = anIntArray523[anInt8974];
					local776 = anIntArray523[anInt8974 + 1] << 1;
					local97 = anIntArray523[anInt8974 + 2];
					local103 = anIntArray523[anInt8974 + 3];
					local2833 = anIntArray523[anInt8974 + 4];
					@Pc(3262) int local3262 = anIntArray523[anInt8974 + 5];
					@Pc(3268) int local3268 = anIntArray523[anInt8974 + 6];
					if (local175 >= 0 && local175 < 2 && Static576.anIntArrayArrayArray24[local175] != null && local776 >= 0 && local776 < Static576.anIntArrayArrayArray24[local175].length) {
						Static576.anIntArrayArrayArray24[local175][local776] = new int[] { (local97 >> 14 & 0x3FFF) << 9, local103 << 2, (local97 & 0x3FFF) << 9, local3268 };
						Static576.anIntArrayArrayArray24[local175][local776 + 1] = new int[] { (local2833 >> 14 & 0x3FFF) << 9, local3262 << 2, (local2833 & 0x3FFF) << 9 };
					}
					return;
				}
				if (arg0 == 5407) {
					local175 = Static576.anIntArrayArrayArray24[anIntArray523[--anInt8974]].length >> 1;
					anIntArray523[anInt8974++] = local175;
					return;
				}
				if (arg0 == 5411) {
					if (Static514.aFrame2 != null) {
						Static503.method7242(-1, Static455.aClass4_Sub35_Sub1_1.anInt9917, false, -1);
					}
					if (Static402.aFrame3 != null) {
						Static573.method8080();
						System.exit(0);
						return;
					}
					local83 = Static414.aString163 == null ? Static289.method4601() : Static414.aString163;
					Static279.method4476(false, Static372.aClass366_5, local83, Static453.anInt8614 == 1);
					return;
				}
				if (arg0 == 5419) {
					local83 = "";
					if (Static412.aClass316_6 != null) {
						if (Static412.aClass316_6.anObject136 == null) {
							local83 = Static193.method3174(Static412.aClass316_6.anInt9477);
						} else {
							local83 = (String) Static412.aClass316_6.anObject136;
						}
					}
					aStringArray35[anInt8965++] = local83;
					return;
				}
				if (arg0 == 5420) {
					anIntArray523[anInt8974++] = Static372.aClass366_5.aBoolean719 ? 0 : 1;
					return;
				}
				if (arg0 == 5421) {
					if (Static514.aFrame2 != null) {
						Static503.method7242(-1, Static455.aClass4_Sub35_Sub1_1.anInt9917, false, -1);
					}
					local83 = aStringArray35[--anInt8965];
					local1496 = anIntArray523[--anInt8974] == 1;
					local181 = Static289.method4601() + local83;
					Static279.method4476(local1496, Static372.aClass366_5, local181, Static453.anInt8614 == 1);
					return;
				}
				if (arg0 == 5422) {
					anInt8965 -= 2;
					local83 = aStringArray35[anInt8965];
					local89 = aStringArray35[anInt8965 + 1];
					local97 = anIntArray523[--anInt8974];
					if (local83.length() > 0) {
						if (Static264.aStringArray19 == null) {
							Static264.aStringArray19 = new String[Static528.anIntArray549[Static162.aClass128_1.anInt3622]];
						}
						Static264.aStringArray19[local97] = local83;
					}
					if (local89.length() > 0) {
						if (Static64.aStringArray4 == null) {
							Static64.aStringArray4 = new String[Static528.anIntArray549[Static162.aClass128_1.anInt3622]];
						}
						Static64.aStringArray4[local97] = local89;
					}
					return;
				}
				if (arg0 == 5423) {
					System.out.println(aStringArray35[--anInt8965]);
					return;
				}
				if (arg0 == 5424) {
					anInt8974 -= 11;
					Static548.anInt10019 = anIntArray523[anInt8974];
					Static579.anInt10413 = anIntArray523[anInt8974 + 1];
					Static113.anInt2576 = anIntArray523[anInt8974 + 2];
					Static220.anInt9344 = anIntArray523[anInt8974 + 3];
					Static527.anInt9680 = anIntArray523[anInt8974 + 4];
					Static153.anInt3262 = anIntArray523[anInt8974 + 5];
					Static174.anInt3681 = anIntArray523[anInt8974 + 6];
					Static29.anInt1116 = anIntArray523[anInt8974 + 7];
					Static161.anInt3349 = anIntArray523[anInt8974 + 8];
					Static94.anInt2379 = anIntArray523[anInt8974 + 9];
					Static118.anInt2711 = anIntArray523[anInt8974 + 10];
					Static159.aClass348_38.method7960(Static527.anInt9680);
					Static159.aClass348_38.method7960(Static153.anInt3262);
					Static159.aClass348_38.method7960(Static174.anInt3681);
					Static159.aClass348_38.method7960(Static29.anInt1116);
					Static159.aClass348_38.method7960(Static161.anInt3349);
					Static214.aClass88_13 = null;
					Static144.aClass88_10 = null;
					Static524.aClass88_31 = null;
					Static337.aClass88_18 = null;
					Static189.aClass88_12 = null;
					Static322.aClass88_17 = null;
					Static244.aClass88_30 = null;
					Static175.aClass88_11 = null;
					Static70.aBoolean150 = true;
					return;
				}
				if (arg0 == 5425) {
					Static308.method4883();
					Static70.aBoolean150 = false;
					return;
				}
				if (arg0 == 5426) {
					anInt8974 -= 2;
					Static538.anInt9806 = anIntArray523[anInt8974];
					Static542.anInt9892 = anIntArray523[anInt8974 + 1];
					return;
				}
				if (arg0 == 5427) {
					anInt8974 -= 2;
					Static112.anInt2571 = anIntArray523[anInt8974 + 1];
					return;
				}
				if (arg0 == 5428) {
					anInt8974 -= 2;
					local175 = anIntArray523[anInt8974];
					local776 = anIntArray523[anInt8974 + 1];
					anIntArray523[anInt8974++] = Static233.method3769(local776, local175) ? 1 : 0;
					return;
				}
				if (arg0 == 5429) {
					Static299.method4762(false, false, aStringArray35[--anInt8965]);
					return;
				}
				if (arg0 == 5430) {
					try {
						Static597.method1279(Static589.anApplet2, "accountcreated");
						return;
					} catch (@Pc(3800) Throwable local3800) {
						return;
					}
				}
				if (arg0 == 5431) {
					try {
						Static597.method1279(Static589.anApplet2, "accountcreatestarted");
						return;
					} catch (@Pc(3811) Throwable local3811) {
						return;
					}
				}
				if (arg0 == 5432) {
					local83 = "";
					if (Static499.aClipboard3 != null) {
						@Pc(3823) Transferable local3823 = Static499.aClipboard3.getContents(null);
						if (local3823 != null) {
							try {
								local83 = (String) local3823.getTransferData(DataFlavor.stringFlavor);
								if (local83 == null) {
									local83 = "";
								}
							} catch (@Pc(3836) Exception local3836) {
							}
						}
					}
					aStringArray35[anInt8965++] = local83;
					return;
				}
			} else if (arg0 < 5600) {
				if (arg0 == 5500) {
					anInt8974 -= 4;
					local175 = anIntArray523[anInt8974];
					local776 = anIntArray523[anInt8974 + 1];
					local97 = anIntArray523[anInt8974 + 2];
					local103 = anIntArray523[anInt8974 + 3];
					Static374.method5813(local776 << 2, false, (local175 >> 14 & 0x3FFF) - Static242.anInt10133, local97, local103, (local175 & 0x3FFF) - Static157.anInt3323);
					return;
				}
				if (arg0 == 5501) {
					anInt8974 -= 4;
					local175 = anIntArray523[anInt8974];
					local776 = anIntArray523[anInt8974 + 1];
					local97 = anIntArray523[anInt8974 + 2];
					local103 = anIntArray523[anInt8974 + 3];
					Static81.method7678(local97, local776 << 2, (local175 >> 14 & 0x3FFF) - Static242.anInt10133, local103, (local175 & 0x3FFF) - Static157.anInt3323);
					return;
				}
				if (arg0 == 5502) {
					anInt8974 -= 6;
					local175 = anIntArray523[anInt8974];
					if (local175 >= 2) {
						throw new RuntimeException();
					}
					Static166.anInt3460 = local175;
					local776 = anIntArray523[anInt8974 + 1];
					if (local776 + 1 >= Static576.anIntArrayArrayArray24[Static166.anInt3460].length >> 1) {
						throw new RuntimeException();
					}
					Static237.anInt4969 = local776;
					Static528.anInt9684 = 0;
					Static506.anInt9467 = anIntArray523[anInt8974 + 2];
					Static257.anInt5231 = anIntArray523[anInt8974 + 3];
					local97 = anIntArray523[anInt8974 + 4];
					if (local97 >= 2) {
						throw new RuntimeException();
					}
					Static456.anInt8707 = local97;
					local103 = anIntArray523[anInt8974 + 5];
					if (local103 + 1 >= Static576.anIntArrayArrayArray24[Static456.anInt8707].length >> 1) {
						throw new RuntimeException();
					}
					Static435.anInt8345 = local103;
					Static300.anInt6053 = 3;
					Static453.anInt8613 = -1;
					Static587.anInt10508 = -1;
					return;
				}
				if (arg0 == 5503) {
					Static398.method6101();
					return;
				}
				if (arg0 == 5504) {
					anInt8974 -= 2;
					Static569.method6002(anIntArray523[anInt8974], anIntArray523[anInt8974 + 1]);
					return;
				}
				if (arg0 == 5505) {
					anIntArray523[anInt8974++] = (int) Static155.aFloat73 >> 3;
					return;
				}
				if (arg0 == 5506) {
					anIntArray523[anInt8974++] = (int) Static189.aFloat83 >> 3;
					return;
				}
				if (arg0 == 5507) {
					Static103.method1976();
					return;
				}
				if (arg0 == 5508) {
					Static186.method3078();
					return;
				}
				if (arg0 == 5509) {
					Static129.method2314();
					return;
				}
				if (arg0 == 5510) {
					Static110.method2034();
					return;
				}
				if (arg0 == 5511) {
					local175 = anIntArray523[--anInt8974];
					local776 = local175 >> 14 & 0x3FFF;
					local97 = local175 & 0x3FFF;
					local776 -= Static242.anInt10133;
					if (local776 < 0) {
						local776 = 0;
					} else if (local776 >= Static338.anInt6508) {
						local776 = Static338.anInt6508;
					}
					local97 -= Static157.anInt3323;
					if (local97 < 0) {
						local97 = 0;
					} else if (local97 >= Static390.anInt7654) {
						local97 = Static390.anInt7654;
					}
					Static277.anInt5777 = (local776 << 9) + 256;
					Static27.anInt4151 = (local97 << 9) + 256;
					Static300.anInt6053 = 4;
					Static453.anInt8613 = -1;
					Static587.anInt10508 = -1;
					return;
				}
				if (arg0 == 5512) {
					Static415.method4709();
					return;
				}
				if (arg0 == 5517) {
					local175 = anIntArray523[--anInt8974];
					if (local175 == -1) {
						local776 = local175 >> 14 & 0x3FFF;
						local97 = local175 & 0x3FFF;
						local776 -= Static242.anInt10133;
						if (local776 < 0) {
							local776 = 0;
						} else if (local776 >= Static338.anInt6508) {
							local776 = Static338.anInt6508;
						}
						local97 -= Static157.anInt3323;
						if (local97 < 0) {
							local97 = 0;
						} else if (local97 >= Static390.anInt7654) {
							local97 = Static390.anInt7654;
						}
						Static587.anInt10508 = (local776 << 9) + 256;
						Static453.anInt8613 = (local97 << 9) + 256;
						return;
					}
					Static587.anInt10508 = -1;
					Static453.anInt8613 = -1;
					return;
				}
			} else if (arg0 < 5700) {
				if (arg0 == 5600) {
					anInt8965 -= 2;
					local83 = aStringArray35[anInt8965];
					local89 = aStringArray35[anInt8965 + 1];
					local97 = anIntArray523[--anInt8974];
					if (Static9.anInt758 != 3) {
						return;
					}
					if (Static575.anInt10384 == 0 && Static232.anInt4898 == 0) {
						Static544.aString215 = local83;
						Static422.aString169 = local89;
						Static313.anInt6277 = local97;
						Static231.method3759(6);
						return;
					}
					return;
				}
				if (arg0 == 5601) {
					Static268.method4299();
					return;
				}
				if (arg0 == 5602) {
					if (Static575.anInt10384 == 0) {
						Static410.anInt8174 = -2;
						Static229.anInt4849 = -2;
					}
					return;
				}
				if (arg0 == 5603) {
					anInt8974 -= 4;
					if (Static9.anInt758 != 3) {
						return;
					}
					if (Static575.anInt10384 == 0 && Static232.anInt4898 == 0) {
						Static458.method6736(anIntArray523[anInt8974 + 3], anIntArray523[anInt8974 + 1], anIntArray523[anInt8974 + 2], anIntArray523[anInt8974]);
						return;
					}
					return;
				}
				if (arg0 == 5604) {
					anInt8965--;
					if (Static9.anInt758 != 3) {
						return;
					}
					if (Static575.anInt10384 == 0 && Static232.anInt4898 == 0) {
						Static467.method6808(Static587.method8191(aStringArray35[anInt8965]));
						return;
					}
					return;
				}
				if (arg0 == 5605) {
					anInt8965 -= 2;
					if (Static9.anInt758 != 3) {
						return;
					}
					if (Static575.anInt10384 == 0 && Static232.anInt4898 == 0) {
						Static407.method6146(false, aStringArray35[anInt8965 + 1], Static587.method8191(aStringArray35[anInt8965]));
						return;
					}
					return;
				}
				if (arg0 == 5606) {
					if (Static232.anInt4898 == 0) {
						Static457.anInt8737 = -2;
					}
					return;
				}
				if (arg0 == 5607) {
					anIntArray523[anInt8974++] = Static229.anInt4849;
					return;
				}
				if (arg0 == 5608) {
					anIntArray523[anInt8974++] = Static452.anInt8608;
					return;
				}
				if (arg0 == 5609) {
					anIntArray523[anInt8974++] = Static457.anInt8737;
					return;
				}
				if (arg0 == 5610) {
					for (local175 = 0; local175 < 5; local175++) {
						aStringArray35[anInt8965++] = Static150.aStringArray12 == null || Static150.aStringArray12.length <= local175 ? "" : Static195.method6874(Static150.aStringArray12[local175]);
					}
					Static150.aStringArray12 = null;
					return;
				}
				if (arg0 == 5611) {
					anIntArray523[anInt8974++] = Static473.anInt8998;
					return;
				}
				if (arg0 == 5612) {
					local175 = anIntArray523[--anInt8974];
					if (Static9.anInt758 != 7) {
						return;
					}
					if (Static575.anInt10384 == 0 && Static232.anInt4898 == 0) {
						if (Static528.aClass36_2 != null) {
							Static528.aClass36_2.method1992();
							Static528.aClass36_2 = null;
						}
						Static313.anInt6277 = local175;
						Static231.method3759(9);
						return;
					}
					return;
				}
				if (arg0 == 5613) {
					anIntArray523[anInt8974++] = Static229.anInt4849;
					return;
				}
				if (arg0 == 5615) {
					anInt8965 -= 2;
					local83 = aStringArray35[anInt8965];
					local89 = aStringArray35[anInt8965 + 1];
					if (Static9.anInt758 != 3) {
						return;
					}
					if (Static575.anInt10384 == 0 && Static232.anInt4898 == 0) {
						if (Static528.aClass36_2 != null) {
							Static528.aClass36_2.method1992();
							Static528.aClass36_2 = null;
						}
						Static544.aString215 = local83;
						Static422.aString169 = local89;
						Static231.method3759(5);
						return;
					}
					return;
				}
				if (arg0 == 5616) {
					Static254.method4043(false);
					return;
				}
				if (arg0 == 5617) {
					anIntArray523[anInt8974++] = Static410.anInt8174;
					return;
				}
				if (arg0 == 5618) {
					local175 = anIntArray523[--anInt8974];
					Static415.method4712(false, local175);
					return;
				}
				if (arg0 == 5619) {
					local175 = anIntArray523[--anInt8974];
					Static415.method4712(true, local175);
					return;
				}
				if (arg0 == 5620) {
					Static387.method5967();
					if (Static543.aString213 != "" && Static543.aString213 != "") {
						anIntArray523[anInt8974++] = 1;
						return;
					}
					anIntArray523[anInt8974++] = 0;
					return;
				}
				if (arg0 == 5621) {
					anInt8965 -= 2;
					if (Static9.anInt758 != 3) {
						return;
					}
					if (Static575.anInt10384 == 0 && Static232.anInt4898 == 0) {
						Static407.method6146(true, aStringArray35[anInt8965 + 1], Static587.method8191(aStringArray35[anInt8965]));
						return;
					}
					return;
				}
				if (arg0 == 5622) {
					@Pc(4719) Class316 local4719 = Static372.aClass366_5.method8266("3", false);
					while (local4719.anInt9478 == 0) {
						Static214.method3478(1L);
					}
					if (local4719.anInt9478 == 2) {
						throw new RuntimeException("Error opening file");
					}
					@Pc(4739) Class354 local4739 = (Class354) local4719.anObject136;
					if (local4739.method8087().exists()) {
						@Pc(4749) Class4_Sub13 local4749 = new Class4_Sub13(50);
						try {
							local4739.method8086(local4749.aByteArray88, 50, 0);
						} catch (@Pc(4758) IOException local4758) {
						}
					}
					try {
						local4739.method8089();
						return;
					} catch (@Pc(4764) Exception local4764) {
						return;
					}
				}
				if (arg0 == 5623) {
					if (Static67.aString22 != null) {
						anIntArray523[anInt8974++] = 1;
						return;
					}
					anIntArray523[anInt8974++] = 0;
					return;
				}
				if (arg0 == 5624) {
					anIntArray523[anInt8974++] = (int) (Static452.aLong234 >> 32);
					anIntArray523[anInt8974++] = (int) (Static452.aLong234 & 0xFFFFL);
					return;
				}
			} else if (arg0 < 6100) {
				if (arg0 == 6001) {
					local175 = anIntArray523[--anInt8974];
					if (local175 < 1) {
						local175 = 1;
					}
					if (local175 > 4) {
						local175 = 4;
					}
					Static455.aClass4_Sub35_Sub1_1.anInt9913 = local175;
					Static472.method6892();
					Static455.aClass4_Sub35_Sub1_1.method7631(Static372.aClass366_5);
					Static556.aBoolean698 = false;
					return;
				}
				if (arg0 == 6002) {
					Static455.aClass4_Sub35_Sub1_1.method7624(anIntArray523[--anInt8974] == 1);
					Static472.method6892();
					Static385.method5956();
					Static455.aClass4_Sub35_Sub1_1.method7631(Static372.aClass366_5);
					Static556.aBoolean698 = false;
					return;
				}
				if (arg0 == 6003) {
					Static455.aClass4_Sub35_Sub1_1.aBoolean671 = anIntArray523[--anInt8974] == 1;
					Static385.method5956();
					Static455.aClass4_Sub35_Sub1_1.method7631(Static372.aClass366_5);
					Static556.aBoolean698 = false;
					return;
				}
				if (arg0 == 6005) {
					Static455.aClass4_Sub35_Sub1_1.aBoolean667 = anIntArray523[--anInt8974] == 1;
					Static472.method6892();
					Static455.aClass4_Sub35_Sub1_1.method7631(Static372.aClass366_5);
					Static556.aBoolean698 = false;
					return;
				}
				if (arg0 == 6006) {
					Static455.aClass4_Sub35_Sub1_1.aBoolean676 = anIntArray523[--anInt8974] == 1;
					Static39.aClass7_2.method7826(!Static455.aClass4_Sub35_Sub1_1.aBoolean676);
					Static455.aClass4_Sub35_Sub1_1.method7631(Static372.aClass366_5);
					Static556.aBoolean698 = false;
					return;
				}
				if (arg0 == 6007) {
					Static455.aClass4_Sub35_Sub1_1.anInt9931 = anIntArray523[--anInt8974];
					Static455.aClass4_Sub35_Sub1_1.method7631(Static372.aClass366_5);
					Static556.aBoolean698 = false;
					return;
				}
				if (arg0 == 6008) {
					Static455.aClass4_Sub35_Sub1_1.aBoolean683 = anIntArray523[--anInt8974] == 1;
					Static455.aClass4_Sub35_Sub1_1.method7631(Static372.aClass366_5);
					Static556.aBoolean698 = false;
					return;
				}
				if (arg0 == 6009) {
					Static455.aClass4_Sub35_Sub1_1.aBoolean680 = anIntArray523[--anInt8974] == 1;
					Static472.method6892();
					Static455.aClass4_Sub35_Sub1_1.method7631(Static372.aClass366_5);
					Static556.aBoolean698 = false;
					return;
				}
				if (arg0 == 6010) {
					Static455.aClass4_Sub35_Sub1_1.aBoolean684 = anIntArray523[--anInt8974] == 1;
					Static455.aClass4_Sub35_Sub1_1.method7631(Static372.aClass366_5);
					Static556.aBoolean698 = false;
					return;
				}
				if (arg0 == 6011) {
					local175 = anIntArray523[--anInt8974];
					if (local175 < 0 || local175 > 2) {
						local175 = 0;
					}
					Static455.aClass4_Sub35_Sub1_1.method7618(Static453.anInt8614, local175);
					Static472.method6892();
					Static455.aClass4_Sub35_Sub1_1.method7631(Static372.aClass366_5);
					Static556.aBoolean698 = false;
					return;
				}
				if (arg0 == 6012) {
					Static455.aClass4_Sub35_Sub1_1.method7611(anIntArray523[--anInt8974] == 1, Static453.anInt8614);
					Static303.method4804();
					Static41.method1090();
					Static455.aClass4_Sub35_Sub1_1.method7631(Static372.aClass366_5);
					Static556.aBoolean698 = false;
					return;
				}
				if (arg0 == 6014) {
					Static455.aClass4_Sub35_Sub1_1.aBoolean677 = anIntArray523[--anInt8974] == 1;
					Static472.method6892();
					Static455.aClass4_Sub35_Sub1_1.method7631(Static372.aClass366_5);
					Static556.aBoolean698 = false;
					return;
				}
				if (arg0 == 6015) {
					Static455.aClass4_Sub35_Sub1_1.aBoolean673 = anIntArray523[--anInt8974] == 1;
					Static472.method6892();
					Static455.aClass4_Sub35_Sub1_1.method7631(Static372.aClass366_5);
					Static556.aBoolean698 = false;
					return;
				}
				if (arg0 == 6016) {
					local175 = anIntArray523[--anInt8974];
					if (local175 < 0 || local175 > 2) {
						local175 = 0;
					}
					Static455.aClass4_Sub35_Sub1_1.anInt9914 = local175;
					Static146.method2531(Static453.anInt8614);
					Static455.aClass4_Sub35_Sub1_1.method7631(Static372.aClass366_5);
					return;
				}
				if (arg0 == 6017) {
					Static455.aClass4_Sub35_Sub1_1.aBoolean668 = anIntArray523[--anInt8974] == 1;
					Static91.method1836();
					Static455.aClass4_Sub35_Sub1_1.method7631(Static372.aClass366_5);
					Static556.aBoolean698 = false;
					return;
				}
				if (arg0 == 6018) {
					local175 = anIntArray523[--anInt8974];
					if (local175 < 0) {
						local175 = 0;
					}
					if (local175 > 127) {
						local175 = 127;
					}
					Static455.aClass4_Sub35_Sub1_1.anInt9916 = local175;
					Static455.aClass4_Sub35_Sub1_1.method7631(Static372.aClass366_5);
					Static556.aBoolean698 = false;
					return;
				}
				if (arg0 == 6019) {
					local175 = anIntArray523[--anInt8974];
					if (local175 < 0) {
						local175 = 0;
					}
					if (local175 > 255) {
						local175 = 255;
					}
					if (local175 != Static455.aClass4_Sub35_Sub1_1.anInt9926) {
						if (Static455.aClass4_Sub35_Sub1_1.anInt9926 == 0 && Static269.anInt5657 != -1) {
							Static586.method8188(Static269.anInt5657, Static326.aClass348_69, local175);
							Static159.method2601();
							Static421.aBoolean581 = false;
						} else if (local175 == 0) {
							Static404.method6138();
							Static421.aBoolean581 = false;
						} else {
							Static178.method2951(local175);
						}
						Static455.aClass4_Sub35_Sub1_1.anInt9926 = local175;
					}
					Static455.aClass4_Sub35_Sub1_1.method7631(Static372.aClass366_5);
					Static556.aBoolean698 = false;
					return;
				}
				if (arg0 == 6020) {
					local175 = anIntArray523[--anInt8974];
					if (local175 < 0) {
						local175 = 0;
					}
					if (local175 > 127) {
						local175 = 127;
					}
					Static455.aClass4_Sub35_Sub1_1.anInt9929 = local175;
					Static455.aClass4_Sub35_Sub1_1.method7631(Static372.aClass366_5);
					Static556.aBoolean698 = false;
					return;
				}
				if (arg0 == 6021) {
					Static455.aClass4_Sub35_Sub1_1.aBoolean685 = anIntArray523[--anInt8974] == 1;
					Static385.method5956();
					return;
				}
				if (arg0 == 6023) {
					local175 = anIntArray523[--anInt8974];
					local1496 = false;
					if (local175 < 0) {
						local175 = 0;
					}
					if (local175 > 2) {
						local175 = 2;
					}
					if (Static503.anInt9410 < 96) {
						local175 = 0;
						local1496 = true;
					}
					Static446.method6580(local175);
					Static455.aClass4_Sub35_Sub1_1.method7631(Static372.aClass366_5);
					Static556.aBoolean698 = false;
					anIntArray523[anInt8974++] = local1496 ? 0 : 1;
					return;
				}
				if (arg0 == 6024) {
					local175 = anIntArray523[--anInt8974];
					if (local175 < 0 || local175 > 2) {
						local175 = 0;
					}
					Static455.aClass4_Sub35_Sub1_1.anInt9928 = local175;
					Static455.aClass4_Sub35_Sub1_1.method7631(Static372.aClass366_5);
					return;
				}
				if (arg0 == 6025) {
					local175 = anIntArray523[--anInt8974];
					if (local175 < 0 || local175 > Static488.method7097(Static503.anInt9410)) {
						local175 = 0;
					}
					Static455.aClass4_Sub35_Sub1_1.anInt9923 = local175;
					Static455.aClass4_Sub35_Sub1_1.method7631(Static372.aClass366_5);
					Static556.aBoolean698 = false;
					return;
				}
				if (arg0 == 6027) {
					local175 = anIntArray523[--anInt8974];
					if (local175 < 0 || local175 > 1) {
						local175 = 0;
					}
					Static15.method758(local175 == 1);
					return;
				}
				if (arg0 == 6028) {
					Static455.aClass4_Sub35_Sub1_1.aBoolean679 = anIntArray523[--anInt8974] != 0;
					Static455.aClass4_Sub35_Sub1_1.method7631(Static372.aClass366_5);
					return;
				}
				if (arg0 == 6029) {
					Static455.aClass4_Sub35_Sub1_1.anInt9931 = anIntArray523[--anInt8974];
					Static455.aClass4_Sub35_Sub1_1.method7631(Static372.aClass366_5);
					return;
				}
				if (arg0 == 6030) {
					Static455.aClass4_Sub35_Sub1_1.aBoolean670 = anIntArray523[--anInt8974] != 0;
					Static455.aClass4_Sub35_Sub1_1.method7631(Static372.aClass366_5);
					Static472.method6892();
					return;
				}
				if (arg0 == 6031) {
					local175 = anIntArray523[--anInt8974];
					if (local175 < 0 || local175 > 5) {
						local175 = 2;
					}
					Static146.method2531(local175);
					return;
				}
				if (arg0 == 6032) {
					local175 = anIntArray523[--anInt8974];
					if (local175 < 0 || local175 > 5) {
						local175 = 2;
					}
					Static455.aClass4_Sub35_Sub1_1.anInt9933 = local175;
					Static455.aClass4_Sub35_Sub1_1.method7631(Static372.aClass366_5);
					Static556.aBoolean698 = false;
					return;
				}
				if (arg0 == 6033) {
					local175 = anIntArray523[--anInt8974];
					if (local175 < 0 || local175 > 4) {
						local175 = 2;
					}
					Static455.aClass4_Sub35_Sub1_1.anInt9938 = local175;
					Static455.aClass4_Sub35_Sub1_1.method7631(Static372.aClass366_5);
					return;
				}
				if (arg0 == 6034) {
					Static455.aClass4_Sub35_Sub1_1.aBoolean675 = anIntArray523[--anInt8974] == 1;
					Static455.aClass4_Sub35_Sub1_1.method7631(Static372.aClass366_5);
					Static303.method4804();
					Static556.aBoolean698 = false;
					return;
				}
				if (arg0 == 6035) {
					Static455.aClass4_Sub35_Sub1_1.aBoolean688 = anIntArray523[--anInt8974] == 1;
					Static472.method6892();
					Static385.method5956();
					return;
				}
				if (arg0 == 6036) {
					local175 = anIntArray523[--anInt8974];
					if (local175 < 0 || local175 > 2) {
						local175 = 0;
					}
					Static455.aClass4_Sub35_Sub1_1.method7630(local175);
					Static455.aClass4_Sub35_Sub1_1.method7631(Static372.aClass366_5);
					return;
				}
				if (arg0 == 6037) {
					local175 = anIntArray523[--anInt8974];
					if (local175 < 0) {
						local175 = 0;
					}
					if (local175 > 127) {
						local175 = 127;
					}
					Static455.aClass4_Sub35_Sub1_1.anInt9930 = local175;
					Static455.aClass4_Sub35_Sub1_1.method7631(Static372.aClass366_5);
					Static556.aBoolean698 = false;
					return;
				}
				if (arg0 == 6038) {
					local175 = anIntArray523[--anInt8974];
					if (local175 < 0) {
						local175 = 0;
					}
					if (local175 > 255) {
						local175 = 255;
					}
					if (local175 != Static455.aClass4_Sub35_Sub1_1.anInt9927 && Static269.anInt5657 == Static542.anInt9889) {
						if (Static455.aClass4_Sub35_Sub1_1.anInt9927 == 0) {
							Static586.method8188(Static269.anInt5657, Static326.aClass348_69, local175);
							Static159.method2601();
							Static421.aBoolean581 = false;
						} else if (local175 == 0) {
							Static404.method6138();
							Static421.aBoolean581 = false;
						} else {
							Static178.method2951(local175);
						}
					}
					Static455.aClass4_Sub35_Sub1_1.anInt9927 = local175;
					Static455.aClass4_Sub35_Sub1_1.method7631(Static372.aClass366_5);
					Static556.aBoolean698 = false;
					return;
				}
				if (arg0 == 6039) {
					local175 = anIntArray523[--anInt8974];
					if (local175 > 255 || local175 < 0) {
						local175 = 0;
					}
					if (local175 != Static455.aClass4_Sub35_Sub1_1.anInt9918) {
						Static455.aClass4_Sub35_Sub1_1.anInt9918 = local175;
						Static455.aClass4_Sub35_Sub1_1.method7631(Static372.aClass366_5);
						Static556.aBoolean698 = false;
					}
					return;
				}
			} else if (arg0 < 6200) {
				if (arg0 == 6101) {
					anIntArray523[anInt8974++] = Static455.aClass4_Sub35_Sub1_1.anInt9913;
					return;
				}
				if (arg0 == 6102) {
					anIntArray523[anInt8974++] = Static455.aClass4_Sub35_Sub1_1.method7629(Static453.anInt8614) ? 1 : 0;
					return;
				}
				if (arg0 == 6103) {
					anIntArray523[anInt8974++] = Static455.aClass4_Sub35_Sub1_1.aBoolean671 ? 1 : 0;
					return;
				}
				if (arg0 == 6105) {
					anIntArray523[anInt8974++] = Static455.aClass4_Sub35_Sub1_1.aBoolean667 ? 1 : 0;
					return;
				}
				if (arg0 == 6106) {
					anIntArray523[anInt8974++] = Static455.aClass4_Sub35_Sub1_1.aBoolean676 ? 1 : 0;
					return;
				}
				if (arg0 == 6107) {
					anIntArray523[anInt8974++] = Static455.aClass4_Sub35_Sub1_1.anInt9931;
					return;
				}
				if (arg0 == 6108) {
					anIntArray523[anInt8974++] = Static455.aClass4_Sub35_Sub1_1.aBoolean683 ? 1 : 0;
					return;
				}
				if (arg0 == 6109) {
					anIntArray523[anInt8974++] = Static455.aClass4_Sub35_Sub1_1.aBoolean680 ? 1 : 0;
					return;
				}
				if (arg0 == 6110) {
					anIntArray523[anInt8974++] = Static455.aClass4_Sub35_Sub1_1.aBoolean684 ? 1 : 0;
					return;
				}
				if (arg0 == 6111) {
					anIntArray523[anInt8974++] = Static455.aClass4_Sub35_Sub1_1.method7614(Static453.anInt8614);
					return;
				}
				if (arg0 == 6112) {
					anIntArray523[anInt8974++] = Static455.aClass4_Sub35_Sub1_1.method7615(Static453.anInt8614) ? 1 : 0;
					return;
				}
				if (arg0 == 6114) {
					anIntArray523[anInt8974++] = Static455.aClass4_Sub35_Sub1_1.aBoolean677 ? 1 : 0;
					return;
				}
				if (arg0 == 6115) {
					anIntArray523[anInt8974++] = Static455.aClass4_Sub35_Sub1_1.aBoolean673 ? 1 : 0;
					return;
				}
				if (arg0 == 6116) {
					anIntArray523[anInt8974++] = Static455.aClass4_Sub35_Sub1_1.anInt9914;
					return;
				}
				if (arg0 == 6117) {
					anIntArray523[anInt8974++] = Static455.aClass4_Sub35_Sub1_1.aBoolean668 ? 1 : 0;
					return;
				}
				if (arg0 == 6118) {
					anIntArray523[anInt8974++] = Static455.aClass4_Sub35_Sub1_1.anInt9916;
					return;
				}
				if (arg0 == 6119) {
					anIntArray523[anInt8974++] = Static455.aClass4_Sub35_Sub1_1.anInt9926;
					return;
				}
				if (arg0 == 6120) {
					anIntArray523[anInt8974++] = Static455.aClass4_Sub35_Sub1_1.anInt9929;
					return;
				}
				if (arg0 == 6121) {
					anIntArray523[anInt8974++] = Static39.aClass7_2.method7834() ? 1 : 0;
					return;
				}
				if (arg0 == 6123) {
					anIntArray523[anInt8974++] = Static488.method7101();
					return;
				}
				if (arg0 == 6124) {
					anIntArray523[anInt8974++] = Static455.aClass4_Sub35_Sub1_1.anInt9928;
					return;
				}
				if (arg0 == 6125) {
					anIntArray523[anInt8974++] = Static455.aClass4_Sub35_Sub1_1.anInt9923;
					return;
				}
				if (arg0 == 6126) {
					anIntArray523[anInt8974++] = Static39.aClass7_2.method7779() ? 1 : 0;
					return;
				}
				if (arg0 == 6127) {
					anIntArray523[anInt8974++] = Static455.aClass4_Sub35_Sub1_1.aBoolean669 ? 1 : 0;
					return;
				}
				if (arg0 == 6128) {
					anIntArray523[anInt8974++] = Static455.aClass4_Sub35_Sub1_1.aBoolean679 ? 1 : 0;
					return;
				}
				if (arg0 == 6129) {
					anIntArray523[anInt8974++] = Static455.aClass4_Sub35_Sub1_1.anInt9931;
					return;
				}
				if (arg0 == 6130) {
					anIntArray523[anInt8974++] = Static455.aClass4_Sub35_Sub1_1.aBoolean670 ? 1 : 0;
					return;
				}
				if (arg0 == 6131) {
					anIntArray523[anInt8974++] = Static453.anInt8614;
					return;
				}
				if (arg0 == 6132) {
					anIntArray523[anInt8974++] = Static455.aClass4_Sub35_Sub1_1.anInt9933;
					return;
				}
				if (arg0 == 6133) {
					anIntArray523[anInt8974++] = Static372.aClass366_5.aBoolean719 && !Static372.aClass366_5.aBoolean720 ? 1 : 0;
					return;
				}
				if (arg0 == 6134) {
					anIntArray523[anInt8974++] = Static488.method7097(Static503.anInt9410);
					return;
				}
				if (arg0 == 6135) {
					anIntArray523[anInt8974++] = Static455.aClass4_Sub35_Sub1_1.anInt9938;
					return;
				}
				if (arg0 == 6136) {
					anIntArray523[anInt8974++] = Static455.aClass4_Sub35_Sub1_1.aBoolean675 ? 1 : 0;
					return;
				}
				if (arg0 == 6137) {
					@Pc(6356) boolean local6356 = true;
					try {
						local6356 = jagmisc.getTotalPhysicalMemory() > 268435456L;
					} catch (@Pc(6366) Throwable local6366) {
					}
					anIntArray523[anInt8974++] = local6356 ? 1 : 0;
					return;
				}
				if (arg0 == 6138) {
					anIntArray523[anInt8974++] = Static371.method5562(200, Static453.anInt8614);
					return;
				}
				if (arg0 == 6139) {
					anIntArray523[anInt8974++] = Static455.aClass4_Sub35_Sub1_1.method7632(Static453.anInt8614);
					return;
				}
				if (arg0 == 6140) {
					@Pc(6414) byte local6414 = 0;
					if (Static445.method6557(Static453.anInt8614) && Static503.anInt9410 < 96) {
						local6414 = 1;
					}
					anIntArray523[anInt8974++] = local6414;
					return;
				}
				if (arg0 == 6141) {
					if (Static503.anInt9410 < 96) {
						anIntArray523[anInt8974++] = 0;
						return;
					}
					anIntArray523[anInt8974++] = 2;
					return;
				}
				if (arg0 == 6142) {
					anIntArray523[anInt8974++] = Static455.aClass4_Sub35_Sub1_1.anInt9930;
					return;
				}
				if (arg0 == 6143) {
					anIntArray523[anInt8974++] = Static455.aClass4_Sub35_Sub1_1.anInt9927;
					return;
				}
				if (arg0 == 6144) {
					anIntArray523[anInt8974++] = Static105.aBoolean624 ? 1 : 0;
					return;
				}
				if (arg0 == 6145) {
					anIntArray523[anInt8974++] = Static455.aClass4_Sub35_Sub1_1.anInt9918;
					return;
				}
			} else if (arg0 < 6300) {
				if (arg0 == 6200) {
					anInt8974 -= 2;
					Static186.aShort39 = (short) anIntArray523[anInt8974];
					if (Static186.aShort39 <= 0) {
						Static186.aShort39 = 256;
					}
					Static470.aShort111 = (short) anIntArray523[anInt8974 + 1];
					if (Static470.aShort111 <= 0) {
						Static470.aShort111 = 205;
					}
					return;
				}
				if (arg0 == 6201) {
					anInt8974 -= 2;
					Static296.aShort80 = (short) anIntArray523[anInt8974];
					if (Static296.aShort80 <= 0) {
						Static296.aShort80 = 256;
					}
					Static468.aShort110 = (short) anIntArray523[anInt8974 + 1];
					if (Static468.aShort110 <= 0) {
						Static468.aShort110 = 320;
					}
					return;
				}
				if (arg0 == 6202) {
					anInt8974 -= 4;
					Static197.aShort40 = (short) anIntArray523[anInt8974];
					if (Static197.aShort40 <= 0) {
						Static197.aShort40 = 1;
					}
					Static195.aShort112 = (short) anIntArray523[anInt8974 + 1];
					if (Static195.aShort112 <= 0) {
						Static195.aShort112 = 32767;
					} else if (Static195.aShort112 < Static197.aShort40) {
						Static195.aShort112 = Static197.aShort40;
					}
					Static549.aShort124 = (short) anIntArray523[anInt8974 + 2];
					if (Static549.aShort124 <= 0) {
						Static549.aShort124 = 1;
					}
					Static479.aShort113 = (short) anIntArray523[anInt8974 + 3];
					if (Static479.aShort113 <= 0) {
						Static479.aShort113 = 32767;
						return;
					}
					if (Static479.aShort113 < Static549.aShort124) {
						Static479.aShort113 = Static549.aShort124;
					}
					return;
				}
				if (arg0 == 6203) {
					Static211.method3416(0, Static375.aClass155_8.anInt4806, Static375.aClass155_8.anInt4831, 0, false);
					anIntArray523[anInt8974++] = Static136.anInt3032;
					anIntArray523[anInt8974++] = Static90.anInt2301;
					return;
				}
				if (arg0 == 6204) {
					anIntArray523[anInt8974++] = Static296.aShort80;
					anIntArray523[anInt8974++] = Static468.aShort110;
					return;
				}
				if (arg0 == 6205) {
					anIntArray523[anInt8974++] = Static186.aShort39;
					anIntArray523[anInt8974++] = Static470.aShort111;
					return;
				}
			} else if (arg0 < 6400) {
				if (arg0 == 6300) {
					anIntArray523[anInt8974++] = (int) (Static112.method2047() / 60000L);
					return;
				}
				if (arg0 == 6301) {
					anIntArray523[anInt8974++] = (int) (Static112.method2047() / 86400000L) - 11745;
					return;
				}
				if (arg0 == 6302) {
					anInt8974 -= 3;
					local175 = anIntArray523[anInt8974];
					local776 = anIntArray523[anInt8974 + 1];
					local97 = anIntArray523[anInt8974 + 2];
					aCalendar2.clear();
					aCalendar2.set(11, 12);
					aCalendar2.set(local97, local776, local175);
					local103 = (int) (aCalendar2.getTime().getTime() / 86400000L) - 11745;
					if (local97 < 1970) {
						local103--;
					}
					anIntArray523[anInt8974++] = local103;
					return;
				}
				if (arg0 == 6303) {
					aCalendar2.clear();
					aCalendar2.setTime(new Date(Static112.method2047()));
					anIntArray523[anInt8974++] = aCalendar2.get(1);
					return;
				}
				if (arg0 == 6304) {
					local175 = anIntArray523[--anInt8974];
					local1496 = true;
					if (local175 < 0) {
						local1496 = (local175 + 1) % 4 == 0;
					} else if (local175 < 1582) {
						local1496 = local175 % 4 == 0;
					} else if (local175 % 4 != 0) {
						local1496 = false;
					} else if (local175 % 100 != 0) {
						local1496 = true;
					} else if (local175 % 400 != 0) {
						local1496 = false;
					}
					anIntArray523[anInt8974++] = local1496 ? 1 : 0;
					return;
				}
			} else if (arg0 < 6500) {
				if (arg0 == 6405) {
					anIntArray523[anInt8974++] = Static443.method6528() ? 1 : 0;
					return;
				}
				if (arg0 == 6406) {
					anIntArray523[anInt8974++] = Static374.method5815() ? 1 : 0;
					return;
				}
			} else if (arg0 < 6600) {
				if (arg0 == 6500) {
					if (Static9.anInt758 == 7 && Static575.anInt10384 == 0 && Static232.anInt4898 == 0) {
						if (Static105.aBoolean623) {
							anIntArray523[anInt8974++] = 0;
							return;
						}
						if (Static532.aLong275 > Static112.method2047() - 1000L) {
							anIntArray523[anInt8974++] = 1;
							return;
						}
						Static105.aBoolean623 = true;
						local52 = Static32.method999(Static402.aClass356_1, Static53.aClass344_98);
						local52.aClass4_Sub13_Sub2_1.method7032(Static438.anInt8366);
						Static50.method1166(local52);
						anIntArray523[anInt8974++] = 0;
						return;
					}
					anIntArray523[anInt8974++] = 1;
					return;
				}
				@Pc(7037) Class216 local7037;
				@Pc(7004) Class222_Sub1 local7004;
				if (arg0 == 6501) {
					local7004 = Static518.method7355();
					if (local7004 != null) {
						anIntArray523[anInt8974++] = local7004.anInt10276;
						anIntArray523[anInt8974++] = local7004.anInt10271;
						aStringArray35[anInt8965++] = local7004.aString223;
						local7037 = local7004.method7996();
						anIntArray523[anInt8974++] = local7037.anInt6364;
						aStringArray35[anInt8965++] = local7037.aString132;
						anIntArray523[anInt8974++] = local7004.anInt10273;
						anIntArray523[anInt8974++] = local7004.anInt10278;
						aStringArray35[anInt8965++] = local7004.aString224;
						return;
					}
					anIntArray523[anInt8974++] = -1;
					anIntArray523[anInt8974++] = 0;
					aStringArray35[anInt8965++] = "";
					anIntArray523[anInt8974++] = 0;
					aStringArray35[anInt8965++] = "";
					anIntArray523[anInt8974++] = 0;
					anIntArray523[anInt8974++] = 0;
					aStringArray35[anInt8965++] = "";
					return;
				}
				if (arg0 == 6502) {
					local7004 = Static474.method1150();
					if (local7004 != null) {
						anIntArray523[anInt8974++] = local7004.anInt10276;
						anIntArray523[anInt8974++] = local7004.anInt10271;
						aStringArray35[anInt8965++] = local7004.aString223;
						local7037 = local7004.method7996();
						anIntArray523[anInt8974++] = local7037.anInt6364;
						aStringArray35[anInt8965++] = local7037.aString132;
						anIntArray523[anInt8974++] = local7004.anInt10273;
						anIntArray523[anInt8974++] = local7004.anInt10278;
						aStringArray35[anInt8965++] = local7004.aString224;
						return;
					}
					anIntArray523[anInt8974++] = -1;
					anIntArray523[anInt8974++] = 0;
					aStringArray35[anInt8965++] = "";
					anIntArray523[anInt8974++] = 0;
					aStringArray35[anInt8965++] = "";
					anIntArray523[anInt8974++] = 0;
					anIntArray523[anInt8974++] = 0;
					aStringArray35[anInt8965++] = "";
					return;
				}
				if (arg0 == 6503) {
					local175 = anIntArray523[--anInt8974];
					local89 = aStringArray35[--anInt8965];
					if (Static9.anInt758 == 7 && Static575.anInt10384 == 0 && Static232.anInt4898 == 0) {
						anIntArray523[anInt8974++] = Static435.method6471(local175, local89) ? 1 : 0;
						return;
					}
					anIntArray523[anInt8974++] = 0;
					return;
				}
				if (arg0 == 6504) {
					Static455.aClass4_Sub35_Sub1_1.anInt9915 = anIntArray523[--anInt8974];
					Static455.aClass4_Sub35_Sub1_1.method7631(Static372.aClass366_5);
					return;
				}
				if (arg0 == 6505) {
					anIntArray523[anInt8974++] = Static455.aClass4_Sub35_Sub1_1.anInt9915;
					return;
				}
				if (arg0 == 6506) {
					local175 = anIntArray523[--anInt8974];
					@Pc(7394) Class222_Sub1 local7394 = Static442.method6524(local175);
					if (local7394 != null) {
						anIntArray523[anInt8974++] = local7394.anInt10271;
						aStringArray35[anInt8965++] = local7394.aString223;
						@Pc(7418) Class216 local7418 = local7394.method7996();
						anIntArray523[anInt8974++] = local7418.anInt6364;
						aStringArray35[anInt8965++] = local7418.aString132;
						anIntArray523[anInt8974++] = local7394.anInt10273;
						anIntArray523[anInt8974++] = local7394.anInt10278;
						aStringArray35[anInt8965++] = local7394.aString224;
						return;
					}
					anIntArray523[anInt8974++] = -1;
					aStringArray35[anInt8965++] = "";
					anIntArray523[anInt8974++] = 0;
					aStringArray35[anInt8965++] = "";
					anIntArray523[anInt8974++] = 0;
					anIntArray523[anInt8974++] = 0;
					aStringArray35[anInt8965++] = "";
					return;
				}
				if (arg0 == 6507) {
					anInt8974 -= 4;
					local175 = anIntArray523[anInt8974];
					local1496 = anIntArray523[anInt8974 + 1] == 1;
					local97 = anIntArray523[anInt8974 + 2];
					local2107 = anIntArray523[anInt8974 + 3] == 1;
					Static355.method5357(local97, local1496, local175, local2107);
					return;
				}
				if (arg0 == 6508) {
					Static34.method3923();
					return;
				}
				if (arg0 == 6509) {
					if (Static9.anInt758 != 7) {
						return;
					}
					Static333.aBoolean440 = anIntArray523[--anInt8974] == 1;
					return;
				}
				if (arg0 == 6510) {
					anIntArray523[anInt8974++] = Static266.anInt5356;
					return;
				}
			} else if (arg0 < 6700) {
				if (arg0 == 6600) {
					Static455.aClass4_Sub35_Sub1_1.aBoolean674 = anIntArray523[--anInt8974] == 1;
					Static455.aClass4_Sub35_Sub1_1.method7631(Static372.aClass366_5);
					return;
				}
				if (arg0 == 6601) {
					anIntArray523[anInt8974++] = Static455.aClass4_Sub35_Sub1_1.aBoolean674 ? 1 : 0;
					return;
				}
			} else if (arg0 < 6800 && Static110.aClass178_2 == Static536.aClass178_4) {
				if (arg0 == 6700) {
					local175 = Static569.aClass221_27.method5070();
					if (Static446.anInt8493 != -1) {
						local175++;
					}
					anIntArray523[anInt8974++] = local175;
					return;
				}
				if (arg0 == 6701) {
					local175 = anIntArray523[--anInt8974];
					if (Static446.anInt8493 != -1) {
						if (local175 == 0) {
							anIntArray523[anInt8974++] = Static446.anInt8493;
							return;
						}
						local175--;
					}
					@Pc(7705) Class4_Sub45 local7705 = (Class4_Sub45) Static569.aClass221_27.method5072();
					while (local175-- > 0) {
						local7705 = (Class4_Sub45) Static569.aClass221_27.method5071();
					}
					anIntArray523[anInt8974++] = local7705.anInt9096;
					return;
				}
				if (arg0 == 6702) {
					local175 = anIntArray523[--anInt8974];
					if (Static535.aClass155ArrayArray2[local175] == null) {
						aStringArray35[anInt8965++] = "";
						return;
					}
					local89 = Static535.aClass155ArrayArray2[local175][0].aString95;
					if (local89 == null) {
						aStringArray35[anInt8965++] = "";
						return;
					}
					aStringArray35[anInt8965++] = local89.substring(0, local89.indexOf(58));
					return;
				}
				if (arg0 == 6703) {
					local175 = anIntArray523[--anInt8974];
					if (Static535.aClass155ArrayArray2[local175] == null) {
						anIntArray523[anInt8974++] = 0;
						return;
					}
					anIntArray523[anInt8974++] = Static535.aClass155ArrayArray2[local175].length;
					return;
				}
				if (arg0 == 6704) {
					anInt8974 -= 2;
					local175 = anIntArray523[anInt8974];
					local776 = anIntArray523[anInt8974 + 1];
					if (Static535.aClass155ArrayArray2[local175] == null) {
						aStringArray35[anInt8965++] = "";
						return;
					}
					local181 = Static535.aClass155ArrayArray2[local175][local776].aString95;
					if (local181 == null) {
						aStringArray35[anInt8965++] = "";
						return;
					}
					aStringArray35[anInt8965++] = local181;
					return;
				}
				if (arg0 == 6705) {
					anInt8974 -= 2;
					local175 = anIntArray523[anInt8974];
					local776 = anIntArray523[anInt8974 + 1];
					if (Static535.aClass155ArrayArray2[local175] == null) {
						anIntArray523[anInt8974++] = 0;
						return;
					}
					anIntArray523[anInt8974++] = Static535.aClass155ArrayArray2[local175][local776].anInt4760;
					return;
				}
				if (arg0 == 6706) {
					return;
				}
				if (arg0 == 6707) {
					anInt8974 -= 3;
					local175 = anIntArray523[anInt8974];
					local776 = anIntArray523[anInt8974 + 1];
					local97 = anIntArray523[anInt8974 + 2];
					Static101.method1932("", local97, local175 << 16 | local776, 1);
					return;
				}
				if (arg0 == 6708) {
					anInt8974 -= 3;
					local175 = anIntArray523[anInt8974];
					local776 = anIntArray523[anInt8974 + 1];
					local97 = anIntArray523[anInt8974 + 2];
					Static101.method1932("", local97, local175 << 16 | local776, 2);
					return;
				}
				if (arg0 == 6709) {
					anInt8974 -= 3;
					local175 = anIntArray523[anInt8974];
					local776 = anIntArray523[anInt8974 + 1];
					local97 = anIntArray523[anInt8974 + 2];
					Static101.method1932("", local97, local175 << 16 | local776, 3);
					return;
				}
				if (arg0 == 6710) {
					anInt8974 -= 3;
					local175 = anIntArray523[anInt8974];
					local776 = anIntArray523[anInt8974 + 1];
					local97 = anIntArray523[anInt8974 + 2];
					Static101.method1932("", local97, local175 << 16 | local776, 4);
					return;
				}
				if (arg0 == 6711) {
					anInt8974 -= 3;
					local175 = anIntArray523[anInt8974];
					local776 = anIntArray523[anInt8974 + 1];
					local97 = anIntArray523[anInt8974 + 2];
					Static101.method1932("", local97, local175 << 16 | local776, 5);
					return;
				}
				if (arg0 == 6712) {
					anInt8974 -= 3;
					local175 = anIntArray523[anInt8974];
					local776 = anIntArray523[anInt8974 + 1];
					local97 = anIntArray523[anInt8974 + 2];
					Static101.method1932("", local97, local175 << 16 | local776, 6);
					return;
				}
				if (arg0 == 6713) {
					anInt8974 -= 3;
					local175 = anIntArray523[anInt8974];
					local776 = anIntArray523[anInt8974 + 1];
					local97 = anIntArray523[anInt8974 + 2];
					Static101.method1932("", local97, local175 << 16 | local776, 7);
					return;
				}
				if (arg0 == 6714) {
					anInt8974 -= 3;
					local175 = anIntArray523[anInt8974];
					local776 = anIntArray523[anInt8974 + 1];
					local97 = anIntArray523[anInt8974 + 2];
					Static101.method1932("", local97, local175 << 16 | local776, 8);
					return;
				}
				if (arg0 == 6715) {
					anInt8974 -= 3;
					local175 = anIntArray523[anInt8974];
					local776 = anIntArray523[anInt8974 + 1];
					local97 = anIntArray523[anInt8974 + 2];
					Static101.method1932("", local97, local175 << 16 | local776, 9);
					return;
				}
				if (arg0 == 6716) {
					anInt8974 -= 3;
					local175 = anIntArray523[anInt8974];
					local776 = anIntArray523[anInt8974 + 1];
					local97 = anIntArray523[anInt8974 + 2];
					Static101.method1932("", local97, local175 << 16 | local776, 10);
					return;
				}
				if (arg0 == 6717) {
					anInt8974 -= 3;
					local175 = anIntArray523[anInt8974];
					local776 = anIntArray523[anInt8974 + 1];
					local97 = anIntArray523[anInt8974 + 2];
					@Pc(8293) Class155 local8293 = Static539.method7544(local175 << 16 | local776, local97);
					Static263.method4151();
					@Pc(8298) Class4_Sub40 local8298 = Static70.method1542(local8293);
					Static331.method7987(local8298.anInt8121, local8298.method6330(), local8293);
					return;
				}
			} else if (arg0 < 6900) {
				@Pc(8326) Class288 local8326;
				if (arg0 == 6800) {
					local175 = anIntArray523[--anInt8974];
					local8326 = Static89.aClass121_1.method2676(local175);
					if (local8326.aString177 == null) {
						aStringArray35[anInt8965++] = "";
						return;
					}
					aStringArray35[anInt8965++] = local8326.aString177;
					return;
				}
				if (arg0 == 6801) {
					local175 = anIntArray523[--anInt8974];
					local8326 = Static89.aClass121_1.method2676(local175);
					anIntArray523[anInt8974++] = local8326.anInt8577;
					return;
				}
				if (arg0 == 6802) {
					local175 = anIntArray523[--anInt8974];
					local8326 = Static89.aClass121_1.method2676(local175);
					anIntArray523[anInt8974++] = local8326.anInt8603;
					return;
				}
				if (arg0 == 6803) {
					local175 = anIntArray523[--anInt8974];
					local8326 = Static89.aClass121_1.method2676(local175);
					anIntArray523[anInt8974++] = local8326.anInt8601;
					return;
				}
				if (arg0 == 6804) {
					anInt8974 -= 2;
					local175 = anIntArray523[anInt8974];
					local776 = anIntArray523[anInt8974 + 1];
					@Pc(8448) Class275 local8448 = Static245.aClass107_2.method2503(local776);
					if (local8448.method6374()) {
						aStringArray35[anInt8965++] = Static89.aClass121_1.method2676(local175).method6630(local8448.aString170, local776);
						return;
					}
					anIntArray523[anInt8974++] = Static89.aClass121_1.method2676(local175).method6637(local8448.anInt8186, local776);
					return;
				}
			} else if (arg0 < 7000) {
				if (arg0 == 6900) {
					anIntArray523[anInt8974++] = Static337.aBoolean442 && !Static477.aBoolean628 ? 1 : 0;
					return;
				}
				if (arg0 == 6901) {
					anIntArray523[anInt8974++] = Static502.anInt9377;
					return;
				}
				if (arg0 == 6902) {
					anIntArray523[anInt8974++] = Static143.anInt3093;
					return;
				}
				if (arg0 == 6903) {
					anIntArray523[anInt8974++] = Static215.anInt4513;
					return;
				}
				if (arg0 == 6904) {
					anIntArray523[anInt8974++] = Static570.anInt10304;
					return;
				}
				if (arg0 == 6905) {
					local83 = "";
					if (Static412.aClass316_6 != null) {
						if (Static412.aClass316_6.anObject136 == null) {
							local83 = Static193.method3174(Static412.aClass316_6.anInt9477);
						} else {
							local83 = (String) Static412.aClass316_6.anObject136;
						}
					}
					aStringArray35[anInt8965++] = local83;
					return;
				}
				if (arg0 == 6906) {
					anIntArray523[anInt8974++] = Static361.anInt6988;
					return;
				}
				if (arg0 == 6907) {
					anIntArray523[anInt8974++] = Static346.anInt6643;
					return;
				}
				if (arg0 == 6908) {
					anIntArray523[anInt8974++] = Static381.anInt7498;
					return;
				}
				if (arg0 == 6909) {
					anIntArray523[anInt8974++] = Static4.aBoolean141 ? 1 : 0;
					return;
				}
				if (arg0 == 6910) {
					anIntArray523[anInt8974++] = Static168.anInt3486;
					return;
				}
				if (arg0 == 6911) {
					anIntArray523[anInt8974++] = Static568.anInt10301;
					return;
				}
				if (arg0 == 6912) {
					anIntArray523[anInt8974++] = Static76.anInt1925;
					return;
				}
			} else if (arg0 < 7100) {
				if (arg0 == 7000) {
					local175 = Static455.aClass4_Sub35_Sub1_1.method7638();
					anIntArray523[anInt8974++] = Static455.aClass4_Sub35_Sub1_1.anInt9948 = Static453.anInt8614;
					anIntArray523[anInt8974++] = local175;
					Static472.method6892();
					Static455.aClass4_Sub35_Sub1_1.method7631(Static372.aClass366_5);
					Static556.aBoolean698 = false;
					return;
				}
				if (arg0 == 7001) {
					Static455.aClass4_Sub35_Sub1_1.method7620();
					Static472.method6892();
					Static455.aClass4_Sub35_Sub1_1.method7631(Static372.aClass366_5);
					Static556.aBoolean698 = false;
					return;
				}
				if (arg0 == 7002) {
					Static455.aClass4_Sub35_Sub1_1.method7637();
					Static472.method6892();
					Static455.aClass4_Sub35_Sub1_1.method7631(Static372.aClass366_5);
					Static556.aBoolean698 = false;
					return;
				}
				if (arg0 == 7003) {
					Static455.aClass4_Sub35_Sub1_1.method7633();
					Static472.method6892();
					Static455.aClass4_Sub35_Sub1_1.method7631(Static372.aClass366_5);
					Static556.aBoolean698 = false;
					return;
				}
				if (arg0 == 7004) {
					Static455.aClass4_Sub35_Sub1_1.method7636(true);
					Static472.method6892();
					Static455.aClass4_Sub35_Sub1_1.method7631(Static372.aClass366_5);
					Static556.aBoolean698 = false;
					return;
				}
				if (arg0 == 7005) {
					Static455.aClass4_Sub35_Sub1_1.anInt9934 = 0;
					Static455.aClass4_Sub35_Sub1_1.method7631(Static372.aClass366_5);
					Static556.aBoolean698 = false;
					return;
				}
				if (arg0 == 7006) {
					if (Static455.aClass4_Sub35_Sub1_1.anInt9948 == 2) {
						Static455.aClass4_Sub35_Sub1_1.aBoolean686 = true;
						return;
					}
					if (Static455.aClass4_Sub35_Sub1_1.anInt9948 == 1) {
						Static455.aClass4_Sub35_Sub1_1.aBoolean687 = true;
						return;
					}
					if (Static455.aClass4_Sub35_Sub1_1.anInt9948 == 3) {
						Static455.aClass4_Sub35_Sub1_1.aBoolean689 = true;
					}
					return;
				}
				if (arg0 == 7007) {
					anIntArray523[anInt8974++] = Static455.aClass4_Sub35_Sub1_1.anInt9934;
					return;
				}
				if (arg0 == 7008) {
					if (Static453.anInt8614 == 0 && Static503.anInt9410 < 96) {
						anIntArray523[anInt8974++] = 1;
						return;
					}
					anIntArray523[anInt8974++] = 4;
					return;
				}
			}
		}
		throw new IllegalStateException(String.valueOf(arg0));
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lclient!jda;II)V")
	public static void method6882(@OriginalArg(0) Class162 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Class4_Sub6_Sub19 local5 = Static232.method3763(arg1, arg0, arg2);
		if (local5 == null) {
			return;
		}
		anIntArray522 = new int[local5.anInt10140];
		aStringArray34 = new String[local5.anInt10134];
		if (local5.aClass162_11 == Static214.aClass162_4 || local5.aClass162_11 == Static475.aClass162_12 || local5.aClass162_11 == Static131.aClass162_3) {
			@Pc(30) int local30 = 0;
			@Pc(32) int local32 = 0;
			if (Static571.aClass155_17 != null) {
				local30 = Static571.aClass155_17.anInt4795;
				local32 = Static571.aClass155_17.anInt4799;
			}
			anIntArray522[0] = Static294.aClass83_1.method6895() - local30;
			anIntArray522[1] = Static294.aClass83_1.method6896() - local32;
		}
		method6879(local5, 200000);
	}

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "(I)V")
	private static void method6883(@OriginalArg(0) int arg0) {
		@Pc(3) Class155 local3 = Static558.method7916(arg0);
		if (local3 == null) {
			return;
		}
		@Pc(9) int local9 = arg0 >>> 16;
		@Pc(13) Class155[] local13 = Static264.aClass155ArrayArray1[local9];
		if (local13 == null) {
			@Pc(19) Class155[] local19 = Static535.aClass155ArrayArray2[local9];
			@Pc(22) int local22 = local19.length;
			local13 = Static264.aClass155ArrayArray1[local9] = new Class155[local22];
			Static599.method3061(local19, 0, local13, 0, local19.length);
		}
		@Pc(38) int local38;
		for (local38 = 0; local38 < local13.length && local13[local38] != local3; local38++) {
		}
		if (local38 >= local13.length) {
			return;
		}
		Static599.method3061(local13, 0, local13, 1, local38);
		local13[0] = local3;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lclient!or;)V")
	public static void method6884(@OriginalArg(0) Class4_Sub37 arg0) {
		method6878(arg0, 200000);
	}

	@OriginalMember(owner = "client!sb", name = "c", descriptor = "(I)Ljava/lang/String;")
	private static String method6885(@OriginalArg(0) int arg0) {
		@Pc(6) long local6 = ((long) arg0 + 11745L) * 86400000L;
		aCalendar2.setTime(new Date(local6));
		@Pc(16) int local16 = aCalendar2.get(5);
		@Pc(20) int local20 = aCalendar2.get(2);
		@Pc(24) int local24 = aCalendar2.get(1);
		return local16 + "-" + aStringArray36[local20] + "-" + local24;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "()V")
	public static void method6886() {
	}

	@OriginalMember(owner = "client!sb", name = "d", descriptor = "(I)V")
	private static void method6887(@OriginalArg(0) int arg0) {
		@Pc(3) Class155 local3 = Static558.method7916(arg0);
		if (local3 == null) {
			return;
		}
		@Pc(9) int local9 = arg0 >>> 16;
		@Pc(13) Class155[] local13 = Static264.aClass155ArrayArray1[local9];
		if (local13 == null) {
			@Pc(19) Class155[] local19 = Static535.aClass155ArrayArray2[local9];
			@Pc(22) int local22 = local19.length;
			local13 = Static264.aClass155ArrayArray1[local9] = new Class155[local22];
			Static599.method3061(local19, 0, local13, 0, local19.length);
		}
		@Pc(38) int local38;
		for (local38 = 0; local38 < local13.length && local13[local38] != local3; local38++) {
		}
		if (local38 >= local13.length) {
			return;
		}
		Static599.method3061(local13, local38 + 1, local13, local38, local13.length - local38 - 1);
		local13[local13.length - 1] = local3;
	}

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "(IZ)V")
	public static void method6889() {
	}

	@OriginalMember(owner = "client!sb", name = "c", descriptor = "(IZ)V")
	private static void method6890(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(137) Class155 local137;
		@Pc(25) int local25;
		@Pc(56) int local56;
		@Pc(19) int local19;
		@Pc(35) Class155 local35;
		@Pc(13) int local13;
		@Pc(210) Class155 local210;
		@Pc(158) Class155 local158;
		if (arg0 < 300) {
			if (arg0 == 100) {
				anInt8974 -= 3;
				local13 = anIntArray523[anInt8974];
				local19 = anIntArray523[anInt8974 + 1];
				local25 = anIntArray523[anInt8974 + 2];
				if (local19 == 0) {
					throw new RuntimeException();
				}
				local35 = Static558.method7916(local13);
				if (local35.aClass155Array2 == null) {
					local35.aClass155Array2 = new Class155[local25 + 1];
				}
				if (local35.aClass155Array2.length <= local25) {
					@Pc(54) Class155[] local54 = new Class155[local25 + 1];
					for (local56 = 0; local56 < local35.aClass155Array2.length; local56++) {
						local54[local56] = local35.aClass155Array2[local56];
					}
					local35.aClass155Array2 = local54;
				}
				if (local25 > 0 && local35.aClass155Array2[local25 - 1] == null) {
					throw new RuntimeException("Gap at:" + (local25 - 1));
				}
				@Pc(99) Class155 local99 = new Class155();
				local99.anInt4796 = local19;
				local99.anInt4769 = local99.anInt4793 = local35.anInt4793;
				local99.anInt4765 = local25;
				local35.aClass155Array2[local25] = local99;
				if (arg1) {
					aClass155_14 = local99;
				} else {
					aClass155_15 = local99;
				}
				Static368.method5060(local35);
				return;
			}
			if (arg0 == 101) {
				local137 = arg1 ? aClass155_14 : aClass155_15;
				if (local137.anInt4765 == -1) {
					if (arg1) {
						throw new RuntimeException("Tried to .cc_delete static .active-component!");
					}
					throw new RuntimeException("Tried to cc_delete static active-component!");
				}
				local158 = Static558.method7916(local137.anInt4793);
				local158.aClass155Array2[local137.anInt4765] = null;
				Static368.method5060(local158);
				return;
			}
			if (arg0 == 102) {
				local137 = Static558.method7916(anIntArray523[--anInt8974]);
				local137.aClass155Array2 = null;
				Static368.method5060(local137);
				return;
			}
			if (arg0 == 200) {
				anInt8974 -= 2;
				local13 = anIntArray523[anInt8974];
				local19 = anIntArray523[anInt8974 + 1];
				local210 = Static539.method7544(local13, local19);
				if (local210 != null && local19 != -1) {
					anIntArray523[anInt8974++] = 1;
					if (arg1) {
						aClass155_14 = local210;
						return;
					}
					aClass155_15 = local210;
					return;
				}
				anIntArray523[anInt8974++] = 0;
				return;
			}
			if (arg0 == 201) {
				local13 = anIntArray523[--anInt8974];
				local158 = Static558.method7916(local13);
				if (local158 != null) {
					anIntArray523[anInt8974++] = 1;
					if (arg1) {
						aClass155_14 = local158;
						return;
					}
					aClass155_15 = local158;
					return;
				}
				anIntArray523[anInt8974++] = 0;
				return;
			}
			if (arg0 == 202) {
				local13 = anIntArray523[--anInt8974];
				method6887(local13);
				return;
			}
			if (arg0 == 203) {
				local13 = anIntArray523[--anInt8974];
				method6883(local13);
				return;
			}
		} else {
			@Pc(353) int local353;
			@Pc(412) boolean local412;
			if (arg0 < 500) {
				if (arg0 == 403) {
					anInt8974 -= 2;
					local13 = anIntArray523[anInt8974];
					local19 = anIntArray523[anInt8974 + 1];
					for (local25 = 0; local25 < Static309.anIntArray346.length; local25++) {
						if (Static309.anIntArray346[local25] == local13) {
							Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2.aClass206_1.method4891(local25, local19, Static516.aClass127_2);
							return;
						}
					}
					for (local353 = 0; local353 < Static76.anIntArray86.length; local353++) {
						if (Static76.anIntArray86[local353] == local13) {
							Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2.aClass206_1.method4891(local353, local19, Static516.aClass127_2);
							return;
						}
					}
					return;
				}
				if (arg0 == 404) {
					anInt8974 -= 2;
					local13 = anIntArray523[anInt8974];
					local19 = anIntArray523[anInt8974 + 1];
					Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2.aClass206_1.method4893(local13, local19);
					return;
				}
				if (arg0 == 410) {
					local412 = anIntArray523[--anInt8974] != 0;
					Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2.aClass206_1.method4894(local412);
					return;
				}
				if (arg0 == 411) {
					anInt8974 -= 2;
					local13 = anIntArray523[anInt8974];
					local19 = anIntArray523[anInt8974 + 1];
					Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2.aClass206_1.method4889(Static338.aClass29_1, local13, local19);
					return;
				}
			} else if ((arg0 < 1000 || arg0 >= 1100) && (arg0 < 2000 || arg0 >= 2100)) {
				@Pc(1507) String local1507;
				@Pc(1145) String local1145;
				if (arg0 >= 1100 && arg0 < 1200 || arg0 >= 2100 && arg0 < 2200) {
					if (arg0 >= 2000) {
						arg0 -= 1000;
						local137 = Static558.method7916(anIntArray523[--anInt8974]);
					} else {
						local137 = arg1 ? aClass155_14 : aClass155_15;
					}
					if (arg0 == 1100) {
						anInt8974 -= 2;
						local137.anInt4758 = anIntArray523[anInt8974];
						if (local137.anInt4758 > local137.anInt4778 - local137.anInt4806) {
							local137.anInt4758 = local137.anInt4778 - local137.anInt4806;
						}
						if (local137.anInt4758 < 0) {
							local137.anInt4758 = 0;
						}
						local137.anInt4762 = anIntArray523[anInt8974 + 1];
						if (local137.anInt4762 > local137.anInt4801 - local137.anInt4831) {
							local137.anInt4762 = local137.anInt4801 - local137.anInt4831;
						}
						if (local137.anInt4762 < 0) {
							local137.anInt4762 = 0;
						}
						Static368.method5060(local137);
						if (local137.anInt4765 == -1) {
							Static479.method6965(local137.anInt4793);
						}
						return;
					}
					if (arg0 == 1101) {
						local137.anInt4794 = anIntArray523[--anInt8974];
						Static368.method5060(local137);
						if (local137.anInt4765 == -1) {
							Static542.method7593(local137.anInt4793);
						}
						return;
					}
					if (arg0 == 1102) {
						local137.aBoolean325 = anIntArray523[--anInt8974] == 1;
						Static368.method5060(local137);
						return;
					}
					if (arg0 == 1103) {
						local137.anInt4772 = anIntArray523[--anInt8974];
						Static368.method5060(local137);
						return;
					}
					if (arg0 == 1104) {
						local137.anInt4750 = anIntArray523[--anInt8974];
						Static368.method5060(local137);
						return;
					}
					if (arg0 == 1105) {
						local19 = anIntArray523[--anInt8974];
						if (local137.anInt4820 != local19) {
							local137.anInt4820 = local19;
							Static368.method5060(local137);
						}
						if (local137.anInt4765 == -1) {
							Static63.method1400(local137.anInt4793);
						}
						return;
					}
					if (arg0 == 1106) {
						local137.anInt4826 = anIntArray523[--anInt8974];
						Static368.method5060(local137);
						return;
					}
					if (arg0 == 1107) {
						local137.aBoolean336 = anIntArray523[--anInt8974] == 1;
						Static368.method5060(local137);
						return;
					}
					if (arg0 == 1108) {
						local137.anInt4764 = 1;
						local137.anInt4802 = anIntArray523[--anInt8974];
						Static368.method5060(local137);
						if (local137.anInt4765 == -1) {
							Static58.method1349(local137.anInt4793);
						}
						return;
					}
					if (arg0 == 1109) {
						anInt8974 -= 6;
						local137.anInt4776 = anIntArray523[anInt8974];
						local137.anInt4810 = anIntArray523[anInt8974 + 1];
						local137.anInt4789 = anIntArray523[anInt8974 + 2];
						local137.anInt4809 = anIntArray523[anInt8974 + 3];
						local137.anInt4813 = anIntArray523[anInt8974 + 4];
						local137.anInt4797 = anIntArray523[anInt8974 + 5];
						Static368.method5060(local137);
						if (local137.anInt4765 == -1) {
							Static266.method4176(local137.anInt4793);
							Static61.method1378(local137.anInt4793);
						}
						return;
					}
					if (arg0 == 1110) {
						local19 = anIntArray523[--anInt8974];
						if (local137.anInt4805 != local19) {
							local137.anInt4805 = local19;
							local137.anInt4775 = 0;
							local137.anInt4747 = 1;
							local137.anInt4773 = 0;
							@Pc(1094) Class111 local1094 = local137.anInt4805 == -1 ? null : Static17.aClass254_1.method5936(local137.anInt4805);
							if (local1094 != null) {
								Static435.method6470(local137.anInt4775, local1094);
							}
							Static368.method5060(local137);
						}
						if (local137.anInt4765 == -1) {
							Static487.method7080(local137.anInt4793);
						}
						return;
					}
					if (arg0 == 1111) {
						local137.aBoolean324 = anIntArray523[--anInt8974] == 1;
						Static368.method5060(local137);
						return;
					}
					if (arg0 == 1112) {
						local1145 = aStringArray35[--anInt8965];
						if (!local1145.equals(local137.aString99)) {
							local137.aString99 = local1145;
							Static368.method5060(local137);
						}
						if (local137.anInt4765 == -1) {
							Static428.method6375(local137.anInt4793);
						}
						return;
					}
					if (arg0 == 1113) {
						local137.anInt4824 = anIntArray523[--anInt8974];
						Static368.method5060(local137);
						if (local137.anInt4765 == -1) {
							Static579.method8127(local137.anInt4793);
						}
						return;
					}
					if (arg0 == 1114) {
						anInt8974 -= 3;
						local137.anInt4818 = anIntArray523[anInt8974];
						local137.anInt4777 = anIntArray523[anInt8974 + 1];
						local137.anInt4828 = anIntArray523[anInt8974 + 2];
						Static368.method5060(local137);
						return;
					}
					if (arg0 == 1115) {
						local137.aBoolean338 = anIntArray523[--anInt8974] == 1;
						Static368.method5060(local137);
						return;
					}
					if (arg0 == 1116) {
						local137.anInt4749 = anIntArray523[--anInt8974];
						Static368.method5060(local137);
						return;
					}
					if (arg0 == 1117) {
						local137.anInt4823 = anIntArray523[--anInt8974];
						Static368.method5060(local137);
						return;
					}
					if (arg0 == 1118) {
						local137.aBoolean331 = anIntArray523[--anInt8974] == 1;
						Static368.method5060(local137);
						return;
					}
					if (arg0 == 1119) {
						local137.aBoolean327 = anIntArray523[--anInt8974] == 1;
						Static368.method5060(local137);
						return;
					}
					if (arg0 == 1120) {
						anInt8974 -= 2;
						local137.anInt4778 = anIntArray523[anInt8974];
						local137.anInt4801 = anIntArray523[anInt8974 + 1];
						Static368.method5060(local137);
						if (local137.anInt4796 == 0) {
							Static162.method2682(false, local137);
						}
						return;
					}
					if (arg0 == 1122) {
						local137.aBoolean323 = anIntArray523[--anInt8974] == 1;
						Static368.method5060(local137);
						return;
					}
					if (arg0 == 1123) {
						local137.anInt4797 = anIntArray523[--anInt8974];
						Static368.method5060(local137);
						if (local137.anInt4765 == -1) {
							Static266.method4176(local137.anInt4793);
						}
						return;
					}
					if (arg0 == 1124) {
						local19 = anIntArray523[--anInt8974];
						local137.aBoolean328 = local19 == 1;
						Static368.method5060(local137);
						return;
					}
					if (arg0 == 1125) {
						anInt8974 -= 2;
						local137.anInt4812 = anIntArray523[anInt8974];
						local137.anInt4744 = anIntArray523[anInt8974 + 1];
						Static368.method5060(local137);
						return;
					}
					if (arg0 == 1126) {
						local137.anInt4782 = anIntArray523[--anInt8974];
						Static368.method5060(local137);
						return;
					}
					@Pc(1473) Class275 local1473;
					if (arg0 == 1127) {
						anInt8974 -= 2;
						local19 = anIntArray523[anInt8974];
						local25 = anIntArray523[anInt8974 + 1];
						local1473 = Static245.aClass107_2.method2503(local19);
						if (local25 != local1473.anInt8186) {
							local137.method3694(local19, local25);
							return;
						}
						local137.method3699(local19);
						return;
					}
					if (arg0 == 1128) {
						local19 = anIntArray523[--anInt8974];
						local1507 = aStringArray35[--anInt8965];
						local1473 = Static245.aClass107_2.method2503(local19);
						if (!local1473.aString170.equals(local1507)) {
							local137.method3693(local19, local1507);
							return;
						}
						local137.method3699(local19);
						return;
					}
				} else if ((arg0 < 1200 || arg0 >= 1300) && (arg0 < 2200 || arg0 >= 2300)) {
					@Pc(2309) int local2309;
					if (arg0 >= 1300 && arg0 < 1400 || arg0 >= 2300 && arg0 < 2400) {
						if (arg0 >= 2000) {
							arg0 -= 1000;
							local137 = Static558.method7916(anIntArray523[--anInt8974]);
						} else {
							local137 = arg1 ? aClass155_14 : aClass155_15;
						}
						if (arg0 == 1300) {
							local19 = anIntArray523[--anInt8974] - 1;
							if (local19 >= 0 && local19 <= 9) {
								local137.method3706(local19, aStringArray35[--anInt8965]);
								return;
							} else {
								anInt8965--;
								return;
							}
						}
						if (arg0 == 1301) {
							anInt8974 -= 2;
							local19 = anIntArray523[anInt8974];
							local25 = anIntArray523[anInt8974 + 1];
							if (local19 == -1 && local25 == -1) {
								local137.aClass155_5 = null;
								return;
							}
							local137.aClass155_5 = Static539.method7544(local19, local25);
							return;
						}
						if (arg0 == 1302) {
							local19 = anIntArray523[--anInt8974];
							if (local19 != Static204.anInt8818 && local19 != Static305.anInt6104 && local19 != Static294.anInt5992) {
								return;
							}
							local137.anInt4753 = local19;
							return;
						}
						if (arg0 == 1303) {
							local137.anInt4748 = anIntArray523[--anInt8974];
							return;
						}
						if (arg0 == 1304) {
							local137.anInt4751 = anIntArray523[--anInt8974];
							return;
						}
						if (arg0 == 1305) {
							local137.aString97 = aStringArray35[--anInt8965];
							return;
						}
						if (arg0 == 1306) {
							local137.aString96 = aStringArray35[--anInt8965];
							return;
						}
						if (arg0 == 1307) {
							local137.aStringArray18 = null;
							return;
						}
						if (arg0 == 1308) {
							local137.anInt4752 = anIntArray523[--anInt8974];
							local137.anInt4746 = anIntArray523[--anInt8974];
							return;
						}
						if (arg0 == 1309) {
							local19 = anIntArray523[--anInt8974];
							local25 = anIntArray523[--anInt8974];
							if (local25 >= 1 && local25 <= 10) {
								local137.method3702(local25 - 1, local19);
							}
							return;
						}
						if (arg0 == 1310) {
							local137.aString98 = aStringArray35[--anInt8965];
							return;
						}
						if (arg0 == 1311) {
							local137.anInt4798 = anIntArray523[--anInt8974];
							return;
						}
						if (arg0 == 1312 || arg0 == 1313) {
							if (arg0 == 1312) {
								anInt8974 -= 3;
								local19 = anIntArray523[anInt8974] - 1;
								local25 = anIntArray523[anInt8974 + 1];
								local353 = anIntArray523[anInt8974 + 2];
								if (local19 < 0 || local19 > 9) {
									throw new RuntimeException("IOR13121313");
								}
							} else {
								anInt8974 -= 2;
								local19 = 10;
								local25 = anIntArray523[anInt8974];
								local353 = anIntArray523[anInt8974 + 1];
							}
							if (local137.aByteArray36 == null) {
								if (local25 == 0) {
									return;
								}
								local137.aByteArray36 = new byte[11];
								local137.aByteArray37 = new byte[11];
								local137.anIntArray236 = new int[11];
							}
							local137.aByteArray36[local19] = (byte) local25;
							if (local25 == 0) {
								local137.aBoolean326 = false;
								for (local2309 = 0; local2309 < local137.aByteArray36.length; local2309++) {
									if (local137.aByteArray36[local2309] != 0) {
										local137.aBoolean326 = true;
										break;
									}
								}
							} else {
								local137.aBoolean326 = true;
							}
							local137.aByteArray37[local19] = (byte) local353;
							return;
						}
						if (arg0 == 1314) {
							local137.anInt4790 = anIntArray523[--anInt8974];
							return;
						}
					} else if (arg0 >= 1400 && arg0 < 1500 || arg0 >= 2400 && arg0 < 2500) {
						if (arg0 >= 2000) {
							arg0 -= 1000;
							local137 = Static558.method7916(anIntArray523[--anInt8974]);
						} else {
							local137 = arg1 ? aClass155_14 : aClass155_15;
						}
						if (arg0 == 1499) {
							local137.method3692();
							return;
						}
						local1145 = aStringArray35[--anInt8965];
						@Pc(2395) int[] local2395 = null;
						if (local1145.length() > 0 && local1145.charAt(local1145.length() - 1) == 'Y') {
							local353 = anIntArray523[--anInt8974];
							if (local353 > 0) {
								local2395 = new int[local353];
								while (local353-- > 0) {
									local2395[local353] = anIntArray523[--anInt8974];
								}
							}
							local1145 = local1145.substring(0, local1145.length() - 1);
						}
						@Pc(2447) Object[] local2447 = new Object[local1145.length() + 1];
						for (local2309 = local2447.length - 1; local2309 >= 1; local2309--) {
							if (local1145.charAt(local2309 - 1) == 's') {
								local2447[local2309] = aStringArray35[--anInt8965];
							} else {
								local2447[local2309] = Integer.valueOf(anIntArray523[--anInt8974]);
							}
						}
						local56 = anIntArray523[--anInt8974];
						if (local56 == -1) {
							local2447 = null;
						} else {
							local2447[0] = Integer.valueOf(local56);
						}
						if (arg0 == 1400) {
							local137.anObjectArray14 = local2447;
						} else if (arg0 == 1401) {
							local137.anObjectArray9 = local2447;
						} else if (arg0 == 1402) {
							local137.anObjectArray10 = local2447;
						} else if (arg0 == 1403) {
							local137.anObjectArray15 = local2447;
						} else if (arg0 == 1404) {
							local137.anObjectArray19 = local2447;
						} else if (arg0 == 1405) {
							local137.anObjectArray7 = local2447;
						} else if (arg0 == 1406) {
							local137.anObjectArray3 = local2447;
						} else if (arg0 == 1407) {
							local137.anObjectArray26 = local2447;
							local137.anIntArray232 = local2395;
						} else if (arg0 == 1408) {
							local137.anObjectArray11 = local2447;
						} else if (arg0 == 1409) {
							local137.anObjectArray28 = local2447;
						} else if (arg0 == 1410) {
							local137.anObjectArray20 = local2447;
						} else if (arg0 == 1411) {
							local137.anObjectArray17 = local2447;
						} else if (arg0 == 1412) {
							local137.anObjectArray21 = local2447;
						} else if (arg0 == 1414) {
							local137.anObjectArray25 = local2447;
							local137.anIntArray231 = local2395;
						} else if (arg0 == 1415) {
							local137.anObjectArray24 = local2447;
							local137.anIntArray234 = local2395;
						} else if (arg0 == 1416) {
							local137.anObjectArray23 = local2447;
						} else if (arg0 == 1417) {
							local137.anObjectArray18 = local2447;
						} else if (arg0 == 1418) {
							local137.anObjectArray1 = local2447;
						} else if (arg0 == 1419) {
							local137.lb = local2447;
						} else if (arg0 == 1420) {
							local137.anObjectArray4 = local2447;
						} else if (arg0 == 1421) {
							local137.anObjectArray2 = local2447;
						} else if (arg0 == 1422) {
							local137.anObjectArray27 = local2447;
						} else if (arg0 == 1423) {
							local137.anObjectArray8 = local2447;
						} else if (arg0 == 1424) {
							local137.anObjectArray6 = local2447;
						} else if (arg0 == 1425) {
							local137.anObjectArray30 = local2447;
						} else if (arg0 == 1426) {
							local137.anObjectArray5 = local2447;
						} else if (arg0 == 1427) {
							local137.anObjectArray22 = local2447;
						} else if (arg0 == 1428) {
							local137.anObjectArray12 = local2447;
							local137.anIntArray237 = local2395;
						} else if (arg0 == 1429) {
							local137.anObjectArray16 = local2447;
							local137.anIntArray229 = local2395;
						} else if (arg0 == 1430) {
							local137.anObjectArray13 = local2447;
						}
						local137.aBoolean337 = true;
						return;
					} else if (arg0 < 1600) {
						local137 = arg1 ? aClass155_14 : aClass155_15;
						if (arg0 == 1500) {
							anIntArray523[anInt8974++] = local137.anInt4795;
							return;
						}
						if (arg0 == 1501) {
							anIntArray523[anInt8974++] = local137.anInt4799;
							return;
						}
						if (arg0 == 1502) {
							anIntArray523[anInt8974++] = local137.anInt4806;
							return;
						}
						if (arg0 == 1503) {
							anIntArray523[anInt8974++] = local137.anInt4831;
							return;
						}
						if (arg0 == 1504) {
							anIntArray523[anInt8974++] = local137.aBoolean329 ? 1 : 0;
							return;
						}
						if (arg0 == 1505) {
							anIntArray523[anInt8974++] = local137.anInt4769;
							return;
						}
						if (arg0 == 1506) {
							local158 = Static510.method5509(local137);
							anIntArray523[anInt8974++] = local158 == null ? -1 : local158.anInt4793;
							return;
						}
					} else {
						@Pc(3043) Class275 local3043;
						if (arg0 < 1700) {
							local137 = arg1 ? aClass155_14 : aClass155_15;
							if (arg0 == 1600) {
								anIntArray523[anInt8974++] = local137.anInt4758;
								return;
							}
							if (arg0 == 1601) {
								anIntArray523[anInt8974++] = local137.anInt4762;
								return;
							}
							if (arg0 == 1602) {
								aStringArray35[anInt8965++] = local137.aString99;
								return;
							}
							if (arg0 == 1603) {
								anIntArray523[anInt8974++] = local137.anInt4778;
								return;
							}
							if (arg0 == 1604) {
								anIntArray523[anInt8974++] = local137.anInt4801;
								return;
							}
							if (arg0 == 1605) {
								anIntArray523[anInt8974++] = local137.anInt4797;
								return;
							}
							if (arg0 == 1606) {
								anIntArray523[anInt8974++] = local137.anInt4789;
								return;
							}
							if (arg0 == 1607) {
								anIntArray523[anInt8974++] = local137.anInt4813;
								return;
							}
							if (arg0 == 1608) {
								anIntArray523[anInt8974++] = local137.anInt4809;
								return;
							}
							if (arg0 == 1609) {
								anIntArray523[anInt8974++] = local137.anInt4772;
								return;
							}
							if (arg0 == 1610) {
								anIntArray523[anInt8974++] = local137.anInt4776;
								return;
							}
							if (arg0 == 1611) {
								anIntArray523[anInt8974++] = local137.anInt4810;
								return;
							}
							if (arg0 == 1612) {
								anIntArray523[anInt8974++] = local137.anInt4820;
								return;
							}
							if (arg0 == 1613) {
								local19 = anIntArray523[--anInt8974];
								local3043 = Static245.aClass107_2.method2503(local19);
								if (local3043.method6374()) {
									aStringArray35[anInt8965++] = local137.method3703(local19, local3043.aString170);
									return;
								}
								anIntArray523[anInt8974++] = local137.method3704(local3043.anInt8186, local19);
								return;
							}
							if (arg0 == 1614) {
								anIntArray523[anInt8974++] = local137.anInt4826;
								return;
							}
							if (arg0 == 2614) {
								anIntArray523[anInt8974++] = local137.anInt4764 == 1 ? local137.anInt4802 : -1;
								return;
							}
						} else if (arg0 < 1800) {
							local137 = arg1 ? aClass155_14 : aClass155_15;
							if (arg0 == 1700) {
								anIntArray523[anInt8974++] = local137.anInt4785;
								return;
							}
							if (arg0 == 1701) {
								if (local137.anInt4785 != -1) {
									anIntArray523[anInt8974++] = local137.anInt4742;
									return;
								}
								anIntArray523[anInt8974++] = 0;
								return;
							}
							if (arg0 == 1702) {
								anIntArray523[anInt8974++] = local137.anInt4765;
								return;
							}
						} else if (arg0 < 1900) {
							local137 = arg1 ? aClass155_14 : aClass155_15;
							if (arg0 == 1800) {
								anIntArray523[anInt8974++] = Static70.method1542(local137).method6330();
								return;
							}
							if (arg0 == 1801) {
								local19 = anIntArray523[--anInt8974];
								local19--;
								if (local137.aStringArray18 != null && local19 < local137.aStringArray18.length && local137.aStringArray18[local19] != null) {
									aStringArray35[anInt8965++] = local137.aStringArray18[local19];
									return;
								}
								aStringArray35[anInt8965++] = "";
								return;
							}
							if (arg0 == 1802) {
								if (local137.aString97 == null) {
									aStringArray35[anInt8965++] = "";
									return;
								}
								aStringArray35[anInt8965++] = local137.aString97;
								return;
							}
						} else if (arg0 < 2000 || arg0 >= 2900 && arg0 < 3000) {
							if (arg0 >= 2000) {
								local137 = Static558.method7916(anIntArray523[--anInt8974]);
								arg0 -= 1000;
							} else {
								local137 = arg1 ? aClass155_14 : aClass155_15;
							}
							if (anInt8976 >= 10) {
								throw new RuntimeException("C29xx-1");
							}
							if (arg0 == 1927) {
								if (local137.anObjectArray22 == null) {
									return;
								}
								@Pc(3312) Class4_Sub37 local3312 = new Class4_Sub37();
								local3312.aClass155_10 = local137;
								local3312.anObjectArray31 = local137.anObjectArray22;
								local3312.anInt7561 = anInt8976 + 1;
								Static197.aClass22_23.method894(local3312);
								return;
							}
						} else if (arg0 < 2600) {
							local137 = Static558.method7916(anIntArray523[--anInt8974]);
							if (arg0 == 2500) {
								anIntArray523[anInt8974++] = local137.anInt4795;
								return;
							}
							if (arg0 == 2501) {
								anIntArray523[anInt8974++] = local137.anInt4799;
								return;
							}
							if (arg0 == 2502) {
								anIntArray523[anInt8974++] = local137.anInt4806;
								return;
							}
							if (arg0 == 2503) {
								anIntArray523[anInt8974++] = local137.anInt4831;
								return;
							}
							if (arg0 == 2504) {
								anIntArray523[anInt8974++] = local137.aBoolean329 ? 1 : 0;
								return;
							}
							if (arg0 == 2505) {
								anIntArray523[anInt8974++] = local137.anInt4769;
								return;
							}
							if (arg0 == 1506) {
								local158 = Static510.method5509(local137);
								anIntArray523[anInt8974++] = local158 == null ? -1 : local158.anInt4793;
								return;
							}
						} else if (arg0 < 2700) {
							local137 = Static558.method7916(anIntArray523[--anInt8974]);
							if (arg0 == 2600) {
								anIntArray523[anInt8974++] = local137.anInt4758;
								return;
							}
							if (arg0 == 2601) {
								anIntArray523[anInt8974++] = local137.anInt4762;
								return;
							}
							if (arg0 == 2602) {
								aStringArray35[anInt8965++] = local137.aString99;
								return;
							}
							if (arg0 == 2603) {
								anIntArray523[anInt8974++] = local137.anInt4778;
								return;
							}
							if (arg0 == 2604) {
								anIntArray523[anInt8974++] = local137.anInt4801;
								return;
							}
							if (arg0 == 2605) {
								anIntArray523[anInt8974++] = local137.anInt4797;
								return;
							}
							if (arg0 == 2606) {
								anIntArray523[anInt8974++] = local137.anInt4789;
								return;
							}
							if (arg0 == 2607) {
								anIntArray523[anInt8974++] = local137.anInt4813;
								return;
							}
							if (arg0 == 2608) {
								anIntArray523[anInt8974++] = local137.anInt4809;
								return;
							}
							if (arg0 == 2609) {
								anIntArray523[anInt8974++] = local137.anInt4772;
								return;
							}
							if (arg0 == 2610) {
								anIntArray523[anInt8974++] = local137.anInt4776;
								return;
							}
							if (arg0 == 2611) {
								anIntArray523[anInt8974++] = local137.anInt4810;
								return;
							}
							if (arg0 == 2612) {
								anIntArray523[anInt8974++] = local137.anInt4820;
								return;
							}
							if (arg0 == 2613) {
								anIntArray523[anInt8974++] = local137.anInt4826;
								return;
							}
							if (arg0 == 2614) {
								anIntArray523[anInt8974++] = local137.anInt4764 == 1 ? local137.anInt4802 : -1;
								return;
							}
						} else {
							@Pc(3841) Class4_Sub45 local3841;
							@Pc(3739) Class4_Sub45 local3739;
							if (arg0 < 2800) {
								if (arg0 == 2700) {
									local137 = Static558.method7916(anIntArray523[--anInt8974]);
									anIntArray523[anInt8974++] = local137.anInt4785;
									return;
								}
								if (arg0 == 2701) {
									local137 = Static558.method7916(anIntArray523[--anInt8974]);
									if (local137.anInt4785 != -1) {
										anIntArray523[anInt8974++] = local137.anInt4742;
										return;
									}
									anIntArray523[anInt8974++] = 0;
									return;
								}
								if (arg0 == 2702) {
									local13 = anIntArray523[--anInt8974];
									local3739 = (Class4_Sub45) Static569.aClass221_27.method5075((long) local13);
									if (local3739 != null) {
										anIntArray523[anInt8974++] = 1;
										return;
									}
									anIntArray523[anInt8974++] = 0;
									return;
								}
								if (arg0 == 2703) {
									local137 = Static558.method7916(anIntArray523[--anInt8974]);
									if (local137.aClass155Array2 == null) {
										anIntArray523[anInt8974++] = 0;
										return;
									}
									local19 = local137.aClass155Array2.length;
									for (local25 = 0; local25 < local137.aClass155Array2.length; local25++) {
										if (local137.aClass155Array2[local25] == null) {
											local19 = local25;
											break;
										}
									}
									anIntArray523[anInt8974++] = local19;
									return;
								}
								if (arg0 == 2704 || arg0 == 2705) {
									anInt8974 -= 2;
									local13 = anIntArray523[anInt8974];
									local19 = anIntArray523[anInt8974 + 1];
									local3841 = (Class4_Sub45) Static569.aClass221_27.method5075((long) local13);
									if (local3841 != null && local3841.anInt9096 == local19) {
										anIntArray523[anInt8974++] = 1;
										return;
									}
									anIntArray523[anInt8974++] = 0;
									return;
								}
							} else if (arg0 < 2900) {
								local137 = Static558.method7916(anIntArray523[--anInt8974]);
								if (arg0 == 2800) {
									anIntArray523[anInt8974++] = Static70.method1542(local137).method6330();
									return;
								}
								if (arg0 == 2801) {
									local19 = anIntArray523[--anInt8974];
									local19--;
									if (local137.aStringArray18 != null && local19 < local137.aStringArray18.length && local137.aStringArray18[local19] != null) {
										aStringArray35[anInt8965++] = local137.aStringArray18[local19];
										return;
									}
									aStringArray35[anInt8965++] = "";
									return;
								}
								if (arg0 == 2802) {
									if (local137.aString97 == null) {
										aStringArray35[anInt8965++] = "";
										return;
									}
									aStringArray35[anInt8965++] = local137.aString97;
									return;
								}
							} else {
								@Pc(3978) String local3978;
								if (arg0 < 3200) {
									if (arg0 == 3100) {
										local3978 = aStringArray35[--anInt8965];
										Static215.method3493(local3978);
										return;
									}
									if (arg0 == 3101) {
										anInt8974 -= 2;
										Static312.method4931(anIntArray523[anInt8974 + 1], anIntArray523[anInt8974], Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2);
										return;
									}
									if (arg0 == 3103) {
										Static36.method1051();
										return;
									}
									if (arg0 == 3104) {
										local3978 = aStringArray35[--anInt8965];
										local19 = 0;
										if (Static256.method4063(local3978)) {
											local19 = Static393.method6016(local3978);
										}
										@Pc(4038) Class4_Sub39 local4038 = Static32.method999(Static402.aClass356_1, Static293.aClass344_48);
										local4038.aClass4_Sub13_Sub2_1.method7032(local19);
										Static50.method1166(local4038);
										return;
									}
									@Pc(4067) Class4_Sub39 local4067;
									if (arg0 == 3105) {
										local3978 = aStringArray35[--anInt8965];
										local4067 = Static32.method999(Static402.aClass356_1, Static197.aClass344_30);
										local4067.aClass4_Sub13_Sub2_1.method7052(local3978.length() + 1);
										local4067.aClass4_Sub13_Sub2_1.method7002(local3978);
										Static50.method1166(local4067);
										return;
									}
									if (arg0 == 3106) {
										local3978 = aStringArray35[--anInt8965];
										local4067 = Static32.method999(Static402.aClass356_1, Static377.aClass344_64);
										local4067.aClass4_Sub13_Sub2_1.method7052(local3978.length() + 1);
										local4067.aClass4_Sub13_Sub2_1.method7002(local3978);
										Static50.method1166(local4067);
										return;
									}
									if (arg0 == 3107) {
										local13 = anIntArray523[--anInt8974];
										local1145 = aStringArray35[--anInt8965];
										Static318.method4988(local13, local1145);
										return;
									}
									if (arg0 == 3108) {
										anInt8974 -= 3;
										local13 = anIntArray523[anInt8974];
										local19 = anIntArray523[anInt8974 + 1];
										local25 = anIntArray523[anInt8974 + 2];
										local35 = Static558.method7916(local25);
										Static189.method3136(local13, local35, local19);
										return;
									}
									if (arg0 == 3109) {
										anInt8974 -= 2;
										local13 = anIntArray523[anInt8974];
										local19 = anIntArray523[anInt8974 + 1];
										local210 = arg1 ? aClass155_14 : aClass155_15;
										Static189.method3136(local13, local210, local19);
										return;
									}
									if (arg0 == 3110) {
										local13 = anIntArray523[--anInt8974];
										local4067 = Static32.method999(Static402.aClass356_1, Static140.aClass344_17);
										local4067.aClass4_Sub13_Sub2_1.method7038(local13);
										Static50.method1166(local4067);
										return;
									}
									if (arg0 == 3111) {
										anInt8974 -= 2;
										local13 = anIntArray523[anInt8974];
										local19 = anIntArray523[anInt8974 + 1];
										local3841 = (Class4_Sub45) Static569.aClass221_27.method5075((long) local13);
										if (local3841 != null) {
											Static205.method3352(local3841.anInt9096 != local19, local3841, true);
										}
										Static21.method829(3, local13, true, local19);
										return;
									}
									if (arg0 == 3112) {
										anInt8974--;
										local13 = anIntArray523[anInt8974];
										local3739 = (Class4_Sub45) Static569.aClass221_27.method5075((long) local13);
										if (local3739 != null && local3739.anInt9095 == 3) {
											Static205.method3352(true, local3739, true);
										}
										return;
									}
									if (arg0 == 3113) {
										Static342.method5245(aStringArray35[--anInt8965]);
										return;
									}
									if (arg0 == 3114) {
										anInt8974 -= 2;
										local13 = anIntArray523[anInt8974];
										local19 = anIntArray523[anInt8974 + 1];
										local1507 = aStringArray35[--anInt8965];
										Static84.method1791(local13, "", "", local1507, local19, "");
										return;
									}
									if (arg0 == 3115) {
										anInt8974 -= 11;
										@Pc(4368) Class347[] local4368 = Static302.method4802();
										@Pc(4371) Class214[] local4371 = Static106.method1999();
										Static552.method7772(anIntArray523[anInt8974 + 3], anIntArray523[anInt8974 + 2], anIntArray523[anInt8974 + 9], anIntArray523[anInt8974 + 6], anIntArray523[anInt8974 + 5], local4371[anIntArray523[anInt8974 + 1]], local4368[anIntArray523[anInt8974]], anIntArray523[anInt8974 + 8], anIntArray523[anInt8974 + 7], anIntArray523[anInt8974 + 4], anIntArray523[anInt8974 + 10]);
										return;
									}
								} else if (arg0 < 3300) {
									if (arg0 == 3200) {
										anInt8974 -= 3;
										Static170.method2832(256, 255, anIntArray523[anInt8974 + 2], anIntArray523[anInt8974 + 1], anIntArray523[anInt8974]);
										return;
									}
									if (arg0 == 3201) {
										Static303.method4805(50, 255, anIntArray523[--anInt8974]);
										return;
									}
									if (arg0 == 3202) {
										anInt8974 -= 2;
										Static462.method6785(anIntArray523[anInt8974], 255, anIntArray523[anInt8974 + 1]);
										return;
									}
									if (arg0 == 3203) {
										anInt8974 -= 4;
										Static170.method2832(256, anIntArray523[anInt8974 + 3], anIntArray523[anInt8974 + 2], anIntArray523[anInt8974 + 1], anIntArray523[anInt8974]);
										return;
									}
									if (arg0 == 3204) {
										anInt8974 -= 3;
										Static303.method4805(anIntArray523[anInt8974 + 2], anIntArray523[anInt8974 + 1], anIntArray523[anInt8974]);
										return;
									}
									if (arg0 == 3205) {
										anInt8974 -= 3;
										Static462.method6785(anIntArray523[anInt8974], anIntArray523[anInt8974 + 2], anIntArray523[anInt8974 + 1]);
										return;
									}
									if (arg0 == 3206) {
										anInt8974 -= 4;
										Static414.method6238(false, anIntArray523[anInt8974 + 3], anIntArray523[anInt8974 + 2], 256, anIntArray523[anInt8974 + 1], anIntArray523[anInt8974]);
										return;
									}
									if (arg0 == 3207) {
										anInt8974 -= 4;
										Static414.method6238(true, anIntArray523[anInt8974 + 3], anIntArray523[anInt8974 + 2], 256, anIntArray523[anInt8974 + 1], anIntArray523[anInt8974]);
										return;
									}
									if (arg0 == 3208) {
										anInt8974 -= 5;
										Static170.method2832(anIntArray523[anInt8974 + 4], anIntArray523[anInt8974 + 3], anIntArray523[anInt8974 + 2], anIntArray523[anInt8974 + 1], anIntArray523[anInt8974]);
										return;
									}
									if (arg0 == 3209) {
										anInt8974 -= 5;
										Static414.method6238(false, anIntArray523[anInt8974 + 3], anIntArray523[anInt8974 + 2], anIntArray523[anInt8974 + 4], anIntArray523[anInt8974 + 1], anIntArray523[anInt8974]);
										return;
									}
								} else if (arg0 < 3400) {
									if (arg0 == 3300) {
										anIntArray523[anInt8974++] = Static306.anInt6122;
										return;
									}
									if (arg0 == 3301) {
										anInt8974 -= 2;
										local13 = anIntArray523[anInt8974];
										local19 = anIntArray523[anInt8974 + 1];
										anIntArray523[anInt8974++] = Static574.method8082(local19, local13, false);
										return;
									}
									if (arg0 == 3302) {
										anInt8974 -= 2;
										local13 = anIntArray523[anInt8974];
										local19 = anIntArray523[anInt8974 + 1];
										anIntArray523[anInt8974++] = Static253.method4039(local13, local19, false);
										return;
									}
									if (arg0 == 3303) {
										anInt8974 -= 2;
										local13 = anIntArray523[anInt8974];
										local19 = anIntArray523[anInt8974 + 1];
										anIntArray523[anInt8974++] = Static414.method6239(false, local13, local19);
										return;
									}
									if (arg0 == 3304) {
										local13 = anIntArray523[--anInt8974];
										anIntArray523[anInt8974++] = Static157.aClass150_1.method3527(local13).anInt5140;
										return;
									}
									if (arg0 == 3305) {
										local13 = anIntArray523[--anInt8974];
										anIntArray523[anInt8974++] = Static230.anIntArray240[local13];
										return;
									}
									if (arg0 == 3306) {
										local13 = anIntArray523[--anInt8974];
										anIntArray523[anInt8974++] = Static460.anIntArray514[local13];
										return;
									}
									if (arg0 == 3307) {
										local13 = anIntArray523[--anInt8974];
										anIntArray523[anInt8974++] = Static278.anIntArray299[local13];
										return;
									}
									if (arg0 == 3308) {
										@Pc(4896) byte local4896 = Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2.aByte127;
										local19 = (Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2.anInt10551 >> 9) + Static242.anInt10133;
										local25 = (Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2.anInt10550 >> 9) + Static157.anInt3323;
										anIntArray523[anInt8974++] = (local4896 << 28) + (local19 << 14) + local25;
										return;
									}
									if (arg0 == 3309) {
										local13 = anIntArray523[--anInt8974];
										anIntArray523[anInt8974++] = local13 >> 14 & 0x3FFF;
										return;
									}
									if (arg0 == 3310) {
										local13 = anIntArray523[--anInt8974];
										anIntArray523[anInt8974++] = local13 >> 28;
										return;
									}
									if (arg0 == 3311) {
										local13 = anIntArray523[--anInt8974];
										anIntArray523[anInt8974++] = local13 & 0x3FFF;
										return;
									}
									if (arg0 == 3312) {
										anIntArray523[anInt8974++] = Static258.aBoolean367 ? 1 : 0;
										return;
									}
									if (arg0 == 3313) {
										anInt8974 -= 2;
										local13 = anIntArray523[anInt8974];
										local19 = anIntArray523[anInt8974 + 1];
										anIntArray523[anInt8974++] = Static574.method8082(local19, local13, true);
										return;
									}
									if (arg0 == 3314) {
										anInt8974 -= 2;
										local13 = anIntArray523[anInt8974];
										local19 = anIntArray523[anInt8974 + 1];
										anIntArray523[anInt8974++] = Static253.method4039(local13, local19, true);
										return;
									}
									if (arg0 == 3315) {
										anInt8974 -= 2;
										local13 = anIntArray523[anInt8974];
										local19 = anIntArray523[anInt8974 + 1];
										anIntArray523[anInt8974++] = Static414.method6239(true, local13, local19);
										return;
									}
									if (arg0 == 3316) {
										if (Static100.anInt2432 >= 2) {
											anIntArray523[anInt8974++] = Static100.anInt2432;
											return;
										}
										anIntArray523[anInt8974++] = 0;
										return;
									}
									if (arg0 == 3317) {
										anIntArray523[anInt8974++] = Static388.anInt7599;
										return;
									}
									if (arg0 == 3318) {
										anIntArray523[anInt8974++] = Static326.aClass271_2.anInt7991;
										return;
									}
									if (arg0 == 3321) {
										anIntArray523[anInt8974++] = Static272.anInt10565;
										return;
									}
									if (arg0 == 3322) {
										anIntArray523[anInt8974++] = Static160.anInt3346;
										return;
									}
									if (arg0 == 3323) {
										if (Static312.anInt6272 >= 5 && Static312.anInt6272 <= 9) {
											anIntArray523[anInt8974++] = 1;
											return;
										}
										anIntArray523[anInt8974++] = 0;
										return;
									}
									if (arg0 == 3324) {
										if (Static312.anInt6272 >= 5 && Static312.anInt6272 <= 9) {
											anIntArray523[anInt8974++] = Static312.anInt6272;
											return;
										}
										anIntArray523[anInt8974++] = 0;
										return;
									}
									if (arg0 == 3325) {
										anIntArray523[anInt8974++] = Static56.aBoolean120 ? 1 : 0;
										return;
									}
									if (arg0 == 3326) {
										anIntArray523[anInt8974++] = Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2.anInt4287;
										return;
									}
									if (arg0 == 3327) {
										anIntArray523[anInt8974++] = Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2.aClass206_1.aBoolean430 ? 1 : 0;
										return;
									}
									if (arg0 == 3329) {
										anIntArray523[anInt8974++] = Static16.aBoolean432 ? 1 : 0;
										return;
									}
									if (arg0 == 3330) {
										local13 = anIntArray523[--anInt8974];
										anIntArray523[anInt8974++] = Static140.method2497(local13);
										return;
									}
									if (arg0 == 3331) {
										anInt8974 -= 2;
										local13 = anIntArray523[anInt8974];
										local19 = anIntArray523[anInt8974 + 1];
										anIntArray523[anInt8974++] = Static584.method8164(local13, local19, false);
										return;
									}
									if (arg0 == 3332) {
										anInt8974 -= 2;
										local13 = anIntArray523[anInt8974];
										local19 = anIntArray523[anInt8974 + 1];
										anIntArray523[anInt8974++] = Static584.method8164(local13, local19, true);
										return;
									}
									if (arg0 == 3333) {
										anIntArray523[anInt8974++] = Static313.anInt6277;
										return;
									}
									if (arg0 == 3335) {
										anIntArray523[anInt8974++] = Static142.anInt3088;
										return;
									}
									if (arg0 == 3336) {
										anInt8974 -= 4;
										local13 = anIntArray523[anInt8974];
										local19 = anIntArray523[anInt8974 + 1];
										local25 = anIntArray523[anInt8974 + 2];
										local353 = anIntArray523[anInt8974 + 3];
										local13 += local19 << 14;
										local13 += local25 << 28;
										local13 += local353;
										anIntArray523[anInt8974++] = local13;
										return;
									}
									if (arg0 == 3337) {
										anIntArray523[anInt8974++] = Static446.anInt8497;
										return;
									}
									if (arg0 == 3338) {
										anIntArray523[anInt8974++] = Static500.method7214();
										return;
									}
									if (arg0 == 3339) {
										anIntArray523[anInt8974++] = Static510.aBoolean488 ? 1 : 0;
										return;
									}
									if (arg0 == 3340) {
										anIntArray523[anInt8974++] = Static164.aBoolean245 ? 1 : 0;
										return;
									}
									if (arg0 == 3341) {
										anIntArray523[anInt8974++] = Static121.aBoolean211 ? 1 : 0;
										return;
									}
									if (arg0 == 3342) {
										anIntArray523[anInt8974++] = Static294.aClass83_1.method6895();
										return;
									}
									if (arg0 == 3343) {
										anIntArray523[anInt8974++] = Static294.aClass83_1.method6896();
										return;
									}
									if (arg0 == 3344) {
										aStringArray35[anInt8965++] = Static204.method6778();
										return;
									}
									if (arg0 == 3345) {
										aStringArray35[anInt8965++] = Static330.method5069();
										return;
									}
									if (arg0 == 3346) {
										anIntArray523[anInt8974++] = Static323.method5015();
										return;
									}
									if (arg0 == 3347) {
										anIntArray523[anInt8974++] = Static362.anInt7000;
										return;
									}
								} else if (arg0 < 3500) {
									@Pc(5631) Class168 local5631;
									if (arg0 == 3400) {
										anInt8974 -= 2;
										local13 = anIntArray523[anInt8974];
										local19 = anIntArray523[anInt8974 + 1];
										local5631 = Static167.aClass291_2.method6677(local13);
										aStringArray35[anInt8965++] = local5631.method3983(local19);
										return;
									}
									if (arg0 == 3408) {
										anInt8974 -= 4;
										local13 = anIntArray523[anInt8974];
										local19 = anIntArray523[anInt8974 + 1];
										local25 = anIntArray523[anInt8974 + 2];
										local353 = anIntArray523[anInt8974 + 3];
										@Pc(5677) Class168 local5677 = Static167.aClass291_2.method6677(local25);
										if (local5677.aChar3 == local13 && local5677.aChar2 == local19) {
											if (local19 == 115) {
												aStringArray35[anInt8965++] = local5677.method3983(local353);
												return;
											}
											anIntArray523[anInt8974++] = local5677.method3980(local353);
											return;
										}
										throw new RuntimeException("C3408-1");
									}
									if (arg0 == 3409) {
										anInt8974 -= 3;
										local13 = anIntArray523[anInt8974];
										local19 = anIntArray523[anInt8974 + 1];
										local25 = anIntArray523[anInt8974 + 2];
										if (local19 == -1) {
											throw new RuntimeException("C3409-2");
										}
										@Pc(5753) Class168 local5753 = Static167.aClass291_2.method6677(local19);
										if (local5753.aChar2 != local13) {
											throw new RuntimeException("C3409-1");
										}
										anIntArray523[anInt8974++] = local5753.method3986(local25) ? 1 : 0;
										return;
									}
									if (arg0 == 3410) {
										local13 = anIntArray523[--anInt8974];
										local1145 = aStringArray35[--anInt8965];
										if (local13 == -1) {
											throw new RuntimeException("C3410-2");
										}
										local5631 = Static167.aClass291_2.method6677(local13);
										if (local5631.aChar2 != 's') {
											throw new RuntimeException("C3410-1");
										}
										anIntArray523[anInt8974++] = local5631.method3982(local1145) ? 1 : 0;
										return;
									}
									if (arg0 == 3411) {
										local13 = anIntArray523[--anInt8974];
										@Pc(5851) Class168 local5851 = Static167.aClass291_2.method6677(local13);
										anIntArray523[anInt8974++] = local5851.aClass221_14.method5070();
										return;
									}
								} else if (arg0 < 3700) {
									if (arg0 == 3600) {
										if (Static66.anInt1737 == 0) {
											anIntArray523[anInt8974++] = -2;
											return;
										}
										if (Static66.anInt1737 == 1) {
											anIntArray523[anInt8974++] = -1;
											return;
										}
										anIntArray523[anInt8974++] = Static270.anInt5671;
										return;
									}
									if (arg0 == 3601) {
										local13 = anIntArray523[--anInt8974];
										if (Static66.anInt1737 == 2 && local13 < Static270.anInt5671) {
											aStringArray35[anInt8965++] = Static94.aStringArray7[local13];
											if (Static348.aStringArray25[local13] != null) {
												aStringArray35[anInt8965++] = Static348.aStringArray25[local13];
												return;
											}
											aStringArray35[anInt8965++] = "";
											return;
										}
										aStringArray35[anInt8965++] = "";
										aStringArray35[anInt8965++] = "";
										return;
									}
									if (arg0 == 3602) {
										local13 = anIntArray523[--anInt8974];
										if (Static66.anInt1737 == 2 && local13 < Static270.anInt5671) {
											anIntArray523[anInt8974++] = Static184.anIntArray182[local13];
											return;
										}
										anIntArray523[anInt8974++] = 0;
										return;
									}
									if (arg0 == 3603) {
										local13 = anIntArray523[--anInt8974];
										if (Static66.anInt1737 == 2 && local13 < Static270.anInt5671) {
											anIntArray523[anInt8974++] = Static219.anIntArray225[local13];
											return;
										}
										anIntArray523[anInt8974++] = 0;
										return;
									}
									if (arg0 == 3604) {
										local3978 = aStringArray35[--anInt8965];
										local19 = anIntArray523[--anInt8974];
										Static59.method1359(local19, local3978);
										return;
									}
									if (arg0 == 3605) {
										local3978 = aStringArray35[--anInt8965];
										Static32.method1001(local3978);
										return;
									}
									if (arg0 == 3606) {
										local3978 = aStringArray35[--anInt8965];
										Static585.method8186(local3978);
										return;
									}
									if (arg0 == 3607) {
										local3978 = aStringArray35[--anInt8965];
										Static58.method1348(false, local3978);
										return;
									}
									if (arg0 == 3608) {
										local3978 = aStringArray35[--anInt8965];
										Static162.method2677(local3978);
										return;
									}
									if (arg0 == 3609) {
										local3978 = aStringArray35[--anInt8965];
										if (local3978.startsWith("<img=0>") || local3978.startsWith("<img=1>")) {
											local3978 = local3978.substring(7);
										}
										anIntArray523[anInt8974++] = Static313.method4938(local3978) ? 1 : 0;
										return;
									}
									if (arg0 == 3610) {
										local13 = anIntArray523[--anInt8974];
										if (Static66.anInt1737 == 2 && local13 < Static270.anInt5671) {
											aStringArray35[anInt8965++] = Static84.aStringArray5[local13];
											return;
										}
										aStringArray35[anInt8965++] = "";
										return;
									}
									if (arg0 == 3611) {
										if (Static377.aString148 != null) {
											aStringArray35[anInt8965++] = Static195.method6874(Static377.aString148);
											return;
										}
										aStringArray35[anInt8965++] = "";
										return;
									}
									if (arg0 == 3612) {
										if (Static377.aString148 != null) {
											anIntArray523[anInt8974++] = Static341.anInt6580;
											return;
										}
										anIntArray523[anInt8974++] = 0;
										return;
									}
									if (arg0 == 3613) {
										local13 = anIntArray523[--anInt8974];
										if (Static377.aString148 != null && local13 < Static341.anInt6580) {
											aStringArray35[anInt8965++] = Static523.aClass210Array1[local13].aString128;
											return;
										}
										aStringArray35[anInt8965++] = "";
										return;
									}
									if (arg0 == 3614) {
										local13 = anIntArray523[--anInt8974];
										if (Static377.aString148 != null && local13 < Static341.anInt6580) {
											anIntArray523[anInt8974++] = Static523.aClass210Array1[local13].anInt6309;
											return;
										}
										anIntArray523[anInt8974++] = 0;
										return;
									}
									if (arg0 == 3615) {
										local13 = anIntArray523[--anInt8974];
										if (Static377.aString148 != null && local13 < Static341.anInt6580) {
											anIntArray523[anInt8974++] = Static523.aClass210Array1[local13].aByte98;
											return;
										}
										anIntArray523[anInt8974++] = 0;
										return;
									}
									if (arg0 == 3616) {
										anIntArray523[anInt8974++] = Static198.aByte58;
										return;
									}
									if (arg0 == 3617) {
										local3978 = aStringArray35[--anInt8965];
										Static359.method5411(local3978);
										return;
									}
									if (arg0 == 3618) {
										anIntArray523[anInt8974++] = Static46.aByte13;
										return;
									}
									if (arg0 == 3619) {
										local3978 = aStringArray35[--anInt8965];
										Static562.method7946(local3978);
										return;
									}
									if (arg0 == 3620) {
										Static591.method8250();
										return;
									}
									if (arg0 == 3621) {
										if (Static66.anInt1737 == 0) {
											anIntArray523[anInt8974++] = -1;
											return;
										}
										anIntArray523[anInt8974++] = Static577.anInt10405;
										return;
									}
									if (arg0 == 3622) {
										local13 = anIntArray523[--anInt8974];
										if (Static66.anInt1737 != 0 && local13 < Static577.anInt10405) {
											aStringArray35[anInt8965++] = Static154.aStringArray13[local13];
											if (Static320.aStringArray23[local13] != null) {
												aStringArray35[anInt8965++] = Static320.aStringArray23[local13];
												return;
											}
											aStringArray35[anInt8965++] = "";
											return;
										}
										aStringArray35[anInt8965++] = "";
										aStringArray35[anInt8965++] = "";
										return;
									}
									if (arg0 == 3623) {
										local3978 = aStringArray35[--anInt8965];
										if (local3978.startsWith("<img=0>") || local3978.startsWith("<img=1>")) {
											local3978 = local3978.substring(7);
										}
										anIntArray523[anInt8974++] = Static21.method830(local3978) ? 1 : 0;
										return;
									}
									if (arg0 == 3624) {
										local13 = anIntArray523[--anInt8974];
										if (Static523.aClass210Array1 != null && local13 < Static341.anInt6580 && Static523.aClass210Array1[local13].aString127.equalsIgnoreCase(Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2.aString87)) {
											anIntArray523[anInt8974++] = 1;
											return;
										}
										anIntArray523[anInt8974++] = 0;
										return;
									}
									if (arg0 == 3625) {
										if (Static507.aString204 != null) {
											aStringArray35[anInt8965++] = Static507.aString204;
											return;
										}
										aStringArray35[anInt8965++] = "";
										return;
									}
									if (arg0 == 3626) {
										local13 = anIntArray523[--anInt8974];
										if (Static377.aString148 != null && local13 < Static341.anInt6580) {
											aStringArray35[anInt8965++] = Static523.aClass210Array1[local13].aString129;
											return;
										}
										aStringArray35[anInt8965++] = "";
										return;
									}
									if (arg0 == 3627) {
										local13 = anIntArray523[--anInt8974];
										if (Static66.anInt1737 == 2 && local13 >= 0 && local13 < Static270.anInt5671) {
											anIntArray523[anInt8974++] = Static12.aBooleanArray1[local13] ? 1 : 0;
											return;
										}
										anIntArray523[anInt8974++] = 0;
										return;
									}
									if (arg0 == 3628) {
										local3978 = aStringArray35[--anInt8965];
										if (local3978.startsWith("<img=0>") || local3978.startsWith("<img=1>")) {
											local3978 = local3978.substring(7);
										}
										anIntArray523[anInt8974++] = Static437.method6479(local3978);
										return;
									}
									if (arg0 == 3629) {
										anIntArray523[anInt8974++] = Static480.anInt10340;
										return;
									}
									if (arg0 == 3630) {
										local3978 = aStringArray35[--anInt8965];
										Static58.method1348(true, local3978);
										return;
									}
									if (arg0 == 3631) {
										local13 = anIntArray523[--anInt8974];
										anIntArray523[anInt8974++] = Static483.aBooleanArray23[local13] ? 1 : 0;
										return;
									}
									if (arg0 == 3632) {
										local13 = anIntArray523[--anInt8974];
										if (Static377.aString148 != null && local13 < Static341.anInt6580) {
											aStringArray35[anInt8965++] = Static523.aClass210Array1[local13].aString127;
											return;
										}
										aStringArray35[anInt8965++] = "";
										return;
									}
									if (arg0 == 3633) {
										local13 = anIntArray523[--anInt8974];
										if (Static66.anInt1737 != 0 && local13 < Static577.anInt10405) {
											aStringArray35[anInt8965++] = Static377.aStringArray29[local13];
											return;
										}
										aStringArray35[anInt8965++] = "";
										return;
									}
								} else if (arg0 < 4000) {
									if (arg0 == 3903) {
										local13 = anIntArray523[--anInt8974];
										anIntArray523[anInt8974++] = Static299.aClass27Array1[local13].method916();
										return;
									}
									if (arg0 == 3904) {
										local13 = anIntArray523[--anInt8974];
										anIntArray523[anInt8974++] = Static299.aClass27Array1[local13].anInt1044;
										return;
									}
									if (arg0 == 3905) {
										local13 = anIntArray523[--anInt8974];
										anIntArray523[anInt8974++] = Static299.aClass27Array1[local13].anInt1043;
										return;
									}
									if (arg0 == 3906) {
										local13 = anIntArray523[--anInt8974];
										anIntArray523[anInt8974++] = Static299.aClass27Array1[local13].anInt1051;
										return;
									}
									if (arg0 == 3907) {
										local13 = anIntArray523[--anInt8974];
										anIntArray523[anInt8974++] = Static299.aClass27Array1[local13].anInt1042;
										return;
									}
									if (arg0 == 3908) {
										local13 = anIntArray523[--anInt8974];
										anIntArray523[anInt8974++] = Static299.aClass27Array1[local13].anInt1050;
										return;
									}
									if (arg0 == 3910) {
										local13 = anIntArray523[--anInt8974];
										local19 = Static299.aClass27Array1[local13].method912();
										anIntArray523[anInt8974++] = local19 == 0 ? 1 : 0;
										return;
									}
									if (arg0 == 3911) {
										local13 = anIntArray523[--anInt8974];
										local19 = Static299.aClass27Array1[local13].method912();
										anIntArray523[anInt8974++] = local19 == 2 ? 1 : 0;
										return;
									}
									if (arg0 == 3912) {
										local13 = anIntArray523[--anInt8974];
										local19 = Static299.aClass27Array1[local13].method912();
										anIntArray523[anInt8974++] = local19 == 5 ? 1 : 0;
										return;
									}
									if (arg0 == 3913) {
										local13 = anIntArray523[--anInt8974];
										local19 = Static299.aClass27Array1[local13].method912();
										anIntArray523[anInt8974++] = local19 == 1 ? 1 : 0;
										return;
									}
								} else if (arg0 < 4100) {
									if (arg0 == 4000) {
										anInt8974 -= 2;
										local13 = anIntArray523[anInt8974];
										local19 = anIntArray523[anInt8974 + 1];
										anIntArray523[anInt8974++] = local13 + local19;
										return;
									}
									if (arg0 == 4001) {
										anInt8974 -= 2;
										local13 = anIntArray523[anInt8974];
										local19 = anIntArray523[anInt8974 + 1];
										anIntArray523[anInt8974++] = local13 - local19;
										return;
									}
									if (arg0 == 4002) {
										anInt8974 -= 2;
										local13 = anIntArray523[anInt8974];
										local19 = anIntArray523[anInt8974 + 1];
										anIntArray523[anInt8974++] = local13 * local19;
										return;
									}
									if (arg0 == 4003) {
										anInt8974 -= 2;
										local13 = anIntArray523[anInt8974];
										local19 = anIntArray523[anInt8974 + 1];
										anIntArray523[anInt8974++] = local13 / local19;
										return;
									}
									if (arg0 == 4004) {
										local13 = anIntArray523[--anInt8974];
										anIntArray523[anInt8974++] = (int) (Math.random() * (double) local13);
										return;
									}
									if (arg0 == 4005) {
										local13 = anIntArray523[--anInt8974];
										anIntArray523[anInt8974++] = (int) (Math.random() * (double) (local13 + 1));
										return;
									}
									if (arg0 == 4006) {
										anInt8974 -= 5;
										local13 = anIntArray523[anInt8974];
										local19 = anIntArray523[anInt8974 + 1];
										local25 = anIntArray523[anInt8974 + 2];
										local353 = anIntArray523[anInt8974 + 3];
										local2309 = anIntArray523[anInt8974 + 4];
										anIntArray523[anInt8974++] = local13 + (local19 - local13) * (local2309 - local25) / (local353 - local25);
										return;
									}
									@Pc(7361) long local7361;
									@Pc(7354) long local7354;
									if (arg0 == 4007) {
										anInt8974 -= 2;
										local7354 = anIntArray523[anInt8974];
										local7361 = anIntArray523[anInt8974 + 1];
										anIntArray523[anInt8974++] = (int) (local7354 + local7354 * local7361 / 100L);
										return;
									}
									if (arg0 == 4008) {
										anInt8974 -= 2;
										local13 = anIntArray523[anInt8974];
										local19 = anIntArray523[anInt8974 + 1];
										anIntArray523[anInt8974++] = local13 | 0x1 << local19;
										return;
									}
									if (arg0 == 4009) {
										anInt8974 -= 2;
										local13 = anIntArray523[anInt8974];
										local19 = anIntArray523[anInt8974 + 1];
										anIntArray523[anInt8974++] = local13 & -(0x1 << local19) - 1;
										return;
									}
									if (arg0 == 4010) {
										anInt8974 -= 2;
										local13 = anIntArray523[anInt8974];
										local19 = anIntArray523[anInt8974 + 1];
										anIntArray523[anInt8974++] = (local13 & 0x1 << local19) == 0 ? 0 : 1;
										return;
									}
									if (arg0 == 4011) {
										anInt8974 -= 2;
										local13 = anIntArray523[anInt8974];
										local19 = anIntArray523[anInt8974 + 1];
										anIntArray523[anInt8974++] = local13 % local19;
										return;
									}
									if (arg0 == 4012) {
										anInt8974 -= 2;
										local13 = anIntArray523[anInt8974];
										local19 = anIntArray523[anInt8974 + 1];
										if (local13 == 0) {
											anIntArray523[anInt8974++] = 0;
											return;
										}
										anIntArray523[anInt8974++] = (int) Math.pow((double) local13, (double) local19);
										return;
									}
									if (arg0 == 4013) {
										anInt8974 -= 2;
										local13 = anIntArray523[anInt8974];
										local19 = anIntArray523[anInt8974 + 1];
										if (local13 == 0) {
											anIntArray523[anInt8974++] = 0;
											return;
										}
										if (local19 == 0) {
											anIntArray523[anInt8974++] = Integer.MAX_VALUE;
											return;
										}
										anIntArray523[anInt8974++] = (int) Math.pow((double) local13, 1.0D / (double) local19);
										return;
									}
									if (arg0 == 4014) {
										anInt8974 -= 2;
										local13 = anIntArray523[anInt8974];
										local19 = anIntArray523[anInt8974 + 1];
										anIntArray523[anInt8974++] = local13 & local19;
										return;
									}
									if (arg0 == 4015) {
										anInt8974 -= 2;
										local13 = anIntArray523[anInt8974];
										local19 = anIntArray523[anInt8974 + 1];
										anIntArray523[anInt8974++] = local13 | local19;
										return;
									}
									if (arg0 == 4016) {
										anInt8974 -= 2;
										local13 = anIntArray523[anInt8974];
										local19 = anIntArray523[anInt8974 + 1];
										anIntArray523[anInt8974++] = local13 < local19 ? local13 : local19;
										return;
									}
									if (arg0 == 4017) {
										anInt8974 -= 2;
										local13 = anIntArray523[anInt8974];
										local19 = anIntArray523[anInt8974 + 1];
										anIntArray523[anInt8974++] = local13 > local19 ? local13 : local19;
										return;
									}
									if (arg0 == 4018) {
										anInt8974 -= 3;
										local7354 = anIntArray523[anInt8974];
										local7361 = anIntArray523[anInt8974 + 1];
										@Pc(7742) long local7742 = (long) anIntArray523[anInt8974 + 2];
										anIntArray523[anInt8974++] = (int) (local7354 * local7742 / local7361);
										return;
									}
									if (arg0 == 4019) {
										anInt8974 -= 2;
										local13 = anIntArray523[anInt8974];
										local19 = anIntArray523[anInt8974 + 1];
										if (local13 > 700 || local19 > 700) {
											anIntArray523[anInt8974++] = 256;
										}
										@Pc(7801) double local7801 = (Math.random() * (double) (local19 + local13) + 800.0D - (double) local13) / 100.0D;
										anIntArray523[anInt8974++] = (int) (Math.pow(2.0D, local7801) + 0.5D);
										return;
									}
								} else if (arg0 < 4200) {
									if (arg0 == 4100) {
										local3978 = aStringArray35[--anInt8965];
										local19 = anIntArray523[--anInt8974];
										aStringArray35[anInt8965++] = local3978 + local19;
										return;
									}
									if (arg0 == 4101) {
										anInt8965 -= 2;
										local3978 = aStringArray35[anInt8965];
										local1145 = aStringArray35[anInt8965 + 1];
										aStringArray35[anInt8965++] = local3978 + local1145;
										return;
									}
									if (arg0 == 4102) {
										local3978 = aStringArray35[--anInt8965];
										local19 = anIntArray523[--anInt8974];
										aStringArray35[anInt8965++] = local3978 + Static449.method6615(local19);
										return;
									}
									if (arg0 == 4103) {
										local3978 = aStringArray35[--anInt8965];
										aStringArray35[anInt8965++] = local3978.toLowerCase();
										return;
									}
									if (arg0 == 4104) {
										aStringArray35[anInt8965++] = method6885(anIntArray523[--anInt8974]);
										return;
									}
									if (arg0 == 4105) {
										anInt8965 -= 2;
										local3978 = aStringArray35[anInt8965];
										local1145 = aStringArray35[anInt8965 + 1];
										if (Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2.aClass206_1 != null && Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2.aClass206_1.aBoolean430) {
											aStringArray35[anInt8965++] = local1145;
											return;
										}
										aStringArray35[anInt8965++] = local3978;
										return;
									}
									if (arg0 == 4106) {
										local13 = anIntArray523[--anInt8974];
										aStringArray35[anInt8965++] = Integer.toString(local13);
										return;
									}
									if (arg0 == 4107) {
										anInt8965 -= 2;
										anIntArray523[anInt8974++] = Static73.method1573(aStringArray35[anInt8965], aStringArray35[anInt8965 + 1], Static142.anInt3088);
										return;
									}
									@Pc(8084) Class198 local8084;
									if (arg0 == 4108) {
										local3978 = aStringArray35[--anInt8965];
										anInt8974 -= 2;
										local19 = anIntArray523[anInt8974];
										local25 = anIntArray523[anInt8974 + 1];
										local8084 = Static375.method5821(Static478.aClass348_114, local25);
										anIntArray523[anInt8974++] = local8084.method4766(local3978, local19, Static571.aClass88Array15);
										return;
									}
									if (arg0 == 4109) {
										local3978 = aStringArray35[--anInt8965];
										anInt8974 -= 2;
										local19 = anIntArray523[anInt8974];
										local25 = anIntArray523[anInt8974 + 1];
										local8084 = Static375.method5821(Static478.aClass348_114, local25);
										anIntArray523[anInt8974++] = local8084.method4761(local19, Static571.aClass88Array15, local3978);
										return;
									}
									if (arg0 == 4110) {
										anInt8965 -= 2;
										local3978 = aStringArray35[anInt8965];
										local1145 = aStringArray35[anInt8965 + 1];
										if (anIntArray523[--anInt8974] == 1) {
											aStringArray35[anInt8965++] = local3978;
											return;
										}
										aStringArray35[anInt8965++] = local1145;
										return;
									}
									if (arg0 == 4111) {
										local3978 = aStringArray35[--anInt8965];
										aStringArray35[anInt8965++] = Static75.method1600(local3978);
										return;
									}
									if (arg0 == 4112) {
										local3978 = aStringArray35[--anInt8965];
										local19 = anIntArray523[--anInt8974];
										if (local19 == -1) {
											throw new RuntimeException("null char");
										}
										aStringArray35[anInt8965++] = local3978 + (char) local19;
										return;
									}
									if (arg0 == 4113) {
										local13 = anIntArray523[--anInt8974];
										anIntArray523[anInt8974++] = Static461.method6780((char) local13) ? 1 : 0;
										return;
									}
									if (arg0 == 4114) {
										local13 = anIntArray523[--anInt8974];
										anIntArray523[anInt8974++] = Static73.method1574((char) local13) ? 1 : 0;
										return;
									}
									if (arg0 == 4115) {
										local13 = anIntArray523[--anInt8974];
										anIntArray523[anInt8974++] = Static458.method6741((char) local13) ? 1 : 0;
										return;
									}
									if (arg0 == 4116) {
										local13 = anIntArray523[--anInt8974];
										anIntArray523[anInt8974++] = Static334.method5098((char) local13) ? 1 : 0;
										return;
									}
									if (arg0 == 4117) {
										local3978 = aStringArray35[--anInt8965];
										if (local3978 != null) {
											anIntArray523[anInt8974++] = local3978.length();
											return;
										}
										anIntArray523[anInt8974++] = 0;
										return;
									}
									if (arg0 == 4118) {
										local3978 = aStringArray35[--anInt8965];
										anInt8974 -= 2;
										local19 = anIntArray523[anInt8974];
										local25 = anIntArray523[anInt8974 + 1];
										aStringArray35[anInt8965++] = local3978.substring(local19, local25);
										return;
									}
									if (arg0 == 4119) {
										local3978 = aStringArray35[--anInt8965];
										@Pc(8447) StringBuffer local8447 = new StringBuffer(local3978.length());
										@Pc(8449) boolean local8449 = false;
										for (local353 = 0; local353 < local3978.length(); local353++) {
											@Pc(8456) char local8456 = local3978.charAt(local353);
											if (local8456 == '<') {
												local8449 = true;
											} else if (local8456 == '>') {
												local8449 = false;
											} else if (!local8449) {
												local8447.append(local8456);
											}
										}
										aStringArray35[anInt8965++] = local8447.toString();
										return;
									}
									if (arg0 == 4120) {
										local3978 = aStringArray35[--anInt8965];
										anInt8974 -= 2;
										local19 = anIntArray523[anInt8974];
										local25 = anIntArray523[anInt8974 + 1];
										anIntArray523[anInt8974++] = local3978.indexOf(local19, local25);
										return;
									}
									if (arg0 == 4121) {
										anInt8965 -= 2;
										local3978 = aStringArray35[anInt8965];
										local1145 = aStringArray35[anInt8965 + 1];
										local25 = anIntArray523[--anInt8974];
										anIntArray523[anInt8974++] = local3978.indexOf(local1145, local25);
										return;
									}
									if (arg0 == 4122) {
										local13 = anIntArray523[--anInt8974];
										anIntArray523[anInt8974++] = Character.toLowerCase((char) local13);
										return;
									}
									if (arg0 == 4123) {
										local13 = anIntArray523[--anInt8974];
										anIntArray523[anInt8974++] = Character.toUpperCase((char) local13);
										return;
									}
									if (arg0 == 4124) {
										local412 = anIntArray523[--anInt8974] != 0;
										local19 = anIntArray523[--anInt8974];
										aStringArray35[anInt8965++] = Static271.method4404(0, Static142.anInt3088, local412, (long) local19);
										return;
									}
									if (arg0 == 4125) {
										local3978 = aStringArray35[--anInt8965];
										local19 = anIntArray523[--anInt8974];
										@Pc(8670) Class198 local8670 = Static375.method5821(Static478.aClass348_114, local19);
										anIntArray523[anInt8974++] = local8670.method4772(local3978, Static571.aClass88Array15);
										return;
									}
								} else if (arg0 < 4300) {
									if (arg0 == 4200) {
										local13 = anIntArray523[--anInt8974];
										aStringArray35[anInt8965++] = Static338.aClass29_1.method977(local13).aString139;
										return;
									}
									@Pc(8732) Class236 local8732;
									if (arg0 == 4201) {
										anInt8974 -= 2;
										local13 = anIntArray523[anInt8974];
										local19 = anIntArray523[anInt8974 + 1];
										local8732 = Static338.aClass29_1.method977(local13);
										if (local19 >= 1 && local19 <= 5 && local8732.aStringArray26[local19 - 1] != null) {
											aStringArray35[anInt8965++] = local8732.aStringArray26[local19 - 1];
											return;
										}
										aStringArray35[anInt8965++] = "";
										return;
									}
									if (arg0 == 4202) {
										anInt8974 -= 2;
										local13 = anIntArray523[anInt8974];
										local19 = anIntArray523[anInt8974 + 1];
										local8732 = Static338.aClass29_1.method977(local13);
										if (local19 >= 1 && local19 <= 5 && local8732.aStringArray27[local19 - 1] != null) {
											aStringArray35[anInt8965++] = local8732.aStringArray27[local19 - 1];
											return;
										}
										aStringArray35[anInt8965++] = "";
										return;
									}
									if (arg0 == 4203) {
										local13 = anIntArray523[--anInt8974];
										anIntArray523[anInt8974++] = Static338.aClass29_1.method977(local13).anInt6814;
										return;
									}
									if (arg0 == 4204) {
										local13 = anIntArray523[--anInt8974];
										anIntArray523[anInt8974++] = Static338.aClass29_1.method977(local13).anInt6824 == 1 ? 1 : 0;
										return;
									}
									@Pc(8895) Class236 local8895;
									if (arg0 == 4205) {
										local13 = anIntArray523[--anInt8974];
										local8895 = Static338.aClass29_1.method977(local13);
										if (local8895.anInt6776 == -1 && local8895.lb >= 0) {
											anIntArray523[anInt8974++] = local8895.lb;
											return;
										}
										anIntArray523[anInt8974++] = local13;
										return;
									}
									if (arg0 == 4206) {
										local13 = anIntArray523[--anInt8974];
										local8895 = Static338.aClass29_1.method977(local13);
										if (local8895.anInt6776 >= 0 && local8895.lb >= 0) {
											anIntArray523[anInt8974++] = local8895.lb;
											return;
										}
										anIntArray523[anInt8974++] = local13;
										return;
									}
									if (arg0 == 4207) {
										local13 = anIntArray523[--anInt8974];
										anIntArray523[anInt8974++] = Static338.aClass29_1.method977(local13).aBoolean471 ? 1 : 0;
										return;
									}
									if (arg0 == 4208) {
										anInt8974 -= 2;
										local13 = anIntArray523[anInt8974];
										local19 = anIntArray523[anInt8974 + 1];
										local3043 = Static245.aClass107_2.method2503(local19);
										if (local3043.method6374()) {
											aStringArray35[anInt8965++] = Static338.aClass29_1.method977(local13).method5337(local3043.aString170, local19);
											return;
										}
										anIntArray523[anInt8974++] = Static338.aClass29_1.method977(local13).method5330(local19, local3043.anInt8186);
										return;
									}
									if (arg0 == 4209) {
										anInt8974 -= 2;
										local13 = anIntArray523[anInt8974];
										local19 = anIntArray523[anInt8974 + 1] - 1;
										local8732 = Static338.aClass29_1.method977(local13);
										if (local8732.anInt6829 == local19) {
											anIntArray523[anInt8974++] = local8732.anInt6785;
											return;
										}
										if (local8732.anInt6798 == local19) {
											anIntArray523[anInt8974++] = local8732.anInt6779;
											return;
										}
										anIntArray523[anInt8974++] = -1;
										return;
									}
									if (arg0 == 4210) {
										local3978 = aStringArray35[--anInt8965];
										local19 = anIntArray523[--anInt8974];
										Static426.method6358(local19 == 1, local3978);
										anIntArray523[anInt8974++] = Static393.anInt7666;
										return;
									}
									if (arg0 == 4211) {
										if (Static519.aShortArray130 != null && Static191.anInt3979 < Static393.anInt7666) {
											anIntArray523[anInt8974++] = Static519.aShortArray130[Static191.anInt3979++] & 0xFFFF;
											return;
										}
										anIntArray523[anInt8974++] = -1;
										return;
									}
									if (arg0 == 4212) {
										Static191.anInt3979 = 0;
										return;
									}
									if (arg0 == 4213) {
										local13 = anIntArray523[--anInt8974];
										anIntArray523[anInt8974++] = Static338.aClass29_1.method977(local13).anInt6827;
										return;
									}
									if (arg0 == 4214) {
										local3978 = aStringArray35[--anInt8965];
										anInt8974 -= 3;
										local19 = anIntArray523[anInt8974];
										local25 = anIntArray523[anInt8974 + 1];
										local353 = anIntArray523[anInt8974 + 2];
										Static221.method957(local353, local25, local19 == 1, local3978);
										anIntArray523[anInt8974++] = Static393.anInt7666;
										return;
									}
									if (arg0 == 4215) {
										anInt8965 -= 2;
										anInt8974 -= 2;
										local3978 = aStringArray35[anInt8965];
										local19 = anIntArray523[anInt8974];
										local25 = anIntArray523[anInt8974 + 1];
										@Pc(9294) String local9294 = aStringArray35[anInt8965 + 1];
										Static72.method1558(local25, local3978, local19 == 1, local9294);
										anIntArray523[anInt8974++] = Static393.anInt7666;
										return;
									}
								} else if (arg0 < 4400) {
									if (arg0 == 4300) {
										anInt8974 -= 2;
										local13 = anIntArray523[anInt8974];
										local19 = anIntArray523[anInt8974 + 1];
										local3043 = Static245.aClass107_2.method2503(local19);
										if (local3043.method6374()) {
											aStringArray35[anInt8965++] = Class21_Sub1_Sub2_Sub1.lb.method4992(local13).method1369(local19, local3043.aString170);
											return;
										}
										anIntArray523[anInt8974++] = Class21_Sub1_Sub2_Sub1.lb.method4992(local13).method1363(local19, local3043.anInt8186);
										return;
									}
								} else if (arg0 < 4500) {
									if (arg0 == 4400) {
										anInt8974 -= 2;
										local13 = anIntArray523[anInt8974];
										local19 = anIntArray523[anInt8974 + 1];
										local3043 = Static245.aClass107_2.method2503(local19);
										if (local3043.method6374()) {
											aStringArray35[anInt8965++] = Static103.aClass298_1.method6822(local13).method5288(local3043.aString170, local19);
											return;
										}
										anIntArray523[anInt8974++] = Static103.aClass298_1.method6822(local13).method5284(local19, local3043.anInt8186);
										return;
									}
								} else if (arg0 < 4600) {
									if (arg0 == 4500) {
										anInt8974 -= 2;
										local13 = anIntArray523[anInt8974];
										local19 = anIntArray523[anInt8974 + 1];
										local3043 = Static245.aClass107_2.method2503(local19);
										if (local3043.method6374()) {
											aStringArray35[anInt8965++] = Static288.aClass47_1.method1276(local13).method5530(local3043.aString170, local19);
											return;
										}
										anIntArray523[anInt8974++] = Static288.aClass47_1.method1276(local13).method5526(local3043.anInt8186, local19);
										return;
									}
								} else if (arg0 < 4700 && arg0 == 4600) {
									local13 = anIntArray523[--anInt8974];
									@Pc(9522) Class252 local9522 = Static203.aClass230_1.method5247(local13);
									if (local9522.anIntArray407 != null && local9522.anIntArray407.length > 0) {
										local25 = 0;
										local353 = local9522.anIntArray410[0];
										for (local2309 = 1; local2309 < local9522.anIntArray407.length; local2309++) {
											if (local9522.anIntArray410[local2309] > local353) {
												local25 = local2309;
												local353 = local9522.anIntArray410[local2309];
											}
										}
										anIntArray523[anInt8974++] = local9522.anIntArray407[local25];
										return;
									}
									anIntArray523[anInt8974++] = local9522.anInt7499;
									return;
								}
							}
						}
					}
				} else {
					if (arg0 >= 2000) {
						arg0 -= 1000;
						local137 = Static558.method7916(anIntArray523[--anInt8974]);
					} else {
						local137 = arg1 ? aClass155_14 : aClass155_15;
					}
					Static368.method5060(local137);
					if (arg0 == 1200 || arg0 == 1205 || arg0 == 1208 || arg0 == 1209 || arg0 == 1212 || arg0 == 1213) {
						anInt8974 -= 2;
						local19 = anIntArray523[anInt8974];
						local25 = anIntArray523[anInt8974 + 1];
						if (local137.anInt4765 == -1) {
							Static323.method5014(local137.anInt4793);
							Static266.method4176(local137.anInt4793);
							Static61.method1378(local137.anInt4793);
						}
						if (local19 == -1) {
							local137.anInt4764 = 1;
							local137.anInt4802 = -1;
							local137.anInt4785 = -1;
							return;
						}
						local137.anInt4785 = local19;
						local137.anInt4742 = local25;
						if (arg0 == 1208 || arg0 == 1209) {
							local137.aBoolean335 = true;
						} else {
							local137.aBoolean335 = false;
						}
						@Pc(1649) Class236 local1649 = Static338.aClass29_1.method977(local19);
						local137.anInt4789 = local1649.anInt6792;
						local137.anInt4809 = local1649.anInt6806;
						local137.anInt4813 = local1649.anInt6771;
						local137.anInt4776 = local1649.anInt6832;
						local137.anInt4810 = local1649.anInt6809;
						local137.anInt4797 = local1649.anInt6815;
						if (arg0 == 1205 || arg0 == 1209) {
							local137.anInt4745 = 0;
						} else if (arg0 == 1212 || arg0 == 1213) {
							local137.anInt4745 = 1;
						} else {
							local137.anInt4745 = 2;
						}
						if (local137.anInt4827 > 0) {
							local137.anInt4797 = local137.anInt4797 * 32 / local137.anInt4827;
							return;
						}
						if (local137.anInt4780 > 0) {
							local137.anInt4797 = local137.anInt4797 * 32 / local137.anInt4780;
						}
						return;
					}
					if (arg0 == 1201) {
						local137.anInt4764 = 2;
						local137.anInt4802 = anIntArray523[--anInt8974];
						if (local137.anInt4765 == -1) {
							Static58.method1349(local137.anInt4793);
						}
						return;
					}
					if (arg0 == 1202) {
						local137.anInt4764 = 3;
						local137.anInt4802 = -1;
						if (local137.anInt4765 == -1) {
							Static58.method1349(local137.anInt4793);
						}
						return;
					}
					if (arg0 == 1203) {
						local137.anInt4764 = 6;
						local137.anInt4802 = anIntArray523[--anInt8974];
						if (local137.anInt4765 == -1) {
							Static58.method1349(local137.anInt4793);
						}
						return;
					}
					if (arg0 == 1204) {
						local137.anInt4764 = 5;
						local137.anInt4802 = anIntArray523[--anInt8974];
						if (local137.anInt4765 == -1) {
							Static58.method1349(local137.anInt4793);
						}
						return;
					}
					if (arg0 == 1206) {
						anInt8974 -= 4;
						local137.anInt4788 = anIntArray523[anInt8974];
						local137.anInt4821 = anIntArray523[anInt8974 + 1];
						local137.anInt4755 = anIntArray523[anInt8974 + 2];
						local137.anInt4766 = anIntArray523[anInt8974 + 3];
						Static368.method5060(local137);
						return;
					}
					if (arg0 == 1207) {
						anInt8974 -= 2;
						local137.anInt4817 = anIntArray523[anInt8974];
						local137.anInt4830 = anIntArray523[anInt8974 + 1];
						Static368.method5060(local137);
						return;
					}
					if (arg0 == 1210) {
						anInt8974 -= 4;
						local137.anInt4802 = anIntArray523[anInt8974];
						local137.anInt4814 = anIntArray523[anInt8974 + 1];
						if (anIntArray523[anInt8974 + 2] == 1) {
							local137.anInt4764 = 9;
						} else {
							local137.anInt4764 = 8;
						}
						if (anIntArray523[anInt8974 + 3] == 1) {
							local137.aBoolean335 = true;
						} else {
							local137.aBoolean335 = false;
						}
						if (local137.anInt4765 == -1) {
							Static58.method1349(local137.anInt4793);
						}
						return;
					}
					if (arg0 == 1211) {
						local137.anInt4764 = 5;
						local137.anInt4802 = Static1.anInt5011;
						local137.anInt4814 = 0;
						if (local137.anInt4765 == -1) {
							Static58.method1349(local137.anInt4793);
						}
						return;
					}
				}
			} else {
				if (arg0 >= 2000) {
					arg0 -= 1000;
					local137 = Static558.method7916(anIntArray523[--anInt8974]);
				} else {
					local137 = arg1 ? aClass155_14 : aClass155_15;
				}
				if (arg0 == 1000) {
					anInt8974 -= 4;
					local137.anInt4819 = anIntArray523[anInt8974];
					local137.anInt4770 = anIntArray523[anInt8974 + 1];
					local19 = anIntArray523[anInt8974 + 2];
					if (local19 < 0) {
						local19 = 0;
					} else if (local19 > 5) {
						local19 = 5;
					}
					local25 = anIntArray523[anInt8974 + 3];
					if (local25 < 0) {
						local25 = 0;
					} else if (local25 > 5) {
						local25 = 5;
					}
					local137.aByte77 = (byte) local19;
					local137.aByte76 = (byte) local25;
					Static368.method5060(local137);
					Static311.method4929(local137);
					if (local137.anInt4765 == -1) {
						Static93.method1863(local137.anInt4793);
					}
					return;
				}
				if (arg0 == 1001) {
					anInt8974 -= 4;
					local137.anInt4780 = anIntArray523[anInt8974];
					local137.anInt4774 = anIntArray523[anInt8974 + 1];
					local137.anInt4827 = 0;
					local137.anInt4807 = 0;
					local19 = anIntArray523[anInt8974 + 2];
					if (local19 < 0) {
						local19 = 0;
					} else if (local19 > 4) {
						local19 = 4;
					}
					local25 = anIntArray523[anInt8974 + 3];
					if (local25 < 0) {
						local25 = 0;
					} else if (local25 > 4) {
						local25 = 4;
					}
					local137.aByte78 = (byte) local19;
					local137.aByte79 = (byte) local25;
					Static368.method5060(local137);
					Static311.method4929(local137);
					if (local137.anInt4796 == 0) {
						Static162.method2682(false, local137);
					}
					return;
				}
				if (arg0 == 1003) {
					@Pc(645) boolean local645 = anIntArray523[--anInt8974] == 1;
					if (local137.aBoolean329 != local645) {
						local137.aBoolean329 = local645;
						Static368.method5060(local137);
					}
					if (local137.anInt4765 == -1) {
						Static591.method8252(local137.anInt4793);
					}
					return;
				}
				if (arg0 == 1004) {
					anInt8974 -= 2;
					local137.anInt4759 = anIntArray523[anInt8974];
					local137.anInt4768 = anIntArray523[anInt8974 + 1];
					Static368.method5060(local137);
					Static311.method4929(local137);
					if (local137.anInt4796 == 0) {
						Static162.method2682(false, local137);
					}
					return;
				}
				if (arg0 == 1005) {
					local137.aBoolean322 = anIntArray523[--anInt8974] == 1;
					return;
				}
			}
		}
		throw new IllegalStateException(String.valueOf(arg0));
	}
}
