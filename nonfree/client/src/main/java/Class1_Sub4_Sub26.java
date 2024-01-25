import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!on")
public final class Class1_Sub4_Sub26 extends Class1_Sub4 {

	@OriginalMember(owner = "client!on", name = "M", descriptor = "I")
	private int anInt5100;

	@OriginalMember(owner = "client!on", name = "N", descriptor = "[[I")
	private int[][] anIntArrayArray43;

	@OriginalMember(owner = "client!on", name = "T", descriptor = "[I")
	private int[] anIntArray330;

	@OriginalMember(owner = "client!on", name = "U", descriptor = "I")
	private int anInt5106;

	@OriginalMember(owner = "client!on", name = "ab", descriptor = "I")
	private int anInt5110;

	@OriginalMember(owner = "client!on", name = "cb", descriptor = "[[I")
	private int[][] anIntArrayArray44;

	@OriginalMember(owner = "client!on", name = "H", descriptor = "I")
	private int anInt5096 = 1024;

	@OriginalMember(owner = "client!on", name = "Q", descriptor = "I")
	private int anInt5103 = 4;

	@OriginalMember(owner = "client!on", name = "P", descriptor = "I")
	private int anInt5102 = 8;

	@OriginalMember(owner = "client!on", name = "L", descriptor = "I")
	private int anInt5099 = 81;

	@OriginalMember(owner = "client!on", name = "R", descriptor = "I")
	private int anInt5104 = 1024;

	@OriginalMember(owner = "client!on", name = "S", descriptor = "I")
	private int anInt5105 = 0;

	@OriginalMember(owner = "client!on", name = "Z", descriptor = "I")
	private int anInt5109 = 409;

	@OriginalMember(owner = "client!on", name = "Y", descriptor = "I")
	private int anInt5108 = 204;

	@OriginalMember(owner = "client!on", name = "<init>", descriptor = "()V")
	public Class1_Sub4_Sub26() {
		super(0, true);
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5683(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass2_41.method10(arg0);
		if (super.aClass2_41.aBoolean5) {
			@Pc(22) int local22 = 0;
			@Pc(29) int local29;
			for (local29 = Static419.anIntArray472[arg0] + this.anInt5105; local29 < 0; local29 += 4096) {
			}
			while (local29 > 4096) {
				local29 -= 4096;
			}
			while (this.anInt5102 > local22 && local29 >= this.anIntArray330[local22]) {
				local22++;
			}
			@Pc(68) int local68 = local22 - 1;
			@Pc(76) boolean local76 = (local22 & 0x1) == 0;
			@Pc(81) int local81 = this.anIntArray330[local22];
			@Pc(88) int local88 = this.anIntArray330[local22 - 1];
			if (this.anInt5110 + local88 < local29 && local29 < local81 - this.anInt5110) {
				for (@Pc(106) int local106 = 0; local106 < Static395.anInt6592; local106++) {
					@Pc(110) int local110 = 0;
					@Pc(119) int local119 = local76 ? this.anInt5096 : -this.anInt5096;
					@Pc(131) int local131;
					for (local131 = Static119.anIntArray146[local106] + (this.anInt5100 * local119 >> 12); local131 < 0; local131 += 4096) {
					}
					while (local131 > 4096) {
						local131 -= 4096;
					}
					while (local110 < this.anInt5103 && this.anIntArrayArray43[local68][local110] <= local131) {
						local110++;
					}
					@Pc(172) int local172 = local110 - 1;
					@Pc(179) int local179 = this.anIntArrayArray43[local68][local172];
					@Pc(186) int local186 = this.anIntArrayArray43[local68][local110];
					if (local131 > local179 + this.anInt5110 && local186 - this.anInt5110 > local131) {
						local16[local106] = this.anIntArrayArray44[local68][local172];
					} else {
						local16[local106] = 0;
					}
				}
			} else {
				Static468.method5037(local16, 0, Static395.anInt6592, 0);
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!on", name = "j", descriptor = "(I)V")
	private void method3998() {
		@Pc(12) Random local12 = new Random((long) this.anInt5102);
		this.anInt5100 = 4096 / this.anInt5103;
		this.anInt5110 = this.anInt5099 / 2;
		this.anInt5106 = 4096 / this.anInt5102;
		@Pc(35) int local35 = this.anInt5100 / 2;
		@Pc(40) int local40 = this.anInt5106 / 2;
		this.anIntArray330 = new int[this.anInt5102 + 1];
		this.anIntArrayArray43 = new int[this.anInt5102][this.anInt5103 + 1];
		this.anIntArrayArray44 = new int[this.anInt5102][this.anInt5103];
		this.anIntArray330[0] = 0;
		for (@Pc(70) int local70 = 0; local70 < this.anInt5102; local70++) {
			@Pc(80) int local80;
			@Pc(92) int local92;
			if (local70 > 0) {
				local80 = this.anInt5106;
				local92 = (Static301.method4119(local12, 4096) - 2048) * this.anInt5108 >> 12;
				@Pc(100) int local100 = local80 + (local40 * local92 >> 12);
				this.anIntArray330[local70] = local100 + this.anIntArray330[local70 - 1];
			}
			this.anIntArrayArray43[local70][0] = 0;
			for (local80 = 0; local80 < this.anInt5103; local80++) {
				if (local80 > 0) {
					local92 = this.anInt5100;
					@Pc(140) int local140 = (Static301.method4119(local12, 4096) - 2048) * this.anInt5109 >> 12;
					local92 += local35 * local140 >> 12;
					this.anIntArrayArray43[local70][local80] = this.anIntArrayArray43[local70][local80 - 1] + local92;
				}
				this.anIntArrayArray44[local70][local80] = this.anInt5104 > 0 ? 4096 - Static301.method4119(local12, this.anInt5104) : 4096;
			}
			this.anIntArrayArray43[local70][this.anInt5103] = 4096;
		}
		this.anIntArray330[this.anInt5102] = 4096;
	}

	@OriginalMember(owner = "client!on", name = "e", descriptor = "(I)V")
	@Override
	public void method5686() {
		this.method3998();
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(Lclient!ug;II)V")
	@Override
	public void method5690(@OriginalArg(0) Class1_Sub28 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt5103 = arg0.method5337();
		} else if (arg1 == 1) {
			this.anInt5102 = arg0.method5337();
		} else if (arg1 == 2) {
			this.anInt5109 = arg0.method5335();
		} else if (arg1 == 3) {
			this.anInt5108 = arg0.method5335();
		} else if (arg1 == 4) {
			this.anInt5096 = arg0.method5335();
		} else if (arg1 == 5) {
			this.anInt5105 = arg0.method5335();
		} else if (arg1 == 6) {
			this.anInt5099 = arg0.method5335();
		} else if (arg1 == 7) {
			this.anInt5104 = arg0.method5335();
		}
	}
}
