import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rga")
public final class Class2_Sub49 extends Class2 {

	@OriginalMember(owner = "client!rga", name = "o", descriptor = "Lclient!efa;")
	public final Class4_Sub2_Sub1_Sub2_Sub2 aClass4_Sub2_Sub1_Sub2_Sub2_3;

	@OriginalMember(owner = "client!rga", name = "<init>", descriptor = "(Lclient!efa;)V")
	public Class2_Sub49(@OriginalArg(0) Class4_Sub2_Sub1_Sub2_Sub2 arg0) {
		this.aClass4_Sub2_Sub1_Sub2_Sub2_3 = arg0;
	}
}
