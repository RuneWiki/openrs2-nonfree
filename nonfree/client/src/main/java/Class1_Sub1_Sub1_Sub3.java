import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!db")
public final class Class1_Sub1_Sub1_Sub3 extends Class1_Sub1_Sub1 {

	@OriginalMember(owner = "client!db", name = "n", descriptor = "I")
	public int anInt488;

	@OriginalMember(owner = "client!db", name = "o", descriptor = "I")
	public int anInt489;

	@OriginalMember(owner = "client!db", name = "m", descriptor = "Z")
	private boolean aBoolean107 = true;

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(I)Lclient!fb;")
	@Override
	protected Class1_Sub1_Sub1_Sub5 method316() {
		try {
			@Pc(14) Class15 local14 = Class15.method345(this.anInt488);
			return local14.method349(this.anInt489);
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("63381, " + -28205 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}
}
