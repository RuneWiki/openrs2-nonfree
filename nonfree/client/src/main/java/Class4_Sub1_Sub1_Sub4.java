import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!JGSTQLRC")
public final class Class4_Sub1_Sub1_Sub4 extends Class4_Sub1_Sub1 {

	@OriginalMember(owner = "client!JGSTQLRC", name = "m", descriptor = "I")
	public int anInt390;

	@OriginalMember(owner = "client!JGSTQLRC", name = "n", descriptor = "I")
	public int anInt391;

	@OriginalMember(owner = "client!JGSTQLRC", name = "l", descriptor = "Z")
	private boolean aBoolean125 = true;

	@OriginalMember(owner = "client!JGSTQLRC", name = "a", descriptor = "(I)Lclient!IGXVZOHI;")
	@Override
	protected Class4_Sub1_Sub1_Sub3 method531() {
		try {
			@Pc(14) Class44 local14 = Class44.method536(this.anInt391);
			return local14.method533(this.anInt390);
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("74479, " + 47492 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}
}
