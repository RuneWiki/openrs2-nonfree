import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rd")
public final class Class297 {

	@OriginalMember(owner = "client!rd", name = "c", descriptor = "I")
	public int anInt7847;

	@OriginalMember(owner = "client!rd", name = "d", descriptor = "[I")
	private int[] anIntArray560;

	@OriginalMember(owner = "client!rd", name = "e", descriptor = "[I")
	private int[] anIntArray561;

	@OriginalMember(owner = "client!rd", name = "f", descriptor = "J")
	private long aLong212;

	@OriginalMember(owner = "client!rd", name = "g", descriptor = "[I")
	private int[] anIntArray562;

	@OriginalMember(owner = "client!rd", name = "h", descriptor = "[I")
	public int[] anIntArray563;

	@OriginalMember(owner = "client!rd", name = "i", descriptor = "I")
	private int anInt7848;

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "Lclient!sl;")
	private final Class2_Sub17 aClass2_Sub17_6 = new Class2_Sub17((byte[]) null);

	@OriginalMember(owner = "client!rd", name = "<init>", descriptor = "()V")
	public Class297() {
	}

	@OriginalMember(owner = "client!rd", name = "<init>", descriptor = "([B)V")
	public Class297(@OriginalArg(0) byte[] arg0) {
		this.method6870(arg0);
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(II)I")
	private int method6858(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12;
		if (arg1 != 255) {
			@Pc(78) byte local78 = Static490.aByteArray81[arg1 - 128];
			local12 = arg1;
			if (local78 >= 1) {
				local12 = arg1 | this.aClass2_Sub17_6.method2859() << 8;
			}
			if (local78 >= 2) {
				local12 |= this.aClass2_Sub17_6.method2859() << 16;
			}
			return local12;
		}
		@Pc(7) int local7 = this.aClass2_Sub17_6.method2859();
		local12 = this.aClass2_Sub17_6.method2868();
		if (local7 == 47) {
			this.aClass2_Sub17_6.anInt3378 += local12;
			return 1;
		} else if (local7 == 81) {
			@Pc(32) int local32 = this.aClass2_Sub17_6.method2835();
			local12 -= 3;
			@Pc(38) int local38 = this.anIntArray563[arg0];
			this.aLong212 += (long) local38 * (long) (this.anInt7848 - local32);
			this.anInt7848 = local32;
			this.aClass2_Sub17_6.anInt3378 += local12;
			return 2;
		} else {
			this.aClass2_Sub17_6.anInt3378 += local12;
			return 3;
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(J)V")
	public void method6859(@OriginalArg(0) long arg0) {
		this.aLong212 = arg0;
		@Pc(6) int local6 = this.anIntArray561.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			this.anIntArray563[local8] = 0;
			this.anIntArray562[local8] = 0;
			this.aClass2_Sub17_6.anInt3378 = this.anIntArray560[local8];
			this.method6867(local8);
			this.anIntArray561[local8] = this.aClass2_Sub17_6.anInt3378;
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(I)J")
	public long method6860(@OriginalArg(0) int arg0) {
		return this.aLong212 + (long) arg0 * (long) this.anInt7848;
	}

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "(I)V")
	public void method6862(@OriginalArg(0) int arg0) {
		this.aClass2_Sub17_6.anInt3378 = this.anIntArray561[arg0];
	}

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "()Z")
	public boolean method6863() {
		return this.aClass2_Sub17_6.aByteArray26 != null;
	}

	@OriginalMember(owner = "client!rd", name = "c", descriptor = "()I")
	public int method6864() {
		@Pc(3) int local3 = this.anIntArray561.length;
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MAX_VALUE;
		for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
			if (this.anIntArray561[local9] >= 0 && this.anIntArray563[local9] < local7) {
				local5 = local9;
				local7 = this.anIntArray563[local9];
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!rd", name = "c", descriptor = "(I)V")
	public void method6865(@OriginalArg(0) int arg0) {
		this.anIntArray561[arg0] = this.aClass2_Sub17_6.anInt3378;
	}

	@OriginalMember(owner = "client!rd", name = "d", descriptor = "(I)I")
	public int method6866(@OriginalArg(0) int arg0) {
		return this.method6873(arg0);
	}

	@OriginalMember(owner = "client!rd", name = "e", descriptor = "(I)V")
	public void method6867(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.aClass2_Sub17_6.method2868();
		this.anIntArray563[arg0] += local4;
	}

	@OriginalMember(owner = "client!rd", name = "d", descriptor = "()V")
	public void method6868() {
		this.aClass2_Sub17_6.aByteArray26 = null;
		this.anIntArray560 = null;
		this.anIntArray561 = null;
		this.anIntArray563 = null;
		this.anIntArray562 = null;
	}

	@OriginalMember(owner = "client!rd", name = "e", descriptor = "()I")
	public int method6869() {
		return this.anIntArray561.length;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "([B)V")
	public void method6870(@OriginalArg(0) byte[] arg0) {
		this.aClass2_Sub17_6.aByteArray26 = arg0;
		this.aClass2_Sub17_6.anInt3378 = 10;
		@Pc(12) int local12 = this.aClass2_Sub17_6.method2825();
		this.anInt7847 = this.aClass2_Sub17_6.method2825();
		this.anInt7848 = 500000;
		this.anIntArray560 = new int[local12];
		@Pc(27) int local27 = 0;
		@Pc(33) int local33;
		while (local27 < local12) {
			local33 = this.aClass2_Sub17_6.method2881();
			@Pc(38) int local38 = this.aClass2_Sub17_6.method2881();
			if (local33 == 1297379947) {
				this.anIntArray560[local27] = this.aClass2_Sub17_6.anInt3378;
				local27++;
			}
			this.aClass2_Sub17_6.anInt3378 += local38;
		}
		this.aLong212 = 0L;
		this.anIntArray561 = new int[local12];
		for (local33 = 0; local33 < local12; local33++) {
			this.anIntArray561[local33] = this.anIntArray560[local33];
		}
		this.anIntArray563 = new int[local12];
		this.anIntArray562 = new int[local12];
	}

	@OriginalMember(owner = "client!rd", name = "f", descriptor = "()V")
	public void method6871() {
		this.aClass2_Sub17_6.anInt3378 = -1;
	}

	@OriginalMember(owner = "client!rd", name = "g", descriptor = "()Z")
	public boolean method6872() {
		@Pc(3) int local3 = this.anIntArray561.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.anIntArray561[local5] >= 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!rd", name = "f", descriptor = "(I)I")
	private int method6873(@OriginalArg(0) int arg0) {
		@Pc(7) byte local7 = this.aClass2_Sub17_6.aByteArray26[this.aClass2_Sub17_6.anInt3378];
		@Pc(13) int local13;
		if (local7 < 0) {
			local13 = local7 & 0xFF;
			this.anIntArray562[arg0] = local13;
			this.aClass2_Sub17_6.anInt3378++;
		} else {
			local13 = this.anIntArray562[arg0];
		}
		if (local13 != 240 && local13 != 247) {
			return this.method6858(arg0, local13);
		}
		@Pc(42) int local42 = this.aClass2_Sub17_6.method2868();
		if (local13 == 247 && local42 > 0) {
			@Pc(57) int local57 = this.aClass2_Sub17_6.aByteArray26[this.aClass2_Sub17_6.anInt3378] & 0xFF;
			if (local57 >= 241 && local57 <= 243 || local57 == 246 || local57 == 248 || local57 >= 250 && local57 <= 252 || local57 == 254) {
				this.aClass2_Sub17_6.anInt3378++;
				this.anIntArray562[arg0] = local57;
				return this.method6858(arg0, local57);
			}
		}
		this.aClass2_Sub17_6.anInt3378 += local42;
		return 0;
	}
}
