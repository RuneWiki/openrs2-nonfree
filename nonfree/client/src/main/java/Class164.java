import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ik")
public class Class164 {

	@OriginalMember(owner = "client!ik", name = "b", descriptor = "Lclient!rs;")
	private final Class133_Sub3 aClass133_Sub3_21;

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "Lclient!jaclib/memory/Buffer;")
	protected Buffer aBuffer3;

	@OriginalMember(owner = "client!ik", name = "<init>", descriptor = "(Lclient!rs;[BI)V")
	protected Class164(@OriginalArg(0) Class133_Sub3 arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		this.aClass133_Sub3_21 = arg0;
		this.aBuffer3 = this.aClass133_Sub3_21.aNativeHeap5.a(arg2, false);
		if (arg1 != null) {
			this.aBuffer3.a(arg1, 0, 0, arg2);
		}
	}

	@OriginalMember(owner = "client!ik", name = "<init>", descriptor = "(Lclient!rs;Lclient!jaclib/memory/Buffer;)V")
	protected Class164(@OriginalArg(0) Class133_Sub3 arg0, @OriginalArg(1) Buffer arg1) {
		this.aClass133_Sub3_21 = arg0;
		this.aBuffer3 = arg1;
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "([BI)V")
	protected final void method5215(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		if (this.aBuffer3 == null || this.aBuffer3.getSize() < arg1) {
			this.aBuffer3 = this.aClass133_Sub3_21.aNativeHeap5.a(arg1, false);
		}
		this.aBuffer3.a(arg0, 0, 0, arg1);
	}
}
