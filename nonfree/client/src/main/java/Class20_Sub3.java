import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!c")
public final class Class20_Sub3 extends Class20 {

	@OriginalMember(owner = "client!c", name = "k", descriptor = "Lclient!vs;")
	public Class20_Sub2 aClass20_Sub2_7;

	@OriginalMember(owner = "client!c", name = "l", descriptor = "Z")
	public boolean aBoolean82;

	@OriginalMember(owner = "client!c", name = "n", descriptor = "[Lclient!eda;")
	public Class20_Sub4[] aClass20_Sub4Array1;

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(ILclient!ha;II)Z")
	public boolean method1087(@OriginalArg(1) Class100 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15 = this.aClass20_Sub2_7.method9013();
		if (this.aClass20_Sub4Array1 != null) {
			for (@Pc(20) int local20 = 0; local20 < this.aClass20_Sub4Array1.length; local20++) {
				this.aClass20_Sub4Array1[local20].anInt2367 <<= local15;
				if (this.aClass20_Sub4Array1[local20].method1994(arg1, arg2) && this.aClass20_Sub2_7.method9014(arg1, arg0, arg2)) {
					this.aClass20_Sub4Array1[local20].anInt2367 >>= local15;
					return true;
				}
				this.aClass20_Sub4Array1[local20].anInt2367 >>= local15;
			}
		}
		return false;
	}
}
