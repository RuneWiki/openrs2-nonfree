import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!p")
public final class Class33_Sub1 extends Class33 {

	@OriginalMember(owner = "client!p", name = "zb", descriptor = "[Z")
	private volatile boolean[] aBooleanArray11;

	@OriginalMember(owner = "client!p", name = "Eb", descriptor = "I")
	private int anInt1881;

	@OriginalMember(owner = "client!p", name = "pb", descriptor = "Z")
	private volatile boolean aBoolean103 = false;

	@OriginalMember(owner = "client!p", name = "wb", descriptor = "Z")
	private boolean aBoolean104 = false;

	@OriginalMember(owner = "client!p", name = "Ob", descriptor = "I")
	private int anInt1889 = -1;

	@OriginalMember(owner = "client!p", name = "tb", descriptor = "I")
	private final int anInt1875;

	@OriginalMember(owner = "client!p", name = "Kb", descriptor = "Lclient!be;")
	private final Class8 aClass8_4;

	@OriginalMember(owner = "client!p", name = "Cb", descriptor = "Lclient!be;")
	private final Class8 aClass8_3;

	@OriginalMember(owner = "client!p", name = "<init>", descriptor = "(Lclient!be;Lclient!be;IZZZ)V")
	public Class33_Sub1(@OriginalArg(0) Class8 arg0, @OriginalArg(1) Class8 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5) {
		super(arg3, arg4);
		this.anInt1875 = arg2;
		this.aClass8_4 = arg1;
		this.aClass8_3 = arg0;
		this.aBoolean104 = arg5;
		Static53.method1839(this, this.anInt1875);
	}

	@OriginalMember(owner = "client!p", name = "c", descriptor = "(II)V")
	@Override
	protected void method1314(@OriginalArg(0) int arg0) {
		Static28.method560(this.anInt1875, arg0);
	}

	@OriginalMember(owner = "client!p", name = "b", descriptor = "(BI)I")
	private int method1324(@OriginalArg(1) int arg0) {
		if (super.aByteArrayArray8[arg0] == null) {
			return this.aBooleanArray11[arg0] ? 100 : Static10.method252(arg0, this.anInt1875);
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!p", name = "b", descriptor = "(B)I")
	public int method1325() {
		if (this.aBoolean103) {
			return 100;
		} else if (super.aByteArrayArray8 == null) {
			@Pc(19) int local19 = Static10.method252(this.anInt1875, 255);
			if (local19 >= 100) {
				local19 = 99;
			}
			return local19;
		} else {
			return 99;
		}
	}

	@OriginalMember(owner = "client!p", name = "e", descriptor = "(II)V")
	public void method1327(@OriginalArg(1) int arg0) {
		this.anInt1881 = arg0;
		if (this.aClass8_4 == null) {
			Static88.method1617(255, this.anInt1881, this.anInt1875, true, (byte) 0, this);
		} else {
			Static36.method619(this.aClass8_4, this.anInt1875, this);
		}
	}

	@OriginalMember(owner = "client!p", name = "d", descriptor = "(B)I")
	public int method1328() {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		for (@Pc(19) int local19 = 0; local19 < super.aByteArrayArray8.length; local19++) {
			if (super.anIntArray258[local19] > 0) {
				local7 += 100;
				local9 += this.method1324(local19);
			}
		}
		if (local7 == 0) {
			return 100;
		} else {
			return local9 * 100 / local7;
		}
	}

	@OriginalMember(owner = "client!p", name = "e", descriptor = "(I)V")
	private void method1329() {
		this.aBooleanArray11 = new boolean[super.aByteArrayArray8.length];
		for (@Pc(7) int local7 = 0; local7 < this.aBooleanArray11.length; local7++) {
			this.aBooleanArray11[local7] = false;
		}
		if (this.aClass8_3 == null) {
			this.aBoolean103 = true;
			return;
		}
		this.anInt1889 = -1;
		for (@Pc(39) int local39 = 0; local39 < this.aBooleanArray11.length; local39++) {
			if (super.anIntArray258[local39] > 0) {
				Static12.method277(this, local39, this.aClass8_3);
				this.anInt1889 = local39;
			}
		}
		if (this.anInt1889 == -1) {
			this.aBoolean103 = true;
		}
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "([BIIZLclient!be;)V")
	public void method1332(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) Class8 arg3) {
		@Pc(61) int local61;
		if (this.aClass8_4 == arg3) {
			if (this.aBoolean103) {
				throw new RuntimeException();
			}
			if (arg0 == null) {
				Static88.method1617(255, this.anInt1881, this.anInt1875, true, (byte) 0, this);
				return;
			}
			Static75.aCRC32_3.reset();
			Static75.aCRC32_3.update(arg0, 0, arg0.length);
			local61 = (int) Static75.aCRC32_3.getValue();
			if (this.anInt1881 != local61) {
				Static88.method1617(255, this.anInt1881, this.anInt1875, true, (byte) 0, this);
				return;
			}
			this.method1304(arg0);
			this.method1329();
			return;
		}
		if (!arg2 && this.anInt1889 == arg1) {
			this.aBoolean103 = true;
		}
		if (arg0 == null || arg0.length <= 2) {
			this.aBooleanArray11[arg1] = false;
			if (this.aBoolean104 || arg2) {
				Static88.method1617(this.anInt1875, super.anIntArray260[arg1], arg1, arg2, (byte) 2, this);
			}
			return;
		}
		Static75.aCRC32_3.reset();
		Static75.aCRC32_3.update(arg0, 0, arg0.length - 2);
		local61 = (int) Static75.aCRC32_3.getValue();
		@Pc(81) int local81 = (arg0[arg0.length - 1] & 0xFF) + ((arg0[arg0.length - 2] & 0xFF) << 8);
		if (super.anIntArray260[arg1] != local61 || local81 != super.anIntArray263[arg1]) {
			this.aBooleanArray11[arg1] = false;
			if (this.aBoolean104 || arg2) {
				Static88.method1617(this.anInt1875, super.anIntArray260[arg1], arg1, arg2, (byte) 2, this);
			}
			return;
		}
		this.aBooleanArray11[arg1] = true;
		if (arg2) {
			super.aByteArrayArray8[arg1] = arg0;
		}
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(Z[BIZZ)V")
	public void method1333(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		if (arg0) {
			if (this.aBoolean103) {
				throw new RuntimeException();
			}
			if (this.aClass8_4 != null) {
				Static103.method1816(this.anInt1875, arg1, this.aClass8_4);
			}
			this.method1304(arg1);
			this.method1329();
			return;
		}
		arg1[arg1.length - 2] = (byte) (super.anIntArray263[arg2] >> 8);
		arg1[arg1.length - 1] = (byte) super.anIntArray263[arg2];
		if (this.aClass8_3 != null) {
			Static103.method1816(arg2, arg1, this.aClass8_3);
			this.aBooleanArray11[arg2] = true;
		}
		if (arg3) {
			super.aByteArrayArray8[arg2] = arg1;
		}
	}

	@OriginalMember(owner = "client!p", name = "b", descriptor = "(II)V")
	@Override
	protected void method1306(@OriginalArg(1) int arg0) {
		if (this.aClass8_3 == null || this.aBooleanArray11 == null || !this.aBooleanArray11[arg0]) {
			Static88.method1617(this.anInt1875, super.anIntArray260[arg0], arg0, true, (byte) 2, this);
		} else {
			Static36.method619(this.aClass8_3, arg0, this);
		}
	}
}
