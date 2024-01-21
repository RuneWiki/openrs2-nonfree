import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cb")
public final class Class10 {

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "[I")
	private int[] anIntArray39;

	@OriginalMember(owner = "client!cb", name = "c", descriptor = "J")
	private long aLong13;

	@OriginalMember(owner = "client!cb", name = "d", descriptor = "I")
	public int anInt437;

	@OriginalMember(owner = "client!cb", name = "e", descriptor = "[I")
	public int[] anIntArray40;

	@OriginalMember(owner = "client!cb", name = "f", descriptor = "[I")
	private int[] anIntArray41;

	@OriginalMember(owner = "client!cb", name = "g", descriptor = "[I")
	private int[] anIntArray42;

	@OriginalMember(owner = "client!cb", name = "h", descriptor = "I")
	private int anInt438;

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "Lclient!kd;")
	private final Class3_Sub8 aClass3_Sub8_1 = new Class3_Sub8(null);

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "()I")
	public int method280() {
		return this.anIntArray41.length;
	}

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "()V")
	public void method281() {
		this.aClass3_Sub8_1.anInt2704 = -1;
	}

	@OriginalMember(owner = "client!cb", name = "c", descriptor = "()Z")
	public boolean method282() {
		return this.aClass3_Sub8_1.anInt2704 < 0;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(I)V")
	public void method283(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.aClass3_Sub8_1.method1810();
		this.anIntArray40[arg0] += local4;
	}

	@OriginalMember(owner = "client!cb", name = "d", descriptor = "()Z")
	public boolean method284() {
		@Pc(3) int local3 = this.anIntArray41.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.anIntArray41[local5] >= 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "([B)V")
	public void method285(@OriginalArg(0) byte[] arg0) {
		this.aClass3_Sub8_1.aByteArray26 = arg0;
		this.aClass3_Sub8_1.anInt2704 = 10;
		@Pc(12) int local12 = this.aClass3_Sub8_1.method1789();
		this.anInt437 = this.aClass3_Sub8_1.method1789();
		this.anInt438 = 500000;
		this.anIntArray39 = new int[local12];
		@Pc(27) int local27 = 0;
		while (local27 < local12) {
			@Pc(33) int local33 = this.aClass3_Sub8_1.method1770();
			@Pc(38) int local38 = this.aClass3_Sub8_1.method1770();
			if (local33 == 1297379947) {
				this.anIntArray39[local27] = this.aClass3_Sub8_1.anInt2704;
				local27++;
			}
			this.aClass3_Sub8_1.anInt2704 += local38;
		}
		this.anIntArray41 = (int[]) this.anIntArray39.clone();
		this.anIntArray40 = new int[local12];
		this.anIntArray42 = new int[local12];
	}

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "(I)V")
	public void method286(@OriginalArg(0) int arg0) {
		this.aClass3_Sub8_1.anInt2704 = this.anIntArray41[arg0];
	}

	@OriginalMember(owner = "client!cb", name = "c", descriptor = "(I)J")
	public long method287(@OriginalArg(0) int arg0) {
		return this.aLong13 + (long) arg0 * (long) this.anInt438;
	}

	@OriginalMember(owner = "client!cb", name = "e", descriptor = "()Z")
	public boolean method288() {
		return this.aClass3_Sub8_1.aByteArray26 != null;
	}

	@OriginalMember(owner = "client!cb", name = "d", descriptor = "(I)V")
	public void method289(@OriginalArg(0) int arg0) {
		this.anIntArray41[arg0] = this.aClass3_Sub8_1.anInt2704;
	}

	@OriginalMember(owner = "client!cb", name = "e", descriptor = "(I)I")
	public int method290(@OriginalArg(0) int arg0) {
		return this.method295(arg0);
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(II)I")
	private int method291(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12;
		if (arg1 != 255) {
			@Pc(78) byte local78 = Static11.aByteArray4[arg1 - 128];
			local12 = arg1;
			if (local78 >= 1) {
				local12 = arg1 | this.aClass3_Sub8_1.method1803() << 8;
			}
			if (local78 >= 2) {
				local12 |= this.aClass3_Sub8_1.method1803() << 16;
			}
			return local12;
		}
		@Pc(7) int local7 = this.aClass3_Sub8_1.method1803();
		local12 = this.aClass3_Sub8_1.method1810();
		if (local7 == 47) {
			this.aClass3_Sub8_1.anInt2704 += local12;
			return 1;
		} else if (local7 == 81) {
			@Pc(32) int local32 = this.aClass3_Sub8_1.method1786();
			local12 -= 3;
			@Pc(38) int local38 = this.anIntArray40[arg0];
			this.aLong13 += (long) local38 * (long) (this.anInt438 - local32);
			this.anInt438 = local32;
			this.aClass3_Sub8_1.anInt2704 += local12;
			return 2;
		} else {
			this.aClass3_Sub8_1.anInt2704 += local12;
			return 3;
		}
	}

	@OriginalMember(owner = "client!cb", name = "g", descriptor = "()V")
	public void method293() {
		this.aClass3_Sub8_1.aByteArray26 = null;
		this.anIntArray39 = null;
		this.anIntArray41 = null;
		this.anIntArray40 = null;
		this.anIntArray42 = null;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(J)V")
	public void method294(@OriginalArg(0) long arg0) {
		this.aLong13 = arg0;
		@Pc(6) int local6 = this.anIntArray41.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			this.anIntArray40[local8] = 0;
			this.anIntArray42[local8] = 0;
			this.aClass3_Sub8_1.anInt2704 = this.anIntArray39[local8];
			this.method283(local8);
			this.anIntArray41[local8] = this.aClass3_Sub8_1.anInt2704;
		}
	}

	@OriginalMember(owner = "client!cb", name = "f", descriptor = "(I)I")
	private int method295(@OriginalArg(0) int arg0) {
		@Pc(7) byte local7 = this.aClass3_Sub8_1.aByteArray26[this.aClass3_Sub8_1.anInt2704];
		@Pc(13) int local13;
		if (local7 < 0) {
			local13 = local7 & 0xFF;
			this.anIntArray42[arg0] = local13;
			this.aClass3_Sub8_1.anInt2704++;
		} else {
			local13 = this.anIntArray42[arg0];
		}
		if (local13 != 240 && local13 != 247) {
			return this.method291(arg0, local13);
		}
		@Pc(42) int local42 = this.aClass3_Sub8_1.method1810();
		if (local13 == 247 && local42 > 0) {
			@Pc(57) int local57 = this.aClass3_Sub8_1.aByteArray26[this.aClass3_Sub8_1.anInt2704] & 0xFF;
			if (local57 >= 241 && local57 <= 243 || local57 == 246 || local57 == 248 || local57 >= 250 && local57 <= 252 || local57 == 254) {
				this.aClass3_Sub8_1.anInt2704++;
				this.anIntArray42[arg0] = local57;
				return this.method291(arg0, local57);
			}
		}
		this.aClass3_Sub8_1.anInt2704 += local42;
		return 0;
	}

	@OriginalMember(owner = "client!cb", name = "h", descriptor = "()I")
	public int method296() {
		@Pc(3) int local3 = this.anIntArray41.length;
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MAX_VALUE;
		for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
			if (this.anIntArray41[local9] >= 0 && this.anIntArray40[local9] < local7) {
				local5 = local9;
				local7 = this.anIntArray40[local9];
			}
		}
		return local5;
	}
}
