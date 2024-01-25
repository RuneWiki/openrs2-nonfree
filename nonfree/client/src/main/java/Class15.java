import jaggl.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public class Class15 {

	@OriginalMember(owner = "client!mg", name = "b", descriptor = "Lclient!tt;")
	private final Class200_Sub2 aClass200_Sub2_7;

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "Lclient!jaggl/memory/NativeBuffer;")
	protected NativeBuffer aNativeBuffer3;

	@OriginalMember(owner = "client!mg", name = "<init>", descriptor = "(Lclient!tt;[BI)V")
	protected Class15(@OriginalArg(0) Class200_Sub2 arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		this.aClass200_Sub2_7 = arg0;
		this.aNativeBuffer3 = this.aClass200_Sub2_7.aNativeHeap2.a(arg2);
		if (arg1 != null) {
			this.aNativeBuffer3.a(arg1, 0, arg2);
		}
	}

	@OriginalMember(owner = "client!mg", name = "<init>", descriptor = "(Lclient!tt;Lclient!jaggl/memory/NativeBuffer;)V")
	protected Class15(@OriginalArg(0) Class200_Sub2 arg0, @OriginalArg(1) NativeBuffer arg1) {
		this.aClass200_Sub2_7 = arg0;
		this.aNativeBuffer3 = arg1;
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "([BI)V")
	protected final void method535(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		if (this.aNativeBuffer3 == null || this.aNativeBuffer3.a < arg1) {
			this.aNativeBuffer3 = this.aClass200_Sub2_7.aNativeHeap2.a(arg1);
		}
		this.aNativeBuffer3.a(arg0, 0, arg1);
	}
}
