import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lr")
public class Class33 {

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "Lclient!ad;")
	private final Class5_Sub1 aClass5_Sub1_20;

	@OriginalMember(owner = "client!lr", name = "b", descriptor = "Lclient!jaclib/memory/Buffer;")
	protected Buffer aBuffer3;

	@OriginalMember(owner = "client!lr", name = "<init>", descriptor = "(Lclient!ad;[BI)V")
	protected Class33(@OriginalArg(0) Class5_Sub1 arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		this.aClass5_Sub1_20 = arg0;
		this.aBuffer3 = this.aClass5_Sub1_20.aNativeHeap1.a(arg2, false);
		if (arg1 != null) {
			this.aBuffer3.a(arg1, 0, 0, arg2);
		}
	}

	@OriginalMember(owner = "client!lr", name = "<init>", descriptor = "(Lclient!ad;Lclient!jaclib/memory/Buffer;)V")
	protected Class33(@OriginalArg(0) Class5_Sub1 arg0, @OriginalArg(1) Buffer arg1) {
		this.aClass5_Sub1_20 = arg0;
		this.aBuffer3 = arg1;
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "([BI)V")
	protected final void method4106(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		if (this.aBuffer3 == null || this.aBuffer3.getSize() < arg1) {
			this.aBuffer3 = this.aClass5_Sub1_20.aNativeHeap1.a(arg1, false);
		}
		this.aBuffer3.a(arg0, 0, 0, arg1);
	}
}
