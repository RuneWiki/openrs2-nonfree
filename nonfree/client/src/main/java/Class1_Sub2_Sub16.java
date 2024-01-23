import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!td")
public final class Class1_Sub2_Sub16 extends Class1_Sub2 {

	@OriginalMember(owner = "client!td", name = "H", descriptor = "Lclient!vd;")
	private Class140 aClass140_15;

	@OriginalMember(owner = "client!td", name = "I", descriptor = "Lclient!vd;")
	public Class140 aClass140_16;

	@OriginalMember(owner = "client!td", name = "J", descriptor = "C")
	public char aChar2;

	@OriginalMember(owner = "client!td", name = "P", descriptor = "I")
	private int anInt4898;

	@OriginalMember(owner = "client!td", name = "U", descriptor = "C")
	public char aChar3;

	@OriginalMember(owner = "client!td", name = "M", descriptor = "Ljava/lang/String;")
	private String aString348 = "null";

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(BLjava/lang/String;)Z")
	public boolean method3700(@OriginalArg(1) String arg0) {
		if (this.aClass140_16 == null) {
			return false;
		}
		if (this.aClass140_15 == null) {
			this.method3705();
		}
		for (@Pc(33) Class1_Sub25 local33 = (Class1_Sub25) this.aClass140_15.method4014(Static180.method3109(arg0)); local33 != null; local33 = (Class1_Sub25) this.aClass140_15.method4017()) {
			if (local33.aString317.equals(arg0)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(IZ)I")
	public int method3701(@OriginalArg(0) int arg0) {
		if (this.aClass140_16 == null) {
			return this.anInt4898;
		} else {
			@Pc(22) Class1_Sub24 local22 = (Class1_Sub24) this.aClass140_16.method4014((long) arg0);
			return local22 == null ? this.anInt4898 : local22.anInt4545;
		}
	}

	@OriginalMember(owner = "client!td", name = "h", descriptor = "(I)V")
	private void method3702() {
		this.aClass140_15 = new Class140(this.aClass140_16.method4015());
		for (@Pc(24) Class1_Sub24 local24 = (Class1_Sub24) this.aClass140_16.method4012(); local24 != null; local24 = (Class1_Sub24) this.aClass140_16.method4013()) {
			@Pc(33) Class1_Sub24 local33 = new Class1_Sub24((int) local24.aLong184);
			this.aClass140_15.method4011(local33, (long) local24.anInt4545);
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(ILclient!ql;I)V")
	private void method3703(@OriginalArg(1) Class1_Sub13 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aChar2 = Static139.method4196(arg0.method1756());
		} else if (arg1 == 2) {
			this.aChar3 = Static139.method4196(arg0.method1756());
		} else if (arg1 == 3) {
			this.aString348 = arg0.method1774();
		} else if (arg1 == 4) {
			this.anInt4898 = arg0.method1802();
		} else if (arg1 == 5 || arg1 == 6) {
			@Pc(47) int local47 = arg0.method1764();
			this.aClass140_16 = new Class140(Static110.method2245(local47));
			for (@Pc(59) int local59 = 0; local59 < local47; local59++) {
				@Pc(65) int local65 = arg0.method1802();
				@Pc(77) Class1 local77;
				if (arg1 == 5) {
					local77 = new Class1_Sub11(arg0.method1774());
				} else {
					local77 = new Class1_Sub24(arg0.method1802());
				}
				this.aClass140_16.method4011(local77, (long) local65);
			}
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(ILclient!ql;)V")
	public void method3704(@OriginalArg(1) Class1_Sub13 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method1772();
			if (local15 == 0) {
				return;
			}
			this.method3703(arg0, local15);
		}
	}

	@OriginalMember(owner = "client!td", name = "i", descriptor = "(I)V")
	private void method3705() {
		this.aClass140_15 = new Class140(this.aClass140_16.method4015());
		for (@Pc(20) Class1_Sub11 local20 = (Class1_Sub11) this.aClass140_16.method4012(); local20 != null; local20 = (Class1_Sub11) this.aClass140_16.method4013()) {
			@Pc(31) Class1_Sub25 local31 = new Class1_Sub25(local20.aString128, (int) local20.aLong184);
			this.aClass140_15.method4011(local31, Static180.method3109(local20.aString128));
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(IB)Ljava/lang/String;")
	public String method3709(@OriginalArg(0) int arg0) {
		if (this.aClass140_16 == null) {
			return this.aString348;
		} else {
			@Pc(22) Class1_Sub11 local22 = (Class1_Sub11) this.aClass140_16.method4014((long) arg0);
			return local22 == null ? this.aString348 : local22.aString128;
		}
	}

	@OriginalMember(owner = "client!td", name = "b", descriptor = "(BI)Z")
	public boolean method3712(@OriginalArg(1) int arg0) {
		if (this.aClass140_16 == null) {
			return false;
		}
		if (this.aClass140_15 == null) {
			this.method3702();
		}
		@Pc(28) Class1_Sub24 local28 = (Class1_Sub24) this.aClass140_15.method4014((long) arg0);
		return local28 != null;
	}
}
