import jaclib.memory.heap.NativeHeap;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public final class Class2_Sub28_Sub1 extends Class2_Sub28 {

	@OriginalMember(owner = "client!gf", name = "u", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public final NativeHeap aNativeHeap1;

	@OriginalMember(owner = "client!gf", name = "<init>", descriptor = "(I)V")
	public Class2_Sub28_Sub1(@OriginalArg(0) int arg0) {
		this.aNativeHeap1 = new NativeHeap(arg0);
	}

	@OriginalMember(owner = "client!gf", name = "f", descriptor = "(I)V")
	public void method2849() {
		this.aNativeHeap1.b();
	}
}
