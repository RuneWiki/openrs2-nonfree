import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fk")
public final class Class3_Sub3 extends Class3 {

	@OriginalMember(owner = "client!fk", name = "l", descriptor = "I")
	public int anInt2381;

	@OriginalMember(owner = "client!fk", name = "n", descriptor = "I")
	public int anInt2383;

	@OriginalMember(owner = "client!fk", name = "o", descriptor = "I")
	public int anInt2384;

	@OriginalMember(owner = "client!fk", name = "r", descriptor = "Lclient!fi;")
	public Class16 aClass16_1;

	@OriginalMember(owner = "client!fk", name = "s", descriptor = "[Lclient!mi;")
	public Class3_Sub5[] aClass3_Sub5Array1;

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(IIILclient!ya;)Z")
	public boolean method2024(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class19 arg2) {
		if (this.aClass3_Sub5Array1 != null) {
			for (@Pc(14) int local14 = 0; local14 < this.aClass3_Sub5Array1.length; local14++) {
				if (this.aClass3_Sub5Array1[local14].method3568(arg0, arg1) && this.aClass16_1.method5341(arg1, arg2, arg0)) {
					return true;
				}
			}
		}
		return false;
	}
}
