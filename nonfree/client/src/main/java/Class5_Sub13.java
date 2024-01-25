import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eea")
public final class Class5_Sub13 extends Class5 {

	@OriginalMember(owner = "client!eea", name = "i", descriptor = "Lclient!fs;")
	public final Class14_Sub1_Sub1_Sub3_Sub2 aClass14_Sub1_Sub1_Sub3_Sub2_1;

	@OriginalMember(owner = "client!eea", name = "<init>", descriptor = "(Lclient!fs;)V")
	public Class5_Sub13(@OriginalArg(0) Class14_Sub1_Sub1_Sub3_Sub2 arg0) {
		this.aClass14_Sub1_Sub1_Sub3_Sub2_1 = arg0;
	}
}
