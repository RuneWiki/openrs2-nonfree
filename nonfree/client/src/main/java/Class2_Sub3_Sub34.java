import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tc")
public final class Class2_Sub3_Sub34 extends Class2_Sub3 {

	@OriginalMember(owner = "client!tc", name = "T", descriptor = "[I")
	public static final int[] anIntArray419 = new int[50];

	@OriginalMember(owner = "client!tc", name = "W", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray4 = new boolean[][] { new boolean[13], { false, false, true, true, true, true, true, false, false, false, false, false, true }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { false, true, true, true, true, true, false, false, false, false, false, false, true }, { false, true, true, true, true, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, false, true, true, true, true, true, true, false, false, true, true, false }, { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true } };

	@OriginalMember(owner = "client!tc", name = "Q", descriptor = "Lclient!oj;")
	public static final Class170 aClass170_4 = new Class170(1);

	@OriginalMember(owner = "client!tc", name = "Y", descriptor = "Lclient!ad;")
	public static Class4 aClass4_130 = new Class4(8);

	@OriginalMember(owner = "client!tc", name = "ab", descriptor = "[I")
	public static final int[] anIntArray420 = new int[3];

	@OriginalMember(owner = "client!tc", name = "O", descriptor = "I")
	private int anInt6151 = 3072;

	@OriginalMember(owner = "client!tc", name = "R", descriptor = "I")
	private int anInt6153 = 1024;

	@OriginalMember(owner = "client!tc", name = "S", descriptor = "I")
	private int anInt6154 = 2048;

	@OriginalMember(owner = "client!tc", name = "<init>", descriptor = "()V", line = 51)
	public Class2_Sub3_Sub34() {
		super(1, false);
	}

	@OriginalMember(owner = "client!tc", name = "b", descriptor = "(IB)[[I", line = 5)
	@Override
	public int[][] method6480(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass243_41.method6278(arg0);
		if (super.aClass243_41.aBoolean478) {
			@Pc(21) int[][] local21 = this.method6484(0, arg0);
			@Pc(25) int[] local25 = local21[0];
			@Pc(29) int[] local29 = local21[1];
			@Pc(33) int[] local33 = local21[2];
			@Pc(37) int[] local37 = local11[0];
			@Pc(41) int[] local41 = local11[1];
			@Pc(45) int[] local45 = local11[2];
			for (@Pc(47) int local47 = 0; local47 < Static211.anInt4031; local47++) {
				local37[local47] = this.anInt6153 + (this.anInt6154 * local25[local47] >> 12);
				local41[local47] = (local29[local47] * this.anInt6154 >> 12) + this.anInt6153;
				local45[local47] = this.anInt6153 + (this.anInt6154 * local33[local47] >> 12);
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(ILclient!bt;I)V", line = 58)
	@Override
	public void method6485(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub4 arg1) {
		if (arg0 == 0) {
			this.anInt6153 = arg1.method4830();
		} else if (arg0 == 1) {
			this.anInt6151 = arg1.method4830();
		} else if (arg0 == 2) {
			super.aBoolean487 = arg1.method4816() == 1;
		}
	}

	@OriginalMember(owner = "client!tc", name = "d", descriptor = "(I)V", line = 261)
	@Override
	public void method6481() {
		this.anInt6154 = this.anInt6151 - this.anInt6153;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(BI)[I", line = 299)
	@Override
	public int[] method6486(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass158_41.method3997(arg0);
		if (super.aClass158_41.aBoolean265) {
			@Pc(21) int[] local21 = this.method6474(0, arg0);
			for (@Pc(23) int local23 = 0; local23 < Static211.anInt4031; local23++) {
				local11[local23] = (this.anInt6154 * local21[local23] >> 12) + this.anInt6153;
			}
		}
		return local11;
	}
}
