import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dp")
public final class Class3_Sub3_Sub6 extends Class3_Sub3 {

	@OriginalMember(owner = "client!dp", name = "Q", descriptor = "[S")
	private short[] aShortArray45;

	@OriginalMember(owner = "client!dp", name = "S", descriptor = "[S")
	private short[] aShortArray46;

	@OriginalMember(owner = "client!dp", name = "P", descriptor = "Z")
	public boolean aBoolean71 = true;

	@OriginalMember(owner = "client!dp", name = "T", descriptor = "I")
	public int anInt1363 = 4;

	@OriginalMember(owner = "client!dp", name = "W", descriptor = "[B")
	private byte[] aByteArray27 = new byte[512];

	@OriginalMember(owner = "client!dp", name = "U", descriptor = "I")
	public int anInt1364 = 4;

	@OriginalMember(owner = "client!dp", name = "bb", descriptor = "I")
	public int anInt1369 = 4;

	@OriginalMember(owner = "client!dp", name = "gb", descriptor = "I")
	public int anInt1374 = 0;

	@OriginalMember(owner = "client!dp", name = "ib", descriptor = "I")
	public int anInt1376 = 1638;

	@OriginalMember(owner = "client!dp", name = "<init>", descriptor = "()V")
	public Class3_Sub3_Sub6() {
		super(0, true);
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(I[II)V")
	public void method1063(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		@Pc(12) int local12 = Static269.anIntArray433[arg0] * this.anInt1363;
		@Pc(109) int local109;
		@Pc(123) int local123;
		@Pc(39) int local39;
		@Pc(26) short local26;
		@Pc(100) int local100;
		@Pc(45) int local45;
		@Pc(59) int local59;
		@Pc(52) int local52;
		@Pc(98) int local98;
		@Pc(63) int local63;
		@Pc(67) int local67;
		@Pc(85) int local85;
		@Pc(94) int local94;
		if (this.anInt1364 == 1) {
			local26 = this.aShortArray46[0];
			local39 = this.aShortArray45[0] << 12;
			local45 = local12 * local39 >> 12;
			local59 = local39 * this.anInt1369 >> 12;
			local52 = this.anInt1363 * local39 >> 12;
			local63 = local45 >> 12;
			local67 = local63 + 1;
			@Pc(378) int local378 = local45 & 0xFFF;
			if (local67 >= local52) {
				local67 = 0;
			}
			local98 = Class79.anIntArray532[local378];
			local85 = this.aByteArray27[local63 & 0xFF] & 0xFF;
			local94 = this.aByteArray27[local67 & 0xFF] & 0xFF;
			if (this.aBoolean71) {
				for (local100 = 0; local100 < Static131.anInt2755; local100++) {
					local109 = Static151.anIntArray211[local100] * this.anInt1369;
					local123 = this.method1064(local98, local39 * local109 >> 12, local378, local94, local59, local85);
					@Pc(481) int local481 = local26 * local123 >> 12;
					arg1[local100] = (local481 >> 1) + 2048;
				}
			} else {
				for (local100 = 0; local100 < Static131.anInt2755; local100++) {
					local109 = Static151.anIntArray211[local100] * this.anInt1369;
					local123 = this.method1064(local98, local39 * local109 >> 12, local378, local94, local59, local85);
					arg1[local100] = local123 * local26 >> 12;
				}
			}
			return;
		}
		local26 = this.aShortArray46[0];
		if (local26 > 8 || local26 < -8) {
			local39 = this.aShortArray45[0] << 12;
			local45 = local39 * local12 >> 12;
			local52 = local39 * this.anInt1363 >> 12;
			local59 = this.anInt1369 * local39 >> 12;
			local63 = local45 >> 12;
			local67 = local63 + 1;
			if (local52 <= local67) {
				local67 = 0;
			}
			local45 &= 0xFFF;
			local85 = this.aByteArray27[local63 & 0xFF] & 0xFF;
			local94 = this.aByteArray27[local67 & 0xFF] & 0xFF;
			local98 = Class79.anIntArray532[local45];
			for (local100 = 0; local100 < Static131.anInt2755; local100++) {
				local109 = Static151.anIntArray211[local100] * this.anInt1369;
				local123 = this.method1064(local98, local39 * local109 >> 12, local45, local94, local59, local85);
				arg1[local100] = local123 * local26 >> 12;
			}
		}
		for (@Pc(137) int local137 = 1; local137 < this.anInt1364; local137++) {
			local26 = this.aShortArray46[local137];
			if (local26 > 8 || local26 < -8) {
				local39 = this.aShortArray45[local137] << 12;
				local52 = this.anInt1363 * local39 >> 12;
				local45 = local12 * local39 >> 12;
				local59 = local39 * this.anInt1369 >> 12;
				local63 = local45 >> 12;
				local67 = local63 + 1;
				local45 &= 0xFFF;
				if (local52 <= local67) {
					local67 = 0;
				}
				local98 = Class79.anIntArray532[local45];
				local94 = this.aByteArray27[local67 & 0xFF] & 0xFF;
				local85 = this.aByteArray27[local63 & 0xFF] & 0xFF;
				if (this.aBoolean71 && local137 == this.anInt1364 - 1) {
					for (local100 = 0; local100 < Static131.anInt2755; local100++) {
						local109 = Static151.anIntArray211[local100] * this.anInt1369;
						local123 = this.method1064(local98, local39 * local109 >> 12, local45, local94, local59, local85);
						local123 = arg1[local100] + (local123 * local26 >> 12);
						arg1[local100] = (local123 >> 1) + 2048;
					}
				} else {
					for (local100 = 0; local100 < Static131.anInt2755; local100++) {
						local109 = Static151.anIntArray211[local100] * this.anInt1369;
						local123 = this.method1064(local98, local109 * local39 >> 12, local45, local94, local59, local85);
						arg1[local100] += local123 * local26 >> 12;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(IIIZIII)I")
	private int method1064(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(14) int local14 = arg1 >> 12;
		@Pc(18) int local18 = local14 + 1;
		@Pc(22) int local22 = arg1 & 0xFFF;
		if (arg4 <= local18) {
			local18 = 0;
		}
		local14 &= 0xFF;
		@Pc(39) int local39 = arg2 - 4096;
		@Pc(43) int local43 = local22 - 4096;
		local18 &= 0xFF;
		@Pc(56) int local56 = this.aByteArray27[local14 + arg5] & 0x3;
		@Pc(60) int local60 = Class79.anIntArray532[local22];
		@Pc(74) int local74;
		if (local56 <= 1) {
			local74 = local56 == 0 ? arg2 + local22 : -local22 + arg2;
		} else {
			local74 = local56 == 2 ? local22 - arg2 : -local22 - arg2;
		}
		local56 = this.aByteArray27[local18 + arg5] & 0x3;
		@Pc(120) int local120;
		if (local56 > 1) {
			local120 = local56 == 2 ? local43 - arg2 : -local43 + -arg2;
		} else {
			local120 = local56 == 0 ? arg2 + local43 : -local43 + arg2;
		}
		local56 = this.aByteArray27[arg3 + local14] & 0x3;
		@Pc(155) int local155 = local74 + ((local120 - local74) * local60 >> 12);
		if (local56 <= 1) {
			local74 = local56 == 0 ? local22 + local39 : -local22 + local39;
		} else {
			local74 = local56 == 2 ? local22 - local39 : -local39 + -local22;
		}
		local56 = this.aByteArray27[local18 + arg3] & 0x3;
		if (local56 > 1) {
			local120 = local56 == 2 ? local43 - local39 : -local39 + -local43;
		} else {
			local120 = local56 == 0 ? local43 + local39 : -local43 + local39;
		}
		@Pc(238) int local238 = (local60 * (local120 - local74) >> 12) + local74;
		return (arg0 * (local238 - local155) >> 12) + local155;
	}

	@OriginalMember(owner = "client!dp", name = "b", descriptor = "(B)V")
	@Override
	public void method5730() {
		this.aByteArray27 = Static286.method4929(this.anInt1374);
		this.method1070();
		for (@Pc(24) int local24 = this.anInt1364 - 1; local24 >= 1; local24--) {
			@Pc(31) short local31 = this.aShortArray46[local24];
			if (local31 > 8) {
				return;
			}
			if (local31 < -8) {
				return;
			}
			this.anInt1364--;
		}
	}

	@OriginalMember(owner = "client!dp", name = "d", descriptor = "(I)V")
	private void method1070() {
		@Pc(16) int local16;
		if (this.anInt1376 > 0) {
			this.aShortArray45 = new short[this.anInt1364];
			this.aShortArray46 = new short[this.anInt1364];
			for (local16 = 0; local16 < this.anInt1364; local16++) {
				this.aShortArray46[local16] = (short) (Math.pow((double) ((float) this.anInt1376 / 4096.0F), (double) local16) * 4096.0D);
				this.aShortArray45[local16] = (short) Math.pow(2.0D, (double) local16);
			}
		} else if (this.aShortArray46 != null && this.aShortArray46.length == this.anInt1364) {
			this.aShortArray45 = new short[this.anInt1364];
			for (local16 = 0; local16 < this.anInt1364; local16++) {
				this.aShortArray45[local16] = (short) Math.pow(2.0D, (double) local16);
			}
		}
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(Lclient!fb;ZI)V")
	@Override
	public void method5731(@OriginalArg(0) Class3_Sub4 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.aBoolean71 = arg0.method3643() == 1;
		} else if (arg1 == 1) {
			this.anInt1364 = arg0.method3643();
		} else if (arg1 == 2) {
			this.anInt1376 = arg0.method3622();
			if (this.anInt1376 < 0) {
				this.aShortArray46 = new short[this.anInt1364];
				for (@Pc(72) int local72 = 0; local72 < this.anInt1364; local72++) {
					this.aShortArray46[local72] = (short) arg0.method3622();
				}
			}
		} else if (arg1 == 3) {
			this.anInt1369 = this.anInt1363 = arg0.method3643();
		} else if (arg1 == 4) {
			this.anInt1374 = arg0.method3643();
		} else if (arg1 == 5) {
			this.anInt1369 = arg0.method3643();
		} else if (arg1 == 6) {
			this.anInt1363 = arg0.method3643();
		}
	}

	@OriginalMember(owner = "client!dp", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method5727(@OriginalArg(0) int arg0) {
		@Pc(9) int[] local9 = super.aClass217_41.method5701(arg0);
		if (super.aClass217_41.aBoolean451) {
			this.method1063(arg0, local9);
		}
		return local9;
	}
}
