import jaclib.memory.heap.NativeHeap;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!saa")
public final class Class3_Sub19_Sub2 extends Class3_Sub19 {

	@OriginalMember(owner = "client!saa", name = "t", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public final NativeHeap aNativeHeap6;

	@OriginalMember(owner = "client!saa", name = "<init>", descriptor = "(I)V")
	public Class3_Sub19_Sub2(@OriginalArg(0) int arg0) {
		this.aNativeHeap6 = new NativeHeap(arg0);
	}

	@OriginalMember(owner = "client!saa", name = "c", descriptor = "(I)V")
	public void method7211() {
		this.aNativeHeap6.a();
	}
}
