import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pa")
public final class Class4_Sub1_Sub17 extends Class4_Sub1 {

	@OriginalMember(owner = "client!pa", name = "D", descriptor = "C")
	public char aChar2;

	@OriginalMember(owner = "client!pa", name = "F", descriptor = "C")
	public char aChar3;

	@OriginalMember(owner = "client!pa", name = "H", descriptor = "Lclient!uc;")
	public Class198 aClass198_27;

	@OriginalMember(owner = "client!pa", name = "J", descriptor = "Lclient!uc;")
	private Class198 aClass198_28;

	@OriginalMember(owner = "client!pa", name = "P", descriptor = "I")
	private int anInt4926;

	@OriginalMember(owner = "client!pa", name = "L", descriptor = "Ljava/lang/String;")
	private String aString178 = "null";

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(II)Ljava/lang/String;")
	public String method4084(@OriginalArg(1) int arg0) {
		if (this.aClass198_27 == null) {
			return this.aString178;
		} else {
			@Pc(17) Class4_Sub30 local17 = (Class4_Sub30) this.aClass198_27.method5261((long) arg0);
			return local17 == null ? this.aString178 : local17.aString146;
		}
	}

	@OriginalMember(owner = "client!pa", name = "b", descriptor = "(B)V")
	private void method4086() {
		this.aClass198_28 = new Class198(this.aClass198_27.method5270());
		for (@Pc(25) Class4_Sub30 local25 = (Class4_Sub30) this.aClass198_27.method5268(); local25 != null; local25 = (Class4_Sub30) this.aClass198_27.method5263()) {
			@Pc(36) Class4_Sub19 local36 = new Class4_Sub19(local25.aString146, (int) local25.aLong259);
			this.aClass198_28.method5267(Static229.method3922(local25.aString146), local36);
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(BI)I")
	public int method4087(@OriginalArg(1) int arg0) {
		if (this.aClass198_27 == null) {
			return this.anInt4926;
		} else {
			@Pc(17) Class4_Sub36 local17 = (Class4_Sub36) this.aClass198_27.method5261((long) arg0);
			return local17 == null ? this.anInt4926 : local17.anInt5967;
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(BLclient!tq;)V")
	public void method4089(@OriginalArg(1) Class4_Sub7 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method2380();
			if (local13 == 0) {
				return;
			}
			this.method4090(arg0, local13);
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(Lclient!tq;II)V")
	private void method4090(@OriginalArg(0) Class4_Sub7 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.aChar3 = Static58.method1043(arg0.method2393());
		} else if (arg1 == 2) {
			this.aChar2 = Static58.method1043(arg0.method2393());
		} else if (arg1 == 3) {
			this.aString178 = arg0.method2379();
		} else if (arg1 == 4) {
			this.anInt4926 = arg0.method2389();
		} else if (arg1 == 5 || arg1 == 6) {
			@Pc(71) int local71 = arg0.method2404();
			this.aClass198_27 = new Class198(Static338.method4468(local71));
			for (@Pc(81) int local81 = 0; local81 < local71; local81++) {
				@Pc(87) int local87 = arg0.method2389();
				@Pc(99) Class4 local99;
				if (arg1 == 5) {
					local99 = new Class4_Sub30(arg0.method2379());
				} else {
					local99 = new Class4_Sub36(arg0.method2389());
				}
				this.aClass198_27.method5267((long) local87, local99);
			}
		}
	}

	@OriginalMember(owner = "client!pa", name = "b", descriptor = "(II)Z")
	public boolean method4091(@OriginalArg(1) int arg0) {
		if (this.aClass198_27 == null) {
			return false;
		}
		if (this.aClass198_28 == null) {
			this.method4094();
		}
		@Pc(30) Class4_Sub36 local30 = (Class4_Sub36) this.aClass198_28.method5261((long) arg0);
		return local30 != null;
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	public boolean method4093(@OriginalArg(0) String arg0) {
		if (this.aClass198_27 == null) {
			return false;
		}
		if (this.aClass198_28 == null) {
			this.method4086();
		}
		for (@Pc(33) Class4_Sub19 local33 = (Class4_Sub19) this.aClass198_28.method5261(Static229.method3922(arg0)); local33 != null; local33 = (Class4_Sub19) this.aClass198_28.method5265()) {
			if (local33.aString97.equals(arg0)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!pa", name = "c", descriptor = "(B)V")
	private void method4094() {
		this.aClass198_28 = new Class198(this.aClass198_27.method5270());
		for (@Pc(28) Class4_Sub36 local28 = (Class4_Sub36) this.aClass198_27.method5268(); local28 != null; local28 = (Class4_Sub36) this.aClass198_27.method5263()) {
			@Pc(37) Class4_Sub36 local37 = new Class4_Sub36((int) local28.aLong259);
			this.aClass198_28.method5267((long) local28.anInt5967, local37);
		}
	}
}
