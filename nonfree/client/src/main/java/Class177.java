import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rs")
public final class Class177 {

	@OriginalMember(owner = "client!rs", name = "f", descriptor = "[S")
	private short[] aShortArray97;

	@OriginalMember(owner = "client!rs", name = "g", descriptor = "I")
	public int anInt5802;

	@OriginalMember(owner = "client!rs", name = "j", descriptor = "[S")
	private short[] aShortArray98;

	@OriginalMember(owner = "client!rs", name = "m", descriptor = "I")
	private int anInt5807;

	@OriginalMember(owner = "client!rs", name = "n", descriptor = "[S")
	private short[] aShortArray99;

	@OriginalMember(owner = "client!rs", name = "o", descriptor = "[S")
	private short[] aShortArray100;

	@OriginalMember(owner = "client!rs", name = "h", descriptor = "I")
	private int anInt5803 = 128;

	@OriginalMember(owner = "client!rs", name = "b", descriptor = "I")
	private int anInt5799 = 0;

	@OriginalMember(owner = "client!rs", name = "r", descriptor = "I")
	private int anInt5809 = 128;

	@OriginalMember(owner = "client!rs", name = "d", descriptor = "Z")
	public boolean aBoolean515 = false;

	@OriginalMember(owner = "client!rs", name = "p", descriptor = "Z")
	public boolean aBoolean516 = false;

	@OriginalMember(owner = "client!rs", name = "l", descriptor = "I")
	private int anInt5806 = 0;

	@OriginalMember(owner = "client!rs", name = "q", descriptor = "I")
	public int anInt5808 = -1;

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "I")
	private int anInt5798 = 0;

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(IIILclient!dr;IZ)Lclient!wp;")
	public Class49 method4854(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class37 arg3, @OriginalArg(4) int arg4) {
		@Pc(7) int local7 = arg1;
		@Pc(22) Class84 local22 = this.anInt5808 == -1 || arg0 == -1 ? null : Static91.method1822(this.anInt5808);
		if (local22 != null) {
			local7 = arg1 | local22.method2276(arg4, false, arg0);
		}
		if (this.anInt5809 != 128) {
			local7 |= 0x2;
		}
		if (this.anInt5803 != 128 || this.anInt5806 != 0) {
			local7 |= 0x5;
		}
		@Pc(60) Class107 local60 = Static310.aClass107_51;
		@Pc(78) Class49 local78;
		synchronized (Static310.aClass107_51) {
			local78 = (Class49) Static310.aClass107_51.method3021((long) (this.anInt5802 |= arg3.anInt4312 << 29));
		}
		if (local78 == null || arg3.method3686(local78.method5820(), local7) != 0) {
			if (local78 != null) {
				local7 = arg3.method3685(local7, local78.method5820());
			}
			@Pc(102) int local102 = local7;
			if (this.aShortArray98 != null) {
				local102 = local7 | 0x2000;
			}
			if (this.aShortArray100 != null) {
				local102 |= 0x4000;
			}
			@Pc(123) Class111 local123 = Static309.method5155(this.anInt5807, Static331.aClass104_169);
			if (local123 == null) {
				return null;
			}
			local78 = arg3.method3667(local123, local102, Static306.anInt4217, this.anInt5799 + 64, this.anInt5798 - -850);
			@Pc(146) int local146;
			if (this.aShortArray98 != null) {
				for (local146 = 0; local146 < this.aShortArray98.length; local146++) {
					local78.method5850(this.aShortArray98[local146], this.aShortArray99[local146]);
				}
			}
			if (this.aShortArray100 != null) {
				for (local146 = 0; local146 < this.aShortArray100.length; local146++) {
					local78.method5847(this.aShortArray100[local146], this.aShortArray97[local146]);
				}
			}
			local78.method5854(local7);
			@Pc(200) Class107 local200 = Static310.aClass107_51;
			synchronized (Static310.aClass107_51) {
				Static310.aClass107_51.method3018((long) (this.anInt5802 |= arg3.anInt4312 << 29), local78);
			}
		}
		@Pc(242) Class49 local242 = local22 == null ? local78.method5810((byte) 2, local7, true) : local22.method2279((byte) 2, local78, arg4, arg0, arg2, 0, local7);
		if (this.anInt5803 != 128 || this.anInt5809 != 128) {
			local242.method5846(this.anInt5803, this.anInt5809, this.anInt5803);
		}
		if (this.anInt5806 != 0) {
			if (this.anInt5806 == 90) {
				local242.method5857(4096);
			}
			if (this.anInt5806 == 180) {
				local242.method5857(8192);
			}
			if (this.anInt5806 == 270) {
				local242.method5857(12288);
			}
		}
		local242.method5854(arg1);
		return local242;
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(BLclient!ef;)V")
	public void method4857(@OriginalArg(1) Class2_Sub12 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method3124();
			if (local15 == 0) {
				return;
			}
			this.method4858(arg0, local15);
		}
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(BLclient!ef;I)V")
	private void method4858(@OriginalArg(1) Class2_Sub12 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt5807 = arg0.method3104();
		} else if (arg1 == 2) {
			this.anInt5808 = arg0.method3104();
		} else if (arg1 == 4) {
			this.anInt5803 = arg0.method3104();
		} else if (arg1 == 5) {
			this.anInt5809 = arg0.method3104();
		} else if (arg1 == 6) {
			this.anInt5806 = arg0.method3104();
		} else if (arg1 == 7) {
			this.anInt5799 = arg0.method3124();
		} else if (arg1 == 8) {
			this.anInt5798 = arg0.method3124();
		} else if (arg1 == 9) {
			this.aBoolean515 = true;
		} else if (arg1 == 10) {
			this.aBoolean516 = true;
		} else {
			@Pc(86) int local86;
			@Pc(96) int local96;
			if (arg1 == 40) {
				local86 = arg0.method3124();
				this.aShortArray98 = new short[local86];
				this.aShortArray99 = new short[local86];
				for (local96 = 0; local96 < local86; local96++) {
					this.aShortArray98[local96] = (short) arg0.method3104();
					this.aShortArray99[local96] = (short) arg0.method3104();
				}
			} else if (arg1 == 41) {
				local86 = arg0.method3124();
				this.aShortArray97 = new short[local86];
				this.aShortArray100 = new short[local86];
				for (local96 = 0; local96 < local86; local96++) {
					this.aShortArray100[local96] = (short) arg0.method3104();
					this.aShortArray97[local96] = (short) arg0.method3104();
				}
			}
		}
	}
}
