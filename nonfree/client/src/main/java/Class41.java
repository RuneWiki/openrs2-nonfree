import jaggl.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class Class41 {

	@OriginalMember(owner = "client!me", name = "b", descriptor = "Lclient!ef;")
	private final Class49_Sub2 aClass49_Sub2_15;

	@OriginalMember(owner = "client!me", name = "a", descriptor = "Lclient!jaggl/memory/NativeBuffer;")
	protected NativeBuffer aNativeBuffer3;

	@OriginalMember(owner = "client!me", name = "<init>", descriptor = "(Lclient!ef;[BI)V")
	protected Class41(@OriginalArg(0) Class49_Sub2 arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		this.aClass49_Sub2_15 = arg0;
		this.aNativeBuffer3 = this.aClass49_Sub2_15.aNativeHeap1.a(arg2);
		if (arg1 != null) {
			this.aNativeBuffer3.a(arg1, 0, arg2);
		}
	}

	@OriginalMember(owner = "client!me", name = "<init>", descriptor = "(Lclient!ef;Lclient!jaggl/memory/NativeBuffer;)V")
	protected Class41(@OriginalArg(0) Class49_Sub2 arg0, @OriginalArg(1) NativeBuffer arg1) {
		this.aClass49_Sub2_15 = arg0;
		this.aNativeBuffer3 = arg1;
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "([BI)V")
	protected final void method2308(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		if (this.aNativeBuffer3 == null || this.aNativeBuffer3.c < arg1) {
			this.aNativeBuffer3 = this.aClass49_Sub2_15.aNativeHeap1.a(arg1);
		}
		this.aNativeBuffer3.a(arg0, 0, arg1);
	}
}
