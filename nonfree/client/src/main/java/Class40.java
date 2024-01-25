import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bu")
public final class Class40 {

	@OriginalMember(owner = "client!bu", name = "h", descriptor = "I")
	private int anInt1557 = 0;

	@OriginalMember(owner = "client!bu", name = "g", descriptor = "I")
	private int anInt1556 = -1;

	@OriginalMember(owner = "client!bu", name = "m", descriptor = "Lclient!mr;")
	private Class223 aClass223_7 = new Class223();

	@OriginalMember(owner = "client!bu", name = "o", descriptor = "Z")
	public boolean aBoolean97 = false;

	@OriginalMember(owner = "client!bu", name = "b", descriptor = "I")
	private final int anInt1553;

	@OriginalMember(owner = "client!bu", name = "j", descriptor = "I")
	private final int anInt1559;

	@OriginalMember(owner = "client!bu", name = "k", descriptor = "[Lclient!aba;")
	private Class3_Sub1[] aClass3_Sub1Array1;

	@OriginalMember(owner = "client!bu", name = "e", descriptor = "[[I")
	private int[][] anIntArrayArray6;

	@OriginalMember(owner = "client!bu", name = "<init>", descriptor = "(III)V")
	public Class40(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt1553 = arg1;
		this.anInt1559 = arg0;
		this.aClass3_Sub1Array1 = new Class3_Sub1[this.anInt1553];
		this.anIntArrayArray6 = new int[this.anInt1559][arg2];
	}

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(I)V")
	public void method1568() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt1559; local3++) {
			this.anIntArrayArray6[local3] = null;
		}
		this.aClass3_Sub1Array1 = null;
		this.anIntArrayArray6 = null;
		this.aClass223_7.method5862();
		this.aClass223_7 = null;
	}

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(B)[[I")
	public int[][] method1571() {
		if (this.anInt1553 != this.anInt1559) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(29) int local29 = 0; local29 < this.anInt1559; local29++) {
			this.aClass3_Sub1Array1[local29] = Static622.aClass3_Sub1_1;
		}
		return this.anIntArrayArray6;
	}

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(II)[I")
	public int[] method1572(@OriginalArg(1) int arg0) {
		if (this.anInt1559 == this.anInt1553) {
			this.aBoolean97 = this.aClass3_Sub1Array1[arg0] == null;
			this.aClass3_Sub1Array1[arg0] = Static622.aClass3_Sub1_1;
			return this.anIntArrayArray6[arg0];
		} else if (this.anInt1559 == 1) {
			this.aBoolean97 = arg0 != this.anInt1556;
			this.anInt1556 = arg0;
			return this.anIntArrayArray6[0];
		} else {
			@Pc(51) Class3_Sub1 local51 = this.aClass3_Sub1Array1[arg0];
			if (local51 == null) {
				this.aBoolean97 = true;
				if (this.anInt1557 >= this.anInt1559) {
					@Pc(71) Class3_Sub1 local71 = (Class3_Sub1) this.aClass223_7.method5873();
					local51 = new Class3_Sub1(arg0, local71.anInt14);
					this.aClass3_Sub1Array1[local71.anInt13] = null;
					local71.method8769();
				} else {
					local51 = new Class3_Sub1(arg0, this.anInt1557);
					this.anInt1557++;
				}
				this.aClass3_Sub1Array1[arg0] = local51;
			} else {
				this.aBoolean97 = false;
			}
			this.aClass223_7.method5867(local51);
			return this.anIntArrayArray6[local51.anInt14];
		}
	}
}
