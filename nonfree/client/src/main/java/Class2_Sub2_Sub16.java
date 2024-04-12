import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vc")
public final class Class2_Sub2_Sub16 extends Class2_Sub2 {

	@OriginalMember(owner = "client!vc", name = "T", descriptor = "Lclient!o;")
	public static Class40 aClass40_708 = Static12.method257("wishes to duel with you)3");

	@OriginalMember(owner = "client!vc", name = "V", descriptor = "I")
	public static int anInt2465 = 0;

	@OriginalMember(owner = "client!vc", name = "W", descriptor = "I")
	public static int anInt2466 = -1;

	@OriginalMember(owner = "client!vc", name = "Z", descriptor = "Lclient!o;")
	public static Class40 aClass40_709 = Static12.method257("Connecting to friendserver");

	@OriginalMember(owner = "client!vc", name = "P", descriptor = "Ljava/util/zip/CRC32;")
	public static CRC32 aCRC32_2 = new CRC32();

	@OriginalMember(owner = "client!vc", name = "hb", descriptor = "Lclient!o;")
	public static Class40 aClass40_711 = Static12.method257("Loaded fonts");

	@OriginalMember(owner = "client!vc", name = "lb", descriptor = "[I")
	public static int[] anIntArray546 = new int[1000];

	@OriginalMember(owner = "client!vc", name = "jb", descriptor = "I")
	public static int anInt2474 = 0;

	@OriginalMember(owner = "client!vc", name = "mb", descriptor = "Lclient!o;")
	public static Class40 aClass40_712 = Static12.method257("Sep");

	@OriginalMember(owner = "client!vc", name = "fb", descriptor = "Lclient!o;")
	public static Class40 aClass40_710 = Static12.method257("*6n");

	@OriginalMember(owner = "client!vc", name = "kb", descriptor = "[I")
	public static int[] anIntArray545 = new int[128];

	@OriginalMember(owner = "client!vc", name = "ob", descriptor = "Lclient!o;")
	public static Class40 aClass40_713 = Static12.method257("Bad session id)3");

	@OriginalMember(owner = "client!vc", name = "ib", descriptor = "I")
	public static int anInt2473 = 0;

	@OriginalMember(owner = "client!vc", name = "O", descriptor = "I")
	public int anInt2460;

	@OriginalMember(owner = "client!vc", name = "Q", descriptor = "I")
	public int anInt2461;

	@OriginalMember(owner = "client!vc", name = "U", descriptor = "I")
	public int anInt2464;

	@OriginalMember(owner = "client!vc", name = "ab", descriptor = "I")
	public int anInt2469;

	@OriginalMember(owner = "client!vc", name = "X", descriptor = "I")
	private int anInt2467 = 0;

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIBLclient!eb;)V", line = 128)
	private void method1639(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class2_Sub3 arg2) {
		if (arg1 == 1) {
			this.anInt2467 = arg2.method1718();
		}
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lclient!eb;II)V", line = 145)
	public void method1640(@OriginalArg(0) Class2_Sub3 arg0, @OriginalArg(2) int arg1) {
		while (true) {
			@Pc(9) int local9 = arg0.method1708();
			if (local9 == 0) {
				return;
			}
			this.method1639(arg1, local9, arg0);
		}
	}

	@OriginalMember(owner = "client!vc", name = "c", descriptor = "(B)V", line = 176)
	public void method1641() {
		this.method1642(this.anInt2467);
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(II)V", line = 190)
	private void method1642(@OriginalArg(1) int arg0) {
		@Pc(12) double local12 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(21) double local21 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(30) double local30 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(32) double local32 = local30;
		if (local21 < local30) {
			local32 = local21;
		}
		if (local32 > local12) {
			local32 = local12;
		}
		@Pc(46) double local46 = local30;
		@Pc(48) double local48 = 0.0D;
		if (local30 < local21) {
			local46 = local21;
		}
		if (local12 > local46) {
			local46 = local12;
		}
		@Pc(63) double local63 = (double) 0;
		@Pc(69) double local69 = (local32 + local46) / 2.0D;
		this.anInt2460 = (int) (local69 * 256.0D);
		if (local32 != local46) {
			if (local30 == local46) {
				local48 = (local21 - local12) / (local46 - local32);
			} else if (local46 == local21) {
				local48 = (local12 - local30) / (local46 - local32) + 2.0D;
			} else if (local12 == local46) {
				local48 = (local30 - local21) / (-local32 + local46) + 4.0D;
			}
			if (local69 < 0.5D) {
				local63 = (local46 - local32) / (local32 + local46);
			}
			if (local69 >= 0.5D) {
				local63 = (local46 - local32) / (2.0D - local46 - local32);
			}
		}
		this.anInt2461 = (int) (local63 * 256.0D);
		if (this.anInt2461 < 0) {
			this.anInt2461 = 0;
		} else if (this.anInt2461 > 255) {
			this.anInt2461 = 255;
		}
		if (local69 > 0.5D) {
			this.anInt2464 = (int) (local63 * 512.0D * (1.0D - local69));
		} else {
			this.anInt2464 = (int) (local63 * 512.0D * local69);
		}
		if (this.anInt2464 < 1) {
			this.anInt2464 = 1;
		}
		if (this.anInt2460 < 0) {
			this.anInt2460 = 0;
		} else if (this.anInt2460 > 255) {
			this.anInt2460 = 255;
		}
		local48 /= 6.0D;
		this.anInt2469 = (int) ((double) this.anInt2464 * local48);
	}
}
