import jaclib.memory.heap.NativeHeap;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uv")
public final class Class2_Sub40_Sub2 extends Class2_Sub40 {

	@OriginalMember(owner = "client!uv", name = "u", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public final NativeHeap aNativeHeap6;

	@OriginalMember(owner = "client!uv", name = "<init>", descriptor = "(I)V")
	public Class2_Sub40_Sub2(@OriginalArg(0) int arg0) {
		this.aNativeHeap6 = new NativeHeap(arg0);
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(B)V")
	public void method8402() {
		this.aNativeHeap6.b();
	}
}
