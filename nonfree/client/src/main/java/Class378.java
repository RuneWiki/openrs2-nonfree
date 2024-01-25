import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wn")
public final class Class378 {

	@OriginalMember(owner = "client!wn", name = "t", descriptor = "[Lclient!nd;")
	private static final Class218[] aClass218Array1 = new Class218[32];

	@OriginalMember(owner = "client!wn", name = "c", descriptor = "[B")
	public byte[] aByteArray125;

	@OriginalMember(owner = "client!wn", name = "e", descriptor = "[S")
	public short[] aShortArray150;

	@OriginalMember(owner = "client!wn", name = "g", descriptor = "[S")
	public short[] aShortArray151;

	@OriginalMember(owner = "client!wn", name = "j", descriptor = "[S")
	public short[] aShortArray152;

	static {
		@Pc(77) Class218[] local77 = Static173.method3195();
		for (@Pc(79) int local79 = 0; local79 < local77.length; local79++) {
			aClass218Array1[local77[local79].anInt6779] = local77[local79];
		}
	}
}
