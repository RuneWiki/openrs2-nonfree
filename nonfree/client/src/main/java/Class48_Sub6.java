import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!km")
public final class Class48_Sub6 extends Class48 {

	@OriginalMember(owner = "client!km", name = "m", descriptor = "Lclient!ps;")
	public Class3 aClass3_1;

	@OriginalMember(owner = "client!km", name = "n", descriptor = "[Lclient!ni;")
	public Class48_Sub7[] aClass48_Sub7Array1;

	@OriginalMember(owner = "client!km", name = "r", descriptor = "I")
	public int anInt3644;

	@OriginalMember(owner = "client!km", name = "t", descriptor = "I")
	public int anInt3646;

	@OriginalMember(owner = "client!km", name = "u", descriptor = "I")
	public int anInt3647;

	static {
		new Class231(null, "Spieler nicht auf deiner Freunde-Liste.", null, null);
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(IIILclient!qq;)Z")
	public boolean method3256(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class28 arg2) {
		if (this.aClass48_Sub7Array1 != null) {
			for (@Pc(18) int local18 = 0; local18 < this.aClass48_Sub7Array1.length; local18++) {
				if (this.aClass48_Sub7Array1[local18].method4093(arg1, arg0) && this.aClass3_1.method5797(arg2, arg1, arg0)) {
					return true;
				}
			}
		}
		return false;
	}
}
