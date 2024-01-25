import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pr")
public final class Class162 {

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "[S")
	private short[] aShortArray62;

	@OriginalMember(owner = "client!pr", name = "c", descriptor = "I")
	public int anInt4896;

	@OriginalMember(owner = "client!pr", name = "g", descriptor = "[S")
	private short[] aShortArray63;

	@OriginalMember(owner = "client!pr", name = "l", descriptor = "I")
	private int anInt4903;

	@OriginalMember(owner = "client!pr", name = "s", descriptor = "[S")
	private short[] aShortArray64;

	@OriginalMember(owner = "client!pr", name = "t", descriptor = "[S")
	private short[] aShortArray65;

	@OriginalMember(owner = "client!pr", name = "j", descriptor = "I")
	private int anInt4901 = 0;

	@OriginalMember(owner = "client!pr", name = "e", descriptor = "Z")
	public boolean aBoolean394 = false;

	@OriginalMember(owner = "client!pr", name = "i", descriptor = "I")
	private int anInt4900 = 0;

	@OriginalMember(owner = "client!pr", name = "f", descriptor = "I")
	private int anInt4898 = 0;

	@OriginalMember(owner = "client!pr", name = "v", descriptor = "I")
	public int anInt4910 = -1;

	@OriginalMember(owner = "client!pr", name = "p", descriptor = "I")
	private int anInt4906 = 128;

	@OriginalMember(owner = "client!pr", name = "w", descriptor = "Z")
	public boolean aBoolean395 = false;

	@OriginalMember(owner = "client!pr", name = "z", descriptor = "I")
	private int anInt4912 = 128;

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(Lclient!nj;B)V")
	public void method4319(@OriginalArg(0) Class1_Sub21 arg0) {
		while (true) {
			@Pc(16) int local16 = arg0.method5720();
			if (local16 == 0) {
				return;
			}
			this.method4324(arg0, local16);
		}
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(Lclient!nj;II)V")
	private void method4324(@OriginalArg(0) Class1_Sub21 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt4903 = arg0.method5715();
		} else if (arg1 == 2) {
			this.anInt4910 = arg0.method5715();
		} else if (arg1 == 4) {
			this.anInt4912 = arg0.method5715();
		} else if (arg1 == 5) {
			this.anInt4906 = arg0.method5715();
		} else if (arg1 == 6) {
			this.anInt4900 = arg0.method5715();
		} else if (arg1 == 7) {
			this.anInt4898 = arg0.method5720();
		} else if (arg1 == 8) {
			this.anInt4901 = arg0.method5720();
		} else if (arg1 == 9) {
			this.aBoolean395 = true;
		} else if (arg1 == 10) {
			this.aBoolean394 = true;
		} else {
			@Pc(105) int local105;
			@Pc(115) int local115;
			if (arg1 == 40) {
				local105 = arg0.method5720();
				this.aShortArray65 = new short[local105];
				this.aShortArray63 = new short[local105];
				for (local115 = 0; local115 < local105; local115++) {
					this.aShortArray65[local115] = (short) arg0.method5715();
					this.aShortArray63[local115] = (short) arg0.method5715();
				}
			} else if (arg1 == 41) {
				local105 = arg0.method5720();
				this.aShortArray64 = new short[local105];
				this.aShortArray62 = new short[local105];
				for (local115 = 0; local115 < local105; local115++) {
					this.aShortArray64[local115] = (short) arg0.method5715();
					this.aShortArray62[local115] = (short) arg0.method5715();
				}
			}
		}
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(IBLclient!ii;III)Lclient!dc;")
	public Class40 method4328(@OriginalArg(0) int arg0, @OriginalArg(2) Class105 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = arg0;
		@Pc(21) Class177 local21 = this.anInt4910 == -1 || arg4 == -1 ? null : Static354.method5863(this.anInt4910);
		if (local21 != null) {
			local7 = arg0 | local21.method4742(arg4, arg2, false);
		}
		if (this.anInt4906 != 128) {
			local7 |= 0x2;
		}
		if (this.anInt4912 != 128 || this.anInt4900 != 0) {
			local7 |= 0x5;
		}
		@Pc(63) Class37 local63 = Static337.aClass37_107;
		@Pc(81) Class40 local81;
		synchronized (Static337.aClass37_107) {
			local81 = (Class40) Static337.aClass37_107.method915((long) (this.anInt4896 |= arg1.anInt4861 << 29));
		}
		if (local81 == null || arg1.method4223(local81.method4602(), local7) != 0) {
			if (local81 != null) {
				local7 = arg1.method4214(local7, local81.method4602());
			}
			@Pc(105) int local105 = local7;
			if (this.aShortArray65 != null) {
				local105 = local7 | 0x2000;
			}
			if (this.aShortArray64 != null) {
				local105 |= 0x4000;
			}
			@Pc(126) Class219 local126 = Static154.method2690(this.anInt4903, Static253.aClass134_119);
			if (local126 == null) {
				return null;
			}
			local81 = arg1.method4301(local126, local105, Static214.anInt4544, this.anInt4898 + 64, this.anInt4901 + 850);
			@Pc(149) int local149;
			if (this.aShortArray65 != null) {
				for (local149 = 0; local149 < this.aShortArray65.length; local149++) {
					local81.method4579(this.aShortArray65[local149], this.aShortArray63[local149]);
				}
			}
			if (this.aShortArray64 != null) {
				for (local149 = 0; local149 < this.aShortArray64.length; local149++) {
					local81.method4610(this.aShortArray64[local149], this.aShortArray62[local149]);
				}
			}
			local81.method4601(local7);
			@Pc(199) Class37 local199 = Static337.aClass37_107;
			synchronized (Static337.aClass37_107) {
				Static337.aClass37_107.method922((long) (this.anInt4896 |= arg1.anInt4861 << 29), local81);
			}
		}
		@Pc(228) Class40 local228 = local81.method4599((byte) 2, local7, true);
		if (local21 != null) {
			local228 = local21.method4740((byte) 2, 0, arg4, arg2, local228, arg3, local7);
		}
		if (this.anInt4912 != 128 || this.anInt4906 != 128) {
			local228.method4611(this.anInt4912, this.anInt4906, this.anInt4912);
		}
		if (this.anInt4900 != 0) {
			if (this.anInt4900 == 90) {
				local228.method4620(4096);
			}
			if (this.anInt4900 == 180) {
				local228.method4620(8192);
			}
			if (this.anInt4900 == 270) {
				local228.method4620(12288);
			}
		}
		local228.method4601(arg0);
		return local228;
	}
}
