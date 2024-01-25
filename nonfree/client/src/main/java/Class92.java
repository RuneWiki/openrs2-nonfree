import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fq")
public class Class92 {

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "Lclient!te;")
	private final Class9_Sub3 aClass9_Sub3_30;

	@OriginalMember(owner = "client!fq", name = "b", descriptor = "Lclient!jaclib/memory/Buffer;")
	protected Buffer aBuffer3;

	@OriginalMember(owner = "client!fq", name = "<init>", descriptor = "(Lclient!te;[BI)V")
	protected Class92(@OriginalArg(0) Class9_Sub3 arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		this.aClass9_Sub3_30 = arg0;
		this.aBuffer3 = this.aClass9_Sub3_30.aNativeHeap5.a(arg2, false);
		if (arg1 != null) {
			this.aBuffer3.a(arg1, 0, 0, arg2);
		}
	}

	@OriginalMember(owner = "client!fq", name = "<init>", descriptor = "(Lclient!te;Lclient!jaclib/memory/Buffer;)V")
	protected Class92(@OriginalArg(0) Class9_Sub3 arg0, @OriginalArg(1) Buffer arg1) {
		this.aClass9_Sub3_30 = arg0;
		this.aBuffer3 = arg1;
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "([BI)V")
	protected final void method5531(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		if (this.aBuffer3 == null || this.aBuffer3.getSize() < arg1) {
			this.aBuffer3 = this.aClass9_Sub3_30.aNativeHeap5.a(arg1, false);
		}
		this.aBuffer3.a(arg0, 0, 0, arg1);
	}
}
