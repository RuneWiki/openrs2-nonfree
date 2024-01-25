import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ifa")
public final class Class2_Sub24 extends Class2 {

	@OriginalMember(owner = "client!ifa", name = "k", descriptor = "[Lclient!an;")
	public static final Class19[] aClass19Array1 = new Class19[5];

	@OriginalMember(owner = "client!ifa", name = "l", descriptor = "Ljava/lang/String;")
	public String aString39;

	static {
		for (@Pc(4) int local4 = 0; local4 < aClass19Array1.length; local4++) {
			aClass19Array1[local4] = new Class19();
		}
	}

	@OriginalMember(owner = "client!ifa", name = "<init>", descriptor = "()V")
	private Class2_Sub24() {
	}

	@OriginalMember(owner = "client!ifa", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class2_Sub24(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString39 = arg0;
	}
}
