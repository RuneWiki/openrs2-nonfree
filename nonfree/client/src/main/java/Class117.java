import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!na")
public final class Class117 {

	@OriginalMember(owner = "client!na", name = "c", descriptor = "[I")
	private int[] anIntArray285;

	@OriginalMember(owner = "client!na", name = "d", descriptor = "J")
	private long aLong181;

	@OriginalMember(owner = "client!na", name = "e", descriptor = "I")
	public int anInt3562;

	@OriginalMember(owner = "client!na", name = "f", descriptor = "[I")
	private int[] anIntArray286;

	@OriginalMember(owner = "client!na", name = "g", descriptor = "[I")
	public int[] anIntArray287;

	@OriginalMember(owner = "client!na", name = "h", descriptor = "[I")
	private int[] anIntArray288;

	@OriginalMember(owner = "client!na", name = "i", descriptor = "I")
	private int anInt3563;

	@OriginalMember(owner = "client!na", name = "a", descriptor = "Lclient!wm;")
	private Class2_Sub26 aClass2_Sub26_9 = new Class2_Sub26(null);

	@OriginalMember(owner = "client!na", name = "<init>", descriptor = "()V")
	public Class117() {
	}

	@OriginalMember(owner = "client!na", name = "<init>", descriptor = "([B)V")
	public Class117(@OriginalArg(0) byte[] arg0) {
		this.method2884(arg0);
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "()Z")
	public boolean method2875() {
		return this.aClass2_Sub26_9.aByteArray72 != null;
	}

	@OriginalMember(owner = "client!na", name = "c", descriptor = "()Z")
	public boolean method2877() {
		@Pc(3) int local3 = this.anIntArray285.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.anIntArray285[local5] >= 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!na", name = "d", descriptor = "()V")
	public void method2878() {
		this.aClass2_Sub26_9.aByteArray72 = null;
		this.anIntArray286 = null;
		this.anIntArray285 = null;
		this.anIntArray287 = null;
		this.anIntArray288 = null;
	}

	@OriginalMember(owner = "client!na", name = "e", descriptor = "()I")
	public int method2879() {
		return this.anIntArray285.length;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(J)V")
	public void method2880(@OriginalArg(0) long arg0) {
		this.aLong181 = arg0;
		@Pc(6) int local6 = this.anIntArray285.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			this.anIntArray287[local8] = 0;
			this.anIntArray288[local8] = 0;
			this.aClass2_Sub26_9.anInt5328 = this.anIntArray286[local8];
			this.method2881(local8);
			this.anIntArray285[local8] = this.aClass2_Sub26_9.anInt5328;
		}
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(I)V")
	public void method2881(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.aClass2_Sub26_9.method4251();
		this.anIntArray287[arg0] += local4;
	}

	@OriginalMember(owner = "client!na", name = "b", descriptor = "(I)V")
	public void method2882(@OriginalArg(0) int arg0) {
		this.aClass2_Sub26_9.anInt5328 = this.anIntArray285[arg0];
	}

	@OriginalMember(owner = "client!na", name = "c", descriptor = "(I)I")
	public int method2883(@OriginalArg(0) int arg0) {
		return this.method2887(arg0);
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "([B)V")
	public void method2884(@OriginalArg(0) byte[] arg0) {
		this.aClass2_Sub26_9.aByteArray72 = arg0;
		this.aClass2_Sub26_9.anInt5328 = 10;
		@Pc(12) int local12 = this.aClass2_Sub26_9.method4242();
		this.anInt3562 = this.aClass2_Sub26_9.method4242();
		this.anInt3563 = 500000;
		this.anIntArray286 = new int[local12];
		@Pc(27) int local27 = 0;
		while (local27 < local12) {
			@Pc(35) int local35 = this.aClass2_Sub26_9.method4228();
			@Pc(40) int local40 = this.aClass2_Sub26_9.method4228();
			if (local35 == 1297379947) {
				this.anIntArray286[local27] = this.aClass2_Sub26_9.anInt5328;
				local27++;
			}
			this.aClass2_Sub26_9.anInt5328 += local40;
		}
		this.aLong181 = 0L;
		this.anIntArray285 = new int[local12];
		for (local27 = 0; local27 < local12; local27++) {
			this.anIntArray285[local27] = this.anIntArray286[local27];
		}
		this.anIntArray287 = new int[local12];
		this.anIntArray288 = new int[local12];
	}

	@OriginalMember(owner = "client!na", name = "d", descriptor = "(I)V")
	public void method2885(@OriginalArg(0) int arg0) {
		this.anIntArray285[arg0] = this.aClass2_Sub26_9.anInt5328;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(II)I")
	private int method2886(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12;
		if (arg1 != 255) {
			@Pc(78) byte local78 = Static168.aByteArray31[arg1 - 128];
			local12 = arg1;
			if (local78 >= 1) {
				local12 = arg1 | this.aClass2_Sub26_9.method4261() << 8;
			}
			if (local78 >= 2) {
				local12 |= this.aClass2_Sub26_9.method4261() << 16;
			}
			return local12;
		}
		@Pc(7) int local7 = this.aClass2_Sub26_9.method4261();
		local12 = this.aClass2_Sub26_9.method4251();
		if (local7 == 47) {
			this.aClass2_Sub26_9.anInt5328 += local12;
			return 1;
		} else if (local7 == 81) {
			@Pc(32) int local32 = this.aClass2_Sub26_9.method4245();
			local12 -= 3;
			@Pc(38) int local38 = this.anIntArray287[arg0];
			this.aLong181 += (long) local38 * (long) (this.anInt3563 - local32);
			this.anInt3563 = local32;
			this.aClass2_Sub26_9.anInt5328 += local12;
			return 2;
		} else {
			this.aClass2_Sub26_9.anInt5328 += local12;
			return 3;
		}
	}

	@OriginalMember(owner = "client!na", name = "e", descriptor = "(I)I")
	private int method2887(@OriginalArg(0) int arg0) {
		@Pc(7) byte local7 = this.aClass2_Sub26_9.aByteArray72[this.aClass2_Sub26_9.anInt5328];
		@Pc(13) int local13;
		if (local7 < 0) {
			local13 = local7 & 0xFF;
			this.anIntArray288[arg0] = local13;
			this.aClass2_Sub26_9.anInt5328++;
		} else {
			local13 = this.anIntArray288[arg0];
		}
		if (local13 != 240 && local13 != 247) {
			return this.method2886(arg0, local13);
		}
		@Pc(42) int local42 = this.aClass2_Sub26_9.method4251();
		if (local13 == 247 && local42 > 0) {
			@Pc(57) int local57 = this.aClass2_Sub26_9.aByteArray72[this.aClass2_Sub26_9.anInt5328] & 0xFF;
			if (local57 >= 241 && local57 <= 243 || local57 == 246 || local57 == 248 || local57 >= 250 && local57 <= 252 || local57 == 254) {
				this.aClass2_Sub26_9.anInt5328++;
				this.anIntArray288[arg0] = local57;
				return this.method2886(arg0, local57);
			}
		}
		this.aClass2_Sub26_9.anInt5328 += local42;
		return 0;
	}

	@OriginalMember(owner = "client!na", name = "f", descriptor = "()I")
	public int method2888() {
		@Pc(3) int local3 = this.anIntArray285.length;
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MAX_VALUE;
		for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
			if (this.anIntArray285[local9] >= 0 && this.anIntArray287[local9] < local7) {
				local5 = local9;
				local7 = this.anIntArray287[local9];
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!na", name = "f", descriptor = "(I)J")
	public long method2889(@OriginalArg(0) int arg0) {
		return this.aLong181 + (long) arg0 * (long) this.anInt3563;
	}

	@OriginalMember(owner = "client!na", name = "g", descriptor = "()V")
	public void method2890() {
		this.aClass2_Sub26_9.anInt5328 = -1;
	}
}
