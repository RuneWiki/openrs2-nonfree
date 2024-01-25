import jaggl.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gw")
public class Class4 {

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "Lclient!ih;")
	private final Class106_Sub2 aClass106_Sub2_37;

	@OriginalMember(owner = "client!gw", name = "b", descriptor = "Lclient!jaggl/memory/NativeBuffer;")
	protected NativeBuffer aNativeBuffer4;

	@OriginalMember(owner = "client!gw", name = "<init>", descriptor = "(Lclient!ih;[BI)V")
	protected Class4(@OriginalArg(0) Class106_Sub2 arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		this.aClass106_Sub2_37 = arg0;
		this.aNativeBuffer4 = this.aClass106_Sub2_37.aNativeHeap2.a(arg2);
		if (arg1 != null) {
			this.aNativeBuffer4.a(arg1, 0, arg2);
		}
	}

	@OriginalMember(owner = "client!gw", name = "<init>", descriptor = "(Lclient!ih;Lclient!jaggl/memory/NativeBuffer;)V")
	protected Class4(@OriginalArg(0) Class106_Sub2 arg0, @OriginalArg(1) NativeBuffer arg1) {
		this.aClass106_Sub2_37 = arg0;
		this.aNativeBuffer4 = arg1;
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "([BI)V")
	protected final void method4797(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		if (this.aNativeBuffer4 == null || this.aNativeBuffer4.c < arg1) {
			this.aNativeBuffer4 = this.aClass106_Sub2_37.aNativeHeap2.a(arg1);
		}
		this.aNativeBuffer4.a(arg0, 0, arg1);
	}
}
