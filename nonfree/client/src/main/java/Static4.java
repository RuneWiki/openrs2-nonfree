import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static4 {

	@OriginalMember(owner = "client!ab", name = "j", descriptor = "Lclient!dm;")
	public static final Class73 aClass73_3 = new Class73();

	@OriginalMember(owner = "client!ab", name = "n", descriptor = "I")
	public static int anInt69 = -1;

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(II)[B")
	public static byte[] method195(@OriginalArg(1) int arg0) {
		@Pc(17) Class12_Sub4_Sub3 local17 = (Class12_Sub4_Sub3) Static131.aClass14_1.method357((long) arg0);
		if (local17 == null) {
			@Pc(22) byte[] local22 = new byte[512];
			@Pc(28) Random local28 = new Random((long) arg0);
			for (@Pc(30) int local30 = 0; local30 < 255; local30++) {
				local22[local30] = (byte) local30;
			}
			for (@Pc(43) int local43 = 0; local43 < 255; local43++) {
				@Pc(50) int local50 = 255 - local43;
				@Pc(55) int local55 = Static114.method2345(local28, local50);
				@Pc(59) byte local59 = local22[local55];
				local22[local55] = local22[local50];
				local22[local50] = local22[511 - local43] = local59;
			}
			local17 = new Class12_Sub4_Sub3(local22);
			Static131.aClass14_1.method359((long) arg0, local17);
		}
		return local17.aByteArray26;
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(IB)Lclient!rw;")
	public static Class269 method197(@OriginalArg(0) int arg0) {
		@Pc(13) Class269[] local13 = Static463.method6938();
		for (@Pc(15) int local15 = 0; local15 < local13.length; local15++) {
			@Pc(21) Class269 local21 = local13[local15];
			if (local21.anInt8075 == arg0) {
				return local21;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(III)Z")
	public static boolean method199(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static396.method6217(arg0, arg1) & Static17.method391(arg1, arg0);
	}
}
