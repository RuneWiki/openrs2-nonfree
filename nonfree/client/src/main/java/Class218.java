import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!s")
public final class Class218 {

	@OriginalMember(owner = "client!s", name = "e", descriptor = "C")
	public char aChar4;

	@OriginalMember(owner = "client!s", name = "f", descriptor = "Lclient!vg;")
	private Class252 aClass252_33;

	@OriginalMember(owner = "client!s", name = "g", descriptor = "C")
	public char aChar5;

	@OriginalMember(owner = "client!s", name = "k", descriptor = "I")
	private int anInt5926;

	@OriginalMember(owner = "client!s", name = "l", descriptor = "Lclient!vg;")
	public Class252 aClass252_34;

	@OriginalMember(owner = "client!s", name = "a", descriptor = "Ljava/lang/String;")
	private String aString63 = "null";

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(I)V")
	private void method4714() {
		this.aClass252_33 = new Class252(this.aClass252_34.method5664());
		for (@Pc(23) Class5_Sub13 local23 = (Class5_Sub13) this.aClass252_34.method5660(); local23 != null; local23 = (Class5_Sub13) this.aClass252_34.method5666()) {
			@Pc(34) Class5_Sub36 local34 = new Class5_Sub36(local23.aString11, (int) local23.aLong234);
			this.aClass252_33.method5658(local34, Static159.method2249(local23.aString11));
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(Lclient!fh;I)V")
	public void method4715(@OriginalArg(0) Class5_Sub15 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method5539();
			if (local15 == 0) {
				return;
			}
			this.method4722(arg0, local15);
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	public boolean method4716(@OriginalArg(0) String arg0) {
		if (this.aClass252_34 == null) {
			return false;
		}
		if (this.aClass252_33 == null) {
			this.method4714();
		}
		for (@Pc(25) Class5_Sub36 local25 = (Class5_Sub36) this.aClass252_33.method5659(Static159.method2249(arg0)); local25 != null; local25 = (Class5_Sub36) this.aClass252_33.method5667()) {
			if (local25.aString62.equals(arg0)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(IB)I")
	public int method4717(@OriginalArg(0) int arg0) {
		if (this.aClass252_34 == null) {
			return this.anInt5926;
		} else {
			@Pc(17) Class5_Sub34 local17 = (Class5_Sub34) this.aClass252_34.method5659((long) arg0);
			return local17 == null ? this.anInt5926 : local17.anInt5642;
		}
	}

	@OriginalMember(owner = "client!s", name = "b", descriptor = "(I)V")
	private void method4718() {
		this.aClass252_33 = new Class252(this.aClass252_34.method5664());
		for (@Pc(24) Class5_Sub34 local24 = (Class5_Sub34) this.aClass252_34.method5660(); local24 != null; local24 = (Class5_Sub34) this.aClass252_34.method5666()) {
			@Pc(33) Class5_Sub34 local33 = new Class5_Sub34((int) local24.aLong234);
			this.aClass252_33.method5658(local33, (long) local24.anInt5642);
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(II)Z")
	public boolean method4719(@OriginalArg(1) int arg0) {
		if (this.aClass252_34 == null) {
			return false;
		}
		if (this.aClass252_33 == null) {
			this.method4718();
		}
		@Pc(22) Class5_Sub34 local22 = (Class5_Sub34) this.aClass252_33.method5659((long) arg0);
		return local22 != null;
	}

	@OriginalMember(owner = "client!s", name = "b", descriptor = "(II)Ljava/lang/String;")
	public String method4721(@OriginalArg(1) int arg0) {
		if (this.aClass252_34 == null) {
			return this.aString63;
		} else {
			@Pc(25) Class5_Sub13 local25 = (Class5_Sub13) this.aClass252_34.method5659((long) arg0);
			return local25 == null ? this.aString63 : local25.aString11;
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(Lclient!fh;II)V")
	private void method4722(@OriginalArg(0) Class5_Sub15 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aChar5 = Static372.method4863(arg0.method5600());
		} else if (arg1 == 2) {
			this.aChar4 = Static372.method4863(arg0.method5600());
		} else if (arg1 == 3) {
			this.aString63 = arg0.method5549();
		} else if (arg1 == 4) {
			this.anInt5926 = arg0.method5603();
		} else if (arg1 == 5 || arg1 == 6) {
			@Pc(66) int local66 = arg0.method5598();
			this.aClass252_34 = new Class252(Static331.method4084(local66));
			for (@Pc(76) int local76 = 0; local76 < local66; local76++) {
				@Pc(82) int local82 = arg0.method5603();
				@Pc(92) Class5 local92;
				if (arg1 == 5) {
					local92 = new Class5_Sub13(arg0.method5549());
				} else {
					local92 = new Class5_Sub34(arg0.method5603());
				}
				this.aClass252_34.method5658(local92, (long) local82);
			}
		}
	}
}
