import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!we")
public final class Class2_Sub3_Sub29 extends Class2_Sub3 {

	@OriginalMember(owner = "client!we", name = "M", descriptor = "[S")
	private short[] aShortArray160;

	@OriginalMember(owner = "client!we", name = "Y", descriptor = "[S")
	private short[] aShortArray161;

	@OriginalMember(owner = "client!we", name = "ab", descriptor = "[I")
	private int[] anIntArray782;

	@OriginalMember(owner = "client!we", name = "kb", descriptor = "[S")
	private short[] aShortArray162;

	@OriginalMember(owner = "client!we", name = "lb", descriptor = "[S")
	private short[] aShortArray163;

	@OriginalMember(owner = "client!we", name = "V", descriptor = "Z")
	public boolean aBoolean209 = false;

	@OriginalMember(owner = "client!we", name = "K", descriptor = "I")
	public int anInt4822 = -1;

	@OriginalMember(owner = "client!we", name = "ib", descriptor = "[I")
	private int[] anIntArray784 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(Lclient!nh;I)V")
	public void method3919(@OriginalArg(0) Class2_Sub23 arg0) {
		while (true) {
			@Pc(7) int local7 = arg0.method2122();
			if (local7 == 0) {
				return;
			}
			this.method3923(local7, arg0);
		}
	}

	@OriginalMember(owner = "client!we", name = "f", descriptor = "(I)Z")
	public boolean method3921() {
		if (this.anIntArray782 == null) {
			return true;
		}
		@Pc(10) boolean local10 = true;
		for (@Pc(17) int local17 = 0; local17 < this.anIntArray782.length; local17++) {
			if (!Static107.aClass72_149.method3192(0, this.anIntArray782[local17])) {
				local10 = false;
			}
		}
		return local10;
	}

	@OriginalMember(owner = "client!we", name = "c", descriptor = "(B)Lclient!vj;")
	public Class5_Sub7 method3922() {
		@Pc(8) Class5_Sub7[] local8 = new Class5_Sub7[5];
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < 5; local17++) {
			if (this.anIntArray784[local17] != -1) {
				local8[local15++] = Static218.method3807(Static107.aClass72_149, this.anIntArray784[local17]);
			}
		}
		@Pc(46) Class5_Sub7 local46 = new Class5_Sub7(local8, local15);
		@Pc(51) int local51;
		if (this.aShortArray161 != null) {
			for (local51 = 0; local51 < this.aShortArray161.length; local51++) {
				local46.method3794(this.aShortArray161[local51], this.aShortArray163[local51]);
			}
		}
		if (this.aShortArray160 != null) {
			for (local51 = 0; local51 < this.aShortArray160.length; local51++) {
				local46.method3791(this.aShortArray160[local51], this.aShortArray162[local51]);
			}
		}
		return local46;
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(ILclient!nh;B)V")
	private void method3923(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub23 arg1) {
		if (arg0 == 1) {
			this.anInt4822 = arg1.method2122();
			return;
		}
		@Pc(15) int local15;
		@Pc(21) int local21;
		if (arg0 == 2) {
			local15 = arg1.method2122();
			this.anIntArray782 = new int[local15];
			for (local21 = 0; local21 < local15; local21++) {
				this.anIntArray782[local21] = arg1.method2095();
			}
		} else if (arg0 == 3) {
			this.aBoolean209 = true;
		} else if (arg0 == 40) {
			local15 = arg1.method2122();
			this.aShortArray161 = new short[local15];
			this.aShortArray163 = new short[local15];
			for (local21 = 0; local21 < local15; local21++) {
				this.aShortArray161[local21] = (short) arg1.method2095();
				this.aShortArray163[local21] = (short) arg1.method2095();
			}
		} else if (arg0 == 41) {
			local15 = arg1.method2122();
			this.aShortArray160 = new short[local15];
			this.aShortArray162 = new short[local15];
			for (local21 = 0; local21 < local15; local21++) {
				this.aShortArray160[local21] = (short) arg1.method2095();
				this.aShortArray162[local21] = (short) arg1.method2095();
			}
		} else if (arg0 >= 60 && arg0 < 70) {
			this.anIntArray784[arg0 - 60] = arg1.method2095();
		}
	}

	@OriginalMember(owner = "client!we", name = "d", descriptor = "(B)Lclient!vj;")
	public Class5_Sub7 method3928() {
		if (this.anIntArray782 == null) {
			return null;
		}
		@Pc(22) Class5_Sub7[] local22 = new Class5_Sub7[this.anIntArray782.length];
		for (@Pc(24) int local24 = 0; local24 < this.anIntArray782.length; local24++) {
			local22[local24] = Static218.method3807(Static107.aClass72_149, this.anIntArray782[local24]);
		}
		@Pc(55) Class5_Sub7 local55;
		if (local22.length == 1) {
			local55 = local22[0];
		} else {
			local55 = new Class5_Sub7(local22, local22.length);
		}
		@Pc(66) int local66;
		if (this.aShortArray161 != null) {
			for (local66 = 0; local66 < this.aShortArray161.length; local66++) {
				local55.method3794(this.aShortArray161[local66], this.aShortArray163[local66]);
			}
		}
		if (this.aShortArray160 != null) {
			for (local66 = 0; local66 < this.aShortArray160.length; local66++) {
				local55.method3791(this.aShortArray160[local66], this.aShortArray162[local66]);
			}
		}
		return local55;
	}

	@OriginalMember(owner = "client!we", name = "h", descriptor = "(I)Z")
	public boolean method3929() {
		@Pc(7) boolean local7 = true;
		for (@Pc(9) int local9 = 0; local9 < 5; local9++) {
			if (this.anIntArray784[local9] != -1 && !Static107.aClass72_149.method3192(0, this.anIntArray784[local9])) {
				local7 = false;
			}
		}
		return local7;
	}
}
