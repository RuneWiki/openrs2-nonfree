import jaggl.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public class Class10 {

	@OriginalMember(owner = "client!aj", name = "b", descriptor = "Lclient!vd;")
	private final Class51_Sub2 aClass51_Sub2_17;

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "Lclient!jaggl/memory/NativeBuffer;")
	protected NativeBuffer aNativeBuffer3;

	@OriginalMember(owner = "client!aj", name = "<init>", descriptor = "(Lclient!vd;[BI)V")
	protected Class10(@OriginalArg(0) Class51_Sub2 arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		this.aClass51_Sub2_17 = arg0;
		this.aNativeBuffer3 = this.aClass51_Sub2_17.aNativeHeap2.a(arg2);
		if (arg1 != null) {
			this.aNativeBuffer3.a(arg1, 0, arg2);
		}
	}

	@OriginalMember(owner = "client!aj", name = "<init>", descriptor = "(Lclient!vd;Lclient!jaggl/memory/NativeBuffer;)V")
	protected Class10(@OriginalArg(0) Class51_Sub2 arg0, @OriginalArg(1) NativeBuffer arg1) {
		this.aClass51_Sub2_17 = arg0;
		this.aNativeBuffer3 = arg1;
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "([BI)V")
	protected final void method1767(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		if (this.aNativeBuffer3 == null || this.aNativeBuffer3.c < arg1) {
			this.aNativeBuffer3 = this.aClass51_Sub2_17.aNativeHeap2.a(arg1);
		}
		this.aNativeBuffer3.a(arg0, 0, arg1);
	}
}
