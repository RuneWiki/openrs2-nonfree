import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ic")
public final class Class52 {

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "[S")
	private short[] aShortArray16;

	@OriginalMember(owner = "client!ic", name = "e", descriptor = "[I")
	private int[] anIntArray122;

	@OriginalMember(owner = "client!ic", name = "f", descriptor = "[S")
	private short[] aShortArray17;

	@OriginalMember(owner = "client!ic", name = "g", descriptor = "[S")
	private short[] aShortArray18;

	@OriginalMember(owner = "client!ic", name = "r", descriptor = "[S")
	private short[] aShortArray19;

	@OriginalMember(owner = "client!ic", name = "l", descriptor = "Z")
	public boolean aBoolean86 = false;

	@OriginalMember(owner = "client!ic", name = "m", descriptor = "[I")
	private int[] anIntArray123 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!ic", name = "p", descriptor = "I")
	public int anInt1966 = -1;

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "(I)Z")
	public boolean method1463() {
		@Pc(15) boolean local15 = true;
		for (@Pc(17) int local17 = 0; local17 < 5; local17++) {
			if (this.anIntArray123[local17] != -1 && !Static221.aClass70_44.method3535(0, this.anIntArray123[local17])) {
				local15 = false;
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lclient!k;B)V")
	public void method1465(@OriginalArg(0) Class1_Sub16 arg0) {
		while (true) {
			@Pc(14) int local14 = arg0.method3793();
			if (local14 == 0) {
				return;
			}
			this.method1466(local14, arg0);
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(ILclient!k;I)V")
	private void method1466(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub16 arg1) {
		if (arg0 == 1) {
			this.anInt1966 = arg1.method3793();
			return;
		}
		@Pc(55) int local55;
		@Pc(65) int local65;
		if (arg0 == 2) {
			local55 = arg1.method3793();
			this.anIntArray122 = new int[local55];
			for (local65 = 0; local65 < local55; local65++) {
				this.anIntArray122[local65] = arg1.method3805();
			}
		} else if (arg0 == 3) {
			this.aBoolean86 = true;
		} else if (arg0 == 40) {
			local55 = arg1.method3793();
			this.aShortArray19 = new short[local55];
			this.aShortArray16 = new short[local55];
			for (local65 = 0; local65 < local55; local65++) {
				this.aShortArray16[local65] = (short) arg1.method3805();
				this.aShortArray19[local65] = (short) arg1.method3805();
			}
		} else if (arg0 == 41) {
			local55 = arg1.method3793();
			this.aShortArray17 = new short[local55];
			this.aShortArray18 = new short[local55];
			for (local65 = 0; local65 < local55; local65++) {
				this.aShortArray18[local65] = (short) arg1.method3805();
				this.aShortArray17[local65] = (short) arg1.method3805();
			}
		} else if (arg0 >= 60 && arg0 < 70) {
			this.anIntArray123[arg0 - 60] = arg1.method3805();
		}
	}

	@OriginalMember(owner = "client!ic", name = "c", descriptor = "(I)Lclient!vd;")
	public Class5_Sub6 method1467() {
		@Pc(4) Class5_Sub6[] local4 = new Class5_Sub6[5];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < 5; local12++) {
			if (this.anIntArray123[local12] != -1) {
				local4[local10++] = Static215.method3571(Static221.aClass70_44, this.anIntArray123[local12]);
			}
		}
		@Pc(41) Class5_Sub6 local41 = new Class5_Sub6(local4, local10);
		@Pc(51) int local51;
		if (this.aShortArray16 != null) {
			for (local51 = 0; local51 < this.aShortArray16.length; local51++) {
				local41.method3566(this.aShortArray16[local51], this.aShortArray19[local51]);
			}
		}
		if (this.aShortArray18 != null) {
			for (local51 = 0; local51 < this.aShortArray18.length; local51++) {
				local41.method3564(this.aShortArray18[local51], this.aShortArray17[local51]);
			}
		}
		return local41;
	}

	@OriginalMember(owner = "client!ic", name = "d", descriptor = "(I)Lclient!vd;")
	public Class5_Sub6 method1469() {
		if (this.anIntArray122 == null) {
			return null;
		}
		@Pc(15) Class5_Sub6[] local15 = new Class5_Sub6[this.anIntArray122.length];
		for (@Pc(17) int local17 = 0; local17 < this.anIntArray122.length; local17++) {
			local15[local17] = Static215.method3571(Static221.aClass70_44, this.anIntArray122[local17]);
		}
		@Pc(56) Class5_Sub6 local56;
		if (local15.length == 1) {
			local56 = local15[0];
		} else {
			local56 = new Class5_Sub6(local15, local15.length);
		}
		@Pc(70) int local70;
		if (this.aShortArray16 != null) {
			for (local70 = 0; local70 < this.aShortArray16.length; local70++) {
				local56.method3566(this.aShortArray16[local70], this.aShortArray19[local70]);
			}
		}
		if (this.aShortArray18 != null) {
			for (local70 = 0; local70 < this.aShortArray18.length; local70++) {
				local56.method3564(this.aShortArray18[local70], this.aShortArray17[local70]);
			}
		}
		return local56;
	}

	@OriginalMember(owner = "client!ic", name = "e", descriptor = "(I)Z")
	public boolean method1470() {
		if (this.anIntArray122 == null) {
			return true;
		}
		@Pc(12) boolean local12 = true;
		for (@Pc(19) int local19 = 0; local19 < this.anIntArray122.length; local19++) {
			if (!Static221.aClass70_44.method3535(0, this.anIntArray122[local19])) {
				local12 = false;
			}
		}
		return local12;
	}
}
