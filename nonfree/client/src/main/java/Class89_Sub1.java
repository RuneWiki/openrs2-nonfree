import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public final class Class89_Sub1 extends Class89 implements Interface10 {

	@OriginalMember(owner = "client!jh", name = "G", descriptor = "B")
	private byte aByte82;

	@OriginalMember(owner = "client!jh", name = "<init>", descriptor = "(Lclient!ko;Z)V")
	public Class89_Sub1(@OriginalArg(0) Class137_Sub1_Sub1 arg0, @OriginalArg(1) boolean arg1) {
		super(arg0, 34962, arg1);
	}

	@OriginalMember(owner = "client!jh", name = "b", descriptor = "(B)V")
	@Override
	public void method5675() {
		super.method5675();
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method3995() {
		return super.method5674(super.aClass137_Sub1_Sub1_8.aMapBuffer2);
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(IIZ)Z")
	@Override
	public boolean method3994(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aByte82 = (byte) arg1;
		super.method5678(arg0);
		return true;
	}

	@OriginalMember(owner = "client!jh", name = "b", descriptor = "(I)I")
	@Override
	public int method5669() {
		return super.method5669();
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(BZ)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method3996() {
		return super.method5676(super.aClass137_Sub1_Sub1_8.aMapBuffer2);
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(B)I")
	public int method3997() {
		return this.aByte82;
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(IILclient!jaclib/memory/Source;I)Z")
	@Override
	public boolean method3993(@OriginalArg(0) int arg0, @OriginalArg(2) Source arg1, @OriginalArg(3) int arg2) {
		this.aByte82 = (byte) arg0;
		super.method5672(arg1, arg2);
		return true;
	}
}
