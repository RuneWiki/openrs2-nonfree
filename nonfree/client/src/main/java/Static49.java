import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static49 {

	@OriginalMember(owner = "client!bp", name = "k", descriptor = "I")
	public static int anInt8547;

	@OriginalMember(owner = "client!bp", name = "j", descriptor = "Z")
	public static boolean aBoolean648 = true;

	@OriginalMember(owner = "client!bp", name = "l", descriptor = "Lclient!qk;")
	public static final Class288 aClass288_286 = new Class288(99, 6);

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(JJ)J")
	public static long method7190(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1) {
		return arg0 ^ arg1;
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "([IB[I)V")
	public static void method7191(@OriginalArg(0) int[] arg0, @OriginalArg(2) int[] arg1) {
		if (arg0 == null || arg1 == null) {
			Static158.aByteArrayArrayArray5 = null;
			Static244.anIntArray670 = null;
			Static570.anIntArray636 = null;
			return;
		}
		Static570.anIntArray636 = arg0;
		Static244.anIntArray670 = new int[arg0.length];
		Static158.aByteArrayArrayArray5 = new byte[arg0.length][][];
		for (@Pc(33) int local33 = 0; local33 < Static570.anIntArray636.length; local33++) {
			Static158.aByteArrayArrayArray5[local33] = new byte[arg1[local33]][];
		}
	}
}
