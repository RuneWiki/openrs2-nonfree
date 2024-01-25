import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public final class Class84_Sub1 extends Class84 implements Interface27 {

	@OriginalMember(owner = "client!ud", name = "F", descriptor = "Lclient!kq;")
	private final Class176 aClass176_17;

	@OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(Lclient!hl;Lclient!kq;Z)V")
	public Class84_Sub1(@OriginalArg(0) Class5_Sub2_Sub2 arg0, @OriginalArg(1) Class176 arg1, @OriginalArg(2) boolean arg2) {
		super(arg0, 34963, arg2);
		this.aClass176_17 = arg1;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(Z)V")
	@Override
	public void method8104() {
		super.method8104();
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(I)I")
	@Override
	public int method8094() {
		return super.method8094();
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method7963() {
		return super.method8106(super.aClass5_Sub2_Sub2_10.aMapBuffer1);
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(ZI)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method7962() {
		return super.method8095(super.aClass5_Sub2_Sub2_10.aMapBuffer1);
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(II)V")
	@Override
	public void method8101(@OriginalArg(0) int arg0) {
		super.method8101(this.aClass176_17.anInt6139 * arg0);
	}

	@OriginalMember(owner = "client!ud", name = "b", descriptor = "(I)Lclient!kq;")
	@Override
	public Class176 method7961() {
		return this.aClass176_17;
	}
}
