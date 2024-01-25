import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static318 {

	@OriginalMember(owner = "client!sm", name = "g", descriptor = "[I")
	public static int[] anIntArray214;

	@OriginalMember(owner = "client!sm", name = "h", descriptor = "I")
	public static int anInt2155;

	@OriginalMember(owner = "client!sm", name = "e", descriptor = "Lclient!vp;")
	public static final Class240 aClass240_43 = new Class240("", 15);

	@OriginalMember(owner = "client!sm", name = "f", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger4 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(Lclient!np;IJ)V")
	public static void method1783(@OriginalArg(0) Class155 arg0, @OriginalArg(2) long arg1) {
		Static255.anInt4594 = Static203.anInt3620;
		Static43.anInt779 = 0;
		Static203.anInt3620 = 0;
		@Pc(16) long local16 = Static288.method4512();
		for (@Pc(23) Class12_Sub4 local23 = (Class12_Sub4) Static156.aClass22_5.method291(); local23 != null; local23 = (Class12_Sub4) Static156.aClass22_5.method292()) {
			if (local23.method1794(arg0, arg1)) {
				Static43.anInt779++;
			}
		}
		if (Static354.aBoolean455 && arg1 % 100L == 0L) {
			System.out.println("Particle system count: " + Static156.aClass22_5.method290() + ", running: " + Static43.anInt779 + ". Particles: " + Static203.anInt3620 + ". Time taken: " + (Static288.method4512() - local16) + "ms");
		}
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(Ljava/lang/String;ZC)I")
	public static int method1784(@OriginalArg(0) String arg0, @OriginalArg(2) char arg1) {
		@Pc(7) int local7 = 0;
		@Pc(10) int local10 = arg0.length();
		for (@Pc(19) int local19 = 0; local19 < local10; local19++) {
			if (arg0.charAt(local19) == arg1) {
				local7++;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(ILclient!bj;)I")
	public static int method1785(@OriginalArg(1) Class28_Sub1_Sub1 arg0) {
		if (arg0.anInt4345 == 0) {
			return 0;
		}
		@Pc(53) int local53;
		@Pc(60) int local60;
		if (arg0.anInt4347 != -1) {
			@Pc(23) Class28_Sub1_Sub1 local23 = null;
			if (arg0.anInt4347 < 32768) {
				local23 = Static166.aClass28_Sub1_Sub1_Sub1Array41[arg0.anInt4347];
			} else if (arg0.anInt4347 >= 32768) {
				local23 = Static308.aClass28_Sub1_Sub1_Sub2Array1[arg0.anInt4347 - 32768];
			}
			if (local23 != null) {
				local53 = arg0.anInt5774 - local23.anInt5774;
				local60 = arg0.anInt5766 - local23.anInt5766;
				if (local53 != 0 || local60 != 0) {
					arg0.method4010((int) (Math.atan2((double) local53, (double) local60) * 2607.5945876176133D) & 0x3FFF);
				}
			}
		}
		if (arg0 instanceof Class28_Sub1_Sub1_Sub2) {
			@Pc(86) Class28_Sub1_Sub1_Sub2 local86 = (Class28_Sub1_Sub1_Sub2) arg0;
			if (local86.anInt4380 != -1 && (local86.anInt4378 == 0 || local86.anInt4376 > 0)) {
				local86.method4010(local86.anInt4380);
				local86.anInt4380 = -1;
			}
		} else if (arg0 instanceof Class28_Sub1_Sub1_Sub1) {
			@Pc(116) Class28_Sub1_Sub1_Sub1 local116 = (Class28_Sub1_Sub1_Sub1) arg0;
			if (local116.anInt3393 != -1 && (local116.anInt4378 == 0 || local116.anInt4376 > 0)) {
				local53 = local116.anInt5774 - (local116.anInt3393 - Static21.anInt265 - Static21.anInt265) * 64;
				local60 = local116.anInt5766 - (local116.anInt3383 - Static103.anInt2044 - Static103.anInt2044) * 64;
				if (local53 != 0 || local60 != 0) {
					local116.method4010((int) (Math.atan2((double) local53, (double) local60) * 2607.5945876176133D) & 0x3FFF);
				}
				local116.anInt3393 = -1;
			}
		}
		return arg0.method4015();
	}
}
