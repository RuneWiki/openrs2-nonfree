import jaclib.memory.heap.NativeHeap;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public final class Class2_Sub12_Sub1 extends Class2_Sub12 {

	@OriginalMember(owner = "client!gg", name = "l", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public final NativeHeap aNativeHeap1;

	@OriginalMember(owner = "client!gg", name = "<init>", descriptor = "(I)V")
	public Class2_Sub12_Sub1(@OriginalArg(0) int arg0) {
		this.aNativeHeap1 = new NativeHeap(arg0);
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(Z)V")
	public void method2218() {
		this.aNativeHeap1.b();
	}
}
