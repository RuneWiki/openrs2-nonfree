import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ud")
public final class Class101 {

	@OriginalMember(owner = "client!ud", name = "l", descriptor = "I")
	private int anInt3800 = 0;

	@OriginalMember(owner = "client!ud", name = "p", descriptor = "I")
	private int anInt3802 = -1;

	@OriginalMember(owner = "client!ud", name = "n", descriptor = "Lclient!sg;")
	private Class91 aClass91_19 = new Class91();

	@OriginalMember(owner = "client!ud", name = "s", descriptor = "Z")
	public boolean aBoolean174 = false;

	@OriginalMember(owner = "client!ud", name = "f", descriptor = "I")
	private final int anInt3797;

	@OriginalMember(owner = "client!ud", name = "g", descriptor = "[Lclient!ib;")
	private Class5_Sub15[] aClass5_Sub15Array1;

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "I")
	private final int anInt3793;

	@OriginalMember(owner = "client!ud", name = "q", descriptor = "[[I")
	private int[][] anIntArrayArray39;

	@OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(III)V")
	public Class101(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt3797 = arg1;
		this.aClass5_Sub15Array1 = new Class5_Sub15[this.anInt3797];
		this.anInt3793 = arg0;
		this.anIntArrayArray39 = new int[this.anInt3793][arg2];
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(B)V")
	public void method2881() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt3793; local7++) {
			this.anIntArrayArray39[local7] = null;
		}
		this.anIntArrayArray39 = null;
		this.aClass5_Sub15Array1 = null;
		this.aClass91_19.method2682();
		this.aClass91_19 = null;
	}

	@OriginalMember(owner = "client!ud", name = "b", descriptor = "(B)[[I")
	public int[][] method2885() {
		if (this.anInt3797 != this.anInt3793) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(22) int local22 = 0; local22 < this.anInt3793; local22++) {
			this.aClass5_Sub15Array1[local22] = Static31.aClass5_Sub15_1;
		}
		return this.anIntArrayArray39;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(IB)[I")
	public int[] method2886(@OriginalArg(0) int arg0) {
		if (this.anInt3793 == this.anInt3797) {
			this.aBoolean174 = this.aClass5_Sub15Array1[arg0] == null;
			this.aClass5_Sub15Array1[arg0] = Static31.aClass5_Sub15_1;
			return this.anIntArrayArray39[arg0];
		} else if (this.anInt3793 == 1) {
			this.aBoolean174 = arg0 != this.anInt3802;
			this.anInt3802 = arg0;
			return this.anIntArrayArray39[0];
		} else {
			@Pc(48) Class5_Sub15 local48 = this.aClass5_Sub15Array1[arg0];
			if (local48 == null) {
				this.aBoolean174 = true;
				if (this.anInt3800 < this.anInt3793) {
					local48 = new Class5_Sub15(arg0, this.anInt3800);
					this.anInt3800++;
				} else {
					@Pc(88) Class5_Sub15 local88 = (Class5_Sub15) this.aClass91_19.method2687();
					local48 = new Class5_Sub15(arg0, local88.anInt1654);
					this.aClass5_Sub15Array1[local88.anInt1657] = null;
					local88.method3207();
				}
				this.aClass5_Sub15Array1[arg0] = local48;
			} else {
				this.aBoolean174 = false;
			}
			this.aClass91_19.method2681(local48);
			return this.anIntArrayArray39[local48.anInt1654];
		}
	}
}
