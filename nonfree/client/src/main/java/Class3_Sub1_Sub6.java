import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dc")
public final class Class3_Sub1_Sub6 extends Class3_Sub1 {

	@OriginalMember(owner = "client!dc", name = "H", descriptor = "[[I")
	private int[][] anIntArrayArray9;

	@OriginalMember(owner = "client!dc", name = "I", descriptor = "[[I")
	private int[][] anIntArrayArray10;

	@OriginalMember(owner = "client!dc", name = "J", descriptor = "I")
	private int anInt1226;

	@OriginalMember(owner = "client!dc", name = "O", descriptor = "I")
	private int anInt1231;

	@OriginalMember(owner = "client!dc", name = "X", descriptor = "[I")
	private int[] anIntArray111;

	@OriginalMember(owner = "client!dc", name = "Z", descriptor = "I")
	private int anInt1240;

	@OriginalMember(owner = "client!dc", name = "K", descriptor = "I")
	private int anInt1227 = 409;

	@OriginalMember(owner = "client!dc", name = "N", descriptor = "I")
	private int anInt1230 = 81;

	@OriginalMember(owner = "client!dc", name = "S", descriptor = "I")
	private int anInt1234 = 4;

	@OriginalMember(owner = "client!dc", name = "Q", descriptor = "I")
	private int anInt1233 = 204;

	@OriginalMember(owner = "client!dc", name = "P", descriptor = "I")
	private int anInt1232 = 1024;

	@OriginalMember(owner = "client!dc", name = "M", descriptor = "I")
	private int anInt1229 = 1024;

	@OriginalMember(owner = "client!dc", name = "Y", descriptor = "I")
	private int anInt1239 = 0;

	@OriginalMember(owner = "client!dc", name = "W", descriptor = "I")
	private int anInt1238 = 8;

	@OriginalMember(owner = "client!dc", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub6() {
		super(0, true);
	}

	@OriginalMember(owner = "client!dc", name = "g", descriptor = "(B)V")
	private void method1063() {
		@Pc(12) Random local12 = new Random((long) this.anInt1238);
		this.anInt1231 = this.anInt1230 / 2;
		this.anInt1226 = 4096 / this.anInt1238;
		this.anInt1240 = 4096 / this.anInt1234;
		@Pc(35) int local35 = this.anInt1240 / 2;
		this.anIntArray111 = new int[this.anInt1238 + 1];
		this.anIntArrayArray9 = new int[this.anInt1238][this.anInt1234];
		this.anIntArrayArray10 = new int[this.anInt1238][this.anInt1234 + 1];
		@Pc(63) int local63 = this.anInt1226 / 2;
		this.anIntArray111[0] = 0;
		for (@Pc(74) int local74 = 0; local74 < this.anInt1238; local74++) {
			@Pc(81) int local81;
			@Pc(93) int local93;
			if (local74 > 0) {
				local81 = this.anInt1226;
				local93 = (Static213.method3319(local12, 4096) - 2048) * this.anInt1233 >> 12;
				@Pc(101) int local101 = local81 + (local63 * local93 >> 12);
				this.anIntArray111[local74] = local101 + this.anIntArray111[local74 - 1];
			}
			this.anIntArrayArray10[local74][0] = 0;
			for (local81 = 0; local81 < this.anInt1234; local81++) {
				if (local81 > 0) {
					local93 = this.anInt1240;
					@Pc(141) int local141 = (Static213.method3319(local12, 4096) - 2048) * this.anInt1227 >> 12;
					local93 += local141 * local35 >> 12;
					this.anIntArrayArray10[local74][local81] = local93 + this.anIntArrayArray10[local74][local81 - 1];
				}
				this.anIntArrayArray9[local74][local81] = this.anInt1229 <= 0 ? 4096 : 4096 - Static213.method3319(local12, this.anInt1229);
			}
			this.anIntArrayArray10[local74][this.anInt1234] = 4096;
		}
		this.anIntArray111[this.anInt1238] = 4096;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lclient!rp;BI)V")
	@Override
	public void method5545(@OriginalArg(0) Class3_Sub5 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt1234 = arg0.method2739();
		} else if (arg1 == 1) {
			this.anInt1238 = arg0.method2739();
		} else if (arg1 == 2) {
			this.anInt1227 = arg0.method2767();
		} else if (arg1 == 3) {
			this.anInt1233 = arg0.method2767();
		} else if (arg1 == 4) {
			this.anInt1232 = arg0.method2767();
		} else if (arg1 == 5) {
			this.anInt1239 = arg0.method2767();
		} else if (arg1 == 6) {
			this.anInt1230 = arg0.method2767();
		} else if (arg1 == 7) {
			this.anInt1229 = arg0.method2767();
		}
	}

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method5550(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass4_41.method61(arg0);
		if (super.aClass4_41.aBoolean7) {
			@Pc(25) int local25 = 0;
			@Pc(32) int local32;
			for (local32 = this.anInt1239 + Static351.anIntArray371[arg0]; local32 < 0; local32 += 4096) {
			}
			while (local32 > 4096) {
				local32 -= 4096;
			}
			while (this.anInt1238 > local25 && local32 >= this.anIntArray111[local25]) {
				local25++;
			}
			@Pc(63) int local63 = local25 - 1;
			@Pc(71) boolean local71 = (local25 & 0x1) == 0;
			@Pc(76) int local76 = this.anIntArray111[local25];
			@Pc(83) int local83 = this.anIntArray111[local25 - 1];
			if (local32 > this.anInt1231 + local83 && local32 < local76 - this.anInt1231) {
				for (@Pc(102) int local102 = 0; local102 < Static238.anInt4221; local102++) {
					@Pc(106) int local106 = 0;
					@Pc(115) int local115 = local71 ? this.anInt1232 : -this.anInt1232;
					@Pc(126) int local126;
					for (local126 = (this.anInt1240 * local115 >> 12) + Static187.anIntArray379[local102]; local126 < 0; local126 += 4096) {
					}
					while (local126 > 4096) {
						local126 -= 4096;
					}
					while (local106 < this.anInt1234 && local126 >= this.anIntArrayArray10[local63][local106]) {
						local106++;
					}
					@Pc(169) int local169 = local106 - 1;
					@Pc(176) int local176 = this.anIntArrayArray10[local63][local106];
					@Pc(183) int local183 = this.anIntArrayArray10[local63][local169];
					if (local183 + this.anInt1231 < local126 && local126 < local176 - this.anInt1231) {
						local19[local102] = this.anIntArrayArray9[local63][local169];
					} else {
						local19[local102] = 0;
					}
				}
			} else {
				Static400.method1875(local19, 0, Static238.anInt4221, 0);
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "(I)V")
	@Override
	public void method5552() {
		this.method1063();
	}
}
