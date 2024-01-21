import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qd")
public final class Class43_Sub1 extends Class43 {

	@OriginalMember(owner = "client!qd", name = "cb", descriptor = "I")
	private int anInt3150;

	@OriginalMember(owner = "client!qd", name = "sb", descriptor = "I")
	private int anInt3160;

	@OriginalMember(owner = "client!qd", name = "xb", descriptor = "[Z")
	private volatile boolean[] aBooleanArray13;

	@OriginalMember(owner = "client!qd", name = "ob", descriptor = "Z")
	private boolean aBoolean126 = false;

	@OriginalMember(owner = "client!qd", name = "rb", descriptor = "Z")
	private volatile boolean aBoolean127 = false;

	@OriginalMember(owner = "client!qd", name = "db", descriptor = "I")
	private int anInt3151 = -1;

	@OriginalMember(owner = "client!qd", name = "kb", descriptor = "I")
	private final int anInt3156;

	@OriginalMember(owner = "client!qd", name = "ib", descriptor = "Lclient!pg;")
	private final Class64 aClass64_2;

	@OriginalMember(owner = "client!qd", name = "Bb", descriptor = "Lclient!pg;")
	private final Class64 aClass64_3;

	@OriginalMember(owner = "client!qd", name = "<init>", descriptor = "(Lclient!pg;Lclient!pg;IZZZ)V")
	public Class43_Sub1(@OriginalArg(0) Class64 arg0, @OriginalArg(1) Class64 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5) {
		super(arg3, arg4);
		this.anInt3156 = arg2;
		this.aClass64_2 = arg0;
		this.aClass64_3 = arg1;
		this.aBoolean126 = arg5;
		Static83.method1518(this.anInt3156, this);
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(Lclient!pg;I[BZI)V")
	public void method2230(@OriginalArg(0) Class64 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) boolean arg3) {
		@Pc(39) int local39;
		if (arg0 != this.aClass64_3) {
			if (!arg3 && arg1 == this.anInt3151) {
				this.aBoolean127 = true;
			}
			if (arg2 == null || arg2.length <= 2) {
				this.aBooleanArray13[arg1] = false;
				if (this.aBoolean126 || arg3) {
					Static93.method1682(super.anIntArray462[arg1], (byte) 2, arg3, this.anInt3156, this, arg1);
				}
			} else {
				Static157.aCRC32_2.reset();
				Static157.aCRC32_2.update(arg2, 0, arg2.length - 2);
				local39 = (int) Static157.aCRC32_2.getValue();
				@Pc(180) int local180 = (arg2[arg2.length - 1] & 0xFF) + ((arg2[arg2.length - 2] & 0xFF) << 8);
				if (local39 == super.anIntArray462[arg1] && local180 == super.anIntArray463[arg1]) {
					this.aBooleanArray13[arg1] = true;
					if (arg3) {
						super.anObjectArray2[arg1] = Static97.method1759(arg2);
					}
				} else {
					this.aBooleanArray13[arg1] = false;
					if (this.aBoolean126 || arg3) {
						Static93.method1682(super.anIntArray462[arg1], (byte) 2, arg3, this.anInt3156, this, arg1);
					}
				}
			}
		} else if (this.aBoolean127) {
			throw new RuntimeException();
		} else if (arg2 == null) {
			Static93.method1682(this.anInt3150, (byte) 0, true, 255, this, this.anInt3156);
		} else {
			Static157.aCRC32_2.reset();
			Static157.aCRC32_2.update(arg2, 0, arg2.length);
			local39 = (int) Static157.aCRC32_2.getValue();
			@Pc(46) Class2_Sub18 local46 = new Class2_Sub18(Static130.method2233(arg2));
			@Pc(50) int local50 = local46.method2387();
			if (local50 != 5 && local50 != 6) {
				throw new RuntimeException("Incorrect JS5 protocol number: " + local50);
			}
			@Pc(73) int local73 = 0;
			if (local50 >= 6) {
				local73 = local46.method2382();
			}
			if (this.anInt3150 == local39 && this.anInt3160 == local73) {
				this.method2208(arg2);
				this.method2238();
			} else {
				Static93.method1682(this.anInt3150, (byte) 0, true, 255, this, this.anInt3156);
			}
		}
	}

	@OriginalMember(owner = "client!qd", name = "f", descriptor = "(II)I")
	private int method2231(@OriginalArg(1) int arg0) {
		if (super.anObjectArray2[arg0] == null) {
			return this.aBooleanArray13[arg0] ? 100 : Static148.method2524(arg0, this.anInt3156);
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!qd", name = "e", descriptor = "(II)V")
	@Override
	protected void method2228(@OriginalArg(0) int arg0) {
		if (this.aClass64_2 == null || this.aBooleanArray13 == null || !this.aBooleanArray13[arg0]) {
			Static93.method1682(super.anIntArray462[arg0], (byte) 2, true, this.anInt3156, this, arg0);
		} else {
			Static90.method1663(this, this.aClass64_2, arg0);
		}
	}

	@OriginalMember(owner = "client!qd", name = "d", descriptor = "(I)I")
	public int method2232() {
		if (this.aBoolean127) {
			return 100;
		} else if (super.anObjectArray2 == null) {
			@Pc(19) int local19 = Static148.method2524(this.anInt3156, 255);
			if (local19 >= 100) {
				local19 = 99;
			}
			return local19;
		} else {
			return 99;
		}
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "([BZZIB)V")
	public void method2234(@OriginalArg(0) byte[] arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3) {
		if (arg2) {
			if (this.aBoolean127) {
				throw new RuntimeException();
			}
			if (this.aClass64_3 != null) {
				Static88.method1621(this.anInt3156, this.aClass64_3, arg0);
			}
			this.method2208(arg0);
			this.method2238();
			return;
		}
		arg0[arg0.length - 2] = (byte) (super.anIntArray463[arg3] >> 8);
		arg0[arg0.length - 1] = (byte) super.anIntArray463[arg3];
		if (this.aClass64_2 != null) {
			Static88.method1621(arg3, this.aClass64_2, arg0);
			this.aBooleanArray13[arg3] = true;
		}
		if (arg1) {
			super.anObjectArray2[arg3] = Static97.method1759(arg0);
		}
	}

	@OriginalMember(owner = "client!qd", name = "d", descriptor = "(III)V")
	public void method2235(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3150 = arg1;
		this.anInt3160 = arg0;
		if (this.aClass64_3 == null) {
			Static93.method1682(this.anInt3150, (byte) 0, true, 255, this, this.anInt3156);
		} else {
			Static90.method1663(this, this.aClass64_3, this.anInt3156);
		}
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(Z)I")
	public int method2236() {
		@Pc(12) int local12 = 0;
		@Pc(14) int local14 = 0;
		for (@Pc(16) int local16 = 0; super.anObjectArray2.length > local16; local16++) {
			if (super.anIntArray460[local16] > 0) {
				local14 += this.method2231(local16);
				local12 += 100;
			}
		}
		if (local12 == 0) {
			return 100;
		} else {
			return local14 * 100 / local12;
		}
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(IB)V")
	@Override
	protected void method2204(@OriginalArg(0) int arg0) {
		Static5.method99(this.anInt3156, arg0);
	}

	@OriginalMember(owner = "client!qd", name = "f", descriptor = "(I)V")
	private void method2238() {
		this.aBooleanArray13 = new boolean[super.anObjectArray2.length];
		for (@Pc(13) int local13 = 0; local13 < this.aBooleanArray13.length; local13++) {
			this.aBooleanArray13[local13] = false;
		}
		if (this.aClass64_2 == null) {
			this.aBoolean127 = true;
			return;
		}
		this.anInt3151 = -1;
		for (@Pc(43) int local43 = 0; local43 < this.aBooleanArray13.length; local43++) {
			if (super.anIntArray460[local43] > 0) {
				Static97.method1758(this.aClass64_2, this, local43);
				this.anInt3151 = local43;
			}
		}
		if (this.anInt3151 == -1) {
			this.aBoolean127 = true;
		}
	}
}
