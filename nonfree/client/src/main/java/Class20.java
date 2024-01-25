import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!is")
public class Class20 {

	@OriginalMember(owner = "client!is", name = "b", descriptor = "Lclient!no;")
	private final Class66_Sub3 aClass66_Sub3_10;

	@OriginalMember(owner = "client!is", name = "a", descriptor = "Lclient!jaclib/memory/Buffer;")
	protected Buffer aBuffer3;

	@OriginalMember(owner = "client!is", name = "<init>", descriptor = "(Lclient!no;[BI)V")
	protected Class20(@OriginalArg(0) Class66_Sub3 arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		this.aClass66_Sub3_10 = arg0;
		this.aBuffer3 = this.aClass66_Sub3_10.aNativeHeap4.a(arg2, false);
		if (arg1 != null) {
			this.aBuffer3.a(arg1, 0, 0, arg2);
		}
	}

	@OriginalMember(owner = "client!is", name = "<init>", descriptor = "(Lclient!no;Lclient!jaclib/memory/Buffer;)V")
	protected Class20(@OriginalArg(0) Class66_Sub3 arg0, @OriginalArg(1) Buffer arg1) {
		this.aClass66_Sub3_10 = arg0;
		this.aBuffer3 = arg1;
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "([BI)V")
	protected final void method3000(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		if (this.aBuffer3 == null || this.aBuffer3.getSize() < arg1) {
			this.aBuffer3 = this.aClass66_Sub3_10.aNativeHeap4.a(arg1, false);
		}
		this.aBuffer3.a(arg0, 0, 0, arg1);
	}
}
