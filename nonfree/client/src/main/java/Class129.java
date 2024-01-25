import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hfa")
public final class Class129 {

	@OriginalMember(owner = "client!hfa", name = "a", descriptor = "Lclient!sl;")
	public Class310 aClass310_12;

	@OriginalMember(owner = "client!hfa", name = "d", descriptor = "Lclient!sl;")
	private Class310 aClass310_13;

	@OriginalMember(owner = "client!hfa", name = "e", descriptor = "C")
	public char aChar2;

	@OriginalMember(owner = "client!hfa", name = "n", descriptor = "I")
	private int anInt3737;

	@OriginalMember(owner = "client!hfa", name = "o", descriptor = "C")
	public char aChar3;

	@OriginalMember(owner = "client!hfa", name = "j", descriptor = "Ljava/lang/String;")
	private String aString48 = "null";

	@OriginalMember(owner = "client!hfa", name = "a", descriptor = "(Lclient!qh;II)V")
	private void method3301(@OriginalArg(0) Class3_Sub11 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.aChar2 = Static88.method1974(arg0.method3096());
		} else if (arg1 == 2) {
			this.aChar3 = Static88.method1974(arg0.method3096());
		} else if (arg1 == 3) {
			this.aString48 = arg0.method3133();
		} else if (arg1 == 4) {
			this.anInt3737 = arg0.method3116();
		} else if (arg1 == 5 || arg1 == 6) {
			@Pc(45) int local45 = arg0.method3109();
			this.aClass310_12 = new Class310(Static114.method2375(local45));
			for (@Pc(55) int local55 = 0; local55 < local45; local55++) {
				@Pc(61) int local61 = arg0.method3116();
				@Pc(71) Class3 local71;
				if (arg1 == 5) {
					local71 = new Class3_Sub51(arg0.method3133());
				} else {
					local71 = new Class3_Sub4(arg0.method3116());
				}
				this.aClass310_12.method6603(local71, (long) local61);
			}
		}
	}

	@OriginalMember(owner = "client!hfa", name = "a", descriptor = "(Lclient!qh;B)V")
	public void method3302(@OriginalArg(0) Class3_Sub11 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method3118();
			if (local13 == 0) {
				return;
			}
			this.method3301(arg0, local13);
		}
	}

	@OriginalMember(owner = "client!hfa", name = "a", descriptor = "(BI)Ljava/lang/String;")
	public String method3303(@OriginalArg(1) int arg0) {
		if (this.aClass310_12 == null) {
			return this.aString48;
		} else {
			@Pc(17) Class3_Sub51 local17 = (Class3_Sub51) this.aClass310_12.method6601((long) arg0);
			return local17 == null ? this.aString48 : local17.aString128;
		}
	}

	@OriginalMember(owner = "client!hfa", name = "a", descriptor = "(Ljava/lang/String;B)Z")
	public boolean method3304(@OriginalArg(0) String arg0) {
		if (this.aClass310_12 == null) {
			return false;
		}
		if (this.aClass310_13 == null) {
			this.method3309();
		}
		for (@Pc(27) Class3_Sub47 local27 = (Class3_Sub47) this.aClass310_13.method6601(Static94.method2075(arg0)); local27 != null; local27 = (Class3_Sub47) this.aClass310_13.method6600()) {
			if (local27.aString126.equals(arg0)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!hfa", name = "a", descriptor = "(Z)V")
	private void method3305() {
		this.aClass310_13 = new Class310(this.aClass310_12.method6598());
		for (@Pc(28) Class3_Sub4 local28 = (Class3_Sub4) this.aClass310_12.method6602(); local28 != null; local28 = (Class3_Sub4) this.aClass310_12.method6599()) {
			@Pc(37) Class3_Sub4 local37 = new Class3_Sub4((int) local28.aLong273);
			this.aClass310_13.method6603(local37, (long) local28.anInt109);
		}
	}

	@OriginalMember(owner = "client!hfa", name = "a", descriptor = "(IB)Z")
	public boolean method3306(@OriginalArg(0) int arg0) {
		if (this.aClass310_12 == null) {
			return false;
		}
		if (this.aClass310_13 == null) {
			this.method3305();
		}
		@Pc(28) Class3_Sub4 local28 = (Class3_Sub4) this.aClass310_13.method6601((long) arg0);
		return local28 != null;
	}

	@OriginalMember(owner = "client!hfa", name = "a", descriptor = "(II)I")
	public int method3308(@OriginalArg(1) int arg0) {
		if (this.aClass310_12 == null) {
			return this.anInt3737;
		} else {
			@Pc(17) Class3_Sub4 local17 = (Class3_Sub4) this.aClass310_12.method6601((long) arg0);
			return local17 == null ? this.anInt3737 : local17.anInt109;
		}
	}

	@OriginalMember(owner = "client!hfa", name = "a", descriptor = "(B)V")
	private void method3309() {
		this.aClass310_13 = new Class310(this.aClass310_12.method6598());
		for (@Pc(27) Class3_Sub51 local27 = (Class3_Sub51) this.aClass310_12.method6602(); local27 != null; local27 = (Class3_Sub51) this.aClass310_12.method6599()) {
			@Pc(38) Class3_Sub47 local38 = new Class3_Sub47(local27.aString128, (int) local27.aLong273);
			this.aClass310_13.method6603(local38, Static94.method2075(local27.aString128));
		}
	}
}
