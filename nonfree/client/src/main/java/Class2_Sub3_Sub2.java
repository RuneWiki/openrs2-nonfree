import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ad")
public final class Class2_Sub3_Sub2 extends Class2_Sub3 {

	@OriginalMember(owner = "client!ad", name = "nb", descriptor = "[J")
	public static long[] aLongArray1 = new long[256];

	@OriginalMember(owner = "client!ad", name = "rb", descriptor = "[I")
	private int[] anIntArray5;

	@OriginalMember(owner = "client!ad", name = "ub", descriptor = "[I")
	private int[] anIntArray6;

	@OriginalMember(owner = "client!ad", name = "ib", descriptor = "I")
	private int anInt185;

	@OriginalMember(owner = "client!ad", name = "jb", descriptor = "I")
	private int anInt186;

	@OriginalMember(owner = "client!ad", name = "hb", descriptor = "I")
	private int anInt184;

	static {
		for (@Pc(8) int local8 = 0; local8 < 256; local8++) {
			@Pc(12) long local12 = (long) local8;
			for (@Pc(14) int local14 = 0; local14 < 8; local14++) {
				if ((local12 & 0x1L) == 1L) {
					local12 = local12 >>> 1 ^ 0xC96C5795D7870F42L;
				} else {
					local12 >>>= 0x1;
				}
			}
			aLongArray1[local8] = local12;
		}
	}

	@OriginalMember(owner = "client!ad", name = "c", descriptor = "(Z)V")
	@Override
	public void method2892() {
		this.method158();
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(IBLclient!ab;)V")
	@Override
	public void method2904(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub2 arg1) {
		if (arg0 == 0) {
			this.anInt186 = arg1.method1698();
		} else if (arg0 == 1) {
			this.anInt184 = arg1.method1680();
		} else if (arg0 == 2) {
			this.anInt185 = arg1.method1698();
		}
	}

	@OriginalMember(owner = "client!ad", name = "d", descriptor = "(I)V")
	private void method158() {
		this.anIntArray5 = new int[this.anInt186 + 1];
		this.anIntArray6 = new int[this.anInt186 + 1];
		@Pc(23) int local23 = 0;
		@Pc(28) int local28 = 4096 / this.anInt186;
		@Pc(39) int local39 = this.anInt184 * local28 >> 12;
		for (@Pc(41) int local41 = 0; local41 < this.anInt186; local41++) {
			this.anIntArray6[local41] = local23;
			this.anIntArray5[local41] = local23 + local39;
			local23 += local28;
		}
		this.anIntArray6[this.anInt186] = 4096;
		this.anIntArray5[this.anInt186] = this.anIntArray5[0] + 4096;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method2889(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass33_39.method1306(arg0);
		if (super.aClass33_39.aBoolean93) {
			@Pc(19) int local19 = Static21.anIntArray50[arg0];
			@Pc(28) int local28;
			if (this.anInt185 == 0) {
				@Pc(140) short local140 = 0;
				for (local28 = 0; local28 < this.anInt186; local28++) {
					if (local19 >= this.anIntArray6[local28] && local19 < this.anIntArray6[local28 + 1]) {
						if (this.anIntArray5[local28] > local19) {
							local140 = 4096;
						}
						break;
					}
				}
				Static184.method1643(local11, 0, Static54.anInt1423, local140);
			} else {
				for (@Pc(24) int local24 = 0; local24 < Static54.anInt1423; local24++) {
					local28 = 0;
					@Pc(30) short local30 = 0;
					@Pc(34) int local34 = Static36.anIntArray74[local24];
					@Pc(37) int local37 = this.anInt185;
					if (local37 == 1) {
						local28 = local34;
					} else if (local37 == 2) {
						local28 = (local19 + local34 - 4096 >> 1) + 2048;
					} else if (local37 == 3) {
						local28 = (local34 - local19 >> 1) + 2048;
					}
					for (local37 = 0; local37 < this.anInt186; local37++) {
						if (local28 >= this.anIntArray6[local37] && this.anIntArray6[local37 + 1] > local28) {
							if (this.anIntArray5[local37] > local28) {
								local30 = 4096;
							}
							break;
						}
					}
					local11[local24] = local30;
				}
			}
		}
		return local11;
	}
}
