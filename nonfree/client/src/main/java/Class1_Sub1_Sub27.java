import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ob")
public final class Class1_Sub1_Sub27 extends Class1_Sub1 {

	@OriginalMember(owner = "client!ob", name = "N", descriptor = "[F")
	public static final float[] aFloatArray35 = new float[16384];

	@OriginalMember(owner = "client!ob", name = "ab", descriptor = "[F")
	public static final float[] aFloatArray36 = new float[16384];

	@OriginalMember(owner = "client!ob", name = "E", descriptor = "I")
	private int anInt6151;

	@OriginalMember(owner = "client!ob", name = "G", descriptor = "I")
	private int anInt6153;

	@OriginalMember(owner = "client!ob", name = "L", descriptor = "[[I")
	private int[][] anIntArrayArray144;

	@OriginalMember(owner = "client!ob", name = "Q", descriptor = "[I")
	private int[] anIntArray499;

	@OriginalMember(owner = "client!ob", name = "R", descriptor = "[[I")
	private int[][] anIntArrayArray145;

	@OriginalMember(owner = "client!ob", name = "T", descriptor = "I")
	private int anInt6159;

	@OriginalMember(owner = "client!ob", name = "F", descriptor = "I")
	private int anInt6152 = 8;

	@OriginalMember(owner = "client!ob", name = "P", descriptor = "I")
	private int anInt6157 = 4;

	@OriginalMember(owner = "client!ob", name = "H", descriptor = "I")
	private int anInt6154 = 81;

	@OriginalMember(owner = "client!ob", name = "X", descriptor = "I")
	private int anInt6162 = 204;

	@OriginalMember(owner = "client!ob", name = "Y", descriptor = "I")
	private int anInt6163 = 1024;

	@OriginalMember(owner = "client!ob", name = "Z", descriptor = "I")
	private int anInt6164 = 0;

	@OriginalMember(owner = "client!ob", name = "bb", descriptor = "I")
	private int anInt6165 = 1024;

	@OriginalMember(owner = "client!ob", name = "M", descriptor = "I")
	private int anInt6156 = 409;

	static {
		@Pc(297) double local297 = 3.834951969714103E-4D;
		for (@Pc(299) int local299 = 0; local299 < 16384; local299++) {
			aFloatArray36[local299] = (float) Math.sin(local297 * (double) local299);
			aFloatArray35[local299] = (float) Math.cos((double) local299 * local297);
		}
	}

	@OriginalMember(owner = "client!ob", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub27() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(ILclient!mo;I)V")
	@Override
	public void method7708(@OriginalArg(1) Class1_Sub35 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt6157 = arg0.method5750();
		} else if (arg1 == 1) {
			this.anInt6152 = arg0.method5750();
		} else if (arg1 == 2) {
			this.anInt6156 = arg0.method5771();
		} else if (arg1 == 3) {
			this.anInt6162 = arg0.method5771();
		} else if (arg1 == 4) {
			this.anInt6165 = arg0.method5771();
		} else if (arg1 == 5) {
			this.anInt6164 = arg0.method5771();
		} else if (arg1 == 6) {
			this.anInt6154 = arg0.method5771();
		} else if (arg1 == 7) {
			this.anInt6163 = arg0.method5771();
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method7706(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass223_41.method4438(arg0);
		if (super.aClass223_41.aBoolean442) {
			@Pc(25) int local25 = 0;
			@Pc(33) int local33;
			for (local33 = Static445.anIntArray590[arg0] + this.anInt6164; local33 < 0; local33 += 4096) {
			}
			while (local33 > 4096) {
				local33 -= 4096;
			}
			while (local25 < this.anInt6152 && local33 >= this.anIntArray499[local25]) {
				local25++;
			}
			@Pc(65) int local65 = local25 - 1;
			@Pc(76) boolean local76 = (local25 & 0x1) == 0;
			@Pc(81) int local81 = this.anIntArray499[local25];
			@Pc(88) int local88 = this.anIntArray499[local25 - 1];
			if (this.anInt6159 + local88 < local33 && local33 < local81 - this.anInt6159) {
				for (@Pc(114) int local114 = 0; local114 < Static279.anInt4906; local114++) {
					@Pc(125) int local125 = local76 ? this.anInt6165 : -this.anInt6165;
					@Pc(127) int local127 = 0;
					@Pc(139) int local139;
					for (local139 = Static557.anIntArray708[local114] + (this.anInt6151 * local125 >> 12); local139 < 0; local139 += 4096) {
					}
					while (local139 > 4096) {
						local139 -= 4096;
					}
					while (this.anInt6157 > local127 && this.anIntArrayArray145[local65][local127] <= local139) {
						local127++;
					}
					@Pc(176) int local176 = local127 - 1;
					@Pc(183) int local183 = this.anIntArrayArray145[local65][local176];
					@Pc(190) int local190 = this.anIntArrayArray145[local65][local127];
					if (local139 > this.anInt6159 + local183 && local139 < local190 - this.anInt6159) {
						local11[local114] = this.anIntArrayArray144[local65][local176];
					} else {
						local11[local114] = 0;
					}
				}
			} else {
				Static598.method1171(local11, 0, Static279.anInt4906, 0);
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "(B)V")
	private void method4988() {
		@Pc(12) Random local12 = new Random((long) this.anInt6152);
		this.anInt6151 = 4096 / this.anInt6157;
		this.anInt6159 = this.anInt6154 / 2;
		this.anInt6153 = 4096 / this.anInt6152;
		@Pc(35) int local35 = this.anInt6151 / 2;
		this.anIntArray499 = new int[this.anInt6152 + 1];
		this.anIntArrayArray145 = new int[this.anInt6152][this.anInt6157 + 1];
		@Pc(56) int local56 = this.anInt6153 / 2;
		this.anIntArrayArray144 = new int[this.anInt6152][this.anInt6157];
		this.anIntArray499[0] = 0;
		for (@Pc(74) int local74 = 0; local74 < this.anInt6152; local74++) {
			@Pc(84) int local84;
			@Pc(96) int local96;
			if (local74 > 0) {
				local84 = this.anInt6153;
				local96 = (Static87.method4324(4096, local12) - 2048) * this.anInt6162 >> 12;
				@Pc(104) int local104 = local84 + (local96 * local56 >> 12);
				this.anIntArray499[local74] = local104 + this.anIntArray499[local74 - 1];
			}
			this.anIntArrayArray145[local74][0] = 0;
			for (local84 = 0; local84 < this.anInt6157; local84++) {
				if (local84 > 0) {
					local96 = this.anInt6151;
					@Pc(144) int local144 = (Static87.method4324(4096, local12) - 2048) * this.anInt6156 >> 12;
					local96 += local144 * local35 >> 12;
					this.anIntArrayArray145[local74][local84] = local96 + this.anIntArrayArray145[local74][local84 - 1];
				}
				this.anIntArrayArray144[local74][local84] = this.anInt6163 > 0 ? 4096 - Static87.method4324(this.anInt6163, local12) : 4096;
			}
			this.anIntArrayArray145[local74][this.anInt6157] = 4096;
		}
		this.anIntArray499[this.anInt6152] = 4096;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(I)V")
	@Override
	public void method7699() {
		this.method4988();
	}
}
