import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dc")
public final class Class3_Sub1_Sub3 extends Class3_Sub1 {

	@OriginalMember(owner = "client!dc", name = "U", descriptor = "[I")
	private int[] anIntArray82;

	@OriginalMember(owner = "client!dc", name = "gb", descriptor = "[I")
	private final int[] anIntArray83 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!dc", name = "kb", descriptor = "[S")
	private final short[] aShortArray2 = new short[6];

	@OriginalMember(owner = "client!dc", name = "V", descriptor = "Z")
	public boolean aBoolean26 = false;

	@OriginalMember(owner = "client!dc", name = "nb", descriptor = "I")
	public int anInt836 = -1;

	@OriginalMember(owner = "client!dc", name = "sb", descriptor = "[S")
	private final short[] aShortArray3 = new short[6];

	@OriginalMember(owner = "client!dc", name = "i", descriptor = "(I)Lclient!ue;")
	public Class3_Sub1_Sub1_Sub7 method536() {
		if (this.anIntArray82 == null) {
			return null;
		}
		@Pc(23) Class3_Sub1_Sub1_Sub7[] local23 = new Class3_Sub1_Sub1_Sub7[this.anIntArray82.length];
		for (@Pc(25) int local25 = 0; local25 < this.anIntArray82.length; local25++) {
			local23[local25] = Static121.method2242(Static70.aClass25_22, this.anIntArray82[local25]);
		}
		@Pc(54) Class3_Sub1_Sub1_Sub7 local54;
		if (local23.length == 1) {
			local54 = local23[0];
		} else {
			local54 = new Class3_Sub1_Sub1_Sub7(local23, local23.length);
		}
		for (@Pc(62) int local62 = 0; local62 < 6 && this.aShortArray3[local62] != 0; local62++) {
			local54.method2233(this.aShortArray3[local62], this.aShortArray2[local62]);
		}
		return local54;
	}

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "(B)Lclient!ue;")
	public Class3_Sub1_Sub1_Sub7 method538() {
		@Pc(7) int local7 = 0;
		@Pc(10) Class3_Sub1_Sub1_Sub7[] local10 = new Class3_Sub1_Sub1_Sub7[5];
		for (@Pc(12) int local12 = 0; local12 < 5; local12++) {
			if (this.anIntArray83[local12] != -1) {
				local10[local7++] = Static121.method2242(Static70.aClass25_22, this.anIntArray83[local12]);
			}
		}
		@Pc(41) Class3_Sub1_Sub1_Sub7 local41 = new Class3_Sub1_Sub1_Sub7(local10, local7);
		for (@Pc(48) int local48 = 0; local48 < 6 && this.aShortArray3[local48] != 0; local48++) {
			local41.method2233(this.aShortArray3[local48], this.aShortArray2[local48]);
		}
		return local41;
	}

	@OriginalMember(owner = "client!dc", name = "l", descriptor = "(I)Z")
	public boolean method540() {
		if (this.anIntArray82 == null) {
			return true;
		}
		@Pc(12) boolean local12 = true;
		for (@Pc(14) int local14 = 0; local14 < this.anIntArray82.length; local14++) {
			if (!Static70.aClass25_22.method918(this.anIntArray82[local14], 0)) {
				local12 = false;
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!dc", name = "c", descriptor = "(B)Z")
	public boolean method541() {
		@Pc(3) boolean local3 = true;
		for (@Pc(14) int local14 = 0; local14 < 5; local14++) {
			if (this.anIntArray83[local14] != -1 && !Static70.aClass25_22.method918(this.anIntArray83[local14], 0)) {
				local3 = false;
			}
		}
		return local3;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lclient!la;BI)V")
	private void method543(@OriginalArg(0) Class3_Sub12 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt836 = arg0.method1936();
		} else if (arg1 == 2) {
			@Pc(26) int local26 = arg0.method1936();
			this.anIntArray82 = new int[local26];
			for (@Pc(32) int local32 = 0; local32 < local26; local32++) {
				this.anIntArray82[local32] = arg0.method1963();
			}
		} else if (arg1 == 3) {
			this.aBoolean26 = true;
		} else if (arg1 >= 40 && arg1 < 50) {
			this.aShortArray3[arg1 - 40] = (short) arg0.method1963();
		} else if (arg1 >= 50 && arg1 < 60) {
			this.aShortArray2[arg1 - 50] = (short) arg0.method1963();
		} else if (arg1 >= 60 && arg1 < 70) {
			this.anIntArray83[arg1 - 60] = arg0.method1963();
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(ZLclient!la;)V")
	public void method545(@OriginalArg(1) Class3_Sub12 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method1936();
			if (local9 == 0) {
				return;
			}
			this.method543(arg0, local9);
		}
	}
}
