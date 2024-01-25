import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static19 {

	@OriginalMember(owner = "client!as", name = "d", descriptor = "Lclient!hh;")
	public static Class109 aClass109_4;

	@OriginalMember(owner = "client!as", name = "a", descriptor = "Lclient!gf;")
	public static final Class96 aClass96_3 = new Class96("Face here", "Hierhin drehen", "Regarder dans cette direction", "Virar para cá");

	@OriginalMember(owner = "client!as", name = "e", descriptor = "I")
	public static int anInt296 = 16777215;

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(BILjava/util/Random;)I")
	public static int method243(@OriginalArg(1) int arg0, @OriginalArg(2) Random arg1) {
		if (arg0 <= 0) {
			throw new IllegalArgumentException();
		} else if (Static362.method5163(arg0)) {
			return (int) (((long) arg1.nextInt() & 0xFFFFFFFFL) * (long) arg0 >> 32);
		} else {
			@Pc(40) int local40 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg0);
			@Pc(43) int local43;
			do {
				local43 = arg1.nextInt();
			} while (local40 <= local43);
			return Static116.method1809(local43, arg0);
		}
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(Lclient!ak;B)I")
	public static int method244(@OriginalArg(0) Class1_Sub3 arg0) {
		@Pc(12) String local12 = Static329.method4757(arg0);
		@Pc(14) int[] local14 = null;
		if (Static192.method3012(arg0.anInt227)) {
			local14 = Static388.aClass193_3.method4249((int) arg0.aLong15).anIntArray457;
		} else if (arg0.anInt224 != -1) {
			local14 = Static388.aClass193_3.method4249(arg0.anInt224).anIntArray457;
		} else if (Static430.method5801(arg0.anInt227)) {
			@Pc(88) Class47_Sub1_Sub5_Sub1 local88 = Static307.aClass47_Sub1_Sub5_Sub1Array1[(int) arg0.aLong15];
			if (local88 != null) {
				@Pc(93) Class196 local93 = local88.aClass196_1;
				if (local93.anIntArray419 != null) {
					local93 = local93.method4412(Static237.aClass80_1);
				}
				if (local93 != null) {
					local14 = local93.anIntArray420;
				}
			}
		} else if (Static112.method1762(arg0.anInt227)) {
			@Pc(56) Class29 local56;
			if (arg0.anInt227 == 1001) {
				local56 = Static251.aClass207_2.method4977((int) arg0.aLong15);
			} else {
				local56 = Static251.aClass207_2.method4977((int) (arg0.aLong15 >>> 32 & 0x7FFFFFFFL));
			}
			if (local56.anIntArray36 != null) {
				local56 = local56.method475(Static237.aClass80_1);
			}
			if (local56 != null) {
				local14 = local56.anIntArray34;
			}
		}
		if (local14 != null) {
			local12 = local12 + Static301.method4107(local14);
		}
		@Pc(134) int local134 = Static126.aClass62_6.method1152(Static13.aClass78Array1, local12);
		if (arg0.aBoolean16) {
			local134 += Static55.aClass78_6.UA() + 4;
		}
		return local134;
	}
}
