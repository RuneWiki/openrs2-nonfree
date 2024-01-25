import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hba")
public final class Class5_Sub4_Sub9 extends Class5_Sub4 {

	@OriginalMember(owner = "client!hba", name = "x", descriptor = "Lclient!go;")
	public final Class14_Sub1_Sub1_Sub4 aClass14_Sub1_Sub1_Sub4_1;

	@OriginalMember(owner = "client!hba", name = "<init>", descriptor = "(Lclient!go;)V")
	public Class5_Sub4_Sub9(@OriginalArg(0) Class14_Sub1_Sub1_Sub4 arg0) {
		this.aClass14_Sub1_Sub1_Sub4_1 = arg0;
	}
}
