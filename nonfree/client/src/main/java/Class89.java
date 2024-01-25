import jaggl.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class Class89 {

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "Lclient!nq;")
	private final Class167_Sub1 aClass167_Sub1_22;

	@OriginalMember(owner = "client!qf", name = "b", descriptor = "Lclient!jaggl/memory/NativeBuffer;")
	protected NativeBuffer aNativeBuffer4;

	@OriginalMember(owner = "client!qf", name = "<init>", descriptor = "(Lclient!nq;[BI)V")
	protected Class89(@OriginalArg(0) Class167_Sub1 arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		this.aClass167_Sub1_22 = arg0;
		this.aNativeBuffer4 = this.aClass167_Sub1_22.aNativeHeap2.a(arg2);
		if (arg1 != null) {
			this.aNativeBuffer4.a(arg1, 0, arg2);
		}
	}

	@OriginalMember(owner = "client!qf", name = "<init>", descriptor = "(Lclient!nq;Lclient!jaggl/memory/NativeBuffer;)V")
	protected Class89(@OriginalArg(0) Class167_Sub1 arg0, @OriginalArg(1) NativeBuffer arg1) {
		this.aClass167_Sub1_22 = arg0;
		this.aNativeBuffer4 = arg1;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "([BI)V")
	protected final void method3410(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		if (this.aNativeBuffer4 == null || this.aNativeBuffer4.d < arg1) {
			this.aNativeBuffer4 = this.aClass167_Sub1_22.aNativeHeap2.a(arg1);
		}
		this.aNativeBuffer4.a(arg0, 0, arg1);
	}
}
