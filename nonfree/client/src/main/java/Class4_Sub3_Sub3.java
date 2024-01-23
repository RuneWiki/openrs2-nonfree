import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cj")
public final class Class4_Sub3_Sub3 extends Class4_Sub3 {

	@OriginalMember(owner = "client!cj", name = "z", descriptor = "C")
	public char aChar1;

	@OriginalMember(owner = "client!cj", name = "B", descriptor = "I")
	private int anInt642;

	@OriginalMember(owner = "client!cj", name = "K", descriptor = "C")
	public char aChar2;

	@OriginalMember(owner = "client!cj", name = "O", descriptor = "Lclient!ic;")
	private Class85 aClass85_2;

	@OriginalMember(owner = "client!cj", name = "W", descriptor = "Lclient!ic;")
	public Class85 aClass85_3;

	@OriginalMember(owner = "client!cj", name = "J", descriptor = "Ljava/lang/String;")
	private String aString50 = "null";

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(II)I")
	public int method601(@OriginalArg(1) int arg0) {
		if (this.aClass85_3 == null) {
			return this.anInt642;
		} else {
			@Pc(17) Class4_Sub32 local17 = (Class4_Sub32) this.aClass85_3.method1845((long) arg0);
			return local17 == null ? this.anInt642 : local17.anInt5435;
		}
	}

	@OriginalMember(owner = "client!cj", name = "d", descriptor = "(I)V")
	private void method602() {
		this.aClass85_2 = new Class85(this.aClass85_3.method1840());
		for (@Pc(22) Class4_Sub26 local22 = (Class4_Sub26) this.aClass85_3.method1843(); local22 != null; local22 = (Class4_Sub26) this.aClass85_3.method1844()) {
			@Pc(34) Class4_Sub22 local34 = new Class4_Sub22(local22.aString285, (int) local22.aLong217);
			this.aClass85_2.method1841(local34, Static165.method2695(local22.aString285));
		}
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(ILclient!fd;I)V")
	private void method603(@OriginalArg(1) Class4_Sub10 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aChar2 = Static219.method3559(arg0.method4674());
		} else if (arg1 == 2) {
			this.aChar1 = Static219.method3559(arg0.method4674());
		} else if (arg1 == 3) {
			this.aString50 = arg0.method4630();
		} else if (arg1 == 4) {
			this.anInt642 = arg0.method4632();
		} else if (arg1 == 5 || arg1 == 6) {
			@Pc(68) int local68 = arg0.method4653();
			this.aClass85_3 = new Class85(Static161.method2608(local68));
			for (@Pc(78) int local78 = 0; local78 < local68; local78++) {
				@Pc(87) int local87 = arg0.method4632();
				@Pc(99) Class4 local99;
				if (arg1 == 5) {
					local99 = new Class4_Sub26(arg0.method4630());
				} else {
					local99 = new Class4_Sub32(arg0.method4632());
				}
				this.aClass85_3.method1841(local99, (long) local87);
			}
		}
	}

	@OriginalMember(owner = "client!cj", name = "b", descriptor = "(II)Z")
	public boolean method604(@OriginalArg(1) int arg0) {
		if (this.aClass85_3 == null) {
			return false;
		}
		if (this.aClass85_2 == null) {
			this.method607();
		}
		@Pc(32) Class4_Sub32 local32 = (Class4_Sub32) this.aClass85_2.method1845((long) arg0);
		return local32 != null;
	}

	@OriginalMember(owner = "client!cj", name = "c", descriptor = "(II)Ljava/lang/String;")
	public String method606(@OriginalArg(0) int arg0) {
		if (this.aClass85_3 == null) {
			return this.aString50;
		} else {
			@Pc(18) Class4_Sub26 local18 = (Class4_Sub26) this.aClass85_3.method1845((long) arg0);
			return local18 == null ? this.aString50 : local18.aString285;
		}
	}

	@OriginalMember(owner = "client!cj", name = "e", descriptor = "(I)V")
	private void method607() {
		this.aClass85_2 = new Class85(this.aClass85_3.method1840());
		for (@Pc(24) Class4_Sub32 local24 = (Class4_Sub32) this.aClass85_3.method1843(); local24 != null; local24 = (Class4_Sub32) this.aClass85_3.method1844()) {
			@Pc(33) Class4_Sub32 local33 = new Class4_Sub32((int) local24.aLong217);
			this.aClass85_2.method1841(local33, (long) local24.anInt5435);
		}
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(ZLclient!fd;)V")
	public void method609(@OriginalArg(1) Class4_Sub10 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method4666();
			if (local9 == 0) {
				return;
			}
			this.method603(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public boolean method611(@OriginalArg(1) String arg0) {
		if (this.aClass85_3 == null) {
			return false;
		}
		if (this.aClass85_2 == null) {
			this.method602();
		}
		for (@Pc(36) Class4_Sub22 local36 = (Class4_Sub22) this.aClass85_2.method1845(Static165.method2695(arg0)); local36 != null; local36 = (Class4_Sub22) this.aClass85_2.method1847()) {
			if (local36.aString248.equals(arg0)) {
				return true;
			}
		}
		return false;
	}
}
