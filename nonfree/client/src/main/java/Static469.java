import java.awt.Font;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static469 {

	@OriginalMember(owner = "client!qm", name = "c", descriptor = "Lclient!wu;")
	public static Class380 aClass380_10;

	@OriginalMember(owner = "client!qm", name = "d", descriptor = "Lclient!oq;")
	public static Class256 aClass256_2;

	@OriginalMember(owner = "client!qm", name = "f", descriptor = "Lclient!uha;")
	public static Class177 aClass177_2;

	@OriginalMember(owner = "client!qm", name = "g", descriptor = "Ljava/awt/Font;")
	public static Font aFont2;

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "Lclient!qk;")
	public static final Class288 aClass288_22 = new Class288(39, 6);

	@OriginalMember(owner = "client!qm", name = "e", descriptor = "Lclient!maa;")
	public static final Class215 aClass215_2 = new Class215();

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(B)V")
	public static void method464() {
		@Pc(7) int local7 = Static580.anInt9430;
		@Pc(9) int[] local9 = Static6.anIntArray9;
		for (@Pc(16) int local16 = 0; local16 < local7; local16++) {
			@Pc(24) Class13_Sub1_Sub1_Sub1_Sub2 local24 = Static628.aClass13_Sub1_Sub1_Sub1_Sub2Array1[local9[local16]];
			if (local24 != null && local24.anInt4576 > 0) {
				local24.anInt4576--;
				if (local24.anInt4576 == 0) {
					local24.aString48 = null;
				}
			}
		}
		for (@Pc(50) int local50 = 0; local50 < Static639.anInt10306; local50++) {
			@Pc(57) long local57 = (long) Static147.anIntArray182[local50];
			@Pc(63) Class2_Sub43 local63 = (Class2_Sub43) Static440.aClass118_41.method2595(local57);
			if (local63 != null) {
				@Pc(68) Class13_Sub1_Sub1_Sub1_Sub1 local68 = local63.aClass13_Sub1_Sub1_Sub1_Sub1_2;
				if (local68.anInt4576 > 0) {
					local68.anInt4576--;
					if (local68.anInt4576 == 0) {
						local68.aString48 = null;
					}
				}
			}
		}
	}
}
