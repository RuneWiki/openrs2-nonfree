import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pu")
public final class Class233 {

	@OriginalMember(owner = "client!pu", name = "d", descriptor = "I")
	private int anInt6679 = -1;

	@OriginalMember(owner = "client!pu", name = "b", descriptor = "I")
	private int anInt6677 = 0;

	@OriginalMember(owner = "client!pu", name = "i", descriptor = "Lclient!bu;")
	private Class38 aClass38_51 = new Class38();

	@OriginalMember(owner = "client!pu", name = "o", descriptor = "Z")
	public boolean aBoolean439 = false;

	@OriginalMember(owner = "client!pu", name = "h", descriptor = "I")
	private final int anInt6682;

	@OriginalMember(owner = "client!pu", name = "e", descriptor = "I")
	private final int anInt6680;

	@OriginalMember(owner = "client!pu", name = "m", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray13;

	@OriginalMember(owner = "client!pu", name = "g", descriptor = "[Lclient!bw;")
	private Class1_Sub6[] aClass1_Sub6Array1;

	@OriginalMember(owner = "client!pu", name = "<init>", descriptor = "(III)V")
	public Class233(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt6682 = arg1;
		this.anInt6680 = arg0;
		this.anIntArrayArrayArray13 = new int[this.anInt6680][3][arg2];
		this.aClass1_Sub6Array1 = new Class1_Sub6[this.anInt6682];
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(II)[[I")
	public int[][] method5782(@OriginalArg(1) int arg0) {
		if (this.anInt6680 == this.anInt6682) {
			this.aBoolean439 = this.aClass1_Sub6Array1[arg0] == null;
			this.aClass1_Sub6Array1[arg0] = Static273.aClass1_Sub6_1;
			return this.anIntArrayArrayArray13[arg0];
		} else if (this.anInt6680 == 1) {
			this.aBoolean439 = arg0 != this.anInt6679;
			this.anInt6679 = arg0;
			return this.anIntArrayArrayArray13[0];
		} else {
			@Pc(47) Class1_Sub6 local47 = this.aClass1_Sub6Array1[arg0];
			if (local47 == null) {
				this.aBoolean439 = true;
				if (this.anInt6680 > this.anInt6677) {
					local47 = new Class1_Sub6(arg0, this.anInt6677);
					this.anInt6677++;
				} else {
					@Pc(87) Class1_Sub6 local87 = (Class1_Sub6) this.aClass38_51.method1420();
					local47 = new Class1_Sub6(arg0, local87.anInt1474);
					this.aClass1_Sub6Array1[local87.anInt1473] = null;
					local87.method7983();
				}
				this.aClass1_Sub6Array1[arg0] = local47;
			} else {
				this.aBoolean439 = false;
			}
			this.aClass38_51.method1418(local47);
			return this.anIntArrayArrayArray13[local47.anInt1474];
		}
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(B)[[[I")
	public int[][][] method5784() {
		if (this.anInt6680 != this.anInt6682) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(22) int local22 = 0; local22 < this.anInt6680; local22++) {
			this.aClass1_Sub6Array1[local22] = Static273.aClass1_Sub6_1;
		}
		return this.anIntArrayArrayArray13;
	}

	@OriginalMember(owner = "client!pu", name = "b", descriptor = "(B)V")
	public void method5785() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt6680; local3++) {
			this.anIntArrayArrayArray13[local3][0] = null;
			this.anIntArrayArrayArray13[local3][1] = null;
			this.anIntArrayArrayArray13[local3][2] = null;
			this.anIntArrayArrayArray13[local3] = null;
		}
		this.anIntArrayArrayArray13 = null;
		this.aClass1_Sub6Array1 = null;
		this.aClass38_51.method1417();
		this.aClass38_51 = null;
	}
}
