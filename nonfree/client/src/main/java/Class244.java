import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nha")
public final class Class244 {

	@OriginalMember(owner = "client!nha", name = "c", descriptor = "I")
	public int anInt7294;

	@OriginalMember(owner = "client!nha", name = "d", descriptor = "[I")
	private int[] anIntArray529;

	@OriginalMember(owner = "client!nha", name = "e", descriptor = "I")
	private int anInt7295;

	@OriginalMember(owner = "client!nha", name = "f", descriptor = "[I")
	private int[] anIntArray530;

	@OriginalMember(owner = "client!nha", name = "g", descriptor = "J")
	private long aLong203;

	@OriginalMember(owner = "client!nha", name = "h", descriptor = "[I")
	public int[] anIntArray531;

	@OriginalMember(owner = "client!nha", name = "i", descriptor = "[I")
	private int[] anIntArray532;

	@OriginalMember(owner = "client!nha", name = "b", descriptor = "Lclient!so;")
	private final Class14_Sub29 aClass14_Sub29_7 = new Class14_Sub29((byte[]) null);

	@OriginalMember(owner = "client!nha", name = "<init>", descriptor = "()V")
	public Class244() {
	}

	@OriginalMember(owner = "client!nha", name = "<init>", descriptor = "([B)V")
	public Class244(@OriginalArg(0) byte[] arg0) {
		this.method5921(arg0);
	}

	@OriginalMember(owner = "client!nha", name = "a", descriptor = "()I")
	public int method5919() {
		return this.anIntArray529.length;
	}

	@OriginalMember(owner = "client!nha", name = "a", descriptor = "(I)V")
	public void method5920(@OriginalArg(0) int arg0) {
		this.aClass14_Sub29_7.anInt7264 = this.anIntArray529[arg0];
	}

	@OriginalMember(owner = "client!nha", name = "a", descriptor = "([B)V")
	public void method5921(@OriginalArg(0) byte[] arg0) {
		this.aClass14_Sub29_7.aByteArray84 = arg0;
		this.aClass14_Sub29_7.anInt7264 = 10;
		@Pc(12) int local12 = this.aClass14_Sub29_7.method5900();
		this.anInt7294 = this.aClass14_Sub29_7.method5900();
		this.anInt7295 = 500000;
		this.anIntArray532 = new int[local12];
		@Pc(27) int local27 = 0;
		@Pc(33) int local33;
		while (local27 < local12) {
			local33 = this.aClass14_Sub29_7.method5878();
			@Pc(38) int local38 = this.aClass14_Sub29_7.method5878();
			if (local33 == 1297379947) {
				this.anIntArray532[local27] = this.aClass14_Sub29_7.anInt7264;
				local27++;
			}
			this.aClass14_Sub29_7.anInt7264 += local38;
		}
		this.aLong203 = 0L;
		this.anIntArray529 = new int[local12];
		for (local33 = 0; local33 < local12; local33++) {
			this.anIntArray529[local33] = this.anIntArray532[local33];
		}
		this.anIntArray531 = new int[local12];
		this.anIntArray530 = new int[local12];
	}

	@OriginalMember(owner = "client!nha", name = "a", descriptor = "(J)V")
	public void method5922(@OriginalArg(0) long arg0) {
		this.aLong203 = arg0;
		@Pc(6) int local6 = this.anIntArray529.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			this.anIntArray531[local8] = 0;
			this.anIntArray530[local8] = 0;
			this.aClass14_Sub29_7.anInt7264 = this.anIntArray532[local8];
			this.method5932(local8);
			this.anIntArray529[local8] = this.aClass14_Sub29_7.anInt7264;
		}
	}

	@OriginalMember(owner = "client!nha", name = "b", descriptor = "()V")
	public void method5923() {
		this.aClass14_Sub29_7.aByteArray84 = null;
		this.anIntArray532 = null;
		this.anIntArray529 = null;
		this.anIntArray531 = null;
		this.anIntArray530 = null;
	}

	@OriginalMember(owner = "client!nha", name = "b", descriptor = "(I)V")
	public void method5924(@OriginalArg(0) int arg0) {
		this.anIntArray529[arg0] = this.aClass14_Sub29_7.anInt7264;
	}

	@OriginalMember(owner = "client!nha", name = "a", descriptor = "(II)I")
	private int method5926(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12;
		if (arg1 != 255) {
			@Pc(78) byte local78 = Static395.aByteArray85[arg1 - 128];
			local12 = arg1;
			if (local78 >= 1) {
				local12 = arg1 | this.aClass14_Sub29_7.method5866() << 8;
			}
			if (local78 >= 2) {
				local12 |= this.aClass14_Sub29_7.method5866() << 16;
			}
			return local12;
		}
		@Pc(7) int local7 = this.aClass14_Sub29_7.method5866();
		local12 = this.aClass14_Sub29_7.method5889();
		if (local7 == 47) {
			this.aClass14_Sub29_7.anInt7264 += local12;
			return 1;
		} else if (local7 == 81) {
			@Pc(32) int local32 = this.aClass14_Sub29_7.method5862();
			local12 -= 3;
			@Pc(38) int local38 = this.anIntArray531[arg0];
			this.aLong203 += (long) local38 * (long) (this.anInt7295 - local32);
			this.anInt7295 = local32;
			this.aClass14_Sub29_7.anInt7264 += local12;
			return 2;
		} else {
			this.aClass14_Sub29_7.anInt7264 += local12;
			return 3;
		}
	}

	@OriginalMember(owner = "client!nha", name = "c", descriptor = "(I)J")
	public long method5927(@OriginalArg(0) int arg0) {
		return this.aLong203 + (long) arg0 * (long) this.anInt7295;
	}

	@OriginalMember(owner = "client!nha", name = "d", descriptor = "()Z")
	public boolean method5928() {
		return this.aClass14_Sub29_7.aByteArray84 != null;
	}

	@OriginalMember(owner = "client!nha", name = "e", descriptor = "()V")
	public void method5929() {
		this.aClass14_Sub29_7.anInt7264 = -1;
	}

	@OriginalMember(owner = "client!nha", name = "d", descriptor = "(I)I")
	private int method5930(@OriginalArg(0) int arg0) {
		@Pc(7) byte local7 = this.aClass14_Sub29_7.aByteArray84[this.aClass14_Sub29_7.anInt7264];
		@Pc(13) int local13;
		if (local7 < 0) {
			local13 = local7 & 0xFF;
			this.anIntArray530[arg0] = local13;
			this.aClass14_Sub29_7.anInt7264++;
		} else {
			local13 = this.anIntArray530[arg0];
		}
		if (local13 != 240 && local13 != 247) {
			return this.method5926(arg0, local13);
		}
		@Pc(42) int local42 = this.aClass14_Sub29_7.method5889();
		if (local13 == 247 && local42 > 0) {
			@Pc(57) int local57 = this.aClass14_Sub29_7.aByteArray84[this.aClass14_Sub29_7.anInt7264] & 0xFF;
			if (local57 >= 241 && local57 <= 243 || local57 == 246 || local57 == 248 || local57 >= 250 && local57 <= 252 || local57 == 254) {
				this.aClass14_Sub29_7.anInt7264++;
				this.anIntArray530[arg0] = local57;
				return this.method5926(arg0, local57);
			}
		}
		this.aClass14_Sub29_7.anInt7264 += local42;
		return 0;
	}

	@OriginalMember(owner = "client!nha", name = "f", descriptor = "()I")
	public int method5931() {
		@Pc(3) int local3 = this.anIntArray529.length;
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MAX_VALUE;
		for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
			if (this.anIntArray529[local9] >= 0 && this.anIntArray531[local9] < local7) {
				local5 = local9;
				local7 = this.anIntArray531[local9];
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!nha", name = "e", descriptor = "(I)V")
	public void method5932(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.aClass14_Sub29_7.method5889();
		this.anIntArray531[arg0] += local4;
	}

	@OriginalMember(owner = "client!nha", name = "f", descriptor = "(I)I")
	public int method5933(@OriginalArg(0) int arg0) {
		return this.method5930(arg0);
	}

	@OriginalMember(owner = "client!nha", name = "g", descriptor = "()Z")
	public boolean method5934() {
		@Pc(3) int local3 = this.anIntArray529.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.anIntArray529[local5] >= 0) {
				return false;
			}
		}
		return true;
	}
}
