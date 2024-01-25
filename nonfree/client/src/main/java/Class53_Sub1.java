import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public final class Class53_Sub1 extends Class53 implements Interface16 {

	@OriginalMember(owner = "client!og", name = "C", descriptor = "B")
	private byte aByte96;

	@OriginalMember(owner = "client!og", name = "<init>", descriptor = "(Lclient!oia;Z)V")
	public Class53_Sub1(@OriginalArg(0) Class16_Sub1_Sub2 arg0, @OriginalArg(1) boolean arg1) {
		super(arg0, 34962, arg1);
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(ZI)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method6041() {
		return super.method7729(super.aClass16_Sub1_Sub2_10.aMapBuffer2);
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(I)V")
	@Override
	public void method7731() {
		super.method7731();
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(BII)Z")
	@Override
	public boolean method6040(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.aByte96 = (byte) arg1;
		super.method7734(arg0);
		return true;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method6039() {
		return super.method7736(super.aClass16_Sub1_Sub2_10.aMapBuffer2);
	}

	@OriginalMember(owner = "client!og", name = "c", descriptor = "(I)I")
	public int method6046() {
		return this.aByte96;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(ILclient!jaclib/memory/Source;II)Z")
	@Override
	public boolean method6038(@OriginalArg(1) Source arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.aByte96 = (byte) arg1;
		super.method7732(arg2, arg0);
		return true;
	}

	@OriginalMember(owner = "client!og", name = "b", descriptor = "(B)I")
	@Override
	public int method7727() {
		return super.method7727();
	}
}
