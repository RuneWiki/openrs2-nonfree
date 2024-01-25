import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ei")
public final class Class64 {

	@OriginalMember(owner = "client!ei", name = "h", descriptor = "Lclient!wa;")
	private Class257 aClass257_4;

	@OriginalMember(owner = "client!ei", name = "i", descriptor = "C")
	public char aChar1;

	@OriginalMember(owner = "client!ei", name = "j", descriptor = "C")
	public char aChar2;

	@OriginalMember(owner = "client!ei", name = "n", descriptor = "Lclient!wa;")
	public Class257 aClass257_5;

	@OriginalMember(owner = "client!ei", name = "p", descriptor = "I")
	private int anInt1625;

	@OriginalMember(owner = "client!ei", name = "g", descriptor = "Ljava/lang/String;")
	private String aString13 = "null";

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(B)V")
	private void method1316() {
		this.aClass257_4 = new Class257(this.aClass257_5.method5498());
		for (@Pc(27) Class1_Sub40 local27 = (Class1_Sub40) this.aClass257_5.method5506(); local27 != null; local27 = (Class1_Sub40) this.aClass257_5.method5501()) {
			@Pc(38) Class1_Sub25 local38 = new Class1_Sub25(local27.aString54, (int) local27.aLong226);
			this.aClass257_4.method5504(local38, Static22.method406(local27.aString54));
		}
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public boolean method1320(@OriginalArg(1) String arg0) {
		if (this.aClass257_5 == null) {
			return false;
		}
		if (this.aClass257_4 == null) {
			this.method1316();
		}
		for (@Pc(31) Class1_Sub25 local31 = (Class1_Sub25) this.aClass257_4.method5503(Static22.method406(arg0)); local31 != null; local31 = (Class1_Sub25) this.aClass257_4.method5507()) {
			if (local31.aString37.equals(arg0)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(BI)Z")
	public boolean method1321(@OriginalArg(1) int arg0) {
		if (this.aClass257_5 == null) {
			return false;
		}
		if (this.aClass257_4 == null) {
			this.method1326();
		}
		@Pc(27) Class1_Sub6 local27 = (Class1_Sub6) this.aClass257_4.method5503((long) arg0);
		return local27 != null;
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(II)I")
	public int method1322(@OriginalArg(0) int arg0) {
		if (this.aClass257_5 == null) {
			return this.anInt1625;
		} else {
			@Pc(17) Class1_Sub6 local17 = (Class1_Sub6) this.aClass257_5.method5503((long) arg0);
			return local17 == null ? this.anInt1625 : local17.anInt796;
		}
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(BLclient!dh;)V")
	public void method1323(@OriginalArg(1) Class1_Sub11 arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.method4463();
			if (local17 == 0) {
				return;
			}
			this.method1324(arg0, local17);
		}
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(ILclient!dh;I)V")
	private void method1324(@OriginalArg(1) Class1_Sub11 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aChar2 = Static276.method3514(arg0.method4452());
		} else if (arg1 == 2) {
			this.aChar1 = Static276.method3514(arg0.method4452());
		} else if (arg1 == 3) {
			this.aString13 = arg0.method4484();
		} else if (arg1 == 4) {
			this.anInt1625 = arg0.method4487();
		} else if (arg1 == 5 || arg1 == 6) {
			@Pc(49) int local49 = arg0.method4485();
			this.aClass257_5 = new Class257(Static88.method1286(local49));
			for (@Pc(59) int local59 = 0; local59 < local49; local59++) {
				@Pc(67) int local67 = arg0.method4487();
				@Pc(79) Class1 local79;
				if (arg1 == 5) {
					local79 = new Class1_Sub40(arg0.method4484());
				} else {
					local79 = new Class1_Sub6(arg0.method4487());
				}
				this.aClass257_5.method5504(local79, (long) local67);
			}
		}
	}

	@OriginalMember(owner = "client!ei", name = "b", descriptor = "(II)Ljava/lang/String;")
	public String method1325(@OriginalArg(0) int arg0) {
		if (this.aClass257_5 == null) {
			return this.aString13;
		} else {
			@Pc(17) Class1_Sub40 local17 = (Class1_Sub40) this.aClass257_5.method5503((long) arg0);
			return local17 == null ? this.aString13 : local17.aString54;
		}
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(I)V")
	private void method1326() {
		this.aClass257_4 = new Class257(this.aClass257_5.method5498());
		for (@Pc(24) Class1_Sub6 local24 = (Class1_Sub6) this.aClass257_5.method5506(); local24 != null; local24 = (Class1_Sub6) this.aClass257_5.method5501()) {
			@Pc(33) Class1_Sub6 local33 = new Class1_Sub6((int) local24.aLong226);
			this.aClass257_4.method5504(local33, (long) local24.anInt796);
		}
	}
}
