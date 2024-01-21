import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gb")
public final class Class27 {

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "[I")
	private int[] anIntArray119;

	@OriginalMember(owner = "client!gb", name = "c", descriptor = "[I")
	private int[] anIntArray120;

	@OriginalMember(owner = "client!gb", name = "d", descriptor = "[I")
	public int[] anIntArray121;

	@OriginalMember(owner = "client!gb", name = "e", descriptor = "J")
	private long aLong38;

	@OriginalMember(owner = "client!gb", name = "g", descriptor = "[I")
	private int[] anIntArray122;

	@OriginalMember(owner = "client!gb", name = "h", descriptor = "I")
	public int anInt895;

	@OriginalMember(owner = "client!gb", name = "i", descriptor = "I")
	private int anInt896;

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "Lclient!mc;")
	private final Class1_Sub12 aClass1_Sub12_6 = new Class1_Sub12(null);

	@OriginalMember(owner = "client!gb", name = "<init>", descriptor = "()V")
	public Class27() {
	}

	@OriginalMember(owner = "client!gb", name = "<init>", descriptor = "([B)V")
	public Class27(@OriginalArg(0) byte[] arg0) {
		this.method664(arg0);
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(I)I")
	private int method658(@OriginalArg(0) int arg0) {
		@Pc(7) byte local7 = this.aClass1_Sub12_6.aByteArray12[this.aClass1_Sub12_6.anInt1694];
		@Pc(13) int local13;
		if (local7 < 0) {
			local13 = local7 & 0xFF;
			this.anIntArray120[arg0] = local13;
			this.aClass1_Sub12_6.anInt1694++;
		} else {
			local13 = this.anIntArray120[arg0];
		}
		if (local13 != 240 && local13 != 247) {
			return this.method669(arg0, local13);
		}
		@Pc(42) int local42 = this.aClass1_Sub12_6.method1169();
		if (local13 == 247 && local42 > 0) {
			@Pc(57) int local57 = this.aClass1_Sub12_6.aByteArray12[this.aClass1_Sub12_6.anInt1694] & 0xFF;
			if (local57 >= 241 && local57 <= 243 || local57 == 246 || local57 == 248 || local57 >= 250 && local57 <= 252 || local57 == 254) {
				this.aClass1_Sub12_6.anInt1694++;
				this.anIntArray120[arg0] = local57;
				return this.method669(arg0, local57);
			}
		}
		this.aClass1_Sub12_6.anInt1694 += local42;
		return 0;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "()Z")
	public boolean method659() {
		@Pc(3) int local3 = this.anIntArray119.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.anIntArray119[local5] >= 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(J)V")
	public void method660(@OriginalArg(0) long arg0) {
		this.aLong38 = arg0;
		@Pc(6) int local6 = this.anIntArray119.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			this.anIntArray121[local8] = 0;
			this.anIntArray120[local8] = 0;
			this.aClass1_Sub12_6.anInt1694 = this.anIntArray122[local8];
			this.method665(local8);
			this.anIntArray119[local8] = this.aClass1_Sub12_6.anInt1694;
		}
	}

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "()I")
	public int method661() {
		@Pc(3) int local3 = this.anIntArray119.length;
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MAX_VALUE;
		for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
			if (this.anIntArray119[local9] >= 0 && this.anIntArray121[local9] < local7) {
				local5 = local9;
				local7 = this.anIntArray121[local9];
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!gb", name = "c", descriptor = "()V")
	public void method662() {
		this.aClass1_Sub12_6.aByteArray12 = null;
		this.anIntArray122 = null;
		this.anIntArray119 = null;
		this.anIntArray121 = null;
		this.anIntArray120 = null;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "([B)V")
	public void method664(@OriginalArg(0) byte[] arg0) {
		this.aClass1_Sub12_6.aByteArray12 = arg0;
		this.aClass1_Sub12_6.anInt1694 = 10;
		@Pc(12) int local12 = this.aClass1_Sub12_6.method1176();
		this.anInt895 = this.aClass1_Sub12_6.method1176();
		this.anInt896 = 500000;
		this.anIntArray122 = new int[local12];
		@Pc(27) int local27 = 0;
		@Pc(33) int local33;
		while (local27 < local12) {
			local33 = this.aClass1_Sub12_6.method1210();
			@Pc(38) int local38 = this.aClass1_Sub12_6.method1210();
			if (local33 == 1297379947) {
				this.anIntArray122[local27] = this.aClass1_Sub12_6.anInt1694;
				local27++;
			}
			this.aClass1_Sub12_6.anInt1694 += local38;
		}
		this.aLong38 = 0L;
		this.anIntArray119 = new int[local12];
		for (local33 = 0; local33 < local12; local33++) {
			this.anIntArray119[local33] = this.anIntArray122[local33];
		}
		this.anIntArray121 = new int[local12];
		this.anIntArray120 = new int[local12];
	}

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "(I)V")
	public void method665(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.aClass1_Sub12_6.method1169();
		this.anIntArray121[arg0] += local4;
	}

	@OriginalMember(owner = "client!gb", name = "e", descriptor = "()I")
	public int method666() {
		return this.anIntArray119.length;
	}

	@OriginalMember(owner = "client!gb", name = "c", descriptor = "(I)V")
	public void method667(@OriginalArg(0) int arg0) {
		this.aClass1_Sub12_6.anInt1694 = this.anIntArray119[arg0];
	}

	@OriginalMember(owner = "client!gb", name = "f", descriptor = "()V")
	public void method668() {
		this.aClass1_Sub12_6.anInt1694 = -1;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(II)I")
	private int method669(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12;
		if (arg1 != 255) {
			@Pc(78) byte local78 = Static37.aByteArray6[arg1 - 128];
			local12 = arg1;
			if (local78 >= 1) {
				local12 = arg1 | this.aClass1_Sub12_6.method1190() << 8;
			}
			if (local78 >= 2) {
				local12 |= this.aClass1_Sub12_6.method1190() << 16;
			}
			return local12;
		}
		@Pc(7) int local7 = this.aClass1_Sub12_6.method1190();
		local12 = this.aClass1_Sub12_6.method1169();
		if (local7 == 47) {
			this.aClass1_Sub12_6.anInt1694 += local12;
			return 1;
		} else if (local7 == 81) {
			@Pc(32) int local32 = this.aClass1_Sub12_6.method1215();
			local12 -= 3;
			@Pc(38) int local38 = this.anIntArray121[arg0];
			this.aLong38 += (long) local38 * (long) (this.anInt896 - local32);
			this.anInt896 = local32;
			this.aClass1_Sub12_6.anInt1694 += local12;
			return 2;
		} else {
			this.aClass1_Sub12_6.anInt1694 += local12;
			return 3;
		}
	}

	@OriginalMember(owner = "client!gb", name = "d", descriptor = "(I)I")
	public int method670(@OriginalArg(0) int arg0) {
		return this.method658(arg0);
	}

	@OriginalMember(owner = "client!gb", name = "e", descriptor = "(I)V")
	public void method671(@OriginalArg(0) int arg0) {
		this.anIntArray119[arg0] = this.aClass1_Sub12_6.anInt1694;
	}

	@OriginalMember(owner = "client!gb", name = "g", descriptor = "()Z")
	public boolean method672() {
		return this.aClass1_Sub12_6.aByteArray12 != null;
	}

	@OriginalMember(owner = "client!gb", name = "f", descriptor = "(I)J")
	public long method673(@OriginalArg(0) int arg0) {
		return this.aLong38 + (long) arg0 * (long) this.anInt896;
	}
}
