import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uc")
public final class Class4_Sub7 extends Class4 {

	@OriginalMember(owner = "client!uc", name = "g", descriptor = "[Lclient!ut;")
	public Class4_Sub8[] aClass4_Sub8Array1;

	@OriginalMember(owner = "client!uc", name = "i", descriptor = "I")
	public int anInt6684;

	@OriginalMember(owner = "client!uc", name = "o", descriptor = "I")
	public int anInt6690;

	@OriginalMember(owner = "client!uc", name = "q", descriptor = "Lclient!ot;")
	public Class25 aClass25_1;

	@OriginalMember(owner = "client!uc", name = "r", descriptor = "I")
	public int anInt6692;

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(IIILclient!za;)Z")
	public boolean method5240(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class34 arg2) {
		if (this.aClass4_Sub8Array1 != null) {
			for (@Pc(15) int local15 = 0; local15 < this.aClass4_Sub8Array1.length; local15++) {
				if (this.aClass4_Sub8Array1[local15].method5573(arg1, arg0) && this.aClass25_1.method4601(arg0, arg2, arg1)) {
					return true;
				}
			}
		}
		return false;
	}
}
