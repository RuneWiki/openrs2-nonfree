import jaclib.memory.heap.NativeHeap;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public final class Class6_Sub16_Sub2 extends Class6_Sub16 {

	@OriginalMember(owner = "client!ig", name = "s", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public final NativeHeap aNativeHeap6;

	@OriginalMember(owner = "client!ig", name = "<init>", descriptor = "(I)V")
	public Class6_Sub16_Sub2(@OriginalArg(0) int arg0) {
		this.aNativeHeap6 = new NativeHeap(arg0);
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(B)V")
	public void method4326() {
		this.aNativeHeap6.b();
	}
}
