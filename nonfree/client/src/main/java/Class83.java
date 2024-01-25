import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ds")
public final class Class83 {

	@OriginalMember(owner = "client!ds", name = "i", descriptor = "Ljava/lang/String;")
	public static final String aString16;

	@OriginalMember(owner = "client!ds", name = "j", descriptor = "Ljava/lang/String;")
	public static final String aString17;

	@OriginalMember(owner = "client!ds", name = "d", descriptor = "Lclient!pa;")
	private final Class265 aClass265_4 = new Class265(64);

	@OriginalMember(owner = "client!ds", name = "c", descriptor = "Lclient!cb;")
	private final Class50 aClass50_33;

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "Lclient!cb;")
	public final Class50 aClass50_32;

	static {
		@Pc(7) String local7 = "Unknown";
		try {
			local7 = System.getProperty("java.vendor").toLowerCase();
		} catch (@Pc(13) Exception local13) {
		}
		local7.toLowerCase();
		local7 = "Unknown";
		try {
			local7 = System.getProperty("java.version").toLowerCase();
		} catch (@Pc(24) Exception local24) {
		}
		local7.toLowerCase();
		local7 = "Unknown";
		try {
			local7 = System.getProperty("os.name").toLowerCase();
		} catch (@Pc(35) Exception local35) {
		}
		aString16 = local7.toLowerCase();
		local7 = "Unknown";
		try {
			local7 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(46) Exception local46) {
		}
		aString17 = local7.toLowerCase();
		local7 = "Unknown";
		try {
			local7 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(57) Exception local57) {
		}
		local7.toLowerCase();
		local7 = "~/";
		try {
			local7 = System.getProperty("user.home").toLowerCase();
		} catch (@Pc(68) Exception local68) {
		}
		new File(local7);
	}

	@OriginalMember(owner = "client!ds", name = "<init>", descriptor = "(Lclient!iv;ILclient!cb;Lclient!cb;)V")
	public Class83(@OriginalArg(0) Class174 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class50 arg2, @OriginalArg(3) Class50 arg3) {
		this.aClass50_33 = arg2;
		this.aClass50_32 = arg3;
		this.aClass50_33.method913(3);
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(ZI)V")
	public void method1832() {
		@Pc(11) Class265 local11 = this.aClass265_4;
		synchronized (this.aClass265_4) {
			this.aClass265_4.method6570(5);
		}
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(B)V")
	public void method1833() {
		@Pc(2) Class265 local2 = this.aClass265_4;
		synchronized (this.aClass265_4) {
			this.aClass265_4.method6568();
		}
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(Z)V")
	public void method1834() {
		@Pc(2) Class265 local2 = this.aClass265_4;
		synchronized (this.aClass265_4) {
			this.aClass265_4.method6573();
		}
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(BI)Lclient!vb;")
	public Class366 method1835(@OriginalArg(1) int arg0) {
		@Pc(12) Class265 local12 = this.aClass265_4;
		@Pc(22) Class366 local22;
		synchronized (this.aClass265_4) {
			local22 = (Class366) this.aClass265_4.method6577((long) arg0);
		}
		if (local22 != null) {
			return local22;
		}
		@Pc(35) Class50 local35 = this.aClass50_33;
		@Pc(44) byte[] local44;
		synchronized (this.aClass50_33) {
			local44 = this.aClass50_33.method916(arg0, 3);
		}
		local22 = new Class366();
		local22.aClass83_1 = this;
		if (local44 != null) {
			local22.method8301(new Class5_Sub15(local44));
		}
		@Pc(69) Class265 local69 = this.aClass265_4;
		synchronized (this.aClass265_4) {
			this.aClass265_4.method6566(local22, (long) arg0);
			return local22;
		}
	}
}
