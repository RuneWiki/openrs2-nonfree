import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cd")
public final class Class29_Sub1 extends Class29 {

	@OriginalMember(owner = "client!cd", name = "n", descriptor = "I")
	private int anInt766 = 0;

	@OriginalMember(owner = "client!cd", name = "t", descriptor = "Lclient!up;")
	private final Class152 aClass152_1 = new Class152();

	static {
		new Class32("Already attempting to join a channel - please wait...", "Du versuchst bereits, einem Chatraum beizutreten - bitte warte.", "Tentative de connexion au canal déjà en cours - veuillez patienter...", "Já há uma tentativa de entrar em um canal. Aguarde...");
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(Z)V")
	@Override
	public void method4184() {
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lclient!wr;B)V")
	@Override
	public void method4183(@OriginalArg(0) Class251 arg0) {
		super.aByteArray84[super.anInt4737] = 20;
		super.anObjectArray35[super.anInt4737] = arg0;
		super.anInt4737++;
		if (super.anInt4737 >= 5000) {
			super.anInt4737 = 0;
		}
	}

	@OriginalMember(owner = "client!cd", name = "d", descriptor = "(I)V")
	private void method668() {
		@Pc(8) int local8 = super.anInt4738++;
		if (super.anInt4738 >= 5000) {
			super.anInt4738 = 0;
		}
		this.anInt766 = super.aByteArray84[local8];
		@Pc(42) Object local42 = super.anObjectArray35[local8];
		super.anObjectArray35[local8] = null;
		if (this.anInt766 == 21) {
			Static357.method4127(this.aClass152_1, (Class251) local42);
		} else if (this.anInt766 == 20) {
			@Pc(173) Class251 local173 = (Class251) local42;
			if (local173.aClass1_Sub1_3 != null) {
				local173.aClass1_Sub1_3.method5644(Static350.aClass63_8);
			}
			if (local173.aClass1_Sub1_2 != null) {
				local173.aClass1_Sub1_2.method5644(Static350.aClass63_8);
			}
			if (local173.aClass1_Sub2_2 != null) {
				local173.aClass1_Sub2_2.method5644(Static350.aClass63_8);
			}
			if (local173.aClass1_Sub2_3 != null) {
				local173.aClass1_Sub2_3.method5644(Static350.aClass63_8);
			}
			if (local173.aClass1_Sub3_2 != null) {
				local173.aClass1_Sub3_2.method5644(Static350.aClass63_8);
			}
			for (@Pc(216) Class46 local216 = local173.aClass46_3; local216 != null; local216 = local216.aClass46_1) {
				local216.aClass1_Sub5_1.method5644(Static350.aClass63_8);
			}
		} else if (this.anInt766 >= 30 && this.anInt766 <= 33) {
			Static350.aClass63_8.method2030(3000.0F, super.aFloatArray28[local8] * 1.5F);
			((Class107) local42).method4681(Static322.anInt5531, Static314.anInt5359, Static309.anInt5190, Static199.aBooleanArrayArray4, this.anInt766 - 30 == 0);
		} else if (this.anInt766 >= 40 && this.anInt766 <= 43) {
			Static350.aClass63_8.method2030(3000.0F, super.aFloatArray28[local8] * 1.5F);
			((Class107) local42).method4681(Static322.anInt5531, Static314.anInt5359, Static309.anInt5190, Static360.aBooleanArrayArray7, this.anInt766 - 40 == 0);
		} else if (this.anInt766 == 22) {
			Static350.aClass63_8.method1978();
		} else if (this.anInt766 == 23) {
			Static350.aClass63_8.method1952();
		} else if (this.anInt766 == 24) {
			Static350.aClass63_8.method2011(0, null);
			return;
		}
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lclient!wr;I)V")
	@Override
	public void method4191(@OriginalArg(0) Class251 arg0) {
		super.aByteArray84[super.anInt4737] = 21;
		super.anObjectArray35[super.anInt4737] = arg0;
		super.anInt4737++;
		if (super.anInt4737 >= 5000) {
			super.anInt4737 = 0;
		}
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(IB)V")
	@Override
	public void method4190(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!cd", name = "c", descriptor = "(I)V")
	@Override
	public void method4188() {
		while (super.anInt4738 != super.anInt4737) {
			this.method668();
		}
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(ILclient!wr;)V")
	@Override
	public void method4189(@OriginalArg(1) Class251 arg0) {
		super.anInt4738--;
		if (super.anInt4738 < 0) {
			super.anInt4738 = 4999;
		}
		super.aByteArray84[super.anInt4738] = 21;
		super.anObjectArray35[super.anInt4738] = arg0;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(BI)V")
	@Override
	public void method4194(@OriginalArg(1) int arg0) {
		super.aByteArray84[super.anInt4737] = (byte) arg0;
		super.anInt4737++;
		if (super.anInt4737 >= 5000) {
			super.anInt4737 = 0;
		}
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(FIZLclient!ij;B)V")
	@Override
	public void method4193(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class107 arg3) {
		super.aByteArray84[super.anInt4737] = (byte) (arg2 ? arg1 + 40 : arg1 + 30);
		super.anObjectArray35[super.anInt4737] = arg3;
		super.aFloatArray28[super.anInt4737] = arg0;
		super.anInt4737++;
		if (super.anInt4737 >= 5000) {
			super.anInt4737 = 0;
		}
	}
}
