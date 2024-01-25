import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hq")
public final class Class41_Sub3 extends Class41 {

	@OriginalMember(owner = "client!hq", name = "p", descriptor = "[Lclient!sp;")
	public Class41_Sub9[] aClass41_Sub9Array1;

	@OriginalMember(owner = "client!hq", name = "q", descriptor = "Z")
	public boolean aBoolean258;

	@OriginalMember(owner = "client!hq", name = "r", descriptor = "Lclient!sf;")
	public Class41_Sub1 aClass41_Sub1_10;

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(IIILclient!ha;)Z")
	public boolean method3325(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class143 arg2) {
		@Pc(12) int local12 = this.aClass41_Sub1_10.method8663();
		if (this.aClass41_Sub9Array1 != null) {
			for (@Pc(26) int local26 = 0; local26 < this.aClass41_Sub9Array1.length; local26++) {
				this.aClass41_Sub9Array1[local26].anInt8962 <<= local12;
				if (this.aClass41_Sub9Array1[local26].method7548(arg0, arg1) && this.aClass41_Sub1_10.method8661(arg1, arg2, arg0)) {
					this.aClass41_Sub9Array1[local26].anInt8962 >>= local12;
					return true;
				}
				this.aClass41_Sub9Array1[local26].anInt8962 >>= local12;
			}
		}
		return false;
	}
}
