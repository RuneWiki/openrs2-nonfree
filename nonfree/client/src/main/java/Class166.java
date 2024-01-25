import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qf")
public final class Class166 {

	@OriginalMember(owner = "client!qf", name = "d", descriptor = "[S")
	private short[] aShortArray87;

	@OriginalMember(owner = "client!qf", name = "k", descriptor = "I")
	private int anInt4742;

	@OriginalMember(owner = "client!qf", name = "q", descriptor = "[S")
	private short[] aShortArray88;

	@OriginalMember(owner = "client!qf", name = "s", descriptor = "[S")
	private short[] aShortArray89;

	@OriginalMember(owner = "client!qf", name = "t", descriptor = "I")
	public int anInt4748;

	@OriginalMember(owner = "client!qf", name = "y", descriptor = "[S")
	private short[] aShortArray90;

	@OriginalMember(owner = "client!qf", name = "b", descriptor = "I")
	private int anInt4735 = 128;

	@OriginalMember(owner = "client!qf", name = "c", descriptor = "I")
	private int anInt4736 = 0;

	@OriginalMember(owner = "client!qf", name = "h", descriptor = "Z")
	public boolean aBoolean334 = false;

	@OriginalMember(owner = "client!qf", name = "e", descriptor = "I")
	private int anInt4737 = 128;

	@OriginalMember(owner = "client!qf", name = "p", descriptor = "I")
	private int anInt4746 = 0;

	@OriginalMember(owner = "client!qf", name = "w", descriptor = "I")
	private int anInt4750 = 0;

	@OriginalMember(owner = "client!qf", name = "u", descriptor = "Z")
	public boolean aBoolean336 = false;

	@OriginalMember(owner = "client!qf", name = "C", descriptor = "I")
	public int anInt4753 = -1;

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lclient!ec;II)V")
	private void method4368(@OriginalArg(0) Class6_Sub10 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt4742 = arg0.method4021();
		} else if (arg1 == 2) {
			this.anInt4753 = arg0.method4021();
		} else if (arg1 == 4) {
			this.anInt4735 = arg0.method4021();
		} else if (arg1 == 5) {
			this.anInt4737 = arg0.method4021();
		} else if (arg1 == 6) {
			this.anInt4750 = arg0.method4021();
		} else if (arg1 == 7) {
			this.anInt4736 = arg0.method3972();
		} else if (arg1 == 8) {
			this.anInt4746 = arg0.method3972();
		} else if (arg1 == 9) {
			this.aBoolean334 = true;
		} else if (arg1 == 10) {
			this.aBoolean336 = true;
		} else {
			@Pc(84) int local84;
			@Pc(94) int local94;
			if (arg1 == 40) {
				local84 = arg0.method3972();
				this.aShortArray89 = new short[local84];
				this.aShortArray88 = new short[local84];
				for (local94 = 0; local94 < local84; local94++) {
					this.aShortArray88[local94] = (short) arg0.method4021();
					this.aShortArray89[local94] = (short) arg0.method4021();
				}
			} else if (arg1 == 41) {
				local84 = arg0.method3972();
				this.aShortArray87 = new short[local84];
				this.aShortArray90 = new short[local84];
				for (local94 = 0; local94 < local84; local94++) {
					this.aShortArray90[local94] = (short) arg0.method4021();
					this.aShortArray87[local94] = (short) arg0.method4021();
				}
			}
		}
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(ILclient!ec;)V")
	public void method4370(@OriginalArg(1) Class6_Sub10 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method3972();
			if (local9 == 0) {
				return;
			}
			this.method4368(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lclient!ja;IIIII)Lclient!rc;")
	public Class78 method4372(@OriginalArg(0) Class81 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(7) int local7 = arg1;
		@Pc(23) Class24 local23 = this.anInt4753 == -1 || arg4 == -1 ? null : Static209.method3737(this.anInt4753);
		if (local23 != null) {
			local7 = arg1 | local23.method493(arg2, arg4, false);
		}
		if (this.anInt4737 != 128) {
			local7 |= 0x2;
		}
		if (this.anInt4735 != 128 || this.anInt4750 != 0) {
			local7 |= 0x5;
		}
		@Pc(62) Class70 local62 = Static108.aClass70_34;
		@Pc(80) Class78 local80;
		synchronized (Static108.aClass70_34) {
			local80 = (Class78) Static108.aClass70_34.method1396((long) (this.anInt4748 |= arg0.anInt2815 << 29));
		}
		if (local80 == null || arg0.method2958(local80.method4652(), local7) != 0) {
			if (local80 != null) {
				local7 = arg0.method2994(local7, local80.method4652());
			}
			@Pc(107) int local107 = local7;
			if (this.aShortArray88 != null) {
				local107 = local7 | 0x2000;
			}
			if (this.aShortArray90 != null) {
				local107 |= 0x4000;
			}
			@Pc(128) Class57 local128 = Static287.method4917(this.anInt4742, Static305.aClass53_141);
			if (local128 == null) {
				return null;
			}
			local80 = arg0.method3016(local128, local107, Static41.anInt6386, this.anInt4736 + 64, this.anInt4746 - -850);
			@Pc(151) int local151;
			if (this.aShortArray88 != null) {
				for (local151 = 0; local151 < this.aShortArray88.length; local151++) {
					local80.method4645(this.aShortArray88[local151], this.aShortArray89[local151]);
				}
			}
			if (this.aShortArray90 != null) {
				for (local151 = 0; local151 < this.aShortArray90.length; local151++) {
					local80.method4626(this.aShortArray90[local151], this.aShortArray87[local151]);
				}
			}
			local80.method4624(local7);
			@Pc(197) Class70 local197 = Static108.aClass70_34;
			synchronized (Static108.aClass70_34) {
				Static108.aClass70_34.method1406(local80, (long) (this.anInt4748 |= arg0.anInt2815 << 29));
			}
		}
		@Pc(228) Class78 local228 = local80.method4661((byte) 2, local7, true);
		if (local23 != null) {
			local228 = local23.method486((byte) 2, local228, arg2, arg3, arg4, local7, 0);
		}
		if (this.anInt4735 != 128 || this.anInt4737 != 128) {
			local228.method4657(this.anInt4735, this.anInt4737, this.anInt4735);
		}
		if (this.anInt4750 != 0) {
			if (this.anInt4750 == 90) {
				local228.method4648(4096);
			}
			if (this.anInt4750 == 180) {
				local228.method4648(8192);
			}
			if (this.anInt4750 == 270) {
				local228.method4648(12288);
			}
		}
		local228.method4624(arg1);
		return local228;
	}
}
