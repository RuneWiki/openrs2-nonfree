import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sd")
public final class Class325 {

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "I")
	private int anInt8874 = 0;

	@OriginalMember(owner = "client!sd", name = "m", descriptor = "I")
	private int anInt8871 = -1;

	@OriginalMember(owner = "client!sd", name = "c", descriptor = "Lclient!tf;")
	private Class340 aClass340_68 = new Class340();

	@OriginalMember(owner = "client!sd", name = "n", descriptor = "Z")
	public boolean aBoolean671 = false;

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "I")
	private final int anInt8877;

	@OriginalMember(owner = "client!sd", name = "e", descriptor = "I")
	private final int anInt8875;

	@OriginalMember(owner = "client!sd", name = "g", descriptor = "[[I")
	private int[][] anIntArrayArray48;

	@OriginalMember(owner = "client!sd", name = "k", descriptor = "[Lclient!sk;")
	private Class6_Sub48[] aClass6_Sub48Array1;

	@OriginalMember(owner = "client!sd", name = "<init>", descriptor = "(III)V")
	public Class325(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt8877 = arg1;
		this.anInt8875 = arg0;
		this.anIntArrayArray48 = new int[this.anInt8875][arg2];
		this.aClass6_Sub48Array1 = new Class6_Sub48[this.anInt8877];
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(B)[[I")
	public int[][] method7753() {
		if (this.anInt8875 != this.anInt8877) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(28) int local28 = 0; local28 < this.anInt8875; local28++) {
			this.aClass6_Sub48Array1[local28] = Static459.aClass6_Sub48_1;
		}
		return this.anIntArrayArray48;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(I)V")
	public void method7754() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt8875; local3++) {
			this.anIntArrayArray48[local3] = null;
		}
		this.aClass6_Sub48Array1 = null;
		this.anIntArrayArray48 = null;
		this.aClass340_68.method8129();
		this.aClass340_68 = null;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(II)[I")
	public int[] method7756(@OriginalArg(1) int arg0) {
		if (this.anInt8875 == this.anInt8877) {
			this.aBoolean671 = this.aClass6_Sub48Array1[arg0] == null;
			this.aClass6_Sub48Array1[arg0] = Static459.aClass6_Sub48_1;
			return this.anIntArrayArray48[arg0];
		} else if (this.anInt8875 == 1) {
			this.aBoolean671 = arg0 != this.anInt8871;
			this.anInt8871 = arg0;
			return this.anIntArrayArray48[0];
		} else {
			@Pc(53) Class6_Sub48 local53 = this.aClass6_Sub48Array1[arg0];
			if (local53 == null) {
				this.aBoolean671 = true;
				if (this.anInt8874 >= this.anInt8875) {
					@Pc(75) Class6_Sub48 local75 = (Class6_Sub48) this.aClass340_68.method8133();
					local53 = new Class6_Sub48(arg0, local75.anInt9085);
					this.aClass6_Sub48Array1[local75.anInt9090] = null;
					local75.method9051();
				} else {
					local53 = new Class6_Sub48(arg0, this.anInt8874);
					this.anInt8874++;
				}
				this.aClass6_Sub48Array1[arg0] = local53;
			} else {
				this.aBoolean671 = false;
			}
			this.aClass340_68.method8130(local53);
			return this.anIntArrayArray48[local53.anInt9085];
		}
	}
}
