import jaggl.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rr")
public class Class64 {

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "Lclient!fd;")
	private final Class19_Sub2 aClass19_Sub2_29;

	@OriginalMember(owner = "client!rr", name = "b", descriptor = "Lclient!jaggl/memory/NativeBuffer;")
	protected NativeBuffer aNativeBuffer4;

	@OriginalMember(owner = "client!rr", name = "<init>", descriptor = "(Lclient!fd;[BI)V")
	protected Class64(@OriginalArg(0) Class19_Sub2 arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		this.aClass19_Sub2_29 = arg0;
		this.aNativeBuffer4 = this.aClass19_Sub2_29.aNativeHeap2.a(arg2);
		if (arg1 != null) {
			this.aNativeBuffer4.a(arg1, 0, arg2);
		}
	}

	@OriginalMember(owner = "client!rr", name = "<init>", descriptor = "(Lclient!fd;Lclient!jaggl/memory/NativeBuffer;)V")
	protected Class64(@OriginalArg(0) Class19_Sub2 arg0, @OriginalArg(1) NativeBuffer arg1) {
		this.aClass19_Sub2_29 = arg0;
		this.aNativeBuffer4 = arg1;
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "([BI)V")
	protected final void method3984(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		if (this.aNativeBuffer4 == null || this.aNativeBuffer4.d < arg1) {
			this.aNativeBuffer4 = this.aClass19_Sub2_29.aNativeHeap2.a(arg1);
		}
		this.aNativeBuffer4.a(arg0, 0, arg1);
	}
}
