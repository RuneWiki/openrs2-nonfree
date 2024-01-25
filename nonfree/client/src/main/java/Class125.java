import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jq")
public final class Class125 {

	@OriginalMember(owner = "client!jq", name = "e", descriptor = "Lclient!rd;")
	public Class203 aClass203_1;

	@OriginalMember(owner = "client!jq", name = "k", descriptor = "I")
	public int anInt3056;

	@OriginalMember(owner = "client!jq", name = "n", descriptor = "[S")
	private short[] aShortArray53;

	@OriginalMember(owner = "client!jq", name = "p", descriptor = "[S")
	private short[] aShortArray54;

	@OriginalMember(owner = "client!jq", name = "t", descriptor = "[S")
	private short[] aShortArray55;

	@OriginalMember(owner = "client!jq", name = "u", descriptor = "I")
	private int anInt3061;

	@OriginalMember(owner = "client!jq", name = "x", descriptor = "[S")
	private short[] aShortArray56;

	@OriginalMember(owner = "client!jq", name = "g", descriptor = "I")
	private int anInt3052 = 128;

	@OriginalMember(owner = "client!jq", name = "j", descriptor = "I")
	private int anInt3055 = 0;

	@OriginalMember(owner = "client!jq", name = "f", descriptor = "I")
	private int anInt3051 = 0;

	@OriginalMember(owner = "client!jq", name = "c", descriptor = "I")
	public int anInt3050 = -1;

	@OriginalMember(owner = "client!jq", name = "m", descriptor = "I")
	private int anInt3057 = 128;

	@OriginalMember(owner = "client!jq", name = "q", descriptor = "Z")
	public boolean aBoolean236 = false;

	@OriginalMember(owner = "client!jq", name = "i", descriptor = "I")
	private int anInt3054 = 0;

	@OriginalMember(owner = "client!jq", name = "l", descriptor = "Z")
	public boolean aBoolean235 = false;

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(Lclient!rp;BI)V")
	private void method2691(@OriginalArg(0) Class3_Sub5 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt3061 = arg0.method2767();
		} else if (arg1 == 2) {
			this.anInt3050 = arg0.method2767();
		} else if (arg1 == 4) {
			this.anInt3052 = arg0.method2767();
		} else if (arg1 == 5) {
			this.anInt3057 = arg0.method2767();
		} else if (arg1 == 6) {
			this.anInt3055 = arg0.method2767();
		} else if (arg1 == 7) {
			this.anInt3054 = arg0.method2739();
		} else if (arg1 == 8) {
			this.anInt3051 = arg0.method2739();
		} else if (arg1 == 9) {
			this.aBoolean235 = true;
		} else if (arg1 == 10) {
			this.aBoolean236 = true;
			return;
		} else {
			@Pc(67) int local67;
			@Pc(77) int local77;
			if (arg1 == 40) {
				local67 = arg0.method2739();
				this.aShortArray53 = new short[local67];
				this.aShortArray54 = new short[local67];
				for (local77 = 0; local77 < local67; local77++) {
					this.aShortArray54[local77] = (short) arg0.method2767();
					this.aShortArray53[local77] = (short) arg0.method2767();
				}
				return;
			}
			if (arg1 == 41) {
				local67 = arg0.method2739();
				this.aShortArray55 = new short[local67];
				this.aShortArray56 = new short[local67];
				for (local77 = 0; local77 < local67; local77++) {
					this.aShortArray55[local77] = (short) arg0.method2767();
					this.aShortArray56[local77] = (short) arg0.method2767();
				}
				return;
			}
		}
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(Lclient!rp;B)V")
	public void method2693(@OriginalArg(0) Class3_Sub5 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method2739();
			if (local5 == 0) {
				return;
			}
			this.method2691(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(ILclient!cn;ILclient!np;III)Lclient!f;")
	public Class75 method2695(@OriginalArg(1) Class43 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class155 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = arg5;
		@Pc(24) Class177 local24 = this.anInt3050 == -1 || arg4 == -1 ? null : arg0.method930(this.anInt3050);
		if (local24 != null) {
			local7 = arg5 | local24.method4083(false, arg3, arg4);
		}
		if (this.anInt3057 != 128) {
			local7 |= 0x2;
		}
		if (this.anInt3052 != 128 || this.anInt3055 != 0) {
			local7 |= 0x5;
		}
		@Pc(63) Class139 local63 = this.aClass203_1.aClass139_63;
		@Pc(83) Class75 local83;
		synchronized (this.aClass203_1.aClass139_63) {
			local83 = (Class75) this.aClass203_1.aClass139_63.method3076((long) (this.anInt3056 |= arg2.anInt5461 << 29));
		}
		if (local83 == null || arg2.method4919(local83.method5462(), local7) != 0) {
			if (local83 != null) {
				local7 = arg2.method4920(local7, local83.method5462());
			}
			@Pc(107) int local107 = local7;
			if (this.aShortArray54 != null) {
				local107 = local7 | 0x2000;
			}
			if (this.aShortArray55 != null) {
				local107 |= 0x4000;
			}
			@Pc(130) Class239 local130 = Static214.method3327(this.aClass203_1.aClass20_72, this.anInt3061);
			if (local130 == null) {
				return null;
			}
			local83 = arg2.method4930(local130, local107, this.aClass203_1.anInt5094, this.anInt3054 + 64, this.anInt3051 - -850);
			@Pc(155) int local155;
			if (this.aShortArray54 != null) {
				for (local155 = 0; local155 < this.aShortArray54.length; local155++) {
					local83.method5484(this.aShortArray54[local155], this.aShortArray53[local155]);
				}
			}
			if (this.aShortArray55 != null) {
				for (local155 = 0; local155 < this.aShortArray55.length; local155++) {
					local83.method5459(this.aShortArray55[local155], this.aShortArray56[local155]);
				}
			}
			local83.method5479(local7);
			@Pc(203) Class139 local203 = this.aClass203_1.aClass139_63;
			synchronized (this.aClass203_1.aClass139_63) {
				this.aClass203_1.aClass139_63.method3070(local83, (long) (this.anInt3056 |= arg2.anInt5461 << 29));
			}
		}
		@Pc(247) Class75 local247 = local24 == null ? local83.method5473((byte) 2, local7, true) : local24.method4078(0, arg3, arg1, (byte) 2, local83, local7, arg4);
		if (this.anInt3052 != 128 || this.anInt3057 != 128) {
			local247.method5485(this.anInt3052, this.anInt3057, this.anInt3052);
		}
		if (this.anInt3055 != 0) {
			if (this.anInt3055 == 90) {
				local247.method5475(4096);
			}
			if (this.anInt3055 == 180) {
				local247.method5475(8192);
			}
			if (this.anInt3055 == 270) {
				local247.method5475(12288);
			}
		}
		local247.method5479(arg5);
		return local247;
	}
}
