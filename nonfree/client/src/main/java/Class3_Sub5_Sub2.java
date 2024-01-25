import jaclib.memory.heap.NativeHeap;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public final class Class3_Sub5_Sub2 extends Class3_Sub5 {

	@OriginalMember(owner = "client!gb", name = "v", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public final NativeHeap aNativeHeap6;

	@OriginalMember(owner = "client!gb", name = "<init>", descriptor = "(I)V")
	public Class3_Sub5_Sub2(@OriginalArg(0) int arg0) {
		this.aNativeHeap6 = new NativeHeap(arg0);
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(B)V")
	public void method3544() {
		this.aNativeHeap6.b();
	}
}
