import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static448 {

	@OriginalMember(owner = "client!pea", name = "m", descriptor = "Lclient!eh;")
	public static Class56 aClass56_10;

	@OriginalMember(owner = "client!pea", name = "k", descriptor = "[F")
	public static final float[] aFloatArray63 = new float[4];

	@OriginalMember(owner = "client!pea", name = "f", descriptor = "(I)I")
	public static int method6653() {
		@Pc(5) boolean local5 = false;
		@Pc(7) boolean local7 = false;
		@Pc(9) boolean local9 = false;
		if (Static150.aClass202_2.aBoolean384 && !Static150.aClass202_2.aBoolean386) {
			local5 = true;
			if (Static87.aClass5_Sub30_1.anInt4369 < 512 && Static87.aClass5_Sub30_1.anInt4369 != 0) {
				local5 = false;
			}
			if (Static308.aString53.startsWith("win")) {
				local9 = true;
				local7 = true;
			} else {
				local7 = true;
			}
		}
		if (Static8.aBoolean2) {
			local7 = false;
		}
		if (Static661.aBoolean760) {
			local5 = false;
		}
		if (Static288.aBoolean300) {
			local9 = false;
		}
		if (!local5 && !local7 && !local9) {
			return Static207.method2880();
		}
		@Pc(63) int local63 = -1;
		@Pc(65) int local65 = -1;
		if (local5) {
			try {
				local63 = Static595.method8078(2, 1000);
			} catch (@Pc(74) Exception local74) {
			}
		}
		@Pc(85) int local85 = -1;
		if (local9) {
			try {
				local85 = Static595.method8078(3, 1000);
				if (Static655.aClass5_Sub36_29.aClass2_Sub23_1.method7836() == 3) {
					@Pc(103) Class300 local103 = Static563.aClass143_13.method6248();
					@Pc(108) long local108 = local103.aLong262 & 0xFFFFFFFFFFFFL;
					@Pc(111) int local111 = local103.anInt8494;
					if (local111 == 4318) {
						local7 &= local108 >= 64425238954L;
					} else if (local111 == 4098) {
						local7 &= local108 >= 60129613779L;
					}
				}
			} catch (@Pc(145) Exception local145) {
			}
		}
		if (local7) {
			try {
				local65 = Static595.method8078(1, 1000);
			} catch (@Pc(155) Exception local155) {
			}
		}
		if (local63 == -1 && local65 == -1 && local85 == -1) {
			return Static207.method2880();
		}
		local85 = (int) ((float) local85 * 1.1F);
		local65 = (int) ((float) local65 * 1.1F);
		if (local85 < local63 && local65 < local63) {
			return Static357.method5272(local63);
		} else if (local65 < local85) {
			return Static206.method2868(local85, 3);
		} else {
			return Static206.method2868(local65, 1);
		}
	}
}
