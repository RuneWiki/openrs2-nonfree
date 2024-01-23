import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rd")
public final class Class4_Sub1_Sub30 extends Class4_Sub1 {

	@OriginalMember(owner = "client!rd", name = "K", descriptor = "[[I")
	private int[][] anIntArrayArray31;

	@OriginalMember(owner = "client!rd", name = "R", descriptor = "I")
	private int anInt4691;

	@OriginalMember(owner = "client!rd", name = "T", descriptor = "[[I")
	private int[][] anIntArrayArray32;

	@OriginalMember(owner = "client!rd", name = "X", descriptor = "[I")
	private int[] anIntArray376;

	@OriginalMember(owner = "client!rd", name = "cb", descriptor = "I")
	private int anInt4699;

	@OriginalMember(owner = "client!rd", name = "db", descriptor = "I")
	private int anInt4700;

	@OriginalMember(owner = "client!rd", name = "I", descriptor = "I")
	private int anInt4685 = 81;

	@OriginalMember(owner = "client!rd", name = "N", descriptor = "I")
	private int anInt4688 = 1024;

	@OriginalMember(owner = "client!rd", name = "L", descriptor = "I")
	private int anInt4687 = 4;

	@OriginalMember(owner = "client!rd", name = "U", descriptor = "I")
	private int anInt4693 = 204;

	@OriginalMember(owner = "client!rd", name = "O", descriptor = "I")
	private int anInt4689 = 8;

	@OriginalMember(owner = "client!rd", name = "J", descriptor = "I")
	private int anInt4686 = 409;

	@OriginalMember(owner = "client!rd", name = "ab", descriptor = "I")
	private int anInt4697 = 0;

	@OriginalMember(owner = "client!rd", name = "Y", descriptor = "I")
	private int anInt4696 = 1024;

	@OriginalMember(owner = "client!rd", name = "<init>", descriptor = "()V")
	public Class4_Sub1_Sub30() {
		super(0, true);
	}

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method4544(@OriginalArg(1) int arg0) {
		@Pc(7) int[] local7 = this.aClass43_41.method1180(arg0);
		if (this.aClass43_41.aBoolean82) {
			@Pc(19) int local19 = 0;
			@Pc(26) int local26;
			for (local26 = Static10.anIntArray7[arg0] + this.anInt4697; local26 < 0; local26 += 4096) {
			}
			while (local26 > 4096) {
				local26 -= 4096;
			}
			while (this.anInt4689 > local19 && this.anIntArray376[local19] <= local26) {
				local19++;
			}
			@Pc(76) boolean local76 = (local19 & 0x1) == 0;
			@Pc(83) int local83 = this.anIntArray376[local19 - 1];
			@Pc(88) int local88 = this.anIntArray376[local19];
			@Pc(92) int local92 = local19 - 1;
			if (local26 > local83 + this.anInt4700 && local88 - this.anInt4700 > local26) {
				for (@Pc(119) int local119 = 0; local119 < Static68.anInt1753; local119++) {
					@Pc(128) int local128 = 0;
					@Pc(137) int local137 = local76 ? this.anInt4696 : -this.anInt4696;
					@Pc(148) int local148;
					for (local148 = Static94.anIntArray163[local119] + (local137 * this.anInt4699 >> 12); local148 < 0; local148 += 4096) {
					}
					while (local148 > 4096) {
						local148 -= 4096;
					}
					while (local128 < this.anInt4687 && this.anIntArrayArray32[local92][local128] <= local148) {
						local128++;
					}
					@Pc(196) int local196 = this.anIntArrayArray32[local92][local128];
					@Pc(200) int local200 = local128 - 1;
					@Pc(207) int local207 = this.anIntArrayArray32[local92][local200];
					if (this.anInt4700 + local207 < local148 && local196 - this.anInt4700 > local148) {
						local7[local119] = this.anIntArrayArray31[local92][local200];
					} else {
						local7[local119] = 0;
					}
				}
			} else {
				Static317.method3204(local7, 0, Static68.anInt1753, 0);
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!rd", name = "g", descriptor = "(I)V")
	private void method3666() {
		@Pc(12) Random local12 = new Random((long) this.anInt4689);
		this.anInt4699 = 4096 / this.anInt4687;
		@Pc(23) int local23 = this.anInt4699 / 2;
		this.anIntArrayArray32 = new int[this.anInt4689][this.anInt4687 + 1];
		this.anInt4691 = 4096 / this.anInt4689;
		this.anIntArrayArray31 = new int[this.anInt4689][this.anInt4687];
		this.anIntArray376 = new int[this.anInt4689 + 1];
		@Pc(57) int local57 = this.anInt4691 / 2;
		this.anIntArray376[0] = 0;
		this.anInt4700 = this.anInt4685 / 2;
		for (@Pc(70) int local70 = 0; local70 < this.anInt4689; local70++) {
			@Pc(83) int local83;
			@Pc(95) int local95;
			if (local70 > 0) {
				local83 = this.anInt4691;
				local95 = (Static59.method1118(4096, local12) - 2048) * this.anInt4693 >> 12;
				@Pc(103) int local103 = local83 + (local95 * local57 >> 12);
				this.anIntArray376[local70] = this.anIntArray376[local70 - 1] + local103;
			}
			this.anIntArrayArray32[local70][0] = 0;
			for (local83 = 0; local83 < this.anInt4687; local83++) {
				if (local83 > 0) {
					local95 = this.anInt4699;
					@Pc(146) int local146 = (Static59.method1118(4096, local12) - 2048) * this.anInt4686 >> 12;
					local95 += local23 * local146 >> 12;
					this.anIntArrayArray32[local70][local83] = local95 + this.anIntArrayArray32[local70][local83 - 1];
				}
				this.anIntArrayArray31[local70][local83] = this.anInt4688 <= 0 ? 4096 : 4096 - Static59.method1118(this.anInt4688, local12);
			}
			this.anIntArrayArray32[local70][this.anInt4687] = 4096;
		}
		this.anIntArray376[this.anInt4689] = 4096;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(IILclient!pi;)V")
	@Override
	public void method4545(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub24 arg1) {
		if (arg0 == 0) {
			this.anInt4687 = arg1.method3110();
		} else if (arg0 == 1) {
			this.anInt4689 = arg1.method3110();
		} else if (arg0 == 2) {
			this.anInt4686 = arg1.method3085();
		} else if (arg0 == 3) {
			this.anInt4693 = arg1.method3085();
		} else if (arg0 == 4) {
			this.anInt4696 = arg1.method3085();
		} else if (arg0 == 5) {
			this.anInt4697 = arg1.method3085();
		} else if (arg0 == 6) {
			this.anInt4685 = arg1.method3085();
		} else if (arg0 == 7) {
			this.anInt4688 = arg1.method3085();
		}
	}

	@OriginalMember(owner = "client!rd", name = "c", descriptor = "(I)V")
	@Override
	public void method4537() {
		this.method3666();
	}
}
