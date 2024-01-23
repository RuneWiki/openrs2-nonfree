import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!je")
public final class Class1_Sub2_Sub10 extends Class1_Sub2 {

	@OriginalMember(owner = "client!je", name = "O", descriptor = "[I")
	public int[] anIntArray218;

	@OriginalMember(owner = "client!je", name = "Q", descriptor = "[I")
	private int[] anIntArray219;

	@OriginalMember(owner = "client!je", name = "U", descriptor = "[Lclient!sc;")
	private Class107[] aClass107Array11;

	@OriginalMember(owner = "client!je", name = "X", descriptor = "[[I")
	private int[][] anIntArrayArray25;

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(ILclient!vf;)V")
	public void method1713(@OriginalArg(1) Class1_Sub26 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method2945();
			if (local5 == 0) {
				return;
			}
			this.method1723(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!je", name = "f", descriptor = "(I)V")
	public void method1716() {
		if (this.anIntArray218 != null) {
			for (@Pc(6) int local6 = 0; local6 < this.anIntArray218.length; local6++) {
				this.anIntArray218[local6] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!je", name = "b", descriptor = "(IIB)I")
	public int method1717(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anIntArray219 == null || arg1 < 0 || arg1 > this.anIntArray219.length) {
			return -1;
		} else if (this.anIntArrayArray25[arg1] == null || arg0 < 0 || arg0 > this.anIntArrayArray25[arg1].length) {
			return -1;
		} else {
			return this.anIntArrayArray25[arg1][arg0];
		}
	}

	@OriginalMember(owner = "client!je", name = "d", descriptor = "(B)Lclient!sc;")
	public Class107 method1718() {
		@Pc(9) Class107 local9 = Static130.method2170(80);
		if (this.aClass107Array11 == null) {
			return Static36.aClass107_257;
		}
		local9.method3108(this.aClass107Array11[0]);
		for (@Pc(29) int local29 = 1; local29 < this.aClass107Array11.length; local29++) {
			local9.method3108(Static209.aClass107_1183);
			local9.method3108(this.aClass107Array11[local29]);
		}
		return local9.method3090();
	}

	@OriginalMember(owner = "client!je", name = "b", descriptor = "(ILclient!vf;)Lclient!sc;")
	public Class107 method1719(@OriginalArg(1) Class1_Sub26 arg0) {
		@Pc(17) Class107 local17 = Static130.method2170(80);
		if (this.anIntArray219 != null) {
			for (@Pc(22) int local22 = 0; local22 < this.anIntArray219.length; local22++) {
				local17.method3108(this.aClass107Array11[local22]);
				local17.method3108(Static189.method3064(this.anIntArray219[local22], arg0.method2969(Static155.anIntArray42[this.anIntArray219[local22]]), this.anIntArrayArray25[local22]));
			}
		}
		local17.method3108(this.aClass107Array11[this.aClass107Array11.length - 1]);
		return local17.method3090();
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(Lclient!vf;[IB)V")
	public void method1721(@OriginalArg(0) Class1_Sub26 arg0, @OriginalArg(1) int[] arg1) {
		if (this.anIntArray219 == null) {
			return;
		}
		for (@Pc(19) int local19 = 0; local19 < this.anIntArray219.length; local19++) {
			if (arg1.length <= local19) {
				return;
			}
			@Pc(28) int local28 = Static227.anIntArray380[this.method1722(local19)];
			if (local28 > 0) {
				arg0.method2971(local28, (long) arg1[local19]);
			}
		}
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(BI)I")
	public int method1722(@OriginalArg(1) int arg0) {
		return this.anIntArray219 == null || arg0 < 0 || this.anIntArray219.length < arg0 ? -1 : this.anIntArray219[arg0];
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(Lclient!vf;II)V")
	private void method1723(@OriginalArg(0) Class1_Sub26 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.aClass107Array11 = arg0.method2978().method3117();
			return;
		}
		@Pc(26) int local26;
		@Pc(36) int local36;
		if (arg1 == 2) {
			local26 = arg0.method2945();
			this.anIntArray218 = new int[local26];
			for (local36 = 0; local36 < local26; local36++) {
				this.anIntArray218[local36] = arg0.method2964();
			}
		} else if (arg1 == 3) {
			local26 = arg0.method2945();
			this.anIntArray219 = new int[local26];
			this.anIntArrayArray25 = new int[local26][];
			for (local36 = 0; local36 < local26; local36++) {
				@Pc(42) int local42 = arg0.method2964();
				this.anIntArray219[local36] = local42;
				this.anIntArrayArray25[local36] = new int[Static172.anIntArray330[local42]];
				for (@Pc(57) int local57 = 0; local57 < Static172.anIntArray330[local42]; local57++) {
					this.anIntArrayArray25[local36][local57] = arg0.method2964();
				}
			}
		}
	}

	@OriginalMember(owner = "client!je", name = "e", descriptor = "(B)I")
	public int method1724() {
		return this.anIntArray219 == null ? 0 : this.anIntArray219.length;
	}
}
