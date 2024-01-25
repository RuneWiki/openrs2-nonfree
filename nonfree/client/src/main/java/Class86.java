import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fv")
public class Class86 {

	@OriginalMember(owner = "client!fv", name = "b", descriptor = "Lclient!lj;")
	private final Class78_Sub3 aClass78_Sub3_41;

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "Lclient!jaclib/memory/Buffer;")
	protected Buffer aBuffer3;

	@OriginalMember(owner = "client!fv", name = "<init>", descriptor = "(Lclient!lj;[BI)V")
	protected Class86(@OriginalArg(0) Class78_Sub3 arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		this.aClass78_Sub3_41 = arg0;
		this.aBuffer3 = this.aClass78_Sub3_41.aNativeHeap4.a(arg2, false);
		if (arg1 != null) {
			this.aBuffer3.a(arg1, 0, 0, arg2);
		}
	}

	@OriginalMember(owner = "client!fv", name = "<init>", descriptor = "(Lclient!lj;Lclient!jaclib/memory/Buffer;)V")
	protected Class86(@OriginalArg(0) Class78_Sub3 arg0, @OriginalArg(1) Buffer arg1) {
		this.aClass78_Sub3_41 = arg0;
		this.aBuffer3 = arg1;
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "([BI)V")
	protected final void method7522(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		if (this.aBuffer3 == null || this.aBuffer3.getSize() < arg1) {
			this.aBuffer3 = this.aClass78_Sub3_41.aNativeHeap4.a(arg1, false);
		}
		this.aBuffer3.a(arg0, 0, 0, arg1);
	}
}
