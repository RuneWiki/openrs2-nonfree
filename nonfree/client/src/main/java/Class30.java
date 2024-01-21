import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!pb")
public final class Class30 {

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "Z")
	private boolean aBoolean162 = false;

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "Z")
	private boolean aBoolean163 = true;

	@OriginalMember(owner = "client!pb", name = "c", descriptor = "I")
	private int anInt652 = 638;

	@OriginalMember(owner = "client!pb", name = "d", descriptor = "Lclient!db;")
	private Class1_Sub3 aClass1_Sub3_17 = new Class1_Sub3();

	@OriginalMember(owner = "client!pb", name = "<init>", descriptor = "(I)V")
	public Class30(@OriginalArg(0) int arg0) {
		try {
			this.aClass1_Sub3_17.aClass1_Sub3_15 = this.aClass1_Sub3_17;
			@Pc(24) int local24 = 59 / arg0;
			this.aClass1_Sub3_17.aClass1_Sub3_16 = this.aClass1_Sub3_17;
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("14367, " + arg0 + ", " + local31.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(Lclient!db;)V")
	public void method442(@OriginalArg(0) Class1_Sub3 arg0) {
		if (arg0.aClass1_Sub3_16 != null) {
			arg0.method358();
		}
		arg0.aClass1_Sub3_16 = this.aClass1_Sub3_17.aClass1_Sub3_16;
		arg0.aClass1_Sub3_15 = this.aClass1_Sub3_17;
		arg0.aClass1_Sub3_16.aClass1_Sub3_15 = arg0;
		arg0.aClass1_Sub3_15.aClass1_Sub3_16 = arg0;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "()Lclient!db;")
	public Class1_Sub3 method443() {
		@Pc(3) Class1_Sub3 local3 = this.aClass1_Sub3_17.aClass1_Sub3_15;
		if (local3 == this.aClass1_Sub3_17) {
			return null;
		} else {
			local3.method358();
			return local3;
		}
	}
}
