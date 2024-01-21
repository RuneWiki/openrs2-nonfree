import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wa")
public final class Class87 {

	@OriginalMember(owner = "client!wa", name = "h", descriptor = "Lclient!d;")
	private final Class16 aClass16_12 = new Class16(256);

	@OriginalMember(owner = "client!wa", name = "A", descriptor = "Lclient!d;")
	private final Class16 aClass16_13 = new Class16(256);

	@OriginalMember(owner = "client!wa", name = "q", descriptor = "Lclient!f;")
	private final Class13 aClass13_33;

	@OriginalMember(owner = "client!wa", name = "s", descriptor = "Lclient!f;")
	private final Class13 aClass13_34;

	@OriginalMember(owner = "client!wa", name = "<init>", descriptor = "(Lclient!f;Lclient!f;)V")
	public Class87(@OriginalArg(0) Class13 arg0, @OriginalArg(1) Class13 arg1) {
		this.aClass13_33 = arg0;
		this.aClass13_34 = arg1;
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(IBI[I)Lclient!bb;")
	private Class3_Sub4_Sub1 method2698(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		@Pc(24) int local24 = arg1 ^ (arg0 << 4 & 0xFFF8 | arg0 >>> 12);
		@Pc(30) int local30 = local24 | arg0 << 16;
		@Pc(33) long local33 = (long) local30;
		@Pc(40) Class3_Sub4_Sub1 local40 = (Class3_Sub4_Sub1) this.aClass16_13.method554(local33);
		if (local40 != null) {
			return local40;
		} else if (arg2 == null || arg2[0] > 0) {
			@Pc(58) Class66 local58 = Static187.method2241(this.aClass13_33, arg0, arg1);
			if (local58 == null) {
				return null;
			}
			local40 = local58.method2240();
			this.aClass16_13.method546(local40, local33);
			if (arg2 != null) {
				arg2[0] -= local40.aByteArray2.length;
			}
			return local40;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "([IIZ)Lclient!bb;")
	public Class3_Sub4_Sub1 method2700(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		if (this.aClass13_33.method352() == 1) {
			return this.method2698(0, arg1, arg0);
		} else if (this.aClass13_33.method353(arg1) == 1) {
			return this.method2698(arg1, 0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "([IIII)Lclient!bb;")
	private Class3_Sub4_Sub1 method2701(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(15) int local15 = ((arg1 & 0x30000FFF) << 4 | arg1 >>> 12) ^ arg2;
		@Pc(21) int local21 = local15 | arg1 << 16;
		@Pc(26) long local26 = (long) local21 ^ 0x100000000L;
		@Pc(33) Class3_Sub4_Sub1 local33 = (Class3_Sub4_Sub1) this.aClass16_13.method554(local26);
		if (local33 != null) {
			return local33;
		} else if (arg0 == null || arg0[0] > 0) {
			@Pc(54) Class3_Sub23 local54 = (Class3_Sub23) this.aClass16_12.method554(local26);
			if (local54 == null) {
				local54 = Static161.method2546(this.aClass13_34, arg1, arg2);
				if (local54 == null) {
					return null;
				}
				this.aClass16_12.method546(local54, local26);
			}
			local33 = local54.method2542(arg0);
			if (local33 == null) {
				return null;
			} else {
				local54.method2783();
				this.aClass16_13.method546(local33, local26);
				return local33;
			}
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "([IBI)Lclient!bb;")
	public Class3_Sub4_Sub1 method2704(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1) {
		if (this.aClass13_34.method352() == 1) {
			return this.method2701(arg0, 0, arg1);
		} else if (this.aClass13_34.method353(arg1) == 1) {
			return this.method2701(arg0, arg1, 0);
		} else {
			throw new RuntimeException();
		}
	}
}
