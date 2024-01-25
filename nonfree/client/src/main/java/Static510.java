import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static510 {

	@OriginalMember(owner = "client!sba", name = "a", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame2;

	@OriginalMember(owner = "client!sba", name = "e", descriptor = "Lclient!li;")
	public static Class5_Sub4_Sub14 aClass5_Sub4_Sub14_1;

	@OriginalMember(owner = "client!sba", name = "b", descriptor = "Lclient!hda;")
	public static final Class136 aClass136_164 = new Class136(42, 0);

	@OriginalMember(owner = "client!sba", name = "c", descriptor = "I")
	public static int anInt8556 = 0;

	@OriginalMember(owner = "client!sba", name = "a", descriptor = "(III[BII)Z")
	public static boolean method7374(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(5) int arg4) {
		@Pc(7) boolean local7 = true;
		@Pc(12) Class5_Sub12 local12 = new Class5_Sub12(arg3);
		@Pc(22) int local22 = -1;
		label56: while (true) {
			@Pc(26) int local26 = local12.method8627();
			if (local26 == 0) {
				return local7;
			}
			local22 += local26;
			@Pc(37) int local37 = 0;
			@Pc(39) boolean local39 = false;
			while (true) {
				@Pc(45) int local45;
				while (!local39) {
					local45 = local12.method8614();
					if (local45 == 0) {
						continue label56;
					}
					local37 += local45 - 1;
					@Pc(72) int local72 = local37 & 0x3F;
					@Pc(78) int local78 = local37 >> 6 & 0x3F;
					@Pc(84) int local84 = local12.method8645() >> 2;
					@Pc(88) int local88 = arg1 + local78;
					@Pc(92) int local92 = arg2 + local72;
					if (local88 > 0 && local92 > 0 && local88 < arg0 - 1 && local92 < arg4 - 1) {
						@Pc(121) Class283 local121 = Static525.aClass371_4.method8554(local22);
						if (local84 != 22 || Static627.aClass5_Sub46_31.aClass11_Sub16_1.method4417() != 0 || local121.anInt7843 != 0 || local121.anInt7835 == 1 || local121.aBoolean652) {
							if (!local121.method6857()) {
								local7 = false;
								Static69.anInt1100++;
							}
							local39 = true;
						}
					}
				}
				local45 = local12.method8614();
				if (local45 == 0) {
					break;
				}
				local12.method8645();
			}
		}
	}
}
