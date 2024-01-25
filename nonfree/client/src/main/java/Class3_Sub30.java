import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uk")
public abstract class Class3_Sub30 extends Class3 {

	@OriginalMember(owner = "client!uk", name = "z", descriptor = "[Lclient!o;")
	private static final Class240[] aClass240Array3 = new Class240[32];

	static {
		@Pc(89) Class240[] local89 = Static270.method4922();
		for (@Pc(91) int local91 = 0; local91 < local89.length; local91++) {
			aClass240Array3[local89[local91].anInt7401] = local89[local91];
		}
	}

	@OriginalMember(owner = "client!uk", name = "b", descriptor = "(I)I")
	public abstract int method6362();

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(B)I")
	public abstract int method6363();

	@OriginalMember(owner = "client!uk", name = "e", descriptor = "(I)J")
	public abstract long method6365();

	@OriginalMember(owner = "client!uk", name = "f", descriptor = "(I)I")
	public abstract int method6366();

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(Z)I")
	public abstract int method6367();
}
