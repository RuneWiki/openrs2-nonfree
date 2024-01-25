import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oc")
public final class Class214 {

	@OriginalMember(owner = "client!oc", name = "d", descriptor = "Lclient!ba;")
	private Class17 aClass17_25;

	@OriginalMember(owner = "client!oc", name = "g", descriptor = "Lclient!ba;")
	public Class17 aClass17_26;

	@OriginalMember(owner = "client!oc", name = "h", descriptor = "I")
	private int anInt6042;

	@OriginalMember(owner = "client!oc", name = "r", descriptor = "C")
	public char aChar3;

	@OriginalMember(owner = "client!oc", name = "s", descriptor = "C")
	public char aChar4;

	@OriginalMember(owner = "client!oc", name = "c", descriptor = "Ljava/lang/String;")
	private String aString57 = "null";

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(ZI)I")
	public int method5112(@OriginalArg(1) int arg0) {
		if (this.aClass17_26 == null) {
			return this.anInt6042;
		} else {
			@Pc(17) Class1_Sub9 local17 = (Class1_Sub9) this.aClass17_26.method738((long) arg0);
			return local17 == null ? this.anInt6042 : local17.anInt1173;
		}
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(ILclient!ge;I)V")
	private void method5114(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub6 arg1) {
		if (arg0 == 1) {
			this.aChar4 = Static147.method2361(arg1.method3928());
		} else if (arg0 == 2) {
			this.aChar3 = Static147.method2361(arg1.method3928());
		} else if (arg0 == 3) {
			this.aString57 = arg1.method3954();
		} else if (arg0 == 4) {
			this.anInt6042 = arg1.method3925();
		} else if (arg0 == 5 || arg0 == 6) {
			@Pc(51) int local51 = arg1.method3967();
			this.aClass17_26 = new Class17(Static352.method5306(local51));
			for (@Pc(61) int local61 = 0; local61 < local51; local61++) {
				@Pc(67) int local67 = arg1.method3925();
				@Pc(79) Class1 local79;
				if (arg0 == 5) {
					local79 = new Class1_Sub25(arg1.method3954());
				} else {
					local79 = new Class1_Sub9(arg1.method3925());
				}
				this.aClass17_26.method737(local79, (long) local67);
			}
		}
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(BI)Z")
	public boolean method5115(@OriginalArg(1) int arg0) {
		if (this.aClass17_26 == null) {
			return false;
		}
		if (this.aClass17_25 == null) {
			this.method5116();
		}
		@Pc(22) Class1_Sub9 local22 = (Class1_Sub9) this.aClass17_25.method738((long) arg0);
		return local22 != null;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(B)V")
	private void method5116() {
		this.aClass17_25 = new Class17(this.aClass17_26.method736());
		for (@Pc(28) Class1_Sub9 local28 = (Class1_Sub9) this.aClass17_26.method735(); local28 != null; local28 = (Class1_Sub9) this.aClass17_26.method740()) {
			@Pc(37) Class1_Sub9 local37 = new Class1_Sub9((int) local28.aLong392);
			this.aClass17_25.method737(local37, (long) local28.anInt1173);
		}
	}

	@OriginalMember(owner = "client!oc", name = "b", descriptor = "(B)V")
	private void method5117() {
		this.aClass17_25 = new Class17(this.aClass17_26.method736());
		for (@Pc(26) Class1_Sub25 local26 = (Class1_Sub25) this.aClass17_26.method735(); local26 != null; local26 = (Class1_Sub25) this.aClass17_26.method740()) {
			@Pc(37) Class1_Sub45 local37 = new Class1_Sub45(local26.aString37, (int) local26.aLong392);
			this.aClass17_25.method737(local37, Static424.method6214(local26.aString37));
		}
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(BLclient!ge;)V")
	public void method5118(@OriginalArg(1) Class1_Sub6 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method3922();
			if (local9 == 0) {
				return;
			}
			this.method5114(local9, arg0);
		}
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	public boolean method5119(@OriginalArg(0) String arg0) {
		if (this.aClass17_26 == null) {
			return false;
		}
		if (this.aClass17_25 == null) {
			this.method5117();
		}
		for (@Pc(30) Class1_Sub45 local30 = (Class1_Sub45) this.aClass17_25.method738(Static424.method6214(arg0)); local30 != null; local30 = (Class1_Sub45) this.aClass17_25.method743()) {
			if (local30.aString74.equals(arg0)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!oc", name = "b", descriptor = "(ZI)Ljava/lang/String;")
	public String method5120(@OriginalArg(1) int arg0) {
		if (this.aClass17_26 == null) {
			return this.aString57;
		} else {
			@Pc(17) Class1_Sub25 local17 = (Class1_Sub25) this.aClass17_26.method738((long) arg0);
			return local17 == null ? this.aString57 : local17.aString37;
		}
	}
}
