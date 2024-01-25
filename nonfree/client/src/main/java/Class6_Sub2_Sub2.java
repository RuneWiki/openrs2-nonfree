import jaclib.memory.heap.NativeHeap;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ffa")
public final class Class6_Sub2_Sub2 extends Class6_Sub2 {

	@OriginalMember(owner = "client!ffa", name = "q", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public final NativeHeap aNativeHeap3;

	@OriginalMember(owner = "client!ffa", name = "<init>", descriptor = "(I)V")
	public Class6_Sub2_Sub2(@OriginalArg(0) int arg0) {
		this.aNativeHeap3 = new NativeHeap(arg0);
	}

	@OriginalMember(owner = "client!ffa", name = "f", descriptor = "(I)V")
	public void method2367() {
		this.aNativeHeap3.b();
	}
}
