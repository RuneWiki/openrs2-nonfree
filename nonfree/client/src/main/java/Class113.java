import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public final class Class113 {

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "I")
	public int anInt3303;

	@OriginalMember(owner = "client!kg", name = "e", descriptor = "I")
	public int anInt3306;

	@OriginalMember(owner = "client!kg", name = "g", descriptor = "I")
	public int anInt3308;

	@OriginalMember(owner = "client!kg", name = "m", descriptor = "I")
	public int anInt3314;

	@OriginalMember(owner = "client!kg", name = "n", descriptor = "I")
	public int anInt3315;

	@OriginalMember(owner = "client!kg", name = "o", descriptor = "I")
	public int anInt3316;

	@OriginalMember(owner = "client!kg", name = "p", descriptor = "I")
	public int anInt3317;

	@OriginalMember(owner = "client!kg", name = "r", descriptor = "I")
	public int anInt3319;

	@OriginalMember(owner = "client!kg", name = "t", descriptor = "Lclient!kg;")
	public Class113 aClass113_2;

	@OriginalMember(owner = "client!kg", name = "u", descriptor = "I")
	public int anInt3321;

	@OriginalMember(owner = "client!kg", name = "w", descriptor = "I")
	public final int anInt3322;

	@OriginalMember(owner = "client!kg", name = "h", descriptor = "I")
	public final int anInt3309;

	@OriginalMember(owner = "client!kg", name = "c", descriptor = "B")
	public final byte aByte18;

	@OriginalMember(owner = "client!kg", name = "i", descriptor = "I")
	public final int anInt3310;

	@OriginalMember(owner = "client!kg", name = "s", descriptor = "I")
	public final int anInt3320;

	@OriginalMember(owner = "client!kg", name = "<init>", descriptor = "(IIIIB)V")
	public Class113(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		this.anInt3322 = arg3;
		this.anInt3309 = arg1;
		this.aByte18 = arg4;
		this.anInt3310 = arg0;
		this.anInt3320 = arg2;
	}

	@OriginalMember(owner = "client!kg", name = "<init>", descriptor = "(Lclient!kg;I)V")
	public Class113(@OriginalArg(0) Class113 arg0, @OriginalArg(1) int arg1) {
		this.aClass113_2 = arg0;
		this.aByte18 = this.aClass113_2.aByte18;
		this.anInt3309 = this.aClass113_2.anInt3309 + arg1;
		this.anInt3320 = arg1 + this.aClass113_2.anInt3320;
		this.anInt3322 = this.aClass113_2.anInt3322 + arg1;
		this.anInt3310 = this.aClass113_2.anInt3310;
	}
}
