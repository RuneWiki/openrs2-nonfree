import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public class Class67 {

	@OriginalMember(owner = "client!nf", name = "b", descriptor = "Lclient!qo;")
	private final Class20_Sub3 aClass20_Sub3_43;

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "Lclient!jaclib/memory/Buffer;")
	protected Buffer aBuffer3;

	@OriginalMember(owner = "client!nf", name = "<init>", descriptor = "(Lclient!qo;[BI)V")
	protected Class67(@OriginalArg(0) Class20_Sub3 arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		this.aClass20_Sub3_43 = arg0;
		this.aBuffer3 = this.aClass20_Sub3_43.aNativeHeap6.a(arg2, false);
		if (arg1 != null) {
			this.aBuffer3.a(arg1, 0, 0, arg2);
		}
	}

	@OriginalMember(owner = "client!nf", name = "<init>", descriptor = "(Lclient!qo;Lclient!jaclib/memory/Buffer;)V")
	protected Class67(@OriginalArg(0) Class20_Sub3 arg0, @OriginalArg(1) Buffer arg1) {
		this.aClass20_Sub3_43 = arg0;
		this.aBuffer3 = arg1;
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "([BI)V")
	protected final void method9224(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		if (this.aBuffer3 == null || this.aBuffer3.getSize() < arg1) {
			this.aBuffer3 = this.aClass20_Sub3_43.aNativeHeap6.a(arg1, false);
		}
		this.aBuffer3.a(arg0, 0, 0, arg1);
	}
}
