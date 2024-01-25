import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static179 {

	@OriginalMember(owner = "client!ga", name = "b", descriptor = "I")
	private static int anInt3643 = 0;

	@OriginalMember(owner = "client!ga", name = "c", descriptor = "Z")
	private static boolean aBoolean300 = false;

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "Lclient!tf;")
	private static final Class340 aClass340_25 = new Class340();

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(Lclient!e;I)V")
	public static synchronized void method3406(@OriginalArg(0) Interface12 arg0) {
		if (aBoolean300) {
			return;
		}
		if (anInt3643 <= 0) {
			arg0.w(false);
		} else {
			@Pc(25) Class6_Sub19 local25 = new Class6_Sub19();
			local25.anInterface12_1 = arg0;
			aClass340_25.method8131(local25);
		}
	}

	@OriginalMember(owner = "client!ga", name = "b", descriptor = "(B)V")
	public static synchronized void method3407() {
		anInt3643--;
		if (anInt3643 == 0) {
			method3409();
		}
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(I)V")
	public static synchronized void method3408() {
		anInt3643++;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(B)V")
	public static synchronized void method3409() {
		while (true) {
			@Pc(12) Class6_Sub19 local12 = (Class6_Sub19) aClass340_25.method8127();
			if (local12 == null) {
				return;
			}
			local12.anInterface12_1.w(true);
			local12.method9051();
		}
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(BZ)V")
	public static synchronized void method3410() {
		aBoolean300 = true;
	}
}
