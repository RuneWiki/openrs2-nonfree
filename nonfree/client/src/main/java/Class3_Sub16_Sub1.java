import jaclib.memory.heap.NativeHeap;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public final class Class3_Sub16_Sub1 extends Class3_Sub16 {

	@OriginalMember(owner = "client!ck", name = "n", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public final NativeHeap aNativeHeap2;

	@OriginalMember(owner = "client!ck", name = "<init>", descriptor = "(I)V")
	public Class3_Sub16_Sub1(@OriginalArg(0) int arg0) {
		this.aNativeHeap2 = new NativeHeap(arg0);
	}

	@OriginalMember(owner = "client!ck", name = "b", descriptor = "(B)V")
	public void method1780() {
		this.aNativeHeap2.a();
	}
}
