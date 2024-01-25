import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sl")
public final class Class217 {

	@OriginalMember(owner = "client!sl", name = "c", descriptor = "[I")
	private int[] anIntArray1059;

	@OriginalMember(owner = "client!sl", name = "e", descriptor = "[S")
	private short[] aShortArray99;

	@OriginalMember(owner = "client!sl", name = "g", descriptor = "[S")
	private short[] aShortArray100;

	@OriginalMember(owner = "client!sl", name = "i", descriptor = "Lclient!pt;")
	public Class196 aClass196_2;

	@OriginalMember(owner = "client!sl", name = "m", descriptor = "[S")
	private short[] aShortArray101;

	@OriginalMember(owner = "client!sl", name = "p", descriptor = "[S")
	private short[] aShortArray102;

	@OriginalMember(owner = "client!sl", name = "o", descriptor = "[I")
	private final int[] anIntArray1061 = new int[] { -1, -1, -1, -1, -1 };

	static {
		new Class32("Invalid teleport!", "Unzulässiger Teleport!", "Téléportation non valide !", "Teleporte inválido!");
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(IBLclient!kk;)V")
	private void method4647(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub16 arg1) {
		if (arg0 == 1) {
			arg1.method5350();
			return;
		}
		@Pc(33) int local33;
		@Pc(43) int local43;
		if (arg0 == 2) {
			local33 = arg1.method5350();
			this.anIntArray1059 = new int[local33];
			for (local43 = 0; local43 < local33; local43++) {
				this.anIntArray1059[local43] = arg1.method5312();
			}
		} else if (arg0 != 3) {
			if (arg0 == 40) {
				local33 = arg1.method5350();
				this.aShortArray100 = new short[local33];
				this.aShortArray102 = new short[local33];
				for (local43 = 0; local43 < local33; local43++) {
					this.aShortArray102[local43] = (short) arg1.method5312();
					this.aShortArray100[local43] = (short) arg1.method5312();
				}
			} else if (arg0 == 41) {
				local33 = arg1.method5350();
				this.aShortArray101 = new short[local33];
				this.aShortArray99 = new short[local33];
				for (local43 = 0; local43 < local33; local43++) {
					this.aShortArray101[local43] = (short) arg1.method5312();
					this.aShortArray99[local43] = (short) arg1.method5312();
				}
			} else if (arg0 >= 60 && arg0 < 70) {
				this.anIntArray1061[arg0 - 60] = arg1.method5312();
			}
		}
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(I)Z")
	public boolean method4648() {
		if (this.anIntArray1059 == null) {
			return true;
		}
		@Pc(17) boolean local17 = true;
		@Pc(21) Class171 local21 = this.aClass196_2.aClass171_73;
		synchronized (this.aClass196_2.aClass171_73) {
			for (@Pc(25) int local25 = 0; local25 < this.anIntArray1059.length; local25++) {
				if (!this.aClass196_2.aClass171_73.method3761(0, this.anIntArray1059[local25])) {
					local17 = false;
				}
			}
			return local17;
		}
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(B)Lclient!qi;")
	public Class200 method4649() {
		@Pc(15) Class200[] local15 = new Class200[5];
		@Pc(17) int local17 = 0;
		@Pc(21) Class171 local21 = this.aClass196_2.aClass171_73;
		synchronized (this.aClass196_2.aClass171_73) {
			for (@Pc(25) int local25 = 0; local25 < 5; local25++) {
				if (this.anIntArray1061[local25] != -1) {
					local15[local17++] = Static331.method4882(this.aClass196_2.aClass171_73, this.anIntArray1061[local25]);
				}
			}
		}
		@Pc(66) Class200 local66 = new Class200(local15, local17);
		@Pc(71) int local71;
		if (this.aShortArray102 != null) {
			for (local71 = 0; local71 < this.aShortArray102.length; local71++) {
				local66.method4266(this.aShortArray100[local71], this.aShortArray102[local71]);
			}
		}
		if (this.aShortArray101 != null) {
			for (local71 = 0; local71 < this.aShortArray101.length; local71++) {
				local66.method4260(this.aShortArray101[local71], this.aShortArray99[local71]);
			}
		}
		return local66;
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(Lclient!kk;B)V")
	public void method4650(@OriginalArg(0) Class2_Sub16 arg0) {
		while (true) {
			@Pc(10) int local10 = arg0.method5350();
			if (local10 == 0) {
				return;
			}
			this.method4647(local10, arg0);
		}
	}

	@OriginalMember(owner = "client!sl", name = "b", descriptor = "(B)Z")
	public boolean method4651() {
		@Pc(7) boolean local7 = true;
		@Pc(11) Class171 local11 = this.aClass196_2.aClass171_73;
		synchronized (this.aClass196_2.aClass171_73) {
			for (@Pc(23) int local23 = 0; local23 < 5; local23++) {
				if (this.anIntArray1061[local23] != -1 && !this.aClass196_2.aClass171_73.method3761(0, this.anIntArray1061[local23])) {
					local7 = false;
				}
			}
			return local7;
		}
	}

	@OriginalMember(owner = "client!sl", name = "b", descriptor = "(I)Lclient!qi;")
	public Class200 method4652() {
		if (this.anIntArray1059 == null) {
			return null;
		}
		@Pc(20) Class200[] local20 = new Class200[this.anIntArray1059.length];
		@Pc(24) Class171 local24 = this.aClass196_2.aClass171_73;
		synchronized (this.aClass196_2.aClass171_73) {
			@Pc(28) int local28 = 0;
			while (true) {
				if (local28 >= this.anIntArray1059.length) {
					break;
				}
				local20[local28] = Static331.method4882(this.aClass196_2.aClass171_73, this.anIntArray1059[local28]);
				local28++;
			}
		}
		@Pc(70) Class200 local70;
		if (local20.length == 1) {
			local70 = local20[0];
		} else {
			local70 = new Class200(local20, local20.length);
		}
		if (local70 == null) {
			return null;
		}
		@Pc(84) int local84;
		if (this.aShortArray102 != null) {
			for (local84 = 0; local84 < this.aShortArray102.length; local84++) {
				local70.method4266(this.aShortArray100[local84], this.aShortArray102[local84]);
			}
		}
		if (this.aShortArray101 != null) {
			for (local84 = 0; local84 < this.aShortArray101.length; local84++) {
				local70.method4260(this.aShortArray101[local84], this.aShortArray99[local84]);
			}
		}
		return local70;
	}
}
