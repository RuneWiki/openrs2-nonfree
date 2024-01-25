import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static184 {

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "Lclient!ws;")
	private static final Class361 aClass361_26 = new Class361();

	@OriginalMember(owner = "client!hf", name = "b", descriptor = "I")
	private static int anInt3843 = 0;

	@OriginalMember(owner = "client!hf", name = "c", descriptor = "Z")
	private static boolean aBoolean259 = false;

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(IZ)V")
	public static synchronized void method3376() {
		aBoolean259 = true;
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(I)V")
	public static synchronized void method3377() {
		anInt3843--;
		if (anInt3843 == 0) {
			method3378();
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(B)V")
	public static synchronized void method3378() {
		while (true) {
			@Pc(4) Class6_Sub26 local4 = (Class6_Sub26) aClass361_26.method7835();
			if (local4 == null) {
				return;
			}
			local4.anInterface9_1.H(true);
			local4.method7804();
		}
	}

	@OriginalMember(owner = "client!hf", name = "b", descriptor = "(I)V")
	public static synchronized void method3379() {
		anInt3843++;
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(BLclient!g;)V")
	public static synchronized void method3380(@OriginalArg(1) Interface9 arg0) {
		if (aBoolean259) {
			return;
		}
		if (anInt3843 <= 0) {
			arg0.H(false);
		} else {
			@Pc(16) Class6_Sub26 local16 = new Class6_Sub26();
			local16.anInterface9_1 = arg0;
			aClass361_26.method7833(local16);
		}
	}
}
