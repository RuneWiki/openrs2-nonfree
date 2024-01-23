import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gm")
public final class Class3_Sub4_Sub9 extends Class3_Sub4 {

	@OriginalMember(owner = "client!gm", name = "G", descriptor = "[[I")
	private int[][] anIntArrayArray23;

	@OriginalMember(owner = "client!gm", name = "R", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray18;

	@OriginalMember(owner = "client!gm", name = "S", descriptor = "[I")
	private int[] anIntArray182;

	@OriginalMember(owner = "client!gm", name = "T", descriptor = "[I")
	public int[] anIntArray183;

	@OriginalMember(owner = "client!gm", name = "J", descriptor = "Z")
	public boolean aBoolean151 = true;

	@OriginalMember(owner = "client!gm", name = "c", descriptor = "(III)I")
	public int method1574(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.anIntArray182 == null || arg1 < 0 || this.anIntArray182.length < arg1) {
			return -1;
		} else if (this.anIntArrayArray23[arg1] == null || arg0 < 0 || arg0 > this.anIntArrayArray23[arg1].length) {
			return -1;
		} else {
			return this.anIntArrayArray23[arg1][arg0];
		}
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(IBLclient!ug;)V")
	private void method1575(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub26 arg1) {
		if (arg0 == 1) {
			this.aStringArray18 = Static308.method4941(arg1.method3931(), '<');
			return;
		}
		@Pc(28) int local28;
		@Pc(38) int local38;
		if (arg0 == 2) {
			local28 = arg1.method3915();
			this.anIntArray183 = new int[local28];
			for (local38 = 0; local38 < local28; local38++) {
				this.anIntArray183[local38] = arg1.method3948();
			}
		} else if (arg0 == 3) {
			local28 = arg1.method3915();
			this.anIntArray182 = new int[local28];
			this.anIntArrayArray23 = new int[local28][];
			for (local38 = 0; local38 < local28; local38++) {
				@Pc(49) int local49 = arg1.method3948();
				this.anIntArray182[local38] = local49;
				this.anIntArrayArray23[local38] = new int[Static56.anIntArray100[local49]];
				for (@Pc(64) int local64 = 0; local64 < Static56.anIntArray100[local49]; local64++) {
					this.anIntArrayArray23[local38][local64] = arg1.method3948();
				}
			}
		} else if (arg0 == 4) {
			this.aBoolean151 = false;
		}
	}

	@OriginalMember(owner = "client!gm", name = "f", descriptor = "(I)I")
	public int method1576() {
		return this.anIntArray182 == null ? 0 : this.anIntArray182.length;
	}

	@OriginalMember(owner = "client!gm", name = "c", descriptor = "(B)V")
	public void method1577() {
		if (this.anIntArray183 != null) {
			for (@Pc(14) int local14 = 0; local14 < this.anIntArray183.length; local14++) {
				this.anIntArray183[local14] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(Lclient!ug;[II)V")
	public void method1579(@OriginalArg(0) Class3_Sub26 arg0, @OriginalArg(1) int[] arg1) {
		if (this.anIntArray182 == null) {
			return;
		}
		for (@Pc(12) int local12 = 0; this.anIntArray182.length > local12 && local12 < arg1.length; local12++) {
			@Pc(36) int local36 = Static109.anIntArray337[this.method1582(local12)];
			if (local36 > 0) {
				arg0.method3929(local36, (long) arg1[local12]);
			}
		}
	}

	@OriginalMember(owner = "client!gm", name = "b", descriptor = "(II)I")
	public int method1582(@OriginalArg(0) int arg0) {
		return this.anIntArray182 == null || arg0 < 0 || arg0 > this.anIntArray182.length ? -1 : this.anIntArray182[arg0];
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(ILclient!ug;)V")
	public void method1583(@OriginalArg(1) Class3_Sub26 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method3915();
			if (local5 == 0) {
				return;
			}
			this.method1575(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(Lclient!ug;B)Ljava/lang/String;")
	public String method1585(@OriginalArg(0) Class3_Sub26 arg0) {
		@Pc(18) StringBuffer local18 = new StringBuffer(80);
		if (this.anIntArray182 != null) {
			for (@Pc(23) int local23 = 0; local23 < this.anIntArray182.length; local23++) {
				local18.append(this.aStringArray18[local23]);
				local18.append(Static306.method4918(arg0.method3947(Static236.anIntArray507[this.anIntArray182[local23]]), this.anIntArrayArray23[local23], this.anIntArray182[local23]));
			}
		}
		local18.append(this.aStringArray18[this.aStringArray18.length - 1]);
		return local18.toString();
	}

	@OriginalMember(owner = "client!gm", name = "g", descriptor = "(I)Ljava/lang/String;")
	public String method1586() {
		@Pc(14) StringBuffer local14 = new StringBuffer(80);
		if (this.aStringArray18 == null) {
			return "";
		}
		local14.append(this.aStringArray18[0]);
		for (@Pc(33) int local33 = 1; local33 < this.aStringArray18.length; local33++) {
			local14.append("...");
			local14.append(this.aStringArray18[local33]);
		}
		return local14.toString();
	}
}
