import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public class Class49 {

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "Lclient!gia;")
	private final Class67_Sub2 aClass67_Sub2_36;

	@OriginalMember(owner = "client!cg", name = "b", descriptor = "Lclient!jaclib/memory/Buffer;")
	protected Buffer aBuffer3;

	@OriginalMember(owner = "client!cg", name = "<init>", descriptor = "(Lclient!gia;[BI)V")
	protected Class49(@OriginalArg(0) Class67_Sub2 arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		this.aClass67_Sub2_36 = arg0;
		this.aBuffer3 = this.aClass67_Sub2_36.aNativeHeap4.a(arg2, false);
		if (arg1 != null) {
			this.aBuffer3.a(arg1, 0, 0, arg2);
		}
	}

	@OriginalMember(owner = "client!cg", name = "<init>", descriptor = "(Lclient!gia;Lclient!jaclib/memory/Buffer;)V")
	protected Class49(@OriginalArg(0) Class67_Sub2 arg0, @OriginalArg(1) Buffer arg1) {
		this.aClass67_Sub2_36 = arg0;
		this.aBuffer3 = arg1;
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "([BI)V")
	protected final void method8036(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		if (this.aBuffer3 == null || this.aBuffer3.getSize() < arg1) {
			this.aBuffer3 = this.aClass67_Sub2_36.aNativeHeap4.a(arg1, false);
		}
		this.aBuffer3.a(arg0, 0, 0, arg1);
	}
}
