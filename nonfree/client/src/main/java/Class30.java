import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ei")
public final class Class30 {

	@OriginalMember(owner = "client!ei", name = "d", descriptor = "Lclient!lc;")
	private final Class58 aClass58_5 = new Class58(256);

	@OriginalMember(owner = "client!ei", name = "q", descriptor = "Lclient!lc;")
	private final Class58 aClass58_6 = new Class58(256);

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "Lclient!pb;")
	private final Class71 aClass71_8;

	@OriginalMember(owner = "client!ei", name = "j", descriptor = "Lclient!pb;")
	private final Class71 aClass71_9;

	@OriginalMember(owner = "client!ei", name = "<init>", descriptor = "(Lclient!pb;Lclient!pb;)V")
	public Class30(@OriginalArg(0) Class71 arg0, @OriginalArg(1) Class71 arg1) {
		this.aClass71_8 = arg0;
		this.aClass71_9 = arg1;
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "([IIB)Lclient!qc;")
	public Class2_Sub20_Sub1 method729(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		if (this.aClass71_8.method2135() == 1) {
			return this.method737(arg1, 0, arg0);
		} else if (this.aClass71_8.method2117(arg1) == 1) {
			return this.method737(0, arg1, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(I[IIB)Lclient!qc;")
	private Class2_Sub20_Sub1 method730(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2) {
		@Pc(15) int local15 = ((arg0 & 0xFFF) << 4 | arg0 >>> 12) ^ arg2;
		@Pc(21) int local21 = local15 | arg0 << 16;
		@Pc(26) long local26 = (long) local21 ^ 0x100000000L;
		@Pc(33) Class2_Sub20_Sub1 local33 = (Class2_Sub20_Sub1) this.aClass58_6.method1704(local26);
		if (local33 != null) {
			return local33;
		} else if (arg1 == null || arg1[0] > 0) {
			@Pc(57) Class2_Sub21 local57 = (Class2_Sub21) this.aClass58_5.method1704(local26);
			if (local57 == null) {
				local57 = Static177.method2566(this.aClass71_9, arg0, arg2);
				if (local57 == null) {
					return null;
				}
				this.aClass58_5.method1708(local57, local26);
			}
			local33 = local57.method2563(arg1);
			if (local33 == null) {
				return null;
			} else {
				local57.method3183();
				this.aClass58_6.method1708(local33, local26);
				return local33;
			}
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(IB[I)Lclient!qc;")
	public Class2_Sub20_Sub1 method733(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1) {
		if (this.aClass71_9.method2135() == 1) {
			return this.method730(0, arg1, arg0);
		} else if (this.aClass71_9.method2117(arg0) == 1) {
			return this.method730(arg0, arg1, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(II[IB)Lclient!qc;")
	private Class2_Sub20_Sub1 method737(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2) {
		@Pc(15) int local15 = arg0 ^ (arg1 << 4 & 0xFFF9 | arg1 >>> 12);
		@Pc(21) int local21 = local15 | arg1 << 16;
		@Pc(24) long local24 = (long) local21;
		@Pc(31) Class2_Sub20_Sub1 local31 = (Class2_Sub20_Sub1) this.aClass58_6.method1704(local24);
		if (local31 != null) {
			return local31;
		} else if (arg2 == null || arg2[0] > 0) {
			@Pc(57) Class27 local57 = Static219.method712(this.aClass71_8, arg1, arg0);
			if (local57 == null) {
				return null;
			}
			local31 = local57.method713();
			this.aClass58_6.method1708(local31, local24);
			if (arg2 != null) {
				arg2[0] -= local31.aByteArray35.length;
			}
			return local31;
		} else {
			return null;
		}
	}
}
