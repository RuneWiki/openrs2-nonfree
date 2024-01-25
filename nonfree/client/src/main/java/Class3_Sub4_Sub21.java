import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nt")
public final class Class3_Sub4_Sub21 extends Class3_Sub4 {

	@OriginalMember(owner = "client!nt", name = "K", descriptor = "[[I")
	private int[][] anIntArrayArray41;

	@OriginalMember(owner = "client!nt", name = "L", descriptor = "I")
	private int anInt5098;

	@OriginalMember(owner = "client!nt", name = "T", descriptor = "[I")
	private int[] anIntArray395;

	@OriginalMember(owner = "client!nt", name = "ab", descriptor = "[[I")
	private int[][] anIntArrayArray42;

	@OriginalMember(owner = "client!nt", name = "cb", descriptor = "I")
	private int anInt5112;

	@OriginalMember(owner = "client!nt", name = "ib", descriptor = "I")
	private int anInt5117;

	@OriginalMember(owner = "client!nt", name = "M", descriptor = "I")
	private int anInt5099 = 81;

	@OriginalMember(owner = "client!nt", name = "N", descriptor = "I")
	private int anInt5100 = 0;

	@OriginalMember(owner = "client!nt", name = "P", descriptor = "I")
	private int anInt5102 = 1024;

	@OriginalMember(owner = "client!nt", name = "Z", descriptor = "I")
	private int anInt5110 = 4;

	@OriginalMember(owner = "client!nt", name = "W", descriptor = "I")
	private int anInt5107 = 8;

	@OriginalMember(owner = "client!nt", name = "eb", descriptor = "I")
	private int anInt5114 = 1024;

	@OriginalMember(owner = "client!nt", name = "db", descriptor = "I")
	private int anInt5113 = 204;

	@OriginalMember(owner = "client!nt", name = "Y", descriptor = "I")
	private int anInt5109 = 409;

	static {
		new Class175("That user is not in this channel.", "Dieser Benutzer befindet sich nicht in diesem Chatraum.", "Cet utilisateur n'est pas dans ce canal.", "Esse usuário não está no canal.");
	}

	@OriginalMember(owner = "client!nt", name = "<init>", descriptor = "()V")
	public Class3_Sub4_Sub21() {
		super(0, true);
	}

	@OriginalMember(owner = "client!nt", name = "e", descriptor = "(I)V")
	@Override
	public void method5963() {
		this.method4095();
	}

	@OriginalMember(owner = "client!nt", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method5966(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass146_41.method3700(arg0);
		if (super.aClass146_41.aBoolean342) {
			@Pc(26) int local26 = 0;
			@Pc(33) int local33;
			for (local33 = this.anInt5100 + Static285.anIntArray401[arg0]; local33 < 0; local33 += 4096) {
			}
			while (local33 > 4096) {
				local33 -= 4096;
			}
			while (local26 < this.anInt5107 && local33 >= this.anIntArray395[local26]) {
				local26++;
			}
			@Pc(68) int local68 = local26 - 1;
			@Pc(79) boolean local79 = (local26 & 0x1) == 0;
			@Pc(84) int local84 = this.anIntArray395[local26];
			@Pc(91) int local91 = this.anIntArray395[local26 - 1];
			if (this.anInt5112 + local91 < local33 && local33 < local84 - this.anInt5112) {
				for (@Pc(109) int local109 = 0; local109 < Static106.anInt2356; local109++) {
					@Pc(113) int local113 = 0;
					@Pc(122) int local122 = local79 ? this.anInt5114 : -this.anInt5114;
					@Pc(133) int local133;
					for (local133 = Static382.anIntArray476[local109] + (this.anInt5117 * local122 >> 12); local133 < 0; local133 += 4096) {
					}
					while (local133 > 4096) {
						local133 -= 4096;
					}
					while (this.anInt5110 > local113 && local133 >= this.anIntArrayArray42[local68][local113]) {
						local113++;
					}
					@Pc(167) int local167 = local113 - 1;
					@Pc(174) int local174 = this.anIntArrayArray42[local68][local113];
					@Pc(181) int local181 = this.anIntArrayArray42[local68][local167];
					if (local181 + this.anInt5112 < local133 && local174 - this.anInt5112 > local133) {
						local11[local109] = this.anIntArrayArray41[local68][local167];
					} else {
						local11[local109] = 0;
					}
				}
			} else {
				Static464.method5795(local11, 0, Static106.anInt2356, 0);
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!nt", name = "e", descriptor = "(B)V")
	private void method4095() {
		@Pc(12) Random local12 = new Random((long) this.anInt5107);
		this.anInt5117 = 4096 / this.anInt5110;
		this.anInt5112 = this.anInt5099 / 2;
		this.anInt5098 = 4096 / this.anInt5107;
		@Pc(35) int local35 = this.anInt5117 / 2;
		@Pc(40) int local40 = this.anInt5098 / 2;
		this.anIntArrayArray42 = new int[this.anInt5107][this.anInt5110 + 1];
		this.anIntArrayArray41 = new int[this.anInt5107][this.anInt5110];
		this.anIntArray395 = new int[this.anInt5107 + 1];
		this.anIntArray395[0] = 0;
		for (@Pc(75) int local75 = 0; local75 < this.anInt5107; local75++) {
			@Pc(82) int local82;
			@Pc(94) int local94;
			if (local75 > 0) {
				local82 = this.anInt5098;
				local94 = (Static36.method851(local12, 4096) - 2048) * this.anInt5113 >> 12;
				@Pc(102) int local102 = local82 + (local94 * local40 >> 12);
				this.anIntArray395[local75] = this.anIntArray395[local75 - 1] + local102;
			}
			this.anIntArrayArray42[local75][0] = 0;
			for (local82 = 0; local82 < this.anInt5110; local82++) {
				if (local82 > 0) {
					local94 = this.anInt5117;
					@Pc(145) int local145 = (Static36.method851(local12, 4096) - 2048) * this.anInt5109 >> 12;
					local94 += local145 * local35 >> 12;
					this.anIntArrayArray42[local75][local82] = this.anIntArrayArray42[local75][local82 - 1] + local94;
				}
				this.anIntArrayArray41[local75][local82] = this.anInt5102 <= 0 ? 4096 : 4096 - Static36.method851(local12, this.anInt5102);
			}
			this.anIntArrayArray42[local75][this.anInt5110] = 4096;
		}
		this.anIntArray395[this.anInt5107] = 4096;
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(IILclient!bt;)V")
	@Override
	public void method5958(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub2 arg1) {
		if (arg0 == 0) {
			this.anInt5110 = arg1.method6053();
		} else if (arg0 == 1) {
			this.anInt5107 = arg1.method6053();
		} else if (arg0 == 2) {
			this.anInt5109 = arg1.method6004();
		} else if (arg0 == 3) {
			this.anInt5113 = arg1.method6004();
		} else if (arg0 == 4) {
			this.anInt5114 = arg1.method6004();
		} else if (arg0 == 5) {
			this.anInt5100 = arg1.method6004();
		} else if (arg0 == 6) {
			this.anInt5099 = arg1.method6004();
		} else if (arg0 == 7) {
			this.anInt5102 = arg1.method6004();
		}
	}
}
