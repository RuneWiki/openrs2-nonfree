import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pj")
public final class Class41_Sub6 extends Class41 {

	@OriginalMember(owner = "client!pj", name = "g", descriptor = "I")
	public int anInt5455;

	@OriginalMember(owner = "client!pj", name = "h", descriptor = "I")
	public int anInt5456;

	@OriginalMember(owner = "client!pj", name = "l", descriptor = "Lclient!qv;")
	public Class6 aClass6_1;

	@OriginalMember(owner = "client!pj", name = "m", descriptor = "[Lclient!mn;")
	public Class41_Sub4[] aClass41_Sub4Array1;

	@OriginalMember(owner = "client!pj", name = "n", descriptor = "I")
	public int anInt5459;

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(IILclient!qa;I)Z")
	public boolean method4194(@OriginalArg(1) int arg0, @OriginalArg(2) Class30 arg1, @OriginalArg(3) int arg2) {
		if (this.aClass41_Sub4Array1 != null) {
			for (@Pc(10) int local10 = 0; local10 < this.aClass41_Sub4Array1.length; local10++) {
				if (this.aClass41_Sub4Array1[local10].method3428(arg2, arg0) && this.aClass6_1.method5631(arg2, arg0, arg1)) {
					return true;
				}
			}
		}
		return false;
	}
}
