import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!od")
public final class Class25_Sub10 extends Class25 {

	@OriginalMember(owner = "client!od", name = "j", descriptor = "[Lclient!b;")
	public Class25_Sub1[] aClass25_Sub1Array1;

	@OriginalMember(owner = "client!od", name = "k", descriptor = "Lclient!pn;")
	public Class25_Sub2 aClass25_Sub2_2;

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IIILclient!r;)Z")
	public boolean method5310(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class31 arg2) {
		if (this.aClass25_Sub1Array1 != null) {
			for (@Pc(14) int local14 = 0; local14 < this.aClass25_Sub1Array1.length; local14++) {
				if (this.aClass25_Sub1Array1[local14].method303(arg1, arg0) && this.aClass25_Sub2_2.method6657(arg0, arg2, arg1)) {
					return true;
				}
			}
		}
		return false;
	}
}
