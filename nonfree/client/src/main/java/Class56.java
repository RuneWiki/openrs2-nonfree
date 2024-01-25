import jaggl.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!im")
public class Class56 {

	@OriginalMember(owner = "client!im", name = "b", descriptor = "Lclient!ur;")
	private final Class34_Sub2 aClass34_Sub2_39;

	@OriginalMember(owner = "client!im", name = "a", descriptor = "Lclient!jaggl/memory/NativeBuffer;")
	protected NativeBuffer aNativeBuffer3;

	@OriginalMember(owner = "client!im", name = "<init>", descriptor = "(Lclient!ur;[BI)V")
	protected Class56(@OriginalArg(0) Class34_Sub2 arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		this.aClass34_Sub2_39 = arg0;
		this.aNativeBuffer3 = this.aClass34_Sub2_39.aNativeHeap2.a(arg2);
		if (arg1 != null) {
			this.aNativeBuffer3.a(arg1, 0, arg2);
		}
	}

	@OriginalMember(owner = "client!im", name = "<init>", descriptor = "(Lclient!ur;Lclient!jaggl/memory/NativeBuffer;)V")
	protected Class56(@OriginalArg(0) Class34_Sub2 arg0, @OriginalArg(1) NativeBuffer arg1) {
		this.aClass34_Sub2_39 = arg0;
		this.aNativeBuffer3 = arg1;
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "([BI)V")
	protected final void method5244(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		if (this.aNativeBuffer3 == null || this.aNativeBuffer3.a < arg1) {
			this.aNativeBuffer3 = this.aClass34_Sub2_39.aNativeHeap2.a(arg1);
		}
		this.aNativeBuffer3.a(arg0, 0, arg1);
	}
}
