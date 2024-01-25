import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public class Class130 {

	@OriginalMember(owner = "client!ta", name = "b", descriptor = "Lclient!bi;")
	private final Class13_Sub2 aClass13_Sub2_23;

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "Lclient!jaclib/memory/Buffer;")
	protected Buffer aBuffer3;

	@OriginalMember(owner = "client!ta", name = "<init>", descriptor = "(Lclient!bi;[BI)V")
	protected Class130(@OriginalArg(0) Class13_Sub2 arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		this.aClass13_Sub2_23 = arg0;
		this.aBuffer3 = this.aClass13_Sub2_23.aNativeHeap1.a(arg2, false);
		if (arg1 != null) {
			this.aBuffer3.a(arg1, 0, 0, arg2);
		}
	}

	@OriginalMember(owner = "client!ta", name = "<init>", descriptor = "(Lclient!bi;Lclient!jaclib/memory/Buffer;)V")
	protected Class130(@OriginalArg(0) Class13_Sub2 arg0, @OriginalArg(1) Buffer arg1) {
		this.aClass13_Sub2_23 = arg0;
		this.aBuffer3 = arg1;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "([BI)V")
	protected final void method4611(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		if (this.aBuffer3 == null || this.aBuffer3.getSize() < arg1) {
			this.aBuffer3 = this.aClass13_Sub2_23.aNativeHeap1.a(arg1, false);
		}
		this.aBuffer3.a(arg0, 0, 0, arg1);
	}
}
