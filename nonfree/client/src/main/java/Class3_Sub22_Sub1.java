import jaclib.memory.heap.NativeHeap;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!io")
public final class Class3_Sub22_Sub1 extends Class3_Sub22 {

	@OriginalMember(owner = "client!io", name = "p", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public final NativeHeap aNativeHeap4;

	@OriginalMember(owner = "client!io", name = "<init>", descriptor = "(I)V")
	public Class3_Sub22_Sub1(@OriginalArg(0) int arg0) {
		this.aNativeHeap4 = new NativeHeap(arg0);
	}

	@OriginalMember(owner = "client!io", name = "f", descriptor = "(I)V")
	public void method3829() {
		this.aNativeHeap4.b();
	}
}
