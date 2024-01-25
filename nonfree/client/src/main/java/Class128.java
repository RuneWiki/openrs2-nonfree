import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jo")
public final class Class128 {

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "[I")
	private int[] anIntArray188;

	@OriginalMember(owner = "client!jo", name = "f", descriptor = "[S")
	private short[] aShortArray54;

	@OriginalMember(owner = "client!jo", name = "h", descriptor = "[S")
	private short[] aShortArray55;

	@OriginalMember(owner = "client!jo", name = "k", descriptor = "[S")
	private short[] aShortArray56;

	@OriginalMember(owner = "client!jo", name = "m", descriptor = "[S")
	private short[] aShortArray57;

	@OriginalMember(owner = "client!jo", name = "n", descriptor = "Lclient!iv;")
	public Class120 aClass120_1;

	@OriginalMember(owner = "client!jo", name = "o", descriptor = "[I")
	private final int[] anIntArray189 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(B)Lclient!fe;")
	public Class74 method2690() {
		if (this.anIntArray188 == null) {
			return null;
		}
		@Pc(15) Class74[] local15 = new Class74[this.anIntArray188.length];
		@Pc(19) Class243 local19 = this.aClass120_1.aClass243_106;
		@Pc(23) int local23;
		synchronized (this.aClass120_1.aClass243_106) {
			local23 = 0;
			while (true) {
				if (this.anIntArray188.length <= local23) {
					break;
				}
				local15[local23] = Static285.method3518(this.anIntArray188[local23], this.aClass120_1.aClass243_106);
				local23++;
			}
		}
		for (@Pc(52) int local52 = 0; local52 < this.anIntArray188.length; local52++) {
			if (local15[local52].anInt1960 < 13) {
				local15[local52].method1596();
			}
		}
		@Pc(90) Class74 local90;
		if (local15.length == 1) {
			local90 = local15[0];
		} else {
			local90 = new Class74(local15, local15.length);
		}
		if (local90 == null) {
			return null;
		}
		if (this.aShortArray57 != null) {
			for (local23 = 0; local23 < this.aShortArray57.length; local23++) {
				local90.method1594(this.aShortArray54[local23], this.aShortArray57[local23]);
			}
		}
		if (this.aShortArray55 != null) {
			for (local23 = 0; local23 < this.aShortArray55.length; local23++) {
				local90.method1590(this.aShortArray55[local23], this.aShortArray56[local23]);
			}
		}
		return local90;
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(Lclient!fh;I)V")
	public void method2691(@OriginalArg(0) Class5_Sub15 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method5539();
			if (local5 == 0) {
				return;
			}
			this.method2694(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(I)Z")
	public boolean method2692() {
		if (this.anIntArray188 == null) {
			return true;
		}
		@Pc(20) boolean local20 = true;
		@Pc(24) Class243 local24 = this.aClass120_1.aClass243_106;
		synchronized (this.aClass120_1.aClass243_106) {
			for (@Pc(28) int local28 = 0; local28 < this.anIntArray188.length; local28++) {
				if (!this.aClass120_1.aClass243_106.method5482(this.anIntArray188[local28], 0)) {
					local20 = false;
				}
			}
			return local20;
		}
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(IBLclient!fh;)V")
	private void method2694(@OriginalArg(0) int arg0, @OriginalArg(2) Class5_Sub15 arg1) {
		if (arg0 == 1) {
			arg1.method5539();
			return;
		}
		@Pc(20) int local20;
		@Pc(26) int local26;
		if (arg0 == 2) {
			local20 = arg1.method5539();
			this.anIntArray188 = new int[local20];
			for (local26 = 0; local26 < local20; local26++) {
				this.anIntArray188[local26] = arg1.method5598();
			}
		} else if (arg0 != 3) {
			if (arg0 == 40) {
				local20 = arg1.method5539();
				this.aShortArray54 = new short[local20];
				this.aShortArray57 = new short[local20];
				for (local26 = 0; local26 < local20; local26++) {
					this.aShortArray57[local26] = (short) arg1.method5598();
					this.aShortArray54[local26] = (short) arg1.method5598();
				}
			} else if (arg0 == 41) {
				local20 = arg1.method5539();
				this.aShortArray55 = new short[local20];
				this.aShortArray56 = new short[local20];
				for (local26 = 0; local26 < local20; local26++) {
					this.aShortArray55[local26] = (short) arg1.method5598();
					this.aShortArray56[local26] = (short) arg1.method5598();
				}
			} else if (arg0 >= 60 && arg0 < 70) {
				this.anIntArray189[arg0 - 60] = arg1.method5598();
			}
		}
	}

	@OriginalMember(owner = "client!jo", name = "b", descriptor = "(B)Lclient!fe;")
	public Class74 method2696() {
		@Pc(8) Class74[] local8 = new Class74[5];
		@Pc(10) int local10 = 0;
		@Pc(14) Class243 local14 = this.aClass120_1.aClass243_106;
		@Pc(18) int local18;
		synchronized (this.aClass120_1.aClass243_106) {
			local18 = 0;
			while (true) {
				if (local18 >= 5) {
					break;
				}
				if (this.anIntArray189[local18] != -1) {
					local8[local10++] = Static285.method3518(this.anIntArray189[local18], this.aClass120_1.aClass243_106);
				}
				local18++;
			}
		}
		for (@Pc(60) int local60 = 0; local60 < 5; local60++) {
			if (local8[local60] != null && local8[local60].anInt1960 < 13) {
				local8[local60].method1596();
			}
		}
		@Pc(90) Class74 local90 = new Class74(local8, local10);
		if (this.aShortArray57 != null) {
			for (local18 = 0; local18 < this.aShortArray57.length; local18++) {
				local90.method1594(this.aShortArray54[local18], this.aShortArray57[local18]);
			}
		}
		if (this.aShortArray55 != null) {
			for (local18 = 0; local18 < this.aShortArray55.length; local18++) {
				local90.method1590(this.aShortArray55[local18], this.aShortArray56[local18]);
			}
		}
		return local90;
	}

	@OriginalMember(owner = "client!jo", name = "c", descriptor = "(I)Z")
	public boolean method2697() {
		@Pc(7) boolean local7 = true;
		@Pc(11) Class243 local11 = this.aClass120_1.aClass243_106;
		synchronized (this.aClass120_1.aClass243_106) {
			for (@Pc(15) int local15 = 0; local15 < 5; local15++) {
				if (this.anIntArray189[local15] != -1 && !this.aClass120_1.aClass243_106.method5482(this.anIntArray189[local15], 0)) {
					local7 = false;
				}
			}
			return local7;
		}
	}
}
