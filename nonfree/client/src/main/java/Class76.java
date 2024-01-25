import jaggl.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class Class76 {

	@OriginalMember(owner = "client!tc", name = "b", descriptor = "Lclient!kd;")
	private final Class39_Sub2 aClass39_Sub2_18;

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "Lclient!jaggl/memory/NativeBuffer;")
	protected NativeBuffer aNativeBuffer3;

	@OriginalMember(owner = "client!tc", name = "<init>", descriptor = "(Lclient!kd;[BI)V")
	protected Class76(@OriginalArg(0) Class39_Sub2 arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		this.aClass39_Sub2_18 = arg0;
		this.aNativeBuffer3 = this.aClass39_Sub2_18.aNativeHeap1.a(arg2);
		if (arg1 != null) {
			this.aNativeBuffer3.a(arg1, 0, arg2);
		}
	}

	@OriginalMember(owner = "client!tc", name = "<init>", descriptor = "(Lclient!kd;Lclient!jaggl/memory/NativeBuffer;)V")
	protected Class76(@OriginalArg(0) Class39_Sub2 arg0, @OriginalArg(1) NativeBuffer arg1) {
		this.aClass39_Sub2_18 = arg0;
		this.aNativeBuffer3 = arg1;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "([BI)V")
	protected final void method2379(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		if (this.aNativeBuffer3 == null || this.aNativeBuffer3.b < arg1) {
			this.aNativeBuffer3 = this.aClass39_Sub2_18.aNativeHeap1.a(arg1);
		}
		this.aNativeBuffer3.a(arg0, 0, arg1);
	}
}
