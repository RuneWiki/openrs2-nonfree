import jaggl.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public class Class45 {

	@OriginalMember(owner = "client!r", name = "a", descriptor = "Lclient!bv;")
	private final Class30_Sub1 aClass30_Sub1_27;

	@OriginalMember(owner = "client!r", name = "b", descriptor = "Lclient!jaggl/memory/NativeBuffer;")
	protected NativeBuffer aNativeBuffer4;

	@OriginalMember(owner = "client!r", name = "<init>", descriptor = "(Lclient!bv;[BI)V")
	protected Class45(@OriginalArg(0) Class30_Sub1 arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		this.aClass30_Sub1_27 = arg0;
		this.aNativeBuffer4 = this.aClass30_Sub1_27.aNativeHeap1.a(arg2);
		if (arg1 != null) {
			this.aNativeBuffer4.a(arg1, 0, arg2);
		}
	}

	@OriginalMember(owner = "client!r", name = "<init>", descriptor = "(Lclient!bv;Lclient!jaggl/memory/NativeBuffer;)V")
	protected Class45(@OriginalArg(0) Class30_Sub1 arg0, @OriginalArg(1) NativeBuffer arg1) {
		this.aClass30_Sub1_27 = arg0;
		this.aNativeBuffer4 = arg1;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "([BI)V")
	protected final void method3513(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		if (this.aNativeBuffer4 == null || this.aNativeBuffer4.a < arg1) {
			this.aNativeBuffer4 = this.aClass30_Sub1_27.aNativeHeap1.a(arg1);
		}
		this.aNativeBuffer4.a(arg0, 0, arg1);
	}
}
