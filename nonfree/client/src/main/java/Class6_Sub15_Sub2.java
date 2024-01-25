import jaclib.memory.heap.NativeHeap;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!op")
public final class Class6_Sub15_Sub2 extends Class6_Sub15 {

	@OriginalMember(owner = "client!op", name = "i", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public final NativeHeap aNativeHeap5;

	@OriginalMember(owner = "client!op", name = "<init>", descriptor = "(I)V")
	public Class6_Sub15_Sub2(@OriginalArg(0) int arg0) {
		this.aNativeHeap5 = new NativeHeap(arg0);
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(B)V")
	public void method5586() {
		this.aNativeHeap5.b();
	}
}
