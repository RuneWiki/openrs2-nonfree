import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public class Class135 {

	@OriginalMember(owner = "client!vj", name = "b", descriptor = "Lclient!en;")
	private final Class90_Sub1 aClass90_Sub1_17;

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "Lclient!jaclib/memory/Buffer;")
	protected Buffer aBuffer3;

	@OriginalMember(owner = "client!vj", name = "<init>", descriptor = "(Lclient!en;[BI)V")
	protected Class135(@OriginalArg(0) Class90_Sub1 arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		this.aClass90_Sub1_17 = arg0;
		this.aBuffer3 = this.aClass90_Sub1_17.aNativeHeap2.a(arg2, false);
		if (arg1 != null) {
			this.aBuffer3.a(arg1, 0, 0, arg2);
		}
	}

	@OriginalMember(owner = "client!vj", name = "<init>", descriptor = "(Lclient!en;Lclient!jaclib/memory/Buffer;)V")
	protected Class135(@OriginalArg(0) Class90_Sub1 arg0, @OriginalArg(1) Buffer arg1) {
		this.aClass90_Sub1_17 = arg0;
		this.aBuffer3 = arg1;
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "([BI)V")
	protected final void method3463(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		if (this.aBuffer3 == null || this.aBuffer3.getSize() < arg1) {
			this.aBuffer3 = this.aClass90_Sub1_17.aNativeHeap2.a(arg1, false);
		}
		this.aBuffer3.a(arg0, 0, 0, arg1);
	}
}
