import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!me")
public final class Class198 {

	@OriginalMember(owner = "client!me", name = "e", descriptor = "Lclient!oj;")
	private final Class234 aClass234_36 = new Class234(256);

	@OriginalMember(owner = "client!me", name = "n", descriptor = "Lclient!oj;")
	private final Class234 aClass234_37 = new Class234(256);

	@OriginalMember(owner = "client!me", name = "f", descriptor = "Lclient!pj;")
	private final Class248 aClass248_48;

	@OriginalMember(owner = "client!me", name = "g", descriptor = "Lclient!pj;")
	private final Class248 aClass248_49;

	@OriginalMember(owner = "client!me", name = "<init>", descriptor = "(Lclient!pj;Lclient!pj;)V")
	public Class198(@OriginalArg(0) Class248 arg0, @OriginalArg(1) Class248 arg1) {
		this.aClass248_48 = arg1;
		this.aClass248_49 = arg0;
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(III[I)Lclient!qr;")
	private Class6_Sub6_Sub1 method4919(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		@Pc(15) int local15 = (arg1 >>> 12 | (arg1 & 0x20000FFF) << 4) ^ arg0;
		@Pc(21) int local21 = local15 | arg1 << 16;
		@Pc(26) long local26 = (long) local21 ^ 0x100000000L;
		@Pc(33) Class6_Sub6_Sub1 local33 = (Class6_Sub6_Sub1) this.aClass234_37.method5464(local26);
		if (local33 != null) {
			return local33;
		} else if (arg2 == null || arg2[0] > 0) {
			@Pc(64) Class6_Sub23 local64 = (Class6_Sub23) this.aClass234_36.method5464(local26);
			if (local64 == null) {
				local64 = Static254.method3944(this.aClass248_48, arg1, arg0);
				if (local64 == null) {
					return null;
				}
				this.aClass234_36.method5466(local26, local64);
			}
			local33 = local64.method3945(arg2);
			if (local33 == null) {
				return null;
			} else {
				local64.method7948();
				this.aClass234_37.method5466(local26, local33);
				return local33;
			}
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(I[II)Lclient!qr;")
	public Class6_Sub6_Sub1 method4920(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		if (this.aClass248_48.method5774() == 1) {
			return this.method4919(arg0, 0, arg1);
		} else if (this.aClass248_48.method5793(arg0) == 1) {
			return this.method4919(0, arg0, arg1);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "([IBI)Lclient!qr;")
	public Class6_Sub6_Sub1 method4921(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1) {
		if (this.aClass248_49.method5774() == 1) {
			return this.method4923(arg0, 0, arg1);
		} else if (this.aClass248_49.method5793(arg1) == 1) {
			return this.method4923(arg0, arg1, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "([IIBI)Lclient!qr;")
	private Class6_Sub6_Sub1 method4923(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15 = (arg1 >>> 12 | arg1 << 4 & 0xFFFD) ^ arg2;
		@Pc(21) int local21 = local15 | arg1 << 16;
		@Pc(24) long local24 = (long) local21;
		@Pc(31) Class6_Sub6_Sub1 local31 = (Class6_Sub6_Sub1) this.aClass234_37.method5464(local24);
		if (local31 != null) {
			return local31;
		} else if (arg0 == null || arg0[0] > 0) {
			@Pc(52) Class161 local52 = Static592.method3933(this.aClass248_49, arg1, arg2);
			if (local52 == null) {
				return null;
			}
			local31 = local52.method3934();
			this.aClass234_37.method5466(local24, local31);
			if (arg0 != null) {
				arg0[0] -= local31.aByteArray99.length;
			}
			return local31;
		} else {
			return null;
		}
	}
}
