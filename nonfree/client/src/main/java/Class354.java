import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ufa")
public final class Class354 {

	@OriginalMember(owner = "client!ufa", name = "c", descriptor = "[I")
	public int[] anIntArray548;

	@OriginalMember(owner = "client!ufa", name = "d", descriptor = "J")
	private long aLong296;

	@OriginalMember(owner = "client!ufa", name = "e", descriptor = "I")
	private int anInt9716;

	@OriginalMember(owner = "client!ufa", name = "f", descriptor = "[I")
	private int[] anIntArray549;

	@OriginalMember(owner = "client!ufa", name = "g", descriptor = "[I")
	private int[] anIntArray550;

	@OriginalMember(owner = "client!ufa", name = "h", descriptor = "[I")
	private int[] anIntArray551;

	@OriginalMember(owner = "client!ufa", name = "i", descriptor = "I")
	public int anInt9717;

	@OriginalMember(owner = "client!ufa", name = "b", descriptor = "Lclient!rv;")
	private final Class5_Sub15 aClass5_Sub15_10 = new Class5_Sub15((byte[]) null);

	@OriginalMember(owner = "client!ufa", name = "<init>", descriptor = "()V")
	public Class354() {
	}

	@OriginalMember(owner = "client!ufa", name = "<init>", descriptor = "([B)V")
	public Class354(@OriginalArg(0) byte[] arg0) {
		this.method8095(arg0);
	}

	@OriginalMember(owner = "client!ufa", name = "a", descriptor = "()I")
	public int method8080() {
		@Pc(3) int local3 = this.anIntArray550.length;
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MAX_VALUE;
		for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
			if (this.anIntArray550[local9] >= 0 && this.anIntArray548[local9] < local7) {
				local5 = local9;
				local7 = this.anIntArray548[local9];
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!ufa", name = "a", descriptor = "(I)V")
	public void method8081(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.aClass5_Sub15_10.method3681();
		this.anIntArray548[arg0] += local4;
	}

	@OriginalMember(owner = "client!ufa", name = "a", descriptor = "(J)V")
	public void method8082(@OriginalArg(0) long arg0) {
		this.aLong296 = arg0;
		@Pc(6) int local6 = this.anIntArray550.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			this.anIntArray548[local8] = 0;
			this.anIntArray549[local8] = 0;
			this.aClass5_Sub15_10.anInt4144 = this.anIntArray551[local8];
			this.method8081(local8);
			this.anIntArray550[local8] = this.aClass5_Sub15_10.anInt4144;
		}
	}

	@OriginalMember(owner = "client!ufa", name = "b", descriptor = "(I)V")
	public void method8083(@OriginalArg(0) int arg0) {
		this.anIntArray550[arg0] = this.aClass5_Sub15_10.anInt4144;
	}

	@OriginalMember(owner = "client!ufa", name = "c", descriptor = "(I)J")
	public long method8084(@OriginalArg(0) int arg0) {
		return this.aLong296 + (long) arg0 * (long) this.anInt9716;
	}

	@OriginalMember(owner = "client!ufa", name = "d", descriptor = "(I)I")
	public int method8085(@OriginalArg(0) int arg0) {
		return this.method8090(arg0);
	}

	@OriginalMember(owner = "client!ufa", name = "a", descriptor = "(II)I")
	private int method8086(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12;
		if (arg1 != 255) {
			@Pc(78) byte local78 = Static597.aByteArray99[arg1 - 128];
			local12 = arg1;
			if (local78 >= 1) {
				local12 = arg1 | this.aClass5_Sub15_10.method3642() << 8;
			}
			if (local78 >= 2) {
				local12 |= this.aClass5_Sub15_10.method3642() << 16;
			}
			return local12;
		}
		@Pc(7) int local7 = this.aClass5_Sub15_10.method3642();
		local12 = this.aClass5_Sub15_10.method3681();
		if (local7 == 47) {
			this.aClass5_Sub15_10.anInt4144 += local12;
			return 1;
		} else if (local7 == 81) {
			@Pc(32) int local32 = this.aClass5_Sub15_10.method3633();
			local12 -= 3;
			@Pc(38) int local38 = this.anIntArray548[arg0];
			this.aLong296 += (long) local38 * (long) (this.anInt9716 - local32);
			this.anInt9716 = local32;
			this.aClass5_Sub15_10.anInt4144 += local12;
			return 2;
		} else {
			this.aClass5_Sub15_10.anInt4144 += local12;
			return 3;
		}
	}

	@OriginalMember(owner = "client!ufa", name = "b", descriptor = "()Z")
	public boolean method8087() {
		@Pc(3) int local3 = this.anIntArray550.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.anIntArray550[local5] >= 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ufa", name = "e", descriptor = "(I)V")
	public void method8088(@OriginalArg(0) int arg0) {
		this.aClass5_Sub15_10.anInt4144 = this.anIntArray550[arg0];
	}

	@OriginalMember(owner = "client!ufa", name = "f", descriptor = "(I)I")
	private int method8090(@OriginalArg(0) int arg0) {
		@Pc(7) byte local7 = this.aClass5_Sub15_10.aByteArray45[this.aClass5_Sub15_10.anInt4144];
		@Pc(13) int local13;
		if (local7 < 0) {
			local13 = local7 & 0xFF;
			this.anIntArray549[arg0] = local13;
			this.aClass5_Sub15_10.anInt4144++;
		} else {
			local13 = this.anIntArray549[arg0];
		}
		if (local13 != 240 && local13 != 247) {
			return this.method8086(arg0, local13);
		}
		@Pc(42) int local42 = this.aClass5_Sub15_10.method3681();
		if (local13 == 247 && local42 > 0) {
			@Pc(57) int local57 = this.aClass5_Sub15_10.aByteArray45[this.aClass5_Sub15_10.anInt4144] & 0xFF;
			if (local57 >= 241 && local57 <= 243 || local57 == 246 || local57 == 248 || local57 >= 250 && local57 <= 252 || local57 == 254) {
				this.aClass5_Sub15_10.anInt4144++;
				this.anIntArray549[arg0] = local57;
				return this.method8086(arg0, local57);
			}
		}
		this.aClass5_Sub15_10.anInt4144 += local42;
		return 0;
	}

	@OriginalMember(owner = "client!ufa", name = "d", descriptor = "()I")
	public int method8091() {
		return this.anIntArray550.length;
	}

	@OriginalMember(owner = "client!ufa", name = "e", descriptor = "()V")
	public void method8092() {
		this.aClass5_Sub15_10.anInt4144 = -1;
	}

	@OriginalMember(owner = "client!ufa", name = "f", descriptor = "()Z")
	public boolean method8093() {
		return this.aClass5_Sub15_10.aByteArray45 != null;
	}

	@OriginalMember(owner = "client!ufa", name = "g", descriptor = "()V")
	public void method8094() {
		this.aClass5_Sub15_10.aByteArray45 = null;
		this.anIntArray551 = null;
		this.anIntArray550 = null;
		this.anIntArray548 = null;
		this.anIntArray549 = null;
	}

	@OriginalMember(owner = "client!ufa", name = "a", descriptor = "([B)V")
	public void method8095(@OriginalArg(0) byte[] arg0) {
		this.aClass5_Sub15_10.aByteArray45 = arg0;
		this.aClass5_Sub15_10.anInt4144 = 10;
		@Pc(12) int local12 = this.aClass5_Sub15_10.method3698();
		this.anInt9717 = this.aClass5_Sub15_10.method3698();
		this.anInt9716 = 500000;
		this.anIntArray551 = new int[local12];
		@Pc(27) int local27 = 0;
		@Pc(33) int local33;
		while (local27 < local12) {
			local33 = this.aClass5_Sub15_10.method3671();
			@Pc(38) int local38 = this.aClass5_Sub15_10.method3671();
			if (local33 == 1297379947) {
				this.anIntArray551[local27] = this.aClass5_Sub15_10.anInt4144;
				local27++;
			}
			this.aClass5_Sub15_10.anInt4144 += local38;
		}
		this.aLong296 = 0L;
		this.anIntArray550 = new int[local12];
		for (local33 = 0; local33 < local12; local33++) {
			this.anIntArray550[local33] = this.anIntArray551[local33];
		}
		this.anIntArray548 = new int[local12];
		this.anIntArray549 = new int[local12];
	}
}
