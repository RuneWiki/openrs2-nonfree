import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public final class Class3_Sub4_Sub13 extends Class3_Sub4 {

	@OriginalMember(owner = "client!ja", name = "A", descriptor = "Lclient!bc;")
	public Class10_Sub2 aClass10_Sub2_1;

	@OriginalMember(owner = "client!ja", name = "<init>", descriptor = "(Lclient!bc;)V")
	public Class3_Sub4_Sub13(@OriginalArg(0) Class10_Sub2 arg0) {
		this.aClass10_Sub2_1 = arg0;
	}
}
