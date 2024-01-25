import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public final class Class1_Sub1_Sub13 extends Class1_Sub1 {

	@OriginalMember(owner = "client!nb", name = "w", descriptor = "Lclient!fl;")
	public final Class5_Sub3_Sub1 aClass5_Sub3_Sub1_1;

	@OriginalMember(owner = "client!nb", name = "<init>", descriptor = "(Lclient!fl;)V")
	public Class1_Sub1_Sub13(@OriginalArg(0) Class5_Sub3_Sub1 arg0) {
		this.aClass5_Sub3_Sub1_1 = arg0;
	}
}
