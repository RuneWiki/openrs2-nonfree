import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ea")
public final class Class4_Sub4_Sub2 extends Class4_Sub4 {

	@OriginalMember(owner = "client!ea", name = "M", descriptor = "[S")
	private short[] aShortArray1;

	@OriginalMember(owner = "client!ea", name = "O", descriptor = "[S")
	private short[] aShortArray2;

	@OriginalMember(owner = "client!ea", name = "S", descriptor = "[S")
	private short[] aShortArray3;

	@OriginalMember(owner = "client!ea", name = "U", descriptor = "[I")
	private int[] anIntArray82;

	@OriginalMember(owner = "client!ea", name = "W", descriptor = "[S")
	private short[] aShortArray4;

	@OriginalMember(owner = "client!ea", name = "T", descriptor = "[I")
	private final int[] anIntArray81 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!ea", name = "N", descriptor = "I")
	public int anInt557 = -1;

	@OriginalMember(owner = "client!ea", name = "ab", descriptor = "Z")
	public boolean aBoolean46 = false;

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(ILclient!ne;I)V")
	private void method364(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub10 arg1) {
		if (arg0 == 1) {
			this.anInt557 = arg1.method599();
			return;
		}
		@Pc(21) int local21;
		@Pc(27) int local27;
		if (arg0 == 2) {
			local21 = arg1.method599();
			this.anIntArray82 = new int[local21];
			for (local27 = 0; local27 < local21; local27++) {
				this.anIntArray82[local27] = arg1.method604();
			}
		} else if (arg0 == 3) {
			this.aBoolean46 = true;
		} else if (arg0 == 40) {
			local21 = arg1.method599();
			this.aShortArray4 = new short[local21];
			this.aShortArray3 = new short[local21];
			for (local27 = 0; local27 < local21; local27++) {
				this.aShortArray4[local27] = (short) arg1.method604();
				this.aShortArray3[local27] = (short) arg1.method604();
			}
		} else if (arg0 == 41) {
			local21 = arg1.method599();
			this.aShortArray2 = new short[local21];
			this.aShortArray1 = new short[local21];
			for (local27 = 0; local27 < local21; local27++) {
				this.aShortArray2[local27] = (short) arg1.method604();
				this.aShortArray1[local27] = (short) arg1.method604();
			}
		} else if (arg0 >= 60 && arg0 < 70) {
			this.anIntArray81[arg0 - 60] = arg1.method604();
			return;
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(ILclient!ne;)V")
	public void method365(@OriginalArg(1) Class4_Sub10 arg0) {
		while (true) {
			@Pc(11) int local11 = arg0.method599();
			if (local11 == 0) {
				return;
			}
			this.method364(local11, arg0);
		}
	}

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "(B)Z")
	public boolean method366() {
		@Pc(7) boolean local7 = true;
		for (@Pc(14) int local14 = 0; local14 < 5; local14++) {
			if (this.anIntArray81[local14] != -1 && !Static54.aClass17_36.method300(this.anIntArray81[local14], 0)) {
				local7 = false;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!ea", name = "c", descriptor = "(B)Z")
	public boolean method368() {
		if (this.anIntArray82 == null) {
			return true;
		}
		@Pc(17) boolean local17 = true;
		for (@Pc(19) int local19 = 0; local19 < this.anIntArray82.length; local19++) {
			if (!Static54.aClass17_36.method300(this.anIntArray82[local19], 0)) {
				local17 = false;
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!ea", name = "e", descriptor = "(I)Lclient!sd;")
	public Class4_Sub4_Sub3_Sub5 method369() {
		@Pc(4) Class4_Sub4_Sub3_Sub5[] local4 = new Class4_Sub4_Sub3_Sub5[5];
		@Pc(6) int local6 = 0;
		for (@Pc(12) int local12 = 0; local12 < 5; local12++) {
			if (this.anIntArray81[local12] != -1) {
				local4[local6++] = Static108.method1648(Static54.aClass17_36, this.anIntArray81[local12]);
			}
		}
		@Pc(43) Class4_Sub4_Sub3_Sub5 local43 = new Class4_Sub4_Sub3_Sub5(local4, local6);
		@Pc(48) int local48;
		if (this.aShortArray4 != null) {
			for (local48 = 0; local48 < this.aShortArray4.length; local48++) {
				local43.method1657(this.aShortArray4[local48], this.aShortArray3[local48]);
			}
		}
		if (this.aShortArray2 != null) {
			for (local48 = 0; local48 < this.aShortArray2.length; local48++) {
				local43.method1655(this.aShortArray2[local48], this.aShortArray1[local48]);
			}
		}
		return local43;
	}

	@OriginalMember(owner = "client!ea", name = "g", descriptor = "(I)Lclient!sd;")
	public Class4_Sub4_Sub3_Sub5 method371() {
		if (this.anIntArray82 == null) {
			return null;
		}
		@Pc(20) Class4_Sub4_Sub3_Sub5[] local20 = new Class4_Sub4_Sub3_Sub5[this.anIntArray82.length];
		for (@Pc(22) int local22 = 0; local22 < this.anIntArray82.length; local22++) {
			local20[local22] = Static108.method1648(Static54.aClass17_36, this.anIntArray82[local22]);
		}
		@Pc(52) Class4_Sub4_Sub3_Sub5 local52;
		if (local20.length == 1) {
			local52 = local20[0];
		} else {
			local52 = new Class4_Sub4_Sub3_Sub5(local20, local20.length);
		}
		@Pc(66) int local66;
		if (this.aShortArray4 != null) {
			for (local66 = 0; local66 < this.aShortArray4.length; local66++) {
				local52.method1657(this.aShortArray4[local66], this.aShortArray3[local66]);
			}
		}
		if (this.aShortArray2 != null) {
			for (local66 = 0; local66 < this.aShortArray2.length; local66++) {
				local52.method1655(this.aShortArray2[local66], this.aShortArray1[local66]);
			}
		}
		return local52;
	}
}
