import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bs")
public final class Class33 {

	@OriginalMember(owner = "client!bs", name = "c", descriptor = "I")
	public int anInt878;

	@OriginalMember(owner = "client!bs", name = "d", descriptor = "J")
	private long aLong27;

	@OriginalMember(owner = "client!bs", name = "e", descriptor = "[I")
	private int[] anIntArray50;

	@OriginalMember(owner = "client!bs", name = "f", descriptor = "[I")
	public int[] anIntArray51;

	@OriginalMember(owner = "client!bs", name = "g", descriptor = "I")
	private int anInt879;

	@OriginalMember(owner = "client!bs", name = "h", descriptor = "[I")
	private int[] anIntArray52;

	@OriginalMember(owner = "client!bs", name = "i", descriptor = "[I")
	private int[] anIntArray53;

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "Lclient!ha;")
	private final Class6_Sub15 aClass6_Sub15_2 = new Class6_Sub15(null);

	@OriginalMember(owner = "client!bs", name = "<init>", descriptor = "()V")
	public Class33() {
	}

	@OriginalMember(owner = "client!bs", name = "<init>", descriptor = "([B)V")
	public Class33(@OriginalArg(0) byte[] arg0) {
		this.method797(arg0);
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(I)V")
	public void method783(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.aClass6_Sub15_2.method3123();
		this.anIntArray51[arg0] += local4;
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "()V")
	public void method784() {
		this.aClass6_Sub15_2.anInt3487 = -1;
	}

	@OriginalMember(owner = "client!bs", name = "b", descriptor = "(I)J")
	public long method785(@OriginalArg(0) int arg0) {
		return this.aLong27 + (long) arg0 * (long) this.anInt879;
	}

	@OriginalMember(owner = "client!bs", name = "c", descriptor = "()I")
	public int method787() {
		@Pc(3) int local3 = this.anIntArray53.length;
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MAX_VALUE;
		for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
			if (this.anIntArray53[local9] >= 0 && this.anIntArray51[local9] < local7) {
				local5 = local9;
				local7 = this.anIntArray51[local9];
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!bs", name = "c", descriptor = "(I)I")
	private int method788(@OriginalArg(0) int arg0) {
		@Pc(7) byte local7 = this.aClass6_Sub15_2.aByteArray51[this.aClass6_Sub15_2.anInt3487];
		@Pc(13) int local13;
		if (local7 < 0) {
			local13 = local7 & 0xFF;
			this.anIntArray52[arg0] = local13;
			this.aClass6_Sub15_2.anInt3487++;
		} else {
			local13 = this.anIntArray52[arg0];
		}
		if (local13 != 240 && local13 != 247) {
			return this.method798(arg0, local13);
		}
		@Pc(42) int local42 = this.aClass6_Sub15_2.method3123();
		if (local13 == 247 && local42 > 0) {
			@Pc(57) int local57 = this.aClass6_Sub15_2.aByteArray51[this.aClass6_Sub15_2.anInt3487] & 0xFF;
			if (local57 >= 241 && local57 <= 243 || local57 == 246 || local57 == 248 || local57 >= 250 && local57 <= 252 || local57 == 254) {
				this.aClass6_Sub15_2.anInt3487++;
				this.anIntArray52[arg0] = local57;
				return this.method798(arg0, local57);
			}
		}
		this.aClass6_Sub15_2.anInt3487 += local42;
		return 0;
	}

	@OriginalMember(owner = "client!bs", name = "d", descriptor = "()I")
	public int method789() {
		return this.anIntArray53.length;
	}

	@OriginalMember(owner = "client!bs", name = "d", descriptor = "(I)I")
	public int method790(@OriginalArg(0) int arg0) {
		return this.method788(arg0);
	}

	@OriginalMember(owner = "client!bs", name = "e", descriptor = "(I)V")
	public void method791(@OriginalArg(0) int arg0) {
		this.aClass6_Sub15_2.anInt3487 = this.anIntArray53[arg0];
	}

	@OriginalMember(owner = "client!bs", name = "e", descriptor = "()V")
	public void method792() {
		this.aClass6_Sub15_2.aByteArray51 = null;
		this.anIntArray50 = null;
		this.anIntArray53 = null;
		this.anIntArray51 = null;
		this.anIntArray52 = null;
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(J)V")
	public void method793(@OriginalArg(0) long arg0) {
		this.aLong27 = arg0;
		@Pc(6) int local6 = this.anIntArray53.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			this.anIntArray51[local8] = 0;
			this.anIntArray52[local8] = 0;
			this.aClass6_Sub15_2.anInt3487 = this.anIntArray50[local8];
			this.method783(local8);
			this.anIntArray53[local8] = this.aClass6_Sub15_2.anInt3487;
		}
	}

	@OriginalMember(owner = "client!bs", name = "f", descriptor = "()Z")
	public boolean method794() {
		return this.aClass6_Sub15_2.aByteArray51 != null;
	}

	@OriginalMember(owner = "client!bs", name = "g", descriptor = "()Z")
	public boolean method795() {
		@Pc(3) int local3 = this.anIntArray53.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.anIntArray53[local5] >= 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!bs", name = "f", descriptor = "(I)V")
	public void method796(@OriginalArg(0) int arg0) {
		this.anIntArray53[arg0] = this.aClass6_Sub15_2.anInt3487;
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "([B)V")
	public void method797(@OriginalArg(0) byte[] arg0) {
		this.aClass6_Sub15_2.aByteArray51 = arg0;
		this.aClass6_Sub15_2.anInt3487 = 10;
		@Pc(12) int local12 = this.aClass6_Sub15_2.method3108();
		this.anInt878 = this.aClass6_Sub15_2.method3108();
		this.anInt879 = 500000;
		this.anIntArray50 = new int[local12];
		@Pc(27) int local27 = 0;
		@Pc(33) int local33;
		while (local27 < local12) {
			local33 = this.aClass6_Sub15_2.method3109();
			@Pc(38) int local38 = this.aClass6_Sub15_2.method3109();
			if (local33 == 1297379947) {
				this.anIntArray50[local27] = this.aClass6_Sub15_2.anInt3487;
				local27++;
			}
			this.aClass6_Sub15_2.anInt3487 += local38;
		}
		this.aLong27 = 0L;
		this.anIntArray53 = new int[local12];
		for (local33 = 0; local33 < local12; local33++) {
			this.anIntArray53[local33] = this.anIntArray50[local33];
		}
		this.anIntArray51 = new int[local12];
		this.anIntArray52 = new int[local12];
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(II)I")
	private int method798(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12;
		if (arg1 != 255) {
			@Pc(78) byte local78 = Static39.aByteArray14[arg1 - 128];
			local12 = arg1;
			if (local78 >= 1) {
				local12 = arg1 | this.aClass6_Sub15_2.method3111() << 8;
			}
			if (local78 >= 2) {
				local12 |= this.aClass6_Sub15_2.method3111() << 16;
			}
			return local12;
		}
		@Pc(7) int local7 = this.aClass6_Sub15_2.method3111();
		local12 = this.aClass6_Sub15_2.method3123();
		if (local7 == 47) {
			this.aClass6_Sub15_2.anInt3487 += local12;
			return 1;
		} else if (local7 == 81) {
			@Pc(32) int local32 = this.aClass6_Sub15_2.method3078();
			local12 -= 3;
			@Pc(38) int local38 = this.anIntArray51[arg0];
			this.aLong27 += (long) local38 * (long) (this.anInt879 - local32);
			this.anInt879 = local32;
			this.aClass6_Sub15_2.anInt3487 += local12;
			return 2;
		} else {
			this.aClass6_Sub15_2.anInt3487 += local12;
			return 3;
		}
	}
}
