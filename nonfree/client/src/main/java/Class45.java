import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cs")
public class Class45 {

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "Lclient!os;")
	private final Class39_Sub3 aClass39_Sub3_36;

	@OriginalMember(owner = "client!cs", name = "b", descriptor = "Lclient!jaclib/memory/Buffer;")
	protected Buffer aBuffer3;

	@OriginalMember(owner = "client!cs", name = "<init>", descriptor = "(Lclient!os;[BI)V")
	protected Class45(@OriginalArg(0) Class39_Sub3 arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		this.aClass39_Sub3_36 = arg0;
		this.aBuffer3 = this.aClass39_Sub3_36.aNativeHeap4.a(arg2, false);
		if (arg1 != null) {
			this.aBuffer3.a(arg1, 0, 0, arg2);
		}
	}

	@OriginalMember(owner = "client!cs", name = "<init>", descriptor = "(Lclient!os;Lclient!jaclib/memory/Buffer;)V")
	protected Class45(@OriginalArg(0) Class39_Sub3 arg0, @OriginalArg(1) Buffer arg1) {
		this.aClass39_Sub3_36 = arg0;
		this.aBuffer3 = arg1;
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "([BI)V")
	protected final void method6820(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		if (this.aBuffer3 == null || this.aBuffer3.getSize() < arg1) {
			this.aBuffer3 = this.aClass39_Sub3_36.aNativeHeap4.a(arg1, false);
		}
		this.aBuffer3.a(arg0, 0, 0, arg1);
	}
}
