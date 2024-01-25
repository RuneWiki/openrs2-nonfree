import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!md")
public final class Class218 {

	@OriginalMember(owner = "client!md", name = "d", descriptor = "[S")
	private short[] aShortArray105;

	@OriginalMember(owner = "client!md", name = "g", descriptor = "[S")
	private short[] aShortArray106;

	@OriginalMember(owner = "client!md", name = "h", descriptor = "[S")
	private short[] aShortArray107;

	@OriginalMember(owner = "client!md", name = "i", descriptor = "[I")
	private int[] anIntArray471;

	@OriginalMember(owner = "client!md", name = "l", descriptor = "Lclient!naa;")
	public Class237 aClass237_1;

	@OriginalMember(owner = "client!md", name = "m", descriptor = "[S")
	private short[] aShortArray108;

	@OriginalMember(owner = "client!md", name = "k", descriptor = "[I")
	private final int[] anIntArray472 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(BILclient!eh;)V")
	private void method4883(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub9 arg1) {
		if (arg0 == 1) {
			arg1.method6015();
			return;
		}
		@Pc(21) int local21;
		@Pc(27) int local27;
		if (arg0 == 2) {
			local21 = arg1.method6015();
			this.anIntArray471 = new int[local21];
			for (local27 = 0; local27 < local21; local27++) {
				this.anIntArray471[local27] = arg1.method5982();
			}
		} else if (arg0 != 3) {
			if (arg0 == 40) {
				local21 = arg1.method6015();
				this.aShortArray105 = new short[local21];
				this.aShortArray107 = new short[local21];
				for (local27 = 0; local27 < local21; local27++) {
					this.aShortArray105[local27] = (short) arg1.method5982();
					this.aShortArray107[local27] = (short) arg1.method5982();
				}
			} else if (arg0 == 41) {
				local21 = arg1.method6015();
				this.aShortArray106 = new short[local21];
				this.aShortArray108 = new short[local21];
				for (local27 = 0; local27 < local21; local27++) {
					this.aShortArray108[local27] = (short) arg1.method5982();
					this.aShortArray106[local27] = (short) arg1.method5982();
				}
			} else if (arg0 >= 60 && arg0 < 70) {
				this.anIntArray472[arg0 - 60] = arg1.method5982();
			}
		}
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(ILclient!eh;)V")
	public void method4884(@OriginalArg(1) Class4_Sub9 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method6015();
			if (local5 == 0) {
				return;
			}
			this.method4883(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(B)Z")
	public boolean method4885() {
		if (this.anIntArray471 == null) {
			return true;
		}
		@Pc(12) boolean local12 = true;
		@Pc(22) Class31 local22 = this.aClass237_1.aClass31_73;
		synchronized (this.aClass237_1.aClass31_73) {
			for (@Pc(26) int local26 = 0; local26 < this.anIntArray471.length; local26++) {
				if (!this.aClass237_1.aClass31_73.method668(0, this.anIntArray471[local26])) {
					local12 = false;
				}
			}
			return local12;
		}
	}

	@OriginalMember(owner = "client!md", name = "b", descriptor = "(B)Lclient!pf;")
	public Class266 method4886() {
		@Pc(17) Class266[] local17 = new Class266[5];
		@Pc(19) int local19 = 0;
		@Pc(23) Class31 local23 = this.aClass237_1.aClass31_73;
		@Pc(27) int local27;
		synchronized (this.aClass237_1.aClass31_73) {
			local27 = 0;
			while (true) {
				if (local27 >= 5) {
					break;
				}
				if (this.anIntArray472[local27] != -1) {
					local17[local19++] = Static329.method4945(this.aClass237_1.aClass31_73, this.anIntArray472[local27]);
				}
				local27++;
			}
		}
		for (@Pc(61) int local61 = 0; local61 < 5; local61++) {
			if (local17[local61] != null && local17[local61].anInt7035 < 13) {
				local17[local61].method5852();
			}
		}
		@Pc(89) Class266 local89 = new Class266(local17, local19);
		if (this.aShortArray105 != null) {
			for (local27 = 0; local27 < this.aShortArray105.length; local27++) {
				local89.method5845(this.aShortArray105[local27], this.aShortArray107[local27]);
			}
		}
		if (this.aShortArray108 != null) {
			for (local27 = 0; local27 < this.aShortArray108.length; local27++) {
				local89.method5853(this.aShortArray106[local27], this.aShortArray108[local27]);
			}
		}
		return local89;
	}

	@OriginalMember(owner = "client!md", name = "c", descriptor = "(B)Z")
	public boolean method4887() {
		@Pc(12) boolean local12 = true;
		@Pc(16) Class31 local16 = this.aClass237_1.aClass31_73;
		synchronized (this.aClass237_1.aClass31_73) {
			for (@Pc(20) int local20 = 0; local20 < 5; local20++) {
				if (this.anIntArray472[local20] != -1 && !this.aClass237_1.aClass31_73.method668(0, this.anIntArray472[local20])) {
					local12 = false;
				}
			}
			return local12;
		}
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(I)Lclient!pf;")
	public Class266 method4888() {
		if (this.anIntArray471 == null) {
			return null;
		}
		@Pc(20) Class266[] local20 = new Class266[this.anIntArray471.length];
		@Pc(24) Class31 local24 = this.aClass237_1.aClass31_73;
		@Pc(28) int local28;
		synchronized (this.aClass237_1.aClass31_73) {
			local28 = 0;
			while (true) {
				if (local28 >= this.anIntArray471.length) {
					break;
				}
				local20[local28] = Static329.method4945(this.aClass237_1.aClass31_73, this.anIntArray471[local28]);
				local28++;
			}
		}
		for (@Pc(59) int local59 = 0; local59 < this.anIntArray471.length; local59++) {
			if (local20[local59].anInt7035 < 13) {
				local20[local59].method5852();
			}
		}
		@Pc(93) Class266 local93;
		if (local20.length == 1) {
			local93 = local20[0];
		} else {
			local93 = new Class266(local20, local20.length);
		}
		if (local93 == null) {
			return null;
		}
		if (this.aShortArray105 != null) {
			for (local28 = 0; local28 < this.aShortArray105.length; local28++) {
				local93.method5845(this.aShortArray105[local28], this.aShortArray107[local28]);
			}
		}
		if (this.aShortArray108 != null) {
			for (local28 = 0; local28 < this.aShortArray108.length; local28++) {
				local93.method5853(this.aShortArray106[local28], this.aShortArray108[local28]);
			}
		}
		return local93;
	}
}
