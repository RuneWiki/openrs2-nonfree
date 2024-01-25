import jaclib.memory.heap.NativeHeap;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wm")
public final class Class4_Sub13_Sub2 extends Class4_Sub13 {

	@OriginalMember(owner = "client!wm", name = "t", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public final NativeHeap aNativeHeap6;

	@OriginalMember(owner = "client!wm", name = "<init>", descriptor = "(I)V")
	public Class4_Sub13_Sub2(@OriginalArg(0) int arg0) {
		this.aNativeHeap6 = new NativeHeap(arg0);
	}

	@OriginalMember(owner = "client!wm", name = "b", descriptor = "(Z)V")
	public void method8923() {
		this.aNativeHeap6.a();
	}
}
