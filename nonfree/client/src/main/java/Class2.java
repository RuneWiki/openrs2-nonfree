import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aa")
public final class Class2 {

	@OriginalMember(owner = "client!aa", name = "c", descriptor = "I")
	public int anInt19;

	@OriginalMember(owner = "client!aa", name = "d", descriptor = "[S")
	private short[] aShortArray1;

	@OriginalMember(owner = "client!aa", name = "e", descriptor = "[S")
	private short[] aShortArray2;

	@OriginalMember(owner = "client!aa", name = "f", descriptor = "[S")
	private short[] aShortArray3;

	@OriginalMember(owner = "client!aa", name = "k", descriptor = "[S")
	private short[] aShortArray4;

	@OriginalMember(owner = "client!aa", name = "t", descriptor = "I")
	private int anInt28;

	@OriginalMember(owner = "client!aa", name = "g", descriptor = "I")
	private int anInt20 = 0;

	@OriginalMember(owner = "client!aa", name = "b", descriptor = "I")
	private int anInt18 = 128;

	@OriginalMember(owner = "client!aa", name = "h", descriptor = "I")
	private int anInt21 = 128;

	@OriginalMember(owner = "client!aa", name = "j", descriptor = "Z")
	public boolean aBoolean6 = false;

	@OriginalMember(owner = "client!aa", name = "i", descriptor = "I")
	public int anInt22 = -1;

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "Z")
	public boolean aBoolean5 = false;

	@OriginalMember(owner = "client!aa", name = "m", descriptor = "I")
	private int anInt24 = 0;

	@OriginalMember(owner = "client!aa", name = "v", descriptor = "I")
	private int anInt30 = 0;

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(IIILclient!tj;II)Lclient!qb;")
	public Class124 method9(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class122 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(12) int local12 = arg1;
		@Pc(26) Class131 local26 = this.anInt22 == -1 || arg4 == -1 ? null : Static343.method5604(this.anInt22);
		if (local26 != null) {
			local12 = arg1 | local26.method3416(false, arg4, arg0);
		}
		if (this.anInt18 != 128) {
			local12 |= 0x2;
		}
		if (this.anInt21 != 128 || this.anInt20 != 0) {
			local12 |= 0x5;
		}
		@Pc(62) Class198 local62 = Static164.aClass198_57;
		@Pc(80) Class124 local80;
		synchronized (Static164.aClass198_57) {
			local80 = (Class124) Static164.aClass198_57.method5242((long) (this.anInt19 |= arg2.anInt5595 << 29));
		}
		if (local80 == null || arg2.method4766(local80.method4108(), local12) != 0) {
			if (local80 != null) {
				local12 = arg2.method4799(local12, local80.method4108());
			}
			@Pc(104) int local104 = local12;
			if (this.aShortArray1 != null) {
				local104 = local12 | 0x2000;
			}
			if (this.aShortArray4 != null) {
				local104 |= 0x4000;
			}
			@Pc(125) Class40 local125 = Static26.method559(Static167.aClass100_71, this.anInt28);
			if (local125 == null) {
				return null;
			}
			local80 = arg2.method4794(local125, local104, Static6.anInt6087, this.anInt30 + 64, this.anInt24 - -850);
			@Pc(148) int local148;
			if (this.aShortArray1 != null) {
				for (local148 = 0; local148 < this.aShortArray1.length; local148++) {
					local80.method4083(this.aShortArray1[local148], this.aShortArray3[local148]);
				}
			}
			if (this.aShortArray4 != null) {
				for (local148 = 0; local148 < this.aShortArray4.length; local148++) {
					local80.method4107(this.aShortArray4[local148], this.aShortArray2[local148]);
				}
			}
			local80.method4080(local12);
			@Pc(202) Class198 local202 = Static164.aClass198_57;
			synchronized (Static164.aClass198_57) {
				Static164.aClass198_57.method5231((long) (this.anInt19 |= arg2.anInt5595 << 29), local80);
			}
		}
		@Pc(231) Class124 local231 = local80.method4094((byte) 2, local12, true);
		if (local26 != null) {
			local231 = local26.method3412((byte) 2, local12, 0, arg4, arg0, arg3, local231);
		}
		if (this.anInt21 != 128 || this.anInt18 != 128) {
			local231.method4076(this.anInt21, this.anInt18, this.anInt21);
		}
		if (this.anInt20 != 0) {
			if (this.anInt20 == 90) {
				local231.method4091(4096);
			}
			if (this.anInt20 == 180) {
				local231.method4091(8192);
			}
			if (this.anInt20 == 270) {
				local231.method4091(12288);
			}
		}
		local231.method4080(arg1);
		return local231;
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(ZLclient!fb;I)V")
	private void method10(@OriginalArg(1) Class3_Sub4 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt28 = arg0.method3649();
		} else if (arg1 == 2) {
			this.anInt22 = arg0.method3649();
		} else if (arg1 == 4) {
			this.anInt21 = arg0.method3649();
		} else if (arg1 == 5) {
			this.anInt18 = arg0.method3649();
		} else if (arg1 == 6) {
			this.anInt20 = arg0.method3649();
		} else if (arg1 == 7) {
			this.anInt30 = arg0.method3643();
		} else if (arg1 == 8) {
			this.anInt24 = arg0.method3643();
		} else if (arg1 == 9) {
			this.aBoolean6 = true;
		} else if (arg1 == 10) {
			this.aBoolean5 = true;
		} else {
			@Pc(98) int local98;
			@Pc(108) int local108;
			if (arg1 == 40) {
				local98 = arg0.method3643();
				this.aShortArray3 = new short[local98];
				this.aShortArray1 = new short[local98];
				for (local108 = 0; local108 < local98; local108++) {
					this.aShortArray1[local108] = (short) arg0.method3649();
					this.aShortArray3[local108] = (short) arg0.method3649();
				}
			} else if (arg1 == 41) {
				local98 = arg0.method3643();
				this.aShortArray4 = new short[local98];
				this.aShortArray2 = new short[local98];
				for (local108 = 0; local108 < local98; local108++) {
					this.aShortArray4[local108] = (short) arg0.method3649();
					this.aShortArray2[local108] = (short) arg0.method3649();
				}
			}
		}
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(ILclient!fb;)V")
	public void method12(@OriginalArg(1) Class3_Sub4 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method3643();
			if (local5 == 0) {
				return;
			}
			this.method10(arg0, local5);
		}
	}
}
