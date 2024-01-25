import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cg")
public final class Class6_Sub2_Sub3 extends Class6_Sub2 {

	@OriginalMember(owner = "client!cg", name = "s", descriptor = "Lclient!jj;")
	private Class108 aClass108_5;

	@OriginalMember(owner = "client!cg", name = "t", descriptor = "I")
	private int anInt717;

	@OriginalMember(owner = "client!cg", name = "w", descriptor = "C")
	public char aChar4;

	@OriginalMember(owner = "client!cg", name = "F", descriptor = "C")
	public char aChar5;

	@OriginalMember(owner = "client!cg", name = "H", descriptor = "Lclient!jj;")
	public Class108 aClass108_6;

	@OriginalMember(owner = "client!cg", name = "v", descriptor = "Ljava/lang/String;")
	private String aString29 = "null";

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(BILclient!ec;)V")
	private void method653(@OriginalArg(1) int arg0, @OriginalArg(2) Class6_Sub10 arg1) {
		if (arg0 == 1) {
			this.aChar5 = Static103.method2106(arg1.method3992());
		} else if (arg0 == 2) {
			this.aChar4 = Static103.method2106(arg1.method3992());
		} else if (arg0 == 3) {
			this.aString29 = arg1.method4023();
		} else if (arg0 == 4) {
			this.anInt717 = arg1.method3979();
		} else if (arg0 == 5 || arg0 == 6) {
			@Pc(61) int local61 = arg1.method4021();
			this.aClass108_6 = new Class108(Static247.method4066(local61));
			for (@Pc(71) int local71 = 0; local71 < local61; local71++) {
				@Pc(77) int local77 = arg1.method3979();
				@Pc(89) Class6 local89;
				if (arg0 == 5) {
					local89 = new Class6_Sub24(arg1.method4023());
				} else {
					local89 = new Class6_Sub43(arg1.method3979());
				}
				this.aClass108_6.method2898((long) local77, local89);
			}
		}
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(ILclient!ec;)V")
	public void method654(@OriginalArg(1) Class6_Sub10 arg0) {
		while (true) {
			@Pc(11) int local11 = arg0.method3972();
			if (local11 == 0) {
				return;
			}
			this.method653(local11, arg0);
		}
	}

	@OriginalMember(owner = "client!cg", name = "b", descriptor = "(II)I")
	public int method656(@OriginalArg(0) int arg0) {
		if (this.aClass108_6 == null) {
			return this.anInt717;
		} else {
			@Pc(17) Class6_Sub43 local17 = (Class6_Sub43) this.aClass108_6.method2900((long) arg0);
			return local17 == null ? this.anInt717 : local17.anInt6289;
		}
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	public boolean method657(@OriginalArg(0) String arg0) {
		if (this.aClass108_6 == null) {
			return false;
		}
		if (this.aClass108_5 == null) {
			this.method660();
		}
		for (@Pc(25) Class6_Sub20 local25 = (Class6_Sub20) this.aClass108_5.method2900(Static298.method5109(arg0)); local25 != null; local25 = (Class6_Sub20) this.aClass108_5.method2910()) {
			if (local25.aString120.equals(arg0)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!cg", name = "f", descriptor = "(I)V")
	private void method658() {
		this.aClass108_5 = new Class108(this.aClass108_6.method2901());
		for (@Pc(28) Class6_Sub43 local28 = (Class6_Sub43) this.aClass108_6.method2903(); local28 != null; local28 = (Class6_Sub43) this.aClass108_6.method2905()) {
			@Pc(37) Class6_Sub43 local37 = new Class6_Sub43((int) local28.aLong218);
			this.aClass108_5.method2898((long) local28.anInt6289, local37);
		}
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(ZI)Z")
	public boolean method659(@OriginalArg(1) int arg0) {
		if (this.aClass108_6 == null) {
			return false;
		}
		if (this.aClass108_5 == null) {
			this.method658();
		}
		@Pc(27) Class6_Sub43 local27 = (Class6_Sub43) this.aClass108_5.method2900((long) arg0);
		return local27 != null;
	}

	@OriginalMember(owner = "client!cg", name = "g", descriptor = "(I)V")
	private void method660() {
		this.aClass108_5 = new Class108(this.aClass108_6.method2901());
		for (@Pc(24) Class6_Sub24 local24 = (Class6_Sub24) this.aClass108_6.method2903(); local24 != null; local24 = (Class6_Sub24) this.aClass108_6.method2905()) {
			@Pc(35) Class6_Sub20 local35 = new Class6_Sub20(local24.aString137, (int) local24.aLong218);
			this.aClass108_5.method2898(Static298.method5109(local24.aString137), local35);
		}
	}

	@OriginalMember(owner = "client!cg", name = "c", descriptor = "(II)Ljava/lang/String;")
	public String method662(@OriginalArg(0) int arg0) {
		if (this.aClass108_6 == null) {
			return this.aString29;
		} else {
			@Pc(17) Class6_Sub24 local17 = (Class6_Sub24) this.aClass108_6.method2900((long) arg0);
			return local17 == null ? this.aString29 : local17.aString137;
		}
	}
}
