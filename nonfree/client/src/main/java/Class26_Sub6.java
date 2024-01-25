import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pe")
public final class Class26_Sub6 extends Class26 {

	@OriginalMember(owner = "client!pe", name = "m", descriptor = "Lclient!ni;")
	public Class10 aClass10_1;

	@OriginalMember(owner = "client!pe", name = "n", descriptor = "I")
	public int anInt6987;

	@OriginalMember(owner = "client!pe", name = "o", descriptor = "I")
	public int anInt6988;

	@OriginalMember(owner = "client!pe", name = "p", descriptor = "[Lclient!ot;")
	public Class26_Sub5[] aClass26_Sub5Array1;

	@OriginalMember(owner = "client!pe", name = "r", descriptor = "I")
	public int anInt6990;

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IBLclient!oa;I)Z")
	public boolean method5822(@OriginalArg(0) int arg0, @OriginalArg(2) Class66 arg1, @OriginalArg(3) int arg2) {
		if (this.aClass26_Sub5Array1 != null) {
			for (@Pc(10) int local10 = 0; local10 < this.aClass26_Sub5Array1.length; local10++) {
				if (this.aClass26_Sub5Array1[local10].method5725(arg2, arg0) && this.aClass10_1.method7728(arg0, arg1, arg2)) {
					return true;
				}
			}
		}
		return false;
	}
}
