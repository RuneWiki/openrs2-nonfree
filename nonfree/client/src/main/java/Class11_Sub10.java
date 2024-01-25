import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vw")
public final class Class11_Sub10 extends Class11 {

	@OriginalMember(owner = "client!vw", name = "j", descriptor = "Z")
	public boolean aBoolean737;

	@OriginalMember(owner = "client!vw", name = "k", descriptor = "Lclient!gs;")
	public Class11_Sub1 aClass11_Sub1_3;

	@OriginalMember(owner = "client!vw", name = "l", descriptor = "[Lclient!ig;")
	public Class11_Sub7[] aClass11_Sub7Array1;

	@OriginalMember(owner = "client!vw", name = "a", descriptor = "(ILclient!ha;ZI)Z")
	public boolean method8373(@OriginalArg(0) int arg0, @OriginalArg(1) Class87 arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15 = this.aClass11_Sub1_3.method8305();
		if (this.aClass11_Sub7Array1 != null) {
			for (@Pc(20) int local20 = 0; local20 < this.aClass11_Sub7Array1.length; local20++) {
				this.aClass11_Sub7Array1[local20].anInt4700 <<= local15;
				if (this.aClass11_Sub7Array1[local20].method3906(arg2, arg0) && this.aClass11_Sub1_3.method8301(arg1, arg0, arg2)) {
					this.aClass11_Sub7Array1[local20].anInt4700 >>= local15;
					return true;
				}
				this.aClass11_Sub7Array1[local20].anInt4700 >>= local15;
			}
		}
		return false;
	}
}
