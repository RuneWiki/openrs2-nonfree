import jaggl.memory.NativeHeap;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public final class Class1_Sub23_Sub1 extends Class1_Sub23 {

	@OriginalMember(owner = "client!ua", name = "s", descriptor = "Lclient!jaggl/memory/NativeHeap;")
	public final NativeHeap aNativeHeap2;

	@OriginalMember(owner = "client!ua", name = "<init>", descriptor = "(I)V")
	public Class1_Sub23_Sub1(@OriginalArg(0) int arg0) {
		this.aNativeHeap2 = new NativeHeap(arg0);
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(I)V")
	public void method5418() {
		this.aNativeHeap2.b();
	}
}
