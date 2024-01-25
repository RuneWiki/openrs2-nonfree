import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ds")
public class Class86 {

	@OriginalMember(owner = "client!ds", name = "b", descriptor = "Lclient!pi;")
	private final Class144_Sub3 aClass144_Sub3_39;

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "Lclient!jaclib/memory/Buffer;")
	protected Buffer aBuffer3;

	@OriginalMember(owner = "client!ds", name = "<init>", descriptor = "(Lclient!pi;[BI)V")
	protected Class86(@OriginalArg(0) Class144_Sub3 arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		this.aClass144_Sub3_39 = arg0;
		this.aBuffer3 = this.aClass144_Sub3_39.aNativeHeap6.a(arg2, false);
		if (arg1 != null) {
			this.aBuffer3.a(arg1, 0, 0, arg2);
		}
	}

	@OriginalMember(owner = "client!ds", name = "<init>", descriptor = "(Lclient!pi;Lclient!jaclib/memory/Buffer;)V")
	protected Class86(@OriginalArg(0) Class144_Sub3 arg0, @OriginalArg(1) Buffer arg1) {
		this.aClass144_Sub3_39 = arg0;
		this.aBuffer3 = arg1;
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "([BI)V")
	protected final void method8715(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		if (this.aBuffer3 == null || this.aBuffer3.getSize() < arg1) {
			this.aBuffer3 = this.aClass144_Sub3_39.aNativeHeap6.a(arg1, false);
		}
		this.aBuffer3.a(arg0, 0, 0, arg1);
	}
}
