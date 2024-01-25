import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uc")
public final class Class2_Sub7_Sub35 extends Class2_Sub7 {

	@OriginalMember(owner = "client!uc", name = "I", descriptor = "[[I")
	private int[][] anIntArrayArray76;

	@OriginalMember(owner = "client!uc", name = "O", descriptor = "I")
	private int anInt8516;

	@OriginalMember(owner = "client!uc", name = "P", descriptor = "[I")
	private int[] anIntArray653;

	@OriginalMember(owner = "client!uc", name = "X", descriptor = "I")
	private int anInt8523;

	@OriginalMember(owner = "client!uc", name = "Y", descriptor = "I")
	private int anInt8524;

	@OriginalMember(owner = "client!uc", name = "db", descriptor = "[[I")
	private int[][] anIntArrayArray77;

	@OriginalMember(owner = "client!uc", name = "K", descriptor = "I")
	private int anInt8512 = 409;

	@OriginalMember(owner = "client!uc", name = "M", descriptor = "I")
	private int anInt8514 = 204;

	@OriginalMember(owner = "client!uc", name = "R", descriptor = "I")
	private int anInt8518 = 81;

	@OriginalMember(owner = "client!uc", name = "U", descriptor = "I")
	private int anInt8521 = 0;

	@OriginalMember(owner = "client!uc", name = "Q", descriptor = "I")
	private int anInt8517 = 1024;

	@OriginalMember(owner = "client!uc", name = "fb", descriptor = "I")
	private int anInt8528 = 4;

	@OriginalMember(owner = "client!uc", name = "gb", descriptor = "I")
	private int anInt8529 = 1024;

	@OriginalMember(owner = "client!uc", name = "T", descriptor = "I")
	private int anInt8520 = 8;

	@OriginalMember(owner = "client!uc", name = "<init>", descriptor = "()V")
	public Class2_Sub7_Sub35() {
		super(0, true);
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(I)V")
	@Override
	public void method7583() {
		this.method7128();
	}

	@OriginalMember(owner = "client!uc", name = "b", descriptor = "(BI)[I")
	@Override
	public int[] method7587(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = super.aClass221_41.method5903(arg0);
		if (super.aClass221_41.aBoolean523) {
			@Pc(23) int local23 = 0;
			@Pc(30) int local30;
			for (local30 = this.anInt8521 + Static313.anIntArray521[arg0]; local30 < 0; local30 += 4096) {
			}
			while (local30 > 4096) {
				local30 -= 4096;
			}
			while (this.anInt8520 > local23 && local30 >= this.anIntArray653[local23]) {
				local23++;
			}
			@Pc(71) int local71 = local23 - 1;
			@Pc(82) boolean local82 = (local23 & 0x1) == 0;
			@Pc(87) int local87 = this.anIntArray653[local23];
			@Pc(94) int local94 = this.anIntArray653[local23 - 1];
			if (local30 > local94 + this.anInt8523 && local30 < local87 - this.anInt8523) {
				for (@Pc(125) int local125 = 0; local125 < Static352.anInt6485; local125++) {
					@Pc(136) int local136 = local82 ? this.anInt8529 : -this.anInt8529;
					@Pc(138) int local138 = 0;
					@Pc(149) int local149;
					for (local149 = Static427.anIntArray602[local125] + (this.anInt8516 * local136 >> 12); local149 < 0; local149 += 4096) {
					}
					while (local149 > 4096) {
						local149 -= 4096;
					}
					while (this.anInt8528 > local138 && local149 >= this.anIntArrayArray77[local71][local138]) {
						local138++;
					}
					@Pc(188) int local188 = local138 - 1;
					@Pc(195) int local195 = this.anIntArrayArray77[local71][local138];
					@Pc(202) int local202 = this.anIntArrayArray77[local71][local188];
					if (local149 > this.anInt8523 + local202 && local149 < local195 - this.anInt8523) {
						local17[local125] = this.anIntArrayArray76[local71][local188];
					} else {
						local17[local125] = 0;
					}
				}
			} else {
				Static553.method3371(local17, 0, Static352.anInt6485, 0);
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(IBLclient!ps;)V")
	@Override
	public void method7582(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub29 arg1) {
		if (arg0 == 0) {
			this.anInt8528 = arg1.method5170();
		} else if (arg0 == 1) {
			this.anInt8520 = arg1.method5170();
		} else if (arg0 == 2) {
			this.anInt8512 = arg1.method5229();
		} else if (arg0 == 3) {
			this.anInt8514 = arg1.method5229();
		} else if (arg0 == 4) {
			this.anInt8529 = arg1.method5229();
		} else if (arg0 == 5) {
			this.anInt8521 = arg1.method5229();
		} else if (arg0 == 6) {
			this.anInt8518 = arg1.method5229();
		} else if (arg0 == 7) {
			this.anInt8517 = arg1.method5229();
		}
	}

	@OriginalMember(owner = "client!uc", name = "g", descriptor = "(I)V")
	private void method7128() {
		@Pc(12) Random local12 = new Random((long) this.anInt8520);
		this.anInt8524 = 4096 / this.anInt8520;
		this.anInt8523 = this.anInt8518 / 2;
		this.anInt8516 = 4096 / this.anInt8528;
		@Pc(43) int local43 = this.anInt8516 / 2;
		this.anIntArrayArray77 = new int[this.anInt8520][this.anInt8528 + 1];
		this.anIntArrayArray76 = new int[this.anInt8520][this.anInt8528];
		@Pc(64) int local64 = this.anInt8524 / 2;
		this.anIntArray653 = new int[this.anInt8520 + 1];
		this.anIntArray653[0] = 0;
		for (@Pc(78) int local78 = 0; local78 < this.anInt8520; local78++) {
			@Pc(88) int local88;
			@Pc(100) int local100;
			if (local78 > 0) {
				local88 = this.anInt8524;
				local100 = (Static202.method3259(4096, local12) - 2048) * this.anInt8514 >> 12;
				@Pc(108) int local108 = local88 + (local100 * local64 >> 12);
				this.anIntArray653[local78] = this.anIntArray653[local78 - 1] + local108;
			}
			this.anIntArrayArray77[local78][0] = 0;
			for (local88 = 0; local88 < this.anInt8528; local88++) {
				if (local88 > 0) {
					local100 = this.anInt8516;
					@Pc(151) int local151 = (Static202.method3259(4096, local12) - 2048) * this.anInt8512 >> 12;
					local100 += local43 * local151 >> 12;
					this.anIntArrayArray77[local78][local88] = local100 + this.anIntArrayArray77[local78][local88 - 1];
				}
				this.anIntArrayArray76[local78][local88] = this.anInt8517 <= 0 ? 4096 : 4096 - Static202.method3259(this.anInt8517, local12);
			}
			this.anIntArrayArray77[local78][this.anInt8528] = 4096;
		}
		this.anIntArray653[this.anInt8520] = 4096;
	}
}
