import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ud")
public final class Class89 {

	@OriginalMember(owner = "client!ud", name = "f", descriptor = "I")
	private int anInt4011 = -1;

	@OriginalMember(owner = "client!ud", name = "m", descriptor = "I")
	private int anInt4014 = 0;

	@OriginalMember(owner = "client!ud", name = "u", descriptor = "Lclient!of;")
	private Class70 aClass70_24 = new Class70();

	@OriginalMember(owner = "client!ud", name = "E", descriptor = "Z")
	public boolean aBoolean160 = false;

	@OriginalMember(owner = "client!ud", name = "d", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray9;

	@OriginalMember(owner = "client!ud", name = "c", descriptor = "I")
	private final int anInt4009;

	@OriginalMember(owner = "client!ud", name = "A", descriptor = "[Lclient!c;")
	private Class3_Sub6[] aClass3_Sub6Array1;

	@OriginalMember(owner = "client!ud", name = "D", descriptor = "I")
	private final int anInt4020;

	@OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(III)V")
	public Class89(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArrayArrayArray9 = new int[arg0][3][arg2];
		this.anInt4009 = arg0;
		this.aClass3_Sub6Array1 = new Class3_Sub6[arg1];
		this.anInt4020 = arg1;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(II)[[I")
	public int[][] method2876(@OriginalArg(1) int arg0) {
		if (this.anInt4009 == this.anInt4020) {
			this.aBoolean160 = this.aClass3_Sub6Array1[arg0] == null;
			this.aClass3_Sub6Array1[arg0] = Static63.aClass3_Sub6_1;
			return this.anIntArrayArrayArray9[arg0];
		} else if (this.anInt4009 == 1) {
			this.aBoolean160 = this.anInt4011 != arg0;
			this.anInt4011 = arg0;
			return this.anIntArrayArrayArray9[0];
		} else {
			@Pc(27) Class3_Sub6 local27 = this.aClass3_Sub6Array1[arg0];
			if (this.aBoolean160 = local27 == null) {
				if (this.anInt4009 <= this.anInt4014) {
					@Pc(47) Class3_Sub6 local47 = (Class3_Sub6) this.aClass70_24.method1956();
					local27 = new Class3_Sub6(arg0, local47.anInt462);
					this.aClass3_Sub6Array1[local47.anInt459] = null;
					local47.method3159();
				} else {
					local27 = new Class3_Sub6(arg0, this.anInt4014);
					this.anInt4014++;
				}
				this.aClass3_Sub6Array1[arg0] = local27;
			}
			this.aClass70_24.method1963(local27);
			return this.anIntArrayArrayArray9[local27.anInt462];
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(I)V")
	public void method2877() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt4009; local7++) {
			this.anIntArrayArrayArray9[local7][0] = null;
			this.anIntArrayArrayArray9[local7][1] = null;
			this.anIntArrayArrayArray9[local7][2] = null;
			this.anIntArrayArrayArray9[local7] = null;
		}
		this.anIntArrayArrayArray9 = null;
		this.aClass3_Sub6Array1 = null;
		this.aClass70_24.method1954();
		this.aClass70_24 = null;
	}

	@OriginalMember(owner = "client!ud", name = "b", descriptor = "(I)[[[I")
	public int[][][] method2878() {
		if (this.anInt4009 != this.anInt4020) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(26) int local26 = 0; local26 < this.anInt4009; local26++) {
			this.aClass3_Sub6Array1[local26] = Static63.aClass3_Sub6_1;
		}
		return this.anIntArrayArrayArray9;
	}
}
