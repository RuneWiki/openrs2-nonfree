import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static228 {

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(ILjava/lang/String;Ljava/io/File;)V")
	public static void method4099(@OriginalArg(1) String arg0, @OriginalArg(2) File arg1) {
		Static311.aHashtable4.put(arg0, arg1);
	}

	@OriginalMember(owner = "client!jl", name = "b", descriptor = "(II)Lclient!dj;")
	public static Class66 method4100(@OriginalArg(1) int arg0) {
		if (arg0 == 0) {
			if ((double) Static335.aFloat103 == 3.0D) {
				return Static70.aClass66_1;
			}
			if ((double) Static335.aFloat103 == 4.0D) {
				return Static405.aClass66_8;
			}
			if ((double) Static335.aFloat103 == 6.0D) {
				return Static214.aClass66_6;
			}
			if ((double) Static335.aFloat103 >= 8.0D) {
				return Static269.aClass66_7;
			}
		} else if (arg0 == 1) {
			if ((double) Static335.aFloat103 == 3.0D) {
				return Static214.aClass66_6;
			}
			if ((double) Static335.aFloat103 == 4.0D) {
				return Static269.aClass66_7;
			}
			if ((double) Static335.aFloat103 == 6.0D) {
				return Static89.aClass66_2;
			}
			if ((double) Static335.aFloat103 >= 8.0D) {
				return Static155.aClass66_4;
			}
		} else if (arg0 == 2) {
			if ((double) Static335.aFloat103 == 3.0D) {
				return Static89.aClass66_2;
			}
			if ((double) Static335.aFloat103 == 4.0D) {
				return Static155.aClass66_4;
			}
			if ((double) Static335.aFloat103 == 6.0D) {
				return Static93.aClass66_3;
			}
			if ((double) Static335.aFloat103 >= 8.0D) {
				return Static161.aClass66_5;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(Z[Lclient!et;I)V")
	public static void method4104(@OriginalArg(1) Class91[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(14) int local14 = 0; local14 < arg0.length; local14++) {
			@Pc(20) Class91 local20 = arg0[local14];
			if (local20 != null && arg1 == local20.anInt2375 && !Static63.method1575(local20)) {
				if (local20.anInt2452 == 0) {
					method4104(arg0, local20.anInt2368);
					if (local20.lb != null) {
						method4104(local20.lb, local20.anInt2368);
					}
					@Pc(54) Class1_Sub35 local54 = (Class1_Sub35) Static362.aClass230_45.method6144((long) local20.anInt2368);
					if (local54 != null) {
						Static159.method2884(local54.anInt5502);
					}
				}
				if (local20.anInt2452 == 6 && local20.anInt2424 != -1) {
					@Pc(76) Class176 local76 = Static35.aClass152_1.method4045(local20.anInt2424);
					if (local76 != null) {
						local20.anInt2393 += Static242.anInt4651;
						while (local76.anIntArray433[local20.anInt2369] < local20.anInt2393) {
							local20.anInt2393 -= local76.anIntArray433[local20.anInt2369];
							local20.anInt2369++;
							if (local20.anInt2369 >= local76.anIntArray432.length) {
								local20.anInt2369 -= local76.anInt5288;
								if (local20.anInt2369 < 0 || local20.anInt2369 >= local76.anIntArray432.length) {
									local20.anInt2369 = 0;
								}
							}
							local20.anInt2381 = local20.anInt2369 + 1;
							if (local20.anInt2381 >= local76.anIntArray432.length) {
								local20.anInt2381 -= local76.anInt5288;
								if (local20.anInt2381 < 0 || local76.anIntArray432.length <= local20.anInt2381) {
									local20.anInt2381 = -1;
								}
							}
							Static243.method4316(local20);
						}
					}
				}
			}
		}
	}
}
