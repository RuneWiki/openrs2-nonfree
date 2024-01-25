import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ar")
public final class Class16 {

	@OriginalMember(owner = "client!ar", name = "c", descriptor = "Lclient!paa;")
	private Class1_Sub8 aClass1_Sub8_1 = new Class1_Sub8();

	@OriginalMember(owner = "client!ar", name = "l", descriptor = "Lclient!je;")
	private final Class170 aClass170_1 = new Class170();

	@OriginalMember(owner = "client!ar", name = "i", descriptor = "I")
	private int anInt553;

	@OriginalMember(owner = "client!ar", name = "k", descriptor = "I")
	private final int anInt555;

	@OriginalMember(owner = "client!ar", name = "g", descriptor = "Lclient!faa;")
	private final Class91 aClass91_1;

	@OriginalMember(owner = "client!ar", name = "<init>", descriptor = "(I)V")
	public Class16(@OriginalArg(0) int arg0) {
		this.anInt553 = arg0;
		this.anInt555 = arg0;
		@Pc(19) int local19;
		for (local19 = 1; local19 + local19 < arg0; local19 += local19) {
		}
		this.aClass91_1 = new Class91(local19);
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(JI)Lclient!paa;")
	public Class1_Sub8 method471(@OriginalArg(0) long arg0) {
		@Pc(17) Class1_Sub8 local17 = (Class1_Sub8) this.aClass91_1.method2271(arg0);
		if (local17 != null) {
			this.aClass170_1.method3550(local17);
		}
		return local17;
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(B)V")
	public void method475() {
		this.aClass170_1.method3546();
		this.aClass91_1.method2275();
		this.aClass1_Sub8_1 = new Class1_Sub8();
		this.anInt553 = this.anInt555;
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(JILclient!paa;)V")
	public void method476(@OriginalArg(0) long arg0, @OriginalArg(2) Class1_Sub8 arg1) {
		if (this.anInt553 == 0) {
			@Pc(20) Class1_Sub8 local20 = this.aClass170_1.method3543();
			local20.method7908();
			local20.method7712();
			if (this.aClass1_Sub8_1 == local20) {
				local20 = this.aClass170_1.method3543();
				local20.method7908();
				local20.method7712();
			}
		} else {
			this.anInt553--;
		}
		this.aClass91_1.method2269(arg0, arg1);
		this.aClass170_1.method3550(arg1);
	}
}
