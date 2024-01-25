import jaclib.memory.heap.NativeHeap;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public final class Class3_Sub16_Sub2 extends Class3_Sub16 {

	@OriginalMember(owner = "client!tg", name = "t", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public final NativeHeap aNativeHeap4;

	@OriginalMember(owner = "client!tg", name = "<init>", descriptor = "(I)V")
	public Class3_Sub16_Sub2(@OriginalArg(0) int arg0) {
		this.aNativeHeap4 = new NativeHeap(arg0);
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(I)V")
	public void method7941() {
		this.aNativeHeap4.a();
	}
}
