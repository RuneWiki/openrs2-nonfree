import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mfa")
public final class Class223 {

	@OriginalMember(owner = "client!mfa", name = "g", descriptor = "I")
	private int anInt5455 = -1;

	@OriginalMember(owner = "client!mfa", name = "e", descriptor = "I")
	private int anInt5454 = 0;

	@OriginalMember(owner = "client!mfa", name = "b", descriptor = "Lclient!wba;")
	private Class353 aClass353_37 = new Class353();

	@OriginalMember(owner = "client!mfa", name = "m", descriptor = "Z")
	public boolean aBoolean442 = false;

	@OriginalMember(owner = "client!mfa", name = "k", descriptor = "I")
	private final int anInt5458;

	@OriginalMember(owner = "client!mfa", name = "c", descriptor = "I")
	private final int anInt5453;

	@OriginalMember(owner = "client!mfa", name = "h", descriptor = "[[I")
	private int[][] anIntArrayArray120;

	@OriginalMember(owner = "client!mfa", name = "f", descriptor = "[Lclient!dl;")
	private Class1_Sub14[] aClass1_Sub14Array1;

	@OriginalMember(owner = "client!mfa", name = "<init>", descriptor = "(III)V")
	public Class223(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt5458 = arg0;
		this.anInt5453 = arg1;
		this.anIntArrayArray120 = new int[this.anInt5458][arg2];
		this.aClass1_Sub14Array1 = new Class1_Sub14[this.anInt5453];
	}

	@OriginalMember(owner = "client!mfa", name = "a", descriptor = "(B)V")
	public void method4436() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt5458; local3++) {
			this.anIntArrayArray120[local3] = null;
		}
		this.anIntArrayArray120 = null;
		this.aClass1_Sub14Array1 = null;
		this.aClass353_37.method7680();
		this.aClass353_37 = null;
	}

	@OriginalMember(owner = "client!mfa", name = "a", descriptor = "(I)[[I")
	public int[][] method4437() {
		if (this.anInt5453 != this.anInt5458) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(17) int local17 = 0; local17 < this.anInt5458; local17++) {
			this.aClass1_Sub14Array1[local17] = Static591.aClass1_Sub14_1;
		}
		return this.anIntArrayArray120;
	}

	@OriginalMember(owner = "client!mfa", name = "a", descriptor = "(BI)[I")
	public int[] method4438(@OriginalArg(1) int arg0) {
		if (this.anInt5453 == this.anInt5458) {
			this.aBoolean442 = this.aClass1_Sub14Array1[arg0] == null;
			this.aClass1_Sub14Array1[arg0] = Static591.aClass1_Sub14_1;
			return this.anIntArrayArray120[arg0];
		} else if (this.anInt5458 == 1) {
			this.aBoolean442 = arg0 != this.anInt5455;
			this.anInt5455 = arg0;
			return this.anIntArrayArray120[0];
		} else {
			@Pc(48) Class1_Sub14 local48 = this.aClass1_Sub14Array1[arg0];
			if (local48 == null) {
				this.aBoolean442 = true;
				if (this.anInt5454 >= this.anInt5458) {
					@Pc(69) Class1_Sub14 local69 = (Class1_Sub14) this.aClass353_37.method7676();
					local48 = new Class1_Sub14(arg0, local69.anInt1864);
					this.aClass1_Sub14Array1[local69.anInt1863] = null;
					local69.method7859();
				} else {
					local48 = new Class1_Sub14(arg0, this.anInt5454);
					this.anInt5454++;
				}
				this.aClass1_Sub14Array1[arg0] = local48;
			} else {
				this.aBoolean442 = false;
			}
			this.aClass353_37.method7684(local48);
			return this.anIntArrayArray120[local48.anInt1864];
		}
	}
}
