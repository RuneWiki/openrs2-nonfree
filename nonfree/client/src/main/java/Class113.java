import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public class Class113 {

	@OriginalMember(owner = "client!gh", name = "b", descriptor = "Lclient!jj;")
	private final Class62_Sub3 aClass62_Sub3_32;

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "Lclient!jaclib/memory/Buffer;")
	protected Buffer aBuffer3;

	@OriginalMember(owner = "client!gh", name = "<init>", descriptor = "(Lclient!jj;[BI)V")
	protected Class113(@OriginalArg(0) Class62_Sub3 arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		this.aClass62_Sub3_32 = arg0;
		this.aBuffer3 = this.aClass62_Sub3_32.aNativeHeap3.a(arg2, false);
		if (arg1 != null) {
			this.aBuffer3.a(arg1, 0, 0, arg2);
		}
	}

	@OriginalMember(owner = "client!gh", name = "<init>", descriptor = "(Lclient!jj;Lclient!jaclib/memory/Buffer;)V")
	protected Class113(@OriginalArg(0) Class62_Sub3 arg0, @OriginalArg(1) Buffer arg1) {
		this.aClass62_Sub3_32 = arg0;
		this.aBuffer3 = arg1;
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "([BI)V")
	protected final void method6016(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		if (this.aBuffer3 == null || this.aBuffer3.getSize() < arg1) {
			this.aBuffer3 = this.aClass62_Sub3_32.aNativeHeap3.a(arg1, false);
		}
		this.aBuffer3.a(arg0, 0, 0, arg1);
	}
}
