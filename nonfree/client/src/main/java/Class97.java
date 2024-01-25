import jaggl.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!st")
public class Class97 {

	@OriginalMember(owner = "client!st", name = "a", descriptor = "Lclient!bl;")
	private final Class28_Sub1 aClass28_Sub1_28;

	@OriginalMember(owner = "client!st", name = "b", descriptor = "Lclient!jaggl/memory/NativeBuffer;")
	protected NativeBuffer aNativeBuffer3;

	@OriginalMember(owner = "client!st", name = "<init>", descriptor = "(Lclient!bl;[BI)V")
	protected Class97(@OriginalArg(0) Class28_Sub1 arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		this.aClass28_Sub1_28 = arg0;
		this.aNativeBuffer3 = this.aClass28_Sub1_28.aNativeHeap1.a(arg2);
		if (arg1 != null) {
			this.aNativeBuffer3.a(arg1, 0, arg2);
		}
	}

	@OriginalMember(owner = "client!st", name = "<init>", descriptor = "(Lclient!bl;Lclient!jaggl/memory/NativeBuffer;)V")
	protected Class97(@OriginalArg(0) Class28_Sub1 arg0, @OriginalArg(1) NativeBuffer arg1) {
		this.aClass28_Sub1_28 = arg0;
		this.aNativeBuffer3 = arg1;
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "([BI)V")
	protected final void method4282(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		if (this.aNativeBuffer3 == null || this.aNativeBuffer3.b < arg1) {
			this.aNativeBuffer3 = this.aClass28_Sub1_28.aNativeHeap1.a(arg1);
		}
		this.aNativeBuffer3.a(arg0, 0, arg1);
	}
}
