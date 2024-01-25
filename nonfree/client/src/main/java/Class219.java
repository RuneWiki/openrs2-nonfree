import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!om")
public final class Class219 {

	@OriginalMember(owner = "client!om", name = "f", descriptor = "[I")
	private int[] anIntArray478;

	@OriginalMember(owner = "client!om", name = "h", descriptor = "[S")
	private short[] aShortArray113;

	@OriginalMember(owner = "client!om", name = "i", descriptor = "Lclient!bo;")
	public Class34 aClass34_1;

	@OriginalMember(owner = "client!om", name = "k", descriptor = "[S")
	private short[] aShortArray114;

	@OriginalMember(owner = "client!om", name = "l", descriptor = "[S")
	private short[] aShortArray115;

	@OriginalMember(owner = "client!om", name = "p", descriptor = "[S")
	private short[] aShortArray116;

	@OriginalMember(owner = "client!om", name = "d", descriptor = "[I")
	private final int[] anIntArray477 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(BLclient!gw;)V")
	public void method5556(@OriginalArg(1) Class1_Sub13 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method3043();
			if (local3 == 0) {
				return;
			}
			this.method5560(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(B)Lclient!fd;")
	public Class86 method5557() {
		if (this.anIntArray478 == null) {
			return null;
		}
		@Pc(21) Class86[] local21 = new Class86[this.anIntArray478.length];
		@Pc(25) Class160 local25 = this.aClass34_1.aClass160_7;
		@Pc(29) int local29;
		synchronized (this.aClass34_1.aClass160_7) {
			local29 = 0;
			while (true) {
				if (local29 >= this.anIntArray478.length) {
					break;
				}
				local21[local29] = Static469.method6840(this.anIntArray478[local29], this.aClass34_1.aClass160_7);
				local29++;
			}
		}
		for (@Pc(57) int local57 = 0; local57 < this.anIntArray478.length; local57++) {
			if (local21[local57].anInt3071 < 13) {
				local21[local57].method2795();
			}
		}
		@Pc(89) Class86 local89;
		if (local21.length == 1) {
			local89 = local21[0];
		} else {
			local89 = new Class86(local21, local21.length);
		}
		if (local89 == null) {
			return null;
		}
		if (this.aShortArray115 != null) {
			for (local29 = 0; local29 < this.aShortArray115.length; local29++) {
				local89.method2799(this.aShortArray115[local29], this.aShortArray116[local29]);
			}
		}
		if (this.aShortArray114 != null) {
			for (local29 = 0; local29 < this.aShortArray114.length; local29++) {
				local89.method2804(this.aShortArray113[local29], this.aShortArray114[local29]);
			}
		}
		return local89;
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(Z)Lclient!fd;")
	public Class86 method5558() {
		@Pc(6) Class86[] local6 = new Class86[5];
		@Pc(8) int local8 = 0;
		@Pc(12) Class160 local12 = this.aClass34_1.aClass160_7;
		@Pc(16) int local16;
		synchronized (this.aClass34_1.aClass160_7) {
			local16 = 0;
			while (true) {
				if (local16 >= 5) {
					break;
				}
				if (this.anIntArray477[local16] != -1) {
					local6[local8++] = Static469.method6840(this.anIntArray477[local16], this.aClass34_1.aClass160_7);
				}
				local16++;
			}
		}
		for (@Pc(58) int local58 = 0; local58 < 5; local58++) {
			if (local6[local58] != null && local6[local58].anInt3071 < 13) {
				local6[local58].method2795();
			}
		}
		@Pc(87) Class86 local87 = new Class86(local6, local8);
		if (this.aShortArray115 != null) {
			for (local16 = 0; local16 < this.aShortArray115.length; local16++) {
				local87.method2799(this.aShortArray115[local16], this.aShortArray116[local16]);
			}
		}
		if (this.aShortArray114 != null) {
			for (local16 = 0; local16 < this.aShortArray114.length; local16++) {
				local87.method2804(this.aShortArray113[local16], this.aShortArray114[local16]);
			}
		}
		return local87;
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(Lclient!gw;IB)V")
	private void method5560(@OriginalArg(0) Class1_Sub13 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			arg0.method3043();
			return;
		}
		@Pc(45) int local45;
		@Pc(55) int local55;
		if (arg1 == 2) {
			local45 = arg0.method3043();
			this.anIntArray478 = new int[local45];
			for (local55 = 0; local55 < local45; local55++) {
				this.anIntArray478[local55] = arg0.method3056();
			}
		} else if (arg1 != 3) {
			if (arg1 == 40) {
				local45 = arg0.method3043();
				this.aShortArray115 = new short[local45];
				this.aShortArray116 = new short[local45];
				for (local55 = 0; local55 < local45; local55++) {
					this.aShortArray115[local55] = (short) arg0.method3056();
					this.aShortArray116[local55] = (short) arg0.method3056();
				}
			} else if (arg1 == 41) {
				local45 = arg0.method3043();
				this.aShortArray114 = new short[local45];
				this.aShortArray113 = new short[local45];
				for (local55 = 0; local55 < local45; local55++) {
					this.aShortArray114[local55] = (short) arg0.method3056();
					this.aShortArray113[local55] = (short) arg0.method3056();
				}
			} else if (arg1 >= 60 && arg1 < 70) {
				this.anIntArray477[arg1 - 60] = arg0.method3056();
			}
		}
	}

	@OriginalMember(owner = "client!om", name = "c", descriptor = "(B)Z")
	public boolean method5562() {
		if (this.anIntArray478 == null) {
			return true;
		}
		@Pc(10) boolean local10 = true;
		@Pc(14) Class160 local14 = this.aClass34_1.aClass160_7;
		synchronized (this.aClass34_1.aClass160_7) {
			for (@Pc(18) int local18 = 0; local18 < this.anIntArray478.length; local18++) {
				if (!this.aClass34_1.aClass160_7.method4212(0, this.anIntArray478[local18])) {
					local10 = false;
				}
			}
			return local10;
		}
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(I)Z")
	public boolean method5563() {
		@Pc(5) boolean local5 = true;
		@Pc(9) Class160 local9 = this.aClass34_1.aClass160_7;
		synchronized (this.aClass34_1.aClass160_7) {
			for (@Pc(13) int local13 = 0; local13 < 5; local13++) {
				if (this.anIntArray477[local13] != -1 && !this.aClass34_1.aClass160_7.method4212(0, this.anIntArray477[local13])) {
					local5 = false;
				}
			}
			return local5;
		}
	}
}
