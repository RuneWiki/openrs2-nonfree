import jaclib.memory.heap.NativeHeap;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pfa")
public final class Class6_Sub25_Sub1 extends Class6_Sub25 {

	@OriginalMember(owner = "client!pfa", name = "r", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public final NativeHeap aNativeHeap5;

	@OriginalMember(owner = "client!pfa", name = "<init>", descriptor = "(I)V")
	public Class6_Sub25_Sub1(@OriginalArg(0) int arg0) {
		this.aNativeHeap5 = new NativeHeap(arg0);
	}

	@OriginalMember(owner = "client!pfa", name = "a", descriptor = "(B)V")
	public void method6179() {
		this.aNativeHeap5.a();
	}
}
