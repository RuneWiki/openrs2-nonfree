import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ju")
public final class Class4_Sub16 extends Class4 {

	@OriginalMember(owner = "client!ju", name = "p", descriptor = "Z")
	private boolean aBoolean397 = true;

	@OriginalMember(owner = "client!ju", name = "m", descriptor = "Z")
	public boolean aBoolean396 = false;

	@OriginalMember(owner = "client!ju", name = "<init>", descriptor = "(ILclient!w;)V")
	public Class4_Sub16(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub54 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!ju", name = "<init>", descriptor = "(Lclient!w;)V")
	public Class4_Sub16(@OriginalArg(0) Class2_Sub54 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(IZ)V")
	public void method4905(@OriginalArg(1) boolean arg0) {
		this.aBoolean397 = arg0;
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(B)Z")
	public boolean method4906() {
		return this.aBoolean397;
	}

	@OriginalMember(owner = "client!ju", name = "b", descriptor = "(II)I")
	@Override
	public int method9223(@OriginalArg(0) int arg0) {
		if (super.aClass2_Sub54_31.method9553().method129()) {
			return arg0 == 3 && !Static365.method6185("jagdx") ? 3 : 2;
		} else {
			return 3;
		}
	}

	@OriginalMember(owner = "client!ju", name = "b", descriptor = "(I)I")
	public int method4907() {
		return super.anInt10787;
	}

	@OriginalMember(owner = "client!ju", name = "b", descriptor = "(Z)V")
	@Override
	public void method9225() {
		if (!super.aClass2_Sub54_31.method9553().method129()) {
			super.anInt10787 = 0;
		}
		if (super.anInt10787 < 0 || super.anInt10787 > 5) {
			super.anInt10787 = this.method9221();
		}
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(BI)V")
	@Override
	protected void method9227(@OriginalArg(1) int arg0) {
		this.aBoolean396 = false;
		super.anInt10787 = arg0;
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(Z)I")
	@Override
	protected int method9221() {
		this.aBoolean396 = true;
		return super.aClass2_Sub54_31.method9553().method129() ? 2 : 0;
	}

	@OriginalMember(owner = "client!ju", name = "c", descriptor = "(I)Z")
	public boolean method4909() {
		return super.aClass2_Sub54_31.method9553().method129();
	}
}
