import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dk")
public final class Class54 {

	@OriginalMember(owner = "client!dk", name = "c", descriptor = "[I")
	private int[] anIntArray95;

	@OriginalMember(owner = "client!dk", name = "d", descriptor = "I")
	public int anInt1095;

	@OriginalMember(owner = "client!dk", name = "e", descriptor = "[I")
	public int[] anIntArray96;

	@OriginalMember(owner = "client!dk", name = "f", descriptor = "[I")
	private int[] anIntArray97;

	@OriginalMember(owner = "client!dk", name = "g", descriptor = "I")
	private int anInt1096;

	@OriginalMember(owner = "client!dk", name = "h", descriptor = "[I")
	private int[] anIntArray98;

	@OriginalMember(owner = "client!dk", name = "i", descriptor = "J")
	private long aLong39;

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "Lclient!ef;")
	private final Class2_Sub12 aClass2_Sub12_1 = new Class2_Sub12(null);

	@OriginalMember(owner = "client!dk", name = "<init>", descriptor = "()V")
	public Class54() {
	}

	@OriginalMember(owner = "client!dk", name = "<init>", descriptor = "([B)V")
	public Class54(@OriginalArg(0) byte[] arg0) {
		this.method1289(arg0);
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(I)I")
	private int method1280(@OriginalArg(0) int arg0) {
		@Pc(7) byte local7 = this.aClass2_Sub12_1.aByteArray30[this.aClass2_Sub12_1.anInt3606];
		@Pc(13) int local13;
		if (local7 < 0) {
			local13 = local7 & 0xFF;
			this.anIntArray95[arg0] = local13;
			this.aClass2_Sub12_1.anInt3606++;
		} else {
			local13 = this.anIntArray95[arg0];
		}
		if (local13 != 240 && local13 != 247) {
			return this.method1292(arg0, local13);
		}
		@Pc(42) int local42 = this.aClass2_Sub12_1.method3134();
		if (local13 == 247 && local42 > 0) {
			@Pc(57) int local57 = this.aClass2_Sub12_1.aByteArray30[this.aClass2_Sub12_1.anInt3606] & 0xFF;
			if (local57 >= 241 && local57 <= 243 || local57 == 246 || local57 == 248 || local57 >= 250 && local57 <= 252 || local57 == 254) {
				this.aClass2_Sub12_1.anInt3606++;
				this.anIntArray95[arg0] = local57;
				return this.method1292(arg0, local57);
			}
		}
		this.aClass2_Sub12_1.anInt3606 += local42;
		return 0;
	}

	@OriginalMember(owner = "client!dk", name = "b", descriptor = "(I)V")
	public void method1281(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.aClass2_Sub12_1.method3134();
		this.anIntArray96[arg0] += local4;
	}

	@OriginalMember(owner = "client!dk", name = "c", descriptor = "(I)V")
	public void method1282(@OriginalArg(0) int arg0) {
		this.aClass2_Sub12_1.anInt3606 = this.anIntArray98[arg0];
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "()V")
	public void method1283() {
		this.aClass2_Sub12_1.aByteArray30 = null;
		this.anIntArray97 = null;
		this.anIntArray98 = null;
		this.anIntArray96 = null;
		this.anIntArray95 = null;
	}

	@OriginalMember(owner = "client!dk", name = "d", descriptor = "(I)J")
	public long method1285(@OriginalArg(0) int arg0) {
		return this.aLong39 + (long) arg0 * (long) this.anInt1096;
	}

	@OriginalMember(owner = "client!dk", name = "e", descriptor = "(I)I")
	public int method1286(@OriginalArg(0) int arg0) {
		return this.method1280(arg0);
	}

	@OriginalMember(owner = "client!dk", name = "f", descriptor = "(I)V")
	public void method1287(@OriginalArg(0) int arg0) {
		this.anIntArray98[arg0] = this.aClass2_Sub12_1.anInt3606;
	}

	@OriginalMember(owner = "client!dk", name = "c", descriptor = "()V")
	public void method1288() {
		this.aClass2_Sub12_1.anInt3606 = -1;
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "([B)V")
	public void method1289(@OriginalArg(0) byte[] arg0) {
		this.aClass2_Sub12_1.aByteArray30 = arg0;
		this.aClass2_Sub12_1.anInt3606 = 10;
		@Pc(12) int local12 = this.aClass2_Sub12_1.method3104();
		this.anInt1095 = this.aClass2_Sub12_1.method3104();
		this.anInt1096 = 500000;
		this.anIntArray97 = new int[local12];
		@Pc(27) int local27 = 0;
		@Pc(33) int local33;
		while (local27 < local12) {
			local33 = this.aClass2_Sub12_1.method3135();
			@Pc(38) int local38 = this.aClass2_Sub12_1.method3135();
			if (local33 == 1297379947) {
				this.anIntArray97[local27] = this.aClass2_Sub12_1.anInt3606;
				local27++;
			}
			this.aClass2_Sub12_1.anInt3606 += local38;
		}
		this.aLong39 = 0L;
		this.anIntArray98 = new int[local12];
		for (local33 = 0; local33 < local12; local33++) {
			this.anIntArray98[local33] = this.anIntArray97[local33];
		}
		this.anIntArray96 = new int[local12];
		this.anIntArray95 = new int[local12];
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(J)V")
	public void method1290(@OriginalArg(0) long arg0) {
		this.aLong39 = arg0;
		@Pc(6) int local6 = this.anIntArray98.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			this.anIntArray96[local8] = 0;
			this.anIntArray95[local8] = 0;
			this.aClass2_Sub12_1.anInt3606 = this.anIntArray97[local8];
			this.method1281(local8);
			this.anIntArray98[local8] = this.aClass2_Sub12_1.anInt3606;
		}
	}

	@OriginalMember(owner = "client!dk", name = "d", descriptor = "()I")
	public int method1291() {
		@Pc(3) int local3 = this.anIntArray98.length;
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MAX_VALUE;
		for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
			if (this.anIntArray98[local9] >= 0 && this.anIntArray96[local9] < local7) {
				local5 = local9;
				local7 = this.anIntArray96[local9];
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(II)I")
	private int method1292(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12;
		if (arg1 != 255) {
			@Pc(78) byte local78 = Static61.aByteArray12[arg1 - 128];
			local12 = arg1;
			if (local78 >= 1) {
				local12 = arg1 | this.aClass2_Sub12_1.method3124() << 8;
			}
			if (local78 >= 2) {
				local12 |= this.aClass2_Sub12_1.method3124() << 16;
			}
			return local12;
		}
		@Pc(7) int local7 = this.aClass2_Sub12_1.method3124();
		local12 = this.aClass2_Sub12_1.method3134();
		if (local7 == 47) {
			this.aClass2_Sub12_1.anInt3606 += local12;
			return 1;
		} else if (local7 == 81) {
			@Pc(32) int local32 = this.aClass2_Sub12_1.method3163();
			local12 -= 3;
			@Pc(38) int local38 = this.anIntArray96[arg0];
			this.aLong39 += (long) local38 * (long) (this.anInt1096 - local32);
			this.anInt1096 = local32;
			this.aClass2_Sub12_1.anInt3606 += local12;
			return 2;
		} else {
			this.aClass2_Sub12_1.anInt3606 += local12;
			return 3;
		}
	}

	@OriginalMember(owner = "client!dk", name = "e", descriptor = "()Z")
	public boolean method1293() {
		@Pc(3) int local3 = this.anIntArray98.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.anIntArray98[local5] >= 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!dk", name = "f", descriptor = "()I")
	public int method1294() {
		return this.anIntArray98.length;
	}

	@OriginalMember(owner = "client!dk", name = "g", descriptor = "()Z")
	public boolean method1295() {
		return this.aClass2_Sub12_1.aByteArray30 != null;
	}
}
