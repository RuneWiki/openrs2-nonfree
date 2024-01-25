import jaggl.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class Class62 {

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "Lclient!ug;")
	private final Class135_Sub2 aClass135_Sub2_28;

	@OriginalMember(owner = "client!ed", name = "b", descriptor = "Lclient!jaggl/memory/NativeBuffer;")
	protected NativeBuffer aNativeBuffer3;

	@OriginalMember(owner = "client!ed", name = "<init>", descriptor = "(Lclient!ug;[BI)V")
	protected Class62(@OriginalArg(0) Class135_Sub2 arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		this.aClass135_Sub2_28 = arg0;
		this.aNativeBuffer3 = this.aClass135_Sub2_28.aNativeHeap2.a(arg2);
		if (arg1 != null) {
			this.aNativeBuffer3.a(arg1, 0, arg2);
		}
	}

	@OriginalMember(owner = "client!ed", name = "<init>", descriptor = "(Lclient!ug;Lclient!jaggl/memory/NativeBuffer;)V")
	protected Class62(@OriginalArg(0) Class135_Sub2 arg0, @OriginalArg(1) NativeBuffer arg1) {
		this.aClass135_Sub2_28 = arg0;
		this.aNativeBuffer3 = arg1;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "([BI)V")
	protected final void method3825(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		if (this.aNativeBuffer3 == null || this.aNativeBuffer3.a < arg1) {
			this.aNativeBuffer3 = this.aClass135_Sub2_28.aNativeHeap2.a(arg1);
		}
		this.aNativeBuffer3.a(arg0, 0, arg1);
	}
}
