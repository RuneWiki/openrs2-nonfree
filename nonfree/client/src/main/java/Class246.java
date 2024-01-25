import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ns")
public final class Class246 {

	@OriginalMember(owner = "client!ns", name = "m", descriptor = "Lclient!jw;")
	private final Class183 aClass183_27 = new Class183(256);

	@OriginalMember(owner = "client!ns", name = "o", descriptor = "Lclient!jw;")
	private final Class183 aClass183_28 = new Class183(256);

	@OriginalMember(owner = "client!ns", name = "n", descriptor = "Lclient!bi;")
	private final Class31 aClass31_80;

	@OriginalMember(owner = "client!ns", name = "f", descriptor = "Lclient!bi;")
	private final Class31 aClass31_79;

	@OriginalMember(owner = "client!ns", name = "<init>", descriptor = "(Lclient!bi;Lclient!bi;)V")
	public Class246(@OriginalArg(0) Class31 arg0, @OriginalArg(1) Class31 arg1) {
		this.aClass31_80 = arg0;
		this.aClass31_79 = arg1;
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(II[IB)Lclient!fc;")
	private Class4_Sub16_Sub1 method5448(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2) {
		@Pc(15) int local15 = (arg0 >>> 12 | (arg0 & 0x40000FFF) << 4) ^ arg1;
		@Pc(27) int local27 = local15 | arg0 << 16;
		@Pc(32) long local32 = (long) local27 ^ 0x100000000L;
		@Pc(39) Class4_Sub16_Sub1 local39 = (Class4_Sub16_Sub1) this.aClass183_28.method4289(local32);
		if (local39 != null) {
			return local39;
		} else if (arg2 == null || arg2[0] > 0) {
			@Pc(61) Class4_Sub24 local61 = (Class4_Sub24) this.aClass183_27.method4289(local32);
			if (local61 == null) {
				local61 = Static239.method4068(this.aClass31_79, arg0, arg1);
				if (local61 == null) {
					return null;
				}
				this.aClass183_27.method4282(local32, local61);
			}
			local39 = local61.method4063(arg2);
			if (local39 == null) {
				return null;
			} else {
				local61.method8013();
				this.aClass183_28.method4282(local32, local39);
				return local39;
			}
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(I[II)Lclient!fc;")
	public Class4_Sub16_Sub1 method5449(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		if (this.aClass31_80.method675() == 1) {
			return this.method5452(0, arg1, arg0);
		} else if (this.aClass31_80.method657(arg0) == 1) {
			return this.method5452(arg0, arg1, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(II[II)Lclient!fc;")
	private Class4_Sub16_Sub1 method5452(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15 = (arg0 >>> 12 | arg0 << 4 & 0xFFFB) ^ arg2;
		@Pc(21) int local21 = local15 | arg0 << 16;
		@Pc(24) long local24 = (long) local21;
		@Pc(31) Class4_Sub16_Sub1 local31 = (Class4_Sub16_Sub1) this.aClass183_28.method4289(local24);
		if (local31 != null) {
			return local31;
		} else if (arg1 == null || arg1[0] > 0) {
			@Pc(49) Class277 local49 = Static609.method6077(this.aClass31_80, arg0, arg2);
			if (local49 == null) {
				return null;
			}
			local31 = local49.method6080();
			this.aClass183_28.method4282(local24, local31);
			if (arg1 != null) {
				arg1[0] -= local31.aByteArray37.length;
			}
			return local31;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ns", name = "b", descriptor = "(I[II)Lclient!fc;")
	public Class4_Sub16_Sub1 method5453(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1) {
		if (this.aClass31_79.method675() == 1) {
			return this.method5448(0, arg1, arg0);
		} else if (this.aClass31_79.method657(arg1) == 1) {
			return this.method5448(arg1, 0, arg0);
		} else {
			throw new RuntimeException();
		}
	}
}
