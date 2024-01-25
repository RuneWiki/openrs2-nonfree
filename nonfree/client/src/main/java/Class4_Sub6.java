import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kv")
public final class Class4_Sub6 extends Class4 {

	@OriginalMember(owner = "client!kv", name = "k", descriptor = "Z")
	public boolean aBoolean352;

	@OriginalMember(owner = "client!kv", name = "i", descriptor = "Lclient!rda;")
	public Class4_Sub1 aClass4_Sub1_13;

	@OriginalMember(owner = "client!kv", name = "g", descriptor = "[Lclient!rp;")
	public Class4_Sub8[] aClass4_Sub8Array1;

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(IIILclient!ha;)Z")
	public boolean method4839(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class100 arg2) {
		@Pc(10) int local10 = this.aClass4_Sub1_13.method8357();
		if (this.aClass4_Sub8Array1 != null) {
			for (@Pc(20) int local20 = 0; local20 < this.aClass4_Sub8Array1.length; local20++) {
				this.aClass4_Sub8Array1[local20].anInt8407 <<= local10;
				if (this.aClass4_Sub8Array1[local20].method7226(arg0, arg1) && this.aClass4_Sub1_13.method8353(arg1, arg0, arg2)) {
					this.aClass4_Sub8Array1[local20].anInt8407 >>= local10;
					return true;
				}
				this.aClass4_Sub8Array1[local20].anInt8407 >>= local10;
			}
		}
		return false;
	}
}
