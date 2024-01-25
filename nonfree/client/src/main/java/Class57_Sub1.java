import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public final class Class57_Sub1 extends Class57 implements Interface6 {

	@OriginalMember(owner = "client!hg", name = "E", descriptor = "B")
	private byte aByte43;

	@OriginalMember(owner = "client!hg", name = "<init>", descriptor = "(Lclient!og;Z)V")
	public Class57_Sub1(@OriginalArg(0) Class143_Sub1_Sub2 arg0, @OriginalArg(1) boolean arg1) {
		super(arg0, 34962, arg1);
	}

	@OriginalMember(owner = "client!hg", name = "c", descriptor = "(B)I")
	@Override
	public int method7861() {
		return super.method7861();
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(I)I")
	public int method3125() {
		return this.aByte43;
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(III)Z")
	@Override
	public boolean method3123(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aByte43 = (byte) arg1;
		super.method7863(arg0);
		return true;
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(IZ)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method3120() {
		return super.method7643(super.aClass143_Sub1_Sub2_11.aMapBuffer2);
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(B)V")
	@Override
	public void method7866() {
		super.method7866();
	}

	@OriginalMember(owner = "client!hg", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method3121() {
		return super.method7642(super.aClass143_Sub1_Sub2_11.aMapBuffer2);
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(IIILclient!jaclib/memory/Source;)Z")
	@Override
	public boolean method3122(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Source arg2) {
		this.aByte43 = (byte) arg0;
		super.method7641(arg1, arg2);
		return true;
	}
}
