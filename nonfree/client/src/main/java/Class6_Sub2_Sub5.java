import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dw")
public final class Class6_Sub2_Sub5 extends Class6_Sub2 {

	@OriginalMember(owner = "client!dw", name = "t", descriptor = "Lclient!pda;")
	public Class248 aClass248_1;

	@OriginalMember(owner = "client!dw", name = "v", descriptor = "[[I")
	private int[][] anIntArrayArray15;

	@OriginalMember(owner = "client!dw", name = "w", descriptor = "[I")
	public int[] anIntArray157;

	@OriginalMember(owner = "client!dw", name = "D", descriptor = "[I")
	private int[] anIntArray158;

	@OriginalMember(owner = "client!dw", name = "F", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray4;

	@OriginalMember(owner = "client!dw", name = "C", descriptor = "Z")
	public boolean aBoolean139 = true;

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(Lclient!ji;II)V")
	private void method1819(@OriginalArg(0) Class6_Sub21 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.aStringArray4 = Static115.method2011('<', arg0.method6044());
			return;
		}
		@Pc(25) int local25;
		@Pc(31) int local31;
		if (arg1 == 2) {
			local25 = arg0.method6069();
			this.anIntArray157 = new int[local25];
			for (local31 = 0; local31 < local25; local31++) {
				this.anIntArray157[local31] = arg0.method6003();
			}
		} else if (arg1 == 3) {
			local25 = arg0.method6069();
			this.anIntArray158 = new int[local25];
			this.anIntArrayArray15 = new int[local25][];
			for (local31 = 0; local31 < local25; local31++) {
				@Pc(77) int local77 = arg0.method6003();
				@Pc(81) Class342 local81 = Static421.method6079(local77);
				if (local81 != null) {
					this.anIntArray158[local31] = local77;
					this.anIntArrayArray15[local31] = new int[local81.anInt9218];
					for (@Pc(97) int local97 = 0; local97 < local81.anInt9218; local97++) {
						this.anIntArrayArray15[local31][local97] = arg0.method6003();
					}
				}
			}
		} else if (arg1 == 4) {
			this.aBoolean139 = false;
		}
	}

	@OriginalMember(owner = "client!dw", name = "d", descriptor = "(I)I")
	public int method1820() {
		return this.anIntArray158 == null ? 0 : this.anIntArray158.length;
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(Lclient!ji;I)Ljava/lang/String;")
	public String method1821(@OriginalArg(0) Class6_Sub21 arg0) {
		@Pc(16) StringBuffer local16 = new StringBuffer(80);
		if (this.anIntArray158 != null) {
			for (@Pc(21) int local21 = 0; local21 < this.anIntArray158.length; local21++) {
				local16.append(this.aStringArray4[local21]);
				local16.append(this.aClass248_1.method5724(this.method1828(local21), this.anIntArrayArray15[local21], arg0.method6016(Static421.method6079(this.anIntArray158[local21]).anInt9216)));
			}
		}
		local16.append(this.aStringArray4[this.aStringArray4.length - 1]);
		return local16.toString();
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(III)I")
	public int method1822(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.anIntArray158 == null || arg1 < 0 || arg1 > this.anIntArray158.length) {
			return -1;
		} else if (this.anIntArrayArray15[arg1] == null || arg0 < 0 || this.anIntArrayArray15[arg1].length < arg0) {
			return -1;
		} else {
			return this.anIntArrayArray15[arg1][arg0];
		}
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(ILclient!ji;)V")
	public void method1823(@OriginalArg(1) Class6_Sub21 arg0) {
		while (true) {
			@Pc(14) int local14 = arg0.method6069();
			if (local14 == 0) {
				return;
			}
			this.method1819(arg0, local14);
		}
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(Lclient!ji;Z[I)V")
	public void method1825(@OriginalArg(0) Class6_Sub21 arg0, @OriginalArg(2) int[] arg1) {
		if (this.anIntArray158 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < this.anIntArray158.length && arg1.length > local11; local11++) {
			@Pc(19) int local19 = this.method1828(local11).anInt9219;
			if (local19 > 0) {
				arg0.method6054((long) arg1[local11], local19);
			}
		}
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(B)Ljava/lang/String;")
	public String method1827() {
		@Pc(16) StringBuffer local16 = new StringBuffer(80);
		if (this.aStringArray4 == null) {
			return "";
		}
		local16.append(this.aStringArray4[0]);
		for (@Pc(30) int local30 = 1; local30 < this.aStringArray4.length; local30++) {
			local16.append("...");
			local16.append(this.aStringArray4[local30]);
		}
		return local16.toString();
	}

	@OriginalMember(owner = "client!dw", name = "c", descriptor = "(II)Lclient!vf;")
	public Class342 method1828(@OriginalArg(0) int arg0) {
		return this.anIntArray158 == null || arg0 < 0 || this.anIntArray158.length < arg0 ? null : Static421.method6079(this.anIntArray158[arg0]);
	}

	@OriginalMember(owner = "client!dw", name = "e", descriptor = "(I)V")
	public void method1829() {
		if (this.anIntArray157 != null) {
			for (@Pc(11) int local11 = 0; local11 < this.anIntArray157.length; local11++) {
				this.anIntArray157[local11] |= 0x8000;
			}
		}
	}
}
