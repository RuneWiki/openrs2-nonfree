import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bv")
public class Class44 {

	@OriginalMember(owner = "client!bv", name = "b", descriptor = "Lclient!qj;")
	private final Class100_Sub3 aClass100_Sub3_44;

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "Lclient!jaclib/memory/Buffer;")
	protected Buffer aBuffer3;

	@OriginalMember(owner = "client!bv", name = "<init>", descriptor = "(Lclient!qj;[BI)V")
	protected Class44(@OriginalArg(0) Class100_Sub3 arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		this.aClass100_Sub3_44 = arg0;
		this.aBuffer3 = this.aClass100_Sub3_44.aNativeHeap6.a(arg2, false);
		if (arg1 != null) {
			this.aBuffer3.a(arg1, 0, 0, arg2);
		}
	}

	@OriginalMember(owner = "client!bv", name = "<init>", descriptor = "(Lclient!qj;Lclient!jaclib/memory/Buffer;)V")
	protected Class44(@OriginalArg(0) Class100_Sub3 arg0, @OriginalArg(1) Buffer arg1) {
		this.aClass100_Sub3_44 = arg0;
		this.aBuffer3 = arg1;
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "([BI)V")
	protected final void method7923(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		if (this.aBuffer3 == null || this.aBuffer3.getSize() < arg1) {
			this.aBuffer3 = this.aClass100_Sub3_44.aNativeHeap6.a(arg1, false);
		}
		this.aBuffer3.a(arg0, 0, 0, arg1);
	}
}
