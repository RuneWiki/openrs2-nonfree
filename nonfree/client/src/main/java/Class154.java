import jaggl.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class Class154 {

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "Lclient!od;")
	private final Class128_Sub2 aClass128_Sub2_38;

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "Lclient!jaggl/memory/NativeBuffer;")
	protected NativeBuffer aNativeBuffer4;

	@OriginalMember(owner = "client!mb", name = "<init>", descriptor = "(Lclient!od;[BI)V")
	protected Class154(@OriginalArg(0) Class128_Sub2 arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		this.aClass128_Sub2_38 = arg0;
		this.aNativeBuffer4 = this.aClass128_Sub2_38.aNativeHeap2.a(arg2);
		if (arg1 != null) {
			this.aNativeBuffer4.a(arg1, 0, arg2);
		}
	}

	@OriginalMember(owner = "client!mb", name = "<init>", descriptor = "(Lclient!od;Lclient!jaggl/memory/NativeBuffer;)V")
	protected Class154(@OriginalArg(0) Class128_Sub2 arg0, @OriginalArg(1) NativeBuffer arg1) {
		this.aClass128_Sub2_38 = arg0;
		this.aNativeBuffer4 = arg1;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "([BI)V")
	protected final void method4929(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		if (this.aNativeBuffer4 == null || this.aNativeBuffer4.a < arg1) {
			this.aNativeBuffer4 = this.aClass128_Sub2_38.aNativeHeap2.a(arg1);
		}
		this.aNativeBuffer4.a(arg0, 0, arg1);
	}
}
