import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static18 {

	@OriginalMember(owner = "client!be", name = "g", descriptor = "Lclient!qe;")
	private static Class78 aClass78_59 = Static199.method3560("glow3:");

	@OriginalMember(owner = "client!be", name = "a", descriptor = "Lclient!qe;")
	public static Class78 aClass78_57 = aClass78_59;

	@OriginalMember(owner = "client!be", name = "e", descriptor = "Lclient!qe;")
	public static Class78 aClass78_58 = aClass78_59;

	@OriginalMember(owner = "client!be", name = "h", descriptor = "[Lclient!uc;")
	public static Class100[] aClass100Array1 = new Class100[100];

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(Lclient!qg;I)V")
	public static void method262(@OriginalArg(0) Class79_Sub1 arg0) {
		for (@Pc(7) int local7 = 0; local7 < Static26.anIntArray81.length; local7++) {
			Static26.anIntArray81[local7] = 0;
		}
		@Pc(32) int local32;
		for (@Pc(23) int local23 = 0; local23 < 5000; local23++) {
			local32 = (int) (Math.random() * 128.0D * (double) 256);
			Static26.anIntArray81[local32] = (int) (Math.random() * 284.0D);
		}
		@Pc(51) int local51;
		@Pc(58) int local58;
		for (local32 = 0; local32 < 20; local32++) {
			for (@Pc(48) int local48 = 1; local48 < 255; local48++) {
				for (local51 = 1; local51 < 127; local51++) {
					local58 = (local48 << 7) + local51;
					Static129.anIntArray480[local58] = (Static26.anIntArray81[local58 - 128] + Static26.anIntArray81[local58 + 1] + Static26.anIntArray81[local58 - 1] + Static26.anIntArray81[local58 + 128]) / 4;
				}
			}
			@Pc(100) int[] local100 = Static26.anIntArray81;
			Static26.anIntArray81 = Static129.anIntArray480;
			Static129.anIntArray480 = local100;
		}
		if (arg0 == null) {
			return;
		}
		local51 = 0;
		for (local58 = 0; local58 < arg0.anInt3901; local58++) {
			for (@Pc(125) int local125 = 0; local125 < arg0.anInt3900; local125++) {
				if (arg0.aByteArray49[local51++] != 0) {
					@Pc(142) int local142 = local125 + arg0.anInt3891 + 16;
					@Pc(150) int local150 = local58 + arg0.anInt3896 + 16;
					@Pc(157) int local157 = local142 + (local150 << 7);
					Static26.anIntArray81[local157] = 0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(II)Lclient!qe;")
	public static Class78 method263(@OriginalArg(1) int arg0) {
		return Static57.aClass78Array6[arg0].method3041() > 0 ? Static94.method1640(new Class78[] { Static32.aClass78Array30[arg0], Static25.aClass78_88, Static57.aClass78Array6[arg0] }) : Static32.aClass78Array30[arg0];
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(ILjava/awt/Component;)V")
	public static void method264(@OriginalArg(1) Component arg0) {
		arg0.addMouseListener(Static11.aClass76_1);
		arg0.addMouseMotionListener(Static11.aClass76_1);
		arg0.addFocusListener(Static11.aClass76_1);
	}
}
