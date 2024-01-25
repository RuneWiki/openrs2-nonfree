import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gd")
public final class Class75 {

	@OriginalMember(owner = "client!gd", name = "d", descriptor = "[S")
	private short[] aShortArray17;

	@OriginalMember(owner = "client!gd", name = "g", descriptor = "[S")
	private short[] aShortArray18;

	@OriginalMember(owner = "client!gd", name = "l", descriptor = "[I")
	private int[] anIntArray179;

	@OriginalMember(owner = "client!gd", name = "p", descriptor = "[S")
	private short[] aShortArray19;

	@OriginalMember(owner = "client!gd", name = "s", descriptor = "[S")
	private short[] aShortArray20;

	@OriginalMember(owner = "client!gd", name = "k", descriptor = "I")
	public int anInt1915 = -1;

	@OriginalMember(owner = "client!gd", name = "j", descriptor = "[I")
	private final int[] anIntArray178 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!gd", name = "t", descriptor = "Z")
	public boolean aBoolean140 = false;

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(B)Lclient!ri;")
	public Class177 method1805() {
		@Pc(6) Class177[] local6 = new Class177[5];
		@Pc(8) int local8 = 0;
		@Pc(10) Class93 local10 = Static335.aClass93_123;
		synchronized (Static335.aClass93_123) {
			for (@Pc(14) int local14 = 0; local14 < 5; local14++) {
				if (this.anIntArray178[local14] != -1) {
					local6[local8++] = Static292.method2236(this.anIntArray178[local14], Static335.aClass93_123);
				}
			}
		}
		@Pc(55) Class177 local55 = new Class177(local6, local8);
		@Pc(60) int local60;
		if (this.aShortArray19 != null) {
			for (local60 = 0; local60 < this.aShortArray19.length; local60++) {
				local55.method4858(this.aShortArray19[local60], this.aShortArray18[local60]);
			}
		}
		if (this.aShortArray20 != null) {
			for (local60 = 0; local60 < this.aShortArray20.length; local60++) {
				local55.method4855(this.aShortArray17[local60], this.aShortArray20[local60]);
			}
		}
		return local55;
	}

	@OriginalMember(owner = "client!gd", name = "c", descriptor = "(B)Lclient!ri;")
	public Class177 method1808() {
		if (this.anIntArray179 == null) {
			return null;
		}
		@Pc(15) Class177[] local15 = new Class177[this.anIntArray179.length];
		@Pc(22) Class93 local22 = Static335.aClass93_123;
		synchronized (Static335.aClass93_123) {
			@Pc(26) int local26 = 0;
			while (true) {
				if (local26 >= this.anIntArray179.length) {
					break;
				}
				local15[local26] = Static292.method2236(this.anIntArray179[local26], Static335.aClass93_123);
				local26++;
			}
		}
		@Pc(59) Class177 local59;
		if (local15.length == 1) {
			local59 = local15[0];
		} else {
			local59 = new Class177(local15, local15.length);
		}
		if (local59 == null) {
			return null;
		}
		@Pc(76) int local76;
		if (this.aShortArray19 != null) {
			for (local76 = 0; local76 < this.aShortArray19.length; local76++) {
				local59.method4858(this.aShortArray19[local76], this.aShortArray18[local76]);
			}
		}
		if (this.aShortArray20 != null) {
			for (local76 = 0; local76 < this.aShortArray20.length; local76++) {
				local59.method4855(this.aShortArray17[local76], this.aShortArray20[local76]);
			}
		}
		return local59;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(ZILclient!rg;)V")
	private void method1809(@OriginalArg(1) int arg0, @OriginalArg(2) Class5_Sub12 arg1) {
		if (arg0 == 1) {
			this.anInt1915 = arg1.method5115();
			return;
		}
		@Pc(42) int local42;
		@Pc(52) int local52;
		if (arg0 == 2) {
			local42 = arg1.method5115();
			this.anIntArray179 = new int[local42];
			for (local52 = 0; local52 < local42; local52++) {
				this.anIntArray179[local52] = arg1.method5106();
			}
		} else if (arg0 == 3) {
			this.aBoolean140 = true;
		} else if (arg0 == 40) {
			local42 = arg1.method5115();
			this.aShortArray19 = new short[local42];
			this.aShortArray18 = new short[local42];
			for (local52 = 0; local52 < local42; local52++) {
				this.aShortArray19[local52] = (short) arg1.method5106();
				this.aShortArray18[local52] = (short) arg1.method5106();
			}
		} else if (arg0 == 41) {
			local42 = arg1.method5115();
			this.aShortArray17 = new short[local42];
			this.aShortArray20 = new short[local42];
			for (local52 = 0; local52 < local42; local52++) {
				this.aShortArray20[local52] = (short) arg1.method5106();
				this.aShortArray17[local52] = (short) arg1.method5106();
			}
			return;
		} else if (arg0 >= 60 && arg0 < 70) {
			this.anIntArray178[arg0 - 60] = arg1.method5106();
			return;
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(Z)Z")
	public boolean method1812() {
		if (this.anIntArray179 == null) {
			return true;
		}
		@Pc(12) boolean local12 = true;
		@Pc(14) Class93 local14 = Static335.aClass93_123;
		synchronized (Static335.aClass93_123) {
			for (@Pc(18) int local18 = 0; local18 < this.anIntArray179.length; local18++) {
				if (!Static335.aClass93_123.method2390(0, this.anIntArray179[local18])) {
					local12 = false;
				}
			}
			return local12;
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lclient!rg;I)V")
	public void method1813(@OriginalArg(0) Class5_Sub12 arg0) {
		while (true) {
			@Pc(7) int local7 = arg0.method5115();
			if (local7 == 0) {
				return;
			}
			this.method1809(local7, arg0);
		}
	}

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "(Z)Z")
	public boolean method1814() {
		@Pc(5) boolean local5 = true;
		@Pc(7) Class93 local7 = Static335.aClass93_123;
		synchronized (Static335.aClass93_123) {
			for (@Pc(11) int local11 = 0; local11 < 5; local11++) {
				if (this.anIntArray178[local11] != -1 && !Static335.aClass93_123.method2390(0, this.anIntArray178[local11])) {
					local5 = false;
				}
			}
			return local5;
		}
	}
}
