import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dj")
public final class Class23_Sub1 extends Class23 {

	@OriginalMember(owner = "client!dj", name = "jb", descriptor = "[Z")
	private volatile boolean[] aBooleanArray12;

	@OriginalMember(owner = "client!dj", name = "ob", descriptor = "I")
	private int anInt929;

	@OriginalMember(owner = "client!dj", name = "pb", descriptor = "I")
	private int anInt930;

	@OriginalMember(owner = "client!dj", name = "rb", descriptor = "Z")
	private volatile boolean aBoolean59 = false;

	@OriginalMember(owner = "client!dj", name = "vb", descriptor = "Z")
	private boolean aBoolean60 = false;

	@OriginalMember(owner = "client!dj", name = "Hb", descriptor = "I")
	private int anInt939 = -1;

	@OriginalMember(owner = "client!dj", name = "qb", descriptor = "I")
	private final int anInt931;

	@OriginalMember(owner = "client!dj", name = "Gb", descriptor = "Lclient!ci;")
	private final Class17 aClass17_2;

	@OriginalMember(owner = "client!dj", name = "xb", descriptor = "Lclient!ci;")
	private final Class17 aClass17_1;

	@OriginalMember(owner = "client!dj", name = "<init>", descriptor = "(Lclient!ci;Lclient!ci;IZZZ)V")
	public Class23_Sub1(@OriginalArg(0) Class17 arg0, @OriginalArg(1) Class17 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5) {
		super(arg3, arg4);
		this.anInt931 = arg2;
		this.aBoolean60 = arg5;
		this.aClass17_2 = arg0;
		this.aClass17_1 = arg1;
		Static65.method1070(this.anInt931, this);
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(IB)V")
	@Override
	protected void method741(@OriginalArg(0) int arg0) {
		if (this.method758(arg0)) {
			Static140.method2177(arg0, this.anInt931);
		}
	}

	@OriginalMember(owner = "client!dj", name = "d", descriptor = "(III)V")
	public void method760(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anInt929 = arg1;
		this.anInt930 = arg0;
		if (this.aClass17_1 == null) {
			Static56.method952(this.anInt929, true, this.anInt931, (byte) 0, this, 255);
		} else {
			Static73.method1193(this.aClass17_1, this.anInt931, this);
		}
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(ZILclient!ci;[BI)V")
	public void method763(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class17 arg2, @OriginalArg(3) byte[] arg3) {
		@Pc(69) int local69;
		if (arg2 != this.aClass17_1) {
			if (!arg0 && arg1 == this.anInt939) {
				this.aBoolean59 = true;
			}
			if (arg3 == null || arg3.length <= 2) {
				this.aBooleanArray12[arg1] = false;
				if (this.aBoolean60 || arg0) {
					Static56.method952(super.anIntArray87[arg1], arg0, arg1, (byte) 2, this, this.anInt931);
				}
				return;
			}
			Static141.aCRC32_2.reset();
			Static141.aCRC32_2.update(arg3, 0, arg3.length - 2);
			local69 = (int) Static141.aCRC32_2.getValue();
			@Pc(90) int local90 = ((arg3[arg3.length - 2] & 0xFF) << 8) + (arg3[arg3.length - 1] & 0xFF);
			if (super.anIntArray87[arg1] != local69 || local90 != super.anIntArray88[arg1]) {
				this.aBooleanArray12[arg1] = false;
				if (this.aBoolean60 || arg0) {
					Static56.method952(super.anIntArray87[arg1], arg0, arg1, (byte) 2, this, this.anInt931);
				}
				return;
			}
			this.aBooleanArray12[arg1] = true;
			if (arg0) {
				super.anObjectArray2[arg1] = Static122.method1927(arg3);
				return;
			}
			return;
		}
		if (this.aBoolean59) {
			throw new RuntimeException();
		}
		if (arg3 == null) {
			Static56.method952(this.anInt929, true, this.anInt931, (byte) 0, this, 255);
			return;
		}
		Static141.aCRC32_2.reset();
		Static141.aCRC32_2.update(arg3, 0, arg3.length);
		local69 = (int) Static141.aCRC32_2.getValue();
		if (local69 != this.anInt929) {
			Static56.method952(this.anInt929, true, this.anInt931, (byte) 0, this, 255);
			return;
		}
		@Pc(203) Class5_Sub6 local203;
		try {
			local203 = new Class5_Sub6(Static130.method2025(arg3));
		} catch (@Pc(205) RuntimeException local205) {
			Static56.method952(this.anInt929, true, this.anInt931, (byte) 0, this, 255);
			return;
		}
		@Pc(220) int local220 = local203.method3062();
		if (local220 != 5 && local220 != 6) {
			Static56.method952(this.anInt929, true, this.anInt931, (byte) 0, this, 255);
			return;
		}
		@Pc(241) int local241 = 0;
		if (local220 >= 6) {
			local241 = local203.method3073();
		}
		if (this.anInt930 != local241) {
			Static56.method952(this.anInt929, true, this.anInt931, (byte) 0, this, 255);
			return;
		}
		this.method745(arg3);
		this.method767();
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(ZIZZ[B)V")
	public void method764(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) byte[] arg3) {
		if (arg0) {
			if (this.aBoolean59) {
				throw new RuntimeException();
			}
			if (this.aClass17_1 != null) {
				Static118.method2462(this.anInt931, this.aClass17_1, arg3);
			}
			this.method745(arg3);
			this.method767();
			return;
		}
		arg3[arg3.length - 2] = (byte) (super.anIntArray88[arg1] >> 8);
		arg3[arg3.length - 1] = (byte) super.anIntArray88[arg1];
		if (this.aClass17_2 != null) {
			Static118.method2462(arg1, this.aClass17_2, arg3);
			this.aBooleanArray12[arg1] = true;
		}
		if (arg2) {
			super.anObjectArray2[arg1] = Static122.method1927(arg3);
			return;
		}
	}

	@OriginalMember(owner = "client!dj", name = "d", descriptor = "(I)I")
	public int method765() {
		if (this.aBoolean59) {
			return 100;
		} else if (super.anObjectArray2 == null) {
			@Pc(27) int local27 = Static140.method2173(this.anInt931, 255);
			if (local27 >= 100) {
				local27 = 99;
			}
			return local27;
		} else {
			return 99;
		}
	}

	@OriginalMember(owner = "client!dj", name = "b", descriptor = "(Z)V")
	private void method767() {
		this.aBooleanArray12 = new boolean[super.anObjectArray2.length];
		for (@Pc(9) int local9 = 0; local9 < this.aBooleanArray12.length; local9++) {
			this.aBooleanArray12[local9] = false;
		}
		if (this.aClass17_2 == null) {
			this.aBoolean59 = true;
			return;
		}
		this.anInt939 = -1;
		for (@Pc(49) int local49 = 0; local49 < this.aBooleanArray12.length; local49++) {
			if (super.anIntArray82[local49] > 0) {
				Static109.method1754(local49, this.aClass17_2, this);
				this.anInt939 = local49;
			}
		}
		if (this.anInt939 == -1) {
			this.aBoolean59 = true;
		}
	}

	@OriginalMember(owner = "client!dj", name = "b", descriptor = "(II)I")
	@Override
	protected int method733(@OriginalArg(0) int arg0) {
		if (!this.method758(arg0)) {
			return 0;
		} else if (super.anObjectArray2[arg0] == null) {
			return this.aBooleanArray12[arg0] ? 100 : Static140.method2173(arg0, this.anInt931);
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(ZI)V")
	@Override
	protected void method746(@OriginalArg(1) int arg0) {
		if (!this.method758(arg0)) {
			return;
		}
		if (this.aClass17_2 == null || this.aBooleanArray12 == null || !this.aBooleanArray12[arg0]) {
			Static56.method952(super.anIntArray87[arg0], true, arg0, (byte) 2, this, this.anInt931);
		} else {
			Static73.method1193(this.aClass17_2, arg0, this);
		}
	}
}
