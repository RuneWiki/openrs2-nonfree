import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bf")
public final class Class2_Sub2 extends Class2 {

	@OriginalMember(owner = "client!bf", name = "h", descriptor = "I")
	public int anInt453;

	@OriginalMember(owner = "client!bf", name = "i", descriptor = "I")
	public int anInt454;

	@OriginalMember(owner = "client!bf", name = "j", descriptor = "[Lclient!rh;")
	public Class2_Sub5[] aClass2_Sub5Array1;

	@OriginalMember(owner = "client!bf", name = "o", descriptor = "Lclient!km;")
	public Class8 aClass8_1;

	@OriginalMember(owner = "client!bf", name = "s", descriptor = "I")
	public int anInt462;

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IILclient!vq;I)Z")
	public boolean method382(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class47 arg2) {
		if (this.aClass2_Sub5Array1 != null) {
			for (@Pc(10) int local10 = 0; local10 < this.aClass2_Sub5Array1.length; local10++) {
				if (this.aClass2_Sub5Array1[local10].method4677(arg1, arg0) && this.aClass8_1.method5623(arg2, arg1, arg0)) {
					return true;
				}
			}
		}
		return false;
	}
}
