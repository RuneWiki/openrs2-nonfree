import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!IMUKKQLH")
public final class Class6_Sub1_Sub2_Sub4 extends Class6_Sub1_Sub2 {

	@OriginalMember(owner = "client!IMUKKQLH", name = "o", descriptor = "I")
	public int anInt313;

	@OriginalMember(owner = "client!IMUKKQLH", name = "p", descriptor = "I")
	public int anInt314;

	@OriginalMember(owner = "client!IMUKKQLH", name = "n", descriptor = "Z")
	private boolean aBoolean81 = false;

	@OriginalMember(owner = "client!IMUKKQLH", name = "a", descriptor = "(I)Lclient!NGYJLUVS;")
	@Override
	protected Class6_Sub1_Sub2_Sub5 method382() {
		try {
			@Pc(3) Class4 local3 = Class4.method22(this.anInt314);
			return local3.method27(this.anInt313);
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("85552, " + -12617 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}
}
