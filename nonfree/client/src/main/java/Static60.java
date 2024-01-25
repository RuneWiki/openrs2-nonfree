import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static60 {

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "Lclient!nj;")
	private static final Class181 aClass181_4 = new Class181();

	@OriginalMember(owner = "client!cs", name = "b", descriptor = "I")
	private static int anInt1091 = 0;

	@OriginalMember(owner = "client!cs", name = "c", descriptor = "Z")
	private static boolean aBoolean60 = false;

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(I)V")
	public static synchronized void method967() {
		while (true) {
			@Pc(8) Class2_Sub38 local8 = (Class2_Sub38) aClass181_4.method3976();
			if (local8 == null) {
				return;
			}
			local8.anInterface13_1.p();
			local8.method6260();
		}
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(ZZ)V")
	public static synchronized void method968() {
		aBoolean60 = true;
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(B)V")
	public static synchronized void method969() {
		anInt1091--;
		if (anInt1091 == 0) {
			method967();
		}
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(Lclient!wb;Z)V")
	public static synchronized void method970(@OriginalArg(0) Interface13 arg0) {
		if (aBoolean60) {
			return;
		}
		if (anInt1091 > 0) {
			@Pc(16) Class2_Sub38 local16 = new Class2_Sub38();
			local16.anInterface13_1 = arg0;
			aClass181_4.method3973(local16);
		} else {
			arg0.p();
		}
	}
}
