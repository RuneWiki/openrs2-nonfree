import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mj")
public final class Class1_Sub3_Sub14 extends Class1_Sub3 {

	@OriginalMember(owner = "client!mj", name = "I", descriptor = "Lclient!vl;")
	public Class186 aClass186_15;

	@OriginalMember(owner = "client!mj", name = "J", descriptor = "C")
	public char aChar3;

	@OriginalMember(owner = "client!mj", name = "K", descriptor = "Lclient!vl;")
	private Class186 aClass186_16;

	@OriginalMember(owner = "client!mj", name = "V", descriptor = "I")
	private int anInt3876;

	@OriginalMember(owner = "client!mj", name = "fb", descriptor = "C")
	public char aChar4;

	@OriginalMember(owner = "client!mj", name = "cb", descriptor = "Ljava/lang/String;")
	private String aString246 = "null";

	@OriginalMember(owner = "client!mj", name = "e", descriptor = "(I)V")
	private void method2802() {
		this.aClass186_16 = new Class186(this.aClass186_15.method4580());
		for (@Pc(20) Class1_Sub18 local20 = (Class1_Sub18) this.aClass186_15.method4567(); local20 != null; local20 = (Class1_Sub18) this.aClass186_15.method4579()) {
			@Pc(32) Class1_Sub22 local32 = new Class1_Sub22(local20.aString250, (int) local20.aLong247);
			this.aClass186_16.method4575(Static197.method3167(local20.aString250), local32);
		}
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(BI)Ljava/lang/String;")
	public String method2804(@OriginalArg(1) int arg0) {
		if (this.aClass186_15 == null) {
			return this.aString246;
		} else {
			@Pc(24) Class1_Sub18 local24 = (Class1_Sub18) this.aClass186_15.method4570((long) arg0);
			return local24 == null ? this.aString246 : local24.aString250;
		}
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(ZLclient!qm;I)V")
	private void method2806(@OriginalArg(1) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aChar4 = Static23.method506(arg0.method2212());
		} else if (arg1 == 2) {
			this.aChar3 = Static23.method506(arg0.method2212());
		} else if (arg1 == 3) {
			this.aString246 = arg0.method2237();
		} else if (arg1 == 4) {
			this.anInt3876 = arg0.method2194();
		} else if (arg1 == 5 || arg1 == 6) {
			@Pc(66) int local66 = arg0.method2244();
			this.aClass186_15 = new Class186(Static315.method4766(local66));
			for (@Pc(76) int local76 = 0; local76 < local66; local76++) {
				@Pc(87) int local87 = arg0.method2194();
				@Pc(99) Class1 local99;
				if (arg1 == 5) {
					local99 = new Class1_Sub18(arg0.method2237());
				} else {
					local99 = new Class1_Sub17(arg0.method2194());
				}
				this.aClass186_15.method4575((long) local87, local99);
			}
		}
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(IB)Z")
	public boolean method2807(@OriginalArg(0) int arg0) {
		if (this.aClass186_15 == null) {
			return false;
		}
		if (this.aClass186_16 == null) {
			this.method2811();
		}
		@Pc(24) Class1_Sub17 local24 = (Class1_Sub17) this.aClass186_16.method4570((long) arg0);
		return local24 != null;
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(ILclient!qm;)V")
	public void method2809(@OriginalArg(1) Class1_Sub14 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method2199();
			if (local5 == 0) {
				return;
			}
			this.method2806(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(BLjava/lang/String;)Z")
	public boolean method2810(@OriginalArg(1) String arg0) {
		if (this.aClass186_15 == null) {
			return false;
		}
		if (this.aClass186_16 == null) {
			this.method2802();
		}
		for (@Pc(31) Class1_Sub22 local31 = (Class1_Sub22) this.aClass186_16.method4570(Static197.method3167(arg0)); local31 != null; local31 = (Class1_Sub22) this.aClass186_16.method4583()) {
			if (local31.aString300.equals(arg0)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!mj", name = "c", descriptor = "(B)V")
	private void method2811() {
		this.aClass186_16 = new Class186(this.aClass186_15.method4580());
		for (@Pc(20) Class1_Sub17 local20 = (Class1_Sub17) this.aClass186_15.method4567(); local20 != null; local20 = (Class1_Sub17) this.aClass186_15.method4579()) {
			@Pc(29) Class1_Sub17 local29 = new Class1_Sub17((int) local20.aLong247);
			this.aClass186_16.method4575((long) local20.anInt3669, local29);
		}
	}

	@OriginalMember(owner = "client!mj", name = "b", descriptor = "(IB)I")
	public int method2813(@OriginalArg(0) int arg0) {
		if (this.aClass186_15 == null) {
			return this.anInt3876;
		} else {
			@Pc(23) Class1_Sub17 local23 = (Class1_Sub17) this.aClass186_15.method4570((long) arg0);
			return local23 == null ? this.anInt3876 : local23.anInt3669;
		}
	}
}
