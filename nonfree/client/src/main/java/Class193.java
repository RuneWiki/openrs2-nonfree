import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mi")
public final class Class193 {

	@OriginalMember(owner = "client!mi", name = "h", descriptor = "C")
	public char aChar3;

	@OriginalMember(owner = "client!mi", name = "k", descriptor = "Lclient!lb;")
	private Class174 aClass174_20;

	@OriginalMember(owner = "client!mi", name = "l", descriptor = "I")
	private int anInt5829;

	@OriginalMember(owner = "client!mi", name = "m", descriptor = "Lclient!lb;")
	public Class174 aClass174_21;

	@OriginalMember(owner = "client!mi", name = "o", descriptor = "C")
	public char aChar4;

	@OriginalMember(owner = "client!mi", name = "e", descriptor = "Ljava/lang/String;")
	private String aString56 = "null";

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	public boolean method5027(@OriginalArg(0) String arg0) {
		if (this.aClass174_21 == null) {
			return false;
		}
		if (this.aClass174_20 == null) {
			this.method5028();
		}
		for (@Pc(28) Class1_Sub42 local28 = (Class1_Sub42) this.aClass174_20.method4422(Static351.method5584(arg0)); local28 != null; local28 = (Class1_Sub42) this.aClass174_20.method4424()) {
			if (local28.aString64.equals(arg0)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(Z)V")
	private void method5028() {
		this.aClass174_20 = new Class174(this.aClass174_21.method4428());
		for (@Pc(18) Class1_Sub24 local18 = (Class1_Sub24) this.aClass174_21.method4421(); local18 != null; local18 = (Class1_Sub24) this.aClass174_21.method4429()) {
			@Pc(28) Class1_Sub42 local28 = new Class1_Sub42(local18.aString29, (int) local18.aLong244);
			this.aClass174_20.method4420(local28, Static351.method5584(local18.aString29));
		}
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(B)V")
	private void method5029() {
		this.aClass174_20 = new Class174(this.aClass174_21.method4428());
		for (@Pc(22) Class1_Sub33 local22 = (Class1_Sub33) this.aClass174_21.method4421(); local22 != null; local22 = (Class1_Sub33) this.aClass174_21.method4429()) {
			@Pc(30) Class1_Sub33 local30 = new Class1_Sub33((int) local22.aLong244);
			this.aClass174_20.method4420(local30, (long) local22.anInt6397);
		}
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(IILclient!gw;)V")
	private void method5030(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub13 arg1) {
		if (arg0 == 1) {
			this.aChar3 = Static455.method6568(arg1.method3073());
		} else if (arg0 == 2) {
			this.aChar4 = Static455.method6568(arg1.method3073());
		} else if (arg0 == 3) {
			this.aString56 = arg1.method3034();
		} else if (arg0 == 4) {
			this.anInt5829 = arg1.method3037();
		} else if (arg0 == 5 || arg0 == 6) {
			@Pc(31) int local31 = arg1.method3056();
			this.aClass174_21 = new Class174(Static117.method2662(local31));
			for (@Pc(41) int local41 = 0; local41 < local31; local41++) {
				@Pc(46) int local46 = arg1.method3037();
				@Pc(56) Class1 local56;
				if (arg0 == 5) {
					local56 = new Class1_Sub24(arg1.method3034());
				} else {
					local56 = new Class1_Sub33(arg1.method3037());
				}
				this.aClass174_21.method4420(local56, (long) local46);
			}
		}
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(II)Ljava/lang/String;")
	public String method5031(@OriginalArg(1) int arg0) {
		if (this.aClass174_21 == null) {
			return this.aString56;
		} else {
			@Pc(23) Class1_Sub24 local23 = (Class1_Sub24) this.aClass174_21.method4422((long) arg0);
			return local23 == null ? this.aString56 : local23.aString29;
		}
	}

	@OriginalMember(owner = "client!mi", name = "b", descriptor = "(II)I")
	public int method5033(@OriginalArg(1) int arg0) {
		if (this.aClass174_21 == null) {
			return this.anInt5829;
		} else {
			@Pc(17) Class1_Sub33 local17 = (Class1_Sub33) this.aClass174_21.method4422((long) arg0);
			return local17 == null ? this.anInt5829 : local17.anInt6397;
		}
	}

	@OriginalMember(owner = "client!mi", name = "c", descriptor = "(II)Z")
	public boolean method5034(@OriginalArg(0) int arg0) {
		if (this.aClass174_21 == null) {
			return false;
		}
		if (this.aClass174_20 == null) {
			this.method5029();
		}
		@Pc(26) Class1_Sub33 local26 = (Class1_Sub33) this.aClass174_20.method4422((long) arg0);
		return local26 != null;
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(Lclient!gw;B)V")
	public void method5036(@OriginalArg(0) Class1_Sub13 arg0) {
		while (true) {
			@Pc(7) int local7 = arg0.method3043();
			if (local7 == 0) {
				return;
			}
			this.method5030(local7, arg0);
		}
	}
}
