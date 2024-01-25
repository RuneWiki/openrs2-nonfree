import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gr")
public final class Class129_Sub1 extends Class129 implements Interface4 {

	@OriginalMember(owner = "client!gr", name = "G", descriptor = "B")
	private byte aByte62;

	@OriginalMember(owner = "client!gr", name = "<init>", descriptor = "(Lclient!hp;Z)V")
	public Class129_Sub1(@OriginalArg(0) Class134_Sub1_Sub1 arg0, @OriginalArg(1) boolean arg1) {
		super(arg0, 34962, arg1);
	}

	@OriginalMember(owner = "client!gr", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method2466() {
		return super.method7379(super.aClass134_Sub1_Sub1_11.aMapBuffer2);
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(III)Z")
	@Override
	public boolean method2468(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.aByte62 = (byte) arg1;
		super.method7376(arg0);
		return true;
	}

	@OriginalMember(owner = "client!gr", name = "c", descriptor = "(B)I")
	public int method2469() {
		return this.aByte62;
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(IIILclient!jaclib/memory/Source;)Z")
	@Override
	public boolean method2467(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Source arg2) {
		this.aByte62 = (byte) arg1;
		super.method7385(arg0, arg2);
		return true;
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(B)I")
	@Override
	public int method7374() {
		return super.method7374();
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(ZI)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method2465() {
		return super.method7377(super.aClass134_Sub1_Sub1_11.aMapBuffer2);
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(I)V")
	@Override
	public void method7384() {
		super.method7384();
	}
}
