import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ge")
public final class Class80 {

	@OriginalMember(owner = "client!ge", name = "c", descriptor = "I")
	public static final int anInt2251 = 12;

	@OriginalMember(owner = "client!ge", name = "l", descriptor = "Z")
	public static boolean aBoolean167 = false;

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "[S")
	private short[] aShortArray41;

	@OriginalMember(owner = "client!ge", name = "d", descriptor = "[S")
	private short[] aShortArray42;

	@OriginalMember(owner = "client!ge", name = "f", descriptor = "[S")
	private short[] aShortArray43;

	@OriginalMember(owner = "client!ge", name = "i", descriptor = "[S")
	private short[] aShortArray44;

	@OriginalMember(owner = "client!ge", name = "q", descriptor = "[I")
	private int[] anIntArray142;

	@OriginalMember(owner = "client!ge", name = "t", descriptor = "Lclient!e;")
	public Class55 aClass55_2;

	@OriginalMember(owner = "client!ge", name = "g", descriptor = "[I")
	private final int[] anIntArray141 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(B)Z", line = 5)
	public boolean method2270() {
		@Pc(7) boolean local7 = true;
		@Pc(11) Class197 local11 = this.aClass55_2.aClass197_16;
		synchronized (this.aClass55_2.aClass197_16) {
			for (@Pc(27) int local27 = 0; local27 < 5; local27++) {
				if (this.anIntArray141[local27] != -1 && !this.aClass55_2.aClass197_16.method5089(0, this.anIntArray141[local27])) {
					local7 = false;
				}
			}
			return local7;
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(IILclient!bt;)V", line = 49)
	private void method2271(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub4 arg1) {
		if (arg0 == 1) {
			arg1.method4816();
			return;
		}
		@Pc(19) int local19;
		@Pc(25) int local25;
		if (arg0 == 2) {
			local19 = arg1.method4816();
			this.anIntArray142 = new int[local19];
			for (local25 = 0; local25 < local19; local25++) {
				this.anIntArray142[local25] = arg1.method4830();
			}
		} else if (arg0 != 3) {
			if (arg0 == 40) {
				local19 = arg1.method4816();
				this.aShortArray43 = new short[local19];
				this.aShortArray42 = new short[local19];
				for (local25 = 0; local25 < local19; local25++) {
					this.aShortArray42[local25] = (short) arg1.method4830();
					this.aShortArray43[local25] = (short) arg1.method4830();
				}
			} else if (arg0 == 41) {
				local19 = arg1.method4816();
				this.aShortArray41 = new short[local19];
				this.aShortArray44 = new short[local19];
				for (local25 = 0; local25 < local19; local25++) {
					this.aShortArray44[local25] = (short) arg1.method4830();
					this.aShortArray41[local25] = (short) arg1.method4830();
				}
			} else if (arg0 >= 60 && arg0 < 70) {
				this.anIntArray141[arg0 - 60] = arg1.method4830();
			}
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(Z)Z", line = 131)
	public boolean method2272() {
		if (this.anIntArray142 == null) {
			return true;
		}
		@Pc(12) boolean local12 = true;
		@Pc(16) Class197 local16 = this.aClass55_2.aClass197_16;
		synchronized (this.aClass55_2.aClass197_16) {
			for (@Pc(20) int local20 = 0; local20 < this.anIntArray142.length; local20++) {
				if (!this.aClass55_2.aClass197_16.method5089(0, this.anIntArray142[local20])) {
					local12 = false;
				}
			}
			return local12;
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lclient!bt;I)V", line = 164)
	public void method2273(@OriginalArg(0) Class2_Sub4 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method4816();
			if (local5 == 0) {
				return;
			}
			this.method2271(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "(Z)Lclient!pr;", line = 203)
	public Class185 method2275() {
		@Pc(13) Class185[] local13 = new Class185[5];
		@Pc(15) int local15 = 0;
		@Pc(19) Class197 local19 = this.aClass55_2.aClass197_16;
		synchronized (this.aClass55_2.aClass197_16) {
			for (@Pc(23) int local23 = 0; local23 < 5; local23++) {
				if (this.anIntArray141[local23] != -1) {
					local13[local15++] = Static275.method2428(this.aClass55_2.aClass197_16, this.anIntArray141[local23]);
				}
			}
		}
		@Pc(62) Class185 local62 = new Class185(local13, local15);
		@Pc(67) int local67;
		if (this.aShortArray42 != null) {
			for (local67 = 0; local67 < this.aShortArray42.length; local67++) {
				local62.method4664(this.aShortArray42[local67], this.aShortArray43[local67]);
			}
		}
		if (this.aShortArray44 != null) {
			for (local67 = 0; local67 < this.aShortArray44.length; local67++) {
				local62.method4659(this.aShortArray41[local67], this.aShortArray44[local67]);
			}
		}
		return local62;
	}

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "(I)Lclient!pr;", line = 471)
	public Class185 method2277() {
		if (this.anIntArray142 == null) {
			return null;
		}
		@Pc(23) Class185[] local23 = new Class185[this.anIntArray142.length];
		@Pc(27) Class197 local27 = this.aClass55_2.aClass197_16;
		synchronized (this.aClass55_2.aClass197_16) {
			@Pc(31) int local31 = 0;
			while (true) {
				if (this.anIntArray142.length <= local31) {
					break;
				}
				local23[local31] = Static275.method2428(this.aClass55_2.aClass197_16, this.anIntArray142[local31]);
				local31++;
			}
		}
		@Pc(73) Class185 local73;
		if (local23.length == 1) {
			local73 = local23[0];
		} else {
			local73 = new Class185(local23, local23.length);
		}
		if (local73 == null) {
			return null;
		}
		@Pc(87) int local87;
		if (this.aShortArray42 != null) {
			for (local87 = 0; local87 < this.aShortArray42.length; local87++) {
				local73.method4664(this.aShortArray42[local87], this.aShortArray43[local87]);
			}
		}
		if (this.aShortArray44 != null) {
			for (local87 = 0; local87 < this.aShortArray44.length; local87++) {
				local73.method4659(this.aShortArray41[local87], this.aShortArray44[local87]);
			}
		}
		return local73;
	}
}
