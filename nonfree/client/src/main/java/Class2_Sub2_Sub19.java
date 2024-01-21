import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public final class Class2_Sub2_Sub19 extends Class2_Sub2 {

	@OriginalMember(owner = "client!mc", name = "x", descriptor = "Lclient!pi;")
	public final Class24_Sub5 aClass24_Sub5_1;

	@OriginalMember(owner = "client!mc", name = "<init>", descriptor = "(Lclient!pi;)V")
	public Class2_Sub2_Sub19(@OriginalArg(0) Class24_Sub5 arg0) {
		this.aClass24_Sub5_1 = arg0;
	}
}
