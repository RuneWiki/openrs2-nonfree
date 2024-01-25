import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pm")
public final class Class17_Sub22 extends Class17 {

	@OriginalMember(owner = "client!pm", name = "<init>", descriptor = "(Lclient!eka;)V")
	public Class17_Sub22(@OriginalArg(0) Class3_Sub15 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!pm", name = "<init>", descriptor = "(ILclient!eka;)V")
	public Class17_Sub22(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub15 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!pm", name = "b", descriptor = "(I)Z")
	public boolean method6657() {
		if (super.aClass3_Sub15_31.method2432()) {
			return false;
		} else {
			return super.aClass3_Sub15_31.method2428() == Static341.aClass181_93;
		}
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(Z)V")
	@Override
	public void method8733() {
		if (super.aClass3_Sub15_31.method2428() != Static341.aClass181_93) {
			super.anInt10323 = 1;
		} else if (super.aClass3_Sub15_31.method2432()) {
			super.anInt10323 = 0;
		}
		if (super.anInt10323 != 0 && super.anInt10323 != 1) {
			super.anInt10323 = this.method8732();
		}
	}

	@OriginalMember(owner = "client!pm", name = "c", descriptor = "(B)I")
	public int method6659() {
		return super.anInt10323;
	}

	@OriginalMember(owner = "client!pm", name = "c", descriptor = "(II)V")
	@Override
	protected void method8737(@OriginalArg(0) int arg0) {
		super.anInt10323 = arg0;
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(I)I")
	@Override
	protected int method8732() {
		return 1;
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(II)I")
	@Override
	public int method8734(@OriginalArg(0) int arg0) {
		if (super.aClass3_Sub15_31.method2432()) {
			return 3;
		} else if (super.aClass3_Sub15_31.method2428() == Static341.aClass181_93) {
			if (arg0 == 0) {
				if (super.aClass3_Sub15_31.aClass17_Sub27_1.method8266() == 1) {
					return 2;
				}
				if (super.aClass3_Sub15_31.aClass17_Sub12_1.method4577() == 1) {
					return 2;
				}
				if (super.aClass3_Sub15_31.aClass17_Sub5_1.method2068() > 0) {
					return 2;
				}
			}
			return 1;
		} else {
			return 3;
		}
	}
}
