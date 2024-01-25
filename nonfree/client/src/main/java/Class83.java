import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dha")
public final class Class83 {

	@OriginalMember(owner = "client!dha", name = "a", descriptor = "[I")
	private int[] anIntArray146;

	@OriginalMember(owner = "client!dha", name = "g", descriptor = "[S")
	private short[] aShortArray32;

	@OriginalMember(owner = "client!dha", name = "b", descriptor = "Lclient!af;")
	public Class7 aClass7_2;

	@OriginalMember(owner = "client!dha", name = "d", descriptor = "[S")
	private short[] aShortArray33;

	@OriginalMember(owner = "client!dha", name = "c", descriptor = "[S")
	private short[] aShortArray34;

	@OriginalMember(owner = "client!dha", name = "n", descriptor = "[S")
	private short[] aShortArray35;

	@OriginalMember(owner = "client!dha", name = "h", descriptor = "[I")
	private final int[] anIntArray147 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!dha", name = "b", descriptor = "(I)Z")
	public boolean method1646() {
		@Pc(7) boolean local7 = true;
		@Pc(11) Class254 local11 = this.aClass7_2.aClass254_12;
		synchronized (this.aClass7_2.aClass254_12) {
			for (@Pc(15) int local15 = 0; local15 < 5; local15++) {
				if (this.anIntArray147[local15] != -1 && !this.aClass7_2.aClass254_12.method6071(this.anIntArray147[local15], 0)) {
					local7 = false;
				}
			}
			return local7;
		}
	}

	@OriginalMember(owner = "client!dha", name = "a", descriptor = "(I)Z")
	public boolean method1647() {
		if (this.anIntArray146 == null) {
			return true;
		}
		@Pc(13) boolean local13 = true;
		@Pc(17) Class254 local17 = this.aClass7_2.aClass254_12;
		synchronized (this.aClass7_2.aClass254_12) {
			for (@Pc(21) int local21 = 0; local21 < this.anIntArray146.length; local21++) {
				if (!this.aClass7_2.aClass254_12.method6071(this.anIntArray146[local21], 0)) {
					local13 = false;
				}
			}
			if (18199 != 18199) {
				this.method1650(-3);
			}
			return local13;
		}
	}

	@OriginalMember(owner = "client!dha", name = "d", descriptor = "(I)Lclient!ln;")
	public Class229 method1648() {
		if (this.anIntArray146 == null) {
			return null;
		}
		@Pc(16) Class229[] local16 = new Class229[this.anIntArray146.length];
		@Pc(20) Class254 local20 = this.aClass7_2.aClass254_12;
		@Pc(24) int local24;
		synchronized (this.aClass7_2.aClass254_12) {
			local24 = 0;
			while (true) {
				if (local24 >= this.anIntArray146.length) {
					break;
				}
				local16[local24] = Static594.method8178(this.anIntArray146[local24], this.aClass7_2.aClass254_12);
				local24++;
			}
		}
		for (@Pc(61) int local61 = 0; local61 < this.anIntArray146.length; local61++) {
			if (local16[local61].anInt5933 < 13) {
				local16[local61].method5315();
			}
		}
		if (13 != 13) {
			return null;
		}
		@Pc(105) Class229 local105;
		if (local16.length == 1) {
			local105 = local16[0];
		} else {
			local105 = new Class229(local16, local16.length);
		}
		if (local105 == null) {
			return null;
		}
		if (this.aShortArray35 != null) {
			for (local24 = 0; local24 < this.aShortArray35.length; local24++) {
				local105.method5311(this.aShortArray33[local24], this.aShortArray35[local24]);
			}
		}
		if (this.aShortArray34 != null) {
			for (local24 = 0; local24 < this.aShortArray34.length; local24++) {
				local105.method5307(this.aShortArray32[local24], this.aShortArray34[local24]);
			}
		}
		return local105;
	}

	@OriginalMember(owner = "client!dha", name = "a", descriptor = "(ILclient!et;)V")
	public void method1649(@OriginalArg(1) Class2_Sub20 arg0) {
		while (true) {
			@Pc(7) int local7 = arg0.method8581(-17416);
			if (local7 == 0) {
				return;
			}
			this.method1651(local7, arg0);
		}
	}

	@OriginalMember(owner = "client!dha", name = "c", descriptor = "(I)Lclient!ln;")
	public Class229 method1650(@OriginalArg(0) int arg0) {
		@Pc(8) Class229[] local8 = new Class229[5];
		@Pc(10) int local10 = 0;
		@Pc(14) Class254 local14 = this.aClass7_2.aClass254_12;
		@Pc(18) int local18;
		synchronized (this.aClass7_2.aClass254_12) {
			local18 = 0;
			if (arg0 <= 88) {
				this.method1650(66);
			}
			while (true) {
				if (local18 >= 5) {
					break;
				}
				if (this.anIntArray147[local18] != -1) {
					local8[local10++] = Static594.method8178(this.anIntArray147[local18], this.aClass7_2.aClass254_12);
				}
				local18++;
			}
		}
		for (@Pc(70) int local70 = 0; local70 < 5; local70++) {
			if (local8[local70] != null && local8[local70].anInt5933 < 13) {
				local8[local70].method5315();
			}
		}
		@Pc(108) Class229 local108 = new Class229(local8, local10);
		if (this.aShortArray35 != null) {
			for (local18 = 0; local18 < this.aShortArray35.length; local18++) {
				local108.method5311(this.aShortArray33[local18], this.aShortArray35[local18]);
			}
		}
		if (this.aShortArray34 != null) {
			for (local18 = 0; local18 < this.aShortArray34.length; local18++) {
				local108.method5307(this.aShortArray32[local18], this.aShortArray34[local18]);
			}
		}
		return local108;
	}

	@OriginalMember(owner = "client!dha", name = "a", descriptor = "(ILclient!et;B)V")
	private void method1651(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub20 arg1) {
		if (arg0 == 1) {
			arg1.method8581(-17416);
			return;
		}
		@Pc(46) int local46;
		@Pc(56) int local56;
		if (arg0 == 2) {
			local46 = arg1.method8581(-17416);
			this.anIntArray146 = new int[local46];
			for (local56 = 0; local56 < local46; local56++) {
				this.anIntArray146[local56] = arg1.method8575();
			}
		} else if (arg0 != 3) {
			if (arg0 == 40) {
				local46 = arg1.method8581(-17416);
				this.aShortArray35 = new short[local46];
				this.aShortArray33 = new short[local46];
				for (local56 = 0; local56 < local46; local56++) {
					this.aShortArray35[local56] = (short) arg1.method8575();
					this.aShortArray33[local56] = (short) arg1.method8575();
				}
			} else if (arg0 == 41) {
				local46 = arg1.method8581(-17416);
				this.aShortArray32 = new short[local46];
				this.aShortArray34 = new short[local46];
				for (local56 = 0; local56 < local46; local56++) {
					this.aShortArray34[local56] = (short) arg1.method8575();
					this.aShortArray32[local56] = (short) arg1.method8575();
				}
				return;
			} else if (arg0 >= 60 && arg0 < 70) {
				this.anIntArray147[arg0 - 60] = arg1.method8575();
				return;
			}
			return;
		}
	}
}
