import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!le")
public final class Class1_Sub1_Sub11 extends Class1_Sub1 {

	@OriginalMember(owner = "client!le", name = "F", descriptor = "[I")
	public int[] anIntArray263;

	@OriginalMember(owner = "client!le", name = "G", descriptor = "[Lclient!hh;")
	private Class50[] aClass50Array43;

	@OriginalMember(owner = "client!le", name = "K", descriptor = "[I")
	private int[] anIntArray264;

	@OriginalMember(owner = "client!le", name = "M", descriptor = "[[I")
	private int[][] anIntArrayArray17;

	@OriginalMember(owner = "client!le", name = "d", descriptor = "(I)Lclient!hh;")
	public Class50 method1910() {
		@Pc(5) Class50 local5 = Static234.method3539(80);
		if (this.aClass50Array43 == null) {
			return Static46.aClass50_342;
		}
		local5.method1259(this.aClass50Array43[0]);
		for (@Pc(29) int local29 = 1; local29 < this.aClass50Array43.length; local29++) {
			local5.method1259(Static213.aClass50_1341);
			local5.method1259(this.aClass50Array43[local29]);
		}
		return local5.method1215();
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(ILclient!pg;I)V")
	private void method1911(@OriginalArg(1) Class1_Sub17 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aClass50Array43 = arg0.method2125().method1248();
			return;
		}
		@Pc(14) int local14;
		@Pc(24) int local24;
		if (arg1 == 2) {
			local14 = arg0.method2142();
			this.anIntArray263 = new int[local14];
			for (local24 = 0; local24 < local14; local24++) {
				this.anIntArray263[local24] = arg0.method2178();
			}
		} else if (arg1 == 3) {
			local14 = arg0.method2142();
			this.anIntArray264 = new int[local14];
			this.anIntArrayArray17 = new int[local14][];
			for (local24 = 0; local24 < local14; local24++) {
				@Pc(30) int local30 = arg0.method2178();
				this.anIntArray264[local24] = local30;
				this.anIntArrayArray17[local24] = new int[Static39.anIntArray69[local30]];
				for (@Pc(45) int local45 = 0; local45 < Static39.anIntArray69[local30]; local45++) {
					this.anIntArrayArray17[local24][local45] = arg0.method2178();
				}
			}
		}
	}

	@OriginalMember(owner = "client!le", name = "e", descriptor = "(I)I")
	public int method1912() {
		return this.anIntArray264 == null ? 0 : this.anIntArray264.length;
	}

	@OriginalMember(owner = "client!le", name = "d", descriptor = "(B)V")
	public void method1914() {
		if (this.anIntArray263 != null) {
			for (@Pc(14) int local14 = 0; local14 < this.anIntArray263.length; local14++) {
				this.anIntArray263[local14] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(Lclient!pg;I)V")
	public void method1915(@OriginalArg(0) Class1_Sub17 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method2142();
			if (local9 == 0) {
				return;
			}
			this.method1911(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(II)I")
	public int method1916(@OriginalArg(1) int arg0) {
		return this.anIntArray264 == null || arg0 < 0 || this.anIntArray264.length < arg0 ? -1 : this.anIntArray264[arg0];
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IIB)I")
	public int method1917(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anIntArray264 == null || arg0 < 0 || arg0 > this.anIntArray264.length) {
			return -1;
		} else if (this.anIntArrayArray17[arg0] == null || arg1 < 0 || this.anIntArrayArray17[arg0].length < arg1) {
			return -1;
		} else {
			return this.anIntArrayArray17[arg0][arg1];
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(I[ILclient!pg;)V")
	public void method1918(@OriginalArg(1) int[] arg0, @OriginalArg(2) Class1_Sub17 arg1) {
		if (this.anIntArray264 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < this.anIntArray264.length; local11++) {
			if (local11 >= arg0.length) {
				return;
			}
			@Pc(22) int local22 = Static151.anIntArray326[this.method1916(local11)];
			if (local22 > 0) {
				arg1.method2161(local22, (long) arg0[local11]);
			}
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(ZLclient!pg;)Lclient!hh;")
	public Class50 method1919(@OriginalArg(1) Class1_Sub17 arg0) {
		@Pc(15) Class50 local15 = Static234.method3539(80);
		if (this.anIntArray264 != null) {
			for (@Pc(20) int local20 = 0; local20 < this.anIntArray264.length; local20++) {
				local15.method1259(this.aClass50Array43[local20]);
				local15.method1259(Static56.method817(this.anIntArray264[local20], this.anIntArrayArray17[local20], arg0.method2121(Static101.anIntArray192[this.anIntArray264[local20]])));
			}
		}
		local15.method1259(this.aClass50Array43[this.aClass50Array43.length - 1]);
		return local15.method1215();
	}
}
