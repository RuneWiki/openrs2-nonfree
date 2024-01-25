import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jk")
public final class Class16_Sub5 extends Class16 {

	@OriginalMember(owner = "client!jk", name = "o", descriptor = "Lclient!rba;")
	public Class16_Sub1 aClass16_Sub1_16;

	@OriginalMember(owner = "client!jk", name = "q", descriptor = "Z")
	public boolean aBoolean374;

	@OriginalMember(owner = "client!jk", name = "r", descriptor = "[Lclient!wt;")
	public Class16_Sub10[] aClass16_Sub10Array1;

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(IIILclient!ha;)Z")
	public boolean method4443(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class13 arg2) {
		@Pc(10) int local10 = this.aClass16_Sub1_16.method6975();
		if (this.aClass16_Sub10Array1 != null) {
			for (@Pc(23) int local23 = 0; local23 < this.aClass16_Sub10Array1.length; local23++) {
				this.aClass16_Sub10Array1[local23].anInt10442 <<= local10;
				if (this.aClass16_Sub10Array1[local23].method8876(arg0, arg1) && this.aClass16_Sub1_16.method6985(arg0, arg2, arg1)) {
					this.aClass16_Sub10Array1[local23].anInt10442 >>= local10;
					return true;
				}
				this.aClass16_Sub10Array1[local23].anInt10442 >>= local10;
			}
		}
		return false;
	}
}
