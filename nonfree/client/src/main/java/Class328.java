import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!to")
public final class Class328 {

	@OriginalMember(owner = "client!to", name = "e", descriptor = "[S")
	private short[] aShortArray121;

	@OriginalMember(owner = "client!to", name = "j", descriptor = "[S")
	private short[] aShortArray122;

	@OriginalMember(owner = "client!to", name = "l", descriptor = "[S")
	private short[] aShortArray123;

	@OriginalMember(owner = "client!to", name = "m", descriptor = "Lclient!un;")
	public Class344 aClass344_2;

	@OriginalMember(owner = "client!to", name = "o", descriptor = "[S")
	private short[] aShortArray124;

	@OriginalMember(owner = "client!to", name = "p", descriptor = "[I")
	private int[] anIntArray637;

	@OriginalMember(owner = "client!to", name = "g", descriptor = "[I")
	private final int[] anIntArray636 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(I)Z")
	public boolean method7661() {
		@Pc(5) boolean local5 = true;
		@Pc(9) Class97 local9 = this.aClass344_2.aClass97_141;
		synchronized (this.aClass344_2.aClass97_141) {
			for (@Pc(18) int local18 = 0; local18 < 5; local18++) {
				if (this.anIntArray636[local18] != -1 && !this.aClass344_2.aClass97_141.method2561(this.anIntArray636[local18], 0)) {
					local5 = false;
				}
			}
			return local5;
		}
	}

	@OriginalMember(owner = "client!to", name = "b", descriptor = "(I)Z")
	public boolean method7662() {
		if (this.anIntArray637 == null) {
			return true;
		}
		@Pc(15) boolean local15 = true;
		@Pc(19) Class97 local19 = this.aClass344_2.aClass97_141;
		synchronized (this.aClass344_2.aClass97_141) {
			for (@Pc(23) int local23 = 0; local23 < this.anIntArray637.length; local23++) {
				if (!this.aClass344_2.aClass97_141.method2561(this.anIntArray637[local23], 0)) {
					local15 = false;
				}
			}
			return local15;
		}
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(B)Lclient!ww;")
	public Class379 method7663() {
		@Pc(12) Class379[] local12 = new Class379[5];
		@Pc(14) int local14 = 0;
		@Pc(18) Class97 local18 = this.aClass344_2.aClass97_141;
		@Pc(22) int local22;
		synchronized (this.aClass344_2.aClass97_141) {
			local22 = 0;
			while (true) {
				if (local22 >= 5) {
					break;
				}
				if (this.anIntArray636[local22] != -1) {
					local12[local14++] = Static614.method8359(this.anIntArray636[local22], this.aClass344_2.aClass97_141);
				}
				local22++;
			}
		}
		for (@Pc(56) int local56 = 0; local56 < 5; local56++) {
			if (local12[local56] != null && local12[local56].anInt10284 < 13) {
				local12[local56].method8586();
			}
		}
		@Pc(85) Class379 local85 = new Class379(local12, local14);
		if (this.aShortArray122 != null) {
			for (local22 = 0; local22 < this.aShortArray122.length; local22++) {
				local85.method8590(this.aShortArray122[local22], this.aShortArray123[local22]);
			}
		}
		if (this.aShortArray124 != null) {
			for (local22 = 0; local22 < this.aShortArray124.length; local22++) {
				local85.method8588(this.aShortArray121[local22], this.aShortArray124[local22]);
			}
		}
		return local85;
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(ILclient!ud;)V")
	public void method7665(@OriginalArg(1) Class2_Sub34 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method6904();
			if (local3 == 0) {
				return;
			}
			this.method7667(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!to", name = "d", descriptor = "(I)Lclient!ww;")
	public Class379 method7666() {
		if (this.anIntArray637 == null) {
			return null;
		}
		@Pc(13) Class379[] local13 = new Class379[this.anIntArray637.length];
		@Pc(17) Class97 local17 = this.aClass344_2.aClass97_141;
		@Pc(21) int local21;
		synchronized (this.aClass344_2.aClass97_141) {
			local21 = 0;
			while (true) {
				if (local21 >= this.anIntArray637.length) {
					break;
				}
				local13[local21] = Static614.method8359(this.anIntArray637[local21], this.aClass344_2.aClass97_141);
				local21++;
			}
		}
		for (@Pc(49) int local49 = 0; local49 < this.anIntArray637.length; local49++) {
			if (local13[local49].anInt10284 < 13) {
				local13[local49].method8586();
			}
		}
		@Pc(80) Class379 local80;
		if (local13.length == 1) {
			local80 = local13[0];
		} else {
			local80 = new Class379(local13, local13.length);
		}
		if (local80 == null) {
			return null;
		}
		if (this.aShortArray122 != null) {
			for (local21 = 0; local21 < this.aShortArray122.length; local21++) {
				local80.method8590(this.aShortArray122[local21], this.aShortArray123[local21]);
			}
		}
		if (this.aShortArray124 != null) {
			for (local21 = 0; local21 < this.aShortArray124.length; local21++) {
				local80.method8588(this.aShortArray121[local21], this.aShortArray124[local21]);
			}
		}
		return local80;
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(Lclient!ud;BI)V")
	private void method7667(@OriginalArg(0) Class2_Sub34 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			arg0.method6904();
			return;
		}
		@Pc(27) int local27;
		@Pc(37) int local37;
		if (arg1 == 2) {
			local27 = arg0.method6904();
			this.anIntArray637 = new int[local27];
			for (local37 = 0; local37 < local27; local37++) {
				this.anIntArray637[local37] = arg0.method6884();
			}
		} else if (arg1 != 3) {
			if (arg1 == 40) {
				local27 = arg0.method6904();
				this.aShortArray123 = new short[local27];
				this.aShortArray122 = new short[local27];
				for (local37 = 0; local37 < local27; local37++) {
					this.aShortArray122[local37] = (short) arg0.method6884();
					this.aShortArray123[local37] = (short) arg0.method6884();
				}
			} else if (arg1 == 41) {
				local27 = arg0.method6904();
				this.aShortArray121 = new short[local27];
				this.aShortArray124 = new short[local27];
				for (local37 = 0; local37 < local27; local37++) {
					this.aShortArray124[local37] = (short) arg0.method6884();
					this.aShortArray121[local37] = (short) arg0.method6884();
				}
			} else if (arg1 >= 60 && arg1 < 70) {
				this.anIntArray636[arg1 - 60] = arg0.method6884();
			}
		}
	}
}
