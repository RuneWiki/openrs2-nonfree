import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public final class Class84_Sub2 extends Class84 implements Interface26 {

	@OriginalMember(owner = "client!va", name = "z", descriptor = "B")
	private byte aByte126;

	@OriginalMember(owner = "client!va", name = "<init>", descriptor = "(Lclient!hl;Z)V")
	public Class84_Sub2(@OriginalArg(0) Class5_Sub2_Sub2 arg0, @OriginalArg(1) boolean arg1) {
		super(arg0, 34962, arg1);
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(B)I")
	public int method8111() {
		return this.aByte126;
	}

	@OriginalMember(owner = "client!va", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method8107() {
		return super.method8106(super.aClass5_Sub2_Sub2_10.aMapBuffer2);
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(III)Z")
	@Override
	public boolean method8109(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.aByte126 = (byte) arg0;
		super.method8101(arg1);
		return true;
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(Z)V")
	@Override
	public void method8104() {
		super.method8104();
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(BIILclient!jaclib/memory/Source;)Z")
	@Override
	public boolean method8108(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Source arg2) {
		this.aByte126 = (byte) arg1;
		super.method8098(arg2, arg0);
		return true;
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(I)I")
	@Override
	public int method8094() {
		return super.method8094();
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(ZB)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method8110() {
		return super.method8095(super.aClass5_Sub2_Sub2_10.aMapBuffer2);
	}
}
