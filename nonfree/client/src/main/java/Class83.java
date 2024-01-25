import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dc")
public final class Class83 {

	@OriginalMember(owner = "client!dc", name = "k", descriptor = "I")
	private int anInt1573 = 0;

	@OriginalMember(owner = "client!dc", name = "j", descriptor = "I")
	private int anInt1576 = -1;

	@OriginalMember(owner = "client!dc", name = "c", descriptor = "Lclient!ef;")
	private Class102 aClass102_7 = new Class102();

	@OriginalMember(owner = "client!dc", name = "e", descriptor = "Z")
	public boolean aBoolean148 = false;

	@OriginalMember(owner = "client!dc", name = "m", descriptor = "I")
	private final int anInt1568;

	@OriginalMember(owner = "client!dc", name = "n", descriptor = "I")
	private final int anInt1577;

	@OriginalMember(owner = "client!dc", name = "g", descriptor = "[[I")
	private int[][] anIntArrayArray10;

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "[Lclient!eg;")
	private Class5_Sub14[] aClass5_Sub14Array1;

	@OriginalMember(owner = "client!dc", name = "<init>", descriptor = "(III)V")
	public Class83(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt1568 = arg0;
		this.anInt1577 = arg1;
		this.anIntArrayArray10 = new int[this.anInt1568][arg2];
		this.aClass5_Sub14Array1 = new Class5_Sub14[this.anInt1577];
	}

	@OriginalMember(owner = "client!dc", name = "c", descriptor = "(I)[[I")
	public int[][] method1412() {
		if (this.anInt1568 != this.anInt1577) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(20) int local20 = 0; local20 < this.anInt1568; local20++) {
			this.aClass5_Sub14Array1[local20] = Static476.aClass5_Sub14_1;
		}
		if (-13509 != -13509) {
			this.method1414((byte) -18, 17);
		}
		return this.anIntArrayArray10;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(I)V")
	public void method1413() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt1568; local7++) {
			this.anIntArrayArray10[local7] = null;
		}
		this.anIntArrayArray10 = null;
		this.aClass5_Sub14Array1 = null;
		this.aClass102_7.method1932();
		this.aClass102_7 = null;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(BI)[I")
	public int[] method1414(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		if (arg0 != -64) {
			this.anInt1576 = 88;
		}
		if (this.anInt1568 == this.anInt1577) {
			this.aBoolean148 = this.aClass5_Sub14Array1[arg1] == null;
			this.aClass5_Sub14Array1[arg1] = Static476.aClass5_Sub14_1;
			return this.anIntArrayArray10[arg1];
		} else if (this.anInt1568 == 1) {
			this.aBoolean148 = arg1 != this.anInt1576;
			this.anInt1576 = arg1;
			return this.anIntArrayArray10[0];
		} else {
			@Pc(31) Class5_Sub14 local31 = this.aClass5_Sub14Array1[arg1];
			if (local31 == null) {
				this.aBoolean148 = true;
				if (this.anInt1568 <= this.anInt1573) {
					@Pc(53) Class5_Sub14 local53 = (Class5_Sub14) this.aClass102_7.method1924();
					local31 = new Class5_Sub14(arg1, local53.anInt2237);
					this.aClass5_Sub14Array1[local53.anInt2238] = null;
					local53.method9327(1);
				} else {
					local31 = new Class5_Sub14(arg1, this.anInt1573);
					this.anInt1573++;
				}
				this.aClass5_Sub14Array1[arg1] = local31;
			} else {
				this.aBoolean148 = false;
			}
			this.aClass102_7.method1929(local31);
			return this.anIntArrayArray10[local31.anInt2237];
		}
	}
}
