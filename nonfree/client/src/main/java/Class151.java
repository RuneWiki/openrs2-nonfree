import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rf")
public final class Class151 {

	@OriginalMember(owner = "client!rf", name = "n", descriptor = "I")
	private int anInt4839 = 0;

	@OriginalMember(owner = "client!rf", name = "p", descriptor = "I")
	private int anInt4841 = -1;

	@OriginalMember(owner = "client!rf", name = "k", descriptor = "Lclient!bo;")
	private Class24 aClass24_24 = new Class24();

	@OriginalMember(owner = "client!rf", name = "r", descriptor = "Z")
	public boolean aBoolean344 = false;

	@OriginalMember(owner = "client!rf", name = "b", descriptor = "I")
	private int anInt4832;

	@OriginalMember(owner = "client!rf", name = "j", descriptor = "I")
	private int anInt4837;

	@OriginalMember(owner = "client!rf", name = "e", descriptor = "[Lclient!c;")
	private Class1_Sub5[] aClass1_Sub5Array1;

	@OriginalMember(owner = "client!rf", name = "c", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray13;

	@OriginalMember(owner = "client!rf", name = "<init>", descriptor = "(III)V")
	public Class151(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt4832 = arg0;
		this.anInt4837 = arg1;
		this.aClass1_Sub5Array1 = new Class1_Sub5[this.anInt4837];
		this.anIntArrayArrayArray13 = new int[this.anInt4832][3][arg2];
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(Z)V")
	public void method3753() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt4832; local3++) {
			this.anIntArrayArrayArray13[local3][0] = null;
			this.anIntArrayArrayArray13[local3][1] = null;
			this.anIntArrayArrayArray13[local3][2] = null;
			this.anIntArrayArrayArray13[local3] = null;
		}
		this.anIntArrayArrayArray13 = null;
		this.aClass1_Sub5Array1 = null;
		this.aClass24_24.method462();
		this.aClass24_24 = null;
	}

	@OriginalMember(owner = "client!rf", name = "b", descriptor = "(B)[[[I")
	public int[][][] method3755() {
		if (this.anInt4832 != this.anInt4837) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(17) int local17 = 0; local17 < this.anInt4832; local17++) {
			this.aClass1_Sub5Array1[local17] = Static233.aClass1_Sub5_1;
		}
		return this.anIntArrayArrayArray13;
	}

	@OriginalMember(owner = "client!rf", name = "b", descriptor = "(II)[[I")
	public int[][] method3758(@OriginalArg(0) int arg0) {
		if (this.anInt4832 == this.anInt4837) {
			this.aBoolean344 = this.aClass1_Sub5Array1[arg0] == null;
			this.aClass1_Sub5Array1[arg0] = Static233.aClass1_Sub5_1;
			return this.anIntArrayArrayArray13[arg0];
		} else if (this.anInt4832 == 1) {
			this.aBoolean344 = this.anInt4841 != arg0;
			this.anInt4841 = arg0;
			return this.anIntArrayArrayArray13[0];
		} else {
			@Pc(30) Class1_Sub5 local30 = this.aClass1_Sub5Array1[arg0];
			if (local30 == null) {
				this.aBoolean344 = true;
				if (this.anInt4832 > this.anInt4839) {
					local30 = new Class1_Sub5(arg0, this.anInt4839);
					this.anInt4839++;
				} else {
					@Pc(65) Class1_Sub5 local65 = (Class1_Sub5) this.aClass24_24.method461();
					local30 = new Class1_Sub5(arg0, local65.anInt497);
					this.aClass1_Sub5Array1[local65.anInt495] = null;
					local65.method4616();
				}
				this.aClass1_Sub5Array1[arg0] = local30;
			} else {
				this.aBoolean344 = false;
			}
			this.aClass24_24.method466(local30);
			return this.anIntArrayArrayArray13[local30.anInt497];
		}
	}
}
