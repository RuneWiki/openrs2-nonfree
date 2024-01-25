import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wq")
public final class Class377 {

	@OriginalMember(owner = "client!wq", name = "h", descriptor = "I")
	private int anInt10298 = -1;

	@OriginalMember(owner = "client!wq", name = "l", descriptor = "I")
	private int anInt10300 = 0;

	@OriginalMember(owner = "client!wq", name = "f", descriptor = "Lclient!fha;")
	private Class109 aClass109_74 = new Class109();

	@OriginalMember(owner = "client!wq", name = "o", descriptor = "Z")
	public boolean aBoolean746 = false;

	@OriginalMember(owner = "client!wq", name = "g", descriptor = "I")
	private final int anInt10297;

	@OriginalMember(owner = "client!wq", name = "d", descriptor = "I")
	private final int anInt10295;

	@OriginalMember(owner = "client!wq", name = "k", descriptor = "[Lclient!hia;")
	private Class2_Sub18[] aClass2_Sub18Array1;

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "[[I")
	private int[][] anIntArrayArray71;

	@OriginalMember(owner = "client!wq", name = "<init>", descriptor = "(III)V")
	public Class377(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt10297 = arg0;
		this.anInt10295 = arg1;
		this.aClass2_Sub18Array1 = new Class2_Sub18[this.anInt10295];
		this.anIntArrayArray71 = new int[this.anInt10297][arg2];
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(I)V")
	public void method8585() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt10297; local3++) {
			this.anIntArrayArray71[local3] = null;
		}
		this.aClass2_Sub18Array1 = null;
		this.anIntArrayArray71 = null;
		this.aClass109_74.method2329();
		this.aClass109_74 = null;
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(II)[I")
	public int[] method8586(@OriginalArg(1) int arg0) {
		if (this.anInt10297 == this.anInt10295) {
			this.aBoolean746 = this.aClass2_Sub18Array1[arg0] == null;
			this.aClass2_Sub18Array1[arg0] = Static489.aClass2_Sub18_2;
			return this.anIntArrayArray71[arg0];
		} else if (this.anInt10297 == 1) {
			this.aBoolean746 = arg0 != this.anInt10298;
			this.anInt10298 = arg0;
			return this.anIntArrayArray71[0];
		} else {
			@Pc(47) Class2_Sub18 local47 = this.aClass2_Sub18Array1[arg0];
			if (local47 == null) {
				this.aBoolean746 = true;
				if (this.anInt10300 >= this.anInt10297) {
					@Pc(74) Class2_Sub18 local74 = (Class2_Sub18) this.aClass109_74.method2321();
					local47 = new Class2_Sub18(arg0, local74.anInt3544);
					this.aClass2_Sub18Array1[local74.anInt3546] = null;
					local74.method8653();
				} else {
					local47 = new Class2_Sub18(arg0, this.anInt10300);
					this.anInt10300++;
				}
				this.aClass2_Sub18Array1[arg0] = local47;
			} else {
				this.aBoolean746 = false;
			}
			this.aClass109_74.method2331(local47);
			return this.anIntArrayArray71[local47.anInt3544];
		}
	}

	@OriginalMember(owner = "client!wq", name = "b", descriptor = "(I)[[I")
	public int[][] method8587() {
		if (this.anInt10297 != this.anInt10295) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(17) int local17 = 0; local17 < this.anInt10297; local17++) {
			this.aClass2_Sub18Array1[local17] = Static489.aClass2_Sub18_2;
		}
		return this.anIntArrayArray71;
	}
}
