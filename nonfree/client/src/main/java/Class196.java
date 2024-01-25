import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tf")
public final class Class196 {

	@OriginalMember(owner = "client!tf", name = "g", descriptor = "[I")
	public static final int[] anIntArray718 = new int[256];

	@OriginalMember(owner = "client!tf", name = "k", descriptor = "Lclient!br;")
	private final Class26 aClass26_26 = new Class26(256);

	@OriginalMember(owner = "client!tf", name = "p", descriptor = "Lclient!br;")
	private final Class26 aClass26_27 = new Class26(256);

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "Lclient!qj;")
	private final Class165 aClass165_86;

	@OriginalMember(owner = "client!tf", name = "h", descriptor = "Lclient!qj;")
	private final Class165 aClass165_87;

	static {
		for (@Pc(10) int local10 = 0; local10 < 256; local10++) {
			@Pc(13) int local13 = local10;
			for (@Pc(15) int local15 = 0; local15 < 8; local15++) {
				if ((local13 & 0x1) == 1) {
					local13 = local13 >>> 1 ^ 0xEDB88320;
				} else {
					local13 >>>= 0x1;
				}
			}
			anIntArray718[local10] = local13;
		}
	}

	@OriginalMember(owner = "client!tf", name = "<init>", descriptor = "(Lclient!qj;Lclient!qj;)V")
	public Class196(@OriginalArg(0) Class165 arg0, @OriginalArg(1) Class165 arg1) {
		this.aClass165_86 = arg0;
		this.aClass165_87 = arg1;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(I[II)Lclient!eg;")
	public Class1_Sub12_Sub1 method5060(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		if (this.aClass165_87.method4503() == 1) {
			return this.method5061(arg0, 0, arg1);
		} else if (this.aClass165_87.method4499(arg0) == 1) {
			return this.method5061(0, arg0, arg1);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(II[IZ)Lclient!eg;")
	private Class1_Sub12_Sub1 method5061(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2) {
		@Pc(15) int local15 = (arg1 >>> 12 | arg1 << 4 & 0xFFFE) ^ arg0;
		@Pc(21) int local21 = local15 | arg1 << 16;
		@Pc(26) long local26 = (long) local21 ^ 0x100000000L;
		@Pc(33) Class1_Sub12_Sub1 local33 = (Class1_Sub12_Sub1) this.aClass26_27.method870(local26);
		if (local33 != null) {
			return local33;
		} else if (arg2 == null || arg2[0] > 0) {
			@Pc(55) Class1_Sub4 local55 = (Class1_Sub4) this.aClass26_26.method870(local26);
			if (local55 == null) {
				local55 = Static14.method335(this.aClass165_87, arg1, arg0);
				if (local55 == null) {
					return null;
				}
				this.aClass26_26.method877(local26, local55);
			}
			local33 = local55.method341(arg2);
			if (local33 == null) {
				return null;
			} else {
				local55.method5710();
				this.aClass26_27.method877(local26, local33);
				return local33;
			}
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!tf", name = "b", descriptor = "(I[II)Lclient!eg;")
	public Class1_Sub12_Sub1 method5062(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		if (this.aClass165_86.method4503() == 1) {
			return this.method5066(0, arg0, arg1);
		} else if (this.aClass165_86.method4499(arg0) == 1) {
			return this.method5066(arg0, 0, arg1);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(III[I)Lclient!eg;")
	private Class1_Sub12_Sub1 method5066(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2) {
		@Pc(15) int local15 = arg1 ^ (arg0 >>> 12 | arg0 << 4 & 0xFFF2);
		@Pc(21) int local21 = local15 | arg0 << 16;
		@Pc(24) long local24 = (long) local21;
		@Pc(31) Class1_Sub12_Sub1 local31 = (Class1_Sub12_Sub1) this.aClass26_27.method870(local24);
		if (local31 != null) {
			return local31;
		} else if (arg2 == null || arg2[0] > 0) {
			@Pc(57) Class81 local57 = Static359.method2199(this.aClass165_86, arg0, arg1);
			if (local57 == null) {
				return null;
			}
			local31 = local57.method2202();
			this.aClass26_27.method877(local24, local31);
			if (arg2 != null) {
				arg2[0] -= local31.aByteArray22.length;
			}
			return local31;
		} else {
			return null;
		}
	}
}
