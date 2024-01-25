import jagex3.jagmisc.jagmisc;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static219 {

	@OriginalMember(owner = "client!kp", name = "i", descriptor = "Lclient!ga;")
	private static Class82 aClass82_12;

	@OriginalMember(owner = "client!kp", name = "m", descriptor = "Lclient!mm;")
	private static Class153 aClass153_1;

	@OriginalMember(owner = "client!kp", name = "r", descriptor = "[I")
	private static int[] anIntArray241;

	@OriginalMember(owner = "client!kp", name = "s", descriptor = "[Ljava/lang/String;")
	private static String[] aStringArray21;

	@OriginalMember(owner = "client!kp", name = "w", descriptor = "Lclient!ga;")
	private static Class82 aClass82_13;

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "Ljava/util/Calendar;")
	private static final Calendar aCalendar2 = Calendar.getInstance();

	@OriginalMember(owner = "client!kp", name = "c", descriptor = "[I")
	private static final int[] anIntArray239 = new int[1000];

	@OriginalMember(owner = "client!kp", name = "f", descriptor = "[Lclient!am;")
	private static final Class9[] aClass9Array1 = new Class9[50];

	@OriginalMember(owner = "client!kp", name = "j", descriptor = "I")
	private static int anInt3735 = 0;

	@OriginalMember(owner = "client!kp", name = "k", descriptor = "I")
	private static int anInt3736 = 0;

	@OriginalMember(owner = "client!kp", name = "l", descriptor = "[[I")
	private static final int[][] anIntArrayArray30 = new int[5][5000];

	@OriginalMember(owner = "client!kp", name = "p", descriptor = "[I")
	private static final int[] anIntArray240 = new int[5];

	@OriginalMember(owner = "client!kp", name = "v", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray22 = new String[1000];

	@OriginalMember(owner = "client!kp", name = "x", descriptor = "I")
	private static int anInt3742 = 0;

	@OriginalMember(owner = "client!kp", name = "z", descriptor = "[I")
	private static final int[] anIntArray242 = new int[3];

	@OriginalMember(owner = "client!kp", name = "B", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray23 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@OriginalMember(owner = "client!kp", name = "C", descriptor = "Lclient!wi;")
	public static final Class268 aClass268_31 = new Class268(4);

	@OriginalMember(owner = "client!kp", name = "D", descriptor = "I")
	private static int anInt3744 = 0;

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(I)V")
	private static void method3204(@OriginalArg(0) int arg0) {
		@Pc(3) Class82 local3 = Static180.method2857(arg0);
		if (local3 == null) {
			return;
		}
		@Pc(9) int local9 = arg0 >>> 16;
		@Pc(13) Class82[] local13 = Static145.aClass82ArrayArray1[local9];
		if (local13 == null) {
			@Pc(19) Class82[] local19 = Static298.aClass82ArrayArray2[local9];
			@Pc(22) int local22 = local19.length;
			local13 = Static145.aClass82ArrayArray1[local9] = new Class82[local22];
			Static466.method203(local19, 0, local13, 0, local19.length);
		}
		@Pc(38) int local38;
		for (local38 = 0; local38 < local13.length && local13[local38] != local3; local38++) {
		}
		if (local38 >= local13.length) {
			return;
		}
		Static466.method203(local13, local38 + 1, local13, local38, local13.length - local38 - 1);
		local13[local13.length - 1] = local3;
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(IZ)V")
	public static void method3205() {
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "()V")
	public static void method3206() {
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(Lclient!ew;I)V")
	private static void method3207(@OriginalArg(0) Class3_Sub3_Sub8 arg0, @OriginalArg(1) int arg1) {
		anInt3735 = 0;
		anInt3736 = 0;
		@Pc(5) int local5 = -1;
		@Pc(8) int[] local8 = arg0.anIntArray91;
		@Pc(11) int[] local11 = arg0.anIntArray90;
		@Pc(13) byte local13 = -1;
		anInt3742 = 0;
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
						method3214(local31, local802);
					} else if (local31 >= 5000 && local31 < 10000) {
						method3216(local31, local802);
					} else {
						throw new IllegalStateException("Command: " + local31);
					}
				} else if (local31 == 0) {
					anIntArray239[anInt3735++] = local11[local5];
				} else {
					@Pc(54) int local54;
					if (local31 == 1) {
						local54 = local11[local5];
						anIntArray239[anInt3735++] = Static119.aClass47_1.anIntArray67[local54];
					} else if (local31 == 2) {
						local54 = local11[local5];
						Static119.aClass47_1.method1271(local54, anIntArray239[--anInt3735]);
					} else if (local31 == 3) {
						aStringArray22[anInt3736++] = arg0.aStringArray12[local5];
					} else if (local31 == 6) {
						local5 += local11[local5];
					} else if (local31 == 7) {
						anInt3735 -= 2;
						if (anIntArray239[anInt3735] != anIntArray239[anInt3735 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 8) {
						anInt3735 -= 2;
						if (anIntArray239[anInt3735] == anIntArray239[anInt3735 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 9) {
						anInt3735 -= 2;
						if (anIntArray239[anInt3735] < anIntArray239[anInt3735 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 10) {
						anInt3735 -= 2;
						if (anIntArray239[anInt3735] > anIntArray239[anInt3735 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 21) {
						if (anInt3742 == 0) {
							return;
						}
						@Pc(216) Class9 local216 = aClass9Array1[--anInt3742];
						arg0 = local216.aClass3_Sub3_Sub8_1;
						local8 = arg0.anIntArray91;
						local11 = arg0.anIntArray90;
						local5 = local216.anInt179;
						anIntArray241 = local216.anIntArray2;
						aStringArray21 = local216.aStringArray2;
					} else if (local31 == 25) {
						local54 = local11[local5];
						anIntArray239[anInt3735++] = Static119.aClass47_1.method1268(local54);
					} else if (local31 == 27) {
						local54 = local11[local5];
						Static119.aClass47_1.method1270(anIntArray239[--anInt3735], local54);
					} else if (local31 == 31) {
						anInt3735 -= 2;
						if (anIntArray239[anInt3735] <= anIntArray239[anInt3735 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 32) {
						anInt3735 -= 2;
						if (anIntArray239[anInt3735] >= anIntArray239[anInt3735 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 33) {
						anIntArray239[anInt3735++] = anIntArray241[local11[local5]];
					} else if (local31 == 34) {
						anIntArray241[local11[local5]] = anIntArray239[--anInt3735];
					} else if (local31 == 35) {
						aStringArray22[anInt3736++] = aStringArray21[local11[local5]];
					} else if (local31 == 36) {
						aStringArray21[local11[local5]] = aStringArray22[--anInt3736];
					} else if (local31 == 37) {
						local54 = local11[local5];
						anInt3736 -= local54;
						@Pc(400) String local400 = Static184.method2901(aStringArray22, anInt3736, local54);
						aStringArray22[anInt3736++] = local400;
					} else if (local31 == 38) {
						anInt3735--;
					} else if (local31 == 39) {
						anInt3736--;
					} else {
						@Pc(452) int local452;
						if (local31 == 40) {
							local54 = local11[local5];
							@Pc(436) Class3_Sub3_Sub8 local436 = Static346.method4833(local54);
							if (local436 == null) {
								throw new RuntimeException();
							}
							@Pc(446) int[] local446 = new int[local436.anInt1858];
							@Pc(450) String[] local450 = new String[local436.anInt1859];
							for (local452 = 0; local452 < local436.anInt1861; local452++) {
								local446[local452] = anIntArray239[anInt3735 + local452 - local436.anInt1861];
							}
							for (@Pc(471) int local471 = 0; local471 < local436.anInt1860; local471++) {
								local450[local471] = aStringArray22[anInt3736 + local471 - local436.anInt1860];
							}
							anInt3735 -= local436.anInt1861;
							anInt3736 -= local436.anInt1860;
							@Pc(502) Class9 local502 = new Class9();
							local502.aClass3_Sub3_Sub8_1 = arg0;
							local502.anInt179 = local5;
							local502.anIntArray2 = anIntArray241;
							local502.aStringArray2 = aStringArray21;
							if (anInt3742 >= aClass9Array1.length) {
								throw new RuntimeException();
							}
							aClass9Array1[anInt3742++] = local502;
							arg0 = local436;
							local8 = local436.anIntArray91;
							local11 = local436.anIntArray90;
							local5 = -1;
							anIntArray241 = local446;
							aStringArray21 = local450;
						} else if (local31 == 42) {
							anIntArray239[anInt3735++] = Static59.anIntArray56[local11[local5]];
						} else if (local31 == 43) {
							local54 = local11[local5];
							Static59.anIntArray56[local54] = anIntArray239[--anInt3735];
							Static256.method3580(local54);
							Static451.aBoolean505 |= Static322.aBooleanArray19[local54];
						} else if (local31 == 44) {
							local54 = local11[local5] >> 16;
							local603 = local11[local5] & 0xFFFF;
							@Pc(611) int local611 = anIntArray239[--anInt3735];
							if (local611 >= 0 && local611 <= 5000) {
								anIntArray240[local54] = local611;
								@Pc(626) byte local626 = -1;
								if (local603 == 105) {
									local626 = 0;
								}
								local452 = 0;
								while (true) {
									if (local452 >= local611) {
										continue label260;
									}
									anIntArrayArray30[local54][local452] = local626;
									local452++;
								}
							}
							throw new RuntimeException();
						} else if (local31 == 45) {
							local54 = local11[local5];
							local603 = anIntArray239[--anInt3735];
							if (local603 < 0 || local603 >= anIntArray240[local54]) {
								throw new RuntimeException();
							}
							anIntArray239[anInt3735++] = anIntArrayArray30[local54][local603];
						} else if (local31 == 46) {
							local54 = local11[local5];
							anInt3735 -= 2;
							local603 = anIntArray239[anInt3735];
							if (local603 < 0 || local603 >= anIntArray240[local54]) {
								throw new RuntimeException();
							}
							anIntArrayArray30[local54][local603] = anIntArray239[anInt3735 + 1];
						} else if (local31 == 47) {
							@Pc(730) String local730 = Static358.aStringArray38[local11[local5]];
							if (local730 == null) {
								local730 = "null";
							}
							aStringArray22[anInt3736++] = local730;
						} else if (local31 == 48) {
							local54 = local11[local5];
							Static358.aStringArray38[local54] = aStringArray22[--anInt3736];
							Static149.method2337(local54);
						} else if (local31 == 51) {
							@Pc(774) Class140 local774 = arg0.aClass140Array1[local11[local5]];
							@Pc(787) Class3_Sub30 local787 = (Class3_Sub30) local774.method3490((long) anIntArray239[--anInt3735]);
							if (local787 != null) {
								local5 += local787.anInt3957;
							}
						}
					}
				}
			}
		} catch (@Pc(837) Exception local837) {
			@Pc(855) StringBuffer local855;
			if (arg0.aString28 == null) {
				local855 = new StringBuffer(30);
				local855.append("CS2: ").append(arg0.aLong248).append(" ");
				for (local603 = anInt3742 - 1; local603 >= 0; local603--) {
					local855.append("v: ").append(aClass9Array1[local603].aClass3_Sub3_Sub8_1.aLong248).append(" ");
				}
				local855.append("op: ").append(local13);
				Static120.method1926(local855.toString(), local837);
			} else {
				Static370.method5160("Clientscript error in: " + arg0.aString28);
				local855 = new StringBuffer(30);
				local855.append("Clientscript error in: ").append(arg0.aString28).append("\n");
				for (local603 = anInt3742 - 1; local603 >= 0; local603--) {
					local855.append("via: ").append(aClass9Array1[local603].aClass3_Sub3_Sub8_1.aString28).append("\n");
				}
				local855.append("Op: ").append(local13).append("\n");
				@Pc(895) String local895 = local837.getMessage();
				if (local895 != null && local895.length() > 0) {
					local855.append("Message: ").append(local895).append("\n");
				}
				Static120.method1926(local855.toString(), local837);
				Static61.method1151(local855.toString());
			}
		}
	}

	@OriginalMember(owner = "client!kp", name = "b", descriptor = "(I)V")
	private static void method3208(@OriginalArg(0) int arg0) {
		@Pc(3) Class82 local3 = Static180.method2857(arg0);
		if (local3 == null) {
			return;
		}
		@Pc(9) int local9 = arg0 >>> 16;
		@Pc(13) Class82[] local13 = Static145.aClass82ArrayArray1[local9];
		if (local13 == null) {
			@Pc(19) Class82[] local19 = Static298.aClass82ArrayArray2[local9];
			@Pc(22) int local22 = local19.length;
			local13 = Static145.aClass82ArrayArray1[local9] = new Class82[local22];
			Static466.method203(local19, 0, local13, 0, local19.length);
		}
		@Pc(38) int local38;
		for (local38 = 0; local38 < local13.length && local13[local38] != local3; local38++) {
		}
		if (local38 >= local13.length) {
			return;
		}
		Static466.method203(local13, 0, local13, 1, local38);
		local13[0] = local3;
	}

	@OriginalMember(owner = "client!kp", name = "c", descriptor = "(I)V")
	public static void method3209(@OriginalArg(0) int arg0) {
		if (arg0 == -1 || !Static163.method5702(arg0)) {
			return;
		}
		@Pc(12) Class82[] local12 = Static298.aClass82ArrayArray2[arg0];
		for (@Pc(14) int local14 = 0; local14 < local12.length; local14++) {
			@Pc(19) Class82 local19 = local12[local14];
			if (local19.anObjectArray8 != null) {
				@Pc(26) Class3_Sub15 local26 = new Class3_Sub15();
				local26.aClass82_1 = local19;
				local26.anObjectArray3 = local19.anObjectArray8;
				method3213(local26, 2000000);
			}
		}
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(Lclient!ip;II)V")
	public static void method3210(@OriginalArg(0) Class111 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Class3_Sub3_Sub8 local5 = Static61.method1155(arg0, arg1, arg2);
		if (local5 == null) {
			return;
		}
		anIntArray241 = new int[local5.anInt1858];
		aStringArray21 = new String[local5.anInt1859];
		if (local5.aClass111_2 == Static27.aClass111_1 || local5.aClass111_2 == Static378.aClass111_10 || local5.aClass111_2 == Static246.aClass111_4) {
			@Pc(30) int local30 = 0;
			@Pc(32) int local32 = 0;
			if (Static381.aClass82_24 != null) {
				local30 = Static381.aClass82_24.anInt2210;
				local32 = Static381.aClass82_24.anInt2199;
			}
			anIntArray241[0] = Static171.aClass50_1.method4993() - local30;
			anIntArray241[1] = Static171.aClass50_1.method4989() - local32;
		}
		method3207(local5, 200000);
	}

	@OriginalMember(owner = "client!kp", name = "d", descriptor = "(I)Ljava/lang/String;")
	private static String method3211(@OriginalArg(0) int arg0) {
		@Pc(6) long local6 = ((long) arg0 + 11745L) * 86400000L;
		aCalendar2.setTime(new Date(local6));
		@Pc(16) int local16 = aCalendar2.get(5);
		@Pc(20) int local20 = aCalendar2.get(2);
		@Pc(24) int local24 = aCalendar2.get(1);
		return local16 + "-" + aStringArray23[local20] + "-" + local24;
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private static void method3212(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (Static300.anInt5196 == 0 && (Static61.aBoolean81 && !Static177.aBoolean251 || Static401.aBoolean449)) {
			return;
		}
		@Pc(11) String local11 = arg0.toLowerCase();
		@Pc(13) byte local13 = 0;
		if (local11.startsWith(Static416.aClass174_198.method4208(0))) {
			local13 = 0;
			arg0 = arg0.substring(Static416.aClass174_198.method4208(0).length());
		} else if (local11.startsWith(Static159.aClass174_91.method4208(0))) {
			local13 = 1;
			arg0 = arg0.substring(Static159.aClass174_91.method4208(0).length());
		} else if (local11.startsWith(Static118.aClass174_67.method4208(0))) {
			local13 = 2;
			arg0 = arg0.substring(Static118.aClass174_67.method4208(0).length());
		} else if (local11.startsWith(Static450.aClass174_208.method4208(0))) {
			local13 = 3;
			arg0 = arg0.substring(Static450.aClass174_208.method4208(0).length());
		} else if (local11.startsWith(Static39.aClass174_24.method4208(0))) {
			local13 = 4;
			arg0 = arg0.substring(Static39.aClass174_24.method4208(0).length());
		} else if (local11.startsWith(Static297.aClass174_143.method4208(0))) {
			local13 = 5;
			arg0 = arg0.substring(Static297.aClass174_143.method4208(0).length());
		} else if (local11.startsWith(Static97.aClass174_59.method4208(0))) {
			local13 = 6;
			arg0 = arg0.substring(Static97.aClass174_59.method4208(0).length());
		} else if (local11.startsWith(Static261.aClass174_125.method4208(0))) {
			local13 = 7;
			arg0 = arg0.substring(Static261.aClass174_125.method4208(0).length());
		} else if (local11.startsWith(Static29.aClass174_168.method4208(0))) {
			local13 = 8;
			arg0 = arg0.substring(Static29.aClass174_168.method4208(0).length());
		} else if (local11.startsWith(Static81.aClass174_52.method4208(0))) {
			local13 = 9;
			arg0 = arg0.substring(Static81.aClass174_52.method4208(0).length());
		} else if (local11.startsWith(Static208.aClass174_111.method4208(0))) {
			local13 = 10;
			arg0 = arg0.substring(Static208.aClass174_111.method4208(0).length());
		} else if (local11.startsWith(Static3.aClass174_2.method4208(0))) {
			local13 = 11;
			arg0 = arg0.substring(Static3.aClass174_2.method4208(0).length());
		} else if (Static300.anInt5192 != 0) {
			if (local11.startsWith(Static416.aClass174_198.method4208(Static300.anInt5192))) {
				local13 = 0;
				arg0 = arg0.substring(Static416.aClass174_198.method4208(Static300.anInt5192).length());
			} else if (local11.startsWith(Static159.aClass174_91.method4208(Static300.anInt5192))) {
				local13 = 1;
				arg0 = arg0.substring(Static159.aClass174_91.method4208(Static300.anInt5192).length());
			} else if (local11.startsWith(Static118.aClass174_67.method4208(Static300.anInt5192))) {
				local13 = 2;
				arg0 = arg0.substring(Static118.aClass174_67.method4208(Static300.anInt5192).length());
			} else if (local11.startsWith(Static450.aClass174_208.method4208(Static300.anInt5192))) {
				local13 = 3;
				arg0 = arg0.substring(Static450.aClass174_208.method4208(Static300.anInt5192).length());
			} else if (local11.startsWith(Static39.aClass174_24.method4208(Static300.anInt5192))) {
				local13 = 4;
				arg0 = arg0.substring(Static39.aClass174_24.method4208(Static300.anInt5192).length());
			} else if (local11.startsWith(Static297.aClass174_143.method4208(Static300.anInt5192))) {
				local13 = 5;
				arg0 = arg0.substring(Static297.aClass174_143.method4208(Static300.anInt5192).length());
			} else if (local11.startsWith(Static97.aClass174_59.method4208(Static300.anInt5192))) {
				local13 = 6;
				arg0 = arg0.substring(Static97.aClass174_59.method4208(Static300.anInt5192).length());
			} else if (local11.startsWith(Static261.aClass174_125.method4208(Static300.anInt5192))) {
				local13 = 7;
				arg0 = arg0.substring(Static261.aClass174_125.method4208(Static300.anInt5192).length());
			} else if (local11.startsWith(Static29.aClass174_168.method4208(Static300.anInt5192))) {
				local13 = 8;
				arg0 = arg0.substring(Static29.aClass174_168.method4208(Static300.anInt5192).length());
			} else if (local11.startsWith(Static81.aClass174_52.method4208(Static300.anInt5192))) {
				local13 = 9;
				arg0 = arg0.substring(Static81.aClass174_52.method4208(Static300.anInt5192).length());
			} else if (local11.startsWith(Static208.aClass174_111.method4208(Static300.anInt5192))) {
				local13 = 10;
				arg0 = arg0.substring(Static208.aClass174_111.method4208(Static300.anInt5192).length());
			} else if (local11.startsWith(Static3.aClass174_2.method4208(Static300.anInt5192))) {
				local13 = 11;
				arg0 = arg0.substring(Static3.aClass174_2.method4208(Static300.anInt5192).length());
			}
		}
		local11 = arg0.toLowerCase();
		@Pc(451) byte local451 = 0;
		if (local11.startsWith(Static428.aClass174_202.method4208(0))) {
			local451 = 1;
			arg0 = arg0.substring(Static428.aClass174_202.method4208(0).length());
		} else if (local11.startsWith(Static272.aClass174_131.method4208(0))) {
			local451 = 2;
			arg0 = arg0.substring(Static272.aClass174_131.method4208(0).length());
		} else if (local11.startsWith(Static218.aClass174_209.method4208(0))) {
			local451 = 3;
			arg0 = arg0.substring(Static218.aClass174_209.method4208(0).length());
		} else if (local11.startsWith(Static204.aClass174_134.method4208(0))) {
			local451 = 4;
			arg0 = arg0.substring(Static204.aClass174_134.method4208(0).length());
		} else if (local11.startsWith(Static69.aClass174_43.method4208(0))) {
			local451 = 5;
			arg0 = arg0.substring(Static69.aClass174_43.method4208(0).length());
		} else if (Static300.anInt5192 != 0) {
			if (local11.startsWith(Static428.aClass174_202.method4208(Static300.anInt5192))) {
				local451 = 1;
				arg0 = arg0.substring(Static428.aClass174_202.method4208(Static300.anInt5192).length());
			} else if (local11.startsWith(Static272.aClass174_131.method4208(Static300.anInt5192))) {
				local451 = 2;
				arg0 = arg0.substring(Static272.aClass174_131.method4208(Static300.anInt5192).length());
			} else if (local11.startsWith(Static218.aClass174_209.method4208(Static300.anInt5192))) {
				local451 = 3;
				arg0 = arg0.substring(Static218.aClass174_209.method4208(Static300.anInt5192).length());
			} else if (local11.startsWith(Static204.aClass174_134.method4208(Static300.anInt5192))) {
				local451 = 4;
				arg0 = arg0.substring(Static204.aClass174_134.method4208(Static300.anInt5192).length());
			} else if (local11.startsWith(Static69.aClass174_43.method4208(Static300.anInt5192))) {
				local451 = 5;
				arg0 = arg0.substring(Static69.aClass174_43.method4208(Static300.anInt5192).length());
			}
		}
		Static307.method4633(Static150.aClass163_73);
		Static243.aClass3_Sub25_Sub1_7.method4081(0);
		@Pc(646) int local646 = Static243.aClass3_Sub25_Sub1_7.anInt4974;
		if (arg1 == 5021) {
			Static243.aClass3_Sub25_Sub1_7.method4081(1);
		} else if (arg1 == 5022) {
			Static243.aClass3_Sub25_Sub1_7.method4081(2);
		} else {
			Static243.aClass3_Sub25_Sub1_7.method4081(0);
		}
		Static243.aClass3_Sub25_Sub1_7.method4081(local13);
		Static243.aClass3_Sub25_Sub1_7.method4081(local451);
		Static189.method2956(arg0, Static243.aClass3_Sub25_Sub1_7);
		Static243.aClass3_Sub25_Sub1_7.method4091(Static243.aClass3_Sub25_Sub1_7.anInt4974 - local646);
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(Lclient!eq;I)V")
	private static void method3213(@OriginalArg(0) Class3_Sub15 arg0, @OriginalArg(1) int arg1) {
		@Pc(2) Object[] local2 = arg0.anObjectArray3;
		@Pc(8) int local8 = (Integer) local2[0];
		@Pc(12) Class3_Sub3_Sub8 local12 = Static346.method4833(local8);
		if (local12 == null) {
			return;
		}
		anIntArray241 = new int[local12.anInt1858];
		@Pc(21) int local21 = 0;
		aStringArray21 = new String[local12.anInt1859];
		@Pc(27) int local27 = 0;
		for (@Pc(29) int local29 = 1; local29 < local2.length; local29++) {
			if (local2[local29] instanceof Integer) {
				@Pc(41) int local41 = (Integer) local2[local29];
				if (local41 == -2147483647) {
					local41 = arg0.anInt1787;
				}
				if (local41 == -2147483646) {
					local41 = arg0.anInt1786;
				}
				if (local41 == -2147483645) {
					local41 = arg0.aClass82_1 == null ? -1 : arg0.aClass82_1.anInt2208;
				}
				if (local41 == -2147483644) {
					local41 = arg0.anInt1785;
				}
				if (local41 == -2147483643) {
					local41 = arg0.aClass82_1 == null ? -1 : arg0.aClass82_1.anInt2209;
				}
				if (local41 == -2147483642) {
					local41 = arg0.aClass82_2 == null ? -1 : arg0.aClass82_2.anInt2208;
				}
				if (local41 == -2147483641) {
					local41 = arg0.aClass82_2 == null ? -1 : arg0.aClass82_2.anInt2209;
				}
				if (local41 == -2147483640) {
					local41 = arg0.anInt1789;
				}
				if (local41 == -2147483639) {
					local41 = arg0.anInt1784;
				}
				anIntArray241[local21++] = local41;
			} else if (local2[local29] instanceof String) {
				@Pc(135) String local135 = (String) local2[local29];
				if (local135.equals("event_opbase")) {
					local135 = arg0.aString27;
				}
				aStringArray21[local27++] = local135;
			}
		}
		anInt3744 = arg0.anInt1790;
		method3207(local12, arg1);
	}

	@OriginalMember(owner = "client!kp", name = "b", descriptor = "(IZ)V")
	private static void method3214(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(137) Class82 local137;
		@Pc(25) int local25;
		@Pc(56) int local56;
		@Pc(19) int local19;
		@Pc(35) Class82 local35;
		@Pc(158) Class82 local158;
		@Pc(210) Class82 local210;
		@Pc(13) int local13;
		if (arg0 < 300) {
			if (arg0 == 100) {
				anInt3735 -= 3;
				local13 = anIntArray239[anInt3735];
				local19 = anIntArray239[anInt3735 + 1];
				local25 = anIntArray239[anInt3735 + 2];
				if (local19 == 0) {
					throw new RuntimeException();
				}
				local35 = Static180.method2857(local13);
				if (local35.aClass82Array1 == null) {
					local35.aClass82Array1 = new Class82[local25 + 1];
				}
				if (local35.aClass82Array1.length <= local25) {
					@Pc(54) Class82[] local54 = new Class82[local25 + 1];
					for (local56 = 0; local56 < local35.aClass82Array1.length; local56++) {
						local54[local56] = local35.aClass82Array1[local56];
					}
					local35.aClass82Array1 = local54;
				}
				if (local25 > 0 && local35.aClass82Array1[local25 - 1] == null) {
					throw new RuntimeException("Gap at:" + (local25 - 1));
				}
				@Pc(99) Class82 local99 = new Class82();
				local99.anInt2252 = local19;
				local99.anInt2259 = local99.anInt2208 = local35.anInt2208;
				local99.anInt2209 = local25;
				local35.aClass82Array1[local25] = local99;
				if (arg1) {
					aClass82_12 = local99;
				} else {
					aClass82_13 = local99;
				}
				Static463.method6297(local35);
				return;
			}
			if (arg0 == 101) {
				local137 = arg1 ? aClass82_12 : aClass82_13;
				if (local137.anInt2209 == -1) {
					if (arg1) {
						throw new RuntimeException("Tried to .cc_delete static .active-component!");
					}
					throw new RuntimeException("Tried to cc_delete static active-component!");
				}
				local158 = Static180.method2857(local137.anInt2208);
				local158.aClass82Array1[local137.anInt2209] = null;
				Static463.method6297(local158);
				return;
			}
			if (arg0 == 102) {
				local137 = Static180.method2857(anIntArray239[--anInt3735]);
				local137.aClass82Array1 = null;
				Static463.method6297(local137);
				return;
			}
			if (arg0 == 200) {
				anInt3735 -= 2;
				local13 = anIntArray239[anInt3735];
				local19 = anIntArray239[anInt3735 + 1];
				local210 = Static360.method5048(local19, local13);
				if (local210 != null && local19 != -1) {
					anIntArray239[anInt3735++] = 1;
					if (arg1) {
						aClass82_12 = local210;
						return;
					}
					aClass82_13 = local210;
					return;
				}
				anIntArray239[anInt3735++] = 0;
				return;
			}
			if (arg0 == 201) {
				local13 = anIntArray239[--anInt3735];
				local158 = Static180.method2857(local13);
				if (local158 != null) {
					anIntArray239[anInt3735++] = 1;
					if (arg1) {
						aClass82_12 = local158;
						return;
					}
					aClass82_13 = local158;
					return;
				}
				anIntArray239[anInt3735++] = 0;
				return;
			}
			if (arg0 == 202) {
				local13 = anIntArray239[--anInt3735];
				method3204(local13);
				return;
			}
			if (arg0 == 203) {
				local13 = anIntArray239[--anInt3735];
				method3208(local13);
				return;
			}
		} else {
			@Pc(353) int local353;
			@Pc(412) boolean local412;
			if (arg0 < 500) {
				if (arg0 == 403) {
					anInt3735 -= 2;
					local13 = anIntArray239[anInt3735];
					local19 = anIntArray239[anInt3735 + 1];
					for (local25 = 0; local25 < Static313.anIntArray332.length; local25++) {
						if (Static313.anIntArray332[local25] == local13) {
							Static203.aClass1_Sub2_Sub6_Sub2_1.aClass198_1.method4670(Static421.aClass7_1, local25, local19);
							return;
						}
					}
					for (local353 = 0; local353 < Static64.anIntArray65.length; local353++) {
						if (Static64.anIntArray65[local353] == local13) {
							Static203.aClass1_Sub2_Sub6_Sub2_1.aClass198_1.method4670(Static421.aClass7_1, local353, local19);
							return;
						}
					}
					return;
				}
				if (arg0 == 404) {
					anInt3735 -= 2;
					local13 = anIntArray239[anInt3735];
					local19 = anIntArray239[anInt3735 + 1];
					Static203.aClass1_Sub2_Sub6_Sub2_1.aClass198_1.method4681(local19, local13);
					return;
				}
				if (arg0 == 410) {
					local412 = anIntArray239[--anInt3735] != 0;
					Static203.aClass1_Sub2_Sub6_Sub2_1.aClass198_1.method4669(local412);
					return;
				}
			} else if ((arg0 < 1000 || arg0 >= 1100) && (arg0 < 2000 || arg0 >= 2100)) {
				@Pc(1488) String local1488;
				@Pc(1101) String local1101;
				if (arg0 >= 1100 && arg0 < 1200 || !(arg0 < 2100 || arg0 >= 2200)) {
					if (arg0 >= 2000) {
						arg0 -= 1000;
						local137 = Static180.method2857(anIntArray239[--anInt3735]);
					} else {
						local137 = arg1 ? aClass82_12 : aClass82_13;
					}
					if (arg0 == 1100) {
						anInt3735 -= 2;
						local137.anInt2245 = anIntArray239[anInt3735];
						if (local137.anInt2245 > local137.anInt2242 - local137.anInt2192) {
							local137.anInt2245 = local137.anInt2242 - local137.anInt2192;
						}
						if (local137.anInt2245 < 0) {
							local137.anInt2245 = 0;
						}
						local137.anInt2263 = anIntArray239[anInt3735 + 1];
						if (local137.anInt2263 > local137.anInt2249 - local137.anInt2216) {
							local137.anInt2263 = local137.anInt2249 - local137.anInt2216;
						}
						if (local137.anInt2263 < 0) {
							local137.anInt2263 = 0;
						}
						Static463.method6297(local137);
						if (local137.anInt2209 == -1) {
							Static73.method1315(local137.anInt2208);
						}
						return;
					}
					if (arg0 == 1101) {
						local137.anInt2274 = anIntArray239[--anInt3735];
						Static463.method6297(local137);
						if (local137.anInt2209 == -1) {
							Static136.method2086(local137.anInt2208);
						}
						return;
					}
					if (arg0 == 1102) {
						local137.aBoolean173 = anIntArray239[--anInt3735] == 1;
						Static463.method6297(local137);
						return;
					}
					if (arg0 == 1103) {
						local137.anInt2261 = anIntArray239[--anInt3735];
						Static463.method6297(local137);
						return;
					}
					if (arg0 == 1104) {
						local137.anInt2271 = anIntArray239[--anInt3735];
						Static463.method6297(local137);
						return;
					}
					if (arg0 == 1105) {
						local19 = anIntArray239[--anInt3735];
						if (local137.anInt2253 != local19) {
							local137.anInt2253 = local19;
							Static463.method6297(local137);
						}
						if (local137.anInt2209 == -1) {
							Static198.method3059(local137.anInt2208);
						}
						return;
					}
					if (arg0 == 1106) {
						local137.anInt2222 = anIntArray239[--anInt3735];
						Static463.method6297(local137);
						return;
					}
					if (arg0 == 1107) {
						local137.aBoolean180 = anIntArray239[--anInt3735] == 1;
						Static463.method6297(local137);
						return;
					}
					if (arg0 == 1108) {
						local137.anInt2233 = 1;
						local137.anInt2238 = anIntArray239[--anInt3735];
						Static463.method6297(local137);
						if (local137.anInt2209 == -1) {
							Static126.method1990(local137.anInt2208);
						}
						return;
					}
					if (arg0 == 1109) {
						anInt3735 -= 6;
						local137.anInt2256 = anIntArray239[anInt3735];
						local137.anInt2230 = anIntArray239[anInt3735 + 1];
						local137.anInt2232 = anIntArray239[anInt3735 + 2];
						local137.anInt2197 = anIntArray239[anInt3735 + 3];
						local137.anInt2193 = anIntArray239[anInt3735 + 4];
						local137.anInt2244 = anIntArray239[anInt3735 + 5];
						Static463.method6297(local137);
						if (local137.anInt2209 == -1) {
							Static37.method610(local137.anInt2208);
							Static409.method5640(local137.anInt2208);
						}
						return;
					}
					if (arg0 == 1110) {
						local19 = anIntArray239[--anInt3735];
						if (local137.anInt2227 != local19) {
							local137.anInt2227 = local19;
							local137.anInt2202 = 0;
							local137.anInt2219 = 1;
							local137.anInt2267 = 0;
							Static463.method6297(local137);
						}
						if (local137.anInt2209 == -1) {
							Static330.method4573(local137.anInt2208);
						}
						return;
					}
					if (arg0 == 1111) {
						local137.aBoolean166 = anIntArray239[--anInt3735] == 1;
						Static463.method6297(local137);
						return;
					}
					if (arg0 == 1112) {
						local1101 = aStringArray22[--anInt3736];
						if (!local1101.equals(local137.aString31)) {
							local137.aString31 = local1101;
							Static463.method6297(local137);
						}
						if (local137.anInt2209 == -1) {
							Static452.method6158(local137.anInt2208);
						}
						return;
					}
					if (arg0 == 1113) {
						local137.anInt2257 = anIntArray239[--anInt3735];
						Static463.method6297(local137);
						if (local137.anInt2209 == -1) {
							Static419.method5743(local137.anInt2208);
						}
						return;
					}
					if (arg0 == 1114) {
						anInt3735 -= 3;
						local137.anInt2229 = anIntArray239[anInt3735];
						local137.anInt2211 = anIntArray239[anInt3735 + 1];
						local137.anInt2214 = anIntArray239[anInt3735 + 2];
						Static463.method6297(local137);
						return;
					}
					if (arg0 == 1115) {
						local137.aBoolean170 = anIntArray239[--anInt3735] == 1;
						Static463.method6297(local137);
						return;
					}
					if (arg0 == 1116) {
						local137.anInt2205 = anIntArray239[--anInt3735];
						Static463.method6297(local137);
						return;
					}
					if (arg0 == 1117) {
						local137.anInt2226 = anIntArray239[--anInt3735];
						Static463.method6297(local137);
						return;
					}
					if (arg0 == 1118) {
						local137.aBoolean175 = anIntArray239[--anInt3735] == 1;
						Static463.method6297(local137);
						return;
					}
					if (arg0 == 1119) {
						local137.aBoolean181 = anIntArray239[--anInt3735] == 1;
						Static463.method6297(local137);
						return;
					}
					if (arg0 == 1120) {
						anInt3735 -= 2;
						local137.anInt2242 = anIntArray239[anInt3735];
						local137.anInt2249 = anIntArray239[anInt3735 + 1];
						Static463.method6297(local137);
						if (local137.anInt2252 == 0) {
							Static325.method4506(local137, false);
						}
						return;
					}
					if (arg0 == 1121) {
						anInt3735 -= 2;
						local137.anInt2273 = (short) anIntArray239[anInt3735];
						local137.anInt2265 = (short) anIntArray239[anInt3735 + 1];
						Static463.method6297(local137);
						return;
					}
					if (arg0 == 1122) {
						local137.aBoolean176 = anIntArray239[--anInt3735] == 1;
						Static463.method6297(local137);
						return;
					}
					if (arg0 == 1123) {
						local137.anInt2244 = anIntArray239[--anInt3735];
						Static463.method6297(local137);
						if (local137.anInt2209 == -1) {
							Static37.method610(local137.anInt2208);
						}
						return;
					}
					if (arg0 == 1124) {
						local19 = anIntArray239[--anInt3735];
						local137.aBoolean167 = local19 == 1;
						Static463.method6297(local137);
						return;
					}
					if (arg0 == 1125) {
						anInt3735 -= 2;
						local137.anInt2246 = anIntArray239[anInt3735];
						local137.anInt2236 = anIntArray239[anInt3735 + 1];
						Static463.method6297(local137);
						return;
					}
					if (arg0 == 1126) {
						local137.anInt2266 = anIntArray239[--anInt3735];
						Static463.method6297(local137);
						return;
					}
					@Pc(1454) Class32 local1454;
					if (arg0 == 1127) {
						anInt3735 -= 2;
						local19 = anIntArray239[anInt3735];
						local25 = anIntArray239[anInt3735 + 1];
						local1454 = Static70.aClass15_1.method323(local19);
						if (local25 != local1454.anInt813) {
							local137.method1964(local19, local25);
							return;
						}
						local137.method1972(local19);
						return;
					}
					if (arg0 == 1128) {
						local19 = anIntArray239[--anInt3735];
						local1488 = aStringArray22[--anInt3736];
						local1454 = Static70.aClass15_1.method323(local19);
						if (!local1454.aString5.equals(local1488)) {
							local137.method1968(local1488, local19);
							return;
						}
						local137.method1972(local19);
						return;
					}
				} else if ((arg0 < 1200 || arg0 >= 1300) && (arg0 < 2200 || arg0 >= 2300)) {
					@Pc(2290) int local2290;
					if ((arg0 < 1300 || arg0 >= 1400) && (arg0 < 2300 || arg0 >= 2400)) {
						if (arg0 >= 1400 && arg0 < 1500 || arg0 >= 2400 && arg0 < 2500) {
							if (arg0 >= 2000) {
								arg0 -= 1000;
								local137 = Static180.method2857(anIntArray239[--anInt3735]);
							} else {
								local137 = arg1 ? aClass82_12 : aClass82_13;
							}
							local1101 = aStringArray22[--anInt3736];
							@Pc(2369) int[] local2369 = null;
							if (local1101.length() > 0 && local1101.charAt(local1101.length() - 1) == 'Y') {
								local353 = anIntArray239[--anInt3735];
								if (local353 > 0) {
									local2369 = new int[local353];
									while (local353-- > 0) {
										local2369[local353] = anIntArray239[--anInt3735];
									}
								}
								local1101 = local1101.substring(0, local1101.length() - 1);
							}
							@Pc(2421) Object[] local2421 = new Object[local1101.length() + 1];
							for (local2290 = local2421.length - 1; local2290 >= 1; local2290--) {
								if (local1101.charAt(local2290 - 1) == 's') {
									local2421[local2290] = aStringArray22[--anInt3736];
								} else {
									local2421[local2290] = Integer.valueOf(anIntArray239[--anInt3735]);
								}
							}
							local56 = anIntArray239[--anInt3735];
							if (local56 == -1) {
								local2421 = null;
							} else {
								local2421[0] = Integer.valueOf(local56);
							}
							if (arg0 == 1400) {
								local137.anObjectArray29 = local2421;
							} else if (arg0 == 1401) {
								local137.anObjectArray21 = local2421;
							} else if (arg0 == 1402) {
								local137.anObjectArray13 = local2421;
							} else if (arg0 == 1403) {
								local137.anObjectArray28 = local2421;
							} else if (arg0 == 1404) {
								local137.anObjectArray33 = local2421;
							} else if (arg0 == 1405) {
								local137.anObjectArray31 = local2421;
							} else if (arg0 == 1406) {
								local137.anObjectArray5 = local2421;
							} else if (arg0 == 1407) {
								local137.anObjectArray34 = local2421;
								local137.anIntArray109 = local2369;
							} else if (arg0 == 1408) {
								local137.anObjectArray24 = local2421;
							} else if (arg0 == 1409) {
								local137.anObjectArray9 = local2421;
							} else if (arg0 == 1410) {
								local137.anObjectArray32 = local2421;
							} else if (arg0 == 1411) {
								local137.anObjectArray17 = local2421;
							} else if (arg0 == 1412) {
								local137.anObjectArray6 = local2421;
							} else if (arg0 == 1414) {
								local137.anObjectArray7 = local2421;
								local137.anIntArray105 = local2369;
							} else if (arg0 == 1415) {
								local137.anObjectArray20 = local2421;
								local137.anIntArray106 = local2369;
							} else if (arg0 == 1416) {
								local137.anObjectArray4 = local2421;
							} else if (arg0 == 1417) {
								local137.anObjectArray27 = local2421;
							} else if (arg0 == 1418) {
								local137.anObjectArray18 = local2421;
							} else if (arg0 == 1419) {
								local137.anObjectArray23 = local2421;
							} else if (arg0 == 1420) {
								local137.anObjectArray22 = local2421;
							} else if (arg0 == 1421) {
								local137.anObjectArray25 = local2421;
							} else if (arg0 == 1422) {
								local137.anObjectArray12 = local2421;
							} else if (arg0 == 1423) {
								local137.anObjectArray15 = local2421;
							} else if (arg0 == 1424) {
								local137.anObjectArray26 = local2421;
							} else if (arg0 == 1425) {
								local137.anObjectArray16 = local2421;
							} else if (arg0 == 1426) {
								local137.anObjectArray19 = local2421;
							} else if (arg0 == 1427) {
								local137.anObjectArray10 = local2421;
							} else if (arg0 == 1428) {
								local137.anObjectArray11 = local2421;
								local137.lb = local2369;
							} else if (arg0 == 1429) {
								local137.anObjectArray14 = local2421;
								local137.anIntArray110 = local2369;
							} else if (arg0 == 1430) {
								local137.anObjectArray30 = local2421;
							}
							local137.aBoolean182 = true;
							return;
						}
						if (arg0 < 1600) {
							local137 = arg1 ? aClass82_12 : aClass82_13;
							if (arg0 == 1500) {
								anIntArray239[anInt3735++] = local137.anInt2210;
								return;
							}
							if (arg0 == 1501) {
								anIntArray239[anInt3735++] = local137.anInt2199;
								return;
							}
							if (arg0 == 1502) {
								anIntArray239[anInt3735++] = local137.anInt2192;
								return;
							}
							if (arg0 == 1503) {
								anIntArray239[anInt3735++] = local137.anInt2216;
								return;
							}
							if (arg0 == 1504) {
								anIntArray239[anInt3735++] = local137.aBoolean169 ? 1 : 0;
								return;
							}
							if (arg0 == 1505) {
								anIntArray239[anInt3735++] = local137.anInt2259;
								return;
							}
							if (arg0 == 1506) {
								local158 = Static264.method3661(local137);
								anIntArray239[anInt3735++] = local158 == null ? -1 : local158.anInt2208;
								return;
							}
						} else {
							@Pc(3017) Class32 local3017;
							if (arg0 < 1700) {
								local137 = arg1 ? aClass82_12 : aClass82_13;
								if (arg0 == 1600) {
									anIntArray239[anInt3735++] = local137.anInt2245;
									return;
								}
								if (arg0 == 1601) {
									anIntArray239[anInt3735++] = local137.anInt2263;
									return;
								}
								if (arg0 == 1602) {
									aStringArray22[anInt3736++] = local137.aString31;
									return;
								}
								if (arg0 == 1603) {
									anIntArray239[anInt3735++] = local137.anInt2242;
									return;
								}
								if (arg0 == 1604) {
									anIntArray239[anInt3735++] = local137.anInt2249;
									return;
								}
								if (arg0 == 1605) {
									anIntArray239[anInt3735++] = local137.anInt2244;
									return;
								}
								if (arg0 == 1606) {
									anIntArray239[anInt3735++] = local137.anInt2232;
									return;
								}
								if (arg0 == 1607) {
									anIntArray239[anInt3735++] = local137.anInt2193;
									return;
								}
								if (arg0 == 1608) {
									anIntArray239[anInt3735++] = local137.anInt2197;
									return;
								}
								if (arg0 == 1609) {
									anIntArray239[anInt3735++] = local137.anInt2261;
									return;
								}
								if (arg0 == 1610) {
									anIntArray239[anInt3735++] = local137.anInt2256;
									return;
								}
								if (arg0 == 1611) {
									anIntArray239[anInt3735++] = local137.anInt2230;
									return;
								}
								if (arg0 == 1612) {
									anIntArray239[anInt3735++] = local137.anInt2253;
									return;
								}
								if (arg0 == 1613) {
									local19 = anIntArray239[--anInt3735];
									local3017 = Static70.aClass15_1.method323(local19);
									if (local3017.method879()) {
										aStringArray22[anInt3736++] = local137.method1966(local3017.aString5, local19);
										return;
									}
									anIntArray239[anInt3735++] = local137.method1961(local3017.anInt813, local19);
									return;
								}
							} else if (arg0 < 1800) {
								local137 = arg1 ? aClass82_12 : aClass82_13;
								if (arg0 == 1700) {
									anIntArray239[anInt3735++] = local137.anInt2200;
									return;
								}
								if (arg0 == 1701) {
									if (local137.anInt2200 != -1) {
										anIntArray239[anInt3735++] = local137.anInt2215;
										return;
									}
									anIntArray239[anInt3735++] = 0;
									return;
								}
								if (arg0 == 1702) {
									anIntArray239[anInt3735++] = local137.anInt2209;
									return;
								}
							} else if (arg0 < 1900) {
								local137 = arg1 ? aClass82_12 : aClass82_13;
								if (arg0 == 1800) {
									anIntArray239[anInt3735++] = Static54.method1060(local137).method5454();
									return;
								}
								if (arg0 == 1801) {
									local19 = anIntArray239[--anInt3735];
									local19--;
									if (local137.aStringArray13 != null && local19 < local137.aStringArray13.length && local137.aStringArray13[local19] != null) {
										aStringArray22[anInt3736++] = local137.aStringArray13[local19];
										return;
									}
									aStringArray22[anInt3736++] = "";
									return;
								}
								if (arg0 == 1802) {
									if (local137.aString34 == null) {
										aStringArray22[anInt3736++] = "";
										return;
									}
									aStringArray22[anInt3736++] = local137.aString34;
									return;
								}
							} else if (arg0 < 2000 || arg0 >= 2900 && arg0 < 3000) {
								if (arg0 >= 2000) {
									local137 = Static180.method2857(anIntArray239[--anInt3735]);
									arg0 -= 1000;
								} else {
									local137 = arg1 ? aClass82_12 : aClass82_13;
								}
								if (anInt3744 >= 10) {
									throw new RuntimeException("C29xx-1");
								}
								if (arg0 == 1927) {
									if (local137.anObjectArray10 == null) {
										return;
									}
									@Pc(3254) Class3_Sub15 local3254 = new Class3_Sub15();
									local3254.aClass82_1 = local137;
									local3254.anObjectArray3 = local137.anObjectArray10;
									local3254.anInt1790 = anInt3744 + 1;
									Static458.aClass193_69.method4527(local3254);
									return;
								}
							} else if (arg0 < 2600) {
								local137 = Static180.method2857(anIntArray239[--anInt3735]);
								if (arg0 == 2500) {
									anIntArray239[anInt3735++] = local137.anInt2210;
									return;
								}
								if (arg0 == 2501) {
									anIntArray239[anInt3735++] = local137.anInt2199;
									return;
								}
								if (arg0 == 2502) {
									anIntArray239[anInt3735++] = local137.anInt2192;
									return;
								}
								if (arg0 == 2503) {
									anIntArray239[anInt3735++] = local137.anInt2216;
									return;
								}
								if (arg0 == 2504) {
									anIntArray239[anInt3735++] = local137.aBoolean169 ? 1 : 0;
									return;
								}
								if (arg0 == 2505) {
									anIntArray239[anInt3735++] = local137.anInt2259;
									return;
								}
								if (arg0 == 1506) {
									local158 = Static264.method3661(local137);
									anIntArray239[anInt3735++] = local158 == null ? -1 : local158.anInt2208;
									return;
								}
							} else if (arg0 < 2700) {
								local137 = Static180.method2857(anIntArray239[--anInt3735]);
								if (arg0 == 2600) {
									anIntArray239[anInt3735++] = local137.anInt2245;
									return;
								}
								if (arg0 == 2601) {
									anIntArray239[anInt3735++] = local137.anInt2263;
									return;
								}
								if (arg0 == 2602) {
									aStringArray22[anInt3736++] = local137.aString31;
									return;
								}
								if (arg0 == 2603) {
									anIntArray239[anInt3735++] = local137.anInt2242;
									return;
								}
								if (arg0 == 2604) {
									anIntArray239[anInt3735++] = local137.anInt2249;
									return;
								}
								if (arg0 == 2605) {
									anIntArray239[anInt3735++] = local137.anInt2244;
									return;
								}
								if (arg0 == 2606) {
									anIntArray239[anInt3735++] = local137.anInt2232;
									return;
								}
								if (arg0 == 2607) {
									anIntArray239[anInt3735++] = local137.anInt2193;
									return;
								}
								if (arg0 == 2608) {
									anIntArray239[anInt3735++] = local137.anInt2197;
									return;
								}
								if (arg0 == 2609) {
									anIntArray239[anInt3735++] = local137.anInt2261;
									return;
								}
								if (arg0 == 2610) {
									anIntArray239[anInt3735++] = local137.anInt2256;
									return;
								}
								if (arg0 == 2611) {
									anIntArray239[anInt3735++] = local137.anInt2230;
									return;
								}
								if (arg0 == 2612) {
									anIntArray239[anInt3735++] = local137.anInt2253;
									return;
								}
							} else {
								@Pc(3751) Class3_Sub10 local3751;
								@Pc(3649) Class3_Sub10 local3649;
								if (arg0 < 2800) {
									if (arg0 == 2700) {
										local137 = Static180.method2857(anIntArray239[--anInt3735]);
										anIntArray239[anInt3735++] = local137.anInt2200;
										return;
									}
									if (arg0 == 2701) {
										local137 = Static180.method2857(anIntArray239[--anInt3735]);
										if (local137.anInt2200 != -1) {
											anIntArray239[anInt3735++] = local137.anInt2215;
											return;
										}
										anIntArray239[anInt3735++] = 0;
										return;
									}
									if (arg0 == 2702) {
										local13 = anIntArray239[--anInt3735];
										local3649 = (Class3_Sub10) Static32.aClass140_5.method3490((long) local13);
										if (local3649 != null) {
											anIntArray239[anInt3735++] = 1;
											return;
										}
										anIntArray239[anInt3735++] = 0;
										return;
									}
									if (arg0 == 2703) {
										local137 = Static180.method2857(anIntArray239[--anInt3735]);
										if (local137.aClass82Array1 == null) {
											anIntArray239[anInt3735++] = 0;
											return;
										}
										local19 = local137.aClass82Array1.length;
										for (local25 = 0; local25 < local137.aClass82Array1.length; local25++) {
											if (local137.aClass82Array1[local25] == null) {
												local19 = local25;
												break;
											}
										}
										anIntArray239[anInt3735++] = local19;
										return;
									}
									if (arg0 == 2704 || arg0 == 2705) {
										anInt3735 -= 2;
										local13 = anIntArray239[anInt3735];
										local19 = anIntArray239[anInt3735 + 1];
										local3751 = (Class3_Sub10) Static32.aClass140_5.method3490((long) local13);
										if (local3751 != null && local3751.anInt827 == local19) {
											anIntArray239[anInt3735++] = 1;
											return;
										}
										anIntArray239[anInt3735++] = 0;
										return;
									}
								} else if (arg0 < 2900) {
									local137 = Static180.method2857(anIntArray239[--anInt3735]);
									if (arg0 == 2800) {
										anIntArray239[anInt3735++] = Static54.method1060(local137).method5454();
										return;
									}
									if (arg0 == 2801) {
										local19 = anIntArray239[--anInt3735];
										local19--;
										if (local137.aStringArray13 != null && local19 < local137.aStringArray13.length && local137.aStringArray13[local19] != null) {
											aStringArray22[anInt3736++] = local137.aStringArray13[local19];
											return;
										}
										aStringArray22[anInt3736++] = "";
										return;
									}
									if (arg0 == 2802) {
										if (local137.aString34 == null) {
											aStringArray22[anInt3736++] = "";
											return;
										}
										aStringArray22[anInt3736++] = local137.aString34;
										return;
									}
								} else {
									@Pc(3888) String local3888;
									if (arg0 < 3200) {
										if (arg0 == 3100) {
											local3888 = aStringArray22[--anInt3736];
											Static370.method5160(local3888);
											return;
										}
										if (arg0 == 3101) {
											anInt3735 -= 2;
											Static49.method920(anIntArray239[anInt3735], Static203.aClass1_Sub2_Sub6_Sub2_1, anIntArray239[anInt3735 + 1]);
											return;
										}
										if (arg0 == 3103) {
											Static172.method2630();
											return;
										}
										if (arg0 == 3104) {
											local3888 = aStringArray22[--anInt3736];
											local19 = 0;
											if (Static38.method611(local3888)) {
												local19 = Static160.method2518(local3888);
											}
											Static307.method4633(Static328.aClass163_136);
											Static243.aClass3_Sub25_Sub1_7.method4082(local19);
											return;
										}
										if (arg0 == 3105) {
											local3888 = aStringArray22[--anInt3736];
											Static307.method4633(Static69.aClass163_41);
											Static243.aClass3_Sub25_Sub1_7.method4081(local3888.length() + 1);
											Static243.aClass3_Sub25_Sub1_7.method4080(local3888);
											return;
										}
										if (arg0 == 3106) {
											local3888 = aStringArray22[--anInt3736];
											Static307.method4633(Static3.aClass163_1);
											Static243.aClass3_Sub25_Sub1_7.method4081(local3888.length() + 1);
											Static243.aClass3_Sub25_Sub1_7.method4080(local3888);
											return;
										}
										if (arg0 == 3107) {
											local13 = anIntArray239[--anInt3735];
											local1101 = aStringArray22[--anInt3736];
											Static74.method1316(local1101, local13);
											return;
										}
										if (arg0 == 3108) {
											anInt3735 -= 3;
											local13 = anIntArray239[anInt3735];
											local19 = anIntArray239[anInt3735 + 1];
											local25 = anIntArray239[anInt3735 + 2];
											local35 = Static180.method2857(local25);
											Static278.method3849(local35, local13, local19);
											return;
										}
										if (arg0 == 3109) {
											anInt3735 -= 2;
											local13 = anIntArray239[anInt3735];
											local19 = anIntArray239[anInt3735 + 1];
											local210 = arg1 ? aClass82_12 : aClass82_13;
											Static278.method3849(local210, local13, local19);
											return;
										}
										if (arg0 == 3110) {
											local13 = anIntArray239[--anInt3735];
											Static307.method4633(Static189.aClass163_90);
											Static243.aClass3_Sub25_Sub1_7.method4123(local13);
											return;
										}
										if (arg0 == 3111) {
											anInt3735 -= 2;
											local13 = anIntArray239[anInt3735];
											local19 = anIntArray239[anInt3735 + 1];
											local3751 = (Class3_Sub10) Static32.aClass140_5.method3490((long) local13);
											if (local3751 != null) {
												Static87.method1538(local3751, true, local3751.anInt827 != local19);
											}
											Static435.method5882(3, local19, true, local13);
											return;
										}
										if (arg0 == 3112) {
											anInt3735--;
											local13 = anIntArray239[anInt3735];
											local3649 = (Class3_Sub10) Static32.aClass140_5.method3490((long) local13);
											if (local3649 != null && local3649.anInt831 == 3) {
												Static87.method1538(local3649, true, true);
											}
											return;
										}
										if (arg0 == 3113) {
											Static178.method2854(aStringArray22[--anInt3736]);
											return;
										}
										if (arg0 == 3114) {
											anInt3735 -= 2;
											local13 = anIntArray239[anInt3735];
											local19 = anIntArray239[anInt3735 + 1];
											local1488 = aStringArray22[--anInt3736];
											Static349.method4875(local19, "", local13, "", local1488);
											return;
										}
									} else if (arg0 < 3300) {
										if (arg0 == 3200) {
											anInt3735 -= 3;
											Static462.method6277(255, anIntArray239[anInt3735 + 2], anIntArray239[anInt3735 + 1], anIntArray239[anInt3735]);
											return;
										}
										if (arg0 == 3201) {
											Static218.method6133(255, 50, anIntArray239[--anInt3735]);
											return;
										}
										if (arg0 == 3202) {
											anInt3735 -= 2;
											Static261.method3617(anIntArray239[anInt3735 + 1], 255, anIntArray239[anInt3735]);
											return;
										}
										if (arg0 == 3203) {
											anInt3735 -= 4;
											Static462.method6277(anIntArray239[anInt3735 + 3], anIntArray239[anInt3735 + 2], anIntArray239[anInt3735 + 1], anIntArray239[anInt3735]);
											return;
										}
										if (arg0 == 3204) {
											anInt3735 -= 3;
											Static218.method6133(anIntArray239[anInt3735 + 1], anIntArray239[anInt3735 + 2], anIntArray239[anInt3735]);
											return;
										}
										if (arg0 == 3205) {
											anInt3735 -= 3;
											Static261.method3617(anIntArray239[anInt3735 + 1], anIntArray239[anInt3735 + 2], anIntArray239[anInt3735]);
											return;
										}
										if (arg0 == 3206) {
											anInt3735 -= 4;
											Static254.method4736(anIntArray239[anInt3735], anIntArray239[anInt3735 + 2], anIntArray239[anInt3735 + 3], anIntArray239[anInt3735 + 1]);
											return;
										}
									} else if (arg0 < 3400) {
										if (arg0 == 3300) {
											anIntArray239[anInt3735++] = Static172.anInt3107;
											return;
										}
										if (arg0 == 3301) {
											anInt3735 -= 2;
											local13 = anIntArray239[anInt3735];
											local19 = anIntArray239[anInt3735 + 1];
											anIntArray239[anInt3735++] = Static187.method2928(local19, false, local13);
											return;
										}
										if (arg0 == 3302) {
											anInt3735 -= 2;
											local13 = anIntArray239[anInt3735];
											local19 = anIntArray239[anInt3735 + 1];
											anIntArray239[anInt3735++] = Static426.method5802(local13, local19, false);
											return;
										}
										if (arg0 == 3303) {
											anInt3735 -= 2;
											local13 = anIntArray239[anInt3735];
											local19 = anIntArray239[anInt3735 + 1];
											anIntArray239[anInt3735++] = Static312.method4375(local19, local13, false);
											return;
										}
										if (arg0 == 3304) {
											local13 = anIntArray239[--anInt3735];
											anIntArray239[anInt3735++] = Static247.aClass46_2.method1264(local13).anInt6394;
											return;
										}
										if (arg0 == 3305) {
											local13 = anIntArray239[--anInt3735];
											anIntArray239[anInt3735++] = Static226.anIntArray443[local13];
											return;
										}
										if (arg0 == 3306) {
											local13 = anIntArray239[--anInt3735];
											anIntArray239[anInt3735++] = Static95.anIntArray80[local13];
											return;
										}
										if (arg0 == 3307) {
											local13 = anIntArray239[--anInt3735];
											anIntArray239[anInt3735++] = Static400.anIntArray418[local13];
											return;
										}
										if (arg0 == 3308) {
											@Pc(4605) byte local4605 = Static203.aClass1_Sub2_Sub6_Sub2_1.aByte101;
											local19 = (Static203.aClass1_Sub2_Sub6_Sub2_1.anInt7560 >> 7) + Static59.anInt1127;
											local25 = (Static203.aClass1_Sub2_Sub6_Sub2_1.anInt7557 >> 7) + Static49.anInt873;
											anIntArray239[anInt3735++] = (local4605 << 28) + (local19 << 14) + local25;
											return;
										}
										if (arg0 == 3309) {
											local13 = anIntArray239[--anInt3735];
											anIntArray239[anInt3735++] = local13 >> 14 & 0x3FFF;
											return;
										}
										if (arg0 == 3310) {
											local13 = anIntArray239[--anInt3735];
											anIntArray239[anInt3735++] = local13 >> 28;
											return;
										}
										if (arg0 == 3311) {
											local13 = anIntArray239[--anInt3735];
											anIntArray239[anInt3735++] = local13 & 0x3FFF;
											return;
										}
										if (arg0 == 3312) {
											anIntArray239[anInt3735++] = Static182.aBoolean253 ? 1 : 0;
											return;
										}
										if (arg0 == 3313) {
											anInt3735 -= 2;
											local13 = anIntArray239[anInt3735];
											local19 = anIntArray239[anInt3735 + 1];
											anIntArray239[anInt3735++] = Static187.method2928(local19, true, local13);
											return;
										}
										if (arg0 == 3314) {
											anInt3735 -= 2;
											local13 = anIntArray239[anInt3735];
											local19 = anIntArray239[anInt3735 + 1];
											anIntArray239[anInt3735++] = Static426.method5802(local13, local19, true);
											return;
										}
										if (arg0 == 3315) {
											anInt3735 -= 2;
											local13 = anIntArray239[anInt3735];
											local19 = anIntArray239[anInt3735 + 1];
											anIntArray239[anInt3735++] = Static312.method4375(local19, local13, true);
											return;
										}
										if (arg0 == 3316) {
											if (Static300.anInt5196 >= 2) {
												anIntArray239[anInt3735++] = Static300.anInt5196;
												return;
											}
											anIntArray239[anInt3735++] = 0;
											return;
										}
										if (arg0 == 3317) {
											anIntArray239[anInt3735++] = Static245.anInt4185;
											return;
										}
										if (arg0 == 3318) {
											anIntArray239[anInt3735++] = Static367.aClass241_6.anInt6624;
											return;
										}
										if (arg0 == 3321) {
											anIntArray239[anInt3735++] = Static69.anInt1288;
											return;
										}
										if (arg0 == 3322) {
											anIntArray239[anInt3735++] = Static413.anInt6972;
											return;
										}
										if (arg0 == 3323) {
											if (Static252.anInt4255 >= 5 && Static252.anInt4255 <= 9) {
												anIntArray239[anInt3735++] = 1;
												return;
											}
											anIntArray239[anInt3735++] = 0;
											return;
										}
										if (arg0 == 3324) {
											if (Static252.anInt4255 >= 5 && Static252.anInt4255 <= 9) {
												anIntArray239[anInt3735++] = Static252.anInt4255;
												return;
											}
											anIntArray239[anInt3735++] = 0;
											return;
										}
										if (arg0 == 3325) {
											anIntArray239[anInt3735++] = Static279.aBoolean332 ? 1 : 0;
											return;
										}
										if (arg0 == 3326) {
											anIntArray239[anInt3735++] = Static203.aClass1_Sub2_Sub6_Sub2_1.anInt7651;
											return;
										}
										if (arg0 == 3327) {
											anIntArray239[anInt3735++] = Static203.aClass1_Sub2_Sub6_Sub2_1.aClass198_1.aBoolean403 ? 1 : 0;
											return;
										}
										if (arg0 == 3329) {
											anIntArray239[anInt3735++] = Static401.aBoolean449 ? 1 : 0;
											return;
										}
										if (arg0 == 3330) {
											local13 = anIntArray239[--anInt3735];
											anIntArray239[anInt3735++] = Static218.method6143(local13);
											return;
										}
										if (arg0 == 3331) {
											anInt3735 -= 2;
											local13 = anIntArray239[anInt3735];
											local19 = anIntArray239[anInt3735 + 1];
											anIntArray239[anInt3735++] = Static324.method4496(local19, false, local13);
											return;
										}
										if (arg0 == 3332) {
											anInt3735 -= 2;
											local13 = anIntArray239[anInt3735];
											local19 = anIntArray239[anInt3735 + 1];
											anIntArray239[anInt3735++] = Static324.method4496(local19, true, local13);
											return;
										}
										if (arg0 == 3333) {
											anIntArray239[anInt3735++] = Static154.anInt2803;
											return;
										}
										if (arg0 == 3335) {
											anIntArray239[anInt3735++] = Static300.anInt5192;
											return;
										}
										if (arg0 == 3336) {
											anInt3735 -= 4;
											local13 = anIntArray239[anInt3735];
											local19 = anIntArray239[anInt3735 + 1];
											local25 = anIntArray239[anInt3735 + 2];
											local353 = anIntArray239[anInt3735 + 3];
											local13 += local19 << 14;
											local13 += local25 << 28;
											local13 += local353;
											anIntArray239[anInt3735++] = local13;
											return;
										}
										if (arg0 == 3337) {
											anIntArray239[anInt3735++] = Static59.anInt1131;
											return;
										}
										if (arg0 == 3338) {
											anIntArray239[anInt3735++] = Static429.method5847();
											return;
										}
										if (arg0 == 3339) {
											anIntArray239[anInt3735++] = Static37.aBoolean34 ? 1 : 0;
											return;
										}
										if (arg0 == 3340) {
											anIntArray239[anInt3735++] = Static58.aBoolean72 ? 1 : 0;
											return;
										}
										if (arg0 == 3341) {
											anIntArray239[anInt3735++] = Static252.aBoolean302 ? 1 : 0;
											return;
										}
									} else if (arg0 < 3500) {
										@Pc(5261) Class249 local5261;
										if (arg0 == 3400) {
											anInt3735 -= 2;
											local13 = anIntArray239[anInt3735];
											local19 = anIntArray239[anInt3735 + 1];
											local5261 = Static150.aClass218_1.method5113(local13);
											aStringArray22[anInt3736++] = local5261.method5777(local19);
											return;
										}
										if (arg0 == 3408) {
											anInt3735 -= 4;
											local13 = anIntArray239[anInt3735];
											local19 = anIntArray239[anInt3735 + 1];
											local25 = anIntArray239[anInt3735 + 2];
											local353 = anIntArray239[anInt3735 + 3];
											@Pc(5307) Class249 local5307 = Static150.aClass218_1.method5113(local25);
											if (local5307.aChar4 == local13 && local5307.aChar5 == local19) {
												if (local19 == 115) {
													aStringArray22[anInt3736++] = local5307.method5777(local353);
													return;
												}
												anIntArray239[anInt3735++] = local5307.method5775(local353);
												return;
											}
											throw new RuntimeException("C3408-1");
										}
										if (arg0 == 3409) {
											anInt3735 -= 3;
											local13 = anIntArray239[anInt3735];
											local19 = anIntArray239[anInt3735 + 1];
											local25 = anIntArray239[anInt3735 + 2];
											if (local19 == -1) {
												throw new RuntimeException("C3409-2");
											}
											@Pc(5383) Class249 local5383 = Static150.aClass218_1.method5113(local19);
											if (local5383.aChar5 != local13) {
												throw new RuntimeException("C3409-1");
											}
											anIntArray239[anInt3735++] = local5383.method5766(local25) ? 1 : 0;
											return;
										}
										if (arg0 == 3410) {
											local13 = anIntArray239[--anInt3735];
											local1101 = aStringArray22[--anInt3736];
											if (local13 == -1) {
												throw new RuntimeException("C3410-2");
											}
											local5261 = Static150.aClass218_1.method5113(local13);
											if (local5261.aChar5 != 's') {
												throw new RuntimeException("C3410-1");
											}
											anIntArray239[anInt3735++] = local5261.method5767(local1101) ? 1 : 0;
											return;
										}
										if (arg0 == 3411) {
											local13 = anIntArray239[--anInt3735];
											@Pc(5481) Class249 local5481 = Static150.aClass218_1.method5113(local13);
											anIntArray239[anInt3735++] = local5481.aClass140_38.method3492();
											return;
										}
									} else if (arg0 < 3700) {
										if (arg0 == 3600) {
											if (Static284.anInt5007 == 0) {
												anIntArray239[anInt3735++] = -2;
												return;
											}
											if (Static284.anInt5007 == 1) {
												anIntArray239[anInt3735++] = -1;
												return;
											}
											anIntArray239[anInt3735++] = Static12.anInt180;
											return;
										}
										if (arg0 == 3601) {
											local13 = anIntArray239[--anInt3735];
											if (Static284.anInt5007 == 2 && local13 < Static12.anInt180) {
												aStringArray22[anInt3736++] = Static296.aStringArray32[local13];
												if (Static347.aStringArray35[local13] != null) {
													aStringArray22[anInt3736++] = Static347.aStringArray35[local13];
													return;
												}
												aStringArray22[anInt3736++] = "";
												return;
											}
											aStringArray22[anInt3736++] = "";
											aStringArray22[anInt3736++] = "";
											return;
										}
										if (arg0 == 3602) {
											local13 = anIntArray239[--anInt3735];
											if (Static284.anInt5007 == 2 && local13 < Static12.anInt180) {
												anIntArray239[anInt3735++] = Static216.anIntArray238[local13];
												return;
											}
											anIntArray239[anInt3735++] = 0;
											return;
										}
										if (arg0 == 3603) {
											local13 = anIntArray239[--anInt3735];
											if (Static284.anInt5007 == 2 && local13 < Static12.anInt180) {
												anIntArray239[anInt3735++] = Static83.anIntArray74[local13];
												return;
											}
											anIntArray239[anInt3735++] = 0;
											return;
										}
										if (arg0 == 3604) {
											local3888 = aStringArray22[--anInt3736];
											local19 = anIntArray239[--anInt3735];
											Static300.method4284(local19, local3888);
											return;
										}
										if (arg0 == 3605) {
											local3888 = aStringArray22[--anInt3736];
											Static377.method5241(local3888);
											return;
										}
										if (arg0 == 3606) {
											local3888 = aStringArray22[--anInt3736];
											Static404.method5524(local3888);
											return;
										}
										if (arg0 == 3607) {
											local3888 = aStringArray22[--anInt3736];
											Static307.method4640(false, local3888);
											return;
										}
										if (arg0 == 3608) {
											local3888 = aStringArray22[--anInt3736];
											Static80.method1438(local3888);
											return;
										}
										if (arg0 == 3609) {
											local3888 = aStringArray22[--anInt3736];
											if (local3888.startsWith("<img=0>") || local3888.startsWith("<img=1>")) {
												local3888 = local3888.substring(7);
											}
											anIntArray239[anInt3735++] = Static60.method1135(local3888) ? 1 : 0;
											return;
										}
										if (arg0 == 3610) {
											local13 = anIntArray239[--anInt3735];
											if (Static284.anInt5007 == 2 && local13 < Static12.anInt180) {
												aStringArray22[anInt3736++] = Static77.aStringArray10[local13];
												return;
											}
											aStringArray22[anInt3736++] = "";
											return;
										}
										if (arg0 == 3611) {
											if (Static53.aString8 != null) {
												aStringArray22[anInt3736++] = Static304.method5405(Static53.aString8);
												return;
											}
											aStringArray22[anInt3736++] = "";
											return;
										}
										if (arg0 == 3612) {
											if (Static53.aString8 != null) {
												anIntArray239[anInt3735++] = Static413.anInt6975;
												return;
											}
											anIntArray239[anInt3735++] = 0;
											return;
										}
										if (arg0 == 3613) {
											local13 = anIntArray239[--anInt3735];
											if (Static53.aString8 != null && local13 < Static413.anInt6975) {
												aStringArray22[anInt3736++] = Static169.aClass54Array131[local13].aString23;
												return;
											}
											aStringArray22[anInt3736++] = "";
											return;
										}
										if (arg0 == 3614) {
											local13 = anIntArray239[--anInt3735];
											if (Static53.aString8 != null && local13 < Static413.anInt6975) {
												anIntArray239[anInt3735++] = Static169.aClass54Array131[local13].anInt1438;
												return;
											}
											anIntArray239[anInt3735++] = 0;
											return;
										}
										if (arg0 == 3615) {
											local13 = anIntArray239[--anInt3735];
											if (Static53.aString8 != null && local13 < Static413.anInt6975) {
												anIntArray239[anInt3735++] = Static169.aClass54Array131[local13].aByte13;
												return;
											}
											anIntArray239[anInt3735++] = 0;
											return;
										}
										if (arg0 == 3616) {
											anIntArray239[anInt3735++] = Static204.aByte64;
											return;
										}
										if (arg0 == 3617) {
											local3888 = aStringArray22[--anInt3736];
											Static415.method5694(local3888);
											return;
										}
										if (arg0 == 3618) {
											anIntArray239[anInt3735++] = Static429.aByte99;
											return;
										}
										if (arg0 == 3619) {
											local3888 = aStringArray22[--anInt3736];
											Static324.method4493(local3888);
											return;
										}
										if (arg0 == 3620) {
											Static257.method3590();
											return;
										}
										if (arg0 == 3621) {
											if (Static284.anInt5007 == 0) {
												anIntArray239[anInt3735++] = -1;
												return;
											}
											anIntArray239[anInt3735++] = Static79.anInt1430;
											return;
										}
										if (arg0 == 3622) {
											local13 = anIntArray239[--anInt3735];
											if (Static284.anInt5007 != 0 && local13 < Static79.anInt1430) {
												aStringArray22[anInt3736++] = Static47.aStringArray7[local13];
												if (Static334.aStringArray34[local13] != null) {
													aStringArray22[anInt3736++] = Static334.aStringArray34[local13];
													return;
												}
												aStringArray22[anInt3736++] = "";
												return;
											}
											aStringArray22[anInt3736++] = "";
											aStringArray22[anInt3736++] = "";
											return;
										}
										if (arg0 == 3623) {
											local3888 = aStringArray22[--anInt3736];
											if (local3888.startsWith("<img=0>") || local3888.startsWith("<img=1>")) {
												local3888 = local3888.substring(7);
											}
											anIntArray239[anInt3735++] = Static350.method4880(local3888) ? 1 : 0;
											return;
										}
										if (arg0 == 3624) {
											local13 = anIntArray239[--anInt3735];
											if (Static169.aClass54Array131 != null && local13 < Static413.anInt6975 && Static169.aClass54Array131[local13].aString26.equalsIgnoreCase(Static203.aClass1_Sub2_Sub6_Sub2_1.aString69)) {
												anIntArray239[anInt3735++] = 1;
												return;
											}
											anIntArray239[anInt3735++] = 0;
											return;
										}
										if (arg0 == 3625) {
											if (Static207.aString45 != null) {
												aStringArray22[anInt3736++] = Static207.aString45;
												return;
											}
											aStringArray22[anInt3736++] = "";
											return;
										}
										if (arg0 == 3626) {
											local13 = anIntArray239[--anInt3735];
											if (Static53.aString8 != null && local13 < Static413.anInt6975) {
												aStringArray22[anInt3736++] = Static169.aClass54Array131[local13].aString25;
												return;
											}
											aStringArray22[anInt3736++] = "";
											return;
										}
										if (arg0 == 3627) {
											local13 = anIntArray239[--anInt3735];
											if (Static284.anInt5007 == 2 && local13 >= 0 && local13 < Static12.anInt180) {
												anIntArray239[anInt3735++] = Static122.aBooleanArray8[local13] ? 1 : 0;
												return;
											}
											anIntArray239[anInt3735++] = 0;
											return;
										}
										if (arg0 == 3628) {
											local3888 = aStringArray22[--anInt3736];
											if (local3888.startsWith("<img=0>") || local3888.startsWith("<img=1>")) {
												local3888 = local3888.substring(7);
											}
											anIntArray239[anInt3735++] = Static43.method4697(local3888);
											return;
										}
										if (arg0 == 3629) {
											anIntArray239[anInt3735++] = Static203.anInt3616;
											return;
										}
										if (arg0 == 3630) {
											local3888 = aStringArray22[--anInt3736];
											Static307.method4640(true, local3888);
											return;
										}
										if (arg0 == 3631) {
											local13 = anIntArray239[--anInt3735];
											anIntArray239[anInt3735++] = Static173.aBooleanArray16[local13] ? 1 : 0;
											return;
										}
										if (arg0 == 3632) {
											local13 = anIntArray239[--anInt3735];
											if (Static53.aString8 != null && local13 < Static413.anInt6975) {
												aStringArray22[anInt3736++] = Static169.aClass54Array131[local13].aString26;
												return;
											}
											aStringArray22[anInt3736++] = "";
											return;
										}
										if (arg0 == 3633) {
											local13 = anIntArray239[--anInt3735];
											if (Static284.anInt5007 != 0 && local13 < Static79.anInt1430) {
												aStringArray22[anInt3736++] = Static331.aStringArray45[local13];
												return;
											}
											aStringArray22[anInt3736++] = "";
											return;
										}
									} else if (arg0 < 4000) {
										if (arg0 == 3903) {
											local13 = anIntArray239[--anInt3735];
											anIntArray239[anInt3735++] = Static295.aClass161Array1[local13].method3787();
											return;
										}
										if (arg0 == 3904) {
											local13 = anIntArray239[--anInt3735];
											anIntArray239[anInt3735++] = Static295.aClass161Array1[local13].anInt4562;
											return;
										}
										if (arg0 == 3905) {
											local13 = anIntArray239[--anInt3735];
											anIntArray239[anInt3735++] = Static295.aClass161Array1[local13].anInt4558;
											return;
										}
										if (arg0 == 3906) {
											local13 = anIntArray239[--anInt3735];
											anIntArray239[anInt3735++] = Static295.aClass161Array1[local13].anInt4557;
											return;
										}
										if (arg0 == 3907) {
											local13 = anIntArray239[--anInt3735];
											anIntArray239[anInt3735++] = Static295.aClass161Array1[local13].anInt4563;
											return;
										}
										if (arg0 == 3908) {
											local13 = anIntArray239[--anInt3735];
											anIntArray239[anInt3735++] = Static295.aClass161Array1[local13].anInt4560;
											return;
										}
										if (arg0 == 3910) {
											local13 = anIntArray239[--anInt3735];
											local19 = Static295.aClass161Array1[local13].method3789();
											anIntArray239[anInt3735++] = local19 == 0 ? 1 : 0;
											return;
										}
										if (arg0 == 3911) {
											local13 = anIntArray239[--anInt3735];
											local19 = Static295.aClass161Array1[local13].method3789();
											anIntArray239[anInt3735++] = local19 == 2 ? 1 : 0;
											return;
										}
										if (arg0 == 3912) {
											local13 = anIntArray239[--anInt3735];
											local19 = Static295.aClass161Array1[local13].method3789();
											anIntArray239[anInt3735++] = local19 == 5 ? 1 : 0;
											return;
										}
										if (arg0 == 3913) {
											local13 = anIntArray239[--anInt3735];
											local19 = Static295.aClass161Array1[local13].method3789();
											anIntArray239[anInt3735++] = local19 == 1 ? 1 : 0;
											return;
										}
									} else if (arg0 < 4100) {
										if (arg0 == 4000) {
											anInt3735 -= 2;
											local13 = anIntArray239[anInt3735];
											local19 = anIntArray239[anInt3735 + 1];
											anIntArray239[anInt3735++] = local13 + local19;
											return;
										}
										if (arg0 == 4001) {
											anInt3735 -= 2;
											local13 = anIntArray239[anInt3735];
											local19 = anIntArray239[anInt3735 + 1];
											anIntArray239[anInt3735++] = local13 - local19;
											return;
										}
										if (arg0 == 4002) {
											anInt3735 -= 2;
											local13 = anIntArray239[anInt3735];
											local19 = anIntArray239[anInt3735 + 1];
											anIntArray239[anInt3735++] = local13 * local19;
											return;
										}
										if (arg0 == 4003) {
											anInt3735 -= 2;
											local13 = anIntArray239[anInt3735];
											local19 = anIntArray239[anInt3735 + 1];
											anIntArray239[anInt3735++] = local13 / local19;
											return;
										}
										if (arg0 == 4004) {
											local13 = anIntArray239[--anInt3735];
											anIntArray239[anInt3735++] = (int) (Math.random() * (double) local13);
											return;
										}
										if (arg0 == 4005) {
											local13 = anIntArray239[--anInt3735];
											anIntArray239[anInt3735++] = (int) (Math.random() * (double) (local13 + 1));
											return;
										}
										if (arg0 == 4006) {
											anInt3735 -= 5;
											local13 = anIntArray239[anInt3735];
											local19 = anIntArray239[anInt3735 + 1];
											local25 = anIntArray239[anInt3735 + 2];
											local353 = anIntArray239[anInt3735 + 3];
											local2290 = anIntArray239[anInt3735 + 4];
											anIntArray239[anInt3735++] = local13 + (local19 - local13) * (local2290 - local25) / (local353 - local25);
											return;
										}
										@Pc(6991) long local6991;
										@Pc(6984) long local6984;
										if (arg0 == 4007) {
											anInt3735 -= 2;
											local6984 = anIntArray239[anInt3735];
											local6991 = anIntArray239[anInt3735 + 1];
											anIntArray239[anInt3735++] = (int) (local6984 + local6984 * local6991 / 100L);
											return;
										}
										if (arg0 == 4008) {
											anInt3735 -= 2;
											local13 = anIntArray239[anInt3735];
											local19 = anIntArray239[anInt3735 + 1];
											anIntArray239[anInt3735++] = local13 | 0x1 << local19;
											return;
										}
										if (arg0 == 4009) {
											anInt3735 -= 2;
											local13 = anIntArray239[anInt3735];
											local19 = anIntArray239[anInt3735 + 1];
											anIntArray239[anInt3735++] = local13 & -(0x1 << local19) - 1;
											return;
										}
										if (arg0 == 4010) {
											anInt3735 -= 2;
											local13 = anIntArray239[anInt3735];
											local19 = anIntArray239[anInt3735 + 1];
											anIntArray239[anInt3735++] = (local13 & 0x1 << local19) == 0 ? 0 : 1;
											return;
										}
										if (arg0 == 4011) {
											anInt3735 -= 2;
											local13 = anIntArray239[anInt3735];
											local19 = anIntArray239[anInt3735 + 1];
											anIntArray239[anInt3735++] = local13 % local19;
											return;
										}
										if (arg0 == 4012) {
											anInt3735 -= 2;
											local13 = anIntArray239[anInt3735];
											local19 = anIntArray239[anInt3735 + 1];
											if (local13 == 0) {
												anIntArray239[anInt3735++] = 0;
												return;
											}
											anIntArray239[anInt3735++] = (int) Math.pow((double) local13, (double) local19);
											return;
										}
										if (arg0 == 4013) {
											anInt3735 -= 2;
											local13 = anIntArray239[anInt3735];
											local19 = anIntArray239[anInt3735 + 1];
											if (local13 == 0) {
												anIntArray239[anInt3735++] = 0;
												return;
											}
											if (local19 == 0) {
												anIntArray239[anInt3735++] = Integer.MAX_VALUE;
												return;
											}
											anIntArray239[anInt3735++] = (int) Math.pow((double) local13, 1.0D / (double) local19);
											return;
										}
										if (arg0 == 4014) {
											anInt3735 -= 2;
											local13 = anIntArray239[anInt3735];
											local19 = anIntArray239[anInt3735 + 1];
											anIntArray239[anInt3735++] = local13 & local19;
											return;
										}
										if (arg0 == 4015) {
											anInt3735 -= 2;
											local13 = anIntArray239[anInt3735];
											local19 = anIntArray239[anInt3735 + 1];
											anIntArray239[anInt3735++] = local13 | local19;
											return;
										}
										if (arg0 == 4016) {
											anInt3735 -= 2;
											local13 = anIntArray239[anInt3735];
											local19 = anIntArray239[anInt3735 + 1];
											anIntArray239[anInt3735++] = local13 < local19 ? local13 : local19;
											return;
										}
										if (arg0 == 4017) {
											anInt3735 -= 2;
											local13 = anIntArray239[anInt3735];
											local19 = anIntArray239[anInt3735 + 1];
											anIntArray239[anInt3735++] = local13 > local19 ? local13 : local19;
											return;
										}
										if (arg0 == 4018) {
											anInt3735 -= 3;
											local6984 = anIntArray239[anInt3735];
											local6991 = anIntArray239[anInt3735 + 1];
											@Pc(7372) long local7372 = (long) anIntArray239[anInt3735 + 2];
											anIntArray239[anInt3735++] = (int) (local6984 * local7372 / local6991);
											return;
										}
									} else if (arg0 < 4200) {
										if (arg0 == 4100) {
											local3888 = aStringArray22[--anInt3736];
											local19 = anIntArray239[--anInt3735];
											aStringArray22[anInt3736++] = local3888 + local19;
											return;
										}
										if (arg0 == 4101) {
											anInt3736 -= 2;
											local3888 = aStringArray22[anInt3736];
											local1101 = aStringArray22[anInt3736 + 1];
											aStringArray22[anInt3736++] = local3888 + local1101;
											return;
										}
										if (arg0 == 4102) {
											local3888 = aStringArray22[--anInt3736];
											local19 = anIntArray239[--anInt3735];
											aStringArray22[anInt3736++] = local3888 + Static461.method6266(local19);
											return;
										}
										if (arg0 == 4103) {
											local3888 = aStringArray22[--anInt3736];
											aStringArray22[anInt3736++] = local3888.toLowerCase();
											return;
										}
										if (arg0 == 4104) {
											aStringArray22[anInt3736++] = method3211(anIntArray239[--anInt3735]);
											return;
										}
										if (arg0 == 4105) {
											anInt3736 -= 2;
											local3888 = aStringArray22[anInt3736];
											local1101 = aStringArray22[anInt3736 + 1];
											if (Static203.aClass1_Sub2_Sub6_Sub2_1.aClass198_1 != null && Static203.aClass1_Sub2_Sub6_Sub2_1.aClass198_1.aBoolean403) {
												aStringArray22[anInt3736++] = local1101;
												return;
											}
											aStringArray22[anInt3736++] = local3888;
											return;
										}
										if (arg0 == 4106) {
											local13 = anIntArray239[--anInt3735];
											aStringArray22[anInt3736++] = Integer.toString(local13);
											return;
										}
										if (arg0 == 4107) {
											anInt3736 -= 2;
											anIntArray239[anInt3735++] = Static176.method2834(aStringArray22[anInt3736], aStringArray22[anInt3736 + 1], Static300.anInt5192);
											return;
										}
										@Pc(7655) Class124 local7655;
										if (arg0 == 4108) {
											local3888 = aStringArray22[--anInt3736];
											anInt3735 -= 2;
											local19 = anIntArray239[anInt3735];
											local25 = anIntArray239[anInt3735 + 1];
											local7655 = Static398.method5469(Static351.aClass250_88, local25);
											anIntArray239[anInt3735++] = local7655.method3098(local19, Static353.aClass2Array19, local3888);
											return;
										}
										if (arg0 == 4109) {
											local3888 = aStringArray22[--anInt3736];
											anInt3735 -= 2;
											local19 = anIntArray239[anInt3735];
											local25 = anIntArray239[anInt3735 + 1];
											local7655 = Static398.method5469(Static351.aClass250_88, local25);
											anIntArray239[anInt3735++] = local7655.method3097(Static353.aClass2Array19, local3888, local19);
											return;
										}
										if (arg0 == 4110) {
											anInt3736 -= 2;
											local3888 = aStringArray22[anInt3736];
											local1101 = aStringArray22[anInt3736 + 1];
											if (anIntArray239[--anInt3735] == 1) {
												aStringArray22[anInt3736++] = local3888;
												return;
											}
											aStringArray22[anInt3736++] = local1101;
											return;
										}
										if (arg0 == 4111) {
											local3888 = aStringArray22[--anInt3736];
											aStringArray22[anInt3736++] = Static227.method3265(local3888);
											return;
										}
										if (arg0 == 4112) {
											local3888 = aStringArray22[--anInt3736];
											local19 = anIntArray239[--anInt3735];
											if (local19 == -1) {
												throw new RuntimeException("null char");
											}
											aStringArray22[anInt3736++] = local3888 + (char) local19;
											return;
										}
										if (arg0 == 4113) {
											local13 = anIntArray239[--anInt3735];
											anIntArray239[anInt3735++] = Static390.method5419((char) local13) ? 1 : 0;
											return;
										}
										if (arg0 == 4114) {
											local13 = anIntArray239[--anInt3735];
											anIntArray239[anInt3735++] = Static375.method5236((char) local13) ? 1 : 0;
											return;
										}
										if (arg0 == 4115) {
											local13 = anIntArray239[--anInt3735];
											anIntArray239[anInt3735++] = Static266.method3699((char) local13) ? 1 : 0;
											return;
										}
										if (arg0 == 4116) {
											local13 = anIntArray239[--anInt3735];
											anIntArray239[anInt3735++] = Static402.method5512((char) local13) ? 1 : 0;
											return;
										}
										if (arg0 == 4117) {
											local3888 = aStringArray22[--anInt3736];
											if (local3888 != null) {
												anIntArray239[anInt3735++] = local3888.length();
												return;
											}
											anIntArray239[anInt3735++] = 0;
											return;
										}
										if (arg0 == 4118) {
											local3888 = aStringArray22[--anInt3736];
											anInt3735 -= 2;
											local19 = anIntArray239[anInt3735];
											local25 = anIntArray239[anInt3735 + 1];
											aStringArray22[anInt3736++] = local3888.substring(local19, local25);
											return;
										}
										if (arg0 == 4119) {
											local3888 = aStringArray22[--anInt3736];
											@Pc(8018) StringBuffer local8018 = new StringBuffer(local3888.length());
											@Pc(8020) boolean local8020 = false;
											for (local353 = 0; local353 < local3888.length(); local353++) {
												@Pc(8027) char local8027 = local3888.charAt(local353);
												if (local8027 == '<') {
													local8020 = true;
												} else if (local8027 == '>') {
													local8020 = false;
												} else if (!local8020) {
													local8018.append(local8027);
												}
											}
											aStringArray22[anInt3736++] = local8018.toString();
											return;
										}
										if (arg0 == 4120) {
											local3888 = aStringArray22[--anInt3736];
											anInt3735 -= 2;
											local19 = anIntArray239[anInt3735];
											local25 = anIntArray239[anInt3735 + 1];
											anIntArray239[anInt3735++] = local3888.indexOf(local19, local25);
											return;
										}
										if (arg0 == 4121) {
											anInt3736 -= 2;
											local3888 = aStringArray22[anInt3736];
											local1101 = aStringArray22[anInt3736 + 1];
											local25 = anIntArray239[--anInt3735];
											anIntArray239[anInt3735++] = local3888.indexOf(local1101, local25);
											return;
										}
										if (arg0 == 4122) {
											local13 = anIntArray239[--anInt3735];
											anIntArray239[anInt3735++] = Character.toLowerCase((char) local13);
											return;
										}
										if (arg0 == 4123) {
											local13 = anIntArray239[--anInt3735];
											anIntArray239[anInt3735++] = Character.toUpperCase((char) local13);
											return;
										}
										if (arg0 == 4124) {
											local412 = anIntArray239[--anInt3735] != 0;
											local19 = anIntArray239[--anInt3735];
											aStringArray22[anInt3736++] = Static230.method3353(0, (long) local19, Static300.anInt5192, local412);
											return;
										}
										if (arg0 == 4125) {
											local3888 = aStringArray22[--anInt3736];
											local19 = anIntArray239[--anInt3735];
											@Pc(8241) Class124 local8241 = Static398.method5469(Static351.aClass250_88, local19);
											anIntArray239[anInt3735++] = local8241.method3095(Static353.aClass2Array19, local3888);
											return;
										}
									} else if (arg0 < 4300) {
										if (arg0 == 4200) {
											local13 = anIntArray239[--anInt3735];
											aStringArray22[anInt3736++] = Static158.aClass272_1.method6283(local13).lb;
											return;
										}
										@Pc(8303) Class209 local8303;
										if (arg0 == 4201) {
											anInt3735 -= 2;
											local13 = anIntArray239[anInt3735];
											local19 = anIntArray239[anInt3735 + 1];
											local8303 = Static158.aClass272_1.method6283(local13);
											if (local19 >= 1 && local19 <= 5 && local8303.aStringArray36[local19 - 1] != null) {
												aStringArray22[anInt3736++] = local8303.aStringArray36[local19 - 1];
												return;
											}
											aStringArray22[anInt3736++] = "";
											return;
										}
										if (arg0 == 4202) {
											anInt3735 -= 2;
											local13 = anIntArray239[anInt3735];
											local19 = anIntArray239[anInt3735 + 1];
											local8303 = Static158.aClass272_1.method6283(local13);
											if (local19 >= 1 && local19 <= 5 && local8303.aStringArray37[local19 - 1] != null) {
												aStringArray22[anInt3736++] = local8303.aStringArray37[local19 - 1];
												return;
											}
											aStringArray22[anInt3736++] = "";
											return;
										}
										if (arg0 == 4203) {
											local13 = anIntArray239[--anInt3735];
											anIntArray239[anInt3735++] = Static158.aClass272_1.method6283(local13).anInt6038;
											return;
										}
										if (arg0 == 4204) {
											local13 = anIntArray239[--anInt3735];
											anIntArray239[anInt3735++] = Static158.aClass272_1.method6283(local13).anInt6020 == 1 ? 1 : 0;
											return;
										}
										@Pc(8466) Class209 local8466;
										if (arg0 == 4205) {
											local13 = anIntArray239[--anInt3735];
											local8466 = Static158.aClass272_1.method6283(local13);
											if (local8466.anInt6066 == -1 && local8466.anInt6034 >= 0) {
												anIntArray239[anInt3735++] = local8466.anInt6034;
												return;
											}
											anIntArray239[anInt3735++] = local13;
											return;
										}
										if (arg0 == 4206) {
											local13 = anIntArray239[--anInt3735];
											local8466 = Static158.aClass272_1.method6283(local13);
											if (local8466.anInt6066 >= 0 && local8466.anInt6034 >= 0) {
												anIntArray239[anInt3735++] = local8466.anInt6034;
												return;
											}
											anIntArray239[anInt3735++] = local13;
											return;
										}
										if (arg0 == 4207) {
											local13 = anIntArray239[--anInt3735];
											anIntArray239[anInt3735++] = Static158.aClass272_1.method6283(local13).aBoolean419 ? 1 : 0;
											return;
										}
										if (arg0 == 4208) {
											anInt3735 -= 2;
											local13 = anIntArray239[anInt3735];
											local19 = anIntArray239[anInt3735 + 1];
											local3017 = Static70.aClass15_1.method323(local19);
											if (local3017.method879()) {
												aStringArray22[anInt3736++] = Static158.aClass272_1.method6283(local13).method4980(local19, local3017.aString5);
												return;
											}
											anIntArray239[anInt3735++] = Static158.aClass272_1.method6283(local13).method4987(local19, local3017.anInt813);
											return;
										}
										if (arg0 == 4209) {
											anInt3735 -= 2;
											local13 = anIntArray239[anInt3735];
											local19 = anIntArray239[anInt3735 + 1] - 1;
											local8303 = Static158.aClass272_1.method6283(local13);
											if (local8303.anInt6055 == local19) {
												anIntArray239[anInt3735++] = local8303.anInt6022;
												return;
											}
											if (local8303.anInt6033 == local19) {
												anIntArray239[anInt3735++] = local8303.anInt6051;
												return;
											}
											anIntArray239[anInt3735++] = -1;
											return;
										}
										if (arg0 == 4210) {
											local3888 = aStringArray22[--anInt3736];
											local19 = anIntArray239[--anInt3735];
											Static270.method3759(local3888, local19 == 1);
											anIntArray239[anInt3735++] = Static48.anInt871;
											return;
										}
										if (arg0 == 4211) {
											if (Static11.aShortArray2 != null && Static336.anInt5622 < Static48.anInt871) {
												anIntArray239[anInt3735++] = Static11.aShortArray2[Static336.anInt5622++] & 0xFFFF;
												return;
											}
											anIntArray239[anInt3735++] = -1;
											return;
										}
										if (arg0 == 4212) {
											Static336.anInt5622 = 0;
											return;
										}
									} else if (arg0 < 4400) {
										if (arg0 == 4300) {
											anInt3735 -= 2;
											local13 = anIntArray239[anInt3735];
											local19 = anIntArray239[anInt3735 + 1];
											local3017 = Static70.aClass15_1.method323(local19);
											if (local3017.method879()) {
												aStringArray22[anInt3736++] = Static118.aClass19_1.method401(local13).method3707(local3017.aString5, local19);
												return;
											}
											anIntArray239[anInt3735++] = Static118.aClass19_1.method401(local13).method3703(local3017.anInt813, local19);
											return;
										}
									} else if (arg0 < 4500) {
										if (arg0 == 4400) {
											anInt3735 -= 2;
											local13 = anIntArray239[anInt3735];
											local19 = anIntArray239[anInt3735 + 1];
											local3017 = Static70.aClass15_1.method323(local19);
											if (local3017.method879()) {
												aStringArray22[anInt3736++] = Static9.aClass149_1.method3573(local13).method862(local3017.aString5, local19);
												return;
											}
											anIntArray239[anInt3735++] = Static9.aClass149_1.method3573(local13).method868(local19, local3017.anInt813);
											return;
										}
									} else if (arg0 < 4600) {
										if (arg0 == 4500) {
											anInt3735 -= 2;
											local13 = anIntArray239[anInt3735];
											local19 = anIntArray239[anInt3735 + 1];
											local3017 = Static70.aClass15_1.method323(local19);
											if (local3017.method879()) {
												aStringArray22[anInt3736++] = Static227.aClass260_1.method5945(local13).method1403(local3017.aString5, local19);
												return;
											}
											anIntArray239[anInt3735++] = Static227.aClass260_1.method5945(local13).method1399(local3017.anInt813, local19);
											return;
										}
									} else if (arg0 < 4700 && arg0 == 4600) {
										local13 = anIntArray239[--anInt3735];
										@Pc(8967) Class142 local8967 = Static212.aClass238_1.method5438(local13);
										if (local8967.anIntArray278 != null && local8967.anIntArray278.length > 0) {
											local25 = 0;
											local353 = local8967.anIntArray277[0];
											for (local2290 = 1; local2290 < local8967.anIntArray278.length; local2290++) {
												if (local8967.anIntArray277[local2290] > local353) {
													local25 = local2290;
													local353 = local8967.anIntArray277[local2290];
												}
											}
											anIntArray239[anInt3735++] = local8967.anIntArray278[local25];
											return;
										}
										anIntArray239[anInt3735++] = local8967.anInt4174;
										return;
									}
								}
							}
						}
					} else {
						if (arg0 >= 2000) {
							arg0 -= 1000;
							local137 = Static180.method2857(anIntArray239[--anInt3735]);
						} else {
							local137 = arg1 ? aClass82_12 : aClass82_13;
						}
						if (arg0 == 1300) {
							local19 = anIntArray239[--anInt3735] - 1;
							if (local19 >= 0 && local19 <= 9) {
								local137.method1963(local19, aStringArray22[--anInt3736]);
								return;
							}
							anInt3736--;
							return;
						}
						if (arg0 == 1301) {
							anInt3735 -= 2;
							local19 = anIntArray239[anInt3735];
							local25 = anIntArray239[anInt3735 + 1];
							if (local19 == -1 && local25 == -1) {
								local137.aClass82_7 = null;
								return;
							}
							local137.aClass82_7 = Static360.method5048(local25, local19);
							return;
						}
						if (arg0 == 1302) {
							local19 = anIntArray239[--anInt3735];
							if (local19 != Static284.anInt5011 && local19 != Static12.anInt181 && local19 != Static258.anInt4311) {
								return;
							}
							local137.anInt2194 = local19;
							return;
						}
						if (arg0 == 1303) {
							local137.anInt2195 = anIntArray239[--anInt3735];
							return;
						}
						if (arg0 == 1304) {
							local137.anInt2241 = anIntArray239[--anInt3735];
							return;
						}
						if (arg0 == 1305) {
							local137.aString34 = aStringArray22[--anInt3736];
							return;
						}
						if (arg0 == 1306) {
							local137.aString33 = aStringArray22[--anInt3736];
							return;
						}
						if (arg0 == 1307) {
							local137.aStringArray13 = null;
							return;
						}
						if (arg0 == 1308) {
							local137.anInt2196 = anIntArray239[--anInt3735];
							local137.anInt2217 = anIntArray239[--anInt3735];
							return;
						}
						if (arg0 == 1309) {
							local19 = anIntArray239[--anInt3735];
							local25 = anIntArray239[--anInt3735];
							if (local25 >= 1 && local25 <= 10) {
								local137.method1975(local25 - 1, local19);
							}
							return;
						}
						if (arg0 == 1310) {
							local137.aString30 = aStringArray22[--anInt3736];
							return;
						}
						if (arg0 == 1311) {
							local137.anInt2268 = anIntArray239[--anInt3735];
							return;
						}
						if (arg0 == 1312 || arg0 == 1313) {
							if (arg0 == 1312) {
								anInt3735 -= 3;
								local19 = anIntArray239[anInt3735] - 1;
								local25 = anIntArray239[anInt3735 + 1];
								local353 = anIntArray239[anInt3735 + 2];
								if (local19 < 0 || local19 > 9) {
									throw new RuntimeException("IOR13121313");
								}
							} else {
								anInt3735 -= 2;
								local19 = 10;
								local25 = anIntArray239[anInt3735];
								local353 = anIntArray239[anInt3735 + 1];
							}
							if (local137.aByteArray41 == null) {
								if (local25 == 0) {
									return;
								}
								local137.aByteArray41 = new byte[11];
								local137.aByteArray40 = new byte[11];
								local137.anIntArray104 = new int[11];
							}
							local137.aByteArray41[local19] = (byte) local25;
							if (local25 == 0) {
								local137.aBoolean178 = false;
								for (local2290 = 0; local2290 < local137.aByteArray41.length; local2290++) {
									if (local137.aByteArray41[local2290] != 0) {
										local137.aBoolean178 = true;
										break;
									}
								}
							} else {
								local137.aBoolean178 = true;
							}
							local137.aByteArray40[local19] = (byte) local353;
							return;
						}
						if (arg0 == 1314) {
							local137.anInt2243 = anIntArray239[--anInt3735];
							return;
						}
					}
				} else {
					if (arg0 >= 2000) {
						arg0 -= 1000;
						local137 = Static180.method2857(anIntArray239[--anInt3735]);
					} else {
						local137 = arg1 ? aClass82_12 : aClass82_13;
					}
					Static463.method6297(local137);
					if (arg0 == 1200 || arg0 == 1205 || arg0 == 1208 || arg0 == 1209 || arg0 == 1212 || arg0 == 1213) {
						anInt3735 -= 2;
						local19 = anIntArray239[anInt3735];
						local25 = anIntArray239[anInt3735 + 1];
						if (local137.anInt2209 == -1) {
							Static66.method1245(local137.anInt2208);
							Static37.method610(local137.anInt2208);
							Static409.method5640(local137.anInt2208);
						}
						if (local19 == -1) {
							local137.anInt2233 = 1;
							local137.anInt2238 = -1;
							local137.anInt2200 = -1;
							return;
						}
						local137.anInt2200 = local19;
						local137.anInt2215 = local25;
						if (arg0 == 1208 || arg0 == 1209) {
							local137.aBoolean172 = true;
						} else {
							local137.aBoolean172 = false;
						}
						@Pc(1630) Class209 local1630 = Static158.aClass272_1.method6283(local19);
						local137.anInt2232 = local1630.anInt6057;
						local137.anInt2197 = local1630.anInt6041;
						local137.anInt2193 = local1630.anInt6036;
						local137.anInt2256 = local1630.anInt6027;
						local137.anInt2230 = local1630.anInt6044;
						local137.anInt2244 = local1630.anInt6037;
						if (arg0 == 1205 || arg0 == 1209) {
							local137.anInt2251 = 0;
						} else if (arg0 == 1212 || arg0 == 1213) {
							local137.anInt2251 = 1;
						} else {
							local137.anInt2251 = 2;
						}
						if (local137.anInt2254 > 0) {
							local137.anInt2244 = local137.anInt2244 * 32 / local137.anInt2254;
							return;
						}
						if (local137.anInt2272 > 0) {
							local137.anInt2244 = local137.anInt2244 * 32 / local137.anInt2272;
						}
						return;
					}
					if (arg0 == 1201) {
						local137.anInt2233 = 2;
						local137.anInt2238 = anIntArray239[--anInt3735];
						if (local137.anInt2209 == -1) {
							Static126.method1990(local137.anInt2208);
						}
						return;
					}
					if (arg0 == 1202) {
						local137.anInt2233 = 3;
						local137.anInt2238 = -1;
						if (local137.anInt2209 == -1) {
							Static126.method1990(local137.anInt2208);
						}
						return;
					}
					if (arg0 == 1203) {
						local137.anInt2233 = 6;
						local137.anInt2238 = anIntArray239[--anInt3735];
						if (local137.anInt2209 == -1) {
							Static126.method1990(local137.anInt2208);
						}
						return;
					}
					if (arg0 == 1204) {
						local137.anInt2233 = 5;
						local137.anInt2238 = anIntArray239[--anInt3735];
						if (local137.anInt2209 == -1) {
							Static126.method1990(local137.anInt2208);
						}
						return;
					}
					if (arg0 == 1206) {
						anInt3735 -= 4;
						local137.anInt2258 = anIntArray239[anInt3735];
						local137.anInt2240 = anIntArray239[anInt3735 + 1];
						local137.anInt2213 = anIntArray239[anInt3735 + 2];
						local137.anInt2225 = anIntArray239[anInt3735 + 3];
						Static463.method6297(local137);
						return;
					}
					if (arg0 == 1207) {
						anInt3735 -= 2;
						local137.anInt2198 = anIntArray239[anInt3735];
						local137.anInt2239 = anIntArray239[anInt3735 + 1];
						Static463.method6297(local137);
						return;
					}
					if (arg0 == 1210) {
						anInt3735 -= 4;
						local137.anInt2238 = anIntArray239[anInt3735];
						local137.anInt2270 = anIntArray239[anInt3735 + 1];
						if (anIntArray239[anInt3735 + 2] == 1) {
							local137.anInt2233 = 9;
						} else {
							local137.anInt2233 = 8;
						}
						if (anIntArray239[anInt3735 + 3] == 1) {
							local137.aBoolean172 = true;
						} else {
							local137.aBoolean172 = false;
						}
						if (local137.anInt2209 == -1) {
							Static126.method1990(local137.anInt2208);
						}
						return;
					}
					if (arg0 == 1211) {
						local137.anInt2233 = 5;
						local137.anInt2238 = Static317.anInt5364;
						local137.anInt2270 = 0;
						if (local137.anInt2209 == -1) {
							Static126.method1990(local137.anInt2208);
						}
						return;
					}
				}
			} else {
				if (arg0 >= 2000) {
					arg0 -= 1000;
					local137 = Static180.method2857(anIntArray239[--anInt3735]);
				} else {
					local137 = arg1 ? aClass82_12 : aClass82_13;
				}
				if (arg0 == 1000) {
					anInt3735 -= 4;
					local137.anInt2264 = anIntArray239[anInt3735];
					local137.anInt2280 = anIntArray239[anInt3735 + 1];
					local19 = anIntArray239[anInt3735 + 2];
					if (local19 < 0) {
						local19 = 0;
					} else if (local19 > 5) {
						local19 = 5;
					}
					local25 = anIntArray239[anInt3735 + 3];
					if (local25 < 0) {
						local25 = 0;
					} else if (local25 > 5) {
						local25 = 5;
					}
					local137.aByte20 = (byte) local19;
					local137.aByte23 = (byte) local25;
					Static463.method6297(local137);
					Static114.method1848(local137);
					if (local137.anInt2209 == -1) {
						Static438.method2067(local137.anInt2208);
					}
					return;
				}
				if (arg0 == 1001) {
					anInt3735 -= 4;
					local137.anInt2272 = anIntArray239[anInt3735];
					local137.anInt2235 = anIntArray239[anInt3735 + 1];
					local137.anInt2254 = 0;
					local137.anInt2279 = 0;
					local19 = anIntArray239[anInt3735 + 2];
					if (local19 < 0) {
						local19 = 0;
					} else if (local19 > 4) {
						local19 = 4;
					}
					local25 = anIntArray239[anInt3735 + 3];
					if (local25 < 0) {
						local25 = 0;
					} else if (local25 > 4) {
						local25 = 4;
					}
					local137.aByte22 = (byte) local19;
					local137.aByte21 = (byte) local25;
					Static463.method6297(local137);
					Static114.method1848(local137);
					if (local137.anInt2252 == 0) {
						Static325.method4506(local137, false);
					}
					return;
				}
				if (arg0 == 1003) {
					@Pc(620) boolean local620 = anIntArray239[--anInt3735] == 1;
					if (local137.aBoolean169 != local620) {
						local137.aBoolean169 = local620;
						Static463.method6297(local137);
					}
					if (local137.anInt2209 == -1) {
						Static104.method1723(local137.anInt2208);
					}
					return;
				}
				if (arg0 == 1004) {
					anInt3735 -= 2;
					local137.anInt2250 = anIntArray239[anInt3735];
					local137.anInt2189 = anIntArray239[anInt3735 + 1];
					Static463.method6297(local137);
					Static114.method1848(local137);
					if (local137.anInt2252 == 0) {
						Static325.method4506(local137, false);
					}
					return;
				}
				if (arg0 == 1005) {
					local137.aBoolean168 = anIntArray239[--anInt3735] == 1;
					return;
				}
			}
		}
		throw new IllegalStateException(String.valueOf(arg0));
	}

	@OriginalMember(owner = "client!kp", name = "c", descriptor = "(IZ)V")
	private static void method3216(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(157) int local157;
		@Pc(1313) boolean local1313;
		@Pc(89) int local89;
		@Pc(75) String local75;
		@Pc(192) int local192;
		@Pc(95) int local95;
		@Pc(81) String local81;
		if (arg0 < 5100) {
			if (arg0 == 5000) {
				anIntArray239[anInt3735++] = Static118.anInt2076;
				return;
			}
			if (arg0 == 5001) {
				anInt3735 -= 3;
				Static118.anInt2076 = anIntArray239[anInt3735];
				Static120.aClass123_2 = Static222.method4445(anIntArray239[anInt3735 + 1]);
				if (Static120.aClass123_2 == null) {
					Static120.aClass123_2 = Static445.aClass123_5;
				}
				Static339.anInt5690 = anIntArray239[anInt3735 + 2];
				Static307.method4633(Static373.aClass163_160);
				Static243.aClass3_Sub25_Sub1_7.method4081(Static118.anInt2076);
				Static243.aClass3_Sub25_Sub1_7.method4081(Static120.aClass123_2.anInt3588);
				Static243.aClass3_Sub25_Sub1_7.method4081(Static339.anInt5690);
				return;
			}
			if (arg0 == 5002) {
				anInt3736 -= 2;
				local75 = aStringArray22[anInt3736];
				local81 = aStringArray22[anInt3736 + 1];
				anInt3735 -= 2;
				local89 = anIntArray239[anInt3735];
				local95 = anIntArray239[anInt3735 + 1];
				if (local81 == null) {
					local81 = "";
				}
				if (local81.length() > 80) {
					local81 = local81.substring(0, 80);
				}
				Static307.method4633(Static130.aClass163_63);
				Static243.aClass3_Sub25_Sub1_7.method4081(Static47.method891(local75) + Static47.method891(local81) + 2);
				Static243.aClass3_Sub25_Sub1_7.method4080(local75);
				Static243.aClass3_Sub25_Sub1_7.method4081(local89 - 1);
				Static243.aClass3_Sub25_Sub1_7.method4081(local95);
				Static243.aClass3_Sub25_Sub1_7.method4080(local81);
				return;
			}
			if (arg0 == 5003) {
				local157 = anIntArray239[--anInt3735];
				local81 = null;
				if (local157 < 100) {
					local81 = Static10.aStringArray1[local157];
				}
				if (local81 == null) {
					local81 = "";
				}
				aStringArray22[anInt3736++] = local81;
				return;
			}
			if (arg0 == 5004) {
				local157 = anIntArray239[--anInt3735];
				local192 = -1;
				if (local157 < 100 && Static10.aStringArray1[local157] != null) {
					local192 = Static140.anIntArray129[local157];
				}
				anIntArray239[anInt3735++] = local192;
				return;
			}
			if (arg0 == 5005) {
				if (Static120.aClass123_2 == null) {
					anIntArray239[anInt3735++] = -1;
					return;
				}
				anIntArray239[anInt3735++] = Static120.aClass123_2.anInt3588;
				return;
			}
			if (arg0 == 5008 || arg0 == 5021 || arg0 == 5022) {
				local75 = aStringArray22[--anInt3736];
				method3212(local75, arg0);
				return;
			}
			if (arg0 == 5009) {
				anInt3736 -= 2;
				local75 = aStringArray22[anInt3736];
				local81 = aStringArray22[anInt3736 + 1];
				if (Static300.anInt5196 != 0 || (!Static61.aBoolean81 || Static177.aBoolean251) && !Static401.aBoolean449) {
					Static307.method4633(Static410.aClass163_176);
					Static243.aClass3_Sub25_Sub1_7.method4081(0);
					local89 = Static243.aClass3_Sub25_Sub1_7.anInt4974;
					Static243.aClass3_Sub25_Sub1_7.method4080(local75);
					Static189.method2956(local81, Static243.aClass3_Sub25_Sub1_7);
					Static243.aClass3_Sub25_Sub1_7.method4091(Static243.aClass3_Sub25_Sub1_7.anInt4974 - local89);
					return;
				}
				return;
			}
			if (arg0 == 5010) {
				local157 = anIntArray239[--anInt3735];
				local81 = null;
				if (local157 < 100) {
					local81 = Static247.aStringArray42[local157];
				}
				if (local81 == null) {
					local81 = "";
				}
				aStringArray22[anInt3736++] = local81;
				return;
			}
			if (arg0 == 5011) {
				local157 = anIntArray239[--anInt3735];
				local81 = null;
				if (local157 < 100) {
					local81 = Static156.aStringArray15[local157];
				}
				if (local81 == null) {
					local81 = "";
				}
				aStringArray22[anInt3736++] = local81;
				return;
			}
			if (arg0 == 5012) {
				local157 = anIntArray239[--anInt3735];
				local192 = -1;
				if (local157 < 100) {
					local192 = Static61.anIntArray58[local157];
				}
				anIntArray239[anInt3735++] = local192;
				return;
			}
			if (arg0 == 5015) {
				if (Static203.aClass1_Sub2_Sub6_Sub2_1 == null || Static203.aClass1_Sub2_Sub6_Sub2_1.aString70 == null) {
					local75 = Static378.aString60;
				} else {
					local75 = Static203.aClass1_Sub2_Sub6_Sub2_1.method6213();
				}
				aStringArray22[anInt3736++] = local75;
				return;
			}
			if (arg0 == 5016) {
				anIntArray239[anInt3735++] = Static339.anInt5690;
				return;
			}
			if (arg0 == 5017) {
				anIntArray239[anInt3735++] = Static7.anInt1914;
				return;
			}
			if (arg0 == 5018) {
				local157 = anIntArray239[--anInt3735];
				local192 = 0;
				if (local157 < 100 && Static10.aStringArray1[local157] != null) {
					local192 = Static201.anIntArray226[local157];
				}
				anIntArray239[anInt3735++] = local192;
				return;
			}
			if (arg0 == 5019) {
				local157 = anIntArray239[--anInt3735];
				local81 = null;
				if (local157 < 100) {
					local81 = Static197.aStringArray20[local157];
				}
				if (local81 == null) {
					local81 = "";
				}
				aStringArray22[anInt3736++] = local81;
				return;
			}
			if (arg0 == 5020) {
				if (Static203.aClass1_Sub2_Sub6_Sub2_1 == null || Static203.aClass1_Sub2_Sub6_Sub2_1.aString70 == null) {
					local75 = Static378.aString60;
				} else {
					local75 = Static203.aClass1_Sub2_Sub6_Sub2_1.method6218();
				}
				aStringArray22[anInt3736++] = local75;
				return;
			}
			if (arg0 == 5050) {
				local157 = anIntArray239[--anInt3735];
				aStringArray22[anInt3736++] = Static202.aClass30_1.method641(local157).aString6;
				return;
			}
			@Pc(589) Class3_Sub3_Sub3 local589;
			if (arg0 == 5051) {
				local157 = anIntArray239[--anInt3735];
				local589 = Static202.aClass30_1.method641(local157);
				if (local589.anIntArray51 == null) {
					anIntArray239[anInt3735++] = 0;
					return;
				}
				anIntArray239[anInt3735++] = local589.anIntArray51.length;
				return;
			}
			if (arg0 == 5052) {
				anInt3735 -= 2;
				local157 = anIntArray239[anInt3735];
				local192 = anIntArray239[anInt3735 + 1];
				@Pc(634) Class3_Sub3_Sub3 local634 = Static202.aClass30_1.method641(local157);
				local95 = local634.anIntArray51[local192];
				anIntArray239[anInt3735++] = local95;
				return;
			}
			if (arg0 == 5053) {
				local157 = anIntArray239[--anInt3735];
				local589 = Static202.aClass30_1.method641(local157);
				if (local589.anIntArray52 == null) {
					anIntArray239[anInt3735++] = 0;
					return;
				}
				anIntArray239[anInt3735++] = local589.anIntArray52.length;
				return;
			}
			if (arg0 == 5054) {
				anInt3735 -= 2;
				local157 = anIntArray239[anInt3735];
				local192 = anIntArray239[anInt3735 + 1];
				anIntArray239[anInt3735++] = Static202.aClass30_1.method641(local157).anIntArray52[local192];
				return;
			}
			if (arg0 == 5055) {
				local157 = anIntArray239[--anInt3735];
				aStringArray22[anInt3736++] = Static141.aClass61_1.method1599(local157).method6105();
				return;
			}
			if (arg0 == 5056) {
				local157 = anIntArray239[--anInt3735];
				@Pc(760) Class3_Sub3_Sub18 local760 = Static141.aClass61_1.method1599(local157);
				if (local760.anIntArray501 == null) {
					anIntArray239[anInt3735++] = 0;
					return;
				}
				anIntArray239[anInt3735++] = local760.anIntArray501.length;
				return;
			}
			if (arg0 == 5057) {
				anInt3735 -= 2;
				local157 = anIntArray239[anInt3735];
				local192 = anIntArray239[anInt3735 + 1];
				anIntArray239[anInt3735++] = Static141.aClass61_1.method1599(local157).anIntArray501[local192];
				return;
			}
			if (arg0 == 5058) {
				aClass153_1 = new Class153();
				aClass153_1.anInt4352 = anIntArray239[--anInt3735];
				aClass153_1.aClass3_Sub3_Sub18_1 = Static141.aClass61_1.method1599(aClass153_1.anInt4352);
				aClass153_1.anIntArray286 = new int[aClass153_1.aClass3_Sub3_Sub18_1.method6113()];
				return;
			}
			if (arg0 == 5059) {
				Static307.method4633(Static195.aClass163_94);
				Static243.aClass3_Sub25_Sub1_7.method4081(0);
				local157 = Static243.aClass3_Sub25_Sub1_7.anInt4974;
				Static243.aClass3_Sub25_Sub1_7.method4081(0);
				Static243.aClass3_Sub25_Sub1_7.method4123(aClass153_1.anInt4352);
				aClass153_1.aClass3_Sub3_Sub18_1.method6108(aClass153_1.anIntArray286, Static243.aClass3_Sub25_Sub1_7);
				Static243.aClass3_Sub25_Sub1_7.method4091(Static243.aClass3_Sub25_Sub1_7.anInt4974 - local157);
				return;
			}
			if (arg0 == 5060) {
				local75 = aStringArray22[--anInt3736];
				Static307.method4633(Static324.aClass163_131);
				Static243.aClass3_Sub25_Sub1_7.method4081(0);
				local192 = Static243.aClass3_Sub25_Sub1_7.anInt4974;
				Static243.aClass3_Sub25_Sub1_7.method4080(local75);
				Static243.aClass3_Sub25_Sub1_7.method4123(aClass153_1.anInt4352);
				aClass153_1.aClass3_Sub3_Sub18_1.method6108(aClass153_1.anIntArray286, Static243.aClass3_Sub25_Sub1_7);
				Static243.aClass3_Sub25_Sub1_7.method4091(Static243.aClass3_Sub25_Sub1_7.anInt4974 - local192);
				return;
			}
			if (arg0 == 5061) {
				Static307.method4633(Static195.aClass163_94);
				Static243.aClass3_Sub25_Sub1_7.method4081(0);
				local157 = Static243.aClass3_Sub25_Sub1_7.anInt4974;
				Static243.aClass3_Sub25_Sub1_7.method4081(1);
				Static243.aClass3_Sub25_Sub1_7.method4123(aClass153_1.anInt4352);
				aClass153_1.aClass3_Sub3_Sub18_1.method6108(aClass153_1.anIntArray286, Static243.aClass3_Sub25_Sub1_7);
				Static243.aClass3_Sub25_Sub1_7.method4091(Static243.aClass3_Sub25_Sub1_7.anInt4974 - local157);
				return;
			}
			if (arg0 == 5062) {
				anInt3735 -= 2;
				local157 = anIntArray239[anInt3735];
				local192 = anIntArray239[anInt3735 + 1];
				anIntArray239[anInt3735++] = Static202.aClass30_1.method641(local157).aCharArray1[local192];
				return;
			}
			if (arg0 == 5063) {
				anInt3735 -= 2;
				local157 = anIntArray239[anInt3735];
				local192 = anIntArray239[anInt3735 + 1];
				anIntArray239[anInt3735++] = Static202.aClass30_1.method641(local157).aCharArray2[local192];
				return;
			}
			if (arg0 == 5064) {
				anInt3735 -= 2;
				local157 = anIntArray239[anInt3735];
				local192 = anIntArray239[anInt3735 + 1];
				if (local192 == -1) {
					anIntArray239[anInt3735++] = -1;
					return;
				}
				anIntArray239[anInt3735++] = Static202.aClass30_1.method641(local157).method982((char) local192);
				return;
			}
			if (arg0 == 5065) {
				anInt3735 -= 2;
				local157 = anIntArray239[anInt3735];
				local192 = anIntArray239[anInt3735 + 1];
				if (local192 == -1) {
					anIntArray239[anInt3735++] = -1;
					return;
				}
				anIntArray239[anInt3735++] = Static202.aClass30_1.method641(local157).method985((char) local192);
				return;
			}
			if (arg0 == 5066) {
				local157 = anIntArray239[--anInt3735];
				anIntArray239[anInt3735++] = Static141.aClass61_1.method1599(local157).method6113();
				return;
			}
			if (arg0 == 5067) {
				anInt3735 -= 2;
				local157 = anIntArray239[anInt3735];
				local192 = anIntArray239[anInt3735 + 1];
				local89 = Static141.aClass61_1.method1599(local157).method6110(local192).anInt1961;
				anIntArray239[anInt3735++] = local89;
				return;
			}
			if (arg0 == 5068) {
				anInt3735 -= 2;
				local157 = anIntArray239[anInt3735];
				local192 = anIntArray239[anInt3735 + 1];
				aClass153_1.anIntArray286[local157] = local192;
				return;
			}
			if (arg0 == 5069) {
				anInt3735 -= 2;
				local157 = anIntArray239[anInt3735];
				local192 = anIntArray239[anInt3735 + 1];
				aClass153_1.anIntArray286[local157] = local192;
				return;
			}
			if (arg0 == 5070) {
				anInt3735 -= 3;
				local157 = anIntArray239[anInt3735];
				local192 = anIntArray239[anInt3735 + 1];
				local89 = anIntArray239[anInt3735 + 2];
				@Pc(1265) Class3_Sub3_Sub18 local1265 = Static141.aClass61_1.method1599(local157);
				if (local1265.method6110(local192).anInt1961 != 0) {
					throw new RuntimeException("bad command");
				}
				anIntArray239[anInt3735++] = local1265.method6109(local89, local192);
				return;
			}
			if (arg0 == 5071) {
				local75 = aStringArray22[--anInt3736];
				local1313 = anIntArray239[--anInt3735] == 1;
				Static447.method6091(local1313, local75);
				anIntArray239[anInt3735++] = Static48.anInt871;
				return;
			}
			if (arg0 == 5072) {
				if (Static11.aShortArray2 != null && Static336.anInt5622 < Static48.anInt871) {
					anIntArray239[anInt3735++] = Static11.aShortArray2[Static336.anInt5622++] & 0xFFFF;
					return;
				}
				anIntArray239[anInt3735++] = -1;
				return;
			}
			if (arg0 == 5073) {
				Static336.anInt5622 = 0;
				return;
			}
			if (arg0 == 5074) {
				Static307.method4633(Static195.aClass163_94);
				Static243.aClass3_Sub25_Sub1_7.method4081(0);
				local157 = Static243.aClass3_Sub25_Sub1_7.anInt4974;
				Static243.aClass3_Sub25_Sub1_7.method4081(2);
				Static243.aClass3_Sub25_Sub1_7.method4123(aClass153_1.anInt4352);
				aClass153_1.aClass3_Sub3_Sub18_1.method6108(aClass153_1.anIntArray286, Static243.aClass3_Sub25_Sub1_7);
				Static243.aClass3_Sub25_Sub1_7.method4091(Static243.aClass3_Sub25_Sub1_7.anInt4974 - local157);
				return;
			}
		} else if (arg0 < 5200) {
			if (arg0 == 5100) {
				if (Static137.aClass143_1.method5471(86)) {
					anIntArray239[anInt3735++] = 1;
					return;
				}
				anIntArray239[anInt3735++] = 0;
				return;
			}
			if (arg0 == 5101) {
				if (Static137.aClass143_1.method5471(82)) {
					anIntArray239[anInt3735++] = 1;
					return;
				}
				anIntArray239[anInt3735++] = 0;
				return;
			}
			if (arg0 == 5102) {
				if (Static137.aClass143_1.method5471(81)) {
					anIntArray239[anInt3735++] = 1;
					return;
				}
				anIntArray239[anInt3735++] = 0;
				return;
			}
		} else {
			@Pc(2691) int local2691;
			@Pc(1965) boolean local1965;
			if (arg0 < 5300) {
				if (arg0 == 5200) {
					Static313.method4389(anIntArray239[--anInt3735]);
					return;
				}
				if (arg0 == 5201) {
					anIntArray239[anInt3735++] = Static189.method2957();
					return;
				}
				if (arg0 == 5205) {
					Static188.method2953(-1, false, anIntArray239[--anInt3735], -1);
					return;
				}
				@Pc(1554) Class3_Sub3_Sub13 local1554;
				if (arg0 == 5206) {
					local157 = anIntArray239[--anInt3735];
					local1554 = Static211.method301(local157 >> 14 & 0x3FFF, local157 & 0x3FFF);
					if (local1554 == null) {
						anIntArray239[anInt3735++] = -1;
						return;
					}
					anIntArray239[anInt3735++] = local1554.anInt3495;
					return;
				}
				@Pc(1587) Class3_Sub3_Sub13 local1587;
				if (arg0 == 5207) {
					local1587 = Static211.method310(anIntArray239[--anInt3735]);
					if (local1587 != null && local1587.aString43 != null) {
						aStringArray22[anInt3736++] = local1587.aString43;
						return;
					}
					aStringArray22[anInt3736++] = "";
					return;
				}
				if (arg0 == 5208) {
					anIntArray239[anInt3735++] = Static181.anInt5110;
					anIntArray239[anInt3735++] = Static414.anInt7475;
					return;
				}
				if (arg0 == 5209) {
					anIntArray239[anInt3735++] = Static34.anInt3343 + Static211.anInt278;
					anIntArray239[anInt3735++] = Static436.anInt7297 + Static211.anInt276;
					return;
				}
				if (arg0 == 5210) {
					local157 = anIntArray239[--anInt3735];
					local1554 = Static211.method310(local157);
					if (local1554 == null) {
						anIntArray239[anInt3735++] = 0;
						anIntArray239[anInt3735++] = 0;
						return;
					}
					anIntArray239[anInt3735++] = local1554.anInt3497 >> 14 & 0x3FFF;
					anIntArray239[anInt3735++] = local1554.anInt3497 & 0x3FFF;
					return;
				}
				if (arg0 == 5211) {
					local157 = anIntArray239[--anInt3735];
					local1554 = Static211.method310(local157);
					if (local1554 == null) {
						anIntArray239[anInt3735++] = 0;
						anIntArray239[anInt3735++] = 0;
						return;
					}
					anIntArray239[anInt3735++] = local1554.anInt3494 - local1554.anInt3500;
					anIntArray239[anInt3735++] = local1554.anInt3503 - local1554.anInt3496;
					return;
				}
				@Pc(1777) Class3_Sub16 local1777;
				if (arg0 == 5212) {
					local1777 = Static461.method6267();
					if (local1777 == null) {
						anIntArray239[anInt3735++] = -1;
						anIntArray239[anInt3735++] = -1;
						return;
					}
					anIntArray239[anInt3735++] = local1777.anInt1896;
					local192 = local1777.anInt1895 << 28 | local1777.anInt1893 + Static211.anInt278 << 14 | local1777.anInt1897 + Static211.anInt276;
					anIntArray239[anInt3735++] = local192;
					return;
				}
				if (arg0 == 5213) {
					local1777 = Static51.method967();
					if (local1777 == null) {
						anIntArray239[anInt3735++] = -1;
						anIntArray239[anInt3735++] = -1;
						return;
					}
					anIntArray239[anInt3735++] = local1777.anInt1896;
					local192 = local1777.anInt1895 << 28 | local1777.anInt1893 + Static211.anInt278 << 14 | local1777.anInt1897 + Static211.anInt276;
					anIntArray239[anInt3735++] = local192;
					return;
				}
				@Pc(1925) boolean local1925;
				if (arg0 == 5214) {
					local157 = anIntArray239[--anInt3735];
					local1554 = Static24.method2484();
					if (local1554 != null) {
						local1925 = local1554.method3004(anIntArray242, local157 >> 28 & 0x3, local157 & 0x3FFF, local157 >> 14 & 0x3FFF);
						if (local1925) {
							Static321.method4441(anIntArray242[2], anIntArray242[1]);
						}
					}
					return;
				}
				if (arg0 == 5215) {
					anInt3735 -= 2;
					local157 = anIntArray239[anInt3735];
					local192 = anIntArray239[anInt3735 + 1];
					@Pc(1963) Class65 local1963 = Static211.method307(local157 >> 14 & 0x3FFF, local157 & 0x3FFF);
					local1965 = false;
					for (@Pc(1970) Class3_Sub3_Sub13 local1970 = (Class3_Sub3_Sub13) local1963.method1684(); local1970 != null; local1970 = (Class3_Sub3_Sub13) local1963.method1688()) {
						if (local1970.anInt3495 == local192) {
							local1965 = true;
							break;
						}
					}
					if (local1965) {
						anIntArray239[anInt3735++] = 1;
						return;
					}
					anIntArray239[anInt3735++] = 0;
					return;
				}
				if (arg0 == 5218) {
					local157 = anIntArray239[--anInt3735];
					local1554 = Static211.method310(local157);
					if (local1554 == null) {
						anIntArray239[anInt3735++] = -1;
						return;
					}
					anIntArray239[anInt3735++] = local1554.anInt3502;
					return;
				}
				if (arg0 == 5220) {
					anIntArray239[anInt3735++] = Static264.anInt4384 == 100 ? 1 : 0;
					return;
				}
				if (arg0 == 5221) {
					local157 = anIntArray239[--anInt3735];
					Static321.method4441(local157 & 0x3FFF, local157 >> 14 & 0x3FFF);
					return;
				}
				if (arg0 == 5222) {
					local1587 = Static24.method2484();
					if (local1587 != null) {
						local1313 = local1587.method3011(Static436.anInt7297 + Static211.anInt276, anIntArray242, Static34.anInt3343 + Static211.anInt278);
						if (local1313) {
							anIntArray239[anInt3735++] = anIntArray242[1];
							anIntArray239[anInt3735++] = anIntArray242[2];
							return;
						}
						anIntArray239[anInt3735++] = -1;
						anIntArray239[anInt3735++] = -1;
						return;
					}
					anIntArray239[anInt3735++] = -1;
					anIntArray239[anInt3735++] = -1;
					return;
				}
				if (arg0 == 5223) {
					anInt3735 -= 2;
					local157 = anIntArray239[anInt3735];
					local192 = anIntArray239[anInt3735 + 1];
					Static188.method2953(local192 >> 14 & 0x3FFF, false, local157, local192 & 0x3FFF);
					return;
				}
				if (arg0 == 5224) {
					local157 = anIntArray239[--anInt3735];
					local1554 = Static24.method2484();
					if (local1554 != null) {
						local1925 = local1554.method3004(anIntArray242, local157 >> 28 & 0x3, local157 & 0x3FFF, local157 >> 14 & 0x3FFF);
						if (local1925) {
							anIntArray239[anInt3735++] = anIntArray242[1];
							anIntArray239[anInt3735++] = anIntArray242[2];
							return;
						}
						anIntArray239[anInt3735++] = -1;
						anIntArray239[anInt3735++] = -1;
						return;
					}
					anIntArray239[anInt3735++] = -1;
					anIntArray239[anInt3735++] = -1;
					return;
				}
				if (arg0 == 5225) {
					local157 = anIntArray239[--anInt3735];
					local1554 = Static24.method2484();
					if (local1554 != null) {
						local1925 = local1554.method3011(local157 & 0x3FFF, anIntArray242, local157 >> 14 & 0x3FFF);
						if (local1925) {
							anIntArray239[anInt3735++] = anIntArray242[1];
							anIntArray239[anInt3735++] = anIntArray242[2];
							return;
						}
						anIntArray239[anInt3735++] = -1;
						anIntArray239[anInt3735++] = -1;
						return;
					}
					anIntArray239[anInt3735++] = -1;
					anIntArray239[anInt3735++] = -1;
					return;
				}
				if (arg0 == 5226) {
					Static251.method5278(anIntArray239[--anInt3735]);
					return;
				}
				if (arg0 == 5227) {
					anInt3735 -= 2;
					local157 = anIntArray239[anInt3735];
					local192 = anIntArray239[anInt3735 + 1];
					Static188.method2953(local192 >> 14 & 0x3FFF, true, local157, local192 & 0x3FFF);
					return;
				}
				if (arg0 == 5228) {
					Static207.aBoolean274 = anIntArray239[--anInt3735] == 1;
					return;
				}
				if (arg0 == 5229) {
					anIntArray239[anInt3735++] = Static207.aBoolean274 ? 1 : 0;
					return;
				}
				if (arg0 == 5230) {
					local157 = anIntArray239[--anInt3735];
					Static76.method1402(local157);
					return;
				}
				@Pc(2483) Class3 local2483;
				if (arg0 == 5231) {
					anInt3735 -= 2;
					local157 = anIntArray239[anInt3735];
					local1313 = anIntArray239[anInt3735 + 1] == 1;
					if (Static419.aClass140_36 != null) {
						local2483 = Static419.aClass140_36.method3490((long) local157);
						if (local2483 != null && !local1313) {
							local2483.method6288();
							return;
						}
						if (local2483 == null && local1313) {
							local2483 = new Class3();
							Static419.aClass140_36.method3494((long) local157, local2483);
						}
					}
					return;
				}
				@Pc(2525) Class3 local2525;
				if (arg0 == 5232) {
					local157 = anIntArray239[--anInt3735];
					if (Static419.aClass140_36 != null) {
						local2525 = Static419.aClass140_36.method3490((long) local157);
						anIntArray239[anInt3735++] = local2525 == null ? 0 : 1;
						return;
					}
					anIntArray239[anInt3735++] = 0;
					return;
				}
				if (arg0 == 5233) {
					anInt3735 -= 2;
					local157 = anIntArray239[anInt3735];
					local1313 = anIntArray239[anInt3735 + 1] == 1;
					if (Static221.aClass140_35 != null) {
						local2483 = Static221.aClass140_35.method3490((long) local157);
						if (local2483 != null && !local1313) {
							local2483.method6288();
							return;
						}
						if (local2483 == null && local1313) {
							local2483 = new Class3();
							Static221.aClass140_35.method3494((long) local157, local2483);
						}
					}
					return;
				}
				if (arg0 == 5234) {
					local157 = anIntArray239[--anInt3735];
					if (Static221.aClass140_35 != null) {
						local2525 = Static221.aClass140_35.method3490((long) local157);
						anIntArray239[anInt3735++] = local2525 == null ? 0 : 1;
						return;
					}
					anIntArray239[anInt3735++] = 0;
					return;
				}
				if (arg0 == 5235) {
					anIntArray239[anInt3735++] = Static211.aClass3_Sub3_Sub13_2 == null ? -1 : Static211.aClass3_Sub3_Sub13_2.anInt3495;
					return;
				}
				if (arg0 == 5236) {
					anInt3735 -= 2;
					local157 = anIntArray239[anInt3735];
					local192 = anIntArray239[anInt3735 + 1];
					local89 = local192 >> 14 & 0x3FFF;
					local95 = local192 & 0x3FFF;
					local2691 = Static401.method5487(local89, local95, local157);
					if (local2691 < 0) {
						anIntArray239[anInt3735++] = -1;
						return;
					}
					anIntArray239[anInt3735++] = local2691;
					return;
				}
				if (arg0 == 5237) {
					Static152.method6185();
					return;
				}
			} else if (arg0 < 5400) {
				if (arg0 == 5300) {
					anInt3735 -= 2;
					local157 = anIntArray239[anInt3735];
					local192 = anIntArray239[anInt3735 + 1];
					Static435.method5879(local157, 3, local192, false);
					anIntArray239[anInt3735++] = Static52.aFrame1 == null ? 0 : 1;
					return;
				}
				if (arg0 == 5301) {
					if (Static52.aFrame1 != null) {
						Static435.method5879(-1, Static39.aClass79_Sub1_1.anInt2150, -1, false);
					}
					return;
				}
				if (arg0 == 5302) {
					@Pc(2775) Class219[] local2775 = Static425.method1941();
					anIntArray239[anInt3735++] = local2775.length;
					return;
				}
				if (arg0 == 5303) {
					local157 = anIntArray239[--anInt3735];
					@Pc(2799) Class219[] local2799 = Static425.method1941();
					anIntArray239[anInt3735++] = local2799[local157].anInt6272;
					anIntArray239[anInt3735++] = local2799[local157].anInt6273;
					return;
				}
				if (arg0 == 5305) {
					local157 = Static39.aClass79_Sub1_1.anInt2148;
					local192 = Static39.aClass79_Sub1_1.anInt2146;
					local89 = -1;
					@Pc(2836) Class219[] local2836 = Static425.method1941();
					for (local2691 = 0; local2691 < local2836.length; local2691++) {
						@Pc(2843) Class219 local2843 = local2836[local2691];
						if (local2843.anInt6272 == local157 && local2843.anInt6273 == local192) {
							local89 = local2691;
							break;
						}
					}
					anIntArray239[anInt3735++] = local89;
					return;
				}
				if (arg0 == 5306) {
					anIntArray239[anInt3735++] = Static282.method3967();
					return;
				}
				if (arg0 == 5307) {
					local157 = anIntArray239[--anInt3735];
					if (local157 >= 1 && local157 <= 2) {
						Static435.method5879(-1, local157, -1, false);
						return;
					}
					return;
				}
				if (arg0 == 5308) {
					anIntArray239[anInt3735++] = Static39.aClass79_Sub1_1.anInt2150;
					return;
				}
				if (arg0 == 5309) {
					local157 = anIntArray239[--anInt3735];
					if (local157 >= 1 && local157 <= 2) {
						Static39.aClass79_Sub1_1.anInt2150 = local157;
						Static39.aClass79_Sub1_1.method1953(Static32.aClass51_1);
						return;
					}
					return;
				}
			} else {
				@Pc(3351) String local3351;
				if (arg0 < 5500) {
					if (arg0 == 5400) {
						anInt3736 -= 2;
						local75 = aStringArray22[anInt3736];
						local81 = aStringArray22[anInt3736 + 1];
						local89 = anIntArray239[--anInt3735];
						Static307.method4633(Static356.aClass163_181);
						Static243.aClass3_Sub25_Sub1_7.method4081(Static47.method891(local75) + Static47.method891(local81) + 1);
						Static243.aClass3_Sub25_Sub1_7.method4080(local75);
						Static243.aClass3_Sub25_Sub1_7.method4080(local81);
						Static243.aClass3_Sub25_Sub1_7.method4081(local89);
						return;
					}
					if (arg0 == 5401) {
						anInt3735 -= 2;
						Static207.aShortArray48[anIntArray239[anInt3735]] = (short) Static403.method5516(anIntArray239[anInt3735 + 1]);
						Static158.aClass272_1.method6273();
						Static158.aClass272_1.method6281();
						Static118.aClass19_1.method398();
						Static174.method2784();
						return;
					}
					if (arg0 == 5405) {
						anInt3735 -= 2;
						local157 = anIntArray239[anInt3735];
						local192 = anIntArray239[anInt3735 + 1];
						if (local157 >= 0 && local157 < 2) {
							Static270.anIntArrayArrayArray10[local157] = new int[local192 << 1][4];
						}
						return;
					}
					if (arg0 == 5406) {
						anInt3735 -= 7;
						local157 = anIntArray239[anInt3735];
						local192 = anIntArray239[anInt3735 + 1] << 1;
						local89 = anIntArray239[anInt3735 + 2];
						local95 = anIntArray239[anInt3735 + 3];
						local2691 = anIntArray239[anInt3735 + 4];
						@Pc(3111) int local3111 = anIntArray239[anInt3735 + 5];
						@Pc(3117) int local3117 = anIntArray239[anInt3735 + 6];
						if (local157 >= 0 && local157 < 2 && Static270.anIntArrayArrayArray10[local157] != null && local192 >= 0 && local192 < Static270.anIntArrayArrayArray10[local157].length) {
							Static270.anIntArrayArrayArray10[local157][local192] = new int[] { (local89 >> 14 & 0x3FFF) << 7, local95, (local89 & 0x3FFF) << 7, local3117 };
							Static270.anIntArrayArrayArray10[local157][local192 + 1] = new int[] { (local2691 >> 14 & 0x3FFF) << 7, local3111, (local2691 & 0x3FFF) << 7 };
						}
						return;
					}
					if (arg0 == 5407) {
						local157 = Static270.anIntArrayArrayArray10[anIntArray239[--anInt3735]].length >> 1;
						anIntArray239[anInt3735++] = local157;
						return;
					}
					if (arg0 == 5411) {
						if (Static52.aFrame1 != null) {
							Static435.method5879(-1, Static39.aClass79_Sub1_1.anInt2150, -1, false);
						}
						if (Static456.aFrame2 != null) {
							Static174.method2777();
							System.exit(0);
							return;
						}
						local75 = Static84.aString59 == null ? Static241.method3493() : Static84.aString59;
						Static166.method2553(Static402.anInt6656 == 1, Static32.aClass51_1, local75, false);
						return;
					}
					if (arg0 == 5419) {
						local75 = "";
						if (Static232.aClass181_5 != null) {
							if (Static232.aClass181_5.anObject7 == null) {
								local75 = Static442.method6044(Static232.aClass181_5.anInt5296);
							} else {
								local75 = (String) Static232.aClass181_5.anObject7;
							}
						}
						aStringArray22[anInt3736++] = local75;
						return;
					}
					if (arg0 == 5420) {
						anIntArray239[anInt3735++] = Static75.anInt1371 == 3 ? 1 : 0;
						return;
					}
					if (arg0 == 5421) {
						if (Static52.aFrame1 != null) {
							Static435.method5879(-1, Static39.aClass79_Sub1_1.anInt2150, -1, false);
						}
						local75 = aStringArray22[--anInt3736];
						local1313 = anIntArray239[--anInt3735] == 1;
						local3351 = Static241.method3493() + local75;
						Static166.method2553(Static402.anInt6656 == 1, Static32.aClass51_1, local3351, local1313);
						return;
					}
					if (arg0 == 5422) {
						anInt3736 -= 2;
						local75 = aStringArray22[anInt3736];
						local81 = aStringArray22[anInt3736 + 1];
						local89 = anIntArray239[--anInt3735];
						if (local75.length() > 0) {
							if (Static415.aStringArray44 == null) {
								Static415.aStringArray44 = new String[Static256.anIntArray281[Static154.aClass113_3.anInt3360]];
							}
							Static415.aStringArray44[local89] = local75;
						}
						if (local81.length() > 0) {
							if (Static396.aStringArray41 == null) {
								Static396.aStringArray41 = new String[Static256.anIntArray281[Static154.aClass113_3.anInt3360]];
							}
							Static396.aStringArray41[local89] = local81;
						}
						return;
					}
					if (arg0 == 5423) {
						System.out.println(aStringArray22[--anInt3736]);
						return;
					}
					if (arg0 == 5424) {
						anInt3735 -= 11;
						Static58.anInt1118 = anIntArray239[anInt3735];
						Static461.anInt7745 = anIntArray239[anInt3735 + 1];
						Static296.anInt5114 = anIntArray239[anInt3735 + 2];
						Static402.anInt6657 = anIntArray239[anInt3735 + 3];
						Static258.anInt4312 = anIntArray239[anInt3735 + 4];
						Static242.anInt4136 = anIntArray239[anInt3735 + 5];
						Static218.anInt7514 = anIntArray239[anInt3735 + 6];
						Static187.anInt3419 = anIntArray239[anInt3735 + 7];
						Static134.anInt2392 = anIntArray239[anInt3735 + 8];
						Static460.anInt7717 = anIntArray239[anInt3735 + 9];
						Static376.anInt6361 = anIntArray239[anInt3735 + 10];
						Static8.aClass250_2.method5813(Static258.anInt4312);
						Static8.aClass250_2.method5813(Static242.anInt4136);
						Static8.aClass250_2.method5813(Static218.anInt7514);
						Static8.aClass250_2.method5813(Static187.anInt3419);
						Static8.aClass250_2.method5813(Static134.anInt2392);
						Static373.aClass2_15 = null;
						Static153.aClass2_2 = null;
						Static293.aClass2_10 = null;
						Static326.aClass2_12 = null;
						Static155.aClass2_3 = null;
						Static210.aClass2_7 = null;
						Static364.aClass2_14 = null;
						Static270.aClass2_8 = null;
						Static71.aBoolean86 = true;
						return;
					}
					if (arg0 == 5425) {
						Static453.method6159();
						Static71.aBoolean86 = false;
						return;
					}
					if (arg0 == 5426) {
						anInt3735 -= 2;
						Static122.anInt2179 = anIntArray239[anInt3735];
						Static387.anInt6515 = anIntArray239[anInt3735 + 1];
						return;
					}
					if (arg0 == 5427) {
						anInt3735 -= 2;
						Static172.anInt3102 = anIntArray239[anInt3735 + 1];
						return;
					}
					if (arg0 == 5428) {
						anInt3735 -= 2;
						local157 = anIntArray239[anInt3735];
						local192 = anIntArray239[anInt3735 + 1];
						anIntArray239[anInt3735++] = Static431.method5860(local192, local157) ? 1 : 0;
						return;
					}
					if (arg0 == 5429) {
						Static199.method3075(false, aStringArray22[--anInt3736], false);
						return;
					}
					if (arg0 == 5430) {
						try {
							Static473.method5059(Static32.aClass51_1.anApplet1, "accountcreated");
							return;
						} catch (@Pc(3646) Throwable local3646) {
							return;
						}
					}
				} else if (arg0 < 5600) {
					if (arg0 == 5500) {
						anInt3735 -= 4;
						local157 = anIntArray239[anInt3735];
						local192 = anIntArray239[anInt3735 + 1];
						local89 = anIntArray239[anInt3735 + 2];
						local95 = anIntArray239[anInt3735 + 3];
						Static260.method5120(local89, (local157 >> 14 & 0x3FFF) - Static59.anInt1127, false, local192, local95, (local157 & 0x3FFF) - Static49.anInt873);
						return;
					}
					if (arg0 == 5501) {
						anInt3735 -= 4;
						local157 = anIntArray239[anInt3735];
						local192 = anIntArray239[anInt3735 + 1];
						local89 = anIntArray239[anInt3735 + 2];
						local95 = anIntArray239[anInt3735 + 3];
						Static27.method497((local157 >> 14 & 0x3FFF) - Static59.anInt1127, local192, local95, (local157 & 0x3FFF) - Static49.anInt873, local89);
						return;
					}
					if (arg0 == 5502) {
						anInt3735 -= 6;
						local157 = anIntArray239[anInt3735];
						if (local157 >= 2) {
							throw new RuntimeException();
						}
						Static464.anInt7828 = local157;
						local192 = anIntArray239[anInt3735 + 1];
						if (local192 + 1 >= Static270.anIntArrayArrayArray10[Static464.anInt7828].length >> 1) {
							throw new RuntimeException();
						}
						Static303.anInt5227 = local192;
						Static288.anInt5048 = 0;
						Static212.anInt3711 = anIntArray239[anInt3735 + 2];
						Static99.anInt1805 = anIntArray239[anInt3735 + 3];
						local89 = anIntArray239[anInt3735 + 4];
						if (local89 >= 2) {
							throw new RuntimeException();
						}
						Static243.anInt7142 = local89;
						local95 = anIntArray239[anInt3735 + 5];
						if (local95 + 1 >= Static270.anIntArrayArrayArray10[Static243.anInt7142].length >> 1) {
							throw new RuntimeException();
						}
						Static373.anInt6325 = local95;
						Static27.anInt490 = 3;
						return;
					}
					if (arg0 == 5503) {
						Static371.method5204();
						return;
					}
					if (arg0 == 5504) {
						anInt3735 -= 2;
						Static342.method4769(anIntArray239[anInt3735 + 1], anIntArray239[anInt3735]);
						return;
					}
					if (arg0 == 5505) {
						anIntArray239[anInt3735++] = (int) Static275.aFloat61 >> 3;
						return;
					}
					if (arg0 == 5506) {
						anIntArray239[anInt3735++] = (int) Static19.aFloat6 >> 3;
						return;
					}
					if (arg0 == 5507) {
						Static129.method2033();
						return;
					}
					if (arg0 == 5508) {
						Static304.method5407();
						return;
					}
					if (arg0 == 5509) {
						Static264.method3658();
						return;
					}
					if (arg0 == 5510) {
						Static324.method4497();
						return;
					}
					if (arg0 == 5511) {
						local157 = anIntArray239[--anInt3735];
						local192 = local157 >> 14 & 0x3FFF;
						local89 = local157 & 0x3FFF;
						local192 -= Static59.anInt1127;
						if (local192 < 0) {
							local192 = 0;
						} else if (local192 >= Static373.anInt6324) {
							local192 = Static373.anInt6324;
						}
						local89 -= Static49.anInt873;
						if (local89 < 0) {
							local89 = 0;
						} else if (local89 >= Static291.anInt5062) {
							local89 = Static291.anInt5062;
						}
						Static370.anInt6269 = (local192 << 7) + 64;
						Static180.anInt3334 = (local89 << 7) + 64;
						Static27.anInt490 = 4;
						return;
					}
					if (arg0 == 5512) {
						Static142.method2184();
						return;
					}
				} else if (arg0 < 5700) {
					if (arg0 == 5600) {
						anInt3736 -= 2;
						local75 = aStringArray22[anInt3736];
						local81 = aStringArray22[anInt3736 + 1];
						local89 = anIntArray239[--anInt3735];
						if (Static345.anInt5823 != 2) {
							return;
						}
						if (Static423.anInt7131 == 0 && Static238.anInt4081 == 0) {
							Static378.aString60 = local75;
							Static217.aString10 = local81;
							Static154.anInt2803 = local89;
							Static393.method5432(5);
							return;
						}
						return;
					}
					if (arg0 == 5601) {
						Static365.method5102();
						return;
					}
					if (arg0 == 5602) {
						if (Static423.anInt7131 == 0) {
							Static305.anInt5237 = -2;
							Static237.anInt4058 = -2;
						}
						return;
					}
					if (arg0 == 5603) {
						anInt3735 -= 4;
						if (Static345.anInt5823 != 2) {
							return;
						}
						if (Static423.anInt7131 == 0 && Static238.anInt4081 == 0) {
							Static376.method5238(anIntArray239[anInt3735 + 3], anIntArray239[anInt3735 + 1], anIntArray239[anInt3735 + 2], anIntArray239[anInt3735]);
							return;
						}
						return;
					}
					if (arg0 == 5604) {
						anInt3736--;
						if (Static345.anInt5823 != 2) {
							return;
						}
						if (Static423.anInt7131 == 0 && Static238.anInt4081 == 0) {
							Static106.method4450(Static428.method5838(aStringArray22[anInt3736]));
							return;
						}
						return;
					}
					if (arg0 == 5605) {
						anInt3736 -= 2;
						if (Static345.anInt5823 != 2) {
							return;
						}
						if (Static423.anInt7131 == 0 && Static238.anInt4081 == 0) {
							Static158.method2489(aStringArray22[anInt3736 + 1], false, Static428.method5838(aStringArray22[anInt3736]));
							return;
						}
						return;
					}
					if (arg0 == 5606) {
						if (Static238.anInt4081 == 0) {
							Static88.anInt1593 = -2;
						}
						return;
					}
					if (arg0 == 5607) {
						anIntArray239[anInt3735++] = Static237.anInt4058;
						return;
					}
					if (arg0 == 5608) {
						anIntArray239[anInt3735++] = Static333.anInt5545;
						return;
					}
					if (arg0 == 5609) {
						anIntArray239[anInt3735++] = Static88.anInt1593;
						return;
					}
					if (arg0 == 5610) {
						for (local157 = 0; local157 < 5; local157++) {
							aStringArray22[anInt3736++] = Static383.aStringArray40.length > local157 ? Static304.method5405(Static383.aStringArray40[local157]) : "";
						}
						Static383.aStringArray40 = null;
						return;
					}
					if (arg0 == 5611) {
						anIntArray239[anInt3735++] = Static14.anInt241;
						return;
					}
					if (arg0 == 5612) {
						local157 = anIntArray239[--anInt3735];
						if (Static345.anInt5823 != 6) {
							return;
						}
						if (Static423.anInt7131 == 0 && Static238.anInt4081 == 0) {
							if (Static328.aClass116_1 != null) {
								Static328.aClass116_1.method2920();
								Static328.aClass116_1 = null;
							}
							Static154.anInt2803 = local157;
							Static393.method5432(8);
							return;
						}
						return;
					}
					if (arg0 == 5613) {
						anIntArray239[anInt3735++] = Static237.anInt4058;
						return;
					}
					if (arg0 == 5615) {
						anInt3736 -= 2;
						local75 = aStringArray22[anInt3736];
						local81 = aStringArray22[anInt3736 + 1];
						if (Static345.anInt5823 != 2) {
							return;
						}
						if (Static423.anInt7131 == 0 && Static238.anInt4081 == 0) {
							if (Static328.aClass116_1 != null) {
								Static328.aClass116_1.method2920();
								Static328.aClass116_1 = null;
							}
							Static378.aString60 = local75;
							Static217.aString10 = local81;
							Static393.method5432(4);
							return;
						}
						return;
					}
					if (arg0 == 5616) {
						Static168.method2583(false);
						return;
					}
					if (arg0 == 5617) {
						anIntArray239[anInt3735++] = Static305.anInt5237;
						return;
					}
					if (arg0 == 5618) {
						local157 = anIntArray239[--anInt3735];
						Static72.method1301(false, local157);
						return;
					}
					if (arg0 == 5619) {
						local157 = anIntArray239[--anInt3735];
						Static72.method1301(true, local157);
						return;
					}
					if (arg0 == 5620) {
						Static299.method4268();
						if (Static140.aString37 != "" && Static140.aString37 != "") {
							anIntArray239[anInt3735++] = 1;
							return;
						}
						anIntArray239[anInt3735++] = 0;
						return;
					}
					if (arg0 == 5621) {
						anInt3736 -= 2;
						if (Static345.anInt5823 != 2) {
							return;
						}
						if (Static423.anInt7131 == 0 && Static238.anInt4081 == 0) {
							Static158.method2489(aStringArray22[anInt3736 + 1], true, Static428.method5838(aStringArray22[anInt3736]));
							return;
						}
						return;
					}
					if (arg0 == 5622) {
						@Pc(4436) Class181 local4436 = Static32.aClass51_1.method1359(false, "3");
						while (local4436.anInt5298 == 0) {
							Static83.method1499(1L);
						}
						if (local4436.anInt5298 == 2) {
							throw new RuntimeException("Error opening file");
						}
						@Pc(4456) Class220 local4456 = (Class220) local4436.anObject7;
						if (local4456.method5185().exists()) {
							@Pc(4466) Class3_Sub25 local4466 = new Class3_Sub25(50);
							try {
								local4456.method5187(50, 0, local4466.aByteArray88);
							} catch (@Pc(4475) IOException local4475) {
							}
						}
						try {
							local4456.method5190();
							return;
						} catch (@Pc(4481) Exception local4481) {
							return;
						}
					}
				} else if (arg0 < 6100) {
					if (arg0 == 6001) {
						local157 = anIntArray239[--anInt3735];
						if (local157 < 1) {
							local157 = 1;
						}
						if (local157 > 4) {
							local157 = 4;
						}
						Static39.aClass79_Sub1_1.anInt2153 = local157;
						Static409.method5642();
						Static39.aClass79_Sub1_1.method1953(Static32.aClass51_1);
						Static171.aBoolean244 = false;
						return;
					}
					if (arg0 == 6002) {
						Static39.aClass79_Sub1_1.method1952(anIntArray239[--anInt3735] == 1);
						Static409.method5642();
						Static53.method998();
						Static39.aClass79_Sub1_1.method1953(Static32.aClass51_1);
						Static171.aBoolean244 = false;
						return;
					}
					if (arg0 == 6003) {
						Static39.aClass79_Sub1_1.aBoolean157 = anIntArray239[--anInt3735] == 1;
						Static53.method998();
						Static39.aClass79_Sub1_1.method1953(Static32.aClass51_1);
						Static171.aBoolean244 = false;
						return;
					}
					if (arg0 == 6005) {
						Static39.aClass79_Sub1_1.aBoolean152 = anIntArray239[--anInt3735] == 1;
						Static409.method5642();
						Static39.aClass79_Sub1_1.method1953(Static32.aClass51_1);
						Static171.aBoolean244 = false;
						return;
					}
					if (arg0 == 6006) {
						Static39.aClass79_Sub1_1.aBoolean155 = anIntArray239[--anInt3735] == 1;
						Static413.aClass167_11.method5955(!Static39.aClass79_Sub1_1.aBoolean155);
						Static39.aClass79_Sub1_1.method1953(Static32.aClass51_1);
						Static171.aBoolean244 = false;
						return;
					}
					if (arg0 == 6007) {
						Static39.aClass79_Sub1_1.anInt2152 = anIntArray239[--anInt3735];
						Static39.aClass79_Sub1_1.method1953(Static32.aClass51_1);
						Static171.aBoolean244 = false;
						return;
					}
					if (arg0 == 6008) {
						Static39.aClass79_Sub1_1.aBoolean162 = anIntArray239[--anInt3735] == 1;
						Static39.aClass79_Sub1_1.method1953(Static32.aClass51_1);
						Static171.aBoolean244 = false;
						return;
					}
					if (arg0 == 6009) {
						Static39.aClass79_Sub1_1.aBoolean154 = anIntArray239[--anInt3735] == 1;
						Static409.method5642();
						Static39.aClass79_Sub1_1.method1953(Static32.aClass51_1);
						Static171.aBoolean244 = false;
						return;
					}
					if (arg0 == 6010) {
						Static39.aClass79_Sub1_1.aBoolean151 = anIntArray239[--anInt3735] == 1;
						Static39.aClass79_Sub1_1.method1953(Static32.aClass51_1);
						Static171.aBoolean244 = false;
						return;
					}
					if (arg0 == 6011) {
						local157 = anIntArray239[--anInt3735];
						if (local157 < 0 || local157 > 2) {
							local157 = 0;
						}
						Static39.aClass79_Sub1_1.method1937(Static402.anInt6656, local157);
						Static409.method5642();
						Static39.aClass79_Sub1_1.method1953(Static32.aClass51_1);
						Static171.aBoolean244 = false;
						return;
					}
					if (arg0 == 6012) {
						Static39.aClass79_Sub1_1.method1943(Static402.anInt6656, anIntArray239[--anInt3735] == 1);
						Static444.method5197();
						Static106.method4449();
						Static39.aClass79_Sub1_1.method1953(Static32.aClass51_1);
						Static171.aBoolean244 = false;
						return;
					}
					if (arg0 == 6014) {
						Static39.aClass79_Sub1_1.aBoolean156 = anIntArray239[--anInt3735] == 1;
						Static409.method5642();
						Static39.aClass79_Sub1_1.method1953(Static32.aClass51_1);
						Static171.aBoolean244 = false;
						return;
					}
					if (arg0 == 6015) {
						Static39.aClass79_Sub1_1.aBoolean159 = anIntArray239[--anInt3735] == 1;
						Static409.method5642();
						Static39.aClass79_Sub1_1.method1953(Static32.aClass51_1);
						Static171.aBoolean244 = false;
						return;
					}
					if (arg0 == 6016) {
						local157 = anIntArray239[--anInt3735];
						if (local157 < 0 || local157 > 2) {
							local157 = 0;
						}
						Static39.aClass79_Sub1_1.anInt2145 = local157;
						Static299.method4264(Static402.anInt6656);
						Static39.aClass79_Sub1_1.method1953(Static32.aClass51_1);
						return;
					}
					if (arg0 == 6017) {
						Static39.aClass79_Sub1_1.aBoolean147 = anIntArray239[--anInt3735] == 1;
						Static220.method3684();
						Static39.aClass79_Sub1_1.method1953(Static32.aClass51_1);
						Static171.aBoolean244 = false;
						return;
					}
					if (arg0 == 6018) {
						local157 = anIntArray239[--anInt3735];
						if (local157 < 0) {
							local157 = 0;
						}
						if (local157 > 127) {
							local157 = 127;
						}
						Static39.aClass79_Sub1_1.anInt2158 = local157;
						Static39.aClass79_Sub1_1.method1953(Static32.aClass51_1);
						Static171.aBoolean244 = false;
						return;
					}
					if (arg0 == 6019) {
						local157 = anIntArray239[--anInt3735];
						if (local157 < 0) {
							local157 = 0;
						}
						if (local157 > 255) {
							local157 = 255;
						}
						if (local157 != Static39.aClass79_Sub1_1.anInt2147) {
							if (Static39.aClass79_Sub1_1.anInt2147 == 0 && Static81.anInt1464 != -1) {
								Static84.method4994(Static81.anInt1464, Static28.aClass250_12, local157);
								Static240.aBoolean428 = false;
							} else if (local157 == 0) {
								Static322.method4455();
								Static240.aBoolean428 = false;
							} else {
								Static26.method476(local157);
							}
							Static39.aClass79_Sub1_1.anInt2147 = local157;
						}
						Static39.aClass79_Sub1_1.method1953(Static32.aClass51_1);
						Static171.aBoolean244 = false;
						return;
					}
					if (arg0 == 6020) {
						local157 = anIntArray239[--anInt3735];
						if (local157 < 0) {
							local157 = 0;
						}
						if (local157 > 127) {
							local157 = 127;
						}
						Static39.aClass79_Sub1_1.anInt2163 = local157;
						Static39.aClass79_Sub1_1.method1953(Static32.aClass51_1);
						Static171.aBoolean244 = false;
						return;
					}
					if (arg0 == 6021) {
						Static39.aClass79_Sub1_1.aBoolean164 = anIntArray239[--anInt3735] == 1;
						Static53.method998();
						return;
					}
					if (arg0 == 6023) {
						local157 = anIntArray239[--anInt3735];
						local1313 = false;
						if (local157 < 0) {
							local157 = 0;
						}
						if (local157 > 2) {
							local157 = 2;
						}
						if (Static61.anInt1155 < 96) {
							local157 = 0;
							local1313 = true;
						}
						Static377.method5243(local157);
						Static39.aClass79_Sub1_1.method1953(Static32.aClass51_1);
						Static171.aBoolean244 = false;
						anIntArray239[anInt3735++] = local1313 ? 0 : 1;
						return;
					}
					if (arg0 == 6024) {
						local157 = anIntArray239[--anInt3735];
						if (local157 < 0 || local157 > 2) {
							local157 = 0;
						}
						Static39.aClass79_Sub1_1.anInt2157 = local157;
						Static39.aClass79_Sub1_1.method1953(Static32.aClass51_1);
						return;
					}
					if (arg0 == 6025) {
						local157 = anIntArray239[--anInt3735];
						if (local157 < 0 || local157 > Static141.method2175(Static61.anInt1155)) {
							local157 = 0;
						}
						Static39.aClass79_Sub1_1.anInt2159 = local157;
						Static39.aClass79_Sub1_1.method1953(Static32.aClass51_1);
						Static171.aBoolean244 = false;
						return;
					}
					if (arg0 == 6027) {
						local157 = anIntArray239[--anInt3735];
						if (local157 < 0 || local157 > 1) {
							local157 = 0;
						}
						Static340.method4761(local157 == 1);
						return;
					}
					if (arg0 == 6028) {
						Static39.aClass79_Sub1_1.aBoolean150 = anIntArray239[--anInt3735] != 0;
						Static39.aClass79_Sub1_1.method1953(Static32.aClass51_1);
						return;
					}
					if (arg0 == 6029) {
						Static39.aClass79_Sub1_1.anInt2152 = anIntArray239[--anInt3735];
						Static39.aClass79_Sub1_1.method1953(Static32.aClass51_1);
						return;
					}
					if (arg0 == 6030) {
						Static39.aClass79_Sub1_1.aBoolean149 = anIntArray239[--anInt3735] != 0;
						Static39.aClass79_Sub1_1.method1953(Static32.aClass51_1);
						Static409.method5642();
						return;
					}
					if (arg0 == 6031) {
						local157 = anIntArray239[--anInt3735];
						if (local157 < 0 || local157 > 3) {
							local157 = 2;
						}
						Static299.method4264(local157);
						return;
					}
					if (arg0 == 6032) {
						local157 = anIntArray239[--anInt3735];
						if (local157 < 0 || local157 > 3) {
							local157 = 2;
						}
						Static39.aClass79_Sub1_1.anInt2161 = local157;
						Static39.aClass79_Sub1_1.method1953(Static32.aClass51_1);
						Static171.aBoolean244 = false;
						return;
					}
					if (arg0 == 6033) {
						local157 = anIntArray239[--anInt3735];
						if (local157 < 0 || local157 > 4) {
							local157 = 2;
						}
						Static39.aClass79_Sub1_1.anInt2156 = local157;
						Static39.aClass79_Sub1_1.method1953(Static32.aClass51_1);
						return;
					}
					if (arg0 == 6034) {
						Static39.aClass79_Sub1_1.aBoolean161 = anIntArray239[--anInt3735] == 1;
						Static39.aClass79_Sub1_1.method1953(Static32.aClass51_1);
						Static444.method5197();
						Static171.aBoolean244 = false;
						return;
					}
					if (arg0 == 6035) {
						Static39.aClass79_Sub1_1.aBoolean163 = anIntArray239[--anInt3735] == 1;
						Static409.method5642();
						Static53.method998();
						return;
					}
				} else if (arg0 < 6200) {
					if (arg0 == 6101) {
						anIntArray239[anInt3735++] = Static39.aClass79_Sub1_1.anInt2153;
						return;
					}
					if (arg0 == 6102) {
						anIntArray239[anInt3735++] = Static39.aClass79_Sub1_1.method1951(Static402.anInt6656) ? 1 : 0;
						return;
					}
					if (arg0 == 6103) {
						anIntArray239[anInt3735++] = Static39.aClass79_Sub1_1.aBoolean157 ? 1 : 0;
						return;
					}
					if (arg0 == 6105) {
						anIntArray239[anInt3735++] = Static39.aClass79_Sub1_1.aBoolean152 ? 1 : 0;
						return;
					}
					if (arg0 == 6106) {
						anIntArray239[anInt3735++] = Static39.aClass79_Sub1_1.aBoolean155 ? 1 : 0;
						return;
					}
					if (arg0 == 6107) {
						anIntArray239[anInt3735++] = Static39.aClass79_Sub1_1.anInt2152;
						return;
					}
					if (arg0 == 6108) {
						anIntArray239[anInt3735++] = Static39.aClass79_Sub1_1.aBoolean162 ? 1 : 0;
						return;
					}
					if (arg0 == 6109) {
						anIntArray239[anInt3735++] = Static39.aClass79_Sub1_1.aBoolean154 ? 1 : 0;
						return;
					}
					if (arg0 == 6110) {
						anIntArray239[anInt3735++] = Static39.aClass79_Sub1_1.aBoolean151 ? 1 : 0;
						return;
					}
					if (arg0 == 6111) {
						anIntArray239[anInt3735++] = Static39.aClass79_Sub1_1.method1942(Static402.anInt6656);
						return;
					}
					if (arg0 == 6112) {
						anIntArray239[anInt3735++] = Static39.aClass79_Sub1_1.method1939(Static402.anInt6656) ? 1 : 0;
						return;
					}
					if (arg0 == 6114) {
						anIntArray239[anInt3735++] = Static39.aClass79_Sub1_1.aBoolean156 ? 1 : 0;
						return;
					}
					if (arg0 == 6115) {
						anIntArray239[anInt3735++] = Static39.aClass79_Sub1_1.aBoolean159 ? 1 : 0;
						return;
					}
					if (arg0 == 6116) {
						anIntArray239[anInt3735++] = Static39.aClass79_Sub1_1.anInt2145;
						return;
					}
					if (arg0 == 6117) {
						anIntArray239[anInt3735++] = Static39.aClass79_Sub1_1.aBoolean147 ? 1 : 0;
						return;
					}
					if (arg0 == 6118) {
						anIntArray239[anInt3735++] = Static39.aClass79_Sub1_1.anInt2158;
						return;
					}
					if (arg0 == 6119) {
						anIntArray239[anInt3735++] = Static39.aClass79_Sub1_1.anInt2147;
						return;
					}
					if (arg0 == 6120) {
						anIntArray239[anInt3735++] = Static39.aClass79_Sub1_1.anInt2163;
						return;
					}
					if (arg0 == 6121) {
						anIntArray239[anInt3735++] = Static413.aClass167_11.method5988() ? 1 : 0;
						return;
					}
					if (arg0 == 6123) {
						anIntArray239[anInt3735++] = Static96.method1664();
						return;
					}
					if (arg0 == 6124) {
						anIntArray239[anInt3735++] = Static39.aClass79_Sub1_1.anInt2157;
						return;
					}
					if (arg0 == 6125) {
						anIntArray239[anInt3735++] = Static39.aClass79_Sub1_1.anInt2159;
						return;
					}
					if (arg0 == 6126) {
						anIntArray239[anInt3735++] = Static413.aClass167_11.method5992() ? 1 : 0;
						return;
					}
					if (arg0 == 6127) {
						anIntArray239[anInt3735++] = Static39.aClass79_Sub1_1.aBoolean148 ? 1 : 0;
						return;
					}
					if (arg0 == 6128) {
						anIntArray239[anInt3735++] = Static39.aClass79_Sub1_1.aBoolean150 ? 1 : 0;
						return;
					}
					if (arg0 == 6129) {
						anIntArray239[anInt3735++] = Static39.aClass79_Sub1_1.anInt2152;
						return;
					}
					if (arg0 == 6130) {
						anIntArray239[anInt3735++] = Static39.aClass79_Sub1_1.aBoolean149 ? 1 : 0;
						return;
					}
					if (arg0 == 6131) {
						anIntArray239[anInt3735++] = Static402.anInt6656;
						return;
					}
					if (arg0 == 6132) {
						anIntArray239[anInt3735++] = Static39.aClass79_Sub1_1.anInt2161;
						return;
					}
					if (arg0 == 6133) {
						anIntArray239[anInt3735++] = Static75.anInt1371 == 1 || Static75.anInt1371 == 4 ? 1 : 0;
						return;
					}
					if (arg0 == 6134) {
						anIntArray239[anInt3735++] = Static141.method2175(Static61.anInt1155);
						return;
					}
					if (arg0 == 6135) {
						anIntArray239[anInt3735++] = Static39.aClass79_Sub1_1.anInt2156;
						return;
					}
					if (arg0 == 6136) {
						anIntArray239[anInt3735++] = Static39.aClass79_Sub1_1.aBoolean161 ? 1 : 0;
						return;
					}
					if (arg0 == 6137) {
						@Pc(5871) boolean local5871 = true;
						try {
							local5871 = jagmisc.getTotalPhysicalMemory() > 268435456L;
						} catch (@Pc(5881) Throwable local5881) {
						}
						anIntArray239[anInt3735++] = local5871 ? 1 : 0;
						return;
					}
				} else if (arg0 < 6300) {
					if (arg0 == 6200) {
						anInt3735 -= 2;
						Static108.aShort19 = (short) anIntArray239[anInt3735];
						if (Static108.aShort19 <= 0) {
							Static108.aShort19 = 256;
						}
						Static366.aShort89 = (short) anIntArray239[anInt3735 + 1];
						if (Static366.aShort89 <= 0) {
							Static366.aShort89 = 205;
						}
						return;
					}
					if (arg0 == 6201) {
						anInt3735 -= 2;
						Static110.aShort20 = (short) anIntArray239[anInt3735];
						if (Static110.aShort20 <= 0) {
							Static110.aShort20 = 256;
						}
						Static263.aShort93 = (short) anIntArray239[anInt3735 + 1];
						if (Static263.aShort93 <= 0) {
							Static263.aShort93 = 320;
						}
						return;
					}
					if (arg0 == 6202) {
						anInt3735 -= 4;
						Static62.aShort13 = (short) anIntArray239[anInt3735];
						if (Static62.aShort13 <= 0) {
							Static62.aShort13 = 1;
						}
						Static284.aShort65 = (short) anIntArray239[anInt3735 + 1];
						if (Static284.aShort65 <= 0) {
							Static284.aShort65 = 32767;
						} else if (Static284.aShort65 < Static62.aShort13) {
							Static284.aShort65 = Static62.aShort13;
						}
						Static462.aShort111 = (short) anIntArray239[anInt3735 + 2];
						if (Static462.aShort111 <= 0) {
							Static462.aShort111 = 1;
						}
						Static123.aShort21 = (short) anIntArray239[anInt3735 + 3];
						if (Static123.aShort21 <= 0) {
							Static123.aShort21 = 32767;
							return;
						}
						if (Static123.aShort21 < Static462.aShort111) {
							Static123.aShort21 = Static462.aShort111;
						}
						return;
					}
					if (arg0 == 6203) {
						Static296.method4220(Static135.aClass82_9.anInt2192, 0, 0, Static135.aClass82_9.anInt2216, false);
						anIntArray239[anInt3735++] = Static72.anInt1324;
						anIntArray239[anInt3735++] = Static360.anInt6141;
						return;
					}
					if (arg0 == 6204) {
						anIntArray239[anInt3735++] = Static110.aShort20;
						anIntArray239[anInt3735++] = Static263.aShort93;
						return;
					}
					if (arg0 == 6205) {
						anIntArray239[anInt3735++] = Static108.aShort19;
						anIntArray239[anInt3735++] = Static366.aShort89;
						return;
					}
				} else if (arg0 < 6400) {
					if (arg0 == 6300) {
						anIntArray239[anInt3735++] = (int) (Static354.method4966() / 60000L);
						return;
					}
					if (arg0 == 6301) {
						anIntArray239[anInt3735++] = (int) (Static354.method4966() / 86400000L) - 11745;
						return;
					}
					if (arg0 == 6302) {
						anInt3735 -= 3;
						local157 = anIntArray239[anInt3735];
						local192 = anIntArray239[anInt3735 + 1];
						local89 = anIntArray239[anInt3735 + 2];
						aCalendar2.clear();
						aCalendar2.set(11, 12);
						aCalendar2.set(local89, local192, local157);
						local95 = (int) (aCalendar2.getTime().getTime() / 86400000L) - 11745;
						if (local89 < 1970) {
							local95--;
						}
						anIntArray239[anInt3735++] = local95;
						return;
					}
					if (arg0 == 6303) {
						aCalendar2.clear();
						aCalendar2.setTime(new Date(Static354.method4966()));
						anIntArray239[anInt3735++] = aCalendar2.get(1);
						return;
					}
					if (arg0 == 6304) {
						local157 = anIntArray239[--anInt3735];
						local1313 = true;
						if (local157 < 0) {
							local1313 = (local157 + 1) % 4 == 0;
						} else if (local157 < 1582) {
							local1313 = local157 % 4 == 0;
						} else if (local157 % 4 != 0) {
							local1313 = false;
						} else if (local157 % 100 != 0) {
							local1313 = true;
						} else if (local157 % 400 != 0) {
							local1313 = false;
						}
						anIntArray239[anInt3735++] = local1313 ? 1 : 0;
						return;
					}
				} else if (arg0 < 6500) {
					if (arg0 == 6405) {
						anIntArray239[anInt3735++] = Static168.method2582() ? 1 : 0;
						return;
					}
					if (arg0 == 6406) {
						anIntArray239[anInt3735++] = Static266.method3702() ? 1 : 0;
						return;
					}
				} else if (arg0 < 6600) {
					if (arg0 == 6500) {
						if (Static345.anInt5823 == 6 && Static423.anInt7131 == 0 && Static238.anInt4081 == 0) {
							if (Static89.aBoolean107) {
								anIntArray239[anInt3735++] = 0;
								return;
							}
							if (Static238.aLong141 > Static354.method4966() - 1000L) {
								anIntArray239[anInt3735++] = 1;
								return;
							}
							Static89.aBoolean107 = true;
							Static307.method4633(Static192.aClass163_92);
							Static243.aClass3_Sub25_Sub1_7.method4082(Static93.anInt1699);
							anIntArray239[anInt3735++] = 0;
							return;
						}
						anIntArray239[anInt3735++] = 1;
						return;
					}
					@Pc(6414) Class91 local6414;
					@Pc(6381) Class41_Sub1 local6381;
					if (arg0 == 6501) {
						local6381 = Static330.method4581();
						if (local6381 != null) {
							anIntArray239[anInt3735++] = local6381.anInt7107;
							anIntArray239[anInt3735++] = local6381.anInt7095;
							aStringArray22[anInt3736++] = local6381.aString66;
							local6414 = local6381.method5757();
							anIntArray239[anInt3735++] = local6414.anInt2418;
							aStringArray22[anInt3736++] = local6414.aString35;
							anIntArray239[anInt3735++] = local6381.anInt7094;
							anIntArray239[anInt3735++] = local6381.anInt7104;
							aStringArray22[anInt3736++] = local6381.aString65;
							return;
						}
						anIntArray239[anInt3735++] = -1;
						anIntArray239[anInt3735++] = 0;
						aStringArray22[anInt3736++] = "";
						anIntArray239[anInt3735++] = 0;
						aStringArray22[anInt3736++] = "";
						anIntArray239[anInt3735++] = 0;
						anIntArray239[anInt3735++] = 0;
						aStringArray22[anInt3736++] = "";
						return;
					}
					if (arg0 == 6502) {
						local6381 = Static419.method5746();
						if (local6381 != null) {
							anIntArray239[anInt3735++] = local6381.anInt7107;
							anIntArray239[anInt3735++] = local6381.anInt7095;
							aStringArray22[anInt3736++] = local6381.aString66;
							local6414 = local6381.method5757();
							anIntArray239[anInt3735++] = local6414.anInt2418;
							aStringArray22[anInt3736++] = local6414.aString35;
							anIntArray239[anInt3735++] = local6381.anInt7094;
							anIntArray239[anInt3735++] = local6381.anInt7104;
							aStringArray22[anInt3736++] = local6381.aString65;
							return;
						}
						anIntArray239[anInt3735++] = -1;
						anIntArray239[anInt3735++] = 0;
						aStringArray22[anInt3736++] = "";
						anIntArray239[anInt3735++] = 0;
						aStringArray22[anInt3736++] = "";
						anIntArray239[anInt3735++] = 0;
						anIntArray239[anInt3735++] = 0;
						aStringArray22[anInt3736++] = "";
						return;
					}
					if (arg0 == 6503) {
						local157 = anIntArray239[--anInt3735];
						local81 = aStringArray22[--anInt3736];
						if (Static345.anInt5823 == 6 && Static423.anInt7131 == 0 && Static238.anInt4081 == 0) {
							anIntArray239[anInt3735++] = Static68.method1256(local81, local157) ? 1 : 0;
							return;
						}
						anIntArray239[anInt3735++] = 0;
						return;
					}
					if (arg0 == 6504) {
						Static39.aClass79_Sub1_1.anInt2151 = anIntArray239[--anInt3735];
						Static39.aClass79_Sub1_1.method1953(Static32.aClass51_1);
						return;
					}
					if (arg0 == 6505) {
						anIntArray239[anInt3735++] = Static39.aClass79_Sub1_1.anInt2151;
						return;
					}
					if (arg0 == 6506) {
						local157 = anIntArray239[--anInt3735];
						@Pc(6771) Class41_Sub1 local6771 = Static157.method2462(local157);
						if (local6771 != null) {
							anIntArray239[anInt3735++] = local6771.anInt7095;
							aStringArray22[anInt3736++] = local6771.aString66;
							@Pc(6795) Class91 local6795 = local6771.method5757();
							anIntArray239[anInt3735++] = local6795.anInt2418;
							aStringArray22[anInt3736++] = local6795.aString35;
							anIntArray239[anInt3735++] = local6771.anInt7094;
							anIntArray239[anInt3735++] = local6771.anInt7104;
							aStringArray22[anInt3736++] = local6771.aString65;
							return;
						}
						anIntArray239[anInt3735++] = -1;
						aStringArray22[anInt3736++] = "";
						anIntArray239[anInt3735++] = 0;
						aStringArray22[anInt3736++] = "";
						anIntArray239[anInt3735++] = 0;
						anIntArray239[anInt3735++] = 0;
						aStringArray22[anInt3736++] = "";
						return;
					}
					if (arg0 == 6507) {
						anInt3735 -= 4;
						local157 = anIntArray239[anInt3735];
						local1313 = anIntArray239[anInt3735 + 1] == 1;
						local89 = anIntArray239[anInt3735 + 2];
						local1965 = anIntArray239[anInt3735 + 3] == 1;
						Static17.method325(local1965, local1313, local157, local89);
						return;
					}
					if (arg0 == 6508) {
						Static18.method334();
						return;
					}
					if (arg0 == 6509) {
						if (Static345.anInt5823 != 6) {
							return;
						}
						Static110.aBoolean118 = anIntArray239[--anInt3735] == 1;
						return;
					}
				} else if (arg0 < 6700) {
					if (arg0 == 6600) {
						Static39.aClass79_Sub1_1.aBoolean160 = anIntArray239[--anInt3735] == 1;
						Static39.aClass79_Sub1_1.method1953(Static32.aClass51_1);
						return;
					}
					if (arg0 == 6601) {
						anIntArray239[anInt3735++] = Static39.aClass79_Sub1_1.aBoolean160 ? 1 : 0;
						return;
					}
				} else if (arg0 < 6800 && Static415.aClass267_4 == Static13.aClass267_1) {
					if (arg0 == 6700) {
						local157 = Static32.aClass140_5.method3492();
						if (Static343.anInt5785 != -1) {
							local157++;
						}
						anIntArray239[anInt3735++] = local157;
						return;
					}
					if (arg0 == 6701) {
						local157 = anIntArray239[--anInt3735];
						if (Static343.anInt5785 != -1) {
							if (local157 == 0) {
								anIntArray239[anInt3735++] = Static343.anInt5785;
								return;
							}
							local157--;
						}
						@Pc(7070) Class3_Sub10 local7070 = (Class3_Sub10) Static32.aClass140_5.method3486();
						while (local157-- > 0) {
							local7070 = (Class3_Sub10) Static32.aClass140_5.method3485();
						}
						anIntArray239[anInt3735++] = local7070.anInt827;
						return;
					}
					if (arg0 == 6702) {
						local157 = anIntArray239[--anInt3735];
						if (Static298.aClass82ArrayArray2[local157] == null) {
							aStringArray22[anInt3736++] = "";
							return;
						}
						local81 = Static298.aClass82ArrayArray2[local157][0].aString32;
						if (local81 == null) {
							aStringArray22[anInt3736++] = "";
							return;
						}
						aStringArray22[anInt3736++] = local81.substring(0, local81.indexOf(58));
						return;
					}
					if (arg0 == 6703) {
						local157 = anIntArray239[--anInt3735];
						if (Static298.aClass82ArrayArray2[local157] == null) {
							anIntArray239[anInt3735++] = 0;
							return;
						}
						anIntArray239[anInt3735++] = Static298.aClass82ArrayArray2[local157].length;
						return;
					}
					if (arg0 == 6704) {
						anInt3735 -= 2;
						local157 = anIntArray239[anInt3735];
						local192 = anIntArray239[anInt3735 + 1];
						if (Static298.aClass82ArrayArray2[local157] == null) {
							aStringArray22[anInt3736++] = "";
							return;
						}
						local3351 = Static298.aClass82ArrayArray2[local157][local192].aString32;
						if (local3351 == null) {
							aStringArray22[anInt3736++] = "";
							return;
						}
						aStringArray22[anInt3736++] = local3351;
						return;
					}
					if (arg0 == 6705) {
						anInt3735 -= 2;
						local157 = anIntArray239[anInt3735];
						local192 = anIntArray239[anInt3735 + 1];
						if (Static298.aClass82ArrayArray2[local157] == null) {
							anIntArray239[anInt3735++] = 0;
							return;
						}
						anIntArray239[anInt3735++] = Static298.aClass82ArrayArray2[local157][local192].anInt2190;
						return;
					}
					if (arg0 == 6706) {
						return;
					}
					if (arg0 == 6707) {
						anInt3735 -= 3;
						local157 = anIntArray239[anInt3735];
						local192 = anIntArray239[anInt3735 + 1];
						local89 = anIntArray239[anInt3735 + 2];
						Static300.method4283(local157 << 16 | local192, "", 1, local89);
						return;
					}
					if (arg0 == 6708) {
						anInt3735 -= 3;
						local157 = anIntArray239[anInt3735];
						local192 = anIntArray239[anInt3735 + 1];
						local89 = anIntArray239[anInt3735 + 2];
						Static300.method4283(local157 << 16 | local192, "", 2, local89);
						return;
					}
					if (arg0 == 6709) {
						anInt3735 -= 3;
						local157 = anIntArray239[anInt3735];
						local192 = anIntArray239[anInt3735 + 1];
						local89 = anIntArray239[anInt3735 + 2];
						Static300.method4283(local157 << 16 | local192, "", 3, local89);
						return;
					}
					if (arg0 == 6710) {
						anInt3735 -= 3;
						local157 = anIntArray239[anInt3735];
						local192 = anIntArray239[anInt3735 + 1];
						local89 = anIntArray239[anInt3735 + 2];
						Static300.method4283(local157 << 16 | local192, "", 4, local89);
						return;
					}
					if (arg0 == 6711) {
						anInt3735 -= 3;
						local157 = anIntArray239[anInt3735];
						local192 = anIntArray239[anInt3735 + 1];
						local89 = anIntArray239[anInt3735 + 2];
						Static300.method4283(local157 << 16 | local192, "", 5, local89);
						return;
					}
					if (arg0 == 6712) {
						anInt3735 -= 3;
						local157 = anIntArray239[anInt3735];
						local192 = anIntArray239[anInt3735 + 1];
						local89 = anIntArray239[anInt3735 + 2];
						Static300.method4283(local157 << 16 | local192, "", 6, local89);
						return;
					}
					if (arg0 == 6713) {
						anInt3735 -= 3;
						local157 = anIntArray239[anInt3735];
						local192 = anIntArray239[anInt3735 + 1];
						local89 = anIntArray239[anInt3735 + 2];
						Static300.method4283(local157 << 16 | local192, "", 7, local89);
						return;
					}
					if (arg0 == 6714) {
						anInt3735 -= 3;
						local157 = anIntArray239[anInt3735];
						local192 = anIntArray239[anInt3735 + 1];
						local89 = anIntArray239[anInt3735 + 2];
						Static300.method4283(local157 << 16 | local192, "", 8, local89);
						return;
					}
					if (arg0 == 6715) {
						anInt3735 -= 3;
						local157 = anIntArray239[anInt3735];
						local192 = anIntArray239[anInt3735 + 1];
						local89 = anIntArray239[anInt3735 + 2];
						Static300.method4283(local157 << 16 | local192, "", 9, local89);
						return;
					}
					if (arg0 == 6716) {
						anInt3735 -= 3;
						local157 = anIntArray239[anInt3735];
						local192 = anIntArray239[anInt3735 + 1];
						local89 = anIntArray239[anInt3735 + 2];
						Static300.method4283(local157 << 16 | local192, "", 10, local89);
						return;
					}
					if (arg0 == 6717) {
						anInt3735 -= 3;
						local157 = anIntArray239[anInt3735];
						local192 = anIntArray239[anInt3735 + 1];
						local89 = anIntArray239[anInt3735 + 2];
						@Pc(7658) Class82 local7658 = Static360.method5048(local89, local157 << 16 | local192);
						Static178.method2853();
						@Pc(7663) Class3_Sub42 local7663 = Static54.method1060(local7658);
						Static294.method4202(local7663.method5454(), local7658, local7663.anInt6590);
						return;
					}
				} else if (arg0 < 6900) {
					@Pc(7691) Class152 local7691;
					if (arg0 == 6800) {
						local157 = anIntArray239[--anInt3735];
						local7691 = Static212.aClass45_3.method1255(local157);
						if (local7691.aString49 == null) {
							aStringArray22[anInt3736++] = "";
							return;
						}
						aStringArray22[anInt3736++] = local7691.aString49;
						return;
					}
					if (arg0 == 6801) {
						local157 = anIntArray239[--anInt3735];
						local7691 = Static212.aClass45_3.method1255(local157);
						anIntArray239[anInt3735++] = local7691.anInt4321;
						return;
					}
					if (arg0 == 6802) {
						local157 = anIntArray239[--anInt3735];
						local7691 = Static212.aClass45_3.method1255(local157);
						anIntArray239[anInt3735++] = local7691.anInt4332;
						return;
					}
					if (arg0 == 6803) {
						local157 = anIntArray239[--anInt3735];
						local7691 = Static212.aClass45_3.method1255(local157);
						anIntArray239[anInt3735++] = local7691.anInt4347;
						return;
					}
					if (arg0 == 6804) {
						anInt3735 -= 2;
						local157 = anIntArray239[anInt3735];
						local192 = anIntArray239[anInt3735 + 1];
						@Pc(7813) Class32 local7813 = Static70.aClass15_1.method323(local192);
						if (local7813.method879()) {
							aStringArray22[anInt3736++] = Static212.aClass45_3.method1255(local157).method3606(local7813.aString5, local192);
							return;
						}
						anIntArray239[anInt3735++] = Static212.aClass45_3.method1255(local157).method3610(local192, local7813.anInt813);
						return;
					}
				} else if (arg0 < 7000) {
					if (arg0 == 6900) {
						anIntArray239[anInt3735++] = Static61.aBoolean81 && !Static177.aBoolean251 ? 1 : 0;
						return;
					}
					if (arg0 == 6901) {
						anIntArray239[anInt3735++] = Static174.anInt3262;
						return;
					}
					if (arg0 == 6902) {
						anIntArray239[anInt3735++] = Static125.anInt2285;
						return;
					}
					if (arg0 == 6903) {
						anIntArray239[anInt3735++] = Static421.anInt7116;
						return;
					}
					if (arg0 == 6904) {
						anIntArray239[anInt3735++] = Static338.anInt5687;
						return;
					}
					if (arg0 == 6905) {
						local75 = "";
						if (Static232.aClass181_5 != null) {
							if (Static232.aClass181_5.anObject7 == null) {
								local75 = Static442.method6044(Static232.aClass181_5.anInt5296);
							} else {
								local75 = (String) Static232.aClass181_5.anObject7;
							}
						}
						aStringArray22[anInt3736++] = local75;
						return;
					}
					if (arg0 == 6906) {
						anIntArray239[anInt3735++] = Static442.anInt7411;
						return;
					}
					if (arg0 == 6907) {
						anIntArray239[anInt3735++] = Static81.anInt1470;
						return;
					}
					if (arg0 == 6908) {
						anIntArray239[anInt3735++] = Static400.anInt6615;
						return;
					}
					if (arg0 == 6909) {
						anIntArray239[anInt3735++] = Static130.aBoolean183 ? 1 : 0;
						return;
					}
					if (arg0 == 6910) {
						anIntArray239[anInt3735++] = Static110.anInt1958;
						return;
					}
				}
			}
		}
		throw new IllegalStateException(String.valueOf(arg0));
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(Lclient!eq;)V")
	public static void method3217(@OriginalArg(0) Class3_Sub15 arg0) {
		method3213(arg0, 200000);
	}
}
