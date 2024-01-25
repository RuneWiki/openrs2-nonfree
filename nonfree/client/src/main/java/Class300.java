import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rw")
public final class Class300 {

	@OriginalMember(owner = "client!rw", name = "e", descriptor = "[S")
	private short[] aShortArray122;

	@OriginalMember(owner = "client!rw", name = "h", descriptor = "[S")
	private short[] aShortArray123;

	@OriginalMember(owner = "client!rw", name = "j", descriptor = "[S")
	private short[] aShortArray124;

	@OriginalMember(owner = "client!rw", name = "k", descriptor = "[S")
	private short[] aShortArray125;

	@OriginalMember(owner = "client!rw", name = "l", descriptor = "[I")
	private int[] anIntArray538;

	@OriginalMember(owner = "client!rw", name = "p", descriptor = "Lclient!av;")
	public Class22 aClass22_2;

	@OriginalMember(owner = "client!rw", name = "d", descriptor = "[I")
	private final int[] anIntArray537 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(I)Z")
	public boolean method7362() {
		if (this.anIntArray538 == null) {
			return true;
		}
		@Pc(12) boolean local12 = true;
		@Pc(21) Class343 local21 = this.aClass22_2.aClass343_21;
		synchronized (this.aClass22_2.aClass343_21) {
			for (@Pc(25) int local25 = 0; local25 < this.anIntArray538.length; local25++) {
				if (!this.aClass22_2.aClass343_21.method8130(this.anIntArray538[local25], 0)) {
					local12 = false;
				}
			}
			return local12;
		}
	}

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(ILclient!dc;)V")
	public void method7364(@OriginalArg(1) Class3_Sub9 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method5633();
			if (local5 == 0) {
				return;
			}
			this.method7366(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!rw", name = "b", descriptor = "(I)Lclient!vo;")
	public Class359 method7365() {
		@Pc(8) Class359[] local8 = new Class359[5];
		@Pc(10) int local10 = 0;
		@Pc(14) Class343 local14 = this.aClass22_2.aClass343_21;
		@Pc(24) int local24;
		synchronized (this.aClass22_2.aClass343_21) {
			local24 = 0;
			while (true) {
				if (local24 >= 5) {
					break;
				}
				if (this.anIntArray537[local24] != -1) {
					local8[local10++] = Static11.method201(this.aClass22_2.aClass343_21, this.anIntArray537[local24]);
				}
				local24++;
			}
		}
		for (@Pc(59) int local59 = 0; local59 < 5; local59++) {
			if (local8[local59] != null && local8[local59].anInt9841 < 13) {
				local8[local59].method8347();
			}
		}
		@Pc(89) Class359 local89 = new Class359(local8, local10);
		if (this.aShortArray122 != null) {
			for (local24 = 0; local24 < this.aShortArray122.length; local24++) {
				local89.method8352(this.aShortArray125[local24], this.aShortArray122[local24]);
			}
		}
		if (this.aShortArray123 != null) {
			for (local24 = 0; local24 < this.aShortArray123.length; local24++) {
				local89.method8349(this.aShortArray124[local24], this.aShortArray123[local24]);
			}
		}
		return local89;
	}

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(IILclient!dc;)V")
	private void method7366(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub9 arg1) {
		if (arg0 == 1) {
			arg1.method5633();
			return;
		}
		@Pc(19) int local19;
		@Pc(25) int local25;
		if (arg0 == 2) {
			local19 = arg1.method5633();
			this.anIntArray538 = new int[local19];
			for (local25 = 0; local25 < local19; local25++) {
				this.anIntArray538[local25] = arg1.method5610();
			}
		} else if (arg0 != 3) {
			if (arg0 == 40) {
				local19 = arg1.method5633();
				this.aShortArray122 = new short[local19];
				this.aShortArray125 = new short[local19];
				for (local25 = 0; local25 < local19; local25++) {
					this.aShortArray122[local25] = (short) arg1.method5610();
					this.aShortArray125[local25] = (short) arg1.method5610();
				}
			} else if (arg0 == 41) {
				local19 = arg1.method5633();
				this.aShortArray124 = new short[local19];
				this.aShortArray123 = new short[local19];
				for (local25 = 0; local25 < local19; local25++) {
					this.aShortArray123[local25] = (short) arg1.method5610();
					this.aShortArray124[local25] = (short) arg1.method5610();
				}
			} else if (arg0 >= 60 && arg0 < 70) {
				this.anIntArray537[arg0 - 60] = arg1.method5610();
			}
		}
	}

	@OriginalMember(owner = "client!rw", name = "c", descriptor = "(I)Lclient!vo;")
	public Class359 method7367() {
		if (this.anIntArray538 == null) {
			return null;
		}
		@Pc(15) Class359[] local15 = new Class359[this.anIntArray538.length];
		@Pc(19) Class343 local19 = this.aClass22_2.aClass343_21;
		@Pc(23) int local23;
		synchronized (this.aClass22_2.aClass343_21) {
			local23 = 0;
			while (true) {
				if (local23 >= this.anIntArray538.length) {
					break;
				}
				local15[local23] = Static11.method201(this.aClass22_2.aClass343_21, this.anIntArray538[local23]);
				local23++;
			}
		}
		for (@Pc(56) int local56 = 0; local56 < this.anIntArray538.length; local56++) {
			if (local15[local56].anInt9841 < 13) {
				local15[local56].method8347();
			}
		}
		@Pc(92) Class359 local92;
		if (local15.length == 1) {
			local92 = local15[0];
		} else {
			local92 = new Class359(local15, local15.length);
		}
		if (local92 == null) {
			return null;
		}
		if (this.aShortArray122 != null) {
			for (local23 = 0; local23 < this.aShortArray122.length; local23++) {
				local92.method8352(this.aShortArray125[local23], this.aShortArray122[local23]);
			}
		}
		if (this.aShortArray123 != null) {
			for (local23 = 0; local23 < this.aShortArray123.length; local23++) {
				local92.method8349(this.aShortArray124[local23], this.aShortArray123[local23]);
			}
		}
		return local92;
	}

	@OriginalMember(owner = "client!rw", name = "b", descriptor = "(B)Z")
	public boolean method7369() {
		@Pc(7) boolean local7 = true;
		@Pc(11) Class343 local11 = this.aClass22_2.aClass343_21;
		synchronized (this.aClass22_2.aClass343_21) {
			for (@Pc(15) int local15 = 0; local15 < 5; local15++) {
				if (this.anIntArray537[local15] != -1 && !this.aClass22_2.aClass343_21.method8130(this.anIntArray537[local15], 0)) {
					local7 = false;
				}
			}
			return local7;
		}
	}
}
