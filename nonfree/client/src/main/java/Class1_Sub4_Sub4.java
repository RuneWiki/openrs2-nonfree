import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dg")
public final class Class1_Sub4_Sub4 extends Class1_Sub4 {

	@OriginalMember(owner = "client!dg", name = "Z", descriptor = "[I")
	private int[] anIntArray67;

	@OriginalMember(owner = "client!dg", name = "bb", descriptor = "[[I")
	private int[][] anIntArrayArray24;

	@OriginalMember(owner = "client!dg", name = "eb", descriptor = "[[I")
	private int[][] anIntArrayArray25;

	@OriginalMember(owner = "client!dg", name = "kb", descriptor = "I")
	private int anInt1066;

	@OriginalMember(owner = "client!dg", name = "mb", descriptor = "I")
	private int anInt1068;

	@OriginalMember(owner = "client!dg", name = "wb", descriptor = "I")
	private int anInt1076;

	@OriginalMember(owner = "client!dg", name = "nb", descriptor = "I")
	private int anInt1069;

	@OriginalMember(owner = "client!dg", name = "ab", descriptor = "I")
	private int anInt1059;

	@OriginalMember(owner = "client!dg", name = "ob", descriptor = "I")
	private int anInt1070;

	@OriginalMember(owner = "client!dg", name = "tb", descriptor = "I")
	private int anInt1073;

	@OriginalMember(owner = "client!dg", name = "ub", descriptor = "I")
	private int anInt1074;

	@OriginalMember(owner = "client!dg", name = "hb", descriptor = "I")
	private int anInt1064;

	@OriginalMember(owner = "client!dg", name = "vb", descriptor = "I")
	private int anInt1075;

	@OriginalMember(owner = "client!dg", name = "ib", descriptor = "I")
	private int anInt1065;

	@OriginalMember(owner = "client!dg", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method3216(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass39_38.method1880(arg0);
		if (super.aClass39_38.aBoolean110) {
			@Pc(22) int local22;
			for (local22 = Static150.anIntArray383[arg0] + this.anInt1074; local22 < 0; local22 += 4096) {
			}
			@Pc(32) int local32 = 0;
			while (local22 > 4096) {
				local22 -= 4096;
			}
			while (local32 < this.anInt1064 && local22 >= this.anIntArray67[local32]) {
				local32++;
			}
			@Pc(61) float local61 = (float) this.anIntArray67[local32];
			@Pc(69) float local69 = (float) this.anIntArray67[local32 - 1];
			if ((float) this.anInt1068 + local69 < (float) local22 && local61 - (float) this.anInt1068 > (float) local22) {
				for (@Pc(96) int local96 = 0; local96 < Static73.anInt1888; local96++) {
					@Pc(100) int local100 = 0;
					@Pc(111) int local111 = local32 % 2 == 0 ? this.anInt1073 : -this.anInt1073;
					@Pc(122) int local122;
					for (local122 = (local111 * this.anInt1066 >> 12) + Static171.anIntArray421[local96]; local122 < 0; local122 += 4096) {
					}
					while (local122 > 4096) {
						local122 -= 4096;
					}
					while (this.anInt1069 > local100 && local122 >= this.anIntArrayArray25[local32 - 1][local100]) {
						local100++;
					}
					@Pc(167) float local167 = (float) this.anIntArrayArray25[local32 - 1][local100];
					@Pc(179) float local179 = (float) this.anIntArrayArray25[local32 - 1][local100 - 1];
					if (local179 + (float) this.anInt1068 < (float) local122 && (float) local122 < (float) -this.anInt1068 + local167) {
						local11[local96] = this.anIntArrayArray24[local32 - 1][local100 - 1];
					} else {
						local11[local96] = 0;
					}
				}
			} else {
				Static185.method2278(local11, 0, Static73.anInt1888, 0);
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!dg", name = "b", descriptor = "(B)V")
	private void method684() {
		@Pc(12) Random local12 = new Random((long) this.anInt1064);
		this.anIntArrayArray24 = new int[this.anInt1064][this.anInt1069];
		this.anInt1068 = this.anInt1070 / 2;
		this.anInt1076 = 4096 / this.anInt1064;
		this.anIntArrayArray25 = new int[this.anInt1064][this.anInt1069 + 1];
		this.anIntArray67 = new int[this.anInt1064 + 1];
		this.anIntArray67[0] = 0;
		@Pc(62) int local62 = this.anInt1076 / 2;
		this.anInt1066 = 4096 / this.anInt1069;
		@Pc(73) int local73 = this.anInt1066 / 2;
		for (@Pc(75) int local75 = 0; local75 < this.anInt1064; local75++) {
			@Pc(82) int local82;
			@Pc(94) int local94;
			if (local75 > 0) {
				local82 = this.anInt1076;
				local94 = (Static49.method1046(4096, local12) - 2048) * this.anInt1065 >> 12;
				@Pc(102) int local102 = local82 + (local62 * local94 >> 12);
				this.anIntArray67[local75] = local102 + this.anIntArray67[local75 - 1];
			}
			this.anIntArrayArray25[local75][0] = 0;
			for (local82 = 0; local82 < this.anInt1069; local82++) {
				if (local82 > 0) {
					local94 = this.anInt1066;
					@Pc(145) int local145 = (Static49.method1046(4096, local12) - 2048) * this.anInt1059 >> 12;
					local94 += local73 * local145 >> 12;
					this.anIntArrayArray25[local75][local82] = this.anIntArrayArray25[local75][local82 - 1] + local94;
				}
				this.anIntArrayArray24[local75][local82] = 4096 - Static49.method1046(this.anInt1075, local12);
			}
			this.anIntArrayArray25[local75][this.anInt1069] = 4096;
		}
		this.anIntArray67[this.anInt1064] = 4096;
	}

	@OriginalMember(owner = "client!dg", name = "d", descriptor = "(I)V")
	@Override
	public void method3207() {
		this.method684();
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(Lclient!hc;IZ)V")
	@Override
	public void method3205(@OriginalArg(0) Class1_Sub6 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt1069 = arg0.method544();
		} else if (arg1 == 1) {
			this.anInt1064 = arg0.method544();
		} else if (arg1 == 2) {
			this.anInt1059 = arg0.method546();
		} else if (arg1 == 3) {
			this.anInt1065 = arg0.method546();
		} else if (arg1 == 4) {
			this.anInt1073 = arg0.method546();
		} else if (arg1 == 5) {
			this.anInt1074 = arg0.method546();
		} else if (arg1 == 6) {
			this.anInt1070 = arg0.method546();
		} else if (arg1 == 7) {
			this.anInt1075 = arg0.method546();
		}
	}
}
