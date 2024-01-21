import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lc")
public final class Class39 {

	@OriginalMember(owner = "client!lc", name = "e", descriptor = "I")
	private int anInt2628 = 0;

	@OriginalMember(owner = "client!lc", name = "r", descriptor = "I")
	private int anInt2635 = -1;

	@OriginalMember(owner = "client!lc", name = "i", descriptor = "Lclient!pg;")
	private Class59 aClass59_38 = new Class59();

	@OriginalMember(owner = "client!lc", name = "A", descriptor = "Z")
	public boolean aBoolean110 = false;

	@OriginalMember(owner = "client!lc", name = "m", descriptor = "[Lclient!nd;")
	private Class1_Sub17[] aClass1_Sub17Array1;

	@OriginalMember(owner = "client!lc", name = "z", descriptor = "I")
	private final int anInt2638;

	@OriginalMember(owner = "client!lc", name = "o", descriptor = "I")
	private final int anInt2633;

	@OriginalMember(owner = "client!lc", name = "u", descriptor = "[[I")
	private int[][] anIntArrayArray78;

	@OriginalMember(owner = "client!lc", name = "<init>", descriptor = "(III)V")
	public Class39(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass1_Sub17Array1 = new Class1_Sub17[arg1];
		this.anInt2638 = arg1;
		this.anInt2633 = arg0;
		this.anIntArrayArray78 = new int[arg0][arg2];
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(IZ)[I")
	public int[] method1880(@OriginalArg(0) int arg0) {
		if (this.anInt2638 == this.anInt2633) {
			this.aBoolean110 = this.aClass1_Sub17Array1[arg0] == null;
			this.aClass1_Sub17Array1[arg0] = Static45.aClass1_Sub17_1;
			return this.anIntArrayArray78[arg0];
		} else if (this.anInt2633 == 1) {
			this.aBoolean110 = this.anInt2635 != arg0;
			this.anInt2635 = arg0;
			return this.anIntArrayArray78[0];
		} else {
			@Pc(23) Class1_Sub17 local23 = this.aClass1_Sub17Array1[arg0];
			if (this.aBoolean110 = local23 == null) {
				if (this.anInt2633 <= this.anInt2628) {
					@Pc(47) Class1_Sub17 local47 = (Class1_Sub17) this.aClass59_38.method2419();
					local23 = new Class1_Sub17(arg0, local47.anInt3068);
					this.aClass1_Sub17Array1[local47.anInt3063] = null;
					local47.method3198();
				} else {
					local23 = new Class1_Sub17(arg0, this.anInt2628);
					this.anInt2628++;
				}
				this.aClass1_Sub17Array1[arg0] = local23;
			}
			this.aClass59_38.method2412(local23);
			return this.anIntArrayArray78[local23.anInt3068];
		}
	}

	@OriginalMember(owner = "client!lc", name = "c", descriptor = "(I)[[I")
	public int[][] method1884() {
		if (this.anInt2638 != this.anInt2633) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(26) int local26 = 0; local26 < this.anInt2633; local26++) {
			this.aClass1_Sub17Array1[local26] = Static45.aClass1_Sub17_1;
		}
		return this.anIntArrayArray78;
	}

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "(B)V")
	public void method1888() {
		for (@Pc(11) int local11 = 0; local11 < this.anInt2633; local11++) {
			this.anIntArrayArray78[local11] = null;
		}
		this.aClass1_Sub17Array1 = null;
		this.anIntArrayArray78 = null;
		this.aClass59_38.method2416();
		this.aClass59_38 = null;
	}
}
