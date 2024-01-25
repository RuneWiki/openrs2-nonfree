import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hu")
public final class Class1_Sub3_Sub10 extends Class1_Sub3 {

	@OriginalMember(owner = "client!hu", name = "x", descriptor = "Lclient!al;")
	public Class13 aClass13_1;

	@OriginalMember(owner = "client!hu", name = "A", descriptor = "[I")
	public int[] anIntArray219;

	@OriginalMember(owner = "client!hu", name = "B", descriptor = "[[I")
	private int[][] anIntArrayArray22;

	@OriginalMember(owner = "client!hu", name = "E", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray17;

	@OriginalMember(owner = "client!hu", name = "G", descriptor = "[I")
	private int[] anIntArray220;

	@OriginalMember(owner = "client!hu", name = "M", descriptor = "Z")
	public boolean aBoolean274 = true;

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(IBI)I")
	public int method2174(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.anIntArray220 == null || arg0 < 0 || arg0 > this.anIntArray220.length) {
			return -1;
		} else if (this.anIntArrayArray22[arg0] == null || arg1 < 0 || arg1 > this.anIntArrayArray22[arg0].length) {
			return -1;
		} else {
			return this.anIntArrayArray22[arg0][arg1];
		}
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(Lclient!wm;II)V")
	private void method2175(@OriginalArg(0) Class1_Sub19 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aStringArray17 = Static354.method4612('<', arg0.method2914());
			return;
		}
		@Pc(43) int local43;
		@Pc(53) int local53;
		if (arg1 == 2) {
			local43 = arg0.method2915();
			this.anIntArray219 = new int[local43];
			for (local53 = 0; local53 < local43; local53++) {
				this.anIntArray219[local53] = arg0.method2896();
			}
		} else if (arg1 == 3) {
			local43 = arg0.method2915();
			this.anIntArrayArray22 = new int[local43][];
			this.anIntArray220 = new int[local43];
			for (local53 = 0; local53 < local43; local53++) {
				@Pc(59) int local59 = arg0.method2896();
				@Pc(63) Class165 local63 = Static86.method5980(local59);
				if (local63 != null) {
					this.anIntArray220[local53] = local59;
					this.anIntArrayArray22[local53] = new int[local63.anInt4665];
					for (@Pc(79) int local79 = 0; local79 < local63.anInt4665; local79++) {
						this.anIntArrayArray22[local53][local79] = arg0.method2896();
					}
				}
			}
		} else if (arg1 == 4) {
			this.aBoolean274 = false;
			return;
		}
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "([ILclient!wm;B)V")
	public void method2176(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class1_Sub19 arg1) {
		if (this.anIntArray220 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < this.anIntArray220.length && local11 < arg0.length; local11++) {
			@Pc(19) int local19 = this.method2179(local11).anInt4668;
			if (local19 > 0) {
				arg1.method2893(local19, (long) arg0[local11]);
			}
		}
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(B)V")
	public void method2178() {
		if (this.anIntArray219 != null) {
			for (@Pc(6) int local6 = 0; local6 < this.anIntArray219.length; local6++) {
				this.anIntArray219[local6] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(II)Lclient!mt;")
	public Class165 method2179(@OriginalArg(1) int arg0) {
		return this.anIntArray220 == null || arg0 < 0 || this.anIntArray220.length < arg0 ? null : Static86.method5980(this.anIntArray220[arg0]);
	}

	@OriginalMember(owner = "client!hu", name = "b", descriptor = "(B)Ljava/lang/String;")
	public String method2180() {
		@Pc(10) StringBuffer local10 = new StringBuffer(80);
		if (this.aStringArray17 == null) {
			return "";
		}
		local10.append(this.aStringArray17[0]);
		for (@Pc(31) int local31 = 1; local31 < this.aStringArray17.length; local31++) {
			local10.append("...");
			local10.append(this.aStringArray17[local31]);
		}
		return local10.toString();
	}

	@OriginalMember(owner = "client!hu", name = "c", descriptor = "(B)I")
	public int method2181() {
		return this.anIntArray220 == null ? 0 : this.anIntArray220.length;
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(Lclient!wm;I)V")
	public void method2182(@OriginalArg(0) Class1_Sub19 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method2915();
			if (local5 == 0) {
				return;
			}
			this.method2175(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(BLclient!wm;)Ljava/lang/String;")
	public String method2183(@OriginalArg(1) Class1_Sub19 arg0) {
		@Pc(17) StringBuffer local17 = new StringBuffer(80);
		if (this.anIntArray220 != null) {
			for (@Pc(22) int local22 = 0; local22 < this.anIntArray220.length; local22++) {
				local17.append(this.aStringArray17[local22]);
				local17.append(this.aClass13_1.method200(this.anIntArrayArray22[local22], this.method2179(local22), arg0.method2890(Static86.method5980(this.anIntArray220[local22]).anInt4666)));
			}
		}
		local17.append(this.aStringArray17[this.aStringArray17.length - 1]);
		return local17.toString();
	}
}
