import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wl")
public final class Class222 {

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "[S")
	private short[] aShortArray115;

	@OriginalMember(owner = "client!wl", name = "d", descriptor = "[S")
	private short[] aShortArray116;

	@OriginalMember(owner = "client!wl", name = "h", descriptor = "[S")
	private short[] aShortArray117;

	@OriginalMember(owner = "client!wl", name = "j", descriptor = "[S")
	private short[] aShortArray118;

	@OriginalMember(owner = "client!wl", name = "l", descriptor = "[I")
	private int[] anIntArray512;

	@OriginalMember(owner = "client!wl", name = "g", descriptor = "[I")
	private final int[] anIntArray511 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(B)Lclient!e;")
	public Class41 method5986() {
		@Pc(8) Class41[] local8 = new Class41[5];
		@Pc(17) int local17 = 0;
		@Pc(19) Class30 local19 = Static28.aClass30_5;
		synchronized (Static28.aClass30_5) {
			for (@Pc(23) int local23 = 0; local23 < 5; local23++) {
				if (this.anIntArray511[local23] != -1) {
					local8[local17++] = Static227.method4232(this.anIntArray511[local23], Static28.aClass30_5);
				}
			}
		}
		@Pc(60) Class41 local60 = new Class41(local8, local17);
		@Pc(65) int local65;
		if (this.aShortArray116 != null) {
			for (local65 = 0; local65 < this.aShortArray116.length; local65++) {
				local60.method1511(this.aShortArray116[local65], this.aShortArray118[local65]);
			}
		}
		if (this.aShortArray115 != null) {
			for (local65 = 0; local65 < this.aShortArray115.length; local65++) {
				local60.method1515(this.aShortArray117[local65], this.aShortArray115[local65]);
			}
		}
		return local60;
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(Lclient!at;I)V")
	public void method5988(@OriginalArg(0) Class1_Sub7 arg0) {
		while (true) {
			@Pc(12) int local12 = arg0.method2132();
			if (local12 == 0) {
				return;
			}
			this.method5994(arg0, local12);
		}
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(Z)Z")
	public boolean method5991() {
		@Pc(7) boolean local7 = true;
		@Pc(9) Class30 local9 = Static28.aClass30_5;
		synchronized (Static28.aClass30_5) {
			for (@Pc(13) int local13 = 0; local13 < 5; local13++) {
				if (this.anIntArray511[local13] != -1 && !Static28.aClass30_5.method1162(0, this.anIntArray511[local13])) {
					local7 = false;
				}
			}
			return local7;
		}
	}

	@OriginalMember(owner = "client!wl", name = "b", descriptor = "(Z)Z")
	public boolean method5992() {
		if (this.anIntArray512 == null) {
			return true;
		}
		@Pc(12) boolean local12 = true;
		@Pc(14) Class30 local14 = Static28.aClass30_5;
		synchronized (Static28.aClass30_5) {
			for (@Pc(18) int local18 = 0; local18 < this.anIntArray512.length; local18++) {
				if (!Static28.aClass30_5.method1162(0, this.anIntArray512[local18])) {
					local12 = false;
				}
			}
			return local12;
		}
	}

	@OriginalMember(owner = "client!wl", name = "c", descriptor = "(I)Lclient!e;")
	public Class41 method5993() {
		if (this.anIntArray512 == null) {
			return null;
		}
		@Pc(15) Class41[] local15 = new Class41[this.anIntArray512.length];
		@Pc(17) Class30 local17 = Static28.aClass30_5;
		synchronized (Static28.aClass30_5) {
			@Pc(21) int local21 = 0;
			while (true) {
				if (local21 >= this.anIntArray512.length) {
					break;
				}
				local15[local21] = Static227.method4232(this.anIntArray512[local21], Static28.aClass30_5);
				local21++;
			}
		}
		@Pc(58) Class41 local58;
		if (local15.length == 1) {
			local58 = local15[0];
		} else {
			local58 = new Class41(local15, local15.length);
		}
		if (local58 == null) {
			return null;
		}
		@Pc(75) int local75;
		if (this.aShortArray116 != null) {
			for (local75 = 0; local75 < this.aShortArray116.length; local75++) {
				local58.method1511(this.aShortArray116[local75], this.aShortArray118[local75]);
			}
		}
		if (this.aShortArray115 != null) {
			for (local75 = 0; local75 < this.aShortArray115.length; local75++) {
				local58.method1515(this.aShortArray117[local75], this.aShortArray115[local75]);
			}
		}
		return local58;
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(Lclient!at;ZI)V")
	private void method5994(@OriginalArg(0) Class1_Sub7 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			arg0.method2132();
			return;
		}
		@Pc(27) int local27;
		@Pc(37) int local37;
		if (arg1 == 2) {
			local27 = arg0.method2132();
			this.anIntArray512 = new int[local27];
			for (local37 = 0; local37 < local27; local37++) {
				this.anIntArray512[local37] = arg0.method2161();
			}
		} else if (arg1 != 3) {
			if (arg1 == 40) {
				local27 = arg0.method2132();
				this.aShortArray116 = new short[local27];
				this.aShortArray118 = new short[local27];
				for (local37 = 0; local37 < local27; local37++) {
					this.aShortArray116[local37] = (short) arg0.method2161();
					this.aShortArray118[local37] = (short) arg0.method2161();
				}
			} else if (arg1 == 41) {
				local27 = arg0.method2132();
				this.aShortArray117 = new short[local27];
				this.aShortArray115 = new short[local27];
				for (local37 = 0; local37 < local27; local37++) {
					this.aShortArray115[local37] = (short) arg0.method2161();
					this.aShortArray117[local37] = (short) arg0.method2161();
				}
			} else if (arg1 >= 60 && arg1 < 70) {
				this.anIntArray511[arg1 - 60] = arg0.method2161();
			}
		}
	}
}
