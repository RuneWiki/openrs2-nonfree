import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pj")
public final class Class156 {

	@OriginalMember(owner = "client!pj", name = "c", descriptor = "[S")
	private short[] aShortArray98;

	@OriginalMember(owner = "client!pj", name = "k", descriptor = "[S")
	private short[] aShortArray99;

	@OriginalMember(owner = "client!pj", name = "p", descriptor = "[S")
	private short[] aShortArray100;

	@OriginalMember(owner = "client!pj", name = "r", descriptor = "I")
	private int anInt5139;

	@OriginalMember(owner = "client!pj", name = "t", descriptor = "[S")
	private short[] aShortArray101;

	@OriginalMember(owner = "client!pj", name = "w", descriptor = "I")
	public int anInt5142;

	@OriginalMember(owner = "client!pj", name = "d", descriptor = "Z")
	public boolean aBoolean431 = false;

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "I")
	public int anInt5127 = -1;

	@OriginalMember(owner = "client!pj", name = "e", descriptor = "I")
	private int anInt5128 = 0;

	@OriginalMember(owner = "client!pj", name = "n", descriptor = "I")
	private int anInt5136 = 0;

	@OriginalMember(owner = "client!pj", name = "f", descriptor = "I")
	private int anInt5129 = 128;

	@OriginalMember(owner = "client!pj", name = "v", descriptor = "I")
	private int anInt5141 = 0;

	@OriginalMember(owner = "client!pj", name = "q", descriptor = "I")
	private int anInt5138 = 128;

	@OriginalMember(owner = "client!pj", name = "s", descriptor = "Z")
	public boolean aBoolean432 = false;

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(IILclient!vm;BII)Lclient!jn;")
	public Class5 method4236(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class92 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = arg4;
		@Pc(24) Class116 local24 = this.anInt5127 == -1 || arg1 == -1 ? null : Static340.method5560(this.anInt5127);
		if (local24 != null) {
			local7 = arg4 | local24.method3177(arg1, arg3, false);
		}
		if (this.anInt5129 != 128) {
			local7 |= 0x2;
		}
		if (this.anInt5138 != 128 || this.anInt5141 != 0) {
			local7 |= 0x5;
		}
		@Pc(63) Class154 local63 = Static251.aClass154_79;
		@Pc(81) Class5 local81;
		synchronized (Static251.aClass154_79) {
			local81 = (Class5) Static251.aClass154_79.method4222((long) (this.anInt5142 |= arg2.anInt5370 << 29));
		}
		if (local81 == null || arg2.method4501(local81.method3992(), local7) != 0) {
			if (local81 != null) {
				local7 = arg2.method4477(local7, local81.method3992());
			}
			@Pc(108) int local108 = local7;
			if (this.aShortArray98 != null) {
				local108 = local7 | 0x2000;
			}
			if (this.aShortArray99 != null) {
				local108 |= 0x4000;
			}
			@Pc(129) Class153 local129 = Static169.method3173(Static226.aClass11_92, this.anInt5139);
			if (local129 == null) {
				return null;
			}
			local81 = arg2.method4513(local129, local108, Static121.anInt2748, this.anInt5136 + 64, this.anInt5128 + 850);
			@Pc(152) int local152;
			if (this.aShortArray98 != null) {
				for (local152 = 0; local152 < this.aShortArray98.length; local152++) {
					local81.method4022(this.aShortArray98[local152], this.aShortArray101[local152]);
				}
			}
			if (this.aShortArray99 != null) {
				for (local152 = 0; local152 < this.aShortArray99.length; local152++) {
					local81.method4009(this.aShortArray99[local152], this.aShortArray100[local152]);
				}
			}
			local81.method3988(local7);
			@Pc(202) Class154 local202 = Static251.aClass154_79;
			synchronized (Static251.aClass154_79) {
				Static251.aClass154_79.method4221((long) (this.anInt5142 |= arg2.anInt5370 << 29), local81);
			}
		}
		@Pc(231) Class5 local231 = local81.method4018((byte) 2, local7, true);
		if (local24 != null) {
			local231 = local24.method3181(arg0, 0, local7, arg1, local231, arg3, (byte) 2);
		}
		if (this.anInt5138 != 128 || this.anInt5129 != 128) {
			local231.method4015(this.anInt5138, this.anInt5129, this.anInt5138);
		}
		if (this.anInt5141 != 0) {
			if (this.anInt5141 == 90) {
				local231.method3997(4096);
			}
			if (this.anInt5141 == 180) {
				local231.method3997(8192);
			}
			if (this.anInt5141 == 270) {
				local231.method3997(12288);
			}
		}
		local231.method3988(arg4);
		return local231;
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(BLclient!tq;)V")
	public void method4238(@OriginalArg(1) Class4_Sub7 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method2380();
			if (local13 == 0) {
				return;
			}
			this.method4239(local13, arg0);
		}
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(BILclient!tq;)V")
	private void method4239(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub7 arg1) {
		if (arg0 == 1) {
			this.anInt5139 = arg1.method2404();
		} else if (arg0 == 2) {
			this.anInt5127 = arg1.method2404();
		} else if (arg0 == 4) {
			this.anInt5138 = arg1.method2404();
		} else if (arg0 == 5) {
			this.anInt5129 = arg1.method2404();
		} else if (arg0 == 6) {
			this.anInt5141 = arg1.method2404();
		} else if (arg0 == 7) {
			this.anInt5136 = arg1.method2380();
		} else if (arg0 == 8) {
			this.anInt5128 = arg1.method2380();
		} else if (arg0 == 9) {
			this.aBoolean431 = true;
		} else if (arg0 == 10) {
			this.aBoolean432 = true;
		} else {
			@Pc(85) int local85;
			@Pc(95) int local95;
			if (arg0 == 40) {
				local85 = arg1.method2380();
				this.aShortArray98 = new short[local85];
				this.aShortArray101 = new short[local85];
				for (local95 = 0; local95 < local85; local95++) {
					this.aShortArray98[local95] = (short) arg1.method2404();
					this.aShortArray101[local95] = (short) arg1.method2404();
				}
				return;
			}
			if (arg0 == 41) {
				local85 = arg1.method2380();
				this.aShortArray99 = new short[local85];
				this.aShortArray100 = new short[local85];
				for (local95 = 0; local95 < local85; local95++) {
					this.aShortArray99[local95] = (short) arg1.method2404();
					this.aShortArray100[local95] = (short) arg1.method2404();
				}
				return;
			}
		}
	}
}
