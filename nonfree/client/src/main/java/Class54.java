import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dg")
public final class Class54 {

	@OriginalMember(owner = "client!dg", name = "b", descriptor = "Lclient!jq;")
	private Class1_Sub3 aClass1_Sub3_10 = new Class1_Sub3();

	@OriginalMember(owner = "client!dg", name = "k", descriptor = "Lclient!mq;")
	private final Class163 aClass163_1 = new Class163();

	@OriginalMember(owner = "client!dg", name = "m", descriptor = "I")
	private int anInt1043;

	@OriginalMember(owner = "client!dg", name = "n", descriptor = "I")
	private final int anInt1044;

	@OriginalMember(owner = "client!dg", name = "j", descriptor = "Lclient!qi;")
	private final Class208 aClass208_5;

	@OriginalMember(owner = "client!dg", name = "<init>", descriptor = "(I)V")
	public Class54(@OriginalArg(0) int arg0) {
		this.anInt1043 = arg0;
		this.anInt1044 = arg0;
		@Pc(19) int local19;
		for (local19 = 1; local19 + local19 < arg0; local19 += local19) {
		}
		this.aClass208_5 = new Class208(local19);
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(B)V")
	public void method918() {
		this.aClass163_1.method3659();
		this.aClass208_5.method4408();
		this.aClass1_Sub3_10 = new Class1_Sub3();
		this.anInt1043 = this.anInt1044;
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(Lclient!jq;BJ)V")
	public void method920(@OriginalArg(0) Class1_Sub3 arg0, @OriginalArg(2) long arg1) {
		if (this.anInt1043 == 0) {
			@Pc(10) Class1_Sub3 local10 = this.aClass163_1.method3654();
			local10.method5953();
			local10.method5941();
			if (local10 == this.aClass1_Sub3_10) {
				local10 = this.aClass163_1.method3654();
				local10.method5953();
				local10.method5941();
			}
		} else {
			this.anInt1043--;
		}
		this.aClass208_5.method4413(arg1, arg0);
		this.aClass163_1.method3657(arg0);
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(ZJ)Lclient!jq;")
	public Class1_Sub3 method922(@OriginalArg(1) long arg0) {
		@Pc(10) Class1_Sub3 local10 = (Class1_Sub3) this.aClass208_5.method4405(arg0);
		if (local10 != null) {
			this.aClass163_1.method3657(local10);
		}
		return local10;
	}
}
