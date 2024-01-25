import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kn")
public final class Class1_Sub1_Sub17 extends Class1_Sub1 {

	@OriginalMember(owner = "client!kn", name = "J", descriptor = "[I")
	private int[] anIntArray259;

	@OriginalMember(owner = "client!kn", name = "O", descriptor = "I")
	private int anInt3519;

	@OriginalMember(owner = "client!kn", name = "Z", descriptor = "I")
	private int anInt3527;

	@OriginalMember(owner = "client!kn", name = "S", descriptor = "I")
	private int anInt3522 = -1;

	static {
		new Class106("That user is not in this channel.", "Dieser Benutzer befindet sich nicht in diesem Chatraum.", "Cet utilisateur n'est pas dans ce canal.", "Esse usuário não está no canal.");
	}

	@OriginalMember(owner = "client!kn", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub17() {
		super(0, false);
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(Z)V")
	@Override
	public void method6009() {
		super.method6009();
		this.anIntArray259 = null;
	}

	@OriginalMember(owner = "client!kn", name = "b", descriptor = "(B)I")
	@Override
	public int method6011() {
		return this.anInt3522;
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(III)V")
	@Override
	public void method6001(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super.method6001(arg0, arg1);
		if (this.anInt3522 >= 0 && Static8.anInterface3_1 != null) {
			@Pc(27) int local27 = Static8.anInterface3_1.method5486(this.anInt3522).aBoolean395 ? 64 : 128;
			this.anIntArray259 = Static8.anInterface3_1.method5487(local27, false, local27, this.anInt3522, 1.0F);
			this.anInt3527 = local27;
			this.anInt3519 = local27;
		}
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(IILclient!at;)V")
	@Override
	public void method6002(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub7 arg1) {
		if (arg0 == 0) {
			this.anInt3522 = arg1.method2161();
		}
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method6004(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass34_41.method1356(arg0);
		if (super.aClass34_41.aBoolean100) {
			@Pc(37) int local37 = this.anInt3527 * (Static208.anInt4105 == this.anInt3519 ? arg0 : this.anInt3519 * arg0 / Static208.anInt4105);
			@Pc(41) int[] local41 = local11[0];
			@Pc(45) int[] local45 = local11[1];
			@Pc(49) int[] local49 = local11[2];
			@Pc(59) int local59;
			@Pc(67) int local67;
			if (this.anInt3527 == Static85.anInt1910) {
				for (local59 = 0; local59 < Static85.anInt1910; local59++) {
					local67 = this.anIntArray259[local37++];
					local49[local59] = (local67 & 0xFF) << 4;
					local45[local59] = local67 >> 4 & 0xFF0;
					local41[local59] = local67 >> 12 & 0xFF0;
				}
			} else {
				for (local59 = 0; local59 < Static85.anInt1910; local59++) {
					local67 = local59 * this.anInt3527 / Static85.anInt1910;
					@Pc(115) int local115 = this.anIntArray259[local37 + local67];
					local49[local59] = (local115 & 0xFF) << 4;
					local45[local59] = local115 >> 4 & 0xFF0;
					local41[local59] = local115 >> 12 & 0xFF0;
				}
			}
		}
		return local11;
	}
}
