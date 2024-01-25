import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jr")
public class Class66 {

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "Lclient!eq;")
	private final Class33_Sub3 aClass33_Sub3_9;

	@OriginalMember(owner = "client!jr", name = "b", descriptor = "Lclient!jaclib/memory/Buffer;")
	protected Buffer aBuffer3;

	@OriginalMember(owner = "client!jr", name = "<init>", descriptor = "(Lclient!eq;[BI)V")
	protected Class66(@OriginalArg(0) Class33_Sub3 arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		this.aClass33_Sub3_9 = arg0;
		this.aBuffer3 = this.aClass33_Sub3_9.aNativeHeap5.a(arg2, false);
		if (arg1 != null) {
			this.aBuffer3.a(arg1, 0, 0, arg2);
		}
	}

	@OriginalMember(owner = "client!jr", name = "<init>", descriptor = "(Lclient!eq;Lclient!jaclib/memory/Buffer;)V")
	protected Class66(@OriginalArg(0) Class33_Sub3 arg0, @OriginalArg(1) Buffer arg1) {
		this.aClass33_Sub3_9 = arg0;
		this.aBuffer3 = arg1;
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "([BI)V")
	protected final void method2687(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		if (this.aBuffer3 == null || this.aBuffer3.getSize() < arg1) {
			this.aBuffer3 = this.aClass33_Sub3_9.aNativeHeap5.a(arg1, false);
		}
		this.aBuffer3.a(arg0, 0, 0, arg1);
	}
}
