import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ma")
public final class Class2_Sub2_Sub18 extends Class2_Sub2 {

	@OriginalMember(owner = "client!ma", name = "w", descriptor = "[I")
	public int[] anIntArray256;

	@OriginalMember(owner = "client!ma", name = "B", descriptor = "[I")
	private int[] anIntArray257;

	@OriginalMember(owner = "client!ma", name = "G", descriptor = "[Lclient!qe;")
	private Class83[] aClass83Array42;

	@OriginalMember(owner = "client!ma", name = "I", descriptor = "[[I")
	private int[][] anIntArrayArray20;

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(BLclient!ra;)V")
	public void method1985(@OriginalArg(1) Class2_Sub3 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method260();
			if (local5 == 0) {
				return;
			}
			this.method1992(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!ma", name = "c", descriptor = "(I)I")
	public int method1986() {
		return this.anIntArray257 == null ? 0 : this.anIntArray257.length;
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(III)I")
	public int method1988(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anIntArray257 == null || arg1 < 0 || this.anIntArray257.length < arg1) {
			return -1;
		} else if (this.anIntArrayArray20[arg1] == null || arg0 < 0 || this.anIntArrayArray20[arg1].length < arg0) {
			return -1;
		} else {
			return this.anIntArrayArray20[arg1][arg0];
		}
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lclient!ra;Z)Lclient!qe;")
	public Class83 method1989(@OriginalArg(0) Class2_Sub3 arg0) {
		@Pc(9) Class83 local9 = Static102.method1759(80);
		if (this.anIntArray257 != null) {
			for (@Pc(14) int local14 = 0; local14 < this.anIntArray257.length; local14++) {
				local9.method2417(this.aClass83Array42[local14]);
				local9.method2417(Static32.method674(arg0.method266(Static195.anIntArray375[this.anIntArray257[local14]]), this.anIntArrayArray20[local14], this.anIntArray257[local14]));
			}
		}
		local9.method2417(this.aClass83Array42[this.aClass83Array42.length - 1]);
		return local9.method2410();
	}

	@OriginalMember(owner = "client!ma", name = "d", descriptor = "(I)Lclient!qe;")
	public Class83 method1990() {
		@Pc(5) Class83 local5 = Static102.method1759(80);
		local5.method2417(this.aClass83Array42[0]);
		for (@Pc(22) int local22 = 1; local22 < this.aClass83Array42.length; local22++) {
			local5.method2417(Static167.aClass83_996);
			local5.method2417(this.aClass83Array42[local22]);
		}
		return local5.method2410();
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lclient!ra;IB)V")
	private void method1992(@OriginalArg(0) Class2_Sub3 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.aClass83Array42 = arg0.method259().method2405(60);
			return;
		}
		@Pc(14) int local14;
		@Pc(24) int local24;
		if (arg1 == 2) {
			local14 = arg0.method260();
			this.anIntArray256 = new int[local14];
			for (local24 = 0; local24 < local14; local24++) {
				this.anIntArray256[local24] = arg0.method269();
			}
		} else if (arg1 == 3) {
			local14 = arg0.method260();
			this.anIntArrayArray20 = new int[local14][];
			this.anIntArray257 = new int[local14];
			for (local24 = 0; local24 < local14; local24++) {
				@Pc(30) int local30 = arg0.method269();
				this.anIntArray257[local24] = local30;
				this.anIntArrayArray20[local24] = new int[Static125.anIntArray278[local30]];
				for (@Pc(45) int local45 = 0; local45 < Static125.anIntArray278[local30]; local45++) {
					this.anIntArrayArray20[local24][local45] = arg0.method269();
				}
			}
		}
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lclient!ra;[IB)V")
	public void method1994(@OriginalArg(0) Class2_Sub3 arg0, @OriginalArg(1) int[] arg1) {
		if (this.anIntArray257 == null) {
			return;
		}
		for (@Pc(16) int local16 = 0; local16 < this.anIntArray257.length; local16++) {
			if (local16 >= arg1.length) {
				return;
			}
			@Pc(25) int local25 = Static13.anIntArray22[this.method1995(local16)];
			if (local25 > 0) {
				arg0.method256(local25, (long) arg1[local16]);
			}
		}
	}

	@OriginalMember(owner = "client!ma", name = "b", descriptor = "(BI)I")
	public int method1995(@OriginalArg(1) int arg0) {
		return this.anIntArray257 == null || arg0 < 0 || this.anIntArray257.length < arg0 ? -1 : this.anIntArray257[arg0];
	}
}
