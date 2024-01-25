import jaclib.memory.heap.NativeHeap;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kba")
public final class Class8_Sub30_Sub1 extends Class8_Sub30 {

	@OriginalMember(owner = "client!kba", name = "t", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public final NativeHeap aNativeHeap4;

	@OriginalMember(owner = "client!kba", name = "<init>", descriptor = "(I)V")
	public Class8_Sub30_Sub1(@OriginalArg(0) int arg0) {
		this.aNativeHeap4 = new NativeHeap(arg0);
	}

	@OriginalMember(owner = "client!kba", name = "b", descriptor = "(B)V")
	public void method4684() {
		this.aNativeHeap4.b();
	}
}
