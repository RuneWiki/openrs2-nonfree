import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mm")
public final class Class166 {

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "[S")
	private short[] aShortArray65;

	@OriginalMember(owner = "client!mm", name = "b", descriptor = "Lclient!gv;")
	public Class100 aClass100_2;

	@OriginalMember(owner = "client!mm", name = "e", descriptor = "[S")
	private short[] aShortArray66;

	@OriginalMember(owner = "client!mm", name = "h", descriptor = "[S")
	private short[] aShortArray67;

	@OriginalMember(owner = "client!mm", name = "i", descriptor = "[I")
	private int[] anIntArray457;

	@OriginalMember(owner = "client!mm", name = "o", descriptor = "[S")
	private short[] aShortArray68;

	@OriginalMember(owner = "client!mm", name = "j", descriptor = "[I")
	private final int[] anIntArray458 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(Z)Lclient!pn;")
	public Class192 method3690() {
		@Pc(8) Class192[] local8 = new Class192[5];
		@Pc(10) int local10 = 0;
		@Pc(14) Class187 local14 = this.aClass100_2.aClass187_58;
		@Pc(18) int local18;
		synchronized (this.aClass100_2.aClass187_58) {
			local18 = 0;
			while (true) {
				if (local18 >= 5) {
					break;
				}
				if (this.anIntArray458[local18] != -1) {
					local8[local10++] = Static378.method5099(this.aClass100_2.aClass187_58, this.anIntArray458[local18]);
				}
				local18++;
			}
		}
		for (@Pc(59) int local59 = 0; local59 < 5; local59++) {
			if (local8[local59] != null && local8[local59].anInt5443 < 13) {
				local8[local59].method4347();
			}
		}
		@Pc(89) Class192 local89 = new Class192(local8, local10);
		if (this.aShortArray68 != null) {
			for (local18 = 0; local18 < this.aShortArray68.length; local18++) {
				local89.method4345(this.aShortArray68[local18], this.aShortArray66[local18]);
			}
		}
		if (this.aShortArray67 != null) {
			for (local18 = 0; local18 < this.aShortArray67.length; local18++) {
				local89.method4348(this.aShortArray67[local18], this.aShortArray65[local18]);
			}
		}
		return local89;
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(I)Lclient!pn;")
	public Class192 method3692() {
		if (this.anIntArray457 == null) {
			return null;
		}
		@Pc(15) Class192[] local15 = new Class192[this.anIntArray457.length];
		@Pc(19) Class187 local19 = this.aClass100_2.aClass187_58;
		@Pc(23) int local23;
		synchronized (this.aClass100_2.aClass187_58) {
			local23 = 0;
			while (true) {
				if (local23 >= this.anIntArray457.length) {
					break;
				}
				local15[local23] = Static378.method5099(this.aClass100_2.aClass187_58, this.anIntArray457[local23]);
				local23++;
			}
		}
		for (@Pc(58) int local58 = 0; local58 < this.anIntArray457.length; local58++) {
			if (local15[local58].anInt5443 < 13) {
				local15[local58].method4347();
			}
		}
		@Pc(94) Class192 local94;
		if (local15.length == 1) {
			local94 = local15[0];
		} else {
			local94 = new Class192(local15, local15.length);
		}
		if (local94 == null) {
			return null;
		}
		if (this.aShortArray68 != null) {
			for (local23 = 0; local23 < this.aShortArray68.length; local23++) {
				local94.method4345(this.aShortArray68[local23], this.aShortArray66[local23]);
			}
		}
		if (this.aShortArray67 != null) {
			for (local23 = 0; local23 < this.aShortArray67.length; local23++) {
				local94.method4348(this.aShortArray67[local23], this.aShortArray65[local23]);
			}
		}
		return local94;
	}

	@OriginalMember(owner = "client!mm", name = "b", descriptor = "(I)Z")
	public boolean method3693() {
		@Pc(14) boolean local14 = true;
		@Pc(18) Class187 local18 = this.aClass100_2.aClass187_58;
		synchronized (this.aClass100_2.aClass187_58) {
			for (@Pc(22) int local22 = 0; local22 < 5; local22++) {
				if (this.anIntArray458[local22] != -1 && !this.aClass100_2.aClass187_58.method4284(0, this.anIntArray458[local22])) {
					local14 = false;
				}
			}
			return local14;
		}
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(IBLclient!nn;)V")
	private void method3695(@OriginalArg(0) int arg0, @OriginalArg(2) Class10_Sub8 arg1) {
		if (arg0 == 1) {
			arg1.method2502();
			return;
		}
		@Pc(34) int local34;
		@Pc(44) int local44;
		if (arg0 == 2) {
			local34 = arg1.method2502();
			this.anIntArray457 = new int[local34];
			for (local44 = 0; local44 < local34; local44++) {
				this.anIntArray457[local44] = arg1.method2485();
			}
		} else if (arg0 != 3) {
			if (arg0 == 40) {
				local34 = arg1.method2502();
				this.aShortArray68 = new short[local34];
				this.aShortArray66 = new short[local34];
				for (local44 = 0; local44 < local34; local44++) {
					this.aShortArray68[local44] = (short) arg1.method2485();
					this.aShortArray66[local44] = (short) arg1.method2485();
				}
				return;
			}
			if (arg0 == 41) {
				local34 = arg1.method2502();
				this.aShortArray67 = new short[local34];
				this.aShortArray65 = new short[local34];
				for (local44 = 0; local44 < local34; local44++) {
					this.aShortArray67[local44] = (short) arg1.method2485();
					this.aShortArray65[local44] = (short) arg1.method2485();
				}
			} else if (arg0 >= 60 && arg0 < 70) {
				this.anIntArray458[arg0 - 60] = arg1.method2485();
				return;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!mm", name = "c", descriptor = "(I)Z")
	public boolean method3696() {
		if (this.anIntArray457 == null) {
			return true;
		}
		@Pc(12) boolean local12 = true;
		@Pc(16) Class187 local16 = this.aClass100_2.aClass187_58;
		synchronized (this.aClass100_2.aClass187_58) {
			for (@Pc(20) int local20 = 0; local20 < this.anIntArray457.length; local20++) {
				if (!this.aClass100_2.aClass187_58.method4284(0, this.anIntArray457[local20])) {
					local12 = false;
				}
			}
			return local12;
		}
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(Lclient!nn;I)V")
	public void method3697(@OriginalArg(0) Class10_Sub8 arg0) {
		while (true) {
			@Pc(19) int local19 = arg0.method2502();
			if (local19 == 0) {
				return;
			}
			this.method3695(local19, arg0);
		}
	}
}
