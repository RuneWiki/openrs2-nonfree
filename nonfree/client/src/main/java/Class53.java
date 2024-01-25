import jaggl.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dp")
public class Class53 {

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "Lclient!bo;")
	private final Class26_Sub1 aClass26_Sub1_18;

	@OriginalMember(owner = "client!dp", name = "b", descriptor = "Lclient!jaggl/memory/NativeBuffer;")
	protected NativeBuffer aNativeBuffer3;

	@OriginalMember(owner = "client!dp", name = "<init>", descriptor = "(Lclient!bo;[BI)V")
	protected Class53(@OriginalArg(0) Class26_Sub1 arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		this.aClass26_Sub1_18 = arg0;
		this.aNativeBuffer3 = this.aClass26_Sub1_18.aNativeHeap2.a(arg2);
		if (arg1 != null) {
			this.aNativeBuffer3.a(arg1, 0, arg2);
		}
	}

	@OriginalMember(owner = "client!dp", name = "<init>", descriptor = "(Lclient!bo;Lclient!jaggl/memory/NativeBuffer;)V")
	protected Class53(@OriginalArg(0) Class26_Sub1 arg0, @OriginalArg(1) NativeBuffer arg1) {
		this.aClass26_Sub1_18 = arg0;
		this.aNativeBuffer3 = arg1;
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "([BI)V")
	protected final void method2597(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		if (this.aNativeBuffer3 == null || this.aNativeBuffer3.c < arg1) {
			this.aNativeBuffer3 = this.aClass26_Sub1_18.aNativeHeap2.a(arg1);
		}
		this.aNativeBuffer3.a(arg0, 0, arg1);
	}
}
