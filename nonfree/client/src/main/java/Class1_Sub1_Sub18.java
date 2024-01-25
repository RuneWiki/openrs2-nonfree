import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wn")
public final class Class1_Sub1_Sub18 extends Class1_Sub1 {

	@OriginalMember(owner = "client!wn", name = "y", descriptor = "Lclient!bu;")
	private Class38 aClass38_39;

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(Lclient!ia;I)V")
	public void method6131(@OriginalArg(0) Class1_Sub3 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method1171();
			if (local3 == 0) {
				return;
			}
			this.method6134(local3, arg0);
		}
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(IIB)I")
	public int method6133(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass38_39 == null) {
			return arg0;
		} else {
			@Pc(25) Class1_Sub33 local25 = (Class1_Sub33) this.aClass38_39.method765((long) arg1);
			return local25 == null ? arg0 : local25.anInt5633;
		}
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(IILclient!ia;)V")
	private void method6134(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub3 arg1) {
		if (arg0 != 249) {
			return;
		}
		@Pc(8) int local8 = arg1.method1171();
		@Pc(15) int local15;
		if (this.aClass38_39 == null) {
			local15 = Static427.method5762(local8);
			this.aClass38_39 = new Class38(local15);
		}
		for (local15 = 0; local15 < local8; local15++) {
			@Pc(35) boolean local35 = arg1.method1171() == 1;
			@Pc(39) int local39 = arg1.method1226();
			@Pc(48) Class1 local48;
			if (local35) {
				local48 = new Class1_Sub44(arg1.method1201());
			} else {
				local48 = new Class1_Sub33(arg1.method1188());
			}
			this.aClass38_39.method766(local48, (long) local39);
		}
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(Ljava/lang/String;IB)Ljava/lang/String;")
	public String method6135(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (this.aClass38_39 == null) {
			return arg0;
		} else {
			@Pc(21) Class1_Sub44 local21 = (Class1_Sub44) this.aClass38_39.method765((long) arg1);
			return local21 == null ? arg0 : local21.aString66;
		}
	}
}
