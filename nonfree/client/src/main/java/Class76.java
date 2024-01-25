import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ga")
public final class Class76 {

	@OriginalMember(owner = "client!ga", name = "j", descriptor = "Lclient!cm;")
	private final Class41 aClass41_13 = new Class41(256);

	@OriginalMember(owner = "client!ga", name = "o", descriptor = "Lclient!cm;")
	private final Class41 aClass41_14 = new Class41(256);

	@OriginalMember(owner = "client!ga", name = "b", descriptor = "Lclient!iq;")
	private final Class104 aClass104_68;

	@OriginalMember(owner = "client!ga", name = "m", descriptor = "Lclient!iq;")
	private final Class104 aClass104_69;

	@OriginalMember(owner = "client!ga", name = "<init>", descriptor = "(Lclient!iq;Lclient!iq;)V")
	public Class76(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Class104 arg1) {
		this.aClass104_68 = arg1;
		this.aClass104_69 = arg0;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(B[II)Lclient!ar;")
	public Class2_Sub5_Sub1 method2074(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1) {
		if (this.aClass104_69.method2757() == 1) {
			return this.method2075(arg1, arg0, 0);
		} else if (this.aClass104_69.method2745(arg1) == 1) {
			return this.method2075(0, arg0, arg1);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(I[IBI)Lclient!ar;")
	private Class2_Sub5_Sub1 method2075(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2) {
		@Pc(20) int local20 = arg0 ^ (arg2 >>> 12 | arg2 << 4 & 0xFFF8);
		@Pc(26) int local26 = local20 | arg2 << 16;
		@Pc(29) long local29 = (long) local26;
		@Pc(36) Class2_Sub5_Sub1 local36 = (Class2_Sub5_Sub1) this.aClass41_14.method902(local29);
		if (local36 != null) {
			return local36;
		} else if (arg1 == null || arg1[0] > 0) {
			@Pc(57) Class135 local57 = Static372.method3857(this.aClass104_69, arg2, arg0);
			if (local57 == null) {
				return null;
			}
			local36 = local57.method3859();
			this.aClass41_14.method901(local36, local29);
			if (arg1 != null) {
				arg1[0] -= local36.aByteArray4.length;
			}
			return local36;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "([III)Lclient!ar;")
	public Class2_Sub5_Sub1 method2076(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		if (this.aClass104_68.method2757() == 1) {
			return this.method2080(0, arg0, arg1);
		} else if (this.aClass104_68.method2745(arg1) == 1) {
			return this.method2080(arg1, arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(I[III)Lclient!ar;")
	private Class2_Sub5_Sub1 method2080(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2) {
		@Pc(15) int local15 = arg2 ^ (arg0 << 4 & 0xFFF4 | arg0 >>> 12);
		@Pc(21) int local21 = local15 | arg0 << 16;
		@Pc(26) long local26 = (long) local21 ^ 0x100000000L;
		@Pc(46) Class2_Sub5_Sub1 local46 = (Class2_Sub5_Sub1) this.aClass41_14.method902(local26);
		if (local46 != null) {
			return local46;
		} else if (arg1 == null || arg1[0] > 0) {
			@Pc(68) Class2_Sub32 local68 = (Class2_Sub32) this.aClass41_13.method902(local26);
			if (local68 == null) {
				local68 = Static262.method4623(this.aClass104_68, arg0, arg2);
				if (local68 == null) {
					return null;
				}
				this.aClass41_13.method901(local68, local26);
			}
			local46 = local68.method4629(arg1);
			if (local46 == null) {
				return null;
			} else {
				local68.method5723();
				this.aClass41_14.method901(local46, local26);
				return local46;
			}
		} else {
			return null;
		}
	}
}
