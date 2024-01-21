import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mi")
public final class Class5_Sub2_Sub12 extends Class5_Sub2 {

	@OriginalMember(owner = "client!mi", name = "H", descriptor = "[I")
	public int[] anIntArray287;

	@OriginalMember(owner = "client!mi", name = "K", descriptor = "[Lclient!dc;")
	private Class20[] aClass20Array21;

	@OriginalMember(owner = "client!mi", name = "Q", descriptor = "[[I")
	private int[][] anIntArrayArray28;

	@OriginalMember(owner = "client!mi", name = "X", descriptor = "[I")
	private int[] anIntArray288;

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(III)I")
	public int method1926(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.anIntArray288 == null || arg0 < 0 || arg0 > this.anIntArray288.length) {
			return -1;
		} else if (this.anIntArrayArray28[arg0] == null || arg1 < 0 || this.anIntArrayArray28[arg0].length < arg1) {
			return -1;
		} else {
			return this.anIntArrayArray28[arg0][arg1];
		}
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(BLclient!ce;I)V")
	private void method1928(@OriginalArg(1) Class5_Sub6 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aClass20Array21 = arg0.method3027().method579(60);
			return;
		}
		@Pc(32) int local32;
		@Pc(42) int local42;
		if (arg1 == 2) {
			local32 = arg0.method3062();
			this.anIntArray287 = new int[local32];
			for (local42 = 0; local42 < local32; local42++) {
				this.anIntArray287[local42] = arg0.method3077();
			}
		} else if (arg1 == 3) {
			local32 = arg0.method3062();
			this.anIntArrayArray28 = new int[local32][];
			this.anIntArray288 = new int[local32];
			for (local42 = 0; local42 < local32; local42++) {
				@Pc(48) int local48 = arg0.method3077();
				this.anIntArray288[local42] = local48;
				this.anIntArrayArray28[local42] = new int[Static133.anIntArray301[local48]];
				for (@Pc(63) int local63 = 0; local63 < Static133.anIntArray301[local48]; local63++) {
					this.anIntArrayArray28[local42][local63] = arg0.method3077();
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!mi", name = "c", descriptor = "(B)Lclient!dc;")
	public Class20 method1930() {
		@Pc(17) Class20 local17 = Static161.method2451(80);
		local17.method568(this.aClass20Array21[0]);
		for (@Pc(27) int local27 = 1; local27 < this.aClass20Array21.length; local27++) {
			local17.method568(Static111.aClass20_866);
			local17.method568(this.aClass20Array21[local27]);
		}
		return local17.method589();
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(Lclient!ce;I[I)V")
	public void method1931(@OriginalArg(0) Class5_Sub6 arg0, @OriginalArg(2) int[] arg1) {
		if (this.anIntArray288 == null) {
			return;
		}
		for (@Pc(19) int local19 = 0; local19 < this.anIntArray288.length; local19++) {
			if (local19 >= arg1.length) {
				return;
			}
			@Pc(28) int local28 = Static114.anIntArray42[this.method1932(local19)];
			if (local28 > 0) {
				arg0.method3049(local28, (long) arg1[local19]);
			}
		}
	}

	@OriginalMember(owner = "client!mi", name = "b", descriptor = "(II)I")
	public int method1932(@OriginalArg(1) int arg0) {
		return this.anIntArray288 == null || arg0 < 0 || this.anIntArray288.length < arg0 ? -1 : this.anIntArray288[arg0];
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(Lclient!ce;I)Lclient!dc;")
	public Class20 method1933(@OriginalArg(0) Class5_Sub6 arg0) {
		@Pc(5) Class20 local5 = Static161.method2451(80);
		if (this.anIntArray288 != null) {
			for (@Pc(10) int local10 = 0; local10 < this.anIntArray288.length; local10++) {
				local5.method568(this.aClass20Array21[local10]);
				local5.method568(Static138.method2921(this.anIntArray288[local10], arg0.method3050(Static88.anIntArray187[this.anIntArray288[local10]]), this.anIntArrayArray28[local10]));
			}
		}
		local5.method568(this.aClass20Array21[this.aClass20Array21.length - 1]);
		return local5.method589();
	}

	@OriginalMember(owner = "client!mi", name = "f", descriptor = "(I)I")
	public int method1934() {
		return this.anIntArray288 == null ? 0 : this.anIntArray288.length;
	}

	@OriginalMember(owner = "client!mi", name = "b", descriptor = "(Lclient!ce;I)V")
	public void method1936(@OriginalArg(0) Class5_Sub6 arg0) {
		while (true) {
			@Pc(11) int local11 = arg0.method3062();
			if (local11 == 0) {
				return;
			}
			this.method1928(arg0, local11);
		}
	}
}
