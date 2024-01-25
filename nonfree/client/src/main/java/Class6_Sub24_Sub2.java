import jaclib.memory.heap.NativeHeap;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kp")
public final class Class6_Sub24_Sub2 extends Class6_Sub24 {

	@OriginalMember(owner = "client!kp", name = "n", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public final NativeHeap aNativeHeap2;

	@OriginalMember(owner = "client!kp", name = "<init>", descriptor = "(I)V")
	public Class6_Sub24_Sub2(@OriginalArg(0) int arg0) {
		this.aNativeHeap2 = new NativeHeap(arg0);
	}

	@OriginalMember(owner = "client!kp", name = "b", descriptor = "(I)V")
	public void method3800() {
		this.aNativeHeap2.b();
	}
}
