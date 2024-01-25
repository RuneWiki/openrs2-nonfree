import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static391 {

	@OriginalMember(owner = "client!tn", name = "e", descriptor = "[Lclient!o;")
	public static Class137[] aClass137Array18;

	@OriginalMember(owner = "client!tn", name = "f", descriptor = "[Lclient!np;")
	public static final Class180[] aClass180Array1 = new Class180[16];

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(IB)Lclient!ui;")
	public static Class248 method5428(@OriginalArg(0) int arg0) {
		@Pc(10) Class248[] local10 = Static346.method4899();
		for (@Pc(12) int local12 = 0; local12 < local10.length; local12++) {
			@Pc(18) Class248 local18 = local10[local12];
			if (local18.anInt7303 == arg0) {
				return local18;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(II)I")
	public static int method5429(@OriginalArg(1) int arg0) {
		@Pc(9) int local9 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
		@Pc(24) int local24 = (local9 & 0x33333333) + ((local9 & 0xCCCCCCCF) >>> 2);
		@Pc(37) int local37 = (local24 >>> 4) + local24 & 0xF0F0F0F;
		@Pc(43) int local43 = local37 + (local37 >>> 8);
		@Pc(49) int local49 = local43 + (local43 >>> 16);
		return local49 & 0xFF;
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(Z)V")
	public static void method5431() {
		for (@Pc(1) int local1 = 0; local1 < Static134.aClass108ArrayArray1.length; local1++) {
			for (@Pc(4) int local4 = 0; local4 < Static134.aClass108ArrayArray1[local1].length; local4++) {
				Static134.aClass108ArrayArray1[local1][local4] = Static201.aClass108_2;
			}
		}
	}
}
