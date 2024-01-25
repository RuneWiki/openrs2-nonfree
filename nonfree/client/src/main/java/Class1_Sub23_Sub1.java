import jaclib.memory.heap.NativeHeap;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jba")
public final class Class1_Sub23_Sub1 extends Class1_Sub23 {

	@OriginalMember(owner = "client!jba", name = "u", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public final NativeHeap aNativeHeap3;

	@OriginalMember(owner = "client!jba", name = "<init>", descriptor = "(I)V")
	public Class1_Sub23_Sub1(@OriginalArg(0) int arg0) {
		this.aNativeHeap3 = new NativeHeap(arg0);
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(I)V")
	public void method4009() {
		this.aNativeHeap3.a();
	}
}
