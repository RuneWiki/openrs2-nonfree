import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!re")
public final class Class2_Sub1_Sub22 extends Class2_Sub1 {

	@OriginalMember(owner = "client!re", name = "db", descriptor = "I")
	private int anInt3392 = 12288;

	@OriginalMember(owner = "client!re", name = "V", descriptor = "I")
	private int anInt3388 = 0;

	@OriginalMember(owner = "client!re", name = "ib", descriptor = "I")
	private int anInt3395 = 8192;

	@OriginalMember(owner = "client!re", name = "cb", descriptor = "I")
	private int anInt3391 = 4096;

	@OriginalMember(owner = "client!re", name = "lb", descriptor = "I")
	private int anInt3398 = 2048;

	@OriginalMember(owner = "client!re", name = "hb", descriptor = "I")
	private int anInt3394 = 0;

	@OriginalMember(owner = "client!re", name = "jb", descriptor = "I")
	private int anInt3396 = 2048;

	@OriginalMember(owner = "client!re", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub22() {
		super(0, true);
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(Lclient!ra;IZ)V")
	@Override
	public void method3264(@OriginalArg(0) Class2_Sub3 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt3398 = arg0.method269();
		} else if (arg1 == 1) {
			this.anInt3394 = arg0.method269();
		} else if (arg1 == 2) {
			this.anInt3388 = arg0.method269();
		} else if (arg1 == 3) {
			this.anInt3396 = arg0.method269();
		} else if (arg1 == 4) {
			this.anInt3392 = arg0.method269();
		} else if (arg1 == 5) {
			this.anInt3391 = arg0.method269();
		} else if (arg1 == 6) {
			this.anInt3395 = arg0.method269();
		}
	}

	@OriginalMember(owner = "client!re", name = "c", descriptor = "(I)V")
	@Override
	public void method3260() {
		Static50.method997();
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method3256(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = super.aClass52_41.method1596(arg0);
		if (super.aClass52_41.aBoolean103) {
			@Pc(27) int local27 = Static81.anIntArray174[arg0] - 2048;
			for (@Pc(29) int local29 = 0; local29 < Static135.anInt2897; local29++) {
				@Pc(37) int local37 = Static107.anIntArray304[local29] - 2048;
				@Pc(42) int local42 = this.anInt3394 + local27;
				@Pc(47) int local47 = this.anInt3398 + local37;
				@Pc(52) int local52 = this.anInt3396 + local27;
				@Pc(61) int local61 = local47 >= -2048 ? local47 : local47 + 4096;
				@Pc(70) int local70 = local52 >= -2048 ? local52 : local52 + 4096;
				@Pc(81) int local81 = local61 <= 2048 ? local61 : local61 - 4096;
				@Pc(90) int local90 = local70 > 2048 ? local70 - 4096 : local70;
				@Pc(101) int local101 = local42 >= -2048 ? local42 : local42 + 4096;
				@Pc(106) int local106 = this.anInt3388 + local37;
				@Pc(117) int local117 = local106 < -2048 ? local106 + 4096 : local106;
				@Pc(126) int local126 = local117 <= 2048 ? local117 : local117 - 4096;
				@Pc(137) int local137 = local101 > 2048 ? local101 - 4096 : local101;
				local17[local29] = this.method2553(local137, local81) || this.method2552(local90, local126) ? 4096 : 0;
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!re", name = "d", descriptor = "(III)Z")
	private boolean method2552(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13 = this.anInt3392 * (arg0 + arg1) >> 12;
		@Pc(23) int local23 = Static203.anIntArray399[local13 * 255 >> 12 & 0xFF];
		@Pc(30) int local30 = (local23 << 12) / this.anInt3392;
		@Pc(42) int local42 = (local30 << 12) / this.anInt3395;
		@Pc(49) int local49 = this.anInt3391 * local42 >> 12;
		return arg0 - arg1 < local49 && -local49 < arg0 - arg1;
	}

	@OriginalMember(owner = "client!re", name = "e", descriptor = "(III)Z")
	private boolean method2553(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) int local13 = this.anInt3392 * (arg0 - arg1) >> 12;
		@Pc(23) int local23 = Static203.anIntArray399[local13 * 255 >> 12 & 0xFF];
		@Pc(30) int local30 = (local23 << 12) / this.anInt3392;
		@Pc(37) int local37 = (local30 << 12) / this.anInt3395;
		@Pc(44) int local44 = this.anInt3391 * local37 >> 12;
		return local44 > arg0 + arg1 && -local44 < arg1 + arg0;
	}
}
