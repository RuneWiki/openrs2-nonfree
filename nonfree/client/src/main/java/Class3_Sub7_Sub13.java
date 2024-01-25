import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!st")
public final class Class3_Sub7_Sub13 extends Class3_Sub7 {

	@OriginalMember(owner = "client!st", name = "x", descriptor = "Lclient!rs;")
	public final Class28_Sub1_Sub4 aClass28_Sub1_Sub4_1;

	static {
		new Class240("", 73);
	}

	@OriginalMember(owner = "client!st", name = "<init>", descriptor = "(Lclient!rs;)V")
	public Class3_Sub7_Sub13(@OriginalArg(0) Class28_Sub1_Sub4 arg0) {
		this.aClass28_Sub1_Sub4_1 = arg0;
	}
}
