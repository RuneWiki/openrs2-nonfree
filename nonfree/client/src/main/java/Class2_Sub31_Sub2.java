import jaclib.memory.heap.NativeHeap;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tu")
public final class Class2_Sub31_Sub2 extends Class2_Sub31 {

	@OriginalMember(owner = "client!tu", name = "q", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public final NativeHeap aNativeHeap6;

	@OriginalMember(owner = "client!tu", name = "<init>", descriptor = "(I)V")
	public Class2_Sub31_Sub2(@OriginalArg(0) int arg0) {
		this.aNativeHeap6 = new NativeHeap(arg0);
	}

	@OriginalMember(owner = "client!tu", name = "d", descriptor = "(B)V")
	public void method7666() {
		this.aNativeHeap6.b();
	}
}
