import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rba")
public final class Class299 {

	@OriginalMember(owner = "client!rba", name = "e", descriptor = "[S")
	private short[] aShortArray92;

	@OriginalMember(owner = "client!rba", name = "f", descriptor = "[S")
	private short[] aShortArray93;

	@OriginalMember(owner = "client!rba", name = "g", descriptor = "[S")
	private short[] aShortArray94;

	@OriginalMember(owner = "client!rba", name = "h", descriptor = "[I")
	private int[] anIntArray474;

	@OriginalMember(owner = "client!rba", name = "j", descriptor = "[S")
	private short[] aShortArray95;

	@OriginalMember(owner = "client!rba", name = "s", descriptor = "Lclient!eba;")
	public Class94 aClass94_1;

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "[I")
	private final int[] anIntArray473 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "(Lclient!mc;II)V")
	private void method7123(@OriginalArg(0) Class5_Sub41 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			arg0.method7816();
			return;
		}
		@Pc(18) int local18;
		@Pc(24) int local24;
		if (arg1 == 2) {
			local18 = arg0.method7816();
			this.anIntArray474 = new int[local18];
			for (local24 = 0; local24 < local18; local24++) {
				this.anIntArray474[local24] = arg0.method7860();
			}
		} else if (arg1 != 3) {
			if (arg1 == 40) {
				local18 = arg0.method7816();
				this.aShortArray93 = new short[local18];
				this.aShortArray92 = new short[local18];
				for (local24 = 0; local24 < local18; local24++) {
					this.aShortArray93[local24] = (short) arg0.method7860();
					this.aShortArray92[local24] = (short) arg0.method7860();
				}
			} else if (arg1 == 41) {
				local18 = arg0.method7816();
				this.aShortArray94 = new short[local18];
				this.aShortArray95 = new short[local18];
				for (local24 = 0; local24 < local18; local24++) {
					this.aShortArray95[local24] = (short) arg0.method7860();
					this.aShortArray94[local24] = (short) arg0.method7860();
				}
			} else if (arg1 >= 60 && arg1 < 70) {
				this.anIntArray473[arg1 - 60] = arg0.method7860();
			}
		}
	}

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "(B)Z")
	public boolean method7124() {
		@Pc(11) boolean local11 = true;
		@Pc(15) Class390 local15 = this.aClass94_1.aClass390_27;
		synchronized (this.aClass94_1.aClass390_27) {
			for (@Pc(19) int local19 = 0; local19 < 5; local19++) {
				if (this.anIntArray473[local19] != -1 && !this.aClass94_1.aClass390_27.method8902(this.anIntArray473[local19], 0)) {
					local11 = false;
				}
			}
			return local11;
		}
	}

	@OriginalMember(owner = "client!rba", name = "b", descriptor = "(B)Lclient!su;")
	public Class329 method7126() {
		if (this.anIntArray474 == null) {
			return null;
		}
		@Pc(13) Class329[] local13 = new Class329[this.anIntArray474.length];
		@Pc(17) Class390 local17 = this.aClass94_1.aClass390_27;
		@Pc(21) int local21;
		synchronized (this.aClass94_1.aClass390_27) {
			local21 = 0;
			while (true) {
				if (local21 >= this.anIntArray474.length) {
					break;
				}
				local13[local21] = Static347.method5290(this.anIntArray474[local21], this.aClass94_1.aClass390_27);
				local21++;
			}
		}
		for (@Pc(53) int local53 = 0; local53 < this.anIntArray474.length; local53++) {
			if (local13[local53].anInt9048 < 13) {
				local13[local53].method7672();
			}
		}
		@Pc(89) Class329 local89;
		if (local13.length == 1) {
			local89 = local13[0];
		} else {
			local89 = new Class329(local13, local13.length);
		}
		if (local89 == null) {
			return null;
		}
		if (this.aShortArray93 != null) {
			for (local21 = 0; local21 < this.aShortArray93.length; local21++) {
				local89.method7670(this.aShortArray93[local21], this.aShortArray92[local21]);
			}
		}
		if (this.aShortArray95 != null) {
			for (local21 = 0; local21 < this.aShortArray95.length; local21++) {
				local89.method7682(this.aShortArray95[local21], this.aShortArray94[local21]);
			}
		}
		return local89;
	}

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "(Lclient!mc;I)V")
	public void method7127(@OriginalArg(0) Class5_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method7816();
			if (local3 == 0) {
				return;
			}
			this.method7123(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "(Z)Lclient!su;")
	public Class329 method7129() {
		@Pc(13) Class329[] local13 = new Class329[5];
		@Pc(15) int local15 = 0;
		@Pc(19) Class390 local19 = this.aClass94_1.aClass390_27;
		@Pc(23) int local23;
		synchronized (this.aClass94_1.aClass390_27) {
			local23 = 0;
			while (true) {
				if (local23 >= 5) {
					break;
				}
				if (this.anIntArray473[local23] != -1) {
					local13[local15++] = Static347.method5290(this.anIntArray473[local23], this.aClass94_1.aClass390_27);
				}
				local23++;
			}
		}
		for (@Pc(57) int local57 = 0; local57 < 5; local57++) {
			if (local13[local57] != null && local13[local57].anInt9048 < 13) {
				local13[local57].method7672();
			}
		}
		@Pc(85) Class329 local85 = new Class329(local13, local15);
		if (this.aShortArray93 != null) {
			for (local23 = 0; local23 < this.aShortArray93.length; local23++) {
				local85.method7670(this.aShortArray93[local23], this.aShortArray92[local23]);
			}
		}
		if (this.aShortArray95 != null) {
			for (local23 = 0; local23 < this.aShortArray95.length; local23++) {
				local85.method7682(this.aShortArray95[local23], this.aShortArray94[local23]);
			}
		}
		return local85;
	}

	@OriginalMember(owner = "client!rba", name = "b", descriptor = "(I)Z")
	public boolean method7130() {
		if (this.anIntArray474 == null) {
			return true;
		}
		@Pc(10) boolean local10 = true;
		@Pc(14) Class390 local14 = this.aClass94_1.aClass390_27;
		synchronized (this.aClass94_1.aClass390_27) {
			for (@Pc(18) int local18 = 0; local18 < this.anIntArray474.length; local18++) {
				if (!this.aClass94_1.aClass390_27.method8902(this.anIntArray474[local18], 0)) {
					local10 = false;
				}
			}
			return local10;
		}
	}
}
