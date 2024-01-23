import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wd")
public final class Class176 {

	@OriginalMember(owner = "client!wd", name = "h", descriptor = "I")
	private int anInt5790 = 0;

	@OriginalMember(owner = "client!wd", name = "g", descriptor = "I")
	private int anInt5789 = -1;

	@OriginalMember(owner = "client!wd", name = "i", descriptor = "Lclient!hh;")
	private Class69 aClass69_28 = new Class69();

	@OriginalMember(owner = "client!wd", name = "s", descriptor = "Z")
	public boolean aBoolean437 = false;

	@OriginalMember(owner = "client!wd", name = "o", descriptor = "I")
	private int anInt5794;

	@OriginalMember(owner = "client!wd", name = "m", descriptor = "[[I")
	private int[][] anIntArrayArray45;

	@OriginalMember(owner = "client!wd", name = "q", descriptor = "I")
	private int anInt5796;

	@OriginalMember(owner = "client!wd", name = "f", descriptor = "[Lclient!hi;")
	private Class1_Sub15[] aClass1_Sub15Array1;

	@OriginalMember(owner = "client!wd", name = "<init>", descriptor = "(III)V")
	public Class176(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt5794 = arg0;
		this.anIntArrayArray45 = new int[this.anInt5794][arg2];
		this.anInt5796 = arg1;
		this.aClass1_Sub15Array1 = new Class1_Sub15[this.anInt5796];
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(II)[I")
	public int[] method4469(@OriginalArg(1) int arg0) {
		if (this.anInt5796 == this.anInt5794) {
			this.aBoolean437 = this.aClass1_Sub15Array1[arg0] == null;
			this.aClass1_Sub15Array1[arg0] = Static195.aClass1_Sub15_1;
			return this.anIntArrayArray45[arg0];
		} else if (this.anInt5794 == 1) {
			this.aBoolean437 = arg0 != this.anInt5789;
			this.anInt5789 = arg0;
			return this.anIntArrayArray45[0];
		} else {
			@Pc(52) Class1_Sub15 local52 = this.aClass1_Sub15Array1[arg0];
			if (local52 == null) {
				this.aBoolean437 = true;
				if (this.anInt5794 <= this.anInt5790) {
					@Pc(73) Class1_Sub15 local73 = (Class1_Sub15) this.aClass69_28.method1632();
					local52 = new Class1_Sub15(arg0, local73.anInt1922);
					this.aClass1_Sub15Array1[local73.anInt1927] = null;
					local73.method4534();
				} else {
					local52 = new Class1_Sub15(arg0, this.anInt5790);
					this.anInt5790++;
				}
				this.aClass1_Sub15Array1[arg0] = local52;
			} else {
				this.aBoolean437 = false;
			}
			this.aClass69_28.method1627(local52);
			return this.anIntArrayArray45[local52.anInt1922];
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(B)[[I")
	public int[][] method4470() {
		if (this.anInt5796 != this.anInt5794) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(28) int local28 = 0; local28 < this.anInt5794; local28++) {
			this.aClass1_Sub15Array1[local28] = Static195.aClass1_Sub15_1;
		}
		return this.anIntArrayArray45;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(Z)V")
	public void method4473() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt5794; local7++) {
			this.anIntArrayArray45[local7] = null;
		}
		this.aClass1_Sub15Array1 = null;
		this.anIntArrayArray45 = null;
		this.aClass69_28.method1629();
		this.aClass69_28 = null;
	}
}
