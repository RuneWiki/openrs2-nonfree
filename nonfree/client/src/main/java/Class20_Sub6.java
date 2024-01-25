import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kh")
public final class Class20_Sub6 extends Class20 {

	@OriginalMember(owner = "client!kh", name = "p", descriptor = "Lclient!nf;")
	public Class44 aClass44_1;

	@OriginalMember(owner = "client!kh", name = "q", descriptor = "I")
	public int anInt3048;

	@OriginalMember(owner = "client!kh", name = "s", descriptor = "[Lclient!tc;")
	public Class20_Sub8[] aClass20_Sub8Array1;

	@OriginalMember(owner = "client!kh", name = "t", descriptor = "I")
	public int anInt3049;

	@OriginalMember(owner = "client!kh", name = "w", descriptor = "I")
	public int anInt3052;

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(IIILclient!ja;)Z")
	public boolean method3213(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class81 arg2) {
		if (this.aClass20_Sub8Array1 != null) {
			for (@Pc(20) int local20 = 0; local20 < this.aClass20_Sub8Array1.length; local20++) {
				if (this.aClass20_Sub8Array1[local20].method5104(arg0, arg1) && this.aClass44_1.method5778(arg1, arg2, arg0)) {
					return true;
				}
			}
		}
		return false;
	}
}
