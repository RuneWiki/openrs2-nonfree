import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sc")
public final class Class80 {

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "I")
	private int anInt3772 = -1;

	@OriginalMember(owner = "client!sc", name = "k", descriptor = "I")
	private int anInt3778 = 0;

	@OriginalMember(owner = "client!sc", name = "g", descriptor = "Lclient!v;")
	private Class91 aClass91_20 = new Class91();

	@OriginalMember(owner = "client!sc", name = "t", descriptor = "Z")
	public boolean aBoolean151 = false;

	@OriginalMember(owner = "client!sc", name = "m", descriptor = "I")
	private final int anInt3779;

	@OriginalMember(owner = "client!sc", name = "p", descriptor = "I")
	private final int anInt3782;

	@OriginalMember(owner = "client!sc", name = "s", descriptor = "[[I")
	private int[][] anIntArrayArray38;

	@OriginalMember(owner = "client!sc", name = "l", descriptor = "[Lclient!ab;")
	private Class1_Sub3[] aClass1_Sub3Array1;

	@OriginalMember(owner = "client!sc", name = "<init>", descriptor = "(III)V")
	public Class80(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt3779 = arg1;
		this.anInt3782 = arg0;
		this.anIntArrayArray38 = new int[this.anInt3782][arg2];
		this.aClass1_Sub3Array1 = new Class1_Sub3[this.anInt3779];
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(II)[I")
	public int[] method2876(@OriginalArg(0) int arg0) {
		if (this.anInt3779 == this.anInt3782) {
			this.aBoolean151 = this.aClass1_Sub3Array1[arg0] == null;
			this.aClass1_Sub3Array1[arg0] = Static147.aClass1_Sub3_1;
			return this.anIntArrayArray38[arg0];
		} else if (this.anInt3782 == 1) {
			this.aBoolean151 = arg0 != this.anInt3772;
			this.anInt3772 = arg0;
			return this.anIntArrayArray38[0];
		} else {
			@Pc(48) Class1_Sub3 local48 = this.aClass1_Sub3Array1[arg0];
			if (local48 == null) {
				this.aBoolean151 = true;
				if (this.anInt3778 < this.anInt3782) {
					local48 = new Class1_Sub3(arg0, this.anInt3778);
					this.anInt3778++;
				} else {
					@Pc(90) Class1_Sub3 local90 = (Class1_Sub3) this.aClass91_20.method3149();
					local48 = new Class1_Sub3(arg0, local90.anInt80);
					this.aClass1_Sub3Array1[local90.anInt83] = null;
					local90.method3295();
				}
				this.aClass1_Sub3Array1[arg0] = local48;
			} else {
				this.aBoolean151 = false;
			}
			this.aClass91_20.method3146(local48);
			return this.anIntArrayArray38[local48.anInt80];
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(I)[[I")
	public int[][] method2877() {
		if (this.anInt3779 != this.anInt3782) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(21) int local21 = 0; local21 < this.anInt3782; local21++) {
			this.aClass1_Sub3Array1[local21] = Static147.aClass1_Sub3_1;
		}
		return this.anIntArrayArray38;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(B)V")
	public void method2879() {
		for (@Pc(12) int local12 = 0; local12 < this.anInt3782; local12++) {
			this.anIntArrayArray38[local12] = null;
		}
		this.anIntArrayArray38 = null;
		this.aClass1_Sub3Array1 = null;
		this.aClass91_20.method3147();
		this.aClass91_20 = null;
	}
}
