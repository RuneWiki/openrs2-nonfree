import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ot")
public final class Class281 {

	@OriginalMember(owner = "client!ot", name = "n", descriptor = "I")
	private int anInt7515 = -1;

	@OriginalMember(owner = "client!ot", name = "b", descriptor = "I")
	private int anInt7522 = 0;

	@OriginalMember(owner = "client!ot", name = "i", descriptor = "Lclient!sja;")
	private Class342 aClass342_59 = new Class342();

	@OriginalMember(owner = "client!ot", name = "d", descriptor = "Z")
	public boolean aBoolean509 = false;

	@OriginalMember(owner = "client!ot", name = "k", descriptor = "I")
	private final int anInt7516;

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "I")
	private final int anInt7521;

	@OriginalMember(owner = "client!ot", name = "j", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray13;

	@OriginalMember(owner = "client!ot", name = "h", descriptor = "[Lclient!bt;")
	private Class3_Sub12[] aClass3_Sub12Array1;

	@OriginalMember(owner = "client!ot", name = "<init>", descriptor = "(III)V")
	public Class281(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt7516 = arg0;
		this.anInt7521 = arg1;
		this.anIntArrayArrayArray13 = new int[this.anInt7516][3][arg2];
		this.aClass3_Sub12Array1 = new Class3_Sub12[this.anInt7521];
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(II)[[I")
	public int[][] method6493(@OriginalArg(1) int arg0) {
		if (this.anInt7521 == this.anInt7516) {
			this.aBoolean509 = this.aClass3_Sub12Array1[arg0] == null;
			this.aClass3_Sub12Array1[arg0] = Static350.aClass3_Sub12_1;
			return this.anIntArrayArrayArray13[arg0];
		} else if (this.anInt7516 == 1) {
			this.aBoolean509 = arg0 != this.anInt7515;
			this.anInt7515 = arg0;
			return this.anIntArrayArrayArray13[0];
		} else {
			@Pc(50) Class3_Sub12 local50 = this.aClass3_Sub12Array1[arg0];
			if (local50 == null) {
				this.aBoolean509 = true;
				if (this.anInt7516 > this.anInt7522) {
					local50 = new Class3_Sub12(arg0, this.anInt7522);
					this.anInt7522++;
				} else {
					@Pc(94) Class3_Sub12 local94 = (Class3_Sub12) this.aClass342_59.method7656();
					local50 = new Class3_Sub12(arg0, local94.anInt1505);
					this.aClass3_Sub12Array1[local94.anInt1506] = null;
					local94.method9596();
				}
				this.aClass3_Sub12Array1[arg0] = local50;
			} else {
				this.aBoolean509 = false;
			}
			this.aClass342_59.method7651(local50);
			return this.anIntArrayArrayArray13[local50.anInt1505];
		}
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(B)[[[I")
	public int[][][] method6494() {
		if (this.anInt7516 != this.anInt7521) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(20) int local20 = 0; local20 < this.anInt7516; local20++) {
			this.aClass3_Sub12Array1[local20] = Static350.aClass3_Sub12_1;
		}
		return this.anIntArrayArrayArray13;
	}

	@OriginalMember(owner = "client!ot", name = "b", descriptor = "(I)V")
	public void method6496() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt7516; local7++) {
			this.anIntArrayArrayArray13[local7][0] = null;
			this.anIntArrayArrayArray13[local7][1] = null;
			this.anIntArrayArrayArray13[local7][2] = null;
			this.anIntArrayArrayArray13[local7] = null;
		}
		this.anIntArrayArrayArray13 = null;
		this.aClass3_Sub12Array1 = null;
		this.aClass342_59.method7655();
		this.aClass342_59 = null;
	}
}
