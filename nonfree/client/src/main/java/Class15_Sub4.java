import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public final class Class15_Sub4 extends Class15 {

	@OriginalMember(owner = "client!ck", name = "i", descriptor = "Z")
	public boolean aBoolean106 = false;

	@OriginalMember(owner = "client!ck", name = "r", descriptor = "Z")
	private boolean aBoolean105 = true;

	@OriginalMember(owner = "client!ck", name = "<init>", descriptor = "(Lclient!vba;)V")
	public Class15_Sub4(@OriginalArg(0) Class3_Sub55 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ck", name = "<init>", descriptor = "(ILclient!vba;)V")
	public Class15_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub55 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!ck", name = "c", descriptor = "(I)Z")
	public boolean method1067() {
		return super.aClass3_Sub55_32.method8888().method4080();
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(I)V")
	@Override
	public void method9422() {
		if (!super.aClass3_Sub55_32.method8888().method4080()) {
			super.anInt11276 = 0;
		}
		if (super.anInt11276 < 0 || super.anInt11276 > 5) {
			super.anInt11276 = this.method9419();
		}
	}

	@OriginalMember(owner = "client!ck", name = "d", descriptor = "(B)I")
	public int method1071() {
		return super.anInt11276;
	}

	@OriginalMember(owner = "client!ck", name = "b", descriptor = "(B)I")
	@Override
	protected int method9419() {
		this.aBoolean106 = true;
		return super.aClass3_Sub55_32.method8888().method4080() ? 2 : 0;
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(II)I")
	@Override
	public int method9420(@OriginalArg(0) int arg0) {
		if (super.aClass3_Sub55_32.method8888().method4080()) {
			return arg0 == 3 && !Static579.method2975("jagdx") ? 3 : 2;
		} else {
			return 3;
		}
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(BI)V")
	@Override
	protected void method9418(@OriginalArg(1) int arg0) {
		super.anInt11276 = arg0;
		this.aBoolean106 = false;
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(ZI)V")
	public void method1072(@OriginalArg(0) boolean arg0) {
		this.aBoolean105 = arg0;
	}

	@OriginalMember(owner = "client!ck", name = "b", descriptor = "(I)Z")
	public boolean method1073() {
		return this.aBoolean105;
	}
}
