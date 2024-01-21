import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ri")
public final class Class5_Sub2_Sub18 extends Class5_Sub2 {

	@OriginalMember(owner = "client!ri", name = "E", descriptor = "[I")
	private int[] anIntArray358;

	@OriginalMember(owner = "client!ri", name = "M", descriptor = "[S")
	private short[] aShortArray48;

	@OriginalMember(owner = "client!ri", name = "Q", descriptor = "[S")
	private short[] aShortArray49;

	@OriginalMember(owner = "client!ri", name = "X", descriptor = "[S")
	private short[] aShortArray50;

	@OriginalMember(owner = "client!ri", name = "ab", descriptor = "[S")
	private short[] aShortArray51;

	@OriginalMember(owner = "client!ri", name = "R", descriptor = "[I")
	private final int[] anIntArray359 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!ri", name = "bb", descriptor = "I")
	public int anInt3396 = -1;

	@OriginalMember(owner = "client!ri", name = "V", descriptor = "Z")
	public boolean aBoolean151 = false;

	@OriginalMember(owner = "client!ri", name = "f", descriptor = "(I)Lclient!lg;")
	public Class1_Sub5 method2568() {
		@Pc(7) int local7 = 0;
		@Pc(10) Class1_Sub5[] local10 = new Class1_Sub5[5];
		for (@Pc(17) int local17 = 0; local17 < 5; local17++) {
			if (this.anIntArray359[local17] != -1) {
				local10[local7++] = Static112.method1814(Static67.aClass23_78, this.anIntArray359[local17]);
			}
		}
		@Pc(48) Class1_Sub5 local48 = new Class1_Sub5(local10, local7);
		@Pc(53) int local53;
		if (this.aShortArray51 != null) {
			for (local53 = 0; local53 < this.aShortArray51.length; local53++) {
				local48.method1819(this.aShortArray51[local53], this.aShortArray48[local53]);
			}
		}
		if (this.aShortArray49 != null) {
			for (local53 = 0; local53 < this.aShortArray49.length; local53++) {
				local48.method1797(this.aShortArray49[local53], this.aShortArray50[local53]);
			}
		}
		return local48;
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(ILclient!ce;)V")
	public void method2569(@OriginalArg(1) Class5_Sub6 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method3062();
			if (local5 == 0) {
				return;
			}
			this.method2574(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!ri", name = "b", descriptor = "(Z)Z")
	public boolean method2570() {
		if (this.anIntArray358 == null) {
			return true;
		}
		@Pc(12) boolean local12 = true;
		for (@Pc(14) int local14 = 0; local14 < this.anIntArray358.length; local14++) {
			if (!Static67.aClass23_78.method756(this.anIntArray358[local14], 0)) {
				local12 = false;
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!ri", name = "g", descriptor = "(I)Lclient!lg;")
	public Class1_Sub5 method2572() {
		if (this.anIntArray358 == null) {
			return null;
		}
		@Pc(15) Class1_Sub5[] local15 = new Class1_Sub5[this.anIntArray358.length];
		for (@Pc(17) int local17 = 0; local17 < this.anIntArray358.length; local17++) {
			local15[local17] = Static112.method1814(Static67.aClass23_78, this.anIntArray358[local17]);
		}
		@Pc(53) Class1_Sub5 local53;
		if (local15.length == 1) {
			local53 = local15[0];
		} else {
			local53 = new Class1_Sub5(local15, local15.length);
		}
		@Pc(67) int local67;
		if (this.aShortArray51 != null) {
			for (local67 = 0; local67 < this.aShortArray51.length; local67++) {
				local53.method1819(this.aShortArray51[local67], this.aShortArray48[local67]);
			}
		}
		if (this.aShortArray49 != null) {
			for (local67 = 0; local67 < this.aShortArray49.length; local67++) {
				local53.method1797(this.aShortArray49[local67], this.aShortArray50[local67]);
			}
		}
		return local53;
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(IILclient!ce;)V")
	private void method2574(@OriginalArg(0) int arg0, @OriginalArg(2) Class5_Sub6 arg1) {
		if (arg0 == 1) {
			this.anInt3396 = arg1.method3062();
			return;
		}
		@Pc(55) int local55;
		@Pc(65) int local65;
		if (arg0 == 2) {
			local55 = arg1.method3062();
			this.anIntArray358 = new int[local55];
			for (local65 = 0; local65 < local55; local65++) {
				this.anIntArray358[local65] = arg1.method3077();
			}
		} else if (arg0 == 3) {
			this.aBoolean151 = true;
		} else if (arg0 == 40) {
			local55 = arg1.method3062();
			this.aShortArray48 = new short[local55];
			this.aShortArray51 = new short[local55];
			for (local65 = 0; local65 < local55; local65++) {
				this.aShortArray51[local65] = (short) arg1.method3077();
				this.aShortArray48[local65] = (short) arg1.method3077();
			}
		} else if (arg0 == 41) {
			local55 = arg1.method3062();
			this.aShortArray50 = new short[local55];
			this.aShortArray49 = new short[local55];
			for (local65 = 0; local65 < local55; local65++) {
				this.aShortArray49[local65] = (short) arg1.method3077();
				this.aShortArray50[local65] = (short) arg1.method3077();
			}
		} else if (arg0 >= 60 && arg0 < 70) {
			this.anIntArray359[arg0 - 60] = arg1.method3077();
			return;
		}
	}

	@OriginalMember(owner = "client!ri", name = "d", descriptor = "(B)Z")
	public boolean method2577() {
		@Pc(3) boolean local3 = true;
		for (@Pc(5) int local5 = 0; local5 < 5; local5++) {
			if (this.anIntArray359[local5] != -1 && !Static67.aClass23_78.method756(this.anIntArray359[local5], 0)) {
				local3 = false;
			}
		}
		return local3;
	}
}
