import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bda")
public final class Class27 {

	@OriginalMember(owner = "client!bda", name = "f", descriptor = "I")
	private int anInt883 = -1;

	@OriginalMember(owner = "client!bda", name = "n", descriptor = "I")
	private int anInt888 = 0;

	@OriginalMember(owner = "client!bda", name = "e", descriptor = "Lclient!ws;")
	private Class361 aClass361_6 = new Class361();

	@OriginalMember(owner = "client!bda", name = "p", descriptor = "Z")
	public boolean aBoolean54 = false;

	@OriginalMember(owner = "client!bda", name = "b", descriptor = "I")
	private final int anInt880;

	@OriginalMember(owner = "client!bda", name = "h", descriptor = "I")
	private final int anInt885;

	@OriginalMember(owner = "client!bda", name = "m", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray1;

	@OriginalMember(owner = "client!bda", name = "l", descriptor = "[Lclient!ae;")
	private Class6_Sub1[] aClass6_Sub1Array1;

	@OriginalMember(owner = "client!bda", name = "<init>", descriptor = "(III)V")
	public Class27(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt880 = arg0;
		this.anInt885 = arg1;
		this.anIntArrayArrayArray1 = new int[this.anInt880][3][arg2];
		this.aClass6_Sub1Array1 = new Class6_Sub1[this.anInt885];
	}

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(B)[[[I")
	public int[][][] method907() {
		if (this.anInt885 != this.anInt880) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(22) int local22 = 0; local22 < this.anInt880; local22++) {
			this.aClass6_Sub1Array1[local22] = Static330.aClass6_Sub1_1;
		}
		return this.anIntArrayArrayArray1;
	}

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(II)[[I")
	public int[][] method911(@OriginalArg(1) int arg0) {
		if (this.anInt885 == this.anInt880) {
			this.aBoolean54 = this.aClass6_Sub1Array1[arg0] == null;
			this.aClass6_Sub1Array1[arg0] = Static330.aClass6_Sub1_1;
			return this.anIntArrayArrayArray1[arg0];
		} else if (this.anInt880 == 1) {
			this.aBoolean54 = arg0 != this.anInt883;
			this.anInt883 = arg0;
			return this.anIntArrayArrayArray1[0];
		} else {
			@Pc(54) Class6_Sub1 local54 = this.aClass6_Sub1Array1[arg0];
			if (local54 == null) {
				this.aBoolean54 = true;
				if (this.anInt880 > this.anInt888) {
					local54 = new Class6_Sub1(arg0, this.anInt888);
					this.anInt888++;
				} else {
					@Pc(90) Class6_Sub1 local90 = (Class6_Sub1) this.aClass361_6.method7840();
					local54 = new Class6_Sub1(arg0, local90.anInt250);
					this.aClass6_Sub1Array1[local90.anInt252] = null;
					local90.method7804();
				}
				this.aClass6_Sub1Array1[arg0] = local54;
			} else {
				this.aBoolean54 = false;
			}
			this.aClass361_6.method7836(local54);
			return this.anIntArrayArrayArray1[local54.anInt250];
		}
	}

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(I)V")
	public void method912() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt880; local3++) {
			this.anIntArrayArrayArray1[local3][0] = null;
			this.anIntArrayArrayArray1[local3][1] = null;
			this.anIntArrayArrayArray1[local3][2] = null;
			this.anIntArrayArrayArray1[local3] = null;
		}
		this.anIntArrayArrayArray1 = null;
		this.aClass6_Sub1Array1 = null;
		this.aClass361_6.method7842();
		this.aClass361_6 = null;
	}
}
