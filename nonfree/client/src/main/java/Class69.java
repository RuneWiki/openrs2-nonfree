import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!u")
public final class Class69 {

	@OriginalMember(owner = "client!u", name = "c", descriptor = "J")
	private long aLong85;

	@OriginalMember(owner = "client!u", name = "d", descriptor = "[I")
	public int[] anIntArray346;

	@OriginalMember(owner = "client!u", name = "e", descriptor = "I")
	private int anInt3001;

	@OriginalMember(owner = "client!u", name = "f", descriptor = "[I")
	private int[] anIntArray347;

	@OriginalMember(owner = "client!u", name = "g", descriptor = "I")
	public int anInt3002;

	@OriginalMember(owner = "client!u", name = "h", descriptor = "[I")
	private int[] anIntArray348;

	@OriginalMember(owner = "client!u", name = "i", descriptor = "[I")
	private int[] anIntArray349;

	@OriginalMember(owner = "client!u", name = "b", descriptor = "Lclient!bf;")
	private final Class6_Sub4 aClass6_Sub4_7 = new Class6_Sub4(null);

	@OriginalMember(owner = "client!u", name = "<init>", descriptor = "()V")
	public Class69() {
	}

	@OriginalMember(owner = "client!u", name = "<init>", descriptor = "([B)V")
	public Class69(@OriginalArg(0) byte[] arg0) {
		this.method2010(arg0);
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "()I")
	public int method2005() {
		@Pc(3) int local3 = this.anIntArray349.length;
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MAX_VALUE;
		for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
			if (this.anIntArray349[local9] >= 0 && this.anIntArray346[local9] < local7) {
				local5 = local9;
				local7 = this.anIntArray346[local9];
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(I)J")
	public long method2006(@OriginalArg(0) int arg0) {
		return this.aLong85 + (long) arg0 * (long) this.anInt3001;
	}

	@OriginalMember(owner = "client!u", name = "b", descriptor = "(I)V")
	public void method2007(@OriginalArg(0) int arg0) {
		this.aClass6_Sub4_7.anInt1949 = this.anIntArray349[arg0];
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(J)V")
	public void method2008(@OriginalArg(0) long arg0) {
		this.aLong85 = arg0;
		@Pc(6) int local6 = this.anIntArray349.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			this.anIntArray346[local8] = 0;
			this.anIntArray347[local8] = 0;
			this.aClass6_Sub4_7.anInt1949 = this.anIntArray348[local8];
			this.method2009(local8);
			this.anIntArray349[local8] = this.aClass6_Sub4_7.anInt1949;
		}
	}

	@OriginalMember(owner = "client!u", name = "c", descriptor = "(I)V")
	public void method2009(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.aClass6_Sub4_7.method1320();
		this.anIntArray346[arg0] += local4;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "([B)V")
	public void method2010(@OriginalArg(0) byte[] arg0) {
		this.aClass6_Sub4_7.aByteArray27 = arg0;
		this.aClass6_Sub4_7.anInt1949 = 10;
		@Pc(12) int local12 = this.aClass6_Sub4_7.method1306();
		this.anInt3002 = this.aClass6_Sub4_7.method1306();
		this.anInt3001 = 500000;
		this.anIntArray348 = new int[local12];
		@Pc(27) int local27 = 0;
		@Pc(33) int local33;
		while (local27 < local12) {
			local33 = this.aClass6_Sub4_7.method1289();
			@Pc(38) int local38 = this.aClass6_Sub4_7.method1289();
			if (local33 == 1297379947) {
				this.anIntArray348[local27] = this.aClass6_Sub4_7.anInt1949;
				local27++;
			}
			this.aClass6_Sub4_7.anInt1949 += local38;
		}
		this.aLong85 = 0L;
		this.anIntArray349 = new int[local12];
		for (local33 = 0; local33 < local12; local33++) {
			this.anIntArray349[local33] = this.anIntArray348[local33];
		}
		this.anIntArray346 = new int[local12];
		this.anIntArray347 = new int[local12];
	}

	@OriginalMember(owner = "client!u", name = "b", descriptor = "()I")
	public int method2011() {
		return this.anIntArray349.length;
	}

	@OriginalMember(owner = "client!u", name = "c", descriptor = "()V")
	public void method2012() {
		this.aClass6_Sub4_7.aByteArray27 = null;
		this.anIntArray348 = null;
		this.anIntArray349 = null;
		this.anIntArray346 = null;
		this.anIntArray347 = null;
	}

	@OriginalMember(owner = "client!u", name = "d", descriptor = "(I)I")
	private int method2013(@OriginalArg(0) int arg0) {
		@Pc(7) byte local7 = this.aClass6_Sub4_7.aByteArray27[this.aClass6_Sub4_7.anInt1949];
		@Pc(13) int local13;
		if (local7 < 0) {
			local13 = local7 & 0xFF;
			this.anIntArray347[arg0] = local13;
			this.aClass6_Sub4_7.anInt1949++;
		} else {
			local13 = this.anIntArray347[arg0];
		}
		if (local13 != 240 && local13 != 247) {
			return this.method2017(arg0, local13);
		}
		@Pc(42) int local42 = this.aClass6_Sub4_7.method1320();
		if (local13 == 247 && local42 > 0) {
			@Pc(57) int local57 = this.aClass6_Sub4_7.aByteArray27[this.aClass6_Sub4_7.anInt1949] & 0xFF;
			if (local57 >= 241 && local57 <= 243 || local57 == 246 || local57 == 248 || local57 >= 250 && local57 <= 252 || local57 == 254) {
				this.aClass6_Sub4_7.anInt1949++;
				this.anIntArray347[arg0] = local57;
				return this.method2017(arg0, local57);
			}
		}
		this.aClass6_Sub4_7.anInt1949 += local42;
		return 0;
	}

	@OriginalMember(owner = "client!u", name = "e", descriptor = "(I)V")
	public void method2014(@OriginalArg(0) int arg0) {
		this.anIntArray349[arg0] = this.aClass6_Sub4_7.anInt1949;
	}

	@OriginalMember(owner = "client!u", name = "d", descriptor = "()Z")
	public boolean method2015() {
		return this.aClass6_Sub4_7.aByteArray27 != null;
	}

	@OriginalMember(owner = "client!u", name = "e", descriptor = "()Z")
	public boolean method2016() {
		@Pc(3) int local3 = this.anIntArray349.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.anIntArray349[local5] >= 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(II)I")
	private int method2017(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12;
		if (arg1 != 255) {
			@Pc(78) byte local78 = Static108.aByteArray35[arg1 - 128];
			local12 = arg1;
			if (local78 >= 1) {
				local12 = arg1 | this.aClass6_Sub4_7.method1321() << 8;
			}
			if (local78 >= 2) {
				local12 |= this.aClass6_Sub4_7.method1321() << 16;
			}
			return local12;
		}
		@Pc(7) int local7 = this.aClass6_Sub4_7.method1321();
		local12 = this.aClass6_Sub4_7.method1320();
		if (local7 == 47) {
			this.aClass6_Sub4_7.anInt1949 += local12;
			return 1;
		} else if (local7 == 81) {
			@Pc(32) int local32 = this.aClass6_Sub4_7.method1290();
			local12 -= 3;
			@Pc(38) int local38 = this.anIntArray346[arg0];
			this.aLong85 += (long) local38 * (long) (this.anInt3001 - local32);
			this.anInt3001 = local32;
			this.aClass6_Sub4_7.anInt1949 += local12;
			return 2;
		} else {
			this.aClass6_Sub4_7.anInt1949 += local12;
			return 3;
		}
	}

	@OriginalMember(owner = "client!u", name = "f", descriptor = "(I)I")
	public int method2019(@OriginalArg(0) int arg0) {
		return this.method2013(arg0);
	}

	@OriginalMember(owner = "client!u", name = "g", descriptor = "()V")
	public void method2020() {
		this.aClass6_Sub4_7.anInt1949 = -1;
	}
}
