import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wr")
public final class Class316 {

	@OriginalMember(owner = "client!wr", name = "c", descriptor = "[S")
	private short[] aShortArray155;

	@OriginalMember(owner = "client!wr", name = "e", descriptor = "[S")
	private short[] aShortArray156;

	@OriginalMember(owner = "client!wr", name = "g", descriptor = "[S")
	private short[] aShortArray157;

	@OriginalMember(owner = "client!wr", name = "i", descriptor = "Lclient!au;")
	public Class15 aClass15_2;

	@OriginalMember(owner = "client!wr", name = "j", descriptor = "[S")
	private short[] aShortArray158;

	@OriginalMember(owner = "client!wr", name = "r", descriptor = "[I")
	private int[] anIntArray844;

	@OriginalMember(owner = "client!wr", name = "l", descriptor = "[I")
	private final int[] anIntArray842 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(Z)Z")
	public boolean method7516() {
		if (this.anIntArray844 == null) {
			return true;
		}
		@Pc(12) boolean local12 = true;
		@Pc(16) Class171 local16 = this.aClass15_2.aClass171_15;
		synchronized (this.aClass15_2.aClass171_15) {
			for (@Pc(20) int local20 = 0; local20 < this.anIntArray844.length; local20++) {
				if (!this.aClass15_2.aClass171_15.method4336(0, this.anIntArray844[local20])) {
					local12 = false;
				}
			}
			return local12;
		}
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(IILclient!ge;)V")
	private void method7517(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub6 arg1) {
		if (arg0 == 1) {
			arg1.method3922();
			return;
		}
		@Pc(27) int local27;
		@Pc(37) int local37;
		if (arg0 == 2) {
			local27 = arg1.method3922();
			this.anIntArray844 = new int[local27];
			for (local37 = 0; local37 < local27; local37++) {
				this.anIntArray844[local37] = arg1.method3967();
			}
		} else if (arg0 != 3) {
			if (arg0 == 40) {
				local27 = arg1.method3922();
				this.aShortArray156 = new short[local27];
				this.aShortArray155 = new short[local27];
				for (local37 = 0; local37 < local27; local37++) {
					this.aShortArray155[local37] = (short) arg1.method3967();
					this.aShortArray156[local37] = (short) arg1.method3967();
				}
			} else if (arg0 == 41) {
				local27 = arg1.method3922();
				this.aShortArray157 = new short[local27];
				this.aShortArray158 = new short[local27];
				for (local37 = 0; local37 < local27; local37++) {
					this.aShortArray157[local37] = (short) arg1.method3967();
					this.aShortArray158[local37] = (short) arg1.method3967();
				}
			} else if (arg0 >= 60 && arg0 < 70) {
				this.anIntArray842[arg0 - 60] = arg1.method3967();
			}
		}
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(B)Z")
	public boolean method7518() {
		@Pc(7) boolean local7 = true;
		@Pc(11) Class171 local11 = this.aClass15_2.aClass171_15;
		synchronized (this.aClass15_2.aClass171_15) {
			for (@Pc(15) int local15 = 0; local15 < 5; local15++) {
				if (this.anIntArray842[local15] != -1 && !this.aClass15_2.aClass171_15.method4336(0, this.anIntArray842[local15])) {
					local7 = false;
				}
			}
			return local7;
		}
	}

	@OriginalMember(owner = "client!wr", name = "c", descriptor = "(B)Lclient!fp;")
	public Class97 method7522() {
		@Pc(8) Class97[] local8 = new Class97[5];
		@Pc(10) int local10 = 0;
		@Pc(14) Class171 local14 = this.aClass15_2.aClass171_15;
		@Pc(18) int local18;
		synchronized (this.aClass15_2.aClass171_15) {
			local18 = 0;
			while (true) {
				if (local18 >= 5) {
					break;
				}
				if (this.anIntArray842[local18] != -1) {
					local8[local10++] = Static321.method4995(this.anIntArray842[local18], this.aClass15_2.aClass171_15);
				}
				local18++;
			}
		}
		for (@Pc(52) int local52 = 0; local52 < 5; local52++) {
			if (local8[local52] != null && local8[local52].anInt2722 < 13) {
				local8[local52].method2320();
			}
		}
		@Pc(80) Class97 local80 = new Class97(local8, local10);
		if (this.aShortArray155 != null) {
			for (local18 = 0; local18 < this.aShortArray155.length; local18++) {
				local80.method2319(this.aShortArray155[local18], this.aShortArray156[local18]);
			}
		}
		if (this.aShortArray157 != null) {
			for (local18 = 0; local18 < this.aShortArray157.length; local18++) {
				local80.method2318(this.aShortArray157[local18], this.aShortArray158[local18]);
			}
		}
		return local80;
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(Lclient!ge;I)V")
	public void method7523(@OriginalArg(0) Class1_Sub6 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method3922();
			if (local13 == 0) {
				return;
			}
			this.method7517(local13, arg0);
		}
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(I)Lclient!fp;")
	public Class97 method7524() {
		if (this.anIntArray844 == null) {
			return null;
		}
		@Pc(15) Class97[] local15 = new Class97[this.anIntArray844.length];
		@Pc(19) Class171 local19 = this.aClass15_2.aClass171_15;
		@Pc(23) int local23;
		synchronized (this.aClass15_2.aClass171_15) {
			local23 = 0;
			while (true) {
				if (this.anIntArray844.length <= local23) {
					break;
				}
				local15[local23] = Static321.method4995(this.anIntArray844[local23], this.aClass15_2.aClass171_15);
				local23++;
			}
		}
		for (@Pc(56) int local56 = 0; local56 < this.anIntArray844.length; local56++) {
			if (local15[local56].anInt2722 < 13) {
				local15[local56].method2320();
			}
		}
		@Pc(89) Class97 local89;
		if (local15.length == 1) {
			local89 = local15[0];
		} else {
			local89 = new Class97(local15, local15.length);
		}
		if (local89 == null) {
			return null;
		}
		if (this.aShortArray155 != null) {
			for (local23 = 0; local23 < this.aShortArray155.length; local23++) {
				local89.method2319(this.aShortArray155[local23], this.aShortArray156[local23]);
			}
		}
		if (this.aShortArray157 != null) {
			for (local23 = 0; local23 < this.aShortArray157.length; local23++) {
				local89.method2318(this.aShortArray157[local23], this.aShortArray158[local23]);
			}
		}
		return local89;
	}
}
