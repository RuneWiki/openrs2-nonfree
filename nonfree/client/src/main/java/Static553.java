import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static553 {

	@OriginalMember(owner = "client!si", name = "f", descriptor = "I")
	public static int anInt8951;

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(IIII)I")
	public static int method7312(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 > 243) {
			arg2 >>= 0x4;
		} else if (arg1 > 217) {
			arg2 >>= 0x3;
		} else if (arg1 > 192) {
			arg2 >>= 0x2;
		} else if (arg1 > 179) {
			arg2 >>= 0x1;
		}
		return (arg2 >> 5 << 7) + ((arg0 >> 2 & 0x3F) << 10) + (arg1 >> 1);
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(Lclient!cm;B)I")
	public static int method7313(@OriginalArg(0) Class34_Sub1_Sub1_Sub2_Sub1 arg0) {
		@Pc(16) int local16 = arg0.anInt1818;
		@Pc(20) Class286 local20 = arg0.method7878();
		if (arg0.anInt9647 == -1 || arg0.aBoolean673) {
			local16 = arg0.anInt1819;
		} else if (arg0.anInt9647 == local20.anInt7545 || local20.anInt7513 == arg0.anInt9647 || arg0.anInt9647 == local20.anInt7525 || local20.anInt7517 == arg0.anInt9647) {
			local16 = arg0.anInt1806;
		} else if (arg0.anInt9647 == local20.anInt7510 || local20.anInt7507 == arg0.anInt9647 || local20.anInt7535 == arg0.anInt9647 || local20.anInt7526 == arg0.anInt9647) {
			local16 = arg0.anInt1792;
		}
		return local16;
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(Ljava/lang/Object;IZ)[B")
	public static byte[] method7314(@OriginalArg(0) Object arg0, @OriginalArg(2) boolean arg1) {
		if (arg0 == null) {
			return null;
		} else if (arg0 instanceof byte[]) {
			@Pc(18) byte[] local18 = (byte[]) arg0;
			return arg1 ? Static610.method8276(local18) : local18;
		} else if (arg0 instanceof Class13) {
			@Pc(32) Class13 local32 = (Class13) arg0;
			return local32.method400();
		} else {
			throw new IllegalArgumentException();
		}
	}
}
