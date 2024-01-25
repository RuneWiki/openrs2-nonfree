import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hba")
public final class Class129 {

	@OriginalMember(owner = "client!hba", name = "a", descriptor = "C")
	public char aChar2;

	@OriginalMember(owner = "client!hba", name = "g", descriptor = "Lclient!wh;")
	private Class356 aClass356_11;

	@OriginalMember(owner = "client!hba", name = "k", descriptor = "I")
	private int anInt3719;

	@OriginalMember(owner = "client!hba", name = "n", descriptor = "C")
	public char aChar3;

	@OriginalMember(owner = "client!hba", name = "q", descriptor = "Lclient!wh;")
	public Class356 aClass356_12;

	@OriginalMember(owner = "client!hba", name = "s", descriptor = "Ljava/lang/String;")
	private String aString39 = "null";

	@OriginalMember(owner = "client!hba", name = "a", descriptor = "(Lclient!io;B)V")
	public void method3217(@OriginalArg(0) Class1_Sub20 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method4393();
			if (local5 == 0) {
				return;
			}
			this.method3223(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!hba", name = "a", descriptor = "(BI)I")
	public int method3219(@OriginalArg(1) int arg0) {
		if (this.aClass356_12 == null) {
			return this.anInt3719;
		} else {
			@Pc(22) Class1_Sub32 local22 = (Class1_Sub32) this.aClass356_12.method7796((long) arg0);
			return local22 == null ? this.anInt3719 : local22.anInt6144;
		}
	}

	@OriginalMember(owner = "client!hba", name = "a", descriptor = "(BLjava/lang/String;)Z")
	public boolean method3220(@OriginalArg(1) String arg0) {
		if (this.aClass356_12 == null) {
			return false;
		}
		if (this.aClass356_11 == null) {
			this.method3228();
		}
		for (@Pc(25) Class1_Sub22 local25 = (Class1_Sub22) this.aClass356_11.method7796(Static85.method1717(arg0)); local25 != null; local25 = (Class1_Sub22) this.aClass356_11.method7801()) {
			if (local25.aString47.equals(arg0)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!hba", name = "a", descriptor = "(II)Z")
	public boolean method3221(@OriginalArg(1) int arg0) {
		if (this.aClass356_12 == null) {
			return false;
		}
		if (this.aClass356_11 == null) {
			this.method3222();
		}
		@Pc(29) Class1_Sub32 local29 = (Class1_Sub32) this.aClass356_11.method7796((long) arg0);
		return local29 != null;
	}

	@OriginalMember(owner = "client!hba", name = "a", descriptor = "(B)V")
	private void method3222() {
		this.aClass356_11 = new Class356(this.aClass356_12.method7793());
		for (@Pc(26) Class1_Sub32 local26 = (Class1_Sub32) this.aClass356_12.method7792(); local26 != null; local26 = (Class1_Sub32) this.aClass356_12.method7795()) {
			@Pc(35) Class1_Sub32 local35 = new Class1_Sub32((int) local26.aLong425);
			this.aClass356_11.method7800((long) local26.anInt6144, local35);
		}
	}

	@OriginalMember(owner = "client!hba", name = "a", descriptor = "(Lclient!io;II)V")
	private void method3223(@OriginalArg(0) Class1_Sub20 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.aChar3 = Static344.method5095(arg0.method4432());
		} else if (arg1 == 2) {
			this.aChar2 = Static344.method5095(arg0.method4432());
		} else if (arg1 == 3) {
			this.aString39 = arg0.method4388();
		} else if (arg1 == 4) {
			this.anInt3719 = arg0.method4371();
		} else if (arg1 == 5 || arg1 == 6) {
			@Pc(59) int local59 = arg0.method4426();
			this.aClass356_12 = new Class356(Static200.method3428(local59));
			for (@Pc(71) int local71 = 0; local71 < local59; local71++) {
				@Pc(77) int local77 = arg0.method4371();
				@Pc(87) Class1 local87;
				if (arg1 == 5) {
					local87 = new Class1_Sub26(arg0.method4388());
				} else {
					local87 = new Class1_Sub32(arg0.method4371());
				}
				this.aClass356_12.method7800((long) local77, local87);
			}
		}
	}

	@OriginalMember(owner = "client!hba", name = "b", descriptor = "(BI)Ljava/lang/String;")
	public String method3227(@OriginalArg(1) int arg0) {
		if (this.aClass356_12 == null) {
			return this.aString39;
		} else {
			@Pc(17) Class1_Sub26 local17 = (Class1_Sub26) this.aClass356_12.method7796((long) arg0);
			return local17 == null ? this.aString39 : local17.aString60;
		}
	}

	@OriginalMember(owner = "client!hba", name = "c", descriptor = "(I)V")
	private void method3228() {
		this.aClass356_11 = new Class356(this.aClass356_12.method7793());
		for (@Pc(26) Class1_Sub26 local26 = (Class1_Sub26) this.aClass356_12.method7792(); local26 != null; local26 = (Class1_Sub26) this.aClass356_12.method7795()) {
			@Pc(37) Class1_Sub22 local37 = new Class1_Sub22(local26.aString60, (int) local26.aLong425);
			this.aClass356_11.method7800(Static85.method1717(local26.aString60), local37);
		}
	}
}
