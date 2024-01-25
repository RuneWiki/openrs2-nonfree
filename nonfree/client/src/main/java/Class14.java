import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public class Class14 {

	@OriginalMember(owner = "client!ak", name = "b", descriptor = "Lclient!ap;")
	private final Class9_Sub2 aClass9_Sub2_38;

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "Lclient!jaclib/memory/Buffer;")
	protected Buffer aBuffer3;

	@OriginalMember(owner = "client!ak", name = "<init>", descriptor = "(Lclient!ap;[BI)V")
	protected Class14(@OriginalArg(0) Class9_Sub2 arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		this.aClass9_Sub2_38 = arg0;
		this.aBuffer3 = this.aClass9_Sub2_38.aNativeHeap1.a(arg2, false);
		if (arg1 != null) {
			this.aBuffer3.a(arg1, 0, 0, arg2);
		}
	}

	@OriginalMember(owner = "client!ak", name = "<init>", descriptor = "(Lclient!ap;Lclient!jaclib/memory/Buffer;)V")
	protected Class14(@OriginalArg(0) Class9_Sub2 arg0, @OriginalArg(1) Buffer arg1) {
		this.aClass9_Sub2_38 = arg0;
		this.aBuffer3 = arg1;
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "([BI)V")
	protected final void method7653(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		if (this.aBuffer3 == null || this.aBuffer3.getSize() < arg1) {
			this.aBuffer3 = this.aClass9_Sub2_38.aNativeHeap1.a(arg1, false);
		}
		this.aBuffer3.a(arg0, 0, 0, arg1);
	}
}
