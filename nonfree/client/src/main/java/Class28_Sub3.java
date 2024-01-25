import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dfa")
public final class Class28_Sub3 extends Class28 {

	@OriginalMember(owner = "client!dfa", name = "o", descriptor = "Z")
	public boolean aBoolean145;

	@OriginalMember(owner = "client!dfa", name = "t", descriptor = "[Lclient!taa;")
	public Class28_Sub8[] aClass28_Sub8Array1;

	@OriginalMember(owner = "client!dfa", name = "v", descriptor = "Lclient!wea;")
	public Class28_Sub1 aClass28_Sub1_5;

	@OriginalMember(owner = "client!dfa", name = "a", descriptor = "(IIILclient!ha;)Z")
	public boolean method1775(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class13 arg2) {
		@Pc(15) int local15 = this.aClass28_Sub1_5.method9294();
		if (this.aClass28_Sub8Array1 != null) {
			for (@Pc(20) int local20 = 0; local20 < this.aClass28_Sub8Array1.length; local20++) {
				this.aClass28_Sub8Array1[local20].anInt9149 <<= local15;
				if (this.aClass28_Sub8Array1[local20].method7998(arg0, arg1) && this.aClass28_Sub1_5.method9286(arg1, arg0, arg2)) {
					this.aClass28_Sub8Array1[local20].anInt9149 >>= local15;
					return true;
				}
				this.aClass28_Sub8Array1[local20].anInt9149 >>= local15;
			}
		}
		return false;
	}
}
