import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dr")
public class Class79 {

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "Lclient!uca;")
	private final Class162_Sub3 aClass162_Sub3_30;

	@OriginalMember(owner = "client!dr", name = "b", descriptor = "Lclient!jaclib/memory/Buffer;")
	protected Buffer aBuffer3;

	@OriginalMember(owner = "client!dr", name = "<init>", descriptor = "(Lclient!uca;[BI)V")
	protected Class79(@OriginalArg(0) Class162_Sub3 arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		this.aClass162_Sub3_30 = arg0;
		this.aBuffer3 = this.aClass162_Sub3_30.aNativeHeap6.a(arg2, false);
		if (arg1 != null) {
			this.aBuffer3.a(arg1, 0, 0, arg2);
		}
	}

	@OriginalMember(owner = "client!dr", name = "<init>", descriptor = "(Lclient!uca;Lclient!jaclib/memory/Buffer;)V")
	protected Class79(@OriginalArg(0) Class162_Sub3 arg0, @OriginalArg(1) Buffer arg1) {
		this.aClass162_Sub3_30 = arg0;
		this.aBuffer3 = arg1;
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "([BI)V")
	protected final void method5342(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		if (this.aBuffer3 == null || this.aBuffer3.getSize() < arg1) {
			this.aBuffer3 = this.aClass162_Sub3_30.aNativeHeap6.a(arg1, false);
		}
		this.aBuffer3.a(arg0, 0, 0, arg1);
	}
}
