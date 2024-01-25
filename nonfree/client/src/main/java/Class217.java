import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wo")
public final class Class217 {

	@OriginalMember(owner = "client!wo", name = "i", descriptor = "Lclient!tn;")
	private final Class190 aClass190_35 = new Class190(256);

	@OriginalMember(owner = "client!wo", name = "m", descriptor = "Lclient!tn;")
	private final Class190 aClass190_36 = new Class190(256);

	@OriginalMember(owner = "client!wo", name = "c", descriptor = "Lclient!ij;")
	private final Class93 aClass93_137;

	@OriginalMember(owner = "client!wo", name = "k", descriptor = "Lclient!ij;")
	private final Class93 aClass93_138;

	@OriginalMember(owner = "client!wo", name = "<init>", descriptor = "(Lclient!ij;Lclient!ij;)V")
	public Class217(@OriginalArg(0) Class93 arg0, @OriginalArg(1) Class93 arg1) {
		this.aClass93_137 = arg1;
		this.aClass93_138 = arg0;
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(II[I)Lclient!dg;")
	public Class5_Sub10_Sub1 method6028(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1) {
		if (this.aClass93_137.method2417() == 1) {
			return this.method6030(arg0, 0, arg1);
		} else if (this.aClass93_137.method2418(arg0) == 1) {
			return this.method6030(0, arg0, arg1);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!wo", name = "b", descriptor = "(II[I)Lclient!dg;")
	public Class5_Sub10_Sub1 method6029(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1) {
		if (this.aClass93_138.method2417() == 1) {
			return this.method6035(arg1, arg0, 0);
		} else if (this.aClass93_138.method2418(arg0) == 1) {
			return this.method6035(arg1, 0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(II[II)Lclient!dg;")
	private Class5_Sub10_Sub1 method6030(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2) {
		@Pc(15) int local15 = arg0 ^ (arg1 >>> 12 | arg1 << 4 & 0xFFFB);
		@Pc(21) int local21 = local15 | arg1 << 16;
		@Pc(26) long local26 = (long) local21 ^ 0x100000000L;
		@Pc(33) Class5_Sub10_Sub1 local33 = (Class5_Sub10_Sub1) this.aClass190_36.method5466(local26);
		if (local33 != null) {
			return local33;
		} else if (arg2 == null || arg2[0] > 0) {
			@Pc(61) Class5_Sub36 local61 = (Class5_Sub36) this.aClass190_35.method5466(local26);
			if (local61 == null) {
				local61 = Static281.method4892(this.aClass93_137, arg1, arg0);
				if (local61 == null) {
					return null;
				}
				this.aClass190_35.method5464(local61, local26);
			}
			local33 = local61.method4894(arg2);
			if (local33 == null) {
				return null;
			} else {
				local61.method6005();
				this.aClass190_36.method5464(local33, local26);
				return local33;
			}
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(Z[III)Lclient!dg;")
	private Class5_Sub10_Sub1 method6035(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15 = arg1 ^ (arg2 >>> 12 | (arg2 & 0x50000FFF) << 4);
		@Pc(21) int local21 = local15 | arg2 << 16;
		@Pc(24) long local24 = (long) local21;
		@Pc(37) Class5_Sub10_Sub1 local37 = (Class5_Sub10_Sub1) this.aClass190_36.method5466(local24);
		if (local37 != null) {
			return local37;
		} else if (arg0 == null || arg0[0] > 0) {
			@Pc(55) Class50 local55 = Static359.method926(this.aClass93_138, arg2, arg1);
			if (local55 == null) {
				return null;
			}
			local37 = local55.method925();
			this.aClass190_36.method5464(local37, local24);
			if (arg0 != null) {
				arg0[0] -= local37.aByteArray9.length;
			}
			return local37;
		} else {
			return null;
		}
	}
}
