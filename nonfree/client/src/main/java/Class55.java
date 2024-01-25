import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cs")
public class Class55 {

	@OriginalMember(owner = "client!cs", name = "b", descriptor = "Lclient!lea;")
	private final Class101_Sub2 aClass101_Sub2_18;

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "Lclient!jaclib/memory/Buffer;")
	protected Buffer aBuffer3;

	@OriginalMember(owner = "client!cs", name = "<init>", descriptor = "(Lclient!lea;[BI)V")
	protected Class55(@OriginalArg(0) Class101_Sub2 arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		this.aClass101_Sub2_18 = arg0;
		this.aBuffer3 = this.aClass101_Sub2_18.aNativeHeap5.a(arg2, false);
		if (arg1 != null) {
			this.aBuffer3.a(arg1, 0, 0, arg2);
		}
	}

	@OriginalMember(owner = "client!cs", name = "<init>", descriptor = "(Lclient!lea;Lclient!jaclib/memory/Buffer;)V")
	protected Class55(@OriginalArg(0) Class101_Sub2 arg0, @OriginalArg(1) Buffer arg1) {
		this.aClass101_Sub2_18 = arg0;
		this.aBuffer3 = arg1;
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "([BI)V")
	protected final void method4951(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		if (this.aBuffer3 == null || this.aBuffer3.getSize() < arg1) {
			this.aBuffer3 = this.aClass101_Sub2_18.aNativeHeap5.a(arg1, false);
		}
		this.aBuffer3.a(arg0, 0, 0, arg1);
	}
}
