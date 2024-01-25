import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pm")
public final class Class193_Sub1 extends Class193 {

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(Lclient!rg;I)Lclient!rg;")
	@Override
	public Class2_Sub10_Sub5 method4128(@OriginalArg(0) Class2_Sub10_Sub5 arg0) {
		return new Class2_Sub10_Sub5_Sub2(arg0.method5575(), arg0.anInt6494);
	}
}
