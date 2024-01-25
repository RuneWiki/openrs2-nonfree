import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fm")
public final class Class38_Sub3 extends Class38 {

	@OriginalMember(owner = "client!fm", name = "D", descriptor = "[Lclient!vf;")
	private static final Class254[] aClass254Array1 = new Class254[32];

	@OriginalMember(owner = "client!fm", name = "i", descriptor = "[Lclient!fo;")
	public Class38_Sub4[] aClass38_Sub4Array1;

	@OriginalMember(owner = "client!fm", name = "k", descriptor = "I")
	public int anInt2375;

	@OriginalMember(owner = "client!fm", name = "l", descriptor = "I")
	public int anInt2376;

	@OriginalMember(owner = "client!fm", name = "m", descriptor = "Lclient!eq;")
	public Class4 aClass4_1;

	@OriginalMember(owner = "client!fm", name = "o", descriptor = "I")
	public int anInt2378;

	static {
		@Pc(65) Class254[] local65 = Static165.method4930();
		for (@Pc(67) int local67 = 0; local67 < local65.length; local67++) {
			aClass254Array1[local65[local67].anInt7355] = local65[local67];
		}
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(IBLclient!qa;I)Z")
	public boolean method1740(@OriginalArg(0) int arg0, @OriginalArg(2) Class26 arg1, @OriginalArg(3) int arg2) {
		if (this.aClass38_Sub4Array1 != null) {
			for (@Pc(10) int local10 = 0; local10 < this.aClass38_Sub4Array1.length; local10++) {
				if (this.aClass38_Sub4Array1[local10].method1757(arg0, arg2) && this.aClass4_1.method5894(arg2, arg1, arg0)) {
					return true;
				}
			}
		}
		return false;
	}
}
