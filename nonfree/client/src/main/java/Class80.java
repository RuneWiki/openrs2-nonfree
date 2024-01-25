import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dr")
public final class Class80 {

	@OriginalMember(owner = "client!dr", name = "p", descriptor = "Ljava/lang/String;")
	public static final String aString23;

	@OriginalMember(owner = "client!dr", name = "s", descriptor = "Ljava/lang/String;")
	public static final String aString24;

	@OriginalMember(owner = "client!dr", name = "r", descriptor = "Lclient!dg;")
	private Class5_Sub4 aClass5_Sub4_15;

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "Lclient!dg;")
	public final Class5_Sub4 aClass5_Sub4_14 = new Class5_Sub4();

	static {
		@Pc(14) String local14 = "Unknown";
		try {
			local14 = System.getProperty("java.vendor").toLowerCase();
		} catch (@Pc(20) Exception local20) {
		}
		local14.toLowerCase();
		local14 = "Unknown";
		try {
			local14 = System.getProperty("java.version").toLowerCase();
		} catch (@Pc(31) Exception local31) {
		}
		local14.toLowerCase();
		local14 = "Unknown";
		try {
			local14 = System.getProperty("os.name").toLowerCase();
		} catch (@Pc(42) Exception local42) {
		}
		aString23 = local14.toLowerCase();
		local14 = "Unknown";
		try {
			local14 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(53) Exception local53) {
		}
		aString24 = local14.toLowerCase();
		local14 = "Unknown";
		try {
			local14 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(64) Exception local64) {
		}
		local14.toLowerCase();
		local14 = "~/";
		try {
			local14 = System.getProperty("user.home").toLowerCase();
		} catch (@Pc(75) Exception local75) {
		}
		new File(local14);
	}

	@OriginalMember(owner = "client!dr", name = "<init>", descriptor = "()V")
	public Class80() {
		this.aClass5_Sub4_14.aClass5_Sub4_66 = this.aClass5_Sub4_14;
		this.aClass5_Sub4_14.aClass5_Sub4_67 = this.aClass5_Sub4_14;
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(Z)Lclient!dg;")
	public Class5_Sub4 method1536() {
		@Pc(6) Class5_Sub4 local6 = this.aClass5_Sub4_15;
		if (this.aClass5_Sub4_14 == local6) {
			this.aClass5_Sub4_15 = null;
			return null;
		} else {
			this.aClass5_Sub4_15 = local6.aClass5_Sub4_67;
			return local6;
		}
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(Lclient!dg;I)V")
	public void method1537(@OriginalArg(0) Class5_Sub4 arg0) {
		if (arg0.aClass5_Sub4_66 != null) {
			arg0.method8741();
		}
		arg0.aClass5_Sub4_66 = this.aClass5_Sub4_14.aClass5_Sub4_66;
		arg0.aClass5_Sub4_67 = this.aClass5_Sub4_14;
		arg0.aClass5_Sub4_66.aClass5_Sub4_67 = arg0;
		arg0.aClass5_Sub4_67.aClass5_Sub4_66 = arg0;
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(I)Lclient!dg;")
	public Class5_Sub4 method1538() {
		@Pc(7) Class5_Sub4 local7 = this.aClass5_Sub4_14.aClass5_Sub4_67;
		if (this.aClass5_Sub4_14 == local7) {
			this.aClass5_Sub4_15 = null;
			return null;
		} else {
			this.aClass5_Sub4_15 = local7.aClass5_Sub4_67;
			return local7;
		}
	}

	@OriginalMember(owner = "client!dr", name = "b", descriptor = "(I)I")
	public int method1540() {
		@Pc(16) int local16 = 0;
		@Pc(20) Class5_Sub4 local20 = this.aClass5_Sub4_14.aClass5_Sub4_67;
		while (local20 != this.aClass5_Sub4_14) {
			local20 = local20.aClass5_Sub4_67;
			local16++;
		}
		return local16;
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(B)V")
	public void method1542() {
		while (true) {
			@Pc(13) Class5_Sub4 local13 = this.aClass5_Sub4_14.aClass5_Sub4_67;
			if (this.aClass5_Sub4_14 == local13) {
				this.aClass5_Sub4_15 = null;
				return;
			}
			local13.method8741();
		}
	}

	@OriginalMember(owner = "client!dr", name = "c", descriptor = "(I)Lclient!dg;")
	public Class5_Sub4 method1543() {
		@Pc(7) Class5_Sub4 local7 = this.aClass5_Sub4_14.aClass5_Sub4_67;
		if (this.aClass5_Sub4_14 == local7) {
			return null;
		} else {
			local7.method8741();
			return local7;
		}
	}
}
