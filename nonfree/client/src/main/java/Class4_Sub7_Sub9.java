import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jr")
public final class Class4_Sub7_Sub9 extends Class4_Sub7 {

	@OriginalMember(owner = "client!jr", name = "y", descriptor = "Lclient!ok;")
	public final Class10_Sub1_Sub4 aClass10_Sub1_Sub4_1;

	@OriginalMember(owner = "client!jr", name = "<init>", descriptor = "(Lclient!ok;)V")
	public Class4_Sub7_Sub9(@OriginalArg(0) Class10_Sub1_Sub4 arg0) {
		this.aClass10_Sub1_Sub4_1 = arg0;
	}
}
