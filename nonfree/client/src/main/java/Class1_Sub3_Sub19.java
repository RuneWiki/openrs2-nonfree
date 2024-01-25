import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ld")
public final class Class1_Sub3_Sub19 extends Class1_Sub3 {

	@OriginalMember(owner = "client!ld", name = "M", descriptor = "[[I")
	private int[][] anIntArrayArray112;

	@OriginalMember(owner = "client!ld", name = "N", descriptor = "I")
	private int anInt4061;

	@OriginalMember(owner = "client!ld", name = "S", descriptor = "I")
	private int anInt4066;

	@OriginalMember(owner = "client!ld", name = "U", descriptor = "I")
	private int anInt4068;

	@OriginalMember(owner = "client!ld", name = "bb", descriptor = "[I")
	private int[] anIntArray329;

	@OriginalMember(owner = "client!ld", name = "eb", descriptor = "[[I")
	private int[][] anIntArrayArray113;

	@OriginalMember(owner = "client!ld", name = "O", descriptor = "I")
	private int anInt4062 = 409;

	@OriginalMember(owner = "client!ld", name = "K", descriptor = "I")
	private int anInt4059 = 204;

	@OriginalMember(owner = "client!ld", name = "W", descriptor = "I")
	private int anInt4070 = 4;

	@OriginalMember(owner = "client!ld", name = "I", descriptor = "I")
	private int anInt4058 = 81;

	@OriginalMember(owner = "client!ld", name = "db", descriptor = "I")
	private int anInt4075 = 1024;

	@OriginalMember(owner = "client!ld", name = "ab", descriptor = "I")
	private int anInt4073 = 1024;

	@OriginalMember(owner = "client!ld", name = "Y", descriptor = "I")
	private int anInt4072 = 8;

	@OriginalMember(owner = "client!ld", name = "R", descriptor = "I")
	private int anInt4065 = 0;

	@OriginalMember(owner = "client!ld", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub19() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method6084(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass172_41.method3962(arg0);
		if (super.aClass172_41.aBoolean327) {
			@Pc(27) int local27 = 0;
			@Pc(34) int local34;
			for (local34 = this.anInt4065 + Static342.anIntArray469[arg0]; local34 < 0; local34 += 4096) {
			}
			while (local34 > 4096) {
				local34 -= 4096;
			}
			while (local27 < this.anInt4072 && this.anIntArray329[local27] <= local34) {
				local27++;
			}
			@Pc(72) int local72 = local27 - 1;
			@Pc(80) boolean local80 = (local27 & 0x1) == 0;
			@Pc(85) int local85 = this.anIntArray329[local27];
			@Pc(92) int local92 = this.anIntArray329[local27 - 1];
			if (local34 > local92 + this.anInt4066 && local34 < local85 - this.anInt4066) {
				for (@Pc(115) int local115 = 0; local115 < Static347.anInt5974; local115++) {
					@Pc(119) int local119 = 0;
					@Pc(128) int local128 = local80 ? this.anInt4075 : -this.anInt4075;
					@Pc(139) int local139;
					for (local139 = (local128 * this.anInt4061 >> 12) + Static384.anIntArray551[local115]; local139 < 0; local139 += 4096) {
					}
					while (local139 > 4096) {
						local139 -= 4096;
					}
					while (local119 < this.anInt4070 && local139 >= this.anIntArrayArray112[local72][local119]) {
						local119++;
					}
					@Pc(179) int local179 = local119 - 1;
					@Pc(186) int local186 = this.anIntArrayArray112[local72][local119];
					@Pc(193) int local193 = this.anIntArrayArray112[local72][local179];
					if (local139 > this.anInt4066 + local193 && local139 < local186 - this.anInt4066) {
						local11[local115] = this.anIntArrayArray113[local72][local179];
					} else {
						local11[local115] = 0;
					}
				}
			} else {
				Static460.method4215(local11, 0, Static347.anInt5974, 0);
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ld", name = "d", descriptor = "(I)V")
	@Override
	public void method6074() {
		this.method3381();
	}

	@OriginalMember(owner = "client!ld", name = "g", descriptor = "(I)V")
	private void method3381() {
		@Pc(12) Random local12 = new Random((long) this.anInt4072);
		this.anInt4068 = 4096 / this.anInt4072;
		this.anInt4061 = 4096 / this.anInt4070;
		this.anInt4066 = this.anInt4058 / 2;
		@Pc(35) int local35 = this.anInt4061 / 2;
		this.anIntArrayArray113 = new int[this.anInt4072][this.anInt4070];
		this.anIntArrayArray112 = new int[this.anInt4072][this.anInt4070 + 1];
		@Pc(56) int local56 = this.anInt4068 / 2;
		this.anIntArray329 = new int[this.anInt4072 + 1];
		this.anIntArray329[0] = 0;
		for (@Pc(76) int local76 = 0; local76 < this.anInt4072; local76++) {
			@Pc(86) int local86;
			@Pc(98) int local98;
			if (local76 > 0) {
				local86 = this.anInt4068;
				local98 = (Static301.method3334(4096, local12) - 2048) * this.anInt4059 >> 12;
				@Pc(106) int local106 = local86 + (local56 * local98 >> 12);
				this.anIntArray329[local76] = this.anIntArray329[local76 - 1] + local106;
			}
			this.anIntArrayArray112[local76][0] = 0;
			for (local86 = 0; local86 < this.anInt4070; local86++) {
				if (local86 > 0) {
					local98 = this.anInt4061;
					@Pc(150) int local150 = (Static301.method3334(4096, local12) - 2048) * this.anInt4062 >> 12;
					local98 += local150 * local35 >> 12;
					this.anIntArrayArray112[local76][local86] = local98 + this.anIntArrayArray112[local76][local86 - 1];
				}
				this.anIntArrayArray113[local76][local86] = this.anInt4073 > 0 ? 4096 - Static301.method3334(this.anInt4073, local12) : 4096;
			}
			this.anIntArrayArray112[local76][this.anInt4070] = 4096;
		}
		this.anIntArray329[this.anInt4072] = 4096;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(Lclient!lh;II)V")
	@Override
	public void method6079(@OriginalArg(0) Class1_Sub1 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt4070 = arg0.method4130();
		} else if (arg1 == 1) {
			this.anInt4072 = arg0.method4130();
		} else if (arg1 == 2) {
			this.anInt4062 = arg0.method4093();
		} else if (arg1 == 3) {
			this.anInt4059 = arg0.method4093();
		} else if (arg1 == 4) {
			this.anInt4075 = arg0.method4093();
		} else if (arg1 == 5) {
			this.anInt4065 = arg0.method4093();
		} else if (arg1 == 6) {
			this.anInt4058 = arg0.method4093();
		} else if (arg1 == 7) {
			this.anInt4073 = arg0.method4093();
		}
	}
}
