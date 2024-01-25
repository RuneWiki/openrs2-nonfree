import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uda")
public final class Class318 {

	@OriginalMember(owner = "client!uda", name = "c", descriptor = "I")
	public int anInt8901;

	@OriginalMember(owner = "client!uda", name = "d", descriptor = "[I")
	private int[] anIntArray630;

	@OriginalMember(owner = "client!uda", name = "e", descriptor = "[I")
	private int[] anIntArray631;

	@OriginalMember(owner = "client!uda", name = "f", descriptor = "[I")
	private int[] anIntArray632;

	@OriginalMember(owner = "client!uda", name = "g", descriptor = "I")
	private int anInt8902;

	@OriginalMember(owner = "client!uda", name = "h", descriptor = "J")
	private long aLong224;

	@OriginalMember(owner = "client!uda", name = "i", descriptor = "[I")
	public int[] anIntArray633;

	@OriginalMember(owner = "client!uda", name = "b", descriptor = "Lclient!jr;")
	private final Class6_Sub12 aClass6_Sub12_7 = new Class6_Sub12(null);

	@OriginalMember(owner = "client!uda", name = "<init>", descriptor = "()V")
	public Class318() {
	}

	@OriginalMember(owner = "client!uda", name = "<init>", descriptor = "([B)V")
	public Class318(@OriginalArg(0) byte[] arg0) {
		this.method7105(arg0);
	}

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "(II)I")
	private int method7093(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12;
		if (arg1 != 255) {
			@Pc(78) byte local78 = Static520.aByteArray105[arg1 - 128];
			local12 = arg1;
			if (local78 >= 1) {
				local12 = arg1 | this.aClass6_Sub12_7.method6019() << 8;
			}
			if (local78 >= 2) {
				local12 |= this.aClass6_Sub12_7.method6019() << 16;
			}
			return local12;
		}
		@Pc(7) int local7 = this.aClass6_Sub12_7.method6019();
		local12 = this.aClass6_Sub12_7.method6029();
		if (local7 == 47) {
			this.aClass6_Sub12_7.anInt7556 += local12;
			return 1;
		} else if (local7 == 81) {
			@Pc(32) int local32 = this.aClass6_Sub12_7.method6037();
			local12 -= 3;
			@Pc(38) int local38 = this.anIntArray633[arg0];
			this.aLong224 += (long) local38 * (long) (this.anInt8902 - local32);
			this.anInt8902 = local32;
			this.aClass6_Sub12_7.anInt7556 += local12;
			return 2;
		} else {
			this.aClass6_Sub12_7.anInt7556 += local12;
			return 3;
		}
	}

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "(I)I")
	private int method7094(@OriginalArg(0) int arg0) {
		@Pc(7) byte local7 = this.aClass6_Sub12_7.aByteArray97[this.aClass6_Sub12_7.anInt7556];
		@Pc(13) int local13;
		if (local7 < 0) {
			local13 = local7 & 0xFF;
			this.anIntArray631[arg0] = local13;
			this.aClass6_Sub12_7.anInt7556++;
		} else {
			local13 = this.anIntArray631[arg0];
		}
		if (local13 != 240 && local13 != 247) {
			return this.method7093(arg0, local13);
		}
		@Pc(42) int local42 = this.aClass6_Sub12_7.method6029();
		if (local13 == 247 && local42 > 0) {
			@Pc(57) int local57 = this.aClass6_Sub12_7.aByteArray97[this.aClass6_Sub12_7.anInt7556] & 0xFF;
			if (local57 >= 241 && local57 <= 243 || local57 == 246 || local57 == 248 || local57 >= 250 && local57 <= 252 || local57 == 254) {
				this.aClass6_Sub12_7.anInt7556++;
				this.anIntArray631[arg0] = local57;
				return this.method7093(arg0, local57);
			}
		}
		this.aClass6_Sub12_7.anInt7556 += local42;
		return 0;
	}

	@OriginalMember(owner = "client!uda", name = "b", descriptor = "(I)V")
	public void method7095(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.aClass6_Sub12_7.method6029();
		this.anIntArray633[arg0] += local4;
	}

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "(J)V")
	public void method7096(@OriginalArg(0) long arg0) {
		this.aLong224 = arg0;
		@Pc(6) int local6 = this.anIntArray632.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			this.anIntArray633[local8] = 0;
			this.anIntArray631[local8] = 0;
			this.aClass6_Sub12_7.anInt7556 = this.anIntArray630[local8];
			this.method7095(local8);
			this.anIntArray632[local8] = this.aClass6_Sub12_7.anInt7556;
		}
	}

	@OriginalMember(owner = "client!uda", name = "c", descriptor = "(I)I")
	public int method7097(@OriginalArg(0) int arg0) {
		return this.method7094(arg0);
	}

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "()Z")
	public boolean method7098() {
		@Pc(3) int local3 = this.anIntArray632.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.anIntArray632[local5] >= 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!uda", name = "c", descriptor = "()Z")
	public boolean method7100() {
		return this.aClass6_Sub12_7.aByteArray97 != null;
	}

	@OriginalMember(owner = "client!uda", name = "d", descriptor = "()V")
	public void method7101() {
		this.aClass6_Sub12_7.anInt7556 = -1;
	}

	@OriginalMember(owner = "client!uda", name = "e", descriptor = "()V")
	public void method7102() {
		this.aClass6_Sub12_7.aByteArray97 = null;
		this.anIntArray630 = null;
		this.anIntArray632 = null;
		this.anIntArray633 = null;
		this.anIntArray631 = null;
	}

	@OriginalMember(owner = "client!uda", name = "f", descriptor = "()I")
	public int method7103() {
		@Pc(3) int local3 = this.anIntArray632.length;
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MAX_VALUE;
		for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
			if (this.anIntArray632[local9] >= 0 && this.anIntArray633[local9] < local7) {
				local5 = local9;
				local7 = this.anIntArray633[local9];
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!uda", name = "g", descriptor = "()I")
	public int method7104() {
		return this.anIntArray632.length;
	}

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "([B)V")
	public void method7105(@OriginalArg(0) byte[] arg0) {
		this.aClass6_Sub12_7.aByteArray97 = arg0;
		this.aClass6_Sub12_7.anInt7556 = 10;
		@Pc(12) int local12 = this.aClass6_Sub12_7.method6044();
		this.anInt8901 = this.aClass6_Sub12_7.method6044();
		this.anInt8902 = 500000;
		this.anIntArray630 = new int[local12];
		@Pc(27) int local27 = 0;
		@Pc(33) int local33;
		while (local27 < local12) {
			local33 = this.aClass6_Sub12_7.method6015();
			@Pc(38) int local38 = this.aClass6_Sub12_7.method6015();
			if (local33 == 1297379947) {
				this.anIntArray630[local27] = this.aClass6_Sub12_7.anInt7556;
				local27++;
			}
			this.aClass6_Sub12_7.anInt7556 += local38;
		}
		this.aLong224 = 0L;
		this.anIntArray632 = new int[local12];
		for (local33 = 0; local33 < local12; local33++) {
			this.anIntArray632[local33] = this.anIntArray630[local33];
		}
		this.anIntArray633 = new int[local12];
		this.anIntArray631 = new int[local12];
	}

	@OriginalMember(owner = "client!uda", name = "d", descriptor = "(I)V")
	public void method7106(@OriginalArg(0) int arg0) {
		this.aClass6_Sub12_7.anInt7556 = this.anIntArray632[arg0];
	}

	@OriginalMember(owner = "client!uda", name = "e", descriptor = "(I)J")
	public long method7107(@OriginalArg(0) int arg0) {
		return this.aLong224 + (long) arg0 * (long) this.anInt8902;
	}

	@OriginalMember(owner = "client!uda", name = "f", descriptor = "(I)V")
	public void method7108(@OriginalArg(0) int arg0) {
		this.anIntArray632[arg0] = this.aClass6_Sub12_7.anInt7556;
	}
}
