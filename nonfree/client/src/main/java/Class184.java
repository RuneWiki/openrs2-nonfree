import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ki")
public final class Class184 {

	@OriginalMember(owner = "client!ki", name = "l", descriptor = "I")
	private int anInt5344 = -1;

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "I")
	private int anInt5335 = 0;

	@OriginalMember(owner = "client!ki", name = "m", descriptor = "Lclient!mfa;")
	private Class211 aClass211_37 = new Class211();

	@OriginalMember(owner = "client!ki", name = "p", descriptor = "Z")
	public boolean aBoolean402 = false;

	@OriginalMember(owner = "client!ki", name = "h", descriptor = "I")
	private final int anInt5341;

	@OriginalMember(owner = "client!ki", name = "f", descriptor = "I")
	private final int anInt5340;

	@OriginalMember(owner = "client!ki", name = "k", descriptor = "[Lclient!rk;")
	private Class6_Sub40[] aClass6_Sub40Array1;

	@OriginalMember(owner = "client!ki", name = "g", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray5;

	@OriginalMember(owner = "client!ki", name = "<init>", descriptor = "(III)V")
	public Class184(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt5341 = arg0;
		this.anInt5340 = arg1;
		this.aClass6_Sub40Array1 = new Class6_Sub40[this.anInt5340];
		this.anIntArrayArrayArray5 = new int[this.anInt5341][3][arg2];
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(II)[[I")
	public int[][] method4578(@OriginalArg(1) int arg0) {
		if (this.anInt5341 == this.anInt5340) {
			this.aBoolean402 = this.aClass6_Sub40Array1[arg0] == null;
			this.aClass6_Sub40Array1[arg0] = Static47.aClass6_Sub40_1;
			return this.anIntArrayArrayArray5[arg0];
		} else if (this.anInt5341 == 1) {
			this.aBoolean402 = arg0 != this.anInt5344;
			this.anInt5344 = arg0;
			return this.anIntArrayArrayArray5[0];
		} else {
			@Pc(27) Class6_Sub40 local27 = this.aClass6_Sub40Array1[arg0];
			if (local27 == null) {
				this.aBoolean402 = true;
				if (this.anInt5341 <= this.anInt5335) {
					@Pc(48) Class6_Sub40 local48 = (Class6_Sub40) this.aClass211_37.method5184();
					local27 = new Class6_Sub40(arg0, local48.anInt8176);
					this.aClass6_Sub40Array1[local48.anInt8178] = null;
					local48.method8151();
				} else {
					local27 = new Class6_Sub40(arg0, this.anInt5335);
					this.anInt5335++;
				}
				this.aClass6_Sub40Array1[arg0] = local27;
			} else {
				this.aBoolean402 = false;
			}
			this.aClass211_37.method5178(local27);
			return this.anIntArrayArrayArray5[local27.anInt8176];
		}
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(B)[[[I")
	public int[][][] method4581() {
		if (this.anInt5340 != this.anInt5341) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(29) int local29 = 0; local29 < this.anInt5341; local29++) {
			this.aClass6_Sub40Array1[local29] = Static47.aClass6_Sub40_1;
		}
		return this.anIntArrayArrayArray5;
	}

	@OriginalMember(owner = "client!ki", name = "b", descriptor = "(I)V")
	public void method4584() {
		for (@Pc(11) int local11 = 0; local11 < this.anInt5341; local11++) {
			this.anIntArrayArrayArray5[local11][0] = null;
			this.anIntArrayArrayArray5[local11][1] = null;
			this.anIntArrayArrayArray5[local11][2] = null;
			this.anIntArrayArrayArray5[local11] = null;
		}
		this.anIntArrayArrayArray5 = null;
		this.aClass6_Sub40Array1 = null;
		this.aClass211_37.method5179();
		this.aClass211_37 = null;
	}
}
