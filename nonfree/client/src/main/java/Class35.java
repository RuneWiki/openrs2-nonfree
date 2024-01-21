import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!id")
public final class Class35 {

	@OriginalMember(owner = "client!id", name = "c", descriptor = "Lclient!oe;")
	private final Class58 aClass58_33 = new Class58(256);

	@OriginalMember(owner = "client!id", name = "h", descriptor = "Lclient!g;")
	private final Class26 aClass26_10;

	@OriginalMember(owner = "client!id", name = "d", descriptor = "Lclient!g;")
	private final Class26 aClass26_9;

	@OriginalMember(owner = "client!id", name = "<init>", descriptor = "(Lclient!g;Lclient!g;)V")
	public Class35(@OriginalArg(0) Class26 arg0, @OriginalArg(1) Class26 arg1) {
		this.aClass26_10 = arg1;
		this.aClass26_9 = arg0;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "([IBI)Lclient!ke;")
	public Class2_Sub14_Sub1 method871(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1) {
		if (this.aClass26_9.method1367() == 1) {
			return this.method878(arg0, arg1, 0);
		} else if (this.aClass26_9.method1369(arg1) == 1) {
			return this.method878(arg0, 0, arg1);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(I[IB)Lclient!ke;")
	public Class2_Sub14_Sub1 method872(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		if (this.aClass26_10.method1367() == 1) {
			return this.method875(0, arg1, arg0);
		} else if (this.aClass26_10.method1369(arg0) == 1) {
			return this.method875(arg0, arg1, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(I[IBI)Lclient!ke;")
	private Class2_Sub14_Sub1 method875(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2) {
		@Pc(23) int local23 = arg2 ^ ((arg0 & 0xF0000FFF) << 4 | arg0 >>> 12);
		@Pc(29) int local29 = local23 | arg0 << 16;
		@Pc(34) long local34 = (long) local29 ^ 0x100000000L;
		@Pc(41) Class2_Sub14_Sub1 local41 = (Class2_Sub14_Sub1) this.aClass58_33.method1307(local34);
		if (local41 != null) {
			return local41;
		} else if (arg1 == null || arg1[0] > 0) {
			@Pc(59) Class75 local59 = Static118.method1746(this.aClass26_10, arg0, arg2);
			if (local59 == null) {
				return null;
			}
			local41 = local59.method1750();
			this.aClass58_33.method1301(local34, local41);
			if (arg1 != null) {
				arg1[0] -= local41.aByteArray11.length;
			}
			return local41;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "([IIBI)Lclient!ke;")
	private Class2_Sub14_Sub1 method878(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(23) int local23 = arg1 ^ ((arg2 & 0xF0000FFF) << 4 | arg2 >>> 12);
		@Pc(29) int local29 = local23 | arg2 << 16;
		@Pc(32) long local32 = (long) local29;
		@Pc(39) Class2_Sub14_Sub1 local39 = (Class2_Sub14_Sub1) this.aClass58_33.method1307(local32);
		if (local39 != null) {
			return local39;
		} else if (arg0 == null || arg0[0] > 0) {
			@Pc(60) Class36 local60 = Static131.method880(this.aClass26_9, arg2, arg1);
			if (local60 == null) {
				return null;
			}
			local39 = local60.method882();
			this.aClass58_33.method1301(local32, local39);
			if (arg0 != null) {
				arg0[0] -= local39.aByteArray11.length;
			}
			return local39;
		} else {
			return null;
		}
	}
}
