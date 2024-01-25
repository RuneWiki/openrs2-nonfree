import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static13 {

	@OriginalMember(owner = "client!aq", name = "l", descriptor = "Lclient!af;")
	public static Class5 aClass5_1;

	@OriginalMember(owner = "client!aq", name = "b", descriptor = "Lclient!rc;")
	public static final Class205 aClass205_4 = new Class205(104, -2);

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(ILclient!ep;)V")
	public static void method259(@OriginalArg(1) Class10_Sub3 arg0) {
		arg0.aClass1_1 = null;
		@Pc(12) int local12 = arg0.aClass10_Sub7Array1.length;
		for (@Pc(19) int local19 = 0; local19 < local12; local19++) {
			arg0.aClass10_Sub7Array1[local19].aBoolean381 = false;
		}
		@Pc(33) Class154[] local33 = Class59.aClass154Array1;
		synchronized (Class59.aClass154Array1) {
			if (local12 < Class59.aClass154Array1.length && Static207.anIntArray970[local12] < 200) {
				Class59.aClass154Array1[local12].method3481(arg0);
				@Pc(58) int local58 = Static207.anIntArray970[local12]++;
			}
		}
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "([BI)[B")
	public static byte[] method261(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(11) byte[] local11 = new byte[arg0.length];
			Static399.method2487(arg0, 0, local11, 0, arg0.length);
			return local11;
		}
	}
}
