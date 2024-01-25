import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wja")
public class Class188 {

	@OriginalMember(owner = "client!wja", name = "a", descriptor = "Lclient!aq;")
	private final Class22_Sub1 aClass22_Sub1_24;

	@OriginalMember(owner = "client!wja", name = "b", descriptor = "Lclient!jaclib/memory/Buffer;")
	protected Buffer aBuffer3;

	@OriginalMember(owner = "client!wja", name = "<init>", descriptor = "(Lclient!aq;[BI)V")
	protected Class188(@OriginalArg(0) Class22_Sub1 arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		this.aClass22_Sub1_24 = arg0;
		this.aBuffer3 = this.aClass22_Sub1_24.aNativeHeap1.a(arg2, false);
		if (arg1 != null) {
			this.aBuffer3.a(arg1, 0, 0, arg2);
		}
	}

	@OriginalMember(owner = "client!wja", name = "<init>", descriptor = "(Lclient!aq;Lclient!jaclib/memory/Buffer;)V")
	protected Class188(@OriginalArg(0) Class22_Sub1 arg0, @OriginalArg(1) Buffer arg1) {
		this.aClass22_Sub1_24 = arg0;
		this.aBuffer3 = arg1;
	}

	@OriginalMember(owner = "client!wja", name = "a", descriptor = "([BI)V")
	protected final void method4874(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		if (this.aBuffer3 == null || this.aBuffer3.getSize() < arg1) {
			this.aBuffer3 = this.aClass22_Sub1_24.aNativeHeap1.a(arg1, false);
		}
		this.aBuffer3.a(arg0, 0, 0, arg1);
	}
}
