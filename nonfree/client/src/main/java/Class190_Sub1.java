import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public final class Class190_Sub1 extends Class190 {

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(ILclient!jda;)Lclient!jda;")
	@Override
	public Class3_Sub4_Sub13 method5647(@OriginalArg(1) Class3_Sub4_Sub13 arg0) {
		return new Class3_Sub4_Sub13_Sub1(arg0.method8058(), arg0.anInt9924);
	}
}
