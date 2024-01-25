import jaclib.memory.heap.NativeHeap;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public final class Class6_Sub20_Sub1 extends Class6_Sub20 {

	@OriginalMember(owner = "client!fh", name = "u", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public final NativeHeap aNativeHeap1;

	@OriginalMember(owner = "client!fh", name = "<init>", descriptor = "(I)V")
	public Class6_Sub20_Sub1(@OriginalArg(0) int arg0) {
		this.aNativeHeap1 = new NativeHeap(arg0);
	}

	@OriginalMember(owner = "client!fh", name = "b", descriptor = "(I)V")
	public void method2213() {
		this.aNativeHeap1.a();
	}
}
