import jaggl.memory.NativeHeap;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public final class Class1_Sub27_Sub1 extends Class1_Sub27 {

	@OriginalMember(owner = "client!wc", name = "v", descriptor = "Lclient!jaggl/memory/NativeHeap;")
	public final NativeHeap aNativeHeap2;

	@OriginalMember(owner = "client!wc", name = "<init>", descriptor = "(I)V")
	public Class1_Sub27_Sub1(@OriginalArg(0) int arg0) {
		this.aNativeHeap2 = new NativeHeap(arg0);
	}

	@OriginalMember(owner = "client!wc", name = "f", descriptor = "(I)V")
	public void method5888() {
		this.aNativeHeap2.b();
	}
}
