import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!WEHUNTCT")
public final class Class1_Sub1_Sub1_Sub6 extends Class1_Sub1_Sub1 {

	@OriginalMember(owner = "client!WEHUNTCT", name = "k", descriptor = "I")
	public int anInt725;

	@OriginalMember(owner = "client!WEHUNTCT", name = "m", descriptor = "I")
	public int anInt727;

	@OriginalMember(owner = "client!WEHUNTCT", name = "l", descriptor = "I")
	private int anInt726 = -12;

	@OriginalMember(owner = "client!WEHUNTCT", name = "a", descriptor = "(Z)Lclient!IYSWJGDE;")
	@Override
	protected Class1_Sub1_Sub1_Sub3 method513() {
		try {
			@Pc(3) Class39 local3 = Class39.method488(this.anInt725);
			return local3.method494(this.anInt727);
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("55987, " + true + ", " + local14.toString());
			throw new RuntimeException();
		}
	}
}
