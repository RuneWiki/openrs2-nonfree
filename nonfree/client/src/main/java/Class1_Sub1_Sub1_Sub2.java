import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!GEPRJOHJ")
public final class Class1_Sub1_Sub1_Sub2 extends Class1_Sub1_Sub1 {

	@OriginalMember(owner = "client!GEPRJOHJ", name = "m", descriptor = "I")
	public int anInt310;

	@OriginalMember(owner = "client!GEPRJOHJ", name = "n", descriptor = "I")
	public int anInt311;

	@OriginalMember(owner = "client!GEPRJOHJ", name = "l", descriptor = "I")
	private int anInt309 = 3;

	@OriginalMember(owner = "client!GEPRJOHJ", name = "a", descriptor = "(B)Lclient!PDVZPZLT;")
	@Override
	protected Class1_Sub1_Sub1_Sub4 method497(@OriginalArg(0) byte arg0) {
		try {
			@Pc(4) boolean local4 = false;
			@Pc(13) Class3 local13 = Class3.method34(this.anInt311);
			return local13.method37(this.anInt310);
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("7284, " + arg0 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}
}
