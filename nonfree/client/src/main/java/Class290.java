import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uk")
public final class Class290 {

	@OriginalMember(owner = "client!uk", name = "g", descriptor = "Lclient!pm;")
	private Class1_Sub1 aClass1_Sub1_56 = new Class1_Sub1();

	@OriginalMember(owner = "client!uk", name = "i", descriptor = "Lclient!vm;")
	private final Class307 aClass307_8 = new Class307();

	@OriginalMember(owner = "client!uk", name = "k", descriptor = "I")
	private final int anInt8379;

	@OriginalMember(owner = "client!uk", name = "h", descriptor = "I")
	private int anInt8378;

	@OriginalMember(owner = "client!uk", name = "j", descriptor = "Lclient!lb;")
	private final Class174 aClass174_35;

	@OriginalMember(owner = "client!uk", name = "<init>", descriptor = "(I)V")
	public Class290(@OriginalArg(0) int arg0) {
		this.anInt8379 = arg0;
		this.anInt8378 = arg0;
		@Pc(19) int local19;
		for (local19 = 1; arg0 > local19 + local19; local19 += local19) {
		}
		this.aClass174_35 = new Class174(local19);
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(B)V")
	public void method7075() {
		this.aClass307_8.method7358();
		this.aClass174_35.method4423();
		this.aClass1_Sub1_56 = new Class1_Sub1();
		this.anInt8378 = this.anInt8379;
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(JLclient!pm;I)V")
	public void method7077(@OriginalArg(0) long arg0, @OriginalArg(1) Class1_Sub1 arg1) {
		if (this.anInt8378 == 0) {
			@Pc(17) Class1_Sub1 local17 = this.aClass307_8.method7360();
			local17.method7983();
			local17.method7493();
			if (this.aClass1_Sub1_56 == local17) {
				local17 = this.aClass307_8.method7360();
				local17.method7983();
				local17.method7493();
			}
		} else {
			this.anInt8378--;
		}
		this.aClass174_35.method4420(arg1, arg0);
		this.aClass307_8.method7354(arg1);
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(BJ)Lclient!pm;")
	public Class1_Sub1 method7078(@OriginalArg(1) long arg0) {
		@Pc(15) Class1_Sub1 local15 = (Class1_Sub1) this.aClass174_35.method4422(arg0);
		if (local15 != null) {
			this.aClass307_8.method7354(local15);
		}
		return local15;
	}
}
