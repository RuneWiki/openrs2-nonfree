import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uh")
public final class Class15_Sub9 extends Class15 {

	@OriginalMember(owner = "client!uh", name = "l", descriptor = "Z")
	public boolean aBoolean770;

	@OriginalMember(owner = "client!uh", name = "o", descriptor = "[Lclient!et;")
	public Class15_Sub6[] aClass15_Sub6Array1;

	@OriginalMember(owner = "client!uh", name = "p", descriptor = "Lclient!nfa;")
	public Class15_Sub3 aClass15_Sub3_22;

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(IIILclient!ha;)Z")
	public boolean method9027(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class101 arg2) {
		@Pc(18) int local18 = this.aClass15_Sub3_22.method9432();
		if (this.aClass15_Sub6Array1 != null) {
			for (@Pc(23) int local23 = 0; local23 < this.aClass15_Sub6Array1.length; local23++) {
				this.aClass15_Sub6Array1[local23].anInt2724 <<= local18;
				if (this.aClass15_Sub6Array1[local23].method2536(arg1, arg0) && this.aClass15_Sub3_22.method9431(arg1, arg0, arg2)) {
					this.aClass15_Sub6Array1[local23].anInt2724 >>= local18;
					return true;
				}
				this.aClass15_Sub6Array1[local23].anInt2724 >>= local18;
			}
		}
		return false;
	}
}
