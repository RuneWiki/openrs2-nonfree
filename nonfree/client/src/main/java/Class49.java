import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cl")
public final class Class49 {

	@OriginalMember(owner = "client!cl", name = "d", descriptor = "Lclient!hd;")
	public Class128 aClass128_3;

	@OriginalMember(owner = "client!cl", name = "f", descriptor = "C")
	public char aChar2;

	@OriginalMember(owner = "client!cl", name = "j", descriptor = "Lclient!hd;")
	private Class128 aClass128_4;

	@OriginalMember(owner = "client!cl", name = "k", descriptor = "I")
	private int anInt1318;

	@OriginalMember(owner = "client!cl", name = "r", descriptor = "C")
	public char aChar3;

	@OriginalMember(owner = "client!cl", name = "b", descriptor = "Ljava/lang/String;")
	private String aString14 = "null";

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(ZLclient!ji;)V")
	public void method1304(@OriginalArg(1) Class6_Sub21 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method6069();
			if (local15 == 0) {
				return;
			}
			this.method1314(local15, arg0);
		}
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(IZ)I")
	public int method1305(@OriginalArg(0) int arg0) {
		if (this.aClass128_3 == null) {
			return this.anInt1318;
		} else {
			@Pc(17) Class6_Sub35 local17 = (Class6_Sub35) this.aClass128_3.method3263((long) arg0);
			return local17 == null ? this.anInt1318 : local17.anInt6119;
		}
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(Ljava/lang/String;B)Z")
	public boolean method1307(@OriginalArg(0) String arg0) {
		if (this.aClass128_3 == null) {
			return false;
		}
		if (this.aClass128_4 == null) {
			this.method1310();
		}
		for (@Pc(33) Class6_Sub33 local33 = (Class6_Sub33) this.aClass128_4.method3263(Static430.method6181(arg0)); local33 != null; local33 = (Class6_Sub33) this.aClass128_4.method3264()) {
			if (local33.aString45.equals(arg0)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(II)Ljava/lang/String;")
	public String method1308(@OriginalArg(1) int arg0) {
		if (this.aClass128_3 == null) {
			return this.aString14;
		} else {
			@Pc(17) Class6_Sub25 local17 = (Class6_Sub25) this.aClass128_3.method3263((long) arg0);
			return local17 == null ? this.aString14 : local17.aString28;
		}
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(Z)V")
	private void method1310() {
		this.aClass128_4 = new Class128(this.aClass128_3.method3275());
		for (@Pc(20) Class6_Sub25 local20 = (Class6_Sub25) this.aClass128_3.method3265(); local20 != null; local20 = (Class6_Sub25) this.aClass128_3.method3273()) {
			@Pc(31) Class6_Sub33 local31 = new Class6_Sub33(local20.aString28, (int) local20.aLong263);
			this.aClass128_4.method3267(local31, Static430.method6181(local20.aString28));
		}
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(ZI)Z")
	public boolean method1311(@OriginalArg(1) int arg0) {
		if (this.aClass128_3 == null) {
			return false;
		}
		if (this.aClass128_4 == null) {
			this.method1313();
		}
		@Pc(22) Class6_Sub35 local22 = (Class6_Sub35) this.aClass128_4.method3263((long) arg0);
		return local22 != null;
	}

	@OriginalMember(owner = "client!cl", name = "b", descriptor = "(I)V")
	private void method1313() {
		this.aClass128_4 = new Class128(this.aClass128_3.method3275());
		for (@Pc(25) Class6_Sub35 local25 = (Class6_Sub35) this.aClass128_3.method3265(); local25 != null; local25 = (Class6_Sub35) this.aClass128_3.method3273()) {
			@Pc(34) Class6_Sub35 local34 = new Class6_Sub35((int) local25.aLong263);
			this.aClass128_4.method3267(local34, (long) local25.anInt6119);
		}
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(IILclient!ji;)V")
	private void method1314(@OriginalArg(0) int arg0, @OriginalArg(2) Class6_Sub21 arg1) {
		if (arg0 == 1) {
			this.aChar2 = Static439.method6249(arg1.method6055());
		} else if (arg0 == 2) {
			this.aChar3 = Static439.method6249(arg1.method6055());
		} else if (arg0 == 3) {
			this.aString14 = arg1.method6044();
		} else if (arg0 == 4) {
			this.anInt1318 = arg1.method6036();
		} else if (arg0 == 5 || arg0 == 6) {
			@Pc(51) int local51 = arg1.method6003();
			this.aClass128_3 = new Class128(Static253.method4296(local51));
			for (@Pc(61) int local61 = 0; local61 < local51; local61++) {
				@Pc(67) int local67 = arg1.method6036();
				@Pc(77) Class6 local77;
				if (arg0 == 5) {
					local77 = new Class6_Sub25(arg1.method6044());
				} else {
					local77 = new Class6_Sub35(arg1.method6036());
				}
				this.aClass128_3.method3267(local77, (long) local67);
			}
		}
	}
}
