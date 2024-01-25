import jaclib.memory.heap.NativeHeap;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!laa")
public final class Class3_Sub15_Sub1 extends Class3_Sub15 {

	@OriginalMember(owner = "client!laa", name = "r", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public final NativeHeap aNativeHeap3;

	@OriginalMember(owner = "client!laa", name = "<init>", descriptor = "(I)V")
	public Class3_Sub15_Sub1(@OriginalArg(0) int arg0) {
		this.aNativeHeap3 = new NativeHeap(arg0);
	}

	@OriginalMember(owner = "client!laa", name = "b", descriptor = "(I)V")
	public void method4373() {
		this.aNativeHeap3.a();
	}
}
