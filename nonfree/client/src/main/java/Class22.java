import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!e")
public final class Class22 {

	@OriginalMember(owner = "client!e", name = "l", descriptor = "I")
	private int anInt1022 = 0;

	@OriginalMember(owner = "client!e", name = "n", descriptor = "I")
	private int anInt1024 = -1;

	@OriginalMember(owner = "client!e", name = "i", descriptor = "Lclient!ea;")
	private Class23 aClass23_4 = new Class23();

	@OriginalMember(owner = "client!e", name = "q", descriptor = "Z")
	public boolean aBoolean53 = false;

	@OriginalMember(owner = "client!e", name = "b", descriptor = "I")
	private final int anInt1017;

	@OriginalMember(owner = "client!e", name = "j", descriptor = "[[I")
	private int[][] anIntArrayArray13;

	@OriginalMember(owner = "client!e", name = "c", descriptor = "I")
	private final int anInt1018;

	@OriginalMember(owner = "client!e", name = "o", descriptor = "[Lclient!ic;")
	private Class3_Sub10[] aClass3_Sub10Array1;

	@OriginalMember(owner = "client!e", name = "<init>", descriptor = "(III)V")
	public Class22(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt1017 = arg1;
		this.anIntArrayArray13 = new int[arg0][arg2];
		this.anInt1018 = arg0;
		this.aClass3_Sub10Array1 = new Class3_Sub10[arg1];
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(I)V")
	public void method844() {
		for (@Pc(13) int local13 = 0; local13 < this.anInt1018; local13++) {
			this.anIntArrayArray13[local13] = null;
		}
		this.anIntArrayArray13 = null;
		this.aClass3_Sub10Array1 = null;
		this.aClass23_4.method863();
		this.aClass23_4 = null;
	}

	@OriginalMember(owner = "client!e", name = "c", descriptor = "(I)[[I")
	public int[][] method847() {
		if (this.anInt1018 != this.anInt1017) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(26) int local26 = 0; local26 < this.anInt1018; local26++) {
			this.aClass3_Sub10Array1[local26] = Static123.aClass3_Sub10_1;
		}
		return this.anIntArrayArray13;
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(II)[I")
	public int[] method849(@OriginalArg(1) int arg0) {
		if (this.anInt1018 == this.anInt1017) {
			this.aBoolean53 = this.aClass3_Sub10Array1[arg0] == null;
			this.aClass3_Sub10Array1[arg0] = Static123.aClass3_Sub10_1;
			return this.anIntArrayArray13[arg0];
		} else if (this.anInt1018 == 1) {
			this.aBoolean53 = this.anInt1024 != arg0;
			this.anInt1024 = arg0;
			return this.anIntArrayArray13[0];
		} else {
			@Pc(49) Class3_Sub10 local49 = this.aClass3_Sub10Array1[arg0];
			if (this.aBoolean53 = local49 == null) {
				if (this.anInt1018 > this.anInt1022) {
					local49 = new Class3_Sub10(arg0, this.anInt1022);
					this.anInt1022++;
				} else {
					@Pc(84) Class3_Sub10 local84 = (Class3_Sub10) this.aClass23_4.method857();
					local49 = new Class3_Sub10(arg0, local84.anInt2021);
					this.aClass3_Sub10Array1[local84.anInt2019] = null;
					local84.method3167();
				}
				this.aClass3_Sub10Array1[arg0] = local49;
			}
			this.aClass23_4.method859(local49);
			return this.anIntArrayArray13[local49.anInt2021];
		}
	}
}
