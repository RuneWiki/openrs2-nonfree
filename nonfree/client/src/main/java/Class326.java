import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tt")
public final class Class326 {

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "[I")
	private int[] anIntArray541;

	@OriginalMember(owner = "client!tt", name = "b", descriptor = "Lclient!tq;")
	public Class323 aClass323_2;

	@OriginalMember(owner = "client!tt", name = "c", descriptor = "[S")
	private short[] aShortArray112;

	@OriginalMember(owner = "client!tt", name = "d", descriptor = "[S")
	private short[] aShortArray113;

	@OriginalMember(owner = "client!tt", name = "i", descriptor = "[S")
	private short[] aShortArray114;

	@OriginalMember(owner = "client!tt", name = "o", descriptor = "[S")
	private short[] aShortArray115;

	@OriginalMember(owner = "client!tt", name = "h", descriptor = "[I")
	private final int[] anIntArray542 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(IILclient!ac;)V")
	private void method7165(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub3 arg1) {
		if (arg0 == 1) {
			arg1.method7974();
			return;
		}
		@Pc(32) int local32;
		@Pc(42) int local42;
		if (arg0 == 2) {
			local32 = arg1.method7974();
			this.anIntArray541 = new int[local32];
			for (local42 = 0; local42 < local32; local42++) {
				this.anIntArray541[local42] = arg1.method7945();
			}
		} else if (arg0 != 3) {
			if (arg0 == 40) {
				local32 = arg1.method7974();
				this.aShortArray115 = new short[local32];
				this.aShortArray114 = new short[local32];
				for (local42 = 0; local42 < local32; local42++) {
					this.aShortArray114[local42] = (short) arg1.method7945();
					this.aShortArray115[local42] = (short) arg1.method7945();
				}
			} else if (arg0 == 41) {
				local32 = arg1.method7974();
				this.aShortArray113 = new short[local32];
				this.aShortArray112 = new short[local32];
				for (local42 = 0; local42 < local32; local42++) {
					this.aShortArray112[local42] = (short) arg1.method7945();
					this.aShortArray113[local42] = (short) arg1.method7945();
				}
			} else if (arg0 >= 60 && arg0 < 70) {
				this.anIntArray542[arg0 - 60] = arg1.method7945();
			}
		}
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(B)Lclient!nba;")
	public Class231 method7166() {
		@Pc(13) Class231[] local13 = new Class231[5];
		@Pc(15) int local15 = 0;
		@Pc(19) Class308 local19 = this.aClass323_2.aClass308_176;
		@Pc(23) int local23;
		synchronized (this.aClass323_2.aClass308_176) {
			local23 = 0;
			while (true) {
				if (local23 >= 5) {
					break;
				}
				if (this.anIntArray542[local23] != -1) {
					local13[local15++] = Static317.method7563(this.anIntArray542[local23], this.aClass323_2.aClass308_176);
				}
				local23++;
			}
		}
		for (@Pc(57) int local57 = 0; local57 < 5; local57++) {
			if (local13[local57] != null && local13[local57].anInt6254 < 13) {
				local13[local57].method5067();
			}
		}
		@Pc(85) Class231 local85 = new Class231(local13, local15);
		if (this.aShortArray114 != null) {
			for (local23 = 0; local23 < this.aShortArray114.length; local23++) {
				local85.method5079(this.aShortArray114[local23], this.aShortArray115[local23]);
			}
		}
		if (this.aShortArray112 != null) {
			for (local23 = 0; local23 < this.aShortArray112.length; local23++) {
				local85.method5078(this.aShortArray113[local23], this.aShortArray112[local23]);
			}
		}
		return local85;
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(Lclient!ac;I)V")
	public void method7167(@OriginalArg(0) Class1_Sub3 arg0) {
		while (true) {
			@Pc(12) int local12 = arg0.method7974();
			if (local12 == 0) {
				return;
			}
			this.method7165(local12, arg0);
		}
	}

	@OriginalMember(owner = "client!tt", name = "b", descriptor = "(I)Lclient!nba;")
	public Class231 method7168() {
		if (this.anIntArray541 == null) {
			return null;
		}
		@Pc(23) Class231[] local23 = new Class231[this.anIntArray541.length];
		@Pc(27) Class308 local27 = this.aClass323_2.aClass308_176;
		@Pc(31) int local31;
		synchronized (this.aClass323_2.aClass308_176) {
			local31 = 0;
			while (true) {
				if (this.anIntArray541.length <= local31) {
					break;
				}
				local23[local31] = Static317.method7563(this.anIntArray541[local31], this.aClass323_2.aClass308_176);
				local31++;
			}
		}
		for (@Pc(64) int local64 = 0; local64 < this.anIntArray541.length; local64++) {
			if (local23[local64].anInt6254 < 13) {
				local23[local64].method5067();
			}
		}
		@Pc(97) Class231 local97;
		if (local23.length == 1) {
			local97 = local23[0];
		} else {
			local97 = new Class231(local23, local23.length);
		}
		if (local97 == null) {
			return null;
		}
		if (this.aShortArray114 != null) {
			for (local31 = 0; local31 < this.aShortArray114.length; local31++) {
				local97.method5079(this.aShortArray114[local31], this.aShortArray115[local31]);
			}
		}
		if (this.aShortArray112 != null) {
			for (local31 = 0; local31 < this.aShortArray112.length; local31++) {
				local97.method5078(this.aShortArray113[local31], this.aShortArray112[local31]);
			}
		}
		return local97;
	}

	@OriginalMember(owner = "client!tt", name = "c", descriptor = "(I)Z")
	public boolean method7169() {
		@Pc(7) boolean local7 = true;
		@Pc(11) Class308 local11 = this.aClass323_2.aClass308_176;
		synchronized (this.aClass323_2.aClass308_176) {
			for (@Pc(15) int local15 = 0; local15 < 5; local15++) {
				if (this.anIntArray542[local15] != -1 && !this.aClass323_2.aClass308_176.method6545(0, this.anIntArray542[local15])) {
					local7 = false;
				}
			}
			return local7;
		}
	}

	@OriginalMember(owner = "client!tt", name = "d", descriptor = "(I)Z")
	public boolean method7171() {
		if (this.anIntArray541 == null) {
			return true;
		}
		@Pc(20) boolean local20 = true;
		@Pc(24) Class308 local24 = this.aClass323_2.aClass308_176;
		synchronized (this.aClass323_2.aClass308_176) {
			for (@Pc(28) int local28 = 0; local28 < this.anIntArray541.length; local28++) {
				if (!this.aClass323_2.aClass308_176.method6545(0, this.anIntArray541[local28])) {
					local20 = false;
				}
			}
			return local20;
		}
	}
}
