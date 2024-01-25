import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public final class Class5_Sub51 extends Class5 {

	@OriginalMember(owner = "client!we", name = "p", descriptor = "Lclient!jk;")
	public final Class15_Sub2_Sub1_Sub2 aClass15_Sub2_Sub1_Sub2_2;

	@OriginalMember(owner = "client!we", name = "<init>", descriptor = "(Lclient!jk;)V")
	public Class5_Sub51(@OriginalArg(0) Class15_Sub2_Sub1_Sub2 arg0) {
		this.aClass15_Sub2_Sub1_Sub2_2 = arg0;
	}
}
