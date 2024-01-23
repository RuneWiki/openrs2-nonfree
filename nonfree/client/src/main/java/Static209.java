import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static209 {

	@OriginalMember(owner = "client!qa", name = "x", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame3;

	@OriginalMember(owner = "client!qa", name = "F", descriptor = "I")
	public static int anInt4334;

	@OriginalMember(owner = "client!qa", name = "z", descriptor = "Lclient!qg;")
	public static Class8_Sub24 aClass8_Sub24_1 = new Class8_Sub24(0, -1);

	@OriginalMember(owner = "client!qa", name = "H", descriptor = "I")
	public static int anInt4336 = 0;

	@OriginalMember(owner = "client!qa", name = "I", descriptor = "I")
	public static volatile int anInt4337 = 0;

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IBIII)V")
	public static void method3305(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(6) Class8_Sub1_Sub6 local6 = Static181.method2779(8, arg2);
		local6.method931();
		local6.anInt1284 = arg0;
		local6.anInt1289 = arg1;
		local6.anInt1286 = arg3;
	}

	@OriginalMember(owner = "client!qa", name = "c", descriptor = "(I)V")
	public static void method3307() {
		@Pc(6) Class82 local6 = Static89.aClass82_1;
		synchronized (Static89.aClass82_1) {
			Static47.anInt1046 = Static27.anInt669;
			Static118.anInt2384++;
			Static182.anInt3572 = Static61.anInt1337;
			Static106.anInt2198 = Static240.anInt4800;
			Static157.anInt5714 = Static22.anInt604;
			Static59.anInt1292 = Static225.anInt4590;
			Static89.anInt1907 = anInt4337;
			Static95.aLong77 = Static9.aLong4;
			Static22.anInt604 = 0;
		}
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!bk;I)[Lclient!p;")
	public static Class126[] method3310(@OriginalArg(0) Class17 arg0) {
		if (!arg0.method447()) {
			return new Class126[0];
		}
		@Pc(17) Class163 local17 = arg0.method441();
		while (local17.anInt5259 == 0) {
			Static162.method2645(10L);
		}
		if (local17.anInt5259 == 2) {
			return new Class126[0];
		}
		@Pc(37) int[] local37 = (int[]) local17.anObject7;
		@Pc(43) Class126[] local43 = new Class126[local37.length >> 2];
		for (@Pc(45) int local45 = 0; local45 < local43.length; local45++) {
			@Pc(53) Class126 local53 = new Class126();
			local43[local45] = local53;
			local53.anInt3884 = local37[local45 << 2];
			local53.anInt3887 = local37[(local45 << 2) + 1];
			local53.anInt3882 = local37[(local45 << 2) + 2];
			local53.anInt3883 = local37[(local45 << 2) + 3];
		}
		return local43;
	}
}
