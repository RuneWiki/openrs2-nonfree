import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gt")
public final class Class132_Sub1 extends Class132 implements Interface1 {

	@OriginalMember(owner = "client!gt", name = "E", descriptor = "B")
	private byte aByte75;

	@OriginalMember(owner = "client!gt", name = "<init>", descriptor = "(Lclient!laa;Z)V")
	public Class132_Sub1(@OriginalArg(0) Class126_Sub2_Sub1 arg0, @OriginalArg(1) boolean arg1) {
		super(arg0, 34962, arg1);
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7717() {
		return super.method5104(super.aClass126_Sub2_Sub1_9.aMapBuffer2);
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(ILclient!jaclib/memory/Source;II)Z")
	@Override
	public boolean method7718(@OriginalArg(0) int arg0, @OriginalArg(1) Source arg1, @OriginalArg(3) int arg2) {
		this.aByte75 = (byte) arg2;
		super.method5112(arg0, arg1);
		return true;
	}

	@OriginalMember(owner = "client!gt", name = "b", descriptor = "(I)I")
	@Override
	public int method7713() {
		return super.method7713();
	}

	@OriginalMember(owner = "client!gt", name = "d", descriptor = "(B)I")
	public int method3115() {
		return this.aByte75;
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(III)Z")
	@Override
	public boolean method7715(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.aByte75 = (byte) arg0;
		super.method5732(arg1);
		return true;
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(Z)V")
	@Override
	public void method7716() {
		super.method7716();
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(IZ)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method7714() {
		return super.method5106(super.aClass126_Sub2_Sub1_9.aMapBuffer2);
	}
}
