import jaggl.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bn")
public class Class28 {

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "Lclient!qg;")
	private final Class121_Sub2 aClass121_Sub2_41;

	@OriginalMember(owner = "client!bn", name = "b", descriptor = "Lclient!jaggl/memory/NativeBuffer;")
	protected NativeBuffer aNativeBuffer4;

	@OriginalMember(owner = "client!bn", name = "<init>", descriptor = "(Lclient!qg;[BI)V")
	protected Class28(@OriginalArg(0) Class121_Sub2 arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		this.aClass121_Sub2_41 = arg0;
		this.aNativeBuffer4 = this.aClass121_Sub2_41.aNativeHeap1.a(arg2);
		if (arg1 != null) {
			this.aNativeBuffer4.a(arg1, 0, arg2);
		}
	}

	@OriginalMember(owner = "client!bn", name = "<init>", descriptor = "(Lclient!qg;Lclient!jaggl/memory/NativeBuffer;)V")
	protected Class28(@OriginalArg(0) Class121_Sub2 arg0, @OriginalArg(1) NativeBuffer arg1) {
		this.aClass121_Sub2_41 = arg0;
		this.aNativeBuffer4 = arg1;
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "([BI)V")
	protected final void method5806(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		if (this.aNativeBuffer4 == null || this.aNativeBuffer4.c < arg1) {
			this.aNativeBuffer4 = this.aClass121_Sub2_41.aNativeHeap1.a(arg1);
		}
		this.aNativeBuffer4.a(arg0, 0, arg1);
	}
}
