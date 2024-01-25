import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bda")
public final class Class28 {

	@OriginalMember(owner = "client!bda", name = "b", descriptor = "[S")
	private short[] aShortArray28;

	@OriginalMember(owner = "client!bda", name = "e", descriptor = "Lclient!ep;")
	public Class96 aClass96_1;

	@OriginalMember(owner = "client!bda", name = "f", descriptor = "[S")
	private short[] aShortArray29;

	@OriginalMember(owner = "client!bda", name = "h", descriptor = "[S")
	private short[] aShortArray30;

	@OriginalMember(owner = "client!bda", name = "i", descriptor = "[S")
	private short[] aShortArray31;

	@OriginalMember(owner = "client!bda", name = "l", descriptor = "[I")
	private int[] anIntArray47;

	@OriginalMember(owner = "client!bda", name = "n", descriptor = "[I")
	private final int[] anIntArray48 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(Z)Lclient!ida;")
	public Class159 method811() {
		@Pc(8) Class159[] local8 = new Class159[5];
		@Pc(15) int local15 = 0;
		@Pc(19) Class124 local19 = this.aClass96_1.aClass124_37;
		@Pc(23) int local23;
		synchronized (this.aClass96_1.aClass124_37) {
			local23 = 0;
			while (true) {
				if (local23 >= 5) {
					break;
				}
				if (this.anIntArray48[local23] != -1) {
					local8[local15++] = Static452.method7285(this.aClass96_1.aClass124_37, this.anIntArray48[local23]);
				}
				local23++;
			}
		}
		for (@Pc(60) int local60 = 0; local60 < 5; local60++) {
			if (local8[local60] != null && local8[local60].anInt4809 < 13) {
				local8[local60].method4358();
			}
		}
		@Pc(90) Class159 local90 = new Class159(local8, local15);
		if (this.aShortArray30 != null) {
			for (local23 = 0; local23 < this.aShortArray30.length; local23++) {
				local90.method4364(this.aShortArray30[local23], this.aShortArray29[local23]);
			}
		}
		if (this.aShortArray31 != null) {
			for (local23 = 0; local23 < this.aShortArray31.length; local23++) {
				local90.method4360(this.aShortArray28[local23], this.aShortArray31[local23]);
			}
		}
		return local90;
	}

	@OriginalMember(owner = "client!bda", name = "b", descriptor = "(Z)Z")
	public boolean method812() {
		@Pc(7) boolean local7 = true;
		@Pc(11) Class124 local11 = this.aClass96_1.aClass124_37;
		synchronized (this.aClass96_1.aClass124_37) {
			for (@Pc(15) int local15 = 0; local15 < 5; local15++) {
				if (this.anIntArray48[local15] != -1 && !this.aClass96_1.aClass124_37.method3609(this.anIntArray48[local15], 0)) {
					local7 = false;
				}
			}
			return local7;
		}
	}

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(ILclient!ol;I)V")
	private void method814(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub8 arg1) {
		if (arg0 == 1) {
			arg1.method5203();
			return;
		}
		@Pc(37) int local37;
		@Pc(47) int local47;
		if (arg0 == 2) {
			local37 = arg1.method5203();
			this.anIntArray47 = new int[local37];
			for (local47 = 0; local47 < local37; local47++) {
				this.anIntArray47[local47] = arg1.method5211();
			}
		} else if (arg0 != 3) {
			if (arg0 == 40) {
				local37 = arg1.method5203();
				this.aShortArray30 = new short[local37];
				this.aShortArray29 = new short[local37];
				for (local47 = 0; local47 < local37; local47++) {
					this.aShortArray30[local47] = (short) arg1.method5211();
					this.aShortArray29[local47] = (short) arg1.method5211();
				}
				return;
			}
			if (arg0 == 41) {
				local37 = arg1.method5203();
				this.aShortArray31 = new short[local37];
				this.aShortArray28 = new short[local37];
				for (local47 = 0; local47 < local37; local47++) {
					this.aShortArray31[local47] = (short) arg1.method5211();
					this.aShortArray28[local47] = (short) arg1.method5211();
				}
			} else if (arg0 >= 60 && arg0 < 70) {
				this.anIntArray48[arg0 - 60] = arg1.method5211();
				return;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!bda", name = "b", descriptor = "(I)Lclient!ida;")
	public Class159 method815() {
		if (this.anIntArray47 == null) {
			return null;
		}
		@Pc(15) Class159[] local15 = new Class159[this.anIntArray47.length];
		@Pc(19) Class124 local19 = this.aClass96_1.aClass124_37;
		@Pc(23) int local23;
		synchronized (this.aClass96_1.aClass124_37) {
			local23 = 0;
			while (true) {
				if (this.anIntArray47.length <= local23) {
					break;
				}
				local15[local23] = Static452.method7285(this.aClass96_1.aClass124_37, this.anIntArray47[local23]);
				local23++;
			}
		}
		for (@Pc(57) int local57 = 0; local57 < this.anIntArray47.length; local57++) {
			if (local15[local57].anInt4809 < 13) {
				local15[local57].method4358();
			}
		}
		@Pc(89) Class159 local89;
		if (local15.length == 1) {
			local89 = local15[0];
		} else {
			local89 = new Class159(local15, local15.length);
		}
		if (local89 == null) {
			return null;
		}
		if (this.aShortArray30 != null) {
			for (local23 = 0; local23 < this.aShortArray30.length; local23++) {
				local89.method4364(this.aShortArray30[local23], this.aShortArray29[local23]);
			}
		}
		if (this.aShortArray31 != null) {
			for (local23 = 0; local23 < this.aShortArray31.length; local23++) {
				local89.method4360(this.aShortArray28[local23], this.aShortArray31[local23]);
			}
		}
		return local89;
	}

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(Lclient!ol;I)V")
	public void method816(@OriginalArg(0) Class2_Sub8 arg0) {
		while (true) {
			@Pc(8) int local8 = arg0.method5203();
			if (local8 == 0) {
				return;
			}
			this.method814(local8, arg0);
		}
	}

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(B)Z")
	public boolean method817() {
		if (this.anIntArray47 == null) {
			return true;
		}
		@Pc(19) boolean local19 = true;
		@Pc(23) Class124 local23 = this.aClass96_1.aClass124_37;
		synchronized (this.aClass96_1.aClass124_37) {
			for (@Pc(27) int local27 = 0; local27 < this.anIntArray47.length; local27++) {
				if (!this.aClass96_1.aClass124_37.method3609(this.anIntArray47[local27], 0)) {
					local19 = false;
				}
			}
			return local19;
		}
	}
}
