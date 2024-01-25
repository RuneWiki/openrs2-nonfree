import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public final class Class121 {

	@OriginalMember(owner = "client!gi", name = "b", descriptor = "Lclient!gi;")
	public Class121 aClass121_1;

	@OriginalMember(owner = "client!gi", name = "c", descriptor = "I")
	public int anInt3497;

	@OriginalMember(owner = "client!gi", name = "d", descriptor = "I")
	public int anInt3498;

	@OriginalMember(owner = "client!gi", name = "e", descriptor = "I")
	public int anInt3499;

	@OriginalMember(owner = "client!gi", name = "g", descriptor = "I")
	public int anInt3501;

	@OriginalMember(owner = "client!gi", name = "h", descriptor = "I")
	public int anInt3502;

	@OriginalMember(owner = "client!gi", name = "i", descriptor = "I")
	public int anInt3503;

	@OriginalMember(owner = "client!gi", name = "l", descriptor = "I")
	public int anInt3506;

	@OriginalMember(owner = "client!gi", name = "q", descriptor = "I")
	public int anInt3509;

	@OriginalMember(owner = "client!gi", name = "t", descriptor = "I")
	public int anInt3511;

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "I")
	public final int anInt3496;

	@OriginalMember(owner = "client!gi", name = "p", descriptor = "I")
	public final int anInt3508;

	@OriginalMember(owner = "client!gi", name = "k", descriptor = "I")
	public final int anInt3505;

	@OriginalMember(owner = "client!gi", name = "m", descriptor = "B")
	public final byte aByte30;

	@OriginalMember(owner = "client!gi", name = "f", descriptor = "I")
	private final int anInt3500;

	@OriginalMember(owner = "client!gi", name = "<init>", descriptor = "(IIIIB)V")
	public Class121(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		this.anInt3496 = arg1;
		this.anInt3508 = arg3;
		this.anInt3505 = arg2;
		this.aByte30 = arg4;
		this.anInt3500 = arg0;
	}

	@OriginalMember(owner = "client!gi", name = "<init>", descriptor = "(Lclient!gi;I)V")
	public Class121(@OriginalArg(0) Class121 arg0, @OriginalArg(1) int arg1) {
		this.aClass121_1 = arg0;
		this.anInt3500 = this.aClass121_1.anInt3500;
		this.aByte30 = this.aClass121_1.aByte30;
		this.anInt3496 = this.aClass121_1.anInt3496 + arg1;
		this.anInt3508 = arg1 + this.aClass121_1.anInt3508;
		this.anInt3505 = arg1 + this.aClass121_1.anInt3505;
	}

	@OriginalMember(owner = "client!gi", name = "b", descriptor = "(I)Lclient!hm;")
	public Class144 method3080() {
		return Static141.method2862(this.anInt3500);
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(IBII)Lclient!gi;")
	public Class121 method3081(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return new Class121(this.anInt3500, arg1, arg0, arg2, this.aByte30);
	}
}
