import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bi")
public final class Class30_Sub1 extends Class30 {

	@OriginalMember(owner = "client!bi", name = "k", descriptor = "[Lclient!paa;")
	public Class30_Sub6[] aClass30_Sub6Array1;

	@OriginalMember(owner = "client!bi", name = "m", descriptor = "I")
	public int anInt913;

	@OriginalMember(owner = "client!bi", name = "n", descriptor = "Lclient!cea;")
	public Class15 aClass15_1;

	@OriginalMember(owner = "client!bi", name = "p", descriptor = "I")
	public int anInt915;

	@OriginalMember(owner = "client!bi", name = "q", descriptor = "I")
	public int anInt916;

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIILclient!qa;)Z")
	public boolean method851(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class62 arg2) {
		if (this.aClass30_Sub6Array1 != null) {
			for (@Pc(15) int local15 = 0; local15 < this.aClass30_Sub6Array1.length; local15++) {
				if (this.aClass30_Sub6Array1[local15].method5604(arg1, arg0) && this.aClass15_1.method6857(arg2, arg1, arg0)) {
					return true;
				}
			}
		}
		return false;
	}
}
