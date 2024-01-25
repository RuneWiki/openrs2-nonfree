import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rw")
public class Class153 {

	@OriginalMember(owner = "client!rw", name = "b", descriptor = "Lclient!ep;")
	private final Class95_Sub1 aClass95_Sub1_28;

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "Lclient!jaclib/memory/Buffer;")
	protected Buffer aBuffer3;

	@OriginalMember(owner = "client!rw", name = "<init>", descriptor = "(Lclient!ep;[BI)V")
	protected Class153(@OriginalArg(0) Class95_Sub1 arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		this.aClass95_Sub1_28 = arg0;
		this.aBuffer3 = this.aClass95_Sub1_28.aNativeHeap1.a(arg2, false);
		if (arg1 != null) {
			this.aBuffer3.a(arg1, 0, 0, arg2);
		}
	}

	@OriginalMember(owner = "client!rw", name = "<init>", descriptor = "(Lclient!ep;Lclient!jaclib/memory/Buffer;)V")
	protected Class153(@OriginalArg(0) Class95_Sub1 arg0, @OriginalArg(1) Buffer arg1) {
		this.aClass95_Sub1_28 = arg0;
		this.aBuffer3 = arg1;
	}

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "([BI)V")
	protected final void method4703(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		if (this.aBuffer3 == null || this.aBuffer3.getSize() < arg1) {
			this.aBuffer3 = this.aClass95_Sub1_28.aNativeHeap1.a(arg1, false);
		}
		this.aBuffer3.a(arg0, 0, 0, arg1);
	}
}
