import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static446 {

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "[Z")
	public static final boolean[] aBooleanArray18 = new boolean[100];

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(B)I")
	public static int method6500() {
		return Static37.anInt990;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(BLclient!lja;ZZ)V")
	public static void method6502(@OriginalArg(1) Class14_Sub32 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) boolean arg2) {
		@Pc(12) int local12 = arg0.anInt6351;
		@Pc(16) int local16 = (int) arg0.aLong305;
		arg0.method9315();
		if (arg1) {
			Static544.method7681(local12);
		}
		Static33.method799(local12);
		@Pc(31) Class230 local31 = Static655.method9094(local16);
		if (local31 != null) {
			Static634.method8860(local31);
		}
		Static494.method7325();
		if (!arg2 && Static563.anInt9769 != -1) {
			Static233.method3542(Static563.anInt9769, 1);
		}
		@Pc(53) Class318 local53 = new Class318(Static547.aClass187_69);
		for (@Pc(58) Class14_Sub32 local58 = (Class14_Sub32) local53.method7646(); local58 != null; local58 = (Class14_Sub32) local53.method7648()) {
			if (!local58.method9314()) {
				local58 = (Class14_Sub32) local53.method7646();
				if (local58 == null) {
					return;
				}
			}
			if (local58.anInt6350 == 3) {
				@Pc(80) int local80 = (int) local58.aLong305;
				if (local12 == local80 >>> 16) {
					method6502(local58, true, arg2);
				}
			}
		}
	}
}
