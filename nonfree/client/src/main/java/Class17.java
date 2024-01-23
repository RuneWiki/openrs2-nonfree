import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bm")
public final class Class17 {

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "[S")
	private short[] aShortArray22;

	@OriginalMember(owner = "client!bm", name = "d", descriptor = "[S")
	private short[] aShortArray23;

	@OriginalMember(owner = "client!bm", name = "j", descriptor = "[S")
	private short[] aShortArray24;

	@OriginalMember(owner = "client!bm", name = "m", descriptor = "[I")
	private int[] anIntArray61;

	@OriginalMember(owner = "client!bm", name = "q", descriptor = "[S")
	private short[] aShortArray25;

	@OriginalMember(owner = "client!bm", name = "b", descriptor = "I")
	public int anInt540 = -1;

	@OriginalMember(owner = "client!bm", name = "n", descriptor = "Z")
	public boolean aBoolean55 = false;

	@OriginalMember(owner = "client!bm", name = "e", descriptor = "[I")
	private int[] anIntArray60 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(ILclient!fh;B)V")
	private void method508(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub13 arg1) {
		if (arg0 == 1) {
			this.anInt540 = arg1.method1853();
			return;
		}
		@Pc(36) int local36;
		@Pc(46) int local46;
		if (arg0 == 2) {
			local36 = arg1.method1853();
			this.anIntArray61 = new int[local36];
			for (local46 = 0; local46 < local36; local46++) {
				this.anIntArray61[local46] = arg1.method1879();
			}
		} else if (arg0 == 3) {
			this.aBoolean55 = true;
		} else if (arg0 == 40) {
			local36 = arg1.method1853();
			this.aShortArray24 = new short[local36];
			this.aShortArray23 = new short[local36];
			for (local46 = 0; local46 < local36; local46++) {
				this.aShortArray24[local46] = (short) arg1.method1879();
				this.aShortArray23[local46] = (short) arg1.method1879();
			}
		} else if (arg0 == 41) {
			local36 = arg1.method1853();
			this.aShortArray22 = new short[local36];
			this.aShortArray25 = new short[local36];
			for (local46 = 0; local46 < local36; local46++) {
				this.aShortArray22[local46] = (short) arg1.method1879();
				this.aShortArray25[local46] = (short) arg1.method1879();
			}
		} else if (arg0 >= 60 && arg0 < 70) {
			this.anIntArray60[arg0 - 60] = arg1.method1879();
		}
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(I)Z")
	public boolean method510() {
		@Pc(3) boolean local3 = true;
		for (@Pc(9) int local9 = 0; local9 < 5; local9++) {
			if (this.anIntArray60[local9] != -1 && !Static264.aClass119_82.method3229(this.anIntArray60[local9], 0)) {
				local3 = false;
			}
		}
		return local3;
	}

	@OriginalMember(owner = "client!bm", name = "b", descriptor = "(I)Z")
	public boolean method512() {
		if (this.anIntArray61 == null) {
			return true;
		}
		@Pc(12) boolean local12 = true;
		for (@Pc(14) int local14 = 0; local14 < this.anIntArray61.length; local14++) {
			if (!Static264.aClass119_82.method3229(this.anIntArray61[local14], 0)) {
				local12 = false;
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!bm", name = "b", descriptor = "(B)Lclient!nb;")
	public Class11_Sub5 method514() {
		if (this.anIntArray61 == null) {
			return null;
		}
		@Pc(22) Class11_Sub5[] local22 = new Class11_Sub5[this.anIntArray61.length];
		for (@Pc(24) int local24 = 0; local24 < this.anIntArray61.length; local24++) {
			local22[local24] = Static180.method3074(Static264.aClass119_82, this.anIntArray61[local24]);
		}
		@Pc(56) Class11_Sub5 local56;
		if (local22.length == 1) {
			local56 = local22[0];
		} else {
			local56 = new Class11_Sub5(local22, local22.length);
		}
		@Pc(71) int local71;
		if (this.aShortArray24 != null) {
			for (local71 = 0; local71 < this.aShortArray24.length; local71++) {
				local56.method3053(this.aShortArray24[local71], this.aShortArray23[local71]);
			}
		}
		if (this.aShortArray22 != null) {
			for (local71 = 0; local71 < this.aShortArray22.length; local71++) {
				local56.method3079(this.aShortArray22[local71], this.aShortArray25[local71]);
			}
		}
		return local56;
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(Z)Lclient!nb;")
	public Class11_Sub5 method516() {
		@Pc(8) Class11_Sub5[] local8 = new Class11_Sub5[5];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < 5; local12++) {
			if (this.anIntArray60[local12] != -1) {
				local8[local10++] = Static180.method3074(Static264.aClass119_82, this.anIntArray60[local12]);
			}
		}
		@Pc(46) Class11_Sub5 local46 = new Class11_Sub5(local8, local10);
		@Pc(51) int local51;
		if (this.aShortArray24 != null) {
			for (local51 = 0; local51 < this.aShortArray24.length; local51++) {
				local46.method3053(this.aShortArray24[local51], this.aShortArray23[local51]);
			}
		}
		if (this.aShortArray22 != null) {
			for (local51 = 0; local51 < this.aShortArray22.length; local51++) {
				local46.method3079(this.aShortArray22[local51], this.aShortArray25[local51]);
			}
		}
		return local46;
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(Lclient!fh;I)V")
	public void method517(@OriginalArg(0) Class1_Sub13 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method1853();
			if (local5 == 0) {
				return;
			}
			this.method508(local5, arg0);
		}
	}
}
