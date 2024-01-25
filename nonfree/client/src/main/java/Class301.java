import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uu")
public final class Class301 {

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "C")
	public char aChar4;

	@OriginalMember(owner = "client!uu", name = "e", descriptor = "Lclient!sd;")
	private Class267 aClass267_42;

	@OriginalMember(owner = "client!uu", name = "i", descriptor = "I")
	private int anInt8801;

	@OriginalMember(owner = "client!uu", name = "j", descriptor = "Lclient!sd;")
	public Class267 aClass267_43;

	@OriginalMember(owner = "client!uu", name = "p", descriptor = "C")
	public char aChar5;

	@OriginalMember(owner = "client!uu", name = "f", descriptor = "Ljava/lang/String;")
	private String aString83 = "null";

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(ILclient!rt;B)V")
	private void method7217(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub27 arg1) {
		if (arg0 == 1) {
			this.aChar5 = Static473.method6742(arg1.method7584());
		} else if (arg0 == 2) {
			this.aChar4 = Static473.method6742(arg1.method7584());
		} else if (arg0 == 3) {
			this.aString83 = arg1.method7589();
		} else if (arg0 == 4) {
			this.anInt8801 = arg1.method7549();
		} else if (arg0 == 5 || arg0 == 6) {
			@Pc(36) int local36 = arg1.method7591();
			this.aClass267_43 = new Class267(Static483.method7134(local36));
			for (@Pc(46) int local46 = 0; local46 < local36; local46++) {
				@Pc(52) int local52 = arg1.method7549();
				@Pc(64) Class3 local64;
				if (arg0 == 5) {
					local64 = new Class3_Sub35(arg1.method7589());
				} else {
					local64 = new Class3_Sub47(arg1.method7549());
				}
				this.aClass267_43.method6640(local64, (long) local52);
			}
		}
	}

	@OriginalMember(owner = "client!uu", name = "b", descriptor = "(B)V")
	private void method7218() {
		this.aClass267_42 = new Class267(this.aClass267_43.method6649());
		for (@Pc(20) Class3_Sub35 local20 = (Class3_Sub35) this.aClass267_43.method6643(); local20 != null; local20 = (Class3_Sub35) this.aClass267_43.method6650()) {
			@Pc(31) Class3_Sub46 local31 = new Class3_Sub46(local20.aString45, (int) local20.aLong285);
			this.aClass267_42.method6640(local31, Static299.method4968(local20.aString45));
		}
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(BI)Z")
	public boolean method7221(@OriginalArg(1) int arg0) {
		if (this.aClass267_43 == null) {
			return false;
		}
		if (this.aClass267_42 == null) {
			this.method7222();
		}
		@Pc(30) Class3_Sub47 local30 = (Class3_Sub47) this.aClass267_42.method6644((long) arg0);
		return local30 != null;
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(I)V")
	private void method7222() {
		this.aClass267_42 = new Class267(this.aClass267_43.method6649());
		for (@Pc(20) Class3_Sub47 local20 = (Class3_Sub47) this.aClass267_43.method6643(); local20 != null; local20 = (Class3_Sub47) this.aClass267_43.method6650()) {
			@Pc(35) Class3_Sub47 local35 = new Class3_Sub47((int) local20.aLong285);
			this.aClass267_42.method6640(local35, (long) local20.anInt8701);
		}
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(ILclient!rt;)V")
	public void method7223(@OriginalArg(1) Class3_Sub27 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method7548();
			if (local5 == 0) {
				return;
			}
			this.method7217(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(Ljava/lang/String;B)Z")
	public boolean method7224(@OriginalArg(0) String arg0) {
		if (this.aClass267_43 == null) {
			return false;
		}
		if (this.aClass267_42 == null) {
			this.method7218();
		}
		for (@Pc(33) Class3_Sub46 local33 = (Class3_Sub46) this.aClass267_42.method6644(Static299.method4968(arg0)); local33 != null; local33 = (Class3_Sub46) this.aClass267_42.method6646()) {
			if (local33.aString67.equals(arg0)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(II)I")
	public int method7225(@OriginalArg(1) int arg0) {
		if (this.aClass267_43 == null) {
			return this.anInt8801;
		} else {
			@Pc(23) Class3_Sub47 local23 = (Class3_Sub47) this.aClass267_43.method6644((long) arg0);
			return local23 == null ? this.anInt8801 : local23.anInt8701;
		}
	}

	@OriginalMember(owner = "client!uu", name = "b", descriptor = "(BI)Ljava/lang/String;")
	public String method7226(@OriginalArg(1) int arg0) {
		if (this.aClass267_43 == null) {
			return this.aString83;
		} else {
			@Pc(25) Class3_Sub35 local25 = (Class3_Sub35) this.aClass267_43.method6644((long) arg0);
			return local25 == null ? this.aString83 : local25.aString45;
		}
	}
}
