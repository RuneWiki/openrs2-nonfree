import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gb")
public final class Class27 {

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "[I")
	public static int[] anIntArray205 = new int[256];

	@OriginalMember(owner = "client!gb", name = "f", descriptor = "Lclient!r;")
	private final Class1_Sub2 aClass1_Sub2_29 = new Class1_Sub2();

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
			anIntArray205[local10] = local13;
		}
	}

	@OriginalMember(owner = "client!gb", name = "<init>", descriptor = "()V")
	public Class27() {
		this.aClass1_Sub2_29.aClass1_Sub2_65 = this.aClass1_Sub2_29;
		this.aClass1_Sub2_29.aClass1_Sub2_66 = this.aClass1_Sub2_29;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lclient!r;B)V")
	public void method896(@OriginalArg(0) Class1_Sub2 arg0) {
		if (arg0.aClass1_Sub2_65 != null) {
			arg0.method1964();
		}
		arg0.aClass1_Sub2_66 = this.aClass1_Sub2_29;
		arg0.aClass1_Sub2_65 = this.aClass1_Sub2_29.aClass1_Sub2_65;
		arg0.aClass1_Sub2_65.aClass1_Sub2_66 = arg0;
		arg0.aClass1_Sub2_66.aClass1_Sub2_65 = arg0;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(ILclient!r;)V")
	public void method897(@OriginalArg(1) Class1_Sub2 arg0) {
		if (arg0.aClass1_Sub2_65 != null) {
			arg0.method1964();
		}
		arg0.aClass1_Sub2_66 = this.aClass1_Sub2_29.aClass1_Sub2_66;
		arg0.aClass1_Sub2_65 = this.aClass1_Sub2_29;
		arg0.aClass1_Sub2_65.aClass1_Sub2_66 = arg0;
		arg0.aClass1_Sub2_66.aClass1_Sub2_65 = arg0;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(B)Lclient!r;")
	public Class1_Sub2 method899() {
		@Pc(14) Class1_Sub2 local14 = this.aClass1_Sub2_29.aClass1_Sub2_66;
		if (local14 == this.aClass1_Sub2_29) {
			return null;
		} else {
			local14.method1964();
			return local14;
		}
	}

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "(I)Lclient!r;")
	public Class1_Sub2 method900() {
		@Pc(7) Class1_Sub2 local7 = this.aClass1_Sub2_29.aClass1_Sub2_66;
		return local7 == this.aClass1_Sub2_29 ? null : local7;
	}
}
