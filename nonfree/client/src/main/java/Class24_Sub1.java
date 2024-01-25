import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lq")
public final class Class24_Sub1 extends Class24 implements Interface19 {

	@OriginalMember(owner = "client!lq", name = "x", descriptor = "B")
	private byte aByte85;

	@OriginalMember(owner = "client!lq", name = "<init>", descriptor = "(Lclient!nv;Z)V")
	public Class24_Sub1(@OriginalArg(0) Class33_Sub2_Sub1 arg0, @OriginalArg(1) boolean arg1) {
		super(arg0, 34962, arg1);
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(B)I")
	@Override
	public int method8353() {
		return super.method8353();
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(Lclient!jaclib/memory/Source;IBI)Z")
	@Override
	public boolean method6565(@OriginalArg(0) Source arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.aByte85 = (byte) arg2;
		super.method8359(arg1, arg0);
		return true;
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(IBI)Z")
	@Override
	public boolean method6567(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.aByte85 = (byte) arg1;
		super.method8360(arg0);
		return true;
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(ZB)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method6566() {
		return super.method8354(super.aClass33_Sub2_Sub1_11.aMapBuffer2);
	}

	@OriginalMember(owner = "client!lq", name = "b", descriptor = "(B)V")
	@Override
	public void method8358() {
		super.method8358();
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method6568() {
		return super.method8362(super.aClass33_Sub2_Sub1_11.aMapBuffer2);
	}

	@OriginalMember(owner = "client!lq", name = "c", descriptor = "(B)I")
	public int method4752() {
		return this.aByte85;
	}
}
