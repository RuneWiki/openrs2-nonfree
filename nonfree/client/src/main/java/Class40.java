import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bm")
public class Class40 {

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "Lclient!qfa;")
	private final Class137_Sub3 aClass137_Sub3_22;

	@OriginalMember(owner = "client!bm", name = "b", descriptor = "Lclient!jaclib/memory/Buffer;")
	protected Buffer aBuffer3;

	@OriginalMember(owner = "client!bm", name = "<init>", descriptor = "(Lclient!qfa;[BI)V")
	protected Class40(@OriginalArg(0) Class137_Sub3 arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		this.aClass137_Sub3_22 = arg0;
		this.aBuffer3 = this.aClass137_Sub3_22.aNativeHeap5.a(arg2, false);
		if (arg1 != null) {
			this.aBuffer3.a(arg1, 0, 0, arg2);
		}
	}

	@OriginalMember(owner = "client!bm", name = "<init>", descriptor = "(Lclient!qfa;Lclient!jaclib/memory/Buffer;)V")
	protected Class40(@OriginalArg(0) Class137_Sub3 arg0, @OriginalArg(1) Buffer arg1) {
		this.aClass137_Sub3_22 = arg0;
		this.aBuffer3 = arg1;
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "([BI)V")
	protected final void method5492(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		if (this.aBuffer3 == null || this.aBuffer3.getSize() < arg1) {
			this.aBuffer3 = this.aClass137_Sub3_22.aNativeHeap5.a(arg1, false);
		}
		this.aBuffer3.a(arg0, 0, 0, arg1);
	}
}
