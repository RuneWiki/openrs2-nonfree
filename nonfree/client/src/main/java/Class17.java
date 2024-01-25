import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public class Class17 {

	@OriginalMember(owner = "client!ak", name = "b", descriptor = "Lclient!dia;")
	private final Class13_Sub2 aClass13_Sub2_42;

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "Lclient!jaclib/memory/Buffer;")
	protected Buffer aBuffer3;

	@OriginalMember(owner = "client!ak", name = "<init>", descriptor = "(Lclient!dia;[BI)V")
	protected Class17(@OriginalArg(0) Class13_Sub2 arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		this.aClass13_Sub2_42 = arg0;
		this.aBuffer3 = this.aClass13_Sub2_42.aNativeHeap3.a(arg2, false);
		if (arg1 != null) {
			this.aBuffer3.a(arg1, 0, 0, arg2);
		}
	}

	@OriginalMember(owner = "client!ak", name = "<init>", descriptor = "(Lclient!dia;Lclient!jaclib/memory/Buffer;)V")
	protected Class17(@OriginalArg(0) Class13_Sub2 arg0, @OriginalArg(1) Buffer arg1) {
		this.aClass13_Sub2_42 = arg0;
		this.aBuffer3 = arg1;
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "([BI)V")
	protected final void method8390(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		if (this.aBuffer3 == null || this.aBuffer3.getSize() < arg1) {
			this.aBuffer3 = this.aClass13_Sub2_42.aNativeHeap3.a(arg1, false);
		}
		this.aBuffer3.a(arg0, 0, 0, arg1);
	}
}
