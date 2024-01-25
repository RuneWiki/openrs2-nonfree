import jaclib.memory.heap.NativeHeap;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public final class Class6_Sub15_Sub1 extends Class6_Sub15 {

	@OriginalMember(owner = "client!eh", name = "l", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public final NativeHeap aNativeHeap1;

	@OriginalMember(owner = "client!eh", name = "<init>", descriptor = "(I)V")
	public Class6_Sub15_Sub1(@OriginalArg(0) int arg0) {
		this.aNativeHeap1 = new NativeHeap(arg0);
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(B)V")
	public void method2005() {
		this.aNativeHeap1.b();
	}
}
