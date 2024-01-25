import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rba")
public class Class127 {

	@OriginalMember(owner = "client!rba", name = "b", descriptor = "Lclient!hk;")
	private final Class16_Sub2 aClass16_Sub2_36;

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "Lclient!jaclib/memory/Buffer;")
	protected Buffer aBuffer3;

	@OriginalMember(owner = "client!rba", name = "<init>", descriptor = "(Lclient!hk;[BI)V")
	protected Class127(@OriginalArg(0) Class16_Sub2 arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		this.aClass16_Sub2_36 = arg0;
		this.aBuffer3 = this.aClass16_Sub2_36.aNativeHeap4.a(arg2, false);
		if (arg1 != null) {
			this.aBuffer3.a(arg1, 0, 0, arg2);
		}
	}

	@OriginalMember(owner = "client!rba", name = "<init>", descriptor = "(Lclient!hk;Lclient!jaclib/memory/Buffer;)V")
	protected Class127(@OriginalArg(0) Class16_Sub2 arg0, @OriginalArg(1) Buffer arg1) {
		this.aClass16_Sub2_36 = arg0;
		this.aBuffer3 = arg1;
	}

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "([BI)V")
	protected final void method7363(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		if (this.aBuffer3 == null || this.aBuffer3.getSize() < arg1) {
			this.aBuffer3 = this.aClass16_Sub2_36.aNativeHeap4.a(arg1, false);
		}
		this.aBuffer3.a(arg0, 0, 0, arg1);
	}
}
