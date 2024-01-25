import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class Class166 {

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "Lclient!er;")
	private final Class31_Sub2 aClass31_Sub2_26;

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "Lclient!jaclib/memory/Buffer;")
	protected Buffer aBuffer3;

	@OriginalMember(owner = "client!ve", name = "<init>", descriptor = "(Lclient!er;[BI)V")
	protected Class166(@OriginalArg(0) Class31_Sub2 arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		this.aClass31_Sub2_26 = arg0;
		this.aBuffer3 = this.aClass31_Sub2_26.aNativeHeap4.a(arg2, false);
		if (arg1 != null) {
			this.aBuffer3.a(arg1, 0, 0, arg2);
		}
	}

	@OriginalMember(owner = "client!ve", name = "<init>", descriptor = "(Lclient!er;Lclient!jaclib/memory/Buffer;)V")
	protected Class166(@OriginalArg(0) Class31_Sub2 arg0, @OriginalArg(1) Buffer arg1) {
		this.aClass31_Sub2_26 = arg0;
		this.aBuffer3 = arg1;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "([BI)V")
	protected final void method4584(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		if (this.aBuffer3 == null || this.aBuffer3.getSize() < arg1) {
			this.aBuffer3 = this.aClass31_Sub2_26.aNativeHeap4.a(arg1, false);
		}
		this.aBuffer3.a(arg0, 0, 0, arg1);
	}
}
