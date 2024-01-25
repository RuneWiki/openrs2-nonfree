import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nq")
public final class Class2_Sub11_Sub13 extends Class2_Sub11 {

	@OriginalMember(owner = "client!nq", name = "F", descriptor = "Lclient!ma;")
	public final Class62_Sub1_Sub4 aClass62_Sub1_Sub4_1;

	@OriginalMember(owner = "client!nq", name = "<init>", descriptor = "(Lclient!ma;)V")
	public Class2_Sub11_Sub13(@OriginalArg(0) Class62_Sub1_Sub4 arg0) {
		this.aClass62_Sub1_Sub4_1 = arg0;
	}
}
