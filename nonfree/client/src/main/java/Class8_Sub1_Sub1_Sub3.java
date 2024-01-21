import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!GXJXRNJQ")
public final class Class8_Sub1_Sub1_Sub3 extends Class8_Sub1_Sub1 {

	@OriginalMember(owner = "client!GXJXRNJQ", name = "m", descriptor = "I")
	public int anInt201;

	@OriginalMember(owner = "client!GXJXRNJQ", name = "o", descriptor = "I")
	public int anInt202;

	@OriginalMember(owner = "client!GXJXRNJQ", name = "n", descriptor = "Z")
	private boolean aBoolean46 = false;

	@OriginalMember(owner = "client!GXJXRNJQ", name = "a", descriptor = "(B)Lclient!JJMVUSJJ;")
	@Override
	protected Class8_Sub1_Sub1_Sub5 method533(@OriginalArg(0) byte arg0) {
		try {
			@Pc(3) Class19 local3 = Class19.method191(this.anInt201);
			@Pc(8) boolean local8 = false;
			return local3.method197(this.anInt202);
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("84388, " + arg0 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}
}
