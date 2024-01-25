import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pi")
public final class Class28_Sub7 extends Class28 {

	@OriginalMember(owner = "client!pi", name = "g", descriptor = "Z")
	public boolean aBoolean655;

	@OriginalMember(owner = "client!pi", name = "h", descriptor = "Lclient!lq;")
	public Class28_Sub1 aClass28_Sub1_17;

	@OriginalMember(owner = "client!pi", name = "m", descriptor = "[Lclient!vu;")
	public Class28_Sub9[] aClass28_Sub9Array1;

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(Lclient!ha;III)Z")
	public boolean method6488(@OriginalArg(0) Class65 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(10) int local10 = this.aClass28_Sub1_17.method8966();
		if (this.aClass28_Sub9Array1 != null) {
			for (@Pc(20) int local20 = 0; local20 < this.aClass28_Sub9Array1.length; local20++) {
				this.aClass28_Sub9Array1[local20].anInt10434 <<= local10;
				if (this.aClass28_Sub9Array1[local20].method8666(arg1, arg2) && this.aClass28_Sub1_17.method8959(arg1, arg2, arg0)) {
					this.aClass28_Sub9Array1[local20].anInt10434 >>= local10;
					return true;
				}
				this.aClass28_Sub9Array1[local20].anInt10434 >>= local10;
			}
		}
		return false;
	}
}
