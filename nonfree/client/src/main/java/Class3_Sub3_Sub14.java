import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!he")
public final class Class3_Sub3_Sub14 extends Class3_Sub3 {

	@OriginalMember(owner = "client!he", name = "E", descriptor = "[S")
	private short[] aShortArray19;

	@OriginalMember(owner = "client!he", name = "J", descriptor = "[S")
	private short[] aShortArray20;

	@OriginalMember(owner = "client!he", name = "M", descriptor = "[S")
	private short[] aShortArray21;

	@OriginalMember(owner = "client!he", name = "O", descriptor = "[I")
	private int[] anIntArray82;

	@OriginalMember(owner = "client!he", name = "T", descriptor = "[S")
	private short[] aShortArray22;

	@OriginalMember(owner = "client!he", name = "P", descriptor = "[I")
	private final int[] anIntArray83 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!he", name = "I", descriptor = "I")
	public int anInt1520 = -1;

	@OriginalMember(owner = "client!he", name = "W", descriptor = "Z")
	public boolean aBoolean88 = false;

	@OriginalMember(owner = "client!he", name = "c", descriptor = "(I)Lclient!md;")
	public Class26_Sub5 method1116() {
		@Pc(6) Class26_Sub5[] local6 = new Class26_Sub5[5];
		@Pc(8) int local8 = 0;
		for (@Pc(18) int local18 = 0; local18 < 5; local18++) {
			if (this.anIntArray83[local18] != -1) {
				local6[local8++] = Static128.method1788(Static117.aClass52_27, this.anIntArray83[local18]);
			}
		}
		@Pc(49) Class26_Sub5 local49 = new Class26_Sub5(local6, local8);
		@Pc(54) int local54;
		if (this.aShortArray22 != null) {
			for (local54 = 0; local54 < this.aShortArray22.length; local54++) {
				local49.method1779(this.aShortArray22[local54], this.aShortArray20[local54]);
			}
		}
		if (this.aShortArray19 != null) {
			for (local54 = 0; local54 < this.aShortArray19.length; local54++) {
				local49.method1793(this.aShortArray19[local54], this.aShortArray21[local54]);
			}
		}
		return local49;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(Z)Z")
	public boolean method1117() {
		@Pc(5) boolean local5 = true;
		for (@Pc(7) int local7 = 0; local7 < 5; local7++) {
			if (this.anIntArray83[local7] != -1 && !Static117.aClass52_27.method1558(this.anIntArray83[local7], 0)) {
				local5 = false;
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!he", name = "d", descriptor = "(I)Z")
	public boolean method1118() {
		if (this.anIntArray82 == null) {
			return true;
		}
		@Pc(15) boolean local15 = true;
		for (@Pc(17) int local17 = 0; local17 < this.anIntArray82.length; local17++) {
			if (!Static117.aClass52_27.method1558(this.anIntArray82[local17], 0)) {
				local15 = false;
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!he", name = "e", descriptor = "(I)Lclient!md;")
	public Class26_Sub5 method1119() {
		if (this.anIntArray82 == null) {
			return null;
		}
		@Pc(13) Class26_Sub5[] local13 = new Class26_Sub5[this.anIntArray82.length];
		for (@Pc(20) int local20 = 0; local20 < this.anIntArray82.length; local20++) {
			local13[local20] = Static128.method1788(Static117.aClass52_27, this.anIntArray82[local20]);
		}
		@Pc(49) Class26_Sub5 local49;
		if (local13.length == 1) {
			local49 = local13[0];
		} else {
			local49 = new Class26_Sub5(local13, local13.length);
		}
		@Pc(62) int local62;
		if (this.aShortArray22 != null) {
			for (local62 = 0; local62 < this.aShortArray22.length; local62++) {
				local49.method1779(this.aShortArray22[local62], this.aShortArray20[local62]);
			}
		}
		if (this.aShortArray19 != null) {
			for (local62 = 0; local62 < this.aShortArray19.length; local62++) {
				local49.method1793(this.aShortArray19[local62], this.aShortArray21[local62]);
			}
		}
		return local49;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(ILclient!ce;)V")
	public void method1120(@OriginalArg(1) Class3_Sub4 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method1278();
			if (local13 == 0) {
				return;
			}
			this.method1122(arg0, local13);
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(Lclient!ce;II)V")
	private void method1122(@OriginalArg(0) Class3_Sub4 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt1520 = arg0.method1278();
			return;
		}
		@Pc(11) int local11;
		@Pc(17) int local17;
		if (arg1 == 2) {
			local11 = arg0.method1278();
			this.anIntArray82 = new int[local11];
			for (local17 = 0; local17 < local11; local17++) {
				this.anIntArray82[local17] = arg0.method1270();
			}
		} else if (arg1 == 3) {
			this.aBoolean88 = true;
		} else if (arg1 == 40) {
			local11 = arg0.method1278();
			this.aShortArray20 = new short[local11];
			this.aShortArray22 = new short[local11];
			for (local17 = 0; local17 < local11; local17++) {
				this.aShortArray22[local17] = (short) arg0.method1270();
				this.aShortArray20[local17] = (short) arg0.method1270();
			}
		} else if (arg1 == 41) {
			local11 = arg0.method1278();
			this.aShortArray21 = new short[local11];
			this.aShortArray19 = new short[local11];
			for (local17 = 0; local17 < local11; local17++) {
				this.aShortArray19[local17] = (short) arg0.method1270();
				this.aShortArray21[local17] = (short) arg0.method1270();
			}
		} else if (arg1 >= 60 && arg1 < 70) {
			this.anIntArray83[arg1 - 60] = arg0.method1270();
		}
	}
}
