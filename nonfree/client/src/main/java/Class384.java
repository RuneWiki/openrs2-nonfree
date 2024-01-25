import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wf")
public final class Class384 {

	@OriginalMember(owner = "client!wf", name = "c", descriptor = "[I")
	private int[] anIntArray585;

	@OriginalMember(owner = "client!wf", name = "d", descriptor = "I")
	private int anInt10723;

	@OriginalMember(owner = "client!wf", name = "e", descriptor = "[I")
	private int[] anIntArray586;

	@OriginalMember(owner = "client!wf", name = "f", descriptor = "I")
	public int anInt10724;

	@OriginalMember(owner = "client!wf", name = "g", descriptor = "[I")
	public int[] anIntArray587;

	@OriginalMember(owner = "client!wf", name = "h", descriptor = "J")
	private long aLong300;

	@OriginalMember(owner = "client!wf", name = "i", descriptor = "[I")
	private int[] anIntArray588;

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "Lclient!dt;")
	private final Class3_Sub4 aClass3_Sub4_9 = new Class3_Sub4((byte[]) null);

	@OriginalMember(owner = "client!wf", name = "<init>", descriptor = "()V")
	public Class384() {
	}

	@OriginalMember(owner = "client!wf", name = "<init>", descriptor = "([B)V")
	public Class384(@OriginalArg(0) byte[] arg0) {
		this.method8794(arg0);
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(I)I")
	private int method8792(@OriginalArg(0) int arg0) {
		@Pc(7) byte local7 = this.aClass3_Sub4_9.aByteArray90[this.aClass3_Sub4_9.anInt9739];
		@Pc(13) int local13;
		if (local7 < 0) {
			local13 = local7 & 0xFF;
			this.anIntArray588[arg0] = local13;
			this.aClass3_Sub4_9.anInt9739++;
		} else {
			local13 = this.anIntArray588[arg0];
		}
		if (local13 != 240 && local13 != 247) {
			return this.method8795(arg0, local13);
		}
		@Pc(42) int local42 = this.aClass3_Sub4_9.method7925();
		if (local13 == 247 && local42 > 0) {
			@Pc(57) int local57 = this.aClass3_Sub4_9.aByteArray90[this.aClass3_Sub4_9.anInt9739] & 0xFF;
			if (local57 >= 241 && local57 <= 243 || local57 == 246 || local57 == 248 || local57 >= 250 && local57 <= 252 || local57 == 254) {
				this.aClass3_Sub4_9.anInt9739++;
				this.anIntArray588[arg0] = local57;
				return this.method8795(arg0, local57);
			}
		}
		this.aClass3_Sub4_9.anInt9739 += local42;
		return 0;
	}

	@OriginalMember(owner = "client!wf", name = "b", descriptor = "(I)V")
	public void method8793(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.aClass3_Sub4_9.method7925();
		this.anIntArray587[arg0] += local4;
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "([B)V")
	public void method8794(@OriginalArg(0) byte[] arg0) {
		this.aClass3_Sub4_9.aByteArray90 = arg0;
		this.aClass3_Sub4_9.anInt9739 = 10;
		@Pc(12) int local12 = this.aClass3_Sub4_9.method7951();
		this.anInt10724 = this.aClass3_Sub4_9.method7951();
		this.anInt10723 = 500000;
		this.anIntArray585 = new int[local12];
		@Pc(27) int local27 = 0;
		@Pc(33) int local33;
		while (local27 < local12) {
			local33 = this.aClass3_Sub4_9.method7895();
			@Pc(38) int local38 = this.aClass3_Sub4_9.method7895();
			if (local33 == 1297379947) {
				this.anIntArray585[local27] = this.aClass3_Sub4_9.anInt9739;
				local27++;
			}
			this.aClass3_Sub4_9.anInt9739 += local38;
		}
		this.aLong300 = 0L;
		this.anIntArray586 = new int[local12];
		for (local33 = 0; local33 < local12; local33++) {
			this.anIntArray586[local33] = this.anIntArray585[local33];
		}
		this.anIntArray587 = new int[local12];
		this.anIntArray588 = new int[local12];
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(II)I")
	private int method8795(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12;
		if (arg1 != 255) {
			@Pc(78) byte local78 = Static659.aByteArray101[arg1 - 128];
			local12 = arg1;
			if (local78 >= 1) {
				local12 = arg1 | this.aClass3_Sub4_9.method7954() << 8;
			}
			if (local78 >= 2) {
				local12 |= this.aClass3_Sub4_9.method7954() << 16;
			}
			return local12;
		}
		@Pc(7) int local7 = this.aClass3_Sub4_9.method7954();
		local12 = this.aClass3_Sub4_9.method7925();
		if (local7 == 47) {
			this.aClass3_Sub4_9.anInt9739 += local12;
			return 1;
		} else if (local7 == 81) {
			@Pc(32) int local32 = this.aClass3_Sub4_9.method7945();
			local12 -= 3;
			@Pc(38) int local38 = this.anIntArray587[arg0];
			this.aLong300 += (long) local38 * (long) (this.anInt10723 - local32);
			this.anInt10723 = local32;
			this.aClass3_Sub4_9.anInt9739 += local12;
			return 2;
		} else {
			this.aClass3_Sub4_9.anInt9739 += local12;
			return 3;
		}
	}

	@OriginalMember(owner = "client!wf", name = "c", descriptor = "(I)J")
	public long method8796(@OriginalArg(0) int arg0) {
		return this.aLong300 + (long) arg0 * (long) this.anInt10723;
	}

	@OriginalMember(owner = "client!wf", name = "d", descriptor = "(I)V")
	public void method8797(@OriginalArg(0) int arg0) {
		this.anIntArray586[arg0] = this.aClass3_Sub4_9.anInt9739;
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(J)V")
	public void method8798(@OriginalArg(0) long arg0) {
		this.aLong300 = arg0;
		@Pc(6) int local6 = this.anIntArray586.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			this.anIntArray587[local8] = 0;
			this.anIntArray588[local8] = 0;
			this.aClass3_Sub4_9.anInt9739 = this.anIntArray585[local8];
			this.method8793(local8);
			this.anIntArray586[local8] = this.aClass3_Sub4_9.anInt9739;
		}
	}

	@OriginalMember(owner = "client!wf", name = "e", descriptor = "(I)V")
	public void method8799(@OriginalArg(0) int arg0) {
		this.aClass3_Sub4_9.anInt9739 = this.anIntArray586[arg0];
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "()Z")
	public boolean method8800() {
		@Pc(3) int local3 = this.anIntArray586.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.anIntArray586[local5] >= 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!wf", name = "b", descriptor = "()V")
	public void method8801() {
		this.aClass3_Sub4_9.aByteArray90 = null;
		this.anIntArray585 = null;
		this.anIntArray586 = null;
		this.anIntArray587 = null;
		this.anIntArray588 = null;
	}

	@OriginalMember(owner = "client!wf", name = "f", descriptor = "(I)I")
	public int method8802(@OriginalArg(0) int arg0) {
		return this.method8792(arg0);
	}

	@OriginalMember(owner = "client!wf", name = "c", descriptor = "()Z")
	public boolean method8803() {
		return this.aClass3_Sub4_9.aByteArray90 != null;
	}

	@OriginalMember(owner = "client!wf", name = "d", descriptor = "()I")
	public int method8804() {
		return this.anIntArray586.length;
	}

	@OriginalMember(owner = "client!wf", name = "e", descriptor = "()V")
	public void method8805() {
		this.aClass3_Sub4_9.anInt9739 = -1;
	}

	@OriginalMember(owner = "client!wf", name = "f", descriptor = "()I")
	public int method8806() {
		@Pc(3) int local3 = this.anIntArray586.length;
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MAX_VALUE;
		for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
			if (this.anIntArray586[local9] >= 0 && this.anIntArray587[local9] < local7) {
				local5 = local9;
				local7 = this.anIntArray587[local9];
			}
		}
		return local5;
	}
}
