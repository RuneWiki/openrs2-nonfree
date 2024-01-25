import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ng")
public final class Class229 implements Interface11 {

	@OriginalMember(owner = "client!ng", name = "i", descriptor = "Ljava/lang/String;")
	public static final String aString77;

	@OriginalMember(owner = "client!ng", name = "e", descriptor = "Ljava/lang/String;")
	public static final String aString76;

	@OriginalMember(owner = "client!ng", name = "f", descriptor = "Lclient!bs;")
	private final Class36 aClass36_2;

	@OriginalMember(owner = "client!ng", name = "j", descriptor = "Lclient!dq;")
	private final Class68 aClass68_1;

	static {
		@Pc(3) String local3 = "Unknown";
		try {
			local3 = System.getProperty("java.vendor").toLowerCase();
		} catch (@Pc(9) Exception local9) {
		}
		local3.toLowerCase();
		local3 = "Unknown";
		try {
			local3 = System.getProperty("java.version").toLowerCase();
		} catch (@Pc(20) Exception local20) {
		}
		local3.toLowerCase();
		local3 = "Unknown";
		try {
			local3 = System.getProperty("os.name").toLowerCase();
		} catch (@Pc(31) Exception local31) {
		}
		aString77 = local3.toLowerCase();
		local3 = "Unknown";
		try {
			local3 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(42) Exception local42) {
		}
		aString76 = local3.toLowerCase();
		local3 = "Unknown";
		try {
			local3 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(53) Exception local53) {
		}
		local3.toLowerCase();
		local3 = "~/";
		try {
			local3 = System.getProperty("user.home").toLowerCase();
		} catch (@Pc(64) Exception local64) {
		}
		new File(local3);
	}

	@OriginalMember(owner = "client!ng", name = "<init>", descriptor = "(Lclient!bs;Lclient!dq;)V")
	public Class229(@OriginalArg(0) Class36 arg0, @OriginalArg(1) Class68 arg1) {
		this.aClass36_2 = arg0;
		this.aClass68_1 = arg1;
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(I)V")
	@Override
	public void method8277() {
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method8278() {
		return this.aClass36_2.method1174();
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(BIIILclient!ta;Ljava/lang/String;)I")
	private int method5857(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) Class111 arg2, @OriginalArg(5) String arg3) {
		return arg2.method6688(0, this.aClass68_1.anInt2317, this.aClass68_1.anInt2315 - 10, arg0 + 5, arg1 + 5, 0, arg3, null, null, this.aClass68_1.anInt2322, null, 0, this.aClass68_1.anInt2316 - 10, 0, 0);
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8276() {
		@Pc(15) Class225 local15 = this.aClass36_2.method1175(this.aClass68_1.anInt2323);
		if (local15 == null) {
			return;
		}
		@Pc(31) int local31 = this.aClass68_1.aClass100_2.method2801(Static507.anInt9382, this.aClass68_1.anInt2316) + this.aClass68_1.anInt2324;
		@Pc(45) int local45 = this.aClass68_1.aClass237_1.method6027(this.aClass68_1.anInt2315, Static227.anInt4616) + this.aClass68_1.anInt2318;
		if (this.aClass68_1.aBoolean181) {
			Static546.aClass15_16.method5334(local31, local45, this.aClass68_1.anInt2316, this.aClass68_1.anInt2315, this.aClass68_1.anInt2314, 0);
		}
		local45 += this.method5857(local45, local31, Static162.aClass111_6, local15.aString72) * 12;
		local45 += 8;
		if (this.aClass68_1.aBoolean181) {
			Static546.aClass15_16.method5347(local31, local45, this.aClass68_1.anInt2316 + local31 - 1, local45, this.aClass68_1.anInt2314, 0);
		}
		local45++;
		local45 += this.method5857(local45, local31, Static162.aClass111_6, local15.aString73) * 12;
		local45 += 5;
		@Pc(127) int local127 = local45 + this.method5857(local45, local31, Static162.aClass111_6, local15.aString74) * 12;
	}
}
