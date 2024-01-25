import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class Class111 {

	@OriginalMember(owner = "client!ja", name = "b", descriptor = "Lclient!vj;")
	private final Class45_Sub3 aClass45_Sub3_30;

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "Lclient!jaclib/memory/Buffer;")
	protected Buffer aBuffer3;

	@OriginalMember(owner = "client!ja", name = "<init>", descriptor = "(Lclient!vj;[BI)V")
	protected Class111(@OriginalArg(0) Class45_Sub3 arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		this.aClass45_Sub3_30 = arg0;
		this.aBuffer3 = this.aClass45_Sub3_30.aNativeHeap6.a(arg2, false);
		if (arg1 != null) {
			this.aBuffer3.a(arg1, 0, 0, arg2);
		}
	}

	@OriginalMember(owner = "client!ja", name = "<init>", descriptor = "(Lclient!vj;Lclient!jaclib/memory/Buffer;)V")
	protected Class111(@OriginalArg(0) Class45_Sub3 arg0, @OriginalArg(1) Buffer arg1) {
		this.aClass45_Sub3_30 = arg0;
		this.aBuffer3 = arg1;
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "([BI)V")
	protected final void method3889(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		if (this.aBuffer3 == null || this.aBuffer3.getSize() < arg1) {
			this.aBuffer3 = this.aClass45_Sub3_30.aNativeHeap6.a(arg1, false);
		}
		this.aBuffer3.a(arg0, 0, 0, arg1);
	}
}
