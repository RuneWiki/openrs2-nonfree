import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oea")
public final class Class239 {

	@OriginalMember(owner = "client!oea", name = "d", descriptor = "I")
	private int anInt7411 = -1;

	@OriginalMember(owner = "client!oea", name = "o", descriptor = "I")
	private int anInt7418 = 0;

	@OriginalMember(owner = "client!oea", name = "b", descriptor = "Lclient!kba;")
	private Class163 aClass163_45 = new Class163();

	@OriginalMember(owner = "client!oea", name = "p", descriptor = "Z")
	public boolean aBoolean585 = false;

	@OriginalMember(owner = "client!oea", name = "c", descriptor = "I")
	private final int anInt7410;

	@OriginalMember(owner = "client!oea", name = "f", descriptor = "I")
	private final int anInt7413;

	@OriginalMember(owner = "client!oea", name = "k", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray7;

	@OriginalMember(owner = "client!oea", name = "h", descriptor = "[Lclient!daa;")
	private Class6_Sub15[] aClass6_Sub15Array1;

	@OriginalMember(owner = "client!oea", name = "<init>", descriptor = "(III)V")
	public Class239(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt7410 = arg1;
		this.anInt7413 = arg0;
		this.anIntArrayArrayArray7 = new int[this.anInt7413][3][arg2];
		this.aClass6_Sub15Array1 = new Class6_Sub15[this.anInt7410];
	}

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "(II)[[I")
	public int[][] method6263(@OriginalArg(0) int arg0) {
		if (this.anInt7410 == this.anInt7413) {
			this.aBoolean585 = this.aClass6_Sub15Array1[arg0] == null;
			this.aClass6_Sub15Array1[arg0] = Static605.aClass6_Sub15_1;
			return this.anIntArrayArrayArray7[arg0];
		} else if (this.anInt7413 == 1) {
			this.aBoolean585 = this.anInt7411 != arg0;
			this.anInt7411 = arg0;
			return this.anIntArrayArrayArray7[0];
		} else {
			@Pc(68) Class6_Sub15 local68 = this.aClass6_Sub15Array1[arg0];
			if (local68 == null) {
				this.aBoolean585 = true;
				if (this.anInt7413 > this.anInt7418) {
					local68 = new Class6_Sub15(arg0, this.anInt7418);
					this.anInt7418++;
				} else {
					@Pc(105) Class6_Sub15 local105 = (Class6_Sub15) this.aClass163_45.method4975();
					local68 = new Class6_Sub15(arg0, local105.anInt2630);
					this.aClass6_Sub15Array1[local105.anInt2629] = null;
					local105.method8792();
				}
				this.aClass6_Sub15Array1[arg0] = local68;
			} else {
				this.aBoolean585 = false;
			}
			this.aClass163_45.method4971(local68);
			return this.anIntArrayArrayArray7[local68.anInt2630];
		}
	}

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "(I)[[[I")
	public int[][][] method6265() {
		if (this.anInt7410 != this.anInt7413) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(29) int local29 = 0; local29 < this.anInt7413; local29++) {
			this.aClass6_Sub15Array1[local29] = Static605.aClass6_Sub15_1;
		}
		return this.anIntArrayArrayArray7;
	}

	@OriginalMember(owner = "client!oea", name = "b", descriptor = "(I)V")
	public void method6266() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt7413; local7++) {
			this.anIntArrayArrayArray7[local7][0] = null;
			this.anIntArrayArrayArray7[local7][1] = null;
			this.anIntArrayArrayArray7[local7][2] = null;
			this.anIntArrayArrayArray7[local7] = null;
		}
		this.anIntArrayArrayArray7 = null;
		this.aClass6_Sub15Array1 = null;
		this.aClass163_45.method4970();
		this.aClass163_45 = null;
	}
}
