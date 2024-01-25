import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nc")
public final class Class3_Sub2_Sub24 extends Class3_Sub2 {

	@OriginalMember(owner = "client!nc", name = "P", descriptor = "I")
	private int anInt7334;

	@OriginalMember(owner = "client!nc", name = "R", descriptor = "I")
	private int anInt7335;

	@OriginalMember(owner = "client!nc", name = "F", descriptor = "I")
	private int anInt7337;

	@OriginalMember(owner = "client!nc", name = "I", descriptor = "I")
	private int anInt7341;

	@OriginalMember(owner = "client!nc", name = "G", descriptor = "I")
	private int anInt7344;

	@OriginalMember(owner = "client!nc", name = "Q", descriptor = "I")
	private int anInt7347;

	@OriginalMember(owner = "client!nc", name = "H", descriptor = "I")
	private int anInt7339 = 0;

	@OriginalMember(owner = "client!nc", name = "D", descriptor = "I")
	private int anInt7346 = 0;

	@OriginalMember(owner = "client!nc", name = "O", descriptor = "I")
	private int anInt7345 = 0;

	@OriginalMember(owner = "client!nc", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub24() {
		super(1, false);
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(ILclient!rba;I)V")
	@Override
	public void method9214(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub28 arg1) {
		if (arg0 == 0) {
			this.anInt7346 = arg1.method5281();
		} else if (arg0 == 1) {
			this.anInt7339 = (arg1.method5288() << 12) / 100;
		} else if (arg0 == 2) {
			this.anInt7345 = (arg1.method5288() << 12) / 100;
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(IBII)V")
	private void method6149(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(37) int local37 = arg2 > 2048 ? arg2 + arg0 - (arg0 * arg2 >> 12) : (arg0 + 4096) * arg2 >> 12;
		if (local37 <= 0) {
			this.anInt7335 = this.anInt7334 = this.anInt7347 = arg2;
			return;
		}
		@Pc(57) int local57 = arg1 * 6;
		@Pc(64) int local64 = arg2 + arg2 - local37;
		@Pc(73) int local73 = (local37 - local64 << 12) / local37;
		@Pc(77) int local77 = local57 >> 12;
		@Pc(84) int local84 = local57 - (local77 << 12);
		@Pc(92) int local92 = local73 * local37 >> 12;
		@Pc(98) int local98 = local84 * local92 >> 12;
		@Pc(102) int local102 = local98 + local64;
		@Pc(106) int local106 = local37 - local98;
		if (local77 == 0) {
			this.anInt7334 = local102;
			this.anInt7335 = local37;
			this.anInt7347 = local64;
		} else if (local77 == 1) {
			this.anInt7347 = local64;
			this.anInt7335 = local106;
			this.anInt7334 = local37;
		} else if (local77 == 2) {
			this.anInt7334 = local37;
			this.anInt7347 = local102;
			this.anInt7335 = local64;
		} else if (local77 == 3) {
			this.anInt7347 = local37;
			this.anInt7334 = local106;
			this.anInt7335 = local64;
		} else if (local77 == 4) {
			this.anInt7347 = local37;
			this.anInt7334 = local64;
			this.anInt7335 = local102;
		} else if (local77 == 5) {
			this.anInt7347 = local106;
			this.anInt7334 = local64;
			this.anInt7335 = local37;
		}
	}

	@OriginalMember(owner = "client!nc", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method9203(@OriginalArg(1) int arg0) {
		@Pc(13) int[][] local13 = super.aClass36_41.method731(arg0);
		if (super.aClass36_41.aBoolean75) {
			@Pc(31) int[][] local31 = this.method9212(0, arg0);
			@Pc(35) int[] local35 = local31[0];
			@Pc(39) int[] local39 = local31[1];
			@Pc(43) int[] local43 = local31[2];
			@Pc(47) int[] local47 = local13[0];
			@Pc(51) int[] local51 = local13[1];
			@Pc(55) int[] local55 = local13[2];
			for (@Pc(57) int local57 = 0; local57 < Static636.anInt10302; local57++) {
				this.method6151(local43[local57], local35[local57], local39[local57]);
				this.anInt7344 += this.anInt7339;
				this.anInt7341 += this.anInt7345;
				for (this.anInt7337 += this.anInt7346; this.anInt7337 < 0; this.anInt7337 += 4096) {
				}
				if (this.anInt7344 < 0) {
					this.anInt7344 = 0;
				}
				while (this.anInt7337 > 4096) {
					this.anInt7337 -= 4096;
				}
				if (this.anInt7344 > 4096) {
					this.anInt7344 = 4096;
				}
				if (this.anInt7341 < 0) {
					this.anInt7341 = 0;
				}
				if (this.anInt7341 > 4096) {
					this.anInt7341 = 4096;
				}
				this.method6149(this.anInt7344, this.anInt7337, this.anInt7341);
				local47[local57] = this.anInt7335;
				local51[local57] = this.anInt7334;
				local55[local57] = this.anInt7347;
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIII)V")
	private void method6151(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(13) int local13 = arg1 > arg2 ? arg1 : arg2;
		@Pc(21) int local21 = arg0 <= local13 ? local13 : arg0;
		@Pc(33) int local33 = arg1 >= arg2 ? arg2 : arg1;
		@Pc(41) int local41 = arg0 >= local33 ? local33 : arg0;
		this.anInt7341 = (local21 + local41) / 2;
		@Pc(53) int local53 = local21 - local41;
		if (this.anInt7341 > 0 && this.anInt7341 < 4096) {
			this.anInt7344 = (local53 << 12) / (this.anInt7341 > 2048 ? 8192 - (this.anInt7341 * 2) : this.anInt7341 * 2);
		} else {
			this.anInt7344 = 0;
		}
		if (local53 <= 0) {
			this.anInt7337 = 0;
			return;
		}
		@Pc(114) int local114 = (local21 - arg1 << 12) / local53;
		@Pc(123) int local123 = (local21 - arg2 << 12) / local53;
		@Pc(132) int local132 = (local21 - arg0 << 12) / local53;
		if (local21 == arg1) {
			this.anInt7337 = arg2 == local41 ? local132 + 20480 : -local123 + 4096;
		} else if (arg2 == local21) {
			this.anInt7337 = local41 == arg0 ? local114 + 4096 : -local132 + 12288;
		} else {
			this.anInt7337 = local41 == arg1 ? local123 + 12288 : -local114 + 20480;
		}
		this.anInt7337 /= 6;
	}
}
