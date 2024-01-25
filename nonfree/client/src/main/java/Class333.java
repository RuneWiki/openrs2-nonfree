import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uaa")
public final class Class333 {

	@OriginalMember(owner = "client!uaa", name = "c", descriptor = "[I")
	private int[] anIntArray584;

	@OriginalMember(owner = "client!uaa", name = "d", descriptor = "I")
	private int anInt9328;

	@OriginalMember(owner = "client!uaa", name = "e", descriptor = "[I")
	public int[] anIntArray585;

	@OriginalMember(owner = "client!uaa", name = "f", descriptor = "I")
	public int anInt9329;

	@OriginalMember(owner = "client!uaa", name = "g", descriptor = "[I")
	private int[] anIntArray586;

	@OriginalMember(owner = "client!uaa", name = "h", descriptor = "J")
	private long aLong253;

	@OriginalMember(owner = "client!uaa", name = "i", descriptor = "[I")
	private int[] anIntArray587;

	@OriginalMember(owner = "client!uaa", name = "a", descriptor = "Lclient!dc;")
	private final Class3_Sub9 aClass3_Sub9_13 = new Class3_Sub9((byte[]) null);

	@OriginalMember(owner = "client!uaa", name = "<init>", descriptor = "()V")
	public Class333() {
	}

	@OriginalMember(owner = "client!uaa", name = "<init>", descriptor = "([B)V")
	public Class333(@OriginalArg(0) byte[] arg0) {
		this.method7974(arg0);
	}

	@OriginalMember(owner = "client!uaa", name = "a", descriptor = "(II)I")
	private int method7972(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12;
		if (arg1 != 255) {
			@Pc(78) byte local78 = Static563.aByteArray94[arg1 - 128];
			local12 = arg1;
			if (local78 >= 1) {
				local12 = arg1 | this.aClass3_Sub9_13.method5633() << 8;
			}
			if (local78 >= 2) {
				local12 |= this.aClass3_Sub9_13.method5633() << 16;
			}
			return local12;
		}
		@Pc(7) int local7 = this.aClass3_Sub9_13.method5633();
		local12 = this.aClass3_Sub9_13.method5623();
		if (local7 == 47) {
			this.aClass3_Sub9_13.anInt6453 += local12;
			return 1;
		} else if (local7 == 81) {
			@Pc(32) int local32 = this.aClass3_Sub9_13.method5604();
			local12 -= 3;
			@Pc(38) int local38 = this.anIntArray585[arg0];
			this.aLong253 += (long) local38 * (long) (this.anInt9328 - local32);
			this.anInt9328 = local32;
			this.aClass3_Sub9_13.anInt6453 += local12;
			return 2;
		} else {
			this.aClass3_Sub9_13.anInt6453 += local12;
			return 3;
		}
	}

	@OriginalMember(owner = "client!uaa", name = "a", descriptor = "(I)V")
	public void method7973(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.aClass3_Sub9_13.method5623();
		this.anIntArray585[arg0] += local4;
	}

	@OriginalMember(owner = "client!uaa", name = "a", descriptor = "([B)V")
	public void method7974(@OriginalArg(0) byte[] arg0) {
		this.aClass3_Sub9_13.aByteArray51 = arg0;
		this.aClass3_Sub9_13.anInt6453 = 10;
		@Pc(12) int local12 = this.aClass3_Sub9_13.method5610();
		this.anInt9329 = this.aClass3_Sub9_13.method5610();
		this.anInt9328 = 500000;
		this.anIntArray587 = new int[local12];
		@Pc(27) int local27 = 0;
		@Pc(33) int local33;
		while (local27 < local12) {
			local33 = this.aClass3_Sub9_13.method5585();
			@Pc(38) int local38 = this.aClass3_Sub9_13.method5585();
			if (local33 == 1297379947) {
				this.anIntArray587[local27] = this.aClass3_Sub9_13.anInt6453;
				local27++;
			}
			this.aClass3_Sub9_13.anInt6453 += local38;
		}
		this.aLong253 = 0L;
		this.anIntArray586 = new int[local12];
		for (local33 = 0; local33 < local12; local33++) {
			this.anIntArray586[local33] = this.anIntArray587[local33];
		}
		this.anIntArray585 = new int[local12];
		this.anIntArray584 = new int[local12];
	}

	@OriginalMember(owner = "client!uaa", name = "b", descriptor = "(I)V")
	public void method7975(@OriginalArg(0) int arg0) {
		this.aClass3_Sub9_13.anInt6453 = this.anIntArray586[arg0];
	}

	@OriginalMember(owner = "client!uaa", name = "c", descriptor = "(I)J")
	public long method7976(@OriginalArg(0) int arg0) {
		return this.aLong253 + (long) arg0 * (long) this.anInt9328;
	}

	@OriginalMember(owner = "client!uaa", name = "d", descriptor = "(I)I")
	private int method7977(@OriginalArg(0) int arg0) {
		@Pc(7) byte local7 = this.aClass3_Sub9_13.aByteArray51[this.aClass3_Sub9_13.anInt6453];
		@Pc(13) int local13;
		if (local7 < 0) {
			local13 = local7 & 0xFF;
			this.anIntArray584[arg0] = local13;
			this.aClass3_Sub9_13.anInt6453++;
		} else {
			local13 = this.anIntArray584[arg0];
		}
		if (local13 != 240 && local13 != 247) {
			return this.method7972(arg0, local13);
		}
		@Pc(42) int local42 = this.aClass3_Sub9_13.method5623();
		if (local13 == 247 && local42 > 0) {
			@Pc(57) int local57 = this.aClass3_Sub9_13.aByteArray51[this.aClass3_Sub9_13.anInt6453] & 0xFF;
			if (local57 >= 241 && local57 <= 243 || local57 == 246 || local57 == 248 || local57 >= 250 && local57 <= 252 || local57 == 254) {
				this.aClass3_Sub9_13.anInt6453++;
				this.anIntArray584[arg0] = local57;
				return this.method7972(arg0, local57);
			}
		}
		this.aClass3_Sub9_13.anInt6453 += local42;
		return 0;
	}

	@OriginalMember(owner = "client!uaa", name = "b", descriptor = "()Z")
	public boolean method7978() {
		@Pc(3) int local3 = this.anIntArray586.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.anIntArray586[local5] >= 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!uaa", name = "c", descriptor = "()Z")
	public boolean method7979() {
		return this.aClass3_Sub9_13.aByteArray51 != null;
	}

	@OriginalMember(owner = "client!uaa", name = "d", descriptor = "()I")
	public int method7980() {
		@Pc(3) int local3 = this.anIntArray586.length;
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MAX_VALUE;
		for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
			if (this.anIntArray586[local9] >= 0 && this.anIntArray585[local9] < local7) {
				local5 = local9;
				local7 = this.anIntArray585[local9];
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!uaa", name = "e", descriptor = "(I)V")
	public void method7981(@OriginalArg(0) int arg0) {
		this.anIntArray586[arg0] = this.aClass3_Sub9_13.anInt6453;
	}

	@OriginalMember(owner = "client!uaa", name = "a", descriptor = "(J)V")
	public void method7982(@OriginalArg(0) long arg0) {
		this.aLong253 = arg0;
		@Pc(6) int local6 = this.anIntArray586.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			this.anIntArray585[local8] = 0;
			this.anIntArray584[local8] = 0;
			this.aClass3_Sub9_13.anInt6453 = this.anIntArray587[local8];
			this.method7973(local8);
			this.anIntArray586[local8] = this.aClass3_Sub9_13.anInt6453;
		}
	}

	@OriginalMember(owner = "client!uaa", name = "e", descriptor = "()V")
	public void method7983() {
		this.aClass3_Sub9_13.aByteArray51 = null;
		this.anIntArray587 = null;
		this.anIntArray586 = null;
		this.anIntArray585 = null;
		this.anIntArray584 = null;
	}

	@OriginalMember(owner = "client!uaa", name = "f", descriptor = "()V")
	public void method7984() {
		this.aClass3_Sub9_13.anInt6453 = -1;
	}

	@OriginalMember(owner = "client!uaa", name = "g", descriptor = "()I")
	public int method7985() {
		return this.anIntArray586.length;
	}

	@OriginalMember(owner = "client!uaa", name = "f", descriptor = "(I)I")
	public int method7986(@OriginalArg(0) int arg0) {
		return this.method7977(arg0);
	}
}
