import jaclib.memory.heap.NativeHeap;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public final class Class3_Sub22_Sub2 extends Class3_Sub22 {

	@OriginalMember(owner = "client!re", name = "p", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public final NativeHeap aNativeHeap6;

	@OriginalMember(owner = "client!re", name = "<init>", descriptor = "(I)V")
	public Class3_Sub22_Sub2(@OriginalArg(0) int arg0) {
		this.aNativeHeap6 = new NativeHeap(arg0);
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(I)V")
	public void method6465() {
		this.aNativeHeap6.b();
	}
}
