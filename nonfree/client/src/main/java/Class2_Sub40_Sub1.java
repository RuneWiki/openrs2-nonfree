import jaclib.memory.heap.NativeHeap;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sea")
public final class Class2_Sub40_Sub1 extends Class2_Sub40 {

	@OriginalMember(owner = "client!sea", name = "x", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public final NativeHeap aNativeHeap3;

	@OriginalMember(owner = "client!sea", name = "<init>", descriptor = "(I)V")
	public Class2_Sub40_Sub1(@OriginalArg(0) int arg0) {
		this.aNativeHeap3 = new NativeHeap(arg0);
	}

	@OriginalMember(owner = "client!sea", name = "a", descriptor = "(B)V")
	public void method7227() {
		this.aNativeHeap3.b();
	}
}
