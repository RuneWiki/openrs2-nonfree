import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wn")
public class Class276 {

	@OriginalMember(owner = "client!wn", name = "b", descriptor = "Lclient!vf;")
	private final Class100_Sub3 aClass100_Sub3_39;

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "Lclient!jaclib/memory/Buffer;")
	protected Buffer aBuffer3;

	@OriginalMember(owner = "client!wn", name = "<init>", descriptor = "(Lclient!vf;[BI)V")
	protected Class276(@OriginalArg(0) Class100_Sub3 arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		this.aClass100_Sub3_39 = arg0;
		this.aBuffer3 = this.aClass100_Sub3_39.aNativeHeap6.a(arg2, false);
		if (arg1 != null) {
			this.aBuffer3.a(arg1, 0, 0, arg2);
		}
	}

	@OriginalMember(owner = "client!wn", name = "<init>", descriptor = "(Lclient!vf;Lclient!jaclib/memory/Buffer;)V")
	protected Class276(@OriginalArg(0) Class100_Sub3 arg0, @OriginalArg(1) Buffer arg1) {
		this.aClass100_Sub3_39 = arg0;
		this.aBuffer3 = arg1;
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "([BI)V")
	protected final void method7651(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		if (this.aBuffer3 == null || this.aBuffer3.getSize() < arg1) {
			this.aBuffer3 = this.aClass100_Sub3_39.aNativeHeap6.a(arg1, false);
		}
		this.aBuffer3.a(arg0, 0, 0, arg1);
	}
}
