import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static606 {

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "Lclient!bq;")
	private static final Class43 aClass43_64 = new Class43();

	@OriginalMember(owner = "client!vm", name = "b", descriptor = "I")
	private static int anInt10262 = 0;

	@OriginalMember(owner = "client!vm", name = "c", descriptor = "Z")
	private static boolean aBoolean737 = false;

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(Lclient!e;Z)V")
	public static synchronized void method8287(@OriginalArg(0) Interface3 arg0) {
		if (aBoolean737) {
			return;
		}
		if (anInt10262 > 0) {
			@Pc(12) Class8_Sub24 local12 = new Class8_Sub24();
			local12.anInterface3_1 = arg0;
			aClass43_64.method1424(local12);
		} else {
			arg0.w(false);
		}
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(Z)V")
	public static synchronized void method8288() {
		anInt10262++;
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(I)V")
	public static synchronized void method8289() {
		anInt10262--;
		if (anInt10262 == 0) {
			method8291();
		}
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(BZ)V")
	public static synchronized void method8290() {
		aBoolean737 = true;
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(B)V")
	public static synchronized void method8291() {
		while (true) {
			@Pc(8) Class8_Sub24 local8 = (Class8_Sub24) aClass43_64.method1432();
			if (local8 == null) {
				return;
			}
			local8.anInterface3_1.w(true);
			local8.method8640();
		}
	}
}
