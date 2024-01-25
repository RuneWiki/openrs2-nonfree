import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!naa")
public final class Class89_Sub2 extends Class89 implements Interface4 {

	@OriginalMember(owner = "client!naa", name = "B", descriptor = "Lclient!bja;")
	private final Class36 aClass36_15;

	@OriginalMember(owner = "client!naa", name = "<init>", descriptor = "(Lclient!ko;Lclient!bja;Z)V")
	public Class89_Sub2(@OriginalArg(0) Class137_Sub1_Sub1 arg0, @OriginalArg(1) Class36 arg1, @OriginalArg(2) boolean arg2) {
		super(arg0, 34963, arg2);
		this.aClass36_15 = arg1;
	}

	@OriginalMember(owner = "client!naa", name = "b", descriptor = "(I)I")
	@Override
	public int method5669() {
		return super.method5669();
	}

	@OriginalMember(owner = "client!naa", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method5682() {
		return super.method5674(super.aClass137_Sub1_Sub1_8.aMapBuffer1);
	}

	@OriginalMember(owner = "client!naa", name = "b", descriptor = "(B)V")
	@Override
	public void method5675() {
		super.method5675();
	}

	@OriginalMember(owner = "client!naa", name = "a", descriptor = "(B)Lclient!bja;")
	@Override
	public Class36 method5681() {
		return this.aClass36_15;
	}

	@OriginalMember(owner = "client!naa", name = "a", descriptor = "(II)V")
	@Override
	public void method5678(@OriginalArg(0) int arg0) {
		super.method5678(this.aClass36_15.anInt1130 * arg0);
	}

	@OriginalMember(owner = "client!naa", name = "a", descriptor = "(BZ)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method5680() {
		return super.method5676(super.aClass137_Sub1_Sub1_8.aMapBuffer1);
	}
}
