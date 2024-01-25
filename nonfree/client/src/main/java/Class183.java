import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oo")
public final class Class183 {

	@OriginalMember(owner = "client!oo", name = "b", descriptor = "[I")
	private int[] anIntArray348;

	@OriginalMember(owner = "client!oo", name = "e", descriptor = "[S")
	private short[] aShortArray69;

	@OriginalMember(owner = "client!oo", name = "f", descriptor = "[S")
	private short[] aShortArray70;

	@OriginalMember(owner = "client!oo", name = "h", descriptor = "[S")
	private short[] aShortArray71;

	@OriginalMember(owner = "client!oo", name = "m", descriptor = "Lclient!b;")
	public Class18 aClass18_2;

	@OriginalMember(owner = "client!oo", name = "p", descriptor = "[S")
	private short[] aShortArray72;

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "[I")
	private final int[] anIntArray347 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(Z)Z")
	public boolean method4365() {
		@Pc(7) boolean local7 = true;
		@Pc(11) Class100 local11 = this.aClass18_2.aClass100_3;
		synchronized (this.aClass18_2.aClass100_3) {
			for (@Pc(15) int local15 = 0; local15 < 5; local15++) {
				if (this.anIntArray347[local15] != -1 && !this.aClass18_2.aClass100_3.method2495(0, this.anIntArray347[local15])) {
					local7 = false;
				}
			}
			return local7;
		}
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(I)Lclient!fl;")
	public Class78 method4366() {
		if (this.anIntArray348 == null) {
			return null;
		}
		@Pc(15) Class78[] local15 = new Class78[this.anIntArray348.length];
		@Pc(19) Class100 local19 = this.aClass18_2.aClass100_3;
		synchronized (this.aClass18_2.aClass100_3) {
			@Pc(23) int local23 = 0;
			while (true) {
				if (this.anIntArray348.length <= local23) {
					break;
				}
				local15[local23] = Static100.method1817(this.anIntArray348[local23], this.aClass18_2.aClass100_3);
				local23++;
			}
		}
		for (@Pc(56) int local56 = 0; local56 < this.anIntArray348.length; local56++) {
			if (local15[local56].anInt2404 < 13) {
				local15[local56].method1969();
			}
		}
		@Pc(101) Class78 local101;
		if (local15.length == 1) {
			local101 = local15[0];
		} else {
			local101 = new Class78(local15, local15.length);
		}
		if (local101 == null) {
			return null;
		}
		@Pc(115) int local115;
		if (this.aShortArray69 != null) {
			for (local115 = 0; local115 < this.aShortArray69.length; local115++) {
				local101.method1974(this.aShortArray69[local115], this.aShortArray70[local115]);
			}
		}
		if (this.aShortArray71 != null) {
			for (local115 = 0; local115 < this.aShortArray71.length; local115++) {
				local101.method1970(this.aShortArray72[local115], this.aShortArray71[local115]);
			}
		}
		return local101;
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(Lclient!ae;B)V")
	public void method4367(@OriginalArg(0) Class6_Sub1 arg0) {
		while (true) {
			@Pc(16) int local16 = arg0.method6433();
			if (local16 == 0) {
				return;
			}
			this.method4374(local16, arg0);
		}
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(BILclient!ae;)V")
	private void method4374(@OriginalArg(1) int arg0, @OriginalArg(2) Class6_Sub1 arg1) {
		if (arg0 == 1) {
			arg1.method6433();
			return;
		}
		@Pc(21) int local21;
		@Pc(31) int local31;
		if (arg0 == 2) {
			local21 = arg1.method6433();
			this.anIntArray348 = new int[local21];
			for (local31 = 0; local31 < local21; local31++) {
				this.anIntArray348[local31] = arg1.method6485();
			}
		} else if (arg0 != 3) {
			if (arg0 == 40) {
				local21 = arg1.method6433();
				this.aShortArray70 = new short[local21];
				this.aShortArray69 = new short[local21];
				for (local31 = 0; local31 < local21; local31++) {
					this.aShortArray69[local31] = (short) arg1.method6485();
					this.aShortArray70[local31] = (short) arg1.method6485();
				}
			} else if (arg0 == 41) {
				local21 = arg1.method6433();
				this.aShortArray72 = new short[local21];
				this.aShortArray71 = new short[local21];
				for (local31 = 0; local31 < local21; local31++) {
					this.aShortArray71[local31] = (short) arg1.method6485();
					this.aShortArray72[local31] = (short) arg1.method6485();
				}
			} else if (arg0 >= 60 && arg0 < 70) {
				this.anIntArray347[arg0 - 60] = arg1.method6485();
			}
		}
	}

	@OriginalMember(owner = "client!oo", name = "e", descriptor = "(I)Z")
	public boolean method4375() {
		if (this.anIntArray348 == null) {
			return true;
		}
		@Pc(12) boolean local12 = true;
		@Pc(16) Class100 local16 = this.aClass18_2.aClass100_3;
		synchronized (this.aClass18_2.aClass100_3) {
			for (@Pc(20) int local20 = 0; local20 < this.anIntArray348.length; local20++) {
				if (!this.aClass18_2.aClass100_3.method2495(0, this.anIntArray348[local20])) {
					local12 = false;
				}
			}
			return local12;
		}
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(B)Lclient!fl;")
	public Class78 method4376() {
		@Pc(8) Class78[] local8 = new Class78[5];
		@Pc(10) int local10 = 0;
		@Pc(14) Class100 local14 = this.aClass18_2.aClass100_3;
		@Pc(18) int local18;
		synchronized (this.aClass18_2.aClass100_3) {
			local18 = 0;
			while (true) {
				if (local18 >= 5) {
					break;
				}
				if (this.anIntArray347[local18] != -1) {
					local8[local10++] = Static100.method1817(this.anIntArray347[local18], this.aClass18_2.aClass100_3);
				}
				local18++;
			}
		}
		for (@Pc(59) int local59 = 0; local59 < 5; local59++) {
			if (local8[local59] != null && local8[local59].anInt2404 < 13) {
				local8[local59].method1969();
			}
		}
		@Pc(89) Class78 local89 = new Class78(local8, local10);
		if (this.aShortArray69 != null) {
			for (local18 = 0; local18 < this.aShortArray69.length; local18++) {
				local89.method1974(this.aShortArray69[local18], this.aShortArray70[local18]);
			}
		}
		if (this.aShortArray71 != null) {
			for (local18 = 0; local18 < this.aShortArray71.length; local18++) {
				local89.method1970(this.aShortArray72[local18], this.aShortArray71[local18]);
			}
		}
		return local89;
	}
}
