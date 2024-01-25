import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dj")
public final class Class2_Sub9_Sub1 extends Class2_Sub9 {

	@OriginalMember(owner = "client!dj", name = "O", descriptor = "C")
	public char aChar2;

	@OriginalMember(owner = "client!dj", name = "T", descriptor = "I")
	private int anInt1088;

	@OriginalMember(owner = "client!dj", name = "V", descriptor = "Lclient!cm;")
	public Class41 aClass41_5;

	@OriginalMember(owner = "client!dj", name = "Z", descriptor = "C")
	public char aChar3;

	@OriginalMember(owner = "client!dj", name = "bb", descriptor = "Lclient!cm;")
	private Class41 aClass41_6;

	@OriginalMember(owner = "client!dj", name = "N", descriptor = "Ljava/lang/String;")
	private String aString7 = "null";

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(Z)V")
	private void method1269() {
		this.aClass41_6 = new Class41(this.aClass41_5.method897());
		for (@Pc(26) Class2_Sub14 local26 = (Class2_Sub14) this.aClass41_5.method896(); local26 != null; local26 = (Class2_Sub14) this.aClass41_5.method904()) {
			@Pc(37) Class2_Sub34 local37 = new Class2_Sub34(local26.aString15, (int) local26.aLong219);
			this.aClass41_6.method901(local37, Static357.method5713(local26.aString15));
		}
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public boolean method1270(@OriginalArg(1) String arg0) {
		if (this.aClass41_5 == null) {
			return false;
		}
		if (this.aClass41_6 == null) {
			this.method1269();
		}
		for (@Pc(33) Class2_Sub34 local33 = (Class2_Sub34) this.aClass41_6.method902(Static357.method5713(arg0)); local33 != null; local33 = (Class2_Sub34) this.aClass41_6.method898()) {
			if (local33.aString54.equals(arg0)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(IB)Ljava/lang/String;")
	public String method1271(@OriginalArg(0) int arg0) {
		if (this.aClass41_5 == null) {
			return this.aString7;
		} else {
			@Pc(22) Class2_Sub14 local22 = (Class2_Sub14) this.aClass41_5.method902((long) arg0);
			return local22 == null ? this.aString7 : local22.aString15;
		}
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(II)I")
	public int method1272(@OriginalArg(1) int arg0) {
		if (this.aClass41_5 == null) {
			return this.anInt1088;
		} else {
			@Pc(24) Class2_Sub23 local24 = (Class2_Sub23) this.aClass41_5.method902((long) arg0);
			return local24 == null ? this.anInt1088 : local24.anInt3818;
		}
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(Lclient!ef;B)V")
	public void method1275(@OriginalArg(0) Class2_Sub12 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method3124();
			if (local15 == 0) {
				return;
			}
			this.method1277(arg0, local15);
		}
	}

	@OriginalMember(owner = "client!dj", name = "d", descriptor = "(B)V")
	private void method1276() {
		this.aClass41_6 = new Class41(this.aClass41_5.method897());
		for (@Pc(20) Class2_Sub23 local20 = (Class2_Sub23) this.aClass41_5.method896(); local20 != null; local20 = (Class2_Sub23) this.aClass41_5.method904()) {
			@Pc(37) Class2_Sub23 local37 = new Class2_Sub23((int) local20.aLong219);
			this.aClass41_6.method901(local37, (long) local20.anInt3818);
		}
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(BLclient!ef;I)V")
	private void method1277(@OriginalArg(1) Class2_Sub12 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aChar2 = Static294.method4922(arg0.method3122());
		} else if (arg1 == 2) {
			this.aChar3 = Static294.method4922(arg0.method3122());
		} else if (arg1 == 3) {
			this.aString7 = arg0.method3113();
		} else if (arg1 == 4) {
			this.anInt1088 = arg0.method3135();
		} else if (arg1 == 5 || arg1 == 6) {
			@Pc(34) int local34 = arg0.method3104();
			this.aClass41_5 = new Class41(Static51.method1026(local34));
			for (@Pc(44) int local44 = 0; local44 < local34; local44++) {
				@Pc(50) int local50 = arg0.method3135();
				@Pc(62) Class2 local62;
				if (arg1 == 5) {
					local62 = new Class2_Sub14(arg0.method3113());
				} else {
					local62 = new Class2_Sub23(arg0.method3135());
				}
				this.aClass41_5.method901(local62, (long) local50);
			}
		}
	}

	@OriginalMember(owner = "client!dj", name = "b", descriptor = "(IB)Z")
	public boolean method1279(@OriginalArg(0) int arg0) {
		if (this.aClass41_5 == null) {
			return false;
		}
		if (this.aClass41_6 == null) {
			this.method1276();
		}
		@Pc(22) Class2_Sub23 local22 = (Class2_Sub23) this.aClass41_6.method902((long) arg0);
		return local22 != null;
	}
}
