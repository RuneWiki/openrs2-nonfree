import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qf")
public final class Class1_Sub1_Sub16 extends Class1_Sub1 {

	@OriginalMember(owner = "client!qf", name = "G", descriptor = "[I")
	private int[] anIntArray355;

	@OriginalMember(owner = "client!qf", name = "Q", descriptor = "[S")
	private short[] aShortArray32;

	@OriginalMember(owner = "client!qf", name = "R", descriptor = "[S")
	private short[] aShortArray33;

	@OriginalMember(owner = "client!qf", name = "S", descriptor = "[S")
	private short[] aShortArray34;

	@OriginalMember(owner = "client!qf", name = "X", descriptor = "[S")
	private short[] aShortArray35;

	@OriginalMember(owner = "client!qf", name = "U", descriptor = "I")
	public int anInt3762 = -1;

	@OriginalMember(owner = "client!qf", name = "Z", descriptor = "Z")
	public boolean aBoolean141 = false;

	@OriginalMember(owner = "client!qf", name = "db", descriptor = "[I")
	private final int[] anIntArray356 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(ILclient!fa;)V")
	public void method2796(@OriginalArg(1) Class1_Sub9 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method1234();
			if (local5 == 0) {
				return;
			}
			this.method2804(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!qf", name = "d", descriptor = "(B)Lclient!ei;")
	public Class1_Sub1_Sub4_Sub3 method2797() {
		@Pc(4) Class1_Sub1_Sub4_Sub3[] local4 = new Class1_Sub1_Sub4_Sub3[5];
		@Pc(17) int local17 = 0;
		for (@Pc(19) int local19 = 0; local19 < 5; local19++) {
			if (this.anIntArray356[local19] != -1) {
				local4[local17++] = Static46.method1144(Static117.aClass76_94, this.anIntArray356[local19]);
			}
		}
		@Pc(50) Class1_Sub1_Sub4_Sub3 local50 = new Class1_Sub1_Sub4_Sub3(local4, local17);
		@Pc(55) int local55;
		if (this.aShortArray34 != null) {
			for (local55 = 0; local55 < this.aShortArray34.length; local55++) {
				local50.method1146(this.aShortArray34[local55], this.aShortArray35[local55]);
			}
		}
		if (this.aShortArray33 != null) {
			for (local55 = 0; local55 < this.aShortArray33.length; local55++) {
				local50.method1149(this.aShortArray33[local55], this.aShortArray32[local55]);
			}
		}
		return local50;
	}

	@OriginalMember(owner = "client!qf", name = "f", descriptor = "(I)Z")
	public boolean method2799() {
		@Pc(8) boolean local8 = true;
		for (@Pc(14) int local14 = 0; local14 < 5; local14++) {
			if (this.anIntArray356[local14] != -1 && !Static117.aClass76_94.method3329(this.anIntArray356[local14], 0)) {
				local8 = false;
			}
		}
		return local8;
	}

	@OriginalMember(owner = "client!qf", name = "g", descriptor = "(I)Lclient!ei;")
	public Class1_Sub1_Sub4_Sub3 method2801() {
		if (this.anIntArray355 == null) {
			return null;
		}
		@Pc(15) Class1_Sub1_Sub4_Sub3[] local15 = new Class1_Sub1_Sub4_Sub3[this.anIntArray355.length];
		for (@Pc(17) int local17 = 0; local17 < this.anIntArray355.length; local17++) {
			local15[local17] = Static46.method1144(Static117.aClass76_94, this.anIntArray355[local17]);
		}
		@Pc(47) Class1_Sub1_Sub4_Sub3 local47;
		if (local15.length == 1) {
			local47 = local15[0];
		} else {
			local47 = new Class1_Sub1_Sub4_Sub3(local15, local15.length);
		}
		@Pc(61) int local61;
		if (this.aShortArray34 != null) {
			for (local61 = 0; local61 < this.aShortArray34.length; local61++) {
				local47.method1146(this.aShortArray34[local61], this.aShortArray35[local61]);
			}
		}
		if (this.aShortArray33 != null) {
			for (local61 = 0; local61 < this.aShortArray33.length; local61++) {
				local47.method1149(this.aShortArray33[local61], this.aShortArray32[local61]);
			}
		}
		return local47;
	}

	@OriginalMember(owner = "client!qf", name = "h", descriptor = "(I)Z")
	public boolean method2802() {
		if (this.anIntArray355 == null) {
			return true;
		}
		@Pc(19) boolean local19 = true;
		for (@Pc(21) int local21 = 0; local21 < this.anIntArray355.length; local21++) {
			if (!Static117.aClass76_94.method3329(this.anIntArray355[local21], 0)) {
				local19 = false;
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(IILclient!fa;)V")
	private void method2804(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub9 arg1) {
		if (arg0 == 1) {
			this.anInt3762 = arg1.method1234();
			return;
		}
		@Pc(20) int local20;
		@Pc(26) int local26;
		if (arg0 == 2) {
			local20 = arg1.method1234();
			this.anIntArray355 = new int[local20];
			for (local26 = 0; local26 < local20; local26++) {
				this.anIntArray355[local26] = arg1.method1280();
			}
		} else if (arg0 == 3) {
			this.aBoolean141 = true;
		} else if (arg0 == 40) {
			local20 = arg1.method1234();
			this.aShortArray35 = new short[local20];
			this.aShortArray34 = new short[local20];
			for (local26 = 0; local26 < local20; local26++) {
				this.aShortArray34[local26] = (short) arg1.method1280();
				this.aShortArray35[local26] = (short) arg1.method1280();
			}
		} else if (arg0 == 41) {
			local20 = arg1.method1234();
			this.aShortArray33 = new short[local20];
			this.aShortArray32 = new short[local20];
			for (local26 = 0; local26 < local20; local26++) {
				this.aShortArray33[local26] = (short) arg1.method1280();
				this.aShortArray32[local26] = (short) arg1.method1280();
			}
			return;
		} else if (arg0 >= 60 && arg0 < 70) {
			this.anIntArray356[arg0 - 60] = arg1.method1280();
			return;
		}
	}
}
