import jaclib.memory.heap.NativeHeap;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public final class Class6_Sub16_Sub1 extends Class6_Sub16 {

	@OriginalMember(owner = "client!eb", name = "s", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public final NativeHeap aNativeHeap4;

	@OriginalMember(owner = "client!eb", name = "<init>", descriptor = "(I)V")
	public Class6_Sub16_Sub1(@OriginalArg(0) int arg0) {
		this.aNativeHeap4 = new NativeHeap(arg0);
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(B)V")
	public void method2549() {
		this.aNativeHeap4.b();
	}
}
