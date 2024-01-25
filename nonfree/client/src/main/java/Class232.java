import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qba")
public class Class232 {

	@OriginalMember(owner = "client!qba", name = "b", descriptor = "Lclient!oea;")
	private final Class87_Sub2 aClass87_Sub2_26;

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "Lclient!jaclib/memory/Buffer;")
	protected Buffer aBuffer3;

	@OriginalMember(owner = "client!qba", name = "<init>", descriptor = "(Lclient!oea;[BI)V")
	protected Class232(@OriginalArg(0) Class87_Sub2 arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		this.aClass87_Sub2_26 = arg0;
		this.aBuffer3 = this.aClass87_Sub2_26.aNativeHeap5.a(arg2, false);
		if (arg1 != null) {
			this.aBuffer3.a(arg1, 0, 0, arg2);
		}
	}

	@OriginalMember(owner = "client!qba", name = "<init>", descriptor = "(Lclient!oea;Lclient!jaclib/memory/Buffer;)V")
	protected Class232(@OriginalArg(0) Class87_Sub2 arg0, @OriginalArg(1) Buffer arg1) {
		this.aClass87_Sub2_26 = arg0;
		this.aBuffer3 = arg1;
	}

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "([BI)V")
	protected final void method6314(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		if (this.aBuffer3 == null || this.aBuffer3.getSize() < arg1) {
			this.aBuffer3 = this.aClass87_Sub2_26.aNativeHeap5.a(arg1, false);
		}
		this.aBuffer3.a(arg0, 0, 0, arg1);
	}
}
