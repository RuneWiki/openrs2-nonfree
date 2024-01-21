import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ge")
public final class Class2_Sub1_Sub9 extends Class2_Sub1 {

	@OriginalMember(owner = "client!ge", name = "z", descriptor = "[S")
	private short[] aShortArray38;

	@OriginalMember(owner = "client!ge", name = "B", descriptor = "[S")
	private short[] aShortArray39;

	@OriginalMember(owner = "client!ge", name = "D", descriptor = "[I")
	private int[] anIntArray106;

	@OriginalMember(owner = "client!ge", name = "J", descriptor = "[S")
	private short[] aShortArray40;

	@OriginalMember(owner = "client!ge", name = "O", descriptor = "[S")
	private short[] aShortArray41;

	@OriginalMember(owner = "client!ge", name = "H", descriptor = "[I")
	private final int[] anIntArray107 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!ge", name = "K", descriptor = "I")
	public int anInt1362 = -1;

	@OriginalMember(owner = "client!ge", name = "T", descriptor = "Z")
	public boolean aBoolean57 = false;

	@OriginalMember(owner = "client!ge", name = "c", descriptor = "(I)Z")
	public boolean method897() {
		if (this.anIntArray106 == null) {
			return true;
		}
		@Pc(17) boolean local17 = true;
		for (@Pc(19) int local19 = 0; local19 < this.anIntArray106.length; local19++) {
			if (!Static153.aClass71_29.method2143(0, this.anIntArray106[local19])) {
				local17 = false;
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!ge", name = "e", descriptor = "(B)Lclient!gj;")
	public Class7_Sub3 method898() {
		@Pc(4) Class7_Sub3[] local4 = new Class7_Sub3[5];
		@Pc(6) int local6 = 0;
		for (@Pc(17) int local17 = 0; local17 < 5; local17++) {
			if (this.anIntArray107[local17] != -1) {
				local4[local6++] = Static70.method975(Static153.aClass71_29, this.anIntArray107[local17]);
			}
		}
		@Pc(46) Class7_Sub3 local46 = new Class7_Sub3(local4, local6);
		@Pc(51) int local51;
		if (this.aShortArray38 != null) {
			for (local51 = 0; local51 < this.aShortArray38.length; local51++) {
				local46.method974(this.aShortArray38[local51], this.aShortArray39[local51]);
			}
		}
		if (this.aShortArray41 != null) {
			for (local51 = 0; local51 < this.aShortArray41.length; local51++) {
				local46.method963(this.aShortArray41[local51], this.aShortArray40[local51]);
			}
		}
		return local46;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(ILclient!kd;)V")
	public void method901(@OriginalArg(1) Class2_Sub11 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method1534();
			if (local5 == 0) {
				return;
			}
			this.method903(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(IILclient!kd;)V")
	private void method903(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub11 arg1) {
		if (arg0 == 1) {
			this.anInt1362 = arg1.method1534();
			return;
		}
		@Pc(32) int local32;
		@Pc(42) int local42;
		if (arg0 == 2) {
			local32 = arg1.method1534();
			this.anIntArray106 = new int[local32];
			for (local42 = 0; local42 < local32; local42++) {
				this.anIntArray106[local42] = arg1.method1557();
			}
		} else if (arg0 == 3) {
			this.aBoolean57 = true;
		} else if (arg0 == 40) {
			local32 = arg1.method1534();
			this.aShortArray39 = new short[local32];
			this.aShortArray38 = new short[local32];
			for (local42 = 0; local42 < local32; local42++) {
				this.aShortArray38[local42] = (short) arg1.method1557();
				this.aShortArray39[local42] = (short) arg1.method1557();
			}
		} else if (arg0 == 41) {
			local32 = arg1.method1534();
			this.aShortArray40 = new short[local32];
			this.aShortArray41 = new short[local32];
			for (local42 = 0; local42 < local32; local42++) {
				this.aShortArray41[local42] = (short) arg1.method1557();
				this.aShortArray40[local42] = (short) arg1.method1557();
			}
		} else if (arg0 >= 60 && arg0 < 70) {
			this.anIntArray107[arg0 - 60] = arg1.method1557();
		}
	}

	@OriginalMember(owner = "client!ge", name = "h", descriptor = "(B)Lclient!gj;")
	public Class7_Sub3 method904() {
		if (this.anIntArray106 == null) {
			return null;
		}
		@Pc(15) Class7_Sub3[] local15 = new Class7_Sub3[this.anIntArray106.length];
		for (@Pc(23) int local23 = 0; local23 < this.anIntArray106.length; local23++) {
			local15[local23] = Static70.method975(Static153.aClass71_29, this.anIntArray106[local23]);
		}
		@Pc(56) Class7_Sub3 local56;
		if (local15.length == 1) {
			local56 = local15[0];
		} else {
			local56 = new Class7_Sub3(local15, local15.length);
		}
		@Pc(67) int local67;
		if (this.aShortArray38 != null) {
			for (local67 = 0; local67 < this.aShortArray38.length; local67++) {
				local56.method974(this.aShortArray38[local67], this.aShortArray39[local67]);
			}
		}
		if (this.aShortArray41 != null) {
			for (local67 = 0; local67 < this.aShortArray41.length; local67++) {
				local56.method963(this.aShortArray41[local67], this.aShortArray40[local67]);
			}
		}
		return local56;
	}

	@OriginalMember(owner = "client!ge", name = "d", descriptor = "(I)Z")
	public boolean method905() {
		@Pc(3) boolean local3 = true;
		for (@Pc(5) int local5 = 0; local5 < 5; local5++) {
			if (this.anIntArray107[local5] != -1 && !Static153.aClass71_29.method2143(0, this.anIntArray107[local5])) {
				local3 = false;
			}
		}
		return local3;
	}
}
