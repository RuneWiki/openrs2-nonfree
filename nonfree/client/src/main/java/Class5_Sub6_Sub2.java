import jaclib.memory.heap.NativeHeap;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vw")
public final class Class5_Sub6_Sub2 extends Class5_Sub6 {

	@OriginalMember(owner = "client!vw", name = "r", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public final NativeHeap aNativeHeap6;

	@OriginalMember(owner = "client!vw", name = "<init>", descriptor = "(I)V")
	public Class5_Sub6_Sub2(@OriginalArg(0) int arg0) {
		this.aNativeHeap6 = new NativeHeap(arg0);
	}

	@OriginalMember(owner = "client!vw", name = "a", descriptor = "(Z)V")
	public void method8757() {
		this.aNativeHeap6.b();
	}
}
