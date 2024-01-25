import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!li")
public final class Class142 {

	@OriginalMember(owner = "client!li", name = "g", descriptor = "Lclient!sq;")
	private final Class214 aClass214_18 = new Class214(256);

	@OriginalMember(owner = "client!li", name = "o", descriptor = "Lclient!sq;")
	private final Class214 aClass214_19 = new Class214(256);

	@OriginalMember(owner = "client!li", name = "f", descriptor = "Lclient!fc;")
	private final Class71 aClass71_47;

	@OriginalMember(owner = "client!li", name = "l", descriptor = "Lclient!fc;")
	private final Class71 aClass71_49;

	@OriginalMember(owner = "client!li", name = "<init>", descriptor = "(Lclient!fc;Lclient!fc;)V")
	public Class142(@OriginalArg(0) Class71 arg0, @OriginalArg(1) Class71 arg1) {
		this.aClass71_47 = arg1;
		this.aClass71_49 = arg0;
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(III[I)Lclient!cu;")
	private Class2_Sub4_Sub1 method3343(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		@Pc(15) int local15 = arg1 ^ (arg0 << 4 & 0xFFF7 | arg0 >>> 12);
		@Pc(21) int local21 = local15 | arg0 << 16;
		@Pc(24) long local24 = (long) local21;
		@Pc(33) Class2_Sub4_Sub1 local33 = (Class2_Sub4_Sub1) this.aClass214_19.method5059(local24);
		if (local33 != null) {
			return local33;
		} else if (arg2 == null || arg2[0] > 0) {
			@Pc(59) Class236 local59 = Static405.method5537(this.aClass71_49, arg0, arg1);
			if (local59 == null) {
				return null;
			}
			local33 = local59.method5539();
			this.aClass214_19.method5065(local24, local33);
			if (arg2 != null) {
				arg2[0] -= local33.aByteArray19.length;
			}
			return local33;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(IB[II)Lclient!cu;")
	private Class2_Sub4_Sub1 method3346(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		@Pc(21) int local21 = arg0 ^ ((arg2 & 0x30000FFF) << 4 | arg2 >>> 12);
		@Pc(27) int local27 = local21 | arg2 << 16;
		@Pc(32) long local32 = (long) local27 ^ 0x100000000L;
		@Pc(39) Class2_Sub4_Sub1 local39 = (Class2_Sub4_Sub1) this.aClass214_19.method5059(local32);
		if (local39 != null) {
			return local39;
		} else if (arg1 == null || arg1[0] > 0) {
			@Pc(58) Class2_Sub23 local58 = (Class2_Sub23) this.aClass214_18.method5059(local32);
			if (local58 == null) {
				local58 = Static177.method2869(this.aClass71_47, arg2, arg0);
				if (local58 == null) {
					return null;
				}
				this.aClass214_18.method5065(local32, local58);
			}
			local39 = local58.method2870(arg1);
			if (local39 == null) {
				return null;
			} else {
				local58.method5745();
				this.aClass214_19.method5065(local32, local39);
				return local39;
			}
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(II[I)Lclient!cu;")
	public Class2_Sub4_Sub1 method3349(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1) {
		if (this.aClass71_47.method1553() == 1) {
			return this.method3346(arg0, arg1, 0);
		} else if (this.aClass71_47.method1580(arg0) == 1) {
			return this.method3346(0, arg1, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(I[II)Lclient!cu;")
	public Class2_Sub4_Sub1 method3350(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1) {
		if (this.aClass71_49.method1553() == 1) {
			return this.method3343(0, arg1, arg0);
		} else if (this.aClass71_49.method1580(arg1) == 1) {
			return this.method3343(arg1, 0, arg0);
		} else {
			throw new RuntimeException();
		}
	}
}
