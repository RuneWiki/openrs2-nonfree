import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ab")
public final class Class3 {

	@OriginalMember(owner = "client!ab", name = "e", descriptor = "I")
	private int anInt106 = -1;

	@OriginalMember(owner = "client!ab", name = "h", descriptor = "I")
	private int anInt107 = 0;

	@OriginalMember(owner = "client!ab", name = "g", descriptor = "Lclient!cb;")
	private Class10 aClass10_5 = new Class10();

	@OriginalMember(owner = "client!ab", name = "v", descriptor = "Z")
	public boolean aBoolean5 = false;

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "[[I")
	private int[][] anIntArrayArray2;

	@OriginalMember(owner = "client!ab", name = "o", descriptor = "[Lclient!na;")
	private Class2_Sub17[] aClass2_Sub17Array1;

	@OriginalMember(owner = "client!ab", name = "k", descriptor = "I")
	private final int anInt110;

	@OriginalMember(owner = "client!ab", name = "c", descriptor = "I")
	private final int anInt104;

	@OriginalMember(owner = "client!ab", name = "<init>", descriptor = "(III)V")
	public Class3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArrayArray2 = new int[arg0][arg2];
		this.aClass2_Sub17Array1 = new Class2_Sub17[arg1];
		this.anInt110 = arg1;
		this.anInt104 = arg0;
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(BI)[I")
	public int[] method62(@OriginalArg(1) int arg0) {
		if (this.anInt104 == this.anInt110) {
			this.aBoolean5 = this.aClass2_Sub17Array1[arg0] == null;
			this.aClass2_Sub17Array1[arg0] = Static57.aClass2_Sub17_39;
			return this.anIntArrayArray2[arg0];
		} else if (this.anInt104 == 1) {
			this.aBoolean5 = this.anInt106 != arg0;
			this.anInt106 = arg0;
			return this.anIntArrayArray2[0];
		} else {
			@Pc(27) Class2_Sub17 local27 = this.aClass2_Sub17Array1[arg0];
			if (this.aBoolean5 = local27 == null) {
				if (this.anInt107 < this.anInt104) {
					local27 = new Class2_Sub17(arg0, this.anInt107);
					this.anInt107++;
				} else {
					@Pc(62) Class2_Sub17 local62 = (Class2_Sub17) this.aClass10_5.method446();
					local27 = new Class2_Sub17(arg0, local62.anInt2516);
					this.aClass2_Sub17Array1[local62.anInt2512] = null;
					local62.method3004();
				}
				this.aClass2_Sub17Array1[arg0] = local27;
			}
			this.aClass10_5.method447(local27);
			return this.anIntArrayArray2[local27.anInt2516];
		}
	}

	@OriginalMember(owner = "client!ab", name = "c", descriptor = "(I)[[I")
	public int[][] method68() {
		if (this.anInt104 != this.anInt110) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(25) int local25 = 0; local25 < this.anInt104; local25++) {
			this.aClass2_Sub17Array1[local25] = Static57.aClass2_Sub17_39;
		}
		return this.anIntArrayArray2;
	}

	@OriginalMember(owner = "client!ab", name = "d", descriptor = "(I)V")
	public void method69() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt104; local7++) {
			this.anIntArrayArray2[local7] = null;
		}
		this.aClass2_Sub17Array1 = null;
		this.anIntArrayArray2 = null;
		this.aClass10_5.method454();
		this.aClass10_5 = null;
	}
}
