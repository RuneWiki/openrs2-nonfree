import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jg")
public final class Class55_Sub3 extends Class55 {

	@OriginalMember(owner = "client!jg", name = "h", descriptor = "I")
	public int anInt3103;

	@OriginalMember(owner = "client!jg", name = "n", descriptor = "I")
	public int anInt3108;

	@OriginalMember(owner = "client!jg", name = "o", descriptor = "I")
	public int anInt3109;

	@OriginalMember(owner = "client!jg", name = "p", descriptor = "Lclient!na;")
	public Class62 aClass62_1;

	@OriginalMember(owner = "client!jg", name = "q", descriptor = "[Lclient!kf;")
	public Class55_Sub4[] aClass55_Sub4Array1;

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(ILclient!ae;II)Z")
	public boolean method2937(@OriginalArg(1) Class4 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (this.aClass55_Sub4Array1 != null) {
			for (@Pc(15) int local15 = 0; local15 < this.aClass55_Sub4Array1.length; local15++) {
				if (this.aClass55_Sub4Array1[local15].method3090(arg2, arg1) && this.aClass62_1.method5565(arg2, arg0, arg1)) {
					return true;
				}
			}
		}
		return false;
	}
}
