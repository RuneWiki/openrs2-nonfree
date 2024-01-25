import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ht")
public final class Class2_Sub9_Sub8 extends Class2_Sub9 {

	@OriginalMember(owner = "client!ht", name = "L", descriptor = "[[I")
	private int[][] anIntArrayArray28;

	@OriginalMember(owner = "client!ht", name = "P", descriptor = "[I")
	private int[] anIntArray228;

	@OriginalMember(owner = "client!ht", name = "R", descriptor = "[I")
	public int[] anIntArray229;

	@OriginalMember(owner = "client!ht", name = "T", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray19;

	@OriginalMember(owner = "client!ht", name = "M", descriptor = "Z")
	public boolean aBoolean268 = true;

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(III)I")
	public int method2560(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.anIntArray228 == null || arg1 < 0 || arg1 > this.anIntArray228.length) {
			return -1;
		} else if (this.anIntArrayArray28[arg1] == null || arg0 < 0 || this.anIntArrayArray28[arg1].length < arg0) {
			return -1;
		} else {
			return this.anIntArrayArray28[arg1][arg0];
		}
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(ZLclient!ef;)V")
	public void method2561(@OriginalArg(1) Class2_Sub12 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method3124();
			if (local5 == 0) {
				return;
			}
			this.method2562(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(ILclient!ef;I)V")
	private void method2562(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub12 arg1) {
		if (arg0 == 1) {
			this.aStringArray19 = Static137.method2633('<', arg1.method3113());
			return;
		}
		@Pc(26) int local26;
		@Pc(32) int local32;
		if (arg0 == 2) {
			local26 = arg1.method3124();
			this.anIntArray229 = new int[local26];
			for (local32 = 0; local32 < local26; local32++) {
				this.anIntArray229[local32] = arg1.method3104();
			}
		} else if (arg0 == 3) {
			local26 = arg1.method3124();
			this.anIntArrayArray28 = new int[local26][];
			this.anIntArray228 = new int[local26];
			for (local32 = 0; local32 < local26; local32++) {
				@Pc(82) int local82 = arg1.method3104();
				this.anIntArray228[local32] = local82;
				this.anIntArrayArray28[local32] = new int[Static6.anIntArray21[local82]];
				for (@Pc(97) int local97 = 0; local97 < Static6.anIntArray21[local82]; local97++) {
					this.anIntArrayArray28[local32][local97] = arg1.method3104();
				}
			}
		} else if (arg0 == 4) {
			this.aBoolean268 = false;
			return;
		}
	}

	@OriginalMember(owner = "client!ht", name = "d", descriptor = "(B)I")
	public int method2564() {
		return this.anIntArray228 == null ? 0 : this.anIntArray228.length;
	}

	@OriginalMember(owner = "client!ht", name = "g", descriptor = "(I)V")
	public void method2565() {
		if (this.anIntArray229 != null) {
			for (@Pc(18) int local18 = 0; local18 < this.anIntArray229.length; local18++) {
				this.anIntArray229[local18] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!ht", name = "b", descriptor = "(ZLclient!ef;)Ljava/lang/String;")
	public String method2567(@OriginalArg(1) Class2_Sub12 arg0) {
		@Pc(15) StringBuffer local15 = new StringBuffer(80);
		if (this.anIntArray228 != null) {
			for (@Pc(20) int local20 = 0; local20 < this.anIntArray228.length; local20++) {
				local15.append(this.aStringArray19[local20]);
				local15.append(Static51.method1023(this.anIntArray228[local20], this.anIntArrayArray28[local20], arg0.method3150(Static231.anIntArray392[this.anIntArray228[local20]])));
			}
		}
		local15.append(this.aStringArray19[this.aStringArray19.length - 1]);
		return local15.toString();
	}

	@OriginalMember(owner = "client!ht", name = "i", descriptor = "(I)Ljava/lang/String;")
	public String method2569() {
		@Pc(10) StringBuffer local10 = new StringBuffer(80);
		if (this.aStringArray19 == null) {
			return "";
		}
		local10.append(this.aStringArray19[0]);
		for (@Pc(24) int local24 = 1; local24 < this.aStringArray19.length; local24++) {
			local10.append("...");
			local10.append(this.aStringArray19[local24]);
		}
		return local10.toString();
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "([IBLclient!ef;)V")
	public void method2570(@OriginalArg(0) int[] arg0, @OriginalArg(2) Class2_Sub12 arg1) {
		if (this.anIntArray228 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; this.anIntArray228.length > local11 && arg0.length > local11; local11++) {
			@Pc(20) int local20 = Static329.anIntArray495[this.method2572(local11)];
			if (local20 > 0) {
				arg1.method3114(local20, (long) arg0[local11]);
			}
		}
	}

	@OriginalMember(owner = "client!ht", name = "b", descriptor = "(II)I")
	public int method2572(@OriginalArg(0) int arg0) {
		return this.anIntArray228 == null || arg0 < 0 || this.anIntArray228.length < arg0 ? -1 : this.anIntArray228[arg0];
	}
}
