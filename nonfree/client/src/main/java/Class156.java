import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pj")
public final class Class156 {

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "Lclient!mo;")
	private Class1_Sub1 aClass1_Sub1_50 = new Class1_Sub1();

	@OriginalMember(owner = "client!pj", name = "o", descriptor = "Lclient!ad;")
	private final Class4 aClass4_7 = new Class4();

	@OriginalMember(owner = "client!pj", name = "i", descriptor = "I")
	private final int anInt4656;

	@OriginalMember(owner = "client!pj", name = "h", descriptor = "I")
	private int anInt4655;

	@OriginalMember(owner = "client!pj", name = "m", descriptor = "Lclient!br;")
	private final Class26 aClass26_24;

	@OriginalMember(owner = "client!pj", name = "<init>", descriptor = "(I)V")
	public Class156(@OriginalArg(0) int arg0) {
		this.anInt4656 = arg0;
		this.anInt4655 = arg0;
		@Pc(19) int local19;
		for (local19 = 1; arg0 > local19 + local19; local19 += local19) {
		}
		this.aClass26_24 = new Class26(local19);
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(Z)V")
	public void method4254() {
		this.aClass4_7.method179();
		this.aClass26_24.method876();
		this.aClass1_Sub1_50 = new Class1_Sub1();
		this.anInt4655 = this.anInt4656;
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(ILclient!mo;J)V")
	public void method4256(@OriginalArg(1) Class1_Sub1 arg0, @OriginalArg(2) long arg1) {
		if (this.anInt4655 == 0) {
			@Pc(22) Class1_Sub1 local22 = this.aClass4_7.method183();
			local22.method5710();
			local22.method5564();
			if (local22 == this.aClass1_Sub1_50) {
				local22 = this.aClass4_7.method183();
				local22.method5710();
				local22.method5564();
			}
		} else {
			this.anInt4655--;
		}
		this.aClass26_24.method877(arg1, arg0);
		this.aClass4_7.method180(arg0);
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(BJ)Lclient!mo;")
	public Class1_Sub1 method4258(@OriginalArg(1) long arg0) {
		@Pc(15) Class1_Sub1 local15 = (Class1_Sub1) this.aClass26_24.method870(arg0);
		if (local15 != null) {
			this.aClass4_7.method180(local15);
		}
		return local15;
	}
}
