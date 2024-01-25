import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wk")
public class Class138 {

	@OriginalMember(owner = "client!wk", name = "b", descriptor = "Lclient!mh;")
	private final Class4_Sub3 aClass4_Sub3_42;

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "Lclient!jaclib/memory/Buffer;")
	protected Buffer aBuffer3;

	@OriginalMember(owner = "client!wk", name = "<init>", descriptor = "(Lclient!mh;[BI)V")
	protected Class138(@OriginalArg(0) Class4_Sub3 arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		this.aClass4_Sub3_42 = arg0;
		this.aBuffer3 = this.aClass4_Sub3_42.aNativeHeap4.a(arg2, false);
		if (arg1 != null) {
			this.aBuffer3.a(arg1, 0, 0, arg2);
		}
	}

	@OriginalMember(owner = "client!wk", name = "<init>", descriptor = "(Lclient!mh;Lclient!jaclib/memory/Buffer;)V")
	protected Class138(@OriginalArg(0) Class4_Sub3 arg0, @OriginalArg(1) Buffer arg1) {
		this.aClass4_Sub3_42 = arg0;
		this.aBuffer3 = arg1;
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "([BI)V")
	protected final void method8127(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		if (this.aBuffer3 == null || this.aBuffer3.getSize() < arg1) {
			this.aBuffer3 = this.aClass4_Sub3_42.aNativeHeap4.a(arg1, false);
		}
		this.aBuffer3.a(arg0, 0, 0, arg1);
	}
}
