import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public final class Class2_Sub2_Sub22 extends Class2_Sub2 {

	@OriginalMember(owner = "client!ng", name = "B", descriptor = "Lclient!rb;")
	public final Class24 aClass24_3;

	@OriginalMember(owner = "client!ng", name = "<init>", descriptor = "(Lclient!rb;)V")
	public Class2_Sub2_Sub22(@OriginalArg(0) Class24 arg0) {
		this.aClass24_3 = arg0;
	}
}
