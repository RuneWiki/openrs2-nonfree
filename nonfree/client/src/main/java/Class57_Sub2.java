import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gl")
public final class Class57_Sub2 extends Class57 {

	@OriginalMember(owner = "client!gl", name = "j", descriptor = "I")
	public int anInt2815;

	@OriginalMember(owner = "client!gl", name = "k", descriptor = "I")
	public int anInt2816;

	@OriginalMember(owner = "client!gl", name = "l", descriptor = "I")
	public int anInt2817;

	@OriginalMember(owner = "client!gl", name = "n", descriptor = "[Lclient!la;")
	public Class57_Sub5[] aClass57_Sub5Array1;

	@OriginalMember(owner = "client!gl", name = "p", descriptor = "Lclient!bp;")
	public Class3 aClass3_1;

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(IIILclient!eq;)Z")
	public boolean method2361(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class66 arg2) {
		if (this.aClass57_Sub5Array1 != null) {
			for (@Pc(14) int local14 = 0; local14 < this.aClass57_Sub5Array1.length; local14++) {
				if (this.aClass57_Sub5Array1[local14].method3355(arg1, arg0) && this.aClass3_1.method5939(arg1, arg2, arg0)) {
					return true;
				}
			}
		}
		return false;
	}
}
