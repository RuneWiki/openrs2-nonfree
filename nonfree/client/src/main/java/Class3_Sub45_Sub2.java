import jaclib.memory.heap.NativeHeap;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tq")
public final class Class3_Sub45_Sub2 extends Class3_Sub45 {

	@OriginalMember(owner = "client!tq", name = "o", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public final NativeHeap aNativeHeap6;

	@OriginalMember(owner = "client!tq", name = "<init>", descriptor = "(I)V")
	public Class3_Sub45_Sub2(@OriginalArg(0) int arg0) {
		this.aNativeHeap6 = new NativeHeap(arg0);
	}

	@OriginalMember(owner = "client!tq", name = "b", descriptor = "(I)V")
	public void method7879() {
		this.aNativeHeap6.b();
	}
}
