import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static127 {

	@OriginalMember(owner = "client!el", name = "s", descriptor = "I")
	public static int anInt2955;

	@OriginalMember(owner = "client!el", name = "c", descriptor = "Lclient!qaa;")
	public static final Class269 aClass269_31 = new Class269(11, 8);

	@OriginalMember(owner = "client!el", name = "f", descriptor = "I")
	public static int anInt2942 = -1;

	@OriginalMember(owner = "client!el", name = "o", descriptor = "I")
	public static int anInt2951 = 0;

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(B)V")
	public static void method2521() {
		@Pc(8) Class2_Sub32 local8 = (Class2_Sub32) Static72.aClass238_9.method5833();
		@Pc(19) boolean local19 = Static112.aClass78_4 != null || Static100.anInt2017 > 0;
		@Pc(23) int local23 = local8.method8558();
		@Pc(35) int local35 = local8.method8563();
		if (local19) {
			Static228.anInt4643 = 1;
		}
		if (local19) {
			Static401.aClass2_Sub5_Sub20_19 = Static220.aClass2_Sub5_Sub20_17;
		} else {
			Static92.method1620(local23, Static220.aClass2_Sub5_Sub20_17, local35);
		}
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "([BFFFIILclient!se;IIFFZI)V")
	public static void method2523(@OriginalArg(0) byte[] arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(6) Class256 arg4, @OriginalArg(8) int arg5, @OriginalArg(9) float arg6, @OriginalArg(10) float arg7) {
		for (@Pc(1) int local1 = 0; local1 < 16; local1++) {
			Static164.method3050(local1, arg1, arg3, arg7, arg4, arg6, arg2, arg5, arg0);
			arg5 += 16384;
		}
	}
}
