import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bi")
public final class Class16 {

	@OriginalMember(owner = "client!bi", name = "f", descriptor = "I")
	private int anInt408 = 0;

	@OriginalMember(owner = "client!bi", name = "k", descriptor = "I")
	private int anInt410 = -1;

	@OriginalMember(owner = "client!bi", name = "m", descriptor = "Lclient!he;")
	private Class44 aClass44_6 = new Class44();

	@OriginalMember(owner = "client!bi", name = "u", descriptor = "Z")
	public boolean aBoolean12 = false;

	@OriginalMember(owner = "client!bi", name = "o", descriptor = "I")
	private int anInt412;

	@OriginalMember(owner = "client!bi", name = "e", descriptor = "[[I")
	private int[][] anIntArrayArray7;

	@OriginalMember(owner = "client!bi", name = "q", descriptor = "I")
	private int anInt413;

	@OriginalMember(owner = "client!bi", name = "i", descriptor = "[Lclient!wj;")
	private Class2_Sub28[] aClass2_Sub28Array1;

	@OriginalMember(owner = "client!bi", name = "<init>", descriptor = "(III)V")
	public Class16(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt412 = arg0;
		this.anIntArrayArray7 = new int[this.anInt412][arg2];
		this.anInt413 = arg1;
		this.aClass2_Sub28Array1 = new Class2_Sub28[this.anInt413];
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(B)[[I")
	public int[][] method299() {
		if (this.anInt412 != this.anInt413) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(25) int local25 = 0; local25 < this.anInt412; local25++) {
			this.aClass2_Sub28Array1[local25] = Static85.aClass2_Sub28_1;
		}
		return this.anIntArrayArray7;
	}

	@OriginalMember(owner = "client!bi", name = "b", descriptor = "(BI)[I")
	public int[] method300(@OriginalArg(1) int arg0) {
		if (this.anInt412 == this.anInt413) {
			this.aBoolean12 = this.aClass2_Sub28Array1[arg0] == null;
			this.aClass2_Sub28Array1[arg0] = Static85.aClass2_Sub28_1;
			return this.anIntArrayArray7[arg0];
		} else if (this.anInt412 == 1) {
			this.aBoolean12 = arg0 != this.anInt410;
			this.anInt410 = arg0;
			return this.anIntArrayArray7[0];
		} else {
			@Pc(44) Class2_Sub28 local44 = this.aClass2_Sub28Array1[arg0];
			if (local44 == null) {
				this.aBoolean12 = true;
				if (this.anInt412 <= this.anInt408) {
					@Pc(65) Class2_Sub28 local65 = (Class2_Sub28) this.aClass44_6.method1366();
					local44 = new Class2_Sub28(arg0, local65.anInt4916);
					this.aClass2_Sub28Array1[local65.anInt4920] = null;
					local65.method3986();
				} else {
					local44 = new Class2_Sub28(arg0, this.anInt408);
					this.anInt408++;
				}
				this.aClass2_Sub28Array1[arg0] = local44;
			} else {
				this.aBoolean12 = false;
			}
			this.aClass44_6.method1354(local44);
			return this.anIntArrayArray7[local44.anInt4916];
		}
	}

	@OriginalMember(owner = "client!bi", name = "b", descriptor = "(B)V")
	public void method301() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt412; local7++) {
			this.anIntArrayArray7[local7] = null;
		}
		this.anIntArrayArray7 = null;
		this.aClass2_Sub28Array1 = null;
		this.aClass44_6.method1362();
		this.aClass44_6 = null;
	}
}
