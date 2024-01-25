import jaclib.memory.heap.NativeHeap;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bca")
public final class Class3_Sub5_Sub1 extends Class3_Sub5 {

	@OriginalMember(owner = "client!bca", name = "s", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public final NativeHeap aNativeHeap1;

	@OriginalMember(owner = "client!bca", name = "<init>", descriptor = "(I)V")
	public Class3_Sub5_Sub1(@OriginalArg(0) int arg0) {
		this.aNativeHeap1 = new NativeHeap(arg0);
	}

	@OriginalMember(owner = "client!bca", name = "c", descriptor = "(I)V")
	public void method595() {
		this.aNativeHeap1.b();
	}
}
