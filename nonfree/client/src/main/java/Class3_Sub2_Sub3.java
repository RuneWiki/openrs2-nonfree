import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bd")
public final class Class3_Sub2_Sub3 extends Class3_Sub2 {

	@OriginalMember(owner = "client!bd", name = "E", descriptor = "I")
	private int anInt521;

	@OriginalMember(owner = "client!bd", name = "H", descriptor = "I")
	private int anInt524;

	@OriginalMember(owner = "client!bd", name = "M", descriptor = "[I")
	private int[] anIntArray41;

	@OriginalMember(owner = "client!bd", name = "N", descriptor = "[[I")
	private int[][] anIntArrayArray1;

	@OriginalMember(owner = "client!bd", name = "S", descriptor = "[[I")
	private int[][] anIntArrayArray2;

	@OriginalMember(owner = "client!bd", name = "V", descriptor = "I")
	private int anInt532;

	@OriginalMember(owner = "client!bd", name = "G", descriptor = "I")
	private int anInt523 = 81;

	@OriginalMember(owner = "client!bd", name = "F", descriptor = "I")
	private int anInt522 = 204;

	@OriginalMember(owner = "client!bd", name = "U", descriptor = "I")
	private int anInt531 = 409;

	@OriginalMember(owner = "client!bd", name = "T", descriptor = "I")
	private int anInt530 = 1024;

	@OriginalMember(owner = "client!bd", name = "X", descriptor = "I")
	private int anInt534 = 4;

	@OriginalMember(owner = "client!bd", name = "L", descriptor = "I")
	private int anInt527 = 0;

	@OriginalMember(owner = "client!bd", name = "W", descriptor = "I")
	private int anInt533 = 1024;

	@OriginalMember(owner = "client!bd", name = "Y", descriptor = "I")
	private int anInt535 = 8;

	@OriginalMember(owner = "client!bd", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub3() {
		super(0, true);
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(Lclient!dc;II)V")
	@Override
	public void method8663(@OriginalArg(0) Class3_Sub9 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt534 = arg0.method5633();
		} else if (arg1 == 1) {
			this.anInt535 = arg0.method5633();
		} else if (arg1 == 2) {
			this.anInt531 = arg0.method5610();
		} else if (arg1 == 3) {
			this.anInt522 = arg0.method5610();
		} else if (arg1 == 4) {
			this.anInt530 = arg0.method5610();
		} else if (arg1 == 5) {
			this.anInt527 = arg0.method5610();
		} else if (arg1 == 6) {
			this.anInt523 = arg0.method5610();
		} else if (arg1 == 7) {
			this.anInt533 = arg0.method5610();
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8664(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass84_41.method2125(arg0);
		if (super.aClass84_41.aBoolean201) {
			@Pc(22) int local22 = 0;
			@Pc(29) int local29;
			for (local29 = this.anInt527 + Static376.anIntArray665[arg0]; local29 < 0; local29 += 4096) {
			}
			while (local29 > 4096) {
				local29 -= 4096;
			}
			while (local22 < this.anInt535 && this.anIntArray41[local22] <= local29) {
				local22++;
			}
			@Pc(66) int local66 = local22 - 1;
			@Pc(74) boolean local74 = (local22 & 0x1) == 0;
			@Pc(79) int local79 = this.anIntArray41[local22];
			@Pc(86) int local86 = this.anIntArray41[local22 - 1];
			if (local29 > local86 + this.anInt524 && local79 - this.anInt524 > local29) {
				for (@Pc(105) int local105 = 0; local105 < Static201.anInt3738; local105++) {
					@Pc(116) int local116 = local74 ? this.anInt530 : -this.anInt530;
					@Pc(118) int local118 = 0;
					@Pc(129) int local129;
					for (local129 = Static57.anIntArray536[local105] + (local116 * this.anInt521 >> 12); local129 < 0; local129 += 4096) {
					}
					while (local129 > 4096) {
						local129 -= 4096;
					}
					while (this.anInt534 > local118 && this.anIntArrayArray2[local66][local118] <= local129) {
						local118++;
					}
					@Pc(163) int local163 = local118 - 1;
					@Pc(170) int local170 = this.anIntArrayArray2[local66][local118];
					@Pc(177) int local177 = this.anIntArrayArray2[local66][local163];
					if (local177 + this.anInt524 < local129 && local170 - this.anInt524 > local129) {
						local16[local105] = this.anIntArrayArray1[local66][local163];
					} else {
						local16[local105] = 0;
					}
				}
			} else {
				Static651.method751(local16, 0, Static201.anInt3738, 0);
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!bd", name = "e", descriptor = "(Z)V")
	private void method489() {
		@Pc(12) Random local12 = new Random((long) this.anInt535);
		this.anInt524 = this.anInt523 / 2;
		this.anInt532 = 4096 / this.anInt535;
		this.anInt521 = 4096 / this.anInt534;
		@Pc(43) int local43 = this.anInt521 / 2;
		this.anIntArrayArray1 = new int[this.anInt535][this.anInt534];
		this.anIntArray41 = new int[this.anInt535 + 1];
		@Pc(62) int local62 = this.anInt532 / 2;
		this.anIntArrayArray2 = new int[this.anInt535][this.anInt534 + 1];
		this.anIntArray41[0] = 0;
		for (@Pc(78) int local78 = 0; local78 < this.anInt535; local78++) {
			@Pc(88) int local88;
			@Pc(100) int local100;
			if (local78 > 0) {
				local88 = this.anInt532;
				local100 = (Static512.method7419(4096, local12) - 2048) * this.anInt522 >> 12;
				@Pc(108) int local108 = local88 + (local100 * local62 >> 12);
				this.anIntArray41[local78] = local108 + this.anIntArray41[local78 - 1];
			}
			this.anIntArrayArray2[local78][0] = 0;
			for (local88 = 0; local88 < this.anInt534; local88++) {
				if (local88 > 0) {
					local100 = this.anInt521;
					@Pc(151) int local151 = (Static512.method7419(4096, local12) - 2048) * this.anInt531 >> 12;
					local100 += local151 * local43 >> 12;
					this.anIntArrayArray2[local78][local88] = this.anIntArrayArray2[local78][local88 - 1] + local100;
				}
				this.anIntArrayArray1[local78][local88] = this.anInt533 <= 0 ? 4096 : 4096 - Static512.method7419(this.anInt533, local12);
			}
			this.anIntArrayArray2[local78][this.anInt534] = 4096;
		}
		this.anIntArray41[this.anInt535] = 4096;
	}

	@OriginalMember(owner = "client!bd", name = "b", descriptor = "(I)V")
	@Override
	public void method8673() {
		this.method489();
	}
}
