import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jl")
public final class Class13_Sub6 extends Class13 {

	@OriginalMember(owner = "client!jl", name = "h", descriptor = "Lclient!ig;")
	public Class13_Sub1 aClass13_Sub1_2;

	@OriginalMember(owner = "client!jl", name = "k", descriptor = "Z")
	public boolean aBoolean298;

	@OriginalMember(owner = "client!jl", name = "l", descriptor = "[Lclient!au;")
	public Class13_Sub2[] aClass13_Sub2Array1;

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(BIILclient!ha;)Z")
	public boolean method3777(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class95 arg2) {
		@Pc(10) int local10 = this.aClass13_Sub1_2.method8405();
		if (this.aClass13_Sub2Array1 != null) {
			for (@Pc(15) int local15 = 0; local15 < this.aClass13_Sub2Array1.length; local15++) {
				this.aClass13_Sub2Array1[local15].anInt606 <<= local10;
				if (this.aClass13_Sub2Array1[local15].method479(arg1, arg0) && this.aClass13_Sub1_2.method8400(arg2, arg1, arg0)) {
					this.aClass13_Sub2Array1[local15].anInt606 >>= local10;
					return true;
				}
				this.aClass13_Sub2Array1[local15].anInt606 >>= local10;
			}
		}
		return false;
	}
}
