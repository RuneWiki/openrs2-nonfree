import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ud")
public final class Class2_Sub4_Sub17 extends Class2_Sub4 {

	@OriginalMember(owner = "client!ud", name = "F", descriptor = "[I")
	private int[] anIntArray340;

	@OriginalMember(owner = "client!ud", name = "M", descriptor = "[S")
	private short[] aShortArray36;

	@OriginalMember(owner = "client!ud", name = "O", descriptor = "[S")
	private short[] aShortArray37;

	@OriginalMember(owner = "client!ud", name = "R", descriptor = "[S")
	private short[] aShortArray38;

	@OriginalMember(owner = "client!ud", name = "hb", descriptor = "[S")
	private short[] aShortArray39;

	@OriginalMember(owner = "client!ud", name = "N", descriptor = "I")
	public int anInt3703 = -1;

	@OriginalMember(owner = "client!ud", name = "S", descriptor = "[I")
	private final int[] anIntArray343 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!ud", name = "X", descriptor = "Z")
	public boolean aBoolean160 = false;

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lclient!ab;B)V")
	public void method2579(@OriginalArg(0) Class2_Sub2 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method1698();
			if (local5 == 0) {
				return;
			}
			this.method2587(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!ud", name = "b", descriptor = "(B)Z")
	public boolean method2580() {
		@Pc(12) boolean local12 = true;
		for (@Pc(14) int local14 = 0; local14 < 5; local14++) {
			if (this.anIntArray343[local14] != -1 && !Static95.aClass40_28.method1783(this.anIntArray343[local14], 0)) {
				local12 = false;
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!ud", name = "d", descriptor = "(Z)Z")
	public boolean method2585() {
		if (this.anIntArray340 == null) {
			return true;
		}
		@Pc(12) boolean local12 = true;
		for (@Pc(19) int local19 = 0; local19 < this.anIntArray340.length; local19++) {
			if (!Static95.aClass40_28.method1783(this.anIntArray340[local19], 0)) {
				local12 = false;
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!ud", name = "e", descriptor = "(B)Lclient!ka;")
	public Class2_Sub4_Sub1_Sub5 method2586() {
		if (this.anIntArray340 == null) {
			return null;
		}
		@Pc(15) Class2_Sub4_Sub1_Sub5[] local15 = new Class2_Sub4_Sub1_Sub5[this.anIntArray340.length];
		for (@Pc(17) int local17 = 0; local17 < this.anIntArray340.length; local17++) {
			local15[local17] = Static86.method1530(Static95.aClass40_28, this.anIntArray340[local17]);
		}
		@Pc(55) Class2_Sub4_Sub1_Sub5 local55;
		if (local15.length == 1) {
			local55 = local15[0];
		} else {
			local55 = new Class2_Sub4_Sub1_Sub5(local15, local15.length);
		}
		@Pc(66) int local66;
		if (this.aShortArray38 != null) {
			for (local66 = 0; local66 < this.aShortArray38.length; local66++) {
				local55.method1531(this.aShortArray38[local66], this.aShortArray36[local66]);
			}
		}
		if (this.aShortArray39 != null) {
			for (local66 = 0; local66 < this.aShortArray39.length; local66++) {
				local55.method1537(this.aShortArray39[local66], this.aShortArray37[local66]);
			}
		}
		return local55;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(IBLclient!ab;)V")
	private void method2587(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub2 arg1) {
		if (arg0 == 1) {
			this.anInt3703 = arg1.method1698();
			return;
		}
		@Pc(29) int local29;
		@Pc(35) int local35;
		if (arg0 == 2) {
			local29 = arg1.method1698();
			this.anIntArray340 = new int[local29];
			for (local35 = 0; local35 < local29; local35++) {
				this.anIntArray340[local35] = arg1.method1680();
			}
		} else if (arg0 == 3) {
			this.aBoolean160 = true;
		} else if (arg0 == 40) {
			local29 = arg1.method1698();
			this.aShortArray36 = new short[local29];
			this.aShortArray38 = new short[local29];
			for (local35 = 0; local35 < local29; local35++) {
				this.aShortArray38[local35] = (short) arg1.method1680();
				this.aShortArray36[local35] = (short) arg1.method1680();
			}
		} else if (arg0 == 41) {
			local29 = arg1.method1698();
			this.aShortArray37 = new short[local29];
			this.aShortArray39 = new short[local29];
			for (local35 = 0; local35 < local29; local35++) {
				this.aShortArray39[local35] = (short) arg1.method1680();
				this.aShortArray37[local35] = (short) arg1.method1680();
			}
		} else if (arg0 >= 60 && arg0 < 70) {
			this.anIntArray343[arg0 - 60] = arg1.method1680();
			return;
		}
	}

	@OriginalMember(owner = "client!ud", name = "c", descriptor = "(I)Lclient!ka;")
	public Class2_Sub4_Sub1_Sub5 method2588() {
		@Pc(3) int local3 = 0;
		@Pc(6) Class2_Sub4_Sub1_Sub5[] local6 = new Class2_Sub4_Sub1_Sub5[5];
		for (@Pc(8) int local8 = 0; local8 < 5; local8++) {
			if (this.anIntArray343[local8] != -1) {
				local6[local3++] = Static86.method1530(Static95.aClass40_28, this.anIntArray343[local8]);
			}
		}
		@Pc(43) Class2_Sub4_Sub1_Sub5 local43 = new Class2_Sub4_Sub1_Sub5(local6, local3);
		@Pc(48) int local48;
		if (this.aShortArray38 != null) {
			for (local48 = 0; local48 < this.aShortArray38.length; local48++) {
				local43.method1531(this.aShortArray38[local48], this.aShortArray36[local48]);
			}
		}
		if (this.aShortArray39 != null) {
			for (local48 = 0; local48 < this.aShortArray39.length; local48++) {
				local43.method1537(this.aShortArray39[local48], this.aShortArray37[local48]);
			}
		}
		return local43;
	}
}
