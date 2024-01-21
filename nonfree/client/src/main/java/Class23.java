import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ec")
public final class Class23 {

	@OriginalMember(owner = "client!ec", name = "c", descriptor = "I")
	public int anInt748;

	@OriginalMember(owner = "client!ec", name = "d", descriptor = "[I")
	public int[] anIntArray154;

	@OriginalMember(owner = "client!ec", name = "e", descriptor = "I")
	private int anInt749;

	@OriginalMember(owner = "client!ec", name = "f", descriptor = "J")
	private long aLong55;

	@OriginalMember(owner = "client!ec", name = "g", descriptor = "[I")
	private int[] anIntArray155;

	@OriginalMember(owner = "client!ec", name = "h", descriptor = "[I")
	private int[] anIntArray156;

	@OriginalMember(owner = "client!ec", name = "i", descriptor = "[I")
	private int[] anIntArray157;

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "Lclient!dc;")
	private final Class1_Sub5 aClass1_Sub5_17 = new Class1_Sub5(null);

	@OriginalMember(owner = "client!ec", name = "<init>", descriptor = "()V")
	public Class23() {
	}

	@OriginalMember(owner = "client!ec", name = "<init>", descriptor = "([B)V")
	public Class23(@OriginalArg(0) byte[] arg0) {
		this.method618(arg0);
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(I)V")
	public void method607(@OriginalArg(0) int arg0) {
		this.aClass1_Sub5_17.anInt792 = this.anIntArray155[arg0];
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "()Z")
	public boolean method608() {
		return this.aClass1_Sub5_17.aByteArray13 != null;
	}

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "(I)V")
	public void method609(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.aClass1_Sub5_17.method644();
		this.anIntArray154[arg0] += local4;
	}

	@OriginalMember(owner = "client!ec", name = "c", descriptor = "(I)J")
	public long method610(@OriginalArg(0) int arg0) {
		return this.aLong55 + (long) arg0 * (long) this.anInt749;
	}

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "()I")
	public int method611() {
		@Pc(3) int local3 = this.anIntArray155.length;
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MAX_VALUE;
		for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
			if (this.anIntArray155[local9] >= 0 && this.anIntArray154[local9] < local7) {
				local5 = local9;
				local7 = this.anIntArray154[local9];
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!ec", name = "d", descriptor = "(I)I")
	public int method612(@OriginalArg(0) int arg0) {
		return this.method622(arg0);
	}

	@OriginalMember(owner = "client!ec", name = "c", descriptor = "()Z")
	public boolean method613() {
		@Pc(3) int local3 = this.anIntArray155.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.anIntArray155[local5] >= 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ec", name = "d", descriptor = "()V")
	public void method614() {
		this.aClass1_Sub5_17.anInt792 = -1;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(J)V")
	public void method615(@OriginalArg(0) long arg0) {
		this.aLong55 = arg0;
		@Pc(6) int local6 = this.anIntArray155.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			this.anIntArray154[local8] = 0;
			this.anIntArray156[local8] = 0;
			this.aClass1_Sub5_17.anInt792 = this.anIntArray157[local8];
			this.method609(local8);
			this.anIntArray155[local8] = this.aClass1_Sub5_17.anInt792;
		}
	}

	@OriginalMember(owner = "client!ec", name = "e", descriptor = "(I)V")
	public void method616(@OriginalArg(0) int arg0) {
		this.anIntArray155[arg0] = this.aClass1_Sub5_17.anInt792;
	}

	@OriginalMember(owner = "client!ec", name = "e", descriptor = "()V")
	public void method617() {
		this.aClass1_Sub5_17.aByteArray13 = null;
		this.anIntArray157 = null;
		this.anIntArray155 = null;
		this.anIntArray154 = null;
		this.anIntArray156 = null;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "([B)V")
	public void method618(@OriginalArg(0) byte[] arg0) {
		this.aClass1_Sub5_17.aByteArray13 = arg0;
		this.aClass1_Sub5_17.anInt792 = 10;
		@Pc(12) int local12 = this.aClass1_Sub5_17.method651();
		this.anInt748 = this.aClass1_Sub5_17.method651();
		this.anInt749 = 500000;
		this.anIntArray157 = new int[local12];
		@Pc(27) int local27 = 0;
		@Pc(33) int local33;
		while (local27 < local12) {
			local33 = this.aClass1_Sub5_17.method663();
			@Pc(38) int local38 = this.aClass1_Sub5_17.method663();
			if (local33 == 1297379947) {
				this.anIntArray157[local27] = this.aClass1_Sub5_17.anInt792;
				local27++;
			}
			this.aClass1_Sub5_17.anInt792 += local38;
		}
		this.aLong55 = 0L;
		this.anIntArray155 = new int[local12];
		for (local33 = 0; local33 < local12; local33++) {
			this.anIntArray155[local33] = this.anIntArray157[local33];
		}
		this.anIntArray154 = new int[local12];
		this.anIntArray156 = new int[local12];
	}

	@OriginalMember(owner = "client!ec", name = "g", descriptor = "()I")
	public int method620() {
		return this.anIntArray155.length;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(II)I")
	private int method621(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12;
		if (arg1 != 255) {
			@Pc(78) byte local78 = Static29.aByteArray12[arg1 - 128];
			local12 = arg1;
			if (local78 >= 1) {
				local12 = arg1 | this.aClass1_Sub5_17.method672() << 8;
			}
			if (local78 >= 2) {
				local12 |= this.aClass1_Sub5_17.method672() << 16;
			}
			return local12;
		}
		@Pc(7) int local7 = this.aClass1_Sub5_17.method672();
		local12 = this.aClass1_Sub5_17.method644();
		if (local7 == 47) {
			this.aClass1_Sub5_17.anInt792 += local12;
			return 1;
		} else if (local7 == 81) {
			@Pc(32) int local32 = this.aClass1_Sub5_17.method660();
			local12 -= 3;
			@Pc(38) int local38 = this.anIntArray154[arg0];
			this.aLong55 += (long) local38 * (long) (this.anInt749 - local32);
			this.anInt749 = local32;
			this.aClass1_Sub5_17.anInt792 += local12;
			return 2;
		} else {
			this.aClass1_Sub5_17.anInt792 += local12;
			return 3;
		}
	}

	@OriginalMember(owner = "client!ec", name = "f", descriptor = "(I)I")
	private int method622(@OriginalArg(0) int arg0) {
		@Pc(7) byte local7 = this.aClass1_Sub5_17.aByteArray13[this.aClass1_Sub5_17.anInt792];
		@Pc(13) int local13;
		if (local7 < 0) {
			local13 = local7 & 0xFF;
			this.anIntArray156[arg0] = local13;
			this.aClass1_Sub5_17.anInt792++;
		} else {
			local13 = this.anIntArray156[arg0];
		}
		if (local13 != 240 && local13 != 247) {
			return this.method621(arg0, local13);
		}
		@Pc(42) int local42 = this.aClass1_Sub5_17.method644();
		if (local13 == 247 && local42 > 0) {
			@Pc(57) int local57 = this.aClass1_Sub5_17.aByteArray13[this.aClass1_Sub5_17.anInt792] & 0xFF;
			if (local57 >= 241 && local57 <= 243 || local57 == 246 || local57 == 248 || local57 >= 250 && local57 <= 252 || local57 == 254) {
				this.aClass1_Sub5_17.anInt792++;
				this.anIntArray156[arg0] = local57;
				return this.method621(arg0, local57);
			}
		}
		this.aClass1_Sub5_17.anInt792 += local42;
		return 0;
	}
}
