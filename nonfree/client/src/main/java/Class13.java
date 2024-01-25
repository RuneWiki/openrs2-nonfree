import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ak")
public final class Class13 {

	@OriginalMember(owner = "client!ak", name = "n", descriptor = "Ljava/lang/String;")
	public static final String aString3;

	@OriginalMember(owner = "client!ak", name = "b", descriptor = "Ljava/lang/String;")
	public static final String aString4;

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "Lclient!ffa;")
	private Class3_Sub4 aClass3_Sub4_5 = new Class3_Sub4();

	@OriginalMember(owner = "client!ak", name = "k", descriptor = "Lclient!pda;")
	private final Class283 aClass283_1 = new Class283();

	@OriginalMember(owner = "client!ak", name = "g", descriptor = "I")
	private int anInt345;

	@OriginalMember(owner = "client!ak", name = "f", descriptor = "I")
	private final int anInt344;

	@OriginalMember(owner = "client!ak", name = "c", descriptor = "Lclient!gn;")
	private final Class136 aClass136_2;

	static {
		@Pc(66) String local66 = "Unknown";
		try {
			local66 = System.getProperty("java.vendor").toLowerCase();
		} catch (@Pc(74) Exception local74) {
		}
		local66.toLowerCase();
		local66 = "Unknown";
		try {
			local66 = System.getProperty("java.version").toLowerCase();
		} catch (@Pc(89) Exception local89) {
		}
		local66.toLowerCase();
		local66 = "Unknown";
		try {
			local66 = System.getProperty("os.name").toLowerCase();
		} catch (@Pc(104) Exception local104) {
		}
		aString3 = local66.toLowerCase();
		local66 = "Unknown";
		try {
			local66 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(119) Exception local119) {
		}
		aString4 = local66.toLowerCase();
		local66 = "Unknown";
		try {
			local66 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(134) Exception local134) {
		}
		local66.toLowerCase();
		local66 = "~/";
		try {
			local66 = System.getProperty("user.home").toLowerCase();
		} catch (@Pc(149) Exception local149) {
		}
		new File(local66);
	}

	@OriginalMember(owner = "client!ak", name = "<init>", descriptor = "(I)V")
	public Class13(@OriginalArg(0) int arg0) {
		this.anInt345 = arg0;
		this.anInt344 = arg0;
		@Pc(19) int local19;
		for (local19 = 1; arg0 > local19 + local19; local19 += local19) {
		}
		this.aClass136_2 = new Class136(local19);
	}

	@OriginalMember(owner = "client!ak", name = "b", descriptor = "(I)V")
	public void method318() {
		this.aClass283_1.method7037();
		this.aClass136_2.method3505();
		this.aClass3_Sub4_5 = new Class3_Sub4();
		this.anInt345 = this.anInt344;
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(JI)V")
	public void method321(@OriginalArg(0) long arg0) {
		@Pc(10) Class3_Sub4 local10 = (Class3_Sub4) this.aClass136_2.method3503(arg0);
		if (local10 != null) {
			local10.method9446();
			local10.method8848();
			this.anInt345++;
		}
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(Lclient!ffa;IJ)V")
	public void method322(@OriginalArg(0) Class3_Sub4 arg0, @OriginalArg(2) long arg1) {
		if (this.anInt345 == 0) {
			@Pc(22) Class3_Sub4 local22 = this.aClass283_1.method7034();
			local22.method9446();
			local22.method8848();
			if (this.aClass3_Sub4_5 == local22) {
				local22 = this.aClass283_1.method7034();
				local22.method9446();
				local22.method8848();
			}
		} else {
			this.anInt345--;
		}
		this.aClass136_2.method3508(arg1, arg0);
		this.aClass283_1.method7036(arg0);
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(BJ)Lclient!ffa;")
	public Class3_Sub4 method324(@OriginalArg(1) long arg0) {
		@Pc(18) Class3_Sub4 local18 = (Class3_Sub4) this.aClass136_2.method3503(arg0);
		if (local18 != null) {
			this.aClass283_1.method7036(local18);
		}
		return local18;
	}
}
