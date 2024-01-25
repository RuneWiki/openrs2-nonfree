import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!f")
public final class Class58 {

	@OriginalMember(owner = "client!f", name = "f", descriptor = "I")
	private int anInt1901 = 0;

	@OriginalMember(owner = "client!f", name = "m", descriptor = "I")
	private int anInt1907 = -1;

	@OriginalMember(owner = "client!f", name = "l", descriptor = "Lclient!bd;")
	private Class18 aClass18_6 = new Class18();

	@OriginalMember(owner = "client!f", name = "s", descriptor = "Z")
	public boolean aBoolean126 = false;

	@OriginalMember(owner = "client!f", name = "e", descriptor = "I")
	private final int anInt1900;

	@OriginalMember(owner = "client!f", name = "b", descriptor = "I")
	private final int anInt1898;

	@OriginalMember(owner = "client!f", name = "o", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray2;

	@OriginalMember(owner = "client!f", name = "r", descriptor = "[Lclient!wq;")
	private Class14_Sub43[] aClass14_Sub43Array1;

	@OriginalMember(owner = "client!f", name = "<init>", descriptor = "(III)V")
	public Class58(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt1900 = arg1;
		this.anInt1898 = arg0;
		this.anIntArrayArrayArray2 = new int[this.anInt1898][3][arg2];
		this.aClass14_Sub43Array1 = new Class14_Sub43[this.anInt1900];
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(I)[[[I")
	public int[][][] method1953() {
		if (this.anInt1900 != this.anInt1898) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(22) int local22 = 0; local22 < this.anInt1898; local22++) {
			this.aClass14_Sub43Array1[local22] = Static286.aClass14_Sub43_1;
		}
		return this.anIntArrayArrayArray2;
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(IZ)[[I")
	public int[][] method1955(@OriginalArg(0) int arg0) {
		if (this.anInt1898 == this.anInt1900) {
			this.aBoolean126 = this.aClass14_Sub43Array1[arg0] == null;
			this.aClass14_Sub43Array1[arg0] = Static286.aClass14_Sub43_1;
			return this.anIntArrayArrayArray2[arg0];
		} else if (this.anInt1898 == 1) {
			this.aBoolean126 = this.anInt1907 != arg0;
			this.anInt1907 = arg0;
			return this.anIntArrayArrayArray2[0];
		} else {
			@Pc(65) Class14_Sub43 local65 = this.aClass14_Sub43Array1[arg0];
			if (local65 == null) {
				this.aBoolean126 = true;
				if (this.anInt1898 > this.anInt1901) {
					local65 = new Class14_Sub43(arg0, this.anInt1901);
					this.anInt1901++;
				} else {
					@Pc(101) Class14_Sub43 local101 = (Class14_Sub43) this.aClass18_6.method463();
					local65 = new Class14_Sub43(arg0, local101.anInt6719);
					this.aClass14_Sub43Array1[local101.anInt6721] = null;
					local101.method5986();
				}
				this.aClass14_Sub43Array1[arg0] = local65;
			} else {
				this.aBoolean126 = false;
			}
			this.aClass18_6.method456(local65);
			return this.anIntArrayArrayArray2[local65.anInt6719];
		}
	}

	@OriginalMember(owner = "client!f", name = "e", descriptor = "(I)V")
	public void method1960() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt1898; local7++) {
			this.anIntArrayArrayArray2[local7][0] = null;
			this.anIntArrayArrayArray2[local7][1] = null;
			this.anIntArrayArrayArray2[local7][2] = null;
			this.anIntArrayArrayArray2[local7] = null;
		}
		this.aClass14_Sub43Array1 = null;
		this.anIntArrayArrayArray2 = null;
		this.aClass18_6.method461();
		this.aClass18_6 = null;
	}
}
