import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kb")
public final class Class1_Sub3_Sub21 extends Class1_Sub3 {

	@OriginalMember(owner = "client!kb", name = "U", descriptor = "[I")
	private int[] anIntArray201;

	@OriginalMember(owner = "client!kb", name = "W", descriptor = "[[I")
	private int[][] anIntArrayArray12;

	@OriginalMember(owner = "client!kb", name = "gb", descriptor = "[I")
	private int[] anIntArray204;

	@OriginalMember(owner = "client!kb", name = "Y", descriptor = "I")
	private int anInt2126 = 0;

	@OriginalMember(owner = "client!kb", name = "Z", descriptor = "[S")
	private short[] aShortArray30 = new short[257];

	@OriginalMember(owner = "client!kb", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub21() {
		super(1, true);
	}

	@OriginalMember(owner = "client!kb", name = "e", descriptor = "(B)V")
	private void method1634() {
		@Pc(4) int[] local4 = this.anIntArrayArray12[0];
		@Pc(9) int[] local9 = this.anIntArrayArray12[1];
		@Pc(26) int[] local26 = this.anIntArrayArray12[this.anIntArrayArray12.length - 2];
		@Pc(35) int[] local35 = this.anIntArrayArray12[this.anIntArrayArray12.length - 1];
		this.anIntArray201 = new int[] { local26[0] + local26[0] - local35[0], local26[1] + -local35[1] + local26[1] };
		this.anIntArray204 = new int[] { local4[0] + local4[0] - local9[0], local4[1] - local9[1] - -local4[1] };
	}

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "(II)[I")
	private int[] method1635(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return this.anIntArray204;
		} else if (this.anIntArrayArray12.length <= arg0) {
			return this.anIntArray201;
		} else {
			return this.anIntArrayArray12[arg0];
		}
	}

	@OriginalMember(owner = "client!kb", name = "h", descriptor = "(I)V")
	private void method1637() {
		@Pc(8) int local8 = this.anInt2126;
		@Pc(28) int local28;
		@Pc(26) int local26;
		@Pc(64) int[] local64;
		@Pc(57) int[] local57;
		@Pc(73) int local73;
		@Pc(77) int local77;
		@Pc(81) int local81;
		@Pc(92) int local92;
		if (local8 == 2) {
			for (local8 = 0; local8 < 257; local8++) {
				local26 = local8 << 4;
				for (local28 = 1; this.anIntArrayArray12.length - 1 > local28 && this.anIntArrayArray12[local28][0] <= local26; local28++) {
				}
				local57 = this.anIntArrayArray12[local28];
				local64 = this.anIntArrayArray12[local28 - 1];
				local73 = this.method1635(local28 - 2)[1];
				local77 = local64[1];
				local81 = local57[1];
				local92 = this.method1635(local28 + 1)[1];
				@Pc(109) int local109 = (local26 - local64[0] << 12) / (local57[0] - local64[0]);
				@Pc(115) int local115 = local109 * local109 >> 12;
				@Pc(126) int local126 = local92 + local77 - local73 - local81;
				@Pc(133) int local133 = local73 - local126 - local77;
				@Pc(138) int local138 = local81 - local73;
				@Pc(150) int local150 = local115 * (local126 * local109 >> 12) >> 12;
				@Pc(156) int local156 = local115 * local133 >> 12;
				@Pc(162) int local162 = local109 * local138 >> 12;
				@Pc(170) int local170 = local162 + local156 + local150 + local77;
				if (local170 <= -32768) {
					local170 = -32767;
				}
				if (local170 >= 32768) {
					local170 = 32767;
				}
				this.aShortArray30[local8] = (short) local170;
			}
		} else if (local8 == 1) {
			for (local8 = 0; local8 < 257; local8++) {
				local26 = local8 << 4;
				for (local28 = 1; local28 < this.anIntArrayArray12.length - 1 && this.anIntArrayArray12[local28][0] <= local26; local28++) {
				}
				local57 = this.anIntArrayArray12[local28];
				local64 = this.anIntArrayArray12[local28 - 1];
				local73 = (local26 - local64[0] << 12) / (local57[0] - local64[0]);
				local77 = 4096 - Static106.anIntArray203[local73 >> 5 & 0xFF] >> 1;
				local81 = 4096 - local77;
				local92 = local57[1] * local77 + local81 * local64[1] >> 12;
				if (local92 <= -32768) {
					local92 = -32767;
				}
				if (local92 >= 32768) {
					local92 = 32767;
				}
				this.aShortArray30[local8] = (short) local92;
			}
		} else {
			for (local8 = 0; local8 < 257; local8++) {
				local26 = local8 << 4;
				for (local28 = 1; local28 < this.anIntArrayArray12.length - 1 && local26 >= this.anIntArrayArray12[local28][0]; local28++) {
				}
				local57 = this.anIntArrayArray12[local28];
				local64 = this.anIntArrayArray12[local28 - 1];
				local73 = (local26 - local64[0] << 12) / (local57[0] - local64[0]);
				local77 = 4096 - local73;
				local81 = local73 * local57[1] + local64[1] * local77 >> 12;
				if (local81 <= -32768) {
					local81 = -32767;
				}
				if (local81 >= 32768) {
					local81 = 32767;
				}
				this.aShortArray30[local8] = (short) local81;
			}
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IILclient!pg;)V")
	@Override
	public void method3466(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub17 arg1) {
		if (arg0 != 0) {
			return;
		}
		this.anInt2126 = arg1.method2142();
		this.anIntArrayArray12 = new int[arg1.method2142()][2];
		for (@Pc(18) int local18 = 0; local18 < this.anIntArrayArray12.length; local18++) {
			this.anIntArrayArray12[local18][0] = arg1.method2178();
			this.anIntArrayArray12[local18][1] = arg1.method2178();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method3475(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = super.aClass79_41.method2341(arg0);
		if (super.aClass79_41.aBoolean125) {
			@Pc(27) int[] local27 = this.method3468(arg0, 0);
			for (@Pc(29) int local29 = 0; local29 < Static76.anInt1531; local29++) {
				@Pc(37) int local37 = local27[local29] >> 4;
				if (local37 < 0) {
					local37 = 0;
				}
				if (local37 > 256) {
					local37 = 256;
				}
				local17[local29] = this.aShortArray30[local37];
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!kb", name = "d", descriptor = "(B)V")
	@Override
	public void method3474() {
		if (this.anIntArrayArray12 == null) {
			this.anIntArrayArray12 = new int[][] { new int[2], { 4096, 4096 } };
		}
		if (this.anIntArrayArray12.length < 2) {
			throw new RuntimeException("Curve operation requires at least two markers");
		}
		if (this.anInt2126 == 2) {
			this.method1634();
		}
		Static191.method3137();
		this.method1637();
	}
}
