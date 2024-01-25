import jaclib.memory.heap.NativeHeap;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public final class Class2_Sub31_Sub1 extends Class2_Sub31 {

	@OriginalMember(owner = "client!nb", name = "n", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public final NativeHeap aNativeHeap2;

	@OriginalMember(owner = "client!nb", name = "<init>", descriptor = "(I)V")
	public Class2_Sub31_Sub1(@OriginalArg(0) int arg0) {
		this.aNativeHeap2 = new NativeHeap(arg0);
	}

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "(I)V")
	public void method4951() {
		this.aNativeHeap2.b();
	}
}
