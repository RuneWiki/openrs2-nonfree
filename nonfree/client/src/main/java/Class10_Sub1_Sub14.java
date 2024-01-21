import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qd")
public final class Class10_Sub1_Sub14 extends Class10_Sub1 {

	@OriginalMember(owner = "client!qd", name = "R", descriptor = "I")
	public int anInt2187;

	@OriginalMember(owner = "client!qd", name = "Y", descriptor = "I")
	private int anInt2194;

	@OriginalMember(owner = "client!qd", name = "U", descriptor = "I")
	private int anInt2190 = 0;

	@OriginalMember(owner = "client!qd", name = "N", descriptor = "I")
	private int anInt2184 = 128;

	@OriginalMember(owner = "client!qd", name = "X", descriptor = "I")
	private int anInt2193 = 128;

	@OriginalMember(owner = "client!qd", name = "O", descriptor = "I")
	public int anInt2185 = -1;

	@OriginalMember(owner = "client!qd", name = "Z", descriptor = "[I")
	private final int[] anIntArray244 = new int[6];

	@OriginalMember(owner = "client!qd", name = "fb", descriptor = "I")
	private int anInt2197 = 0;

	@OriginalMember(owner = "client!qd", name = "cb", descriptor = "[I")
	private final int[] anIntArray245 = new int[6];

	@OriginalMember(owner = "client!qd", name = "gb", descriptor = "I")
	private int anInt2198 = 0;

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(BI)Lclient!rb;")
	public Class10_Sub1_Sub5_Sub4 method1273(@OriginalArg(1) int arg0) {
		@Pc(13) Class10_Sub1_Sub5_Sub4 local13 = (Class10_Sub1_Sub5_Sub4) Static41.aClass29_31.method644((long) this.anInt2187);
		if (local13 == null) {
			local13 = Static84.method1335(Static57.aClass11_39, this.anInt2194);
			if (local13 == null) {
				return null;
			}
			for (@Pc(32) int local32 = 0; local32 < 6; local32++) {
				if (this.anIntArray244[0] != 0) {
					local13.method1328(this.anIntArray244[local32], this.anIntArray245[local32]);
				}
			}
			local13.method1310();
			local13.method1324(this.anInt2198 + 64, this.anInt2190 + 850, -30, -50, -30, true);
			Static41.aClass29_31.method649(local13, (long) this.anInt2187);
		}
		@Pc(94) Class10_Sub1_Sub5_Sub4 local94;
		if (this.anInt2185 == -1 || arg0 == -1) {
			local94 = local13.method1314(true);
		} else {
			local94 = Static5.method33(this.anInt2185).method588(local13, arg0);
		}
		if (this.anInt2184 != 128 || this.anInt2193 != 128) {
			local94.method1316(this.anInt2184, this.anInt2193, this.anInt2184);
		}
		if (this.anInt2197 != 0) {
			if (this.anInt2197 == 90) {
				local94.method1312();
			}
			if (this.anInt2197 == 180) {
				local94.method1312();
				local94.method1312();
			}
			if (this.anInt2197 == 270) {
				local94.method1312();
				local94.method1312();
				local94.method1312();
			}
		}
		return local94;
	}

	@OriginalMember(owner = "client!qd", name = "b", descriptor = "(Lclient!tc;I)V")
	public void method1275(@OriginalArg(0) Class10_Sub10 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method1111();
			if (local5 == 0) {
				return;
			}
			this.method1278(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(Lclient!tc;II)V")
	private void method1278(@OriginalArg(0) Class10_Sub10 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt2194 = arg0.method1160();
		} else if (arg1 == 2) {
			this.anInt2185 = arg0.method1160();
		} else if (arg1 == 4) {
			this.anInt2184 = arg0.method1160();
		} else if (arg1 == 5) {
			this.anInt2193 = arg0.method1160();
		} else if (arg1 == 6) {
			this.anInt2197 = arg0.method1160();
		} else if (arg1 == 7) {
			this.anInt2198 = arg0.method1111();
		} else if (arg1 == 8) {
			this.anInt2190 = arg0.method1111();
		} else if (arg1 >= 40 && arg1 < 50) {
			this.anIntArray244[arg1 - 40] = arg0.method1160();
		} else if (arg1 >= 50 && arg1 < 60) {
			this.anIntArray245[arg1 - 50] = arg0.method1160();
		}
	}
}
