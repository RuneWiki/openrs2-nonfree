import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eb")
public final class Class8_Sub1_Sub7 extends Class8_Sub1 {

	@OriginalMember(owner = "client!eb", name = "fb", descriptor = "[S")
	private short[] aShortArray22;

	@OriginalMember(owner = "client!eb", name = "mb", descriptor = "[S")
	private short[] aShortArray23;

	@OriginalMember(owner = "client!eb", name = "Sb", descriptor = "[I")
	private int[] anIntArray108;

	@OriginalMember(owner = "client!eb", name = "Ub", descriptor = "[S")
	private short[] aShortArray24;

	@OriginalMember(owner = "client!eb", name = "ac", descriptor = "[S")
	private short[] aShortArray25;

	@OriginalMember(owner = "client!eb", name = "ob", descriptor = "[I")
	private final int[] anIntArray107 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!eb", name = "Hb", descriptor = "I")
	public int anInt833 = -1;

	@OriginalMember(owner = "client!eb", name = "bc", descriptor = "Z")
	public boolean aBoolean40 = false;

	@OriginalMember(owner = "client!eb", name = "d", descriptor = "(I)Z")
	public boolean method514() {
		if (this.anIntArray108 == null) {
			return true;
		}
		@Pc(19) boolean local19 = true;
		for (@Pc(21) int local21 = 0; local21 < this.anIntArray108.length; local21++) {
			if (!Static73.aClass14_19.method1145(this.anIntArray108[local21], 0)) {
				local19 = false;
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(ILclient!wd;)V")
	public void method515(@OriginalArg(1) Class8_Sub20 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method1872();
			if (local9 == 0) {
				return;
			}
			this.method519(local9, arg0);
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(Z)Lclient!df;")
	public Class8_Sub1_Sub1_Sub3 method516() {
		if (this.anIntArray108 == null) {
			return null;
		}
		@Pc(15) Class8_Sub1_Sub1_Sub3[] local15 = new Class8_Sub1_Sub1_Sub3[this.anIntArray108.length];
		for (@Pc(24) int local24 = 0; local24 < this.anIntArray108.length; local24++) {
			local15[local24] = Static26.method472(Static73.aClass14_19, this.anIntArray108[local24]);
		}
		@Pc(53) Class8_Sub1_Sub1_Sub3 local53;
		if (local15.length == 1) {
			local53 = local15[0];
		} else {
			local53 = new Class8_Sub1_Sub1_Sub3(local15, local15.length);
		}
		@Pc(64) int local64;
		if (this.aShortArray25 != null) {
			for (local64 = 0; local64 < this.aShortArray25.length; local64++) {
				local53.method490(this.aShortArray25[local64], this.aShortArray24[local64]);
			}
		}
		if (this.aShortArray22 != null) {
			for (local64 = 0; local64 < this.aShortArray22.length; local64++) {
				local53.method485(this.aShortArray22[local64], this.aShortArray23[local64]);
			}
		}
		return local53;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(IILclient!wd;)V")
	private void method519(@OriginalArg(0) int arg0, @OriginalArg(2) Class8_Sub20 arg1) {
		if (arg0 == 1) {
			this.anInt833 = arg1.method1872();
			return;
		}
		@Pc(50) int local50;
		@Pc(60) int local60;
		if (arg0 == 2) {
			local50 = arg1.method1872();
			this.anIntArray108 = new int[local50];
			for (local60 = 0; local60 < local50; local60++) {
				this.anIntArray108[local60] = arg1.method1839();
			}
		} else if (arg0 == 3) {
			this.aBoolean40 = true;
		} else if (arg0 == 40) {
			local50 = arg1.method1872();
			this.aShortArray25 = new short[local50];
			this.aShortArray24 = new short[local50];
			for (local60 = 0; local60 < local50; local60++) {
				this.aShortArray25[local60] = (short) arg1.method1839();
				this.aShortArray24[local60] = (short) arg1.method1839();
			}
		} else if (arg0 == 41) {
			local50 = arg1.method1872();
			this.aShortArray23 = new short[local50];
			this.aShortArray22 = new short[local50];
			for (local60 = 0; local60 < local50; local60++) {
				this.aShortArray22[local60] = (short) arg1.method1839();
				this.aShortArray23[local60] = (short) arg1.method1839();
			}
		} else if (arg0 >= 60 && arg0 < 70) {
			this.anIntArray107[arg0 - 60] = arg1.method1839();
		}
	}

	@OriginalMember(owner = "client!eb", name = "e", descriptor = "(I)Z")
	public boolean method520() {
		@Pc(12) boolean local12 = true;
		for (@Pc(14) int local14 = 0; local14 < 5; local14++) {
			if (this.anIntArray107[local14] != -1 && !Static73.aClass14_19.method1145(this.anIntArray107[local14], 0)) {
				local12 = false;
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!eb", name = "f", descriptor = "(I)Lclient!df;")
	public Class8_Sub1_Sub1_Sub3 method522() {
		@Pc(8) Class8_Sub1_Sub1_Sub3[] local8 = new Class8_Sub1_Sub1_Sub3[5];
		@Pc(10) int local10 = 0;
		for (@Pc(19) int local19 = 0; local19 < 5; local19++) {
			if (this.anIntArray107[local19] != -1) {
				local8[local10++] = Static26.method472(Static73.aClass14_19, this.anIntArray107[local19]);
			}
		}
		@Pc(49) Class8_Sub1_Sub1_Sub3 local49 = new Class8_Sub1_Sub1_Sub3(local8, local10);
		@Pc(54) int local54;
		if (this.aShortArray25 != null) {
			for (local54 = 0; local54 < this.aShortArray25.length; local54++) {
				local49.method490(this.aShortArray25[local54], this.aShortArray24[local54]);
			}
		}
		if (this.aShortArray22 != null) {
			for (local54 = 0; local54 < this.aShortArray22.length; local54++) {
				local49.method485(this.aShortArray22[local54], this.aShortArray23[local54]);
			}
		}
		return local49;
	}
}
