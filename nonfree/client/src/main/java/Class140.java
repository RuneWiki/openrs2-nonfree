import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gn")
public final class Class140 {

	@OriginalMember(owner = "client!gn", name = "l", descriptor = "[Lclient!vs;")
	public static final Class385[] aClass385Array1 = new Class385[5];

	@OriginalMember(owner = "client!gn", name = "d", descriptor = "Lclient!mv;")
	public static final Class241 aClass241_51;

	@OriginalMember(owner = "client!gn", name = "p", descriptor = "[I")
	public static final int[] anIntArray212;

	@OriginalMember(owner = "client!gn", name = "i", descriptor = "I")
	private int anInt4082 = 0;

	@OriginalMember(owner = "client!gn", name = "k", descriptor = "I")
	private int anInt4083 = -1;

	@OriginalMember(owner = "client!gn", name = "f", descriptor = "Lclient!tf;")
	private Class340 aClass340_26 = new Class340();

	@OriginalMember(owner = "client!gn", name = "e", descriptor = "Z")
	public boolean aBoolean331 = false;

	@OriginalMember(owner = "client!gn", name = "q", descriptor = "I")
	private final int anInt4079;

	@OriginalMember(owner = "client!gn", name = "n", descriptor = "I")
	private final int anInt4084;

	@OriginalMember(owner = "client!gn", name = "s", descriptor = "[Lclient!ru;")
	private Class6_Sub47[] aClass6_Sub47Array1;

	@OriginalMember(owner = "client!gn", name = "b", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray12;

	static {
		@Pc(79) int local79;
		for (local79 = 0; local79 < aClass385Array1.length; local79++) {
			aClass385Array1[local79] = new Class385();
		}
		aClass241_51 = new Class241(34, 2);
		anIntArray212 = new int[120];
		local79 = 0;
		for (@Pc(104) int local104 = 0; local104 < 120; local104++) {
			@Pc(109) int local109 = local104 + 1;
			@Pc(122) int local122 = (int) ((double) local109 + Math.pow(2.0D, (double) local109 / 7.0D) * 300.0D);
			local79 += local122;
			anIntArray212[local104] = local79 / 4;
		}
	}

	@OriginalMember(owner = "client!gn", name = "<init>", descriptor = "(III)V")
	public Class140(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt4079 = arg1;
		this.anInt4084 = arg0;
		this.aClass6_Sub47Array1 = new Class6_Sub47[this.anInt4079];
		this.anIntArrayArrayArray12 = new int[this.anInt4084][3][arg2];
	}

	@OriginalMember(owner = "client!gn", name = "c", descriptor = "(Z)[[[I")
	public int[][][] method3746() {
		if (this.anInt4079 != this.anInt4084) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(28) int local28 = 0; local28 < this.anInt4084; local28++) {
			this.aClass6_Sub47Array1[local28] = Static464.aClass6_Sub47_1;
		}
		return this.anIntArrayArrayArray12;
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(Z)V")
	public void method3747() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt4084; local3++) {
			this.anIntArrayArrayArray12[local3][0] = null;
			this.anIntArrayArrayArray12[local3][1] = null;
			this.anIntArrayArrayArray12[local3][2] = null;
			this.anIntArrayArrayArray12[local3] = null;
		}
		this.anIntArrayArrayArray12 = null;
		this.aClass6_Sub47Array1 = null;
		if (false) {
			this.aClass6_Sub47Array1 = null;
		}
		this.aClass340_26.method8129();
		this.aClass340_26 = null;
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(II)[[I")
	public int[][] method3749(@OriginalArg(0) int arg0) {
		if (this.anInt4079 == this.anInt4084) {
			this.aBoolean331 = this.aClass6_Sub47Array1[arg0] == null;
			this.aClass6_Sub47Array1[arg0] = Static464.aClass6_Sub47_1;
			return this.anIntArrayArrayArray12[arg0];
		} else if (this.anInt4084 == 1) {
			this.aBoolean331 = this.anInt4083 != arg0;
			this.anInt4083 = arg0;
			return this.anIntArrayArrayArray12[0];
		} else {
			@Pc(54) Class6_Sub47 local54 = this.aClass6_Sub47Array1[arg0];
			if (local54 == null) {
				this.aBoolean331 = true;
				if (this.anInt4082 < this.anInt4084) {
					local54 = new Class6_Sub47(arg0, this.anInt4082);
					this.anInt4082++;
				} else {
					@Pc(91) Class6_Sub47 local91 = (Class6_Sub47) this.aClass340_26.method8133();
					local54 = new Class6_Sub47(arg0, local91.anInt8771);
					this.aClass6_Sub47Array1[local91.anInt8769] = null;
					local91.method9051();
				}
				this.aClass6_Sub47Array1[arg0] = local54;
			} else {
				this.aBoolean331 = false;
			}
			this.aClass340_26.method8130(local54);
			return this.anIntArrayArrayArray12[local54.anInt8771];
		}
	}
}
