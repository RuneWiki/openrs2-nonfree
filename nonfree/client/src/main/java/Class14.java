import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uba")
public class Class14 {

	@OriginalMember(owner = "client!uba", name = "b", descriptor = "Lclient!ag;")
	private final Class12_Sub1 aClass12_Sub1_18;

	@OriginalMember(owner = "client!uba", name = "a", descriptor = "Lclient!jaclib/memory/Buffer;")
	protected Buffer aBuffer3;

	@OriginalMember(owner = "client!uba", name = "<init>", descriptor = "(Lclient!ag;[BI)V")
	protected Class14(@OriginalArg(0) Class12_Sub1 arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		this.aClass12_Sub1_18 = arg0;
		this.aBuffer3 = this.aClass12_Sub1_18.aNativeHeap1.a(arg2, false);
		if (arg1 != null) {
			this.aBuffer3.a(arg1, 0, 0, arg2);
		}
	}

	@OriginalMember(owner = "client!uba", name = "<init>", descriptor = "(Lclient!ag;Lclient!jaclib/memory/Buffer;)V")
	protected Class14(@OriginalArg(0) Class12_Sub1 arg0, @OriginalArg(1) Buffer arg1) {
		this.aClass12_Sub1_18 = arg0;
		this.aBuffer3 = arg1;
	}

	@OriginalMember(owner = "client!uba", name = "a", descriptor = "([BI)V")
	protected final void method3244(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		if (this.aBuffer3 == null || this.aBuffer3.getSize() < arg1) {
			this.aBuffer3 = this.aClass12_Sub1_18.aNativeHeap1.a(arg1, false);
		}
		this.aBuffer3.a(arg0, 0, 0, arg1);
	}
}
