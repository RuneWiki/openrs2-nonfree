import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static228 {

	@OriginalMember(owner = "client!jd", name = "I", descriptor = "Lclient!pq;")
	public static Class251 aClass251_74;

	@OriginalMember(owner = "client!jd", name = "D", descriptor = "I")
	public static int anInt3904 = 0;

	@OriginalMember(owner = "client!jd", name = "b", descriptor = "(IB)Lclient!lt;")
	public static Class102_Sub2 method3369(@OriginalArg(0) int arg0) {
		@Pc(12) Class249[] local12 = Class45.aClass249Array3;
		synchronized (Class45.aClass249Array3) {
			@Pc(35) Class102_Sub2 local35;
			if (Class45.aClass249Array3.length <= arg0 || Class45.aClass249Array3[arg0].method5816()) {
				local35 = new Class102_Sub2();
				local35.aClass102_Sub5Array1 = new Class102_Sub5[arg0];
				for (@Pc(57) int local57 = 0; local57 < arg0; local57++) {
					local35.aClass102_Sub5Array1[local57] = new Class102_Sub5();
				}
			} else {
				local35 = (Class102_Sub2) Class45.aClass249Array3[arg0].method5811();
				local35.method7587();
				@Pc(42) int local42 = Static98.anIntArray234[arg0]--;
			}
			return local35;
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(Z)V")
	public static void method3370() {
		Static99.method1593(11);
		Static543.method7509();
		System.gc();
	}
}
