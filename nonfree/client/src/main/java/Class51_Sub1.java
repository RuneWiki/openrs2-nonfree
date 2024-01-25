import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public final class Class51_Sub1 extends Class51 {

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(BLclient!cr;)Lclient!cr;")
	@Override
	public Class3_Sub4_Sub5 method1381(@OriginalArg(1) Class3_Sub4_Sub5 arg0) {
		return new Class3_Sub4_Sub5_Sub1(arg0.method3898(), arg0.anInt5084);
	}
}
