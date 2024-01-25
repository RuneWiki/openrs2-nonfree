import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mv")
public final class Class215 {

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "[S")
	private short[] aShortArray83;

	@OriginalMember(owner = "client!mv", name = "b", descriptor = "[I")
	private int[] anIntArray378;

	@OriginalMember(owner = "client!mv", name = "d", descriptor = "[S")
	private short[] aShortArray84;

	@OriginalMember(owner = "client!mv", name = "f", descriptor = "Lclient!ea;")
	public Class79 aClass79_2;

	@OriginalMember(owner = "client!mv", name = "h", descriptor = "[S")
	private short[] aShortArray85;

	@OriginalMember(owner = "client!mv", name = "l", descriptor = "[S")
	private short[] aShortArray86;

	@OriginalMember(owner = "client!mv", name = "i", descriptor = "[I")
	private final int[] anIntArray379 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(I)Z")
	public boolean method5562() {
		if (this.anIntArray378 == null) {
			return true;
		}
		@Pc(12) boolean local12 = true;
		@Pc(16) Class237 local16 = this.aClass79_2.aClass237_31;
		synchronized (this.aClass79_2.aClass237_31) {
			for (@Pc(20) int local20 = 0; local20 < this.anIntArray378.length; local20++) {
				if (!this.aClass79_2.aClass237_31.method6326(this.anIntArray378[local20], 0)) {
					local12 = false;
				}
			}
			return local12;
		}
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(ILclient!ig;)V")
	public void method5563(@OriginalArg(1) Class8_Sub8 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method8525();
			if (local5 == 0) {
				return;
			}
			this.method5565(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!mv", name = "b", descriptor = "(I)Lclient!uk;")
	public Class344 method5564() {
		@Pc(8) Class344[] local8 = new Class344[5];
		@Pc(10) int local10 = 0;
		@Pc(14) Class237 local14 = this.aClass79_2.aClass237_31;
		@Pc(18) int local18;
		synchronized (this.aClass79_2.aClass237_31) {
			local18 = 0;
			while (true) {
				if (local18 >= 5) {
					break;
				}
				if (this.anIntArray379[local18] != -1) {
					local8[local10++] = Static600.method8252(this.aClass79_2.aClass237_31, this.anIntArray379[local18]);
				}
				local18++;
			}
		}
		for (@Pc(55) int local55 = 0; local55 < 5; local55++) {
			if (local8[local55] != null && local8[local55].anInt9915 < 13) {
				local8[local55].method8065();
			}
		}
		@Pc(91) Class344 local91 = new Class344(local8, local10);
		if (this.aShortArray84 != null) {
			for (local18 = 0; local18 < this.aShortArray84.length; local18++) {
				local91.method8048(this.aShortArray84[local18], this.aShortArray83[local18]);
			}
		}
		if (this.aShortArray86 != null) {
			for (local18 = 0; local18 < this.aShortArray86.length; local18++) {
				local91.method8066(this.aShortArray85[local18], this.aShortArray86[local18]);
			}
		}
		return local91;
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(Lclient!ig;II)V")
	private void method5565(@OriginalArg(0) Class8_Sub8 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			arg0.method8525();
			return;
		}
		@Pc(23) int local23;
		@Pc(29) int local29;
		if (arg1 == 2) {
			local23 = arg0.method8525();
			this.anIntArray378 = new int[local23];
			for (local29 = 0; local29 < local23; local29++) {
				this.anIntArray378[local29] = arg0.method8578();
			}
		} else if (arg1 != 3) {
			if (arg1 == 40) {
				local23 = arg0.method8525();
				this.aShortArray84 = new short[local23];
				this.aShortArray83 = new short[local23];
				for (local29 = 0; local29 < local23; local29++) {
					this.aShortArray84[local29] = (short) arg0.method8578();
					this.aShortArray83[local29] = (short) arg0.method8578();
				}
			} else if (arg1 == 41) {
				local23 = arg0.method8525();
				this.aShortArray86 = new short[local23];
				this.aShortArray85 = new short[local23];
				for (local29 = 0; local29 < local23; local29++) {
					this.aShortArray86[local29] = (short) arg0.method8578();
					this.aShortArray85[local29] = (short) arg0.method8578();
				}
			} else if (arg1 >= 60 && arg1 < 70) {
				this.anIntArray379[arg1 - 60] = arg0.method8578();
			}
		}
	}

	@OriginalMember(owner = "client!mv", name = "d", descriptor = "(I)Z")
	public boolean method5567() {
		@Pc(7) boolean local7 = true;
		@Pc(11) Class237 local11 = this.aClass79_2.aClass237_31;
		synchronized (this.aClass79_2.aClass237_31) {
			for (@Pc(15) int local15 = 0; local15 < 5; local15++) {
				if (this.anIntArray379[local15] != -1 && !this.aClass79_2.aClass237_31.method6326(this.anIntArray379[local15], 0)) {
					local7 = false;
				}
			}
			return local7;
		}
	}

	@OriginalMember(owner = "client!mv", name = "e", descriptor = "(I)Lclient!uk;")
	public Class344 method5568() {
		if (this.anIntArray378 == null) {
			return null;
		}
		@Pc(15) Class344[] local15 = new Class344[this.anIntArray378.length];
		@Pc(19) Class237 local19 = this.aClass79_2.aClass237_31;
		@Pc(23) int local23;
		synchronized (this.aClass79_2.aClass237_31) {
			local23 = 0;
			while (true) {
				if (this.anIntArray378.length <= local23) {
					break;
				}
				local15[local23] = Static600.method8252(this.aClass79_2.aClass237_31, this.anIntArray378[local23]);
				local23++;
			}
		}
		for (@Pc(60) int local60 = 0; local60 < this.anIntArray378.length; local60++) {
			if (local15[local60].anInt9915 < 13) {
				local15[local60].method8065();
			}
		}
		@Pc(93) Class344 local93;
		if (local15.length == 1) {
			local93 = local15[0];
		} else {
			local93 = new Class344(local15, local15.length);
		}
		if (local93 == null) {
			return null;
		}
		if (this.aShortArray84 != null) {
			for (local23 = 0; local23 < this.aShortArray84.length; local23++) {
				local93.method8048(this.aShortArray84[local23], this.aShortArray83[local23]);
			}
		}
		if (this.aShortArray86 != null) {
			for (local23 = 0; local23 < this.aShortArray86.length; local23++) {
				local93.method8066(this.aShortArray85[local23], this.aShortArray86[local23]);
			}
		}
		return local93;
	}
}
