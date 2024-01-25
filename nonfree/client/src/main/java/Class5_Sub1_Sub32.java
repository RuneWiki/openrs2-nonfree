import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rq")
public final class Class5_Sub1_Sub32 extends Class5_Sub1 {

	@OriginalMember(owner = "client!rq", name = "F", descriptor = "I")
	private int anInt7624;

	@OriginalMember(owner = "client!rq", name = "H", descriptor = "I")
	private int anInt7625;

	@OriginalMember(owner = "client!rq", name = "P", descriptor = "[I")
	private int[] anIntArray577;

	@OriginalMember(owner = "client!rq", name = "D", descriptor = "I")
	private int anInt7622 = -1;

	@OriginalMember(owner = "client!rq", name = "<init>", descriptor = "()V")
	public Class5_Sub1_Sub32() {
		super(0, false);
	}

	@OriginalMember(owner = "client!rq", name = "b", descriptor = "(I)V")
	@Override
	public void method7162() {
		super.method7162();
		this.anIntArray577 = null;
	}

	@OriginalMember(owner = "client!rq", name = "c", descriptor = "(I)I")
	@Override
	public int method7165() {
		return this.anInt7622;
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(BILclient!co;)V")
	@Override
	public void method7164(@OriginalArg(1) int arg0, @OriginalArg(2) Class5_Sub3 arg1) {
		if (arg0 == 0) {
			this.anInt7622 = arg1.method4227();
		}
	}

	@OriginalMember(owner = "client!rq", name = "b", descriptor = "(III)V")
	@Override
	public void method7156(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super.method7156(arg0, arg1);
		if (this.anInt7622 >= 0 && Static497.anInterface8_152 != null) {
			@Pc(32) int local32 = Static497.anInterface8_152.method7237(this.anInt7622).aBoolean558 ? 64 : 128;
			this.anIntArray577 = Static497.anInterface8_152.method7234(local32, local32, false, this.anInt7622, 1.0F);
			this.anInt7625 = local32;
			this.anInt7624 = local32;
		}
	}

	@OriginalMember(owner = "client!rq", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method7163(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass249_41.method5989(arg0);
		if (super.aClass249_41.aBoolean520) {
			@Pc(43) int local43 = (Static250.anInt5057 == this.anInt7624 ? arg0 : this.anInt7624 * arg0 / Static250.anInt5057) * this.anInt7625;
			@Pc(47) int[] local47 = local11[0];
			@Pc(51) int[] local51 = local11[1];
			@Pc(55) int[] local55 = local11[2];
			@Pc(65) int local65;
			@Pc(74) int local74;
			if (this.anInt7625 == Static147.anInt3075) {
				for (local65 = 0; local65 < Static147.anInt3075; local65++) {
					local74 = this.anIntArray577[local43++];
					local55[local65] = (local74 & 0xFF) << 4;
					local51[local65] = local74 >> 4 & 0xFF0;
					local47[local65] = local74 >> 12 & 0xFF0;
				}
			} else {
				for (local65 = 0; local65 < Static147.anInt3075; local65++) {
					local74 = local65 * this.anInt7625 / Static147.anInt3075;
					@Pc(81) int local81 = this.anIntArray577[local43 + local74];
					local55[local65] = (local81 & 0xFF) << 4;
					local51[local65] = local81 >> 4 & 0xFF0;
					local47[local65] = local81 >> 12 & 0xFF0;
				}
			}
		}
		return local11;
	}
}
