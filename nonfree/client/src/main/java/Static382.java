import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static382 {

	@OriginalMember(owner = "client!te", name = "a", descriptor = "Lclient!oe;")
	private static final Class181 aClass181_56 = new Class181();

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(ILclient!d;)V")
	public static synchronized void method5154(@OriginalArg(1) Interface2 arg0) {
		@Pc(3) Class1_Sub44 local3 = new Class1_Sub44();
		local3.anInterface2_1 = arg0;
		aClass181_56.method4102(local3);
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(B)V")
	public static synchronized void method5155() {
		while (true) {
			@Pc(4) Class1_Sub44 local4 = (Class1_Sub44) aClass181_56.method4109();
			if (local4 == null) {
				return;
			}
			local4.anInterface2_1.EA();
			local4.method6020();
		}
	}
}
