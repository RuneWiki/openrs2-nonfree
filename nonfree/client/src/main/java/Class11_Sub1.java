import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oba")
public final class Class11_Sub1 extends Class11 implements Interface15 {

	@OriginalMember(owner = "client!oba", name = "w", descriptor = "B")
	private byte aByte91;

	@OriginalMember(owner = "client!oba", name = "<init>", descriptor = "(Lclient!bea;Z)V")
	public Class11_Sub1(@OriginalArg(0) Class31_Sub1_Sub1 arg0, @OriginalArg(1) boolean arg1) {
		super(arg0, 34962, arg1);
	}

	@OriginalMember(owner = "client!oba", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method5276() {
		return super.method7281(super.aClass31_Sub1_Sub1_12.aMapBuffer2);
	}

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(Lclient!jaclib/memory/Source;III)Z")
	@Override
	public boolean method5278(@OriginalArg(0) Source arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.aByte91 = (byte) arg1;
		super.method7287(arg0, arg2);
		return true;
	}

	@OriginalMember(owner = "client!oba", name = "d", descriptor = "(I)I")
	@Override
	public int method7278() {
		return super.method7278();
	}

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(I)V")
	@Override
	public void method7285() {
		super.method7285();
	}

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(BII)Z")
	@Override
	public boolean method5277(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.aByte91 = (byte) arg1;
		super.method7282(arg0);
		return true;
	}

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(ZZ)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method5275() {
		return super.method7283(super.aClass31_Sub1_Sub1_12.aMapBuffer2);
	}

	@OriginalMember(owner = "client!oba", name = "c", descriptor = "(I)I")
	public int method5280() {
		return this.aByte91;
	}
}
