import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ms")
public final class Class89_Sub1 extends Class89 {

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(BLclient!p;)Lclient!p;")
	@Override
	public Class14_Sub2_Sub17 method3774(@OriginalArg(1) Class14_Sub2_Sub17 arg0) {
		return new Class14_Sub2_Sub17_Sub2(arg0.anInterface8_3, arg0.method5767());
	}
}
