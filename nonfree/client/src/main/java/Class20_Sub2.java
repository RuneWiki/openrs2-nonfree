import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ls")
public final class Class20_Sub2 extends Class20 implements Interface19 {

	@OriginalMember(owner = "client!ls", name = "x", descriptor = "B")
	private byte aByte57;

	@OriginalMember(owner = "client!ls", name = "<init>", descriptor = "(Lclient!mr;Z)V")
	public Class20_Sub2(@OriginalArg(0) Class45_Sub2_Sub2 arg0, @OriginalArg(1) boolean arg1) {
		super(arg0, 34962, arg1);
	}

	@OriginalMember(owner = "client!ls", name = "b", descriptor = "(B)V")
	@Override
	public void method6436() {
		super.method6436();
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(ZZ)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method6252() {
		return super.method4582(super.aClass45_Sub2_Sub2_9.aMapBuffer2);
	}

	@OriginalMember(owner = "client!ls", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method6251() {
		return super.method4577(super.aClass45_Sub2_Sub2_9.aMapBuffer2);
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(B)I")
	public int method4596() {
		return this.aByte57;
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(IILclient!jaclib/memory/Source;I)Z")
	@Override
	public boolean method6254(@OriginalArg(1) int arg0, @OriginalArg(2) Source arg1, @OriginalArg(3) int arg2) {
		this.aByte57 = (byte) arg0;
		super.method4578(arg1, arg2);
		return true;
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(I)I")
	@Override
	public int method6432() {
		return super.method6432();
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(IIB)Z")
	@Override
	public boolean method6255(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aByte57 = (byte) arg1;
		super.method6435(arg0);
		return true;
	}
}
