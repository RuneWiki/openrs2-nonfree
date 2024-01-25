import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static328 {

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "Lclient!ki;")
	private static final Class183 aClass183_41 = new Class183();

	@OriginalMember(owner = "client!ml", name = "b", descriptor = "Z")
	private static boolean aBoolean581 = false;

	@OriginalMember(owner = "client!ml", name = "c", descriptor = "I")
	private static int anInt6817 = 0;

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(ZI)V")
	public static synchronized void method5680() {
		aBoolean581 = true;
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(I)V")
	public static synchronized void method5681() {
		anInt6817++;
	}

	@OriginalMember(owner = "client!ml", name = "b", descriptor = "(I)V")
	public static synchronized void method5682() {
		anInt6817--;
		if (anInt6817 == 0) {
			method5684();
		}
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(ILclient!g;)V")
	public static synchronized void method5683(@OriginalArg(1) Interface5 arg0) {
		if (aBoolean581) {
			return;
		}
		if (anInt6817 <= 0) {
			arg0.H(false);
		} else {
			@Pc(20) Class3_Sub35 local20 = new Class3_Sub35();
			local20.anInterface5_1 = arg0;
			aClass183_41.method4792(local20);
		}
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(B)V")
	public static synchronized void method5684() {
		while (true) {
			@Pc(4) Class3_Sub35 local4 = (Class3_Sub35) aClass183_41.method4797();
			if (local4 == null) {
				return;
			}
			local4.anInterface5_1.H(true);
			local4.method8412();
		}
	}
}
