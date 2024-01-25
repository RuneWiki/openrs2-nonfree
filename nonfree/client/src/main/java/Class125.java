import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mc")
public final class Class125 {

	@OriginalMember(owner = "client!mc", name = "c", descriptor = "[S")
	private short[] aShortArray49;

	@OriginalMember(owner = "client!mc", name = "d", descriptor = "I")
	public int anInt3908;

	@OriginalMember(owner = "client!mc", name = "g", descriptor = "[S")
	private short[] aShortArray50;

	@OriginalMember(owner = "client!mc", name = "i", descriptor = "I")
	private int anInt3911;

	@OriginalMember(owner = "client!mc", name = "l", descriptor = "[S")
	private short[] aShortArray51;

	@OriginalMember(owner = "client!mc", name = "r", descriptor = "[S")
	private short[] aShortArray52;

	@OriginalMember(owner = "client!mc", name = "e", descriptor = "Z")
	public boolean aBoolean334 = false;

	@OriginalMember(owner = "client!mc", name = "f", descriptor = "I")
	private int anInt3909 = 128;

	@OriginalMember(owner = "client!mc", name = "k", descriptor = "I")
	public int anInt3913 = -1;

	@OriginalMember(owner = "client!mc", name = "q", descriptor = "I")
	private int anInt3917 = 0;

	@OriginalMember(owner = "client!mc", name = "h", descriptor = "I")
	private int anInt3910 = 0;

	@OriginalMember(owner = "client!mc", name = "n", descriptor = "I")
	private int anInt3915 = 128;

	@OriginalMember(owner = "client!mc", name = "u", descriptor = "Z")
	public boolean aBoolean335 = false;

	@OriginalMember(owner = "client!mc", name = "s", descriptor = "I")
	private int anInt3918 = 0;

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lclient!eb;I)V")
	public void method3643(@OriginalArg(0) Class1_Sub7 arg0) {
		while (true) {
			@Pc(7) int local7 = arg0.method3141();
			if (local7 == 0) {
				return;
			}
			this.method3649(arg0, local7);
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(IIIILclient!aa;I)Lclient!hc;")
	public Class78 method3646(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class2 arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = arg4;
		@Pc(23) Class121 local23 = this.anInt3913 == -1 || arg0 == -1 ? null : Static133.method2520(this.anInt3913);
		if (local23 != null) {
			local7 = arg4 | local23.method3559(arg2, false, arg0);
		}
		if (this.anInt3915 != 128) {
			local7 |= 0x2;
		}
		if (this.anInt3909 != 128 || this.anInt3910 != 0) {
			local7 |= 0x5;
		}
		@Pc(60) Class140 local60 = Static95.aClass140_53;
		@Pc(78) Class78 local78;
		synchronized (Static95.aClass140_53) {
			local78 = (Class78) Static95.aClass140_53.method3816((long) (this.anInt3908 |= arg3.anInt3495 << 29));
		}
		if (local78 == null || arg3.method3247(local78.method4398(), local7) != 0) {
			if (local78 != null) {
				local7 = arg3.method3292(local7, local78.method4398());
			}
			@Pc(102) int local102 = local7;
			if (this.aShortArray50 != null) {
				local102 = local7 | 0x2000;
			}
			if (this.aShortArray49 != null) {
				local102 |= 0x4000;
			}
			@Pc(123) Class12 local123 = Static328.method5503(Static207.aClass165_63, this.anInt3911);
			if (local123 == null) {
				return null;
			}
			local78 = arg3.method3251(local123, local102, Static66.anInt1398, this.anInt3918 + 64, this.anInt3917 + 850);
			@Pc(146) int local146;
			if (this.aShortArray50 != null) {
				for (local146 = 0; local146 < this.aShortArray50.length; local146++) {
					local78.method4374(this.aShortArray50[local146], this.aShortArray52[local146]);
				}
			}
			if (this.aShortArray49 != null) {
				for (local146 = 0; local146 < this.aShortArray49.length; local146++) {
					local78.method4404(this.aShortArray49[local146], this.aShortArray51[local146]);
				}
			}
			local78.method4373(local7);
			@Pc(196) Class140 local196 = Static95.aClass140_53;
			synchronized (Static95.aClass140_53) {
				Static95.aClass140_53.method3817((long) (this.anInt3908 |= arg3.anInt3495 << 29), local78);
			}
		}
		@Pc(246) Class78 local246 = local23 == null ? local78.method4394((byte) 2, local7, true) : local23.method3558((byte) 2, arg1, 0, local7, local78, arg0, arg2);
		if (this.anInt3909 != 128 || this.anInt3915 != 128) {
			local246.method4393(this.anInt3909, this.anInt3915, this.anInt3909);
		}
		if (this.anInt3910 != 0) {
			if (this.anInt3910 == 90) {
				local246.method4372(4096);
			}
			if (this.anInt3910 == 180) {
				local246.method4372(8192);
			}
			if (this.anInt3910 == 270) {
				local246.method4372(12288);
			}
		}
		local246.method4373(arg4);
		return local246;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lclient!eb;II)V")
	private void method3649(@OriginalArg(0) Class1_Sub7 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt3911 = arg0.method3115();
		} else if (arg1 == 2) {
			this.anInt3913 = arg0.method3115();
		} else if (arg1 == 4) {
			this.anInt3909 = arg0.method3115();
		} else if (arg1 == 5) {
			this.anInt3915 = arg0.method3115();
		} else if (arg1 == 6) {
			this.anInt3910 = arg0.method3115();
		} else if (arg1 == 7) {
			this.anInt3918 = arg0.method3141();
		} else if (arg1 == 8) {
			this.anInt3917 = arg0.method3141();
		} else if (arg1 == 9) {
			this.aBoolean334 = true;
		} else if (arg1 == 10) {
			this.aBoolean335 = true;
		} else {
			@Pc(80) int local80;
			@Pc(90) int local90;
			if (arg1 == 40) {
				local80 = arg0.method3141();
				this.aShortArray52 = new short[local80];
				this.aShortArray50 = new short[local80];
				for (local90 = 0; local90 < local80; local90++) {
					this.aShortArray50[local90] = (short) arg0.method3115();
					this.aShortArray52[local90] = (short) arg0.method3115();
				}
			} else if (arg1 == 41) {
				local80 = arg0.method3141();
				this.aShortArray49 = new short[local80];
				this.aShortArray51 = new short[local80];
				for (local90 = 0; local90 < local80; local90++) {
					this.aShortArray49[local90] = (short) arg0.method3115();
					this.aShortArray51[local90] = (short) arg0.method3115();
				}
				return;
			}
		}
	}
}
