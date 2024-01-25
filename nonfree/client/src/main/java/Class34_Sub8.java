import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pia")
public final class Class34_Sub8 extends Class34 {

	@OriginalMember(owner = "client!pia", name = "g", descriptor = "Lclient!fq;")
	public Class34_Sub1 aClass34_Sub1_20;

	@OriginalMember(owner = "client!pia", name = "h", descriptor = "[Lclient!ju;")
	public Class34_Sub6[] aClass34_Sub6Array1;

	@OriginalMember(owner = "client!pia", name = "l", descriptor = "Z")
	public boolean aBoolean527;

	@OriginalMember(owner = "client!pia", name = "a", descriptor = "(IIBLclient!ha;)Z")
	public boolean method6194(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class95 arg2) {
		@Pc(10) int local10 = this.aClass34_Sub1_20.method7844();
		if (this.aClass34_Sub6Array1 != null) {
			for (@Pc(20) int local20 = 0; local20 < this.aClass34_Sub6Array1.length; local20++) {
				this.aClass34_Sub6Array1[local20].anInt4992 <<= local10;
				if (this.aClass34_Sub6Array1[local20].method4296(arg0, arg1) && this.aClass34_Sub1_20.method7850(arg0, arg2, arg1)) {
					this.aClass34_Sub6Array1[local20].anInt4992 >>= local10;
					return true;
				}
				this.aClass34_Sub6Array1[local20].anInt4992 >>= local10;
			}
		}
		return false;
	}
}
