import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tl")
public class Class41 {

	@OriginalMember(owner = "client!tl", name = "b", descriptor = "Lclient!dw;")
	private final Class82_Sub1 aClass82_Sub1_28;

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "Lclient!jaclib/memory/Buffer;")
	protected Buffer aBuffer3;

	@OriginalMember(owner = "client!tl", name = "<init>", descriptor = "(Lclient!dw;[BI)V")
	protected Class41(@OriginalArg(0) Class82_Sub1 arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		this.aClass82_Sub1_28 = arg0;
		this.aBuffer3 = this.aClass82_Sub1_28.aNativeHeap1.a(arg2, false);
		if (arg1 != null) {
			this.aBuffer3.a(arg1, 0, 0, arg2);
		}
	}

	@OriginalMember(owner = "client!tl", name = "<init>", descriptor = "(Lclient!dw;Lclient!jaclib/memory/Buffer;)V")
	protected Class41(@OriginalArg(0) Class82_Sub1 arg0, @OriginalArg(1) Buffer arg1) {
		this.aClass82_Sub1_28 = arg0;
		this.aBuffer3 = arg1;
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "([BI)V")
	protected final void method5395(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		if (this.aBuffer3 == null || this.aBuffer3.getSize() < arg1) {
			this.aBuffer3 = this.aClass82_Sub1_28.aNativeHeap1.a(arg1, false);
		}
		this.aBuffer3.a(arg0, 0, 0, arg1);
	}
}
