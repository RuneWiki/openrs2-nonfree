import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dba")
public final class Class59_Sub1 extends Class59 {

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "(ILclient!vaa;)Lclient!vaa;")
	@Override
	public Class3_Sub3_Sub11 method1800(@OriginalArg(1) Class3_Sub3_Sub11 arg0) {
		return new Class3_Sub3_Sub11_Sub1(arg0.anInterface3_3, arg0.method6452(), arg0.anInt7643);
	}
}
