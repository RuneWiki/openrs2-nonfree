import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ug")
public final class Class239 {

	@OriginalMember(owner = "client!ug", name = "h", descriptor = "I")
	private int anInt6829 = 0;

	@OriginalMember(owner = "client!ug", name = "m", descriptor = "I")
	private int anInt6833 = -1;

	@OriginalMember(owner = "client!ug", name = "i", descriptor = "Lclient!nv;")
	private Class177 aClass177_45 = new Class177();

	@OriginalMember(owner = "client!ug", name = "p", descriptor = "Z")
	public boolean aBoolean460 = false;

	@OriginalMember(owner = "client!ug", name = "g", descriptor = "I")
	private final int anInt6828;

	@OriginalMember(owner = "client!ug", name = "n", descriptor = "I")
	private final int anInt6834;

	@OriginalMember(owner = "client!ug", name = "o", descriptor = "[[I")
	private int[][] anIntArrayArray59;

	@OriginalMember(owner = "client!ug", name = "c", descriptor = "[Lclient!vl;")
	private Class5_Sub45[] aClass5_Sub45Array1;

	@OriginalMember(owner = "client!ug", name = "<init>", descriptor = "(III)V")
	public Class239(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt6828 = arg1;
		this.anInt6834 = arg0;
		this.anIntArrayArray59 = new int[this.anInt6834][arg2];
		this.aClass5_Sub45Array1 = new Class5_Sub45[this.anInt6828];
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(II)[I")
	public int[] method5400(@OriginalArg(0) int arg0) {
		if (this.anInt6828 == this.anInt6834) {
			this.aBoolean460 = this.aClass5_Sub45Array1[arg0] == null;
			this.aClass5_Sub45Array1[arg0] = Static49.aClass5_Sub45_1;
			return this.anIntArrayArray59[arg0];
		} else if (this.anInt6834 == 1) {
			this.aBoolean460 = arg0 != this.anInt6833;
			this.anInt6833 = arg0;
			return this.anIntArrayArray59[0];
		} else {
			@Pc(51) Class5_Sub45 local51 = this.aClass5_Sub45Array1[arg0];
			if (local51 == null) {
				this.aBoolean460 = true;
				if (this.anInt6834 > this.anInt6829) {
					local51 = new Class5_Sub45(arg0, this.anInt6829);
					this.anInt6829++;
				} else {
					@Pc(91) Class5_Sub45 local91 = (Class5_Sub45) this.aClass177_45.method3617();
					local51 = new Class5_Sub45(arg0, local91.anInt7218);
					this.aClass5_Sub45Array1[local91.anInt7221] = null;
					local91.method6003();
				}
				this.aClass5_Sub45Array1[arg0] = local51;
			} else {
				this.aBoolean460 = false;
			}
			this.aClass177_45.method3611(local51);
			return this.anIntArrayArray59[local51.anInt7218];
		}
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(I)V")
	public void method5401() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt6834; local3++) {
			this.anIntArrayArray59[local3] = null;
		}
		this.anIntArrayArray59 = null;
		this.aClass5_Sub45Array1 = null;
		this.aClass177_45.method3614();
		this.aClass177_45 = null;
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(B)[[I")
	public int[][] method5403() {
		if (this.anInt6828 != this.anInt6834) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(21) int local21 = 0; local21 < this.anInt6834; local21++) {
			this.aClass5_Sub45Array1[local21] = Static49.aClass5_Sub45_1;
		}
		return this.anIntArrayArray59;
	}
}
