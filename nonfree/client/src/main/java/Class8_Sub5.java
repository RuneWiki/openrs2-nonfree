import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kj")
public final class Class8_Sub5 extends Class8 {

	@OriginalMember(owner = "client!kj", name = "l", descriptor = "I")
	public int anInt3436;

	@OriginalMember(owner = "client!kj", name = "m", descriptor = "Lclient!pc;")
	public Class17 aClass17_1;

	@OriginalMember(owner = "client!kj", name = "o", descriptor = "I")
	public int anInt3438;

	@OriginalMember(owner = "client!kj", name = "s", descriptor = "[Lclient!fi;")
	public Class8_Sub3[] aClass8_Sub3Array1;

	@OriginalMember(owner = "client!kj", name = "t", descriptor = "I")
	public int anInt3442;

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(IIILclient!uo;)Z")
	public boolean method3156(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class32 arg2) {
		if (this.aClass8_Sub3Array1 != null) {
			for (@Pc(15) int local15 = 0; local15 < this.aClass8_Sub3Array1.length; local15++) {
				if (this.aClass8_Sub3Array1[local15].method1835(arg1, arg0) && this.aClass17_1.method4783(arg2, arg1, arg0)) {
					return true;
				}
			}
		}
		return false;
	}
}
