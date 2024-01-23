import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pj")
public final class Class2_Sub3_Sub25 extends Class2_Sub3 {

	@OriginalMember(owner = "client!pj", name = "O", descriptor = "[[I")
	private int[][] anIntArrayArray36;

	@OriginalMember(owner = "client!pj", name = "Q", descriptor = "[Lclient!qe;")
	private Class78[] aClass78Array28;

	@OriginalMember(owner = "client!pj", name = "Z", descriptor = "[I")
	private int[] anIntArray624;

	@OriginalMember(owner = "client!pj", name = "eb", descriptor = "[I")
	public int[] anIntArray626;

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(BLclient!nh;)Lclient!qe;")
	public Class78 method2920(@OriginalArg(1) Class2_Sub23 arg0) {
		@Pc(5) Class78 local5 = Static167.method3037(80);
		if (this.anIntArray624 != null) {
			for (@Pc(10) int local10 = 0; local10 < this.anIntArray624.length; local10++) {
				local5.method3022(this.aClass78Array28[local10]);
				local5.method3022(Static173.method3152(this.anIntArrayArray36[local10], arg0.method2101(Static21.anIntArray52[this.anIntArray624[local10]]), this.anIntArray624[local10]));
			}
		}
		local5.method3022(this.aClass78Array28[this.aClass78Array28.length - 1]);
		return local5.method3002();
	}

	@OriginalMember(owner = "client!pj", name = "b", descriptor = "(BLclient!nh;)V")
	public void method2921(@OriginalArg(1) Class2_Sub23 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method2122();
			if (local13 == 0) {
				return;
			}
			this.method2925(local13, arg0);
		}
	}

	@OriginalMember(owner = "client!pj", name = "f", descriptor = "(I)Lclient!qe;")
	public Class78 method2922() {
		@Pc(9) Class78 local9 = Static167.method3037(80);
		if (this.aClass78Array28 == null) {
			return Static204.aClass78_810;
		}
		local9.method3022(this.aClass78Array28[0]);
		for (@Pc(35) int local35 = 1; local35 < this.aClass78Array28.length; local35++) {
			local9.method3022(Static93.aClass78_453);
			local9.method3022(this.aClass78Array28[local35]);
		}
		return local9.method3002();
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(BI)I")
	public int method2924(@OriginalArg(1) int arg0) {
		return this.anIntArray624 == null || arg0 < 0 || arg0 > this.anIntArray624.length ? -1 : this.anIntArray624[arg0];
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(IBLclient!nh;)V")
	private void method2925(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub23 arg1) {
		if (arg0 == 1) {
			this.aClass78Array28 = arg1.method2115().method3023(60);
			return;
		}
		@Pc(27) int local27;
		@Pc(37) int local37;
		if (arg0 == 2) {
			local27 = arg1.method2122();
			this.anIntArray626 = new int[local27];
			for (local37 = 0; local37 < local27; local37++) {
				this.anIntArray626[local37] = arg1.method2095();
			}
		} else if (arg0 == 3) {
			local27 = arg1.method2122();
			this.anIntArrayArray36 = new int[local27][];
			this.anIntArray624 = new int[local27];
			for (local37 = 0; local37 < local27; local37++) {
				@Pc(42) int local42 = arg1.method2095();
				this.anIntArray624[local37] = local42;
				this.anIntArrayArray36[local37] = new int[Static121.anIntArray796[local42]];
				for (@Pc(57) int local57 = 0; local57 < Static121.anIntArray796[local42]; local57++) {
					this.anIntArrayArray36[local37][local57] = arg1.method2095();
				}
			}
		}
	}

	@OriginalMember(owner = "client!pj", name = "g", descriptor = "(I)V")
	public void method2926() {
		if (this.anIntArray626 != null) {
			for (@Pc(12) int local12 = 0; local12 < this.anIntArray626.length; local12++) {
				this.anIntArray626[local12] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(III)I")
	public int method2929(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anIntArray624 == null || arg0 < 0 || this.anIntArray624.length < arg0) {
			return -1;
		} else if (this.anIntArrayArray36[arg0] == null || arg1 < 0 || arg1 > this.anIntArrayArray36[arg0].length) {
			return -1;
		} else {
			return this.anIntArrayArray36[arg0][arg1];
		}
	}

	@OriginalMember(owner = "client!pj", name = "i", descriptor = "(I)I")
	public int method2930() {
		return this.anIntArray624 == null ? 0 : this.anIntArray624.length;
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(Lclient!nh;[II)V")
	public void method2931(@OriginalArg(0) Class2_Sub23 arg0, @OriginalArg(1) int[] arg1) {
		if (this.anIntArray624 == null) {
			return;
		}
		for (@Pc(13) int local13 = 0; local13 < this.anIntArray624.length; local13++) {
			if (arg1.length <= local13) {
				return;
			}
			@Pc(21) int local21 = Static224.anIntArray787[this.method2924(local13)];
			if (local21 > 0) {
				arg0.method2086((long) arg1[local13], local21);
			}
		}
	}
}
