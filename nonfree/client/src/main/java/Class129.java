import jaggl.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tn")
public class Class129 {

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "Lclient!bt;")
	private final Class30_Sub1 aClass30_Sub1_32;

	@OriginalMember(owner = "client!tn", name = "b", descriptor = "Lclient!jaggl/memory/NativeBuffer;")
	protected NativeBuffer aNativeBuffer3;

	@OriginalMember(owner = "client!tn", name = "<init>", descriptor = "(Lclient!bt;[BI)V")
	protected Class129(@OriginalArg(0) Class30_Sub1 arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		this.aClass30_Sub1_32 = arg0;
		this.aNativeBuffer3 = this.aClass30_Sub1_32.aNativeHeap1.a(arg2);
		if (arg1 != null) {
			this.aNativeBuffer3.a(arg1, 0, arg2);
		}
	}

	@OriginalMember(owner = "client!tn", name = "<init>", descriptor = "(Lclient!bt;Lclient!jaggl/memory/NativeBuffer;)V")
	protected Class129(@OriginalArg(0) Class30_Sub1 arg0, @OriginalArg(1) NativeBuffer arg1) {
		this.aClass30_Sub1_32 = arg0;
		this.aNativeBuffer3 = arg1;
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "([BI)V")
	protected final void method4362(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		if (this.aNativeBuffer3 == null || this.aNativeBuffer3.a < arg1) {
			this.aNativeBuffer3 = this.aClass30_Sub1_32.aNativeHeap1.a(arg1);
		}
		this.aNativeBuffer3.a(arg0, 0, arg1);
	}
}
