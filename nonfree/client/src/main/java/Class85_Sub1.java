import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public final class Class85_Sub1 extends Class85 implements Interface13 {

	@OriginalMember(owner = "client!ed", name = "E", descriptor = "Lclient!bk;")
	private final Class35 aClass35_9;

	@OriginalMember(owner = "client!ed", name = "<init>", descriptor = "(Lclient!kd;Lclient!bk;Z)V")
	public Class85_Sub1(@OriginalArg(0) Class162_Sub1_Sub2 arg0, @OriginalArg(1) Class35 arg1, @OriginalArg(2) boolean arg2) {
		super(arg0, 34963, arg2);
		this.aClass35_9 = arg1;
	}

	@OriginalMember(owner = "client!ed", name = "c", descriptor = "(Z)Z")
	@Override
	public boolean method7033() {
		return super.method5356(super.aClass162_Sub1_Sub2_7.aMapBuffer1);
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(II)V")
	@Override
	public void method7035(@OriginalArg(0) int arg0) {
		super.method7035(this.aClass35_9.anInt776 * arg0);
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(Z)I")
	@Override
	public int method7030() {
		return super.method7030();
	}

	@OriginalMember(owner = "client!ed", name = "b", descriptor = "(Z)Lclient!bk;")
	@Override
	public Class35 method7031() {
		return this.aClass35_9;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(BZ)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method7034() {
		return super.method5362(super.aClass162_Sub1_Sub2_7.aMapBuffer1);
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(I)V")
	@Override
	public void method7032() {
		super.method7032();
	}
}
