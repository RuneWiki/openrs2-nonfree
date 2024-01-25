import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dm")
public final class Class5_Sub2_Sub10 extends Class5_Sub2 {

	@OriginalMember(owner = "client!dm", name = "t", descriptor = "[I")
	public int[] anIntArray188;

	@OriginalMember(owner = "client!dm", name = "y", descriptor = "[[I")
	private int[][] anIntArrayArray17;

	@OriginalMember(owner = "client!dm", name = "A", descriptor = "Lclient!tb;")
	public Class278 aClass278_1;

	@OriginalMember(owner = "client!dm", name = "D", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray14;

	@OriginalMember(owner = "client!dm", name = "F", descriptor = "[I")
	private int[] anIntArray189;

	@OriginalMember(owner = "client!dm", name = "E", descriptor = "Z")
	public boolean aBoolean139 = true;

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(II)Lclient!io;")
	public Class148 method1994(@OriginalArg(0) int arg0) {
		return this.anIntArray189 == null || arg0 < 0 || arg0 > this.anIntArray189.length ? null : Static412.method5991(this.anIntArray189[arg0]);
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "([ILclient!co;Z)V")
	public void method1995(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class5_Sub3 arg1) {
		if (this.anIntArray189 == null) {
			return;
		}
		for (@Pc(17) int local17 = 0; local17 < this.anIntArray189.length; local17++) {
			if (local17 >= arg0.length) {
				return;
			}
			@Pc(25) int local25 = this.method1994(local17).anInt4060;
			if (local25 > 0) {
				arg1.method4217(local25, (long) arg0[local17]);
			}
		}
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(Lclient!co;Z)V")
	public void method1996(@OriginalArg(0) Class5_Sub3 arg0) {
		while (true) {
			@Pc(11) int local11 = arg0.method4220();
			if (local11 == 0) {
				return;
			}
			this.method1999(arg0, local11);
		}
	}

	@OriginalMember(owner = "client!dm", name = "b", descriptor = "(B)I")
	public int method1997() {
		return this.anIntArray189 == null ? 0 : this.anIntArray189.length;
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(BLclient!co;)Ljava/lang/String;")
	public String method1998(@OriginalArg(1) Class5_Sub3 arg0) {
		@Pc(10) StringBuffer local10 = new StringBuffer(80);
		if (this.anIntArray189 != null) {
			for (@Pc(21) int local21 = 0; local21 < this.anIntArray189.length; local21++) {
				local10.append(this.aStringArray14[local21]);
				local10.append(this.aClass278_1.method6454(this.anIntArrayArray17[local21], this.method1994(local21), arg0.method4206(Static412.method5991(this.anIntArray189[local21]).anInt4058)));
			}
		}
		local10.append(this.aStringArray14[this.aStringArray14.length - 1]);
		return local10.toString();
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(Lclient!co;II)V")
	private void method1999(@OriginalArg(0) Class5_Sub3 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aStringArray14 = Static514.method7107('<', arg0.method4234());
			return;
		}
		@Pc(35) int local35;
		@Pc(45) int local45;
		if (arg1 == 2) {
			local35 = arg0.method4220();
			this.anIntArray188 = new int[local35];
			for (local45 = 0; local45 < local35; local45++) {
				this.anIntArray188[local45] = arg0.method4227();
			}
		} else if (arg1 == 3) {
			local35 = arg0.method4220();
			this.anIntArrayArray17 = new int[local35][];
			this.anIntArray189 = new int[local35];
			for (local45 = 0; local45 < local35; local45++) {
				@Pc(53) int local53 = arg0.method4227();
				@Pc(57) Class148 local57 = Static412.method5991(local53);
				if (local57 != null) {
					this.anIntArray189[local45] = local53;
					this.anIntArrayArray17[local45] = new int[local57.anInt4056];
					for (@Pc(73) int local73 = 0; local73 < local57.anInt4056; local73++) {
						this.anIntArrayArray17[local45][local73] = arg0.method4227();
					}
				}
			}
		} else if (arg1 == 4) {
			this.aBoolean139 = false;
			return;
		}
	}

	@OriginalMember(owner = "client!dm", name = "c", descriptor = "(Z)V")
	public void method2000() {
		if (this.anIntArray188 != null) {
			for (@Pc(6) int local6 = 0; local6 < this.anIntArray188.length; local6++) {
				this.anIntArray188[local6] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(III)I")
	public int method2001(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.anIntArray189 == null || arg1 < 0 || arg1 > this.anIntArray189.length) {
			return -1;
		} else if (this.anIntArrayArray17[arg1] == null || arg0 < 0 || arg0 > this.anIntArrayArray17[arg1].length) {
			return -1;
		} else {
			return this.anIntArrayArray17[arg1][arg0];
		}
	}

	@OriginalMember(owner = "client!dm", name = "d", descriptor = "(Z)Ljava/lang/String;")
	public String method2003() {
		@Pc(10) StringBuffer local10 = new StringBuffer(80);
		if (this.aStringArray14 == null) {
			return "";
		}
		local10.append(this.aStringArray14[0]);
		for (@Pc(29) int local29 = 1; local29 < this.aStringArray14.length; local29++) {
			local10.append("...");
			local10.append(this.aStringArray14[local29]);
		}
		return local10.toString();
	}
}
