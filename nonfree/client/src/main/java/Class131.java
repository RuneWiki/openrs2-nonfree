import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iba")
public final class Class131 {

	@OriginalMember(owner = "client!iba", name = "e", descriptor = "Lclient!lb;")
	private final Class174 aClass174_12 = new Class174(256);

	@OriginalMember(owner = "client!iba", name = "p", descriptor = "Lclient!lb;")
	private final Class174 aClass174_13 = new Class174(256);

	@OriginalMember(owner = "client!iba", name = "a", descriptor = "Lclient!kda;")
	private final Class160 aClass160_43;

	@OriginalMember(owner = "client!iba", name = "n", descriptor = "Lclient!kda;")
	private final Class160 aClass160_44;

	@OriginalMember(owner = "client!iba", name = "<init>", descriptor = "(Lclient!kda;Lclient!kda;)V")
	public Class131(@OriginalArg(0) Class160 arg0, @OriginalArg(1) Class160 arg1) {
		this.aClass160_43 = arg0;
		this.aClass160_44 = arg1;
	}

	@OriginalMember(owner = "client!iba", name = "a", descriptor = "([III)Lclient!qk;")
	public Class1_Sub32_Sub1 method3649(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1) {
		if (this.aClass160_44.method4206() == 1) {
			return this.method3650(0, arg1, arg0);
		} else if (this.aClass160_44.method4207(arg1) == 1) {
			return this.method3650(arg1, 0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!iba", name = "a", descriptor = "(III[I)Lclient!qk;")
	private Class1_Sub32_Sub1 method3650(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		@Pc(15) int local15 = ((arg0 & 0xC0000FFF) << 4 | arg0 >>> 12) ^ arg1;
		@Pc(21) int local21 = local15 | arg0 << 16;
		@Pc(26) long local26 = (long) local21 ^ 0x100000000L;
		@Pc(33) Class1_Sub32_Sub1 local33 = (Class1_Sub32_Sub1) this.aClass174_13.method4422(local26);
		if (local33 != null) {
			return local33;
		} else if (arg2 == null || arg2[0] > 0) {
			@Pc(52) Class1_Sub26 local52 = (Class1_Sub26) this.aClass174_12.method4422(local26);
			if (local52 == null) {
				local52 = Static240.method4077(this.aClass160_44, arg0, arg1);
				if (local52 == null) {
					return null;
				}
				this.aClass174_12.method4420(local52, local26);
			}
			local33 = local52.method4068(arg2);
			if (local33 == null) {
				return null;
			} else {
				local52.method7983();
				this.aClass174_13.method4420(local33, local26);
				return local33;
			}
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!iba", name = "a", descriptor = "(I[IIB)Lclient!qk;")
	private Class1_Sub32_Sub1 method3651(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2) {
		@Pc(15) int local15 = arg0 ^ ((arg2 & 0x80000FFF) << 4 | arg2 >>> 12);
		@Pc(21) int local21 = local15 | arg2 << 16;
		@Pc(24) long local24 = (long) local21;
		@Pc(31) Class1_Sub32_Sub1 local31 = (Class1_Sub32_Sub1) this.aClass174_13.method4422(local24);
		if (local31 != null) {
			return local31;
		} else if (arg1 == null || arg1[0] > 0) {
			@Pc(56) Class77 local56 = Static551.method2366(this.aClass160_43, arg2, arg0);
			if (local56 == null) {
				return null;
			}
			local31 = local56.method2365();
			this.aClass174_13.method4420(local31, local24);
			if (arg1 != null) {
				arg1[0] -= local31.aByteArray81.length;
			}
			return local31;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!iba", name = "a", descriptor = "(I[II)Lclient!qk;")
	public Class1_Sub32_Sub1 method3657(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1) {
		if (this.aClass160_43.method4206() == 1) {
			return this.method3651(arg1, arg0, 0);
		} else if (this.aClass160_43.method4207(arg1) == 1) {
			return this.method3651(0, arg0, arg1);
		} else {
			throw new RuntimeException();
		}
	}
}
