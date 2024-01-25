import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ms")
public final class Class162 {

	@OriginalMember(owner = "client!ms", name = "k", descriptor = "[I")
	public static final int[] anIntArray375 = new int[256];

	@OriginalMember(owner = "client!ms", name = "b", descriptor = "Lclient!lf;")
	private Class3 aClass3_166;

	@OriginalMember(owner = "client!ms", name = "d", descriptor = "Lclient!tu;")
	private Class229 aClass229_30;

	static {
		for (@Pc(24) int local24 = 0; local24 < 256; local24++) {
			@Pc(27) int local27 = local24;
			for (@Pc(29) int local29 = 0; local29 < 8; local29++) {
				if ((local27 & 0x1) == 1) {
					local27 = local27 >>> 1 ^ 0xEDB88320;
				} else {
					local27 >>>= 0x1;
				}
			}
			anIntArray375[local24] = local27;
		}
	}

	@OriginalMember(owner = "client!ms", name = "<init>", descriptor = "()V")
	public Class162() {
	}

	@OriginalMember(owner = "client!ms", name = "<init>", descriptor = "(Lclient!tu;)V")
	public Class162(@OriginalArg(0) Class229 arg0) {
		this.aClass229_30 = arg0;
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(Lclient!tu;Z)V")
	public void method3882(@OriginalArg(0) Class229 arg0) {
		this.aClass229_30 = arg0;
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(Z)Lclient!lf;")
	public Class3 method3884() {
		@Pc(8) Class3 local8 = this.aClass229_30.aClass3_233.aClass3_261;
		if (local8 == this.aClass229_30.aClass3_233) {
			this.aClass3_166 = null;
			return null;
		} else {
			this.aClass3_166 = local8.aClass3_261;
			return local8;
		}
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(I)Lclient!lf;")
	public Class3 method3885() {
		@Pc(6) Class3 local6 = this.aClass3_166;
		if (local6 == this.aClass229_30.aClass3_233) {
			this.aClass3_166 = null;
			return null;
		} else {
			this.aClass3_166 = local6.aClass3_261;
			return local6;
		}
	}
}
