import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sq")
public final class Class2_Sub43 extends Class2 {

	@OriginalMember(owner = "client!sq", name = "n", descriptor = "Lclient!am;")
	public final Class13_Sub1_Sub1_Sub1_Sub1 aClass13_Sub1_Sub1_Sub1_Sub1_2;

	@OriginalMember(owner = "client!sq", name = "<init>", descriptor = "(Lclient!am;)V")
	public Class2_Sub43(@OriginalArg(0) Class13_Sub1_Sub1_Sub1_Sub1 arg0) {
		this.aClass13_Sub1_Sub1_Sub1_Sub1_2 = arg0;
	}
}
