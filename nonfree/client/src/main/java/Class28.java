import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gd")
public final class Class28 {

	@OriginalMember(owner = "client!gd", name = "W", descriptor = "Lclient!ob;")
	private final Class1_Sub3 aClass1_Sub3_30 = new Class1_Sub3();

	@OriginalMember(owner = "client!gd", name = "eb", descriptor = "Lclient!ea;")
	private final Class17 aClass17_2 = new Class17();

	@OriginalMember(owner = "client!gd", name = "cb", descriptor = "I")
	private int anInt1076;

	@OriginalMember(owner = "client!gd", name = "db", descriptor = "I")
	private final int anInt1077;

	@OriginalMember(owner = "client!gd", name = "Y", descriptor = "Lclient!bd;")
	private final Class7 aClass7_3;

	@OriginalMember(owner = "client!gd", name = "<init>", descriptor = "(I)V")
	public Class28(@OriginalArg(0) int arg0) {
		this.anInt1076 = arg0;
		this.anInt1077 = arg0;
		@Pc(19) int local19;
		for (local19 = 1; arg0 > local19 + local19; local19 += local19) {
		}
		this.aClass7_3 = new Class7(local19);
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lclient!ob;JI)V")
	public void method789(@OriginalArg(0) Class1_Sub3 arg0, @OriginalArg(1) long arg1) {
		if (this.anInt1076 == 0) {
			@Pc(20) Class1_Sub3 local20 = this.aClass17_2.method604();
			local20.method2220();
			local20.method2235();
			if (this.aClass1_Sub3_30 == local20) {
				local20 = this.aClass17_2.method604();
				local20.method2220();
				local20.method2235();
			}
		} else {
			this.anInt1076--;
		}
		this.aClass7_3.method291(arg0, arg1);
		this.aClass17_2.method606(arg0);
	}

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "(B)V")
	public void method792() {
		while (true) {
			@Pc(6) Class1_Sub3 local6 = this.aClass17_2.method604();
			if (local6 == null) {
				this.anInt1076 = this.anInt1077;
				return;
			}
			local6.method2220();
			local6.method2235();
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(JI)V")
	public void method795(@OriginalArg(0) long arg0) {
		@Pc(6) Class1_Sub3 local6 = (Class1_Sub3) this.aClass7_3.method287(arg0);
		if (local6 != null) {
			local6.method2220();
			local6.method2235();
			this.anInt1076++;
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(IJ)Lclient!ob;")
	public Class1_Sub3 method796(@OriginalArg(1) long arg0) {
		@Pc(17) Class1_Sub3 local17 = (Class1_Sub3) this.aClass7_3.method287(arg0);
		if (local17 != null) {
			this.aClass17_2.method606(local17);
		}
		return local17;
	}
}
