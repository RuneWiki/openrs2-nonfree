import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jd")
public final class Class4_Sub4_Sub12 extends Class4_Sub4 {

	@OriginalMember(owner = "client!jd", name = "I", descriptor = "I")
	private int anInt3322;

	@OriginalMember(owner = "client!jd", name = "J", descriptor = "[[I")
	private int[][] anIntArrayArray39;

	@OriginalMember(owner = "client!jd", name = "K", descriptor = "[[I")
	private int[][] anIntArrayArray40;

	@OriginalMember(owner = "client!jd", name = "N", descriptor = "I")
	private int anInt3324;

	@OriginalMember(owner = "client!jd", name = "U", descriptor = "[I")
	private int[] anIntArray257;

	@OriginalMember(owner = "client!jd", name = "W", descriptor = "I")
	private int anInt3332;

	@OriginalMember(owner = "client!jd", name = "M", descriptor = "I")
	private int anInt3323 = 4;

	@OriginalMember(owner = "client!jd", name = "Q", descriptor = "I")
	private int anInt3327 = 1024;

	@OriginalMember(owner = "client!jd", name = "S", descriptor = "I")
	private int anInt3329 = 1024;

	@OriginalMember(owner = "client!jd", name = "R", descriptor = "I")
	private int anInt3328 = 81;

	@OriginalMember(owner = "client!jd", name = "O", descriptor = "I")
	private int anInt3325 = 409;

	@OriginalMember(owner = "client!jd", name = "T", descriptor = "I")
	private int anInt3330 = 204;

	@OriginalMember(owner = "client!jd", name = "X", descriptor = "I")
	private int anInt3333 = 8;

	@OriginalMember(owner = "client!jd", name = "V", descriptor = "I")
	private int anInt3331 = 0;

	@OriginalMember(owner = "client!jd", name = "<init>", descriptor = "()V")
	public Class4_Sub4_Sub12() {
		super(0, true);
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(BILclient!fh;)V")
	@Override
	public void method6046(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub9 arg1) {
		if (arg0 == 0) {
			this.anInt3323 = arg1.method5007();
		} else if (arg0 == 1) {
			this.anInt3333 = arg1.method5007();
		} else if (arg0 == 2) {
			this.anInt3325 = arg1.method5028();
		} else if (arg0 == 3) {
			this.anInt3330 = arg1.method5028();
		} else if (arg0 == 4) {
			this.anInt3327 = arg1.method5028();
		} else if (arg0 == 5) {
			this.anInt3331 = arg1.method5028();
		} else if (arg0 == 6) {
			this.anInt3328 = arg1.method5028();
		} else if (arg0 == 7) {
			this.anInt3329 = arg1.method5028();
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method6037(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass103_41.method1977(arg0);
		if (super.aClass103_41.aBoolean164) {
			@Pc(23) int local23 = 0;
			@Pc(30) int local30;
			for (local30 = Static334.anIntArray437[arg0] + this.anInt3331; local30 < 0; local30 += 4096) {
			}
			while (local30 > 4096) {
				local30 -= 4096;
			}
			while (this.anInt3333 > local23 && local30 >= this.anIntArray257[local23]) {
				local23++;
			}
			@Pc(67) int local67 = local23 - 1;
			@Pc(75) boolean local75 = (local23 & 0x1) == 0;
			@Pc(80) int local80 = this.anIntArray257[local23];
			@Pc(87) int local87 = this.anIntArray257[local23 - 1];
			if (this.anInt3332 + local87 < local30 && local30 < local80 - this.anInt3332) {
				for (@Pc(110) int local110 = 0; local110 < Static419.anInt6404; local110++) {
					@Pc(114) int local114 = 0;
					@Pc(123) int local123 = local75 ? this.anInt3327 : -this.anInt3327;
					@Pc(134) int local134;
					for (local134 = Static226.anIntArray284[local110] + (this.anInt3324 * local123 >> 12); local134 < 0; local134 += 4096) {
					}
					while (local134 > 4096) {
						local134 -= 4096;
					}
					while (this.anInt3323 > local114 && local134 >= this.anIntArrayArray40[local67][local114]) {
						local114++;
					}
					@Pc(166) int local166 = local114 - 1;
					@Pc(173) int local173 = this.anIntArrayArray40[local67][local166];
					@Pc(180) int local180 = this.anIntArrayArray40[local67][local114];
					if (local134 > this.anInt3332 + local173 && local180 - this.anInt3332 > local134) {
						local11[local110] = this.anIntArrayArray39[local67][local166];
					} else {
						local11[local110] = 0;
					}
				}
			} else {
				Static461.method1986(local11, 0, Static419.anInt6404, 0);
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!jd", name = "b", descriptor = "(Z)V")
	@Override
	public void method6038() {
		this.method2529();
	}

	@OriginalMember(owner = "client!jd", name = "e", descriptor = "(I)V")
	private void method2529() {
		@Pc(12) Random local12 = new Random((long) this.anInt3333);
		this.anInt3324 = 4096 / this.anInt3323;
		this.anInt3322 = 4096 / this.anInt3333;
		this.anInt3332 = this.anInt3328 / 2;
		@Pc(35) int local35 = this.anInt3324 / 2;
		this.anIntArrayArray39 = new int[this.anInt3333][this.anInt3323];
		@Pc(47) int local47 = this.anInt3322 / 2;
		this.anIntArrayArray40 = new int[this.anInt3333][this.anInt3323 + 1];
		this.anIntArray257 = new int[this.anInt3333 + 1];
		this.anIntArray257[0] = 0;
		for (@Pc(70) int local70 = 0; local70 < this.anInt3333; local70++) {
			@Pc(80) int local80;
			@Pc(92) int local92;
			if (local70 > 0) {
				local80 = this.anInt3322;
				local92 = (Static425.method5717(local12, 4096) - 2048) * this.anInt3330 >> 12;
				@Pc(100) int local100 = local80 + (local92 * local47 >> 12);
				this.anIntArray257[local70] = local100 + this.anIntArray257[local70 - 1];
			}
			this.anIntArrayArray40[local70][0] = 0;
			for (local80 = 0; local80 < this.anInt3323; local80++) {
				if (local80 > 0) {
					local92 = this.anInt3324;
					@Pc(143) int local143 = (Static425.method5717(local12, 4096) - 2048) * this.anInt3325 >> 12;
					local92 += local143 * local35 >> 12;
					this.anIntArrayArray40[local70][local80] = local92 + this.anIntArrayArray40[local70][local80 - 1];
				}
				this.anIntArrayArray39[local70][local80] = this.anInt3329 > 0 ? 4096 - Static425.method5717(local12, this.anInt3329) : 4096;
			}
			this.anIntArrayArray40[local70][this.anInt3323] = 4096;
		}
		this.anIntArray257[this.anInt3333] = 4096;
	}
}
