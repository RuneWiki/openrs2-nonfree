import jaclib.memory.heap.NativeHeap;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kq")
public final class Class14_Sub16_Sub2 extends Class14_Sub16 {

	@OriginalMember(owner = "client!kq", name = "t", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public final NativeHeap aNativeHeap4;

	@OriginalMember(owner = "client!kq", name = "<init>", descriptor = "(I)V")
	public Class14_Sub16_Sub2(@OriginalArg(0) int arg0) {
		this.aNativeHeap4 = new NativeHeap(arg0);
	}

	@OriginalMember(owner = "client!kq", name = "b", descriptor = "(B)V")
	public void method5094() {
		this.aNativeHeap4.a();
	}
}
