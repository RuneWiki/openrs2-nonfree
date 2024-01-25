import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ps")
public final class Class57_Sub1 extends Class57 implements Interface10 {

	@OriginalMember(owner = "client!ps", name = "<init>", descriptor = "(Lclient!pi;Z)V")
	public Class57_Sub1(@OriginalArg(0) Class42_Sub1_Sub2 arg0, @OriginalArg(1) boolean arg1) {
		super(arg0, 34962, arg1);
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(ZI)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method7895() {
		return super.method7895();
	}

	@OriginalMember(owner = "client!ps", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method7899() {
		return this.method7899();
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(IIILclient!jaclib/memory/Source;)Z")
	@Override
	public boolean method7896(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Source arg2) {
		super.method7536(arg1, arg2);
		return true;
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(B)V")
	@Override
	public void method7898() {
		super.method7898();
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(III)Z")
	@Override
	public boolean method7897(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		super.method7529(arg1);
		return true;
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(I)I")
	@Override
	public int method7894() {
		return super.method7894();
	}
}
