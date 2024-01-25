import jaclib.memory.heap.NativeHeap;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nha")
public final class Class3_Sub14_Sub2 extends Class3_Sub14 {

	@OriginalMember(owner = "client!nha", name = "n", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public final NativeHeap aNativeHeap5;

	@OriginalMember(owner = "client!nha", name = "<init>", descriptor = "(I)V")
	public Class3_Sub14_Sub2(@OriginalArg(0) int arg0) {
		this.aNativeHeap5 = new NativeHeap(arg0);
	}

	@OriginalMember(owner = "client!nha", name = "a", descriptor = "(B)V")
	public void method5700() {
		this.aNativeHeap5.b();
	}
}
