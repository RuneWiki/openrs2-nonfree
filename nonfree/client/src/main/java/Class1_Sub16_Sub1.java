import jaclib.memory.heap.NativeHeap;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public final class Class1_Sub16_Sub1 extends Class1_Sub16 {

	@OriginalMember(owner = "client!dc", name = "s", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public final NativeHeap aNativeHeap1;

	@OriginalMember(owner = "client!dc", name = "<init>", descriptor = "(I)V")
	public Class1_Sub16_Sub1(@OriginalArg(0) int arg0) {
		this.aNativeHeap1 = new NativeHeap(arg0);
	}

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "(B)V")
	public void method1349() {
		this.aNativeHeap1.a();
	}
}
