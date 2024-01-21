import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!FIMDEAMY")
public final class Class8_Sub1_Sub1_Sub2 extends Class8_Sub1_Sub1 {

	@OriginalMember(owner = "client!FIMDEAMY", name = "k", descriptor = "I")
	public int anInt182;

	@OriginalMember(owner = "client!FIMDEAMY", name = "l", descriptor = "I")
	public int anInt183;

	@OriginalMember(owner = "client!FIMDEAMY", name = "m", descriptor = "Z")
	private boolean aBoolean42 = false;

	@OriginalMember(owner = "client!FIMDEAMY", name = "a", descriptor = "(I)Lclient!KDWDYCIL;")
	@Override
	protected Class8_Sub1_Sub1_Sub3 method472() {
		try {
			@Pc(3) Class46 local3 = Class46.method532(this.anInt183);
			return local3.method529(this.anInt182);
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("60552, " + 9 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}
}
