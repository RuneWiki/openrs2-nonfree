import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vs")
public final class Class13_Sub7 extends Class13 {

	@OriginalMember(owner = "client!vs", name = "i", descriptor = "I")
	public int anInt7372;

	@OriginalMember(owner = "client!vs", name = "j", descriptor = "Lclient!rn;")
	public Class1 aClass1_1;

	@OriginalMember(owner = "client!vs", name = "k", descriptor = "I")
	public int anInt7373;

	@OriginalMember(owner = "client!vs", name = "p", descriptor = "I")
	public int anInt7375;

	@OriginalMember(owner = "client!vs", name = "r", descriptor = "[Lclient!aq;")
	public Class13_Sub1[] aClass13_Sub1Array1;

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(IIZLclient!qa;)Z")
	public boolean method5761(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class75 arg2) {
		if (this.aClass13_Sub1Array1 != null) {
			for (@Pc(8) int local8 = 0; local8 < this.aClass13_Sub1Array1.length; local8++) {
				if (this.aClass13_Sub1Array1[local8].method527(arg1, arg0) && this.aClass1_1.method5835(arg1, arg0, arg2)) {
					return true;
				}
			}
		}
		return false;
	}
}
