import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bw")
public final class Class36_Sub1 extends Class36 {

	@OriginalMember(owner = "client!bw", name = "n", descriptor = "I")
	public int anInt656;

	@OriginalMember(owner = "client!bw", name = "o", descriptor = "I")
	public int anInt657;

	@OriginalMember(owner = "client!bw", name = "p", descriptor = "I")
	public int anInt658;

	@OriginalMember(owner = "client!bw", name = "t", descriptor = "Lclient!ha;")
	public Class47 aClass47_1;

	@OriginalMember(owner = "client!bw", name = "v", descriptor = "[Lclient!sf;")
	public Class36_Sub8[] aClass36_Sub8Array1;

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(ILclient!qa;II)Z")
	public boolean method545(@OriginalArg(1) Class121 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (this.aClass36_Sub8Array1 != null) {
			for (@Pc(16) int local16 = 0; local16 < this.aClass36_Sub8Array1.length; local16++) {
				if (this.aClass36_Sub8Array1[local16].method5132(arg1, arg2) && this.aClass47_1.method5727(arg2, arg1, arg0)) {
					return true;
				}
			}
		}
		return false;
	}
}
