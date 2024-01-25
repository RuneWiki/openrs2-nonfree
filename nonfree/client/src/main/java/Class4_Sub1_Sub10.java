import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ik")
public final class Class4_Sub1_Sub10 extends Class4_Sub1 {

	@OriginalMember(owner = "client!ik", name = "y", descriptor = "[[I")
	private int[][] anIntArrayArray33;

	@OriginalMember(owner = "client!ik", name = "z", descriptor = "[I")
	private int[] anIntArray270;

	@OriginalMember(owner = "client!ik", name = "G", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray24;

	@OriginalMember(owner = "client!ik", name = "K", descriptor = "[I")
	public int[] anIntArray271;

	@OriginalMember(owner = "client!ik", name = "w", descriptor = "Z")
	public boolean aBoolean247 = true;

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "([ILclient!tq;B)V")
	public void method2617(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class4_Sub7 arg1) {
		if (this.anIntArray270 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < this.anIntArray270.length && local11 < arg0.length; local11++) {
			@Pc(22) int local22 = Static194.anIntArray356[this.method2623(local11)];
			if (local22 > 0) {
				arg1.method2366(local22, (long) arg0[local11]);
			}
		}
	}

	@OriginalMember(owner = "client!ik", name = "b", descriptor = "(B)Ljava/lang/String;")
	public String method2619() {
		@Pc(10) StringBuffer local10 = new StringBuffer(80);
		if (this.aStringArray24 == null) {
			return "";
		}
		local10.append(this.aStringArray24[0]);
		for (@Pc(24) int local24 = 1; local24 < this.aStringArray24.length; local24++) {
			local10.append("...");
			local10.append(this.aStringArray24[local24]);
		}
		return local10.toString();
	}

	@OriginalMember(owner = "client!ik", name = "f", descriptor = "(I)I")
	public int method2620() {
		return this.anIntArray270 == null ? 0 : this.anIntArray270.length;
	}

	@OriginalMember(owner = "client!ik", name = "b", descriptor = "(II)I")
	public int method2623(@OriginalArg(1) int arg0) {
		return this.anIntArray270 == null || arg0 < 0 || this.anIntArray270.length < arg0 ? -1 : this.anIntArray270[arg0];
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(IZI)I")
	public int method2624(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.anIntArray270 == null || arg1 < 0 || this.anIntArray270.length < arg1) {
			return -1;
		} else if (this.anIntArrayArray33[arg1] == null || arg0 < 0 || arg0 > this.anIntArrayArray33[arg1].length) {
			return -1;
		} else {
			return this.anIntArrayArray33[arg1][arg0];
		}
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(Lclient!tq;I)Ljava/lang/String;")
	public String method2625(@OriginalArg(0) Class4_Sub7 arg0) {
		@Pc(10) StringBuffer local10 = new StringBuffer(80);
		if (this.anIntArray270 != null) {
			for (@Pc(15) int local15 = 0; local15 < this.anIntArray270.length; local15++) {
				local10.append(this.aStringArray24[local15]);
				local10.append(Static215.method3722(arg0.method2388(Static88.anIntArray200[this.anIntArray270[local15]]), this.anIntArray270[local15], this.anIntArrayArray33[local15]));
			}
		}
		local10.append(this.aStringArray24[this.aStringArray24.length - 1]);
		return local10.toString();
	}

	@OriginalMember(owner = "client!ik", name = "b", descriptor = "(Lclient!tq;I)V")
	public void method2626(@OriginalArg(0) Class4_Sub7 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method2380();
			if (local15 == 0) {
				return;
			}
			this.method2628(arg0, local15);
		}
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(Lclient!tq;IB)V")
	private void method2628(@OriginalArg(0) Class4_Sub7 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.aStringArray24 = Static304.method5143(arg0.method2379(), '<');
			return;
		}
		@Pc(21) int local21;
		@Pc(27) int local27;
		if (arg1 == 2) {
			local21 = arg0.method2380();
			this.anIntArray271 = new int[local21];
			for (local27 = 0; local27 < local21; local27++) {
				this.anIntArray271[local27] = arg0.method2404();
			}
		} else if (arg1 == 3) {
			local21 = arg0.method2380();
			this.anIntArrayArray33 = new int[local21][];
			this.anIntArray270 = new int[local21];
			for (local27 = 0; local27 < local21; local27++) {
				@Pc(77) int local77 = arg0.method2404();
				this.anIntArray270[local27] = local77;
				this.anIntArrayArray33[local27] = new int[Static216.anIntArray508[local77]];
				for (@Pc(92) int local92 = 0; local92 < Static216.anIntArray508[local77]; local92++) {
					this.anIntArrayArray33[local27][local92] = arg0.method2404();
				}
			}
		} else if (arg1 == 4) {
			this.aBoolean247 = false;
		}
	}

	@OriginalMember(owner = "client!ik", name = "c", descriptor = "(B)V")
	public void method2629() {
		if (this.anIntArray271 != null) {
			for (@Pc(10) int local10 = 0; local10 < this.anIntArray271.length; local10++) {
				this.anIntArray271[local10] |= 0x8000;
			}
		}
	}
}
