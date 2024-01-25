import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cga")
public final class Class3_Sub2_Sub5 extends Class3_Sub2 {

	@OriginalMember(owner = "client!cga", name = "Y", descriptor = "[I")
	private int[] anIntArray83;

	@OriginalMember(owner = "client!cga", name = "Q", descriptor = "I")
	private int anInt1214;

	@OriginalMember(owner = "client!cga", name = "E", descriptor = "[[I")
	private int[][] anIntArrayArray7;

	@OriginalMember(owner = "client!cga", name = "P", descriptor = "I")
	private int anInt1223;

	@OriginalMember(owner = "client!cga", name = "H", descriptor = "I")
	private int anInt1224;

	@OriginalMember(owner = "client!cga", name = "eb", descriptor = "[[I")
	private int[][] anIntArrayArray8;

	@OriginalMember(owner = "client!cga", name = "D", descriptor = "I")
	private int anInt1216 = 0;

	@OriginalMember(owner = "client!cga", name = "ab", descriptor = "I")
	private int anInt1219 = 409;

	@OriginalMember(owner = "client!cga", name = "L", descriptor = "I")
	private int anInt1220 = 4;

	@OriginalMember(owner = "client!cga", name = "F", descriptor = "I")
	private int anInt1213 = 8;

	@OriginalMember(owner = "client!cga", name = "cb", descriptor = "I")
	private int anInt1221 = 81;

	@OriginalMember(owner = "client!cga", name = "U", descriptor = "I")
	private int anInt1222 = 1024;

	@OriginalMember(owner = "client!cga", name = "T", descriptor = "I")
	private int anInt1210 = 1024;

	@OriginalMember(owner = "client!cga", name = "bb", descriptor = "I")
	private int anInt1226 = 204;

	@OriginalMember(owner = "client!cga", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub5() {
		super(0, true);
	}

	@OriginalMember(owner = "client!cga", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method9209(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass293_41.method7200(arg0);
		if (super.aClass293_41.aBoolean641) {
			@Pc(27) int local27 = 0;
			@Pc(34) int local34;
			for (local34 = this.anInt1216 + Static123.anIntArray113[arg0]; local34 < 0; local34 += 4096) {
			}
			while (local34 > 4096) {
				local34 -= 4096;
			}
			while (local27 < this.anInt1213 && this.anIntArray83[local27] <= local34) {
				local27++;
			}
			@Pc(80) int local80 = local27 - 1;
			@Pc(91) boolean local91 = (local27 & 0x1) == 0;
			@Pc(96) int local96 = this.anIntArray83[local27];
			@Pc(103) int local103 = this.anIntArray83[local27 - 1];
			if (this.anInt1223 + local103 < local34 && local96 - this.anInt1223 > local34) {
				for (@Pc(129) int local129 = 0; local129 < Static636.anInt10302; local129++) {
					@Pc(133) int local133 = 0;
					@Pc(143) int local143 = local91 ? this.anInt1210 : -this.anInt1210;
					@Pc(154) int local154;
					for (local154 = Static508.anIntArray472[local129] + (local143 * this.anInt1224 >> 12); local154 < 0; local154 += 4096) {
					}
					while (local154 > 4096) {
						local154 -= 4096;
					}
					while (local133 < this.anInt1220 && local154 >= this.anIntArrayArray7[local80][local133]) {
						local133++;
					}
					@Pc(194) int local194 = local133 - 1;
					@Pc(201) int local201 = this.anIntArrayArray7[local80][local133];
					@Pc(208) int local208 = this.anIntArrayArray7[local80][local194];
					if (local154 > local208 + this.anInt1223 && local154 < local201 - this.anInt1223) {
						local11[local129] = this.anIntArrayArray8[local80][local194];
					} else {
						local11[local129] = 0;
					}
				}
			} else {
				Static735.method9184(local11, 0, Static636.anInt10302, 0);
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!cga", name = "a", descriptor = "(I)V")
	@Override
	public void method9205() {
		this.method1015();
	}

	@OriginalMember(owner = "client!cga", name = "e", descriptor = "(I)V")
	private void method1015() {
		@Pc(12) Random local12 = new Random((long) this.anInt1213);
		this.anInt1224 = 4096 / this.anInt1220;
		this.anInt1214 = 4096 / this.anInt1213;
		this.anInt1223 = this.anInt1221 / 2;
		@Pc(35) int local35 = this.anInt1224 / 2;
		this.anIntArrayArray8 = new int[this.anInt1213][this.anInt1220];
		@Pc(47) int local47 = this.anInt1214 / 2;
		this.anIntArrayArray7 = new int[this.anInt1213][this.anInt1220 + 1];
		this.anIntArray83 = new int[this.anInt1213 + 1];
		this.anIntArray83[0] = 0;
		for (@Pc(70) int local70 = 0; local70 < this.anInt1213; local70++) {
			@Pc(89) int local89;
			@Pc(101) int local101;
			if (local70 > 0) {
				local89 = this.anInt1214;
				local101 = (Static63.method794(4096, local12) - 2048) * this.anInt1226 >> 12;
				@Pc(109) int local109 = local89 + (local47 * local101 >> 12);
				this.anIntArray83[local70] = this.anIntArray83[local70 - 1] + local109;
			}
			this.anIntArrayArray7[local70][0] = 0;
			for (local89 = 0; local89 < this.anInt1220; local89++) {
				if (local89 > 0) {
					local101 = this.anInt1224;
					@Pc(152) int local152 = (Static63.method794(4096, local12) - 2048) * this.anInt1219 >> 12;
					local101 += local152 * local35 >> 12;
					this.anIntArrayArray7[local70][local89] = this.anIntArrayArray7[local70][local89 - 1] + local101;
				}
				this.anIntArrayArray8[local70][local89] = this.anInt1222 <= 0 ? 4096 : 4096 - Static63.method794(this.anInt1222, local12);
			}
			this.anIntArrayArray7[local70][this.anInt1220] = 4096;
		}
		this.anIntArray83[this.anInt1213] = 4096;
	}

	@OriginalMember(owner = "client!cga", name = "a", descriptor = "(ILclient!rba;I)V")
	@Override
	public void method9214(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub28 arg1) {
		if (arg0 == 0) {
			this.anInt1220 = arg1.method5322(-70);
		} else if (arg0 == 1) {
			this.anInt1213 = arg1.method5322(-79);
		} else if (arg0 == 2) {
			this.anInt1219 = arg1.method5272();
		} else if (arg0 == 3) {
			this.anInt1226 = arg1.method5272();
		} else if (arg0 == 4) {
			this.anInt1210 = arg1.method5272();
		} else if (arg0 == 5) {
			this.anInt1216 = arg1.method5272();
		} else if (arg0 == 6) {
			this.anInt1221 = arg1.method5272();
		} else if (arg0 == 7) {
			this.anInt1222 = arg1.method5272();
		}
	}
}
