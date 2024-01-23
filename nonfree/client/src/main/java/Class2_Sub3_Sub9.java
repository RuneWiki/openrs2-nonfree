import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ih")
public final class Class2_Sub3_Sub9 extends Class2_Sub3 {

	@OriginalMember(owner = "client!ih", name = "H", descriptor = "C")
	public char aChar2;

	@OriginalMember(owner = "client!ih", name = "N", descriptor = "Lclient!ii;")
	private Class79 aClass79_11;

	@OriginalMember(owner = "client!ih", name = "P", descriptor = "Lclient!ii;")
	public Class79 aClass79_12;

	@OriginalMember(owner = "client!ih", name = "W", descriptor = "I")
	private int anInt2312;

	@OriginalMember(owner = "client!ih", name = "X", descriptor = "C")
	public char aChar3;

	@OriginalMember(owner = "client!ih", name = "Q", descriptor = "Ljava/lang/String;")
	private String aString118 = "null";

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	public boolean method1980(@OriginalArg(0) String arg0) {
		if (this.aClass79_12 == null) {
			return false;
		}
		if (this.aClass79_11 == null) {
			this.method1986();
		}
		for (@Pc(33) Class2_Sub13 local33 = (Class2_Sub13) this.aClass79_11.method2002(Static176.method3063(arg0)); local33 != null; local33 = (Class2_Sub13) this.aClass79_11.method1993()) {
			if (local33.aString89.equals(arg0)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(Lclient!wm;IB)V")
	private void method1981(@OriginalArg(0) Class2_Sub26 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.aChar3 = Static184.method3157(arg0.method4220());
		} else if (arg1 == 2) {
			this.aChar2 = Static184.method3157(arg0.method4220());
		} else if (arg1 == 3) {
			this.aString118 = arg0.method4265();
		} else if (arg1 == 4) {
			this.anInt2312 = arg0.method4228();
		} else if (arg1 == 5 || arg1 == 6) {
			@Pc(54) int local54 = arg0.method4242();
			this.aClass79_12 = new Class79(Static7.method217(local54));
			for (@Pc(64) int local64 = 0; local64 < local54; local64++) {
				@Pc(71) int local71 = arg0.method4228();
				@Pc(83) Class2 local83;
				if (arg1 == 5) {
					local83 = new Class2_Sub16(arg0.method4265());
				} else {
					local83 = new Class2_Sub21(arg0.method4228());
				}
				this.aClass79_12.method1994((long) local71, local83);
			}
		}
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(Lclient!wm;I)V")
	public void method1983(@OriginalArg(0) Class2_Sub26 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method4261();
			if (local15 == 0) {
				return;
			}
			this.method1981(arg0, local15);
		}
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(IZ)Ljava/lang/String;")
	public String method1985(@OriginalArg(0) int arg0) {
		if (this.aClass79_12 == null) {
			return this.aString118;
		} else {
			@Pc(25) Class2_Sub16 local25 = (Class2_Sub16) this.aClass79_12.method2002((long) arg0);
			return local25 == null ? this.aString118 : local25.aString160;
		}
	}

	@OriginalMember(owner = "client!ih", name = "c", descriptor = "(B)V")
	private void method1986() {
		this.aClass79_11 = new Class79(this.aClass79_12.method2001());
		for (@Pc(24) Class2_Sub16 local24 = (Class2_Sub16) this.aClass79_12.method1992(); local24 != null; local24 = (Class2_Sub16) this.aClass79_12.method1991()) {
			@Pc(35) Class2_Sub13 local35 = new Class2_Sub13(local24.aString160, (int) local24.aLong315);
			this.aClass79_11.method1994(Static176.method3063(local24.aString160), local35);
		}
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(IB)Z")
	public boolean method1988(@OriginalArg(0) int arg0) {
		if (this.aClass79_12 == null) {
			return false;
		}
		if (this.aClass79_11 == null) {
			this.method1990();
		}
		@Pc(33) Class2_Sub21 local33 = (Class2_Sub21) this.aClass79_11.method2002((long) arg0);
		return local33 != null;
	}

	@OriginalMember(owner = "client!ih", name = "b", descriptor = "(II)I")
	public int method1989(@OriginalArg(0) int arg0) {
		if (this.aClass79_12 == null) {
			return this.anInt2312;
		} else {
			@Pc(25) Class2_Sub21 local25 = (Class2_Sub21) this.aClass79_12.method2002((long) arg0);
			return local25 == null ? this.anInt2312 : local25.anInt4234;
		}
	}

	@OriginalMember(owner = "client!ih", name = "d", descriptor = "(B)V")
	private void method1990() {
		this.aClass79_11 = new Class79(this.aClass79_12.method2001());
		for (@Pc(22) Class2_Sub21 local22 = (Class2_Sub21) this.aClass79_12.method1992(); local22 != null; local22 = (Class2_Sub21) this.aClass79_12.method1991()) {
			@Pc(32) Class2_Sub21 local32 = new Class2_Sub21((int) local22.aLong315);
			this.aClass79_11.method1994((long) local22.anInt4234, local32);
		}
	}
}
