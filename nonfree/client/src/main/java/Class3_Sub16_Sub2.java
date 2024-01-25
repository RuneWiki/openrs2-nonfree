import jaclib.memory.heap.NativeHeap;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wv")
public final class Class3_Sub16_Sub2 extends Class3_Sub16 {

	@OriginalMember(owner = "client!wv", name = "m", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public final NativeHeap aNativeHeap6;

	@OriginalMember(owner = "client!wv", name = "<init>", descriptor = "(I)V")
	public Class3_Sub16_Sub2(@OriginalArg(0) int arg0) {
		this.aNativeHeap6 = new NativeHeap(arg0);
	}

	@OriginalMember(owner = "client!wv", name = "b", descriptor = "(B)V")
	public void method7817() {
		this.aNativeHeap6.a();
	}
}
