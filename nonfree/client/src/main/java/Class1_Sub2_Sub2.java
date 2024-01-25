import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bm")
public final class Class1_Sub2_Sub2 extends Class1_Sub2 {

	@OriginalMember(owner = "client!bm", name = "F", descriptor = "I")
	private int anInt530;

	@OriginalMember(owner = "client!bm", name = "K", descriptor = "[I")
	private int[] anIntArray67;

	@OriginalMember(owner = "client!bm", name = "L", descriptor = "I")
	private int anInt534;

	@OriginalMember(owner = "client!bm", name = "I", descriptor = "I")
	private int anInt532 = -1;

	@OriginalMember(owner = "client!bm", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub2() {
		super(0, false);
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(I)V")
	@Override
	public void method5958() {
		super.method5958();
		this.anIntArray67 = null;
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method5965(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass99_41.method1772(arg0);
		if (super.aClass99_41.aBoolean228) {
			@Pc(40) int local40 = this.anInt530 * (this.anInt534 == Static54.anInt778 ? arg0 : this.anInt534 * arg0 / Static54.anInt778);
			@Pc(44) int[] local44 = local16[0];
			@Pc(48) int[] local48 = local16[1];
			@Pc(52) int[] local52 = local16[2];
			@Pc(58) int local58;
			@Pc(67) int local67;
			if (this.anInt530 == Static218.anInt3990) {
				for (local58 = 0; local58 < Static218.anInt3990; local58++) {
					local67 = this.anIntArray67[local40++];
					local52[local58] = (local67 & 0xFF) << 4;
					local48[local58] = local67 >> 4 & 0xFF0;
					local44[local58] = local67 >> 12 & 0xFF0;
				}
			} else {
				for (local58 = 0; local58 < Static218.anInt3990; local58++) {
					local67 = this.anInt530 * local58 / Static218.anInt3990;
					@Pc(74) int local74 = this.anIntArray67[local67 + local40];
					local52[local58] = (local74 & 0xFF) << 4;
					local48[local58] = local74 >> 4 & 0xFF0;
					local44[local58] = local74 >> 12 & 0xFF0;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!bm", name = "b", descriptor = "(III)V")
	@Override
	public void method5966(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		super.method5966(arg0, arg1);
		if (this.anInt532 >= 0 && Static252.anInterface4_6 != null) {
			@Pc(24) int local24 = Static252.anInterface4_6.method5090(this.anInt532).aBoolean54 ? 64 : 128;
			this.anIntArray67 = Static252.anInterface4_6.method5088(local24, this.anInt532, 1.0F, false, local24);
			this.anInt530 = local24;
			this.anInt534 = local24;
		}
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(Lclient!wm;II)V")
	@Override
	public void method5962(@OriginalArg(0) Class1_Sub19 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt532 = arg0.method2896();
		}
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(B)I")
	@Override
	public int method5960() {
		return this.anInt532;
	}
}
