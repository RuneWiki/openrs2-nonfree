import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kb")
public final class Class46 {

	@OriginalMember(owner = "client!kb", name = "k", descriptor = "I")
	private int anInt1826 = -1;

	@OriginalMember(owner = "client!kb", name = "n", descriptor = "I")
	private int anInt1827 = 0;

	@OriginalMember(owner = "client!kb", name = "g", descriptor = "Lclient!sc;")
	private Class72 aClass72_25 = new Class72();

	@OriginalMember(owner = "client!kb", name = "w", descriptor = "Z")
	public boolean aBoolean117 = false;

	@OriginalMember(owner = "client!kb", name = "v", descriptor = "I")
	private final int anInt1830;

	@OriginalMember(owner = "client!kb", name = "p", descriptor = "[Lclient!fb;")
	private Class3_Sub11[] aClass3_Sub11Array1;

	@OriginalMember(owner = "client!kb", name = "r", descriptor = "I")
	private final int anInt1828;

	@OriginalMember(owner = "client!kb", name = "e", descriptor = "[[I")
	private int[][] anIntArrayArray15;

	@OriginalMember(owner = "client!kb", name = "<init>", descriptor = "(III)V")
	public Class46(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt1830 = arg0;
		this.aClass3_Sub11Array1 = new Class3_Sub11[arg1];
		this.anInt1828 = arg1;
		this.anIntArrayArray15 = new int[arg0][arg2];
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(I)V")
	public void method1412() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt1830; local7++) {
			this.anIntArrayArray15[local7] = null;
		}
		this.aClass3_Sub11Array1 = null;
		this.anIntArrayArray15 = null;
		this.aClass72_25.method2396();
		this.aClass72_25 = null;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(II)[I")
	public int[] method1416(@OriginalArg(0) int arg0) {
		if (this.anInt1830 == this.anInt1828) {
			this.aBoolean117 = this.aClass3_Sub11Array1[arg0] == null;
			this.aClass3_Sub11Array1[arg0] = Static65.aClass3_Sub11_1;
			return this.anIntArrayArray15[arg0];
		} else if (this.anInt1830 == 1) {
			this.aBoolean117 = arg0 != this.anInt1826;
			this.anInt1826 = arg0;
			return this.anIntArrayArray15[0];
		} else {
			@Pc(49) Class3_Sub11 local49 = this.aClass3_Sub11Array1[arg0];
			if (this.aBoolean117 = local49 == null) {
				if (this.anInt1830 > this.anInt1827) {
					local49 = new Class3_Sub11(arg0, this.anInt1827);
					this.anInt1827++;
				} else {
					@Pc(84) Class3_Sub11 local84 = (Class3_Sub11) this.aClass72_25.method2403();
					local49 = new Class3_Sub11(arg0, local84.anInt1021);
					this.aClass3_Sub11Array1[local84.anInt1020] = null;
					local84.method2783();
				}
				this.aClass3_Sub11Array1[arg0] = local49;
			}
			this.aClass72_25.method2397(local49);
			return this.anIntArrayArray15[local49.anInt1021];
		}
	}

	@OriginalMember(owner = "client!kb", name = "c", descriptor = "(I)[[I")
	public int[][] method1417() {
		if (this.anInt1830 != this.anInt1828) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(29) int local29 = 0; local29 < this.anInt1830; local29++) {
			this.aClass3_Sub11Array1[local29] = Static65.aClass3_Sub11_1;
		}
		return this.anIntArrayArray15;
	}
}
