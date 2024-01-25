import jaclib.memory.heap.NativeHeap;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public final class Class1_Sub16_Sub1 extends Class1_Sub16 {

	@OriginalMember(owner = "client!fc", name = "r", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public final NativeHeap aNativeHeap3;

	@OriginalMember(owner = "client!fc", name = "<init>", descriptor = "(I)V")
	public Class1_Sub16_Sub1(@OriginalArg(0) int arg0) {
		this.aNativeHeap3 = new NativeHeap(arg0);
	}

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "(I)V")
	public void method2790() {
		this.aNativeHeap3.b();
	}
}
