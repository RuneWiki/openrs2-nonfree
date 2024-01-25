import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ra")
public final class Class295 {

	@OriginalMember(owner = "client!ra", name = "e", descriptor = "C")
	public char aChar2;

	@OriginalMember(owner = "client!ra", name = "g", descriptor = "Lclient!tba;")
	private Class323 aClass323_29;

	@OriginalMember(owner = "client!ra", name = "l", descriptor = "I")
	private int anInt7796;

	@OriginalMember(owner = "client!ra", name = "m", descriptor = "C")
	public char aChar3;

	@OriginalMember(owner = "client!ra", name = "p", descriptor = "Lclient!tba;")
	public Class323 aClass323_30;

	@OriginalMember(owner = "client!ra", name = "o", descriptor = "Ljava/lang/String;")
	private String aString73 = "null";

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(BI)Ljava/lang/String;")
	public String method6817(@OriginalArg(1) int arg0) {
		if (this.aClass323_30 == null) {
			return this.aString73;
		} else {
			@Pc(17) Class2_Sub33 local17 = (Class2_Sub33) this.aClass323_30.method7484((long) arg0);
			return local17 == null ? this.aString73 : local17.aString60;
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(ZLjava/lang/String;)Z")
	public boolean method6818(@OriginalArg(1) String arg0) {
		if (this.aClass323_30 == null) {
			return false;
		}
		if (this.aClass323_29 == null) {
			this.method6820();
		}
		for (@Pc(31) Class2_Sub24 local31 = (Class2_Sub24) this.aClass323_29.method7484(Static182.method3119(arg0)); local31 != null; local31 = (Class2_Sub24) this.aClass323_29.method7486()) {
			if (local31.aString39.equals(arg0)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(BLclient!sl;I)V")
	private void method6819(@OriginalArg(1) Class2_Sub17 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aChar2 = Static95.method1918(arg0.method2860());
		} else if (arg1 == 2) {
			this.aChar3 = Static95.method1918(arg0.method2860());
		} else if (arg1 == 3) {
			this.aString73 = arg0.method2833();
		} else if (arg1 == 4) {
			this.anInt7796 = arg0.method2881();
		} else if (arg1 == 5 || arg1 == 6) {
			@Pc(61) int local61 = arg0.method2825();
			this.aClass323_30 = new Class323(Static613.method8565(local61));
			for (@Pc(71) int local71 = 0; local71 < local61; local71++) {
				@Pc(76) int local76 = arg0.method2881();
				@Pc(86) Class2 local86;
				if (arg1 == 5) {
					local86 = new Class2_Sub33(arg0.method2833());
				} else {
					local86 = new Class2_Sub41(arg0.method2881());
				}
				this.aClass323_30.method7477(local86, (long) local76);
			}
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(I)V")
	private void method6820() {
		this.aClass323_29 = new Class323(this.aClass323_30.method7478());
		for (@Pc(20) Class2_Sub33 local20 = (Class2_Sub33) this.aClass323_30.method7480(); local20 != null; local20 = (Class2_Sub33) this.aClass323_30.method7482()) {
			@Pc(30) Class2_Sub24 local30 = new Class2_Sub24(local20.aString60, (int) local20.aLong278);
			this.aClass323_29.method7477(local30, Static182.method3119(local20.aString60));
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(B)V")
	private void method6821() {
		this.aClass323_29 = new Class323(this.aClass323_30.method7478());
		for (@Pc(26) Class2_Sub41 local26 = (Class2_Sub41) this.aClass323_30.method7480(); local26 != null; local26 = (Class2_Sub41) this.aClass323_30.method7482()) {
			@Pc(34) Class2_Sub41 local34 = new Class2_Sub41((int) local26.aLong278);
			this.aClass323_29.method7477(local34, (long) local26.anInt9197);
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(ILclient!sl;)V")
	public void method6822(@OriginalArg(1) Class2_Sub17 arg0) {
		while (true) {
			@Pc(12) int local12 = arg0.method2859();
			if (local12 == 0) {
				return;
			}
			this.method6819(arg0, local12);
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(II)I")
	public int method6823(@OriginalArg(1) int arg0) {
		if (this.aClass323_30 == null) {
			return this.anInt7796;
		} else {
			@Pc(22) Class2_Sub41 local22 = (Class2_Sub41) this.aClass323_30.method7484((long) arg0);
			return local22 == null ? this.anInt7796 : local22.anInt9197;
		}
	}

	@OriginalMember(owner = "client!ra", name = "b", descriptor = "(II)Z")
	public boolean method6825(@OriginalArg(1) int arg0) {
		if (this.aClass323_30 == null) {
			return false;
		}
		if (this.aClass323_29 == null) {
			this.method6821();
		}
		@Pc(22) Class2_Sub41 local22 = (Class2_Sub41) this.aClass323_29.method7484((long) arg0);
		return local22 != null;
	}
}
