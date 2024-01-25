import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hv")
public final class Class137 {

	@OriginalMember(owner = "client!hv", name = "f", descriptor = "I")
	private int anInt3955 = 0;

	@OriginalMember(owner = "client!hv", name = "q", descriptor = "I")
	private int anInt3962 = -1;

	@OriginalMember(owner = "client!hv", name = "o", descriptor = "Lclient!su;")
	private Class298 aClass298_85 = new Class298();

	@OriginalMember(owner = "client!hv", name = "s", descriptor = "Z")
	public boolean aBoolean306 = false;

	@OriginalMember(owner = "client!hv", name = "c", descriptor = "I")
	private final int anInt3952;

	@OriginalMember(owner = "client!hv", name = "d", descriptor = "I")
	private final int anInt3953;

	@OriginalMember(owner = "client!hv", name = "j", descriptor = "[[I")
	private int[][] anIntArrayArray34;

	@OriginalMember(owner = "client!hv", name = "k", descriptor = "[Lclient!tv;")
	private Class6_Sub48[] aClass6_Sub48Array1;

	@OriginalMember(owner = "client!hv", name = "<init>", descriptor = "(III)V")
	public Class137(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt3952 = arg1;
		this.anInt3953 = arg0;
		this.anIntArrayArray34 = new int[this.anInt3953][arg2];
		this.aClass6_Sub48Array1 = new Class6_Sub48[this.anInt3952];
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(IB)[I")
	public int[] method3408(@OriginalArg(0) int arg0) {
		if (this.anInt3953 == this.anInt3952) {
			this.aBoolean306 = this.aClass6_Sub48Array1[arg0] == null;
			this.aClass6_Sub48Array1[arg0] = Static8.aClass6_Sub48_1;
			return this.anIntArrayArray34[arg0];
		} else if (this.anInt3953 == 1) {
			this.aBoolean306 = this.anInt3962 != arg0;
			this.anInt3962 = arg0;
			return this.anIntArrayArray34[0];
		} else {
			@Pc(70) Class6_Sub48 local70 = this.aClass6_Sub48Array1[arg0];
			if (local70 == null) {
				this.aBoolean306 = true;
				if (this.anInt3953 > this.anInt3955) {
					local70 = new Class6_Sub48(arg0, this.anInt3955);
					this.anInt3955++;
				} else {
					@Pc(107) Class6_Sub48 local107 = (Class6_Sub48) this.aClass298_85.method6823();
					local70 = new Class6_Sub48(arg0, local107.anInt8787);
					this.aClass6_Sub48Array1[local107.anInt8782] = null;
					local107.method7948();
				}
				this.aClass6_Sub48Array1[arg0] = local70;
			} else {
				this.aBoolean306 = false;
			}
			this.aClass298_85.method6819(local70);
			return this.anIntArrayArray34[local70.anInt8787];
		}
	}

	@OriginalMember(owner = "client!hv", name = "b", descriptor = "(Z)V")
	public void method3409() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt3953; local7++) {
			this.anIntArrayArray34[local7] = null;
		}
		this.anIntArrayArray34 = null;
		this.aClass6_Sub48Array1 = null;
		this.aClass298_85.method6808();
		this.aClass298_85 = null;
	}

	@OriginalMember(owner = "client!hv", name = "c", descriptor = "(I)[[I")
	public int[][] method3413() {
		if (this.anInt3953 != this.anInt3952) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(17) int local17 = 0; local17 < this.anInt3953; local17++) {
			this.aClass6_Sub48Array1[local17] = Static8.aClass6_Sub48_1;
		}
		return this.anIntArrayArray34;
	}
}
