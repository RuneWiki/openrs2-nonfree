import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dn")
public final class Class81 {

	@OriginalMember(owner = "client!dn", name = "b", descriptor = "Lclient!cn;")
	public Class57 aClass57_2;

	@OriginalMember(owner = "client!dn", name = "d", descriptor = "[S")
	private short[] aShortArray19;

	@OriginalMember(owner = "client!dn", name = "g", descriptor = "[S")
	private short[] aShortArray20;

	@OriginalMember(owner = "client!dn", name = "h", descriptor = "[S")
	private short[] aShortArray21;

	@OriginalMember(owner = "client!dn", name = "k", descriptor = "[I")
	private int[] anIntArray106;

	@OriginalMember(owner = "client!dn", name = "l", descriptor = "[S")
	private short[] aShortArray22;

	@OriginalMember(owner = "client!dn", name = "f", descriptor = "[I")
	private final int[] anIntArray105 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(I)Lclient!eg;")
	public Class93 method1486() {
		if (this.anIntArray106 == null) {
			return null;
		}
		@Pc(15) Class93[] local15 = new Class93[this.anIntArray106.length];
		@Pc(19) Class259 local19 = this.aClass57_2.aClass259_30;
		synchronized (this.aClass57_2.aClass259_30) {
			@Pc(23) int local23 = 0;
			while (true) {
				if (local23 >= this.anIntArray106.length) {
					break;
				}
				local15[local23] = Static117.method1747(this.anIntArray106[local23], this.aClass57_2.aClass259_30);
				local23++;
			}
		}
		for (@Pc(60) int local60 = 0; local60 < this.anIntArray106.length; local60++) {
			if (local15[local60].anInt2361 < 13) {
				local15[local60].method1763();
			}
		}
		@Pc(94) Class93 local94;
		if (local15.length == 1) {
			local94 = local15[0];
		} else {
			local94 = new Class93(local15, local15.length);
		}
		if (local94 == null) {
			return null;
		}
		@Pc(111) int local111;
		if (this.aShortArray19 != null) {
			for (local111 = 0; local111 < this.aShortArray19.length; local111++) {
				local94.method1767(this.aShortArray19[local111], this.aShortArray20[local111]);
			}
		}
		if (this.aShortArray21 != null) {
			for (local111 = 0; local111 < this.aShortArray21.length; local111++) {
				local94.method1758(this.aShortArray21[local111], this.aShortArray22[local111]);
			}
		}
		return local94;
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(ILclient!es;)V")
	public void method1488(@OriginalArg(1) Class2_Sub15 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method4325();
			if (local13 == 0) {
				return;
			}
			this.method1491(local13, arg0);
		}
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(Z)Z")
	public boolean method1489() {
		if (this.anIntArray106 == null) {
			return true;
		}
		@Pc(12) boolean local12 = true;
		@Pc(16) Class259 local16 = this.aClass57_2.aClass259_30;
		synchronized (this.aClass57_2.aClass259_30) {
			for (@Pc(20) int local20 = 0; local20 < this.anIntArray106.length; local20++) {
				if (!this.aClass57_2.aClass259_30.method5990(0, this.anIntArray106[local20])) {
					local12 = false;
				}
			}
			return local12;
		}
	}

	@OriginalMember(owner = "client!dn", name = "b", descriptor = "(Z)Lclient!eg;")
	public Class93 method1490() {
		@Pc(8) Class93[] local8 = new Class93[5];
		@Pc(15) int local15 = 0;
		@Pc(19) Class259 local19 = this.aClass57_2.aClass259_30;
		@Pc(23) int local23;
		synchronized (this.aClass57_2.aClass259_30) {
			local23 = 0;
			while (true) {
				if (local23 >= 5) {
					break;
				}
				if (this.anIntArray105[local23] != -1) {
					local8[local15++] = Static117.method1747(this.anIntArray105[local23], this.aClass57_2.aClass259_30);
				}
				local23++;
			}
		}
		for (@Pc(57) int local57 = 0; local57 < 5; local57++) {
			if (local8[local57] != null && local8[local57].anInt2361 < 13) {
				local8[local57].method1763();
			}
		}
		@Pc(89) Class93 local89 = new Class93(local8, local15);
		if (this.aShortArray19 != null) {
			for (local23 = 0; local23 < this.aShortArray19.length; local23++) {
				local89.method1767(this.aShortArray19[local23], this.aShortArray20[local23]);
			}
		}
		if (this.aShortArray21 != null) {
			for (local23 = 0; local23 < this.aShortArray21.length; local23++) {
				local89.method1758(this.aShortArray21[local23], this.aShortArray22[local23]);
			}
		}
		return local89;
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(ILclient!es;Z)V")
	private void method1491(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub15 arg1) {
		if (arg0 == 1) {
			arg1.method4325();
			return;
		}
		@Pc(17) int local17;
		@Pc(23) int local23;
		if (arg0 == 2) {
			local17 = arg1.method4325();
			this.anIntArray106 = new int[local17];
			for (local23 = 0; local23 < local17; local23++) {
				this.anIntArray106[local23] = arg1.method4294();
			}
		} else if (arg0 != 3) {
			if (arg0 == 40) {
				local17 = arg1.method4325();
				this.aShortArray20 = new short[local17];
				this.aShortArray19 = new short[local17];
				for (local23 = 0; local23 < local17; local23++) {
					this.aShortArray19[local23] = (short) arg1.method4294();
					this.aShortArray20[local23] = (short) arg1.method4294();
				}
			} else if (arg0 == 41) {
				local17 = arg1.method4325();
				this.aShortArray22 = new short[local17];
				this.aShortArray21 = new short[local17];
				for (local23 = 0; local23 < local17; local23++) {
					this.aShortArray21[local23] = (short) arg1.method4294();
					this.aShortArray22[local23] = (short) arg1.method4294();
				}
			} else if (arg0 >= 60 && arg0 < 70) {
				this.anIntArray105[arg0 - 60] = arg1.method4294();
			}
		}
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(B)Z")
	public boolean method1492() {
		@Pc(7) boolean local7 = true;
		@Pc(16) Class259 local16 = this.aClass57_2.aClass259_30;
		synchronized (this.aClass57_2.aClass259_30) {
			for (@Pc(20) int local20 = 0; local20 < 5; local20++) {
				if (this.anIntArray105[local20] != -1 && !this.aClass57_2.aClass259_30.method5990(0, this.anIntArray105[local20])) {
					local7 = false;
				}
			}
			return local7;
		}
	}
}
