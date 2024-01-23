import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static293 {

	@OriginalMember(owner = "client!wf", name = "P", descriptor = "Ljava/awt/FontMetrics;")
	public static FontMetrics aFontMetrics1;

	@OriginalMember(owner = "client!wf", name = "S", descriptor = "I")
	public static int anInt5832;

	@OriginalMember(owner = "client!wf", name = "R", descriptor = "I")
	public static int anInt5831 = 0;

	@OriginalMember(owner = "client!wf", name = "T", descriptor = "I")
	public static int anInt5833 = 0;

	@OriginalMember(owner = "client!wf", name = "Y", descriptor = "I")
	public static int anInt5837 = -1;

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(ZLjava/lang/String;)Z")
	public static boolean method4495(@OriginalArg(1) String arg0) {
		return Static179.method2689(arg0);
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(IIBII)I")
	public static int method4496(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(21) int local21 = 65536 - Class135.anIntArray474[arg3 * 1024 / arg1] >> 1;
		return (local21 * arg0 >> 16) + ((65536 - local21) * arg2 >> 16);
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(I[BII)Z")
	public static boolean method4497(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) boolean local12 = true;
		@Pc(17) Class1_Sub18 local17 = new Class1_Sub18(arg0);
		@Pc(19) int local19 = -1;
		label70: while (true) {
			@Pc(23) int local23 = local17.method3096();
			if (local23 == 0) {
				return local12;
			}
			local19 += local23;
			@Pc(31) int local31 = 0;
			@Pc(33) boolean local33 = false;
			while (true) {
				@Pc(74) int local74;
				@Pc(93) Class104 local93;
				do {
					@Pc(64) int local64;
					@Pc(68) int local68;
					do {
						do {
							do {
								do {
									@Pc(39) int local39;
									while (local33) {
										local39 = local17.method3117();
										if (local39 == 0) {
											continue label70;
										}
										local17.method3122();
									}
									local39 = local17.method3117();
									if (local39 == 0) {
										continue label70;
									}
									local31 += local39 - 1;
									@Pc(54) int local54 = local31 & 0x3F;
									@Pc(60) int local60 = local31 >> 6 & 0x3F;
									local64 = local60 + arg2;
									local68 = arg1 + local54;
									local74 = local17.method3122() >> 2;
								} while (local64 <= 0);
							} while (local68 <= 0);
						} while (local64 >= 103);
					} while (local68 >= 103);
					local93 = Static35.method636(local19);
				} while (local74 == 22 && !Static287.aBoolean429 && local93.anInt2803 == 0 && local93.anInt2810 != 1 && !local93.aBoolean199);
				local33 = true;
				if (!local93.method2361()) {
					Static298.anInt5902++;
					local12 = false;
				}
			}
		}
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(IB)V")
	public static void method4499(@OriginalArg(0) int arg0) {
		Static118.method1858();
		Static57.method937();
		@Pc(16) int local16 = Static173.method2623(arg0).anInt5451;
		if (local16 == 0) {
			return;
		}
		@Pc(26) int local26 = Static224.anIntArray535[arg0];
		if (local16 == 6) {
			Static261.anInt5256 = local26;
		}
		if (local16 == 9) {
			Static207.anInt4127 = local26;
		}
		if (local16 == 5) {
			Static276.anInt5540 = local26;
		}
	}
}
