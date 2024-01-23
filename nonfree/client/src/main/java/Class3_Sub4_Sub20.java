import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public final class Class3_Sub4_Sub20 extends Class3_Sub4 {

	@OriginalMember(owner = "client!rb", name = "K", descriptor = "Lclient!an;")
	public Class10_Sub1 aClass10_Sub1_1;

	@OriginalMember(owner = "client!rb", name = "<init>", descriptor = "(Lclient!an;)V")
	public Class3_Sub4_Sub20(@OriginalArg(0) Class10_Sub1 arg0) {
		this.aClass10_Sub1_1 = arg0;
	}
}
