import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mf")
public final class Class1_Sub3_Sub17 extends Class1_Sub3 {

	@OriginalMember(owner = "client!mf", name = "P", descriptor = "[S")
	private short[] aShortArray22;

	@OriginalMember(owner = "client!mf", name = "W", descriptor = "[I")
	private int[] anIntArray196;

	@OriginalMember(owner = "client!mf", name = "X", descriptor = "[S")
	private short[] aShortArray23;

	@OriginalMember(owner = "client!mf", name = "Y", descriptor = "[S")
	private short[] aShortArray24;

	@OriginalMember(owner = "client!mf", name = "ib", descriptor = "[S")
	private short[] aShortArray25;

	@OriginalMember(owner = "client!mf", name = "M", descriptor = "Z")
	public boolean aBoolean150 = false;

	@OriginalMember(owner = "client!mf", name = "S", descriptor = "[I")
	private final int[] anIntArray195 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!mf", name = "N", descriptor = "I")
	public int anInt2596 = -1;

	@OriginalMember(owner = "client!mf", name = "f", descriptor = "(I)Lclient!o;")
	public Class8_Sub7 method1818() {
		@Pc(9) Class8_Sub7[] local9 = new Class8_Sub7[5];
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < 5; local17++) {
			if (this.anIntArray195[local17] != -1) {
				local9[local15++] = Static135.method1997(Static144.aClass3_25, this.anIntArray195[local17]);
			}
		}
		@Pc(49) Class8_Sub7 local49 = new Class8_Sub7(local9, local15);
		@Pc(54) int local54;
		if (this.aShortArray25 != null) {
			for (local54 = 0; local54 < this.aShortArray25.length; local54++) {
				local49.method2006(this.aShortArray25[local54], this.aShortArray23[local54]);
			}
		}
		if (this.aShortArray24 != null) {
			for (local54 = 0; local54 < this.aShortArray24.length; local54++) {
				local49.method2010(this.aShortArray24[local54], this.aShortArray22[local54]);
			}
		}
		return local49;
	}

	@OriginalMember(owner = "client!mf", name = "b", descriptor = "(B)Lclient!o;")
	public Class8_Sub7 method1819() {
		if (this.anIntArray196 == null) {
			return null;
		}
		@Pc(15) Class8_Sub7[] local15 = new Class8_Sub7[this.anIntArray196.length];
		for (@Pc(17) int local17 = 0; local17 < this.anIntArray196.length; local17++) {
			local15[local17] = Static135.method1997(Static144.aClass3_25, this.anIntArray196[local17]);
		}
		@Pc(48) Class8_Sub7 local48;
		if (local15.length == 1) {
			local48 = local15[0];
		} else {
			local48 = new Class8_Sub7(local15, local15.length);
		}
		@Pc(62) int local62;
		if (this.aShortArray25 != null) {
			for (local62 = 0; local62 < this.aShortArray25.length; local62++) {
				local48.method2006(this.aShortArray25[local62], this.aShortArray23[local62]);
			}
		}
		if (this.aShortArray24 != null) {
			for (local62 = 0; local62 < this.aShortArray24.length; local62++) {
				local48.method2010(this.aShortArray24[local62], this.aShortArray22[local62]);
			}
		}
		return local48;
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lclient!ka;II)V")
	private void method1820(@OriginalArg(0) Class1_Sub14 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt2596 = arg0.method3010();
			return;
		}
		@Pc(22) int local22;
		@Pc(28) int local28;
		if (arg1 == 2) {
			local22 = arg0.method3010();
			this.anIntArray196 = new int[local22];
			for (local28 = 0; local28 < local22; local28++) {
				this.anIntArray196[local28] = arg0.method3023();
			}
		} else if (arg1 == 3) {
			this.aBoolean150 = true;
		} else if (arg1 == 40) {
			local22 = arg0.method3010();
			this.aShortArray25 = new short[local22];
			this.aShortArray23 = new short[local22];
			for (local28 = 0; local28 < local22; local28++) {
				this.aShortArray25[local28] = (short) arg0.method3023();
				this.aShortArray23[local28] = (short) arg0.method3023();
			}
		} else if (arg1 == 41) {
			local22 = arg0.method3010();
			this.aShortArray24 = new short[local22];
			this.aShortArray22 = new short[local22];
			for (local28 = 0; local28 < local22; local28++) {
				this.aShortArray24[local28] = (short) arg0.method3023();
				this.aShortArray22[local28] = (short) arg0.method3023();
			}
		} else if (arg1 >= 60 && arg1 < 70) {
			this.anIntArray195[arg1 - 60] = arg0.method3023();
		}
	}

	@OriginalMember(owner = "client!mf", name = "b", descriptor = "(Z)Z")
	public boolean method1822() {
		if (this.anIntArray196 == null) {
			return true;
		}
		@Pc(12) boolean local12 = true;
		for (@Pc(14) int local14 = 0; local14 < this.anIntArray196.length; local14++) {
			if (!Static144.aClass3_25.method3247(0, this.anIntArray196[local14])) {
				local12 = false;
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lclient!ka;I)V")
	public void method1823(@OriginalArg(0) Class1_Sub14 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method3010();
			if (local13 == 0) {
				return;
			}
			this.method1820(arg0, local13);
		}
	}

	@OriginalMember(owner = "client!mf", name = "g", descriptor = "(I)Z")
	public boolean method1824() {
		@Pc(7) boolean local7 = true;
		for (@Pc(9) int local9 = 0; local9 < 5; local9++) {
			if (this.anIntArray195[local9] != -1 && !Static144.aClass3_25.method3247(0, this.anIntArray195[local9])) {
				local7 = false;
			}
		}
		return local7;
	}
}
