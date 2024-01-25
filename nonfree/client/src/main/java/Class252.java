import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nn")
public final class Class252 {

	@OriginalMember(owner = "client!nn", name = "b", descriptor = "[I")
	private int[] anIntArray390;

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "I")
	private int anInt6877;

	@OriginalMember(owner = "client!nn", name = "h", descriptor = "[I")
	public int[] anIntArray391;

	@OriginalMember(owner = "client!nn", name = "i", descriptor = "I")
	public int anInt6878;

	@OriginalMember(owner = "client!nn", name = "f", descriptor = "[I")
	private int[] anIntArray392;

	@OriginalMember(owner = "client!nn", name = "c", descriptor = "J")
	private long aLong212;

	@OriginalMember(owner = "client!nn", name = "g", descriptor = "[I")
	private int[] anIntArray393;

	@OriginalMember(owner = "client!nn", name = "e", descriptor = "Lclient!ib;")
	private final Class5_Sub23 aClass5_Sub23_4 = new Class5_Sub23((byte[]) null);

	@OriginalMember(owner = "client!nn", name = "<init>", descriptor = "()V")
	public Class252() {
	}

	@OriginalMember(owner = "client!nn", name = "<init>", descriptor = "([B)V")
	public Class252(@OriginalArg(0) byte[] arg0) {
		this.method5886(arg0);
	}

	@OriginalMember(owner = "client!nn", name = "c", descriptor = "(I)V")
	public void method5876(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.aClass5_Sub23_4.method8498();
		this.anIntArray391[arg0] += local4;
	}

	@OriginalMember(owner = "client!nn", name = "b", descriptor = "()I")
	public int method5877() {
		@Pc(3) int local3 = this.anIntArray393.length;
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MAX_VALUE;
		for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
			if (this.anIntArray393[local9] >= 0 && this.anIntArray391[local9] < local7) {
				local5 = local9;
				local7 = this.anIntArray391[local9];
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!nn", name = "d", descriptor = "(I)I")
	private int method5878(@OriginalArg(0) int arg0) {
		@Pc(7) byte local7 = this.aClass5_Sub23_4.aByteArray102[this.aClass5_Sub23_4.anInt9869];
		@Pc(13) int local13;
		if (local7 < 0) {
			local13 = local7 & 0xFF;
			this.anIntArray392[arg0] = local13;
			this.aClass5_Sub23_4.anInt9869++;
		} else {
			local13 = this.anIntArray392[arg0];
		}
		if (local13 != 240 && local13 != 247) {
			return this.method5885(arg0, local13);
		}
		@Pc(42) int local42 = this.aClass5_Sub23_4.method8498();
		if (local13 == 247 && local42 > 0) {
			@Pc(57) int local57 = this.aClass5_Sub23_4.aByteArray102[this.aClass5_Sub23_4.anInt9869] & 0xFF;
			if (local57 >= 241 && local57 <= 243 || local57 == 246 || local57 == 248 || local57 >= 250 && local57 <= 252 || local57 == 254) {
				this.aClass5_Sub23_4.anInt9869++;
				this.anIntArray392[arg0] = local57;
				return this.method5885(arg0, local57);
			}
		}
		this.aClass5_Sub23_4.anInt9869 += local42;
		return 0;
	}

	@OriginalMember(owner = "client!nn", name = "c", descriptor = "()Z")
	public boolean method5879() {
		return this.aClass5_Sub23_4.aByteArray102 != null;
	}

	@OriginalMember(owner = "client!nn", name = "d", descriptor = "()I")
	public int method5880() {
		return this.anIntArray393.length;
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "()V")
	public void method5881() {
		this.aClass5_Sub23_4.aByteArray102 = null;
		this.anIntArray390 = null;
		this.anIntArray393 = null;
		this.anIntArray391 = null;
		this.anIntArray392 = null;
	}

	@OriginalMember(owner = "client!nn", name = "e", descriptor = "()Z")
	public boolean method5882() {
		@Pc(3) int local3 = this.anIntArray393.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.anIntArray393[local5] >= 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(J)V")
	public void method5883(@OriginalArg(0) long arg0) {
		this.aLong212 = arg0;
		@Pc(6) int local6 = this.anIntArray393.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			this.anIntArray391[local8] = 0;
			this.anIntArray392[local8] = 0;
			this.aClass5_Sub23_4.anInt9869 = this.anIntArray390[local8];
			this.method5876(local8);
			this.anIntArray393[local8] = this.aClass5_Sub23_4.anInt9869;
		}
	}

	@OriginalMember(owner = "client!nn", name = "b", descriptor = "(I)I")
	public int method5884(@OriginalArg(0) int arg0) {
		return this.method5878(arg0);
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(II)I")
	private int method5885(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12;
		if (arg1 != 255) {
			@Pc(78) byte local78 = Static399.aByteArray55[arg1 - 128];
			local12 = arg1;
			if (local78 >= 1) {
				local12 = arg1 | this.aClass5_Sub23_4.method8529() << 8;
			}
			if (local78 >= 2) {
				local12 |= this.aClass5_Sub23_4.method8529() << 16;
			}
			return local12;
		}
		@Pc(7) int local7 = this.aClass5_Sub23_4.method8529();
		local12 = this.aClass5_Sub23_4.method8498();
		if (local7 == 47) {
			this.aClass5_Sub23_4.anInt9869 += local12;
			return 1;
		} else if (local7 == 81) {
			@Pc(32) int local32 = this.aClass5_Sub23_4.method8510();
			local12 -= 3;
			@Pc(38) int local38 = this.anIntArray391[arg0];
			this.aLong212 += (long) local38 * (long) (this.anInt6877 - local32);
			this.anInt6877 = local32;
			this.aClass5_Sub23_4.anInt9869 += local12;
			return 2;
		} else {
			this.aClass5_Sub23_4.anInt9869 += local12;
			return 3;
		}
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "([B)V")
	public void method5886(@OriginalArg(0) byte[] arg0) {
		this.aClass5_Sub23_4.aByteArray102 = arg0;
		this.aClass5_Sub23_4.anInt9869 = 10;
		@Pc(12) int local12 = this.aClass5_Sub23_4.method8519();
		this.anInt6878 = this.aClass5_Sub23_4.method8519();
		this.anInt6877 = 500000;
		this.anIntArray390 = new int[local12];
		@Pc(27) int local27 = 0;
		@Pc(33) int local33;
		while (local27 < local12) {
			local33 = this.aClass5_Sub23_4.method8527();
			@Pc(38) int local38 = this.aClass5_Sub23_4.method8527();
			if (local33 == 1297379947) {
				this.anIntArray390[local27] = this.aClass5_Sub23_4.anInt9869;
				local27++;
			}
			this.aClass5_Sub23_4.anInt9869 += local38;
		}
		this.aLong212 = 0L;
		this.anIntArray393 = new int[local12];
		for (local33 = 0; local33 < local12; local33++) {
			this.anIntArray393[local33] = this.anIntArray390[local33];
		}
		this.anIntArray391 = new int[local12];
		this.anIntArray392 = new int[local12];
	}

	@OriginalMember(owner = "client!nn", name = "e", descriptor = "(I)J")
	public long method5887(@OriginalArg(0) int arg0) {
		return this.aLong212 + (long) arg0 * (long) this.anInt6877;
	}

	@OriginalMember(owner = "client!nn", name = "g", descriptor = "()V")
	public void method5888() {
		this.aClass5_Sub23_4.anInt9869 = -1;
	}

	@OriginalMember(owner = "client!nn", name = "f", descriptor = "(I)V")
	public void method5889(@OriginalArg(0) int arg0) {
		this.anIntArray393[arg0] = this.aClass5_Sub23_4.anInt9869;
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(I)V")
	public void method5890(@OriginalArg(0) int arg0) {
		this.aClass5_Sub23_4.anInt9869 = this.anIntArray393[arg0];
	}
}
