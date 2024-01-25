import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tf")
public final class Class8_Sub10 extends Class8 {

	@OriginalMember(owner = "client!tf", name = "q", descriptor = "Z")
	public boolean aBoolean731;

	@OriginalMember(owner = "client!tf", name = "n", descriptor = "Lclient!df;")
	public Class8_Sub1 aClass8_Sub1_21;

	@OriginalMember(owner = "client!tf", name = "m", descriptor = "[Lclient!ng;")
	public Class8_Sub7[] aClass8_Sub7Array1;

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(Lclient!ha;IIZ)Z")
	public boolean method8161(@OriginalArg(0) Class57 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(22) int local22 = this.aClass8_Sub1_21.method8908(1);
		if (this.aClass8_Sub7Array1 != null) {
			for (@Pc(27) int local27 = 0; local27 < this.aClass8_Sub7Array1.length; local27++) {
				this.aClass8_Sub7Array1[local27].anInt6700 <<= local22;
				if (this.aClass8_Sub7Array1[local27].method5720(arg1, arg2) && this.aClass8_Sub1_21.method8895(arg2, arg1, arg0, (byte) -105)) {
					this.aClass8_Sub7Array1[local27].anInt6700 >>= local22;
					return true;
				}
				this.aClass8_Sub7Array1[local27].anInt6700 >>= local22;
			}
		}
		return false;
	}
}
