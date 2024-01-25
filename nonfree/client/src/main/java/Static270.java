import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static270 {

	@OriginalMember(owner = "client!kca", name = "f", descriptor = "[I")
	public static int[] anIntArray316;

	@OriginalMember(owner = "client!kca", name = "n", descriptor = "Lclient!mv;")
	public static Class229 aClass229_64;

	@OriginalMember(owner = "client!kca", name = "q", descriptor = "I")
	public static int anInt4402;

	@OriginalMember(owner = "client!kca", name = "k", descriptor = "[I")
	public static final int[] anIntArray317 = new int[] { 36064, 36065, 36066, 36067, 36068, 36069, 36070, 36071, 36096 };

	@OriginalMember(owner = "client!kca", name = "a", descriptor = "(ZLclient!mea;II)Lclient!lc;")
	public static Class2_Sub2_Sub11 method3739(@OriginalArg(1) Class222 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(10) int local10 = arg1 << 10 | arg0.anInt5459;
		@Pc(19) Class2_Sub2_Sub11 local19 = (Class2_Sub2_Sub11) Static159.aClass236_2.method5075((long) local10 << 16);
		if (local19 != null) {
			return local19;
		}
		@Pc(31) byte[] local31 = Static399.aClass229_93.method4966(Static399.aClass229_93.method4964(local10));
		if (local31 == null) {
			local10 = arg0.anInt5459 | arg2 + 65536 << 10;
			local19 = (Class2_Sub2_Sub11) Static159.aClass236_2.method5075((long) local10 << 16);
			if (local19 != null) {
				return local19;
			}
			local31 = Static399.aClass229_93.method4966(Static399.aClass229_93.method4964(local10));
			if (local31 == null) {
				local10 = arg0.anInt5459 | 0x3FFFC00;
				local19 = (Class2_Sub2_Sub11) Static159.aClass236_2.method5075((long) local10 << 16);
				if (local19 != null) {
					return local19;
				}
				local31 = Static399.aClass229_93.method4966(Static399.aClass229_93.method4964(local10));
				if (local31 == null) {
					return null;
				} else if (local31.length <= 1) {
					return null;
				} else {
					try {
						local19 = Static4.method52(local31);
					} catch (@Pc(194) Exception local194) {
						throw new RuntimeException(local194.getMessage() + " S: " + local10);
					}
					local19.aClass222_8 = arg0;
					Static159.aClass236_2.method5071(local19, (long) local10 << 16);
					return local19;
				}
			} else if (local31.length <= 1) {
				return null;
			} else {
				try {
					local19 = Static4.method52(local31);
				} catch (@Pc(119) Exception local119) {
					throw new RuntimeException(local119.getMessage() + " S: " + local10);
				}
				local19.aClass222_8 = arg0;
				Static159.aClass236_2.method5071(local19, (long) local10 << 16);
				return local19;
			}
		} else if (local31.length <= 1) {
			return null;
		} else {
			try {
				local19 = Static4.method52(local31);
			} catch (@Pc(45) Exception local45) {
				throw new RuntimeException(local45.getMessage() + " S: " + local10);
			}
			local19.aClass222_8 = arg0;
			Static159.aClass236_2.method5071(local19, (long) local10 << 16);
			return local19;
		}
	}

	@OriginalMember(owner = "client!kca", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;I)V")
	public static void method3744(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		Static124.anInt9459 = arg2;
		Static377.anInt6297 = 2;
		Static24.method350(false, arg0, arg1);
	}
}
