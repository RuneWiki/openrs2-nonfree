import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rha")
public final class Class300 {

	@OriginalMember(owner = "client!rha", name = "a", descriptor = "[S")
	private short[] aShortArray119;

	@OriginalMember(owner = "client!rha", name = "b", descriptor = "[S")
	private short[] aShortArray120;

	@OriginalMember(owner = "client!rha", name = "c", descriptor = "[I")
	private int[] anIntArray567;

	@OriginalMember(owner = "client!rha", name = "i", descriptor = "Lclient!baa;")
	public Class23 aClass23_3;

	@OriginalMember(owner = "client!rha", name = "j", descriptor = "[S")
	private short[] aShortArray121;

	@OriginalMember(owner = "client!rha", name = "p", descriptor = "[S")
	private short[] aShortArray122;

	@OriginalMember(owner = "client!rha", name = "l", descriptor = "[I")
	private final int[] anIntArray568 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!rha", name = "a", descriptor = "(B)Z")
	public boolean method6840() {
		@Pc(7) boolean local7 = true;
		@Pc(11) Class380 local11 = this.aClass23_3.aClass380_11;
		synchronized (this.aClass23_3.aClass380_11) {
			for (@Pc(24) int local24 = 0; local24 < 5; local24++) {
				if (this.anIntArray568[local24] != -1 && !this.aClass23_3.aClass380_11.method8619(this.anIntArray568[local24], 0)) {
					local7 = false;
				}
			}
			return local7;
		}
	}

	@OriginalMember(owner = "client!rha", name = "a", descriptor = "(IBLclient!vj;)V")
	private void method6841(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub22 arg1) {
		if (arg0 == 1) {
			arg1.method8547();
			return;
		}
		@Pc(47) int local47;
		@Pc(57) int local57;
		if (arg0 == 2) {
			local47 = arg1.method8547();
			this.anIntArray567 = new int[local47];
			for (local57 = 0; local57 < local47; local57++) {
				this.anIntArray567[local57] = arg1.method8546();
			}
		} else if (arg0 != 3) {
			if (arg0 == 40) {
				local47 = arg1.method8547();
				this.aShortArray122 = new short[local47];
				this.aShortArray120 = new short[local47];
				for (local57 = 0; local57 < local47; local57++) {
					this.aShortArray120[local57] = (short) arg1.method8546();
					this.aShortArray122[local57] = (short) arg1.method8546();
				}
			} else if (arg0 == 41) {
				local47 = arg1.method8547();
				this.aShortArray119 = new short[local47];
				this.aShortArray121 = new short[local47];
				for (local57 = 0; local57 < local47; local57++) {
					this.aShortArray121[local57] = (short) arg1.method8546();
					this.aShortArray119[local57] = (short) arg1.method8546();
				}
			} else if (arg0 >= 60 && arg0 < 70) {
				this.anIntArray568[arg0 - 60] = arg1.method8546();
			}
		}
	}

	@OriginalMember(owner = "client!rha", name = "a", descriptor = "(Lclient!vj;B)V")
	public void method6844(@OriginalArg(0) Class2_Sub22 arg0) {
		while (true) {
			@Pc(14) int local14 = arg0.method8547();
			if (local14 == 0) {
				return;
			}
			this.method6841(local14, arg0);
		}
	}

	@OriginalMember(owner = "client!rha", name = "a", descriptor = "(I)Z")
	public boolean method6845() {
		if (this.anIntArray567 == null) {
			return true;
		}
		@Pc(19) boolean local19 = true;
		@Pc(23) Class380 local23 = this.aClass23_3.aClass380_11;
		synchronized (this.aClass23_3.aClass380_11) {
			for (@Pc(27) int local27 = 0; local27 < this.anIntArray567.length; local27++) {
				if (!this.aClass23_3.aClass380_11.method8619(this.anIntArray567[local27], 0)) {
					local19 = false;
				}
			}
			return local19;
		}
	}

	@OriginalMember(owner = "client!rha", name = "b", descriptor = "(I)Lclient!kda;")
	public Class186 method6846() {
		if (this.anIntArray567 == null) {
			return null;
		}
		@Pc(15) Class186[] local15 = new Class186[this.anIntArray567.length];
		@Pc(19) Class380 local19 = this.aClass23_3.aClass380_11;
		@Pc(23) int local23;
		synchronized (this.aClass23_3.aClass380_11) {
			local23 = 0;
			while (true) {
				if (this.anIntArray567.length <= local23) {
					break;
				}
				local15[local23] = Static439.method6023(this.aClass23_3.aClass380_11, this.anIntArray567[local23]);
				local23++;
			}
		}
		for (@Pc(56) int local56 = 0; local56 < this.anIntArray567.length; local56++) {
			if (local15[local56].anInt4702 < 13) {
				local15[local56].method3992();
			}
		}
		@Pc(87) Class186 local87;
		if (local15.length == 1) {
			local87 = local15[0];
		} else {
			local87 = new Class186(local15, local15.length);
		}
		if (local87 == null) {
			return null;
		}
		if (this.aShortArray120 != null) {
			for (local23 = 0; local23 < this.aShortArray120.length; local23++) {
				local87.method3996(this.aShortArray122[local23], this.aShortArray120[local23]);
			}
		}
		if (this.aShortArray121 != null) {
			for (local23 = 0; local23 < this.aShortArray121.length; local23++) {
				local87.method4003(this.aShortArray121[local23], this.aShortArray119[local23]);
			}
		}
		return local87;
	}

	@OriginalMember(owner = "client!rha", name = "c", descriptor = "(I)Lclient!kda;")
	public Class186 method6847() {
		@Pc(8) Class186[] local8 = new Class186[5];
		@Pc(18) int local18 = 0;
		@Pc(22) Class380 local22 = this.aClass23_3.aClass380_11;
		@Pc(26) int local26;
		synchronized (this.aClass23_3.aClass380_11) {
			local26 = 0;
			while (true) {
				if (local26 >= 5) {
					break;
				}
				if (this.anIntArray568[local26] != -1) {
					local8[local18++] = Static439.method6023(this.aClass23_3.aClass380_11, this.anIntArray568[local26]);
				}
				local26++;
			}
		}
		for (@Pc(63) int local63 = 0; local63 < 5; local63++) {
			if (local8[local63] != null && local8[local63].anInt4702 < 13) {
				local8[local63].method3992();
			}
		}
		@Pc(95) Class186 local95 = new Class186(local8, local18);
		if (this.aShortArray120 != null) {
			for (local26 = 0; local26 < this.aShortArray120.length; local26++) {
				local95.method3996(this.aShortArray122[local26], this.aShortArray120[local26]);
			}
		}
		if (this.aShortArray121 != null) {
			for (local26 = 0; local26 < this.aShortArray121.length; local26++) {
				local95.method4003(this.aShortArray121[local26], this.aShortArray119[local26]);
			}
		}
		return local95;
	}
}
