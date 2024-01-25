import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public final class Class6_Sub44 extends Class6 {

	@OriginalMember(owner = "client!pe", name = "m", descriptor = "Lclient!kf;")
	public final Class2_Sub1_Sub1_Sub3_Sub2 aClass2_Sub1_Sub1_Sub3_Sub2_2;

	@OriginalMember(owner = "client!pe", name = "<init>", descriptor = "(Lclient!kf;)V")
	public Class6_Sub44(@OriginalArg(0) Class2_Sub1_Sub1_Sub3_Sub2 arg0) {
		this.aClass2_Sub1_Sub1_Sub3_Sub2_2 = arg0;
	}
}
