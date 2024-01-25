import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qo")
public final class Class36_Sub1 extends Class36 {

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(Lclient!qk;B)Lclient!qk;")
	@Override
	public Class2_Sub9_Sub18 method4706(@OriginalArg(0) Class2_Sub9_Sub18 arg0) {
		return new Class2_Sub9_Sub18_Sub1(arg0.method5575(), arg0.anInt6661);
	}
}
