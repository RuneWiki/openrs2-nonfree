import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static518 {

	@OriginalMember(owner = "client!tt", name = "i", descriptor = "I")
	public static int anInt8571;

	@OriginalMember(owner = "client!tt", name = "e", descriptor = "Lclient!eba;")
	public static final Class81 aClass81_203 = new Class81(17, 6);

	@OriginalMember(owner = "client!tt", name = "f", descriptor = "Lclient!eba;")
	public static final Class81 aClass81_204 = new Class81(34, 6);

	@OriginalMember(owner = "client!tt", name = "g", descriptor = "Lclient!wo;")
	public static final Class361 aClass361_93 = new Class361();

	@OriginalMember(owner = "client!tt", name = "h", descriptor = "I")
	public static int anInt8570 = 0;

	@OriginalMember(owner = "client!tt", name = "j", descriptor = "I")
	public static final int anInt8572 = 1407;

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(BLclient!he;)I")
	public static int method7098(@OriginalArg(1) Class20_Sub2_Sub4_Sub1 arg0) {
		if (arg0.anInt6410 == 0) {
			return 0;
		}
		@Pc(60) int local60;
		@Pc(53) int local53;
		if (arg0.anInt6436 != -1) {
			@Pc(15) Class20_Sub2_Sub4_Sub1 local15 = null;
			if (arg0.anInt6436 < 32768) {
				@Pc(39) Class1_Sub39 local39 = (Class1_Sub39) Static131.aClass356_32.method7796((long) arg0.anInt6436);
				if (local39 != null) {
					local15 = local39.aClass20_Sub2_Sub4_Sub1_Sub2_2;
				}
			} else if (arg0.anInt6436 >= 32768) {
				local15 = Static230.aClass20_Sub2_Sub4_Sub1_Sub1Array6[arg0.anInt6436 - 32768];
			}
			if (local15 != null) {
				local53 = arg0.anInt8796 - local15.anInt8796;
				local60 = arg0.anInt8795 - local15.anInt8795;
				if (local53 != 0 || local60 != 0) {
					arg0.method5341((int) (Math.atan2((double) local53, (double) local60) * 2607.5945876176133D) & 0x3FFF);
				}
			}
		}
		if (arg0 instanceof Class20_Sub2_Sub4_Sub1_Sub1) {
			@Pc(157) Class20_Sub2_Sub4_Sub1_Sub1 local157 = (Class20_Sub2_Sub4_Sub1_Sub1) arg0;
			if (local157.anInt4932 != -1 && (local157.anInt6469 == 0 || local157.anInt6467 > 0)) {
				local157.method5341(local157.anInt4932);
				local157.anInt4932 = -1;
			}
		} else if (arg0 instanceof Class20_Sub2_Sub4_Sub1_Sub2) {
			@Pc(89) Class20_Sub2_Sub4_Sub1_Sub2 local89 = (Class20_Sub2_Sub4_Sub1_Sub2) arg0;
			if (local89.anInt6473 != -1 && (local89.anInt6469 == 0 || local89.anInt6467 > 0)) {
				local53 = local89.anInt8796 - (local89.anInt6473 - Static376.anInt6631 - Static376.anInt6631) * 256;
				local60 = local89.anInt8795 - (local89.anInt6491 - Static24.anInt674 - Static24.anInt674) * 256;
				if (local53 != 0 || local60 != 0) {
					local89.method5341((int) (Math.atan2((double) local53, (double) local60) * 2607.5945876176133D) & 0x3FFF);
				}
				local89.anInt6473 = -1;
			}
		}
		return arg0.method5354();
	}
}
