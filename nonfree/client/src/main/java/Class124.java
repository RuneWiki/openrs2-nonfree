import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iv")
public final class Class124 {

	@OriginalMember(owner = "client!iv", name = "f", descriptor = "Lclient!ke;")
	private final Class137 aClass137_17 = new Class137(256);

	@OriginalMember(owner = "client!iv", name = "m", descriptor = "Lclient!ke;")
	private final Class137 aClass137_18 = new Class137(256);

	@OriginalMember(owner = "client!iv", name = "l", descriptor = "Lclient!lt;")
	private final Class158 aClass158_36;

	@OriginalMember(owner = "client!iv", name = "g", descriptor = "Lclient!lt;")
	private final Class158 aClass158_35;

	@OriginalMember(owner = "client!iv", name = "<init>", descriptor = "(Lclient!lt;Lclient!lt;)V")
	public Class124(@OriginalArg(0) Class158 arg0, @OriginalArg(1) Class158 arg1) {
		this.aClass158_36 = arg1;
		this.aClass158_35 = arg0;
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "([III)Lclient!gu;")
	public Class6_Sub4_Sub1 method2756(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1) {
		if (this.aClass158_36.method3695() == 1) {
			return this.method2758(arg1, 0, arg0);
		} else if (this.aClass158_36.method3683(arg1) == 1) {
			return this.method2758(0, arg1, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(I[II)Lclient!gu;")
	public Class6_Sub4_Sub1 method2757(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1) {
		if (this.aClass158_35.method3695() == 1) {
			return this.method2759(arg1, 0, arg0);
		} else if (this.aClass158_35.method3683(arg1) == 1) {
			return this.method2759(0, arg1, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(IIZ[I)Lclient!gu;")
	private Class6_Sub4_Sub1 method2758(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2) {
		@Pc(15) int local15 = ((arg1 & 0x10000FFF) << 4 | arg1 >>> 12) ^ arg0;
		@Pc(21) int local21 = local15 | arg1 << 16;
		@Pc(26) long local26 = (long) local21 ^ 0x100000000L;
		@Pc(33) Class6_Sub4_Sub1 local33 = (Class6_Sub4_Sub1) this.aClass137_18.method3175(local26);
		if (local33 != null) {
			return local33;
		} else if (arg2 == null || arg2[0] > 0) {
			@Pc(55) Class6_Sub18 local55 = (Class6_Sub18) this.aClass137_17.method3175(local26);
			if (local55 == null) {
				local55 = Static184.method2887(this.aClass158_36, arg1, arg0);
				if (local55 == null) {
					return null;
				}
				this.aClass137_17.method3179(local26, local55);
			}
			local33 = local55.method2888(arg2);
			if (local33 == null) {
				return null;
			} else {
				local55.method5977();
				this.aClass137_18.method3179(local26, local33);
				return local33;
			}
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(II[II)Lclient!gu;")
	private Class6_Sub4_Sub1 method2759(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2) {
		@Pc(19) int local19 = arg0 ^ (arg1 >>> 12 | (arg1 & 0x30000FFF) << 4);
		@Pc(25) int local25 = local19 | arg1 << 16;
		@Pc(28) long local28 = (long) local25;
		@Pc(35) Class6_Sub4_Sub1 local35 = (Class6_Sub4_Sub1) this.aClass137_18.method3175(local28);
		if (local35 != null) {
			return local35;
		} else if (arg2 == null || arg2[0] > 0) {
			@Pc(56) Class109 local56 = Static456.method2473(this.aClass158_35, arg1, arg0);
			if (local56 == null) {
				return null;
			}
			local35 = local56.method2474();
			this.aClass137_18.method3179(local28, local35);
			if (arg2 != null) {
				arg2[0] -= local35.aByteArray34.length;
			}
			return local35;
		} else {
			return null;
		}
	}
}
