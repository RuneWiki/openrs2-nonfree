import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pea")
public class Class274 {

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "Lclient!ck;")
	private final Class65_Sub1 aClass65_Sub1_43;

	@OriginalMember(owner = "client!pea", name = "b", descriptor = "Lclient!jaclib/memory/Buffer;")
	protected Buffer aBuffer3;

	@OriginalMember(owner = "client!pea", name = "<init>", descriptor = "(Lclient!ck;[BI)V")
	protected Class274(@OriginalArg(0) Class65_Sub1 arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		this.aClass65_Sub1_43 = arg0;
		this.aBuffer3 = this.aClass65_Sub1_43.aNativeHeap1.a(arg2, false);
		if (arg1 != null) {
			this.aBuffer3.a(arg1, 0, 0, arg2);
		}
	}

	@OriginalMember(owner = "client!pea", name = "<init>", descriptor = "(Lclient!ck;Lclient!jaclib/memory/Buffer;)V")
	protected Class274(@OriginalArg(0) Class65_Sub1 arg0, @OriginalArg(1) Buffer arg1) {
		this.aClass65_Sub1_43 = arg0;
		this.aBuffer3 = arg1;
	}

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "([BI)V")
	protected final void method9041(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		if (this.aBuffer3 == null || this.aBuffer3.getSize() < arg1) {
			this.aBuffer3 = this.aClass65_Sub1_43.aNativeHeap1.a(arg1, false);
		}
		this.aBuffer3.a(arg0, 0, 0, arg1);
	}
}
