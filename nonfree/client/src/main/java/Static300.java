import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static300 {

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "Z")
	private static boolean aBoolean450 = false;

	@OriginalMember(owner = "client!mk", name = "b", descriptor = "Lclient!ui;")
	private static final Class295 aClass295_30 = new Class295();

	@OriginalMember(owner = "client!mk", name = "c", descriptor = "I")
	private static int anInt5852 = 0;

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(I)V")
	public static synchronized void method5314() {
		anInt5852++;
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(BZ)V")
	public static synchronized void method5315() {
		aBoolean450 = true;
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(ILclient!o;)V")
	public static synchronized void method5316(@OriginalArg(1) Interface14 arg0) {
		if (aBoolean450) {
			return;
		}
		if (anInt5852 <= 0) {
			arg0.NA(false);
		} else {
			@Pc(13) Class1_Sub50 local13 = new Class1_Sub50();
			local13.anInterface14_1 = arg0;
			aClass295_30.method7533(local13);
		}
	}

	@OriginalMember(owner = "client!mk", name = "b", descriptor = "(I)V")
	public static synchronized void method5317() {
		anInt5852--;
		if (anInt5852 == 0) {
			method5318();
		}
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(B)V")
	public static synchronized void method5318() {
		while (true) {
			@Pc(8) Class1_Sub50 local8 = (Class1_Sub50) aClass295_30.method7547();
			if (local8 == null) {
				return;
			}
			local8.anInterface14_1.NA(true);
			local8.method8239();
		}
	}
}
