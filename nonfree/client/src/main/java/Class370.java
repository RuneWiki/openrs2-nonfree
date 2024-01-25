import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!waa")
public final class Class370 {

	@OriginalMember(owner = "client!waa", name = "g", descriptor = "I")
	private int anInt10070 = 0;

	@OriginalMember(owner = "client!waa", name = "n", descriptor = "I")
	private int anInt10075 = -1;

	@OriginalMember(owner = "client!waa", name = "k", descriptor = "Lclient!ro;")
	private Class306 aClass306_64 = new Class306();

	@OriginalMember(owner = "client!waa", name = "o", descriptor = "Z")
	public boolean aBoolean819 = false;

	@OriginalMember(owner = "client!waa", name = "j", descriptor = "I")
	private final int anInt10072;

	@OriginalMember(owner = "client!waa", name = "h", descriptor = "I")
	private final int anInt10071;

	@OriginalMember(owner = "client!waa", name = "a", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray18;

	@OriginalMember(owner = "client!waa", name = "d", descriptor = "[Lclient!bo;")
	private Class5_Sub8[] aClass5_Sub8Array1;

	@OriginalMember(owner = "client!waa", name = "<init>", descriptor = "(III)V")
	public Class370(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt10072 = arg1;
		this.anInt10071 = arg0;
		this.anIntArrayArrayArray18 = new int[this.anInt10071][3][arg2];
		this.aClass5_Sub8Array1 = new Class5_Sub8[this.anInt10072];
	}

	@OriginalMember(owner = "client!waa", name = "b", descriptor = "(I)[[[I")
	public int[][][] method8548() {
		if (this.anInt10071 != this.anInt10072) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(29) int local29 = 0; local29 < this.anInt10071; local29++) {
			this.aClass5_Sub8Array1[local29] = Static479.aClass5_Sub8_1;
		}
		return this.anIntArrayArrayArray18;
	}

	@OriginalMember(owner = "client!waa", name = "c", descriptor = "(I)V")
	public void method8549() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt10071; local7++) {
			this.anIntArrayArrayArray18[local7][0] = null;
			this.anIntArrayArrayArray18[local7][1] = null;
			this.anIntArrayArrayArray18[local7][2] = null;
			this.anIntArrayArrayArray18[local7] = null;
		}
		this.anIntArrayArrayArray18 = null;
		this.aClass5_Sub8Array1 = null;
		this.aClass306_64.method7315();
		this.aClass306_64 = null;
	}

	@OriginalMember(owner = "client!waa", name = "a", descriptor = "(II)[[I")
	public int[][] method8551(@OriginalArg(1) int arg0) {
		if (this.anInt10072 == this.anInt10071) {
			this.aBoolean819 = this.aClass5_Sub8Array1[arg0] == null;
			this.aClass5_Sub8Array1[arg0] = Static479.aClass5_Sub8_1;
			return this.anIntArrayArrayArray18[arg0];
		} else if (this.anInt10071 == 1) {
			this.aBoolean819 = arg0 != this.anInt10075;
			this.anInt10075 = arg0;
			return this.anIntArrayArrayArray18[0];
		} else {
			@Pc(51) Class5_Sub8 local51 = this.aClass5_Sub8Array1[arg0];
			if (local51 == null) {
				this.aBoolean819 = true;
				if (this.anInt10071 <= this.anInt10070) {
					@Pc(76) Class5_Sub8 local76 = (Class5_Sub8) this.aClass306_64.method7304();
					local51 = new Class5_Sub8(arg0, local76.anInt767);
					this.aClass5_Sub8Array1[local76.anInt768] = null;
					local76.method8911();
				} else {
					local51 = new Class5_Sub8(arg0, this.anInt10070);
					this.anInt10070++;
				}
				this.aClass5_Sub8Array1[arg0] = local51;
			} else {
				this.aBoolean819 = false;
			}
			this.aClass306_64.method7305(local51);
			return this.anIntArrayArrayArray18[local51.anInt767];
		}
	}
}
