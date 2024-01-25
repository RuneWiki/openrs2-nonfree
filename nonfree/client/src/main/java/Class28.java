import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bh")
public final class Class28 implements Interface21 {

	@OriginalMember(owner = "client!bh", name = "j", descriptor = "Ljava/lang/String;")
	public static final String aString7;

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "Ljava/lang/String;")
	public static final String aString6;

	@OriginalMember(owner = "client!bh", name = "d", descriptor = "Lclient!da;")
	private Class34 aClass34_1;

	@OriginalMember(owner = "client!bh", name = "f", descriptor = "Lclient!ni;")
	private final Class223 aClass223_15;

	@OriginalMember(owner = "client!bh", name = "h", descriptor = "Lclient!tga;")
	private final Class322 aClass322_1;

	@OriginalMember(owner = "client!bh", name = "k", descriptor = "Lclient!ni;")
	private final Class223 aClass223_16;

	static {
		@Pc(39) String local39 = "Unknown";
		try {
			local39 = System.getProperty("java.vendor").toLowerCase();
		} catch (@Pc(45) Exception local45) {
		}
		local39.toLowerCase();
		local39 = "Unknown";
		try {
			local39 = System.getProperty("java.version").toLowerCase();
		} catch (@Pc(56) Exception local56) {
		}
		local39.toLowerCase();
		local39 = "Unknown";
		try {
			local39 = System.getProperty("os.name").toLowerCase();
		} catch (@Pc(67) Exception local67) {
		}
		aString7 = local39.toLowerCase();
		local39 = "Unknown";
		try {
			local39 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(78) Exception local78) {
		}
		aString6 = local39.toLowerCase();
		local39 = "Unknown";
		try {
			local39 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(89) Exception local89) {
		}
		local39.toLowerCase();
		local39 = "~/";
		try {
			local39 = System.getProperty("user.home").toLowerCase();
		} catch (@Pc(100) Exception local100) {
		}
		new File(local39);
	}

	@OriginalMember(owner = "client!bh", name = "<init>", descriptor = "(Lclient!ni;Lclient!ni;Lclient!tga;)V")
	public Class28(@OriginalArg(0) Class223 arg0, @OriginalArg(1) Class223 arg1, @OriginalArg(2) Class322 arg2) {
		this.aClass223_15 = arg0;
		this.aClass322_1 = arg2;
		this.aClass223_16 = arg1;
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(ZB)V")
	@Override
	public void method7994() {
		@Pc(23) int local23 = this.aClass322_1.aClass79_19.method2610(Static182.anInt4018, this.aClass322_1.anInt9423) + this.aClass322_1.anInt9415;
		@Pc(38) int local38 = this.aClass322_1.aClass127_16.method3682(this.aClass322_1.anInt9420, Static52.anInt1780) + this.aClass322_1.anInt9414;
		this.aClass34_1.method8595(local23, (Class4[]) null, this.aClass322_1.anInt9423, this.aClass322_1.aString100, 0, this.aClass322_1.anInt9422, (Class1) null, this.aClass322_1.anInt9418, this.aClass322_1.anInt9417, (int[]) null, this.aClass322_1.anInt9421, 0, this.aClass322_1.anInt9425, local38, this.aClass322_1.anInt9420);
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7993() {
		@Pc(5) boolean local5 = true;
		if (!this.aClass223_15.method5951(this.aClass322_1.anInt9419)) {
			local5 = false;
		}
		if (!this.aClass223_16.method5951(this.aClass322_1.anInt9419)) {
			local5 = false;
		}
		return local5;
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(B)V")
	@Override
	public void method7992() {
		@Pc(16) Class213 local16 = Static50.method1622(this.aClass223_16, this.aClass322_1.anInt9419);
		this.aClass34_1 = Static467.aClass5_13.method6167(local16, Static655.method7891(this.aClass223_15, this.aClass322_1.anInt9419));
	}
}
