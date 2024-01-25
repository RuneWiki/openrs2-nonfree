import jaggl.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ml")
public class Class170 {

	@OriginalMember(owner = "client!ml", name = "b", descriptor = "Lclient!na;")
	private final Class75_Sub2 aClass75_Sub2_42;

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "Lclient!jaggl/memory/NativeBuffer;")
	protected NativeBuffer aNativeBuffer4;

	@OriginalMember(owner = "client!ml", name = "<init>", descriptor = "(Lclient!na;[BI)V")
	protected Class170(@OriginalArg(0) Class75_Sub2 arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		this.aClass75_Sub2_42 = arg0;
		this.aNativeBuffer4 = this.aClass75_Sub2_42.aNativeHeap2.a(arg2);
		if (arg1 != null) {
			this.aNativeBuffer4.a(arg1, 0, arg2);
		}
	}

	@OriginalMember(owner = "client!ml", name = "<init>", descriptor = "(Lclient!na;Lclient!jaggl/memory/NativeBuffer;)V")
	protected Class170(@OriginalArg(0) Class75_Sub2 arg0, @OriginalArg(1) NativeBuffer arg1) {
		this.aClass75_Sub2_42 = arg0;
		this.aNativeBuffer4 = arg1;
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "([BI)V")
	protected final void method5883(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		if (this.aNativeBuffer4 == null || this.aNativeBuffer4.b < arg1) {
			this.aNativeBuffer4 = this.aClass75_Sub2_42.aNativeHeap2.a(arg1);
		}
		this.aNativeBuffer4.a(arg0, 0, arg1);
	}
}
