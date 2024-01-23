import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ic")
public final class Class46 {

	@OriginalMember(owner = "client!ic", name = "c", descriptor = "Lclient!ui;")
	private Class103 aClass103_9 = new Class103(256);

	@OriginalMember(owner = "client!ic", name = "l", descriptor = "Lclient!ui;")
	private Class103 aClass103_10 = new Class103(256);

	@OriginalMember(owner = "client!ic", name = "e", descriptor = "Lclient!oe;")
	private Class72 aClass72_123;

	@OriginalMember(owner = "client!ic", name = "h", descriptor = "Lclient!oe;")
	private Class72 aClass72_124;

	@OriginalMember(owner = "client!ic", name = "<init>", descriptor = "(Lclient!oe;Lclient!oe;)V")
	public Class46(@OriginalArg(0) Class72 arg0, @OriginalArg(1) Class72 arg1) {
		this.aClass72_123 = arg0;
		this.aClass72_124 = arg1;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "([IIZ)Lclient!kh;")
	public Class2_Sub22_Sub1 method1594(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		if (this.aClass72_123.method3182() == 1) {
			return this.method1596(arg1, 0, arg0);
		} else if (this.aClass72_123.method3177(arg1) == 1) {
			return this.method1596(0, arg1, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIB[I)Lclient!kh;")
	private Class2_Sub22_Sub1 method1596(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2) {
		@Pc(20) int local20 = arg0 ^ (arg1 >>> 12 | arg1 << 4 & 0xFFF2);
		@Pc(26) int local26 = local20 | arg1 << 16;
		@Pc(29) long local29 = (long) local26;
		@Pc(36) Class2_Sub22_Sub1 local36 = (Class2_Sub22_Sub1) this.aClass103_10.method3659(local29);
		if (local36 != null) {
			return local36;
		} else if (arg2 == null || arg2[0] > 0) {
			@Pc(54) Class66 local54 = Static233.method2452(this.aClass72_123, arg1, arg0);
			if (local54 == null) {
				return null;
			}
			local36 = local54.method2450();
			this.aClass103_10.method3665(local29, local36);
			if (arg2 != null) {
				arg2[0] -= local36.aByteArray39.length;
			}
			return local36;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(B[III)Lclient!kh;")
	private Class2_Sub22_Sub1 method1597(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15 = (arg2 << 4 & 0xFFF7 | arg2 >>> 12) ^ arg1;
		@Pc(21) int local21 = local15 | arg2 << 16;
		@Pc(26) long local26 = (long) local21 ^ 0x100000000L;
		@Pc(33) Class2_Sub22_Sub1 local33 = (Class2_Sub22_Sub1) this.aClass103_10.method3659(local26);
		if (local33 != null) {
			return local33;
		} else if (arg0 == null || arg0[0] > 0) {
			@Pc(60) Class2_Sub17 local60 = (Class2_Sub17) this.aClass103_9.method3659(local26);
			if (local60 == null) {
				local60 = Static88.method1573(this.aClass72_124, arg2, arg1);
				if (local60 == null) {
					return null;
				}
				this.aClass103_9.method3665(local26, local60);
			}
			local33 = local60.method1566(arg0);
			if (local33 == null) {
				return null;
			} else {
				local60.method3986();
				this.aClass103_10.method3665(local26, local33);
				return local33;
			}
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "([IBI)Lclient!kh;")
	public Class2_Sub22_Sub1 method1599(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1) {
		if (this.aClass72_124.method3182() == 1) {
			return this.method1597(arg0, arg1, 0);
		} else if (this.aClass72_124.method3177(arg1) == 1) {
			return this.method1597(arg0, 0, arg1);
		} else {
			throw new RuntimeException();
		}
	}
}
