import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ek")
public class Class2_Sub3_Sub10 extends Class2_Sub3 {

	@OriginalMember(owner = "client!ek", name = "X", descriptor = "Lclient!h;")
	public static final Class89 aClass89_234 = new Class89(65, 5);

	@OriginalMember(owner = "client!ek", name = "ab", descriptor = "[I")
	public static final int[] anIntArray464;

	@OriginalMember(owner = "client!ek", name = "Q", descriptor = "I")
	protected int anInt6659;

	@OriginalMember(owner = "client!ek", name = "U", descriptor = "[I")
	protected int[] anIntArray463;

	@OriginalMember(owner = "client!ek", name = "bb", descriptor = "I")
	protected int anInt6667;

	@OriginalMember(owner = "client!ek", name = "T", descriptor = "I")
	private int anInt6662 = -1;

	static {
		new Class79(null, "Mitglieder können 200 Freunde hinzufügen, freie Spieler nur 100.", null, null);
		anIntArray464 = new int[25];
	}

	@OriginalMember(owner = "client!ek", name = "<init>", descriptor = "()V", line = 3)
	public Class2_Sub3_Sub10() {
		super(0, false);
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(ILclient!bt;I)V", line = 33)
	@Override
	public final void method6485(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub4 arg1) {
		if (arg0 == 0) {
			this.anInt6662 = arg1.method4830();
		}
	}

	@OriginalMember(owner = "client!ek", name = "f", descriptor = "(I)Z", line = 75)
	protected final boolean method5984() {
		if (this.anIntArray463 != null) {
			return true;
		} else if (this.anInt6662 >= 0) {
			@Pc(34) Class48 local34 = Class2_Sub16.anInt2418 >= 0 ? Static372.method1684(Static104.aClass197_24, Class2_Sub16.anInt2418, this.anInt6662) : Static372.method1678(Static104.aClass197_24, this.anInt6662);
			local34.method1683();
			this.anIntArray463 = local34.method1687();
			this.anInt6667 = local34.anInt1531;
			this.anInt6659 = local34.anInt1529;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ek", name = "b", descriptor = "(I)V", line = 102)
	@Override
	public final void method6478() {
		super.method6478();
		this.anIntArray463 = null;
	}

	@OriginalMember(owner = "client!ek", name = "c", descriptor = "(I)I", line = 115)
	@Override
	public final int method6479() {
		return this.anInt6662;
	}

	@OriginalMember(owner = "client!ek", name = "b", descriptor = "(IB)[[I", line = 139)
	@Override
	public int[][] method6480(@OriginalArg(0) int arg0) {
		@Pc(17) int[][] local17 = super.aClass243_41.method6278(arg0);
		if (super.aClass243_41.aBoolean478 && this.method5984()) {
			@Pc(29) int[] local29 = local17[0];
			@Pc(33) int[] local33 = local17[1];
			@Pc(37) int[] local37 = local17[2];
			@Pc(57) int local57 = this.anInt6659 * (Static23.anInt638 == this.anInt6667 ? arg0 : arg0 * this.anInt6667 / Static23.anInt638);
			@Pc(67) int local67;
			@Pc(75) int local75;
			if (this.anInt6659 == Static211.anInt4031) {
				for (local67 = 0; local67 < Static211.anInt4031; local67++) {
					local75 = this.anIntArray463[local57++];
					local37[local67] = (local75 & 0xFF) << 4;
					local33[local67] = local75 >> 4 & 0xFF0;
					local29[local67] = local75 >> 12 & 0xFF0;
				}
			} else {
				for (local67 = 0; local67 < Static211.anInt4031; local67++) {
					local75 = local67 * this.anInt6659 / Static211.anInt4031;
					@Pc(124) int local124 = this.anIntArray463[local57 + local75];
					local37[local67] = (local124 & 0xFF) << 4;
					local33[local67] = local124 >> 4 & 0xFF0;
					local29[local67] = local124 >> 12 & 0xFF0;
				}
			}
		}
		return local17;
	}
}
