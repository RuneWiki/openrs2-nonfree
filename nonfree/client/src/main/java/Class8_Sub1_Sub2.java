import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ie")
public final class Class8_Sub1_Sub2 extends Class8_Sub1 {

	@OriginalMember(owner = "client!ie", name = "l", descriptor = "Lclient!nq;")
	private Class30_Sub4 aClass30_Sub4_2;

	@OriginalMember(owner = "client!ie", name = "m", descriptor = "I")
	private final int anInt2732;

	@OriginalMember(owner = "client!ie", name = "k", descriptor = "I")
	private final int anInt2731;

	@OriginalMember(owner = "client!ie", name = "g", descriptor = "I")
	private final int anInt2729;

	@OriginalMember(owner = "client!ie", name = "i", descriptor = "Lclient!mi;")
	private final Class155_Sub1 aClass155_Sub1_17;

	@OriginalMember(owner = "client!ie", name = "j", descriptor = "I")
	private final int anInt2730;

	@OriginalMember(owner = "client!ie", name = "p", descriptor = "I")
	private final int anInt2734;

	@OriginalMember(owner = "client!ie", name = "o", descriptor = "I")
	private final int anInt2733;

	@OriginalMember(owner = "client!ie", name = "<init>", descriptor = "(Lclient!mi;IIIIII)V")
	public Class8_Sub1_Sub2(@OriginalArg(0) Class155_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt2732 = arg3;
		this.anInt2731 = arg4;
		this.anInt2729 = arg6;
		this.aClass155_Sub1_17 = arg0;
		this.anInt2730 = arg1;
		this.anInt2734 = arg2;
		this.anInt2733 = arg5;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(I)Lclient!nq;")
	@Override
	public Class30_Sub4 method2306() {
		if (this.aClass30_Sub4_2 == null) {
			Static148.anIntArray292[2] = this.anInt2732;
			Static148.anIntArray292[1] = this.anInt2734;
			Static148.anIntArray292[3] = this.anInt2731;
			Static148.anIntArray292[4] = this.anInt2733;
			@Pc(27) Interface10 local27 = this.aClass155_Sub1_17.anInterface10_7;
			Static148.anIntArray292[0] = this.anInt2730;
			Static148.anIntArray292[5] = this.anInt2729;
			@Pc(39) boolean local39 = false;
			@Pc(41) int local41 = 0;
			@Pc(43) int local43;
			for (local43 = 0; local43 < 6; local43++) {
				if (!local27.method191(Static148.anIntArray292[local43])) {
					return null;
				}
				@Pc(65) Class121 local65 = local27.method192(Static148.anIntArray292[local43]);
				@Pc(72) int local72 = local65.aBoolean224 ? 64 : 128;
				if (local72 > local41) {
					local41 = local72;
				}
				if (local65.aByte38 > 0) {
					local39 = true;
				}
			}
			for (local43 = 0; local43 < 6; local43++) {
				Static148.anIntArrayArray25[local43] = local27.method194(local41, 1.0F, false, local41, Static148.anIntArray292[local43]);
			}
			this.aClass30_Sub4_2 = new Class30_Sub4(this.aClass155_Sub1_17, 6407, local41, local39, Static148.anIntArrayArray25);
		}
		return this.aClass30_Sub4_2;
	}
}
