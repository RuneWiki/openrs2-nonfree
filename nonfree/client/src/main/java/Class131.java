import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!on")
public final class Class131 {

	@OriginalMember(owner = "client!on", name = "d", descriptor = "Lclient!s;")
	private Class156 aClass156_19 = new Class156(256);

	@OriginalMember(owner = "client!on", name = "s", descriptor = "Lclient!s;")
	private Class156 aClass156_20 = new Class156(256);

	@OriginalMember(owner = "client!on", name = "o", descriptor = "Lclient!ph;")
	private Class138 aClass138_55;

	@OriginalMember(owner = "client!on", name = "b", descriptor = "Lclient!ph;")
	private Class138 aClass138_54;

	@OriginalMember(owner = "client!on", name = "<init>", descriptor = "(Lclient!ph;Lclient!ph;)V")
	public Class131(@OriginalArg(0) Class138 arg0, @OriginalArg(1) Class138 arg1) {
		this.aClass138_55 = arg0;
		this.aClass138_54 = arg1;
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(I[IBI)Lclient!d;")
	private Class1_Sub7_Sub1 method3248(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2) {
		@Pc(18) int local18 = arg0 ^ (arg2 << 4 & 0xFFFE | arg2 >>> 12);
		@Pc(24) int local24 = local18 | arg2 << 16;
		@Pc(29) long local29 = (long) local24 ^ 0x100000000L;
		@Pc(40) Class1_Sub7_Sub1 local40 = (Class1_Sub7_Sub1) this.aClass156_20.method3821(local29);
		if (local40 != null) {
			return local40;
		} else if (arg1 == null || arg1[0] > 0) {
			@Pc(61) Class1_Sub6 local61 = (Class1_Sub6) this.aClass156_19.method3821(local29);
			if (local61 == null) {
				local61 = Static32.method557(this.aClass138_54, arg2, arg0);
				if (local61 == null) {
					return null;
				}
				this.aClass156_19.method3816(local29, local61);
			}
			local40 = local61.method558(arg1);
			if (local40 == null) {
				return null;
			} else {
				local61.method4616();
				this.aClass156_20.method3816(local29, local40);
				return local40;
			}
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(I[IB)Lclient!d;")
	public Class1_Sub7_Sub1 method3249(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		if (this.aClass138_54.method3352() == 1) {
			return this.method3248(arg0, arg1, 0);
		} else if (this.aClass138_54.method3365(arg0) == 1) {
			return this.method3248(0, arg1, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(II[II)Lclient!d;")
	private Class1_Sub7_Sub1 method3253(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2) {
		@Pc(15) int local15 = arg0 ^ (arg1 >>> 12 | arg1 << 4 & 0xFFF5);
		@Pc(21) int local21 = local15 | arg1 << 16;
		@Pc(24) long local24 = (long) local21;
		@Pc(37) Class1_Sub7_Sub1 local37 = (Class1_Sub7_Sub1) this.aClass156_20.method3821(local24);
		if (local37 != null) {
			return local37;
		} else if (arg2 == null || arg2[0] > 0) {
			@Pc(56) Class184 local56 = Static325.method4369(this.aClass138_55, arg1, arg0);
			if (local56 == null) {
				return null;
			}
			local37 = local56.method4368();
			this.aClass156_20.method3816(local24, local37);
			if (arg2 != null) {
				arg2[0] -= local37.aByteArray5.length;
			}
			return local37;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!on", name = "b", descriptor = "(I[IB)Lclient!d;")
	public Class1_Sub7_Sub1 method3255(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		if (this.aClass138_55.method3352() == 1) {
			return this.method3253(arg0, 0, arg1);
		} else if (this.aClass138_55.method3365(arg0) == 1) {
			return this.method3253(0, arg0, arg1);
		} else {
			throw new RuntimeException();
		}
	}
}
