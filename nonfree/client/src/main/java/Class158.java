import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mh")
public final class Class158 {

	@OriginalMember(owner = "client!mh", name = "d", descriptor = "I")
	private int anInt4509 = -1;

	@OriginalMember(owner = "client!mh", name = "l", descriptor = "I")
	private int anInt4513 = 0;

	@OriginalMember(owner = "client!mh", name = "i", descriptor = "Lclient!wl;")
	private Class265 aClass265_36 = new Class265();

	@OriginalMember(owner = "client!mh", name = "o", descriptor = "Z")
	public boolean aBoolean375 = false;

	@OriginalMember(owner = "client!mh", name = "f", descriptor = "I")
	private final int anInt4510;

	@OriginalMember(owner = "client!mh", name = "b", descriptor = "I")
	private final int anInt4507;

	@OriginalMember(owner = "client!mh", name = "h", descriptor = "[Lclient!jm;")
	private Class2_Sub22[] aClass2_Sub22Array1;

	@OriginalMember(owner = "client!mh", name = "e", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray11;

	@OriginalMember(owner = "client!mh", name = "<init>", descriptor = "(III)V")
	public Class158(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt4510 = arg1;
		this.anInt4507 = arg0;
		this.aClass2_Sub22Array1 = new Class2_Sub22[this.anInt4510];
		this.anIntArrayArrayArray11 = new int[this.anInt4507][3][arg2];
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(I)V")
	public void method3634() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt4507; local7++) {
			this.anIntArrayArrayArray11[local7][0] = null;
			this.anIntArrayArrayArray11[local7][1] = null;
			this.anIntArrayArrayArray11[local7][2] = null;
			this.anIntArrayArrayArray11[local7] = null;
		}
		this.anIntArrayArrayArray11 = null;
		this.aClass2_Sub22Array1 = null;
		this.aClass265_36.method6003();
		this.aClass265_36 = null;
	}

	@OriginalMember(owner = "client!mh", name = "c", descriptor = "(I)[[[I")
	public int[][][] method3636() {
		if (this.anInt4507 != this.anInt4510) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(21) int local21 = 0; local21 < this.anInt4507; local21++) {
			this.aClass2_Sub22Array1[local21] = Static100.aClass2_Sub22_24;
		}
		return this.anIntArrayArrayArray11;
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(II)[[I")
	public int[][] method3637(@OriginalArg(0) int arg0) {
		if (this.anInt4510 == this.anInt4507) {
			this.aBoolean375 = this.aClass2_Sub22Array1[arg0] == null;
			this.aClass2_Sub22Array1[arg0] = Static100.aClass2_Sub22_24;
			return this.anIntArrayArrayArray11[arg0];
		} else if (this.anInt4507 == 1) {
			this.aBoolean375 = arg0 != this.anInt4509;
			this.anInt4509 = arg0;
			return this.anIntArrayArrayArray11[0];
		} else {
			@Pc(66) Class2_Sub22 local66 = this.aClass2_Sub22Array1[arg0];
			if (local66 == null) {
				this.aBoolean375 = true;
				if (this.anInt4507 <= this.anInt4513) {
					@Pc(91) Class2_Sub22 local91 = (Class2_Sub22) this.aClass265_36.method6006();
					local66 = new Class2_Sub22(arg0, local91.anInt3767);
					this.aClass2_Sub22Array1[local91.anInt3768] = null;
					local91.method6072();
				} else {
					local66 = new Class2_Sub22(arg0, this.anInt4513);
					this.anInt4513++;
				}
				this.aClass2_Sub22Array1[arg0] = local66;
			} else {
				this.aBoolean375 = false;
			}
			this.aClass265_36.method5992(local66);
			return this.anIntArrayArrayArray11[local66.anInt3767];
		}
	}
}
