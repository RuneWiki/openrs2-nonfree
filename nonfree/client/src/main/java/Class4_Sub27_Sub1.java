import jaggl.memory.NativeHeap;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nu")
public final class Class4_Sub27_Sub1 extends Class4_Sub27 {

	@OriginalMember(owner = "client!nu", name = "v", descriptor = "Lclient!jaggl/memory/NativeHeap;")
	public final NativeHeap aNativeHeap2;

	@OriginalMember(owner = "client!nu", name = "<init>", descriptor = "(I)V")
	public Class4_Sub27_Sub1(@OriginalArg(0) int arg0) {
		this.aNativeHeap2 = new NativeHeap(arg0);
	}

	@OriginalMember(owner = "client!nu", name = "c", descriptor = "(I)V")
	public void method3710() {
		this.aNativeHeap2.a();
	}
}
