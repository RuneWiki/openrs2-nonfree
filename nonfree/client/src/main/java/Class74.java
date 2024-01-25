import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!et")
public final class Class74 {

	@OriginalMember(owner = "client!et", name = "p", descriptor = "I")
	private int anInt1657 = -1;

	@OriginalMember(owner = "client!et", name = "i", descriptor = "I")
	private int anInt1651 = 0;

	@OriginalMember(owner = "client!et", name = "d", descriptor = "Lclient!at;")
	private Class17 aClass17_13 = new Class17();

	@OriginalMember(owner = "client!et", name = "v", descriptor = "Z")
	public boolean aBoolean145 = false;

	@OriginalMember(owner = "client!et", name = "n", descriptor = "I")
	private final int anInt1656;

	@OriginalMember(owner = "client!et", name = "e", descriptor = "I")
	private final int anInt1648;

	@OriginalMember(owner = "client!et", name = "g", descriptor = "[[I")
	private int[][] anIntArrayArray24;

	@OriginalMember(owner = "client!et", name = "c", descriptor = "[Lclient!dn;")
	private Class1_Sub9[] aClass1_Sub9Array1;

	@OriginalMember(owner = "client!et", name = "<init>", descriptor = "(III)V")
	public Class74(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt1656 = arg0;
		this.anInt1648 = arg1;
		this.anIntArrayArray24 = new int[this.anInt1656][arg2];
		this.aClass1_Sub9Array1 = new Class1_Sub9[this.anInt1648];
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(Z)V")
	public void method1348() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt1656; local7++) {
			this.anIntArrayArray24[local7] = null;
		}
		this.anIntArrayArray24 = null;
		this.aClass1_Sub9Array1 = null;
		this.aClass17_13.method205();
		this.aClass17_13 = null;
	}

	@OriginalMember(owner = "client!et", name = "b", descriptor = "(I)[[I")
	public int[][] method1352() {
		if (this.anInt1656 != this.anInt1648) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(21) int local21 = 0; local21 < this.anInt1656; local21++) {
			this.aClass1_Sub9Array1[local21] = Static240.aClass1_Sub9_1;
		}
		return this.anIntArrayArray24;
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(ZI)[I")
	public int[] method1354(@OriginalArg(1) int arg0) {
		if (this.anInt1656 == this.anInt1648) {
			this.aBoolean145 = this.aClass1_Sub9Array1[arg0] == null;
			this.aClass1_Sub9Array1[arg0] = Static240.aClass1_Sub9_1;
			return this.anIntArrayArray24[arg0];
		} else if (this.anInt1656 == 1) {
			this.aBoolean145 = this.anInt1657 != arg0;
			this.anInt1657 = arg0;
			return this.anIntArrayArray24[0];
		} else {
			@Pc(65) Class1_Sub9 local65 = this.aClass1_Sub9Array1[arg0];
			if (local65 == null) {
				this.aBoolean145 = true;
				if (this.anInt1651 >= this.anInt1656) {
					@Pc(85) Class1_Sub9 local85 = (Class1_Sub9) this.aClass17_13.method200();
					local65 = new Class1_Sub9(arg0, local85.anInt1385);
					this.aClass1_Sub9Array1[local85.anInt1388] = null;
					local85.method5577();
				} else {
					local65 = new Class1_Sub9(arg0, this.anInt1651);
					this.anInt1651++;
				}
				this.aClass1_Sub9Array1[arg0] = local65;
			} else {
				this.aBoolean145 = false;
			}
			this.aClass17_13.method211(local65);
			return this.anIntArrayArray24[local65.anInt1385];
		}
	}
}
