import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ot")
public final class Class6_Sub4_Sub30 extends Class6_Sub4 {

	@OriginalMember(owner = "client!ot", name = "E", descriptor = "I")
	private int anInt7598;

	@OriginalMember(owner = "client!ot", name = "F", descriptor = "[I")
	private int[] anIntArray463;

	@OriginalMember(owner = "client!ot", name = "H", descriptor = "I")
	private int anInt7600;

	@OriginalMember(owner = "client!ot", name = "M", descriptor = "[[I")
	private int[][] anIntArrayArray32;

	@OriginalMember(owner = "client!ot", name = "Q", descriptor = "I")
	private int anInt7607;

	@OriginalMember(owner = "client!ot", name = "T", descriptor = "[[I")
	private int[][] anIntArrayArray33;

	@OriginalMember(owner = "client!ot", name = "J", descriptor = "I")
	private int anInt7602 = 409;

	@OriginalMember(owner = "client!ot", name = "O", descriptor = "I")
	private int anInt7605 = 204;

	@OriginalMember(owner = "client!ot", name = "G", descriptor = "I")
	private int anInt7599 = 8;

	@OriginalMember(owner = "client!ot", name = "U", descriptor = "I")
	private int anInt7610 = 1024;

	@OriginalMember(owner = "client!ot", name = "I", descriptor = "I")
	private int anInt7601 = 1024;

	@OriginalMember(owner = "client!ot", name = "W", descriptor = "I")
	private int anInt7611 = 81;

	@OriginalMember(owner = "client!ot", name = "Z", descriptor = "I")
	private int anInt7614 = 0;

	@OriginalMember(owner = "client!ot", name = "Y", descriptor = "I")
	private int anInt7613 = 4;

	@OriginalMember(owner = "client!ot", name = "<init>", descriptor = "()V")
	public Class6_Sub4_Sub30() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(IILclient!rg;)V")
	@Override
	public void method8314(@OriginalArg(1) int arg0, @OriginalArg(2) Class6_Sub40 arg1) {
		if (arg0 == 0) {
			this.anInt7613 = arg1.method8604();
		} else if (arg0 == 1) {
			this.anInt7599 = arg1.method8604();
		} else if (arg0 == 2) {
			this.anInt7602 = arg1.method8571();
		} else if (arg0 == 3) {
			this.anInt7605 = arg1.method8571();
		} else if (arg0 == 4) {
			this.anInt7610 = arg1.method8571();
		} else if (arg0 == 5) {
			this.anInt7614 = arg1.method8571();
		} else if (arg0 == 6) {
			this.anInt7611 = arg1.method8571();
		} else if (arg0 == 7) {
			this.anInt7601 = arg1.method8571();
		}
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(B)V")
	@Override
	public void method8315() {
		this.method6555();
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(Z)V")
	private void method6555() {
		@Pc(12) Random local12 = new Random((long) this.anInt7599);
		this.anInt7600 = 4096 / this.anInt7599;
		this.anInt7598 = this.anInt7611 / 2;
		this.anInt7607 = 4096 / this.anInt7613;
		@Pc(35) int local35 = this.anInt7607 / 2;
		this.anIntArrayArray32 = new int[this.anInt7599][this.anInt7613 + 1];
		this.anIntArray463 = new int[this.anInt7599 + 1];
		this.anIntArrayArray33 = new int[this.anInt7599][this.anInt7613];
		@Pc(63) int local63 = this.anInt7600 / 2;
		this.anIntArray463[0] = 0;
		for (@Pc(70) int local70 = 0; local70 < this.anInt7599; local70++) {
			@Pc(80) int local80;
			@Pc(92) int local92;
			if (local70 > 0) {
				local80 = this.anInt7600;
				local92 = (Static588.method8281(local12, 4096) - 2048) * this.anInt7605 >> 12;
				@Pc(100) int local100 = local80 + (local92 * local63 >> 12);
				this.anIntArray463[local70] = this.anIntArray463[local70 - 1] + local100;
			}
			this.anIntArrayArray32[local70][0] = 0;
			for (local80 = 0; local80 < this.anInt7613; local80++) {
				if (local80 > 0) {
					local92 = this.anInt7607;
					@Pc(143) int local143 = (Static588.method8281(local12, 4096) - 2048) * this.anInt7602 >> 12;
					local92 += local35 * local143 >> 12;
					this.anIntArrayArray32[local70][local80] = this.anIntArrayArray32[local70][local80 - 1] + local92;
				}
				this.anIntArrayArray33[local70][local80] = this.anInt7601 > 0 ? 4096 - Static588.method8281(local12, this.anInt7601) : 4096;
			}
			this.anIntArrayArray32[local70][this.anInt7613] = 4096;
		}
		this.anIntArray463[this.anInt7599] = 4096;
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method8323(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass372_41.method8736(arg0);
		if (super.aClass372_41.aBoolean691) {
			@Pc(23) int local23 = 0;
			@Pc(30) int local30;
			for (local30 = Static629.anIntArray635[arg0] + this.anInt7614; local30 < 0; local30 += 4096) {
			}
			while (local30 > 4096) {
				local30 -= 4096;
			}
			while (this.anInt7599 > local23 && this.anIntArray463[local23] <= local30) {
				local23++;
			}
			@Pc(60) int local60 = local23 - 1;
			@Pc(68) boolean local68 = (local23 & 0x1) == 0;
			@Pc(73) int local73 = this.anIntArray463[local23];
			@Pc(80) int local80 = this.anIntArray463[local23 - 1];
			if (this.anInt7598 + local80 < local30 && local73 - this.anInt7598 > local30) {
				for (@Pc(98) int local98 = 0; local98 < Static6.anInt111; local98++) {
					@Pc(102) int local102 = 0;
					@Pc(111) int local111 = local68 ? this.anInt7610 : -this.anInt7610;
					@Pc(122) int local122;
					for (local122 = Static284.anIntArray482[local98] + (this.anInt7607 * local111 >> 12); local122 < 0; local122 += 4096) {
					}
					while (local122 > 4096) {
						local122 -= 4096;
					}
					while (this.anInt7613 > local102 && local122 >= this.anIntArrayArray32[local60][local102]) {
						local102++;
					}
					@Pc(163) int local163 = local102 - 1;
					@Pc(170) int local170 = this.anIntArrayArray32[local60][local163];
					@Pc(177) int local177 = this.anIntArrayArray32[local60][local102];
					if (local122 > local170 + this.anInt7598 && local122 < local177 - this.anInt7598) {
						local11[local98] = this.anIntArrayArray33[local60][local163];
					} else {
						local11[local98] = 0;
					}
				}
			} else {
				Static655.method5835(local11, 0, Static6.anInt111, 0);
			}
		}
		return local11;
	}
}
