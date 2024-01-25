import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static338 {

	@OriginalMember(owner = "client!nv", name = "w", descriptor = "F")
	public static float aFloat196;

	@OriginalMember(owner = "client!nv", name = "s", descriptor = "I")
	public static int anInt6411 = -1;

	@OriginalMember(owner = "client!nv", name = "t", descriptor = "Lclient!kca;")
	public static final Class158 aClass158_83 = new Class158(21, 2);

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(Lclient!fj;III)Lclient!ka;")
	public static Class3_Sub10_Sub10 method5404(@OriginalArg(0) Class91 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(10) int local10 = arg2 << 8 | arg0.anInt2796;
		@Pc(19) Class3_Sub10_Sub10 local19 = (Class3_Sub10_Sub10) Static152.aClass168_1.method4551((long) local10 << 16);
		if (local19 != null) {
			return local19;
		}
		@Pc(31) byte[] local31 = Static310.aClass161_61.method4265(Static310.aClass161_61.method4236(local10));
		if (local31 == null) {
			local10 = arg0.anInt2796 | arg1 + 65536 << 8;
			local19 = (Class3_Sub10_Sub10) Static152.aClass168_1.method4551((long) local10 << 16);
			if (local19 != null) {
				return local19;
			}
			local31 = Static310.aClass161_61.method4265(Static310.aClass161_61.method4236(local10));
			if (local31 == null) {
				local10 = arg0.anInt2796 | 0xFFFF00;
				local19 = (Class3_Sub10_Sub10) Static152.aClass168_1.method4551((long) local10 << 16);
				if (local19 != null) {
					return local19;
				}
				local31 = Static310.aClass161_61.method4265(Static310.aClass161_61.method4236(local10));
				if (local31 == null) {
					return null;
				} else if (local31.length <= 1) {
					return null;
				} else {
					local19 = Static287.method4866(local31);
					local19.aClass91_5 = arg0;
					Static152.aClass168_1.method4547((long) local10 << 16, local19);
					return local19;
				}
			} else if (local31.length <= 1) {
				return null;
			} else {
				local19 = Static287.method4866(local31);
				local19.aClass91_5 = arg0;
				Static152.aClass168_1.method4547((long) local10 << 16, local19);
				return local19;
			}
		} else if (local31.length <= 1) {
			return null;
		} else {
			local19 = Static287.method4866(local31);
			local19.aClass91_5 = arg0;
			Static152.aClass168_1.method4547((long) local10 << 16, local19);
			return local19;
		}
	}
}
