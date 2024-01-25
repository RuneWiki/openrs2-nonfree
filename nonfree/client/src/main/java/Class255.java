import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uq")
public final class Class255 {

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "[S")
	private short[] aShortArray108;

	@OriginalMember(owner = "client!uq", name = "b", descriptor = "[I")
	private int[] anIntArray482;

	@OriginalMember(owner = "client!uq", name = "e", descriptor = "[S")
	private short[] aShortArray109;

	@OriginalMember(owner = "client!uq", name = "k", descriptor = "[S")
	private short[] aShortArray110;

	@OriginalMember(owner = "client!uq", name = "m", descriptor = "[S")
	private short[] aShortArray111;

	@OriginalMember(owner = "client!uq", name = "o", descriptor = "Lclient!gn;")
	public Class97 aClass97_2;

	@OriginalMember(owner = "client!uq", name = "i", descriptor = "[I")
	private final int[] anIntArray483 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(I)Lclient!ld;")
	public Class147 method5347() {
		@Pc(8) Class147[] local8 = new Class147[5];
		@Pc(10) int local10 = 0;
		@Pc(14) Class185 local14 = this.aClass97_2.aClass185_38;
		@Pc(18) int local18;
		synchronized (this.aClass97_2.aClass185_38) {
			local18 = 0;
			while (true) {
				if (local18 >= 5) {
					break;
				}
				if (this.anIntArray483[local18] != -1) {
					local8[local10++] = Static135.method1728(this.aClass97_2.aClass185_38, this.anIntArray483[local18]);
				}
				local18++;
			}
		}
		for (@Pc(60) int local60 = 0; local60 < 5; local60++) {
			if (local8[local60] != null && local8[local60].anInt4181 < 13) {
				local8[local60].method3306();
			}
		}
		@Pc(90) Class147 local90 = new Class147(local8, local10);
		if (this.aShortArray111 != null) {
			for (local18 = 0; local18 < this.aShortArray111.length; local18++) {
				local90.method3302(this.aShortArray110[local18], this.aShortArray111[local18]);
			}
		}
		if (this.aShortArray109 != null) {
			for (local18 = 0; local18 < this.aShortArray109.length; local18++) {
				local90.method3311(this.aShortArray108[local18], this.aShortArray109[local18]);
			}
		}
		return local90;
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(B)Lclient!ld;")
	public Class147 method5349() {
		if (this.anIntArray482 == null) {
			return null;
		}
		@Pc(15) Class147[] local15 = new Class147[this.anIntArray482.length];
		@Pc(19) Class185 local19 = this.aClass97_2.aClass185_38;
		@Pc(30) int local30;
		synchronized (this.aClass97_2.aClass185_38) {
			local30 = 0;
			while (true) {
				if (this.anIntArray482.length <= local30) {
					break;
				}
				local15[local30] = Static135.method1728(this.aClass97_2.aClass185_38, this.anIntArray482[local30]);
				local30++;
			}
		}
		for (@Pc(63) int local63 = 0; local63 < this.anIntArray482.length; local63++) {
			if (local15[local63].anInt4181 < 13) {
				local15[local63].method3306();
			}
		}
		@Pc(100) Class147 local100;
		if (local15.length == 1) {
			local100 = local15[0];
		} else {
			local100 = new Class147(local15, local15.length);
		}
		if (local100 == null) {
			return null;
		}
		if (this.aShortArray111 != null) {
			for (local30 = 0; local30 < this.aShortArray111.length; local30++) {
				local100.method3302(this.aShortArray110[local30], this.aShortArray111[local30]);
			}
		}
		if (this.aShortArray109 != null) {
			for (local30 = 0; local30 < this.aShortArray109.length; local30++) {
				local100.method3311(this.aShortArray108[local30], this.aShortArray109[local30]);
			}
		}
		return local100;
	}

	@OriginalMember(owner = "client!uq", name = "b", descriptor = "(B)Z")
	public boolean method5351() {
		if (this.anIntArray482 == null) {
			return true;
		}
		@Pc(12) boolean local12 = true;
		@Pc(16) Class185 local16 = this.aClass97_2.aClass185_38;
		synchronized (this.aClass97_2.aClass185_38) {
			for (@Pc(20) int local20 = 0; local20 < this.anIntArray482.length; local20++) {
				if (!this.aClass97_2.aClass185_38.method4024(0, this.anIntArray482[local20])) {
					local12 = false;
				}
			}
			return local12;
		}
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(Lclient!wm;BI)V")
	private void method5352(@OriginalArg(0) Class1_Sub19 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			arg0.method2915();
			return;
		}
		@Pc(15) int local15;
		@Pc(21) int local21;
		if (arg1 == 2) {
			local15 = arg0.method2915();
			this.anIntArray482 = new int[local15];
			for (local21 = 0; local21 < local15; local21++) {
				this.anIntArray482[local21] = arg0.method2896();
			}
		} else if (arg1 != 3) {
			if (arg1 == 40) {
				local15 = arg0.method2915();
				this.aShortArray111 = new short[local15];
				this.aShortArray110 = new short[local15];
				for (local21 = 0; local21 < local15; local21++) {
					this.aShortArray111[local21] = (short) arg0.method2896();
					this.aShortArray110[local21] = (short) arg0.method2896();
				}
			} else if (arg1 == 41) {
				local15 = arg0.method2915();
				this.aShortArray108 = new short[local15];
				this.aShortArray109 = new short[local15];
				for (local21 = 0; local21 < local15; local21++) {
					this.aShortArray109[local21] = (short) arg0.method2896();
					this.aShortArray108[local21] = (short) arg0.method2896();
				}
			} else if (arg1 >= 60 && arg1 < 70) {
				this.anIntArray483[arg1 - 60] = arg0.method2896();
			}
		}
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(ILclient!wm;)V")
	public void method5353(@OriginalArg(1) Class1_Sub19 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method2915();
			if (local9 == 0) {
				return;
			}
			this.method5352(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!uq", name = "c", descriptor = "(B)Z")
	public boolean method5354() {
		@Pc(7) boolean local7 = true;
		@Pc(11) Class185 local11 = this.aClass97_2.aClass185_38;
		synchronized (this.aClass97_2.aClass185_38) {
			for (@Pc(15) int local15 = 0; local15 < 5; local15++) {
				if (this.anIntArray483[local15] != -1 && !this.aClass97_2.aClass185_38.method4024(0, this.anIntArray483[local15])) {
					local7 = false;
				}
			}
			return local7;
		}
	}
}
