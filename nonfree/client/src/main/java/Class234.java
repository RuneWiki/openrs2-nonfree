import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!td")
public final class Class234 {

	@OriginalMember(owner = "client!td", name = "e", descriptor = "I")
	private int anInt6703 = -1;

	@OriginalMember(owner = "client!td", name = "k", descriptor = "I")
	private int anInt6707 = 0;

	@OriginalMember(owner = "client!td", name = "a", descriptor = "Lclient!nj;")
	private Class181 aClass181_44 = new Class181();

	@OriginalMember(owner = "client!td", name = "o", descriptor = "Z")
	public boolean aBoolean454 = false;

	@OriginalMember(owner = "client!td", name = "h", descriptor = "I")
	private final int anInt6705;

	@OriginalMember(owner = "client!td", name = "m", descriptor = "I")
	private final int anInt6709;

	@OriginalMember(owner = "client!td", name = "b", descriptor = "[[I")
	private int[][] anIntArrayArray163;

	@OriginalMember(owner = "client!td", name = "j", descriptor = "[Lclient!jc;")
	private Class2_Sub20[] aClass2_Sub20Array1;

	@OriginalMember(owner = "client!td", name = "<init>", descriptor = "(III)V")
	public Class234(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt6705 = arg0;
		this.anInt6709 = arg1;
		this.anIntArrayArray163 = new int[this.anInt6705][arg2];
		this.aClass2_Sub20Array1 = new Class2_Sub20[this.anInt6709];
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(Z)V")
	public void method5372() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt6705; local7++) {
			this.anIntArrayArray163[local7] = null;
		}
		this.anIntArrayArray163 = null;
		this.aClass2_Sub20Array1 = null;
		this.aClass181_44.method3969();
		this.aClass181_44 = null;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(I)[[I")
	public int[][] method5373() {
		if (this.anInt6709 != this.anInt6705) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(21) int local21 = 0; local21 < this.anInt6705; local21++) {
			this.aClass2_Sub20Array1[local21] = Static178.aClass2_Sub20_1;
		}
		return this.anIntArrayArray163;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(BI)[I")
	public int[] method5375(@OriginalArg(1) int arg0) {
		if (this.anInt6709 == this.anInt6705) {
			this.aBoolean454 = this.aClass2_Sub20Array1[arg0] == null;
			this.aClass2_Sub20Array1[arg0] = Static178.aClass2_Sub20_1;
			return this.anIntArrayArray163[arg0];
		} else if (this.anInt6705 == 1) {
			this.aBoolean454 = arg0 != this.anInt6703;
			this.anInt6703 = arg0;
			return this.anIntArrayArray163[0];
		} else {
			@Pc(48) Class2_Sub20 local48 = this.aClass2_Sub20Array1[arg0];
			if (local48 == null) {
				this.aBoolean454 = true;
				if (this.anInt6705 > this.anInt6707) {
					local48 = new Class2_Sub20(arg0, this.anInt6707);
					this.anInt6707++;
				} else {
					@Pc(83) Class2_Sub20 local83 = (Class2_Sub20) this.aClass181_44.method3974();
					local48 = new Class2_Sub20(arg0, local83.anInt3354);
					this.aClass2_Sub20Array1[local83.anInt3352] = null;
					local83.method6260();
				}
				this.aClass2_Sub20Array1[arg0] = local48;
			} else {
				this.aBoolean454 = false;
			}
			this.aClass181_44.method3965(local48);
			return this.anIntArrayArray163[local48.anInt3354];
		}
	}
}
