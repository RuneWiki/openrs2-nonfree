import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mo")
public final class Class4_Sub6_Sub21 extends Class4_Sub6 {

	@OriginalMember(owner = "client!mo", name = "L", descriptor = "[[I")
	private int[][] anIntArrayArray110;

	@OriginalMember(owner = "client!mo", name = "R", descriptor = "[I")
	private int[] anIntArray362;

	@OriginalMember(owner = "client!mo", name = "S", descriptor = "[[I")
	private int[][] anIntArrayArray111;

	@OriginalMember(owner = "client!mo", name = "T", descriptor = "I")
	private int anInt4234;

	@OriginalMember(owner = "client!mo", name = "db", descriptor = "I")
	private int anInt4241;

	@OriginalMember(owner = "client!mo", name = "fb", descriptor = "I")
	private int anInt4243;

	@OriginalMember(owner = "client!mo", name = "M", descriptor = "I")
	private int anInt4230 = 8;

	@OriginalMember(owner = "client!mo", name = "K", descriptor = "I")
	private int anInt4229 = 204;

	@OriginalMember(owner = "client!mo", name = "Y", descriptor = "I")
	private int anInt4238 = 1024;

	@OriginalMember(owner = "client!mo", name = "V", descriptor = "I")
	private int anInt4235 = 409;

	@OriginalMember(owner = "client!mo", name = "eb", descriptor = "I")
	private int anInt4242 = 1024;

	@OriginalMember(owner = "client!mo", name = "X", descriptor = "I")
	private int anInt4237 = 81;

	@OriginalMember(owner = "client!mo", name = "Z", descriptor = "I")
	private int anInt4239 = 0;

	@OriginalMember(owner = "client!mo", name = "hb", descriptor = "I")
	private int anInt4245 = 4;

	@OriginalMember(owner = "client!mo", name = "<init>", descriptor = "()V")
	public Class4_Sub6_Sub21() {
		super(0, true);
	}

	@OriginalMember(owner = "client!mo", name = "g", descriptor = "(B)V")
	@Override
	public void method5700() {
		this.method3843();
	}

	@OriginalMember(owner = "client!mo", name = "c", descriptor = "(I)V")
	private void method3843() {
		@Pc(12) Random local12 = new Random((long) this.anInt4230);
		this.anInt4243 = 4096 / this.anInt4245;
		this.anInt4241 = this.anInt4237 / 2;
		this.anInt4234 = 4096 / this.anInt4230;
		@Pc(35) int local35 = this.anInt4243 / 2;
		@Pc(40) int local40 = this.anInt4234 / 2;
		this.anIntArrayArray111 = new int[this.anInt4230][this.anInt4245 + 1];
		this.anIntArray362 = new int[this.anInt4230 + 1];
		this.anIntArrayArray110 = new int[this.anInt4230][this.anInt4245];
		this.anIntArray362[0] = 0;
		for (@Pc(70) int local70 = 0; local70 < this.anInt4230; local70++) {
			@Pc(77) int local77;
			@Pc(91) int local91;
			if (local70 > 0) {
				local77 = this.anInt4234;
				local91 = (Static355.method5668(local12, 4096) - 2048) * this.anInt4229 >> 12;
				@Pc(99) int local99 = local77 + (local40 * local91 >> 12);
				this.anIntArray362[local70] = local99 + this.anIntArray362[local70 - 1];
			}
			this.anIntArrayArray111[local70][0] = 0;
			for (local77 = 0; local77 < this.anInt4245; local77++) {
				if (local77 > 0) {
					local91 = this.anInt4243;
					@Pc(139) int local139 = (Static355.method5668(local12, 4096) - 2048) * this.anInt4235 >> 12;
					local91 += local35 * local139 >> 12;
					this.anIntArrayArray111[local70][local77] = this.anIntArrayArray111[local70][local77 - 1] + local91;
				}
				this.anIntArrayArray110[local70][local77] = this.anInt4238 > 0 ? 4096 - Static355.method5668(local12, this.anInt4238) : 4096;
			}
			this.anIntArrayArray111[local70][this.anInt4245] = 4096;
		}
		this.anIntArray362[this.anInt4230] = 4096;
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(IILclient!lf;)V")
	@Override
	public void method5697(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub11 arg1) {
		if (arg0 == 0) {
			this.anInt4245 = arg1.method3440();
		} else if (arg0 == 1) {
			this.anInt4230 = arg1.method3440();
		} else if (arg0 == 2) {
			this.anInt4235 = arg1.method3401();
		} else if (arg0 == 3) {
			this.anInt4229 = arg1.method3401();
		} else if (arg0 == 4) {
			this.anInt4242 = arg1.method3401();
		} else if (arg0 == 5) {
			this.anInt4239 = arg1.method3401();
		} else if (arg0 == 6) {
			this.anInt4237 = arg1.method3401();
		} else if (arg0 == 7) {
			this.anInt4238 = arg1.method3401();
		}
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method5698(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass133_41.method3738(arg0);
		if (super.aClass133_41.aBoolean318) {
			@Pc(25) int local25 = 0;
			@Pc(32) int local32;
			for (local32 = this.anInt4239 + Static128.anIntArray265[arg0]; local32 < 0; local32 += 4096) {
			}
			while (local32 > 4096) {
				local32 -= 4096;
			}
			while (local25 < this.anInt4230 && local32 >= this.anIntArray362[local25]) {
				local25++;
			}
			@Pc(67) int local67 = local25 - 1;
			@Pc(78) boolean local78 = (local25 & 0x1) == 0;
			@Pc(83) int local83 = this.anIntArray362[local25];
			@Pc(90) int local90 = this.anIntArray362[local25 - 1];
			if (local90 + this.anInt4241 < local32 && local83 - this.anInt4241 > local32) {
				for (@Pc(114) int local114 = 0; local114 < Static31.anInt797; local114++) {
					@Pc(118) int local118 = 0;
					@Pc(127) int local127 = local78 ? this.anInt4242 : -this.anInt4242;
					@Pc(138) int local138;
					for (local138 = (this.anInt4243 * local127 >> 12) + Static339.anIntArray4[local114]; local138 < 0; local138 += 4096) {
					}
					while (local138 > 4096) {
						local138 -= 4096;
					}
					while (this.anInt4245 > local118 && local138 >= this.anIntArrayArray111[local67][local118]) {
						local118++;
					}
					@Pc(178) int local178 = local118 - 1;
					@Pc(185) int local185 = this.anIntArrayArray111[local67][local118];
					@Pc(192) int local192 = this.anIntArrayArray111[local67][local178];
					if (this.anInt4241 + local192 < local138 && local185 - this.anInt4241 > local138) {
						local11[local114] = this.anIntArrayArray110[local67][local178];
					} else {
						local11[local114] = 0;
					}
				}
			} else {
				Static359.method763(local11, 0, Static31.anInt797, 0);
			}
		}
		return local11;
	}
}
