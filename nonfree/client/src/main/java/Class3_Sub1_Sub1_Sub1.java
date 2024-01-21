import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!GUTBTNML")
public final class Class3_Sub1_Sub1_Sub1 extends Class3_Sub1_Sub1 {

	@OriginalMember(owner = "client!GUTBTNML", name = "k", descriptor = "I")
	public int anInt205;

	@OriginalMember(owner = "client!GUTBTNML", name = "l", descriptor = "I")
	public int anInt206;

	@OriginalMember(owner = "client!GUTBTNML", name = "a", descriptor = "(B)Lclient!UNLYQRUD;")
	@Override
	protected Class3_Sub1_Sub1_Sub5 method505() {
		try {
			@Pc(3) Class10 local3 = Class10.method118(this.anInt206);
			return local3.method122(this.anInt205);
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("63603, " + 93 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}
}
