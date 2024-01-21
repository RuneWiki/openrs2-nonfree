import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pa")
public final class Class2_Sub2_Sub23 extends Class2_Sub2 {

	@OriginalMember(owner = "client!pa", name = "z", descriptor = "[S")
	private short[] aShortArray30;

	@OriginalMember(owner = "client!pa", name = "I", descriptor = "[S")
	private short[] aShortArray31;

	@OriginalMember(owner = "client!pa", name = "M", descriptor = "[I")
	private int[] anIntArray298;

	@OriginalMember(owner = "client!pa", name = "N", descriptor = "[S")
	private short[] aShortArray32;

	@OriginalMember(owner = "client!pa", name = "S", descriptor = "[S")
	private short[] aShortArray33;

	@OriginalMember(owner = "client!pa", name = "x", descriptor = "I")
	public int anInt2999 = -1;

	@OriginalMember(owner = "client!pa", name = "w", descriptor = "[I")
	private final int[] anIntArray297 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!pa", name = "y", descriptor = "Z")
	public boolean aBoolean143 = false;

	@OriginalMember(owner = "client!pa", name = "c", descriptor = "(I)Lclient!v;")
	public Class24_Sub7 method2295() {
		@Pc(4) Class24_Sub7[] local4 = new Class24_Sub7[5];
		@Pc(6) int local6 = 0;
		for (@Pc(8) int local8 = 0; local8 < 5; local8++) {
			if (this.anIntArray297[local8] != -1) {
				local4[local6++] = Static198.method2988(Static25.aClass28_187, this.anIntArray297[local8]);
			}
		}
		@Pc(52) Class24_Sub7 local52 = new Class24_Sub7(local4, local6);
		@Pc(57) int local57;
		if (this.aShortArray33 != null) {
			for (local57 = 0; local57 < this.aShortArray33.length; local57++) {
				local52.method2986(this.aShortArray33[local57], this.aShortArray32[local57]);
			}
		}
		if (this.aShortArray31 != null) {
			for (local57 = 0; local57 < this.aShortArray31.length; local57++) {
				local52.method2998(this.aShortArray31[local57], this.aShortArray30[local57]);
			}
		}
		return local52;
	}

	@OriginalMember(owner = "client!pa", name = "d", descriptor = "(B)Z")
	public boolean method2297() {
		@Pc(3) boolean local3 = true;
		for (@Pc(9) int local9 = 0; local9 < 5; local9++) {
			if (this.anIntArray297[local9] != -1 && !Static25.aClass28_187.method872(this.anIntArray297[local9], 0)) {
				local3 = false;
			}
		}
		return local3;
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(BLclient!ra;I)V")
	private void method2299(@OriginalArg(1) Class2_Sub3 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt2999 = arg0.method260();
			return;
		}
		@Pc(13) int local13;
		@Pc(19) int local19;
		if (arg1 == 2) {
			local13 = arg0.method260();
			this.anIntArray298 = new int[local13];
			for (local19 = 0; local19 < local13; local19++) {
				this.anIntArray298[local19] = arg0.method269();
			}
		} else if (arg1 == 3) {
			this.aBoolean143 = true;
		} else if (arg1 == 40) {
			local13 = arg0.method260();
			this.aShortArray33 = new short[local13];
			this.aShortArray32 = new short[local13];
			for (local19 = 0; local19 < local13; local19++) {
				this.aShortArray33[local19] = (short) arg0.method269();
				this.aShortArray32[local19] = (short) arg0.method269();
			}
		} else if (arg1 == 41) {
			local13 = arg0.method260();
			this.aShortArray30 = new short[local13];
			this.aShortArray31 = new short[local13];
			for (local19 = 0; local19 < local13; local19++) {
				this.aShortArray31[local19] = (short) arg0.method269();
				this.aShortArray30[local19] = (short) arg0.method269();
			}
		} else if (arg1 >= 60 && arg1 < 70) {
			this.anIntArray297[arg1 - 60] = arg0.method269();
		}
	}

	@OriginalMember(owner = "client!pa", name = "e", descriptor = "(B)Z")
	public boolean method2300() {
		if (this.anIntArray298 == null) {
			return true;
		}
		@Pc(12) boolean local12 = true;
		for (@Pc(14) int local14 = 0; local14 < this.anIntArray298.length; local14++) {
			if (!Static25.aClass28_187.method872(this.anIntArray298[local14], 0)) {
				local12 = false;
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!pa", name = "e", descriptor = "(I)Lclient!v;")
	public Class24_Sub7 method2301() {
		if (this.anIntArray298 == null) {
			return null;
		}
		@Pc(15) Class24_Sub7[] local15 = new Class24_Sub7[this.anIntArray298.length];
		for (@Pc(17) int local17 = 0; local17 < this.anIntArray298.length; local17++) {
			local15[local17] = Static198.method2988(Static25.aClass28_187, this.anIntArray298[local17]);
		}
		@Pc(52) Class24_Sub7 local52;
		if (local15.length == 1) {
			local52 = local15[0];
		} else {
			local52 = new Class24_Sub7(local15, local15.length);
		}
		@Pc(63) int local63;
		if (this.aShortArray33 != null) {
			for (local63 = 0; local63 < this.aShortArray33.length; local63++) {
				local52.method2986(this.aShortArray33[local63], this.aShortArray32[local63]);
			}
		}
		if (this.aShortArray31 != null) {
			for (local63 = 0; local63 < this.aShortArray31.length; local63++) {
				local52.method2998(this.aShortArray31[local63], this.aShortArray30[local63]);
			}
		}
		return local52;
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(BLclient!ra;)V")
	public void method2302(@OriginalArg(1) Class2_Sub3 arg0) {
		while (true) {
			@Pc(14) int local14 = arg0.method260();
			if (local14 == 0) {
				return;
			}
			this.method2299(arg0, local14);
		}
	}
}
