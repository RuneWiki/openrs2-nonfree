import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lf")
public final class Class124 {

	@OriginalMember(owner = "client!lf", name = "i", descriptor = "I")
	private int anInt3487 = 0;

	@OriginalMember(owner = "client!lf", name = "j", descriptor = "I")
	private int anInt3488 = -1;

	@OriginalMember(owner = "client!lf", name = "g", descriptor = "Lclient!aq;")
	private Class16 aClass16_29 = new Class16();

	@OriginalMember(owner = "client!lf", name = "r", descriptor = "Z")
	public boolean aBoolean221 = false;

	@OriginalMember(owner = "client!lf", name = "o", descriptor = "I")
	private final int anInt3493;

	@OriginalMember(owner = "client!lf", name = "c", descriptor = "I")
	private final int anInt3486;

	@OriginalMember(owner = "client!lf", name = "h", descriptor = "[[I")
	private int[][] anIntArrayArray37;

	@OriginalMember(owner = "client!lf", name = "d", descriptor = "[Lclient!tl;")
	private Class11_Sub38[] aClass11_Sub38Array1;

	@OriginalMember(owner = "client!lf", name = "<init>", descriptor = "(III)V")
	public Class124(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt3493 = arg1;
		this.anInt3486 = arg0;
		this.anIntArrayArray37 = new int[this.anInt3486][arg2];
		this.aClass11_Sub38Array1 = new Class11_Sub38[this.anInt3493];
	}

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "(I)V")
	public void method2852() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt3486; local7++) {
			this.anIntArrayArray37[local7] = null;
		}
		this.anIntArrayArray37 = null;
		this.aClass11_Sub38Array1 = null;
		this.aClass16_29.method191();
		this.aClass16_29 = null;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(II)[I")
	public int[] method2853(@OriginalArg(0) int arg0) {
		if (this.anInt3486 == this.anInt3493) {
			this.aBoolean221 = this.aClass11_Sub38Array1[arg0] == null;
			this.aClass11_Sub38Array1[arg0] = Static282.aClass11_Sub38_1;
			return this.anIntArrayArray37[arg0];
		} else if (this.anInt3486 == 1) {
			this.aBoolean221 = this.anInt3488 != arg0;
			this.anInt3488 = arg0;
			return this.anIntArrayArray37[0];
		} else {
			@Pc(53) Class11_Sub38 local53 = this.aClass11_Sub38Array1[arg0];
			if (local53 == null) {
				this.aBoolean221 = true;
				if (this.anInt3487 >= this.anInt3486) {
					@Pc(73) Class11_Sub38 local73 = (Class11_Sub38) this.aClass16_29.method181();
					local53 = new Class11_Sub38(arg0, local73.anInt6046);
					this.aClass11_Sub38Array1[local73.anInt6048] = null;
					local73.method5701();
				} else {
					local53 = new Class11_Sub38(arg0, this.anInt3487);
					this.anInt3487++;
				}
				this.aClass11_Sub38Array1[arg0] = local53;
			} else {
				this.aBoolean221 = false;
			}
			this.aClass16_29.method186(local53);
			return this.anIntArrayArray37[local53.anInt6046];
		}
	}

	@OriginalMember(owner = "client!lf", name = "c", descriptor = "(I)[[I")
	public int[][] method2856() {
		if (this.anInt3486 != this.anInt3493) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(29) int local29 = 0; local29 < this.anInt3486; local29++) {
			this.aClass11_Sub38Array1[local29] = Static282.aClass11_Sub38_1;
		}
		return this.anIntArrayArray37;
	}
}
