import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qr")
public final class Class2_Sub11_Sub23 extends Class2_Sub11 {

	@OriginalMember(owner = "client!qr", name = "K", descriptor = "[[I")
	private int[][] anIntArrayArray54;

	@OriginalMember(owner = "client!qr", name = "X", descriptor = "I")
	private int anInt8426;

	@OriginalMember(owner = "client!qr", name = "O", descriptor = "I")
	private int anInt8427;

	@OriginalMember(owner = "client!qr", name = "S", descriptor = "[I")
	private int[] anIntArray599;

	@OriginalMember(owner = "client!qr", name = "U", descriptor = "I")
	private int anInt8436;

	@OriginalMember(owner = "client!qr", name = "V", descriptor = "[[I")
	private int[][] anIntArrayArray55;

	@OriginalMember(owner = "client!qr", name = "G", descriptor = "I")
	private int anInt8428 = 1024;

	@OriginalMember(owner = "client!qr", name = "I", descriptor = "I")
	private int anInt8431 = 4;

	@OriginalMember(owner = "client!qr", name = "J", descriptor = "I")
	private int anInt8433 = 1024;

	@OriginalMember(owner = "client!qr", name = "M", descriptor = "I")
	private int anInt8435 = 204;

	@OriginalMember(owner = "client!qr", name = "R", descriptor = "I")
	private int anInt8434 = 409;

	@OriginalMember(owner = "client!qr", name = "P", descriptor = "I")
	private int anInt8437 = 0;

	@OriginalMember(owner = "client!qr", name = "Q", descriptor = "I")
	private int anInt8438 = 81;

	@OriginalMember(owner = "client!qr", name = "N", descriptor = "I")
	private int anInt8439 = 8;

	@OriginalMember(owner = "client!qr", name = "<init>", descriptor = "()V")
	public Class2_Sub11_Sub23() {
		super(0, true);
	}

	@OriginalMember(owner = "client!qr", name = "b", descriptor = "(B)V")
	@Override
	public void method9530() {
		this.method7480();
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method9531(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass174_41.method3748(arg0, 1);
		if (super.aClass174_41.aBoolean369) {
			@Pc(25) int local25 = 0;
			@Pc(32) int local32;
			for (local32 = Static137.anIntArray170[arg0] + this.anInt8437; local32 < 0; local32 += 4096) {
			}
			while (local32 > 4096) {
				local32 -= 4096;
			}
			while (this.anInt8439 > local25 && this.anIntArray599[local25] <= local32) {
				local25++;
			}
			@Pc(75) int local75 = local25 - 1;
			@Pc(86) boolean local86 = (local25 & 0x1) == 0;
			@Pc(91) int local91 = this.anIntArray599[local25];
			@Pc(98) int local98 = this.anIntArray599[local25 - 1];
			if (this.anInt8436 + local98 < local32 && local32 < local91 - this.anInt8436) {
				for (@Pc(118) int local118 = 0; local118 < Static301.anInt10214; local118++) {
					@Pc(122) int local122 = 0;
					@Pc(132) int local132 = local86 ? this.anInt8433 : -this.anInt8433;
					@Pc(143) int local143;
					for (local143 = (this.anInt8426 * local132 >> 12) + Static523.anIntArray461[local118]; local143 < 0; local143 += 4096) {
					}
					while (local143 > 4096) {
						local143 -= 4096;
					}
					while (this.anInt8431 > local122 && local143 >= this.anIntArrayArray54[local75][local122]) {
						local122++;
					}
					@Pc(193) int local193 = local122 - 1;
					@Pc(200) int local200 = this.anIntArrayArray54[local75][local193];
					@Pc(207) int local207 = this.anIntArrayArray54[local75][local122];
					if (local143 > local200 + this.anInt8436 && local143 < local207 - this.anInt8436) {
						local19[local118] = this.anIntArrayArray55[local75][local193];
					} else {
						local19[local118] = 0;
					}
				}
			} else {
				Static728.method275(local19, 0, Static301.anInt10214, 0);
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(ILclient!et;Z)V")
	@Override
	public void method9532(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub20 arg1) {
		if (arg0 == 0) {
			this.anInt8431 = arg1.method8581(-17416);
		} else if (arg0 == 1) {
			this.anInt8439 = arg1.method8581(-17416);
		} else if (arg0 == 2) {
			this.anInt8434 = arg1.method8575();
		} else if (arg0 == 3) {
			this.anInt8435 = arg1.method8575();
		} else if (arg0 == 4) {
			this.anInt8433 = arg1.method8575();
		} else if (arg0 == 5) {
			this.anInt8437 = arg1.method8575();
		} else if (arg0 == 6) {
			this.anInt8438 = arg1.method8575();
		} else if (arg0 == 7) {
			this.anInt8428 = arg1.method8575();
		}
	}

	@OriginalMember(owner = "client!qr", name = "d", descriptor = "(B)V")
	private void method7480() {
		@Pc(12) Random local12 = new Random((long) this.anInt8439);
		this.anInt8426 = 4096 / this.anInt8431;
		this.anInt8436 = this.anInt8438 / 2;
		this.anInt8427 = 4096 / this.anInt8439;
		@Pc(35) int local35 = this.anInt8426 / 2;
		this.anIntArrayArray55 = new int[this.anInt8439][this.anInt8431];
		@Pc(55) int local55 = this.anInt8427 / 2;
		this.anIntArray599 = new int[this.anInt8439 + 1];
		this.anIntArrayArray54 = new int[this.anInt8439][this.anInt8431 + 1];
		this.anIntArray599[0] = 0;
		for (@Pc(78) int local78 = 0; local78 < this.anInt8439; local78++) {
			@Pc(90) int local90;
			@Pc(102) int local102;
			if (local78 > 0) {
				local90 = this.anInt8427;
				local102 = (Static289.method4068(4096, local12) - 2048) * this.anInt8435 >> 12;
				@Pc(110) int local110 = local90 + (local102 * local55 >> 12);
				this.anIntArray599[local78] = local110 + this.anIntArray599[local78 - 1];
			}
			this.anIntArrayArray54[local78][0] = 0;
			for (local90 = 0; local90 < this.anInt8431; local90++) {
				if (local90 > 0) {
					local102 = this.anInt8426;
					@Pc(152) int local152 = (Static289.method4068(4096, local12) - 2048) * this.anInt8434 >> 12;
					local102 += local152 * local35 >> 12;
					this.anIntArrayArray54[local78][local90] = local102 + this.anIntArrayArray54[local78][local90 - 1];
				}
				this.anIntArrayArray55[local78][local90] = this.anInt8428 > 0 ? 4096 - Static289.method4068(this.anInt8428, local12) : 4096;
			}
			this.anIntArrayArray54[local78][this.anInt8431] = 4096;
		}
		this.anIntArray599[this.anInt8439] = 4096;
	}
}
