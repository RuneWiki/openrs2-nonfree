import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wp")
public final class Class215 {

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "[S")
	private short[] aShortArray115;

	@OriginalMember(owner = "client!wp", name = "h", descriptor = "[S")
	private short[] aShortArray116;

	@OriginalMember(owner = "client!wp", name = "i", descriptor = "[S")
	private short[] aShortArray117;

	@OriginalMember(owner = "client!wp", name = "k", descriptor = "I")
	public int anInt6962;

	@OriginalMember(owner = "client!wp", name = "n", descriptor = "I")
	private int anInt6965;

	@OriginalMember(owner = "client!wp", name = "A", descriptor = "[S")
	private short[] aShortArray118;

	@OriginalMember(owner = "client!wp", name = "l", descriptor = "I")
	private int anInt6963 = 0;

	@OriginalMember(owner = "client!wp", name = "b", descriptor = "I")
	private int anInt6957 = 128;

	@OriginalMember(owner = "client!wp", name = "j", descriptor = "Z")
	public boolean aBoolean621 = false;

	@OriginalMember(owner = "client!wp", name = "r", descriptor = "I")
	public int anInt6968 = -1;

	@OriginalMember(owner = "client!wp", name = "p", descriptor = "I")
	private int anInt6966 = 0;

	@OriginalMember(owner = "client!wp", name = "c", descriptor = "I")
	private int anInt6958 = 128;

	@OriginalMember(owner = "client!wp", name = "z", descriptor = "I")
	private int anInt6971 = 0;

	@OriginalMember(owner = "client!wp", name = "f", descriptor = "Z")
	public boolean aBoolean620 = false;

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(ILclient!dg;)V")
	public void method5982(@OriginalArg(1) Class2_Sub10 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method4421();
			if (local13 == 0) {
				return;
			}
			this.method5986(local13, arg0);
		}
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(ILclient!ae;IBII)Lclient!bk;")
	public Class7 method5985(@OriginalArg(0) int arg0, @OriginalArg(1) Class4 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = arg0;
		@Pc(24) Class107 local24 = this.anInt6968 == -1 || arg2 == -1 ? null : Static212.method3773(this.anInt6968);
		if (local24 != null) {
			local7 = arg0 | local24.method3045(arg3, arg2, false);
		}
		if (this.anInt6957 != 128) {
			local7 |= 0x2;
		}
		if (this.anInt6958 != 128 || this.anInt6966 != 0) {
			local7 |= 0x5;
		}
		@Pc(60) Class119 local60 = Static218.aClass119_129;
		@Pc(78) Class7 local78;
		synchronized (Static218.aClass119_129) {
			local78 = (Class7) Static218.aClass119_129.method3311((long) (this.anInt6962 |= arg1.anInt4681 << 29));
		}
		if (local78 == null || arg1.method4276(local78.method1435(), local7) != 0) {
			if (local78 != null) {
				local7 = arg1.method4256(local7, local78.method1435());
			}
			@Pc(102) int local102 = local7;
			if (this.aShortArray116 != null) {
				local102 = local7 | 0x2000;
			}
			if (this.aShortArray118 != null) {
				local102 |= 0x4000;
			}
			@Pc(123) Class192 local123 = Static111.method2400(Static164.aClass191_102, this.anInt6965);
			if (local123 == null) {
				return null;
			}
			local78 = arg1.method4237(local123, local102, Static47.anInt1032, this.anInt6963 + 64, this.anInt6971 - -850);
			@Pc(146) int local146;
			if (this.aShortArray116 != null) {
				for (local146 = 0; local146 < this.aShortArray116.length; local146++) {
					local78.method1417(this.aShortArray116[local146], this.aShortArray117[local146]);
				}
			}
			if (this.aShortArray118 != null) {
				for (local146 = 0; local146 < this.aShortArray118.length; local146++) {
					local78.method1401(this.aShortArray118[local146], this.aShortArray115[local146]);
				}
			}
			local78.method1412(local7);
			@Pc(196) Class119 local196 = Static218.aClass119_129;
			synchronized (Static218.aClass119_129) {
				Static218.aClass119_129.method3308(local78, (long) (this.anInt6962 |= arg1.anInt4681 << 29));
			}
		}
		@Pc(238) Class7 local238 = local24 == null ? local78.method1436((byte) 2, local7, true) : local24.method3051(arg2, arg3, 0, arg4, local7, (byte) 2, local78);
		if (this.anInt6958 != 128 || this.anInt6957 != 128) {
			local238.method1445(this.anInt6958, this.anInt6957, this.anInt6958);
		}
		if (this.anInt6966 != 0) {
			if (this.anInt6966 == 90) {
				local238.method1438(4096);
			}
			if (this.anInt6966 == 180) {
				local238.method1438(8192);
			}
			if (this.anInt6966 == 270) {
				local238.method1438(12288);
			}
		}
		local238.method1412(arg0);
		return local238;
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(ILclient!dg;I)V")
	private void method5986(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub10 arg1) {
		if (arg0 == 1) {
			this.anInt6965 = arg1.method4464();
		} else if (arg0 == 2) {
			this.anInt6968 = arg1.method4464();
		} else if (arg0 == 4) {
			this.anInt6958 = arg1.method4464();
		} else if (arg0 == 5) {
			this.anInt6957 = arg1.method4464();
		} else if (arg0 == 6) {
			this.anInt6966 = arg1.method4464();
		} else if (arg0 == 7) {
			this.anInt6963 = arg1.method4421();
		} else if (arg0 == 8) {
			this.anInt6971 = arg1.method4421();
		} else if (arg0 == 9) {
			this.aBoolean620 = true;
		} else if (arg0 == 10) {
			this.aBoolean621 = true;
		} else {
			@Pc(83) int local83;
			@Pc(93) int local93;
			if (arg0 == 40) {
				local83 = arg1.method4421();
				this.aShortArray117 = new short[local83];
				this.aShortArray116 = new short[local83];
				for (local93 = 0; local93 < local83; local93++) {
					this.aShortArray116[local93] = (short) arg1.method4464();
					this.aShortArray117[local93] = (short) arg1.method4464();
				}
			} else if (arg0 == 41) {
				local83 = arg1.method4421();
				this.aShortArray118 = new short[local83];
				this.aShortArray115 = new short[local83];
				for (local93 = 0; local93 < local83; local93++) {
					this.aShortArray118[local93] = (short) arg1.method4464();
					this.aShortArray115[local93] = (short) arg1.method4464();
				}
				return;
			}
		}
	}
}
