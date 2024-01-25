import jaclib.memory.heap.NativeHeap;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bn")
public final class Class14_Sub7_Sub1 extends Class14_Sub7 {

	@OriginalMember(owner = "client!bn", name = "w", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public final NativeHeap aNativeHeap1;

	@OriginalMember(owner = "client!bn", name = "<init>", descriptor = "(I)V")
	public Class14_Sub7_Sub1(@OriginalArg(0) int arg0) {
		this.aNativeHeap1 = new NativeHeap(arg0);
	}

	@OriginalMember(owner = "client!bn", name = "b", descriptor = "(Z)V")
	public void method1050() {
		this.aNativeHeap1.a();
	}
}
