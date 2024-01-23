import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!de")
public final class Class4_Sub2_Sub5 extends Class4_Sub2 {

	@OriginalMember(owner = "client!de", name = "A", descriptor = "[I")
	public int[] anIntArray118;

	@OriginalMember(owner = "client!de", name = "B", descriptor = "[[I")
	private int[][] anIntArrayArray10;

	@OriginalMember(owner = "client!de", name = "E", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray5;

	@OriginalMember(owner = "client!de", name = "N", descriptor = "[I")
	private int[] anIntArray119;

	@OriginalMember(owner = "client!de", name = "C", descriptor = "Z")
	public boolean aBoolean65 = true;

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(ZI)I")
	public int method972(@OriginalArg(1) int arg0) {
		return this.anIntArray119 == null || arg0 < 0 || arg0 > this.anIntArray119.length ? -1 : this.anIntArray119[arg0];
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(ILclient!pi;)Ljava/lang/String;")
	public String method973(@OriginalArg(1) Class4_Sub24 arg0) {
		@Pc(18) StringBuffer local18 = new StringBuffer(80);
		if (this.anIntArray119 != null) {
			for (@Pc(25) int local25 = 0; local25 < this.anIntArray119.length; local25++) {
				local18.append(this.aStringArray5[local25]);
				local18.append(Static149.method2349(arg0.method3071(Static296.anIntArray462[this.anIntArray119[local25]]), this.anIntArray119[local25], this.anIntArrayArray10[local25]));
			}
		}
		local18.append(this.aStringArray5[this.aStringArray5.length - 1]);
		return local18.toString();
	}

	@OriginalMember(owner = "client!de", name = "d", descriptor = "(I)I")
	public int method976() {
		return this.anIntArray119 == null ? 0 : this.anIntArray119.length;
	}

	@OriginalMember(owner = "client!de", name = "e", descriptor = "(I)V")
	public void method977() {
		if (this.anIntArray118 != null) {
			for (@Pc(8) int local8 = 0; local8 < this.anIntArray118.length; local8++) {
				this.anIntArray118[local8] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(IBLclient!pi;)V")
	private void method978(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub24 arg1) {
		if (arg0 == 1) {
			this.aStringArray5 = Static307.method4708(arg1.method3111(), '<');
			return;
		}
		@Pc(38) int local38;
		@Pc(48) int local48;
		if (arg0 == 2) {
			local38 = arg1.method3110();
			this.anIntArray118 = new int[local38];
			for (local48 = 0; local48 < local38; local48++) {
				this.anIntArray118[local48] = arg1.method3085();
			}
		} else if (arg0 == 3) {
			local38 = arg1.method3110();
			this.anIntArrayArray10 = new int[local38][];
			this.anIntArray119 = new int[local38];
			for (local48 = 0; local48 < local38; local48++) {
				@Pc(59) int local59 = arg1.method3085();
				this.anIntArray119[local48] = local59;
				this.anIntArrayArray10[local48] = new int[Static66.anIntArray392[local59]];
				for (@Pc(74) int local74 = 0; local74 < Static66.anIntArray392[local59]; local74++) {
					this.anIntArrayArray10[local48][local74] = arg1.method3085();
				}
			}
		} else if (arg0 == 4) {
			this.aBoolean65 = false;
		}
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "([ILclient!pi;I)V")
	public void method980(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class4_Sub24 arg1) {
		if (this.anIntArray119 == null) {
			return;
		}
		for (@Pc(17) int local17 = 0; this.anIntArray119.length > local17 && arg0.length > local17; local17++) {
			@Pc(41) int local41 = Static71.anIntArray137[this.method972(local17)];
			if (local41 > 0) {
				arg1.method3081(local41, (long) arg0[local17]);
			}
		}
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(BII)I")
	public int method981(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.anIntArray119 == null || arg0 < 0 || arg0 > this.anIntArray119.length) {
			return -1;
		} else if (this.anIntArrayArray10[arg0] == null || arg1 < 0 || this.anIntArrayArray10[arg0].length < arg1) {
			return -1;
		} else {
			return this.anIntArrayArray10[arg0][arg1];
		}
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(B)Ljava/lang/String;")
	public String method983() {
		@Pc(6) StringBuffer local6 = new StringBuffer(80);
		if (this.aStringArray5 == null) {
			return "";
		}
		local6.append(this.aStringArray5[0]);
		for (@Pc(33) int local33 = 1; local33 < this.aStringArray5.length; local33++) {
			local6.append("...");
			local6.append(this.aStringArray5[local33]);
		}
		return local6.toString();
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(BLclient!pi;)V")
	public void method984(@OriginalArg(1) Class4_Sub24 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method3110();
			if (local5 == 0) {
				return;
			}
			this.method978(local5, arg0);
		}
	}
}
