import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class Class215 {

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "Lclient!rda;")
	private final Class126_Sub3 aClass126_Sub3_38;

	@OriginalMember(owner = "client!vc", name = "b", descriptor = "Lclient!jaclib/memory/Buffer;")
	protected Buffer aBuffer3;

	@OriginalMember(owner = "client!vc", name = "<init>", descriptor = "(Lclient!rda;[BI)V")
	protected Class215(@OriginalArg(0) Class126_Sub3 arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		this.aClass126_Sub3_38 = arg0;
		this.aBuffer3 = this.aClass126_Sub3_38.aNativeHeap5.a(arg2, false);
		if (arg1 != null) {
			this.aBuffer3.a(arg1, 0, 0, arg2);
		}
	}

	@OriginalMember(owner = "client!vc", name = "<init>", descriptor = "(Lclient!rda;Lclient!jaclib/memory/Buffer;)V")
	protected Class215(@OriginalArg(0) Class126_Sub3 arg0, @OriginalArg(1) Buffer arg1) {
		this.aClass126_Sub3_38 = arg0;
		this.aBuffer3 = arg1;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "([BI)V")
	protected final void method8500(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		if (this.aBuffer3 == null || this.aBuffer3.getSize() < arg1) {
			this.aBuffer3 = this.aClass126_Sub3_38.aNativeHeap5.a(arg1, false);
		}
		this.aBuffer3.a(arg0, 0, 0, arg1);
	}
}
