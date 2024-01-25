import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static314 {

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "Z")
	private static final boolean aBoolean616 = true;

	@OriginalMember(owner = "client!pp", name = "b", descriptor = "Z")
	private static boolean aBoolean617 = false;

	@OriginalMember(owner = "client!pp", name = "c", descriptor = "Lclient!sr;")
	private static final Class227 aClass227_32 = new Class227();

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(Lclient!ve;Z)V")
	public static synchronized void method4249(@OriginalArg(0) Interface12 arg0) {
		if (aBoolean616) {
			@Pc(10) Class1_Sub1 local10 = new Class1_Sub1();
			local10.anInterface12_1 = arg0;
			aClass227_32.method4972(local10);
		} else if (!aBoolean617) {
			arg0.p();
		}
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(B)V")
	public static synchronized void method4250() {
		while (true) {
			@Pc(12) Class1_Sub1 local12 = (Class1_Sub1) aClass227_32.method4974();
			if (local12 == null) {
				return;
			}
			local12.anInterface12_1.p();
			local12.method5915();
		}
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(BZ)V")
	public static synchronized void method4251() {
		aBoolean617 = true;
	}
}
