import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rp")
public final class Class297 {

	@OriginalMember(owner = "client!rp", name = "d", descriptor = "[S")
	private short[] aShortArray122;

	@OriginalMember(owner = "client!rp", name = "e", descriptor = "[S")
	private short[] aShortArray123;

	@OriginalMember(owner = "client!rp", name = "j", descriptor = "[S")
	private short[] aShortArray124;

	@OriginalMember(owner = "client!rp", name = "l", descriptor = "[I")
	private int[] anIntArray533;

	@OriginalMember(owner = "client!rp", name = "o", descriptor = "[S")
	private short[] aShortArray125;

	@OriginalMember(owner = "client!rp", name = "r", descriptor = "Lclient!daa;")
	public Class58 aClass58_2;

	@OriginalMember(owner = "client!rp", name = "c", descriptor = "[I")
	private final int[] anIntArray532 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(I)Z")
	public boolean method7440() {
		@Pc(12) boolean local12 = true;
		@Pc(16) Class353 local16 = this.aClass58_2.aClass353_18;
		synchronized (this.aClass58_2.aClass353_18) {
			for (@Pc(20) int local20 = 0; local20 < 5; local20++) {
				if (this.anIntArray532[local20] != -1 && !this.aClass58_2.aClass353_18.method8407(0, this.anIntArray532[local20])) {
					local12 = false;
				}
			}
			return local12;
		}
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(Lclient!rg;I)V")
	public void method7441(@OriginalArg(0) Class6_Sub40 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method8604();
			if (local5 == 0) {
				return;
			}
			this.method7447(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!rp", name = "b", descriptor = "(I)Lclient!dh;")
	public Class64 method7442() {
		if (this.anIntArray533 == null) {
			return null;
		}
		@Pc(15) Class64[] local15 = new Class64[this.anIntArray533.length];
		@Pc(19) Class353 local19 = this.aClass58_2.aClass353_18;
		@Pc(23) int local23;
		synchronized (this.aClass58_2.aClass353_18) {
			local23 = 0;
			while (true) {
				if (this.anIntArray533.length <= local23) {
					break;
				}
				local15[local23] = Static84.method1447(this.aClass58_2.aClass353_18, this.anIntArray533[local23]);
				local23++;
			}
		}
		for (@Pc(52) int local52 = 0; local52 < this.anIntArray533.length; local52++) {
			if (local15[local52].anInt1991 < 13) {
				local15[local52].method1647();
			}
		}
		@Pc(91) Class64 local91;
		if (local15.length == 1) {
			local91 = local15[0];
		} else {
			local91 = new Class64(local15, local15.length);
		}
		if (local91 == null) {
			return null;
		}
		if (this.aShortArray124 != null) {
			for (local23 = 0; local23 < this.aShortArray124.length; local23++) {
				local91.method1653(this.aShortArray122[local23], this.aShortArray124[local23]);
			}
		}
		if (this.aShortArray125 != null) {
			for (local23 = 0; local23 < this.aShortArray125.length; local23++) {
				local91.method1654(this.aShortArray125[local23], this.aShortArray123[local23]);
			}
		}
		return local91;
	}

	@OriginalMember(owner = "client!rp", name = "c", descriptor = "(I)Lclient!dh;")
	public Class64 method7446() {
		@Pc(8) Class64[] local8 = new Class64[5];
		@Pc(10) int local10 = 0;
		@Pc(14) Class353 local14 = this.aClass58_2.aClass353_18;
		@Pc(18) int local18;
		synchronized (this.aClass58_2.aClass353_18) {
			local18 = 0;
			while (true) {
				if (local18 >= 5) {
					break;
				}
				if (this.anIntArray532[local18] != -1) {
					local8[local10++] = Static84.method1447(this.aClass58_2.aClass353_18, this.anIntArray532[local18]);
				}
				local18++;
			}
		}
		for (@Pc(55) int local55 = 0; local55 < 5; local55++) {
			if (local8[local55] != null && local8[local55].anInt1991 < 13) {
				local8[local55].method1647();
			}
		}
		@Pc(85) Class64 local85 = new Class64(local8, local10);
		if (this.aShortArray124 != null) {
			for (local18 = 0; local18 < this.aShortArray124.length; local18++) {
				local85.method1653(this.aShortArray122[local18], this.aShortArray124[local18]);
			}
		}
		if (this.aShortArray125 != null) {
			for (local18 = 0; local18 < this.aShortArray125.length; local18++) {
				local85.method1654(this.aShortArray125[local18], this.aShortArray123[local18]);
			}
		}
		return local85;
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(IBLclient!rg;)V")
	private void method7447(@OriginalArg(0) int arg0, @OriginalArg(2) Class6_Sub40 arg1) {
		if (arg0 == 1) {
			arg1.method8604();
			return;
		}
		@Pc(23) int local23;
		@Pc(29) int local29;
		if (arg0 == 2) {
			local23 = arg1.method8604();
			this.anIntArray533 = new int[local23];
			for (local29 = 0; local29 < local23; local29++) {
				this.anIntArray533[local29] = arg1.method8571();
			}
			return;
		}
		if (arg0 == 3) {
			return;
		}
		if (arg0 == 40) {
			local23 = arg1.method8604();
			this.aShortArray122 = new short[local23];
			this.aShortArray124 = new short[local23];
			for (local29 = 0; local29 < local23; local29++) {
				this.aShortArray124[local29] = (short) arg1.method8571();
				this.aShortArray122[local29] = (short) arg1.method8571();
			}
			return;
		}
		if (arg0 == 41) {
			local23 = arg1.method8604();
			this.aShortArray125 = new short[local23];
			this.aShortArray123 = new short[local23];
			for (local29 = 0; local29 < local23; local29++) {
				this.aShortArray125[local29] = (short) arg1.method8571();
				this.aShortArray123[local29] = (short) arg1.method8571();
			}
			return;
		}
		if (arg0 >= 60 && arg0 < 70) {
			this.anIntArray532[arg0 - 60] = arg1.method8571();
			return;
		}
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(B)Z")
	public boolean method7448() {
		if (this.anIntArray533 == null) {
			return true;
		}
		@Pc(12) boolean local12 = true;
		@Pc(16) Class353 local16 = this.aClass58_2.aClass353_18;
		synchronized (this.aClass58_2.aClass353_18) {
			for (@Pc(26) int local26 = 0; local26 < this.anIntArray533.length; local26++) {
				if (!this.aClass58_2.aClass353_18.method8407(0, this.anIntArray533[local26])) {
					local12 = false;
				}
			}
			return local12;
		}
	}
}
