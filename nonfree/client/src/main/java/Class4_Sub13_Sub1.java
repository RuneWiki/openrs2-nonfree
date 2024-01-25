import jaclib.memory.heap.NativeHeap;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dca")
public final class Class4_Sub13_Sub1 extends Class4_Sub13 {

	@OriginalMember(owner = "client!dca", name = "n", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public final NativeHeap aNativeHeap1;

	@OriginalMember(owner = "client!dca", name = "<init>", descriptor = "(I)V")
	public Class4_Sub13_Sub1(@OriginalArg(0) int arg0) {
		this.aNativeHeap1 = new NativeHeap(arg0);
	}

	@OriginalMember(owner = "client!dca", name = "b", descriptor = "(I)V")
	public void method1789() {
		this.aNativeHeap1.a();
	}
}
