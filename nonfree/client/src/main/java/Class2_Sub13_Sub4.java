import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public final class Class2_Sub13_Sub4 extends Class2_Sub13 {

	@OriginalMember(owner = "client!fd", name = "u", descriptor = "Lclient!daa;")
	public final Class1_Sub1_Sub3 aClass1_Sub1_Sub3_1;

	@OriginalMember(owner = "client!fd", name = "<init>", descriptor = "(Lclient!daa;)V")
	public Class2_Sub13_Sub4(@OriginalArg(0) Class1_Sub1_Sub3 arg0) {
		this.aClass1_Sub1_Sub3_1 = arg0;
	}
}
