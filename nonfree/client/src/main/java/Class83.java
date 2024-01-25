import jaggl.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public class Class83 {

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "Lclient!pg;")
	private final Class163_Sub2 aClass163_Sub2_38;

	@OriginalMember(owner = "client!jf", name = "b", descriptor = "Lclient!jaggl/memory/NativeBuffer;")
	protected NativeBuffer aNativeBuffer3;

	@OriginalMember(owner = "client!jf", name = "<init>", descriptor = "(Lclient!pg;[BI)V")
	protected Class83(@OriginalArg(0) Class163_Sub2 arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		this.aClass163_Sub2_38 = arg0;
		this.aNativeBuffer3 = this.aClass163_Sub2_38.aNativeHeap2.a(arg2);
		if (arg1 != null) {
			this.aNativeBuffer3.a(arg1, 0, arg2);
		}
	}

	@OriginalMember(owner = "client!jf", name = "<init>", descriptor = "(Lclient!pg;Lclient!jaggl/memory/NativeBuffer;)V")
	protected Class83(@OriginalArg(0) Class163_Sub2 arg0, @OriginalArg(1) NativeBuffer arg1) {
		this.aClass163_Sub2_38 = arg0;
		this.aNativeBuffer3 = arg1;
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "([BI)V")
	protected final void method4904(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		if (this.aNativeBuffer3 == null || this.aNativeBuffer3.b < arg1) {
			this.aNativeBuffer3 = this.aClass163_Sub2_38.aNativeHeap2.a(arg1);
		}
		this.aNativeBuffer3.a(arg0, 0, arg1);
	}
}
