import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!km")
public final class Class187 {

	@OriginalMember(owner = "client!km", name = "a", descriptor = "I")
	private int anInt5356 = -1;

	@OriginalMember(owner = "client!km", name = "h", descriptor = "I")
	private int anInt5361 = 0;

	@OriginalMember(owner = "client!km", name = "c", descriptor = "Lclient!mfa;")
	private Class211 aClass211_38 = new Class211();

	@OriginalMember(owner = "client!km", name = "q", descriptor = "Z")
	public boolean aBoolean403 = false;

	@OriginalMember(owner = "client!km", name = "g", descriptor = "I")
	private final int anInt5360;

	@OriginalMember(owner = "client!km", name = "l", descriptor = "I")
	private final int anInt5364;

	@OriginalMember(owner = "client!km", name = "f", descriptor = "[Lclient!cl;")
	private Class6_Sub11[] aClass6_Sub11Array1;

	@OriginalMember(owner = "client!km", name = "p", descriptor = "[[I")
	private int[][] anIntArrayArray38;

	@OriginalMember(owner = "client!km", name = "<init>", descriptor = "(III)V")
	public Class187(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt5360 = arg1;
		this.anInt5364 = arg0;
		this.aClass6_Sub11Array1 = new Class6_Sub11[this.anInt5360];
		this.anIntArrayArray38 = new int[this.anInt5364][arg2];
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(Z)[[I")
	public int[][] method4592() {
		if (this.anInt5360 != this.anInt5364) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(28) int local28 = 0; local28 < this.anInt5364; local28++) {
			this.aClass6_Sub11Array1[local28] = Static108.aClass6_Sub11_1;
		}
		return this.anIntArrayArray38;
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(II)[I")
	public int[] method4597(@OriginalArg(0) int arg0) {
		if (this.anInt5364 == this.anInt5360) {
			this.aBoolean403 = this.aClass6_Sub11Array1[arg0] == null;
			this.aClass6_Sub11Array1[arg0] = Static108.aClass6_Sub11_1;
			return this.anIntArrayArray38[arg0];
		} else if (this.anInt5364 == 1) {
			this.aBoolean403 = arg0 != this.anInt5356;
			this.anInt5356 = arg0;
			return this.anIntArrayArray38[0];
		} else {
			@Pc(25) Class6_Sub11 local25 = this.aClass6_Sub11Array1[arg0];
			if (local25 == null) {
				this.aBoolean403 = true;
				if (this.anInt5364 > this.anInt5361) {
					local25 = new Class6_Sub11(arg0, this.anInt5361);
					this.anInt5361++;
				} else {
					@Pc(61) Class6_Sub11 local61 = (Class6_Sub11) this.aClass211_38.method5184();
					local25 = new Class6_Sub11(arg0, local61.anInt1593);
					this.aClass6_Sub11Array1[local61.anInt1594] = null;
					local61.method8151();
				}
				this.aClass6_Sub11Array1[arg0] = local25;
			} else {
				this.aBoolean403 = false;
			}
			this.aClass211_38.method5178(local25);
			return this.anIntArrayArray38[local25.anInt1593];
		}
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(B)V")
	public void method4600() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt5364; local7++) {
			this.anIntArrayArray38[local7] = null;
		}
		this.aClass6_Sub11Array1 = null;
		this.anIntArrayArray38 = null;
		this.aClass211_38.method5179();
		this.aClass211_38 = null;
	}
}
