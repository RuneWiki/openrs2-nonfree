import jaclib.memory.heap.NativeHeap;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lda")
public final class Class5_Sub29_Sub1 extends Class5_Sub29 {

	@OriginalMember(owner = "client!lda", name = "t", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public final NativeHeap aNativeHeap4;

	@OriginalMember(owner = "client!lda", name = "<init>", descriptor = "(I)V")
	public Class5_Sub29_Sub1(@OriginalArg(0) int arg0) {
		this.aNativeHeap4 = new NativeHeap(arg0);
	}

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "(Z)V")
	public void method4543() {
		this.aNativeHeap4.a();
	}
}
