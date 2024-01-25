import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ir")
public final class Class72_Sub1 extends Class72 implements Interface12 {

	@OriginalMember(owner = "client!ir", name = "B", descriptor = "B")
	private byte aByte78;

	@OriginalMember(owner = "client!ir", name = "<init>", descriptor = "(Lclient!oaa;Z)V")
	public Class72_Sub1(@OriginalArg(0) Class132_Sub1_Sub1 arg0, @OriginalArg(1) boolean arg1) {
		super(arg0, 34962, arg1);
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(ZZ)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method8888() {
		return super.method5799(super.aClass132_Sub1_Sub1_9.aMapBuffer2);
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(IIZ)Z")
	@Override
	public boolean method8889(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aByte78 = (byte) arg1;
		super.method5800(arg0);
		return true;
	}

	@OriginalMember(owner = "client!ir", name = "b", descriptor = "(I)V")
	@Override
	public void method8887() {
		super.method8887();
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(I)I")
	@Override
	public int method8886() {
		return super.method8886();
	}

	@OriginalMember(owner = "client!ir", name = "h", descriptor = "(I)I")
	public int method3752() {
		return this.aByte78;
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(BILclient!jaclib/memory/Source;I)Z")
	@Override
	public boolean method8890(@OriginalArg(1) int arg0, @OriginalArg(2) Source arg1, @OriginalArg(3) int arg2) {
		this.aByte78 = (byte) arg0;
		super.method5796(arg2, arg1);
		return true;
	}

	@OriginalMember(owner = "client!ir", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method8891() {
		return super.method5797(super.aClass132_Sub1_Sub1_9.aMapBuffer2);
	}
}
