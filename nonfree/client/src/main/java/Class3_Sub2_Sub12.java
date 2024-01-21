import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rc")
public final class Class3_Sub2_Sub12 extends Class3_Sub2 {

	@OriginalMember(owner = "client!rc", name = "D", descriptor = "[S")
	private short[] aShortArray26;

	@OriginalMember(owner = "client!rc", name = "Q", descriptor = "[S")
	private short[] aShortArray27;

	@OriginalMember(owner = "client!rc", name = "S", descriptor = "[S")
	private short[] aShortArray28;

	@OriginalMember(owner = "client!rc", name = "X", descriptor = "[S")
	private short[] aShortArray29;

	@OriginalMember(owner = "client!rc", name = "Z", descriptor = "[I")
	private int[] anIntArray373;

	@OriginalMember(owner = "client!rc", name = "J", descriptor = "[I")
	private final int[] anIntArray372 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!rc", name = "H", descriptor = "Z")
	public boolean aBoolean135 = false;

	@OriginalMember(owner = "client!rc", name = "C", descriptor = "I")
	public int anInt3220 = -1;

	@OriginalMember(owner = "client!rc", name = "b", descriptor = "(I)Lclient!oe;")
	public Class3_Sub2_Sub1_Sub6 method2337() {
		if (this.anIntArray373 == null) {
			return null;
		}
		@Pc(15) Class3_Sub2_Sub1_Sub6[] local15 = new Class3_Sub2_Sub1_Sub6[this.anIntArray373.length];
		for (@Pc(17) int local17 = 0; local17 < this.anIntArray373.length; local17++) {
			local15[local17] = Static115.method1944(Static55.aClass44_9, this.anIntArray373[local17]);
		}
		@Pc(49) Class3_Sub2_Sub1_Sub6 local49;
		if (local15.length == 1) {
			local49 = local15[0];
		} else {
			local49 = new Class3_Sub2_Sub1_Sub6(local15, local15.length);
		}
		@Pc(60) int local60;
		if (this.aShortArray29 != null) {
			for (local60 = 0; local60 < this.aShortArray29.length; local60++) {
				local49.method1954(this.aShortArray29[local60], this.aShortArray27[local60]);
			}
		}
		if (this.aShortArray26 != null) {
			for (local60 = 0; local60 < this.aShortArray26.length; local60++) {
				local49.method1933(this.aShortArray26[local60], this.aShortArray28[local60]);
			}
		}
		return local49;
	}

	@OriginalMember(owner = "client!rc", name = "b", descriptor = "(Z)Z")
	public boolean method2338() {
		@Pc(3) boolean local3 = true;
		for (@Pc(5) int local5 = 0; local5 < 5; local5++) {
			if (this.anIntArray372[local5] != -1 && !Static55.aClass44_9.method1618(0, this.anIntArray372[local5])) {
				local3 = false;
			}
		}
		return local3;
	}

	@OriginalMember(owner = "client!rc", name = "d", descriptor = "(B)Z")
	public boolean method2340() {
		if (this.anIntArray373 == null) {
			return true;
		}
		@Pc(12) boolean local12 = true;
		for (@Pc(14) int local14 = 0; local14 < this.anIntArray373.length; local14++) {
			if (!Static55.aClass44_9.method1618(0, this.anIntArray373[local14])) {
				local12 = false;
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!rc", name = "e", descriptor = "(B)Lclient!oe;")
	public Class3_Sub2_Sub1_Sub6 method2342() {
		@Pc(16) Class3_Sub2_Sub1_Sub6[] local16 = new Class3_Sub2_Sub1_Sub6[5];
		@Pc(18) int local18 = 0;
		for (@Pc(20) int local20 = 0; local20 < 5; local20++) {
			if (this.anIntArray372[local20] != -1) {
				local16[local18++] = Static115.method1944(Static55.aClass44_9, this.anIntArray372[local20]);
			}
		}
		@Pc(52) Class3_Sub2_Sub1_Sub6 local52 = new Class3_Sub2_Sub1_Sub6(local16, local18);
		@Pc(57) int local57;
		if (this.aShortArray29 != null) {
			for (local57 = 0; local57 < this.aShortArray29.length; local57++) {
				local52.method1954(this.aShortArray29[local57], this.aShortArray27[local57]);
			}
		}
		if (this.aShortArray26 != null) {
			for (local57 = 0; local57 < this.aShortArray26.length; local57++) {
				local52.method1933(this.aShortArray26[local57], this.aShortArray28[local57]);
			}
		}
		return local52;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(ILclient!rd;)V")
	public void method2343(@OriginalArg(1) Class3_Sub4 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method191();
			if (local13 == 0) {
				return;
			}
			this.method2344(arg0, local13);
		}
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(ILclient!rd;I)V")
	private void method2344(@OriginalArg(1) Class3_Sub4 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt3220 = arg0.method191();
			return;
		}
		@Pc(47) int local47;
		@Pc(57) int local57;
		if (arg1 == 2) {
			local47 = arg0.method191();
			this.anIntArray373 = new int[local47];
			for (local57 = 0; local57 < local47; local57++) {
				this.anIntArray373[local57] = arg0.method208();
			}
		} else if (arg1 == 3) {
			this.aBoolean135 = true;
		} else if (arg1 == 40) {
			local47 = arg0.method191();
			this.aShortArray29 = new short[local47];
			this.aShortArray27 = new short[local47];
			for (local57 = 0; local57 < local47; local57++) {
				this.aShortArray29[local57] = (short) arg0.method208();
				this.aShortArray27[local57] = (short) arg0.method208();
			}
		} else if (arg1 == 41) {
			local47 = arg0.method191();
			this.aShortArray28 = new short[local47];
			this.aShortArray26 = new short[local47];
			for (local57 = 0; local57 < local47; local57++) {
				this.aShortArray26[local57] = (short) arg0.method208();
				this.aShortArray28[local57] = (short) arg0.method208();
			}
		} else if (arg1 >= 60 && arg1 < 70) {
			this.anIntArray372[arg1 - 60] = arg0.method208();
		}
	}
}
