import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dga")
public final class Class21_Sub7 extends Class21 {

	@OriginalMember(owner = "client!dga", name = "<init>", descriptor = "(Lclient!gp;)V")
	public Class21_Sub7(@OriginalArg(0) Class3_Sub27 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!dga", name = "<init>", descriptor = "(ILclient!gp;)V")
	public Class21_Sub7(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub27 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!dga", name = "c", descriptor = "(Z)I")
	public int method2118() {
		return super.anInt10079;
	}

	@OriginalMember(owner = "client!dga", name = "b", descriptor = "(Z)V")
	@Override
	public void method8639() {
		if (super.anInt10079 != 1 && super.anInt10079 != 0) {
			super.anInt10079 = this.method8636();
		}
	}

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(ZI)I")
	@Override
	public int method8635(@OriginalArg(1) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(B)I")
	@Override
	protected int method8636() {
		return 1;
	}

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(BI)V")
	@Override
	protected void method8634(@OriginalArg(1) int arg0) {
		super.anInt10079 = arg0;
	}
}
