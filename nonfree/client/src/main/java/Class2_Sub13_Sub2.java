import jaclib.memory.heap.NativeHeap;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public final class Class2_Sub13_Sub2 extends Class2_Sub13 {

	@OriginalMember(owner = "client!ob", name = "v", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public final NativeHeap aNativeHeap5;

	@OriginalMember(owner = "client!ob", name = "<init>", descriptor = "(I)V")
	public Class2_Sub13_Sub2(@OriginalArg(0) int arg0) {
		this.aNativeHeap5 = new NativeHeap(arg0);
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(I)V")
	public void method5545() {
		this.aNativeHeap5.b();
	}
}
