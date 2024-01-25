import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ur")
public final class Class2_Sub2_Sub33 extends Class2_Sub2 {

	@OriginalMember(owner = "client!ur", name = "O", descriptor = "I")
	private int anInt6795 = 4096;

	@OriginalMember(owner = "client!ur", name = "M", descriptor = "I")
	private int anInt6793 = 0;

	static {
		new Class209("Changes will take effect on your clan in the next 60 seconds.", "Die Änderungen am Chatraum werden innerhalb von 60 Sekunden gültig.", "Les modifications seront apportées à votre clan dans les prochaines 60 secondes.", "As alterações passarão a valer no seu clã nos próximos 60 segundos.");
	}

	@OriginalMember(owner = "client!ur", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub33() {
		super(1, true);
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(Lclient!si;II)V")
	@Override
	public void method5838(@OriginalArg(0) Class2_Sub23 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt6793 = arg0.method5500();
		} else if (arg1 == 1) {
			this.anInt6795 = arg0.method5500();
		}
	}

	@OriginalMember(owner = "client!ur", name = "d", descriptor = "(II)[I")
	@Override
	public int[] method5849(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass82_41.method2034(arg0);
		if (super.aClass82_41.aBoolean199) {
			@Pc(28) int[] local28 = this.method5839(arg0, 0);
			for (@Pc(30) int local30 = 0; local30 < Static429.anInt6518; local30++) {
				@Pc(36) int local36 = local28[local30];
				local11[local30] = local36 >= this.anInt6793 && local36 <= this.anInt6795 ? 4096 : 0;
			}
		}
		return local11;
	}
}
