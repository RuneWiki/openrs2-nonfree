import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dg")
public final class Class29 {

	@OriginalMember(owner = "client!dg", name = "c", descriptor = "[I")
	private int[] anIntArray100;

	@OriginalMember(owner = "client!dg", name = "d", descriptor = "[I")
	public int[] anIntArray101;

	@OriginalMember(owner = "client!dg", name = "e", descriptor = "[I")
	private int[] anIntArray102;

	@OriginalMember(owner = "client!dg", name = "f", descriptor = "J")
	private long aLong44;

	@OriginalMember(owner = "client!dg", name = "g", descriptor = "[I")
	private int[] anIntArray103;

	@OriginalMember(owner = "client!dg", name = "h", descriptor = "I")
	public int anInt1106;

	@OriginalMember(owner = "client!dg", name = "i", descriptor = "I")
	private int anInt1107;

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "Lclient!cg;")
	private Class1_Sub11 aClass1_Sub11_1 = new Class1_Sub11(null);

	@OriginalMember(owner = "client!dg", name = "<init>", descriptor = "()V")
	public Class29() {
	}

	@OriginalMember(owner = "client!dg", name = "<init>", descriptor = "([B)V")
	public Class29(@OriginalArg(0) byte[] arg0) {
		this.method915(arg0);
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "()I")
	public int method912() {
		return this.anIntArray100.length;
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(I)V")
	public void method914(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.aClass1_Sub11_1.method2650();
		this.anIntArray101[arg0] += local4;
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "([B)V")
	public void method915(@OriginalArg(0) byte[] arg0) {
		this.aClass1_Sub11_1.aByteArray47 = arg0;
		this.aClass1_Sub11_1.anInt3264 = 10;
		@Pc(12) int local12 = this.aClass1_Sub11_1.method2691();
		this.anInt1106 = this.aClass1_Sub11_1.method2691();
		this.anInt1107 = 500000;
		this.anIntArray102 = new int[local12];
		@Pc(27) int local27 = 0;
		while (local27 < local12) {
			@Pc(35) int local35 = this.aClass1_Sub11_1.method2643();
			@Pc(40) int local40 = this.aClass1_Sub11_1.method2643();
			if (local35 == 1297379947) {
				this.anIntArray102[local27] = this.aClass1_Sub11_1.anInt3264;
				local27++;
			}
			this.aClass1_Sub11_1.anInt3264 += local40;
		}
		this.aLong44 = 0L;
		this.anIntArray100 = new int[local12];
		for (local27 = 0; local27 < local12; local27++) {
			this.anIntArray100[local27] = this.anIntArray102[local27];
		}
		this.anIntArray101 = new int[local12];
		this.anIntArray103 = new int[local12];
	}

	@OriginalMember(owner = "client!dg", name = "c", descriptor = "()Z")
	public boolean method916() {
		return this.aClass1_Sub11_1.aByteArray47 != null;
	}

	@OriginalMember(owner = "client!dg", name = "b", descriptor = "(I)J")
	public long method917(@OriginalArg(0) int arg0) {
		return this.aLong44 + (long) arg0 * (long) this.anInt1107;
	}

	@OriginalMember(owner = "client!dg", name = "c", descriptor = "(I)I")
	private int method918(@OriginalArg(0) int arg0) {
		@Pc(7) byte local7 = this.aClass1_Sub11_1.aByteArray47[this.aClass1_Sub11_1.anInt3264];
		@Pc(13) int local13;
		if (local7 < 0) {
			local13 = local7 & 0xFF;
			this.anIntArray103[arg0] = local13;
			this.aClass1_Sub11_1.anInt3264++;
		} else {
			local13 = this.anIntArray103[arg0];
		}
		if (local13 != 240 && local13 != 247) {
			return this.method920(arg0, local13);
		}
		@Pc(42) int local42 = this.aClass1_Sub11_1.method2650();
		if (local13 == 247 && local42 > 0) {
			@Pc(57) int local57 = this.aClass1_Sub11_1.aByteArray47[this.aClass1_Sub11_1.anInt3264] & 0xFF;
			if (local57 >= 241 && local57 <= 243 || local57 == 246 || local57 == 248 || local57 >= 250 && local57 <= 252 || local57 == 254) {
				this.aClass1_Sub11_1.anInt3264++;
				this.anIntArray103[arg0] = local57;
				return this.method920(arg0, local57);
			}
		}
		this.aClass1_Sub11_1.anInt3264 += local42;
		return 0;
	}

	@OriginalMember(owner = "client!dg", name = "d", descriptor = "()V")
	public void method919() {
		this.aClass1_Sub11_1.aByteArray47 = null;
		this.anIntArray102 = null;
		this.anIntArray100 = null;
		this.anIntArray101 = null;
		this.anIntArray103 = null;
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(II)I")
	private int method920(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12;
		if (arg1 != 255) {
			@Pc(78) byte local78 = Static46.aByteArray16[arg1 - 128];
			local12 = arg1;
			if (local78 >= 1) {
				local12 = arg1 | this.aClass1_Sub11_1.method2690() << 8;
			}
			if (local78 >= 2) {
				local12 |= this.aClass1_Sub11_1.method2690() << 16;
			}
			return local12;
		}
		@Pc(7) int local7 = this.aClass1_Sub11_1.method2690();
		local12 = this.aClass1_Sub11_1.method2650();
		if (local7 == 47) {
			this.aClass1_Sub11_1.anInt3264 += local12;
			return 1;
		} else if (local7 == 81) {
			@Pc(32) int local32 = this.aClass1_Sub11_1.method2681();
			local12 -= 3;
			@Pc(38) int local38 = this.anIntArray101[arg0];
			this.aLong44 += (long) local38 * (long) (this.anInt1107 - local32);
			this.anInt1107 = local32;
			this.aClass1_Sub11_1.anInt3264 += local12;
			return 2;
		} else {
			this.aClass1_Sub11_1.anInt3264 += local12;
			return 3;
		}
	}

	@OriginalMember(owner = "client!dg", name = "e", descriptor = "()I")
	public int method921() {
		@Pc(3) int local3 = this.anIntArray100.length;
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MAX_VALUE;
		for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
			if (this.anIntArray100[local9] >= 0 && this.anIntArray101[local9] < local7) {
				local5 = local9;
				local7 = this.anIntArray101[local9];
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!dg", name = "d", descriptor = "(I)V")
	public void method922(@OriginalArg(0) int arg0) {
		this.aClass1_Sub11_1.anInt3264 = this.anIntArray100[arg0];
	}

	@OriginalMember(owner = "client!dg", name = "f", descriptor = "()Z")
	public boolean method923() {
		@Pc(3) int local3 = this.anIntArray100.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.anIntArray100[local5] >= 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!dg", name = "e", descriptor = "(I)V")
	public void method924(@OriginalArg(0) int arg0) {
		this.anIntArray100[arg0] = this.aClass1_Sub11_1.anInt3264;
	}

	@OriginalMember(owner = "client!dg", name = "f", descriptor = "(I)I")
	public int method925(@OriginalArg(0) int arg0) {
		return this.method918(arg0);
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(J)V")
	public void method926(@OriginalArg(0) long arg0) {
		this.aLong44 = arg0;
		@Pc(6) int local6 = this.anIntArray100.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			this.anIntArray101[local8] = 0;
			this.anIntArray103[local8] = 0;
			this.aClass1_Sub11_1.anInt3264 = this.anIntArray102[local8];
			this.method914(local8);
			this.anIntArray100[local8] = this.aClass1_Sub11_1.anInt3264;
		}
	}

	@OriginalMember(owner = "client!dg", name = "g", descriptor = "()V")
	public void method927() {
		this.aClass1_Sub11_1.anInt3264 = -1;
	}
}
