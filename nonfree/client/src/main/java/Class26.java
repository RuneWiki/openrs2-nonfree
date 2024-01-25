import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bba")
public final class Class26 {

	@OriginalMember(owner = "client!bba", name = "a", descriptor = "I")
	private int anInt889 = 0;

	@OriginalMember(owner = "client!bba", name = "l", descriptor = "I")
	private int anInt895 = -1;

	@OriginalMember(owner = "client!bba", name = "b", descriptor = "Lclient!wo;")
	private Class361 aClass361_18 = new Class361();

	@OriginalMember(owner = "client!bba", name = "o", descriptor = "Z")
	public boolean aBoolean77 = false;

	@OriginalMember(owner = "client!bba", name = "e", descriptor = "I")
	private final int anInt892;

	@OriginalMember(owner = "client!bba", name = "d", descriptor = "I")
	private final int anInt891;

	@OriginalMember(owner = "client!bba", name = "i", descriptor = "[[I")
	private int[][] anIntArrayArray3;

	@OriginalMember(owner = "client!bba", name = "h", descriptor = "[Lclient!ve;")
	private Class1_Sub50[] aClass1_Sub50Array1;

	@OriginalMember(owner = "client!bba", name = "<init>", descriptor = "(III)V")
	public Class26(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt892 = arg0;
		this.anInt891 = arg1;
		this.anIntArrayArray3 = new int[this.anInt892][arg2];
		this.aClass1_Sub50Array1 = new Class1_Sub50[this.anInt891];
	}

	@OriginalMember(owner = "client!bba", name = "a", descriptor = "(B)V")
	public void method787() {
		for (@Pc(15) int local15 = 0; local15 < this.anInt892; local15++) {
			this.anIntArrayArray3[local15] = null;
		}
		this.anIntArrayArray3 = null;
		this.aClass1_Sub50Array1 = null;
		this.aClass361_18.method7860();
		this.aClass361_18 = null;
	}

	@OriginalMember(owner = "client!bba", name = "a", descriptor = "(II)[I")
	public int[] method788(@OriginalArg(1) int arg0) {
		if (this.anInt892 == this.anInt891) {
			this.aBoolean77 = this.aClass1_Sub50Array1[arg0] == null;
			this.aClass1_Sub50Array1[arg0] = Static559.aClass1_Sub50_1;
			return this.anIntArrayArray3[arg0];
		} else if (this.anInt892 == 1) {
			this.aBoolean77 = arg0 != this.anInt895;
			this.anInt895 = arg0;
			return this.anIntArrayArray3[0];
		} else {
			@Pc(31) Class1_Sub50 local31 = this.aClass1_Sub50Array1[arg0];
			if (local31 == null) {
				this.aBoolean77 = true;
				if (this.anInt889 >= this.anInt892) {
					@Pc(52) Class1_Sub50 local52 = (Class1_Sub50) this.aClass361_18.method7848();
					local31 = new Class1_Sub50(arg0, local52.anInt9064);
					this.aClass1_Sub50Array1[local52.anInt9059] = null;
					local52.method7878();
				} else {
					local31 = new Class1_Sub50(arg0, this.anInt889);
					this.anInt889++;
				}
				this.aClass1_Sub50Array1[arg0] = local31;
			} else {
				this.aBoolean77 = false;
			}
			this.aClass361_18.method7849(local31);
			return this.anIntArrayArray3[local31.anInt9064];
		}
	}

	@OriginalMember(owner = "client!bba", name = "b", descriptor = "(B)[[I")
	public int[][] method789() {
		if (this.anInt892 != this.anInt891) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(29) int local29 = 0; local29 < this.anInt892; local29++) {
			this.aClass1_Sub50Array1[local29] = Static559.aClass1_Sub50_1;
		}
		return this.anIntArrayArray3;
	}
}
