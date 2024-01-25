import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sw")
public final class Class180_Sub2 extends Class180 implements Interface10 {

	@OriginalMember(owner = "client!sw", name = "G", descriptor = "Lclient!kf;")
	private final Class189 aClass189_19;

	@OriginalMember(owner = "client!sw", name = "<init>", descriptor = "(Lclient!sb;Lclient!kf;Z)V")
	public Class180_Sub2(@OriginalArg(0) Class95_Sub3_Sub2 arg0, @OriginalArg(1) Class189 arg1, @OriginalArg(2) boolean arg2) {
		super(arg0, 34963, arg2);
		this.aClass189_19 = arg1;
	}

	@OriginalMember(owner = "client!sw", name = "a", descriptor = "(Z)V")
	@Override
	public void method7459() {
		super.method7459();
	}

	@OriginalMember(owner = "client!sw", name = "c", descriptor = "(Z)I")
	@Override
	public int method7455() {
		return super.method7455();
	}

	@OriginalMember(owner = "client!sw", name = "b", descriptor = "(Z)Z")
	@Override
	public boolean method7384() {
		return super.method7375(super.aClass95_Sub3_Sub2_11.aMapBuffer1);
	}

	@OriginalMember(owner = "client!sw", name = "a", descriptor = "(ZI)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method7385() {
		return super.method7383(super.aClass95_Sub3_Sub2_11.aMapBuffer1);
	}

	@OriginalMember(owner = "client!sw", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7382(@OriginalArg(0) int arg0) {
		super.method7382(this.aClass189_19.anInt4729 * arg0);
	}

	@OriginalMember(owner = "client!sw", name = "a", descriptor = "(I)Lclient!kf;")
	@Override
	public Class189 method7386() {
		return this.aClass189_19;
	}
}
