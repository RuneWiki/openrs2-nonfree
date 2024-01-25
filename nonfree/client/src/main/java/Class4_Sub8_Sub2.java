import jaclib.memory.heap.NativeHeap;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public final class Class4_Sub8_Sub2 extends Class4_Sub8 {

	@OriginalMember(owner = "client!ui", name = "w", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public final NativeHeap aNativeHeap6;

	@OriginalMember(owner = "client!ui", name = "<init>", descriptor = "(I)V")
	public Class4_Sub8_Sub2(@OriginalArg(0) int arg0) {
		this.aNativeHeap6 = new NativeHeap(arg0);
	}

	@OriginalMember(owner = "client!ui", name = "b", descriptor = "(Z)V")
	public void method7518() {
		this.aNativeHeap6.b();
	}
}
