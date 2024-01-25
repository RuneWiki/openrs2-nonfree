import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ni")
public final class Class139 {

	@OriginalMember(owner = "client!ni", name = "o", descriptor = "Lclient!ec;")
	private final Class58 aClass58_20 = new Class58(256);

	@OriginalMember(owner = "client!ni", name = "p", descriptor = "Lclient!ec;")
	private final Class58 aClass58_21 = new Class58(256);

	@OriginalMember(owner = "client!ni", name = "m", descriptor = "Lclient!nq;")
	private final Class144 aClass144_63;

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "Lclient!nq;")
	private final Class144 aClass144_62;

	@OriginalMember(owner = "client!ni", name = "<init>", descriptor = "(Lclient!nq;Lclient!nq;)V")
	public Class139(@OriginalArg(0) Class144 arg0, @OriginalArg(1) Class144 arg1) {
		this.aClass144_63 = arg1;
		this.aClass144_62 = arg0;
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(II[IB)Lclient!vj;")
	private Class11_Sub15_Sub1 method3744(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2) {
		@Pc(15) int local15 = ((arg1 & 0xE0000FFF) << 4 | arg1 >>> 12) ^ arg0;
		@Pc(21) int local21 = local15 | arg1 << 16;
		@Pc(26) long local26 = (long) local21 ^ 0x100000000L;
		@Pc(33) Class11_Sub15_Sub1 local33 = (Class11_Sub15_Sub1) this.aClass58_21.method1009(local26);
		if (local33 != null) {
			return local33;
		} else if (arg2 == null || arg2[0] > 0) {
			@Pc(63) Class11_Sub20 local63 = (Class11_Sub20) this.aClass58_20.method1009(local26);
			if (local63 == null) {
				local63 = Static127.method1935(this.aClass144_63, arg1, arg0);
				if (local63 == null) {
					return null;
				}
				this.aClass58_20.method1006(local26, local63);
			}
			local33 = local63.method1933(arg2);
			if (local33 == null) {
				return null;
			} else {
				local63.method5701();
				this.aClass58_21.method1006(local26, local33);
				return local33;
			}
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(I[II)Lclient!vj;")
	public Class11_Sub15_Sub1 method3747(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		if (this.aClass144_62.method3893() == 1) {
			return this.method3749(0, arg0, arg1);
		} else if (this.aClass144_62.method3890(arg0) == 1) {
			return this.method3749(arg0, 0, arg1);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(IBI[I)Lclient!vj;")
	private Class11_Sub15_Sub1 method3749(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		@Pc(15) int local15 = (arg0 >>> 12 | (arg0 & 0x40000FFF) << 4) ^ arg1;
		@Pc(21) int local21 = local15 | arg0 << 16;
		@Pc(24) long local24 = (long) local21;
		@Pc(31) Class11_Sub15_Sub1 local31 = (Class11_Sub15_Sub1) this.aClass58_21.method1009(local24);
		if (local31 != null) {
			return local31;
		} else if (arg2 == null || arg2[0] > 0) {
			@Pc(52) Class102 local52 = Static365.method1992(this.aClass144_62, arg0, arg1);
			if (local52 == null) {
				return null;
			}
			local31 = local52.method1995();
			this.aClass58_21.method1006(local24, local31);
			if (arg2 != null) {
				arg2[0] -= local31.aByteArray95.length;
			}
			return local31;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ni", name = "b", descriptor = "(I[II)Lclient!vj;")
	public Class11_Sub15_Sub1 method3750(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1) {
		if (this.aClass144_63.method3893() == 1) {
			return this.method3744(arg1, 0, arg0);
		} else if (this.aClass144_63.method3890(arg1) == 1) {
			return this.method3744(0, arg1, arg0);
		} else {
			throw new RuntimeException();
		}
	}
}
