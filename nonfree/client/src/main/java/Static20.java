import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static20 {

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(Lclient!f;B)V")
	public static void method604(@OriginalArg(0) Class6_Sub5_Sub11 arg0) {
		@Pc(11) boolean local11 = false;
		arg0.method7748();
		for (@Pc(19) Class6_Sub5_Sub11 local19 = (Class6_Sub5_Sub11) Static224.aClass231_5.method6055(); local19 != null; local19 = (Class6_Sub5_Sub11) Static224.aClass231_5.method6050()) {
			if (Static644.method8779(arg0.method2843(), local19.method2843())) {
				local11 = true;
				Static104.method2431(local19, arg0);
				break;
			}
		}
		if (!local11) {
			Static224.aClass231_5.method6048(arg0);
		}
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "()V")
	public static void method609() {
		while (true) {
			@Pc(1) boolean local1 = true;
			@Pc(3) int local3;
			for (local3 = 0; local3 < Static93.aClass188Array1.length; local3++) {
				if (Static93.aClass188Array1[local3].method5371()) {
					Static637.aLongArray10[local3] = Static93.aClass188Array1[local3].method5370();
				} else {
					synchronized (Static93.aClass188Array1[local3]) {
						Static93.aClass188Array1[local3].notify();
					}
					local1 = false;
				}
			}
			if (local1) {
				Static93.aClass188Array1[Static93.aClass188Array1.length - 1].method5369();
				Static130.method8103(1);
				while (true) {
					local1 = true;
					for (local3 = 0; local3 < Static93.aClass188Array1.length - 1; local3++) {
						if (!Static93.aClass188Array1[local3].method5371()) {
							synchronized (Static93.aClass188Array1[local3]) {
								Static93.aClass188Array1[local3].notify();
							}
							local1 = false;
						}
					}
					if (local1) {
						for (@Pc(102) int local102 = 1; local102 < Static93.aClass188Array1.length - 2; local102++) {
							Static93.aClass188Array1[local102].method5369();
						}
						Static130.method8103(2);
						while (!Static93.aClass188Array1[0].method5371()) {
							synchronized (Static93.aClass188Array1[0]) {
								Static93.aClass188Array1[0].notify();
							}
							try {
								Static344.method5698(1L);
							} catch (@Pc(142) Exception local142) {
							}
						}
						Static93.aClass188Array1[0].method5369();
						return;
					}
					try {
						Static344.method5698(1L);
					} catch (@Pc(99) Exception local99) {
					}
				}
			}
			try {
				Static344.method5698(1L);
			} catch (@Pc(47) Exception local47) {
			}
		}
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(II[Lclient!sba;)V")
	public static void method610(@OriginalArg(0) int arg0, @OriginalArg(2) Class302[] arg1) {
		for (@Pc(11) int local11 = 0; local11 < arg1.length; local11++) {
			@Pc(17) Class302 local17 = arg1[local11];
			if (local17 != null && arg0 == local17.anInt8857 && !Static75.method2146(local17)) {
				if (local17.anInt8936 == 0) {
					method610(local17.anInt8867, arg1);
					if (local17.aClass302Array2 != null) {
						method610(local17.anInt8867, local17.aClass302Array2);
					}
					@Pc(54) Class6_Sub25 local54 = (Class6_Sub25) Static214.aClass380_15.method8747((long) local17.anInt8867);
					if (local54 != null) {
						Static600.method8299(local54.anInt5034);
					}
				}
				if (local17.anInt8936 == 6 && local17.anInt8844 != -1) {
					@Pc(76) Class113 local76 = Static528.aClass198_2.method5706(local17.anInt8844);
					if (local76 != null) {
						local17.anInt8910 += Static492.anInt8597;
						@Pc(87) int local87 = local17.anInt8900;
						while (local17.anInt8910 > local76.anIntArray176[local17.anInt8900]) {
							local17.anInt8910 -= local76.anIntArray176[local17.anInt8900];
							local17.anInt8900++;
							if (local17.anInt8900 >= local76.anIntArray178.length) {
								local17.anInt8900 -= local76.anInt3856;
								if (local17.anInt8900 < 0 || local17.anInt8900 >= local76.anIntArray178.length) {
									local17.anInt8900 = 0;
								}
							}
							local17.anInt8889 = local17.anInt8900 + 1;
							if (local17.anInt8889 >= local76.anIntArray178.length) {
								local17.anInt8889 -= local76.anInt3856;
								if (local17.anInt8889 < 0 || local76.anIntArray178.length <= local17.anInt8889) {
									local17.anInt8889 = -1;
								}
							}
							Static580.method8049(local17);
						}
						if (local87 != local17.anInt8900) {
							Static493.method7164(local17.anInt8900, local76);
						}
					}
				}
			}
		}
	}
}
