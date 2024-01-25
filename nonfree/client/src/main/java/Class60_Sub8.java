import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wc")
public final class Class60_Sub8 extends Class60 {

	@OriginalMember(owner = "client!wc", name = "h", descriptor = "I")
	public int anInt9790;

	@OriginalMember(owner = "client!wc", name = "i", descriptor = "I")
	public int anInt9791;

	@OriginalMember(owner = "client!wc", name = "l", descriptor = "Lclient!gfa;")
	public Class15 aClass15_1;

	@OriginalMember(owner = "client!wc", name = "m", descriptor = "[Lclient!rc;")
	public Class60_Sub6[] aClass60_Sub6Array1;

	@OriginalMember(owner = "client!wc", name = "o", descriptor = "I")
	public int anInt9794;

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIILclient!oa;)Z")
	public boolean method7806(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class90 arg2) {
		if (this.aClass60_Sub6Array1 != null) {
			for (@Pc(14) int local14 = 0; local14 < this.aClass60_Sub6Array1.length; local14++) {
				if (this.aClass60_Sub6Array1[local14].method6217(arg0, arg1) && this.aClass15_1.method7164(arg0, arg2, arg1)) {
					return true;
				}
			}
		}
		return false;
	}
}
