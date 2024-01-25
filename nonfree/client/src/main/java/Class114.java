import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kda")
public class Class114 {

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "Lclient!kfa;")
	private final Class7_Sub2 aClass7_Sub2_23;

	@OriginalMember(owner = "client!kda", name = "b", descriptor = "Lclient!jaclib/memory/Buffer;")
	protected Buffer aBuffer3;

	@OriginalMember(owner = "client!kda", name = "<init>", descriptor = "(Lclient!kfa;[BI)V")
	protected Class114(@OriginalArg(0) Class7_Sub2 arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		this.aClass7_Sub2_23 = arg0;
		this.aBuffer3 = this.aClass7_Sub2_23.aNativeHeap4.a(arg2, false);
		if (arg1 != null) {
			this.aBuffer3.a(arg1, 0, 0, arg2);
		}
	}

	@OriginalMember(owner = "client!kda", name = "<init>", descriptor = "(Lclient!kfa;Lclient!jaclib/memory/Buffer;)V")
	protected Class114(@OriginalArg(0) Class7_Sub2 arg0, @OriginalArg(1) Buffer arg1) {
		this.aClass7_Sub2_23 = arg0;
		this.aBuffer3 = arg1;
	}

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "([BI)V")
	protected final void method4145(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		if (this.aBuffer3 == null || this.aBuffer3.getSize() < arg1) {
			this.aBuffer3 = this.aClass7_Sub2_23.aNativeHeap4.a(arg1, false);
		}
		this.aBuffer3.a(arg0, 0, 0, arg1);
	}
}
