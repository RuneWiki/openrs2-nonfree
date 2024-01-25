import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jda")
public final class Class3_Sub4 extends Class3 {

	@OriginalMember(owner = "client!jda", name = "k", descriptor = "Z")
	public boolean aBoolean419;

	@OriginalMember(owner = "client!jda", name = "l", descriptor = "Lclient!ga;")
	public Class3_Sub1 aClass3_Sub1_15;

	@OriginalMember(owner = "client!jda", name = "p", descriptor = "[Lclient!iw;")
	public Class3_Sub3[] aClass3_Sub3Array1;

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "(IILclient!ha;I)Z")
	public boolean method4732(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class20 arg2) {
		@Pc(17) int local17 = this.aClass3_Sub1_15.method8617();
		if (this.aClass3_Sub3Array1 != null) {
			for (@Pc(22) int local22 = 0; local22 < this.aClass3_Sub3Array1.length; local22++) {
				this.aClass3_Sub3Array1[local22].anInt5418 <<= local17;
				if (this.aClass3_Sub3Array1[local22].method4619(arg1, arg0) && this.aClass3_Sub1_15.method8615(arg2, arg0, arg1)) {
					this.aClass3_Sub3Array1[local22].anInt5418 >>= local17;
					return true;
				}
				this.aClass3_Sub3Array1[local22].anInt5418 >>= local17;
			}
		}
		return false;
	}
}
