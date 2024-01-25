import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hb")
public final class Class74_Sub3 extends Class74 {

	@OriginalMember(owner = "client!hb", name = "p", descriptor = "Z")
	private boolean aBoolean354 = false;

	@OriginalMember(owner = "client!hb", name = "<init>", descriptor = "(Lclient!gt;)V")
	public Class74_Sub3(@OriginalArg(0) Class87_Sub1 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(ILclient!du;I)V")
	@Override
	public void method8250(@OriginalArg(1) Interface7 arg0, @OriginalArg(2) int arg1) {
		super.aClass87_Sub1_22.method5079(arg0);
		super.aClass87_Sub1_22.method5062(arg1);
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(III)V")
	@Override
	public void method8243(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(ZI)V")
	@Override
	public void method8251(@OriginalArg(0) boolean arg0) {
		@Pc(8) Interface22 local8 = super.aClass87_Sub1_22.method5123();
		if (local8 == null || !arg0) {
			super.aClass87_Sub1_22.method5118(0, Static572.aClass315_4);
			return;
		}
		super.aClass87_Sub1_22.method5116(1);
		super.aClass87_Sub1_22.method5079(local8);
		super.aClass87_Sub1_22.method5021(Static261.aClass62_1);
		super.aClass87_Sub1_22.method5116(1);
		super.aClass87_Sub1_22.method5133(Static148.aClass300_3, Static215.aClass300_4);
		super.aClass87_Sub1_22.method5052(false, true, 2, Static508.aClass315_2);
		super.aClass87_Sub1_22.method5118(0, Static572.aClass315_4);
		@Pc(66) Class6_Sub2 local66 = super.aClass87_Sub1_22.method5141();
		local66.method2712(super.aClass87_Sub1_22.method5104());
		super.aClass87_Sub1_22.method5023(Static552.aClass108_24);
		super.aClass87_Sub1_22.method5116(0);
		this.aBoolean354 = true;
	}

	@OriginalMember(owner = "client!hb", name = "c", descriptor = "(I)V")
	@Override
	public void method8249() {
		if (this.aBoolean354) {
			super.aClass87_Sub1_22.method5116(1);
			super.aClass87_Sub1_22.method5021(Static269.aClass62_2);
			super.aClass87_Sub1_22.method5133(Static40.aClass300_1, Static40.aClass300_1);
			super.aClass87_Sub1_22.method5131(2, Static358.aClass315_1);
			super.aClass87_Sub1_22.method5118(0, Static516.aClass315_3);
			super.aClass87_Sub1_22.method5127();
			super.aClass87_Sub1_22.method5079(null);
			super.aClass87_Sub1_22.method5116(0);
			this.aBoolean354 = false;
		} else {
			super.aClass87_Sub1_22.method5118(0, Static516.aClass315_3);
		}
		super.aClass87_Sub1_22.method5133(Static40.aClass300_1, Static40.aClass300_1);
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method8245() {
		return true;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(BZ)V")
	@Override
	public void method8253(@OriginalArg(1) boolean arg0) {
		super.aClass87_Sub1_22.method5133(Static148.aClass300_3, Static40.aClass300_1);
	}
}
