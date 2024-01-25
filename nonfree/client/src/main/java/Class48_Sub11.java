import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vt")
public final class Class48_Sub11 extends Class48 {

	@OriginalMember(owner = "client!vt", name = "x", descriptor = "F")
	private float aFloat214 = 0.0F;

	@OriginalMember(owner = "client!vt", name = "u", descriptor = "Lclient!b;")
	private final Class24 aClass24_8;

	@OriginalMember(owner = "client!vt", name = "<init>", descriptor = "(Lclient!gca;Lclient!b;)V")
	public Class48_Sub11(@OriginalArg(0) Class100_Sub1 arg0, @OriginalArg(1) Class24 arg1) {
		super(arg0);
		this.aClass24_8 = arg1;
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8941(@OriginalArg(1) boolean arg0) {
		super.aClass100_Sub1_23.method7904(Static164.aClass94_1, Static653.aClass94_5);
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(ZI)V")
	@Override
	public void method8938(@OriginalArg(0) boolean arg0) {
		super.aClass100_Sub1_23.method7941(1);
		super.aClass100_Sub1_23.method7904(Static164.aClass94_1, Static618.aClass94_4);
		super.aClass100_Sub1_23.method7883(true, Static94.aClass93_2, false, 0);
		super.aClass100_Sub1_23.method7947(Static237.aClass93_3, 0);
		super.aClass100_Sub1_23.method7928(0);
		super.aClass100_Sub1_23.method7941(0);
		super.aClass100_Sub1_23.method7873(-16777216);
		super.aClass100_Sub1_23.method7947(Static520.aClass93_4, 0);
		this.method8944();
	}

	@OriginalMember(owner = "client!vt", name = "e", descriptor = "(I)V")
	@Override
	public void method8944() {
		if (super.aClass100_Sub1_23.method7874() != 0) {
			return;
		}
		@Pc(18) Class10_Sub2 local18 = super.aClass100_Sub1_23.method7862();
		super.aClass100_Sub1_23.method7941(1);
		@Pc(28) Class10_Sub2 local28 = super.aClass100_Sub1_23.method7877();
		local28.method4212(local18);
		local28.method1701(0.125F, 0.125F, 1.0F);
		local28.method1695(this.aFloat214, 0.0F, 0.0F);
		super.aClass100_Sub1_23.method7954(Static141.aClass16_11);
		super.aClass100_Sub1_23.method7941(0);
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(Lclient!ln;BI)V")
	@Override
	public void method8933(@OriginalArg(0) Interface19 arg0, @OriginalArg(2) int arg1) {
		super.aClass100_Sub1_23.method7923(arg0);
	}

	@OriginalMember(owner = "client!vt", name = "f", descriptor = "(I)Z")
	@Override
	public boolean method8940() {
		return this.aClass24_8.method393();
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(Z)V")
	@Override
	public void method8934() {
		super.aClass100_Sub1_23.method7941(1);
		super.aClass100_Sub1_23.method7904(Static653.aClass94_5, Static653.aClass94_5);
		super.aClass100_Sub1_23.method7970(Static94.aClass93_2, 0);
		super.aClass100_Sub1_23.method7947(Static94.aClass93_2, 0);
		super.aClass100_Sub1_23.method7928(1);
		super.aClass100_Sub1_23.method7923((Interface19) null);
		super.aClass100_Sub1_23.method7941(0);
		super.aClass100_Sub1_23.method7947(Static94.aClass93_2, 0);
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(III)V")
	@Override
	public void method8935(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		super.aClass100_Sub1_23.method7941(1);
		if ((arg0 & 0x80) != 0) {
			super.aClass100_Sub1_23.method7923((Interface19) null);
		} else if ((arg1 & 0x1) == 1) {
			if (this.aClass24_8.aBoolean19) {
				this.aFloat214 = (float) (super.aClass100_Sub1_23.anInt9259 % 4000) / 4000.0F;
				super.aClass100_Sub1_23.method7923(this.aClass24_8.anInterface14_2);
			} else {
				@Pc(71) int local71 = super.aClass100_Sub1_23.anInt9259 % 4000 * 16 / 4000;
				super.aClass100_Sub1_23.method7923(this.aClass24_8.anInterface2Array1[local71]);
			}
		} else if (this.aClass24_8.aBoolean19) {
			super.aClass100_Sub1_23.method7923(this.aClass24_8.anInterface14_2);
		} else {
			super.aClass100_Sub1_23.method7923(this.aClass24_8.anInterface2Array1[0]);
		}
		super.aClass100_Sub1_23.method7941(0);
	}
}
