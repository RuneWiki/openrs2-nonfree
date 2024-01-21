import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!p")
public final class Class3_Sub2_Sub25 extends Class3_Sub2 {

	@OriginalMember(owner = "client!p", name = "cb", descriptor = "[I")
	private int[] anIntArray211;

	@OriginalMember(owner = "client!p", name = "db", descriptor = "[I")
	private int[] anIntArray212;

	@OriginalMember(owner = "client!p", name = "fb", descriptor = "[[I")
	private int[][] anIntArrayArray22;

	@OriginalMember(owner = "client!p", name = "jb", descriptor = "I")
	private int anInt3030 = 0;

	@OriginalMember(owner = "client!p", name = "sb", descriptor = "[S")
	private final short[] aShortArray43 = new short[257];

	@OriginalMember(owner = "client!p", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub25() {
		super(1, true);
	}

	@OriginalMember(owner = "client!p", name = "g", descriptor = "(B)V")
	private void method2149() {
		@Pc(8) int[] local8 = this.anIntArrayArray22[0];
		@Pc(13) int[] local13 = this.anIntArrayArray22[1];
		@Pc(22) int[] local22 = this.anIntArrayArray22[this.anIntArrayArray22.length - 2];
		@Pc(31) int[] local31 = this.anIntArrayArray22[this.anIntArrayArray22.length - 1];
		this.anIntArray212 = new int[] { local8[0] + local8[0] - local13[0], local8[1] - local13[1] + local8[1] };
		this.anIntArray211 = new int[] { local22[0] + local22[0] - local31[0], local22[1] - local31[1] - -local22[1] };
	}

	@OriginalMember(owner = "client!p", name = "b", descriptor = "(IB)[I")
	private int[] method2151(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return this.anIntArray212;
		} else if (arg0 >= this.anIntArrayArray22.length) {
			return this.anIntArray211;
		} else {
			return this.anIntArrayArray22[arg0];
		}
	}

	@OriginalMember(owner = "client!p", name = "b", descriptor = "(I)V")
	@Override
	public void method3329() {
		if (this.anIntArrayArray22 == null) {
			this.anIntArrayArray22 = new int[][] { new int[2], { 4096, 4096 } };
		}
		if (this.anIntArrayArray22.length < 2) {
			throw new RuntimeException("Curve operation requires at least two markers");
		}
		if (this.anInt3030 == 2) {
			this.method2149();
		}
		Static198.method3152();
		this.method2152();
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method3334(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass2_41.method9(arg0);
		if (super.aClass2_41.aBoolean2) {
			@Pc(29) int[] local29 = this.method3328(0, arg0);
			for (@Pc(31) int local31 = 0; local31 < Static190.anInt3865; local31++) {
				@Pc(39) int local39 = local29[local31] >> 4;
				if (local39 < 0) {
					local39 = 0;
				}
				if (local39 > 256) {
					local39 = 256;
				}
				local19[local31] = this.aShortArray43[local39];
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(Z)V")
	private void method2152() {
		@Pc(12) int local12 = this.anInt3030;
		@Pc(32) int local32;
		@Pc(30) int local30;
		@Pc(64) int[] local64;
		@Pc(57) int[] local57;
		@Pc(73) int local73;
		@Pc(77) int local77;
		@Pc(81) int local81;
		@Pc(90) int local90;
		if (local12 == 2) {
			for (local12 = 0; local12 < 257; local12++) {
				local30 = local12 << 4;
				for (local32 = 1; this.anIntArrayArray22.length - 1 > local32 && this.anIntArrayArray22[local32][0] <= local30; local32++) {
				}
				local57 = this.anIntArrayArray22[local32];
				local64 = this.anIntArrayArray22[local32 - 1];
				local73 = this.method2151(local32 - 2)[1];
				local77 = local64[1];
				local81 = local57[1];
				local90 = this.method2151(local32 + 1)[1];
				@Pc(108) int local108 = (local30 - local64[0] << 12) / (local57[0] - local64[0]);
				@Pc(114) int local114 = local108 * local108 >> 12;
				@Pc(119) int local119 = local81 - local73;
				@Pc(129) int local129 = local77 + local90 - local73 - local81;
				@Pc(138) int local138 = local73 - local77 - local129;
				@Pc(148) int local148 = local114 * (local129 * local108 >> 12) >> 12;
				@Pc(154) int local154 = local119 * local108 >> 12;
				@Pc(160) int local160 = local138 * local114 >> 12;
				@Pc(169) int local169 = local77 + local148 + local160 + local154;
				if (local169 <= -32768) {
					local169 = -32767;
				}
				if (local169 >= 32768) {
					local169 = 32767;
				}
				this.aShortArray43[local12] = (short) local169;
			}
		} else if (local12 == 1) {
			for (local12 = 0; local12 < 257; local12++) {
				local30 = local12 << 4;
				for (local32 = 1; local32 < this.anIntArrayArray22.length - 1 && this.anIntArrayArray22[local32][0] <= local30; local32++) {
				}
				local64 = this.anIntArrayArray22[local32 - 1];
				local57 = this.anIntArrayArray22[local32];
				local73 = (local30 - local64[0] << 12) / (local57[0] - local64[0]);
				local77 = 4096 - Static1.anIntArray93[local73 >> 5 & 0xFF] >> 1;
				local81 = 4096 - local77;
				local90 = local77 * local57[1] + local81 * local64[1] >> 12;
				if (local90 <= -32768) {
					local90 = -32767;
				}
				if (local90 >= 32768) {
					local90 = 32767;
				}
				this.aShortArray43[local12] = (short) local90;
			}
		} else {
			for (local12 = 0; local12 < 257; local12++) {
				local30 = local12 << 4;
				for (local32 = 1; local32 < this.anIntArrayArray22.length - 1 && this.anIntArrayArray22[local32][0] <= local30; local32++) {
				}
				local57 = this.anIntArrayArray22[local32];
				local64 = this.anIntArrayArray22[local32 - 1];
				local73 = (local30 - local64[0] << 12) / (local57[0] - local64[0]);
				local77 = 4096 - local73;
				local81 = local77 * local64[1] + local57[1] * local73 >> 12;
				if (local81 <= -32768) {
					local81 = -32767;
				}
				if (local81 >= 32768) {
					local81 = 32767;
				}
				this.aShortArray43[local12] = (short) local81;
			}
		}
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(Lclient!ce;II)V")
	@Override
	public void method3337(@OriginalArg(0) Class3_Sub4 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != 0) {
			return;
		}
		this.anInt3030 = arg0.method1278();
		this.anIntArrayArray22 = new int[arg0.method1278()][2];
		for (@Pc(19) int local19 = 0; local19 < this.anIntArrayArray22.length; local19++) {
			this.anIntArrayArray22[local19][0] = arg0.method1270();
			this.anIntArrayArray22[local19][1] = arg0.method1270();
		}
	}
}
