import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ZCNDKOXC")
public final class Class2_Sub1_Sub2_Sub6 extends Class2_Sub1_Sub2 {

	@OriginalMember(owner = "client!ZCNDKOXC", name = "l", descriptor = "I")
	public int anInt762;

	@OriginalMember(owner = "client!ZCNDKOXC", name = "m", descriptor = "I")
	public int anInt763;

	@OriginalMember(owner = "client!ZCNDKOXC", name = "a", descriptor = "(B)Lclient!SNMMQNPZ;")
	@Override
	protected Class2_Sub1_Sub2_Sub5 method561(@OriginalArg(0) byte arg0) {
		try {
			@Pc(3) Class19 local3 = Class19.method221(this.anInt762);
			return local3.method217(this.anInt763);
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("53957, " + 5 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}
}
