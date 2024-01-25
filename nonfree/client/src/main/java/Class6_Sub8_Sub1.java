import jaclib.memory.heap.NativeHeap;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cja")
public final class Class6_Sub8_Sub1 extends Class6_Sub8 {

	@OriginalMember(owner = "client!cja", name = "r", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public final NativeHeap aNativeHeap1;

	@OriginalMember(owner = "client!cja", name = "<init>", descriptor = "(I)V")
	public Class6_Sub8_Sub1(@OriginalArg(0) int arg0) {
		this.aNativeHeap1 = new NativeHeap(arg0);
	}

	@OriginalMember(owner = "client!cja", name = "a", descriptor = "(B)V")
	public void method1313() {
		this.aNativeHeap1.a();
	}
}
