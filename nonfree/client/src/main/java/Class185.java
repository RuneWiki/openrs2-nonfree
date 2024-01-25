import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kd")
public final class Class185 {

	@OriginalMember(owner = "client!kd", name = "f", descriptor = "I")
	private int anInt5052 = 0;

	@OriginalMember(owner = "client!kd", name = "c", descriptor = "I")
	private int anInt5049 = -1;

	@OriginalMember(owner = "client!kd", name = "h", descriptor = "Lclient!oe;")
	private Class244 aClass244_38 = new Class244();

	@OriginalMember(owner = "client!kd", name = "q", descriptor = "Z")
	public boolean aBoolean366 = false;

	@OriginalMember(owner = "client!kd", name = "o", descriptor = "I")
	private final int anInt5057;

	@OriginalMember(owner = "client!kd", name = "m", descriptor = "I")
	private final int anInt5056;

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "[Lclient!ce;")
	private Class4_Sub9[] aClass4_Sub9Array1;

	@OriginalMember(owner = "client!kd", name = "i", descriptor = "[[I")
	private int[][] anIntArrayArray32;

	@OriginalMember(owner = "client!kd", name = "<init>", descriptor = "(III)V")
	public Class185(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt5057 = arg1;
		this.anInt5056 = arg0;
		this.aClass4_Sub9Array1 = new Class4_Sub9[this.anInt5057];
		this.anIntArrayArray32 = new int[this.anInt5056][arg2];
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Z)V")
	public void method4442() {
		for (@Pc(11) int local11 = 0; local11 < this.anInt5056; local11++) {
			this.anIntArrayArray32[local11] = null;
		}
		this.anIntArrayArray32 = null;
		this.aClass4_Sub9Array1 = null;
		this.aClass244_38.method5962();
		this.aClass244_38 = null;
	}

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(I)[[I")
	public int[][] method4443() {
		if (this.anInt5056 != this.anInt5057) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(23) int local23 = 0; local23 < this.anInt5056; local23++) {
			this.aClass4_Sub9Array1[local23] = Static439.aClass4_Sub9_1;
		}
		return this.anIntArrayArray32;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IZ)[I")
	public int[] method4444(@OriginalArg(0) int arg0) {
		if (this.anInt5056 == this.anInt5057) {
			this.aBoolean366 = this.aClass4_Sub9Array1[arg0] == null;
			this.aClass4_Sub9Array1[arg0] = Static439.aClass4_Sub9_1;
			return this.anIntArrayArray32[arg0];
		} else if (this.anInt5056 == 1) {
			this.aBoolean366 = this.anInt5049 != arg0;
			this.anInt5049 = arg0;
			return this.anIntArrayArray32[0];
		} else {
			@Pc(26) Class4_Sub9 local26 = this.aClass4_Sub9Array1[arg0];
			if (local26 == null) {
				this.aBoolean366 = true;
				if (this.anInt5052 >= this.anInt5056) {
					@Pc(47) Class4_Sub9 local47 = (Class4_Sub9) this.aClass244_38.method5971();
					local26 = new Class4_Sub9(arg0, local47.anInt981);
					this.aClass4_Sub9Array1[local47.anInt980] = null;
					local47.method8379();
				} else {
					local26 = new Class4_Sub9(arg0, this.anInt5052);
					this.anInt5052++;
				}
				this.aClass4_Sub9Array1[arg0] = local26;
			} else {
				this.aBoolean366 = false;
			}
			this.aClass244_38.method5964(local26);
			return this.anIntArrayArray32[local26.anInt981];
		}
	}
}
