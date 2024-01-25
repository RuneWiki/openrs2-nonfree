import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bh")
public final class Class34 {

	@OriginalMember(owner = "client!bh", name = "g", descriptor = "[Lclient!hf;")
	public static final Class136[] aClass136Array1 = new Class136[5];

	@OriginalMember(owner = "client!bh", name = "b", descriptor = "I")
	public int anInt540;

	@OriginalMember(owner = "client!bh", name = "c", descriptor = "I")
	public int anInt541;

	@OriginalMember(owner = "client!bh", name = "d", descriptor = "I")
	public int anInt542;

	@OriginalMember(owner = "client!bh", name = "e", descriptor = "I")
	public int anInt543;

	static {
		for (@Pc(8) int local8 = 0; local8 < aClass136Array1.length; local8++) {
			aClass136Array1[local8] = new Class136();
		}
	}
}
