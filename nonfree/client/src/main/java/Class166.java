import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ke")
public final class Class166 {

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "[S")
	private short[] aShortArray75;

	@OriginalMember(owner = "client!ke", name = "b", descriptor = "[I")
	private int[] anIntArray267;

	@OriginalMember(owner = "client!ke", name = "d", descriptor = "[S")
	private short[] aShortArray76;

	@OriginalMember(owner = "client!ke", name = "e", descriptor = "Lclient!fga;")
	public Class99 aClass99_2;

	@OriginalMember(owner = "client!ke", name = "o", descriptor = "[S")
	private short[] aShortArray77;

	@OriginalMember(owner = "client!ke", name = "p", descriptor = "[S")
	private short[] aShortArray78;

	@OriginalMember(owner = "client!ke", name = "n", descriptor = "[I")
	private final int[] anIntArray268 = new int[] { -1, -1, -1, -1, -1 };

	static {
		new Class122("", 76);
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(I)Lclient!lv;")
	public Class192 method5004() {
		if (this.anIntArray267 == null) {
			return null;
		}
		@Pc(15) Class192[] local15 = new Class192[this.anIntArray267.length];
		@Pc(19) Class223 local19 = this.aClass99_2.aClass223_43;
		@Pc(28) int local28;
		synchronized (this.aClass99_2.aClass223_43) {
			local28 = 0;
			while (true) {
				if (this.anIntArray267.length <= local28) {
					break;
				}
				local15[local28] = Static63.method1779(this.aClass99_2.aClass223_43, this.anIntArray267[local28]);
				local28++;
			}
		}
		for (@Pc(57) int local57 = 0; local57 < this.anIntArray267.length; local57++) {
			if (local15[local57].anInt6632 < 13) {
				local15[local57].method5549();
			}
		}
		@Pc(96) Class192 local96;
		if (local15.length == 1) {
			local96 = local15[0];
		} else {
			local96 = new Class192(local15, local15.length);
		}
		if (local96 == null) {
			return null;
		}
		if (this.aShortArray76 != null) {
			for (local28 = 0; local28 < this.aShortArray76.length; local28++) {
				local96.method5550(this.aShortArray76[local28], this.aShortArray75[local28]);
			}
		}
		if (this.aShortArray78 != null) {
			for (local28 = 0; local28 < this.aShortArray78.length; local28++) {
				local96.method5547(this.aShortArray77[local28], this.aShortArray78[local28]);
			}
		}
		return local96;
	}

	@OriginalMember(owner = "client!ke", name = "b", descriptor = "(I)Z")
	public boolean method5005() {
		@Pc(7) boolean local7 = true;
		@Pc(11) Class223 local11 = this.aClass99_2.aClass223_43;
		synchronized (this.aClass99_2.aClass223_43) {
			for (@Pc(15) int local15 = 0; local15 < 5; local15++) {
				if (this.anIntArray268[local15] != -1 && !this.aClass99_2.aClass223_43.method5960(0, this.anIntArray268[local15])) {
					local7 = false;
				}
			}
			return local7;
		}
	}

	@OriginalMember(owner = "client!ke", name = "c", descriptor = "(I)Z")
	public boolean method5006() {
		if (this.anIntArray267 == null) {
			return true;
		}
		@Pc(12) boolean local12 = true;
		@Pc(16) Class223 local16 = this.aClass99_2.aClass223_43;
		synchronized (this.aClass99_2.aClass223_43) {
			for (@Pc(20) int local20 = 0; local20 < this.anIntArray267.length; local20++) {
				if (!this.aClass99_2.aClass223_43.method5960(0, this.anIntArray267[local20])) {
					local12 = false;
				}
			}
			return local12;
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(B)Lclient!lv;")
	public Class192 method5007() {
		@Pc(8) Class192[] local8 = new Class192[5];
		@Pc(10) int local10 = 0;
		@Pc(14) Class223 local14 = this.aClass99_2.aClass223_43;
		synchronized (this.aClass99_2.aClass223_43) {
			@Pc(18) int local18 = 0;
			while (true) {
				if (local18 >= 5) {
					break;
				}
				if (this.anIntArray268[local18] != -1) {
					local8[local10++] = Static63.method1779(this.aClass99_2.aClass223_43, this.anIntArray268[local18]);
				}
				local18++;
			}
		}
		for (@Pc(55) int local55 = 0; local55 < 5; local55++) {
			if (local8[local55] != null && local8[local55].anInt6632 < 13) {
				local8[local55].method5549();
			}
		}
		@Pc(93) Class192 local93 = new Class192(local8, local10);
		@Pc(98) int local98;
		if (this.aShortArray76 != null) {
			for (local98 = 0; local98 < this.aShortArray76.length; local98++) {
				local93.method5550(this.aShortArray76[local98], this.aShortArray75[local98]);
			}
		}
		if (this.aShortArray78 != null) {
			for (local98 = 0; local98 < this.aShortArray78.length; local98++) {
				local93.method5547(this.aShortArray77[local98], this.aShortArray78[local98]);
			}
		}
		return local93;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(Lclient!ji;IB)V")
	private void method5010(@OriginalArg(0) Class6_Sub8 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			arg0.method8246();
			return;
		}
		@Pc(31) int local31;
		@Pc(41) int local41;
		if (arg1 == 2) {
			local31 = arg0.method8246();
			this.anIntArray267 = new int[local31];
			for (local41 = 0; local41 < local31; local41++) {
				this.anIntArray267[local41] = arg0.method8220();
			}
		} else if (arg1 != 3) {
			if (arg1 == 40) {
				local31 = arg0.method8246();
				this.aShortArray75 = new short[local31];
				this.aShortArray76 = new short[local31];
				for (local41 = 0; local41 < local31; local41++) {
					this.aShortArray76[local41] = (short) arg0.method8220();
					this.aShortArray75[local41] = (short) arg0.method8220();
				}
			} else if (arg1 == 41) {
				local31 = arg0.method8246();
				this.aShortArray77 = new short[local31];
				this.aShortArray78 = new short[local31];
				for (local41 = 0; local41 < local31; local41++) {
					this.aShortArray78[local41] = (short) arg0.method8220();
					this.aShortArray77[local41] = (short) arg0.method8220();
				}
			} else if (arg1 >= 60 && arg1 < 70) {
				this.anIntArray268[arg1 - 60] = arg0.method8220();
			}
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(ZLclient!ji;)V")
	public void method5011(@OriginalArg(1) Class6_Sub8 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method8246();
			if (local9 == 0) {
				return;
			}
			this.method5010(arg0, local9);
		}
	}
}
