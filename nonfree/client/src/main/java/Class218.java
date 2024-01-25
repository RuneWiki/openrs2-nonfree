import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rj")
public final class Class218 {

	@OriginalMember(owner = "client!rj", name = "b", descriptor = "I")
	private int anInt5540;

	@OriginalMember(owner = "client!rj", name = "g", descriptor = "Lclient!mt;")
	public Class164 aClass164_32;

	@OriginalMember(owner = "client!rj", name = "i", descriptor = "C")
	public char aChar1;

	@OriginalMember(owner = "client!rj", name = "j", descriptor = "C")
	public char aChar2;

	@OriginalMember(owner = "client!rj", name = "n", descriptor = "Lclient!mt;")
	private Class164 aClass164_34;

	@OriginalMember(owner = "client!rj", name = "h", descriptor = "Ljava/lang/String;")
	private String aString55 = "null";

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(I)V")
	private void method4454() {
		this.aClass164_34 = new Class164(this.aClass164_32.method3520());
		for (@Pc(24) Class7_Sub2 local24 = (Class7_Sub2) this.aClass164_32.method3514(); local24 != null; local24 = (Class7_Sub2) this.aClass164_32.method3519()) {
			@Pc(33) Class7_Sub2 local33 = new Class7_Sub2((int) local24.aLong230);
			this.aClass164_34.method3508((long) local24.anInt128, local33);
		}
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(Lclient!gk;I)V")
	public void method4455(@OriginalArg(0) Class7_Sub14 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method3981();
			if (local5 == 0) {
				return;
			}
			this.method4458(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public boolean method4456(@OriginalArg(1) String arg0) {
		if (this.aClass164_32 == null) {
			return false;
		}
		if (this.aClass164_34 == null) {
			this.method4459();
		}
		for (@Pc(32) Class7_Sub45 local32 = (Class7_Sub45) this.aClass164_34.method3512(Static185.method2695(arg0)); local32 != null; local32 = (Class7_Sub45) this.aClass164_34.method3510()) {
			if (local32.aString72.equals(arg0)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(IB)Z")
	public boolean method4457(@OriginalArg(0) int arg0) {
		if (this.aClass164_32 == null) {
			return false;
		}
		if (this.aClass164_34 == null) {
			this.method4454();
		}
		@Pc(28) Class7_Sub2 local28 = (Class7_Sub2) this.aClass164_34.method3512((long) arg0);
		return local28 != null;
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(IBLclient!gk;)V")
	private void method4458(@OriginalArg(0) int arg0, @OriginalArg(2) Class7_Sub14 arg1) {
		if (arg0 == 1) {
			this.aChar2 = Static395.method5018(arg1.method3930());
		} else if (arg0 == 2) {
			this.aChar1 = Static395.method5018(arg1.method3930());
		} else if (arg0 == 3) {
			this.aString55 = arg1.method3986();
		} else if (arg0 == 4) {
			this.anInt5540 = arg1.method3938();
		} else if (arg0 == 5 || arg0 == 6) {
			@Pc(51) int local51 = arg1.method3943();
			this.aClass164_32 = new Class164(Static444.method5654(local51));
			for (@Pc(61) int local61 = 0; local61 < local51; local61++) {
				@Pc(67) int local67 = arg1.method3938();
				@Pc(79) Class7 local79;
				if (arg0 == 5) {
					local79 = new Class7_Sub17(arg1.method3986());
				} else {
					local79 = new Class7_Sub2(arg1.method3938());
				}
				this.aClass164_32.method3508((long) local67, local79);
			}
		}
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(B)V")
	private void method4459() {
		this.aClass164_34 = new Class164(this.aClass164_32.method3520());
		for (@Pc(26) Class7_Sub17 local26 = (Class7_Sub17) this.aClass164_32.method3514(); local26 != null; local26 = (Class7_Sub17) this.aClass164_32.method3519()) {
			@Pc(37) Class7_Sub45 local37 = new Class7_Sub45(local26.aString22, (int) local26.aLong230);
			this.aClass164_34.method3508(Static185.method2695(local26.aString22), local37);
		}
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(BI)I")
	public int method4460(@OriginalArg(1) int arg0) {
		if (this.aClass164_32 == null) {
			return this.anInt5540;
		} else {
			@Pc(17) Class7_Sub2 local17 = (Class7_Sub2) this.aClass164_32.method3512((long) arg0);
			return local17 == null ? this.anInt5540 : local17.anInt128;
		}
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(II)Ljava/lang/String;")
	public String method4462(@OriginalArg(1) int arg0) {
		if (this.aClass164_32 == null) {
			return this.aString55;
		} else {
			@Pc(17) Class7_Sub17 local17 = (Class7_Sub17) this.aClass164_32.method3512((long) arg0);
			return local17 == null ? this.aString55 : local17.aString22;
		}
	}
}
