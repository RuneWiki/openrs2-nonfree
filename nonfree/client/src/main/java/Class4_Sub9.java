import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!w")
public final class Class4_Sub9 extends Class4 {

	@OriginalMember(owner = "client!w", name = "j", descriptor = "Z")
	public boolean aBoolean748;

	@OriginalMember(owner = "client!w", name = "p", descriptor = "Lclient!haa;")
	public Class4_Sub3 aClass4_Sub3_24;

	@OriginalMember(owner = "client!w", name = "l", descriptor = "[Lclient!aba;")
	public Class4_Sub1[] aClass4_Sub1Array1;

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(ILclient!ha;BI)Z")
	public boolean method9217(@OriginalArg(0) int arg0, @OriginalArg(1) Class144 arg1, @OriginalArg(3) int arg2) {
		@Pc(17) int local17 = this.aClass4_Sub3_24.method9477();
		if (this.aClass4_Sub1Array1 != null) {
			for (@Pc(22) int local22 = 0; local22 < this.aClass4_Sub1Array1.length; local22++) {
				this.aClass4_Sub1Array1[local22].anInt30 <<= local17;
				if (this.aClass4_Sub1Array1[local22].method46(arg0, arg2) && this.aClass4_Sub3_24.method9478(arg2, arg0, arg1)) {
					this.aClass4_Sub1Array1[local22].anInt30 >>= local17;
					return true;
				}
				this.aClass4_Sub1Array1[local22].anInt30 >>= local17;
			}
		}
		return false;
	}
}
