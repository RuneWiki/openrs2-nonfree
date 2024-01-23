import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!e")
public final class Class2_Sub1_Sub7 extends Class2_Sub1 {

	@OriginalMember(owner = "client!e", name = "T", descriptor = "[[I")
	private int[][] anIntArrayArray11;

	@OriginalMember(owner = "client!e", name = "W", descriptor = "[I")
	private int[] anIntArray105;

	@OriginalMember(owner = "client!e", name = "db", descriptor = "I")
	private int anInt1257;

	@OriginalMember(owner = "client!e", name = "hb", descriptor = "I")
	private int anInt1261;

	@OriginalMember(owner = "client!e", name = "jb", descriptor = "[[I")
	private int[][] anIntArrayArray12;

	@OriginalMember(owner = "client!e", name = "lb", descriptor = "I")
	private int anInt1264;

	@OriginalMember(owner = "client!e", name = "V", descriptor = "I")
	private int anInt1251 = 1024;

	@OriginalMember(owner = "client!e", name = "X", descriptor = "I")
	private int anInt1252 = 409;

	@OriginalMember(owner = "client!e", name = "S", descriptor = "I")
	private int anInt1249 = 0;

	@OriginalMember(owner = "client!e", name = "eb", descriptor = "I")
	private int anInt1258 = 81;

	@OriginalMember(owner = "client!e", name = "nb", descriptor = "I")
	private int anInt1266 = 4;

	@OriginalMember(owner = "client!e", name = "ob", descriptor = "I")
	private int anInt1267 = 1024;

	@OriginalMember(owner = "client!e", name = "pb", descriptor = "I")
	private int anInt1268 = 8;

	@OriginalMember(owner = "client!e", name = "gb", descriptor = "I")
	private int anInt1260 = 204;

	@OriginalMember(owner = "client!e", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub7() {
		super(0, true);
	}

	@OriginalMember(owner = "client!e", name = "e", descriptor = "(I)V")
	private void method881() {
		@Pc(8) Random local8 = new Random((long) this.anInt1268);
		this.anIntArrayArray12 = new int[this.anInt1268][this.anInt1266];
		this.anIntArrayArray11 = new int[this.anInt1268][this.anInt1266 + 1];
		this.anInt1264 = 4096 / this.anInt1266;
		this.anInt1257 = this.anInt1258 / 2;
		this.anIntArray105 = new int[this.anInt1268 + 1];
		this.anIntArray105[0] = 0;
		this.anInt1261 = 4096 / this.anInt1268;
		@Pc(59) int local59 = this.anInt1264 / 2;
		@Pc(64) int local64 = this.anInt1261 / 2;
		for (@Pc(70) int local70 = 0; local70 < this.anInt1268; local70++) {
			@Pc(80) int local80;
			@Pc(92) int local92;
			if (local70 > 0) {
				local80 = this.anInt1261;
				local92 = (Static105.method1788(4096, local8) - 2048) * this.anInt1260 >> 12;
				@Pc(100) int local100 = local80 + (local64 * local92 >> 12);
				this.anIntArray105[local70] = local100 + this.anIntArray105[local70 - 1];
			}
			this.anIntArrayArray11[local70][0] = 0;
			for (local80 = 0; local80 < this.anInt1266; local80++) {
				if (local80 > 0) {
					local92 = this.anInt1264;
					@Pc(143) int local143 = (Static105.method1788(4096, local8) - 2048) * this.anInt1252 >> 12;
					local92 += local143 * local59 >> 12;
					this.anIntArrayArray11[local70][local80] = local92 + this.anIntArrayArray11[local70][local80 - 1];
				}
				this.anIntArrayArray12[local70][local80] = this.anInt1267 <= 0 ? 4096 : 4096 - Static105.method1788(this.anInt1267, local8);
			}
			this.anIntArrayArray11[local70][this.anInt1266] = 4096;
		}
		this.anIntArray105[this.anInt1268] = 4096;
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(Lclient!ea;II)V")
	@Override
	public void method3204(@OriginalArg(0) Class2_Sub3 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt1266 = arg0.method209();
		} else if (arg1 == 1) {
			this.anInt1268 = arg0.method209();
		} else if (arg1 == 2) {
			this.anInt1252 = arg0.method163();
		} else if (arg1 == 3) {
			this.anInt1260 = arg0.method163();
		} else if (arg1 == 4) {
			this.anInt1251 = arg0.method163();
		} else if (arg1 == 5) {
			this.anInt1249 = arg0.method163();
		} else if (arg1 == 6) {
			this.anInt1258 = arg0.method163();
		} else if (arg1 == 7) {
			this.anInt1267 = arg0.method163();
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3201(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass73_41.method2249(arg0);
		if (super.aClass73_41.aBoolean188) {
			@Pc(25) int local25 = 0;
			@Pc(32) int local32;
			for (local32 = this.anInt1249 + Static97.anIntArray240[arg0]; local32 < 0; local32 += 4096) {
			}
			while (local32 > 4096) {
				local32 -= 4096;
			}
			while (this.anInt1268 > local25 && local32 >= this.anIntArray105[local25]) {
				local25++;
			}
			@Pc(68) int local68 = this.anIntArray105[local25];
			@Pc(76) boolean local76 = (local25 & 0x1) == 0;
			@Pc(80) int local80 = local25 - 1;
			@Pc(87) int local87 = this.anIntArray105[local25 - 1];
			if (local32 > this.anInt1257 + local87 && local68 - this.anInt1257 > local32) {
				for (@Pc(106) int local106 = 0; local106 < Static62.anInt1675; local106++) {
					@Pc(117) int local117 = local76 ? this.anInt1251 : -this.anInt1251;
					@Pc(119) int local119 = 0;
					@Pc(130) int local130;
					for (local130 = (local117 * this.anInt1264 >> 12) + Static20.anIntArray45[local106]; local130 < 0; local130 += 4096) {
					}
					while (local130 > 4096) {
						local130 -= 4096;
					}
					while (this.anInt1266 > local119 && this.anIntArrayArray11[local80][local119] <= local130) {
						local119++;
					}
					@Pc(167) int local167 = this.anIntArrayArray11[local80][local119];
					@Pc(171) int local171 = local119 - 1;
					@Pc(178) int local178 = this.anIntArrayArray11[local80][local171];
					if (local178 + this.anInt1257 < local130 && local130 < local167 - this.anInt1257) {
						local19[local106] = this.anIntArrayArray12[local80][local171];
					} else {
						local19[local106] = 0;
					}
				}
			} else {
				Static225.method1840(local19, 0, Static62.anInt1675, 0);
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!e", name = "b", descriptor = "(B)V")
	@Override
	public void method3207() {
		this.method881();
	}
}
