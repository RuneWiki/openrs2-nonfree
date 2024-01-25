import jaclib.memory.heap.NativeHeap;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ll")
public final class Class2_Sub28_Sub2 extends Class2_Sub28 {

	@OriginalMember(owner = "client!ll", name = "u", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public final NativeHeap aNativeHeap3;

	@OriginalMember(owner = "client!ll", name = "<init>", descriptor = "(I)V")
	public Class2_Sub28_Sub2(@OriginalArg(0) int arg0) {
		this.aNativeHeap3 = new NativeHeap(arg0);
	}

	@OriginalMember(owner = "client!ll", name = "b", descriptor = "(I)V")
	public void method5297() {
		this.aNativeHeap3.b();
	}
}
