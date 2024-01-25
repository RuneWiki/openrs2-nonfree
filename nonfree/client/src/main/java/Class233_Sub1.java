import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public final class Class233_Sub1 extends Class233 implements Interface15 {

	@OriginalMember(owner = "client!ni", name = "L", descriptor = "B")
	private byte aByte91;

	@OriginalMember(owner = "client!ni", name = "<init>", descriptor = "(Lclient!sha;Z)V")
	public Class233_Sub1(@OriginalArg(0) Class95_Sub1_Sub1 arg0, @OriginalArg(1) boolean arg1) {
		super(arg0, 34962, arg1);
	}

	@OriginalMember(owner = "client!ni", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method5528() {
		return super.method6260(super.aClass95_Sub1_Sub1_10.aMapBuffer2);
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(ZILclient!jaclib/memory/Source;I)Z")
	@Override
	public boolean method5527(@OriginalArg(1) int arg0, @OriginalArg(2) Source arg1, @OriginalArg(3) int arg2) {
		this.aByte91 = (byte) arg0;
		super.method6261(arg1, arg2);
		return true;
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(I)I")
	@Override
	public int method7404() {
		return super.method7404();
	}

	@OriginalMember(owner = "client!ni", name = "c", descriptor = "(I)V")
	@Override
	public void method7409() {
		super.method7409();
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(ZZ)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method5529() {
		return super.method6255(super.aClass95_Sub1_Sub1_10.aMapBuffer2);
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(III)Z")
	@Override
	public boolean method5530(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.aByte91 = (byte) arg1;
		super.method7408(arg0);
		return true;
	}

	@OriginalMember(owner = "client!ni", name = "d", descriptor = "(B)I")
	public int method5535() {
		return this.aByte91;
	}
}
