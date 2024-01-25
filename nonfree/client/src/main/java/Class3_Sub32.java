import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!op")
public final class Class3_Sub32 extends Class3 {

	@OriginalMember(owner = "client!op", name = "l", descriptor = "I")
	public int anInt4599;

	@OriginalMember(owner = "client!op", name = "m", descriptor = "I")
	public int anInt4600;

	@OriginalMember(owner = "client!op", name = "n", descriptor = "I")
	public int anInt4601;

	@OriginalMember(owner = "client!op", name = "o", descriptor = "I")
	public int anInt4602;

	@OriginalMember(owner = "client!op", name = "q", descriptor = "I")
	public int anInt4603;

	@OriginalMember(owner = "client!op", name = "r", descriptor = "I")
	public int anInt4604;

	@OriginalMember(owner = "client!op", name = "t", descriptor = "I")
	public int anInt4606;

	@OriginalMember(owner = "client!op", name = "u", descriptor = "I")
	public int anInt4607;

	@OriginalMember(owner = "client!op", name = "v", descriptor = "I")
	public int anInt4608;

	@OriginalMember(owner = "client!op", name = "w", descriptor = "I")
	public int anInt4609;

	@OriginalMember(owner = "client!op", name = "x", descriptor = "I")
	public int anInt4610;

	@OriginalMember(owner = "client!op", name = "z", descriptor = "I")
	public int anInt4612;

	@OriginalMember(owner = "client!op", name = "B", descriptor = "I")
	public int anInt4614;

	@OriginalMember(owner = "client!op", name = "C", descriptor = "I")
	public int anInt4615;

	@OriginalMember(owner = "client!op", name = "E", descriptor = "I")
	public int anInt4617;

	static {
		new Class57("You are not allowed to talk in this clan channel.", "Du darfst in diesem Chatraum nicht reden.", "Vous n'êtes pas autorisé à parler dans ce canal de clan.", "Você não tem permissão para conversar neste canal de clã.");
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(Lclient!np;II)Lclient!f;")
	public Class75 method4152(@OriginalArg(0) Class155 arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14 = Static138.anIntArray275[this.anInt4599];
		if (local14 == 0) {
			@Pc(27) Class28_Sub3 local27 = Static343.method5200(this.anInt4608, this.anInt4609, this.anInt4607);
			if (local27 instanceof Class28_Sub3_Sub3) {
				@Pc(33) Class28_Sub3_Sub3 local33 = (Class28_Sub3_Sub3) local27;
				if (local33.aClass28_Sub3_3 != null) {
					return ((Interface3) local33.aClass28_Sub3_3).method5422(arg0, arg1);
				}
			}
		} else if (local14 == 1) {
			@Pc(121) Class28_Sub4 local121 = Static202.method3148(this.anInt4608, this.anInt4609, this.anInt4607);
			if (local121 instanceof Class28_Sub4_Sub3) {
				@Pc(127) Class28_Sub4_Sub3 local127 = (Class28_Sub4_Sub3) local121;
				if (local127.aClass28_Sub4_3 != null) {
					return ((Interface3) local127.aClass28_Sub4_3).method5422(arg0, arg1);
				}
			}
		} else if (local14 == 2) {
			@Pc(96) Class28_Sub1 local96 = Static30.method472(this.anInt4608, this.anInt4609, this.anInt4607, gg.class);
			if (local96 instanceof Class28_Sub1_Sub2) {
				@Pc(102) Class28_Sub1_Sub2 local102 = (Class28_Sub1_Sub2) local96;
				if (local102.aClass28_Sub1_2 != null) {
					return ((Interface3) local102.aClass28_Sub1_2).method5422(arg0, arg1);
				}
			}
		} else if (local14 == 3) {
			@Pc(63) Class28_Sub2 local63 = Static277.method4347(this.anInt4608, this.anInt4609, this.anInt4607);
			if (local63 instanceof Class28_Sub2_Sub1) {
				@Pc(69) Class28_Sub2_Sub1 local69 = (Class28_Sub2_Sub1) local63;
				if (local69.aClass28_Sub2_1 != null) {
					return ((Interface3) local69.aClass28_Sub2_1).method5422(arg0, arg1);
				}
			}
		}
		return null;
	}
}
