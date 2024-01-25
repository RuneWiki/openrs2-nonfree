import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ov")
public class Class167 {

	@OriginalMember(owner = "client!ov", name = "b", descriptor = "Lclient!ok;")
	private final Class134_Sub2 aClass134_Sub2_22;

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "Lclient!jaclib/memory/Buffer;")
	protected Buffer aBuffer3;

	@OriginalMember(owner = "client!ov", name = "<init>", descriptor = "(Lclient!ok;[BI)V")
	protected Class167(@OriginalArg(0) Class134_Sub2 arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		this.aClass134_Sub2_22 = arg0;
		this.aBuffer3 = this.aClass134_Sub2_22.aNativeHeap5.a(arg2, false);
		if (arg1 != null) {
			this.aBuffer3.a(arg1, 0, 0, arg2);
		}
	}

	@OriginalMember(owner = "client!ov", name = "<init>", descriptor = "(Lclient!ok;Lclient!jaclib/memory/Buffer;)V")
	protected Class167(@OriginalArg(0) Class134_Sub2 arg0, @OriginalArg(1) Buffer arg1) {
		this.aClass134_Sub2_22 = arg0;
		this.aBuffer3 = arg1;
	}

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "([BI)V")
	protected final void method3855(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		if (this.aBuffer3 == null || this.aBuffer3.getSize() < arg1) {
			this.aBuffer3 = this.aClass134_Sub2_22.aNativeHeap5.a(arg1, false);
		}
		this.aBuffer3.a(arg0, 0, 0, arg1);
	}
}
