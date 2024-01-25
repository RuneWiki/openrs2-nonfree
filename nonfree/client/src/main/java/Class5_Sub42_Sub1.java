import jaclib.memory.heap.NativeHeap;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public final class Class5_Sub42_Sub1 extends Class5_Sub42 {

	@OriginalMember(owner = "client!ob", name = "r", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public final NativeHeap aNativeHeap3;

	@OriginalMember(owner = "client!ob", name = "<init>", descriptor = "(I)V")
	public Class5_Sub42_Sub1(@OriginalArg(0) int arg0) {
		this.aNativeHeap3 = new NativeHeap(arg0);
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(B)V")
	public void method6082() {
		this.aNativeHeap3.a();
	}
}
