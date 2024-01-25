import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public final class Class60_Sub1 extends Class60 {

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(ILclient!gm;)Lclient!gm;")
	@Override
	public Class1_Sub3_Sub7 method1271(@OriginalArg(1) Class1_Sub3_Sub7 arg0) {
		return new Class1_Sub3_Sub7_Sub2(arg0.method2918(), arg0.anInt3547);
	}
}
