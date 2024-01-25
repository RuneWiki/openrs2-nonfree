import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static33 {

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "I")
	private static int anInt448 = 0;

	@OriginalMember(owner = "client!bb", name = "b", descriptor = "Lclient!ga;")
	private static final Class124 aClass124_6 = new Class124();

	@OriginalMember(owner = "client!bb", name = "c", descriptor = "Z")
	private static boolean aBoolean18 = false;

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(I)V")
	public static synchronized void method427() {
		anInt448++;
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(BZ)V")
	public static synchronized void method428() {
		aBoolean18 = true;
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(ILclient!e;)V")
	public static synchronized void method429(@OriginalArg(1) Interface5 arg0) {
		if (aBoolean18) {
			return;
		}
		if (anInt448 <= 0) {
			arg0.w(false);
		} else {
			@Pc(17) Class5_Sub41 local17 = new Class5_Sub41();
			local17.anInterface5_1 = arg0;
			aClass124_6.method2574(local17);
		}
	}

	@OriginalMember(owner = "client!bb", name = "b", descriptor = "(I)V")
	public static synchronized void method430() {
		while (true) {
			@Pc(4) Class5_Sub41 local4 = (Class5_Sub41) aClass124_6.method2571();
			if (local4 == null) {
				return;
			}
			local4.anInterface5_1.w(true);
			local4.method8829();
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(B)V")
	public static synchronized void method431() {
		anInt448--;
		if (anInt448 == 0) {
			method430();
		}
	}
}
