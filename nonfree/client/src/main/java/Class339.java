import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!su")
public final class Class339 {

	@OriginalMember(owner = "client!su", name = "e", descriptor = "Lclient!np;")
	public Class254 aClass254_2;

	@OriginalMember(owner = "client!su", name = "g", descriptor = "[S")
	private short[] aShortArray134;

	@OriginalMember(owner = "client!su", name = "i", descriptor = "[S")
	private short[] aShortArray135;

	@OriginalMember(owner = "client!su", name = "m", descriptor = "[S")
	private short[] aShortArray136;

	@OriginalMember(owner = "client!su", name = "o", descriptor = "[I")
	private int[] anIntArray613;

	@OriginalMember(owner = "client!su", name = "q", descriptor = "[S")
	private short[] aShortArray137;

	@OriginalMember(owner = "client!su", name = "c", descriptor = "[I")
	private final int[] anIntArray612 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(I)Lclient!so;")
	public Class334 method7435() {
		if (this.anIntArray613 == null) {
			return null;
		}
		@Pc(15) Class334[] local15 = new Class334[this.anIntArray613.length];
		@Pc(19) Class34 local19 = this.aClass254_2.aClass34_87;
		@Pc(23) int local23;
		synchronized (this.aClass254_2.aClass34_87) {
			local23 = 0;
			while (true) {
				if (this.anIntArray613.length <= local23) {
					break;
				}
				local15[local23] = Static111.method2111(this.anIntArray613[local23], this.aClass254_2.aClass34_87);
				local23++;
			}
		}
		for (@Pc(52) int local52 = 0; local52 < this.anIntArray613.length; local52++) {
			if (local15[local52].anInt8565 < 13) {
				local15[local52].method7395();
			}
		}
		@Pc(85) Class334 local85;
		if (local15.length == 1) {
			local85 = local15[0];
		} else {
			local85 = new Class334(local15, local15.length);
		}
		if (local85 == null) {
			return null;
		}
		if (this.aShortArray136 != null) {
			for (local23 = 0; local23 < this.aShortArray136.length; local23++) {
				local85.method7384(this.aShortArray136[local23], this.aShortArray137[local23]);
			}
		}
		if (this.aShortArray134 != null) {
			for (local23 = 0; local23 < this.aShortArray134.length; local23++) {
				local85.method7390(this.aShortArray135[local23], this.aShortArray134[local23]);
			}
		}
		return local85;
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(Lclient!es;II)V")
	private void method7437(@OriginalArg(0) Class4_Sub11 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			arg0.method8865();
			return;
		}
		@Pc(27) int local27;
		@Pc(37) int local37;
		if (arg1 == 2) {
			local27 = arg0.method8865();
			this.anIntArray613 = new int[local27];
			for (local37 = 0; local37 < local27; local37++) {
				this.anIntArray613[local37] = arg0.method8859();
			}
		} else if (arg1 != 3) {
			if (arg1 == 40) {
				local27 = arg0.method8865();
				this.aShortArray137 = new short[local27];
				this.aShortArray136 = new short[local27];
				for (local37 = 0; local37 < local27; local37++) {
					this.aShortArray136[local37] = (short) arg0.method8859();
					this.aShortArray137[local37] = (short) arg0.method8859();
				}
			} else if (arg1 == 41) {
				local27 = arg0.method8865();
				this.aShortArray134 = new short[local27];
				this.aShortArray135 = new short[local27];
				for (local37 = 0; local37 < local27; local37++) {
					this.aShortArray134[local37] = (short) arg0.method8859();
					this.aShortArray135[local37] = (short) arg0.method8859();
				}
			} else if (arg1 >= 60 && arg1 < 70) {
				this.anIntArray612[arg1 - 60] = arg0.method8859();
			}
		}
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(ILclient!es;)V")
	public void method7438(@OriginalArg(1) Class4_Sub11 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method8865();
			if (local5 == 0) {
				return;
			}
			this.method7437(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!su", name = "c", descriptor = "(I)Z")
	public boolean method7439() {
		if (this.anIntArray613 == null) {
			return true;
		}
		@Pc(12) boolean local12 = true;
		@Pc(16) Class34 local16 = this.aClass254_2.aClass34_87;
		synchronized (this.aClass254_2.aClass34_87) {
			for (@Pc(27) int local27 = 0; local27 < this.anIntArray613.length; local27++) {
				if (!this.aClass254_2.aClass34_87.method1245(0, this.anIntArray613[local27])) {
					local12 = false;
				}
			}
			return local12;
		}
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(B)Z")
	public boolean method7440() {
		@Pc(7) boolean local7 = true;
		@Pc(11) Class34 local11 = this.aClass254_2.aClass34_87;
		synchronized (this.aClass254_2.aClass34_87) {
			for (@Pc(23) int local23 = 0; local23 < 5; local23++) {
				if (this.anIntArray612[local23] != -1 && !this.aClass254_2.aClass34_87.method1245(0, this.anIntArray612[local23])) {
					local7 = false;
				}
			}
			return local7;
		}
	}

	@OriginalMember(owner = "client!su", name = "e", descriptor = "(I)Lclient!so;")
	public Class334 method7442() {
		@Pc(8) Class334[] local8 = new Class334[5];
		@Pc(10) int local10 = 0;
		@Pc(14) Class34 local14 = this.aClass254_2.aClass34_87;
		synchronized (this.aClass254_2.aClass34_87) {
			@Pc(18) int local18 = 0;
			while (true) {
				if (local18 >= 5) {
					break;
				}
				if (this.anIntArray612[local18] != -1) {
					local8[local10++] = Static111.method2111(this.anIntArray612[local18], this.aClass254_2.aClass34_87);
				}
				local18++;
			}
		}
		for (@Pc(62) int local62 = 0; local62 < 5; local62++) {
			if (local8[local62] != null && local8[local62].anInt8565 < 13) {
				local8[local62].method7395();
			}
		}
		@Pc(90) Class334 local90 = new Class334(local8, local10);
		@Pc(95) int local95;
		if (this.aShortArray136 != null) {
			for (local95 = 0; local95 < this.aShortArray136.length; local95++) {
				local90.method7384(this.aShortArray136[local95], this.aShortArray137[local95]);
			}
		}
		if (this.aShortArray134 != null) {
			for (local95 = 0; local95 < this.aShortArray134.length; local95++) {
				local90.method7390(this.aShortArray135[local95], this.aShortArray134[local95]);
			}
		}
		return local90;
	}
}
