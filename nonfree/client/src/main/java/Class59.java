import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mo")
public class Class59 {

	@OriginalMember(owner = "client!mo", name = "b", descriptor = "Lclient!ml;")
	private final Class75_Sub3 aClass75_Sub3_35;

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "Lclient!jaclib/memory/Buffer;")
	protected Buffer aBuffer3;

	@OriginalMember(owner = "client!mo", name = "<init>", descriptor = "(Lclient!ml;[BI)V")
	protected Class59(@OriginalArg(0) Class75_Sub3 arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		this.aClass75_Sub3_35 = arg0;
		this.aBuffer3 = this.aClass75_Sub3_35.aNativeHeap4.a(arg2, false);
		if (arg1 != null) {
			this.aBuffer3.a(arg1, 0, 0, arg2);
		}
	}

	@OriginalMember(owner = "client!mo", name = "<init>", descriptor = "(Lclient!ml;Lclient!jaclib/memory/Buffer;)V")
	protected Class59(@OriginalArg(0) Class75_Sub3 arg0, @OriginalArg(1) Buffer arg1) {
		this.aClass75_Sub3_35 = arg0;
		this.aBuffer3 = arg1;
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "([BI)V")
	protected final void method7556(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		if (this.aBuffer3 == null || this.aBuffer3.getSize() < arg1) {
			this.aBuffer3 = this.aClass75_Sub3_35.aNativeHeap4.a(arg1, false);
		}
		this.aBuffer3.a(arg0, 0, 0, arg1);
	}
}
