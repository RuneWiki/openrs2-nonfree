import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kl")
public final class Class174 {

	@OriginalMember(owner = "client!kl", name = "d", descriptor = "I")
	private int anInt5239 = -1;

	@OriginalMember(owner = "client!kl", name = "k", descriptor = "I")
	private int anInt5243 = 0;

	@OriginalMember(owner = "client!kl", name = "i", descriptor = "Lclient!dm;")
	private Class73 aClass73_44 = new Class73();

	@OriginalMember(owner = "client!kl", name = "q", descriptor = "Z")
	public boolean aBoolean403 = false;

	@OriginalMember(owner = "client!kl", name = "l", descriptor = "I")
	private final int anInt5244;

	@OriginalMember(owner = "client!kl", name = "o", descriptor = "I")
	private final int anInt5247;

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "[Lclient!eu;")
	private Class12_Sub15[] aClass12_Sub15Array1;

	@OriginalMember(owner = "client!kl", name = "b", descriptor = "[[I")
	private int[][] anIntArrayArray49;

	@OriginalMember(owner = "client!kl", name = "<init>", descriptor = "(III)V")
	public Class174(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt5244 = arg0;
		this.anInt5247 = arg1;
		this.aClass12_Sub15Array1 = new Class12_Sub15[this.anInt5247];
		this.anIntArrayArray49 = new int[this.anInt5244][arg2];
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(I)V")
	public void method4391() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt5244; local3++) {
			this.anIntArrayArray49[local3] = null;
		}
		this.aClass12_Sub15Array1 = null;
		this.anIntArrayArray49 = null;
		this.aClass73_44.method2014();
		this.aClass73_44 = null;
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(II)[I")
	public int[] method4392(@OriginalArg(0) int arg0) {
		if (this.anInt5247 == this.anInt5244) {
			this.aBoolean403 = this.aClass12_Sub15Array1[arg0] == null;
			this.aClass12_Sub15Array1[arg0] = Static288.aClass12_Sub15_1;
			return this.anIntArrayArray49[arg0];
		} else if (this.anInt5244 == 1) {
			this.aBoolean403 = arg0 != this.anInt5239;
			this.anInt5239 = arg0;
			return this.anIntArrayArray49[0];
		} else {
			@Pc(47) Class12_Sub15 local47 = this.aClass12_Sub15Array1[arg0];
			if (local47 == null) {
				this.aBoolean403 = true;
				if (this.anInt5243 < this.anInt5244) {
					local47 = new Class12_Sub15(arg0, this.anInt5243);
					this.anInt5243++;
				} else {
					@Pc(87) Class12_Sub15 local87 = (Class12_Sub15) this.aClass73_44.method2016();
					local47 = new Class12_Sub15(arg0, local87.anInt2887);
					this.aClass12_Sub15Array1[local87.anInt2882] = null;
					local87.method7967();
				}
				this.aClass12_Sub15Array1[arg0] = local47;
			} else {
				this.aBoolean403 = false;
			}
			this.aClass73_44.method2011(local47);
			return this.anIntArrayArray49[local47.anInt2887];
		}
	}

	@OriginalMember(owner = "client!kl", name = "b", descriptor = "(I)[[I")
	public int[][] method4394() {
		if (this.anInt5244 != this.anInt5247) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(17) int local17 = 0; local17 < this.anInt5244; local17++) {
			this.aClass12_Sub15Array1[local17] = Static288.aClass12_Sub15_1;
		}
		return this.anIntArrayArray49;
	}
}
