import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!va")
public final class Class82 {

	@OriginalMember(owner = "client!va", name = "m", descriptor = "I")
	private int anInt3763 = -1;

	@OriginalMember(owner = "client!va", name = "q", descriptor = "I")
	private int anInt3766 = 0;

	@OriginalMember(owner = "client!va", name = "a", descriptor = "Lclient!nd;")
	private Class59 aClass59_14 = new Class59();

	@OriginalMember(owner = "client!va", name = "t", descriptor = "Z")
	public boolean aBoolean160 = false;

	@OriginalMember(owner = "client!va", name = "p", descriptor = "[[I")
	private int[][] anIntArrayArray39;

	@OriginalMember(owner = "client!va", name = "n", descriptor = "I")
	private final int anInt3764;

	@OriginalMember(owner = "client!va", name = "j", descriptor = "I")
	private final int anInt3760;

	@OriginalMember(owner = "client!va", name = "c", descriptor = "[Lclient!hg;")
	private Class3_Sub11[] aClass3_Sub11Array1;

	@OriginalMember(owner = "client!va", name = "<init>", descriptor = "(III)V")
	public Class82(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArrayArray39 = new int[arg0][arg2];
		this.anInt3764 = arg1;
		this.anInt3760 = arg0;
		this.aClass3_Sub11Array1 = new Class3_Sub11[arg1];
	}

	@OriginalMember(owner = "client!va", name = "b", descriptor = "(I)V")
	public void method2718() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt3760; local3++) {
			this.anIntArrayArray39[local3] = null;
		}
		this.anIntArrayArray39 = null;
		this.aClass3_Sub11Array1 = null;
		this.aClass59_14.method1741();
		this.aClass59_14 = null;
	}

	@OriginalMember(owner = "client!va", name = "b", descriptor = "(B)[[I")
	public int[][] method2719() {
		if (this.anInt3760 != this.anInt3764) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(28) int local28 = 0; local28 < this.anInt3760; local28++) {
			this.aClass3_Sub11Array1[local28] = Static69.aClass3_Sub11_1;
		}
		return this.anIntArrayArray39;
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(ZI)[I")
	public int[] method2720(@OriginalArg(1) int arg0) {
		if (this.anInt3760 == this.anInt3764) {
			this.aBoolean160 = this.aClass3_Sub11Array1[arg0] == null;
			this.aClass3_Sub11Array1[arg0] = Static69.aClass3_Sub11_1;
			return this.anIntArrayArray39[arg0];
		} else if (this.anInt3760 == 1) {
			this.aBoolean160 = this.anInt3763 != arg0;
			this.anInt3763 = arg0;
			return this.anIntArrayArray39[0];
		} else {
			@Pc(22) Class3_Sub11 local22 = this.aClass3_Sub11Array1[arg0];
			if (this.aBoolean160 = local22 == null) {
				if (this.anInt3760 > this.anInt3766) {
					local22 = new Class3_Sub11(arg0, this.anInt3766);
					this.anInt3766++;
				} else {
					@Pc(57) Class3_Sub11 local57 = (Class3_Sub11) this.aClass59_14.method1737();
					local22 = new Class3_Sub11(arg0, local57.anInt1653);
					this.aClass3_Sub11Array1[local57.anInt1654] = null;
					local57.method2900();
				}
				this.aClass3_Sub11Array1[arg0] = local22;
			}
			this.aClass59_14.method1738(local22);
			return this.anIntArrayArray39[local22.anInt1653];
		}
	}
}
