import jaclib.memory.heap.NativeHeap;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public final class Class3_Sub17_Sub2 extends Class3_Sub17 {

	@OriginalMember(owner = "client!nf", name = "s", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public final NativeHeap aNativeHeap6;

	@OriginalMember(owner = "client!nf", name = "<init>", descriptor = "(I)V")
	public Class3_Sub17_Sub2(@OriginalArg(0) int arg0) {
		this.aNativeHeap6 = new NativeHeap(arg0);
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(I)V")
	public void method6207() {
		this.aNativeHeap6.b();
	}
}
