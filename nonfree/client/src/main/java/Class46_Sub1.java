import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tk")
public final class Class46_Sub1 extends Class46 {

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(BLclient!cr;)Lclient!cr;")
	@Override
	public Class2_Sub1_Sub3 method5436(@OriginalArg(1) Class2_Sub1_Sub3 arg0) {
		return new Class2_Sub1_Sub3_Sub1(arg0.method5178(), arg0.anInt6505);
	}
}
