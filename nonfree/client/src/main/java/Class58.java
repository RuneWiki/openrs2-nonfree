import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ii")
public final class Class58 {

	@OriginalMember(owner = "client!ii", name = "g", descriptor = "[S")
	private short[] aShortArray24;

	@OriginalMember(owner = "client!ii", name = "n", descriptor = "[S")
	private short[] aShortArray25;

	@OriginalMember(owner = "client!ii", name = "r", descriptor = "[S")
	private short[] aShortArray26;

	@OriginalMember(owner = "client!ii", name = "t", descriptor = "[S")
	private short[] aShortArray27;

	@OriginalMember(owner = "client!ii", name = "v", descriptor = "[I")
	private int[] anIntArray208;

	@OriginalMember(owner = "client!ii", name = "j", descriptor = "I")
	public int anInt2029 = -1;

	@OriginalMember(owner = "client!ii", name = "e", descriptor = "[I")
	private int[] anIntArray207 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!ii", name = "h", descriptor = "Z")
	public boolean aBoolean185 = false;

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(Lclient!vf;II)V")
	private void method1577(@OriginalArg(0) Class1_Sub26 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt2029 = arg0.method2945();
			return;
		}
		@Pc(27) int local27;
		@Pc(33) int local33;
		if (arg1 == 2) {
			local27 = arg0.method2945();
			this.anIntArray208 = new int[local27];
			for (local33 = 0; local33 < local27; local33++) {
				this.anIntArray208[local33] = arg0.method2964();
			}
		} else if (arg1 == 3) {
			this.aBoolean185 = true;
		} else if (arg1 == 40) {
			local27 = arg0.method2945();
			this.aShortArray26 = new short[local27];
			this.aShortArray25 = new short[local27];
			for (local33 = 0; local33 < local27; local33++) {
				this.aShortArray25[local33] = (short) arg0.method2964();
				this.aShortArray26[local33] = (short) arg0.method2964();
			}
		} else if (arg1 == 41) {
			local27 = arg0.method2945();
			this.aShortArray24 = new short[local27];
			this.aShortArray27 = new short[local27];
			for (local33 = 0; local33 < local27; local33++) {
				this.aShortArray27[local33] = (short) arg0.method2964();
				this.aShortArray24[local33] = (short) arg0.method2964();
			}
			return;
		} else if (arg1 >= 60 && arg1 < 70) {
			this.anIntArray207[arg1 - 60] = arg0.method2964();
			return;
		}
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(I)Lclient!ai;")
	public Class5_Sub1 method1579() {
		@Pc(8) Class5_Sub1[] local8 = new Class5_Sub1[5];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < 5; local12++) {
			if (this.anIntArray207[local12] != -1) {
				local8[local10++] = Static9.method277(Static13.aClass28_4, this.anIntArray207[local12]);
			}
		}
		@Pc(50) Class5_Sub1 local50 = new Class5_Sub1(local8, local10);
		@Pc(55) int local55;
		if (this.aShortArray25 != null) {
			for (local55 = 0; local55 < this.aShortArray25.length; local55++) {
				local50.method271(this.aShortArray25[local55], this.aShortArray26[local55]);
			}
		}
		if (this.aShortArray27 != null) {
			for (local55 = 0; local55 < this.aShortArray27.length; local55++) {
				local50.method278(this.aShortArray27[local55], this.aShortArray24[local55]);
			}
		}
		return local50;
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(ZLclient!vf;)V")
	public void method1580(@OriginalArg(1) Class1_Sub26 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method2945();
			if (local5 == 0) {
				return;
			}
			this.method1577(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!ii", name = "b", descriptor = "(I)Z")
	public boolean method1581() {
		if (this.anIntArray208 == null) {
			return true;
		}
		@Pc(12) boolean local12 = true;
		for (@Pc(14) int local14 = 0; local14 < this.anIntArray208.length; local14++) {
			if (!Static13.aClass28_4.method841(this.anIntArray208[local14], 0)) {
				local12 = false;
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(Z)Z")
	public boolean method1588() {
		@Pc(7) boolean local7 = true;
		for (@Pc(9) int local9 = 0; local9 < 5; local9++) {
			if (this.anIntArray207[local9] != -1 && !Static13.aClass28_4.method841(this.anIntArray207[local9], 0)) {
				local7 = false;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!ii", name = "c", descriptor = "(I)Lclient!ai;")
	public Class5_Sub1 method1590() {
		if (this.anIntArray208 == null) {
			return null;
		}
		@Pc(20) Class5_Sub1[] local20 = new Class5_Sub1[this.anIntArray208.length];
		for (@Pc(22) int local22 = 0; local22 < this.anIntArray208.length; local22++) {
			local20[local22] = Static9.method277(Static13.aClass28_4, this.anIntArray208[local22]);
		}
		@Pc(48) Class5_Sub1 local48;
		if (local20.length == 1) {
			local48 = local20[0];
		} else {
			local48 = new Class5_Sub1(local20, local20.length);
		}
		@Pc(62) int local62;
		if (this.aShortArray25 != null) {
			for (local62 = 0; local62 < this.aShortArray25.length; local62++) {
				local48.method271(this.aShortArray25[local62], this.aShortArray26[local62]);
			}
		}
		if (this.aShortArray27 != null) {
			for (local62 = 0; local62 < this.aShortArray27.length; local62++) {
				local48.method278(this.aShortArray27[local62], this.aShortArray24[local62]);
			}
		}
		return local48;
	}
}
