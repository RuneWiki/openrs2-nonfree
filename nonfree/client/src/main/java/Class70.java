import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dl")
public final class Class70 {

	@OriginalMember(owner = "client!dl", name = "b", descriptor = "Lclient!sba;")
	public Class297 aClass297_4;

	@OriginalMember(owner = "client!dl", name = "g", descriptor = "Lclient!sba;")
	private Class297 aClass297_5;

	@OriginalMember(owner = "client!dl", name = "h", descriptor = "C")
	public char aChar2;

	@OriginalMember(owner = "client!dl", name = "j", descriptor = "I")
	private int anInt2420;

	@OriginalMember(owner = "client!dl", name = "k", descriptor = "C")
	public char aChar3;

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "Ljava/lang/String;")
	private String aString50 = "null";

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(ILclient!ie;)V")
	public void method2038(@OriginalArg(1) Class3_Sub26 arg0) {
		while (true) {
			@Pc(14) int local14 = arg0.method6814();
			if (local14 == 0) {
				return;
			}
			this.method2044(arg0, local14);
		}
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(ZLjava/lang/String;)Z")
	public boolean method2039(@OriginalArg(1) String arg0) {
		if (this.aClass297_4 == null) {
			return false;
		}
		if (this.aClass297_5 == null) {
			this.method2043();
		}
		for (@Pc(30) Class3_Sub42 local30 = (Class3_Sub42) this.aClass297_5.method6531(Static333.method4889(arg0)); local30 != null; local30 = (Class3_Sub42) this.aClass297_5.method6538()) {
			if (local30.aString206.equals(arg0)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(II)I")
	public int method2040(@OriginalArg(1) int arg0) {
		if (this.aClass297_4 == null) {
			return this.anInt2420;
		} else {
			@Pc(17) Class3_Sub2 local17 = (Class3_Sub2) this.aClass297_4.method6531((long) arg0);
			return local17 == null ? this.anInt2420 : local17.anInt39;
		}
	}

	@OriginalMember(owner = "client!dl", name = "b", descriptor = "(II)Ljava/lang/String;")
	public String method2041(@OriginalArg(1) int arg0) {
		if (this.aClass297_4 == null) {
			return this.aString50;
		} else {
			@Pc(23) Class3_Sub46 local23 = (Class3_Sub46) this.aClass297_4.method6531((long) arg0);
			return local23 == null ? this.aString50 : local23.aString217;
		}
	}

	@OriginalMember(owner = "client!dl", name = "c", descriptor = "(II)Z")
	public boolean method2042(@OriginalArg(1) int arg0) {
		if (this.aClass297_4 == null) {
			return false;
		}
		if (this.aClass297_5 == null) {
			this.method2045();
		}
		@Pc(28) Class3_Sub2 local28 = (Class3_Sub2) this.aClass297_5.method6531((long) arg0);
		return local28 != null;
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(I)V")
	private void method2043() {
		this.aClass297_5 = new Class297(this.aClass297_4.method6534());
		for (@Pc(20) Class3_Sub46 local20 = (Class3_Sub46) this.aClass297_4.method6529(); local20 != null; local20 = (Class3_Sub46) this.aClass297_4.method6532()) {
			@Pc(32) Class3_Sub42 local32 = new Class3_Sub42(local20.aString217, (int) local20.aLong262);
			this.aClass297_5.method6537(Static333.method4889(local20.aString217), local32);
		}
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(Lclient!ie;IB)V")
	private void method2044(@OriginalArg(0) Class3_Sub26 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.aChar2 = Static135.method2636(arg0.method6825());
		} else if (arg1 == 2) {
			this.aChar3 = Static135.method2636(arg0.method6825());
		} else if (arg1 == 3) {
			this.aString50 = arg0.method6786();
		} else if (arg1 == 4) {
			this.anInt2420 = arg0.method6816();
		} else if (arg1 == 5 || arg1 == 6) {
			@Pc(52) int local52 = arg0.method6811();
			this.aClass297_4 = new Class297(Static538.method7366(local52));
			for (@Pc(62) int local62 = 0; local62 < local52; local62++) {
				@Pc(70) int local70 = arg0.method6816();
				@Pc(80) Class3 local80;
				if (arg1 == 5) {
					local80 = new Class3_Sub46(arg0.method6786());
				} else {
					local80 = new Class3_Sub2(arg0.method6816());
				}
				this.aClass297_4.method6537((long) local70, local80);
			}
		}
	}

	@OriginalMember(owner = "client!dl", name = "b", descriptor = "(I)V")
	private void method2045() {
		this.aClass297_5 = new Class297(this.aClass297_4.method6534());
		for (@Pc(28) Class3_Sub2 local28 = (Class3_Sub2) this.aClass297_4.method6529(); local28 != null; local28 = (Class3_Sub2) this.aClass297_4.method6532()) {
			@Pc(37) Class3_Sub2 local37 = new Class3_Sub2((int) local28.aLong262);
			this.aClass297_5.method6537((long) local28.anInt39, local37);
		}
	}
}
