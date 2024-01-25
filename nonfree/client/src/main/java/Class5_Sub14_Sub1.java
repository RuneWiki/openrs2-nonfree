import jaclib.memory.heap.NativeHeap;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public final class Class5_Sub14_Sub1 extends Class5_Sub14 {

	@OriginalMember(owner = "client!di", name = "t", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public final NativeHeap aNativeHeap4;

	@OriginalMember(owner = "client!di", name = "<init>", descriptor = "(I)V")
	public Class5_Sub14_Sub1(@OriginalArg(0) int arg0) {
		this.aNativeHeap4 = new NativeHeap(arg0);
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(I)V")
	public void method2081() {
		this.aNativeHeap4.a();
	}
}
