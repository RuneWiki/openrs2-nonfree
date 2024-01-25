import jaggl.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class Class90 {

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "Lclient!rl;")
	private final Class66_Sub2 aClass66_Sub2_31;

	@OriginalMember(owner = "client!sf", name = "b", descriptor = "Lclient!jaggl/memory/NativeBuffer;")
	protected NativeBuffer aNativeBuffer4;

	@OriginalMember(owner = "client!sf", name = "<init>", descriptor = "(Lclient!rl;[BI)V")
	protected Class90(@OriginalArg(0) Class66_Sub2 arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		this.aClass66_Sub2_31 = arg0;
		this.aNativeBuffer4 = this.aClass66_Sub2_31.aNativeHeap2.a(arg2);
		if (arg1 != null) {
			this.aNativeBuffer4.a(arg1, 0, arg2);
		}
	}

	@OriginalMember(owner = "client!sf", name = "<init>", descriptor = "(Lclient!rl;Lclient!jaggl/memory/NativeBuffer;)V")
	protected Class90(@OriginalArg(0) Class66_Sub2 arg0, @OriginalArg(1) NativeBuffer arg1) {
		this.aClass66_Sub2_31 = arg0;
		this.aNativeBuffer4 = arg1;
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "([BI)V")
	protected final void method4585(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		if (this.aNativeBuffer4 == null || this.aNativeBuffer4.b < arg1) {
			this.aNativeBuffer4 = this.aClass66_Sub2_31.aNativeHeap2.a(arg1);
		}
		this.aNativeBuffer4.a(arg0, 0, arg1);
	}
}
