import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ij")
public final class Class79 {

	@OriginalMember(owner = "client!ij", name = "b", descriptor = "[S")
	private short[] aShortArray66;

	@OriginalMember(owner = "client!ij", name = "e", descriptor = "[S")
	private short[] aShortArray67;

	@OriginalMember(owner = "client!ij", name = "g", descriptor = "[S")
	private short[] aShortArray68;

	@OriginalMember(owner = "client!ij", name = "k", descriptor = "[S")
	private short[] aShortArray69;

	@OriginalMember(owner = "client!ij", name = "m", descriptor = "[I")
	private int[] anIntArray261;

	@OriginalMember(owner = "client!ij", name = "f", descriptor = "Z")
	public boolean aBoolean156 = false;

	@OriginalMember(owner = "client!ij", name = "h", descriptor = "I")
	public int anInt2500 = -1;

	@OriginalMember(owner = "client!ij", name = "t", descriptor = "[I")
	private int[] anIntArray262 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(I)Lclient!ch;")
	public Class2_Sub3 method1870() {
		@Pc(8) Class2_Sub3[] local8 = new Class2_Sub3[5];
		@Pc(10) int local10 = 0;
		for (@Pc(20) int local20 = 0; local20 < 5; local20++) {
			if (this.anIntArray262[local20] != -1) {
				local8[local10++] = Static30.method658(Static245.aClass168_166, this.anIntArray262[local20]);
			}
		}
		@Pc(53) Class2_Sub3 local53 = new Class2_Sub3(local8, local10);
		@Pc(59) int local59;
		if (this.aShortArray67 != null) {
			for (local59 = 0; local59 < this.aShortArray67.length; local59++) {
				local53.method656(this.aShortArray67[local59], this.aShortArray66[local59]);
			}
		}
		if (this.aShortArray69 != null) {
			for (local59 = 0; local59 < this.aShortArray69.length; local59++) {
				local53.method636(this.aShortArray69[local59], this.aShortArray68[local59]);
			}
		}
		return local53;
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(Lclient!qm;ZI)V")
	private void method1872(@OriginalArg(0) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt2500 = arg0.method2199();
			return;
		}
		@Pc(23) int local23;
		@Pc(29) int local29;
		if (arg1 == 2) {
			local23 = arg0.method2199();
			this.anIntArray261 = new int[local23];
			for (local29 = 0; local29 < local23; local29++) {
				this.anIntArray261[local29] = arg0.method2244();
			}
		} else if (arg1 == 3) {
			this.aBoolean156 = true;
		} else if (arg1 == 40) {
			local23 = arg0.method2199();
			this.aShortArray66 = new short[local23];
			this.aShortArray67 = new short[local23];
			for (local29 = 0; local29 < local23; local29++) {
				this.aShortArray67[local29] = (short) arg0.method2244();
				this.aShortArray66[local29] = (short) arg0.method2244();
			}
		} else if (arg1 == 41) {
			local23 = arg0.method2199();
			this.aShortArray68 = new short[local23];
			this.aShortArray69 = new short[local23];
			for (local29 = 0; local29 < local23; local29++) {
				this.aShortArray69[local29] = (short) arg0.method2244();
				this.aShortArray68[local29] = (short) arg0.method2244();
			}
		} else if (arg1 >= 60 && arg1 < 70) {
			this.anIntArray262[arg1 - 60] = arg0.method2244();
		}
	}

	@OriginalMember(owner = "client!ij", name = "b", descriptor = "(I)Z")
	public boolean method1873() {
		@Pc(7) boolean local7 = true;
		for (@Pc(9) int local9 = 0; local9 < 5; local9++) {
			if (this.anIntArray262[local9] != -1 && !Static245.aClass168_166.method4072(this.anIntArray262[local9], 0)) {
				local7 = false;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(Lclient!qm;B)V")
	public void method1874(@OriginalArg(0) Class1_Sub14 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method2199();
			if (local15 == 0) {
				return;
			}
			this.method1872(arg0, local15);
		}
	}

	@OriginalMember(owner = "client!ij", name = "c", descriptor = "(I)Z")
	public boolean method1878() {
		if (this.anIntArray261 == null) {
			return true;
		}
		@Pc(13) boolean local13 = true;
		for (@Pc(15) int local15 = 0; local15 < this.anIntArray261.length; local15++) {
			if (!Static245.aClass168_166.method4072(this.anIntArray261[local15], 0)) {
				local13 = false;
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(B)Lclient!ch;")
	public Class2_Sub3 method1880() {
		if (this.anIntArray261 == null) {
			return null;
		}
		@Pc(22) Class2_Sub3[] local22 = new Class2_Sub3[this.anIntArray261.length];
		for (@Pc(24) int local24 = 0; local24 < this.anIntArray261.length; local24++) {
			local22[local24] = Static30.method658(Static245.aClass168_166, this.anIntArray261[local24]);
		}
		@Pc(59) Class2_Sub3 local59;
		if (local22.length == 1) {
			local59 = local22[0];
		} else {
			local59 = new Class2_Sub3(local22, local22.length);
		}
		@Pc(70) int local70;
		if (this.aShortArray67 != null) {
			for (local70 = 0; local70 < this.aShortArray67.length; local70++) {
				local59.method656(this.aShortArray67[local70], this.aShortArray66[local70]);
			}
		}
		if (this.aShortArray69 != null) {
			for (local70 = 0; local70 < this.aShortArray69.length; local70++) {
				local59.method636(this.aShortArray69[local70], this.aShortArray68[local70]);
			}
		}
		return local59;
	}
}
