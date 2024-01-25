import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jj")
public final class Class181 {

	@OriginalMember(owner = "client!jj", name = "c", descriptor = "[I")
	private int[] anIntArray391;

	@OriginalMember(owner = "client!jj", name = "e", descriptor = "[S")
	private short[] aShortArray77;

	@OriginalMember(owner = "client!jj", name = "g", descriptor = "Lclient!ib;")
	public Class154 aClass154_1;

	@OriginalMember(owner = "client!jj", name = "h", descriptor = "[S")
	private short[] aShortArray78;

	@OriginalMember(owner = "client!jj", name = "k", descriptor = "[S")
	private short[] aShortArray79;

	@OriginalMember(owner = "client!jj", name = "r", descriptor = "[S")
	private short[] aShortArray80;

	@OriginalMember(owner = "client!jj", name = "f", descriptor = "[I")
	private final int[] anIntArray392 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(I)Z")
	public boolean method4038() {
		@Pc(7) boolean local7 = true;
		@Pc(11) Class386 local11 = this.aClass154_1.aClass386_59;
		synchronized (this.aClass154_1.aClass386_59) {
			for (@Pc(15) int local15 = 0; local15 < 5; local15++) {
				if (this.anIntArray392[local15] != -1 && !this.aClass154_1.aClass386_59.method9216(this.anIntArray392[local15], 0)) {
					local7 = false;
				}
			}
			return local7;
		}
	}

	@OriginalMember(owner = "client!jj", name = "b", descriptor = "(B)Lclient!dba;")
	public Class67 method4041() {
		if (this.anIntArray391 == null) {
			return null;
		}
		@Pc(15) Class67[] local15 = new Class67[this.anIntArray391.length];
		@Pc(19) Class386 local19 = this.aClass154_1.aClass386_59;
		@Pc(23) int local23;
		synchronized (this.aClass154_1.aClass386_59) {
			local23 = 0;
			while (true) {
				if (local23 >= this.anIntArray391.length) {
					break;
				}
				local15[local23] = Static40.method1465(this.aClass154_1.aClass386_59, this.anIntArray391[local23]);
				local23++;
			}
		}
		for (@Pc(61) int local61 = 0; local61 < this.anIntArray391.length; local61++) {
			if (local15[local61].anInt2022 < 13) {
				local15[local61].method1718();
			}
		}
		@Pc(96) Class67 local96;
		if (local15.length == 1) {
			local96 = local15[0];
		} else {
			local96 = new Class67(local15, local15.length);
		}
		if (local96 == null) {
			return null;
		}
		if (this.aShortArray80 != null) {
			for (local23 = 0; local23 < this.aShortArray80.length; local23++) {
				local96.method1721(this.aShortArray80[local23], this.aShortArray77[local23]);
			}
		}
		if (this.aShortArray78 != null) {
			for (local23 = 0; local23 < this.aShortArray78.length; local23++) {
				local96.method1710(this.aShortArray78[local23], this.aShortArray79[local23]);
			}
		}
		return local96;
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(ILclient!so;)V")
	public void method4044(@OriginalArg(1) Class14_Sub29 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method5866();
			if (local5 == 0) {
				return;
			}
			this.method4048(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(Z)Lclient!dba;")
	public Class67 method4045() {
		@Pc(8) Class67[] local8 = new Class67[5];
		@Pc(10) int local10 = 0;
		@Pc(14) Class386 local14 = this.aClass154_1.aClass386_59;
		@Pc(18) int local18;
		synchronized (this.aClass154_1.aClass386_59) {
			local18 = 0;
			while (true) {
				if (local18 >= 5) {
					break;
				}
				if (this.anIntArray392[local18] != -1) {
					local8[local10++] = Static40.method1465(this.aClass154_1.aClass386_59, this.anIntArray392[local18]);
				}
				local18++;
			}
		}
		for (@Pc(59) int local59 = 0; local59 < 5; local59++) {
			if (local8[local59] != null && local8[local59].anInt2022 < 13) {
				local8[local59].method1718();
			}
		}
		@Pc(87) Class67 local87 = new Class67(local8, local10);
		if (this.aShortArray80 != null) {
			for (local18 = 0; local18 < this.aShortArray80.length; local18++) {
				local87.method1721(this.aShortArray80[local18], this.aShortArray77[local18]);
			}
		}
		if (this.aShortArray78 != null) {
			for (local18 = 0; local18 < this.aShortArray78.length; local18++) {
				local87.method1710(this.aShortArray78[local18], this.aShortArray79[local18]);
			}
		}
		return local87;
	}

	@OriginalMember(owner = "client!jj", name = "b", descriptor = "(I)Z")
	public boolean method4047() {
		if (this.anIntArray391 == null) {
			return true;
		}
		@Pc(12) boolean local12 = true;
		@Pc(16) Class386 local16 = this.aClass154_1.aClass386_59;
		synchronized (this.aClass154_1.aClass386_59) {
			for (@Pc(20) int local20 = 0; local20 < this.anIntArray391.length; local20++) {
				if (!this.aClass154_1.aClass386_59.method9216(this.anIntArray391[local20], 0)) {
					local12 = false;
				}
			}
			return local12;
		}
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(IILclient!so;)V")
	private void method4048(@OriginalArg(0) int arg0, @OriginalArg(2) Class14_Sub29 arg1) {
		if (arg0 == 1) {
			arg1.method5866();
			return;
		}
		@Pc(21) int local21;
		@Pc(27) int local27;
		if (arg0 == 2) {
			local21 = arg1.method5866();
			this.anIntArray391 = new int[local21];
			for (local27 = 0; local27 < local21; local27++) {
				this.anIntArray391[local27] = arg1.method5900();
			}
		} else if (arg0 != 3) {
			if (arg0 == 40) {
				local21 = arg1.method5866();
				this.aShortArray77 = new short[local21];
				this.aShortArray80 = new short[local21];
				for (local27 = 0; local27 < local21; local27++) {
					this.aShortArray80[local27] = (short) arg1.method5900();
					this.aShortArray77[local27] = (short) arg1.method5900();
				}
			} else if (arg0 == 41) {
				local21 = arg1.method5866();
				this.aShortArray79 = new short[local21];
				this.aShortArray78 = new short[local21];
				for (local27 = 0; local27 < local21; local27++) {
					this.aShortArray78[local27] = (short) arg1.method5900();
					this.aShortArray79[local27] = (short) arg1.method5900();
				}
			} else if (arg0 >= 60 && arg0 < 70) {
				this.anIntArray392[arg0 - 60] = arg1.method5900();
			}
		}
	}
}
