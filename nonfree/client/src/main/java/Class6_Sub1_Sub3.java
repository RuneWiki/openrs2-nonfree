import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ck")
public final class Class6_Sub1_Sub3 extends Class6_Sub1 {

	@OriginalMember(owner = "client!ck", name = "E", descriptor = "I")
	private int anInt1569;

	@OriginalMember(owner = "client!ck", name = "F", descriptor = "[[I")
	private int[][] anIntArrayArray10;

	@OriginalMember(owner = "client!ck", name = "K", descriptor = "[[I")
	private int[][] anIntArrayArray11;

	@OriginalMember(owner = "client!ck", name = "P", descriptor = "[I")
	private int[] anIntArray107;

	@OriginalMember(owner = "client!ck", name = "R", descriptor = "I")
	private int anInt1578;

	@OriginalMember(owner = "client!ck", name = "U", descriptor = "I")
	private int anInt1581;

	@OriginalMember(owner = "client!ck", name = "D", descriptor = "I")
	private int anInt1568 = 81;

	@OriginalMember(owner = "client!ck", name = "L", descriptor = "I")
	private int anInt1573 = 1024;

	@OriginalMember(owner = "client!ck", name = "O", descriptor = "I")
	private int anInt1576 = 409;

	@OriginalMember(owner = "client!ck", name = "N", descriptor = "I")
	private int anInt1575 = 1024;

	@OriginalMember(owner = "client!ck", name = "T", descriptor = "I")
	private int anInt1580 = 8;

	@OriginalMember(owner = "client!ck", name = "H", descriptor = "I")
	private int anInt1570 = 4;

	@OriginalMember(owner = "client!ck", name = "W", descriptor = "I")
	private int anInt1583 = 0;

	@OriginalMember(owner = "client!ck", name = "V", descriptor = "I")
	private int anInt1582 = 204;

	@OriginalMember(owner = "client!ck", name = "<init>", descriptor = "()V")
	public Class6_Sub1_Sub3() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ck", name = "i", descriptor = "(I)V")
	private void method1398() {
		@Pc(16) Random local16 = new Random((long) this.anInt1580);
		this.anInt1578 = 4096 / this.anInt1570;
		this.anInt1569 = this.anInt1568 / 2;
		this.anInt1581 = 4096 / this.anInt1580;
		@Pc(39) int local39 = this.anInt1578 / 2;
		this.anIntArrayArray10 = new int[this.anInt1580][this.anInt1570];
		this.anIntArrayArray11 = new int[this.anInt1580][this.anInt1570 + 1];
		this.anIntArray107 = new int[this.anInt1580 + 1];
		@Pc(67) int local67 = this.anInt1581 / 2;
		this.anIntArray107[0] = 0;
		for (@Pc(74) int local74 = 0; local74 < this.anInt1580; local74++) {
			@Pc(84) int local84;
			@Pc(96) int local96;
			if (local74 > 0) {
				local84 = this.anInt1581;
				local96 = (Static326.method5252(local16, 4096) - 2048) * this.anInt1582 >> 12;
				@Pc(104) int local104 = local84 + (local96 * local67 >> 12);
				this.anIntArray107[local74] = local104 + this.anIntArray107[local74 - 1];
			}
			this.anIntArrayArray11[local74][0] = 0;
			for (local84 = 0; local84 < this.anInt1570; local84++) {
				if (local84 > 0) {
					local96 = this.anInt1578;
					@Pc(144) int local144 = (Static326.method5252(local16, 4096) - 2048) * this.anInt1576 >> 12;
					local96 += local144 * local39 >> 12;
					this.anIntArrayArray11[local74][local84] = local96 + this.anIntArrayArray11[local74][local84 - 1];
				}
				this.anIntArrayArray10[local74][local84] = this.anInt1573 <= 0 ? 4096 : 4096 - Static326.method5252(local16, this.anInt1573);
			}
			this.anIntArrayArray11[local74][this.anInt1570] = 4096;
		}
		this.anIntArray107[this.anInt1580] = 4096;
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8159(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass187_41.method4597(arg0);
		if (super.aClass187_41.aBoolean403) {
			@Pc(17) int local17 = 0;
			@Pc(24) int local24;
			for (local24 = this.anInt1583 + Static346.anIntArray472[arg0]; local24 < 0; local24 += 4096) {
			}
			while (local24 > 4096) {
				local24 -= 4096;
			}
			while (local17 < this.anInt1580 && local24 >= this.anIntArray107[local17]) {
				local17++;
			}
			@Pc(65) int local65 = local17 - 1;
			@Pc(76) boolean local76 = (local17 & 0x1) == 0;
			@Pc(81) int local81 = this.anIntArray107[local17];
			@Pc(88) int local88 = this.anIntArray107[local17 - 1];
			if (local24 > local88 + this.anInt1569 && local81 - this.anInt1569 > local24) {
				for (@Pc(110) int local110 = 0; local110 < Static289.anInt5549; local110++) {
					@Pc(121) int local121 = local76 ? this.anInt1575 : -this.anInt1575;
					@Pc(123) int local123 = 0;
					@Pc(134) int local134;
					for (local134 = (local121 * this.anInt1578 >> 12) + Static473.anIntArray730[local110]; local134 < 0; local134 += 4096) {
					}
					while (local134 > 4096) {
						local134 -= 4096;
					}
					while (local123 < this.anInt1570 && this.anIntArrayArray11[local65][local123] <= local134) {
						local123++;
					}
					@Pc(174) int local174 = local123 - 1;
					@Pc(181) int local181 = this.anIntArrayArray11[local65][local174];
					@Pc(188) int local188 = this.anIntArrayArray11[local65][local123];
					if (local134 > this.anInt1569 + local181 && local188 - this.anInt1569 > local134) {
						local11[local110] = this.anIntArrayArray10[local65][local174];
					} else {
						local11[local110] = 0;
					}
				}
			} else {
				Static589.method5379(local11, 0, Static289.anInt5549, 0);
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(I)V")
	@Override
	public void method8160() {
		this.method1398();
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(ILclient!iaa;Z)V")
	@Override
	public void method8167(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub26 arg1) {
		if (arg0 == 0) {
			this.anInt1570 = arg1.method4966();
		} else if (arg0 == 1) {
			this.anInt1580 = arg1.method4966();
		} else if (arg0 == 2) {
			this.anInt1576 = arg1.method4999();
		} else if (arg0 == 3) {
			this.anInt1582 = arg1.method4999();
		} else if (arg0 == 4) {
			this.anInt1575 = arg1.method4999();
		} else if (arg0 == 5) {
			this.anInt1583 = arg1.method4999();
		} else if (arg0 == 6) {
			this.anInt1568 = arg1.method4999();
		} else if (arg0 == 7) {
			this.anInt1573 = arg1.method4999();
		}
	}
}
