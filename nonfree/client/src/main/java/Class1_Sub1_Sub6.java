import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cj")
public final class Class1_Sub1_Sub6 extends Class1_Sub1 {

	@OriginalMember(owner = "client!cj", name = "z", descriptor = "[[I")
	private int[][] anIntArrayArray3;

	@OriginalMember(owner = "client!cj", name = "C", descriptor = "I")
	private int anInt1171;

	@OriginalMember(owner = "client!cj", name = "H", descriptor = "I")
	private int anInt1175;

	@OriginalMember(owner = "client!cj", name = "K", descriptor = "I")
	private int anInt1178;

	@OriginalMember(owner = "client!cj", name = "M", descriptor = "[[I")
	private int[][] anIntArrayArray4;

	@OriginalMember(owner = "client!cj", name = "O", descriptor = "[I")
	private int[] anIntArray56;

	@OriginalMember(owner = "client!cj", name = "J", descriptor = "I")
	private int anInt1177 = 204;

	@OriginalMember(owner = "client!cj", name = "A", descriptor = "I")
	private int anInt1169 = 1024;

	@OriginalMember(owner = "client!cj", name = "L", descriptor = "I")
	private int anInt1179 = 409;

	@OriginalMember(owner = "client!cj", name = "F", descriptor = "I")
	private int anInt1173 = 0;

	@OriginalMember(owner = "client!cj", name = "D", descriptor = "I")
	private int anInt1172 = 81;

	@OriginalMember(owner = "client!cj", name = "R", descriptor = "I")
	private int anInt1183 = 8;

	@OriginalMember(owner = "client!cj", name = "U", descriptor = "I")
	private int anInt1185 = 1024;

	@OriginalMember(owner = "client!cj", name = "T", descriptor = "I")
	private int anInt1184 = 4;

	@OriginalMember(owner = "client!cj", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub6() {
		super(0, true);
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7826(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass152_41.method3216(arg0);
		if (super.aClass152_41.aBoolean282) {
			@Pc(17) int local17 = 0;
			@Pc(24) int local24;
			for (local24 = Static583.anIntArray614[arg0] + this.anInt1173; local24 < 0; local24 += 4096) {
			}
			while (local24 > 4096) {
				local24 -= 4096;
			}
			while (local17 < this.anInt1183 && this.anIntArray56[local17] <= local24) {
				local17++;
			}
			@Pc(54) int local54 = local17 - 1;
			@Pc(65) boolean local65 = (local17 & 0x1) == 0;
			@Pc(70) int local70 = this.anIntArray56[local17];
			@Pc(77) int local77 = this.anIntArray56[local17 - 1];
			if (local24 > local77 + this.anInt1171 && local70 - this.anInt1171 > local24) {
				for (@Pc(103) int local103 = 0; local103 < Static501.anInt8748; local103++) {
					@Pc(107) int local107 = 0;
					@Pc(116) int local116 = local65 ? this.anInt1169 : -this.anInt1169;
					@Pc(127) int local127;
					for (local127 = (this.anInt1178 * local116 >> 12) + Static95.anIntArray77[local103]; local127 < 0; local127 += 4096) {
					}
					while (local127 > 4096) {
						local127 -= 4096;
					}
					while (local107 < this.anInt1184 && local127 >= this.anIntArrayArray3[local54][local107]) {
						local107++;
					}
					@Pc(168) int local168 = local107 - 1;
					@Pc(175) int local175 = this.anIntArrayArray3[local54][local168];
					@Pc(182) int local182 = this.anIntArrayArray3[local54][local107];
					if (local175 + this.anInt1171 < local127 && local182 - this.anInt1171 > local127) {
						local11[local103] = this.anIntArrayArray4[local54][local168];
					} else {
						local11[local103] = 0;
					}
				}
			} else {
				Static598.method772(local11, 0, Static501.anInt8748, 0);
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!cj", name = "d", descriptor = "(I)V")
	private void method1032() {
		@Pc(12) Random local12 = new Random((long) this.anInt1183);
		this.anInt1171 = this.anInt1172 / 2;
		this.anInt1175 = 4096 / this.anInt1183;
		this.anInt1178 = 4096 / this.anInt1184;
		@Pc(39) int local39 = this.anInt1178 / 2;
		this.anIntArray56 = new int[this.anInt1183 + 1];
		this.anIntArrayArray3 = new int[this.anInt1183][this.anInt1184 + 1];
		@Pc(60) int local60 = this.anInt1175 / 2;
		this.anIntArrayArray4 = new int[this.anInt1183][this.anInt1184];
		this.anIntArray56[0] = 0;
		for (@Pc(74) int local74 = 0; local74 < this.anInt1183; local74++) {
			@Pc(81) int local81;
			@Pc(93) int local93;
			if (local74 > 0) {
				local81 = this.anInt1175;
				local93 = (Static46.method765(4096, local12) - 2048) * this.anInt1177 >> 12;
				@Pc(101) int local101 = local81 + (local93 * local60 >> 12);
				this.anIntArray56[local74] = local101 + this.anIntArray56[local74 - 1];
			}
			this.anIntArrayArray3[local74][0] = 0;
			for (local81 = 0; local81 < this.anInt1184; local81++) {
				if (local81 > 0) {
					local93 = this.anInt1178;
					@Pc(144) int local144 = (Static46.method765(4096, local12) - 2048) * this.anInt1179 >> 12;
					local93 += local144 * local39 >> 12;
					this.anIntArrayArray3[local74][local81] = this.anIntArrayArray3[local74][local81 - 1] + local93;
				}
				this.anIntArrayArray4[local74][local81] = this.anInt1185 > 0 ? 4096 - Static46.method765(this.anInt1185, local12) : 4096;
			}
			this.anIntArrayArray3[local74][this.anInt1184] = 4096;
		}
		this.anIntArray56[this.anInt1183] = 4096;
	}

	@OriginalMember(owner = "client!cj", name = "b", descriptor = "(B)V")
	@Override
	public void method7831() {
		this.method1032();
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(BILclient!ac;)V")
	@Override
	public void method7835(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub3 arg1) {
		if (arg0 == 0) {
			this.anInt1184 = arg1.method7974();
		} else if (arg0 == 1) {
			this.anInt1183 = arg1.method7974();
		} else if (arg0 == 2) {
			this.anInt1179 = arg1.method7945();
		} else if (arg0 == 3) {
			this.anInt1177 = arg1.method7945();
		} else if (arg0 == 4) {
			this.anInt1169 = arg1.method7945();
		} else if (arg0 == 5) {
			this.anInt1173 = arg1.method7945();
		} else if (arg0 == 6) {
			this.anInt1172 = arg1.method7945();
		} else if (arg0 == 7) {
			this.anInt1185 = arg1.method7945();
		}
	}
}
