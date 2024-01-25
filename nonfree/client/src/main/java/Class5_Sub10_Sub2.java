import jaclib.memory.heap.NativeHeap;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public final class Class5_Sub10_Sub2 extends Class5_Sub10 {

	@OriginalMember(owner = "client!jj", name = "n", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public final NativeHeap aNativeHeap3;

	@OriginalMember(owner = "client!jj", name = "<init>", descriptor = "(I)V")
	public Class5_Sub10_Sub2(@OriginalArg(0) int arg0) {
		this.aNativeHeap3 = new NativeHeap(arg0);
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(I)V")
	public void method4128() {
		this.aNativeHeap3.a();
	}
}
