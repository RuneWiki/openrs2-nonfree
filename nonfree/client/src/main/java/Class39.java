import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fh")
public final class Class39 {

	@OriginalMember(owner = "client!fh", name = "b", descriptor = "[I")
	private int[] anIntArray216;

	@OriginalMember(owner = "client!fh", name = "c", descriptor = "J")
	private long aLong53;

	@OriginalMember(owner = "client!fh", name = "e", descriptor = "[I")
	private int[] anIntArray217;

	@OriginalMember(owner = "client!fh", name = "f", descriptor = "[I")
	public int[] anIntArray218;

	@OriginalMember(owner = "client!fh", name = "g", descriptor = "I")
	public int anInt1233;

	@OriginalMember(owner = "client!fh", name = "h", descriptor = "I")
	private int anInt1234;

	@OriginalMember(owner = "client!fh", name = "i", descriptor = "[I")
	private int[] anIntArray219;

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "Lclient!nh;")
	private Class2_Sub23 aClass2_Sub23_4 = new Class2_Sub23(null);

	@OriginalMember(owner = "client!fh", name = "<init>", descriptor = "()V")
	public Class39() {
	}

	@OriginalMember(owner = "client!fh", name = "<init>", descriptor = "([B)V")
	public Class39(@OriginalArg(0) byte[] arg0) {
		this.method1009(arg0);
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(J)V")
	public void method1007(@OriginalArg(0) long arg0) {
		this.aLong53 = arg0;
		@Pc(6) int local6 = this.anIntArray219.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			this.anIntArray218[local8] = 0;
			this.anIntArray217[local8] = 0;
			this.aClass2_Sub23_4.anInt2703 = this.anIntArray216[local8];
			this.method1016(local8);
			this.anIntArray219[local8] = this.aClass2_Sub23_4.anInt2703;
		}
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "()V")
	public void method1008() {
		this.aClass2_Sub23_4.anInt2703 = -1;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "([B)V")
	public void method1009(@OriginalArg(0) byte[] arg0) {
		this.aClass2_Sub23_4.aByteArray41 = arg0;
		this.aClass2_Sub23_4.anInt2703 = 10;
		@Pc(12) int local12 = this.aClass2_Sub23_4.method2095();
		this.anInt1233 = this.aClass2_Sub23_4.method2095();
		this.anInt1234 = 500000;
		this.anIntArray216 = new int[local12];
		@Pc(27) int local27 = 0;
		@Pc(33) int local33;
		while (local27 < local12) {
			local33 = this.aClass2_Sub23_4.method2133();
			@Pc(38) int local38 = this.aClass2_Sub23_4.method2133();
			if (local33 == 1297379947) {
				this.anIntArray216[local27] = this.aClass2_Sub23_4.anInt2703;
				local27++;
			}
			this.aClass2_Sub23_4.anInt2703 += local38;
		}
		this.aLong53 = 0L;
		this.anIntArray219 = new int[local12];
		for (local33 = 0; local33 < local12; local33++) {
			this.anIntArray219[local33] = this.anIntArray216[local33];
		}
		this.anIntArray218 = new int[local12];
		this.anIntArray217 = new int[local12];
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(I)V")
	public void method1010(@OriginalArg(0) int arg0) {
		this.aClass2_Sub23_4.anInt2703 = this.anIntArray219[arg0];
	}

	@OriginalMember(owner = "client!fh", name = "b", descriptor = "()V")
	public void method1011() {
		this.aClass2_Sub23_4.aByteArray41 = null;
		this.anIntArray216 = null;
		this.anIntArray219 = null;
		this.anIntArray218 = null;
		this.anIntArray217 = null;
	}

	@OriginalMember(owner = "client!fh", name = "b", descriptor = "(I)I")
	public int method1013(@OriginalArg(0) int arg0) {
		return this.method1021(arg0);
	}

	@OriginalMember(owner = "client!fh", name = "c", descriptor = "(I)V")
	public void method1014(@OriginalArg(0) int arg0) {
		this.anIntArray219[arg0] = this.aClass2_Sub23_4.anInt2703;
	}

	@OriginalMember(owner = "client!fh", name = "d", descriptor = "()I")
	public int method1015() {
		return this.anIntArray219.length;
	}

	@OriginalMember(owner = "client!fh", name = "d", descriptor = "(I)V")
	public void method1016(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.aClass2_Sub23_4.method2105();
		this.anIntArray218[arg0] += local4;
	}

	@OriginalMember(owner = "client!fh", name = "e", descriptor = "()Z")
	public boolean method1017() {
		@Pc(3) int local3 = this.anIntArray219.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.anIntArray219[local5] >= 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!fh", name = "f", descriptor = "()Z")
	public boolean method1018() {
		return this.aClass2_Sub23_4.aByteArray41 != null;
	}

	@OriginalMember(owner = "client!fh", name = "e", descriptor = "(I)J")
	public long method1019(@OriginalArg(0) int arg0) {
		return this.aLong53 + (long) arg0 * (long) this.anInt1234;
	}

	@OriginalMember(owner = "client!fh", name = "g", descriptor = "()I")
	public int method1020() {
		@Pc(3) int local3 = this.anIntArray219.length;
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MAX_VALUE;
		for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
			if (this.anIntArray219[local9] >= 0 && this.anIntArray218[local9] < local7) {
				local5 = local9;
				local7 = this.anIntArray218[local9];
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!fh", name = "f", descriptor = "(I)I")
	private int method1021(@OriginalArg(0) int arg0) {
		@Pc(7) byte local7 = this.aClass2_Sub23_4.aByteArray41[this.aClass2_Sub23_4.anInt2703];
		@Pc(13) int local13;
		if (local7 < 0) {
			local13 = local7 & 0xFF;
			this.anIntArray217[arg0] = local13;
			this.aClass2_Sub23_4.anInt2703++;
		} else {
			local13 = this.anIntArray217[arg0];
		}
		if (local13 != 240 && local13 != 247) {
			return this.method1022(arg0, local13);
		}
		@Pc(42) int local42 = this.aClass2_Sub23_4.method2105();
		if (local13 == 247 && local42 > 0) {
			@Pc(57) int local57 = this.aClass2_Sub23_4.aByteArray41[this.aClass2_Sub23_4.anInt2703] & 0xFF;
			if (local57 >= 241 && local57 <= 243 || local57 == 246 || local57 == 248 || local57 >= 250 && local57 <= 252 || local57 == 254) {
				this.aClass2_Sub23_4.anInt2703++;
				this.anIntArray217[arg0] = local57;
				return this.method1022(arg0, local57);
			}
		}
		this.aClass2_Sub23_4.anInt2703 += local42;
		return 0;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(II)I")
	private int method1022(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12;
		if (arg1 != 255) {
			@Pc(78) byte local78 = Static63.aByteArray20[arg1 - 128];
			local12 = arg1;
			if (local78 >= 1) {
				local12 = arg1 | this.aClass2_Sub23_4.method2122() << 8;
			}
			if (local78 >= 2) {
				local12 |= this.aClass2_Sub23_4.method2122() << 16;
			}
			return local12;
		}
		@Pc(7) int local7 = this.aClass2_Sub23_4.method2122();
		local12 = this.aClass2_Sub23_4.method2105();
		if (local7 == 47) {
			this.aClass2_Sub23_4.anInt2703 += local12;
			return 1;
		} else if (local7 == 81) {
			@Pc(32) int local32 = this.aClass2_Sub23_4.method2091();
			local12 -= 3;
			@Pc(38) int local38 = this.anIntArray218[arg0];
			this.aLong53 += (long) local38 * (long) (this.anInt1234 - local32);
			this.anInt1234 = local32;
			this.aClass2_Sub23_4.anInt2703 += local12;
			return 2;
		} else {
			this.aClass2_Sub23_4.anInt2703 += local12;
			return 3;
		}
	}
}
