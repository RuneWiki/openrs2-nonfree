import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ut")
public final class Class29_Sub26 extends Class29 {

	@OriginalMember(owner = "client!ut", name = "<init>", descriptor = "(Lclient!fs;)V")
	public Class29_Sub26(@OriginalArg(0) Class6_Sub22 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ut", name = "<init>", descriptor = "(ILclient!fs;)V")
	public Class29_Sub26(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub22 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(I)V")
	@Override
	public void method8995() {
		if (super.aClass6_Sub22_31.aClass29_Sub16_2.method5740() && !Static530.method7381(super.aClass6_Sub22_31.aClass29_Sub16_2.method5742())) {
			super.anInt10604 = 0;
		}
		if (super.anInt10604 < 0 || super.anInt10604 > 1) {
			super.anInt10604 = this.method8997();
		}
	}

	@OriginalMember(owner = "client!ut", name = "d", descriptor = "(II)V")
	@Override
	protected void method9000(@OriginalArg(0) int arg0) {
		super.anInt10604 = arg0;
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(II)I")
	@Override
	public int method8994(@OriginalArg(0) int arg0) {
		return Static530.method7381(super.aClass6_Sub22_31.aClass29_Sub16_2.method5742()) ? 1 : 3;
	}

	@OriginalMember(owner = "client!ut", name = "c", descriptor = "(I)Z")
	public boolean method8502() {
		return Static530.method7381(super.aClass6_Sub22_31.aClass29_Sub16_2.method5742());
	}

	@OriginalMember(owner = "client!ut", name = "c", descriptor = "(B)I")
	public int method8504() {
		return super.anInt10604;
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(B)I")
	@Override
	protected int method8997() {
		return 0;
	}
}
