import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hd")
public final class Class57 {

	@OriginalMember(owner = "client!hd", name = "s", descriptor = "[I")
	public static int[] anIntArray222 = new int[99];

	@OriginalMember(owner = "client!hd", name = "g", descriptor = "[S")
	private short[] aShortArray18;

	@OriginalMember(owner = "client!hd", name = "i", descriptor = "[I")
	private int[] anIntArray220;

	@OriginalMember(owner = "client!hd", name = "k", descriptor = "[S")
	private short[] aShortArray19;

	@OriginalMember(owner = "client!hd", name = "m", descriptor = "[S")
	private short[] aShortArray20;

	@OriginalMember(owner = "client!hd", name = "r", descriptor = "[S")
	private short[] aShortArray21;

	@OriginalMember(owner = "client!hd", name = "e", descriptor = "Z")
	public boolean aBoolean152 = false;

	@OriginalMember(owner = "client!hd", name = "f", descriptor = "I")
	public int anInt2067 = -1;

	@OriginalMember(owner = "client!hd", name = "o", descriptor = "[I")
	private int[] anIntArray221 = new int[] { -1, -1, -1, -1, -1 };

	static {
		@Pc(9) int local9 = 0;
		for (@Pc(11) int local11 = 0; local11 < 99; local11++) {
			@Pc(20) int local20 = local11 + 1;
			@Pc(33) int local33 = (int) ((double) local20 + Math.pow(2.0D, (double) local20 / 7.0D) * 300.0D);
			local9 += local33;
			anIntArray222[local11] = local9 / 4;
		}
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(I)Z")
	public boolean method1564() {
		if (this.anIntArray220 == null) {
			return true;
		}
		@Pc(13) boolean local13 = true;
		for (@Pc(20) int local20 = 0; local20 < this.anIntArray220.length; local20++) {
			if (!Static52.aClass98_32.method2382(0, this.anIntArray220[local20])) {
				local13 = false;
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(B)Lclient!pn;")
	public Class12_Sub7 method1565() {
		@Pc(3) int local3 = 0;
		@Pc(6) Class12_Sub7[] local6 = new Class12_Sub7[5];
		for (@Pc(12) int local12 = 0; local12 < 5; local12++) {
			if (this.anIntArray221[local12] != -1) {
				local6[local3++] = Static208.method3332(Static52.aClass98_32, this.anIntArray221[local12]);
			}
		}
		@Pc(50) Class12_Sub7 local50 = new Class12_Sub7(local6, local3);
		@Pc(56) int local56;
		if (this.aShortArray18 != null) {
			for (local56 = 0; local56 < this.aShortArray18.length; local56++) {
				local50.method3327(this.aShortArray18[local56], this.aShortArray20[local56]);
			}
		}
		if (this.aShortArray21 != null) {
			for (local56 = 0; local56 < this.aShortArray21.length; local56++) {
				local50.method3334(this.aShortArray21[local56], this.aShortArray19[local56]);
			}
		}
		return local50;
	}

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "(B)Lclient!pn;")
	public Class12_Sub7 method1566() {
		if (this.anIntArray220 == null) {
			return null;
		}
		@Pc(15) Class12_Sub7[] local15 = new Class12_Sub7[this.anIntArray220.length];
		for (@Pc(17) int local17 = 0; local17 < this.anIntArray220.length; local17++) {
			local15[local17] = Static208.method3332(Static52.aClass98_32, this.anIntArray220[local17]);
		}
		@Pc(52) Class12_Sub7 local52;
		if (local15.length == 1) {
			local52 = local15[0];
		} else {
			local52 = new Class12_Sub7(local15, local15.length);
		}
		@Pc(62) int local62;
		if (this.aShortArray18 != null) {
			for (local62 = 0; local62 < this.aShortArray18.length; local62++) {
				local52.method3327(this.aShortArray18[local62], this.aShortArray20[local62]);
			}
		}
		if (this.aShortArray21 != null) {
			for (local62 = 0; local62 < this.aShortArray21.length; local62++) {
				local52.method3334(this.aShortArray21[local62], this.aShortArray19[local62]);
			}
		}
		return local52;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lclient!p;Z)V")
	public void method1567(@OriginalArg(0) Class4_Sub17 arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.method1874();
			if (local17 == 0) {
				return;
			}
			this.method1568(local17, arg0);
		}
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(ILclient!p;Z)V")
	private void method1568(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub17 arg1) {
		if (arg0 == 1) {
			this.anInt2067 = arg1.method1874();
			return;
		}
		@Pc(21) int local21;
		@Pc(27) int local27;
		if (arg0 == 2) {
			local21 = arg1.method1874();
			this.anIntArray220 = new int[local21];
			for (local27 = 0; local27 < local21; local27++) {
				this.anIntArray220[local27] = arg1.method1837();
			}
		} else if (arg0 == 3) {
			this.aBoolean152 = true;
		} else if (arg0 == 40) {
			local21 = arg1.method1874();
			this.aShortArray20 = new short[local21];
			this.aShortArray18 = new short[local21];
			for (local27 = 0; local27 < local21; local27++) {
				this.aShortArray18[local27] = (short) arg1.method1837();
				this.aShortArray20[local27] = (short) arg1.method1837();
			}
		} else if (arg0 == 41) {
			local21 = arg1.method1874();
			this.aShortArray19 = new short[local21];
			this.aShortArray21 = new short[local21];
			for (local27 = 0; local27 < local21; local27++) {
				this.aShortArray21[local27] = (short) arg1.method1837();
				this.aShortArray19[local27] = (short) arg1.method1837();
			}
		} else if (arg0 >= 60 && arg0 < 70) {
			this.anIntArray221[arg0 - 60] = arg1.method1837();
		}
	}

	@OriginalMember(owner = "client!hd", name = "c", descriptor = "(B)Z")
	public boolean method1570() {
		@Pc(15) boolean local15 = true;
		for (@Pc(17) int local17 = 0; local17 < 5; local17++) {
			if (this.anIntArray221[local17] != -1 && !Static52.aClass98_32.method2382(0, this.anIntArray221[local17])) {
				local15 = false;
			}
		}
		return local15;
	}
}
