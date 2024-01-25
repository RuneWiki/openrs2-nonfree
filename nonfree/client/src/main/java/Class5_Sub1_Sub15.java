import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!o")
public final class Class5_Sub1_Sub15 extends Class5_Sub1 {

	@OriginalMember(owner = "client!o", name = "x", descriptor = "I")
	private int anInt4374;

	@OriginalMember(owner = "client!o", name = "A", descriptor = "Lclient!tn;")
	public Class190 aClass190_24;

	@OriginalMember(owner = "client!o", name = "B", descriptor = "C")
	public char aChar2;

	@OriginalMember(owner = "client!o", name = "D", descriptor = "C")
	public char aChar3;

	@OriginalMember(owner = "client!o", name = "J", descriptor = "Lclient!tn;")
	private Class190 aClass190_25;

	@OriginalMember(owner = "client!o", name = "w", descriptor = "Ljava/lang/String;")
	private String aString38 = "null";

	@OriginalMember(owner = "client!o", name = "e", descriptor = "(I)V")
	private void method4037() {
		this.aClass190_25 = new Class190(this.aClass190_24.method5463());
		for (@Pc(22) Class5_Sub25 local22 = (Class5_Sub25) this.aClass190_24.method5471(); local22 != null; local22 = (Class5_Sub25) this.aClass190_24.method5465()) {
			@Pc(32) Class5_Sub30 local32 = new Class5_Sub30(local22.aString27, (int) local22.aLong235);
			this.aClass190_25.method5464(local32, Static160.method2836(local22.aString27));
		}
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(ILclient!rg;)V")
	public void method4038(@OriginalArg(1) Class5_Sub12 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method5115();
			if (local3 == 0) {
				return;
			}
			this.method4041(local3, arg0);
		}
	}

	@OriginalMember(owner = "client!o", name = "b", descriptor = "(II)Ljava/lang/String;")
	public String method4039(@OriginalArg(1) int arg0) {
		if (this.aClass190_24 == null) {
			return this.aString38;
		} else {
			@Pc(23) Class5_Sub25 local23 = (Class5_Sub25) this.aClass190_24.method5466((long) arg0);
			return local23 == null ? this.aString38 : local23.aString27;
		}
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(BI)I")
	public int method4040(@OriginalArg(1) int arg0) {
		if (this.aClass190_24 == null) {
			return this.anInt4374;
		} else {
			@Pc(17) Class5_Sub15 local17 = (Class5_Sub15) this.aClass190_24.method5466((long) arg0);
			return local17 == null ? this.anInt4374 : local17.anInt1686;
		}
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(BILclient!rg;)V")
	private void method4041(@OriginalArg(1) int arg0, @OriginalArg(2) Class5_Sub12 arg1) {
		if (arg0 == 1) {
			this.aChar2 = Static224.method4079(arg1.method5098());
		} else if (arg0 == 2) {
			this.aChar3 = Static224.method4079(arg1.method5098());
		} else if (arg0 == 3) {
			this.aString38 = arg1.method5064();
		} else if (arg0 == 4) {
			this.anInt4374 = arg1.method5067();
		} else if (arg0 == 5 || arg0 == 6) {
			@Pc(57) int local57 = arg1.method5106();
			this.aClass190_24 = new Class190(Static109.method1929(local57));
			for (@Pc(67) int local67 = 0; local67 < local57; local67++) {
				@Pc(72) int local72 = arg1.method5067();
				@Pc(82) Class5 local82;
				if (arg0 == 5) {
					local82 = new Class5_Sub25(arg1.method5064());
				} else {
					local82 = new Class5_Sub15(arg1.method5067());
				}
				this.aClass190_24.method5464(local82, (long) local72);
			}
		}
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	public boolean method4042(@OriginalArg(0) String arg0) {
		if (this.aClass190_24 == null) {
			return false;
		}
		if (this.aClass190_25 == null) {
			this.method4037();
		}
		for (@Pc(28) Class5_Sub30 local28 = (Class5_Sub30) this.aClass190_25.method5466(Static160.method2836(arg0)); local28 != null; local28 = (Class5_Sub30) this.aClass190_25.method5467()) {
			if (local28.aString48.equals(arg0)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(ZI)Z")
	public boolean method4043(@OriginalArg(1) int arg0) {
		if (this.aClass190_24 == null) {
			return false;
		}
		if (this.aClass190_25 == null) {
			this.method4046();
		}
		@Pc(22) Class5_Sub15 local22 = (Class5_Sub15) this.aClass190_25.method5466((long) arg0);
		return local22 != null;
	}

	@OriginalMember(owner = "client!o", name = "g", descriptor = "(I)V")
	private void method4046() {
		this.aClass190_25 = new Class190(this.aClass190_24.method5463());
		for (@Pc(26) Class5_Sub15 local26 = (Class5_Sub15) this.aClass190_24.method5471(); local26 != null; local26 = (Class5_Sub15) this.aClass190_24.method5465()) {
			@Pc(34) Class5_Sub15 local34 = new Class5_Sub15((int) local26.aLong235);
			this.aClass190_25.method5464(local34, (long) local26.anInt1686);
		}
	}
}
