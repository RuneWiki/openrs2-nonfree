import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public final class Class4_Sub2_Sub9 extends Class4_Sub2 {

	@OriginalMember(owner = "client!ej", name = "r", descriptor = "Lclient!qm;")
	public final Class8_Sub3_Sub4 aClass8_Sub3_Sub4_1;

	@OriginalMember(owner = "client!ej", name = "<init>", descriptor = "(Lclient!qm;)V")
	public Class4_Sub2_Sub9(@OriginalArg(0) Class8_Sub3_Sub4 arg0) {
		this.aClass8_Sub3_Sub4_1 = arg0;
	}
}
