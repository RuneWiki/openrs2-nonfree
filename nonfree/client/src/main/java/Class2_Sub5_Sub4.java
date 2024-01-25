import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cm")
public final class Class2_Sub5_Sub4 extends Class2_Sub5 {

	@OriginalMember(owner = "client!cm", name = "y", descriptor = "Lclient!nfa;")
	public final Class11_Sub1_Sub1_Sub5 aClass11_Sub1_Sub1_Sub5_1;

	@OriginalMember(owner = "client!cm", name = "<init>", descriptor = "(Lclient!nfa;)V")
	public Class2_Sub5_Sub4(@OriginalArg(0) Class11_Sub1_Sub1_Sub5 arg0) {
		this.aClass11_Sub1_Sub1_Sub5_1 = arg0;
	}
}
