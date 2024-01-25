import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fa")
public final class Class69 {

	@OriginalMember(owner = "client!fa", name = "b", descriptor = "C")
	public char aChar3;

	@OriginalMember(owner = "client!fa", name = "k", descriptor = "Lclient!sq;")
	private Class214 aClass214_10;

	@OriginalMember(owner = "client!fa", name = "q", descriptor = "C")
	public char aChar4;

	@OriginalMember(owner = "client!fa", name = "s", descriptor = "I")
	private int anInt1709;

	@OriginalMember(owner = "client!fa", name = "u", descriptor = "Lclient!sq;")
	public Class214 aClass214_11;

	@OriginalMember(owner = "client!fa", name = "o", descriptor = "Ljava/lang/String;")
	private String aString22 = "null";

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(Ljava/lang/String;B)Z")
	public boolean method1531(@OriginalArg(0) String arg0) {
		if (this.aClass214_11 == null) {
			return false;
		}
		if (this.aClass214_10 == null) {
			this.method1541();
		}
		for (@Pc(30) Class2_Sub29 local30 = (Class2_Sub29) this.aClass214_10.method5059(Static112.method2148(arg0)); local30 != null; local30 = (Class2_Sub29) this.aClass214_10.method5061()) {
			if (local30.aString43.equals(arg0)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(ILclient!lk;)V")
	public void method1533(@OriginalArg(1) Class2_Sub13 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method4240();
			if (local9 == 0) {
				return;
			}
			this.method1539(local9, arg0);
		}
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(II)I")
	public int method1534(@OriginalArg(0) int arg0) {
		if (this.aClass214_11 == null) {
			return this.anInt1709;
		} else {
			@Pc(19) Class2_Sub44 local19 = (Class2_Sub44) this.aClass214_11.method5059((long) arg0);
			return local19 == null ? this.anInt1709 : local19.anInt6631;
		}
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(ZI)Ljava/lang/String;")
	public String method1535(@OriginalArg(1) int arg0) {
		if (this.aClass214_11 == null) {
			return this.aString22;
		} else {
			@Pc(26) Class2_Sub32 local26 = (Class2_Sub32) this.aClass214_11.method5059((long) arg0);
			return local26 == null ? this.aString22 : local26.aString49;
		}
	}

	@OriginalMember(owner = "client!fa", name = "c", descriptor = "(II)Z")
	public boolean method1537(@OriginalArg(0) int arg0) {
		if (this.aClass214_11 == null) {
			return false;
		}
		if (this.aClass214_10 == null) {
			this.method1542();
		}
		@Pc(22) Class2_Sub44 local22 = (Class2_Sub44) this.aClass214_10.method5059((long) arg0);
		return local22 != null;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(ILclient!lk;I)V")
	private void method1539(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub13 arg1) {
		if (arg0 == 1) {
			this.aChar4 = Static223.method3757(arg1.method4217());
		} else if (arg0 == 2) {
			this.aChar3 = Static223.method3757(arg1.method4217());
		} else if (arg0 == 3) {
			this.aString22 = arg1.method4201();
		} else if (arg0 == 4) {
			this.anInt1709 = arg1.method4239();
		} else if (arg0 == 5 || arg0 == 6) {
			@Pc(49) int local49 = arg1.method4245();
			this.aClass214_11 = new Class214(Static353.method5359(local49));
			for (@Pc(59) int local59 = 0; local59 < local49; local59++) {
				@Pc(65) int local65 = arg1.method4239();
				@Pc(77) Class2 local77;
				if (arg0 == 5) {
					local77 = new Class2_Sub32(arg1.method4201());
				} else {
					local77 = new Class2_Sub44(arg1.method4239());
				}
				this.aClass214_11.method5065((long) local65, local77);
			}
		}
	}

	@OriginalMember(owner = "client!fa", name = "b", descriptor = "(I)V")
	private void method1541() {
		this.aClass214_10 = new Class214(this.aClass214_11.method5062());
		for (@Pc(26) Class2_Sub32 local26 = (Class2_Sub32) this.aClass214_11.method5060(); local26 != null; local26 = (Class2_Sub32) this.aClass214_11.method5064()) {
			@Pc(37) Class2_Sub29 local37 = new Class2_Sub29(local26.aString49, (int) local26.aLong208);
			this.aClass214_10.method5065(Static112.method2148(local26.aString49), local37);
		}
	}

	@OriginalMember(owner = "client!fa", name = "c", descriptor = "(I)V")
	private void method1542() {
		this.aClass214_10 = new Class214(this.aClass214_11.method5062());
		for (@Pc(20) Class2_Sub44 local20 = (Class2_Sub44) this.aClass214_11.method5060(); local20 != null; local20 = (Class2_Sub44) this.aClass214_11.method5064()) {
			@Pc(29) Class2_Sub44 local29 = new Class2_Sub44((int) local20.aLong208);
			this.aClass214_10.method5065((long) local20.anInt6631, local29);
		}
	}
}
