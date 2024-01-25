import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lb")
public final class Class6_Sub5 extends Class6 {

	@OriginalMember(owner = "client!lb", name = "k", descriptor = "I")
	public int anInt4918;

	@OriginalMember(owner = "client!lb", name = "n", descriptor = "I")
	public int anInt4920;

	@OriginalMember(owner = "client!lb", name = "o", descriptor = "I")
	public int anInt4921;

	@OriginalMember(owner = "client!lb", name = "r", descriptor = "Lclient!se;")
	public Class1 aClass1_1;

	@OriginalMember(owner = "client!lb", name = "w", descriptor = "[Lclient!gr;")
	public Class6_Sub4[] aClass6_Sub4Array1;

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IILclient!qa;I)Z")
	public boolean method4291(@OriginalArg(0) int arg0, @OriginalArg(2) Class39 arg1, @OriginalArg(3) int arg2) {
		if (this.aClass6_Sub4Array1 != null) {
			for (@Pc(14) int local14 = 0; local14 < this.aClass6_Sub4Array1.length; local14++) {
				if (this.aClass6_Sub4Array1[local14].method2814(arg2, arg0) && this.aClass1_1.method7673(arg2, arg1, arg0)) {
					return true;
				}
			}
		}
		return false;
	}
}
