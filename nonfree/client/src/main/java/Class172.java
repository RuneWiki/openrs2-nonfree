import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nr")
public final class Class172 {

	@OriginalMember(owner = "client!nr", name = "c", descriptor = "I")
	private int anInt4879 = -1;

	@OriginalMember(owner = "client!nr", name = "p", descriptor = "I")
	private int anInt4889 = 0;

	@OriginalMember(owner = "client!nr", name = "e", descriptor = "Lclient!wo;")
	private Class266 aClass266_37 = new Class266();

	@OriginalMember(owner = "client!nr", name = "s", descriptor = "Z")
	public boolean aBoolean327 = false;

	@OriginalMember(owner = "client!nr", name = "j", descriptor = "I")
	private final int anInt4883;

	@OriginalMember(owner = "client!nr", name = "o", descriptor = "I")
	private final int anInt4888;

	@OriginalMember(owner = "client!nr", name = "d", descriptor = "[Lclient!ju;")
	private Class1_Sub21[] aClass1_Sub21Array1;

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "[[I")
	private int[][] anIntArrayArray135;

	@OriginalMember(owner = "client!nr", name = "<init>", descriptor = "(III)V")
	public Class172(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt4883 = arg0;
		this.anInt4888 = arg1;
		this.aClass1_Sub21Array1 = new Class1_Sub21[this.anInt4888];
		this.anIntArrayArray135 = new int[this.anInt4883][arg2];
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(I)V")
	public void method3958() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt4883; local7++) {
			this.anIntArrayArray135[local7] = null;
		}
		this.anIntArrayArray135 = null;
		this.aClass1_Sub21Array1 = null;
		this.aClass266_37.method6004();
		this.aClass266_37 = null;
	}

	@OriginalMember(owner = "client!nr", name = "b", descriptor = "(I)[[I")
	public int[][] method3959() {
		if (this.anInt4883 != this.anInt4888) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(21) int local21 = 0; local21 < this.anInt4883; local21++) {
			this.aClass1_Sub21Array1[local21] = Static289.aClass1_Sub21_1;
		}
		return this.anIntArrayArray135;
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(II)[I")
	public int[] method3962(@OriginalArg(0) int arg0) {
		if (this.anInt4883 == this.anInt4888) {
			this.aBoolean327 = this.aClass1_Sub21Array1[arg0] == null;
			this.aClass1_Sub21Array1[arg0] = Static289.aClass1_Sub21_1;
			return this.anIntArrayArray135[arg0];
		} else if (this.anInt4883 == 1) {
			this.aBoolean327 = arg0 != this.anInt4879;
			this.anInt4879 = arg0;
			return this.anIntArrayArray135[0];
		} else {
			@Pc(52) Class1_Sub21 local52 = this.aClass1_Sub21Array1[arg0];
			if (local52 == null) {
				this.aBoolean327 = true;
				if (this.anInt4883 <= this.anInt4889) {
					@Pc(77) Class1_Sub21 local77 = (Class1_Sub21) this.aClass266_37.method6005();
					local52 = new Class1_Sub21(arg0, local77.anInt3693);
					this.aClass1_Sub21Array1[local77.anInt3694] = null;
					local77.method6071();
				} else {
					local52 = new Class1_Sub21(arg0, this.anInt4889);
					this.anInt4889++;
				}
				this.aClass1_Sub21Array1[arg0] = local52;
			} else {
				this.aBoolean327 = false;
			}
			this.aClass266_37.method5997(local52);
			return this.anIntArrayArray135[local52.anInt3693];
		}
	}
}
