import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ww")
public final class Class14_Sub10 extends Class14 {

	@OriginalMember(owner = "client!ww", name = "l", descriptor = "Z")
	public boolean aBoolean845;

	@OriginalMember(owner = "client!ww", name = "m", descriptor = "[Lclient!vh;")
	public Class14_Sub9[] aClass14_Sub9Array1;

	@OriginalMember(owner = "client!ww", name = "o", descriptor = "Lclient!kf;")
	public Class14_Sub1 aClass14_Sub1_23;

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(IILclient!ha;I)Z")
	public boolean method8906(@OriginalArg(1) int arg0, @OriginalArg(2) Class126 arg1, @OriginalArg(3) int arg2) {
		@Pc(10) int local10 = this.aClass14_Sub1_23.method7994();
		if (this.aClass14_Sub9Array1 != null) {
			for (@Pc(15) int local15 = 0; local15 < this.aClass14_Sub9Array1.length; local15++) {
				this.aClass14_Sub9Array1[local15].anInt9895 <<= local10;
				if (this.aClass14_Sub9Array1[local15].method8419(arg0, arg2) && this.aClass14_Sub1_23.method8003(arg1, arg2, arg0)) {
					this.aClass14_Sub9Array1[local15].anInt9895 >>= local10;
					return true;
				}
				this.aClass14_Sub9Array1[local15].anInt9895 >>= local10;
			}
		}
		return false;
	}
}
