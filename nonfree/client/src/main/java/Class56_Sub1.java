import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mf")
public final class Class56_Sub1 extends Class56 {

	@OriginalMember(owner = "client!mf", name = "ib", descriptor = "I")
	private int anInt1660;

	@OriginalMember(owner = "client!mf", name = "nb", descriptor = "[Z")
	private volatile boolean[] aBooleanArray6;

	@OriginalMember(owner = "client!mf", name = "Ab", descriptor = "I")
	private int anInt1671;

	@OriginalMember(owner = "client!mf", name = "V", descriptor = "I")
	private int anInt1659 = -1;

	@OriginalMember(owner = "client!mf", name = "tb", descriptor = "Z")
	private boolean aBoolean68 = false;

	@OriginalMember(owner = "client!mf", name = "rb", descriptor = "Z")
	private volatile boolean aBoolean67 = false;

	@OriginalMember(owner = "client!mf", name = "Bb", descriptor = "Lclient!rb;")
	private final Class70 aClass70_2;

	@OriginalMember(owner = "client!mf", name = "vb", descriptor = "Lclient!rb;")
	private final Class70 aClass70_1;

	@OriginalMember(owner = "client!mf", name = "qb", descriptor = "I")
	private final int anInt1665;

	@OriginalMember(owner = "client!mf", name = "<init>", descriptor = "(Lclient!rb;Lclient!rb;IZZZ)V")
	public Class56_Sub1(@OriginalArg(0) Class70 arg0, @OriginalArg(1) Class70 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5) {
		super(arg3, arg4);
		this.aClass70_2 = arg1;
		this.aClass70_1 = arg0;
		this.anInt1665 = arg2;
		this.aBoolean68 = arg5;
		Static109.method1747(this.anInt1665, this);
	}

	@OriginalMember(owner = "client!mf", name = "c", descriptor = "(II)V")
	@Override
	protected void method1287(@OriginalArg(0) int arg0) {
		Static100.method1657(arg0, this.anInt1665);
	}

	@OriginalMember(owner = "client!mf", name = "b", descriptor = "(III)V")
	public void method1291(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anInt1660 = arg1;
		this.anInt1671 = arg0;
		if (this.aClass70_2 == null) {
			Static53.method1780(this.anInt1665, this, 255, true, (byte) 0, this.anInt1671);
		} else {
			Static26.method597(this.aClass70_2, this.anInt1665, this);
		}
	}

	@OriginalMember(owner = "client!mf", name = "c", descriptor = "(BI)V")
	@Override
	protected void method1284(@OriginalArg(1) int arg0) {
		if (this.aClass70_1 == null || this.aBooleanArray6 == null || !this.aBooleanArray6[arg0]) {
			Static53.method1780(arg0, this, this.anInt1665, true, (byte) 2, super.anIntArray306[arg0]);
		} else {
			Static26.method597(this.aClass70_1, arg0, this);
		}
	}

	@OriginalMember(owner = "client!mf", name = "b", descriptor = "(B)V")
	private void method1293() {
		this.aBooleanArray6 = new boolean[super.anObjectArray2.length];
		for (@Pc(19) int local19 = 0; local19 < this.aBooleanArray6.length; local19++) {
			this.aBooleanArray6[local19] = false;
		}
		if (this.aClass70_1 == null) {
			this.aBoolean67 = true;
			return;
		}
		this.anInt1659 = -1;
		for (@Pc(48) int local48 = 0; local48 < this.aBooleanArray6.length; local48++) {
			if (super.anIntArray307[local48] > 0) {
				Static127.method2043(local48, this, this.aClass70_1);
				this.anInt1659 = local48;
			}
		}
		if (this.anInt1659 == -1) {
			this.aBoolean67 = true;
		}
	}

	@OriginalMember(owner = "client!mf", name = "d", descriptor = "(I)I")
	public int method1296() {
		if (this.aBoolean67) {
			return 100;
		} else if (super.anObjectArray2 == null) {
			@Pc(26) int local26 = Static52.method1007(this.anInt1665, 255);
			if (local26 >= 100) {
				local26 = 99;
			}
			return local26;
		} else {
			return 99;
		}
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(I[BLclient!rb;IZ)V")
	public void method1297(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) Class70 arg2, @OriginalArg(4) boolean arg3) {
		@Pc(39) int local39;
		if (arg2 == this.aClass70_2) {
			if (this.aBoolean67) {
				throw new RuntimeException();
			}
			if (arg1 == null) {
				Static53.method1780(this.anInt1665, this, 255, true, (byte) 0, this.anInt1671);
				return;
			}
			Static59.aCRC32_2.reset();
			Static59.aCRC32_2.update(arg1, 0, arg1.length);
			local39 = (int) Static59.aCRC32_2.getValue();
			if (this.anInt1671 != local39 || this.anInt1660 != super.anInt1634) {
				Static53.method1780(this.anInt1665, this, 255, true, (byte) 0, this.anInt1671);
				return;
			}
			this.method1266(arg1);
			this.method1293();
			return;
		}
		if (!arg3 && this.anInt1659 == arg0) {
			this.aBoolean67 = true;
		}
		if (arg1 == null || arg1.length <= 2) {
			this.aBooleanArray6[arg0] = false;
			if (this.aBoolean68 || arg3) {
				Static53.method1780(arg0, this, this.anInt1665, arg3, (byte) 2, super.anIntArray306[arg0]);
			}
			return;
		}
		Static59.aCRC32_2.reset();
		Static59.aCRC32_2.update(arg1, 0, arg1.length - 2);
		local39 = (int) Static59.aCRC32_2.getValue();
		@Pc(144) int local144 = ((arg1[arg1.length - 2] & 0xFF) << 8) + (arg1[arg1.length - 1] & 0xFF);
		if (local39 != super.anIntArray306[arg0] || local144 != super.anIntArray303[arg0]) {
			this.aBooleanArray6[arg0] = false;
			if (this.aBoolean68 || arg3) {
				Static53.method1780(arg0, this, this.anInt1665, arg3, (byte) 2, super.anIntArray306[arg0]);
			}
			return;
		}
		this.aBooleanArray6[arg0] = true;
		if (arg3) {
			super.anObjectArray2[arg0] = Static38.method870(arg1);
		}
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(ZZB[BI)V")
	public void method1298(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3) {
		if (arg0) {
			if (this.aBoolean67) {
				throw new RuntimeException();
			}
			if (this.aClass70_2 != null) {
				Static38.method879(this.anInt1665, arg2, this.aClass70_2);
			}
			this.method1266(arg2);
			this.method1293();
			return;
		}
		arg2[arg2.length - 2] = (byte) (super.anIntArray303[arg3] >> 8);
		arg2[arg2.length - 1] = (byte) super.anIntArray303[arg3];
		if (this.aClass70_1 != null) {
			Static38.method879(arg3, arg2, this.aClass70_1);
			this.aBooleanArray6[arg3] = true;
		}
		if (arg1) {
			super.anObjectArray2[arg3] = Static38.method870(arg2);
			return;
		}
	}

	@OriginalMember(owner = "client!mf", name = "e", descriptor = "(I)I")
	public int method1299() {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		for (@Pc(11) int local11 = 0; super.anObjectArray2.length > local11; local11++) {
			if (super.anIntArray307[local11] > 0) {
				local7 += 100;
				local9 += this.method1301(local11);
			}
		}
		if (local7 == 0) {
			return 100;
		} else {
			return local9 * 100 / local7;
		}
	}

	@OriginalMember(owner = "client!mf", name = "d", descriptor = "(ZI)I")
	private int method1301(@OriginalArg(1) int arg0) {
		if (super.anObjectArray2[arg0] == null) {
			return this.aBooleanArray6[arg0] ? 100 : Static52.method1007(arg0, this.anInt1665);
		} else {
			return 100;
		}
	}
}
