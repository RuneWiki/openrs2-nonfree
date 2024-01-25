import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ao")
public final class Class12 {

	@OriginalMember(owner = "client!ao", name = "k", descriptor = "I")
	private int anInt491 = 0;

	@OriginalMember(owner = "client!ao", name = "n", descriptor = "I")
	private int anInt493 = -1;

	@OriginalMember(owner = "client!ao", name = "l", descriptor = "Lclient!bv;")
	private Class37 aClass37_8 = new Class37();

	@OriginalMember(owner = "client!ao", name = "s", descriptor = "Z")
	public boolean aBoolean23 = false;

	@OriginalMember(owner = "client!ao", name = "b", descriptor = "I")
	private final int anInt486;

	@OriginalMember(owner = "client!ao", name = "m", descriptor = "I")
	private final int anInt492;

	@OriginalMember(owner = "client!ao", name = "i", descriptor = "[Lclient!uba;")
	private Class1_Sub46[] aClass1_Sub46Array1;

	@OriginalMember(owner = "client!ao", name = "h", descriptor = "[[I")
	private int[][] anIntArrayArray5;

	@OriginalMember(owner = "client!ao", name = "<init>", descriptor = "(III)V")
	public Class12(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt486 = arg0;
		this.anInt492 = arg1;
		this.aClass1_Sub46Array1 = new Class1_Sub46[this.anInt492];
		this.anIntArrayArray5 = new int[this.anInt486][arg2];
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(II)[I")
	public int[] method502(@OriginalArg(0) int arg0) {
		if (this.anInt492 == this.anInt486) {
			this.aBoolean23 = this.aClass1_Sub46Array1[arg0] == null;
			this.aClass1_Sub46Array1[arg0] = Static439.aClass1_Sub46_1;
			return this.anIntArrayArray5[arg0];
		} else if (this.anInt486 == 1) {
			this.aBoolean23 = arg0 != this.anInt493;
			this.anInt493 = arg0;
			return this.anIntArrayArray5[0];
		} else {
			@Pc(50) Class1_Sub46 local50 = this.aClass1_Sub46Array1[arg0];
			if (local50 == null) {
				this.aBoolean23 = true;
				if (this.anInt486 > this.anInt491) {
					local50 = new Class1_Sub46(arg0, this.anInt491);
					this.anInt491++;
				} else {
					@Pc(85) Class1_Sub46 local85 = (Class1_Sub46) this.aClass37_8.method974();
					local50 = new Class1_Sub46(arg0, local85.anInt8002);
					this.aClass1_Sub46Array1[local85.anInt8003] = null;
					local85.method7525();
				}
				this.aClass1_Sub46Array1[arg0] = local50;
			} else {
				this.aBoolean23 = false;
			}
			this.aClass37_8.method976(local50);
			return this.anIntArrayArray5[local50.anInt8002];
		}
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(B)[[I")
	public int[][] method505() {
		if (this.anInt486 != this.anInt492) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(29) int local29 = 0; local29 < this.anInt486; local29++) {
			this.aClass1_Sub46Array1[local29] = Static439.aClass1_Sub46_1;
		}
		return this.anIntArrayArray5;
	}

	@OriginalMember(owner = "client!ao", name = "b", descriptor = "(I)V")
	public void method507() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt486; local3++) {
			this.anIntArrayArray5[local3] = null;
		}
		this.anIntArrayArray5 = null;
		this.aClass1_Sub46Array1 = null;
		this.aClass37_8.method967();
		this.aClass37_8 = null;
	}
}
