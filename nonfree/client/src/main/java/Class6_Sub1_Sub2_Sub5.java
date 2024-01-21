import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!VUGJZKVT")
public final class Class6_Sub1_Sub2_Sub5 extends Class6_Sub1_Sub2 {

	@OriginalMember(owner = "client!VUGJZKVT", name = "n", descriptor = "I")
	public int anInt704;

	@OriginalMember(owner = "client!VUGJZKVT", name = "p", descriptor = "I")
	public int anInt705;

	@OriginalMember(owner = "client!VUGJZKVT", name = "m", descriptor = "B")
	private byte aByte47 = 2;

	@OriginalMember(owner = "client!VUGJZKVT", name = "o", descriptor = "Z")
	private boolean aBoolean170 = false;

	@OriginalMember(owner = "client!VUGJZKVT", name = "a", descriptor = "(B)Lclient!FLXAIVEA;")
	@Override
	protected Class6_Sub1_Sub2_Sub2 method522(@OriginalArg(0) byte arg0) {
		try {
			if (2 == this.aByte47) {
				@Pc(5) boolean local5 = false;
			} else {
				this.aBoolean170 = !this.aBoolean170;
			}
			@Pc(19) Class35 local19 = Class35.method370(this.anInt704);
			return local19.method372(this.anInt705);
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("86056, " + arg0 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}
}
