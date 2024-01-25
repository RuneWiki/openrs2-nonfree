import jaggl.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!so")
public class Class72 {

	@OriginalMember(owner = "client!so", name = "b", descriptor = "Lclient!ih;")
	private final Class117_Sub1 aClass117_Sub1_26;

	@OriginalMember(owner = "client!so", name = "a", descriptor = "Lclient!jaggl/memory/NativeBuffer;")
	protected NativeBuffer aNativeBuffer4;

	@OriginalMember(owner = "client!so", name = "<init>", descriptor = "(Lclient!ih;[BI)V")
	protected Class72(@OriginalArg(0) Class117_Sub1 arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		this.aClass117_Sub1_26 = arg0;
		this.aNativeBuffer4 = this.aClass117_Sub1_26.aNativeHeap2.a(arg2);
		if (arg1 != null) {
			this.aNativeBuffer4.a(arg1, 0, arg2);
		}
	}

	@OriginalMember(owner = "client!so", name = "<init>", descriptor = "(Lclient!ih;Lclient!jaggl/memory/NativeBuffer;)V")
	protected Class72(@OriginalArg(0) Class117_Sub1 arg0, @OriginalArg(1) NativeBuffer arg1) {
		this.aClass117_Sub1_26 = arg0;
		this.aNativeBuffer4 = arg1;
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "([BI)V")
	protected final void method3686(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		if (this.aNativeBuffer4 == null || this.aNativeBuffer4.d < arg1) {
			this.aNativeBuffer4 = this.aClass117_Sub1_26.aNativeHeap2.a(arg1);
		}
		this.aNativeBuffer4.a(arg0, 0, arg1);
	}
}
