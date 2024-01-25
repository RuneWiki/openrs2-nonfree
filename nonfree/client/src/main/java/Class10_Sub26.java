import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public final class Class10_Sub26 extends Class10 {

	@OriginalMember(owner = "client!lj", name = "l", descriptor = "Lclient!ig;")
	public final Class24_Sub3_Sub2_Sub1 aClass24_Sub3_Sub2_Sub1_2;

	@OriginalMember(owner = "client!lj", name = "<init>", descriptor = "(Lclient!ig;)V")
	public Class10_Sub26(@OriginalArg(0) Class24_Sub3_Sub2_Sub1 arg0) {
		this.aClass24_Sub3_Sub2_Sub1_2 = arg0;
	}
}
