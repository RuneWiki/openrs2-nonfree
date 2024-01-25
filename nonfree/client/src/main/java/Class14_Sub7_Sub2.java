import jaclib.memory.heap.NativeHeap;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cr")
public final class Class14_Sub7_Sub2 extends Class14_Sub7 {

	@OriginalMember(owner = "client!cr", name = "y", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public final NativeHeap aNativeHeap2;

	@OriginalMember(owner = "client!cr", name = "<init>", descriptor = "(I)V")
	public Class14_Sub7_Sub2(@OriginalArg(0) int arg0) {
		this.aNativeHeap2 = new NativeHeap(arg0);
	}

	@OriginalMember(owner = "client!cr", name = "b", descriptor = "(Z)V")
	public void method1550() {
		this.aNativeHeap2.a();
	}
}
