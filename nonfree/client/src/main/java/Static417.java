import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static417 {

	@OriginalMember(owner = "client!od", name = "c", descriptor = "[I")
	public static final int[] anIntArray787 = new int[] { 0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4 };

	@OriginalMember(owner = "client!od", name = "f", descriptor = "[I")
	public static final int[] anIntArray788 = new int[5];

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(I[I[I)V")
	public static void method8850(@OriginalArg(1) int[] arg0, @OriginalArg(2) int[] arg1) {
		if (arg1 == null || arg0 == null) {
			Static161.aByteArrayArrayArray7 = null;
			Static42.anIntArray82 = null;
			Static79.anIntArray129 = null;
			return;
		}
		Static79.anIntArray129 = arg1;
		Static42.anIntArray82 = new int[arg1.length];
		Static161.aByteArrayArrayArray7 = new byte[arg1.length][][];
		for (@Pc(28) int local28 = 0; local28 < Static79.anIntArray129.length; local28++) {
			Static161.aByteArrayArrayArray7[local28] = new byte[arg0[local28]][];
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IC)C")
	public static char method8852(@OriginalArg(1) char arg0) {
		if (arg0 == 'Æ') {
			return 'E';
		} else if (arg0 == 'æ') {
			return 'e';
		} else if (arg0 == 'ß') {
			return 's';
		} else if (arg0 == 'Œ') {
			return 'E';
		} else {
			return (char) (arg0 == 'œ' ? 'e' : '\u0000');
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IIILclient!wia;)Lclient!sha;")
	public static Class14_Sub3_Sub16 method8853(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class386 arg2) {
		@Pc(19) Class14_Sub29 local19 = new Class14_Sub29(arg2.method9196(arg0, arg1));
		@Pc(50) Class14_Sub3_Sub16 local50 = new Class14_Sub3_Sub16(arg0, local19.method5898(), local19.method5898(), local19.method5878(), local19.method5878(), local19.method5866() == 1, local19.method5866(), local19.method5866());
		@Pc(54) int local54 = local19.method5866();
		for (@Pc(56) int local56 = 0; local56 < local54; local56++) {
			local50.aClass262_63.method6314(new Class14_Sub35(local19.method5866(), local19.method5900(), local19.method5900(), local19.method5900(), local19.method5900(), local19.method5900(), local19.method5900(), local19.method5900(), local19.method5900()));
		}
		local50.method7675();
		return local50;
	}
}
