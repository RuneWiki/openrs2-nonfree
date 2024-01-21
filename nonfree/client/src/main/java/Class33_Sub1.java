import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mc")
public final class Class33_Sub1 extends Class33 {

	@OriginalMember(owner = "client!mc", name = "Y", descriptor = "[I")
	public static int[] anIntArray265 = new int[256];

	@OriginalMember(owner = "client!mc", name = "bb", descriptor = "[Z")
	private volatile boolean[] aBooleanArray18;

	@OriginalMember(owner = "client!mc", name = "eb", descriptor = "I")
	private int anInt1952;

	@OriginalMember(owner = "client!mc", name = "jb", descriptor = "Z")
	private volatile boolean aBoolean102 = false;

	@OriginalMember(owner = "client!mc", name = "ob", descriptor = "Z")
	private boolean aBoolean103 = false;

	@OriginalMember(owner = "client!mc", name = "lb", descriptor = "I")
	private int anInt1956 = -1;

	@OriginalMember(owner = "client!mc", name = "xb", descriptor = "I")
	private final int anInt1962;

	@OriginalMember(owner = "client!mc", name = "Z", descriptor = "Lclient!b;")
	private final Class5 aClass5_2;

	@OriginalMember(owner = "client!mc", name = "pb", descriptor = "Lclient!b;")
	private final Class5 aClass5_3;

	static {
		for (@Pc(22) int local22 = 0; local22 < 256; local22++) {
			@Pc(25) int local25 = local22;
			for (@Pc(27) int local27 = 0; local27 < 8; local27++) {
				if ((local25 & 0x1) == 1) {
					local25 = local25 >>> 1 ^ 0xEDB88320;
				} else {
					local25 >>>= 0x1;
				}
			}
			anIntArray265[local22] = local25;
		}
	}

	@OriginalMember(owner = "client!mc", name = "<init>", descriptor = "(Lclient!b;Lclient!b;IZZZ)V")
	public Class33_Sub1(@OriginalArg(0) Class5 arg0, @OriginalArg(1) Class5 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5) {
		super(arg3, arg4);
		this.anInt1962 = arg2;
		this.aClass5_2 = arg0;
		this.aBoolean103 = arg5;
		this.aClass5_3 = arg1;
		Static15.method310(this.anInt1962, this);
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(ZI[BILclient!b;)V")
	public void method1155(@OriginalArg(0) boolean arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class5 arg3) {
		@Pc(65) int local65;
		if (this.aClass5_3 == arg3) {
			if (this.aBoolean102) {
				throw new RuntimeException();
			}
			if (arg1 == null) {
				Static39.method763(true, this.anInt1962, 255, this.anInt1952, this, (byte) 0);
				return;
			}
			Static18.aCRC32_6.reset();
			Static18.aCRC32_6.update(arg1, 0, arg1.length);
			local65 = (int) Static18.aCRC32_6.getValue();
			if (local65 != this.anInt1952) {
				Static39.method763(true, this.anInt1962, 255, this.anInt1952, this, (byte) 0);
				return;
			}
			this.method1147(arg1);
			this.method1158();
			return;
		}
		if (!arg0 && arg2 == this.anInt1956) {
			this.aBoolean102 = true;
		}
		if (arg1 == null || arg1.length <= 2) {
			this.aBooleanArray18[arg2] = false;
			if (this.aBoolean103 || arg0) {
				Static39.method763(arg0, arg2, this.anInt1962, super.anIntArray263[arg2], this, (byte) 2);
			}
			return;
		}
		Static18.aCRC32_6.reset();
		Static18.aCRC32_6.update(arg1, 0, arg1.length - 2);
		local65 = (int) Static18.aCRC32_6.getValue();
		@Pc(85) int local85 = (arg1[arg1.length - 1] & 0xFF) + ((arg1[arg1.length - 2] & 0xFF) << 8);
		if (local65 != super.anIntArray263[arg2] || super.anIntArray259[arg2] != local85) {
			this.aBooleanArray18[arg2] = false;
			if (this.aBoolean103 || arg0) {
				Static39.method763(arg0, arg2, this.anInt1962, super.anIntArray263[arg2], this, (byte) 2);
			}
			return;
		}
		this.aBooleanArray18[arg2] = true;
		if (arg0) {
			super.aByteArrayArray7[arg2] = arg1;
			return;
		}
	}

	@OriginalMember(owner = "client!mc", name = "f", descriptor = "(II)V")
	@Override
	protected void method1151(@OriginalArg(1) int arg0) {
		if (this.aClass5_2 == null || this.aBooleanArray18 == null || !this.aBooleanArray18[arg0]) {
			Static39.method763(true, arg0, this.anInt1962, super.anIntArray263[arg0], this, (byte) 2);
		} else {
			Static42.method812(arg0, this, this.aClass5_2);
		}
	}

	@OriginalMember(owner = "client!mc", name = "c", descriptor = "(Z)I")
	public int method1156() {
		if (this.aBoolean102) {
			return 100;
		} else if (super.aByteArrayArray7 == null) {
			@Pc(19) int local19 = Static79.method1351(this.anInt1962, 255);
			if (local19 >= 100) {
				local19 = 99;
			}
			return local19;
		} else {
			return 99;
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(IIZ[BZ)V")
	public void method1157(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) boolean arg3) {
		if (arg3) {
			if (this.aBoolean102) {
				throw new RuntimeException();
			}
			if (this.aClass5_3 != null) {
				Static26.method1801(this.aClass5_3, this.anInt1962, arg2);
			}
			this.method1147(arg2);
			this.method1158();
			return;
		}
		arg2[arg2.length - 2] = (byte) (super.anIntArray259[arg0] >> 8);
		arg2[arg2.length - 1] = (byte) super.anIntArray259[arg0];
		if (this.aClass5_2 != null) {
			Static26.method1801(this.aClass5_2, arg0, arg2);
			this.aBooleanArray18[arg0] = true;
		}
		if (arg1) {
			super.aByteArrayArray7[arg0] = arg2;
			return;
		}
	}

	@OriginalMember(owner = "client!mc", name = "d", descriptor = "(I)V")
	private void method1158() {
		this.aBooleanArray18 = new boolean[super.aByteArrayArray7.length];
		for (@Pc(9) int local9 = 0; local9 < this.aBooleanArray18.length; local9++) {
			this.aBooleanArray18[local9] = false;
		}
		if (this.aClass5_2 == null) {
			this.aBoolean102 = true;
			return;
		}
		this.anInt1956 = -1;
		for (@Pc(49) int local49 = 0; local49 < this.aBooleanArray18.length; local49++) {
			if (super.anIntArray261[local49] > 0) {
				Static79.method1348(local49, this, this.aClass5_2);
				this.anInt1956 = local49;
			}
		}
		if (this.anInt1956 == -1) {
			this.aBoolean102 = true;
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(IB)V")
	public void method1160(@OriginalArg(0) int arg0) {
		this.anInt1952 = arg0;
		if (this.aClass5_3 == null) {
			Static39.method763(true, this.anInt1962, 255, this.anInt1952, this, (byte) 0);
		} else {
			Static42.method812(this.anInt1962, this, this.aClass5_3);
		}
	}

	@OriginalMember(owner = "client!mc", name = "f", descriptor = "(I)I")
	public int method1162() {
		@Pc(14) int local14 = 0;
		@Pc(16) int local16 = 0;
		for (@Pc(18) int local18 = 0; local18 < super.aByteArrayArray7.length; local18++) {
			if (super.anIntArray261[local18] > 0) {
				local16 += this.method1167(local18);
				local14 += 100;
			}
		}
		if (local14 == 0) {
			return 100;
		} else {
			return local16 * 100 / local14;
		}
	}

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "(II)V")
	@Override
	protected void method1133(@OriginalArg(1) int arg0) {
		Static12.method261(arg0, this.anInt1962);
	}

	@OriginalMember(owner = "client!mc", name = "h", descriptor = "(II)I")
	private int method1167(@OriginalArg(1) int arg0) {
		if (super.aByteArrayArray7[arg0] == null) {
			return this.aBooleanArray18[arg0] ? 100 : Static79.method1351(arg0, this.anInt1962);
		} else {
			return 100;
		}
	}
}
