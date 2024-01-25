import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ss")
public final class Class309 {

	@OriginalMember(owner = "client!ss", name = "b", descriptor = "C")
	public char aChar3;

	@OriginalMember(owner = "client!ss", name = "e", descriptor = "Lclient!il;")
	public Class162 aClass162_36;

	@OriginalMember(owner = "client!ss", name = "f", descriptor = "I")
	private int anInt8316;

	@OriginalMember(owner = "client!ss", name = "r", descriptor = "Lclient!il;")
	private Class162 aClass162_37;

	@OriginalMember(owner = "client!ss", name = "s", descriptor = "C")
	public char aChar4;

	@OriginalMember(owner = "client!ss", name = "l", descriptor = "Ljava/lang/String;")
	private String aString93 = "null";

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	public boolean method6893(@OriginalArg(0) String arg0) {
		if (this.aClass162_36 == null) {
			return false;
		}
		if (this.aClass162_37 == null) {
			this.method6900();
		}
		for (@Pc(25) Class2_Sub19 local25 = (Class2_Sub19) this.aClass162_37.method3519(Static19.method378(arg0)); local25 != null; local25 = (Class2_Sub19) this.aClass162_37.method3528()) {
			if (local25.aString21.equals(arg0)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(ILclient!es;I)V")
	private void method6899(@OriginalArg(1) Class2_Sub15 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aChar4 = Static128.method2158(arg0.method4304());
		} else if (arg1 == 2) {
			this.aChar3 = Static128.method2158(arg0.method4304());
		} else if (arg1 == 3) {
			this.aString93 = arg0.method4324();
		} else if (arg1 == 4) {
			this.anInt8316 = arg0.method4307();
		} else if (arg1 == 5 || arg1 == 6) {
			@Pc(31) int local31 = arg0.method4294();
			this.aClass162_36 = new Class162(Static89.method7259(local31));
			for (@Pc(41) int local41 = 0; local41 < local31; local41++) {
				@Pc(47) int local47 = arg0.method4307();
				@Pc(57) Class2 local57;
				if (arg1 == 5) {
					local57 = new Class2_Sub1(arg0.method4324());
				} else {
					local57 = new Class2_Sub22(arg0.method4307());
				}
				this.aClass162_36.method3522(local57, (long) local47);
			}
		}
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(B)V")
	private void method6900() {
		this.aClass162_37 = new Class162(this.aClass162_36.method3526());
		for (@Pc(20) Class2_Sub1 local20 = (Class2_Sub1) this.aClass162_36.method3527(); local20 != null; local20 = (Class2_Sub1) this.aClass162_36.method3523()) {
			@Pc(39) Class2_Sub19 local39 = new Class2_Sub19(local20.aString1, (int) local20.aLong268);
			this.aClass162_37.method3522(local39, Static19.method378(local20.aString1));
		}
	}

	@OriginalMember(owner = "client!ss", name = "b", descriptor = "(II)Z")
	public boolean method6903(@OriginalArg(0) int arg0) {
		if (this.aClass162_36 == null) {
			return false;
		}
		if (this.aClass162_37 == null) {
			this.method6905();
		}
		@Pc(22) Class2_Sub22 local22 = (Class2_Sub22) this.aClass162_37.method3519((long) arg0);
		return local22 != null;
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(I)V")
	private void method6905() {
		this.aClass162_37 = new Class162(this.aClass162_36.method3526());
		for (@Pc(26) Class2_Sub22 local26 = (Class2_Sub22) this.aClass162_36.method3527(); local26 != null; local26 = (Class2_Sub22) this.aClass162_36.method3523()) {
			@Pc(35) Class2_Sub22 local35 = new Class2_Sub22((int) local26.aLong268);
			this.aClass162_37.method3522(local35, (long) local26.anInt3866);
		}
	}

	@OriginalMember(owner = "client!ss", name = "c", descriptor = "(II)I")
	public int method6906(@OriginalArg(0) int arg0) {
		if (this.aClass162_36 == null) {
			return this.anInt8316;
		} else {
			@Pc(25) Class2_Sub22 local25 = (Class2_Sub22) this.aClass162_36.method3519((long) arg0);
			return local25 == null ? this.anInt8316 : local25.anInt3866;
		}
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(Lclient!es;B)V")
	public void method6907(@OriginalArg(0) Class2_Sub15 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method4325();
			if (local13 == 0) {
				return;
			}
			this.method6899(arg0, local13);
		}
	}

	@OriginalMember(owner = "client!ss", name = "d", descriptor = "(II)Ljava/lang/String;")
	public String method6908(@OriginalArg(1) int arg0) {
		if (this.aClass162_36 == null) {
			return this.aString93;
		} else {
			@Pc(23) Class2_Sub1 local23 = (Class2_Sub1) this.aClass162_36.method3519((long) arg0);
			return local23 == null ? this.aString93 : local23.aString1;
		}
	}
}
