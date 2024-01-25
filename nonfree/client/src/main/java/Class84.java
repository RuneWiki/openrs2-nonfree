import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hn")
public final class Class84 {

	@OriginalMember(owner = "client!hn", name = "n", descriptor = "I")
	private int anInt2498 = -1;

	@OriginalMember(owner = "client!hn", name = "m", descriptor = "I")
	private int anInt2497 = 0;

	@OriginalMember(owner = "client!hn", name = "o", descriptor = "Lclient!tc;")
	private Class195 aClass195_29 = new Class195();

	@OriginalMember(owner = "client!hn", name = "q", descriptor = "Z")
	public boolean aBoolean227 = false;

	@OriginalMember(owner = "client!hn", name = "k", descriptor = "I")
	private final int anInt2495;

	@OriginalMember(owner = "client!hn", name = "b", descriptor = "I")
	private final int anInt2489;

	@OriginalMember(owner = "client!hn", name = "j", descriptor = "[[I")
	private int[][] anIntArrayArray26;

	@OriginalMember(owner = "client!hn", name = "g", descriptor = "[Lclient!al;")
	private Class1_Sub3[] aClass1_Sub3Array1;

	@OriginalMember(owner = "client!hn", name = "<init>", descriptor = "(III)V")
	public Class84(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt2495 = arg0;
		this.anInt2489 = arg1;
		this.anIntArrayArray26 = new int[this.anInt2495][arg2];
		this.aClass1_Sub3Array1 = new Class1_Sub3[this.anInt2489];
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(I)[[I")
	public int[][] method2421() {
		if (this.anInt2489 != this.anInt2495) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(17) int local17 = 0; local17 < this.anInt2495; local17++) {
			this.aClass1_Sub3Array1[local17] = Static242.aClass1_Sub3_1;
		}
		return this.anIntArrayArray26;
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(BI)[I")
	public int[] method2422(@OriginalArg(1) int arg0) {
		if (this.anInt2495 == this.anInt2489) {
			this.aBoolean227 = this.aClass1_Sub3Array1[arg0] == null;
			this.aClass1_Sub3Array1[arg0] = Static242.aClass1_Sub3_1;
			return this.anIntArrayArray26[arg0];
		} else if (this.anInt2495 == 1) {
			this.aBoolean227 = this.anInt2498 != arg0;
			this.anInt2498 = arg0;
			return this.anIntArrayArray26[0];
		} else {
			@Pc(46) Class1_Sub3 local46 = this.aClass1_Sub3Array1[arg0];
			if (local46 == null) {
				this.aBoolean227 = true;
				if (this.anInt2497 < this.anInt2495) {
					local46 = new Class1_Sub3(arg0, this.anInt2497);
					this.anInt2497++;
				} else {
					@Pc(82) Class1_Sub3 local82 = (Class1_Sub3) this.aClass195_29.method5030();
					local46 = new Class1_Sub3(arg0, local82.anInt258);
					this.aClass1_Sub3Array1[local82.anInt261] = null;
					local82.method5710();
				}
				this.aClass1_Sub3Array1[arg0] = local46;
			} else {
				this.aBoolean227 = false;
			}
			this.aClass195_29.method5024(local46);
			return this.anIntArrayArray26[local46.anInt258];
		}
	}

	@OriginalMember(owner = "client!hn", name = "c", descriptor = "(B)V")
	public void method2425() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt2495; local7++) {
			this.anIntArrayArray26[local7] = null;
		}
		this.anIntArrayArray26 = null;
		this.aClass1_Sub3Array1 = null;
		this.aClass195_29.method5032();
		this.aClass195_29 = null;
	}
}
