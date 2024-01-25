import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static12 {

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "I")
	private static int anInt185 = 0;

	@OriginalMember(owner = "client!ah", name = "b", descriptor = "Z")
	private static boolean aBoolean16 = false;

	@OriginalMember(owner = "client!ah", name = "c", descriptor = "Lclient!ifa;")
	private static final Class163 aClass163_4 = new Class163();

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(I)V")
	public static synchronized void method229() {
		while (true) {
			@Pc(9) Class4_Sub51 local9 = (Class4_Sub51) aClass163_4.method3644();
			if (local9 == null) {
				return;
			}
			local9.anInterface10_1.w(true);
			local9.method9000();
		}
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(BLclient!e;)V")
	public static synchronized void method230(@OriginalArg(1) Interface10 arg0) {
		if (aBoolean16) {
			return;
		}
		if (anInt185 <= 0) {
			arg0.w(false);
		} else {
			@Pc(19) Class4_Sub51 local19 = new Class4_Sub51();
			local19.anInterface10_1 = arg0;
			aClass163_4.method3646(local19);
		}
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(Z)V")
	public static synchronized void method231() {
		anInt185++;
	}

	@OriginalMember(owner = "client!ah", name = "b", descriptor = "(I)V")
	public static synchronized void method232() {
		anInt185--;
		if (anInt185 == 0) {
			method229();
		}
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(ZB)V")
	public static synchronized void method233() {
		aBoolean16 = true;
	}
}
