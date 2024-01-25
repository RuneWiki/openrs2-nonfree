import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public class Class53 {

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "Lclient!nv;")
	private final Class16_Sub3 aClass16_Sub3_31;

	@OriginalMember(owner = "client!cg", name = "b", descriptor = "Lclient!jaclib/memory/Buffer;")
	protected Buffer aBuffer3;

	@OriginalMember(owner = "client!cg", name = "<init>", descriptor = "(Lclient!nv;[BI)V")
	protected Class53(@OriginalArg(0) Class16_Sub3 arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		this.aClass16_Sub3_31 = arg0;
		this.aBuffer3 = this.aClass16_Sub3_31.aNativeHeap5.a(arg2, false);
		if (arg1 != null) {
			this.aBuffer3.a(arg1, 0, 0, arg2);
		}
	}

	@OriginalMember(owner = "client!cg", name = "<init>", descriptor = "(Lclient!nv;Lclient!jaclib/memory/Buffer;)V")
	protected Class53(@OriginalArg(0) Class16_Sub3 arg0, @OriginalArg(1) Buffer arg1) {
		this.aClass16_Sub3_31 = arg0;
		this.aBuffer3 = arg1;
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "([BI)V")
	protected final void method6285(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		if (this.aBuffer3 == null || this.aBuffer3.getSize() < arg1) {
			this.aBuffer3 = this.aClass16_Sub3_31.aNativeHeap5.a(arg1, false);
		}
		this.aBuffer3.a(arg0, 0, 0, arg1);
	}
}
