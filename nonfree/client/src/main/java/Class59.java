import jaggl.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!du")
public class Class59 {

	@OriginalMember(owner = "client!du", name = "a", descriptor = "Lclient!ht;")
	private final Class109_Sub1 aClass109_Sub1_43;

	@OriginalMember(owner = "client!du", name = "b", descriptor = "Lclient!jaggl/memory/NativeBuffer;")
	protected NativeBuffer aNativeBuffer4;

	@OriginalMember(owner = "client!du", name = "<init>", descriptor = "(Lclient!ht;[BI)V")
	protected Class59(@OriginalArg(0) Class109_Sub1 arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		this.aClass109_Sub1_43 = arg0;
		this.aNativeBuffer4 = this.aClass109_Sub1_43.aNativeHeap1.a(arg2);
		if (arg1 != null) {
			this.aNativeBuffer4.a(arg1, 0, arg2);
		}
	}

	@OriginalMember(owner = "client!du", name = "<init>", descriptor = "(Lclient!ht;Lclient!jaggl/memory/NativeBuffer;)V")
	protected Class59(@OriginalArg(0) Class109_Sub1 arg0, @OriginalArg(1) NativeBuffer arg1) {
		this.aClass109_Sub1_43 = arg0;
		this.aNativeBuffer4 = arg1;
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "([BI)V")
	protected final void method5606(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		if (this.aNativeBuffer4 == null || this.aNativeBuffer4.a < arg1) {
			this.aNativeBuffer4 = this.aClass109_Sub1_43.aNativeHeap1.a(arg1);
		}
		this.aNativeBuffer4.a(arg0, 0, arg1);
	}
}
