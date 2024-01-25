import jaggl.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ws")
public class Class121 {

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "Lclient!vj;")
	private final Class172_Sub2 aClass172_Sub2_36;

	@OriginalMember(owner = "client!ws", name = "b", descriptor = "Lclient!jaggl/memory/NativeBuffer;")
	protected NativeBuffer aNativeBuffer4;

	@OriginalMember(owner = "client!ws", name = "<init>", descriptor = "(Lclient!vj;[BI)V")
	protected Class121(@OriginalArg(0) Class172_Sub2 arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		this.aClass172_Sub2_36 = arg0;
		this.aNativeBuffer4 = this.aClass172_Sub2_36.aNativeHeap2.a(arg2);
		if (arg1 != null) {
			this.aNativeBuffer4.a(arg1, 0, arg2);
		}
	}

	@OriginalMember(owner = "client!ws", name = "<init>", descriptor = "(Lclient!vj;Lclient!jaggl/memory/NativeBuffer;)V")
	protected Class121(@OriginalArg(0) Class172_Sub2 arg0, @OriginalArg(1) NativeBuffer arg1) {
		this.aClass172_Sub2_36 = arg0;
		this.aNativeBuffer4 = arg1;
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "([BI)V")
	protected final void method5069(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		if (this.aNativeBuffer4 == null || this.aNativeBuffer4.b < arg1) {
			this.aNativeBuffer4 = this.aClass172_Sub2_36.aNativeHeap2.a(arg1);
		}
		this.aNativeBuffer4.a(arg0, 0, arg1);
	}
}
