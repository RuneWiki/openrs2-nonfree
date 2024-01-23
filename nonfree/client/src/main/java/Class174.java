import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public final class Class174 {

	@OriginalMember(owner = "client!uf", name = "e", descriptor = "I")
	public int anInt5618;

	@OriginalMember(owner = "client!uf", name = "f", descriptor = "[Lclient!jn;")
	public Class1_Sub3_Sub11[] aClass1_Sub3_Sub11Array1;

	@OriginalMember(owner = "client!uf", name = "b", descriptor = "[I")
	public int[] anIntArray509;

	@OriginalMember(owner = "client!uf", name = "<init>", descriptor = "(I)V")
	public Class174(@OriginalArg(0) int arg0) {
		this.anInt5618 = arg0;
		this.aClass1_Sub3_Sub11Array1 = new Class1_Sub3_Sub11[this.anInt5618];
		this.anIntArray509 = new int[this.anInt5618];
	}
}
