import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ee")
public final class Class28_Sub1 extends Class28 {

	@OriginalMember(owner = "client!ee", name = "sb", descriptor = "I")
	private int anInt1132;

	@OriginalMember(owner = "client!ee", name = "vb", descriptor = "[Z")
	private volatile boolean[] aBooleanArray7;

	@OriginalMember(owner = "client!ee", name = "Cb", descriptor = "I")
	private int anInt1139;

	@OriginalMember(owner = "client!ee", name = "yb", descriptor = "I")
	private int anInt1137 = -1;

	@OriginalMember(owner = "client!ee", name = "Ab", descriptor = "Z")
	private volatile boolean aBoolean63 = false;

	@OriginalMember(owner = "client!ee", name = "lb", descriptor = "Z")
	private boolean aBoolean62 = false;

	@OriginalMember(owner = "client!ee", name = "pb", descriptor = "Lclient!b;")
	private final Class8 aClass8_1;

	@OriginalMember(owner = "client!ee", name = "Db", descriptor = "I")
	private final int anInt1140;

	@OriginalMember(owner = "client!ee", name = "rb", descriptor = "Lclient!b;")
	private final Class8 aClass8_2;

	@OriginalMember(owner = "client!ee", name = "<init>", descriptor = "(Lclient!b;Lclient!b;IZZZ)V")
	public Class28_Sub1(@OriginalArg(0) Class8 arg0, @OriginalArg(1) Class8 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5) {
		super(arg3, arg4);
		this.aClass8_1 = arg0;
		this.anInt1140 = arg2;
		this.aClass8_2 = arg1;
		this.aBoolean62 = arg5;
		Static50.method996(this.anInt1140, this);
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(ZII)V")
	public void method878(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anInt1139 = arg0;
		this.anInt1132 = arg1;
		if (this.aClass8_2 == null) {
			Static182.method2820((byte) 0, true, this.anInt1140, 255, this.anInt1139, this);
		} else {
			Static76.method3252(this, this.anInt1140, this.aClass8_2);
		}
	}

	@OriginalMember(owner = "client!ee", name = "b", descriptor = "(B)V")
	private void method879() {
		this.aBooleanArray7 = new boolean[super.anObjectArray29.length];
		for (@Pc(19) int local19 = 0; local19 < this.aBooleanArray7.length; local19++) {
			this.aBooleanArray7[local19] = false;
		}
		if (this.aClass8_1 == null) {
			this.aBoolean63 = true;
			return;
		}
		this.anInt1137 = -1;
		for (@Pc(52) int local52 = 0; local52 < this.aBooleanArray7.length; local52++) {
			if (super.anIntArray87[local52] > 0) {
				Static6.method96(this.aClass8_1, local52, this);
				this.anInt1137 = local52;
			}
		}
		if (this.anInt1137 == -1) {
			this.aBoolean63 = true;
		}
	}

	@OriginalMember(owner = "client!ee", name = "b", descriptor = "(IB)V")
	@Override
	protected void method873(@OriginalArg(0) int arg0) {
		if (!this.method854(arg0)) {
			return;
		}
		if (this.aClass8_1 == null || this.aBooleanArray7 == null || !this.aBooleanArray7[arg0]) {
			Static182.method2820((byte) 2, true, arg0, this.anInt1140, super.anIntArray90[arg0], this);
		} else {
			Static76.method3252(this, arg0, this.aClass8_1);
		}
	}

	@OriginalMember(owner = "client!ee", name = "c", descriptor = "(BI)I")
	@Override
	protected int method871(@OriginalArg(1) int arg0) {
		if (!this.method854(arg0)) {
			return 0;
		} else if (super.anObjectArray29[arg0] == null) {
			return this.aBooleanArray7[arg0] ? 100 : Static29.method607(this.anInt1140, arg0);
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(Z[BIZB)V")
	public void method880(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		if (arg0) {
			if (this.aBoolean63) {
				throw new RuntimeException();
			}
			if (this.aClass8_2 != null) {
				Static180.method2785(this.anInt1140, this.aClass8_2, arg1);
			}
			this.method866(arg1);
			this.method879();
			return;
		}
		arg1[arg1.length - 2] = (byte) (super.anIntArray89[arg2] >> 8);
		arg1[arg1.length - 1] = (byte) super.anIntArray89[arg2];
		if (this.aClass8_1 != null) {
			Static180.method2785(arg2, this.aClass8_1, arg1);
			this.aBooleanArray7[arg2] = true;
		}
		if (arg3) {
			super.anObjectArray29[arg2] = Static123.method2100(arg1);
			return;
		}
	}

	@OriginalMember(owner = "client!ee", name = "c", descriptor = "(B)I")
	public int method881() {
		if (this.aBoolean63) {
			return 100;
		} else if (super.anObjectArray29 == null) {
			@Pc(24) int local24 = Static29.method607(255, this.anInt1140);
			if (local24 >= 100) {
				local24 = 99;
			}
			return local24;
		} else {
			return 99;
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(IILclient!b;[BZ)V")
	public void method882(@OriginalArg(1) int arg0, @OriginalArg(2) Class8 arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) boolean arg3) {
		@Pc(65) int local65;
		if (arg1 != this.aClass8_2) {
			if (!arg3 && arg0 == this.anInt1137) {
				this.aBoolean63 = true;
			}
			if (arg2 == null || arg2.length <= 2) {
				this.aBooleanArray7[arg0] = false;
				if (this.aBoolean62 || arg3) {
					Static182.method2820((byte) 2, arg3, arg0, this.anInt1140, super.anIntArray90[arg0], this);
				}
				return;
			}
			Static81.aCRC32_1.reset();
			Static81.aCRC32_1.update(arg2, 0, arg2.length - 2);
			local65 = (int) Static81.aCRC32_1.getValue();
			@Pc(85) int local85 = (arg2[arg2.length - 1] & 0xFF) + ((arg2[arg2.length - 2] & 0xFF) << 8);
			if (local65 != super.anIntArray90[arg0] || super.anIntArray89[arg0] != local85) {
				this.aBooleanArray7[arg0] = false;
				if (this.aBoolean62 || arg3) {
					Static182.method2820((byte) 2, arg3, arg0, this.anInt1140, super.anIntArray90[arg0], this);
				}
				return;
			}
			this.aBooleanArray7[arg0] = true;
			if (arg3) {
				super.anObjectArray29[arg0] = Static123.method2100(arg2);
				return;
			}
			return;
		}
		if (this.aBoolean63) {
			throw new RuntimeException();
		}
		if (arg2 == null) {
			Static182.method2820((byte) 0, true, this.anInt1140, 255, this.anInt1139, this);
			return;
		}
		Static81.aCRC32_1.reset();
		Static81.aCRC32_1.update(arg2, 0, arg2.length);
		local65 = (int) Static81.aCRC32_1.getValue();
		if (local65 != this.anInt1139) {
			Static182.method2820((byte) 0, true, this.anInt1140, 255, this.anInt1139, this);
			return;
		}
		@Pc(204) Class2_Sub3 local204;
		try {
			local204 = new Class2_Sub3(Static120.method2083(arg2));
		} catch (@Pc(206) RuntimeException local206) {
			Static182.method2820((byte) 0, true, this.anInt1140, 255, this.anInt1139, this);
			return;
		}
		@Pc(221) int local221 = local204.method260();
		if (local221 != 5 && local221 != 6) {
			Static182.method2820((byte) 0, true, this.anInt1140, 255, this.anInt1139, this);
			return;
		}
		@Pc(246) int local246 = 0;
		if (local221 >= 6) {
			local246 = local204.method248();
		}
		if (local246 != this.anInt1132) {
			Static182.method2820((byte) 0, true, this.anInt1140, 255, this.anInt1139, this);
			return;
		}
		this.method866(arg2);
		this.method879();
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(IB)V")
	@Override
	protected void method865(@OriginalArg(0) int arg0) {
		if (this.method854(arg0)) {
			Static58.method1121(arg0, this.anInt1140);
		}
	}
}
