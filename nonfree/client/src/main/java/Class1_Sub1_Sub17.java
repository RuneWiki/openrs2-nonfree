import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wa")
public final class Class1_Sub1_Sub17 extends Class1_Sub1 {

	@OriginalMember(owner = "client!wa", name = "wb", descriptor = "[I")
	private int[] anIntArray446;

	@OriginalMember(owner = "client!wa", name = "Z", descriptor = "[I")
	private final int[] anIntArray445 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!wa", name = "fb", descriptor = "[S")
	private final short[] aShortArray12 = new short[6];

	@OriginalMember(owner = "client!wa", name = "ab", descriptor = "I")
	public int anInt2803 = -1;

	@OriginalMember(owner = "client!wa", name = "tb", descriptor = "Z")
	public boolean aBoolean168 = false;

	@OriginalMember(owner = "client!wa", name = "nb", descriptor = "[S")
	private final short[] aShortArray13 = new short[6];

	@OriginalMember(owner = "client!wa", name = "c", descriptor = "(Z)Z")
	public boolean method2057() {
		if (this.anIntArray446 == null) {
			return true;
		}
		@Pc(12) boolean local12 = true;
		for (@Pc(14) int local14 = 0; local14 < this.anIntArray446.length; local14++) {
			if (!Static94.aClass41_51.method1072(0, this.anIntArray446[local14])) {
				local12 = false;
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!wa", name = "g", descriptor = "(I)Lclient!kc;")
	public Class1_Sub1_Sub2_Sub3 method2060() {
		if (this.anIntArray446 == null) {
			return null;
		}
		@Pc(15) Class1_Sub1_Sub2_Sub3[] local15 = new Class1_Sub1_Sub2_Sub3[this.anIntArray446.length];
		for (@Pc(22) int local22 = 0; local22 < this.anIntArray446.length; local22++) {
			local15[local22] = Static59.method1010(Static94.aClass41_51, this.anIntArray446[local22]);
		}
		@Pc(51) Class1_Sub1_Sub2_Sub3 local51;
		if (local15.length == 1) {
			local51 = local15[0];
		} else {
			local51 = new Class1_Sub1_Sub2_Sub3(local15, local15.length);
		}
		for (@Pc(59) int local59 = 0; local59 < 6 && this.aShortArray13[local59] != 0; local59++) {
			local51.method1013(this.aShortArray13[local59], this.aShortArray12[local59]);
		}
		return local51;
	}

	@OriginalMember(owner = "client!wa", name = "h", descriptor = "(I)Z")
	public boolean method2061() {
		@Pc(7) boolean local7 = true;
		for (@Pc(9) int local9 = 0; local9 < 5; local9++) {
			if (this.anIntArray445[local9] != -1 && !Static94.aClass41_51.method1072(0, this.anIntArray445[local9])) {
				local7 = false;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(ILclient!id;I)V")
	private void method2062(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub6 arg1) {
		if (arg0 == 1) {
			this.anInt2803 = arg1.method1837();
		} else if (arg0 == 2) {
			@Pc(22) int local22 = arg1.method1837();
			this.anIntArray446 = new int[local22];
			for (@Pc(28) int local28 = 0; local28 < local22; local28++) {
				this.anIntArray446[local28] = arg1.method1842();
			}
			return;
		} else if (arg0 == 3) {
			this.aBoolean168 = true;
			return;
		} else if (arg0 < 40 || arg0 >= 50) {
			if (arg0 >= 50 && arg0 < 60) {
				this.aShortArray12[arg0 - 50] = (short) arg1.method1842();
				return;
			}
			if (arg0 >= 60 && arg0 < 70) {
				this.anIntArray445[arg0 - 60] = arg1.method1842();
				return;
			}
		} else {
			this.aShortArray13[arg0 - 40] = (short) arg1.method1842();
			return;
		}
	}

	@OriginalMember(owner = "client!wa", name = "i", descriptor = "(I)Lclient!kc;")
	public Class1_Sub1_Sub2_Sub3 method2066() {
		@Pc(8) Class1_Sub1_Sub2_Sub3[] local8 = new Class1_Sub1_Sub2_Sub3[5];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < 5; local12++) {
			if (this.anIntArray445[local12] != -1) {
				local8[local10++] = Static59.method1010(Static94.aClass41_51, this.anIntArray445[local12]);
			}
		}
		@Pc(52) Class1_Sub1_Sub2_Sub3 local52 = new Class1_Sub1_Sub2_Sub3(local8, local10);
		for (@Pc(54) int local54 = 0; local54 < 6 && this.aShortArray13[local54] != 0; local54++) {
			local52.method1013(this.aShortArray13[local54], this.aShortArray12[local54]);
		}
		return local52;
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(ILclient!id;)V")
	public void method2069(@OriginalArg(1) Class1_Sub6 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method1837();
			if (local15 == 0) {
				return;
			}
			this.method2062(local15, arg0);
		}
	}
}
