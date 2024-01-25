import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static136 {

	@OriginalMember(owner = "client!io", name = "a", descriptor = "Lclient!fi;")
	public static final Class66 aClass66_46 = new Class66(64);

	@OriginalMember(owner = "client!io", name = "b", descriptor = "Ljava/lang/String;")
	public static String aString177 = "Walk here";

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(IB)Lclient!mh;")
	public static Class128 method2578(@OriginalArg(0) int arg0) {
		@Pc(5) Class66 local5 = Static75.aClass66_29;
		@Pc(14) Class128 local14;
		synchronized (Static75.aClass66_29) {
			local14 = (Class128) Static75.aClass66_29.method1939((long) arg0);
		}
		if (local14 != null) {
			return local14;
		}
		@Pc(34) byte[] local34 = Static345.aClass170_120.method4584(Static258.method4478(arg0), Static240.method4075(arg0));
		local14 = new Class128();
		local14.anInt3747 = arg0;
		if (local34 != null) {
			local14.method3473(new Class5_Sub1(local34));
		}
		@Pc(52) Class66 local52 = Static75.aClass66_29;
		synchronized (Static75.aClass66_29) {
			Static75.aClass66_29.method1936((long) arg0, local14);
			return local14;
		}
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(I)V")
	public static void method2579() {
		@Pc(7) Class117 local7 = null;
		try {
			@Pc(11) Class60 local11 = Static202.aClass10_3.method309();
			while (local11.anInt1838 == 0) {
				Static105.method2138(1L);
			}
			if (local11.anInt1838 == 1) {
				local7 = (Class117) local11.anObject2;
				@Pc(40) byte[] local40 = new byte[(int) local7.method3259()];
				@Pc(54) int local54;
				for (@Pc(42) int local42 = 0; local42 < local40.length; local42 += local54) {
					local54 = local7.method3261(local40, local42, local40.length - local42);
					if (local54 == -1) {
						throw new IOException("EOF");
					}
				}
				Static124.method2415(new Class5_Sub1(local40));
			}
		} catch (@Pc(78) Exception local78) {
		}
		try {
			if (local7 != null) {
				local7.method3260();
			}
		} catch (@Pc(85) Exception local85) {
		}
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(II)I")
	public static int method2580(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return 0;
		}
		@Pc(16) Class5_Sub19 local16 = (Class5_Sub19) Static331.aClass42_54.method1052((long) arg0);
		if (local16 == null) {
			return Static45.method1035(arg0).anInt4737;
		}
		@Pc(25) int local25 = 0;
		for (@Pc(27) int local27 = 0; local27 < local16.anIntArray135.length; local27++) {
			if (local16.anIntArray135[local27] == -1) {
				local25++;
			}
		}
		return local25 + Static45.method1035(arg0).anInt4737 - local16.anIntArray135.length;
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(ILclient!qp;Lclient!qp;)V")
	public static void method2581(@OriginalArg(1) Class5_Sub9 arg0, @OriginalArg(2) Class5_Sub9 arg1) {
		if (arg1.aClass5_Sub9_61 != null) {
			arg1.method5494();
		}
		arg1.aClass5_Sub9_61 = arg0;
		arg1.aClass5_Sub9_60 = arg0.aClass5_Sub9_60;
		arg1.aClass5_Sub9_61.aClass5_Sub9_60 = arg1;
		arg1.aClass5_Sub9_60.aClass5_Sub9_61 = arg1;
	}
}
