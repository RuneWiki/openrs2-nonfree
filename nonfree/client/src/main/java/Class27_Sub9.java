import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vi")
public final class Class27_Sub9 extends Class27 {

	@OriginalMember(owner = "client!vi", name = "u", descriptor = "F")
	private float aFloat201 = 0.0F;

	@OriginalMember(owner = "client!vi", name = "s", descriptor = "Lclient!no;")
	private final Class250 aClass250_6;

	@OriginalMember(owner = "client!vi", name = "<init>", descriptor = "(Lclient!pj;Lclient!no;)V")
	public Class27_Sub9(@OriginalArg(0) Class133_Sub1 arg0, @OriginalArg(1) Class250 arg1) {
		super(arg0);
		this.aClass250_6 = arg1;
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(IZLclient!iu;)V")
	@Override
	public void method8901(@OriginalArg(0) int arg0, @OriginalArg(2) Interface8 arg1) {
		super.aClass133_Sub1_23.method6153(arg1);
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(ZI)V")
	@Override
	public void method8894(@OriginalArg(0) boolean arg0) {
		super.aClass133_Sub1_23.method6271(1);
		super.aClass133_Sub1_23.method6239(Static81.aClass151_2, Static481.aClass151_8);
		super.aClass133_Sub1_23.method6222(0, Static626.aClass236_6, false, true);
		super.aClass133_Sub1_23.method6159(0, Static229.aClass236_2);
		super.aClass133_Sub1_23.method6167(0);
		super.aClass133_Sub1_23.method6271(0);
		super.aClass133_Sub1_23.method6160(-16777216);
		super.aClass133_Sub1_23.method6159(0, Static105.aClass236_1);
		this.method8902();
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(BZ)V")
	@Override
	public void method8898(@OriginalArg(1) boolean arg0) {
		super.aClass133_Sub1_23.method6239(Static524.aClass151_11, Static481.aClass151_8);
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method8891() {
		return this.aClass250_6.method5558();
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(III)V")
	@Override
	public void method8890(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		super.aClass133_Sub1_23.method6271(1);
		if ((arg0 & 0x80) != 0) {
			super.aClass133_Sub1_23.method6153(null);
		} else if ((arg1 & 0x1) == 1) {
			if (this.aClass250_6.aBoolean449) {
				this.aFloat201 = (float) (super.aClass133_Sub1_23.anInt7009 % 4000) / 4000.0F;
				super.aClass133_Sub1_23.method6153(this.aClass250_6.anInterface23_2);
			} else {
				@Pc(38) int local38 = super.aClass133_Sub1_23.anInt7009 % 4000 * 16 / 4000;
				super.aClass133_Sub1_23.method6153(this.aClass250_6.anInterface20Array1[local38]);
			}
		} else if (this.aClass250_6.aBoolean449) {
			super.aClass133_Sub1_23.method6153(this.aClass250_6.anInterface23_2);
		} else {
			super.aClass133_Sub1_23.method6153(this.aClass250_6.anInterface20Array1[0]);
		}
		super.aClass133_Sub1_23.method6271(0);
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(Z)V")
	@Override
	public void method8895() {
		super.aClass133_Sub1_23.method6271(1);
		super.aClass133_Sub1_23.method6239(Static524.aClass151_11, Static524.aClass151_11);
		super.aClass133_Sub1_23.method6211(Static626.aClass236_6, 0);
		super.aClass133_Sub1_23.method6159(0, Static626.aClass236_6);
		super.aClass133_Sub1_23.method6167(1);
		super.aClass133_Sub1_23.method6153(null);
		super.aClass133_Sub1_23.method6271(0);
		super.aClass133_Sub1_23.method6159(0, Static626.aClass236_6);
	}

	@OriginalMember(owner = "client!vi", name = "e", descriptor = "(I)V")
	@Override
	public void method8902() {
		if (super.aClass133_Sub1_23.method6202() != 0) {
			return;
		}
		@Pc(16) Class113_Sub1 local16 = super.aClass133_Sub1_23.method6180();
		super.aClass133_Sub1_23.method6271(1);
		@Pc(28) Class113_Sub1 local28 = super.aClass133_Sub1_23.method6183();
		local28.method8456(local16);
		local28.method2474(0.125F, 0.125F, 1.0F);
		local28.method2467(0.0F, this.aFloat201, 0.0F);
		super.aClass133_Sub1_23.method6225(Static573.aClass373_2);
		super.aClass133_Sub1_23.method6271(0);
	}
}
