import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qs")
public final class Class4_Sub8 extends Class4 {

	@OriginalMember(owner = "client!qs", name = "e", descriptor = "Lclient!jw;")
	public Class4_Sub1 aClass4_Sub1_2;

	@OriginalMember(owner = "client!qs", name = "g", descriptor = "[Lclient!nl;")
	public Class4_Sub5[] aClass4_Sub5Array1;

	@OriginalMember(owner = "client!qs", name = "i", descriptor = "Z")
	public boolean aBoolean581;

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(BILclient!ha;I)Z")
	public boolean method7122(@OriginalArg(1) int arg0, @OriginalArg(2) Class5 arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15 = this.aClass4_Sub1_2.method7695();
		if (this.aClass4_Sub5Array1 != null) {
			for (@Pc(20) int local20 = 0; local20 < this.aClass4_Sub5Array1.length; local20++) {
				this.aClass4_Sub5Array1[local20].anInt7146 <<= local15;
				if (this.aClass4_Sub5Array1[local20].method6148(arg0, arg2) && this.aClass4_Sub1_2.method7704(arg2, arg0, arg1)) {
					this.aClass4_Sub5Array1[local20].anInt7146 >>= local15;
					return true;
				}
				this.aClass4_Sub5Array1[local20].anInt7146 >>= local15;
			}
		}
		return false;
	}
}
