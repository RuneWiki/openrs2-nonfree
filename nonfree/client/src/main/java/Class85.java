import jaggl.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!no")
public class Class85 {

	@OriginalMember(owner = "client!no", name = "b", descriptor = "Lclient!gk;")
	private final Class75_Sub2 aClass75_Sub2_36;

	@OriginalMember(owner = "client!no", name = "a", descriptor = "Lclient!jaggl/memory/NativeBuffer;")
	protected NativeBuffer aNativeBuffer3;

	@OriginalMember(owner = "client!no", name = "<init>", descriptor = "(Lclient!gk;[BI)V")
	protected Class85(@OriginalArg(0) Class75_Sub2 arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		this.aClass75_Sub2_36 = arg0;
		this.aNativeBuffer3 = this.aClass75_Sub2_36.aNativeHeap1.a(arg2);
		if (arg1 != null) {
			this.aNativeBuffer3.a(arg1, 0, arg2);
		}
	}

	@OriginalMember(owner = "client!no", name = "<init>", descriptor = "(Lclient!gk;Lclient!jaggl/memory/NativeBuffer;)V")
	protected Class85(@OriginalArg(0) Class75_Sub2 arg0, @OriginalArg(1) NativeBuffer arg1) {
		this.aClass75_Sub2_36 = arg0;
		this.aNativeBuffer3 = arg1;
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "([BI)V")
	protected final void method4782(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		if (this.aNativeBuffer3 == null || this.aNativeBuffer3.b < arg1) {
			this.aNativeBuffer3 = this.aClass75_Sub2_36.aNativeHeap1.a(arg1);
		}
		this.aNativeBuffer3.a(arg0, 0, arg1);
	}
}
