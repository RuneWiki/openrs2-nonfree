import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dc")
public final class Class1_Sub1_Sub8 extends Class1_Sub1 {

	@OriginalMember(owner = "client!dc", name = "Y", descriptor = "[I")
	private int[] anIntArray79;

	@OriginalMember(owner = "client!dc", name = "cb", descriptor = "[I")
	private int[] anIntArray80;

	@OriginalMember(owner = "client!dc", name = "db", descriptor = "[[I")
	private int[][] anIntArrayArray9;

	@OriginalMember(owner = "client!dc", name = "S", descriptor = "I")
	private int anInt1307 = 0;

	@OriginalMember(owner = "client!dc", name = "N", descriptor = "[S")
	private final short[] aShortArray20 = new short[257];

	@OriginalMember(owner = "client!dc", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub8() {
		super(1, true);
	}

	@OriginalMember(owner = "client!dc", name = "c", descriptor = "(B)V")
	private void method1228() {
		@Pc(8) int[] local8 = this.anIntArrayArray9[0];
		@Pc(13) int[] local13 = this.anIntArrayArray9[1];
		@Pc(28) int[] local28 = this.anIntArrayArray9[this.anIntArrayArray9.length - 2];
		@Pc(37) int[] local37 = this.anIntArrayArray9[this.anIntArrayArray9.length - 1];
		this.anIntArray79 = new int[] { local8[0] + local8[0] - local13[0], local8[1] + local8[1] + -local13[1] };
		this.anIntArray80 = new int[] { local28[0] + local28[0] - local37[0], local28[1] + local28[1] + -local37[1] };
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method6007(@OriginalArg(0) int arg0) {
		@Pc(17) int[] local17 = super.aClass98_41.method2856(arg0);
		if (super.aClass98_41.aBoolean210) {
			@Pc(27) int[] local27 = this.method6013(arg0, 0);
			for (@Pc(29) int local29 = 0; local29 < Static85.anInt1910; local29++) {
				@Pc(37) int local37 = local27[local29] >> 4;
				if (local37 < 0) {
					local37 = 0;
				}
				if (local37 > 256) {
					local37 = 256;
				}
				local17[local29] = this.aShortArray20[local37];
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "(II)[I")
	private int[] method1230(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return this.anIntArray79;
		} else if (arg0 >= this.anIntArrayArray9.length) {
			return this.anIntArray80;
		} else {
			return this.anIntArrayArray9[arg0];
		}
	}

	@OriginalMember(owner = "client!dc", name = "d", descriptor = "(B)V")
	private void method1232() {
		@Pc(13) int local13 = this.anInt1307;
		@Pc(33) int local33;
		@Pc(31) int local31;
		@Pc(60) int[] local60;
		@Pc(65) int[] local65;
		@Pc(74) int local74;
		@Pc(78) int local78;
		@Pc(82) int local82;
		@Pc(91) int local91;
		if (local13 == 2) {
			for (local13 = 0; local13 < 257; local13++) {
				local31 = local13 << 4;
				for (local33 = 1; local33 < this.anIntArrayArray9.length - 1 && local31 >= this.anIntArrayArray9[local33][0]; local33++) {
				}
				local60 = this.anIntArrayArray9[local33 - 1];
				local65 = this.anIntArrayArray9[local33];
				local74 = this.method1230(local33 - 2)[1];
				local78 = local60[1];
				local82 = local65[1];
				local91 = this.method1230(local33 + 1)[1];
				@Pc(108) int local108 = (local31 - local60[0] << 12) / (local65[0] - local60[0]);
				@Pc(114) int local114 = local108 * local108 >> 12;
				@Pc(124) int local124 = local78 + local91 - local74 - local82;
				@Pc(131) int local131 = local74 - local78 - local124;
				@Pc(136) int local136 = local82 - local74;
				@Pc(148) int local148 = (local124 * local108 >> 12) * local114 >> 12;
				@Pc(154) int local154 = local114 * local131 >> 12;
				@Pc(160) int local160 = local136 * local108 >> 12;
				@Pc(169) int local169 = local78 + local160 + local148 + local154;
				if (local169 <= -32768) {
					local169 = -32767;
				}
				if (local169 >= 32768) {
					local169 = 32767;
				}
				this.aShortArray20[local13] = (short) local169;
			}
		} else if (local13 == 1) {
			for (local13 = 0; local13 < 257; local13++) {
				local31 = local13 << 4;
				for (local33 = 1; local33 < this.anIntArrayArray9.length - 1 && local31 >= this.anIntArrayArray9[local33][0]; local33++) {
				}
				local60 = this.anIntArrayArray9[local33 - 1];
				local65 = this.anIntArrayArray9[local33];
				local74 = (local31 - local60[0] << 12) / (local65[0] - local60[0]);
				local78 = 4096 - Static6.anIntArray22[local74 >> 5 & 0xFF] >> 1;
				local82 = 4096 - local78;
				local91 = local65[1] * local78 + local60[1] * local82 >> 12;
				if (local91 <= -32768) {
					local91 = -32767;
				}
				if (local91 >= 32768) {
					local91 = 32767;
				}
				this.aShortArray20[local13] = (short) local91;
			}
		} else {
			for (local13 = 0; local13 < 257; local13++) {
				local31 = local13 << 4;
				for (local33 = 1; local33 < this.anIntArrayArray9.length - 1 && local31 >= this.anIntArrayArray9[local33][0]; local33++) {
				}
				local60 = this.anIntArrayArray9[local33 - 1];
				local65 = this.anIntArrayArray9[local33];
				local74 = (local31 - local60[0] << 12) / (local65[0] - local60[0]);
				local78 = 4096 - local74;
				local82 = local65[1] * local74 + local78 * local60[1] >> 12;
				if (local82 <= -32768) {
					local82 = -32767;
				}
				if (local82 >= 32768) {
					local82 = 32767;
				}
				this.aShortArray20[local13] = (short) local82;
			}
		}
	}

	@OriginalMember(owner = "client!dc", name = "e", descriptor = "(I)V")
	@Override
	public void method6008() {
		if (this.anIntArrayArray9 == null) {
			this.anIntArrayArray9 = new int[][] { new int[2], { 4096, 4096 } };
		}
		if (this.anIntArrayArray9.length < 2) {
			throw new RuntimeException("Curve operation requires at least two markers");
		}
		if (this.anInt1307 == 2) {
			this.method1228();
		}
		Static113.method2407();
		this.method1232();
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(IILclient!at;)V")
	@Override
	public void method6002(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub7 arg1) {
		if (arg0 != 0) {
			return;
		}
		this.anInt1307 = arg1.method2132();
		this.anIntArrayArray9 = new int[arg1.method2132()][2];
		for (@Pc(25) int local25 = 0; local25 < this.anIntArrayArray9.length; local25++) {
			this.anIntArrayArray9[local25][0] = arg1.method2161();
			this.anIntArrayArray9[local25][1] = arg1.method2161();
		}
	}
}
