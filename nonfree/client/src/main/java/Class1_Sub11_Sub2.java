import jaclib.memory.heap.NativeHeap;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qda")
public final class Class1_Sub11_Sub2 extends Class1_Sub11 {

	@OriginalMember(owner = "client!qda", name = "p", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public final NativeHeap aNativeHeap5;

	@OriginalMember(owner = "client!qda", name = "<init>", descriptor = "(I)V")
	public Class1_Sub11_Sub2(@OriginalArg(0) int arg0) {
		this.aNativeHeap5 = new NativeHeap(arg0);
	}

	@OriginalMember(owner = "client!qda", name = "b", descriptor = "(I)V")
	public void method5953() {
		this.aNativeHeap5.a();
	}
}
