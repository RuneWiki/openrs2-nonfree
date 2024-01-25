import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kaa")
public class Class168 {

	@OriginalMember(owner = "client!kaa", name = "b", descriptor = "Lclient!gi;")
	private final Class42_Sub3 aClass42_Sub3_38;

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "Lclient!jaclib/memory/Buffer;")
	protected Buffer aBuffer3;

	@OriginalMember(owner = "client!kaa", name = "<init>", descriptor = "(Lclient!gi;[BI)V")
	protected Class168(@OriginalArg(0) Class42_Sub3 arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		this.aClass42_Sub3_38 = arg0;
		this.aBuffer3 = this.aClass42_Sub3_38.aNativeHeap3.a(arg2, false);
		if (arg1 != null) {
			this.aBuffer3.a(arg1, 0, 0, arg2);
		}
	}

	@OriginalMember(owner = "client!kaa", name = "<init>", descriptor = "(Lclient!gi;Lclient!jaclib/memory/Buffer;)V")
	protected Class168(@OriginalArg(0) Class42_Sub3 arg0, @OriginalArg(1) Buffer arg1) {
		this.aClass42_Sub3_38 = arg0;
		this.aBuffer3 = arg1;
	}

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "([BI)V")
	protected final void method7243(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		if (this.aBuffer3 == null || this.aBuffer3.getSize() < arg1) {
			this.aBuffer3 = this.aClass42_Sub3_38.aNativeHeap3.a(arg1, false);
		}
		this.aBuffer3.a(arg0, 0, 0, arg1);
	}
}
