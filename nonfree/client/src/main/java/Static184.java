import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static184 {

	@OriginalMember(owner = "client!ob", name = "f", descriptor = "Lclient!km;")
	public static Class91 aClass91_147;

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "I")
	public static int anInt3815 = 255;

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(B)V")
	public static void method3066() {
		if (Static23.anInt469 == 0) {
			return;
		}
		try {
			if (++Static22.anInt454 > 1500) {
				if (Static87.aClass113_1 != null) {
					Static87.aClass113_1.method3019();
					Static87.aClass113_1 = null;
				}
				if (Static274.anInt5342 >= 1) {
					Static113.anInt2602 = -5;
					Static23.anInt469 = 0;
					return;
				}
				Static23.anInt469 = 1;
				Static22.anInt454 = 0;
				Static274.anInt5342++;
				if (Static13.anInt258 == Static293.anInt5140) {
					Static13.anInt258 = Static189.anInt3908;
				} else {
					Static13.anInt258 = Static293.anInt5140;
				}
			}
			if (Static23.anInt469 == 1) {
				Static192.aClass116_3 = Static253.aClass175_4.method4326(Static13.anInt258, Static83.aString106);
				Static23.anInt469 = 2;
			}
			@Pc(130) int local130;
			if (Static23.anInt469 == 2) {
				if (Static192.aClass116_3.anInt3812 == 2) {
					throw new IOException();
				}
				if (Static192.aClass116_3.anInt3812 != 1) {
					return;
				}
				Static87.aClass113_1 = new Class113((Socket) Static192.aClass116_3.anObject5, Static253.aClass175_4);
				Static192.aClass116_3 = null;
				Static87.aClass113_1.method3017(Static283.aClass1_Sub11_Sub1_3.anInt3264, Static283.aClass1_Sub11_Sub1_3.aByteArray47);
				if (Static214.aClass52_2 != null) {
					Static214.aClass52_2.method4080();
				}
				if (Static117.aClass52_1 != null) {
					Static117.aClass52_1.method4080();
				}
				local130 = Static87.aClass113_1.method3012();
				if (Static214.aClass52_2 != null) {
					Static214.aClass52_2.method4080();
				}
				if (Static117.aClass52_1 != null) {
					Static117.aClass52_1.method4080();
				}
				if (local130 != 101) {
					Static113.anInt2602 = local130;
					Static23.anInt469 = 0;
					Static87.aClass113_1.method3019();
					Static87.aClass113_1 = null;
					return;
				}
				Static23.anInt469 = 3;
			}
			if (Static23.anInt469 == 3) {
				if (Static87.aClass113_1.method3014() < 2) {
					return;
				}
				local130 = Static87.aClass113_1.method3012() << 8 | Static87.aClass113_1.method3012();
				Static5.method202(local130);
				if (Static33.anInt764 == -1) {
					Static113.anInt2602 = 6;
					Static23.anInt469 = 0;
					Static87.aClass113_1.method3019();
					Static87.aClass113_1 = null;
					return;
				}
				Static23.anInt469 = 0;
				Static87.aClass113_1.method3019();
				Static87.aClass113_1 = null;
				Static88.method1534();
				return;
			}
		} catch (@Pc(210) IOException local210) {
			if (Static87.aClass113_1 != null) {
				Static87.aClass113_1.method3019();
				Static87.aClass113_1 = null;
			}
			if (Static274.anInt5342 < 1) {
				Static22.anInt454 = 0;
				Static23.anInt469 = 1;
				Static274.anInt5342++;
				if (Static293.anInt5140 == Static13.anInt258) {
					Static13.anInt258 = Static189.anInt3908;
				} else {
					Static13.anInt258 = Static293.anInt5140;
				}
			} else {
				Static113.anInt2602 = -4;
				Static23.anInt469 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(I[ILclient!sc;[I[I)V")
	public static void method3067(@OriginalArg(1) int[] arg0, @OriginalArg(2) Class14_Sub2_Sub2 arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int[] arg3) {
		for (@Pc(3) int local3 = 0; local3 < arg2.length; local3++) {
			@Pc(11) int local11 = arg2[local3];
			@Pc(15) int local15 = arg3[local3];
			@Pc(19) int local19 = arg0[local3];
			for (@Pc(21) int local21 = 0; local19 != 0 && arg1.aClass3Array3.length > local21; local21++) {
				if ((local19 & 0x1) != 0) {
					if (local11 == -1) {
						arg1.aClass3Array3[local21] = null;
					} else {
						@Pc(57) Class125 local57 = Static90.method1591(local11);
						@Pc(60) int local60 = local57.anInt3941;
						@Pc(65) Class3 local65 = arg1.aClass3Array3[local21];
						if (local65 != null) {
							if (local65.anInt110 == local11) {
								if (local60 == 0) {
									local65 = arg1.aClass3Array3[local21] = null;
								} else if (local60 == 1) {
									local65.anInt102 = 0;
									local65.anInt104 = 0;
									local65.anInt103 = 0;
									local65.anInt101 = 1;
									local65.anInt105 = local15;
									Static77.method1354(0, false, arg1.anInt4680, local57, arg1.anInt4630);
								} else if (local60 == 2) {
									local65.anInt104 = 0;
								}
							} else if (local57.anInt3944 >= Static90.method1591(local65.anInt110).anInt3944) {
								local65 = arg1.aClass3Array3[local21] = null;
							}
						}
						if (local65 == null) {
							local65 = arg1.aClass3Array3[local21] = new Class3();
							local65.anInt105 = local15;
							local65.anInt110 = local11;
							local65.anInt103 = 0;
							local65.anInt102 = 0;
							local65.anInt104 = 0;
							local65.anInt101 = 1;
							Static77.method1354(0, false, arg1.anInt4680, local57, arg1.anInt4630);
						}
					}
				}
				local19 >>>= 0x1;
			}
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(ZLjava/lang/String;I)I")
	public static int method3069(@OriginalArg(1) String arg0) {
		return Static22.method421(16, arg0);
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(II)V")
	public static void method3070(@OriginalArg(1) int arg0) {
		@Pc(8) Class1_Sub2_Sub18 local8 = Static130.method2227(arg0, 2);
		local8.method3911();
	}
}
