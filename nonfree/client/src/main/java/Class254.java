import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rh")
public final class Class254 {

	@OriginalMember(owner = "client!rh", name = "f", descriptor = "I")
	private int anInt7503;

	@OriginalMember(owner = "client!rh", name = "j", descriptor = "Lclient!cb;")
	public Class42 aClass42_30;

	@OriginalMember(owner = "client!rh", name = "k", descriptor = "Lclient!cb;")
	private Class42 aClass42_31;

	@OriginalMember(owner = "client!rh", name = "m", descriptor = "C")
	public char aChar4;

	@OriginalMember(owner = "client!rh", name = "s", descriptor = "C")
	public char aChar5;

	@OriginalMember(owner = "client!rh", name = "e", descriptor = "Ljava/lang/String;")
	private String aString70 = "null";

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(IB)I")
	public int method6083(@OriginalArg(0) int arg0) {
		if (this.aClass42_30 == null) {
			return this.anInt7503;
		} else {
			@Pc(23) Class5_Sub27 local23 = (Class5_Sub27) this.aClass42_30.method1109((long) arg0);
			return local23 == null ? this.anInt7503 : local23.anInt4812;
		}
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(B)V")
	private void method6084() {
		this.aClass42_31 = new Class42(this.aClass42_30.method1107());
		for (@Pc(20) Class5_Sub27 local20 = (Class5_Sub27) this.aClass42_30.method1103(); local20 != null; local20 = (Class5_Sub27) this.aClass42_30.method1105()) {
			@Pc(34) Class5_Sub27 local34 = new Class5_Sub27((int) local20.aLong253);
			this.aClass42_31.method1106((long) local20.anInt4812, local34);
		}
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(BI)Ljava/lang/String;")
	public String method6085(@OriginalArg(1) int arg0) {
		if (this.aClass42_30 == null) {
			return this.aString70;
		} else {
			@Pc(22) Class5_Sub50 local22 = (Class5_Sub50) this.aClass42_30.method1109((long) arg0);
			return local22 == null ? this.aString70 : local22.aString83;
		}
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(Lclient!co;II)V")
	private void method6087(@OriginalArg(0) Class5_Sub3 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aChar5 = Static260.method6803(arg0.method4196());
		} else if (arg1 == 2) {
			this.aChar4 = Static260.method6803(arg0.method4196());
		} else if (arg1 == 3) {
			this.aString70 = arg0.method4234();
		} else if (arg1 == 4) {
			this.anInt7503 = arg0.method4230();
		} else if (arg1 == 5 || arg1 == 6) {
			@Pc(62) int local62 = arg0.method4227();
			this.aClass42_30 = new Class42(Static179.method3071(local62));
			for (@Pc(74) int local74 = 0; local74 < local62; local74++) {
				@Pc(80) int local80 = arg0.method4230();
				@Pc(92) Class5 local92;
				if (arg1 == 5) {
					local92 = new Class5_Sub50(arg0.method4234());
				} else {
					local92 = new Class5_Sub27(arg0.method4230());
				}
				this.aClass42_30.method1106((long) local80, local92);
			}
		}
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(BLjava/lang/String;)Z")
	public boolean method6088(@OriginalArg(1) String arg0) {
		if (this.aClass42_30 == null) {
			return false;
		}
		if (this.aClass42_31 == null) {
			this.method6091();
		}
		for (@Pc(33) Class5_Sub39 local33 = (Class5_Sub39) this.aClass42_31.method1109(Static45.method914(arg0)); local33 != null; local33 = (Class5_Sub39) this.aClass42_31.method1110()) {
			if (local33.aString69.equals(arg0)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(ILclient!co;)V")
	public void method6090(@OriginalArg(1) Class5_Sub3 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method4220();
			if (local5 == 0) {
				return;
			}
			this.method6087(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(I)V")
	private void method6091() {
		this.aClass42_31 = new Class42(this.aClass42_30.method1107());
		for (@Pc(27) Class5_Sub50 local27 = (Class5_Sub50) this.aClass42_30.method1103(); local27 != null; local27 = (Class5_Sub50) this.aClass42_30.method1105()) {
			@Pc(38) Class5_Sub39 local38 = new Class5_Sub39(local27.aString83, (int) local27.aLong253);
			this.aClass42_31.method1106(Static45.method914(local27.aString83), local38);
		}
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(ZI)Z")
	public boolean method6092(@OriginalArg(1) int arg0) {
		if (this.aClass42_30 == null) {
			return false;
		}
		if (this.aClass42_31 == null) {
			this.method6084();
		}
		@Pc(27) Class5_Sub27 local27 = (Class5_Sub27) this.aClass42_31.method1109((long) arg0);
		return local27 != null;
	}
}
