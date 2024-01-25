import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static121 {

	@OriginalMember(owner = "client!ed", name = "C", descriptor = "Lclient!nd;")
	public static final Class216 aClass216_4 = new Class216();

	@OriginalMember(owner = "client!ed", name = "F", descriptor = "Lclient!qha;")
	public static final Class277 aClass277_1 = new Class277();

	@OriginalMember(owner = "client!ed", name = "G", descriptor = "[I")
	public static final int[] anIntArray117 = new int[4];

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(JJ)J")
	public static long method2598(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1) {
		return arg0 ^ arg1;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(ILjava/lang/String;Lclient!ji;)I")
	public static int method2599(@OriginalArg(1) String arg0, @OriginalArg(2) Class6_Sub8 arg1) {
		@Pc(6) int local6 = arg1.anInt10061;
		@Pc(10) byte[] local10 = Static1.method5883(arg0);
		arg1.method8254(local10.length);
		arg1.anInt10061 += Static479.aClass229_1.method6043(local10.length, arg1.aByteArray102, 0, arg1.anInt10061, local10);
		return arg1.anInt10061 - local6;
	}
}
