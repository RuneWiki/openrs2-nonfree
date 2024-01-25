import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wp")
public final class Class264 {

	@OriginalMember(owner = "client!wp", name = "d", descriptor = "I")
	private int anInt7745 = -1;

	@OriginalMember(owner = "client!wp", name = "o", descriptor = "I")
	private int anInt7752 = 0;

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "Lclient!ko;")
	private Class142 aClass142_50 = new Class142();

	@OriginalMember(owner = "client!wp", name = "p", descriptor = "Z")
	public boolean aBoolean657 = false;

	@OriginalMember(owner = "client!wp", name = "g", descriptor = "I")
	private final int anInt7746;

	@OriginalMember(owner = "client!wp", name = "i", descriptor = "I")
	private final int anInt7747;

	@OriginalMember(owner = "client!wp", name = "m", descriptor = "[Lclient!iq;")
	private Class1_Sub20[] aClass1_Sub20Array1;

	@OriginalMember(owner = "client!wp", name = "f", descriptor = "[[I")
	private int[][] anIntArrayArray59;

	@OriginalMember(owner = "client!wp", name = "<init>", descriptor = "(III)V")
	public Class264(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt7746 = arg0;
		this.anInt7747 = arg1;
		this.aClass1_Sub20Array1 = new Class1_Sub20[this.anInt7747];
		this.anIntArrayArray59 = new int[this.anInt7746][arg2];
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(I)V")
	public void method5968() {
		for (@Pc(14) int local14 = 0; local14 < this.anInt7746; local14++) {
			this.anIntArrayArray59[local14] = null;
		}
		this.aClass1_Sub20Array1 = null;
		this.anIntArrayArray59 = null;
		this.aClass142_50.method3206();
		this.aClass142_50 = null;
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(ZI)[I")
	public int[] method5969(@OriginalArg(1) int arg0) {
		if (this.anInt7746 == this.anInt7747) {
			this.aBoolean657 = this.aClass1_Sub20Array1[arg0] == null;
			this.aClass1_Sub20Array1[arg0] = Static192.aClass1_Sub20_1;
			return this.anIntArrayArray59[arg0];
		} else if (this.anInt7746 == 1) {
			this.aBoolean657 = this.anInt7745 != arg0;
			this.anInt7745 = arg0;
			return this.anIntArrayArray59[0];
		} else {
			@Pc(67) Class1_Sub20 local67 = this.aClass1_Sub20Array1[arg0];
			if (local67 == null) {
				this.aBoolean657 = true;
				if (this.anInt7746 > this.anInt7752) {
					local67 = new Class1_Sub20(arg0, this.anInt7752);
					this.anInt7752++;
				} else {
					@Pc(98) Class1_Sub20 local98 = (Class1_Sub20) this.aClass142_50.method3202();
					local67 = new Class1_Sub20(arg0, local98.anInt3130);
					this.aClass1_Sub20Array1[local98.anInt3128] = null;
					local98.method5965();
				}
				this.aClass1_Sub20Array1[arg0] = local67;
			} else {
				this.aBoolean657 = false;
			}
			this.aClass142_50.method3207(local67);
			return this.anIntArrayArray59[local67.anInt3130];
		}
	}

	@OriginalMember(owner = "client!wp", name = "b", descriptor = "(I)[[I")
	public int[][] method5971() {
		if (this.anInt7746 != this.anInt7747) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(28) int local28 = 0; local28 < this.anInt7746; local28++) {
			this.aClass1_Sub20Array1[local28] = Static192.aClass1_Sub20_1;
		}
		return this.anIntArrayArray59;
	}
}
