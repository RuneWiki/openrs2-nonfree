import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sb")
public final class Class77 {

	@OriginalMember(owner = "client!sb", name = "l", descriptor = "Lclient!db;")
	private final Class20 aClass20_11 = new Class20(256);

	@OriginalMember(owner = "client!sb", name = "t", descriptor = "Lclient!db;")
	private final Class20 aClass20_12 = new Class20(256);

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "Lclient!nh;")
	private final Class62 aClass62_39;

	@OriginalMember(owner = "client!sb", name = "r", descriptor = "Lclient!nh;")
	private final Class62 aClass62_40;

	@OriginalMember(owner = "client!sb", name = "<init>", descriptor = "(Lclient!nh;Lclient!nh;)V")
	public Class77(@OriginalArg(0) Class62 arg0, @OriginalArg(1) Class62 arg1) {
		this.aClass62_39 = arg0;
		this.aClass62_40 = arg1;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(I[III)Lclient!vf;")
	private Class4_Sub12_Sub1 method2603(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15 = ((arg2 & 0xB0000FFF) << 4 | arg2 >>> 12) ^ arg1;
		@Pc(21) int local21 = local15 | arg2 << 16;
		@Pc(26) long local26 = (long) local21 ^ 0x100000000L;
		@Pc(33) Class4_Sub12_Sub1 local33 = (Class4_Sub12_Sub1) this.aClass20_12.method505(local26);
		if (local33 != null) {
			return local33;
		} else if (arg0 == null || arg0[0] > 0) {
			@Pc(61) Class4_Sub5 local61 = (Class4_Sub5) this.aClass20_11.method505(local26);
			if (local61 == null) {
				local61 = Static20.method363(this.aClass62_40, arg2, arg1);
				if (local61 == null) {
					return null;
				}
				this.aClass20_11.method499(local26, local61);
			}
			local33 = local61.method371(arg0);
			if (local33 == null) {
				return null;
			} else {
				local61.method3173();
				this.aClass20_12.method499(local26, local33);
				return local33;
			}
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(I[II)Lclient!vf;")
	public Class4_Sub12_Sub1 method2604(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1) {
		if (this.aClass62_39.method2863() == 1) {
			return this.method2606(arg1, 0, arg0);
		} else if (this.aClass62_39.method2865(arg1) == 1) {
			return this.method2606(0, arg1, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "([III)Lclient!vf;")
	public Class4_Sub12_Sub1 method2605(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1) {
		if (this.aClass62_40.method2863() == 1) {
			return this.method2603(arg0, arg1, 0);
		} else if (this.aClass62_40.method2865(arg1) == 1) {
			return this.method2603(arg0, 0, arg1);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(II[IB)Lclient!vf;")
	private Class4_Sub12_Sub1 method2606(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2) {
		@Pc(15) int local15 = ((arg1 & 0x70000FFF) << 4 | arg1 >>> 12) ^ arg0;
		@Pc(21) int local21 = local15 | arg1 << 16;
		@Pc(24) long local24 = (long) local21;
		@Pc(31) Class4_Sub12_Sub1 local31 = (Class4_Sub12_Sub1) this.aClass20_12.method505(local24);
		if (local31 != null) {
			return local31;
		} else if (arg2 == null || arg2[0] > 0) {
			@Pc(49) Class13 local49 = Static191.method352(this.aClass62_39, arg1, arg0);
			if (local49 == null) {
				return null;
			}
			local31 = local49.method354();
			this.aClass20_12.method499(local24, local31);
			if (arg2 != null) {
				arg2[0] -= local31.aByteArray48.length;
			}
			return local31;
		} else {
			return null;
		}
	}
}
