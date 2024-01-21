import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kd")
public final class Class40_Sub1 extends Class40 {

	@OriginalMember(owner = "client!kd", name = "eb", descriptor = "I")
	private int anInt1528;

	@OriginalMember(owner = "client!kd", name = "Cb", descriptor = "[Z")
	private volatile boolean[] aBooleanArray7;

	@OriginalMember(owner = "client!kd", name = "Eb", descriptor = "I")
	private int anInt1545;

	@OriginalMember(owner = "client!kd", name = "gb", descriptor = "Z")
	private volatile boolean aBoolean58 = false;

	@OriginalMember(owner = "client!kd", name = "bb", descriptor = "I")
	private int anInt1526 = -1;

	@OriginalMember(owner = "client!kd", name = "yb", descriptor = "Z")
	private boolean aBoolean59 = false;

	@OriginalMember(owner = "client!kd", name = "fb", descriptor = "I")
	private final int anInt1529;

	@OriginalMember(owner = "client!kd", name = "pb", descriptor = "Lclient!oa;")
	private final Class54 aClass54_2;

	@OriginalMember(owner = "client!kd", name = "xb", descriptor = "Lclient!oa;")
	private final Class54 aClass54_3;

	@OriginalMember(owner = "client!kd", name = "<init>", descriptor = "(Lclient!oa;Lclient!oa;IZZZ)V")
	public Class40_Sub1(@OriginalArg(0) Class54 arg0, @OriginalArg(1) Class54 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5) {
		super(arg3, arg4);
		this.anInt1529 = arg2;
		this.aClass54_2 = arg1;
		this.aBoolean59 = arg5;
		this.aClass54_3 = arg0;
		Static9.method134(this.anInt1529, this);
	}

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(Z)V")
	private void method1122() {
		this.aBooleanArray7 = new boolean[super.anObjectArray2.length];
		for (@Pc(13) int local13 = 0; local13 < this.aBooleanArray7.length; local13++) {
			this.aBooleanArray7[local13] = false;
		}
		if (this.aClass54_3 == null) {
			this.aBoolean58 = true;
			return;
		}
		this.anInt1526 = -1;
		for (@Pc(43) int local43 = 0; local43 < this.aBooleanArray7.length; local43++) {
			if (super.anIntArray165[local43] > 0) {
				Static37.method642(this, local43, this.aClass54_3);
				this.anInt1526 = local43;
			}
		}
		if (this.anInt1526 == -1) {
			this.aBoolean58 = true;
		}
	}

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(IB)V")
	@Override
	protected void method1104(@OriginalArg(0) int arg0) {
		if (this.aClass54_3 == null || this.aBooleanArray7 == null || !this.aBooleanArray7[arg0]) {
			Static10.method201(this.anInt1529, true, (byte) 2, arg0, this, super.anIntArray162[arg0]);
		} else {
			Static116.method1952(this, this.aClass54_3, arg0);
		}
	}

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(I)I")
	public int method1124() {
		if (this.aBoolean58) {
			return 100;
		} else if (super.anObjectArray2 == null) {
			@Pc(19) int local19 = Static7.method2112(this.anInt1529, 255);
			if (local19 >= 100) {
				local19 = 99;
			}
			return local19;
		} else {
			return 99;
		}
	}

	@OriginalMember(owner = "client!kd", name = "e", descriptor = "(II)I")
	private int method1126(@OriginalArg(1) int arg0) {
		if (super.anObjectArray2[arg0] == null) {
			return this.aBooleanArray7[arg0] ? 100 : Static7.method2112(arg0, this.anInt1529);
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!kd", name = "c", descriptor = "(III)V")
	public void method1128(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1545 = arg0;
		this.anInt1528 = arg1;
		if (this.aClass54_2 == null) {
			Static10.method201(255, true, (byte) 0, this.anInt1529, this, this.anInt1545);
		} else {
			Static116.method1952(this, this.aClass54_2, this.anInt1529);
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIZ[BZ)V")
	public void method1129(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) boolean arg3) {
		if (arg3) {
			if (this.aBoolean58) {
				throw new RuntimeException();
			}
			if (this.aClass54_2 != null) {
				Static43.method724(arg2, this.anInt1529, this.aClass54_2);
			}
			this.method1097(arg2);
			this.method1122();
			return;
		}
		arg2[arg2.length - 2] = (byte) (super.anIntArray160[arg0] >> 8);
		arg2[arg2.length - 1] = (byte) super.anIntArray160[arg0];
		if (this.aClass54_3 != null) {
			Static43.method724(arg2, arg0, this.aClass54_3);
			this.aBooleanArray7[arg0] = true;
		}
		if (arg1) {
			super.anObjectArray2[arg0] = Static14.method2129(arg2);
			return;
		}
	}

	@OriginalMember(owner = "client!kd", name = "e", descriptor = "(B)I")
	public int method1130() {
		@Pc(7) int local7 = 0;
		@Pc(14) int local14 = 0;
		for (@Pc(16) int local16 = 0; super.anObjectArray2.length > local16; local16++) {
			if (super.anIntArray165[local16] > 0) {
				local7 += 100;
				local14 += this.method1126(local16);
			}
		}
		if (local7 == 0) {
			return 100;
		} else {
			return local14 * 100 / local7;
		}
	}

	@OriginalMember(owner = "client!kd", name = "d", descriptor = "(II)V")
	@Override
	protected void method1117(@OriginalArg(0) int arg0) {
		Static123.method2063(arg0, this.anInt1529);
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(B[BIZLclient!oa;)V")
	public void method1131(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) Class54 arg3) {
		@Pc(66) int local66;
		if (this.aClass54_2 == arg3) {
			if (this.aBoolean58) {
				throw new RuntimeException();
			}
			if (arg0 == null) {
				Static10.method201(255, true, (byte) 0, this.anInt1529, this, this.anInt1545);
				return;
			}
			Static83.aCRC32_2.reset();
			Static83.aCRC32_2.update(arg0, 0, arg0.length);
			local66 = (int) Static83.aCRC32_2.getValue();
			if (local66 != this.anInt1545 || this.anInt1528 != super.anInt1505) {
				Static10.method201(255, true, (byte) 0, this.anInt1529, this, this.anInt1545);
				return;
			}
			this.method1097(arg0);
			this.method1122();
			return;
		}
		if (!arg2 && arg1 == this.anInt1526) {
			this.aBoolean58 = true;
		}
		if (arg0 == null || arg0.length <= 2) {
			this.aBooleanArray7[arg1] = false;
			if (this.aBoolean59 || arg2) {
				Static10.method201(this.anInt1529, arg2, (byte) 2, arg1, this, super.anIntArray162[arg1]);
			}
			return;
		}
		Static83.aCRC32_2.reset();
		Static83.aCRC32_2.update(arg0, 0, arg0.length - 2);
		local66 = (int) Static83.aCRC32_2.getValue();
		@Pc(86) int local86 = (arg0[arg0.length - 1] & 0xFF) + ((arg0[arg0.length - 2] & 0xFF) << 8);
		if (local66 != super.anIntArray162[arg1] || local86 != super.anIntArray160[arg1]) {
			this.aBooleanArray7[arg1] = false;
			if (this.aBoolean59 || arg2) {
				Static10.method201(this.anInt1529, arg2, (byte) 2, arg1, this, super.anIntArray162[arg1]);
			}
			return;
		}
		this.aBooleanArray7[arg1] = true;
		if (arg2) {
			super.anObjectArray2[arg1] = Static14.method2129(arg0);
			return;
		}
	}
}
