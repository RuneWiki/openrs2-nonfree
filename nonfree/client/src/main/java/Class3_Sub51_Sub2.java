import jaclib.memory.heap.NativeHeap;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wr")
public final class Class3_Sub51_Sub2 extends Class3_Sub51 {

	@OriginalMember(owner = "client!wr", name = "o", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public final NativeHeap aNativeHeap6;

	@OriginalMember(owner = "client!wr", name = "<init>", descriptor = "(I)V")
	public Class3_Sub51_Sub2(@OriginalArg(0) int arg0) {
		this.aNativeHeap6 = new NativeHeap(arg0);
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(B)V")
	public void method8985() {
		this.aNativeHeap6.b();
	}
}
