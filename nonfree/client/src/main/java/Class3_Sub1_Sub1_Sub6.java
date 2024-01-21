import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!YLPPYQUD")
public final class Class3_Sub1_Sub1_Sub6 extends Class3_Sub1_Sub1 {

	@OriginalMember(owner = "client!YLPPYQUD", name = "n", descriptor = "I")
	public int anInt800;

	@OriginalMember(owner = "client!YLPPYQUD", name = "o", descriptor = "I")
	public int anInt801;

	@OriginalMember(owner = "client!YLPPYQUD", name = "p", descriptor = "I")
	private int anInt802;

	@OriginalMember(owner = "client!YLPPYQUD", name = "a", descriptor = "(I)Lclient!CADBNSXE;")
	@Override
	protected Class3_Sub1_Sub1_Sub1 method562(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) Class25 local3 = Class25.method347(this.anInt801);
			while (arg0 >= 0) {
				this.anInt802 = 492;
			}
			return local3.method342(this.anInt800);
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("28905, " + arg0 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}
}
